/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement3D;
import ifc2x3tc1.IfcDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Axis2 Placement3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAxis2Placement3DImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAxis2Placement3DImpl#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAxis2Placement3DImpl extends IfcPlacementImpl implements IfcAxis2Placement3D {
	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection axis;

	/**
	 * This is true if the Axis reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean axisESet;

	/**
	 * The cached value of the '{@link #getRefDirection() <em>Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDirection()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection refDirection;

	/**
	 * This is true if the Ref Direction reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refDirectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAxis2Placement3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcAxis2Placement3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getAxis() {
		if (axis != null && axis.eIsProxy()) {
			InternalEObject oldAxis = (InternalEObject)axis;
			axis = (IfcDirection)eResolveProxy(oldAxis);
			if (axis != oldAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__AXIS, oldAxis, axis));
			}
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection basicGetAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(IfcDirection newAxis) {
		IfcDirection oldAxis = axis;
		axis = newAxis;
		boolean oldAxisESet = axisESet;
		axisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__AXIS, oldAxis, axis, !oldAxisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAxis() {
		IfcDirection oldAxis = axis;
		boolean oldAxisESet = axisESet;
		axis = null;
		axisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__AXIS, oldAxis, null, oldAxisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAxis() {
		return axisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getRefDirection() {
		if (refDirection != null && refDirection.eIsProxy()) {
			InternalEObject oldRefDirection = (InternalEObject)refDirection;
			refDirection = (IfcDirection)eResolveProxy(oldRefDirection);
			if (refDirection != oldRefDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION, oldRefDirection, refDirection));
			}
		}
		return refDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection basicGetRefDirection() {
		return refDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefDirection(IfcDirection newRefDirection) {
		IfcDirection oldRefDirection = refDirection;
		refDirection = newRefDirection;
		boolean oldRefDirectionESet = refDirectionESet;
		refDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION, oldRefDirection, refDirection, !oldRefDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefDirection() {
		IfcDirection oldRefDirection = refDirection;
		boolean oldRefDirectionESet = refDirectionESet;
		refDirection = null;
		refDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION, oldRefDirection, null, oldRefDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefDirection() {
		return refDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__AXIS:
				if (resolve) return getAxis();
				return basicGetAxis();
			case Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION:
				if (resolve) return getRefDirection();
				return basicGetRefDirection();
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
			case Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__AXIS:
				setAxis((IfcDirection)newValue);
				return;
			case Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION:
				setRefDirection((IfcDirection)newValue);
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
			case Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__AXIS:
				unsetAxis();
				return;
			case Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION:
				unsetRefDirection();
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
			case Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__AXIS:
				return isSetAxis();
			case Ifc2x3tc1Package.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION:
				return isSetRefDirection();
		}
		return super.eIsSet(featureID);
	}

} //IfcAxis2Placement3DImpl
