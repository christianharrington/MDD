/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Curve Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getStartParamAsString <em>Start Param As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getEndParam <em>End Param</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getEndParamAsString <em>End Param As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getReferenceSurface <em>Reference Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceCurveSweptAreaSolid()
 * @model
 * @generated
 */
public interface IfcSurfaceCurveSweptAreaSolid extends IfcSweptAreaSolid {
	/**
	 * Returns the value of the '<em><b>Directrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directrix</em>' reference.
	 * @see #setDirectrix(IfcCurve)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceCurveSweptAreaSolid_Directrix()
	 * @model
	 * @generated
	 */
	IfcCurve getDirectrix();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getDirectrix <em>Directrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directrix</em>' reference.
	 * @see #getDirectrix()
	 * @generated
	 */
	void setDirectrix(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Start Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Param</em>' attribute.
	 * @see #setStartParam(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceCurveSweptAreaSolid_StartParam()
	 * @model
	 * @generated
	 */
	double getStartParam();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getStartParam <em>Start Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Param</em>' attribute.
	 * @see #getStartParam()
	 * @generated
	 */
	void setStartParam(double value);

	/**
	 * Returns the value of the '<em><b>Start Param As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Param As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Param As String</em>' attribute.
	 * @see #setStartParamAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceCurveSweptAreaSolid_StartParamAsString()
	 * @model
	 * @generated
	 */
	String getStartParamAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getStartParamAsString <em>Start Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Param As String</em>' attribute.
	 * @see #getStartParamAsString()
	 * @generated
	 */
	void setStartParamAsString(String value);

	/**
	 * Returns the value of the '<em><b>End Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Param</em>' attribute.
	 * @see #setEndParam(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceCurveSweptAreaSolid_EndParam()
	 * @model
	 * @generated
	 */
	double getEndParam();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getEndParam <em>End Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Param</em>' attribute.
	 * @see #getEndParam()
	 * @generated
	 */
	void setEndParam(double value);

	/**
	 * Returns the value of the '<em><b>End Param As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Param As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Param As String</em>' attribute.
	 * @see #setEndParamAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceCurveSweptAreaSolid_EndParamAsString()
	 * @model
	 * @generated
	 */
	String getEndParamAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getEndParamAsString <em>End Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Param As String</em>' attribute.
	 * @see #getEndParamAsString()
	 * @generated
	 */
	void setEndParamAsString(String value);

	/**
	 * Returns the value of the '<em><b>Reference Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Surface</em>' reference.
	 * @see #setReferenceSurface(IfcSurface)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceCurveSweptAreaSolid_ReferenceSurface()
	 * @model
	 * @generated
	 */
	IfcSurface getReferenceSurface();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceCurveSweptAreaSolid#getReferenceSurface <em>Reference Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Surface</em>' reference.
	 * @see #getReferenceSurface()
	 * @generated
	 */
	void setReferenceSurface(IfcSurface value);

} // IfcSurfaceCurveSweptAreaSolid
