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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.DirectionRatiosType
import org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonFactoryImpl
import org.tech.iai.ifc.xml.ifc._2x3.final_.CoordinatesType1
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureType
import org.tech.iai.ifc.xml.ifc._2x3.final_.LocationType
import org.eclipse.emf.ecore.resource.Resource
import java.util.UUID

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
		product.setName(o.name)
		product.setDescription(o.description)
	}
	
	def dispatch updateIfcElement(FlowSegment o, IfcFlowSegment product, IWorkflowContext ctx){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
			
			updateMetaData(o, objFromRef(product, ctx))
			
			// References
			updateIfcElement(o.placement, objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)
		}
		
	}
	
	def dispatch updateIfcElement(Opening o, IfcOpeningElement product, IWorkflowContext ctx){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
			
			updateMetaData(o, objFromRef(product, ctx))
			
			
			o.walls.forEach[w |
				extrModel.forEach[p |
					if(w.GUID == p.globalId) {
						updateIfcElement(w, objFromRef(p, ctx), ctx)
					}
				]
			]
			if(localPlacementIsChanged(o.placement, objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)) {
				product.objectPlacement.ifcObjectPlacementGroup.set(FinalPackage::eINSTANCE.objectPlacementType_IfcObjectPlacement, createLocalPlacement(o.placement))
			}
		
			true
		}
	}
	
	def dispatch updateIfcElement(Wall o, IfcWall product, IWorkflowContext ctx){
		markedSet.add(o.GUID)
		
		updateMetaData(o, objFromRef(product, ctx))
		/*
		o.openings.forEach[w |
			extrModel.forEach[p |
				if(w.GUID == p.globalId) {
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
		f.setGlobalId(o.GUID)
		f.setDescription(o.description)
		f.setName(o.name)
		
		f.setObjectPlacement(createObjectPlacementType(o.placement))
		
		for (w: o.walls) {
			val rve = createIfcRelVoidsElementFromOpening(w, f)
			entityMap.put(rve.GUID, )
		}

		entityMap.put(f.globalId, f)
	}
	
	def ObjectPlacementType create f: ifcFactory.createObjectPlacementType() createObjectPlacementType(LocalPlacement p) {
		//f.ifcObjectPlacementGroup.set(FinalPackage::eINSTANCE., createLocalPlacement(p))
		val instance = FinalPackage::eINSTANCE
		//f.ifcObjectPlacementGroup.add(fisk.objectPlacementType_IfcObjectPlacement, createLocalPlacement(p))
		var op = f.eGet(instance.objectPlacementType_IfcObjectPlacement)
		op = createLocalPlacement(p)
	}
	
	def IfcLocalPlacement create f: ifcFactory.createIfcLocalPlacement() createLocalPlacement(LocalPlacement p) {
		if(p.relativeTo != null) {
			f.setPlacementRelTo(createPlacementRelToType(p))
		}
		f.setRelativePlacement(createRelativePlacementType(p))
	}
	
	def PlacementRelToType create f: ifcFactory.createPlacementRelToType createPlacementRelToType(LocalPlacement p) {
		f.ifcObjectPlacementGroup.set(FinalPackage::eINSTANCE.objectPlacementType_IfcObjectPlacement, createLocalPlacement(p))
	}
	
	def RelativePlacementType create f: ifcFactory.createRelativePlacementType createRelativePlacementType(LocalPlacement p) {
		// 
		f.setIfcAxis2Placement3D(createAxis2Placement3D(p.axis2placement3d))
	}
	
	def IfcAxis2Placement3D create f: ifcFactory.createIfcAxis2Placement3D() createAxis2Placement3D(Axis2Placement3D a) {
		if(!(a.axis == null && a.refDirection == null)) {
			f.setAxis(createAxisType2(a))
			f.setRefDirection(createRefDirectionType1(a))
		}
		f.location = createLocationType()
		f.location.setIfcCartesianPoint(createIfcCartesianPoint(a))
	}
	
	def LocationType create f: ifcFactory.createLocationType() createLocationType() {}
	
	def AxisType2 create f: ifcFactory.createAxisType2() createAxisType2(Axis2Placement3D a) {
		f.setIfcDirection(createIfcDirection(a.axis))
	}
	
	def RefDirectionType1 create f: ifcFactory.createRefDirectionType1 createRefDirectionType1(Axis2Placement3D a) {
		f.setIfcDirection(createIfcDirection(a.refDirection))
	}
	
	def IfcDirection create f: ifcFactory.createIfcDirection() createIfcDirection(Direction d) {
		f.directionRatios = createDirectionRatiosType()
		var ratios = f.directionRatios.doubleWrapper
		ratios.add(createDoubleWrapperTypeFromDouble(d.x))
		ratios.add(createDoubleWrapperTypeFromDouble(d.y))
		ratios.add(createDoubleWrapperTypeFromDouble(d.z))
	}
	
	def DirectionRatiosType create f: ifcFactory.createDirectionRatiosType() createDirectionRatiosType() {}
	
	def DoubleWrapperType create f: commonFactory.createDoubleWrapperType() createDoubleWrapperTypeFromDouble(double d) {
		f.setValue(d)
	}
	
	def IfcCartesianPoint create f: ifcFactory.createIfcCartesianPoint createIfcCartesianPoint(Axis2Placement3D a) {
		f.coordinates = createCoordinatesType1()
		var lengthMeasure = f.coordinates.ifcLengthMeasure
		lengthMeasure.add(createIfcLengthMeasureTypeFromDouble(a.cartesianX))
		lengthMeasure.add(createIfcLengthMeasureTypeFromDouble(a.cartesianY))
		lengthMeasure.add(createIfcLengthMeasureTypeFromDouble(a.cartesianZ))
	}
	
	def CoordinatesType1 create f: ifcFactory.createCoordinatesType1() createCoordinatesType1() {}
	
	def IfcLengthMeasureType create f: ifcFactory.createIfcLengthMeasureType() createIfcLengthMeasureTypeFromDouble(double d) {
		f.setValue(d)
	}
	
	def IfcRelVoidsElement create f: ifcFactory.createIfcRelVoidsElement() createIfcRelVoidsElementFromOpening(Wall w, IfcOpeningElement o) {
		val uuid = UUID::randomUUID().toString()
		f.setGlobalId(uuid)
		
		//Set opening
		f.relatedOpeningElement.ifcFeatureElementSubtractionGroup.set(
			FinalPackage::eINSTANCE.relatedOpeningElementType_IfcFeatureElementSubtraction, o
		)
		
		val wall = guidMap.get(w.GUID) as IfcWall
		f.relatingBuildingElement.eSet(FinalPackage::eINSTANCE.relatedBuildingElementType_IfcElement, wall)
		
		//Find original wall
		/*
		pipesModel.elements.forEach[pe |
			if(pe instanceof Wall) {
				entityMap.values.forEach[v |
					if(v instanceof IfcRoot) {
						if(pe.GUID == (v as IfcElement).globalId) {
							f.relatingBuildingElement.ifcElementGroup.set(
								FinalPackage::eINSTANCE.relatedBuildingElementType_IfcElement, v as IfcElement
							)
						}
					}
				]
			}			
		]	*/
	}
	//End creating new object
	
	override invoke(IWorkflowContext ctx) {
		println("Starting: Pipes2IFCTransformer")
		//Initialization
		pipesModel = ctx.get(pipesOpeningsSlot) as Model
		val openings = ctx.get(openingsSlot) as ArrayList<IfcOpeningElement>
		val flowSegments = ctx.get(flowSegmentsSlot) as ArrayList<IfcFlowSegment>
		
		
		val openingsAndFlowSegments = new ArrayList<IfcProduct>()
		openingsAndFlowSegments.addAll(openings)
		openingsAndFlowSegments.addAll(flowSegments)
		
		markedSet = new HashSet<String>()
		ifcFactory = new FinalFactoryImpl()
		commonFactory = new CommonFactoryImpl()
		entityMap = ctx.get(entityMapSlot) as HashMap<String, Entity>
		guidMap = ctx.get(guidMapSlot) as HashMap<String, Entity>
		resource = ctx.get(mainModelSlot) as Resource
				
		//Run through entire object graph and update
		//If the object is a new opening - add it
		pipesModel.elements.forEach[po |
			if(guidMap.containsKey(po.GUID)) {
				updateIfcElement(po, guidMap.get(po.GUID), ctx)
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
			var found = pipesModel.elements.exists[f |
				ifcF.globalId == f.GUID
			]
			if(!found) {
				entityMap.remove(ifcF)
			}
		]
		
		println("Done: Pipes2IFCTransformer")
	}
}