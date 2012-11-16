package IFC2LightDSL

import lightast.LightFixture
import lightast.LightFixtureType
import lightast.impl.LightastFactoryImpl
import org.bimserver.ifc.IfcModel
import org.bimserver.models.ifc2x3tc1.IfcCartesianPoint
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext

class IFC2LightDSLTransformer extends WorkflowComponentWithSlot {
	
	LightastFactoryImpl lightFactory
	
	def addLightFixture(lightast.Main m, String fixtureAsString) {
		val lightFixture = lightFactory.createLightFixture()
		lightFixture.setPredefinedType(LightFixtureType::getByName(fixtureAsString))
		m.fixtures.add(lightFixture)
	}
	
	def addLamp(LightFixture lif, IfcCartesianPoint cp) {
		val lamp = lightFactory.createLamp()
		lamp.globalID = cp.getRid().toString()
		/*cp.coordinatesAsString.forEach[	
				lamp.globalID = lamp.globalID + it + ", "
		]*/
		lif.lamps.add(lamp)
		
	}

	override invoke(IWorkflowContext ctx) {
		val IfcModel model = ctx.get(getSlot()) as IfcModel
		
		lightFactory = new LightastFactoryImpl()
		var lightModel = lightFactory.createMain()
		addLightFixture(lightModel, "POINTSOURCE")
		for (f: lightModel.fixtures) {
			model.forEach[
				if(it instanceof IfcCartesianPoint) {
					addLamp(f, it as IfcCartesianPoint)
				}	
			]			
		}
		ctx.put(getSlot(), lightModel)
		
//		var Iterator<EObject> modelObjects = EcoreUtil::getAllContents(modelResource, true)
//		for (EObject e: modelObjects.toIterable()) {
//			println(e.eClass)
//		}
	}
	
}