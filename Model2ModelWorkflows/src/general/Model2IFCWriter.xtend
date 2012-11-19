package general

import IfcIO.IfcWriter
import org.bimserver.ifc.IfcModel
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import general.WorkflowComponentWithSlot

class Model2IFCWriter extends WorkflowComponentWithSlot {
	
	String path
	
	def getPath() { path }
	
	def setPath(String path) { this.path = path }
	
	override invoke(IWorkflowContext ctx) {
		var IfcModel model = ctx.get(getSlot()) as IfcModel
	    IfcWriter::SaveModel(model)
	}
	
}