/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianTransformationOperator3D;
import ifc2x3tc1.IfcDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCartesianTransformationOperator3DImpl#getAxis3 <em>Axis3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCartesianTransformationOperator3DImpl extends IfcCartesianTransformationOperatorImpl implements IfcCartesianTransformationOperator3D {
	/**
	 * The cached value of the '{@link #getAxis3() <em>Axis3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis3()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection axis3;

	/**
	 * This is true if the Axis3 reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean axis3ESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcCartesianTransformationOperator3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis3() {
		if (axis3 != null && axis3.eIsProxy()) {
			InternalEObject oldAxis3 = (InternalEObject)axis3;
			axis3 = (IfcDirection)eResolveProxy(oldAxis3);
			if (axis3 != oldAxis3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3, oldAxis3, axis3));
			}
		}
		return axis3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection basicGetAxis3() {
		return axis3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis3(IfcDirection newAxis3) {
		IfcDirection oldAxis3 = axis3;
		axis3 = newAxis3;
		boolean oldAxis3ESet = axis3ESet;
		axis3ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3, oldAxis3, axis3, !oldAxis3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxis3() {
		IfcDirection oldAxis3 = axis3;
		boolean oldAxis3ESet = axis3ESet;
		axis3 = null;
		axis3ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3, oldAxis3, null, oldAxis3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxis3() {
		return axis3ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3:
				if (resolve) return getAxis3();
				return basicGetAxis3();
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3:
				setAxis3((IfcDirection)newValue);
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3:
				unsetAxis3();
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
			case Ifc2x3tc1Package.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D__AXIS3:
				return isSetAxis3();
		}
		return super.eIsSet(featureID);
	}

} //IfcCartesianTransformationOperator3DImpl
