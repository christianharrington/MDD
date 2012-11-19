package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent

abstract class WorkflowComponentWithSlot implements IWorkflowComponent {
	
	var String pipesOpeningsSlot //Pipes DSL object graph
	var String mainModelSlot //IFC main model object graph
	var String extractModelSlot //IFC extracted model object graph 
	
	def getPipesOpeningsSlot() { pipesOpeningsSlot }
	def setPipesOpeningsSlot(String slot) { this.pipesOpeningsSlot = slot  }

	def getMainModelSlot() { mainModelSlot }
	def setMainModelSlot(String slot) { this.mainModelSlot = slot}	
	
	def getExtractModelSlot() { extractModelSlot }
	def setExtractModelSlot(String slot) { this.extractModelSlot = slot}	
	
	
	override postInvoke() {	}
	
	override preInvoke() { }
	
}