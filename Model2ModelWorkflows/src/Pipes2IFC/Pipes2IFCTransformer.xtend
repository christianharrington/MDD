package Pipes2IFC

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.Model
import pipes.Opening
import pipes.LocalPlacement
import java.util.ArrayList
import pipes.FlowSegment
import pipes.Wall
import pipes.Axis2Placement3D
import java.util.HashSet
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalFactoryImpl
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement
import pipes.GUIDElement
import pipes.Direction
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirection
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWall
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelVoidsElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRoot
import java.util.HashMap
import org.tech.iai.ifc.xml.ifc._2x3.final_.ObjectPlacementType
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelativePlacementType
import org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementRelToType
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianPoint
import org.tech.iai.ifc.xml.ifc._2x3.final_.AxisType2
import org.tech.iai.ifc.xml.ifc._2x3.final_.RefDirectionType1
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.Resource
import org.tech.iai.ifc.xml.ifc._2x3.final_.DirectionRatiosType
import org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonFactoryImpl
import org.tech.iai.ifc.xml.ifc._2x3.final_.CoordinatesType1
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureType
import org.tech.iai.ifc.xml.ifc._2x3.final_.LocationType
import java.util.UUID
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.UosImpl
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.BasicEList
import org.tech.iai.ifc.xml.ifc._2x3.final_.Uos
import org.eclipse.emf.common.util.DelegatingEList
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl$BasicFeatureMapEntry

class Pipes2IFCTransformer extends WorkflowComponentWithSlot {
	
	FinalFactoryImpl ifcFactory
	CommonFactoryImpl commonFactory
	HashSet<String> markedSet
	ArrayList<IfcProduct> extrModel
	Model pipesModel
	HashMap<String, Entity> entityMap
	HashMap<String, Entity> guidMap
	Resource resource
	
	def private localPlacementIsChanged(LocalPlacement o, IfcLocalPlacement product, IWorkflowContext ctx) {
		if(product != null) {
			return axis2Placement3DIsChanged(o.axis2placement3d, objFromRef(product, ctx).relativePlacement.ifcAxis2Placement3D, ctx)
				|| localPlacementIsChanged(o.relativeTo, objFromRef(product, ctx).placementRelTo.ifcObjectPlacement as IfcLocalPlacement, ctx)
		} else { 
			return true
		}
	}
	
	def private axis2Placement3DIsChanged(Axis2Placement3D o, IfcAxis2Placement3D product, IWorkflowContext ctx) {
		var lengthMeasure = objFromRef(objFromRef(product, ctx).location.ifcCartesianPoint, ctx).coordinates.ifcLengthMeasure
		return (o.cartesianX != lengthMeasure.get(0) || 
			o.cartesianY != lengthMeasure.get(1) || 
			o.cartesianZ != lengthMeasure.get(2) ||
			directionIsChanged(o.refDirection, objFromRef(product, ctx).refDirection.ifcDirection, ctx) ||
			directionIsChanged(o.axis, objFromRef(product, ctx).axis.ifcDirection, ctx))
	}
	
	def private directionIsChanged(Direction o, IfcDirection product, IWorkflowContext ctx) {
		var ratios = objFromRef(product, ctx).directionRatios.doubleWrapper
		return o.x != ratios.get(0) || o.y != ratios.get(1) || o.z != ratios.get(2)
	}
	
	// Update elements
	def private updateMetaData(GUIDElement o, IfcRoot product) {
		product.setName(o.elementName)
		product.setDescription(o.description)
	}
	
	def dispatch updateIfcElement(FlowSegment o, IfcFlowSegment product, IWorkflowContext ctx){
		if(!markedSet.contains(o.name))
		{
			markedSet.add(o.name)
			
			updateMetaData(o, objFromRef(product, ctx))
			
			// References
			updateIfcElement(o.placement, objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)
		}
		
	}
	
	def dispatch updateIfcElement(Opening o, IfcOpeningElement product, IWorkflowContext ctx){
		if(!markedSet.contains(o.name))
		{
			markedSet.add(o.name)
			
			updateMetaData(o, objFromRef(product, ctx))
			
			
			o.walls.forEach[w |
				extrModel.forEach[p |
					if(w.name == p.globalId) {
						updateIfcElement(w, objFromRef(p, ctx), ctx)
					}
				]
			]
			if(localPlacementIsChanged(o.placement, objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)) {
				val instance = FinalPackage::eINSTANCE
				var op = product.eGet(instance.objectPlacementType_IfcObjectPlacement)
				op = createLocalPlacement(o.placement)
			}
		
			true
		}
	}
	
