/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelaxation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Relaxation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelaxationImpl#getRelaxationValue <em>Relaxation Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelaxationImpl#getRelaxationValueAsString <em>Relaxation Value As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelaxationImpl#getInitialStress <em>Initial Stress</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelaxationImpl#getInitialStressAsString <em>Initial Stress As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelaxationImpl extends EObjectImpl implements IfcRelaxation {
	/**
	 * The default value of the '{@link #getRelaxationValue() <em>Relaxation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaxationValue()
	 * @generated
	 * @ordered
	 */
	protected static final double RELAXATION_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRelaxationValue() <em>Relaxation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaxationValue()
	 * @generated
	 * @ordered
	 */
	protected double relaxationValue = RELAXATION_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelaxationValueAsString() <em>Relaxation Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaxationValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RELAXATION_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelaxationValueAsString() <em>Relaxation Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaxationValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String relaxationValueAsString = RELAXATION_VALUE_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialStress() <em>Initial Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStress()
	 * @generated
	 * @ordered
	 */
	protected static final double INITIAL_STRESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInitialStress() <em>Initial Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStress()
	 * @generated
	 * @ordered
	 */
	protected double initialStress = INITIAL_STRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialStressAsString() <em>Initial Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStressAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_STRESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialStressAsString() <em>Initial Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStressAsString()
	 * @generated
	 * @ordered
	 */
	protected String initialStressAsString = INITIAL_STRESS_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelaxationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelaxation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelaxationValue() {
		return relaxationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelaxationValue(double newRelaxationValue) {
		double oldRelaxationValue = relaxationValue;
		relaxationValue = newRelaxationValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE, oldRelaxationValue, relaxationValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelaxationValueAsString() {
		return relaxationValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelaxationValueAsString(String newRelaxationValueAsString) {
		String oldRelaxationValueAsString = relaxationValueAsString;
		relaxationValueAsString = newRelaxationValueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE_AS_STRING, oldRelaxationValueAsString, relaxationValueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitialStress() {
		return initialStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialStress(double newInitialStress) {
		double oldInitialStress = initialStress;
		initialStress = newInitialStress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS, oldInitialStress, initialStress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialStressAsString() {
		return initialStressAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialStressAsString(String newInitialStressAsString) {
		String oldInitialStressAsString = initialStressAsString;
		initialStressAsString = newInitialStressAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS_AS_STRING, oldInitialStressAsString, initialStressAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE:
				return getRelaxationValue();
			case Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE_AS_STRING:
				return getRelaxationValueAsString();
			case Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS:
				return getInitialStress();
			case Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS_AS_STRING:
				return getInitialStressAsString();
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
			case Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE:
				setRelaxationValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE_AS_STRING:
				setRelaxationValueAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS:
				setInitialStress((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS_AS_STRING:
				setInitialStressAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE:
				setRelaxationValue(RELAXATION_VALUE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE_AS_STRING:
				setRelaxationValueAsString(RELAXATION_VALUE_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS:
				setInitialStress(INITIAL_STRESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS_AS_STRING:
				setInitialStressAsString(INITIAL_STRESS_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE:
				return relaxationValue != RELAXATION_VALUE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RELAXATION__RELAXATION_VALUE_AS_STRING:
				return RELAXATION_VALUE_AS_STRING_EDEFAULT == null ? relaxationValueAsString != null : !RELAXATION_VALUE_AS_STRING_EDEFAULT.equals(relaxationValueAsString);
			case Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS:
				return initialStress != INITIAL_STRESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_RELAXATION__INITIAL_STRESS_AS_STRING:
				return INITIAL_STRESS_AS_STRING_EDEFAULT == null ? initialStressAsString != null : !INITIAL_STRESS_AS_STRING_EDEFAULT.equals(initialStressAsString);
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
		result.append(" (RelaxationValue: ");
		result.append(relaxationValue);
		result.append(", RelaxationValueAsString: ");
		result.append(relaxationValueAsString);
		result.append(", InitialStress: ");
		result.append(initialStress);
		result.append(", InitialStressAsString: ");
		result.append(initialStressAsString);
		result.append(')');
		return result.toString();
	}

} //IfcRelaxationImpl
