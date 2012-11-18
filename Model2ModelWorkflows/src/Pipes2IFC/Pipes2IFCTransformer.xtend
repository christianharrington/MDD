package Pipes2IFC

import general.WorkflowComponentWithSlot
import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1FactoryImpl
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.bimserver.ifc.IfcModel
import pipes.Model
import pipes.Opening
import org.bimserver.models.ifc2x3tc1.IfcOpeningElement
import pipes.LocalPlacement

class Pipes2IFCTransformer extends WorkflowComponentWithSlot {
	
	Ifc2x3tc1FactoryImpl ifcFactory
	
	def private addIfcOpening(IfcModel ifcModel, Opening pipesOpening) {
		var ifcOpening = ifcFactory.createIfcOpeningElement()
		addIfcLocalPlacement(ifcOpening, pipesOpening.placement)
		ifcModel.add(ifcOpening)
	}
	
	def private addIfcLocalPlacement(IfcOpeningElement ifcOpening, LocalPlacement pipesPlacement) { 
		var ifcLocalPlacement = ifcFactory.createIfcLocalPlacement()
		ifcOpening.objectPlacement = ifcLocalPlacement
	}

	override invoke(IWorkflowContext ctx) {
		val pipesModel = ctx.get(getSlot()) as Model
		
		ifcFactory = new Ifc2x3tc1FactoryImpl()
		
		val IfcModel ifcModel = new IfcModel()
		var openings = pipesModel.elements.filter(typeof(Opening))
		
		openings.forEach[
			addIfcOpening(ifcModel, it)
		]
		
		ctx.put(getSlot(), ifcModel)
	}
}