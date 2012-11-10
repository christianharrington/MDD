/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcQuantityArea#getAreaValue <em>Area Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcQuantityArea#getAreaValueAsString <em>Area Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityArea()
 * @model
 * @generated
 */
public interface IfcQuantityArea extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Area Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Value</em>' attribute.
	 * @see #setAreaValue(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityArea_AreaValue()
	 * @model
	 * @generated
	 */
	double getAreaValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityArea#getAreaValue <em>Area Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Value</em>' attribute.
	 * @see #getAreaValue()
	 * @generated
	 */
	void setAreaValue(double value);

	/**
	 * Returns the value of the '<em><b>Area Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Value As String</em>' attribute.
	 * @see #setAreaValueAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityArea_AreaValueAsString()
	 * @model
	 * @generated
	 */
	String getAreaValueAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityArea#getAreaValueAsString <em>Area Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Value As String</em>' attribute.
	 * @see #getAreaValueAsString()
	 * @generated
	 */
	void setAreaValueAsString(String value);

} // IfcQuantityArea
