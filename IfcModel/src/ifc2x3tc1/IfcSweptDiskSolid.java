/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Swept Disk Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSweptDiskSolid#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSweptDiskSolid#getRadius <em>Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSweptDiskSolid#getRadiusAsString <em>Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSweptDiskSolid#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSweptDiskSolid#getInnerRadiusAsString <em>Inner Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSweptDiskSolid#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSweptDiskSolid#getStartParamAsString <em>Start Param As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSweptDiskSolid#getEndParam <em>End Param</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSweptDiskSolid#getEndParamAsString <em>End Param As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid()
 * @model
 * @generated
 */
public interface IfcSweptDiskSolid extends IfcSolidModel {
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid_Directrix()
	 * @model
	 * @generated
	 */
	IfcCurve getDirectrix();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getDirectrix <em>Directrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directrix</em>' reference.
	 * @see #getDirectrix()
	 * @generated
	 */
	void setDirectrix(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Radius As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius As String</em>' attribute.
	 * @see #setRadiusAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid_RadiusAsString()
	 * @model
	 * @generated
	 */
	String getRadiusAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getRadiusAsString <em>Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius As String</em>' attribute.
	 * @see #getRadiusAsString()
	 * @generated
	 */
	void setRadiusAsString(String value);

	/**
	 * Returns the value of the '<em><b>Inner Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Radius</em>' attribute.
	 * @see #isSetInnerRadius()
	 * @see #unsetInnerRadius()
	 * @see #setInnerRadius(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid_InnerRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	double getInnerRadius();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getInnerRadius <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Radius</em>' attribute.
	 * @see #isSetInnerRadius()
	 * @see #unsetInnerRadius()
	 * @see #getInnerRadius()
	 * @generated
	 */
	void setInnerRadius(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getInnerRadius <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInnerRadius()
	 * @see #getInnerRadius()
	 * @see #setInnerRadius(double)
	 * @generated
	 */
	void unsetInnerRadius();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getInnerRadius <em>Inner Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inner Radius</em>' attribute is set.
	 * @see #unsetInnerRadius()
	 * @see #getInnerRadius()
	 * @see #setInnerRadius(double)
	 * @generated
	 */
	boolean isSetInnerRadius();

	/**
	 * Returns the value of the '<em><b>Inner Radius As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Radius As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Radius As String</em>' attribute.
	 * @see #isSetInnerRadiusAsString()
	 * @see #unsetInnerRadiusAsString()
	 * @see #setInnerRadiusAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid_InnerRadiusAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getInnerRadiusAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getInnerRadiusAsString <em>Inner Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Radius As String</em>' attribute.
	 * @see #isSetInnerRadiusAsString()
	 * @see #unsetInnerRadiusAsString()
	 * @see #getInnerRadiusAsString()
	 * @generated
	 */
	void setInnerRadiusAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getInnerRadiusAsString <em>Inner Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInnerRadiusAsString()
	 * @see #getInnerRadiusAsString()
	 * @see #setInnerRadiusAsString(String)
	 * @generated
	 */
	void unsetInnerRadiusAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getInnerRadiusAsString <em>Inner Radius As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inner Radius As String</em>' attribute is set.
	 * @see #unsetInnerRadiusAsString()
	 * @see #getInnerRadiusAsString()
	 * @see #setInnerRadiusAsString(String)
	 * @generated
	 */
	boolean isSetInnerRadiusAsString();

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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid_StartParam()
	 * @model
	 * @generated
	 */
	double getStartParam();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getStartParam <em>Start Param</em>}' attribute.
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid_StartParamAsString()
	 * @model
	 * @generated
	 */
	String getStartParamAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getStartParamAsString <em>Start Param As String</em>}' attribute.
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid_EndParam()
	 * @model
	 * @generated
	 */
	double getEndParam();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getEndParam <em>End Param</em>}' attribute.
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSweptDiskSolid_EndParamAsString()
	 * @model
	 * @generated
	 */
	String getEndParamAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSweptDiskSolid#getEndParamAsString <em>End Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Param As String</em>' attribute.
	 * @see #getEndParamAsString()
	 * @generated
	 */
	void setEndParamAsString(String value);

} // IfcSweptDiskSolid
