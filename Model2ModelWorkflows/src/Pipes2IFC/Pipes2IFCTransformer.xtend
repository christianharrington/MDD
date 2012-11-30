package Pipes2IFC

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.Model
import pipes.Opening
import pipes.LocalPlacement
import java.util.ArrayList
import pipes.FlowSegment
import pipes.Wall
import pipes.WallRelation
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

class Pipes2IFCTransformer extends WorkflowComponentWithSlot {
	
	FinalFactoryImpl ifcFactory
	
	/*def private addIfcOpening(IfcModel ifcModel, Opening pipesOpening) {
		var ifcOpening = ifcFactory.createIfcOpeningElement()
		addIfcLocalPlacement(ifcOpening, pipesOpening.placement)
		ifcModel.add(ifcOpening)
	}
	
	def private addIfcLocalPlacement(IfcOpeningElement ifcOpening, LocalPlacement pipesPlacement) { 
		var ifcLocalPlacement = ifcFactory.createIfcLocalPlacement()
		ifcOpening.objectPlacement = ifcLocalPlacement
	}*/
	
	HashSet<String> markedSet
	ArrayList<IfcProduct> extrModel
	Model pipesModel
	HashMap<String, Entity> entityMap
	
	
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
			updateIfcElement(o.placement, objFromRef(product, ctx).objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)
		}
	}
	
	def dispatch updateIfcElement(Wall o, IfcWall product, IWorkflowContext ctx){
		markedSet.add(o.GUID)
		
		updateMetaData(o, objFromRef(product, ctx))
		
		o.openings.forEach[w |
			extrModel.forEach[p |
				if(w.GUID == p.globalId) {
					updateIfcElement(w, objFromRef(p, ctx), ctx)
				}					
			]
		]
		
		true
	}
	
	def dispatch updateIfcElement(WallRelation o, IfcRelVoidsElement product, IWorkflowContext ctx){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
			updateMetaData(o, objFromRef(product, ctx))
			if(objFromRef(product, ctx).relatingBuildingElement.ifcElement instanceof IfcWall) {
				updateIfcElement(o.wall, objFromRef(product, ctx).relatingBuildingElement.ifcElement as IfcWall, ctx)
			}
			if(objFromRef(product, ctx).relatedOpeningElement.ifcFeatureElementSubtraction instanceof IfcOpeningElement) {
				updateIfcElement(o.opening, objFromRef(product, ctx).relatedOpeningElement.ifcFeatureElementSubtraction as IfcOpeningElement, ctx)
			}
			true
		}
	}
	
	def dispatch updateIfcElement(LocalPlacement o, IfcLocalPlacement product, IWorkflowContext ctx) {
		markedSet.add(o.GUID)
	
		updateIfcElement(o.axis2placement3d, objFromRef(product, ctx).relativePlacement.ifcAxis2Placement3D, ctx)
	}
	
	def dispatch updateIfcElement(Axis2Placement3D o, IfcAxis2Placement3D product, IWorkflowContext ctx){
		markedSet.add(o.GUID)
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
		// Create WallRelations
		pipesModel.elements.forEach[
			if(it instanceof WallRelation) {
				var wr = it as WallRelation
				if(wr.opening.GUID == o.GUID) {
					createIfcRelVoidsElementFromOpening(wr, f)
				} 
			}
		]
		
		entityMap.put(f.globalId, f)
	}
	
	def ObjectPlacementType create f: ifcFactory.createObjectPlacementType() createObjectPlacementType(LocalPlacement p) {
		f.ifcObjectPlacementGroup.set(FinalPackage::eINSTANCE.objectPlacementType_IfcObjectPlacement, createLocalPlacement(p))
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
		f.location.setIfcCartesianPoint(createIfcCartesianPoint(a))
	}
	
	def AxisType2 create f: ifcFactory.createAxisType2() createAxisType2(Axis2Placement3D a) {
		f.setIfcDirection(createIfcDirection(a.axis))
	}
	
	def RefDirectionType1 create f: ifcFactory.createRefDirectionType1 createRefDirectionType1(Axis2Placement3D a) {
		f.setIfcDirection(createIfcDirection(a.refDirection))
	}
	
	def IfcDirection create f: ifcFactory.createIfcDirection() createIfcDirection(Direction d) {
		var ratios = f.directionRatios.doubleWrapper
		ratios.get(0).setValue(d.x)
		ratios.get(1).setValue(d.y)
		ratios.get(2).setValue(d.z)
	}
	
	def IfcCartesianPoint create f: ifcFactory.createIfcCartesianPoint createIfcCartesianPoint(Axis2Placement3D a) {
		var lengthMeasure = f.coordinates.ifcLengthMeasure  
		lengthMeasure.get(0).setValue(a.cartesianX)
		lengthMeasure.get(1).setValue(a.cartesianY)
		lengthMeasure.get(2).setValue(a.cartesianZ)
	}
	
	def IfcRelVoidsElement create f: ifcFactory.createIfcRelVoidsElement() createIfcRelVoidsElementFromOpening(WallRelation wr, IfcOpeningElement o) {
		f.setGlobalId(wr.GUID)
		f.setDescription(wr.description)
		f.setName(wr.name)
		
		//Set opening
		f.relatedOpeningElement.ifcFeatureElementSubtractionGroup.set(
			FinalPackage::eINSTANCE.relatedOpeningElementType_IfcFeatureElementSubtraction, o
		)
		
		//Find original wall
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
		]	
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
				
		//Run through entire object graph and update
		//If the object is a new opening - add it
		pipesModel.elements.forEach[po |
			var found = true
			if(po instanceof Opening) {
				found = openings.exists[ifcO |
					po.GUID == ifcO.globalId
				]
				if(!found) {
					createOpening(po as Opening)
				}
			}
			if(found) {
				openingsAndFlowSegments.forEach[e |
					if(po.GUID.equals(e.globalId))
						updateIfcElement(po, e, ctx)
				]
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