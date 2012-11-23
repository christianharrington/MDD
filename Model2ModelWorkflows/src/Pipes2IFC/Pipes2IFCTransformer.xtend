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
import org.tech.iai.ifc.xml.ifc._2x3.final_.AxisType2
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AxisType2Impl
import pipes.Direction
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirection
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWall
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelVoidsElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRoot

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
	
	def private updateMetaData(GUIDElement o, IfcRoot product) {
		product.setName(o.name)
		product.setDescription(o.description)
	}
	
	def dispatch updateIfcElement(FlowSegment o, IfcFlowSegment product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
			
			updateMetaData(o, product)
			
			// References
			updateIfcElement(o.placement, product.objectPlacement.ifcObjectPlacement as IfcLocalPlacement)
		}
		
	}
	
	def dispatch updateIfcElement(Opening o, IfcOpeningElement product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
			
			updateMetaData(o, product)
			
			
			o.walls.forEach[w |
				extrModel.forEach[p |
					if(w.GUID == p.globalId) {
						updateIfcElement(w, p)
					}
				]
			]
			updateIfcElement(o.placement, product.objectPlacement.ifcObjectPlacement as IfcLocalPlacement)
		}
	}
	
	def dispatch updateIfcElement(Wall o, IfcWall product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
			
			updateMetaData(o, product)
			
			o.openings.forEach[w |
				extrModel.forEach[p |
					if(w.GUID == p.globalId) {
						updateIfcElement(w, p)
					}					
				]
			]
			
			true	
		}
	}
	
	def dispatch updateIfcElement(WallRelation o, IfcRelVoidsElement product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
			updateMetaData(o, product)
			if(product.relatingBuildingElement instanceof IfcWall) {
				updateIfcElement(o.wall, product.relatingBuildingElement as IfcWall)
			}
			if(product.relatedOpeningElement instanceof IfcOpeningElement) {
				updateIfcElement(o.opening, product.relatedOpeningElement as IfcOpeningElement)
			}
			true
		}
	}
	
	def dispatch updateIfcElement(LocalPlacement o, IfcLocalPlacement product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
	
			updateIfcElement(o.axis2placement3d, product.relativePlacement.ifcAxis2Placement3D)		
		}
	}
	
	def dispatch updateIfcElement(Axis2Placement3D o, IfcAxis2Placement3D product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
			var lengthMeasure = product.location.ifcCartesianPoint.coordinates.ifcLengthMeasure  
			lengthMeasure.get(0).setValue(o.cartesianX)
			lengthMeasure.get(1).setValue(o.cartesianY)
			lengthMeasure.get(2).setValue(o.cartesianZ)
			updateIfcElement(o.axis, product.axis.ifcDirection)
			updateIfcElement(o.refDirection, product.refDirection.ifcDirection)
		}
	}
		
	def dispatch updateIfcElement(Direction o, IfcDirection product) {
		var ratios = product.directionRatios.doubleWrapper
		ratios.get(0).setValue(o.x)
		ratios.get(1).setValue(o.y)
		ratios.get(2).setValue(o.z)
		true
	}

	override invoke(IWorkflowContext ctx) {
		
		//Initialization
		val pipesModel = ctx.get(pipesOpeningsSlot) as Model
		val extractedModel = ctx.get(extractModelSlot) as ArrayList<IfcProduct>
		extrModel = extractedModel
		
		markedSet = new HashSet<String>()
		ifcFactory = new FinalFactoryImpl()
				
		//Run through entire object graph and update
		pipesModel.elements.forEach[po |
			extractedModel.forEach[e |
				if(po.GUID.equals(e.globalId))
					updateIfcElement(po, e)
			]
		]
		

		
		/*val IfcModel ifcModel = new IfcModel()
		var openings = pipesModel.elements.filter(typeof(Opening))
		
		openings.forEach[
			addIfcOpening(ifcModel, it)
		]*/
	}
}