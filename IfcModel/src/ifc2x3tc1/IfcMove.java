/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcMove#getMoveFrom <em>Move From</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcMove#getMoveTo <em>Move To</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcMove#getPunchList <em>Punch List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMove()
 * @model
 * @generated
 */
public interface IfcMove extends IfcTask {
	/**
	 * Returns the value of the '<em><b>Move From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move From</em>' reference.
	 * @see #setMoveFrom(IfcSpatialStructureElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMove_MoveFrom()
	 * @model
	 * @generated
	 */
	IfcSpatialStructureElement getMoveFrom();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMove#getMoveFrom <em>Move From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move From</em>' reference.
	 * @see #getMoveFrom()
	 * @generated
	 */
	void setMoveFrom(IfcSpatialStructureElement value);

	/**
	 * Returns the value of the '<em><b>Move To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move To</em>' reference.
	 * @see #setMoveTo(IfcSpatialStructureElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMove_MoveTo()
	 * @model
	 * @generated
	 */
	IfcSpatialStructureElement getMoveTo();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMove#getMoveTo <em>Move To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move To</em>' reference.
	 * @see #getMoveTo()
	 * @generated
	 */
	void setMoveTo(IfcSpatialStructureElement value);

	/**
	 * Returns the value of the '<em><b>Punch List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Punch List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Punch List</em>' attribute list.
	 * @see #isSetPunchList()
	 * @see #unsetPunchList()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMove_PunchList()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	EList<String> getPunchList();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcMove#getPunchList <em>Punch List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPunchList()
	 * @see #getPunchList()
	 * @generated
	 */
	void unsetPunchList();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcMove#getPunchList <em>Punch List</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Punch List</em>' attribute list is set.
	 * @see #unsetPunchList()
	 * @see #getPunchList()
	 * @generated
	 */
	boolean isSetPunchList();

} // IfcMove
