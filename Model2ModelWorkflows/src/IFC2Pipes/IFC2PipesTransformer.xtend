package IFC2Pipes

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.impl.PipesFactoryImpl
import pipes.Model
import pipes.Opening
import pipes.LocalPlacement
import pipes.FlowSegment
import pipes.Product
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D
import java.util.ArrayList
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct

class IFC2PipesTransformer extends WorkflowComponentWithSlot {
	
	PipesFactoryImpl pipesFactory
	
	/*
	 addXXX(targetModelElement e1, sourceModelElement e2)
	 * create new targetModelElements with factory
	 */
	 
	def private addOpening(Model pipesModel, IfcOpeningElement ifcOpening) {
		var Opening op = pipesFactory.createOpening()
		op.name = ifcOpening.name
		op.description = ifcOpening.description
		var placement = ifcOpening.objectPlacement as IfcLocalPlacement
		addLocalPlacement(op, placement)
		
		pipesModel.elements.add(op)
	}
	
	def private addFlowSegment(Model pipesModel, IfcFlowSegment ifcFlowSegment) {
		var FlowSegment fs = pipesFactory.createFlowSegment()
		fs.name = ifcFlowSegment.name
		fs.description = ifcFlowSegment.description
		var placement = ifcFlowSegment.objectPlacement as IfcLocalPlacement
		addLocalPlacement(fs, placement)		
		pipesModel.elements.add(fs)
	}
	
	def private addLocalPlacement(Product product, IfcLocalPlacement ifcLocalPlacement) {
		var LocalPlacement lp = pipesFactory.createLocalPlacement()
		var IfcAxis2Placement3D axis = ifcLocalPlacement.relativePlacement as IfcAxis2Placement3D
		println("axis " + axis)
		
		//addAxis2Placement3D(lp, ifcLocalPlacement.relativePlacement)
		product.placement = lp;
	}
	/*
	def private addAxis2Placement3D(LocalPlacement lp, IfcAxis2Placement ifcPlacement) {
		var Axis2Placement3D a2p = pipesFactory.createAxis2Placement3D()
		ifcPlacement.
		a2p.
	}*/
	
	//def private addDirection(Axis2Placement3D a2p, )
	

	override invoke(IWorkflowContext ctx) {
		val ifcmodel = ctx.get(extractModelSlot) as ArrayList<IfcProduct>
		
		pipesFactory = new PipesFactoryImpl()
		val pipesModel = pipesFactory.createModel()
		
		var openings = ifcmodel.filter(typeof(IfcOpeningElement))
		println("openings: " + openings.size())
		openings.forEach[
			addOpening(pipesModel, it)
		]
		
		var flowSegments = ifcmodel.filter(typeof(IfcFlowSegment))
		println("flow segments: " + flowSegments.size())
		flowSegments.forEach[
			addFlowSegment(pipesModel, it)
		]
		
		ctx.put(pipesOpeningsSlot, pipesModel)
		
	}
	
}