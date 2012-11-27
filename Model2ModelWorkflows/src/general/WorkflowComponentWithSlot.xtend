package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement
import java.util.HashMap

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
		
	def <T extends EObject> getEObjectFromReference(T refObject, IWorkflowContext ctx) {
		if (refObject instanceof IfcOpeningElement) {
			val openings = ctx.get(openingsSlot) as HashMap<String, IfcOpeningElement>
			val opening = refObject as IfcOpeningElement
			openings.get(opening.ref)			
		}
		else if (refObject instanceof IfcFlowSegment) {
			val flowSegments = ctx.get(flowSegmentsSlot) as HashMap<String, IfcFlowSegment>
			val flowSegment = refObject as IfcFlowSegment
			flowSegments.get(flowSegment.ref)				
		}
		else if (refObject instanceof IfcLocalPlacement) {
			val placements = ctx.get(placementsSlot) as HashMap<String, IfcLocalPlacement>
			val placement = refObject as IfcLocalPlacement
			placements.get(placement.ref)
		}
	}
	
}
