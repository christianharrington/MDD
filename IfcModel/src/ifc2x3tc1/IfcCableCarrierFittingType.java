/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cable Carrier Fitting Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcCableCarrierFittingType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCableCarrierFittingType()
 * @model
 * @generated
 */
public interface IfcCableCarrierFittingType extends IfcFlowFittingType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcCableCarrierFittingTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcCableCarrierFittingTypeEnum
	 * @see #setPredefinedType(IfcCableCarrierFittingTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCableCarrierFittingType_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcCableCarrierFittingTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCableCarrierFittingType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcCableCarrierFittingTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcCableCarrierFittingTypeEnum value);

} // IfcCableCarrierFittingType