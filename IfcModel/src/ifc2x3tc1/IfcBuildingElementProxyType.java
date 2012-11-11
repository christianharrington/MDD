/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Building Element Proxy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcBuildingElementProxyType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBuildingElementProxyType()
 * @model
 * @generated
 */
public interface IfcBuildingElementProxyType extends IfcBuildingElementType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcBuildingElementProxyTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcBuildingElementProxyTypeEnum
	 * @see #setPredefinedType(IfcBuildingElementProxyTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBuildingElementProxyType_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcBuildingElementProxyTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcBuildingElementProxyType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcBuildingElementProxyTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcBuildingElementProxyTypeEnum value);

} // IfcBuildingElementProxyType