/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcLabel#getWrappedValue <em>Wrapped Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLabel()
 * @model
 * @generated
 */
public interface IfcLabel extends WrappedValue, IfcConditionCriterionSelect, IfcSimpleValue {
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLabel_WrappedValue()
	 * @model unsettable="true"
	 * @generated
	 */
	String getWrappedValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLabel#getWrappedValue <em>Wrapped Value</em>}' attribute.
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
	 * Unsets the value of the '{@link ifc2x3tc1.IfcLabel#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrappedValue()
	 * @see #getWrappedValue()
	 * @see #setWrappedValue(String)
	 * @generated
	 */
	void unsetWrappedValue();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcLabel#getWrappedValue <em>Wrapped Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrapped Value</em>' attribute is set.
	 * @see #unsetWrappedValue()
	 * @see #getWrappedValue()
	 * @see #setWrappedValue(String)
	 * @generated
	 */
	boolean isSetWrappedValue();

} // IfcLabel
