package Pipes2IFC

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.bimserver.client.factories.ProtocolBuffersBimServerClientFactory
import org.bimserver.client.factories.UsernamePasswordAuthenticationInfo
import java.io.File
import javax.activation.DataHandler
import javax.activation.FileDataSource

class XML2BimServer extends WorkflowComponentWithSlot {
	String filePath
	
	String server
	String user
	String password
	long poid
	
	override invoke(IWorkflowContext arg0) {
		println('Starting: XML2BimServer')
		// Make the connection
		val factory = new ProtocolBuffersBimServerClientFactory(server, 8020)
		val auth = new UsernamePasswordAuthenticationInfo(user, password)
			
		val bimServerClient = factory.create(auth, server)
		val i = bimServerClient.getServiceInterface()
		println('Connected to server')
		
		val file = new File(filePath)
		val dataHandler = new DataHandler(new FileDataSource(file))
		
		println('Uploading...')
		i.checkin(poid, 'New version', 'IfcXmlDeserializer', file.length, dataHandler, false, false)
		println('Upload complete')
		println('Done: XML2BimServer')
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