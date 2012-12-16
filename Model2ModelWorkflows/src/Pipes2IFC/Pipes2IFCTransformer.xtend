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
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalFactory
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
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonFactory
import org.tech.iai.ifc.xml.ifc._2x3.final_.CoordinatesType1
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureType
import org.tech.iai.ifc.xml.ifc._2x3.final_.LocationType
import java.util.UUID
import org.tech.iai.ifc.xml.ifc._2x3.final_.Uos
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain
import org.eclipse.emf.edit.provider.ComposedAdapterFactory
import org.eclipse.emf.common.command.BasicCommandStack
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElement
import pipes.Product

class Pipes2IFCTransformer extends WorkflowComponentWithSlot {
	FinalFactory ifcFactory
	CommonFactory commonFactory
	HashSet<String> markedSet
	ArrayList<IfcProduct> extrModel
	Model pipesModel
	HashMap<String, Entity> entityMap
	HashMap<String, Entity> guidMap
	Resource resource
	Uos uosItem
	AdapterFactoryEditingDomain ed
	ArrayList<Entity> newElements
	HashSet<String> addedIdSet
	
	def private localPlacementIsChanged(LocalPlacement o, IfcLocalPlacement product, IWorkflowContext ctx) {
		if(product != null && o != null) {
			axis2Placement3DIsChanged(o.axis2placement3d, objFromRef(product, ctx).relativePlacement.ifcAxis2Placement3D, ctx)
				|| localPlacementIsChanged(o.relativeTo, objFromRef(product, ctx).placementRelTo.ifcObjectPlacement as IfcLocalPlacement, ctx)
		} else if (o != null) { 
			true
		} else { false }
	}
	
	def private axis2Placement3DIsChanged(Axis2Placement3D o, IfcAxis2Placement3D product, IWorkflowContext ctx) {
		var lengthMeasure = objFromRef(objFromRef(product, ctx).location.ifcCartesianPoint, ctx).coordinates.ifcLengthMeasure
		return (o.cartesianX != lengthMeasure.get(0).value || 
			o.cartesianY != lengthMeasure.get(1).value || 
			o.cartesianZ != lengthMeasure.get(2).value ||
			directionIsChanged(o.refDirection, objFromRef(product, ctx).refDirection.ifcDirection, ctx) ||
			directionIsChanged(o.axis, objFromRef(product, ctx).axis.ifcDirection, ctx))
	}
	
