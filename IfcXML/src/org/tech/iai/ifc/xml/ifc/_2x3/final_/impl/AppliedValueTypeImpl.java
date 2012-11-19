/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMeasureWithUnit;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMonetaryMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRatioMeasureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applied Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AppliedValueTypeImpl#getIfcRatioMeasure <em>Ifc Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AppliedValueTypeImpl#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AppliedValueTypeImpl#getIfcMonetaryMeasure <em>Ifc Monetary Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppliedValueTypeImpl extends EObjectImpl implements AppliedValueType {
	/**
	 * The cached value of the '{@link #getIfcRatioMeasure() <em>Ifc Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRatioMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcRatioMeasureType ifcRatioMeasure;

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
	 * The cached value of the '{@link #getIfcMonetaryMeasure() <em>Ifc Monetary Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMonetaryMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMonetaryMeasureType ifcMonetaryMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppliedValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getAppliedValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRatioMeasureType getIfcRatioMeasure() {
		return ifcRatioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRatioMeasure(IfcRatioMeasureType newIfcRatioMeasure, NotificationChain msgs) {
		IfcRatioMeasureType oldIfcRatioMeasure = ifcRatioMeasure;
		ifcRatioMeasure = newIfcRatioMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.APPLIED_VALUE_TYPE__IFC_RATIO_MEASURE, oldIfcRatioMeasure, newIfcRatioMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRatioMeasure(IfcRatioMeasureType newIfcRatioMeasure) {
		if (newIfcRatioMeasure != ifcRatioMeasure) {
			NotificationChain msgs = null;
			if (ifcRatioMeasure != null)
				msgs = ((InternalEObject)ifcRatioMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.APPLIED_VALUE_TYPE__IFC_RATIO_MEASURE, null, msgs);
			if (newIfcRatioMeasure != null)
				msgs = ((InternalEObject)newIfcRatioMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.APPLIED_VALUE_TYPE__IFC_RATIO_MEASURE, null, msgs);
			msgs = basicSetIfcRatioMeasure(newIfcRatioMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.APPLIED_VALUE_TYPE__IFC_RATIO_MEASURE, newIfcRatioMeasure, newIfcRatioMeasure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.APPLIED_VALUE_TYPE__IFC_MEASURE_WITH_UNIT, oldIfcMeasureWithUnit, newIfcMeasureWithUnit);
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
				msgs = ((InternalEObject)ifcMeasureWithUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.APPLIED_VALUE_TYPE__IFC_MEASURE_WITH_UNIT, null, msgs);
			if (newIfcMeasureWithUnit != null)
				msgs = ((InternalEObject)newIfcMeasureWithUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.APPLIED_VALUE_TYPE__IFC_MEASURE_WITH_UNIT, null, msgs);
			msgs = basicSetIfcMeasureWithUnit(newIfcMeasureWithUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.APPLIED_VALUE_TYPE__IFC_MEASURE_WITH_UNIT, newIfcMeasureWithUnit, newIfcMeasureWithUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryMeasureType getIfcMonetaryMeasure() {
		return ifcMonetaryMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMonetaryMeasure(IfcMonetaryMeasureType newIfcMonetaryMeasure, NotificationChain msgs) {
		IfcMonetaryMeasureType oldIfcMonetaryMeasure = ifcMonetaryMeasure;
		ifcMonetaryMeasure = newIfcMonetaryMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.APPLIED_VALUE_TYPE__IFC_MONETARY_MEASURE, oldIfcMonetaryMeasure, newIfcMonetaryMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMonetaryMeasure(IfcMonetaryMeasureType newIfcMonetaryMeasure) {
		if (newIfcMonetaryMeasure != ifcMonetaryMeasure) {
			NotificationChain msgs = null;
			if (ifcMonetaryMeasure != null)
				msgs = ((InternalEObject)ifcMonetaryMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.APPLIED_VALUE_TYPE__IFC_MONETARY_MEASURE, null, msgs);
			if (newIfcMonetaryMeasure != null)
				msgs = ((InternalEObject)newIfcMonetaryMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.APPLIED_VALUE_TYPE__IFC_MONETARY_MEASURE, null, msgs);
			msgs = basicSetIfcMonetaryMeasure(newIfcMonetaryMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.APPLIED_VALUE_TYPE__IFC_MONETARY_MEASURE, newIfcMonetaryMeasure, newIfcMonetaryMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_RATIO_MEASURE:
				return basicSetIfcRatioMeasure(null, msgs);
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MEASURE_WITH_UNIT:
				return basicSetIfcMeasureWithUnit(null, msgs);
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MONETARY_MEASURE:
				return basicSetIfcMonetaryMeasure(null, msgs);
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
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_RATIO_MEASURE:
				return getIfcRatioMeasure();
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MEASURE_WITH_UNIT:
				return getIfcMeasureWithUnit();
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MONETARY_MEASURE:
				return getIfcMonetaryMeasure();
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
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_RATIO_MEASURE:
				setIfcRatioMeasure((IfcRatioMeasureType)newValue);
				return;
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MEASURE_WITH_UNIT:
				setIfcMeasureWithUnit((IfcMeasureWithUnit)newValue);
				return;
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MONETARY_MEASURE:
				setIfcMonetaryMeasure((IfcMonetaryMeasureType)newValue);
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
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_RATIO_MEASURE:
				setIfcRatioMeasure((IfcRatioMeasureType)null);
				return;
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MEASURE_WITH_UNIT:
				setIfcMeasureWithUnit((IfcMeasureWithUnit)null);
				return;
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MONETARY_MEASURE:
				setIfcMonetaryMeasure((IfcMonetaryMeasureType)null);
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
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_RATIO_MEASURE:
				return ifcRatioMeasure != null;
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MEASURE_WITH_UNIT:
				return ifcMeasureWithUnit != null;
			case FinalPackage.APPLIED_VALUE_TYPE__IFC_MONETARY_MEASURE:
				return ifcMonetaryMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //AppliedValueTypeImpl
