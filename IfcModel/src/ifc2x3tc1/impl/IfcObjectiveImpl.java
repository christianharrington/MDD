/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMetric;
import ifc2x3tc1.IfcObjective;
import ifc2x3tc1.IfcObjectiveEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectiveImpl#getBenchmarkValues <em>Benchmark Values</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectiveImpl#getResultValues <em>Result Values</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectiveImpl#getObjectiveQualifier <em>Objective Qualifier</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcObjectiveImpl#getUserDefinedQualifier <em>User Defined Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcObjectiveImpl extends IfcConstraintImpl implements IfcObjective {
	/**
	 * The cached value of the '{@link #getBenchmarkValues() <em>Benchmark Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenchmarkValues()
	 * @generated
	 * @ordered
	 */
	protected IfcMetric benchmarkValues;

	/**
	 * This is true if the Benchmark Values reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean benchmarkValuesESet;

	/**
	 * The cached value of the '{@link #getResultValues() <em>Result Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValues()
	 * @generated
	 * @ordered
	 */
	protected IfcMetric resultValues;

	/**
	 * This is true if the Result Values reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultValuesESet;

	/**
	 * The default value of the '{@link #getObjectiveQualifier() <em>Objective Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final IfcObjectiveEnum OBJECTIVE_QUALIFIER_EDEFAULT = IfcObjectiveEnum.NULL;

	/**
	 * The cached value of the '{@link #getObjectiveQualifier() <em>Objective Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveQualifier()
	 * @generated
	 * @ordered
	 */
	protected IfcObjectiveEnum objectiveQualifier = OBJECTIVE_QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedQualifier() <em>User Defined Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedQualifier() <em>User Defined Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedQualifier()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedQualifier = USER_DEFINED_QUALIFIER_EDEFAULT;

	/**
	 * This is true if the User Defined Qualifier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedQualifierESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcObjective();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetric getBenchmarkValues() {
		if (benchmarkValues != null && benchmarkValues.eIsProxy()) {
			InternalEObject oldBenchmarkValues = (InternalEObject)benchmarkValues;
			benchmarkValues = (IfcMetric)eResolveProxy(oldBenchmarkValues);
			if (benchmarkValues != oldBenchmarkValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_OBJECTIVE__BENCHMARK_VALUES, oldBenchmarkValues, benchmarkValues));
			}
		}
		return benchmarkValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetric basicGetBenchmarkValues() {
		return benchmarkValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenchmarkValues(IfcMetric newBenchmarkValues) {
		IfcMetric oldBenchmarkValues = benchmarkValues;
		benchmarkValues = newBenchmarkValues;
		boolean oldBenchmarkValuesESet = benchmarkValuesESet;
		benchmarkValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OBJECTIVE__BENCHMARK_VALUES, oldBenchmarkValues, benchmarkValues, !oldBenchmarkValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBenchmarkValues() {
		IfcMetric oldBenchmarkValues = benchmarkValues;
		boolean oldBenchmarkValuesESet = benchmarkValuesESet;
		benchmarkValues = null;
		benchmarkValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OBJECTIVE__BENCHMARK_VALUES, oldBenchmarkValues, null, oldBenchmarkValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBenchmarkValues() {
		return benchmarkValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetric getResultValues() {
		if (resultValues != null && resultValues.eIsProxy()) {
			InternalEObject oldResultValues = (InternalEObject)resultValues;
			resultValues = (IfcMetric)eResolveProxy(oldResultValues);
			if (resultValues != oldResultValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_OBJECTIVE__RESULT_VALUES, oldResultValues, resultValues));
			}
		}
		return resultValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetric basicGetResultValues() {
		return resultValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValues(IfcMetric newResultValues) {
		IfcMetric oldResultValues = resultValues;
		resultValues = newResultValues;
		boolean oldResultValuesESet = resultValuesESet;
		resultValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OBJECTIVE__RESULT_VALUES, oldResultValues, resultValues, !oldResultValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResultValues() {
		IfcMetric oldResultValues = resultValues;
		boolean oldResultValuesESet = resultValuesESet;
		resultValues = null;
		resultValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OBJECTIVE__RESULT_VALUES, oldResultValues, null, oldResultValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResultValues() {
		return resultValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectiveEnum getObjectiveQualifier() {
		return objectiveQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectiveQualifier(IfcObjectiveEnum newObjectiveQualifier) {
		IfcObjectiveEnum oldObjectiveQualifier = objectiveQualifier;
		objectiveQualifier = newObjectiveQualifier == null ? OBJECTIVE_QUALIFIER_EDEFAULT : newObjectiveQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER, oldObjectiveQualifier, objectiveQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedQualifier() {
		return userDefinedQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedQualifier(String newUserDefinedQualifier) {
		String oldUserDefinedQualifier = userDefinedQualifier;
		userDefinedQualifier = newUserDefinedQualifier;
		boolean oldUserDefinedQualifierESet = userDefinedQualifierESet;
		userDefinedQualifierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER, oldUserDefinedQualifier, userDefinedQualifier, !oldUserDefinedQualifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedQualifier() {
		String oldUserDefinedQualifier = userDefinedQualifier;
		boolean oldUserDefinedQualifierESet = userDefinedQualifierESet;
		userDefinedQualifier = USER_DEFINED_QUALIFIER_EDEFAULT;
		userDefinedQualifierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER, oldUserDefinedQualifier, USER_DEFINED_QUALIFIER_EDEFAULT, oldUserDefinedQualifierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedQualifier() {
		return userDefinedQualifierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_OBJECTIVE__BENCHMARK_VALUES:
				if (resolve) return getBenchmarkValues();
				return basicGetBenchmarkValues();
			case Ifc2x3tc1Package.IFC_OBJECTIVE__RESULT_VALUES:
				if (resolve) return getResultValues();
				return basicGetResultValues();
			case Ifc2x3tc1Package.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER:
				return getObjectiveQualifier();
			case Ifc2x3tc1Package.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER:
				return getUserDefinedQualifier();
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
			case Ifc2x3tc1Package.IFC_OBJECTIVE__BENCHMARK_VALUES:
				setBenchmarkValues((IfcMetric)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OBJECTIVE__RESULT_VALUES:
				setResultValues((IfcMetric)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER:
				setObjectiveQualifier((IfcObjectiveEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER:
				setUserDefinedQualifier((String)newValue);
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
			case Ifc2x3tc1Package.IFC_OBJECTIVE__BENCHMARK_VALUES:
				unsetBenchmarkValues();
				return;
			case Ifc2x3tc1Package.IFC_OBJECTIVE__RESULT_VALUES:
				unsetResultValues();
				return;
			case Ifc2x3tc1Package.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER:
				setObjectiveQualifier(OBJECTIVE_QUALIFIER_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER:
				unsetUserDefinedQualifier();
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
			case Ifc2x3tc1Package.IFC_OBJECTIVE__BENCHMARK_VALUES:
				return isSetBenchmarkValues();
			case Ifc2x3tc1Package.IFC_OBJECTIVE__RESULT_VALUES:
				return isSetResultValues();
			case Ifc2x3tc1Package.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER:
				return objectiveQualifier != OBJECTIVE_QUALIFIER_EDEFAULT;
			case Ifc2x3tc1Package.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER:
				return isSetUserDefinedQualifier();
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
		result.append(" (ObjectiveQualifier: ");
		result.append(objectiveQualifier);
		result.append(", UserDefinedQualifier: ");
		if (userDefinedQualifierESet) result.append(userDefinedQualifier); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcObjectiveImpl
