/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BenchmarkValuesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMetric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Benchmark Values Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.BenchmarkValuesTypeImpl#getIfcMetric <em>Ifc Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BenchmarkValuesTypeImpl extends EObjectImpl implements BenchmarkValuesType {
	/**
	 * The cached value of the '{@link #getIfcMetric() <em>Ifc Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMetric()
	 * @generated
	 * @ordered
	 */
	protected IfcMetric ifcMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BenchmarkValuesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getBenchmarkValuesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetric getIfcMetric() {
		return ifcMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMetric(IfcMetric newIfcMetric, NotificationChain msgs) {
		IfcMetric oldIfcMetric = ifcMetric;
		ifcMetric = newIfcMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.BENCHMARK_VALUES_TYPE__IFC_METRIC, oldIfcMetric, newIfcMetric);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMetric(IfcMetric newIfcMetric) {
		if (newIfcMetric != ifcMetric) {
			NotificationChain msgs = null;
			if (ifcMetric != null)
				msgs = ((InternalEObject)ifcMetric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.BENCHMARK_VALUES_TYPE__IFC_METRIC, null, msgs);
			if (newIfcMetric != null)
				msgs = ((InternalEObject)newIfcMetric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.BENCHMARK_VALUES_TYPE__IFC_METRIC, null, msgs);
			msgs = basicSetIfcMetric(newIfcMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.BENCHMARK_VALUES_TYPE__IFC_METRIC, newIfcMetric, newIfcMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.BENCHMARK_VALUES_TYPE__IFC_METRIC:
				return basicSetIfcMetric(null, msgs);
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
			case FinalPackage.BENCHMARK_VALUES_TYPE__IFC_METRIC:
				return getIfcMetric();
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
			case FinalPackage.BENCHMARK_VALUES_TYPE__IFC_METRIC:
				setIfcMetric((IfcMetric)newValue);
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
			case FinalPackage.BENCHMARK_VALUES_TYPE__IFC_METRIC:
				setIfcMetric((IfcMetric)null);
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
			case FinalPackage.BENCHMARK_VALUES_TYPE__IFC_METRIC:
				return ifcMetric != null;
		}
		return super.eIsSet(featureID);
	}

} //BenchmarkValuesTypeImpl
