package LightDSL2IFC

import IFC2LightDSL.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.bimserver.ifc.IfcModel
import lightast.Lamp
import org.bimserver.plugins.serializers.IfcModelInterface
import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1FactoryImpl
import org.bimserver.models.ifc2x3tc1.IfcCartesianPoint

class LightDSL2IFCTransformer extends WorkflowComponentWithSlot {
	
	Ifc2x3tc1FactoryImpl ifcFactory
	
	def addIfcCartesianPoint(IfcModelInterface model, Lamp lamp) {
		var IfcCartesianPoint cp = ifcFactory.createIfcCartesianPoint()
		cp.coordinatesAsString.add(lamp.globalID)
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