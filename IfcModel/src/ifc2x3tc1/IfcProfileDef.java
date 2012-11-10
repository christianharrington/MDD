/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcProfileDef#getProfileType <em>Profile Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProfileDef#getProfileName <em>Profile Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProfileDef()
 * @model
 * @generated
 */
public interface IfcProfileDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcProfileTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Type</em>' attribute.
	 * @see ifc2x3tc1.IfcProfileTypeEnum
	 * @see #setProfileType(IfcProfileTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProfileDef_ProfileType()
	 * @model
	 * @generated
	 */
	IfcProfileTypeEnum getProfileType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProfileDef#getProfileType <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Type</em>' attribute.
	 * @see ifc2x3tc1.IfcProfileTypeEnum
	 * @see #getProfileType()
	 * @generated
	 */
	void setProfileType(IfcProfileTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Name</em>' attribute.
	 * @see #isSetProfileName()
	 * @see #unsetProfileName()
	 * @see #setProfileName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProfileDef_ProfileName()
	 * @model unsettable="true"
	 * @generated
	 */
	String getProfileName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProfileDef#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Name</em>' attribute.
	 * @see #isSetProfileName()
	 * @see #unsetProfileName()
	 * @see #getProfileName()
	 * @generated
	 */
	void setProfileName(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProfileDef#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileName()
	 * @see #getProfileName()
	 * @see #setProfileName(String)
	 * @generated
	 */
	void unsetProfileName();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProfileDef#getProfileName <em>Profile Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Name</em>' attribute is set.
	 * @see #unsetProfileName()
	 * @see #getProfileName()
	 * @see #setProfileName(String)
	 * @generated
	 */
	boolean isSetProfileName();

} // IfcProfileDef
