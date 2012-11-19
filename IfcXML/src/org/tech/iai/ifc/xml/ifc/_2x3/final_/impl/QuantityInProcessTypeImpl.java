/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMeasureWithUnit;
import org.tech.iai.ifc.xml.ifc._2x3.final_.QuantityInProcessType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity In Process Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.QuantityInProcessTypeImpl#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantityInProcessTypeImpl extends EObjectImpl implements QuantityInProcessType {
	/**
	 * The cached value of the '{@link #getIfcMeasureWithUnit() <em>Ifc Measure With Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMeasureWithUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcMeasureWithUnit ifcMeasureWithUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityInProcessTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getQuantityInProcessType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getIfcMeasureWithUnit() {
		return ifcMeasureWithUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMeasureWithUnit(IfcMeasureWithUnit newIfcMeasureWithUnit, NotificationChain msgs) {
		IfcMeasureWithUnit oldIfcMeasureWithUnit = ifcMeasureWithUnit;
		ifcMeasureWithUnit = newIfcMeasureWithUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.QUANTITY_IN_PROCESS_TYPE__IFC_MEASURE_WITH_UNIT, oldIfcMeasureWithUnit, newIfcMeasureWithUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMeasureWithUnit(IfcMeasureWithUnit newIfcMeasureWithUnit) {
		if (newIfcMeasureWithUnit != ifcMeasureWithUnit) {
			NotificationChain msgs = null;
			if (ifcMeasureWithUnit != null)
				msgs = ((InternalEObject)ifcMeasureWithUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.QUANTITY_IN_PROCESS_TYPE__IFC_MEASURE_WITH_UNIT, null, msgs);
			if (newIfcMeasureWithUnit != null)
				msgs = ((InternalEObject)newIfcMeasureWithUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.QUANTITY_IN_PROCESS_TYPE__IFC_MEASURE_WITH_UNIT, null, msgs);
			msgs = basicSetIfcMeasureWithUnit(newIfcMeasureWithUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.QUANTITY_IN_PROCESS_TYPE__IFC_MEASURE_WITH_UNIT, newIfcMeasureWithUnit, newIfcMeasureWithUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.QUANTITY_IN_PROCESS_TYPE__IFC_MEASURE_WITH_UNIT:
				return basicSetIfcMeasureWithUnit(null, msgs);
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
			case FinalPackage.QUANTITY_IN_PROCESS_TYPE__IFC_MEASURE_WITH_UNIT:
				return getIfcMeasureWithUnit();
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
			case FinalPackage.QUANTITY_IN_PROCESS_TYPE__IFC_MEASURE_WITH_UNIT:
				setIfcMeasureWithUnit((IfcMeasureWithUnit)newValue);
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
			case FinalPackage.QUANTITY_IN_PROCESS_TYPE__IFC_MEASURE_WITH_UNIT:
				setIfcMeasureWithUnit((IfcMeasureWithUnit)null);
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
			case FinalPackage.QUANTITY_IN_PROCESS_TYPE__IFC_MEASURE_WITH_UNIT:
				return ifcMeasureWithUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //QuantityInProcessTypeImpl
