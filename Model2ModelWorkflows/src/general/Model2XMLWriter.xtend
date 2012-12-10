package general

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class Model2XMLWriter extends WorkflowComponentWithSlot {
	
	String path
	
	def getPath() { path }
	
	def setPath(String path) { this.path = path }
	
	override invoke(IWorkflowContext ctx) {
		println("Starting: Model2XMLWriter")
		var Resource resource = ctx.get(mainModelSlot) as Resource
		resource.setURI(URI::createFileURI(path))
		
		var Map options = new HashMap<String, Object>()
        options.put(XMLResource::OPTION_ENCODING, "UTF-8")
        options.put(XMLResource::OPTION_XML_VERSION, "1.0")
        options.put(XMLResource::OPTION_EXTENDED_META_DATA, Boolean::TRUE)    
        resource.save(options)
        println("Done: Model2XMLWriter")
	}
	
}