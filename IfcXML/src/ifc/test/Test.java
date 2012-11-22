package ifc.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.DanglingHREFException;
import org.eclipse.emf.ecore.xmi.NameInfo;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLMap;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonFactoryImpl;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328TypeImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.Uos;
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalFactoryImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalPackageImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.util.FinalResourceFactoryImpl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.util.FinalResourceImpl;

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
		
		FinalResourceFactoryImpl resourceFactory = new FinalResourceFactoryImpl();
		FinalResourceImpl resource = (FinalResourceImpl) resourceFactory.createResource(URI.createFileURI("/Users/Thomas/Dropbox/MDD/IFC/Output.ifcxml"));
		resource.load(options);
		
		
		TreeIterator<EObject> it = resource.getContents().get(0).eAllContents();
		int i = 0;
		while(it.hasNext()) {
			EObject next = it.next();
			if (i < 5) {
				System.out.println(i + ": " + next);
			}
			i++;
		}

		resource.setURI(URI.createFileURI("/Users/Thomas/Dropbox/MDD/IFC/Output2.ifcxml"));
		options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        options.put(XMLResource.OPTION_XML_VERSION, "1.0");
        resource.save(options);
        //new XMLProcessor().save(System.err, resource, options);
	}
}