package IFC2Pipes

import pipes.impl.PipesFactoryImpl
import general.InvalidIFCException
import general.WorkflowComponentWithSlot
import java.util.ArrayList
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.Model
import pipes.Opening
import pipes.FlowSegment
import pipes.Product
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement
import org.eclipse.xtext.xbase.lib.BooleanExtensions
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianPoint
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWall
import pipes.Wall

class IFC2PipesTransformer extends WorkflowComponentWithSlot {
	PipesFactoryImpl pipesFactory
	
	// Openings
	def private addOpening(Model pipesModel, IfcOpeningElement ifcOpening, IWorkflowContext ctx) {
		val op = createOpening(ifcOpening)
		
		val placement = objFromRef(ifcOpening.objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)
		addLocalPlacement(op, placement, ctx)
	
		pipesModel.elements.add(op)
	}
	
	def private Opening create op: pipesFactory.createOpening() createOpening(IfcOpeningElement ifcOpening) {
		op.elementName = ifcOpening.name
		op.name = ifcOpening.globalId
		op.description = ifcOpening.description		
	}
	
	// Flow segments
	def private addFlowSegment(Model pipesModel, IfcFlowSegment ifcFlowSegment, IWorkflowContext ctx) {
		val fs = createFlowSegment(ifcFlowSegment)	
		
		val placement = objFromRef(ifcFlowSegment.objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)
		addLocalPlacement(fs, placement, ctx)		
		
		pipesModel.elements.add(fs)
	}
	
	def private FlowSegment create fs: pipesFactory.createFlowSegment() createFlowSegment(IfcFlowSegment ifcFlowSegment) {
		fs.elementName = ifcFlowSegment.name
		fs.name = ifcFlowSegment.globalId
		fs.description = ifcFlowSegment.description		
	}
	
	// Walls
	def private addWall(Model pipesModel, IfcWall ifcWall, IWorkflowContext ctx) {
		val Wall w = createWall(ifcWall)
		
		val placement = objFromRef(ifcWall.objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)
		addLocalPlacement(w, placement, ctx)		
		
		pipesModel.elements.add(w)
	}
	
	def private Wall create w: pipesFactory.createWall() createWall(IfcWall ifcWall) {
		w.elementName = ifcWall.name
		w.name = ifcWall.globalId
		w.description = ifcWall.description
	}
	
	// Local placements
	def private addLocalPlacement(Product product, IfcLocalPlacement ifcLocalPlacement, IWorkflowContext ctx) {
		val lp = pipesFactory.createLocalPlacement()
		val axis = pipesFactory.createAxis2Placement3D()
		val axisDir = pipesFactory.createDirection()
		val refDir = pipesFactory.createDirection()
		
		val ifcAxis = objFromRef(ifcLocalPlacement.relativePlacement.ifcAxis2Placement3D, ctx)
		
		val loc = objFromRef(ifcAxis.location.ifcCartesianPoint as IfcCartesianPoint, ctx)
		
		//Coordinates are X,Y,Z http://www.buildingsmart-tech.org/ifc/IFC2x3/TC1/html/ifcgeometryresource/lexical/ifccartesianpoint.htm
		if(loc.coordinates.ifcLengthMeasure.size != 3){
			throw new InvalidIFCException("Non 3D cartesian point for local placement. Count " + loc.coordinates.ifcLengthMeasure.size)
		}
		axis.cartesianX = loc.coordinates.ifcLengthMeasure.get(0).value
		axis.cartesianY = loc.coordinates.ifcLengthMeasure.get(1).value
		axis.cartesianZ = loc.coordinates.ifcLengthMeasure.get(2).value
		
		//If Axis and/or RefDirection is omitted, these directions are taken from the geometric coordinate system.
		//We add these if they are there. If any is missing we treat it as undefined - documentation only states the above
		
		if(ifcAxis.axis != null && ifcAxis.refDirection != null) {
			val ifcDirection = objFromRef(ifcAxis.axis.ifcDirection, ctx)
			val refDirection = objFromRef(ifcAxis.refDirection.ifcDirection, ctx)
			
			if(ifcDirection.directionRatios.doubleWrapper.size == 3){		
				axisDir.x = ifcDirection.directionRatios.doubleWrapper.get(0).value
				axisDir.y = ifcDirection.directionRatios.doubleWrapper.get(1).value
				axisDir.z = ifcDirection.directionRatios.doubleWrapper.get(2).value
			}
			
			if(refDirection.directionRatios.doubleWrapper.size == 3){		
				refDir.x = refDirection.directionRatios.doubleWrapper.get(0).value
				refDir.y = refDirection.directionRatios.doubleWrapper.get(1).value
				refDir.z = refDirection.directionRatios.doubleWrapper.get(2).value
			}
		}
		else if (BooleanExtensions::xor(ifcAxis.axis == null, ifcAxis.refDirection == null)) {
			throw new InvalidIFCException("Both the axis and the ref direction must be set");
		}
		
		axis.axis = axisDir
		axis.refDirection = refDir
		lp.axis2placement3d = axis
		
		product.placement = lp;
	}

	override invoke(IWorkflowContext ctx) {
		println('Starting: IFC2PipesTransformer')
		// Get openings and flow segments from the context
		val openings = ctx.get(openingsSlot) as ArrayList<IfcOpeningElement>
		val flowSegments = ctx.get(flowSegmentsSlot) as ArrayList<IfcFlowSegment>
		val walls = ctx.get(wallsSlot) as ArrayList<IfcWall>
		
		// Creates a pipe factory, iterates through openings and flow segments to transforms them
		pipesFactory = new PipesFactoryImpl()
		val pipesModel = pipesFactory.createModel()
		
		println("Openings: " + openings.size())
		openings.forEach[
			addOpening(pipesModel, it, ctx)
		]
		
		println("Flow segments: " + flowSegments.size())
		flowSegments.forEach[
			addFlowSegment(pipesModel, it, ctx)
		]
		
		println("Walls: " + walls.size())
		walls.forEach[
			addWall(pipesModel, it, ctx)
		]
		
		ctx.put(pipesModelSlot, pipesModel)
		println('Done: IFC2PipesTransformer')
	}
}