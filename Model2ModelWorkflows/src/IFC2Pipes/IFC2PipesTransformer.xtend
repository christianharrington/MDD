package IFC2Pipes

import pipes.impl.PipesFactoryImpl
import general.InvalidIFCException
import general.WorkflowComponentWithSlot
import java.util.ArrayList
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.Model
import pipes.Opening
import pipes.LocalPlacement
import pipes.FlowSegment
import pipes.Product
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFlowSegment
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D
import java.util.ArrayList
import pipes.Axis2Placement3D
import pipes.Direction
import general.InvalidIFCException
import org.eclipse.xtext.xbase.lib.BooleanExtensions
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianPoint

class IFC2PipesTransformer extends WorkflowComponentWithSlot {
	
	PipesFactoryImpl pipesFactory
	
	/*
	 addXXX(targetModelElement e1, sourceModelElement e2)
	 * create new targetModelElements with factory
	 */
	 
	def private addOpening(Model pipesModel, IfcOpeningElement ifcOpening, IWorkflowContext ctx) {
		val Opening op = pipesFactory.createOpening()
		op.elementName = ifcOpening.name
		op.name = ifcOpening.globalId
		op.description = ifcOpening.description
		
		val placement = objFromRef(ifcOpening.objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)
		addLocalPlacement(op, placement, ctx)
	
		pipesModel.elements.add(op)
	}
	
	def private addFlowSegment(Model pipesModel, IfcFlowSegment ifcFlowSegment, IWorkflowContext ctx) {
		val FlowSegment fs = pipesFactory.createFlowSegment()
		fs.elementName = ifcFlowSegment.name
		fs.name = ifcFlowSegment.globalId
		fs.description = ifcFlowSegment.description
		
		val placement = objFromRef(ifcFlowSegment.objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)
		addLocalPlacement(fs, placement, ctx)		
		
		pipesModel.elements.add(fs)
	}
	
	def private addLocalPlacement(Product product, IfcLocalPlacement ifcLocalPlacement, IWorkflowContext ctx) {
		val LocalPlacement lp = pipesFactory.createLocalPlacement()
		val Axis2Placement3D axis = pipesFactory.createAxis2Placement3D
		val Direction axisDir = pipesFactory.createDirection
		val Direction refDir = pipesFactory.createDirection
		
		val IfcAxis2Placement3D ifcAxis = objFromRef(ifcLocalPlacement.relativePlacement.ifcAxis2Placement3D, ctx)
		
		val IfcCartesianPoint loc = objFromRef(ifcAxis.location.ifcCartesianPoint as IfcCartesianPoint, ctx)
		
		//Coordinates are X,Y,Z http://www.buildingsmart-tech.org/ifc/IFC2x3/TC1/html/ifcgeometryresource/lexical/ifccartesianpoint.htm
		if(loc.coordinates.ifcLengthMeasure.size != 3){
			println("Non 3D cartesian point for local placement. Count " + loc.coordinates.ifcLengthMeasure.size)
			System::exit(1)
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
	
	//def private addDirection(Axis2Placement3D a2p, )

	override invoke(IWorkflowContext ctx) {
		println("Starting: IFC2PipesTransformer")
		// Get openings and flow segments from the context
		val openings = ctx.get(openingsSlot) as ArrayList<IfcOpeningElement>
		val flowSegments = ctx.get(flowSegmentsSlot) as ArrayList<IfcFlowSegment>
		
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
		
		ctx.put(pipesOpeningsSlot, pipesModel)
		println("Done: IFC2PipesTransformer")
	}
}