	def dispatch updateIfcElement(Wall o, IfcWall product, IWorkflowContext ctx){
		markedSet.add(o.name)
		
		updateMetaData(o, objFromRef(product, ctx))
		/*
		o.openings.forEach[w |
			extrModel.forEach[p |
				if(w.name == p.globalId) {
					updateIfcElement(w, objFromRef(p, ctx), ctx)
				}					
			]
		] */
		
		true
	}
	
	def dispatch updateIfcElement(LocalPlacement o, IfcLocalPlacement product, IWorkflowContext ctx) {
		
	
		updateIfcElement(o.axis2placement3d, objFromRef(product, ctx).relativePlacement.ifcAxis2Placement3D, ctx)
	}
	
	def dispatch updateIfcElement(Axis2Placement3D o, IfcAxis2Placement3D product, IWorkflowContext ctx){
		
		var lengthMeasure = objFromRef(objFromRef(product, ctx).location.ifcCartesianPoint, ctx).coordinates.ifcLengthMeasure
		lengthMeasure.get(0).setValue(o.cartesianX)
		lengthMeasure.get(1).setValue(o.cartesianY)
		lengthMeasure.get(2).setValue(o.cartesianZ)
		updateIfcElement(o.axis, objFromRef(product, ctx).axis.ifcDirection, ctx)
		updateIfcElement(o.refDirection, objFromRef(product, ctx).refDirection.ifcDirection, ctx)
	}
		
	def dispatch updateIfcElement(Direction o, IfcDirection product, IWorkflowContext ctx) {
		var ratios = objFromRef(product, ctx).directionRatios.doubleWrapper
		ratios.get(0).setValue(o.x)
		ratios.get(1).setValue(o.y)
		ratios.get(2).setValue(o.z)
		true
	}
	// End update elements
	
	// Creating new opening element
	def IfcOpeningElement create f: ifcFactory.createIfcOpeningElement() createOpening(Opening o) {
		val uuid = UUID::randomUUID().toString()
		f.setGlobalId(uuid)
		f.setDescription(o.description)
		f.setName(o.name)
		var id = newId
		println('Opening with ID ' + id)
		f.setId(id)
		
		
		f.setObjectPlacement(createObjectPlacementType(o.placement))
		
		var refOpening = createRefOpening(f.id)
		for (w: o.walls) {
			val rve = createRelVoidsElementFromOpening(w, refOpening)
			entityMap.put(rve.id, rve)
		}
		
		val iter = resource.contents.get(0).eAllContents
		val entityList = new BasicEList<Entity>()
		while (iter.hasNext()) {
			val item = iter.next()
			if (item instanceof Uos) {
				val uosItem = item as Uos
				entityList.add(f)
				entityList.addAll(uosItem.entity)
				uosItem.eSet(FinalPackage::eINSTANCE.uos_Entity, entityList)
				resource.contents.add(f)
				//uosItem.group.
				//val entry = new EStructuralFeatureImpl$SimpleFeatureMapEntry()
				
				//uosItem.entityGroup
			}
		}	

		entityMap.put(f.id, f)	
	}
	
	def IfcOpeningElement create f: ifcFactory.createIfcOpeningElement() createRefOpening(String i) {
		f.setRef(i)
	}
	
	def ObjectPlacementType create f: ifcFactory.createObjectPlacementType() createObjectPlacementType(LocalPlacement p) {
		val instance = FinalPackage::eINSTANCE
		var op = f.eGet(instance.objectPlacementType_IfcObjectPlacement)
		var ifcLocalPlacement = createLocalPlacement(p)
		entityMap.put(ifcLocalPlacement.id, ifcLocalPlacement)
		op = createRefLocalPlacement(ifcLocalPlacement.id)
	}
	
	def IfcLocalPlacement create f: ifcFactory.createIfcLocalPlacement() createLocalPlacement(LocalPlacement p) {
		f.setId(newId)
		if(p.relativeTo != null) {
			f.setPlacementRelTo(createPlacementRelToType(p))
		}
		f.setRelativePlacement(createRelativePlacementType(p))
	}
	
