package IFC2LightDSL

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import IfcIO.IfcReader;


class Reader extends WorkflowComponentWithSlot {
	
	String file
	String schema
	
	override invoke(IWorkflowContext ctx) {
		ctx.put(getSlot(), IfcReader::ReadModel(getFile(), getSchema()))		
	}
	
	def getFile() { file }	
	def setFile(String file) { this.file = file  }
	
	def getSchema() { schema }	
	def setSchema(String schema) { this.schema = schema  }
}
	
