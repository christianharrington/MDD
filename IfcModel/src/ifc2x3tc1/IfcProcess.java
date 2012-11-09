/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcProcess#getOperatesOn <em>Operates On</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProcess#getIsSuccessorFrom <em>Is Successor From</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProcess#getIsPredecessorTo <em>Is Predecessor To</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProcess()
 * @model
 * @generated
 */
public interface IfcProcess extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Operates On</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelAssignsToProcess}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelAssignsToProcess#getRelatingProcess <em>Relating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operates On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operates On</em>' reference list.
	 * @see #isSetOperatesOn()
	 * @see #unsetOperatesOn()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProcess_OperatesOn()
	 * @see ifc2x3tc1.IfcRelAssignsToProcess#getRelatingProcess
	 * @model opposite="RelatingProcess" unsettable="true"
	 * @generated
	 */
	EList<IfcRelAssignsToProcess> getOperatesOn();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProcess#getOperatesOn <em>Operates On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperatesOn()
	 * @see #getOperatesOn()
	 * @generated
	 */
	void unsetOperatesOn();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProcess#getOperatesOn <em>Operates On</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operates On</em>' reference list is set.
	 * @see #unsetOperatesOn()
	 * @see #getOperatesOn()
	 * @generated
	 */
	boolean isSetOperatesOn();

	/**
	 * Returns the value of the '<em><b>Is Successor From</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelSequence}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelSequence#getRelatedProcess <em>Related Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Successor From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Successor From</em>' reference list.
	 * @see #isSetIsSuccessorFrom()
	 * @see #unsetIsSuccessorFrom()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProcess_IsSuccessorFrom()
	 * @see ifc2x3tc1.IfcRelSequence#getRelatedProcess
	 * @model opposite="RelatedProcess" unsettable="true"
	 * @generated
	 */
	EList<IfcRelSequence> getIsSuccessorFrom();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProcess#getIsSuccessorFrom <em>Is Successor From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSuccessorFrom()
	 * @see #getIsSuccessorFrom()
	 * @generated
	 */
	void unsetIsSuccessorFrom();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProcess#getIsSuccessorFrom <em>Is Successor From</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Successor From</em>' reference list is set.
	 * @see #unsetIsSuccessorFrom()
	 * @see #getIsSuccessorFrom()
	 * @generated
	 */
	boolean isSetIsSuccessorFrom();

	/**
	 * Returns the value of the '<em><b>Is Predecessor To</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelSequence}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelSequence#getRelatingProcess <em>Relating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Predecessor To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Predecessor To</em>' reference list.
	 * @see #isSetIsPredecessorTo()
	 * @see #unsetIsPredecessorTo()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProcess_IsPredecessorTo()
	 * @see ifc2x3tc1.IfcRelSequence#getRelatingProcess
	 * @model opposite="RelatingProcess" unsettable="true"
	 * @generated
	 */
	EList<IfcRelSequence> getIsPredecessorTo();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProcess#getIsPredecessorTo <em>Is Predecessor To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPredecessorTo()
	 * @see #getIsPredecessorTo()
	 * @generated
	 */
	void unsetIsPredecessorTo();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProcess#getIsPredecessorTo <em>Is Predecessor To</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Predecessor To</em>' reference list is set.
	 * @see #unsetIsPredecessorTo()
	 * @see #getIsPredecessorTo()
	 * @generated
	 */
	boolean isSetIsPredecessorTo();

} // IfcProcess
