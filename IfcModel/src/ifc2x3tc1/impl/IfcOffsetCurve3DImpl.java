/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurve;
import ifc2x3tc1.IfcDirection;
import ifc2x3tc1.IfcOffsetCurve3D;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Offset Curve3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcOffsetCurve3DImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOffsetCurve3DImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOffsetCurve3DImpl#getDistanceAsString <em>Distance As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOffsetCurve3DImpl#isSelfIntersect <em>Self Intersect</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOffsetCurve3DImpl#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOffsetCurve3DImpl extends IfcCurveImpl implements IfcOffsetCurve3D {
	/**
	 * The cached value of the '{@link #getBasisCurve() <em>Basis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve basisCurve;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceAsString() <em>Distance As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTANCE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistanceAsString() <em>Distance As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAsString()
	 * @generated
	 * @ordered
	 */
	protected String distanceAsString = DISTANCE_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelfIntersect() <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelfIntersect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELF_INTERSECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelfIntersect() <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelfIntersect()
	 * @generated
	 * @ordered
	 */
	protected boolean selfIntersect = SELF_INTERSECT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOffsetCurve3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcOffsetCurve3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getBasisCurve() {
		if (basisCurve != null && basisCurve.eIsProxy()) {
			InternalEObject oldBasisCurve = (InternalEObject)basisCurve;
			basisCurve = (IfcCurve)eResolveProxy(oldBasisCurve);
			if (basisCurve != oldBasisCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__BASIS_CURVE, oldBasisCurve, basisCurve));
			}
		}
		return basisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetBasisCurve() {
		return basisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisCurve(IfcCurve newBasisCurve) {
		IfcCurve oldBasisCurve = basisCurve;
		basisCurve = newBasisCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__BASIS_CURVE, oldBasisCurve, basisCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistanceAsString() {
		return distanceAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAsString(String newDistanceAsString) {
		String oldDistanceAsString = distanceAsString;
		distanceAsString = newDistanceAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE_AS_STRING, oldDistanceAsString, distanceAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelfIntersect() {
		return selfIntersect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(boolean newSelfIntersect) {
		boolean oldSelfIntersect = selfIntersect;
		selfIntersect = newSelfIntersect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__SELF_INTERSECT, oldSelfIntersect, selfIntersect));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__REF_DIRECTION, oldRefDirection, refDirection));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__REF_DIRECTION, oldRefDirection, refDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__BASIS_CURVE:
				if (resolve) return getBasisCurve();
				return basicGetBasisCurve();
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE:
				return getDistance();
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE_AS_STRING:
				return getDistanceAsString();
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__SELF_INTERSECT:
				return isSelfIntersect();
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__REF_DIRECTION:
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
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__BASIS_CURVE:
				setBasisCurve((IfcCurve)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE:
				setDistance((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE_AS_STRING:
				setDistanceAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__SELF_INTERSECT:
				setSelfIntersect((Boolean)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__REF_DIRECTION:
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
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__BASIS_CURVE:
				setBasisCurve((IfcCurve)null);
				return;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE_AS_STRING:
				setDistanceAsString(DISTANCE_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__SELF_INTERSECT:
				setSelfIntersect(SELF_INTERSECT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__REF_DIRECTION:
				setRefDirection((IfcDirection)null);
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
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__BASIS_CURVE:
				return basisCurve != null;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__DISTANCE_AS_STRING:
				return DISTANCE_AS_STRING_EDEFAULT == null ? distanceAsString != null : !DISTANCE_AS_STRING_EDEFAULT.equals(distanceAsString);
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__SELF_INTERSECT:
				return selfIntersect != SELF_INTERSECT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_OFFSET_CURVE3_D__REF_DIRECTION:
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
		result.append(" (Distance: ");
		result.append(distance);
		result.append(", DistanceAsString: ");
		result.append(distanceAsString);
		result.append(", SelfIntersect: ");
		result.append(selfIntersect);
		result.append(')');
		return result.toString();
	}

} //IfcOffsetCurve3DImpl
