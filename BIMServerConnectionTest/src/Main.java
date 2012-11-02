
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
}