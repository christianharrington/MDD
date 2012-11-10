/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Style Font And Scaling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getCurveFontScaling <em>Curve Font Scaling</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getCurveFontScalingAsString <em>Curve Font Scaling As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCurveStyleFontAndScaling()
 * @model
 * @generated
 */
public interface IfcCurveStyleFontAndScaling extends IfcCurveFontOrScaledCurveFontSelect {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCurveStyleFontAndScaling_Name()
	 * @model unsettable="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Curve Font</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Font</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Font</em>' reference.
	 * @see #setCurveFont(IfcCurveStyleFontSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCurveStyleFontAndScaling_CurveFont()
	 * @model
	 * @generated
	 */
	IfcCurveStyleFontSelect getCurveFont();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getCurveFont <em>Curve Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Font</em>' reference.
	 * @see #getCurveFont()
	 * @generated
	 */
	void setCurveFont(IfcCurveStyleFontSelect value);

	/**
	 * Returns the value of the '<em><b>Curve Font Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Font Scaling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Font Scaling</em>' attribute.
	 * @see #setCurveFontScaling(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCurveStyleFontAndScaling_CurveFontScaling()
	 * @model
	 * @generated
	 */
	double getCurveFontScaling();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getCurveFontScaling <em>Curve Font Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Font Scaling</em>' attribute.
	 * @see #getCurveFontScaling()
	 * @generated
	 */
	void setCurveFontScaling(double value);

	/**
	 * Returns the value of the '<em><b>Curve Font Scaling As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Font Scaling As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Font Scaling As String</em>' attribute.
	 * @see #setCurveFontScalingAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCurveStyleFontAndScaling_CurveFontScalingAsString()
	 * @model
	 * @generated
	 */
	String getCurveFontScalingAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCurveStyleFontAndScaling#getCurveFontScalingAsString <em>Curve Font Scaling As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Font Scaling As String</em>' attribute.
	 * @see #getCurveFontScalingAsString()
	 * @generated
	 */
	void setCurveFontScalingAsString(String value);

} // IfcCurveStyleFontAndScaling
