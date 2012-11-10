/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralConnection#getConnectsStructuralMembers <em>Connects Structural Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralConnection()
 * @model
 * @generated
 */
public interface IfcStructuralConnection extends IfcStructuralItem {
	/**
	 * Returns the value of the '<em><b>Applied Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Condition</em>' reference.
	 * @see #isSetAppliedCondition()
	 * @see #unsetAppliedCondition()
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralConnection_AppliedCondition()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcBoundaryCondition getAppliedCondition();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Condition</em>' reference.
	 * @see #isSetAppliedCondition()
	 * @see #unsetAppliedCondition()
	 * @see #getAppliedCondition()
	 * @generated
	 */
	void setAppliedCondition(IfcBoundaryCondition value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppliedCondition()
	 * @see #getAppliedCondition()
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @generated
	 */
	void unsetAppliedCondition();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applied Condition</em>' reference is set.
	 * @see #unsetAppliedCondition()
	 * @see #getAppliedCondition()
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @generated
	 */
	boolean isSetAppliedCondition();

	/**
	 * Returns the value of the '<em><b>Connects Structural Members</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelConnectsStructuralMember}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelConnectsStructuralMember#getRelatedStructuralConnection <em>Related Structural Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects Structural Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects Structural Members</em>' reference list.
	 * @see #isSetConnectsStructuralMembers()
	 * @see #unsetConnectsStructuralMembers()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralConnection_ConnectsStructuralMembers()
	 * @see ifc2x3tc1.IfcRelConnectsStructuralMember#getRelatedStructuralConnection
	 * @model opposite="RelatedStructuralConnection" unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralMember> getConnectsStructuralMembers();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralConnection#getConnectsStructuralMembers <em>Connects Structural Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectsStructuralMembers()
	 * @see #getConnectsStructuralMembers()
	 * @generated
	 */
	void unsetConnectsStructuralMembers();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralConnection#getConnectsStructuralMembers <em>Connects Structural Members</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connects Structural Members</em>' reference list is set.
	 * @see #unsetConnectsStructuralMembers()
	 * @see #getConnectsStructuralMembers()
	 * @generated
	 */
	boolean isSetConnectsStructuralMembers();

} // IfcStructuralConnection
