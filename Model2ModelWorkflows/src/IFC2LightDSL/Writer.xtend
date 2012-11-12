package IFC2LightDSL

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import IfcIO.IfcWriter
import org.bimserver.ifc.IfcModel

class Writer extends WorkflowComponentWithSlot {
	
	override invoke(IWorkflowContext ctx) {	
		var foo = ctx.get(this.getSlot())	
		IfcWriter::SaveModel(foo as IfcModel)
	}
	
}