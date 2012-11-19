/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelaxation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Relaxation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelaxationImpl#getRelaxationValue <em>Relaxation Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelaxationImpl#getInitialStress <em>Initial Stress</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelaxationImpl extends EntityImpl implements IfcRelaxation {
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
		return FinalPackage.eINSTANCE.getIfcRelaxation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RELAXATION__RELAXATION_VALUE, oldRelaxationValue, relaxationValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RELAXATION__INITIAL_STRESS, oldInitialStress, initialStress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_RELAXATION__RELAXATION_VALUE:
				return getRelaxationValue();
			case FinalPackage.IFC_RELAXATION__INITIAL_STRESS:
				return getInitialStress();
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
			case FinalPackage.IFC_RELAXATION__RELAXATION_VALUE:
				setRelaxationValue((Double)newValue);
				return;
			case FinalPackage.IFC_RELAXATION__INITIAL_STRESS:
				setInitialStress((Double)newValue);
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
			case FinalPackage.IFC_RELAXATION__RELAXATION_VALUE:
				setRelaxationValue(RELAXATION_VALUE_EDEFAULT);
				return;
			case FinalPackage.IFC_RELAXATION__INITIAL_STRESS:
				setInitialStress(INITIAL_STRESS_EDEFAULT);
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
			case FinalPackage.IFC_RELAXATION__RELAXATION_VALUE:
				return relaxationValue != RELAXATION_VALUE_EDEFAULT;
			case FinalPackage.IFC_RELAXATION__INITIAL_STRESS:
				return initialStress != INITIAL_STRESS_EDEFAULT;
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
		result.append(" (relaxationValue: ");
		result.append(relaxationValue);
		result.append(", initialStress: ");
		result.append(initialStress);
		result.append(')');
		return result.toString();
	}

} //IfcRelaxationImpl
