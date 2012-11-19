/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Character Appearance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TextCharacterAppearanceType#getIfcTextStyleForDefinedFont <em>Ifc Text Style For Defined Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTextCharacterAppearanceType()
 * @model extendedMetaData="name='TextCharacterAppearance_._type' kind='elementOnly'"
 * @generated
 */
public interface TextCharacterAppearanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Text Style For Defined Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Text Style For Defined Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Text Style For Defined Font</em>' containment reference.
	 * @see #setIfcTextStyleForDefinedFont(IfcTextStyleForDefinedFont)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTextCharacterAppearanceType_IfcTextStyleForDefinedFont()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcTextStyleForDefinedFont' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcTextStyleForDefinedFont getIfcTextStyleForDefinedFont();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TextCharacterAppearanceType#getIfcTextStyleForDefinedFont <em>Ifc Text Style For Defined Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Text Style For Defined Font</em>' containment reference.
	 * @see #getIfcTextStyleForDefinedFont()
	 * @generated
	 */
	void setIfcTextStyleForDefinedFont(IfcTextStyleForDefinedFont value);

} // TextCharacterAppearanceType
