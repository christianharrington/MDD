/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Approval Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcApprovalRelationship#getRelatedApproval <em>Related Approval</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcApprovalRelationship#getRelatingApproval <em>Relating Approval</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcApprovalRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcApprovalRelationship#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalRelationship()
 * @model
 * @generated
 */
public interface IfcApprovalRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Related Approval</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcApproval#getIsRelatedWith <em>Is Related With</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Approval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Approval</em>' reference.
	 * @see #setRelatedApproval(IfcApproval)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalRelationship_RelatedApproval()
	 * @see ifc2x3tc1.IfcApproval#getIsRelatedWith
	 * @model opposite="IsRelatedWith"
	 * @generated
	 */
	IfcApproval getRelatedApproval();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApprovalRelationship#getRelatedApproval <em>Related Approval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Approval</em>' reference.
	 * @see #getRelatedApproval()
	 * @generated
	 */
	void setRelatedApproval(IfcApproval value);

	/**
	 * Returns the value of the '<em><b>Relating Approval</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcApproval#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Approval</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Approval</em>' reference.
	 * @see #setRelatingApproval(IfcApproval)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalRelationship_RelatingApproval()
	 * @see ifc2x3tc1.IfcApproval#getRelates
	 * @model opposite="Relates"
	 * @generated
	 */
	IfcApproval getRelatingApproval();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApprovalRelationship#getRelatingApproval <em>Relating Approval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Approval</em>' reference.
	 * @see #getRelatingApproval()
	 * @generated
	 */
	void setRelatingApproval(IfcApproval value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalRelationship_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApprovalRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcApprovalRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcApprovalRelationship#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcApprovalRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcApprovalRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IfcApprovalRelationship
