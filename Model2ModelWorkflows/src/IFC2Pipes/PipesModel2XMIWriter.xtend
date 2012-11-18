package IFC2Pipes

import general.WorkflowComponentWithSlot
import java.util.Collections
import java.util.Map
import lightast.Main
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.Resource$Factory$Registry
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.Model

class Model2XMIWriter extends WorkflowComponentWithSlot {
	
	String path
	
	def setPath(String path) { this.path = path }
	
	def getPath() { path }
	
	def private walkModel(EList<EObject> contents, EObject e) {
		if (!contents.contains(e)) {
			contents.add(e);
			for (EObject ee : e.eCrossReferences()) {
				walkModel(contents, ee);
			}
		}
	}
	
	override invoke(IWorkflowContext ctx) {	
		var targetModel = ctx.get(getSlot()) as Model
		
		var Registry reg = Registry::INSTANCE;
	    var Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
		
	    var ResourceSet resSet = new ResourceSetImpl();
	    val Resource resource = resSet.createResource(URI::createURI(getPath()));
	    
	    resource.contents.add(targetModel)
	    
	    resource.save(Collections::EMPTY_MAP)
	}
	
}