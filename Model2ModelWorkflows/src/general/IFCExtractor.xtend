package general
 
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashMap
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity
import java.util.ArrayList
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWall
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct

class IFCExtractor extends WorkflowComponentWithSlot {	
	private var highestId = 0
		
	override invoke(IWorkflowContext ctx) {
		println('Starting: IFCPipesOpeningsExtractor')
		
		val ifcResource = ctx.get(IFCModelSlot) as Resource
		
		val openings = new ArrayList<IfcOpeningElement>()
		val flowSegments = new ArrayList<IfcFlowSegment>()
		val walls = new ArrayList<IfcWall>()
		
		val id2EntityMap = new HashMap<String, Entity>()
		val guid2ProductMap = new HashMap<String, IfcProduct>()
		
		ifcResource.contents.get(0).eAllContents.forEach[
			switch it {
				Entity: {
					// If the object has an ID it is an entity not a ref, add it to our map
					if (!it.id.nullOrEmpty) {
						id2EntityMap.put(it.id, it)
						
						val id = Integer::parseInt(it.id.substring(1))
						if (id > highestId) highestId = id 
						
						switch it {
							IfcProduct: {
								if (!it.globalId.nullOrEmpty) guid2ProductMap.put(it.globalId, it)
								
								switch it {
									IfcOpeningElement: openings.add(it)
									IfcFlowSegment: flowSegments.add(it)
									IfcWall: walls.add(it)
								}
							}
						}
					}
				}
			}
		]
		
		WorkflowComponentWithSlot::setHighestId(highestId)
		
		println('Extracted... \nOpenings: ' + openings.size + '\nFlow segments: ' + flowSegments.size() + '\nWalls: ' + walls.size())

		ctx.put(openingsSlot, openings)
		ctx.put(flowSegmentsSlot, flowSegments)
		ctx.put(wallsSlot, walls)
		ctx.put(id2EntityMapSlot, id2EntityMap)
		ctx.put(guid2ProductMapSlot, guid2ProductMap)
		println('Done: IFCPipesOpeningsExtractor')
	}
}
