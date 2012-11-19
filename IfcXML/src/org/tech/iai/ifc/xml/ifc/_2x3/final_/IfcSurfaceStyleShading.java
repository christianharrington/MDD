/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Shading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleShading()
 * @model extendedMetaData="name='IfcSurfaceStyleShading' kind='elementOnly'"
 * @generated
 */
public interface IfcSurfaceStyleShading extends Entity {
	/**
	 * Returns the value of the '<em><b>Surface Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Colour</em>' containment reference.
	 * @see #setSurfaceColour(SurfaceColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleShading_SurfaceColour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SurfaceColour' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfaceColourType getSurfaceColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Colour</em>' containment reference.
	 * @see #getSurfaceColour()
	 * @generated
	 */
	void setSurfaceColour(SurfaceColourType value);

} // IfcSurfaceStyleShading
