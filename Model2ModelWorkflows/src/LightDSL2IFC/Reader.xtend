package LightDSL2IFC

import IFC2LightDSL.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.Resource
import java.util.Map
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource$Factory$Registry
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import lightast.LightastPackage

class Reader extends WorkflowComponentWithSlot {
	
	String path
	
	override invoke(IWorkflowContext ctx) {
		// Initialize the model
    	LightastPackage::eINSTANCE.eClass()
    
    	var Registry reg = Registry::INSTANCE
    	var Map<String, Object> m = reg.getExtensionToFactoryMap()
    	m.put("xmi", new XMIResourceFactoryImpl())

    	var ResourceSet resSet = new ResourceSetImpl()

    	var Resource resource = resSet.getResource(URI::createURI(path), true)
    	
    	ctx.put(getSlot(), resource.contents.get(0) as lightast.Main)
	}
	
}