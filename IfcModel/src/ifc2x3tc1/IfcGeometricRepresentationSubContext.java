/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Geometric Representation Sub Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetScaleAsString <em>Target Scale As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetView <em>Target View</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationSubContext()
 * @model
 * @generated
 */
public interface IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext {
	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcGeometricRepresentationContext#getHasSubContexts <em>Has Sub Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' reference.
	 * @see #setParentContext(IfcGeometricRepresentationContext)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationSubContext_ParentContext()
	 * @see ifc2x3tc1.IfcGeometricRepresentationContext#getHasSubContexts
	 * @model opposite="HasSubContexts"
	 * @generated
	 */
	IfcGeometricRepresentationContext getParentContext();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getParentContext <em>Parent Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(IfcGeometricRepresentationContext value);

	/**
	 * Returns the value of the '<em><b>Target Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Scale</em>' attribute.
	 * @see #isSetTargetScale()
	 * @see #unsetTargetScale()
	 * @see #setTargetScale(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationSubContext_TargetScale()
	 * @model unsettable="true"
	 * @generated
	 */
	double getTargetScale();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Scale</em>' attribute.
	 * @see #isSetTargetScale()
	 * @see #unsetTargetScale()
	 * @see #getTargetScale()
	 * @generated
	 */
	void setTargetScale(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetScale()
	 * @see #getTargetScale()
	 * @see #setTargetScale(double)
	 * @generated
	 */
	void unsetTargetScale();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Scale</em>' attribute is set.
	 * @see #unsetTargetScale()
	 * @see #getTargetScale()
	 * @see #setTargetScale(double)
	 * @generated
	 */
	boolean isSetTargetScale();

	/**
	 * Returns the value of the '<em><b>Target Scale As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Scale As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Scale As String</em>' attribute.
	 * @see #isSetTargetScaleAsString()
	 * @see #unsetTargetScaleAsString()
	 * @see #setTargetScaleAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationSubContext_TargetScaleAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTargetScaleAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetScaleAsString <em>Target Scale As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Scale As String</em>' attribute.
	 * @see #isSetTargetScaleAsString()
	 * @see #unsetTargetScaleAsString()
	 * @see #getTargetScaleAsString()
	 * @generated
	 */
	void setTargetScaleAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetScaleAsString <em>Target Scale As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetScaleAsString()
	 * @see #getTargetScaleAsString()
	 * @see #setTargetScaleAsString(String)
	 * @generated
	 */
	void unsetTargetScaleAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetScaleAsString <em>Target Scale As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Scale As String</em>' attribute is set.
	 * @see #unsetTargetScaleAsString()
	 * @see #getTargetScaleAsString()
	 * @see #setTargetScaleAsString(String)
	 * @generated
	 */
	boolean isSetTargetScaleAsString();

	/**
	 * Returns the value of the '<em><b>Target View</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcGeometricProjectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target View</em>' attribute.
	 * @see ifc2x3tc1.IfcGeometricProjectionEnum
	 * @see #setTargetView(IfcGeometricProjectionEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationSubContext_TargetView()
	 * @model
	 * @generated
	 */
	IfcGeometricProjectionEnum getTargetView();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getTargetView <em>Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target View</em>' attribute.
	 * @see ifc2x3tc1.IfcGeometricProjectionEnum
	 * @see #getTargetView()
	 * @generated
	 */
	void setTargetView(IfcGeometricProjectionEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Target View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Target View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Target View</em>' attribute.
	 * @see #isSetUserDefinedTargetView()
	 * @see #unsetUserDefinedTargetView()
	 * @see #setUserDefinedTargetView(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGeometricRepresentationSubContext_UserDefinedTargetView()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUserDefinedTargetView();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Target View</em>' attribute.
	 * @see #isSetUserDefinedTargetView()
	 * @see #unsetUserDefinedTargetView()
	 * @see #getUserDefinedTargetView()
	 * @generated
	 */
	void setUserDefinedTargetView(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedTargetView()
	 * @see #getUserDefinedTargetView()
	 * @see #setUserDefinedTargetView(String)
	 * @generated
	 */
	void unsetUserDefinedTargetView();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Target View</em>' attribute is set.
	 * @see #unsetUserDefinedTargetView()
	 * @see #getUserDefinedTargetView()
	 * @see #setUserDefinedTargetView(String)
	 * @generated
	 */
	boolean isSetUserDefinedTargetView();

} // IfcGeometricRepresentationSubContext
