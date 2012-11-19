package ifc.test;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		CommonPackage commonPackage = CommonPackageImpl.eINSTANCE;
		FinalPackage finalPackage = FinalPackageImpl.eINSTANCE;
		
		// add file extension to registry
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap().put("ifcxml", new FinalResourceFactoryImpl());
		
		// register the packages loaded from XSD
		EPackage.Registry.INSTANCE.put(commonPackage.getNsURI(), commonPackage);
		EPackage.Registry.INSTANCE.put(finalPackage.getNsURI(), finalPackage);
		
		commonPackage.setEFactoryInstance(new CommonFactoryImpl());
		finalPackage.setEFactoryInstance(new FinalFactoryImpl());
		
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		
		ResourceSet resourceSet = new ResourceSetImpl();		
		Resource resource = resourceSet.getResource(URI.createFileURI("/Users/christian/Dropbox/ITU/1. semester/MDD/IFC/Test.ifcxml"), true);
		resource.load(options);
		
		TreeIterator<EObject> it = resource.getContents().get(0).eAllContents();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
