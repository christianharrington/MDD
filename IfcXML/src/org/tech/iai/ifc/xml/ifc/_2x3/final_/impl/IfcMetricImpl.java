/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DataValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBenchmarkEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMetric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricImpl#getBenchmark <em>Benchmark</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricImpl#getValueSource <em>Value Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricImpl#getDataValue <em>Data Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMetricImpl extends IfcConstraintImpl implements IfcMetric {
	/**
	 * The default value of the '{@link #getBenchmark() <em>Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenchmark()
	 * @generated
	 * @ordered
	 */
	protected static final IfcBenchmarkEnum BENCHMARK_EDEFAULT = IfcBenchmarkEnum.GREATERTHAN;

	/**
	 * The cached value of the '{@link #getBenchmark() <em>Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenchmark()
	 * @generated
	 * @ordered
	 */
	protected IfcBenchmarkEnum benchmark = BENCHMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueSource() <em>Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSource()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueSource() <em>Value Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSource()
	 * @generated
	 * @ordered
	 */
	protected String valueSource = VALUE_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataValue() <em>Data Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValue()
	 * @generated
	 * @ordered
	 */
	protected DataValueType dataValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMetric();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBenchmarkEnum getBenchmark() {
		return benchmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenchmark(IfcBenchmarkEnum newBenchmark) {
		IfcBenchmarkEnum oldBenchmark = benchmark;
		benchmark = newBenchmark == null ? BENCHMARK_EDEFAULT : newBenchmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC__BENCHMARK, oldBenchmark, benchmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueSource() {
		return valueSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSource(String newValueSource) {
		String oldValueSource = valueSource;
		valueSource = newValueSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC__VALUE_SOURCE, oldValueSource, valueSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValueType getDataValue() {
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataValue(DataValueType newDataValue, NotificationChain msgs) {
		DataValueType oldDataValue = dataValue;
		dataValue = newDataValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC__DATA_VALUE, oldDataValue, newDataValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValue(DataValueType newDataValue) {
		if (newDataValue != dataValue) {
			NotificationChain msgs = null;
			if (dataValue != null)
				msgs = ((InternalEObject)dataValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC__DATA_VALUE, null, msgs);
			if (newDataValue != null)
				msgs = ((InternalEObject)newDataValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC__DATA_VALUE, null, msgs);
			msgs = basicSetDataValue(newDataValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC__DATA_VALUE, newDataValue, newDataValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_METRIC__DATA_VALUE:
				return basicSetDataValue(null, msgs);
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
			case FinalPackage.IFC_METRIC__BENCHMARK:
				return getBenchmark();
			case FinalPackage.IFC_METRIC__VALUE_SOURCE:
				return getValueSource();
			case FinalPackage.IFC_METRIC__DATA_VALUE:
				return getDataValue();
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
			case FinalPackage.IFC_METRIC__BENCHMARK:
				setBenchmark((IfcBenchmarkEnum)newValue);
				return;
			case FinalPackage.IFC_METRIC__VALUE_SOURCE:
				setValueSource((String)newValue);
				return;
			case FinalPackage.IFC_METRIC__DATA_VALUE:
				setDataValue((DataValueType)newValue);
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
			case FinalPackage.IFC_METRIC__BENCHMARK:
				setBenchmark(BENCHMARK_EDEFAULT);
				return;
			case FinalPackage.IFC_METRIC__VALUE_SOURCE:
				setValueSource(VALUE_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_METRIC__DATA_VALUE:
				setDataValue((DataValueType)null);
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
			case FinalPackage.IFC_METRIC__BENCHMARK:
				return benchmark != BENCHMARK_EDEFAULT;
			case FinalPackage.IFC_METRIC__VALUE_SOURCE:
				return VALUE_SOURCE_EDEFAULT == null ? valueSource != null : !VALUE_SOURCE_EDEFAULT.equals(valueSource);
			case FinalPackage.IFC_METRIC__DATA_VALUE:
				return dataValue != null;
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
		result.append(" (benchmark: ");
		result.append(benchmark);
		result.append(", valueSource: ");
		result.append(valueSource);
		result.append(')');
		return result.toString();
	}

} //IfcMetricImpl
