package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement
import java.util.HashMap

abstract class WorkflowComponentWithSlot implements IWorkflowComponent {
	
	var String fileSlot // The path to the XML file
	var String pipesOpeningsSlot //Pipes DSL object graph
	var String mainModelSlot //IFC main model object graph
	var String extractModelSlot //IFC extracted model object graph 
	
	def getFileSlot() { fileSlot }
	def setFileSlot(String slot) { this.fileSlot = slot  }
	
	def getPipesOpeningsSlot() { pipesOpeningsSlot }
	def setPipesOpeningsSlot(String slot) { this.pipesOpeningsSlot = slot  }

	def getMainModelSlot() { mainModelSlot }
	def setMainModelSlot(String slot) { this.mainModelSlot = slot}	
	
	def getExtractModelSlot() { extractModelSlot }
	def setExtractModelSlot(String slot) { this.extractModelSlot = slot}	
	
	
	override postInvoke() {	}
	
	override preInvoke() { }
		
	def <T extends EObject> getEObjectFromRefObject(T refObject, IWorkflowContext ctx) {
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