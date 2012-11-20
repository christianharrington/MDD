package Pipes2IFC

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.Model
import pipes.Opening
import pipes.LocalPlacement
import java.util.ArrayList
import org.bimserver.models.ifc2x3tc1.IfcProduct
import pipes.FlowSegment
import pipes.Wall
import pipes.WallRelation
import pipes.Axis2Placement3D
import java.util.HashSet
import org.bimserver.models.ifc2x3tc1.IfcAxis2Placement3D
import org.eclipse.emf.common.util.EList
import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1FactoryImpl

class Pipes2IFCTransformer extends WorkflowComponentWithSlot {
	
	Ifc2x3tc1FactoryImpl ifcFactory
	
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
	
	def dispatch updateIfcElement(FlowSegment o, IfcProduct product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
		}
		
	}
	
	def dispatch updateIfcElement(Opening o, IfcProduct product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
		}
	}
	
	def dispatch updateIfcElement(Wall o, IfcProduct product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
		}
	}
	
	def dispatch updateIfcElement(WallRelation o, IfcProduct product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
		}
	}
	
	def dispatch updateIfcElement(LocalPlacement o, IfcProduct product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
		}
	}
	
	def dispatch updateIfcElement(Axis2Placement3D o, IfcProduct product){
		if(!markedSet.contains(o.GUID))
		{
			markedSet.add(o.GUID)
			
			val axis = product as IfcAxis2Placement3D
			//axis.axis.directionRatios = new ArrayList<Double>(o.axis.x, o.axis.y, o.axis.z) 
			
			val refdir = ifcFactory.createIfcDirection()
			//new IfcDirection
			//axis.refDirection = refdir.
			//new ArrayList<Double>(o.refDirection.x, o.refDirection.y, o.refDirection.z)
		}
		
		true
	}
	

	override invoke(IWorkflowContext ctx) {
		
		//Initialization
		val pipesModel = ctx.get(pipesOpeningsSlot) as Model
		val extractedModel = ctx.get(extractModelSlot) as ArrayList<IfcProduct>
		
		markedSet = new HashSet<String>()
		ifcFactory = new Ifc2x3tc1FactoryImpl()
				
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