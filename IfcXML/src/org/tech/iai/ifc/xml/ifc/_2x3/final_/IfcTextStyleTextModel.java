/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style Text Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getLetterSpacing <em>Letter Spacing</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getWordSpacing <em>Word Spacing</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getLineHeight <em>Line Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleTextModel()
 * @model extendedMetaData="name='IfcTextStyleTextModel' kind='elementOnly'"
 * @generated
 */
public interface IfcTextStyleTextModel extends Entity {
	/**
	 * Returns the value of the '<em><b>Text Indent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Indent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Indent</em>' containment reference.
	 * @see #setTextIndent(TextIndentType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleTextModel_TextIndent()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TextIndent' namespace='##targetNamespace'"
	 * @generated
	 */
	TextIndentType getTextIndent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getTextIndent <em>Text Indent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Indent</em>' containment reference.
	 * @see #getTextIndent()
	 * @generated
	 */
	void setTextIndent(TextIndentType value);

	/**
	 * Returns the value of the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align</em>' attribute.
	 * @see #setTextAlign(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleTextModel_TextAlign()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextAlignment"
	 *        extendedMetaData="kind='element' name='TextAlign' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextAlign();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align</em>' attribute.
	 * @see #getTextAlign()
	 * @generated
	 */
	void setTextAlign(String value);

	/**
	 * Returns the value of the '<em><b>Text Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Decoration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Decoration</em>' attribute.
	 * @see #setTextDecoration(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleTextModel_TextDecoration()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextDecoration"
	 *        extendedMetaData="kind='element' name='TextDecoration' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextDecoration();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Decoration</em>' attribute.
	 * @see #getTextDecoration()
	 * @generated
	 */
	void setTextDecoration(String value);

	/**
	 * Returns the value of the '<em><b>Letter Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Letter Spacing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter Spacing</em>' containment reference.
	 * @see #setLetterSpacing(LetterSpacingType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleTextModel_LetterSpacing()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LetterSpacing' namespace='##targetNamespace'"
	 * @generated
	 */
	LetterSpacingType getLetterSpacing();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getLetterSpacing <em>Letter Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter Spacing</em>' containment reference.
	 * @see #getLetterSpacing()
	 * @generated
	 */
	void setLetterSpacing(LetterSpacingType value);

	/**
	 * Returns the value of the '<em><b>Word Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Spacing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Spacing</em>' containment reference.
	 * @see #setWordSpacing(WordSpacingType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleTextModel_WordSpacing()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='WordSpacing' namespace='##targetNamespace'"
	 * @generated
	 */
	WordSpacingType getWordSpacing();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getWordSpacing <em>Word Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Spacing</em>' containment reference.
	 * @see #getWordSpacing()
	 * @generated
	 */
	void setWordSpacing(WordSpacingType value);

	/**
	 * Returns the value of the '<em><b>Text Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Transform</em>' attribute.
	 * @see #setTextTransform(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleTextModel_TextTransform()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextTransformation"
	 *        extendedMetaData="kind='element' name='TextTransform' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTextTransform();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Transform</em>' attribute.
	 * @see #getTextTransform()
	 * @generated
	 */
	void setTextTransform(String value);

	/**
	 * Returns the value of the '<em><b>Line Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Height</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Height</em>' containment reference.
	 * @see #setLineHeight(LineHeightType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleTextModel_LineHeight()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LineHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	LineHeightType getLineHeight();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleTextModel#getLineHeight <em>Line Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Height</em>' containment reference.
	 * @see #getLineHeight()
	 * @generated
	 */
	void setLineHeight(LineHeightType value);

} // IfcTextStyleTextModel
