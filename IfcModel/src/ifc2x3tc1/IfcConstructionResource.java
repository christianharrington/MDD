/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Construction Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcConstructionResource#getResourceConsumption <em>Resource Consumption</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstructionResource()
 * @model
 * @generated
 */
public interface IfcConstructionResource extends IfcResource {
	/**
	 * Returns the value of the '<em><b>Resource Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Identifier</em>' attribute.
	 * @see #isSetResourceIdentifier()
	 * @see #unsetResourceIdentifier()
	 * @see #setResourceIdentifier(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstructionResource_ResourceIdentifier()
	 * @model unsettable="true"
	 * @generated
	 */
	String getResourceIdentifier();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Identifier</em>' attribute.
	 * @see #isSetResourceIdentifier()
	 * @see #unsetResourceIdentifier()
	 * @see #getResourceIdentifier()
	 * @generated
	 */
	void setResourceIdentifier(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResourceIdentifier()
	 * @see #getResourceIdentifier()
	 * @see #setResourceIdentifier(String)
	 * @generated
	 */
	void unsetResourceIdentifier();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resource Identifier</em>' attribute is set.
	 * @see #unsetResourceIdentifier()
	 * @see #getResourceIdentifier()
	 * @see #setResourceIdentifier(String)
	 * @generated
	 */
	boolean isSetResourceIdentifier();

	/**
	 * Returns the value of the '<em><b>Resource Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group</em>' attribute.
	 * @see #isSetResourceGroup()
	 * @see #unsetResourceGroup()
	 * @see #setResourceGroup(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstructionResource_ResourceGroup()
	 * @model unsettable="true"
	 * @generated
	 */
	String getResourceGroup();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Group</em>' attribute.
	 * @see #isSetResourceGroup()
	 * @see #unsetResourceGroup()
	 * @see #getResourceGroup()
	 * @generated
	 */
	void setResourceGroup(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResourceGroup()
	 * @see #getResourceGroup()
	 * @see #setResourceGroup(String)
	 * @generated
	 */
	void unsetResourceGroup();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resource Group</em>' attribute is set.
	 * @see #unsetResourceGroup()
	 * @see #getResourceGroup()
	 * @see #setResourceGroup(String)
	 * @generated
	 */
	boolean isSetResourceGroup();

	/**
	 * Returns the value of the '<em><b>Resource Consumption</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcResourceConsumptionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Consumption</em>' attribute.
	 * @see ifc2x3tc1.IfcResourceConsumptionEnum
	 * @see #isSetResourceConsumption()
	 * @see #unsetResourceConsumption()
	 * @see #setResourceConsumption(IfcResourceConsumptionEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstructionResource_ResourceConsumption()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcResourceConsumptionEnum getResourceConsumption();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConstructionResource#getResourceConsumption <em>Resource Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Consumption</em>' attribute.
	 * @see ifc2x3tc1.IfcResourceConsumptionEnum
	 * @see #isSetResourceConsumption()
	 * @see #unsetResourceConsumption()
	 * @see #getResourceConsumption()
	 * @generated
	 */
	void setResourceConsumption(IfcResourceConsumptionEnum value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcConstructionResource#getResourceConsumption <em>Resource Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResourceConsumption()
	 * @see #getResourceConsumption()
	 * @see #setResourceConsumption(IfcResourceConsumptionEnum)
	 * @generated
	 */
	void unsetResourceConsumption();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcConstructionResource#getResourceConsumption <em>Resource Consumption</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resource Consumption</em>' attribute is set.
	 * @see #unsetResourceConsumption()
	 * @see #getResourceConsumption()
	 * @see #setResourceConsumption(IfcResourceConsumptionEnum)
	 * @generated
	 */
	boolean isSetResourceConsumption();

	/**
	 * Returns the value of the '<em><b>Base Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Quantity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Quantity</em>' reference.
	 * @see #isSetBaseQuantity()
	 * @see #unsetBaseQuantity()
	 * @see #setBaseQuantity(IfcMeasureWithUnit)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstructionResource_BaseQuantity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMeasureWithUnit getBaseQuantity();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Quantity</em>' reference.
	 * @see #isSetBaseQuantity()
	 * @see #unsetBaseQuantity()
	 * @see #getBaseQuantity()
	 * @generated
	 */
	void setBaseQuantity(IfcMeasureWithUnit value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseQuantity()
	 * @see #getBaseQuantity()
	 * @see #setBaseQuantity(IfcMeasureWithUnit)
	 * @generated
	 */
	void unsetBaseQuantity();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Quantity</em>' reference is set.
	 * @see #unsetBaseQuantity()
	 * @see #getBaseQuantity()
	 * @see #setBaseQuantity(IfcMeasureWithUnit)
	 * @generated
	 */
	boolean isSetBaseQuantity();

} // IfcConstructionResource
