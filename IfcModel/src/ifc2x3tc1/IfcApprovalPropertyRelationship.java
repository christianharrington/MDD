/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Approval Property Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcApprovalPropertyRelationship#getApprovedProperties <em>Approved Properties</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcApprovalPropertyRelationship#getApproval <em>Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalPropertyRelationship()
 * @model
 * @generated
 */
public interface IfcApprovalPropertyRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Approved Properties</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approved Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Properties</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalPropertyRelationship_ApprovedProperties()
	 * @model
	 * @generated
	 */
	EList<IfcProperty> getApprovedProperties();

	/**
	 * Returns the value of the '<em><b>Approval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval</em>' reference.
	 * @see #setApproval(IfcApproval)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalPropertyRelationship_Approval()
	 * @model
	 * @generated
	 */
	IfcApproval getApproval();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApprovalPropertyRelationship#getApproval <em>Approval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval</em>' reference.
	 * @see #getApproval()
	 * @generated
	 */
	void setApproval(IfcApproval value);

} // IfcApprovalPropertyRelationship
