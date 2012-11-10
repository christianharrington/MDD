/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcProfileProperties#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProfileProperties#getProfileDefinition <em>Profile Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProfileProperties()
 * @model
 * @generated
 */
public interface IfcProfileProperties extends EObject {
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProfileProperties_ProfileName()
	 * @model unsettable="true"
	 * @generated
	 */
	String getProfileName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProfileProperties#getProfileName <em>Profile Name</em>}' attribute.
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
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProfileProperties#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileName()
	 * @see #getProfileName()
	 * @see #setProfileName(String)
	 * @generated
	 */
	void unsetProfileName();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProfileProperties#getProfileName <em>Profile Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Name</em>' attribute is set.
	 * @see #unsetProfileName()
	 * @see #getProfileName()
	 * @see #setProfileName(String)
	 * @generated
	 */
	boolean isSetProfileName();

	/**
	 * Returns the value of the '<em><b>Profile Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Definition</em>' reference.
	 * @see #isSetProfileDefinition()
	 * @see #unsetProfileDefinition()
	 * @see #setProfileDefinition(IfcProfileDef)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProfileProperties_ProfileDefinition()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcProfileDef getProfileDefinition();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProfileProperties#getProfileDefinition <em>Profile Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Definition</em>' reference.
	 * @see #isSetProfileDefinition()
	 * @see #unsetProfileDefinition()
	 * @see #getProfileDefinition()
	 * @generated
	 */
	void setProfileDefinition(IfcProfileDef value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProfileProperties#getProfileDefinition <em>Profile Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileDefinition()
	 * @see #getProfileDefinition()
	 * @see #setProfileDefinition(IfcProfileDef)
	 * @generated
	 */
	void unsetProfileDefinition();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProfileProperties#getProfileDefinition <em>Profile Definition</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Definition</em>' reference is set.
	 * @see #unsetProfileDefinition()
	 * @see #getProfileDefinition()
	 * @see #setProfileDefinition(IfcProfileDef)
	 * @generated
	 */
	boolean isSetProfileDefinition();

} // IfcProfileProperties