	def IfcLocalPlacement create f: ifcFactory.createIfcLocalPlacement() createRefLocalPlacement(String i) {
		f.setRef(i)
	}
	
	def PlacementRelToType create f: ifcFactory.createPlacementRelToType createPlacementRelToType(LocalPlacement p) {
		var lp = createLocalPlacement(p)
		entityMap.put(lp.id, lp)
		f.ifcObjectPlacementGroup.set(FinalPackage::eINSTANCE.objectPlacementType_IfcObjectPlacement, createRefLocalPlacement(lp.id))
	}
	
	def RelativePlacementType create f: ifcFactory.createRelativePlacementType createRelativePlacementType(LocalPlacement p) {
		var axis2placement3d = createAxis2Placement3D(p.axis2placement3d)
		entityMap.put(axis2placement3d.id, axis2placement3d)
		f.setIfcAxis2Placement3D(createRefAxis2Placement3D(axis2placement3d.id))
	}
	
	def IfcAxis2Placement3D create f: ifcFactory.createIfcAxis2Placement3D() createAxis2Placement3D(Axis2Placement3D a) {
		f.setId(newId)
		if(!(a.axis == null && a.refDirection == null)) {
			f.setAxis(createAxisType2(a))
			f.setRefDirection(createRefDirectionType1(a))
		}
		f.location = createLocationType()
		var cartesianPoint = createCartesianPoint(a)
		entityMap.put(cartesianPoint.id, cartesianPoint)
		f.location.setIfcCartesianPoint(createRefCartesianPoint(cartesianPoint.id))
	}
	
	def IfcAxis2Placement3D create f: ifcFactory.createIfcAxis2Placement3D() createRefAxis2Placement3D(String i) {
		f.setRef(i)
	}
	
	def LocationType create f: ifcFactory.createLocationType() createLocationType() {}
	
	def AxisType2 create f: ifcFactory.createAxisType2() createAxisType2(Axis2Placement3D a) {
		var axis = createDirection(a.axis)
		f.setIfcDirection(createRefDirection(axis.id))
	}
	
	def RefDirectionType1 create f: ifcFactory.createRefDirectionType1 createRefDirectionType1(Axis2Placement3D a) {
		var ref = createDirection(a.axis)
		f.setIfcDirection(createRefDirection(ref.id))
	}
	
	def IfcDirection create f: ifcFactory.createIfcDirection() createDirection(Direction d) {
		f.setId(newId)
		f.directionRatios = createDirectionRatiosType()
		var ratios = f.directionRatios.doubleWrapper
		ratios.add(createDoubleWrapperTypeFromDouble(d.x))
		ratios.add(createDoubleWrapperTypeFromDouble(d.y))
		ratios.add(createDoubleWrapperTypeFromDouble(d.z))
	}
	
	def IfcDirection create f: ifcFactory.createIfcDirection() createRefDirection(String i) {
		f.setRef(i)
	}
	
	def DirectionRatiosType create f: ifcFactory.createDirectionRatiosType() createDirectionRatiosType() {}
	
	def DoubleWrapperType create f: commonFactory.createDoubleWrapperType() createDoubleWrapperTypeFromDouble(double d) {
		f.setValue(d)
	}
	
	def IfcCartesianPoint create f: ifcFactory.createIfcCartesianPoint createCartesianPoint(Axis2Placement3D a) {
		f.setId(newId)
		f.coordinates = createCoordinatesType1()
		var lengthMeasure = f.coordinates.ifcLengthMeasure
		lengthMeasure.add(createLengthMeasureTypeFromDouble(a.cartesianX))
		lengthMeasure.add(createLengthMeasureTypeFromDouble(a.cartesianY))
		lengthMeasure.add(createLengthMeasureTypeFromDouble(a.cartesianZ))
	}
	
	def IfcCartesianPoint create f: ifcFactory.createIfcCartesianPoint createRefCartesianPoint(String i) {
		f.setRef(i)
	}
	
	def CoordinatesType1 create f: ifcFactory.createCoordinatesType1() createCoordinatesType1() {}
	
	def IfcLengthMeasureType create f: ifcFactory.createIfcLengthMeasureType() createLengthMeasureTypeFromDouble(double d) {
		f.setValue(d)
	}
	
