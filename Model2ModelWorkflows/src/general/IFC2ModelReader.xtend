package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import general.WorkflowComponentWithSlot
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonFactoryImpl;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalFactoryImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalPackageImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.util.FinalResourceFactoryImpl;
import java.util.HashMap
import java.util.Map

class IFC2ModelReader extends WorkflowComponentWithSlot {
	
	String file
	String schema
	
	override invoke(IWorkflowContext ctx) {
		//ctx.put(mainModelSlot, IfcReader::ReadModel(getFile(), getSchema()))
		var CommonPackage commonPackage = CommonPackageImpl::eINSTANCE
		var FinalPackage finalPackage = FinalPackageImpl::eINSTANCE
		
		// add file extension to registry
		ResourceFactoryRegistryImpl::INSTANCE.getExtensionToFactoryMap().put("ifcxml", new FinalResourceFactoryImpl())
		
		// register the packages
		EPackage$Registry::INSTANCE.put(commonPackage.getNsURI(), commonPackage)
		EPackage$Registry::INSTANCE.put(finalPackage.getNsURI(), finalPackage)
		
		commonPackage.setEFactoryInstance(new CommonFactoryImpl())
		finalPackage.setEFactoryInstance(new FinalFactoryImpl())
		
		var Map<String, Object> options = new HashMap<String, Object>()
		options.put(XMLResource::OPTION_EXTENDED_META_DATA, Boolean::TRUE)
		options.put(XMLResource::OPTION_ENCODING, "UTF-8")
		
		var ResourceSet resourceSet = new ResourceSetImpl()
		var Resource resource = resourceSet.getResource(URI::createFileURI(getFile()), true)
		resource.load(options)
		
		ctx.put(mainModelSlot, resource)
	}
	
	def getFile() { file }	
	def setFile(String file) { this.file = file  }
	
	def getSchema() { schema }	
	def setSchema(String schema) { this.schema = schema  }
}
	
