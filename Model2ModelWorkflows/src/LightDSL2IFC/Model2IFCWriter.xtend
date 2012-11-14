package LightDSL2IFC

import IFC2LightDSL.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import IfcIO.IfcWriter
import org.bimserver.ifc.IfcModel

class Model2IFCWriter extends WorkflowComponentWithSlot {
	
	String path
	
	def getPath() { path }
	
	def setPath(String path) { this.path = path }
	
	override invoke(IWorkflowContext ctx) {
		var IfcModel model = ctx.get(getSlot()) as IfcModel
	    IfcWriter::SaveModel(model)
	}
	
}