package IFC2Pipes

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import pipes.impl.PipesFactoryImpl
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

class IFC2PipesTransformer extends WorkflowComponentWithSlot {
	
	PipesFactoryImpl pipesFactory
	
	/*
	 addXXX(targetModelElement e1, sourceModelElement e2)
	 * create new targetModelElements with factory
	 */
	 
	def private addOpening(Model pipesModel, IfcOpeningElement ifcOpening, IWorkflowContext ctx) {
		var Opening op = pipesFactory.createOpening()
		op.name = ifcOpening.name
		op.description = ifcOpening.description
		var placement = ifcOpening.objectPlacement.ifcObjectPlacement as IfcLocalPlacement
		println(op)
		println(placement.relativePlacement == null)
		addLocalPlacement(op, placement, ctx)
		
		pipesModel.elements.add(op)
	}
	
	def private addFlowSegment(Model pipesModel, IfcFlowSegment ifcFlowSegment, IWorkflowContext ctx) {
		var FlowSegment fs = pipesFactory.createFlowSegment()
		fs.name = ifcFlowSegment.name
		fs.description = ifcFlowSegment.description
		val placement = objFromRef(ifcFlowSegment.objectPlacement.ifcObjectPlacement as IfcLocalPlacement, ctx)
		addLocalPlacement(fs, placement, ctx)		
		pipesModel.elements.add(fs)
	}
	
	def private addLocalPlacement(Product product, IfcLocalPlacement ifcLocalPlacement, IWorkflowContext ctx) {
	    val float = 0 as float
		var LocalPlacement lp = pipesFactory.createLocalPlacement()
		var Axis2Placement3D axis = pipesFactory.createAxis2Placement3D
		var Direction axisDir = pipesFactory.createDirection
		var Direction refDir = pipesFactory.createDirection
		println("relativePlacement is null: " + (null == ifcLocalPlacement.relativePlacement))
		var IfcAxis2Placement3D ifcAxis = objFromRef(ifcLocalPlacement.relativePlacement.ifcAxis2Placement3D, ctx)
		
		//var IfcCartesianPoint loc = ifcAxis.location.ifcCartesianPoint
		
		//Coordibates are X,Y,Z http://www.buildingsmart-tech.org/ifc/IFC2x3/TC1/html/ifcgeometryresource/lexical/ifccartesianpoint.htm
		//if(loc.coordinates.ifcLengthMeasure.size != 3){
		//	println("Non 3D cartesian point for local placement. Count " + loc.coordinates.ifcLengthMeasure.size)
		//	System::exit(1)
		//}
		//axis.cartesianX = (float)loc.coordinates.ifcLengthMeasure.get(0)
		//axis.cartesianY = (float)loc.coordinates.ifcLengthMeasure.get(1)
		//axis.cartesianZ = (float)loc.coordinates.ifcLengthMeasure.get(2)
		
		//If Axis and/or RefDirection is omitted, these directions are taken from the geometric coordinate system.
		//We add these if they are there. If any is missing we treat it as undefined - documentation only states the above
		if(ifcAxis.axis.ifcDirection.directionRatios.arraySize == 3){		
			axisDir.x = (float)ifcAxis.axis.ifcDirection.directionRatios.doubleWrapper.get(0)
			axisDir.y = (float)ifcAxis.axis.ifcDirection.directionRatios.doubleWrapper.get(1)
			axisDir.z = (float)ifcAxis.axis.ifcDirection.directionRatios.doubleWrapper.get(2)
		}
		
		if(ifcAxis.refDirection.ifcDirection.directionRatios.arraySize == 3){		
			refDir.x = (float)ifcAxis.refDirection.ifcDirection.directionRatios.doubleWrapper.get(0)
			refDir.y = (float)ifcAxis.refDirection.ifcDirection.directionRatios.doubleWrapper.get(1)
			refDir.z = (float)ifcAxis.refDirection.ifcDirection.directionRatios.doubleWrapper.get(2)
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