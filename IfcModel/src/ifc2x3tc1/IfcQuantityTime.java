/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcQuantityTime#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcQuantityTime#getTimeValueAsString <em>Time Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityTime()
 * @model
 * @generated
 */
public interface IfcQuantityTime extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value</em>' attribute.
	 * @see #setTimeValue(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityTime_TimeValue()
	 * @model
	 * @generated
	 */
	double getTimeValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityTime#getTimeValue <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value</em>' attribute.
	 * @see #getTimeValue()
	 * @generated
	 */
	void setTimeValue(double value);

	/**
	 * Returns the value of the '<em><b>Time Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Value As String</em>' attribute.
	 * @see #setTimeValueAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityTime_TimeValueAsString()
	 * @model
	 * @generated
	 */
	String getTimeValueAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityTime#getTimeValueAsString <em>Time Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Value As String</em>' attribute.
	 * @see #getTimeValueAsString()
	 * @generated
	 */
	void setTimeValueAsString(String value);

} // IfcQuantityTime
