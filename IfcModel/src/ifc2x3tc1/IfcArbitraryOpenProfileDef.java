/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Arbitrary Open Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcArbitraryOpenProfileDef#getCurve <em>Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcArbitraryOpenProfileDef()
 * @model
 * @generated
 */
public interface IfcArbitraryOpenProfileDef extends IfcProfileDef {
	/**
	 * Returns the value of the '<em><b>Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve</em>' reference.
	 * @see #setCurve(IfcBoundedCurve)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcArbitraryOpenProfileDef_Curve()
	 * @model
	 * @generated
	 */
	IfcBoundedCurve getCurve();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcArbitraryOpenProfileDef#getCurve <em>Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' reference.
	 * @see #getCurve()
	 * @generated
	 */
	void setCurve(IfcBoundedCurve value);

} // IfcArbitraryOpenProfileDef
