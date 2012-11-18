package IFC2Pipes

import general.WorkflowComponentWithSlot
import org.bimserver.ifc.IfcModel
import org.bimserver.models.ifc2x3tc1.IfcOpeningElement
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.impl.PipesFactoryImpl
import pipes.Model
import pipes.Opening
import org.bimserver.models.ifc2x3tc1.IfcLocalPlacement
import pipes.LocalPlacement
import org.bimserver.models.ifc2x3tc1.IfcAxis2Placement
import pipes.Axis2Placement3D

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
	
	def private addLocalPlacement(Opening op, IfcLocalPlacement ifcLocalPlacement) {
		var LocalPlacement lp = pipesFactory.createLocalPlacement()
		//addAxis2Placement3D(lp, ifcLocalPlacement.relativePlacement)
		op.placement = lp
	}
	/*
	def private addAxis2Placement3D(LocalPlacement lp, IfcAxis2Placement ifcPlacement) {
		var Axis2Placement3D a2p = pipesFactory.createAxis2Placement3D()
		ifcPlacement.
		a2p.
	}*/
	
	//def private addDirection(Axis2Placement3D a2p, )
	

	override invoke(IWorkflowContext ctx) {
		val IfcModel ifcmodel = ctx.get(getSlot()) as IfcModel
		
		pipesFactory = new PipesFactoryImpl()
		val pipesModel = pipesFactory.createModel()
		
		var openings = ifcmodel.filter(typeof(IfcOpeningElement))
		println("openings: " + openings.size())
		openings.forEach[
			addOpening(pipesModel, it)
		]
		
		ctx.put(getSlot(), pipesModel)
		
	}
	
}