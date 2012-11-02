
import java.io.InputStream;
import java.util.Random;

import org.apache.log4j.Logger;
import org.bimserver.client.BimServerClient;
import org.bimserver.client.Session;
import org.bimserver.client.factories.AuthenticationInfo;
import org.bimserver.client.factories.ProtocolBuffersBimServerClientFactory;
import org.bimserver.client.factories.UsernamePasswordAuthenticationInfo;
import org.bimserver.interfaces.objects.SDownloadResult;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.models.ifc2x3tc1.IfcProject;
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
		InputStream in = data.getFile().getInputStream();
		int b;
		while((b = in.read()) != -1) {
		  System.out.print((char) b);
		}
	}
}