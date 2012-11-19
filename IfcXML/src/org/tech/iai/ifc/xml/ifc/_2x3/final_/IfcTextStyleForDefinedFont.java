/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style For Defined Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleForDefinedFont#getColour <em>Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleForDefinedFont#getBackgroundColour <em>Background Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleForDefinedFont()
 * @model extendedMetaData="name='IfcTextStyleForDefinedFont' kind='elementOnly'"
 * @generated
 */
public interface IfcTextStyleForDefinedFont extends Entity {
	/**
	 * Returns the value of the '<em><b>Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour</em>' containment reference.
	 * @see #setColour(ColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleForDefinedFont_Colour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Colour' namespace='##targetNamespace'"
	 * @generated
	 */
	ColourType getColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleForDefinedFont#getColour <em>Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour</em>' containment reference.
	 * @see #getColour()
	 * @generated
	 */
	void setColour(ColourType value);

	/**
	 * Returns the value of the '<em><b>Background Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Colour</em>' containment reference.
	 * @see #setBackgroundColour(BackgroundColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleForDefinedFont_BackgroundColour()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BackgroundColour' namespace='##targetNamespace'"
	 * @generated
	 */
	BackgroundColourType getBackgroundColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleForDefinedFont#getBackgroundColour <em>Background Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Colour</em>' containment reference.
	 * @see #getBackgroundColour()
	 * @generated
	 */
	void setBackgroundColour(BackgroundColourType value);

} // IfcTextStyleForDefinedFont
