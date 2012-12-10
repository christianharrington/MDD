package Pipes2IFC

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

import org.eclipse.emf.common.util.URI
import pipes.Model
import org.xtext.pipes.PipesStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource

class Pipes2ModelReader extends WorkflowComponentWithSlot {
	
	String path
	
	def getPath() { path }
	def setPath(String path) { this.path = path }
	
	override invoke(IWorkflowContext ctx) {
	
		// Initialize the model	
		//new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../")
		print("Starting .pipes model loading")
		
		var injector = new PipesStandaloneSetup().createInjectorAndDoEMFRegistration()
		var resourceSet = injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource::OPTION_RESOLVE_ALL, Boolean::TRUE)

		//or use "platform:/resource/org.xtext.pipes/src/example.pipes"
		var resource = resourceSet.getResource(
		    URI::createURI(path), true);
		var model = resource.getContents().get(0) as Model;
		
		print("Done .pipes model loading")
		
		ctx.put(pipesOpeningsSlot, model)
	}
}