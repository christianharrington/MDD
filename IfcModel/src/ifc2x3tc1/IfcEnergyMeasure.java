/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Energy Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcEnergyMeasure#getWrappedValue <em>Wrapped Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcEnergyMeasure#getWrappedValueAsString <em>Wrapped Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnergyMeasure()
 * @model
 * @generated
 */
public interface IfcEnergyMeasure extends WrappedValue, IfcDerivedMeasureValue {
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
	 * @see #setWrappedValue(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnergyMeasure_WrappedValue()
	 * @model unsettable="true"
	 * @generated
	 */
	double getWrappedValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEnergyMeasure#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Value</em>' attribute.
	 * @see #isSetWrappedValue()
	 * @see #unsetWrappedValue()
	 * @see #getWrappedValue()
	 * @generated
	 */
	void setWrappedValue(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcEnergyMeasure#getWrappedValue <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrappedValue()
	 * @see #getWrappedValue()
	 * @see #setWrappedValue(double)
	 * @generated
	 */
	void unsetWrappedValue();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcEnergyMeasure#getWrappedValue <em>Wrapped Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrapped Value</em>' attribute is set.
	 * @see #unsetWrappedValue()
	 * @see #getWrappedValue()
	 * @see #setWrappedValue(double)
	 * @generated
	 */
	boolean isSetWrappedValue();

	/**
	 * Returns the value of the '<em><b>Wrapped Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Value As String</em>' attribute.
	 * @see #isSetWrappedValueAsString()
	 * @see #unsetWrappedValueAsString()
	 * @see #setWrappedValueAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnergyMeasure_WrappedValueAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getWrappedValueAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEnergyMeasure#getWrappedValueAsString <em>Wrapped Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped Value As String</em>' attribute.
	 * @see #isSetWrappedValueAsString()
	 * @see #unsetWrappedValueAsString()
	 * @see #getWrappedValueAsString()
	 * @generated
	 */
	void setWrappedValueAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcEnergyMeasure#getWrappedValueAsString <em>Wrapped Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrappedValueAsString()
	 * @see #getWrappedValueAsString()
	 * @see #setWrappedValueAsString(String)
	 * @generated
	 */
	void unsetWrappedValueAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcEnergyMeasure#getWrappedValueAsString <em>Wrapped Value As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrapped Value As String</em>' attribute is set.
	 * @see #unsetWrappedValueAsString()
	 * @see #getWrappedValueAsString()
	 * @see #setWrappedValueAsString(String)
	 * @generated
	 */
	boolean isSetWrappedValueAsString();

} // IfcEnergyMeasure
