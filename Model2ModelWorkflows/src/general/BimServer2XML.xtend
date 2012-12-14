package general

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import general.WorkflowComponentWithSlot
import org.bimserver.client.factories.ProtocolBuffersBimServerClientFactory
import org.bimserver.client.factories.UsernamePasswordAuthenticationInfo
import java.util.Scanner
import java.io.File
import java.io.FileWriter

class BimServer2XML extends WorkflowComponentWithSlot {	
	String filePath
	
	String server
	String user
	String password
	long poid
	
	override invoke(IWorkflowContext ctx) {
		println('Starting: BimServer2XML')
		// Make the connection
		val factory = new ProtocolBuffersBimServerClientFactory(server, 8020)
		val auth = new UsernamePasswordAuthenticationInfo(user, password)
			
		val bimServerClient = factory.create(auth, server)
		val i = bimServerClient.getServiceInterface()
		println('Connected to server')
			
		// Get the project
		val project = i.getProjectByPoid(poid)
		
		// Get the latest revision
		val rev = project.getLastRevisionId()
			
		// Download the data
		println('Downloading model...')
		val downloadId = bimServerClient.getServiceInterface().download(rev, "IfcXML", true, true)
		val data = bimServerClient.getServiceInterface().getDownloadData(downloadId)
		val in = data.getFile().getInputStream()
		println('Download completed')
		
		// Get the file as a string, and remove stupid XML
		val s = new Scanner(in).useDelimiter('\\A').next()
		val result = s.replaceAll('xsi:nil=\"true\"', '')
		
		// Create a file for the XML
		val File file = new File(filePath)
		//file.deleteOnExit()
		
		// Write the string to the file, and close everything
		val fw = new FileWriter(file)
		fw.write(result)
		fw.close()
		in.close()
		bimServerClient.disconnect()
		
		ctx.put(IFCModelPathSlot, file.path)
		println('Wrote IFC model to ' + file.path)
		println('Done: BimServer2XML')
	}
	
	def getFilePath() { filePath }
	def setFilePath(String filePath) { this.filePath = filePath }

	def getServer() { server }
	def setServer(String server) { this.server = server }
	
	def getUser() { user }
	def setUser(String user) { this.user = user }
	
	def getPassword() { password }
	def setPassword(String password) { this.password = password }
	
	def getPoid() { poid.toString }
	def setPoid(String poid) { this.poid = new Long(poid) }
}