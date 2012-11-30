package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashMap
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity
import java.util.ArrayList

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
		
		val openings = new ArrayList<IfcOpeningElement>()
		val flowSegments = new ArrayList<IfcFlowSegment>()
		val entityMap = new HashMap<String, Entity>()
		
		ifcResource.contents.get(0).eAllContents.forEach[
			if (it instanceof Entity) {
				// If the object has an ID it is an entity not a ref, add it to our map
				val en = it as Entity
				if (en.id != null) {
					entityMap.put(en.id, en)
				}
				
				// If the object is and opening or flow segment, we need it for our model
				if (en instanceof IfcOpeningElement) {
					val op = en as IfcOpeningElement
					if (op.id != null) {
						openings.add(op)
					}
				}
				else if (en instanceof IfcFlowSegment) {
					val fs = en as IfcFlowSegment
					if (fs.id != null) {
						flowSegments.add(fs)
					}
				}
			}		
		]
		
		println("Openings: " + openings.size + "\nFlow segments: " + flowSegments.size())

		ctx.put(openingsSlot, openings)
		ctx.put(flowSegmentsSlot, flowSegments)
		ctx.put(entityMapSlot, entityMap)
		println("Done: IFCPipesOpeningsExtractor")
	}
}
