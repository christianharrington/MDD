/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Monetary Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcMonetaryUnit#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMonetaryUnit()
 * @model
 * @generated
 */
public interface IfcMonetaryUnit extends IfcUnit {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcCurrencyEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see ifc2x3tc1.IfcCurrencyEnum
	 * @see #setCurrency(IfcCurrencyEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMonetaryUnit_Currency()
	 * @model
	 * @generated
	 */
	IfcCurrencyEnum getCurrency();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMonetaryUnit#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see ifc2x3tc1.IfcCurrencyEnum
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(IfcCurrencyEnum value);

} // IfcMonetaryUnit
