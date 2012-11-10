/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Inventory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcInventory#getInventoryType <em>Inventory Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcInventory#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcInventory#getResponsiblePersons <em>Responsible Persons</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcInventory#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcInventory#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcInventory#getOriginalValue <em>Original Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcInventory()
 * @model
 * @generated
 */
public interface IfcInventory extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Inventory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcInventoryTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Type</em>' attribute.
	 * @see ifc2x3tc1.IfcInventoryTypeEnum
	 * @see #setInventoryType(IfcInventoryTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcInventory_InventoryType()
	 * @model
	 * @generated
	 */
	IfcInventoryTypeEnum getInventoryType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcInventory#getInventoryType <em>Inventory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Type</em>' attribute.
	 * @see ifc2x3tc1.IfcInventoryTypeEnum
	 * @see #getInventoryType()
	 * @generated
	 */
	void setInventoryType(IfcInventoryTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' reference.
	 * @see #setJurisdiction(IfcActorSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcInventory_Jurisdiction()
	 * @model
	 * @generated
	 */
	IfcActorSelect getJurisdiction();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcInventory#getJurisdiction <em>Jurisdiction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' reference.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Responsible Persons</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPerson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Persons</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcInventory_ResponsiblePersons()
	 * @model
	 * @generated
	 */
	EList<IfcPerson> getResponsiblePersons();

	/**
	 * Returns the value of the '<em><b>Last Update Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Update Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update Date</em>' reference.
	 * @see #setLastUpdateDate(IfcCalendarDate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcInventory_LastUpdateDate()
	 * @model
	 * @generated
	 */
	IfcCalendarDate getLastUpdateDate();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcInventory#getLastUpdateDate <em>Last Update Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update Date</em>' reference.
	 * @see #getLastUpdateDate()
	 * @generated
	 */
	void setLastUpdateDate(IfcCalendarDate value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' reference.
	 * @see #isSetCurrentValue()
	 * @see #unsetCurrentValue()
	 * @see #setCurrentValue(IfcCostValue)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcInventory_CurrentValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCostValue getCurrentValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcInventory#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' reference.
	 * @see #isSetCurrentValue()
	 * @see #unsetCurrentValue()
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(IfcCostValue value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcInventory#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentValue()
	 * @see #getCurrentValue()
	 * @see #setCurrentValue(IfcCostValue)
	 * @generated
	 */
	void unsetCurrentValue();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcInventory#getCurrentValue <em>Current Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Value</em>' reference is set.
	 * @see #unsetCurrentValue()
	 * @see #getCurrentValue()
	 * @see #setCurrentValue(IfcCostValue)
	 * @generated
	 */
	boolean isSetCurrentValue();

	/**
	 * Returns the value of the '<em><b>Original Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Value</em>' reference.
	 * @see #isSetOriginalValue()
	 * @see #unsetOriginalValue()
	 * @see #setOriginalValue(IfcCostValue)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcInventory_OriginalValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCostValue getOriginalValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcInventory#getOriginalValue <em>Original Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' reference.
	 * @see #isSetOriginalValue()
	 * @see #unsetOriginalValue()
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(IfcCostValue value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcInventory#getOriginalValue <em>Original Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOriginalValue()
	 * @see #getOriginalValue()
	 * @see #setOriginalValue(IfcCostValue)
	 * @generated
	 */
	void unsetOriginalValue();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcInventory#getOriginalValue <em>Original Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Original Value</em>' reference is set.
	 * @see #unsetOriginalValue()
	 * @see #getOriginalValue()
	 * @see #setOriginalValue(IfcCostValue)
	 * @generated
	 */
	boolean isSetOriginalValue();

} // IfcInventory
