package Pipes2IFC

import general.WorkflowComponentWithSlot
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.Resource$Factory$Registry
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.Model
import pipes.PipesPackage

class PipesXMI2ModelReader extends WorkflowComponentWithSlot {
	
	String path
	
	def getPath() { path }
	def setPath(String path) { this.path = path }
	
	override invoke(IWorkflowContext ctx) {
		// Initialize the model
    	PipesPackage::eINSTANCE.eClass()
    
    	var Registry reg = Registry::INSTANCE
    	var Map<String, Object> m = reg.getExtensionToFactoryMap()
    	m.put("xmi", new XMIResourceFactoryImpl())

    	var ResourceSet resSet = new ResourceSetImpl()

    	var Resource resource = resSet.getResource(URI::createURI(path), true)
    	
    	ctx.put(getSlot(), resource.contents.get(0) as Model)
	}
	
}