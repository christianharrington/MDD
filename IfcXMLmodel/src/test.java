import java.io.IOException;
import java.io.StringReader;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;
import org.xml.sax.InputSource;

class Test {
	public static void main(String[] args) {
		// generate EPackages from schemas
		XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
		Collection<EObject> generatedPackages = xsdEcoreBuilder.generate(URI.createURI("/Users/Thomas/Dropbox/MDD/IFC/IFC2X3.xsd"));

		// register the packages loaded from XSD
		for (EObject generatedEObject : generatedPackages) {
		    if (generatedEObject instanceof EPackage) {
		        EPackage generatedPackage = (EPackage) generatedEObject;
		        EPackage.Registry.INSTANCE.put(generatedPackage.getNsURI(),
		            generatedPackage);
		    }
		}

		// add file extension to registry
		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap()
		    .put("ifcxml", new GenericXMLResourceFactoryImpl());
		
		//ResourceSet resourceSet = new ResourceSetImpl();
		//resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ifcxml", new GenericXMLResourceFactoryImpl());
		//resourceSet.getPackageRegistry().put("http://www.eclipse.org/uml2/2.0.0/UML", UMLPackage.eINSTANCE);
		//Resource r = resourceSet.getResource(URI.createURI("/Users/Thomas/Dropbox/MDD/IFC/Test.ifcxml"),true);
		//EObject root = (EObject) r.getContents().get(0);
		
        XMLResource resource = new XMLResourceImpl();
        InputSource source = new InputSource(new StringReader("/Users/Thomas/Desktop/test.ifcxml"));
        try {
			resource.load(source, Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        EObject root = (EObject) resource.getContents().get(0);
	}
}