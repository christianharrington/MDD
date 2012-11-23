package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import general.WorkflowComponentWithSlot
import org.bimserver.client.BimServerClient;
import org.bimserver.client.factories.AuthenticationInfo;
import org.bimserver.client.factories.ProtocolBuffersBimServerClientFactory;
import org.bimserver.client.factories.UsernamePasswordAuthenticationInfo;
import org.bimserver.interfaces.objects.SDownloadResult;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.shared.ServiceInterface;
import java.io.InputStream
import java.util.Scanner
import java.io.File
import java.io.FileWriter

class BimServer2XMLFileWriter extends WorkflowComponentWithSlot {
	String server
	String user
	String password
	long poid
	
	override invoke(IWorkflowContext ctx) {
		// Make the connection
		var ProtocolBuffersBimServerClientFactory factory = new ProtocolBuffersBimServerClientFactory(server, 8020)
		var AuthenticationInfo ai = new UsernamePasswordAuthenticationInfo(user, password)
			
		var BimServerClient bimServerClient = factory.create(ai, server)
		var ServiceInterface i = bimServerClient.getServiceInterface()
			
		// Get the project
		var SProject project = i.getProjectByPoid(poid)
		
		// Get the latest revision
		var long roid = project.getLastRevisionId()
			
		// Download the data
		var Integer downloadId = bimServerClient.getServiceInterface().download(roid, "IfcXML", true, true)
		var SDownloadResult data = bimServerClient.getServiceInterface().getDownloadData(downloadId)
		var InputStream in = data.getFile().getInputStream()
		
		// Get the file as a string, and remove stupid XML
		var String s = new Scanner(in).useDelimiter("\\A").next()
		var String result = s.replaceAll("xsi:nil=\"true\"", "")
		
		// Create a file for the XML
		var File file = File::createTempFile("tempIFC",".ifcxml")
		file.deleteOnExit()
		
		// Write the string to the file, and close everything
		var FileWriter fw = new FileWriter(file)
		fw.write(result)
		fw.close()
		in.close()
		bimServerClient.disconnect()
		
		ctx.put('fileSlot', file.path)
	}
	
	def getServer() { server }
	def setServer(String server) { this.server = server }
	
	def getUser() { user }
	def setUser(String user) { this.user = user }
	
	def getPassword() { password }
	def setPassword(String password) { this.password = password }
	
	def getPoid() { poid.toString }
	def setPoid(String poid) { this.poid = new Long(poid) }
}