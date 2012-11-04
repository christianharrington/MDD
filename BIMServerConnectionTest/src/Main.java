
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.bimserver.client.BimServerClient;
import org.bimserver.client.Session;
import org.bimserver.client.factories.AuthenticationInfo;
import org.bimserver.client.factories.ProtocolBuffersBimServerClientFactory;
import org.bimserver.client.factories.UsernamePasswordAuthenticationInfo;
import org.bimserver.ifc.step.deserializer.IfcStepDeserializer;
import org.bimserver.interfaces.objects.SDownloadResult;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.models.ifc2x3tc1.IfcOrganization;
import org.bimserver.models.ifc2x3tc1.IfcProject;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.emf.*;

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
		ExpressSchemaParser schemaParser = new ExpressSchemaParser(new File("//Users//ndahl89//Dropbox//ITU//Master//mdd//Project//mdd//BIMServerConnectionTest//src//IFC2X3_TC1.exp"));
		schemaParser.parse();
		SchemaDefinition schema = schemaParser.getSchema();
		System.out.println("Done");

		//Create deserializer
		System.out.println("Create deserializer");
		IfcStepDeserializer isd = new IfcStepDeserializer();
		isd.init(schema);
		System.out.println("Done");

		try {
		IfcModelInterface ifcModel = isd.read(input2, null, false, size);
		List<IfcOrganization> orgs = ifcModel.getAll(IfcOrganization.class);
		for(IfcOrganization org : orgs){
		System.out.println("Org:" + org);
		}
		} catch (DeserializeException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		}
	}
	
	// Write a model example. File name is hardcoded and an added IfcLightSource object
	// is added to the model to show how it can be done
	private void SaveModel(IfcModel model){
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
	}
}