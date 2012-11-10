/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Axis1 Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcAxis1Placement#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAxis1Placement()
 * @model
 * @generated
 */
public interface IfcAxis1Placement extends IfcPlacement {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference.
	 * @see #isSetAxis()
	 * @see #unsetAxis()
	 * @see #setAxis(IfcDirection)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAxis1Placement_Axis()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDirection getAxis();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAxis1Placement#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #isSetAxis()
	 * @see #unsetAxis()
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(IfcDirection value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcAxis1Placement#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAxis()
	 * @see #getAxis()
	 * @see #setAxis(IfcDirection)
	 * @generated
	 */
	void unsetAxis();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcAxis1Placement#getAxis <em>Axis</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Axis</em>' reference is set.
	 * @see #unsetAxis()
	 * @see #getAxis()
	 * @see #setAxis(IfcDirection)
	 * @generated
	 */
	boolean isSetAxis();

} // IfcAxis1Placement
