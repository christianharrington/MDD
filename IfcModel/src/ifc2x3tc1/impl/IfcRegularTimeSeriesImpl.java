/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRegularTimeSeries;
import ifc2x3tc1.IfcTimeSeriesValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Regular Time Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRegularTimeSeriesImpl#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRegularTimeSeriesImpl#getTimeStepAsString <em>Time Step As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRegularTimeSeriesImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRegularTimeSeriesImpl extends IfcTimeSeriesImpl implements IfcRegularTimeSeries {
	/**
	 * The default value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected double timeStep = TIME_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStepAsString() <em>Time Step As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStepAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STEP_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStepAsString() <em>Time Step As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStepAsString()
	 * @generated
	 * @ordered
	 */
	protected String timeStepAsString = TIME_STEP_AS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcTimeSeriesValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRegularTimeSeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRegularTimeSeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeStep() {
		return timeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStep(double newTimeStep) {
		double oldTimeStep = timeStep;
		timeStep = newTimeStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP, oldTimeStep, timeStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeStepAsString() {
		return timeStepAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStepAsString(String newTimeStepAsString) {
		String oldTimeStepAsString = timeStepAsString;
		timeStepAsString = newTimeStepAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP_AS_STRING, oldTimeStepAsString, timeStepAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTimeSeriesValue> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<IfcTimeSeriesValue>(IfcTimeSeriesValue.class, this, Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP:
				return getTimeStep();
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP_AS_STRING:
				return getTimeStepAsString();
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__VALUES:
				return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP:
				setTimeStep((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP_AS_STRING:
				setTimeStepAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends IfcTimeSeriesValue>)newValue);
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
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP:
				setTimeStep(TIME_STEP_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP_AS_STRING:
				setTimeStepAsString(TIME_STEP_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__VALUES:
				getValues().clear();
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
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP:
				return timeStep != TIME_STEP_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__TIME_STEP_AS_STRING:
				return TIME_STEP_AS_STRING_EDEFAULT == null ? timeStepAsString != null : !TIME_STEP_AS_STRING_EDEFAULT.equals(timeStepAsString);
			case Ifc2x3tc1Package.IFC_REGULAR_TIME_SERIES__VALUES:
				return values != null && !values.isEmpty();
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
		result.append(" (TimeStep: ");
		result.append(timeStep);
		result.append(", TimeStepAsString: ");
		result.append(timeStepAsString);
		result.append(')');
		return result.toString();
	}

} //IfcRegularTimeSeriesImpl
