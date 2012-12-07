/**
 */
package pipes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

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
public class Axis2Placement3DImpl extends EObjectImpl implements Axis2Placement3D {
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
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Direction axis;

	/**
	 * The cached value of the '{@link #getRefDirection() <em>Ref Direction</em>}' containment reference.
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
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis(Direction newAxis, NotificationChain msgs) {
		Direction oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipesPackage.AXIS2_PLACEMENT3_D__AXIS, oldAxis, newAxis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(Direction newAxis) {
		if (newAxis != axis) {
			NotificationChain msgs = null;
			if (axis != null)
				msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipesPackage.AXIS2_PLACEMENT3_D__AXIS, null, msgs);
			if (newAxis != null)
				msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipesPackage.AXIS2_PLACEMENT3_D__AXIS, null, msgs);
			msgs = basicSetAxis(newAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.AXIS2_PLACEMENT3_D__AXIS, newAxis, newAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getRefDirection() {
		return refDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefDirection(Direction newRefDirection, NotificationChain msgs) {
		Direction oldRefDirection = refDirection;
		refDirection = newRefDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION, oldRefDirection, newRefDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefDirection(Direction newRefDirection) {
		if (newRefDirection != refDirection) {
			NotificationChain msgs = null;
			if (refDirection != null)
				msgs = ((InternalEObject)refDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION, null, msgs);
			if (newRefDirection != null)
				msgs = ((InternalEObject)newRefDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION, null, msgs);
			msgs = basicSetRefDirection(newRefDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION, newRefDirection, newRefDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipesPackage.AXIS2_PLACEMENT3_D__AXIS:
				return basicSetAxis(null, msgs);
			case PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION:
				return basicSetRefDirection(null, msgs);
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
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_X:
				return getCartesianX();
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Y:
				return getCartesianY();
			case PipesPackage.AXIS2_PLACEMENT3_D__CARTESIAN_Z:
				return getCartesianZ();
			case PipesPackage.AXIS2_PLACEMENT3_D__AXIS:
				return getAxis();
			case PipesPackage.AXIS2_PLACEMENT3_D__REF_DIRECTION:
				return getRefDirection();
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
