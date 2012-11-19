/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BasisCurveType3;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve2D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Offset Curve2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOffsetCurve2DImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOffsetCurve2DImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOffsetCurve2DImpl#getSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOffsetCurve2DImpl extends IfcCurveImpl implements IfcOffsetCurve2D {
	/**
	 * The cached value of the '{@link #getBasisCurve() <em>Basis Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisCurve()
	 * @generated
	 * @ordered
	 */
	protected BasisCurveType3 basisCurve;

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
	 * The default value of the '{@link #getSelfIntersect() <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfIntersect()
	 * @generated
	 * @ordered
	 */
	protected static final Logical SELF_INTERSECT_EDEFAULT = Logical.FALSE;

	/**
	 * The cached value of the '{@link #getSelfIntersect() <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfIntersect()
	 * @generated
	 * @ordered
	 */
	protected Logical selfIntersect = SELF_INTERSECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOffsetCurve2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcOffsetCurve2D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisCurveType3 getBasisCurve() {
		return basisCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasisCurve(BasisCurveType3 newBasisCurve, NotificationChain msgs) {
		BasisCurveType3 oldBasisCurve = basisCurve;
		basisCurve = newBasisCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OFFSET_CURVE2_D__BASIS_CURVE, oldBasisCurve, newBasisCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasisCurve(BasisCurveType3 newBasisCurve) {
		if (newBasisCurve != basisCurve) {
			NotificationChain msgs = null;
			if (basisCurve != null)
				msgs = ((InternalEObject)basisCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OFFSET_CURVE2_D__BASIS_CURVE, null, msgs);
			if (newBasisCurve != null)
				msgs = ((InternalEObject)newBasisCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_OFFSET_CURVE2_D__BASIS_CURVE, null, msgs);
			msgs = basicSetBasisCurve(newBasisCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OFFSET_CURVE2_D__BASIS_CURVE, newBasisCurve, newBasisCurve));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OFFSET_CURVE2_D__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical getSelfIntersect() {
		return selfIntersect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfIntersect(Logical newSelfIntersect) {
		Logical oldSelfIntersect = selfIntersect;
		selfIntersect = newSelfIntersect == null ? SELF_INTERSECT_EDEFAULT : newSelfIntersect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OFFSET_CURVE2_D__SELF_INTERSECT, oldSelfIntersect, selfIntersect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_OFFSET_CURVE2_D__BASIS_CURVE:
				return basicSetBasisCurve(null, msgs);
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
			case FinalPackage.IFC_OFFSET_CURVE2_D__BASIS_CURVE:
				return getBasisCurve();
			case FinalPackage.IFC_OFFSET_CURVE2_D__DISTANCE:
				return getDistance();
			case FinalPackage.IFC_OFFSET_CURVE2_D__SELF_INTERSECT:
				return getSelfIntersect();
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
			case FinalPackage.IFC_OFFSET_CURVE2_D__BASIS_CURVE:
				setBasisCurve((BasisCurveType3)newValue);
				return;
			case FinalPackage.IFC_OFFSET_CURVE2_D__DISTANCE:
				setDistance((Double)newValue);
				return;
			case FinalPackage.IFC_OFFSET_CURVE2_D__SELF_INTERSECT:
				setSelfIntersect((Logical)newValue);
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
			case FinalPackage.IFC_OFFSET_CURVE2_D__BASIS_CURVE:
				setBasisCurve((BasisCurveType3)null);
				return;
			case FinalPackage.IFC_OFFSET_CURVE2_D__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case FinalPackage.IFC_OFFSET_CURVE2_D__SELF_INTERSECT:
				setSelfIntersect(SELF_INTERSECT_EDEFAULT);
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
			case FinalPackage.IFC_OFFSET_CURVE2_D__BASIS_CURVE:
				return basisCurve != null;
			case FinalPackage.IFC_OFFSET_CURVE2_D__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case FinalPackage.IFC_OFFSET_CURVE2_D__SELF_INTERSECT:
				return selfIntersect != SELF_INTERSECT_EDEFAULT;
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
		result.append(" (distance: ");
		result.append(distance);
		result.append(", selfIntersect: ");
		result.append(selfIntersect);
		result.append(')');
		return result.toString();
	}

} //IfcOffsetCurve2DImpl
