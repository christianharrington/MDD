/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcCurveStyle#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcCurveStyle#getCurveWidth <em>Curve Width</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcCurveStyle#getCurveColour <em>Curve Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCurveStyle()
 * @model
 * @generated
 */
public interface IfcCurveStyle extends IfcPresentationStyle, IfcPresentationStyleSelect {
	/**
	 * Returns the value of the '<em><b>Curve Font</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Font</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Font</em>' reference.
	 * @see #isSetCurveFont()
	 * @see #unsetCurveFont()
	 * @see #setCurveFont(IfcCurveFontOrScaledCurveFontSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCurveStyle_CurveFont()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCurveFontOrScaledCurveFontSelect getCurveFont();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCurveStyle#getCurveFont <em>Curve Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Font</em>' reference.
	 * @see #isSetCurveFont()
	 * @see #unsetCurveFont()
	 * @see #getCurveFont()
	 * @generated
	 */
	void setCurveFont(IfcCurveFontOrScaledCurveFontSelect value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcCurveStyle#getCurveFont <em>Curve Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurveFont()
	 * @see #getCurveFont()
	 * @see #setCurveFont(IfcCurveFontOrScaledCurveFontSelect)
	 * @generated
	 */
	void unsetCurveFont();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcCurveStyle#getCurveFont <em>Curve Font</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Curve Font</em>' reference is set.
	 * @see #unsetCurveFont()
	 * @see #getCurveFont()
	 * @see #setCurveFont(IfcCurveFontOrScaledCurveFontSelect)
	 * @generated
	 */
	boolean isSetCurveFont();

	/**
	 * Returns the value of the '<em><b>Curve Width</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Width</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Width</em>' reference.
	 * @see #isSetCurveWidth()
	 * @see #unsetCurveWidth()
	 * @see #setCurveWidth(IfcSizeSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCurveStyle_CurveWidth()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSizeSelect getCurveWidth();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCurveStyle#getCurveWidth <em>Curve Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Width</em>' reference.
	 * @see #isSetCurveWidth()
	 * @see #unsetCurveWidth()
	 * @see #getCurveWidth()
	 * @generated
	 */
	void setCurveWidth(IfcSizeSelect value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcCurveStyle#getCurveWidth <em>Curve Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurveWidth()
	 * @see #getCurveWidth()
	 * @see #setCurveWidth(IfcSizeSelect)
	 * @generated
	 */
	void unsetCurveWidth();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcCurveStyle#getCurveWidth <em>Curve Width</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Curve Width</em>' reference is set.
	 * @see #unsetCurveWidth()
	 * @see #getCurveWidth()
	 * @see #setCurveWidth(IfcSizeSelect)
	 * @generated
	 */
	boolean isSetCurveWidth();

	/**
	 * Returns the value of the '<em><b>Curve Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Colour</em>' reference.
	 * @see #isSetCurveColour()
	 * @see #unsetCurveColour()
	 * @see #setCurveColour(IfcColour)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCurveStyle_CurveColour()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcColour getCurveColour();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCurveStyle#getCurveColour <em>Curve Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Colour</em>' reference.
	 * @see #isSetCurveColour()
	 * @see #unsetCurveColour()
	 * @see #getCurveColour()
	 * @generated
	 */
	void setCurveColour(IfcColour value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcCurveStyle#getCurveColour <em>Curve Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurveColour()
	 * @see #getCurveColour()
	 * @see #setCurveColour(IfcColour)
	 * @generated
	 */
	void unsetCurveColour();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcCurveStyle#getCurveColour <em>Curve Colour</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Curve Colour</em>' reference is set.
	 * @see #unsetCurveColour()
	 * @see #getCurveColour()
	 * @see #setCurveColour(IfcColour)
	 * @generated
	 */
	boolean isSetCurveColour();

} // IfcCurveStyle
