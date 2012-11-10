/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssignsToActor#getRelatingActor <em>Relating Actor</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelAssignsToActor#getActingRole <em>Acting Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToActor()
 * @model
 * @generated
 */
public interface IfcRelAssignsToActor extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Actor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcActor#getIsActingUpon <em>Is Acting Upon</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Actor</em>' reference.
	 * @see #setRelatingActor(IfcActor)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToActor_RelatingActor()
	 * @see ifc2x3tc1.IfcActor#getIsActingUpon
	 * @model opposite="IsActingUpon"
	 * @generated
	 */
	IfcActor getRelatingActor();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssignsToActor#getRelatingActor <em>Relating Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Actor</em>' reference.
	 * @see #getRelatingActor()
	 * @generated
	 */
	void setRelatingActor(IfcActor value);

	/**
	 * Returns the value of the '<em><b>Acting Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acting Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acting Role</em>' reference.
	 * @see #isSetActingRole()
	 * @see #unsetActingRole()
	 * @see #setActingRole(IfcActorRole)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToActor_ActingRole()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcActorRole getActingRole();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssignsToActor#getActingRole <em>Acting Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acting Role</em>' reference.
	 * @see #isSetActingRole()
	 * @see #unsetActingRole()
	 * @see #getActingRole()
	 * @generated
	 */
	void setActingRole(IfcActorRole value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRelAssignsToActor#getActingRole <em>Acting Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActingRole()
	 * @see #getActingRole()
	 * @see #setActingRole(IfcActorRole)
	 * @generated
	 */
	void unsetActingRole();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRelAssignsToActor#getActingRole <em>Acting Role</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acting Role</em>' reference is set.
	 * @see #unsetActingRole()
	 * @see #getActingRole()
	 * @see #setActingRole(IfcActorRole)
	 * @generated
	 */
	boolean isSetActingRole();

} // IfcRelAssignsToActor
