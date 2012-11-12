package IFC2LightDSL

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.Iterator
import org.eclipse.emf.ecore.EObject
import org.bimserver.ifc.IfcModel
import org.bimserver.models.ifc2x3tc1.IfcOrganization

class IFC2LightDSLTransformer extends WorkflowComponentWithSlot {

	override invoke(IWorkflowContext ctx) {
		var IfcModel model = ctx.get(getSlot()) as IfcModel
		model.forEach[
			if(it instanceof IfcOrganization){
				println(it)
				print("found")
				}				
		]
		ctx.put(getSlot(), model)
		
//		var Iterator<EObject> modelObjects = EcoreUtil::getAllContents(modelResource, true)
//		for (EObject e: modelObjects.toIterable()) {
//			println(e.eClass)
//		}
	}
	
}