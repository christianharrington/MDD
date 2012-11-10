/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Point On Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPointOnCurve#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPointOnCurve#getPointParameter <em>Point Parameter</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPointOnCurve#getPointParameterAsString <em>Point Parameter As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPointOnCurve#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPointOnCurve()
 * @model
 * @generated
 */
public interface IfcPointOnCurve extends IfcPoint {
	/**
	 * Returns the value of the '<em><b>Basis Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Curve</em>' reference.
	 * @see #setBasisCurve(IfcCurve)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPointOnCurve_BasisCurve()
	 * @model
	 * @generated
	 */
	IfcCurve getBasisCurve();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPointOnCurve#getBasisCurve <em>Basis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Curve</em>' reference.
	 * @see #getBasisCurve()
	 * @generated
	 */
	void setBasisCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Point Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter</em>' attribute.
	 * @see #setPointParameter(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPointOnCurve_PointParameter()
	 * @model
	 * @generated
	 */
	double getPointParameter();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPointOnCurve#getPointParameter <em>Point Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter</em>' attribute.
	 * @see #getPointParameter()
	 * @generated
	 */
	void setPointParameter(double value);

	/**
	 * Returns the value of the '<em><b>Point Parameter As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Parameter As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Parameter As String</em>' attribute.
	 * @see #setPointParameterAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPointOnCurve_PointParameterAsString()
	 * @model
	 * @generated
	 */
	String getPointParameterAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPointOnCurve#getPointParameterAsString <em>Point Parameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Parameter As String</em>' attribute.
	 * @see #getPointParameterAsString()
	 * @generated
	 */
	void setPointParameterAsString(String value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #setDim(int)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPointOnCurve_Dim()
	 * @model unsettable="true" derived="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPointOnCurve#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #getDim()
	 * @generated
	 */
	void setDim(int value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPointOnCurve#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	void unsetDim();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPointOnCurve#getDim <em>Dim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dim</em>' attribute is set.
	 * @see #unsetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	boolean isSetDim();

} // IfcPointOnCurve
