/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcQuantityCount#getCountValue <em>Count Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcQuantityCount#getCountValueAsString <em>Count Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityCount()
 * @model
 * @generated
 */
public interface IfcQuantityCount extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Count Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Value</em>' attribute.
	 * @see #setCountValue(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityCount_CountValue()
	 * @model
	 * @generated
	 */
	double getCountValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityCount#getCountValue <em>Count Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Value</em>' attribute.
	 * @see #getCountValue()
	 * @generated
	 */
	void setCountValue(double value);

	/**
	 * Returns the value of the '<em><b>Count Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Value As String</em>' attribute.
	 * @see #setCountValueAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityCount_CountValueAsString()
	 * @model
	 * @generated
	 */
	String getCountValueAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityCount#getCountValueAsString <em>Count Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Value As String</em>' attribute.
	 * @see #getCountValueAsString()
	 * @generated
	 */
	void setCountValueAsString(String value);

} // IfcQuantityCount
