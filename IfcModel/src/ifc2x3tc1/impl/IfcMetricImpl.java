/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBenchmarkEnum;
import ifc2x3tc1.IfcMetric;
import ifc2x3tc1.IfcMetricValueSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMetricImpl#getBenchmark <em>Benchmark</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMetricImpl#getValueSource <em>Value Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMetricImpl#getDataValue <em>Data Value</em>}</li>
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
	protected static final IfcBenchmarkEnum BENCHMARK_EDEFAULT = IfcBenchmarkEnum.NULL;

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
	 * This is true if the Value Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueSourceESet;

	/**
	 * The cached value of the '{@link #getDataValue() <em>Data Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataValue()
	 * @generated
	 * @ordered
	 */
	protected IfcMetricValueSelect dataValue;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcMetric();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_METRIC__BENCHMARK, oldBenchmark, benchmark));
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
		boolean oldValueSourceESet = valueSourceESet;
		valueSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_METRIC__VALUE_SOURCE, oldValueSource, valueSource, !oldValueSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueSource() {
		String oldValueSource = valueSource;
		boolean oldValueSourceESet = valueSourceESet;
		valueSource = VALUE_SOURCE_EDEFAULT;
		valueSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_METRIC__VALUE_SOURCE, oldValueSource, VALUE_SOURCE_EDEFAULT, oldValueSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueSource() {
		return valueSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetricValueSelect getDataValue() {
		if (dataValue != null && dataValue.eIsProxy()) {
			InternalEObject oldDataValue = (InternalEObject)dataValue;
			dataValue = (IfcMetricValueSelect)eResolveProxy(oldDataValue);
			if (dataValue != oldDataValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_METRIC__DATA_VALUE, oldDataValue, dataValue));
			}
		}
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetricValueSelect basicGetDataValue() {
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataValue(IfcMetricValueSelect newDataValue) {
		IfcMetricValueSelect oldDataValue = dataValue;
		dataValue = newDataValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_METRIC__DATA_VALUE, oldDataValue, dataValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_METRIC__BENCHMARK:
				return getBenchmark();
			case Ifc2x3tc1Package.IFC_METRIC__VALUE_SOURCE:
				return getValueSource();
			case Ifc2x3tc1Package.IFC_METRIC__DATA_VALUE:
				if (resolve) return getDataValue();
				return basicGetDataValue();
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
			case Ifc2x3tc1Package.IFC_METRIC__BENCHMARK:
				setBenchmark((IfcBenchmarkEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_METRIC__VALUE_SOURCE:
				setValueSource((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_METRIC__DATA_VALUE:
				setDataValue((IfcMetricValueSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_METRIC__BENCHMARK:
				setBenchmark(BENCHMARK_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_METRIC__VALUE_SOURCE:
				unsetValueSource();
				return;
			case Ifc2x3tc1Package.IFC_METRIC__DATA_VALUE:
				setDataValue((IfcMetricValueSelect)null);
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
			case Ifc2x3tc1Package.IFC_METRIC__BENCHMARK:
				return benchmark != BENCHMARK_EDEFAULT;
			case Ifc2x3tc1Package.IFC_METRIC__VALUE_SOURCE:
				return isSetValueSource();
			case Ifc2x3tc1Package.IFC_METRIC__DATA_VALUE:
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
		result.append(" (Benchmark: ");
		result.append(benchmark);
		result.append(", ValueSource: ");
		if (valueSourceESet) result.append(valueSource); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcMetricImpl
