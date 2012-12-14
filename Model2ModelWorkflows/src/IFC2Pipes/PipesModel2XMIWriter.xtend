package IFC2Pipes

import general.WorkflowComponentWithSlot
import java.util.Collections
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource$Factory$Registry
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.Model

class PipesModel2XMIWriter extends WorkflowComponentWithSlot {
	String path
	
	override invoke(IWorkflowContext ctx) {	
		println('Starting: PipesModel2XMIWriter')
		val targetModel = ctx.get(pipesModelSlot) as Model
		
		val reg = Registry::INSTANCE;
	    val Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put('xmi', new XMIResourceFactoryImpl());
		
	    val resSet = new ResourceSetImpl();
	    val resource = resSet.createResource(URI::createURI(getPath()));
	    
	    resource.contents.add(targetModel)
	    println('Target model elements: ' + targetModel.elements.size())
	    resource.save(Collections::EMPTY_MAP)
	    println('Done: PipesModel2XMIWriter')
	}
	
	def getPath() { path }
	def setPath(String path) { this.path = path }
}