package IFC2LightDSL

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.Iterator
import org.eclipse.emf.ecore.EObject

class IFC2LightDSLTransformer extends WorkflowComponentWithSlot {

	override invoke(IWorkflowContext ctx) {
		var Resource modelResource = ctx.get(getSlot()) as Resource
		var Iterator<EObject> modelObjects = EcoreUtil::getAllContents(modelResource, true)
		for (EObject e: modelObjects.toIterable()) {
			println(e.eClass)
		}
	}
	
}