	def IfcRelVoidsElement create f: ifcFactory.createIfcRelVoidsElement() createRelVoidsElementFromOpening(Wall w, IfcOpeningElement o) {
		val uuid = UUID::randomUUID().toString()
		f.setGlobalId(uuid)
		f.setId(newId)
		
		//Set opening
		f.relatedOpeningElement.ifcFeatureElementSubtraction.eSet(
			FinalPackage::eINSTANCE.relatedOpeningElementType_IfcFeatureElementSubtraction, o
		)
		
		val wall = guidMap.get(w.name) as IfcWall
		f.relatingBuildingElement.eSet(FinalPackage::eINSTANCE.relatedBuildingElementType_IfcElement, createRefWall(wall.ref))
		
	}
	
	def IfcWall create f: ifcFactory.createIfcWall() createRefWall(String i) {
		f.setRef(i)
	}
	//End creating new object
	
	def private collectGarbage(IWorkflowContext ctx) {
		val ifcModel = ctx.get(mainModelSlot) as Resource
		var garbageCounter = 0
		var refCounter = 0
		
		val ids = new HashMap<String, Entity>
		val refs  = new ArrayList<Entity>
		val refIds = new HashSet<String>
		
		ifcModel.contents.get(0).eAllContents.forEach[
			if (it instanceof Entity) {
				val e = it as Entity
				if (e.ref != null) {
					refs.add(e)
					refIds.add(e.ref)
				}
				else if (e.id != null) {
					ids.put(e.id, e)
				}
			}
		]
		
		println("Collecting garbage from " + ids.size + " items")
		val garbageToRemove = new ArrayList<String>()
		for (e : ids.values) {
			if (e instanceof IfcLocalPlacement || e instanceof IfcAxis2Placement3D || e instanceof IfcDirection || e instanceof IfcCartesianPoint) {
				if (!refIds.contains(e.id)) {
					EcoreUtil::delete(e)
					
					garbageToRemove.add(e.id)
					garbageCounter = garbageCounter + 1
				}
			}
		}
		garbageToRemove.forEach[
			ids.remove(it)
		] 
		println("Collected " + garbageCounter + " garbage items")
		
		println("Pruning " + refs.size + " refs")
		for(e : refs) {
			// The ref points to an entity which no longer exists
			if (!ids.containsKey(e.ref)) {
				EcoreUtil::delete(e)
				
				refCounter = refCounter + 1
			}
		}
		
		println("Pruned " + refCounter + " references")
	}
	
	override invoke(IWorkflowContext ctx) {
		println("Starting: Pipes2IFCTransformer")
		//Initialization
		// Get elements from context
		pipesModel = ctx.get(pipesOpeningsSlot) as Model
		
		val openings = ctx.get(openingsSlot) as ArrayList<IfcOpeningElement>
		val flowSegments = ctx.get(flowSegmentsSlot) as ArrayList<IfcFlowSegment>
		
		// Create a list containing all openings and flowsegments
		val openingsAndFlowSegments = new ArrayList<IfcProduct>()
		openingsAndFlowSegments.addAll(openings)
		openingsAndFlowSegments.addAll(flowSegments)
		
		val removedSet = new HashSet<String>()
		markedSet = new HashSet<String>()
		ifcFactory = new FinalFactoryImpl()
		commonFactory = new CommonFactoryImpl()
		
		entityMap = ctx.get(entityMapSlot) as HashMap<String, Entity>
		guidMap = ctx.get(guidMapSlot) as HashMap<String, Entity>
		resource = ctx.get(mainModelSlot) as Resource
				
		//Run through entire object graph and update
		//If the object is a new opening - add it
		pipesModel.elements.forEach[po |
			if(guidMap.containsKey(po.name)) {
				updateIfcElement(po, guidMap.get(po.name), ctx)
			}
			else {
				if(po instanceof Opening) {
					createOpening(po as Opening)
				}
			}
		]
		
		//Remove deleted flow segments
		//Doesn't remove anything else
		//This will result in garbage object left in the model 
		flowSegments.forEach[ifcF |
			val found = pipesModel.elements.exists[f |
				ifcF.globalId == f.name
			]
			if(!found) {
				entityMap.remove(ifcF.id)
				guidMap.remove(ifcF.globalId)
				EcoreUtil::delete(ifcF)
				removedSet.add(ifcF.id)
			}
		]
		
		collectGarbage(ctx)
		ctx.put(mainModelSlot, resource)
		
		println("Done: Pipes2IFCTransformer")
	}
}
