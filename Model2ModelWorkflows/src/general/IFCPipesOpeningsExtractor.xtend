package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import java.util.ArrayList
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct

class IFCPipesOpeningsExtractor extends WorkflowComponentWithSlot {
	
	// Current doesn't work - always true
	def flowIsPipe(IfcFlowSegment flow) {
		// var rels = flow.isDefinedBy
		// rels.forEach[
		// ]
		return true
	}
		
	override invoke(IWorkflowContext ctx) {
		var ifcModel = ResourceUnwrapper::unwrap(ctx.get(mainModelSlot))
		
		var openings = ifcModel.filter(typeof(IfcOpeningElement))
		var flows = ifcModel.filter(typeof(IfcFlowSegment)) 
		
		val list = new ArrayList<IfcProduct>()
		
		openings.forEach[
			list.add(it)
			println("Opening: " + it)
		]
		flows.forEach[
			if(flowIsPipe(it)) 
				list.add(it)
		]
		
		ctx.put(extractModelSlot, list)
	}
}