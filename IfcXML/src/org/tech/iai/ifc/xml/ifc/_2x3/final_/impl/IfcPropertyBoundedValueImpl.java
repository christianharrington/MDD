/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyBoundedValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LowerBoundValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType3;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UpperBoundValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Bounded Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyBoundedValueImpl#getUpperBoundValue <em>Upper Bound Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyBoundedValueImpl#getLowerBoundValue <em>Lower Bound Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyBoundedValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyBoundedValueImpl extends IfcSimplePropertyImpl implements IfcPropertyBoundedValue {
	/**
	 * The cached value of the '{@link #getUpperBoundValue() <em>Upper Bound Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundValue()
	 * @generated
	 * @ordered
	 */
	protected UpperBoundValueType upperBoundValue;

	/**
	 * The cached value of the '{@link #getLowerBoundValue() <em>Lower Bound Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBoundValue()
	 * @generated
	 * @ordered
	 */
	protected LowerBoundValueType lowerBoundValue;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType3 unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyBoundedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPropertyBoundedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundValueType getUpperBoundValue() {
		return upperBoundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBoundValue(UpperBoundValueType newUpperBoundValue, NotificationChain msgs) {
		UpperBoundValueType oldUpperBoundValue = upperBoundValue;
		upperBoundValue = newUpperBoundValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE, oldUpperBoundValue, newUpperBoundValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBoundValue(UpperBoundValueType newUpperBoundValue) {
		if (newUpperBoundValue != upperBoundValue) {
			NotificationChain msgs = null;
			if (upperBoundValue != null)
				msgs = ((InternalEObject)upperBoundValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE, null, msgs);
			if (newUpperBoundValue != null)
				msgs = ((InternalEObject)newUpperBoundValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE, null, msgs);
			msgs = basicSetUpperBoundValue(newUpperBoundValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE, newUpperBoundValue, newUpperBoundValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerBoundValueType getLowerBoundValue() {
		return lowerBoundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerBoundValue(LowerBoundValueType newLowerBoundValue, NotificationChain msgs) {
		LowerBoundValueType oldLowerBoundValue = lowerBoundValue;
		lowerBoundValue = newLowerBoundValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE, oldLowerBoundValue, newLowerBoundValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBoundValue(LowerBoundValueType newLowerBoundValue) {
		if (newLowerBoundValue != lowerBoundValue) {
			NotificationChain msgs = null;
			if (lowerBoundValue != null)
				msgs = ((InternalEObject)lowerBoundValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE, null, msgs);
			if (newLowerBoundValue != null)
				msgs = ((InternalEObject)newLowerBoundValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE, null, msgs);
			msgs = basicSetLowerBoundValue(newLowerBoundValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE, newLowerBoundValue, newLowerBoundValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType3 getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(UnitType3 newUnit, NotificationChain msgs) {
		UnitType3 oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitType3 newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE:
				return basicSetUpperBoundValue(null, msgs);
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE:
				return basicSetLowerBoundValue(null, msgs);
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UNIT:
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
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE:
				return getUpperBoundValue();
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE:
				return getLowerBoundValue();
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UNIT:
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
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE:
				setUpperBoundValue((UpperBoundValueType)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE:
				setLowerBoundValue((LowerBoundValueType)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UNIT:
				setUnit((UnitType3)newValue);
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
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE:
				setUpperBoundValue((UpperBoundValueType)null);
				return;
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE:
				setLowerBoundValue((LowerBoundValueType)null);
				return;
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UNIT:
				setUnit((UnitType3)null);
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
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE:
				return upperBoundValue != null;
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE:
				return lowerBoundValue != null;
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE__UNIT:
				return unit != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcPropertyBoundedValueImpl
