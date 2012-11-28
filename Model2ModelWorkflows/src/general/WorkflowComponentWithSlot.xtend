package general

import java.util.HashMap
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity

abstract class WorkflowComponentWithSlot implements IWorkflowComponent {
	val String fileSlot = 'file' // The path to the XML file
	val String pipesOpeningsSlot = 'pipesOpenings' //Pipes DSL object graph
	val String mainModelSlot = 'mainModel' //IFC main model object graph
	val String openingsSlot = 'openings'
	val String flowSegmentsSlot = 'flowSegments'
	val String entityMapSlot = 'entityMap'


	def getFileSlot() { fileSlot }
	
	def getPipesOpeningsSlot() { pipesOpeningsSlot }

	def getMainModelSlot() { mainModelSlot }
	
	def getOpeningsSlot() { openingsSlot }
	
	def getFlowSegmentsSlot() { flowSegmentsSlot }
	
	def getEntityMapSlot() { entityMapSlot }
	
	override postInvoke() {	}
	
	override preInvoke() { }
		
	def <T extends Entity> T objFromRef(T refObject, IWorkflowContext ctx) {
		if (refObject.id != null && refObject.ref == null) return refObject
		else if (refObject.ref != null) {
			val entityMap = ctx.get(entityMapSlot) as HashMap<String, Entity>
			entityMap.get(refObject.ref) as T
		}
		else {
			throw new InvalidEntityException("Both id and ref is null for entity " + refObject)
		}		
	}
	
}
