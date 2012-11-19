/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.Axis3Type;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator3D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCartesianTransformationOperator3DImpl#getAxis3 <em>Axis3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCartesianTransformationOperator3DImpl extends IfcCartesianTransformationOperatorImpl implements IfcCartesianTransformationOperator3D {
	/**
	 * The cached value of the '{@link #getAxis3() <em>Axis3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis3()
	 * @generated
	 * @ordered
	 */
	protected Axis3Type axis3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperator3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCartesianTransformationOperator3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis3Type getAxis3() {
		return axis3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis3(Axis3Type newAxis3, NotificationChain msgs) {
		Axis3Type oldAxis3 = axis3;
		axis3 = newAxis3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3, oldAxis3, newAxis3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis3(Axis3Type newAxis3) {
		if (newAxis3 != axis3) {
			NotificationChain msgs = null;
			if (axis3 != null)
				msgs = ((InternalEObject)axis3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3, null, msgs);
			if (newAxis3 != null)
				msgs = ((InternalEObject)newAxis3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3, null, msgs);
			msgs = basicSetAxis3(newAxis3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3, newAxis3, newAxis3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3:
				return basicSetAxis3(null, msgs);
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3:
				return getAxis3();
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3:
				setAxis3((Axis3Type)newValue);
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3:
				setAxis3((Axis3Type)null);
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3:
				return axis3 != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcCartesianTransformationOperator3DImpl
