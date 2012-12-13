package Pipes2IFC

import general.WorkflowComponentWithSlot
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianPoint
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirection
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct
import java.util.ArrayList
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity

class EntityXMLWriter extends WorkflowComponentWithSlot {
	override invoke(IWorkflowContext ctx) {
		val model = ctx.get(newElementsSlot) as ArrayList<Entity>
		
		var String xml = ""
		
		for(e : model) {
			switch e {
				IfcLocalPlacement: {
					xml = xml + "  <_1:IfcLocalPlacement" + if (e.id != null) { "> id=\"" + e.id + "\"" } + ">" +
					if (e.placementRelTo != null) { "    <_1:PlacementRelTo><_1:IfcLocalPlacement ref=\"" + e.placementRelTo.ifcObjectPlacement.ref + "\"/></_1:PlacementRelTo>" } +
					if (e.relativePlacement != null) { "  <_1:RelativePlacement><_1:IfcAxis2Placement3D ref=\"" + e.relativePlacement.ifcAxis2Placement3D.ref + "\"/></_1:RelativePlacement>" } +
					"  </_1:IfcLocalPlacement>"
				}
				IfcAxis2Placement3D: {
					xml = xml + "  <_1:IfcAxis2Placement3D" + if (e.id != null) { "> id=\"" + e.id + "\"" } + ">" +
					if (e.location != null) { "    <_1:Location><_1:IfcCartesianPoint ref=\"" + e.location.ifcCartesianPoint.ref + "\"/></_1:Location>" } +
      				if (e.axis != null) { "    <_1:Axis><_1:IfcDirection ref=\"" + e.axis.ifcDirection.ref + "\"/></_1:Axis>" } +
      				if (e.refDirection != null) { "    <_1:RefDirection><_1:IfcDirection ref=\"" + e.refDirection.ifcDirection.ref + "\"/></_1:RefDirection>" } + 
      				"  </_1:IfcAxis2Placement3D>"
				}
				IfcCartesianPoint: {
					xml = xml + "  <_1:IfcCartesianPoint" + if (e.id != null) { "> id=\"" + e.id + "\"" } + ">" +
      				"<_1:Coordinates>
					<_1:IfcLengthMeasure>" + e.coordinates.ifcLengthMeasure.get(0).value + "</_1:IfcLengthMeasure>
					<_1:IfcLengthMeasure>" + e.coordinates.ifcLengthMeasure.get(1).value + "</_1:IfcLengthMeasure>
        			<_1:IfcLengthMeasure>" + e.coordinates.ifcLengthMeasure.get(2).value + "</_1:IfcLengthMeasure>
     				</_1:Coordinates>
    				</_1:IfcCartesianPoint>"
				}
				IfcDirection: {
					xml = xml + "  <_1:IfcDirection" + if (e.id != null) { "> id=\"" + e.id + "\"" } + ">" +
      				"<_1:DirectionRatios>
					<double-wrapper>" + if (e.directionRatios.doubleWrapper.get(0).value != null) { e.directionRatios.doubleWrapper.get(0).value } else { "0.0" } + "</double-wrapper>
					<double-wrapper>" + if (e.directionRatios.doubleWrapper.get(1).value != null) { e.directionRatios.doubleWrapper.get(1).value } else { "0.0" } + "</double-wrapper>
        			<double-wrapper>" + if (e.directionRatios.doubleWrapper.get(2).value != null) { e.directionRatios.doubleWrapper.get(2).value } else { "0.0" } + "</double-wrapper>
     				</_1:DirectionRatios>
    				</_1:IfcDirection>"
				}
				IfcProduct: {
					xml = xml + "  <_1:IfcOpeningElement" + if (e.id != null) { "> id=\"" + e.id + "\"" } + ">" +
					if (e.globalId != null) { "<_1:GlobalId>" + e.globalId + "</_1:GlobalId>" } +
	  				if (e.ownerHistory != null) {"<_1:OwnerHistory><_1:IfcOwnerHistory ref=\"" + e.ownerHistory.ifcOwnerHistory.ref + "\"/></_1:OwnerHistory>"} +
	  				if (e.objectType != null) { "<_1:ObjectType>" + e.objectType + "</_1:ObjectType>" } +
	  				if (e.name != null) { "<_1:Name>" + e.name + "</_1:Name>" } + 
	  				if (e.description != null) { "<_1:Description>" + e.description + "</_1:Description>" } +
	  				if (e.objectPlacement != null) { "<_1:ObjectPlacement><_1:IfcLocalPlacement ref=\"" + e.objectPlacement.ifcObjectPlacement.ref + "\"/></_1:ObjectPlacement>" } +
	  				if (e.representation != null) { "<_1:Representation><_1:IfcProductDefinitionShape ref=\"" + e.representation.ifcProductRepresentation.ref + "\"/></_1:Representation>" } +
					"</_1:IfcOpeningElement>"
				}
			}
		}
		
		ctx.put(newElementsXMLSlot, xml)
	}
}