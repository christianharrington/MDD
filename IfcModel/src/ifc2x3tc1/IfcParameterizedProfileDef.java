/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Parameterized Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcParameterizedProfileDef#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcParameterizedProfileDef()
 * @model
 * @generated
 */
public interface IfcParameterizedProfileDef extends IfcProfileDef {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcAxis2Placement2D)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcParameterizedProfileDef_Position()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement2D getPosition();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcParameterizedProfileDef#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcAxis2Placement2D value);

} // IfcParameterizedProfileDef
