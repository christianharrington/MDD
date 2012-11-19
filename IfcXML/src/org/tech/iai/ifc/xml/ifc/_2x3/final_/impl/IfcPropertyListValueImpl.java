/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyListValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ListValuesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType5;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property List Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyListValueImpl#getListValues <em>List Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyListValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyListValueImpl extends IfcSimplePropertyImpl implements IfcPropertyListValue {
	/**
	 * The cached value of the '{@link #getListValues() <em>List Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListValues()
	 * @generated
	 * @ordered
	 */
	protected ListValuesType listValues;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType5 unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyListValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPropertyListValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValuesType getListValues() {
		return listValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListValues(ListValuesType newListValues, NotificationChain msgs) {
		ListValuesType oldListValues = listValues;
		listValues = newListValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_LIST_VALUE__LIST_VALUES, oldListValues, newListValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListValues(ListValuesType newListValues) {
		if (newListValues != listValues) {
			NotificationChain msgs = null;
			if (listValues != null)
				msgs = ((InternalEObject)listValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_LIST_VALUE__LIST_VALUES, null, msgs);
			if (newListValues != null)
				msgs = ((InternalEObject)newListValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_LIST_VALUE__LIST_VALUES, null, msgs);
			msgs = basicSetListValues(newListValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_LIST_VALUE__LIST_VALUES, newListValues, newListValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType5 getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(UnitType5 newUnit, NotificationChain msgs) {
		UnitType5 oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_LIST_VALUE__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitType5 newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_LIST_VALUE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_LIST_VALUE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_LIST_VALUE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__LIST_VALUES:
				return basicSetListValues(null, msgs);
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__UNIT:
				return basicSetUnit(null, msgs);
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
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__LIST_VALUES:
				return getListValues();
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__UNIT:
				return getUnit();
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
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__LIST_VALUES:
				setListValues((ListValuesType)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__UNIT:
				setUnit((UnitType5)newValue);
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
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__LIST_VALUES:
				setListValues((ListValuesType)null);
				return;
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__UNIT:
				setUnit((UnitType5)null);
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
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__LIST_VALUES:
				return listValues != null;
			case FinalPackage.IFC_PROPERTY_LIST_VALUE__UNIT:
				return unit != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcPropertyListValueImpl
