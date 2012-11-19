/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Construction Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionResource#getResourceConsumption <em>Resource Consumption</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstructionResource()
 * @model abstract="true"
 *        extendedMetaData="name='IfcConstructionResource' kind='elementOnly'"
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
	 * @see #setResourceIdentifier(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstructionResource_ResourceIdentifier()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIdentifier"
	 *        extendedMetaData="kind='element' name='ResourceIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceIdentifier();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Identifier</em>' attribute.
	 * @see #getResourceIdentifier()
	 * @generated
	 */
	void setResourceIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Resource Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group</em>' attribute.
	 * @see #setResourceGroup(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstructionResource_ResourceGroup()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='ResourceGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResourceGroup();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Group</em>' attribute.
	 * @see #getResourceGroup()
	 * @generated
	 */
	void setResourceGroup(String value);

	/**
	 * Returns the value of the '<em><b>Resource Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Consumption</em>' attribute.
	 * @see #setResourceConsumption(IfcResourceConsumptionEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstructionResource_ResourceConsumption()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcResourceConsumptionEnumObject"
	 *        extendedMetaData="kind='element' name='ResourceConsumption' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcResourceConsumptionEnum getResourceConsumption();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionResource#getResourceConsumption <em>Resource Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Consumption</em>' attribute.
	 * @see #getResourceConsumption()
	 * @generated
	 */
	void setResourceConsumption(IfcResourceConsumptionEnum value);

	/**
	 * Returns the value of the '<em><b>Base Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Quantity</em>' containment reference.
	 * @see #setBaseQuantity(BaseQuantityType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstructionResource_BaseQuantity()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BaseQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseQuantityType getBaseQuantity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Quantity</em>' containment reference.
	 * @see #getBaseQuantity()
	 * @generated
	 */
	void setBaseQuantity(BaseQuantityType value);

} // IfcConstructionResource
