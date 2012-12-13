package general

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalFactoryImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalPackageImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.util.FinalResourceFactoryImpl;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage
import general.WorkflowComponentWithSlot
import org.eclipse.emf.ecore.EPackage;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonFactoryImpl;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl;

class Model2XMLWriter extends WorkflowComponentWithSlot {
	
	String path
	
	def getPath() { path }
	
	def setPath(String path) { this.path = path }
	
	override invoke(IWorkflowContext ctx) {
		println("Starting: Model2XMLWriter")
		
		val CommonPackage commonPackage = CommonPackageImpl::eINSTANCE
		val FinalPackage finalPackage = FinalPackageImpl::eINSTANCE
		
		// add file extension to registry
		ResourceFactoryRegistryImpl::INSTANCE.getExtensionToFactoryMap().put("ifcxml", new FinalResourceFactoryImpl())
		
		// register the packages
		EPackage$Registry::INSTANCE.put(commonPackage.getNsURI(), commonPackage)
		EPackage$Registry::INSTANCE.put(finalPackage.getNsURI(), finalPackage)
		
		commonPackage.setEFactoryInstance(new CommonFactoryImpl())
		finalPackage.setEFactoryInstance(new FinalFactoryImpl())
		
		//val Resource resource = resourceSet.getResource(URI::createFileURI(ctx.get(getFile()) as String), true)
		val XMLResource resource = ctx.get(mainModelSlot) as XMLResource
		resource.setURI(URI::createFileURI(path))
		val options = resource.getDefaultSaveOptions()
		options.put(XMLResource::OPTION_ENCODING, "UTF-8")
		
		resource.save(options)
		
        println("Done: Model2XMLWriter")
	}
	
}