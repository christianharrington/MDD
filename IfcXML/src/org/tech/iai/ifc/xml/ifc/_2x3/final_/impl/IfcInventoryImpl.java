/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CurrentValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventory;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInventoryTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.JurisdictionType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LastUpdateDateType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OriginalValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ResponsiblePersonsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcInventoryImpl#getInventoryType <em>Inventory Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcInventoryImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcInventoryImpl#getResponsiblePersons <em>Responsible Persons</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcInventoryImpl#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcInventoryImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcInventoryImpl#getOriginalValue <em>Original Value</em>}</li>
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
	protected static final IfcInventoryTypeEnum INVENTORY_TYPE_EDEFAULT = IfcInventoryTypeEnum.ASSETINVENTORY;

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
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected JurisdictionType jurisdiction;

	/**
	 * The cached value of the '{@link #getResponsiblePersons() <em>Responsible Persons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePersons()
	 * @generated
	 * @ordered
	 */
	protected ResponsiblePersonsType responsiblePersons;

	/**
	 * The cached value of the '{@link #getLastUpdateDate() <em>Last Update Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected LastUpdateDateType lastUpdateDate;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected CurrentValueType currentValue;

	/**
	 * The cached value of the '{@link #getOriginalValue() <em>Original Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalValue()
	 * @generated
	 * @ordered
	 */
	protected OriginalValueType originalValue;

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
		return FinalPackage.eINSTANCE.getIfcInventory();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__INVENTORY_TYPE, oldInventoryType, inventoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JurisdictionType getJurisdiction() {
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJurisdiction(JurisdictionType newJurisdiction, NotificationChain msgs) {
		JurisdictionType oldJurisdiction = jurisdiction;
		jurisdiction = newJurisdiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__JURISDICTION, oldJurisdiction, newJurisdiction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJurisdiction(JurisdictionType newJurisdiction) {
		if (newJurisdiction != jurisdiction) {
			NotificationChain msgs = null;
			if (jurisdiction != null)
				msgs = ((InternalEObject)jurisdiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__JURISDICTION, null, msgs);
			if (newJurisdiction != null)
				msgs = ((InternalEObject)newJurisdiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__JURISDICTION, null, msgs);
			msgs = basicSetJurisdiction(newJurisdiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__JURISDICTION, newJurisdiction, newJurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsiblePersonsType getResponsiblePersons() {
		return responsiblePersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsiblePersons(ResponsiblePersonsType newResponsiblePersons, NotificationChain msgs) {
		ResponsiblePersonsType oldResponsiblePersons = responsiblePersons;
		responsiblePersons = newResponsiblePersons;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__RESPONSIBLE_PERSONS, oldResponsiblePersons, newResponsiblePersons);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsiblePersons(ResponsiblePersonsType newResponsiblePersons) {
		if (newResponsiblePersons != responsiblePersons) {
			NotificationChain msgs = null;
			if (responsiblePersons != null)
				msgs = ((InternalEObject)responsiblePersons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__RESPONSIBLE_PERSONS, null, msgs);
			if (newResponsiblePersons != null)
				msgs = ((InternalEObject)newResponsiblePersons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__RESPONSIBLE_PERSONS, null, msgs);
			msgs = basicSetResponsiblePersons(newResponsiblePersons, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__RESPONSIBLE_PERSONS, newResponsiblePersons, newResponsiblePersons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastUpdateDateType getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastUpdateDate(LastUpdateDateType newLastUpdateDate, NotificationChain msgs) {
		LastUpdateDateType oldLastUpdateDate = lastUpdateDate;
		lastUpdateDate = newLastUpdateDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__LAST_UPDATE_DATE, oldLastUpdateDate, newLastUpdateDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdateDate(LastUpdateDateType newLastUpdateDate) {
		if (newLastUpdateDate != lastUpdateDate) {
			NotificationChain msgs = null;
			if (lastUpdateDate != null)
				msgs = ((InternalEObject)lastUpdateDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__LAST_UPDATE_DATE, null, msgs);
			if (newLastUpdateDate != null)
				msgs = ((InternalEObject)newLastUpdateDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__LAST_UPDATE_DATE, null, msgs);
			msgs = basicSetLastUpdateDate(newLastUpdateDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__LAST_UPDATE_DATE, newLastUpdateDate, newLastUpdateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentValueType getCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentValue(CurrentValueType newCurrentValue, NotificationChain msgs) {
		CurrentValueType oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__CURRENT_VALUE, oldCurrentValue, newCurrentValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(CurrentValueType newCurrentValue) {
		if (newCurrentValue != currentValue) {
			NotificationChain msgs = null;
			if (currentValue != null)
				msgs = ((InternalEObject)currentValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__CURRENT_VALUE, null, msgs);
			if (newCurrentValue != null)
				msgs = ((InternalEObject)newCurrentValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__CURRENT_VALUE, null, msgs);
			msgs = basicSetCurrentValue(newCurrentValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__CURRENT_VALUE, newCurrentValue, newCurrentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginalValueType getOriginalValue() {
		return originalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalValue(OriginalValueType newOriginalValue, NotificationChain msgs) {
		OriginalValueType oldOriginalValue = originalValue;
		originalValue = newOriginalValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__ORIGINAL_VALUE, oldOriginalValue, newOriginalValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalValue(OriginalValueType newOriginalValue) {
		if (newOriginalValue != originalValue) {
			NotificationChain msgs = null;
			if (originalValue != null)
				msgs = ((InternalEObject)originalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__ORIGINAL_VALUE, null, msgs);
			if (newOriginalValue != null)
				msgs = ((InternalEObject)newOriginalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_INVENTORY__ORIGINAL_VALUE, null, msgs);
			msgs = basicSetOriginalValue(newOriginalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_INVENTORY__ORIGINAL_VALUE, newOriginalValue, newOriginalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_INVENTORY__JURISDICTION:
				return basicSetJurisdiction(null, msgs);
			case FinalPackage.IFC_INVENTORY__RESPONSIBLE_PERSONS:
				return basicSetResponsiblePersons(null, msgs);
			case FinalPackage.IFC_INVENTORY__LAST_UPDATE_DATE:
				return basicSetLastUpdateDate(null, msgs);
			case FinalPackage.IFC_INVENTORY__CURRENT_VALUE:
				return basicSetCurrentValue(null, msgs);
			case FinalPackage.IFC_INVENTORY__ORIGINAL_VALUE:
				return basicSetOriginalValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_INVENTORY__INVENTORY_TYPE:
				return getInventoryType();
			case FinalPackage.IFC_INVENTORY__JURISDICTION:
				return getJurisdiction();
			case FinalPackage.IFC_INVENTORY__RESPONSIBLE_PERSONS:
				return getResponsiblePersons();
			case FinalPackage.IFC_INVENTORY__LAST_UPDATE_DATE:
				return getLastUpdateDate();
			case FinalPackage.IFC_INVENTORY__CURRENT_VALUE:
				return getCurrentValue();
			case FinalPackage.IFC_INVENTORY__ORIGINAL_VALUE:
				return getOriginalValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinalPackage.IFC_INVENTORY__INVENTORY_TYPE:
				setInventoryType((IfcInventoryTypeEnum)newValue);
				return;
			case FinalPackage.IFC_INVENTORY__JURISDICTION:
				setJurisdiction((JurisdictionType)newValue);
				return;
			case FinalPackage.IFC_INVENTORY__RESPONSIBLE_PERSONS:
				setResponsiblePersons((ResponsiblePersonsType)newValue);
				return;
			case FinalPackage.IFC_INVENTORY__LAST_UPDATE_DATE:
				setLastUpdateDate((LastUpdateDateType)newValue);
				return;
			case FinalPackage.IFC_INVENTORY__CURRENT_VALUE:
				setCurrentValue((CurrentValueType)newValue);
				return;
			case FinalPackage.IFC_INVENTORY__ORIGINAL_VALUE:
				setOriginalValue((OriginalValueType)newValue);
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
			case FinalPackage.IFC_INVENTORY__INVENTORY_TYPE:
				setInventoryType(INVENTORY_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_INVENTORY__JURISDICTION:
				setJurisdiction((JurisdictionType)null);
				return;
			case FinalPackage.IFC_INVENTORY__RESPONSIBLE_PERSONS:
				setResponsiblePersons((ResponsiblePersonsType)null);
				return;
			case FinalPackage.IFC_INVENTORY__LAST_UPDATE_DATE:
				setLastUpdateDate((LastUpdateDateType)null);
				return;
			case FinalPackage.IFC_INVENTORY__CURRENT_VALUE:
				setCurrentValue((CurrentValueType)null);
				return;
			case FinalPackage.IFC_INVENTORY__ORIGINAL_VALUE:
				setOriginalValue((OriginalValueType)null);
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
			case FinalPackage.IFC_INVENTORY__INVENTORY_TYPE:
				return inventoryType != INVENTORY_TYPE_EDEFAULT;
			case FinalPackage.IFC_INVENTORY__JURISDICTION:
				return jurisdiction != null;
			case FinalPackage.IFC_INVENTORY__RESPONSIBLE_PERSONS:
				return responsiblePersons != null;
			case FinalPackage.IFC_INVENTORY__LAST_UPDATE_DATE:
				return lastUpdateDate != null;
			case FinalPackage.IFC_INVENTORY__CURRENT_VALUE:
				return currentValue != null;
			case FinalPackage.IFC_INVENTORY__ORIGINAL_VALUE:
				return originalValue != null;
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
		result.append(" (inventoryType: ");
		result.append(inventoryType);
		result.append(')');
		return result.toString();
	}

} //IfcInventoryImpl
