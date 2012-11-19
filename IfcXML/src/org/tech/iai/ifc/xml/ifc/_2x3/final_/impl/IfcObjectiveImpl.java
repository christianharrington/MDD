/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BenchmarkValuesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcObjective;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcObjectiveEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ResultValuesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectiveImpl#getBenchmarkValues <em>Benchmark Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectiveImpl#getResultValues <em>Result Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectiveImpl#getObjectiveQualifier <em>Objective Qualifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcObjectiveImpl#getUserDefinedQualifier <em>User Defined Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcObjectiveImpl extends IfcConstraintImpl implements IfcObjective {
	/**
	 * The cached value of the '{@link #getBenchmarkValues() <em>Benchmark Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenchmarkValues()
	 * @generated
	 * @ordered
	 */
	protected BenchmarkValuesType benchmarkValues;

	/**
	 * The cached value of the '{@link #getResultValues() <em>Result Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValues()
	 * @generated
	 * @ordered
	 */
	protected ResultValuesType resultValues;

	/**
	 * The default value of the '{@link #getObjectiveQualifier() <em>Objective Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final IfcObjectiveEnum OBJECTIVE_QUALIFIER_EDEFAULT = IfcObjectiveEnum.CODECOMPLIANCE;

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
		return FinalPackage.eINSTANCE.getIfcObjective();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenchmarkValuesType getBenchmarkValues() {
		return benchmarkValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBenchmarkValues(BenchmarkValuesType newBenchmarkValues, NotificationChain msgs) {
		BenchmarkValuesType oldBenchmarkValues = benchmarkValues;
		benchmarkValues = newBenchmarkValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECTIVE__BENCHMARK_VALUES, oldBenchmarkValues, newBenchmarkValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBenchmarkValues(BenchmarkValuesType newBenchmarkValues) {
		if (newBenchmarkValues != benchmarkValues) {
			NotificationChain msgs = null;
			if (benchmarkValues != null)
				msgs = ((InternalEObject)benchmarkValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECTIVE__BENCHMARK_VALUES, null, msgs);
			if (newBenchmarkValues != null)
				msgs = ((InternalEObject)newBenchmarkValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECTIVE__BENCHMARK_VALUES, null, msgs);
			msgs = basicSetBenchmarkValues(newBenchmarkValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECTIVE__BENCHMARK_VALUES, newBenchmarkValues, newBenchmarkValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultValuesType getResultValues() {
		return resultValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultValues(ResultValuesType newResultValues, NotificationChain msgs) {
		ResultValuesType oldResultValues = resultValues;
		resultValues = newResultValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECTIVE__RESULT_VALUES, oldResultValues, newResultValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValues(ResultValuesType newResultValues) {
		if (newResultValues != resultValues) {
			NotificationChain msgs = null;
			if (resultValues != null)
				msgs = ((InternalEObject)resultValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECTIVE__RESULT_VALUES, null, msgs);
			if (newResultValues != null)
				msgs = ((InternalEObject)newResultValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OBJECTIVE__RESULT_VALUES, null, msgs);
			msgs = basicSetResultValues(newResultValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECTIVE__RESULT_VALUES, newResultValues, newResultValues));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER, oldObjectiveQualifier, objectiveQualifier));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER, oldUserDefinedQualifier, userDefinedQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_OBJECTIVE__BENCHMARK_VALUES:
				return basicSetBenchmarkValues(null, msgs);
			case FinalPackage.IFC_OBJECTIVE__RESULT_VALUES:
				return basicSetResultValues(null, msgs);
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
			case FinalPackage.IFC_OBJECTIVE__BENCHMARK_VALUES:
				return getBenchmarkValues();
			case FinalPackage.IFC_OBJECTIVE__RESULT_VALUES:
				return getResultValues();
			case FinalPackage.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER:
				return getObjectiveQualifier();
			case FinalPackage.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER:
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
			case FinalPackage.IFC_OBJECTIVE__BENCHMARK_VALUES:
				setBenchmarkValues((BenchmarkValuesType)newValue);
				return;
			case FinalPackage.IFC_OBJECTIVE__RESULT_VALUES:
				setResultValues((ResultValuesType)newValue);
				return;
			case FinalPackage.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER:
				setObjectiveQualifier((IfcObjectiveEnum)newValue);
				return;
			case FinalPackage.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER:
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
			case FinalPackage.IFC_OBJECTIVE__BENCHMARK_VALUES:
				setBenchmarkValues((BenchmarkValuesType)null);
				return;
			case FinalPackage.IFC_OBJECTIVE__RESULT_VALUES:
				setResultValues((ResultValuesType)null);
				return;
			case FinalPackage.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER:
				setObjectiveQualifier(OBJECTIVE_QUALIFIER_EDEFAULT);
				return;
			case FinalPackage.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER:
				setUserDefinedQualifier(USER_DEFINED_QUALIFIER_EDEFAULT);
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
			case FinalPackage.IFC_OBJECTIVE__BENCHMARK_VALUES:
				return benchmarkValues != null;
			case FinalPackage.IFC_OBJECTIVE__RESULT_VALUES:
				return resultValues != null;
			case FinalPackage.IFC_OBJECTIVE__OBJECTIVE_QUALIFIER:
				return objectiveQualifier != OBJECTIVE_QUALIFIER_EDEFAULT;
			case FinalPackage.IFC_OBJECTIVE__USER_DEFINED_QUALIFIER:
				return USER_DEFINED_QUALIFIER_EDEFAULT == null ? userDefinedQualifier != null : !USER_DEFINED_QUALIFIER_EDEFAULT.equals(userDefinedQualifier);
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
		result.append(" (objectiveQualifier: ");
		result.append(objectiveQualifier);
		result.append(", userDefinedQualifier: ");
		result.append(userDefinedQualifier);
		result.append(')');
		return result.toString();
	}

} //IfcObjectiveImpl
