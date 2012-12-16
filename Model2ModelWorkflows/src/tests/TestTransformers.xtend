package tests

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWall
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import java.util.ArrayList
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement
import pipes.LocalPlacement
import org.junit.Assert
import java.util.HashMap
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct
import pipes.Product
import pipes.Model

class TestTransformers extends WorkflowComponentWithSlot {
	var IWorkflowContext ctx
	
	var ArrayList<IfcOpeningElement> ifcOpenings
	var ArrayList<IfcFlowSegment> ifcFlowSegments
	var ArrayList<IfcWall> ifcWalls
	
	var Model pipesModel
	
	val guid2PipesProductMap = new HashMap<String, Product>()
	
	def private testLocalPlacement(IfcLocalPlacement ifcPlacement, LocalPlacement pipesPlacement) {
		val delta = 0.00001
		
		Assert::assertNotNull('IFCPlacement is null', ifcPlacement)
		Assert::assertNotNull('Pipes Placement is null', pipesPlacement)
		
		val ifcAxis = objFromRef(ifcPlacement.relativePlacement.ifcAxis2Placement3D, ctx)
		val ifcCoordinates = objFromRef(ifcAxis.location.ifcCartesianPoint, ctx).coordinates.ifcLengthMeasure
		
		// Placement
		Assert::assertEquals('IFCPlacement does not have 3 coordinates', ifcCoordinates.size, 3)
		Assert::assertEquals('X coordinate does not match', ifcCoordinates.get(0).value, pipesPlacement.axis2placement3d.cartesianX, delta)
		Assert::assertEquals('Y coordinate does not match', ifcCoordinates.get(1).value, pipesPlacement.axis2placement3d.cartesianY, delta)
		Assert::assertEquals('Z coordinate does not match', ifcCoordinates.get(2).value, pipesPlacement.axis2placement3d.cartesianZ, delta)
		
		if (ifcAxis.axis != null && ifcAxis.refDirection != null) {
			Assert::assertNotNull('Axis must not be null', pipesPlacement.axis2placement3d.axis)
			Assert::assertNotNull('Refdirection must not be null', pipesPlacement.axis2placement3d.refDirection)
			
			// Direction
			val ifcDirection = objFromRef(ifcAxis.axis.ifcDirection, ctx).directionRatios.doubleWrapper
			
			Assert::assertEquals('IFCPlacement direction is missing axes', ifcDirection.size, 3)
			Assert::assertEquals('IFCPlacement direction X coordinate does not match', ifcDirection.get(0).value, pipesPlacement.axis2placement3d.axis.x, delta)
			Assert::assertEquals('IFCPlacement direction Y coordinate does not match', ifcDirection.get(1).value, pipesPlacement.axis2placement3d.axis.y, delta)
			Assert::assertEquals('IFCPlacement direction Z coordinate does not match', ifcDirection.get(2).value, pipesPlacement.axis2placement3d.axis.z, delta)
			
			// Ref direction
			val ifcRefDirection = objFromRef(ifcAxis.refDirection.ifcDirection, ctx).directionRatios.doubleWrapper
			Assert::assertEquals('IFCPlacement ref direction is missing axes', ifcRefDirection.size, 3)
			Assert::assertEquals('IFCPlacement ref direction X coordinate does not match', ifcRefDirection.get(0).value, pipesPlacement.axis2placement3d.refDirection.x, delta)
			Assert::assertEquals('IFCPlacement ref direction Y coordinate does not match', ifcRefDirection.get(1).value, pipesPlacement.axis2placement3d.refDirection.y, delta)
			Assert::assertEquals('IFCPlacement ref direction Z coordinate does not match', ifcRefDirection.get(2).value, pipesPlacement.axis2placement3d.refDirection.z, delta)
		}
		else {
			Assert::assertTrue('If either axis or refDirection is null, the other must also be null', ifcAxis.axis == null && ifcAxis.refDirection == null)
			Assert::assertNull('Axis must be null', pipesPlacement.axis2placement3d.axis)
			Assert::assertNull('Refdirection must be null', pipesPlacement.axis2placement3d.refDirection)
		}
	}
	
	def private testProducts(ArrayList<? extends IfcProduct> products) {
		products.forEach[
			if(!guid2PipesProductMap.containsKey(it.globalId))
			{
				println(it.globalId)
			}
			
			Assert::assertTrue('Product does not exist in Pipes model', guid2PipesProductMap.containsKey(it.globalId))
			
			val pipesOpening = guid2PipesProductMap.get(it.globalId)
			
			Assert::assertEquals('Name does not match', it.name, pipesOpening.elementName)
			Assert::assertEquals('Description does not match', it.description, pipesOpening.description)
			
			testLocalPlacement(objFromRef(it.objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx), pipesOpening.placement)
		]
		
		println('Passed!')
	}
	
	override invoke(IWorkflowContext ctx) {
		println('Starting: TestIFC2PipesTransformer')
		this.ctx = ctx
		
		ifcOpenings = ctx.get(openingsSlot) as ArrayList<IfcOpeningElement>
		ifcFlowSegments = ctx.get(flowSegmentsSlot) as ArrayList<IfcFlowSegment>
		ifcWalls = ctx.get(wallsSlot) as ArrayList<IfcWall>
		
		pipesModel = ctx.get(pipesModelSlot) as Model
		
		pipesModel.elements.forEach[
			switch it {
				Product: guid2PipesProductMap.put(it.name, it)
			}
		]
		
		println('Testing transformed openings...')
		testProducts(ifcOpenings)
		println('Testing transformed flow segments...')
		testProducts(ifcFlowSegments)
		println('Testing transformed walls...')
		testProducts(ifcWalls)
		
		println('Done: TestIFC2PipesTransformer')
	}
}