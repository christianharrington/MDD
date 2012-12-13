package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import general.WorkflowComponentWithSlot
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonFactoryImpl;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalFactoryImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalPackageImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.util.FinalResourceFactoryImpl;

class IFC2ModelReader extends WorkflowComponentWithSlot {	
	String file
	
	override invoke(IWorkflowContext ctx) {
		println("Starting: IFC2ModelReader")
		val CommonPackage commonPackage = CommonPackageImpl::eINSTANCE
		val FinalPackage finalPackage = FinalPackageImpl::eINSTANCE
		
		// add file extension to registry
		ResourceFactoryRegistryImpl::INSTANCE.getExtensionToFactoryMap().put("ifcxml", new FinalResourceFactoryImpl())
		
		// register the packages
		EPackage$Registry::INSTANCE.put(commonPackage.getNsURI(), commonPackage)
		EPackage$Registry::INSTANCE.put(finalPackage.getNsURI(), finalPackage)
		
		commonPackage.setEFactoryInstance(new CommonFactoryImpl())
		finalPackage.setEFactoryInstance(new FinalFactoryImpl())
		
		val resFactory = new FinalResourceFactoryImpl()
		//val Resource resource = resourceSet.getResource(URI::createFileURI(ctx.get(getFile()) as String), true)
		val XMLResource resource = resFactory.createResource(URI::createFileURI(file)) as XMLResource
		val options = resource.getDefaultLoadOptions()
		options.put(XMLResource::OPTION_ENCODING, "UTF-8")
		
		resource.load(options)
		
		ctx.put(mainModelSlot, resource)
		println("Done: IFC2ModelReader")
	}
	
	def getFile() { file }	
	def setFile(String file) { this.file = file  }
}
	
