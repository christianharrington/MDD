/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMeasureWithUnit;
import ifc2x3tc1.IfcUnit;
import ifc2x3tc1.IfcValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Measure With Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMeasureWithUnitImpl#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMeasureWithUnitImpl#getUnitComponent <em>Unit Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMeasureWithUnitImpl extends EObjectImpl implements IfcMeasureWithUnit {
	/**
	 * The cached value of the '{@link #getValueComponent() <em>Value Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComponent()
	 * @generated
	 * @ordered
	 */
	protected IfcValue valueComponent;

	/**
	 * The cached value of the '{@link #getUnitComponent() <em>Unit Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitComponent()
	 * @generated
	 * @ordered
	 */
	protected IfcUnit unitComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMeasureWithUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMeasureWithUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getValueComponent() {
		if (valueComponent != null && valueComponent.eIsProxy()) {
			InternalEObject oldValueComponent = (InternalEObject)valueComponent;
			valueComponent = (IfcValue)eResolveProxy(oldValueComponent);
			if (valueComponent != oldValueComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT, oldValueComponent, valueComponent));
			}
		}
		return valueComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue basicGetValueComponent() {
		return valueComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueComponent(IfcValue newValueComponent) {
		IfcValue oldValueComponent = valueComponent;
		valueComponent = newValueComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT, oldValueComponent, valueComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getUnitComponent() {
		if (unitComponent != null && unitComponent.eIsProxy()) {
			InternalEObject oldUnitComponent = (InternalEObject)unitComponent;
			unitComponent = (IfcUnit)eResolveProxy(oldUnitComponent);
			if (unitComponent != oldUnitComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT, oldUnitComponent, unitComponent));
			}
		}
		return unitComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit basicGetUnitComponent() {
		return unitComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitComponent(IfcUnit newUnitComponent) {
		IfcUnit oldUnitComponent = unitComponent;
		unitComponent = newUnitComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT, oldUnitComponent, unitComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT:
				if (resolve) return getValueComponent();
				return basicGetValueComponent();
			case Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT:
				if (resolve) return getUnitComponent();
				return basicGetUnitComponent();
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
			case Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT:
				setValueComponent((IfcValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT:
				setUnitComponent((IfcUnit)newValue);
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
			case Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT:
				setValueComponent((IfcValue)null);
				return;
			case Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT:
				setUnitComponent((IfcUnit)null);
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
			case Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__VALUE_COMPONENT:
				return valueComponent != null;
			case Ifc2x3tc1Package.IFC_MEASURE_WITH_UNIT__UNIT_COMPONENT:
				return unitComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcMeasureWithUnitImpl
