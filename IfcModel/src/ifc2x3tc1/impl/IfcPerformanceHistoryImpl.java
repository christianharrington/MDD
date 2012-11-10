/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPerformanceHistory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Performance History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPerformanceHistoryImpl#getLifeCyclePhase <em>Life Cycle Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPerformanceHistoryImpl extends IfcControlImpl implements IfcPerformanceHistory {
	/**
	 * The default value of the '{@link #getLifeCyclePhase() <em>Life Cycle Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCyclePhase()
	 * @generated
	 * @ordered
	 */
	protected static final String LIFE_CYCLE_PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLifeCyclePhase() <em>Life Cycle Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeCyclePhase()
	 * @generated
	 * @ordered
	 */
	protected String lifeCyclePhase = LIFE_CYCLE_PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPerformanceHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPerformanceHistory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLifeCyclePhase() {
		return lifeCyclePhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeCyclePhase(String newLifeCyclePhase) {
		String oldLifeCyclePhase = lifeCyclePhase;
		lifeCyclePhase = newLifeCyclePhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PERFORMANCE_HISTORY__LIFE_CYCLE_PHASE, oldLifeCyclePhase, lifeCyclePhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PERFORMANCE_HISTORY__LIFE_CYCLE_PHASE:
				return getLifeCyclePhase();
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
			case Ifc2x3tc1Package.IFC_PERFORMANCE_HISTORY__LIFE_CYCLE_PHASE:
				setLifeCyclePhase((String)newValue);
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
			case Ifc2x3tc1Package.IFC_PERFORMANCE_HISTORY__LIFE_CYCLE_PHASE:
				setLifeCyclePhase(LIFE_CYCLE_PHASE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_PERFORMANCE_HISTORY__LIFE_CYCLE_PHASE:
				return LIFE_CYCLE_PHASE_EDEFAULT == null ? lifeCyclePhase != null : !LIFE_CYCLE_PHASE_EDEFAULT.equals(lifeCyclePhase);
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
		result.append(" (LifeCyclePhase: ");
		result.append(lifeCyclePhase);
		result.append(')');
		return result.toString();
	}

} //IfcPerformanceHistoryImpl
