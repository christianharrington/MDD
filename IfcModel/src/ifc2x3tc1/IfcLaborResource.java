/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Labor Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcLaborResource#getSkillSet <em>Skill Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLaborResource()
 * @model
 * @generated
 */
public interface IfcLaborResource extends IfcConstructionResource {
	/**
	 * Returns the value of the '<em><b>Skill Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Set</em>' attribute.
	 * @see #isSetSkillSet()
	 * @see #unsetSkillSet()
	 * @see #setSkillSet(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLaborResource_SkillSet()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSkillSet();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLaborResource#getSkillSet <em>Skill Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Set</em>' attribute.
	 * @see #isSetSkillSet()
	 * @see #unsetSkillSet()
	 * @see #getSkillSet()
	 * @generated
	 */
	void setSkillSet(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcLaborResource#getSkillSet <em>Skill Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSkillSet()
	 * @see #getSkillSet()
	 * @see #setSkillSet(String)
	 * @generated
	 */
	void unsetSkillSet();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcLaborResource#getSkillSet <em>Skill Set</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Skill Set</em>' attribute is set.
	 * @see #unsetSkillSet()
	 * @see #getSkillSet()
	 * @see #setSkillSet(String)
	 * @generated
	 */
	boolean isSetSkillSet();

} // IfcLaborResource
