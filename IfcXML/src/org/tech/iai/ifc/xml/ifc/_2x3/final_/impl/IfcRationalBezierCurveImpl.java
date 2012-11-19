/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRationalBezierCurve;
import org.tech.iai.ifc.xml.ifc._2x3.final_.WeightsDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rational Bezier Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRationalBezierCurveImpl#getWeightsData <em>Weights Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRationalBezierCurveImpl extends IfcBezierCurveImpl implements IfcRationalBezierCurve {
	/**
	 * The cached value of the '{@link #getWeightsData() <em>Weights Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightsData()
	 * @generated
	 * @ordered
	 */
	protected WeightsDataType weightsData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRationalBezierCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRationalBezierCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightsDataType getWeightsData() {
		return weightsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeightsData(WeightsDataType newWeightsData, NotificationChain msgs) {
		WeightsDataType oldWeightsData = weightsData;
		weightsData = newWeightsData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA, oldWeightsData, newWeightsData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightsData(WeightsDataType newWeightsData) {
		if (newWeightsData != weightsData) {
			NotificationChain msgs = null;
			if (weightsData != null)
				msgs = ((InternalEObject)weightsData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA, null, msgs);
			if (newWeightsData != null)
				msgs = ((InternalEObject)newWeightsData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA, null, msgs);
			msgs = basicSetWeightsData(newWeightsData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA, newWeightsData, newWeightsData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA:
				return basicSetWeightsData(null, msgs);
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
			case FinalPackage.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA:
				return getWeightsData();
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
			case FinalPackage.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA:
				setWeightsData((WeightsDataType)newValue);
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
			case FinalPackage.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA:
				setWeightsData((WeightsDataType)null);
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
			case FinalPackage.IFC_RATIONAL_BEZIER_CURVE__WEIGHTS_DATA:
				return weightsData != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRationalBezierCurveImpl
