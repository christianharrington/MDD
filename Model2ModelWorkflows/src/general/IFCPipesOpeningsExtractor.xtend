package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.bimserver.ifc.IfcModel
import org.bimserver.models.ifc2x3tc1.IfcOpeningElement
import org.bimserver.models.ifc2x3tc1.IfcFlowSegment
import java.util.ArrayList
import org.bimserver.models.ifc2x3tc1.IfcProduct
import org.bimserver.models.ifc2x3tc1.IfcPipeSegmentType
import org.bimserver.models.ifc2x3tc1.impl.IfcPipeSegmentTypeImpl
import org.bimserver.models.ifc2x3tc1.IfcRelDefinesByProperties

class IFCPipesOpeningsExtractor extends WorkflowComponentWithSlot {
	
	// Current doesn't work - always true
	def flowIsPipe(IfcFlowSegment flow) {
		// var rels = flow.isDefinedBy
		// rels.forEach[
		// ]
		return true
	}
		
	override invoke(IWorkflowContext ctx) {
		var ifcModel = ctx.get(mainModelSlot) as IfcModel
		
		var openings = ifcModel.filter(typeof(IfcOpeningElement))
		var flows = ifcModel.filter(typeof(IfcFlowSegment)) 
		
		val list = new ArrayList<IfcProduct>()
		
		openings.forEach[list.add(it)]
		flows.forEach[
			if(flowIsPipe(it)) 
				list.add(it)
		]
		
		ctx.put(extractModelSlot, ifcModel)
	}
}