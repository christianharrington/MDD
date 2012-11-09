/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssignsToControl#getRelatingControl <em>Relating Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToControl()
 * @model
 * @generated
 */
public interface IfcRelAssignsToControl extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcControl#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Control</em>' reference.
	 * @see #setRelatingControl(IfcControl)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToControl_RelatingControl()
	 * @see ifc2x3tc1.IfcControl#getControls
	 * @model opposite="Controls"
	 * @generated
	 */
	IfcControl getRelatingControl();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssignsToControl#getRelatingControl <em>Relating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Control</em>' reference.
	 * @see #getRelatingControl()
	 * @generated
	 */
	void setRelatingControl(IfcControl value);

} // IfcRelAssignsToControl
