package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent

abstract class WorkflowComponentWithSlot implements IWorkflowComponent {
	val String fileSlot = 'file' // The path to the XML file
	val String pipesOpeningsSlot = 'pipesOpenings' //Pipes DSL object graph
	val String mainModelSlot = 'mainModel' //IFC main model object graph
	val String openingsSlot = 'openings'
	val String flowSegmentsSlot = 'flowSegments'
	val String placementsSlot = 'placements'
	
	def getFileSlot() { fileSlot }
	
	def getPipesOpeningsSlot() { pipesOpeningsSlot }

	def getMainModelSlot() { mainModelSlot }
	
	def getOpeningsSlot() { openingsSlot }
	
	def getFlowSegmentsSlot() { flowSegmentsSlot }
	
	def getPlacementsSlot() { placementsSlot }
	
	override postInvoke() {	}
	
	override preInvoke() { }
	
}