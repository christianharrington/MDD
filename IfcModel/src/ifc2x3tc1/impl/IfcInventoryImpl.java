/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorSelect;
import ifc2x3tc1.IfcCalendarDate;
import ifc2x3tc1.IfcCostValue;
import ifc2x3tc1.IfcInventory;
import ifc2x3tc1.IfcInventoryTypeEnum;
import ifc2x3tc1.IfcPerson;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcInventoryImpl#getInventoryType <em>Inventory Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcInventoryImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcInventoryImpl#getResponsiblePersons <em>Responsible Persons</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcInventoryImpl#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcInventoryImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcInventoryImpl#getOriginalValue <em>Original Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcInventoryImpl extends IfcGroupImpl implements IfcInventory {
	/**
	 * The default value of the '{@link #getInventoryType() <em>Inventory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcInventoryTypeEnum INVENTORY_TYPE_EDEFAULT = IfcInventoryTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getInventoryType() <em>Inventory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryType()
	 * @generated
	 * @ordered
	 */
	protected IfcInventoryTypeEnum inventoryType = INVENTORY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect jurisdiction;

	/**
	 * The cached value of the '{@link #getResponsiblePersons() <em>Responsible Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePersons()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPerson> responsiblePersons;

	/**
	 * The cached value of the '{@link #getLastUpdateDate() <em>Last Update Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected IfcCalendarDate lastUpdateDate;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected IfcCostValue currentValue;

	/**
	 * This is true if the Current Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean currentValueESet;

	/**
	 * The cached value of the '{@link #getOriginalValue() <em>Original Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalValue()
	 * @generated
	 * @ordered
	 */
	protected IfcCostValue originalValue;

	/**
	 * This is true if the Original Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean originalValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcInventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcInventory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInventoryTypeEnum getInventoryType() {
		return inventoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventoryType(IfcInventoryTypeEnum newInventoryType) {
		IfcInventoryTypeEnum oldInventoryType = inventoryType;
		inventoryType = newInventoryType == null ? INVENTORY_TYPE_EDEFAULT : newInventoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_INVENTORY__INVENTORY_TYPE, oldInventoryType, inventoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getJurisdiction() {
		if (jurisdiction != null && jurisdiction.eIsProxy()) {
			InternalEObject oldJurisdiction = (InternalEObject)jurisdiction;
			jurisdiction = (IfcActorSelect)eResolveProxy(oldJurisdiction);
			if (jurisdiction != oldJurisdiction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_INVENTORY__JURISDICTION, oldJurisdiction, jurisdiction));
			}
		}
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetJurisdiction() {
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJurisdiction(IfcActorSelect newJurisdiction) {
		IfcActorSelect oldJurisdiction = jurisdiction;
		jurisdiction = newJurisdiction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_INVENTORY__JURISDICTION, oldJurisdiction, jurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPerson> getResponsiblePersons() {
		if (responsiblePersons == null) {
			responsiblePersons = new EObjectResolvingEList<IfcPerson>(IfcPerson.class, this, Ifc2x3tc1Package.IFC_INVENTORY__RESPONSIBLE_PERSONS);
		}
		return responsiblePersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getLastUpdateDate() {
		if (lastUpdateDate != null && lastUpdateDate.eIsProxy()) {
			InternalEObject oldLastUpdateDate = (InternalEObject)lastUpdateDate;
			lastUpdateDate = (IfcCalendarDate)eResolveProxy(oldLastUpdateDate);
			if (lastUpdateDate != oldLastUpdateDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_INVENTORY__LAST_UPDATE_DATE, oldLastUpdateDate, lastUpdateDate));
			}
		}
		return lastUpdateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate basicGetLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdateDate(IfcCalendarDate newLastUpdateDate) {
		IfcCalendarDate oldLastUpdateDate = lastUpdateDate;
		lastUpdateDate = newLastUpdateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_INVENTORY__LAST_UPDATE_DATE, oldLastUpdateDate, lastUpdateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getCurrentValue() {
		if (currentValue != null && currentValue.eIsProxy()) {
			InternalEObject oldCurrentValue = (InternalEObject)currentValue;
			currentValue = (IfcCostValue)eResolveProxy(oldCurrentValue);
			if (currentValue != oldCurrentValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_INVENTORY__CURRENT_VALUE, oldCurrentValue, currentValue));
			}
		}
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue basicGetCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(IfcCostValue newCurrentValue) {
		IfcCostValue oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		boolean oldCurrentValueESet = currentValueESet;
		currentValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_INVENTORY__CURRENT_VALUE, oldCurrentValue, currentValue, !oldCurrentValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurrentValue() {
		IfcCostValue oldCurrentValue = currentValue;
		boolean oldCurrentValueESet = currentValueESet;
		currentValue = null;
		currentValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_INVENTORY__CURRENT_VALUE, oldCurrentValue, null, oldCurrentValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurrentValue() {
		return currentValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getOriginalValue() {
		if (originalValue != null && originalValue.eIsProxy()) {
			InternalEObject oldOriginalValue = (InternalEObject)originalValue;
			originalValue = (IfcCostValue)eResolveProxy(oldOriginalValue);
			if (originalValue != oldOriginalValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_INVENTORY__ORIGINAL_VALUE, oldOriginalValue, originalValue));
			}
		}
		return originalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue basicGetOriginalValue() {
		return originalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalValue(IfcCostValue newOriginalValue) {
		IfcCostValue oldOriginalValue = originalValue;
		originalValue = newOriginalValue;
		boolean oldOriginalValueESet = originalValueESet;
		originalValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_INVENTORY__ORIGINAL_VALUE, oldOriginalValue, originalValue, !oldOriginalValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOriginalValue() {
		IfcCostValue oldOriginalValue = originalValue;
		boolean oldOriginalValueESet = originalValueESet;
		originalValue = null;
		originalValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_INVENTORY__ORIGINAL_VALUE, oldOriginalValue, null, oldOriginalValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOriginalValue() {
		return originalValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_INVENTORY__INVENTORY_TYPE:
				return getInventoryType();
			case Ifc2x3tc1Package.IFC_INVENTORY__JURISDICTION:
				if (resolve) return getJurisdiction();
				return basicGetJurisdiction();
			case Ifc2x3tc1Package.IFC_INVENTORY__RESPONSIBLE_PERSONS:
				return getResponsiblePersons();
			case Ifc2x3tc1Package.IFC_INVENTORY__LAST_UPDATE_DATE:
				if (resolve) return getLastUpdateDate();
				return basicGetLastUpdateDate();
			case Ifc2x3tc1Package.IFC_INVENTORY__CURRENT_VALUE:
				if (resolve) return getCurrentValue();
				return basicGetCurrentValue();
			case Ifc2x3tc1Package.IFC_INVENTORY__ORIGINAL_VALUE:
				if (resolve) return getOriginalValue();
				return basicGetOriginalValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_INVENTORY__INVENTORY_TYPE:
				setInventoryType((IfcInventoryTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__JURISDICTION:
				setJurisdiction((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__RESPONSIBLE_PERSONS:
				getResponsiblePersons().clear();
				getResponsiblePersons().addAll((Collection<? extends IfcPerson>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__LAST_UPDATE_DATE:
				setLastUpdateDate((IfcCalendarDate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__CURRENT_VALUE:
				setCurrentValue((IfcCostValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__ORIGINAL_VALUE:
				setOriginalValue((IfcCostValue)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_INVENTORY__INVENTORY_TYPE:
				setInventoryType(INVENTORY_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__JURISDICTION:
				setJurisdiction((IfcActorSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__RESPONSIBLE_PERSONS:
				getResponsiblePersons().clear();
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__LAST_UPDATE_DATE:
				setLastUpdateDate((IfcCalendarDate)null);
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__CURRENT_VALUE:
				unsetCurrentValue();
				return;
			case Ifc2x3tc1Package.IFC_INVENTORY__ORIGINAL_VALUE:
				unsetOriginalValue();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_INVENTORY__INVENTORY_TYPE:
				return inventoryType != INVENTORY_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_INVENTORY__JURISDICTION:
				return jurisdiction != null;
			case Ifc2x3tc1Package.IFC_INVENTORY__RESPONSIBLE_PERSONS:
				return responsiblePersons != null && !responsiblePersons.isEmpty();
			case Ifc2x3tc1Package.IFC_INVENTORY__LAST_UPDATE_DATE:
				return lastUpdateDate != null;
			case Ifc2x3tc1Package.IFC_INVENTORY__CURRENT_VALUE:
				return isSetCurrentValue();
			case Ifc2x3tc1Package.IFC_INVENTORY__ORIGINAL_VALUE:
				return isSetOriginalValue();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (InventoryType: ");
		result.append(inventoryType);
		result.append(')');
		return result.toString();
	}

} //IfcInventoryImpl
