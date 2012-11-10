/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Globally Unique Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcGloballyUniqueId#getWrappedValue <em>Wrapped Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGloballyUniqueId#getIfcRoot <em>Ifc Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGloballyUniqueId()
 * @model
 * @generated
 */
public interface IfcGloballyUniqueId extends WrappedValue {
	/**
	 * Returns the value of the '<em><b>Wrapped Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Value</em>' attribute.
	 * @see #isSetWrappedValue()
	 * @see #unsetWrappedValue()
	 * @see #setWrappedValue(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGloballyUniqueId_WrappedValue()
	 * @model unsettable="true"
	 * @generated
	 */
	String getWrappedValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGloballyUniqueId#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Value</em>' attribute.
	 * @see #isSetWrappedValue()
	 * @see #unsetWrappedValue()
	 * @see #getWrappedValue()
	 * @generated
	 */
	void setWrappedValue(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGloballyUniqueId#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrappedValue()
	 * @see #getWrappedValue()
	 * @see #setWrappedValue(String)
	 * @generated
	 */
	void unsetWrappedValue();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGloballyUniqueId#getWrappedValue <em>Wrapped Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrapped Value</em>' attribute is set.
	 * @see #unsetWrappedValue()
	 * @see #getWrappedValue()
	 * @see #setWrappedValue(String)
	 * @generated
	 */
	boolean isSetWrappedValue();

	/**
	 * Returns the value of the '<em><b>Ifc Root</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRoot#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Root</em>' reference.
	 * @see #setIfcRoot(IfcRoot)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGloballyUniqueId_IfcRoot()
	 * @see ifc2x3tc1.IfcRoot#getGlobalId
	 * @model opposite="GlobalId"
	 * @generated
	 */
	IfcRoot getIfcRoot();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGloballyUniqueId#getIfcRoot <em>Ifc Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Root</em>' reference.
	 * @see #getIfcRoot()
	 * @generated
	 */
	void setIfcRoot(IfcRoot value);

} // IfcGloballyUniqueId
