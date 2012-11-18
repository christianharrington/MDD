package LightDSL2IFC

import lightast.Lamp
import lightast.Main
import org.bimserver.ifc.IfcModel
import org.bimserver.models.ifc2x3tc1.IfcCartesianPoint
import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1FactoryImpl
import org.bimserver.plugins.serializers.IfcModelInterface
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import general.WorkflowComponentWithSlot

class LightDSL2IFCTransformer extends WorkflowComponentWithSlot {
	
	Ifc2x3tc1FactoryImpl ifcFactory
	
	def addIfcCartesianPoint(IfcModelInterface model, Lamp lamp) {
		var IfcCartesianPoint cp = ifcFactory.createIfcCartesianPoint()
		cp.coordinatesAsString.add(lamp.globalID)
		cp.coordinates.add(12.0)
		cp.coordinates.add(47.7)
		model.add(cp)
	}

	override invoke(IWorkflowContext ctx) {
		val lightModel = ctx.get(getSlot()) as lightast.Main
		
		ifcFactory = new Ifc2x3tc1FactoryImpl()
		
		val IfcModel model = new IfcModel()
		lightModel.fixtures.forEach[
			for (lamp: it.lamps) {
				addIfcCartesianPoint(model, lamp)
			}
		]
		
		ctx.put(getSlot(), model)
	}
	
}