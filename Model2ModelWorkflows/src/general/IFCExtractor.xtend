package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashMap


class IFCExtractor extends WorkflowComponentWithSlot {
	// Current doesn't work - always true
	def flowIsPipe(IfcFlowSegment flow) {
		// var rels = flow.isDefinedBy
		// rels.forEach[
		// ]
		return true
	}
		
	override invoke(IWorkflowContext ctx) {
		println("Starting: IFCPipesOpeningsExtractor")
		
		val ifcResource = ctx.get(mainModelSlot) as Resource
		
		val openings = new HashMap<String, IfcOpeningElement>()
		val flowSegments = new HashMap<String, IfcFlowSegment>()
		val placements = new HashMap<String, IfcLocalPlacement>()
		
		ifcResource.contents.get(0).eAllContents.forEach[
			if (it instanceof IfcOpeningElement) {
				val op = it as IfcOpeningElement
				if (op.id != null) {
					openings.put(op.id, op)
				}
			}
			else if (it instanceof IfcFlowSegment) {
				val fs = it as IfcFlowSegment
				if (fs.id != null) {
					flowSegments.put(fs.id, fs)
				}
			}
			else if (it instanceof IfcLocalPlacement) {
				val lp = it as IfcLocalPlacement
				if (lp.id != null) {
					placements.put(lp.id, lp)
				}
			}
		]
		
		println("Openings: " + openings.size + "\nFlow segments: " + flowSegments.size())

		ctx.put(openingsSlot, openings)
		ctx.put(flowSegmentsSlot, flowSegments)
		ctx.put(placementsSlot, placements)
		println("Done: IFCPipesOpeningsExtractor")
	}
}
