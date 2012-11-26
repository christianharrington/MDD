package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import java.util.ArrayList
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct
import org.eclipse.emf.ecore.resource.Resource

class IFCPipesOpeningsExtractor extends WorkflowComponentWithSlot {
	
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
		
		val openings = new ArrayList<IfcOpeningElement>()
		val flowSegments = new ArrayList<IfcFlowSegment>()
		val both = new ArrayList<IfcProduct>()
		
		ifcResource.contents.get(0).eAllContents.forEach[
			if (it instanceof IfcOpeningElement) {
				openings.add(it as IfcOpeningElement)
				both.add(it as IfcOpeningElement)
			}
			else if (it instanceof IfcFlowSegment) {
				val fs = it as IfcFlowSegment
				if (fs.id != null) {
					flowSegments.add(fs)
					both.add(fs)
				}
			}
		]
		
		println("Openings: " + openings.size + "\nFlow segments: " + flowSegments.size())

		ctx.put(extractModelSlot, both)
		println("Done: IFCPipesOpeningsExtractor")
	}
}
