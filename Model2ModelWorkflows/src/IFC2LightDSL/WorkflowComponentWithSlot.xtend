package IFC2LightDSL

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent

abstract class WorkflowComponentWithSlot implements IWorkflowComponent {
	
	var String slot
	
	def getSlot() { slot }
	
	def setSlot(String slot) { this.slot = slot  }
	
	
	override postInvoke() {	}
	
	override preInvoke() { }
	
}