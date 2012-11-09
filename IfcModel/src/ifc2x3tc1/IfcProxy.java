/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcProxy#getProxyType <em>Proxy Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProxy#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProxy()
 * @model
 * @generated
 */
public interface IfcProxy extends IfcProduct {
	/**
	 * Returns the value of the '<em><b>Proxy Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcObjectTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Type</em>' attribute.
	 * @see ifc2x3tc1.IfcObjectTypeEnum
	 * @see #setProxyType(IfcObjectTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProxy_ProxyType()
	 * @model
	 * @generated
	 */
	IfcObjectTypeEnum getProxyType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProxy#getProxyType <em>Proxy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Type</em>' attribute.
	 * @see ifc2x3tc1.IfcObjectTypeEnum
	 * @see #getProxyType()
	 * @generated
	 */
	void setProxyType(IfcObjectTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #setTag(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProxy_Tag()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProxy#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #isSetTag()
	 * @see #unsetTag()
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProxy#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	void unsetTag();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProxy#getTag <em>Tag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tag</em>' attribute is set.
	 * @see #unsetTag()
	 * @see #getTag()
	 * @see #setTag(String)
	 * @generated
	 */
	boolean isSetTag();

} // IfcProxy
