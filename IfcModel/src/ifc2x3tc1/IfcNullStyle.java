/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Null Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcNullStyle#getWrappedValue <em>Wrapped Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcNullStyle()
 * @model
 * @generated
 */
public interface IfcNullStyle extends WrappedValue, IfcPresentationStyleSelect {
	/**
	 * Returns the value of the '<em><b>Wrapped Value</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcNullStyleEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Value</em>' attribute.
	 * @see ifc2x3tc1.IfcNullStyleEnum
	 * @see #setWrappedValue(IfcNullStyleEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcNullStyle_WrappedValue()
	 * @model
	 * @generated
	 */
	IfcNullStyleEnum getWrappedValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcNullStyle#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Value</em>' attribute.
	 * @see ifc2x3tc1.IfcNullStyleEnum
	 * @see #getWrappedValue()
	 * @generated
	 */
	void setWrappedValue(IfcNullStyleEnum value);

} // IfcNullStyle
