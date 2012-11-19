/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySingleValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.NominalValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Single Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertySingleValueImpl#getNominalValue <em>Nominal Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertySingleValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertySingleValueImpl extends IfcSimplePropertyImpl implements IfcPropertySingleValue {
	/**
	 * The cached value of the '{@link #getNominalValue() <em>Nominal Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalValue()
	 * @generated
	 * @ordered
	 */
	protected NominalValueType nominalValue;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertySingleValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPropertySingleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NominalValueType getNominalValue() {
		return nominalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNominalValue(NominalValueType newNominalValue, NotificationChain msgs) {
		NominalValueType oldNominalValue = nominalValue;
		nominalValue = newNominalValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE, oldNominalValue, newNominalValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalValue(NominalValueType newNominalValue) {
		if (newNominalValue != nominalValue) {
			NotificationChain msgs = null;
			if (nominalValue != null)
				msgs = ((InternalEObject)nominalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE, null, msgs);
			if (newNominalValue != null)
				msgs = ((InternalEObject)newNominalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE, null, msgs);
			msgs = basicSetNominalValue(newNominalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE, newNominalValue, newNominalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(UnitType newUnit, NotificationChain msgs) {
		UnitType oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_SINGLE_VALUE__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitType newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_SINGLE_VALUE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_SINGLE_VALUE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_SINGLE_VALUE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE:
				return basicSetNominalValue(null, msgs);
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__UNIT:
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
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE:
				return getNominalValue();
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__UNIT:
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
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE:
				setNominalValue((NominalValueType)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__UNIT:
				setUnit((UnitType)newValue);
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
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE:
				setNominalValue((NominalValueType)null);
				return;
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__UNIT:
				setUnit((UnitType)null);
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
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE:
				return nominalValue != null;
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE__UNIT:
				return unit != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcPropertySingleValueImpl
