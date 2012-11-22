/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sound Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundProperties#getIsAttenuating <em>Is Attenuating</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundProperties#getSoundValues <em>Sound Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSoundProperties()
 * @model extendedMetaData="name='IfcSoundProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcSoundProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Is Attenuating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attenuating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attenuating</em>' attribute.
	 * @see #setIsAttenuating(Boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSoundProperties_IsAttenuating()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoolean" required="true"
	 *        extendedMetaData="kind='element' name='IsAttenuating' namespace='##targetNamespace'"
	 * @generated
	 */
	Boolean getIsAttenuating();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundProperties#getIsAttenuating <em>Is Attenuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attenuating</em>' attribute.
	 * @see #getIsAttenuating()
	 * @generated
	 */
	void setIsAttenuating(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sound Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Scale</em>' attribute.
	 * @see #setSoundScale(IfcSoundScaleEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSoundProperties_SoundScale()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundScaleEnumObject"
	 *        extendedMetaData="kind='element' name='SoundScale' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSoundScaleEnum getSoundScale();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Scale</em>' attribute.
	 * @see #getSoundScale()
	 * @generated
	 */
	void setSoundScale(IfcSoundScaleEnum value);

	/**
	 * Returns the value of the '<em><b>Sound Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Values</em>' containment reference.
	 * @see #setSoundValues(SoundValuesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSoundProperties_SoundValues()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SoundValues' namespace='##targetNamespace'"
	 * @generated
	 */
	SoundValuesType getSoundValues();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundProperties#getSoundValues <em>Sound Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Values</em>' containment reference.
	 * @see #getSoundValues()
	 * @generated
	 */
	void setSoundValues(SoundValuesType value);

} // IfcSoundProperties
