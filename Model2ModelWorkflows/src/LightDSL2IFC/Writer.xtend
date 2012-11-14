package LightDSL2IFC

import IFC2LightDSL.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import IfcIO.IfcWriter
import org.bimserver.ifc.IfcModel

class Writer extends WorkflowComponentWithSlot {
	
	override invoke(IWorkflowContext ctx) {
		var model = ctx.get(getSlot())  
	    IfcWriter::SaveModel(model as IfcModel)
	}
	
}