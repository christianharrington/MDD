package IfcIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.bimserver.LocalDevPluginLoader;
import org.bimserver.client.BimServerClient;
import org.bimserver.client.factories.AuthenticationInfo;
import org.bimserver.client.factories.ProtocolBuffersBimServerClientFactory;
import org.bimserver.client.factories.UsernamePasswordAuthenticationInfo;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.step.deserializer.IfcStepDeserializer;
import org.bimserver.ifc.step.serializer.IfcStepSerializer;
import org.bimserver.interfaces.objects.SDownloadResult;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Factory;
import org.bimserver.models.ifc2x3tc1.IfcLightSource;
import org.bimserver.models.ifc2x3tc1.IfcOrganization;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.shared.ServiceInterface;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("unused")
public class IfcReader {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {	


	}

	public static Resource ReadModel(String path, String schemaPath) throws IOException, DeserializeException{
	//	long poid = 33399;

		// Make the connection
		//		ProtocolBuffersBimServerClientFactory factory = new ProtocolBuffersBimServerClientFactory("pillar.christianharrington.com", 8020);
		//		AuthenticationInfo ai = new UsernamePasswordAuthenticationInfo("cnha@itu.dk", "password");
		//			
		//		BimServerClient bimServerClient = factory.create(ai, "pillar.christianharrington.com");
		//		ServiceInterface i = bimServerClient.getServiceInterface();
		//			
		//		// Get the project
		//		SProject project = i.getProjectByPoid(poid);
		//		
		//		// Get the latest revision
		//		long roid = project.getLastRevisionId();
		//			
		//		// Download the data
		//		Integer downloadId = bimServerClient.getServiceInterface().download(roid, "Ifc2x3", true, true);
		//		SDownloadResult data = bimServerClient.getServiceInterface().getDownloadData(downloadId);
		//			
		//		// Print the data
		//		InputStream input2 = data.getFile().getInputStream();
		//		input2.mark(Integer.MAX_VALUE);
		//		int b, size = 0;
		//		while((b = input2.read()) != -1) {
		//		  System.out.print((char) b);
		//		  size++;
		//		}		
		//		input2.reset();
		FileInputStream fis = new FileInputStream(new File(path));		
//		fis.mark(Integer.MAX_VALUE);
//		int b, size = 0;
//		while((b = fis.read()) != -1) {
//			System.out.print((char) b);
//			size++;
//		}		
//		fis.reset();

		//Parse schema for deserialization
		System.out.println("Parse schema");	
		ExpressSchemaParser schemaParser = new ExpressSchemaParser(new File(schemaPath));
		schemaParser.parse();
		SchemaDefinition schema = schemaParser.getSchema();
		System.out.println("Done");

		//Create deserializer
		System.out.println("Create deserializer");
		IfcStepDeserializer isd = new IfcStepDeserializer();
		isd.init(schema);
		System.out.println("Done");

		IfcModelInterface ifcModel = isd.read(fis, null, false, 99999);
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

		//return (IfcModel) ifcModel;
		return resource;
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
}