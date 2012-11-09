/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electric Flow Storage Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcElectricFlowStorageDeviceType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElectricFlowStorageDeviceType()
 * @model
 * @generated
 */
public interface IfcElectricFlowStorageDeviceType extends IfcFlowStorageDeviceType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcElectricFlowStorageDeviceTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcElectricFlowStorageDeviceTypeEnum
	 * @see #setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElectricFlowStorageDeviceType_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcElectricFlowStorageDeviceTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcElectricFlowStorageDeviceType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcElectricFlowStorageDeviceTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcElectricFlowStorageDeviceTypeEnum value);

} // IfcElectricFlowStorageDeviceType
