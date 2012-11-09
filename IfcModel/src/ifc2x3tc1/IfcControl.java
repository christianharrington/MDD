/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcControl#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcControl()
 * @model
 * @generated
 */
public interface IfcControl extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelAssignsToControl}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelAssignsToControl#getRelatingControl <em>Relating Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see #isSetControls()
	 * @see #unsetControls()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcControl_Controls()
	 * @see ifc2x3tc1.IfcRelAssignsToControl#getRelatingControl
	 * @model opposite="RelatingControl" unsettable="true"
	 * @generated
	 */
	EList<IfcRelAssignsToControl> getControls();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcControl#getControls <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControls()
	 * @see #getControls()
	 * @generated
	 */
	void unsetControls();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcControl#getControls <em>Controls</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Controls</em>' reference list is set.
	 * @see #unsetControls()
	 * @see #getControls()
	 * @generated
	 */
	boolean isSetControls();

} // IfcControl
