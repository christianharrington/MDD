package general

import java.util.HashMap
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity

abstract class WorkflowComponentWithSlot implements IWorkflowComponent {
	val pipesModelSlot = 'pipesModel' //Pipes DSL object graph
	val ifcModelSlot = 'ifcModel' //IFC model object graph
	val ifcModelPathSlot = 'ifcModelPath' // The path to the XML file containing the IFC model
	
	// The extracted openings, flow segments and walls
	val openingsSlot = 'openings'
	val flowSegmentsSlot = 'flowSegments'
	val wallsSlot = 'walls'
	
	// Map from ids & guids
	val id2EntityMapSlot = 'id2EntityMap'
	val guid2ProductMapSlot = 'guid2ProductMap'
	
	val newEntitiesSlot = 'newEntities' // New entities that will be added to the model
	val newEntitiesXMLSlot = 'newEntitiesXML' // The XML string that represents the above entities
	
	private static var int highestId = 0
	
	def getPipesModelSlot() { pipesModelSlot }

	def getIFCModelSlot() { ifcModelSlot }
	
	def getIFCModelPathSlot() { ifcModelPathSlot }
	
	def getOpeningsSlot() { openingsSlot }
	
	def getFlowSegmentsSlot() { flowSegmentsSlot }
	
	def getWallsSlot() { wallsSlot }
	
	def getId2EntityMapSlot() { id2EntityMapSlot }
	
	def getGuid2ProductMapSlot() { guid2ProductMapSlot }
	
	def getNewEntitiesSlot() { newEntitiesSlot }
	
	def getNewEntitiesXMLSlot() { newEntitiesXMLSlot }
	
	def getHighestIdSlot() { highestIdSlot }

	override postInvoke() {	}
	
	override preInvoke() { }
		
	def <T extends Entity> T objFromRef(T refObject, IWorkflowContext ctx) {
		if (refObject.id != null && refObject.ref == null) return refObject
		else if (refObject.ref != null) {
			val entityMap = ctx.get(id2EntityMapSlot) as HashMap<String, Entity>
			entityMap.get(refObject.ref) as T
		}
		else {
			throw new InvalidEntityException("Both id and ref is null for entity " + refObject)
		}		
	}
	
	def static setHighestId(int id) {
		highestId = id
	}
	
	def static getNewId() {
		highestId = highestId + 1
		val s = "i" + highestId
		s
	}
}
