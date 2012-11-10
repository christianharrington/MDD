/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPropertyBoundedValue;
import ifc2x3tc1.IfcUnit;
import ifc2x3tc1.IfcValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Bounded Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyBoundedValueImpl#getUpperBoundValue <em>Upper Bound Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyBoundedValueImpl#getLowerBoundValue <em>Lower Bound Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyBoundedValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyBoundedValueImpl extends IfcSimplePropertyImpl implements IfcPropertyBoundedValue {
	/**
	 * The cached value of the '{@link #getUpperBoundValue() <em>Upper Bound Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundValue()
	 * @generated
	 * @ordered
	 */
	protected IfcValue upperBoundValue;

	/**
	 * This is true if the Upper Bound Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean upperBoundValueESet;

	/**
	 * The cached value of the '{@link #getLowerBoundValue() <em>Lower Bound Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBoundValue()
	 * @generated
	 * @ordered
	 */
	protected IfcValue lowerBoundValue;

	/**
	 * This is true if the Lower Bound Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowerBoundValueESet;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcUnit unit;

	/**
	 * This is true if the Unit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPropertyBoundedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getUpperBoundValue() {
		if (upperBoundValue != null && upperBoundValue.eIsProxy()) {
			InternalEObject oldUpperBoundValue = (InternalEObject)upperBoundValue;
			upperBoundValue = (IfcValue)eResolveProxy(oldUpperBoundValue);
			if (upperBoundValue != oldUpperBoundValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE, oldUpperBoundValue, upperBoundValue));
			}
		}
		return upperBoundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue basicGetUpperBoundValue() {
		return upperBoundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBoundValue(IfcValue newUpperBoundValue) {
		IfcValue oldUpperBoundValue = upperBoundValue;
		upperBoundValue = newUpperBoundValue;
		boolean oldUpperBoundValueESet = upperBoundValueESet;
		upperBoundValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE, oldUpperBoundValue, upperBoundValue, !oldUpperBoundValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpperBoundValue() {
		IfcValue oldUpperBoundValue = upperBoundValue;
		boolean oldUpperBoundValueESet = upperBoundValueESet;
		upperBoundValue = null;
		upperBoundValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE, oldUpperBoundValue, null, oldUpperBoundValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpperBoundValue() {
		return upperBoundValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getLowerBoundValue() {
		if (lowerBoundValue != null && lowerBoundValue.eIsProxy()) {
			InternalEObject oldLowerBoundValue = (InternalEObject)lowerBoundValue;
			lowerBoundValue = (IfcValue)eResolveProxy(oldLowerBoundValue);
			if (lowerBoundValue != oldLowerBoundValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE, oldLowerBoundValue, lowerBoundValue));
			}
		}
		return lowerBoundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue basicGetLowerBoundValue() {
		return lowerBoundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBoundValue(IfcValue newLowerBoundValue) {
		IfcValue oldLowerBoundValue = lowerBoundValue;
		lowerBoundValue = newLowerBoundValue;
		boolean oldLowerBoundValueESet = lowerBoundValueESet;
		lowerBoundValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE, oldLowerBoundValue, lowerBoundValue, !oldLowerBoundValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerBoundValue() {
		IfcValue oldLowerBoundValue = lowerBoundValue;
		boolean oldLowerBoundValueESet = lowerBoundValueESet;
		lowerBoundValue = null;
		lowerBoundValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE, oldLowerBoundValue, null, oldLowerBoundValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerBoundValue() {
		return lowerBoundValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (IfcUnit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(IfcUnit newUnit) {
		IfcUnit oldUnit = unit;
		unit = newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UNIT, oldUnit, unit, !oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		IfcUnit oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = null;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UNIT, oldUnit, null, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE:
				if (resolve) return getUpperBoundValue();
				return basicGetUpperBoundValue();
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE:
				if (resolve) return getLowerBoundValue();
				return basicGetLowerBoundValue();
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE:
				setUpperBoundValue((IfcValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE:
				setLowerBoundValue((IfcValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UNIT:
				setUnit((IfcUnit)newValue);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE:
				unsetUpperBoundValue();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE:
				unsetLowerBoundValue();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UNIT:
				unsetUnit();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UPPER_BOUND_VALUE:
				return isSetUpperBoundValue();
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__LOWER_BOUND_VALUE:
				return isSetLowerBoundValue();
			case Ifc2x3tc1Package.IFC_PROPERTY_BOUNDED_VALUE__UNIT:
				return isSetUnit();
		}
		return super.eIsSet(featureID);
	}

} //IfcPropertyBoundedValueImpl
