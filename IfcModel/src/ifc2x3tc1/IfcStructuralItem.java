/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStructuralItem#getAssignedStructuralActivity <em>Assigned Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralItem()
 * @model
 * @generated
 */
public interface IfcStructuralItem extends IfcProduct, IfcStructuralActivityAssignmentSelect {
	/**
	 * Returns the value of the '<em><b>Assigned Structural Activity</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelConnectsStructuralActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Structural Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Structural Activity</em>' reference list.
	 * @see #isSetAssignedStructuralActivity()
	 * @see #unsetAssignedStructuralActivity()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralItem_AssignedStructuralActivity()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralActivity> getAssignedStructuralActivity();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralItem#getAssignedStructuralActivity <em>Assigned Structural Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssignedStructuralActivity()
	 * @see #getAssignedStructuralActivity()
	 * @generated
	 */
	void unsetAssignedStructuralActivity();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralItem#getAssignedStructuralActivity <em>Assigned Structural Activity</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Assigned Structural Activity</em>' reference list is set.
	 * @see #unsetAssignedStructuralActivity()
	 * @see #getAssignedStructuralActivity()
	 * @generated
	 */
	boolean isSetAssignedStructuralActivity();

} // IfcStructuralItem
