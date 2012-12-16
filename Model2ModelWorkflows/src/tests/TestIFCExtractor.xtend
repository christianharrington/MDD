package tests

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import java.util.ArrayList
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWall
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct
import org.junit.Assert
import java.io.File
import org.apache.commons.io.FileUtils

class TestIFCExtractor extends WorkflowComponentWithSlot {
	var String ifcXML
	
	def private testIdAndGUID(ArrayList<? extends IfcProduct> products) {
		println('Testing IDs and GUIDs...')
		products.forEach[
			Assert::assertTrue('Product without id', !it.id.nullOrEmpty)
			Assert::assertTrue('Product without GUID', !it.globalId.nullOrEmpty)
		]
		println('Passed!')
	}
	
	def private testProducts(ArrayList<? extends IfcProduct> products, String search) {
		val size = countElements(search)
		
		println('Found ' + size + ' in file')
		
		Assert::assertEquals('Incorrect number of products', products.size, size)
		println('Passed!')
		
		testIdAndGUID(products)
	}
	
	def private countElements(String search) {
		var idx = 0;
		var count = 0;

		while(idx != -1) {
			idx = ifcXML.indexOf(search, idx + 1);
				if (idx != -1) count = count + 1
		}
		
		count
	}
	
	override invoke(IWorkflowContext ctx) {
		println('Starting: TestIFCExtractor')
		ifcXML = FileUtils::readFileToString(new File(ctx.get(IFCModelPathSlot) as String))
		
		val openings = ctx.get(openingsSlot) as ArrayList<IfcOpeningElement>
		val flowSegments = ctx.get(flowSegmentsSlot) as ArrayList<IfcFlowSegment>
		val walls = ctx.get(wallsSlot) as ArrayList<IfcWall>
		
		println('Testing openings...')
		testProducts(openings, '<IfcOpeningElement id=')
		println('Testing flow segments...')
		testProducts(flowSegments, '<IfcFlowSegment id=')
		println('Testing walls...')
		testProducts(walls, '<IfcWallStandardCase id=')
		
		println('Done: TestIFCExtractor')
	}
}