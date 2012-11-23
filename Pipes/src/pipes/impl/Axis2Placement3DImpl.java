/**
 */
package pipes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pipes.Axis2Placement3D;
import pipes.Direction;
import pipes.PipesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis2 Placement3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pipes.impl.Axis2Placement3DImpl#getCartesianX <em>Cartesian X</em>}</li>
 *   <li>{@link pipes.impl.Axis2Placement3DImpl#getCartesianY <em>Cartesian Y</em>}</li>
 *   <li>{@link pipes.impl.Axis2Placement3DImpl#getCartesianZ <em>Cartesian Z</em>}</li>
 *   <li>{@link pipes.impl.Axis2Placement3DImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link pipes.impl.Axis2Placement3DImpl#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Axis2Placement3DImpl extends GUIDElementImpl implements Axis2Placement3D {
	/**
	 * The default value of the '{@link #getCartesianX() <em>Cartesian X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianX()
	 * @generated
	 * @ordered
	 */
	protected static final double CARTESIAN_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCartesianX() <em>Cartesian X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianX()
	 * @generated
	 * @ordered
	 */
	protected double cartesianX = CARTESIAN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCartesianY() <em>Cartesian Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianY()
	 * @generated
	 * @ordered
	 */
	protected static final double CARTESIAN_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCartesianY() <em>Cartesian Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianY()
	 * @generated
	 * @ordered
	 */
	protected double cartesianY = CARTESIAN_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getCartesianZ() <em>Cartesian Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianZ()
	 * @generated
	 * @ordered
	 */
	protected static final double CARTESIAN_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCartesianZ() <em>Cartesian Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartesianZ()
	 * @generated
	 * @ordered
	 */
	protected double cartesianZ = CARTESIAN_Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Direction axis;

	/**
	 * The cached value of the '{@link #getRefDirection() <em>Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction refDirection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Axis2Placement3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipesPackage.Literals.AXIS2_PLACEMENT3_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCartesianX() {
		return cartesianX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartesianX(double newCartesianX) {
		double oldCartesianX = cartesianX;
		cartesianX = newCartesianX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_X, oldCartesianX, cartesianX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCartesianY() {
		return cartesianY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartesianY(double newCartesianY) {
		double oldCartesianY = cartesianY;
		cartesianY = newCartesianY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Y, oldCartesianY, cartesianY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCartesianZ() {
		return cartesianZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCartesianZ(double newCartesianZ) {
		double oldCartesianZ = cartesianZ;
		cartesianZ = newCartesianZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Z, oldCartesianZ, cartesianZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getAxis() {
		if (axis != null && axis.eIsProxy()) {
			InternalEObject oldAxis = (InternalEObject)axis;
			axis = (Direction)eResolveProxy(oldAxis);
			if (axis != oldAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipesPackage.AXIS2_PLACEMENT3_D__AXIS, oldAxis, axis));
			}
		}
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction basicGetAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(Direction newAxis) {
		Direction oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.AXIS2_PLACEMENT3_D__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getRefDirection() {
		if (refDirection != null && refDirection.eIsProxy()) {
			InternalEObject oldRefDirection = (InternalEObject)refDirection;
			refDirection = (Direction)eResolveProxy(oldRefDirection);
			if (refDirection != oldRefDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION, oldRefDirection, refDirection));
			}
		}
		return refDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction basicGetRefDirection() {
		return refDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefDirection(Direction newRefDirection) {
		Direction oldRefDirection = refDirection;
		refDirection = newRefDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION, oldRefDirection, refDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_X:
				return getCartesianX();
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Y:
				return getCartesianY();
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Z:
				return getCartesianZ();
			case PipesPackage.AXIS2_PLACEMENT3_D__AXIS:
				if (resolve) return getAxis();
				return basicGetAxis();
			case PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION:
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
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_X:
				setCartesianX((Double)newValue);
				return;
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Y:
				setCartesianY((Double)newValue);
				return;
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Z:
				setCartesianZ((Double)newValue);
				return;
			case PipesPackage.AXIS2_PLACEMENT3_D__AXIS:
				setAxis((Direction)newValue);
				return;
			case PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION:
				setRefDirection((Direction)newValue);
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
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_X:
				setCartesianX(CARTESIAN_X_EDEFAULT);
				return;
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Y:
				setCartesianY(CARTESIAN_Y_EDEFAULT);
				return;
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Z:
				setCartesianZ(CARTESIAN_Z_EDEFAULT);
				return;
			case PipesPackage.AXIS2_PLACEMENT3_D__AXIS:
				setAxis((Direction)null);
				return;
			case PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION:
				setRefDirection((Direction)null);
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
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_X:
				return cartesianX != CARTESIAN_X_EDEFAULT;
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Y:
				return cartesianY != CARTESIAN_Y_EDEFAULT;
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Z:
				return cartesianZ != CARTESIAN_Z_EDEFAULT;
			case PipesPackage.AXIS2_PLACEMENT3_D__AXIS:
				return axis != null;
			case PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION:
				return refDirection != null;
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
		result.append(" (cartesianX: ");
		result.append(cartesianX);
		result.append(", cartesianY: ");
		result.append(cartesianY);
		result.append(", cartesianZ: ");
		result.append(cartesianZ);
		result.append(')');
		return result.toString();
	}

} //Axis2Placement3DImpl
