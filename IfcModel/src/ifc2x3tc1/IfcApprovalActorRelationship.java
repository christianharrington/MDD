/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Approval Actor Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcApprovalActorRelationship#getActor <em>Actor</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcApprovalActorRelationship#getApproval <em>Approval</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcApprovalActorRelationship#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalActorRelationship()
 * @model
 * @generated
 */
public interface IfcApprovalActorRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(IfcActorSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalActorRelationship_Actor()
	 * @model
	 * @generated
	 */
	IfcActorSelect getActor();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApprovalActorRelationship#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Approval</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcApproval#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval</em>' reference.
	 * @see #setApproval(IfcApproval)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalActorRelationship_Approval()
	 * @see ifc2x3tc1.IfcApproval#getActors
	 * @model opposite="Actors"
	 * @generated
	 */
	IfcApproval getApproval();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApprovalActorRelationship#getApproval <em>Approval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval</em>' reference.
	 * @see #getApproval()
	 * @generated
	 */
	void setApproval(IfcApproval value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(IfcActorRole)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalActorRelationship_Role()
	 * @model
	 * @generated
	 */
	IfcActorRole getRole();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApprovalActorRelationship#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(IfcActorRole value);

} // IfcApprovalActorRelationship
