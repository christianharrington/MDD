/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style With Textures</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleWithTextures#getTextures <em>Textures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleWithTextures()
 * @model extendedMetaData="name='IfcSurfaceStyleWithTextures' kind='elementOnly'"
 * @generated
 */
public interface IfcSurfaceStyleWithTextures extends Entity {
	/**
	 * Returns the value of the '<em><b>Textures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textures</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textures</em>' containment reference.
	 * @see #setTextures(TexturesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleWithTextures_Textures()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Textures' namespace='##targetNamespace'"
	 * @generated
	 */
	TexturesType getTextures();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleWithTextures#getTextures <em>Textures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textures</em>' containment reference.
	 * @see #getTextures()
	 * @generated
	 */
	void setTextures(TexturesType value);

} // IfcSurfaceStyleWithTextures
