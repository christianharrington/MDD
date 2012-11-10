/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Axis2 Placement2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcAxis2Placement2D#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAxis2Placement2D()
 * @model
 * @generated
 */
public interface IfcAxis2Placement2D extends IfcPlacement, IfcAxis2Placement {
	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' reference.
	 * @see #isSetRefDirection()
	 * @see #unsetRefDirection()
	 * @see #setRefDirection(IfcDirection)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAxis2Placement2D_RefDirection()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDirection getRefDirection();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAxis2Placement2D#getRefDirection <em>Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Direction</em>' reference.
	 * @see #isSetRefDirection()
	 * @see #unsetRefDirection()
	 * @see #getRefDirection()
	 * @generated
	 */
	void setRefDirection(IfcDirection value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcAxis2Placement2D#getRefDirection <em>Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefDirection()
	 * @see #getRefDirection()
	 * @see #setRefDirection(IfcDirection)
	 * @generated
	 */
	void unsetRefDirection();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcAxis2Placement2D#getRefDirection <em>Ref Direction</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ref Direction</em>' reference is set.
	 * @see #unsetRefDirection()
	 * @see #getRefDirection()
	 * @see #setRefDirection(IfcDirection)
	 * @generated
	 */
	boolean isSetRefDirection();

} // IfcAxis2Placement2D
