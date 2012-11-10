/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcQuantityLength#getLengthValue <em>Length Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcQuantityLength#getLengthValueAsString <em>Length Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityLength()
 * @model
 * @generated
 */
public interface IfcQuantityLength extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Length Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Value</em>' attribute.
	 * @see #setLengthValue(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityLength_LengthValue()
	 * @model
	 * @generated
	 */
	double getLengthValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityLength#getLengthValue <em>Length Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Value</em>' attribute.
	 * @see #getLengthValue()
	 * @generated
	 */
	void setLengthValue(double value);

	/**
	 * Returns the value of the '<em><b>Length Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Value As String</em>' attribute.
	 * @see #setLengthValueAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityLength_LengthValueAsString()
	 * @model
	 * @generated
	 */
	String getLengthValueAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityLength#getLengthValueAsString <em>Length Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Value As String</em>' attribute.
	 * @see #getLengthValueAsString()
	 * @generated
	 */
	void setLengthValueAsString(String value);

} // IfcQuantityLength
