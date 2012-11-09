/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Quantity Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcQuantityVolume#getVolumeValue <em>Volume Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcQuantityVolume#getVolumeValueAsString <em>Volume Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityVolume()
 * @model
 * @generated
 */
public interface IfcQuantityVolume extends IfcPhysicalSimpleQuantity {
	/**
	 * Returns the value of the '<em><b>Volume Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Value</em>' attribute.
	 * @see #setVolumeValue(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityVolume_VolumeValue()
	 * @model
	 * @generated
	 */
	double getVolumeValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityVolume#getVolumeValue <em>Volume Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Value</em>' attribute.
	 * @see #getVolumeValue()
	 * @generated
	 */
	void setVolumeValue(double value);

	/**
	 * Returns the value of the '<em><b>Volume Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Value As String</em>' attribute.
	 * @see #setVolumeValueAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcQuantityVolume_VolumeValueAsString()
	 * @model
	 * @generated
	 */
	String getVolumeValueAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcQuantityVolume#getVolumeValueAsString <em>Volume Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Value As String</em>' attribute.
	 * @see #getVolumeValueAsString()
	 * @generated
	 */
	void setVolumeValueAsString(String value);

} // IfcQuantityVolume
