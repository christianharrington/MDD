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
		val s = new StringBuilder()
		
		for(e : model) {
			switch e {
				IfcLocalPlacement: {
					s.append("  <_1:IfcLocalPlacement" + (if (e.id != null) { " id=\"" + e.id + "\"" } else { "" }) + ">\n")
					s.append(if (e.placementRelTo != null) "    <_1:PlacementRelTo><_1:IfcLocalPlacement ref=\"" + e.placementRelTo.ifcObjectPlacement.ref + "\"/></_1:PlacementRelTo>\n" else "")
					s.append(if (e.relativePlacement != null) "  <_1:RelativePlacement><_1:IfcAxis2Placement3D ref=\"" + e.relativePlacement.ifcAxis2Placement3D.ref + "\"/></_1:RelativePlacement>\n" else "")
					s.append("  </_1:IfcLocalPlacement>\n")
				}
				IfcAxis2Placement3D: {
					s.append("  <_1:IfcAxis2Placement3D" + (if (e.id != null) { " id=\"" + e.id + "\"" } else { "" }) + ">\n")
					s.append(if (e.location != null) "    <_1:Location><_1:IfcCartesianPoint ref=\"" + e.location.ifcCartesianPoint.ref + "\"/></_1:Location>\n" else "")
      				s.append(if (e.axis != null) "    <_1:Axis><_1:IfcDirection ref=\"" + e.axis.ifcDirection.ref + "\"/></_1:Axis>\n" else "")
      				s.append(if (e.refDirection != null) "    <_1:RefDirection><_1:IfcDirection ref=\"" + e.refDirection.ifcDirection.ref + "\"/></_1:RefDirection>\n" else "")
      				s.append("  </_1:IfcAxis2Placement3D>\n")
				}
				IfcCartesianPoint: {
					s.append("  <_1:IfcCartesianPoint" + (if (e.id != null) { " id=\"" + e.id + "\"" } else { "" }) + ">\n")
      				s.append("    <_1:Coordinates>\n")
					s.append("      <_1:IfcLengthMeasure>" + e.coordinates.ifcLengthMeasure.get(0).value + "</_1:IfcLengthMeasure>\n")
					s.append("      <_1:IfcLengthMeasure>" + e.coordinates.ifcLengthMeasure.get(1).value + "</_1:IfcLengthMeasure>\n")
        			s.append("      <_1:IfcLengthMeasure>" + e.coordinates.ifcLengthMeasure.get(2).value + "</_1:IfcLengthMeasure>\n")
     				s.append("    </_1:Coordinates>\n")
    				s.append("  </_1:IfcCartesianPoint>\n")
				}
				IfcDirection: {
					s.append("  <_1:IfcDirection" + (if (e.id != null) { " id=\"" + e.id + "\"" }) + ">\n")
      				s.append("    <_1:DirectionRatios>\n")
      				val drs = e.directionRatios.doubleWrapper.map[
      					d|"      <double-wrapper>" + (if (d != null) d.value else {"0.0"}) + "</double-wrapper>\n"
      				].toString
      				s.append(drs.substring(1, drs.length - 1).replace(",", ""))
					s.append("    </_1:DirectionRatios>\n")
    				s.append("  </_1:IfcDirection>\n")
				}
				IfcProduct: {
					s.append("  <_1:IfcOpeningElement" + (if (e.id != null) { " id=\"" + e.id + "\"" } else { "" }) + ">\n")
					s.append(if (e.globalId != null) "    <_1:GlobalId>" + e.globalId + "</_1:GlobalId>\n" else "") 
	  				s.append(if (e.ownerHistory != null) "    <_1:OwnerHistory><_1:IfcOwnerHistory ref=\"" + e.ownerHistory.ifcOwnerHistory.ref + "\"/></_1:OwnerHistory>\n" else "")
	  				s.append(if (e.objectType != null) "    <_1:ObjectType>" + e.objectType + "</_1:ObjectType>\n" else "")
	  				s.append(if (e.name != null) "    <_1:Name>" + e.name + "</_1:Name>\n" else "")
	  				s.append(if (e.description != null) "    <_1:Description>" + e.description + "</_1:Description>\n" else "")
	  				s.append(if (e.objectPlacement.ifcObjectPlacement != null) "    <_1:ObjectPlacement><_1:IfcLocalPlacement ref=\"" + e.objectPlacement.ifcObjectPlacement.ref + "\"/></_1:ObjectPlacement>\n" else "")
	  				s.append(if (e.representation != null) "    <_1:Representation><_1:IfcProductDefinitionShape ref=\"" + e.representation.ifcProductRepresentation.ref + "\"/></_1:Representation>\n" else "")
					s.append("  </_1:IfcOpeningElement>\n")
				}
			}
		}
		
		ctx.put(newElementsXMLSlot, s.toString)
	}
}