import java.io.File;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;
import org.bimserver.client.BimServerClient;
import org.bimserver.client.factories.AuthenticationInfo;
import org.bimserver.client.factories.ProtocolBuffersBimServerClientFactory;
import org.bimserver.client.factories.UsernamePasswordAuthenticationInfo;
import org.bimserver.ifc.step.deserializer.IfcStepDeserializer;
import org.bimserver.interfaces.objects.SDownloadResult;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.models.ifc2x3tc1.IfcOrganization;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.shared.ServiceInterface;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {	
		long poid = 33399;
			
		// Make the connection
		ProtocolBuffersBimServerClientFactory factory = new ProtocolBuffersBimServerClientFactory("pillar.christianharrington.com", 8020);
		AuthenticationInfo ai = new UsernamePasswordAuthenticationInfo("cnha@itu.dk", "password");
			
		BimServerClient bimServerClient = factory.create(ai, "pillar.christianharrington.com");
		ServiceInterface i = bimServerClient.getServiceInterface();
			
		// Get the project
		SProject project = i.getProjectByPoid(poid);
		
		// Get the latest revision
		long roid = project.getLastRevisionId();
			
		// Download the data
		Integer downloadId = bimServerClient.getServiceInterface().download(roid, "Ifc2x3", true, true);
		SDownloadResult data = bimServerClient.getServiceInterface().getDownloadData(downloadId);
			
		// Print the data
		InputStream input2 = data.getFile().getInputStream();
		input2.mark(Integer.MAX_VALUE);
		int b, size = 0;
		while((b = input2.read()) != -1) {
		  System.out.print((char) b);
		  size++;
		}		
		input2.reset();

		//Parse schema for deserialization
		System.out.println("Parse schema");	
		ExpressSchemaParser schemaParser = new ExpressSchemaParser(new File("src/IFC2X3_TC1.exp"));
		schemaParser.parse();
		SchemaDefinition schema = schemaParser.getSchema();
		System.out.println("Done");

		//Create deserializer
		System.out.println("Create deserializer");
		IfcStepDeserializer isd = new IfcStepDeserializer();
		isd.init(schema);
		System.out.println("Done");
		

		IfcModelInterface ifcModel = isd.read(input2, null, false, size);
		List<IfcOrganization> orgs = ifcModel.getAll(IfcOrganization.class);
		
		for(IfcOrganization org : orgs){
		System.out.println("Org:" + org);
		}
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
		
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    Resource resource = resSet.createResource(URI
	            .createURI("/var/tmp/test.xmi"));
	    
	    for (EObject e : ifcModel) {
	    	walkModel(resource.getContents(), e);
	    }
	    
	    System.out.println(resource.getContents().size());
	    
	    resource.save(Collections.EMPTY_MAP);
	    
	    //ATL2Java atj = new ATL2Java("../bimserver-read-only/BimServer/models/models.ecore", "../m2m/models/LightAST.ecore");
	    //atj.transform("../bimserver-read-only/BimServer/models/IfcCartesianPoint.xmi", "instance.xmi", "../m2m/transformations/lamp2lamp.asm");
	    //atj.transform("/var/tmp/test.xmi", "instance.xmi", "../m2m/transformations/lamp2lamp.asm");

	    //resource.save(Collections.EMPTY_MAP);

	}
	
	private static void walkModel(EList<EObject> contents, EObject e) {
		if (!contents.contains(e)) {
			contents.add(e);
			
			System.out.println(e);
			
			for (EObject ee : e.eCrossReferences()) {
				walkModel(contents, ee);
			}
		}
	}
	
	/*
	// Write a model example. File name is hardcoded and an added IfcLightSource object
	// is added to the model to show how it can be done
	/*private void SaveModel(IfcModel model){
		//The serializer wants a ProjectInfo object
		ProjectInfo projectInfo = new ProjectInfo();
		projectInfo.setName("Group 1337");
		// projectInfo.set...

		File out = new File("our_light_output.EXP");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(out);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		// Create additional eInstance
		IfcLightSource light = Ifc2x3tc1Factory.eINSTANCE.createIfcLightSource();
		light.setAmbientIntensity(12);
		light.setName("lamp");
		
		// Generate a unique key for the new IfcLightSource, not sure
		// if there is an easier way, but here we simply find a key
		// that does not already exist.
		long key = 0;
		for (int i = 0; i < model.getObjects().size() + 1; i++) {
			if (!model.getObjects().containsKey(i)) {
				key = i;
				break;
			}
		}
		
		try {
			model.add(key, light);
		} catch (IfcModelInterfaceException e) {
			e.printStackTrace();
		}

		// The serializer only works with a PluginManager. It gets the
		// schema from there.
		// The LocalDevPluginLoader has been modified to lookup the plugins in the IfcPlugins project
		PluginManager pm = null;
		try {
			pm = LocalDevPluginLoader.createPluginManager(new File("leetFolder"));
			LocalDevPluginLoader.loadPlugins(pm);
		} catch (PluginException e) {
			e.printStackTrace();
		}

		IfcStepSerializer iss = new IfcStepSerializer();		
		try {
			// null would be an IfcEngine used for geometry (no idea how it is used)
			iss.init(model, projectInfo, pm, null);
			iss.writeToOutputStream(fos);
		} catch (SerializerException e) {
			e.printStackTrace();
		}
	}*/
}