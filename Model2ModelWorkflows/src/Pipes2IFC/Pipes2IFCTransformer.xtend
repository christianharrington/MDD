package Pipes2IFC

import general.WorkflowComponentWithSlot
import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1FactoryImpl
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.bimserver.ifc.IfcModel
import pipes.Model
import pipes.Opening
import org.bimserver.models.ifc2x3tc1.IfcOpeningElement
import pipes.LocalPlacement
import com.sun.xml.internal.ws.api.pipe.Pipe
import java.util.ArrayList
import org.bimserver.emf.IdEObject
import org.bimserver.models.ifc2x3tc1.IfcRoot
import com.sun.tools.example.debug.gui.GUI
import org.bimserver.models.ifc2x3tc1.IfcProduct

class Pipes2IFCTransformer extends WorkflowComponentWithSlot {
	
	Ifc2x3tc1FactoryImpl ifcFactory
	
	def private addIfcOpening(IfcModel ifcModel, Opening pipesOpening) {
		var ifcOpening = ifcFactory.createIfcOpeningElement()
		addIfcLocalPlacement(ifcOpening, pipesOpening.placement)
		ifcModel.add(ifcOpening)
	}
	
	def private addIfcLocalPlacement(IfcOpeningElement ifcOpening, LocalPlacement pipesPlacement) { 
		var ifcLocalPlacement = ifcFactory.createIfcLocalPlacement()
		ifcOpening.objectPlacement = ifcLocalPlacement
	}
	
	def private updateIfcElement(Pipe o, IfcProduct product){
		
	}
	
	def private updateIfcElement(Opening o, IfcProduct product){
		
	}

	override invoke(IWorkflowContext ctx) {
		val pipesModel = ctx.get(pipesOpeningsSlot) as Model
		val extractedModel = ctx.get(extractModelSlot) as ArrayList<IfcProduct>
		
		pipesModel.elements.forEach[po |
			extractedModel.forEach[e |
				if(po.GUID.equals(e.globalId))
				{
					if(po instanceof Pipe)
						updateIfcElement(po as Pipe, e)
					else if(po instanceof Opening)
						updateIfcElement(po as Opening, e)
				}
			]
		]
		
		/*ifcFactory = new Ifc2x3tc1FactoryImpl()
		
		val IfcModel ifcModel = new IfcModel()
		var openings = pipesModel.elements.filter(typeof(Opening))
		
		openings.forEach[
			addIfcOpening(ifcModel, it)
		]*/
	}
}