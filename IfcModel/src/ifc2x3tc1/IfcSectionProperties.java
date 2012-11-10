/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Section Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSectionProperties#getSectionType <em>Section Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSectionProperties#getStartProfile <em>Start Profile</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSectionProperties#getEndProfile <em>End Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSectionProperties()
 * @model
 * @generated
 */
public interface IfcSectionProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Section Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcSectionTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Type</em>' attribute.
	 * @see ifc2x3tc1.IfcSectionTypeEnum
	 * @see #setSectionType(IfcSectionTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSectionProperties_SectionType()
	 * @model
	 * @generated
	 */
	IfcSectionTypeEnum getSectionType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSectionProperties#getSectionType <em>Section Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Type</em>' attribute.
	 * @see ifc2x3tc1.IfcSectionTypeEnum
	 * @see #getSectionType()
	 * @generated
	 */
	void setSectionType(IfcSectionTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Start Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Profile</em>' reference.
	 * @see #setStartProfile(IfcProfileDef)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSectionProperties_StartProfile()
	 * @model
	 * @generated
	 */
	IfcProfileDef getStartProfile();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSectionProperties#getStartProfile <em>Start Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Profile</em>' reference.
	 * @see #getStartProfile()
	 * @generated
	 */
	void setStartProfile(IfcProfileDef value);

	/**
	 * Returns the value of the '<em><b>End Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Profile</em>' reference.
	 * @see #isSetEndProfile()
	 * @see #unsetEndProfile()
	 * @see #setEndProfile(IfcProfileDef)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSectionProperties_EndProfile()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcProfileDef getEndProfile();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSectionProperties#getEndProfile <em>End Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Profile</em>' reference.
	 * @see #isSetEndProfile()
	 * @see #unsetEndProfile()
	 * @see #getEndProfile()
	 * @generated
	 */
	void setEndProfile(IfcProfileDef value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSectionProperties#getEndProfile <em>End Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndProfile()
	 * @see #getEndProfile()
	 * @see #setEndProfile(IfcProfileDef)
	 * @generated
	 */
	void unsetEndProfile();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSectionProperties#getEndProfile <em>End Profile</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Profile</em>' reference is set.
	 * @see #unsetEndProfile()
	 * @see #getEndProfile()
	 * @see #setEndProfile(IfcProfileDef)
	 * @generated
	 */
	boolean isSetEndProfile();

} // IfcSectionProperties
