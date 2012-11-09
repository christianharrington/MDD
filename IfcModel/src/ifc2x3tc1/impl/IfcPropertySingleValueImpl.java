/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPropertySingleValue;
import ifc2x3tc1.IfcUnit;
import ifc2x3tc1.IfcValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Single Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertySingleValueImpl#getNominalValue <em>Nominal Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertySingleValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertySingleValueImpl extends IfcSimplePropertyImpl implements IfcPropertySingleValue {
	/**
	 * The cached value of the '{@link #getNominalValue() <em>Nominal Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalValue()
	 * @generated
	 * @ordered
	 */
	protected IfcValue nominalValue;

	/**
	 * This is true if the Nominal Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalValueESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPropertySingleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getNominalValue() {
		if (nominalValue != null && nominalValue.eIsProxy()) {
			InternalEObject oldNominalValue = (InternalEObject)nominalValue;
			nominalValue = (IfcValue)eResolveProxy(oldNominalValue);
			if (nominalValue != oldNominalValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE, oldNominalValue, nominalValue));
			}
		}
		return nominalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue basicGetNominalValue() {
		return nominalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalValue(IfcValue newNominalValue) {
		IfcValue oldNominalValue = nominalValue;
		nominalValue = newNominalValue;
		boolean oldNominalValueESet = nominalValueESet;
		nominalValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE, oldNominalValue, nominalValue, !oldNominalValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalValue() {
		IfcValue oldNominalValue = nominalValue;
		boolean oldNominalValueESet = nominalValueESet;
		nominalValue = null;
		nominalValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE, oldNominalValue, null, oldNominalValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalValue() {
		return nominalValueESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__UNIT, oldUnit, unit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__UNIT, oldUnit, unit, !oldUnitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__UNIT, oldUnit, null, oldUnitESet));
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE:
				if (resolve) return getNominalValue();
				return basicGetNominalValue();
			case Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__UNIT:
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE:
				setNominalValue((IfcValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__UNIT:
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE:
				unsetNominalValue();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__UNIT:
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
			case Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE:
				return isSetNominalValue();
			case Ifc2x3tc1Package.IFC_PROPERTY_SINGLE_VALUE__UNIT:
				return isSetUnit();
		}
		return super.eIsSet(featureID);
	}

} //IfcPropertySingleValueImpl
