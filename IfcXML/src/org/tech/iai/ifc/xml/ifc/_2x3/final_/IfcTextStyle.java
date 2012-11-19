/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyle#getTextCharacterAppearance <em>Text Character Appearance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyle#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyle#getTextFontStyle <em>Text Font Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyle()
 * @model extendedMetaData="name='IfcTextStyle' kind='elementOnly'"
 * @generated
 */
public interface IfcTextStyle extends IfcPresentationStyle {
	/**
	 * Returns the value of the '<em><b>Text Character Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Character Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Character Appearance</em>' containment reference.
	 * @see #setTextCharacterAppearance(TextCharacterAppearanceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyle_TextCharacterAppearance()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TextCharacterAppearance' namespace='##targetNamespace'"
	 * @generated
	 */
	TextCharacterAppearanceType getTextCharacterAppearance();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyle#getTextCharacterAppearance <em>Text Character Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Character Appearance</em>' containment reference.
	 * @see #getTextCharacterAppearance()
	 * @generated
	 */
	void setTextCharacterAppearance(TextCharacterAppearanceType value);

	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style</em>' containment reference.
	 * @see #setTextStyle(TextStyleType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyle_TextStyle()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TextStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	TextStyleType getTextStyle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyle#getTextStyle <em>Text Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Style</em>' containment reference.
	 * @see #getTextStyle()
	 * @generated
	 */
	void setTextStyle(TextStyleType value);

	/**
	 * Returns the value of the '<em><b>Text Font Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Font Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Font Style</em>' containment reference.
	 * @see #setTextFontStyle(TextFontStyleType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyle_TextFontStyle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TextFontStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	TextFontStyleType getTextFontStyle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyle#getTextFontStyle <em>Text Font Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Font Style</em>' containment reference.
	 * @see #getTextFontStyle()
	 * @generated
	 */
	void setTextFontStyle(TextFontStyleType value);

} // IfcTextStyle
