/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getInventoryType <em>Inventory Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getResponsiblePersons <em>Responsible Persons</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getOriginalValue <em>Original Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcInventory()
 * @model extendedMetaData="name='IfcInventory' kind='elementOnly'"
 * @generated
 */
public interface IfcInventory extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Inventory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventoryTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventoryTypeEnum
	 * @see #setInventoryType(IfcInventoryTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcInventory_InventoryType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='InventoryType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcInventoryTypeEnum getInventoryType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getInventoryType <em>Inventory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventoryTypeEnum
	 * @see #getInventoryType()
	 * @generated
	 */
	void setInventoryType(IfcInventoryTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #setJurisdiction(JurisdictionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcInventory_Jurisdiction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	JurisdictionType getJurisdiction();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getJurisdiction <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' containment reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(JurisdictionType value);

	/**
	 * Returns the value of the '<em><b>Responsible Persons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Persons</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Persons</em>' containment reference.
	 * @see #setResponsiblePersons(ResponsiblePersonsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcInventory_ResponsiblePersons()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ResponsiblePersons' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponsiblePersonsType getResponsiblePersons();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getResponsiblePersons <em>Responsible Persons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Persons</em>' containment reference.
	 * @see #getResponsiblePersons()
	 * @generated
	 */
	void setResponsiblePersons(ResponsiblePersonsType value);

	/**
	 * Returns the value of the '<em><b>Last Update Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Update Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update Date</em>' containment reference.
	 * @see #setLastUpdateDate(LastUpdateDateType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcInventory_LastUpdateDate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LastUpdateDate' namespace='##targetNamespace'"
	 * @generated
	 */
	LastUpdateDateType getLastUpdateDate();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getLastUpdateDate <em>Last Update Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update Date</em>' containment reference.
	 * @see #getLastUpdateDate()
	 * @generated
	 */
	void setLastUpdateDate(LastUpdateDateType value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' containment reference.
	 * @see #setCurrentValue(CurrentValueType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcInventory_CurrentValue()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CurrentValue' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrentValueType getCurrentValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getCurrentValue <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' containment reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(CurrentValueType value);

	/**
	 * Returns the value of the '<em><b>Original Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Value</em>' containment reference.
	 * @see #setOriginalValue(OriginalValueType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcInventory_OriginalValue()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='OriginalValue' namespace='##targetNamespace'"
	 * @generated
	 */
	OriginalValueType getOriginalValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory#getOriginalValue <em>Original Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' containment reference.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(OriginalValueType value);

} // IfcInventory
