/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Dimension Curve Terminator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDimensionCurveTerminator#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDimensionCurveTerminator()
 * @model
 * @generated
 */
public interface IfcDimensionCurveTerminator extends IfcTerminatorSymbol {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcDimensionExtentUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see ifc2x3tc1.IfcDimensionExtentUsage
	 * @see #setRole(IfcDimensionExtentUsage)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDimensionCurveTerminator_Role()
	 * @model
	 * @generated
	 */
	IfcDimensionExtentUsage getRole();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDimensionCurveTerminator#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see ifc2x3tc1.IfcDimensionExtentUsage
	 * @see #getRole()
	 * @generated
	 */
	void setRole(IfcDimensionExtentUsage value);

} // IfcDimensionCurveTerminator
