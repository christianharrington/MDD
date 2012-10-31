
import java.util.Random;

import org.apache.log4j.Logger;
import org.bimserver.client.BimServerClient;
import org.bimserver.client.Session;
import org.bimserver.client.factories.AuthenticationInfo;
import org.bimserver.client.factories.ProtocolBuffersBimServerClientFactory;
import org.bimserver.client.factories.UsernamePasswordAuthenticationInfo;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.models.ifc2x3tc1.IfcProject;




public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{			
			//ProtocolBuffersBimServerClientFactory factory = new ProtocolBuffersBimServerClientFactory("localhost", 8020, "admin@bimserver.org", "admin");
			ProtocolBuffersBimServerClientFactory factory = new ProtocolBuffersBimServerClientFactory("localhost", 8020);
			AuthenticationInfo ai = new UsernamePasswordAuthenticationInfo("ndbl@itu.dk", "password");
			
			BimServerClient bimServerClient = factory.create(ai, "localhost");
			SProject addProject = bimServerClient.getServiceInterface().addProject("p" + new Random().nextInt());
			Session session = bimServerClient.createSession();
	
			session.startTransaction(addProject.getId());
			IfcProject ifcProject = session.create(IfcProject.class);
			ifcProject.setName("This is a test");
			long roid = session.commitTransaction("");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		/*ServiceInterface i = bimServerClient.getServiceInterface();
		Integer downloadId = i.download(roid, "Ifc2x3", true);
		SDownloadResult downloadData = bimServerClient.getServiceInterface().getDownloadData(downloadId);
		IOUtils.copy(downloadData.getFile().getInputStream(), new FileOutputStream(new File("model.ifc")));*/

	}

}

