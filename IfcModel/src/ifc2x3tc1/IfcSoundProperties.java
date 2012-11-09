/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sound Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSoundProperties#getIsAttenuating <em>Is Attenuating</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSoundProperties#getSoundValues <em>Sound Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSoundProperties()
 * @model
 * @generated
 */
public interface IfcSoundProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Is Attenuating</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attenuating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attenuating</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setIsAttenuating(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSoundProperties_IsAttenuating()
	 * @model
	 * @generated
	 */
	Tristate getIsAttenuating();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSoundProperties#getIsAttenuating <em>Is Attenuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attenuating</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getIsAttenuating()
	 * @generated
	 */
	void setIsAttenuating(Tristate value);

	/**
	 * Returns the value of the '<em><b>Sound Scale</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcSoundScaleEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Scale</em>' attribute.
	 * @see ifc2x3tc1.IfcSoundScaleEnum
	 * @see #isSetSoundScale()
	 * @see #unsetSoundScale()
	 * @see #setSoundScale(IfcSoundScaleEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSoundProperties_SoundScale()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSoundScaleEnum getSoundScale();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Scale</em>' attribute.
	 * @see ifc2x3tc1.IfcSoundScaleEnum
	 * @see #isSetSoundScale()
	 * @see #unsetSoundScale()
	 * @see #getSoundScale()
	 * @generated
	 */
	void setSoundScale(IfcSoundScaleEnum value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoundScale()
	 * @see #getSoundScale()
	 * @see #setSoundScale(IfcSoundScaleEnum)
	 * @generated
	 */
	void unsetSoundScale();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSoundProperties#getSoundScale <em>Sound Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sound Scale</em>' attribute is set.
	 * @see #unsetSoundScale()
	 * @see #getSoundScale()
	 * @see #setSoundScale(IfcSoundScaleEnum)
	 * @generated
	 */
	boolean isSetSoundScale();

	/**
	 * Returns the value of the '<em><b>Sound Values</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcSoundValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Values</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSoundProperties_SoundValues()
	 * @model
	 * @generated
	 */
	EList<IfcSoundValue> getSoundValues();

} // IfcSoundProperties