	def private directionIsChanged(Direction o, IfcDirection product, IWorkflowContext ctx) {
		var ratios = objFromRef(product, ctx).directionRatios.doubleWrapper
		o.x != ratios.get(0).value || o.y != ratios.get(1).value || o.z != ratios.get(2).value
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
			if(localPlacementIsChanged(o.placement, objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)) {
				updateIfcLocalPlacement(o, product, ctx)
			}
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
						updateIfcElement(w, objFromRef(p, ctx) as IfcWall, ctx)
					}
				]
			]
			// Check if the localPlacement is changed. If it is, make a new one and set the references.
			if(localPlacementIsChanged(o.placement, objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)) {
				updateIfcLocalPlacement(o, product, ctx)				
			}
			true
		}
	}
	
	def dispatch updateIfcElement(Wall o, IfcWall product, IWorkflowContext ctx){
		markedSet.add(o.name)
		
		updateMetaData(o, objFromRef(product, ctx))
		
		// Check if the localPlacement is changed. If it is, make a new one and set the references.
		if(localPlacementIsChanged(o.placement, objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)) {
			updateIfcLocalPlacement(o, product, ctx)
		}
		true
	}
	
	def updateIfcLocalPlacement(Product o, IfcElement product, IWorkflowContext ctx) {
		// Find Id of old LocalPlacements relative localplacement
		var String id
		if((objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement).placementRelTo != null) {
			id = (objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement).placementRelTo.ifcObjectPlacement.id
		} else { id = null }
				
		// Create new LocalPlacement for element		
		val objectPlacementType = createObjectPlacementType()
		product.setObjectPlacement(objectPlacementType)
		var ifcLocalPlacement = createLocalPlacement(o.placement)
		
		objectPlacementType.setIfcObjectPlacement(createRefLocalPlacement(ifcLocalPlacement.id))
		
		// If the old Localplacements relative localplacement isn't null make a ref to it.
		// Else set it to null
		if(id != null) {
			var prt = ifcFactory.createPlacementRelToType()
			prt.setIfcObjectPlacement(createRefLocalPlacement(id))
			ifcLocalPlacement.setPlacementRelTo(prt)
		} else { id = null }
		
		addedIdSet.add(ifcLocalPlacement.id)
		newElements.add(ifcLocalPlacement)
		true
	}	
	// End update elements
	
	// Creating new opening element
	def IfcOpeningElement createOpening(Opening o) {
		val f = ifcFactory.createIfcOpeningElement()
		val uuid = EcoreUtil::generateUUID() // UUID::randomUUID().toString()
		o.name = uuid
		f.setGlobalId(uuid)
		f.setDescription(o.description)
		f.setName(o.elementName)
		f.setId(newId)
		
		val objectPlacementType = createObjectPlacementType()
		f.setObjectPlacement(objectPlacementType)
		var ifcLocalPlacement = createLocalPlacement(o.placement)
		
		objectPlacementType.setIfcObjectPlacement(createRefLocalPlacement(ifcLocalPlacement.id))
		
		newElements.add(ifcLocalPlacement)
		
		var refOpening = createRefOpening(f.id)
		for (w: o.walls) {
			val rve = createRelVoidsElementFromOpening(w, refOpening)
			entityMap.put(rve.id, rve)
		}		

		newElements.add(f)	
		entityMap.put(f.id, f)	
		
		f
	}
	
	def IfcOpeningElement createRefOpening(String i) {
		val f = ifcFactory.createIfcOpeningElement()
		f.setRef(i)
		
		f
	}
	
	def ObjectPlacementType createObjectPlacementType() {
		ifcFactory.createObjectPlacementType()
	}
	
	def IfcLocalPlacement createLocalPlacement(LocalPlacement p) {
		val f = ifcFactory.createIfcLocalPlacement()
		f.setId(newId)
		if(p.relativeTo != null) {
			f.setPlacementRelTo(createPlacementRelToType(p))
		}
		f.setRelativePlacement(createRelativePlacementType(p))
		
		entityMap.put(f.id, f)
		
		f
	}
	
	def IfcLocalPlacement createRefLocalPlacement(String i) {
		var f = ifcFactory.createIfcLocalPlacement()
		f.setRef(i)
		
		f
	}
	
	def PlacementRelToType createPlacementRelToType(LocalPlacement p) {
		val f = ifcFactory.createPlacementRelToType
		val lp = createLocalPlacement(p)
		entityMap.put(lp.id, lp)
		
		f.setIfcObjectPlacement(createRefLocalPlacement(lp.id))
		
		f
	}
	
	def RelativePlacementType createRelativePlacementType(LocalPlacement p) {
		val f = ifcFactory.createRelativePlacementType
		val axis2placement3d = createAxis2Placement3D(p.axis2placement3d)
		entityMap.put(axis2placement3d.id, axis2placement3d)
		f.setIfcAxis2Placement3D(createRefAxis2Placement3D(axis2placement3d.id))
		
		f
	}
	
	def IfcAxis2Placement3D createAxis2Placement3D(Axis2Placement3D a) {
		val f = ifcFactory.createIfcAxis2Placement3D()
		f.setId(newId)
		if(!(a.axis == null && a.refDirection == null)) {
			f.setAxis(createAxisType2(a))
			f.setRefDirection(createRefDirectionType1(a))
		}
		
		f.location = createLocationType()
		var cartesianPoint = createCartesianPoint(a)
		f.location.setIfcCartesianPoint(createRefCartesianPoint(cartesianPoint.id))
		
		entityMap.put(f.id, f)
		newElements.add(f)
		
		f
	}
	
	def IfcAxis2Placement3D createRefAxis2Placement3D(String i) {
		val f = ifcFactory.createIfcAxis2Placement3D()
		f.setRef(i)
		
		f
	}
	
	def LocationType createLocationType() {
		ifcFactory.createLocationType()
	}
	
	def AxisType2 createAxisType2(Axis2Placement3D a) {
		val f = ifcFactory.createAxisType2()
		val axis = createDirection(a.axis)
		f.setIfcDirection(createRefDirection(axis.id))
		
		f
	}
	
	def RefDirectionType1 createRefDirectionType1(Axis2Placement3D a) {
		val f = ifcFactory.createRefDirectionType1
		val ref = createDirection(a.refDirection)
		f.setIfcDirection(createRefDirection(ref.id))
		
		f
	}
	
	def IfcDirection createDirection(Direction d) {
		val f = ifcFactory.createIfcDirection() 
		f.setId(newId)
		f.directionRatios = ifcFactory.createDirectionRatiosType()
		f.directionRatios.doubleWrapper.add(createDoubleWrapperTypeFromDouble(d.x))
		f.directionRatios.doubleWrapper.add(createDoubleWrapperTypeFromDouble(d.y))
		f.directionRatios.doubleWrapper.add(createDoubleWrapperTypeFromDouble(d.z))
		
		entityMap.put(f.id, f)
		newElements.add(f)
		f
	}
	
	def IfcDirection createRefDirection(String i) {
		val f = ifcFactory.createIfcDirection()
		f.setRef(i)
		
		f
	}
	
	def DirectionRatiosType createDirectionRatiosType() {		
		ifcFactory.createDirectionRatiosType()
	}
	
	def DoubleWrapperType createDoubleWrapperTypeFromDouble(double d) {
		val f = commonFactory.createDoubleWrapperType()
		
		f.setValue(d)
		f
	}
	
	def IfcCartesianPoint createCartesianPoint(Axis2Placement3D a) {
		val f = ifcFactory.createIfcCartesianPoint
		f.setId(newId)
		f.coordinates = createCoordinatesType1()
		var lengthMeasure = f.coordinates.ifcLengthMeasure
		lengthMeasure.add(createLengthMeasureTypeFromDouble(a.cartesianX))
		lengthMeasure.add(createLengthMeasureTypeFromDouble(a.cartesianY))
		
		lengthMeasure.add(createLengthMeasureTypeFromDouble(a.cartesianZ))
		
		entityMap.put(f.id, f)	
		newElements.add(f)
		
		f
	}
	
	def IfcCartesianPoint createRefCartesianPoint(String i) {
		val f = ifcFactory.createIfcCartesianPoint 
		f.setRef(i)
		f
	}
	
	def CoordinatesType1 createCoordinatesType1() {
		ifcFactory.createCoordinatesType1() 
	}
	
	def IfcLengthMeasureType createLengthMeasureTypeFromDouble(double d) {
		var f = ifcFactory.createIfcLengthMeasureType() 
		f.setValue(d)
		f
	}
	
	def IfcRelVoidsElement createRelVoidsElementFromOpening(Wall w, IfcOpeningElement o) {
		val f = ifcFactory.createIfcRelVoidsElement()
		val uuid = UUID::randomUUID().toString()
		f.setGlobalId(uuid)
		f.setId(newId)
		
		f.setRelatedOpeningElement(ifcFactory.createRelatedOpeningElementType())
		
		//Set opening
		f.relatedOpeningElement.setIfcFeatureElementSubtraction(o)
		
		val wall = guidMap.get(w.name) as IfcWall
		f.setRelatingBuildingElement(ifcFactory.createRelatingBuildingElementType())
		
		f.relatingBuildingElement.eSet(FinalPackage::eINSTANCE.relatedBuildingElementType_IfcElement, wall)
		
		entityMap.put(f.id, f)
		newElements.add(f)
		f
	}
	
	def IfcWall createRefWall(String i) {
		val f = ifcFactory.createIfcWall() 
		f.setRef(i)
		f
	}
	//End creating new object
	
	def private collectGarbage(IWorkflowContext ctx) {
		val ifcModel = ctx.get(IFCModelSlot) as Resource
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
			if (!ids.containsKey(e.ref) && !addedIdSet.contains(e.ref)) {
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
		pipesModel = ctx.get(pipesModelSlot) as Model
		
		val openings = ctx.get(openingsSlot) as ArrayList<IfcOpeningElement>
		val flowSegments = ctx.get(flowSegmentsSlot) as ArrayList<IfcFlowSegment>
		
		// Create a list containing all openings and flowsegments
		val openingsAndFlowSegments = new ArrayList<IfcProduct>()
		openingsAndFlowSegments.addAll(openings)
		openingsAndFlowSegments.addAll(flowSegments)
		
		val removedSet = new HashSet<IfcProduct>()
		markedSet = new HashSet<String>()
		addedIdSet = new HashSet<String>()
		ifcFactory = FinalFactory::eINSTANCE
		commonFactory = CommonFactory::eINSTANCE

		entityMap = ctx.get(id2EntityMapSlot) as HashMap<String, Entity>
		guidMap = ctx.get(guid2ProductMapSlot) as HashMap<String, Entity>
		resource = ctx.get(IFCModelSlot) as Resource
		
		newElements = new ArrayList<Entity>()
		
		val iter = resource.contents.get(0).eAllContents
		while (iter.hasNext()) {
			val item = iter.next()
			if (item instanceof Uos) {
				uosItem = item as Uos
			}
		}
		ed = new AdapterFactoryEditingDomain(new ComposedAdapterFactory(
        				ComposedAdapterFactory$Descriptor$Registry::INSTANCE), new BasicCommandStack());
				
		//Run through entire object graph and update
		//If the object is a new opening - add it
		pipesModel.elements.forEach[po |
			if(guidMap.containsKey(po.name)) {
				if(po instanceof Product) {
					updateIfcElement(po as Product, guidMap.get(po.name) as IfcElement, ctx)
				}
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
				removedSet.add(ifcF)
			}
		]
		
		openings.forEach[ifcO |
			val found = pipesModel.elements.exists[o |
				ifcO.globalId == o.name
			]
			if(!found) {
				entityMap.remove(ifcO.id)
				guidMap.remove(ifcO.globalId)
				EcoreUtil::delete(ifcO)
				removedSet.add(ifcO)
			}
		]
		
		removedSet.forEach[
			switch it {
				IfcFlowSegment: flowSegments.remove(it)	
				IfcOpeningElement: openings.remove(it)
			}
		]

		collectGarbage(ctx)
		ctx.put(IFCModelSlot, resource)
		ctx.put(newEntitiesSlot, newElements)
		
		println("Done: Pipes2IFCTransformer")
	}
}
