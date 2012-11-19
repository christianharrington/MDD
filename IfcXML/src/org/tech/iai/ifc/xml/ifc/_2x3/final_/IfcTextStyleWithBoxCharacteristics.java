/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style With Box Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getCharacterSpacing <em>Character Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleWithBoxCharacteristics()
 * @model extendedMetaData="name='IfcTextStyleWithBoxCharacteristics' kind='elementOnly'"
 * @generated
 */
public interface IfcTextStyleWithBoxCharacteristics extends Entity {
	/**
	 * Returns the value of the '<em><b>Box Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Height</em>' attribute.
	 * @see #setBoxHeight(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleWithBoxCharacteristics_BoxHeight()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='BoxHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getBoxHeight();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getBoxHeight <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Height</em>' attribute.
	 * @see #getBoxHeight()
	 * @generated
	 */
	void setBoxHeight(Double value);

	/**
	 * Returns the value of the '<em><b>Box Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Width</em>' attribute.
	 * @see #setBoxWidth(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleWithBoxCharacteristics_BoxWidth()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='BoxWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getBoxWidth();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getBoxWidth <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Width</em>' attribute.
	 * @see #getBoxWidth()
	 * @generated
	 */
	void setBoxWidth(Double value);

	/**
	 * Returns the value of the '<em><b>Box Slant Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Slant Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Slant Angle</em>' attribute.
	 * @see #setBoxSlantAngle(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleWithBoxCharacteristics_BoxSlantAngle()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlaneAngleMeasureObject"
	 *        extendedMetaData="kind='element' name='BoxSlantAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getBoxSlantAngle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getBoxSlantAngle <em>Box Slant Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Slant Angle</em>' attribute.
	 * @see #getBoxSlantAngle()
	 * @generated
	 */
	void setBoxSlantAngle(Double value);

	/**
	 * Returns the value of the '<em><b>Box Rotate Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Rotate Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Rotate Angle</em>' attribute.
	 * @see #setBoxRotateAngle(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleWithBoxCharacteristics_BoxRotateAngle()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlaneAngleMeasureObject"
	 *        extendedMetaData="kind='element' name='BoxRotateAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getBoxRotateAngle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getBoxRotateAngle <em>Box Rotate Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Rotate Angle</em>' attribute.
	 * @see #getBoxRotateAngle()
	 * @generated
	 */
	void setBoxRotateAngle(Double value);

	/**
	 * Returns the value of the '<em><b>Character Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Spacing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Spacing</em>' containment reference.
	 * @see #setCharacterSpacing(CharacterSpacingType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleWithBoxCharacteristics_CharacterSpacing()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CharacterSpacing' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterSpacingType getCharacterSpacing();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleWithBoxCharacteristics#getCharacterSpacing <em>Character Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Spacing</em>' containment reference.
	 * @see #getCharacterSpacing()
	 * @generated
	 */
	void setCharacterSpacing(CharacterSpacingType value);

} // IfcTextStyleWithBoxCharacteristics
