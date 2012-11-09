/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCompositeCurve;
import ifc2x3tc1.IfcCompositeCurveSegment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Composite Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCompositeCurveImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCompositeCurveImpl#isSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCompositeCurveImpl extends IfcBoundedCurveImpl implements IfcCompositeCurve {
	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcCompositeCurveSegment> segments;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCompositeCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCompositeCurve();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCompositeCurveSegment> getSegments() {
		if (segments == null) {
			segments = new EObjectWithInverseResolvingEList.ManyInverse<IfcCompositeCurveSegment>(IfcCompositeCurveSegment.class, this, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SEGMENTS, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE_SEGMENT__USING_CURVES);
		}
		return segments;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SELF_INTERSECT, oldSelfIntersect, selfIntersect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SEGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSegments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SEGMENTS:
				return getSegments();
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SELF_INTERSECT:
				return isSelfIntersect();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends IfcCompositeCurveSegment>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SELF_INTERSECT:
				setSelfIntersect((Boolean)newValue);
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
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SEGMENTS:
				getSegments().clear();
				return;
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SELF_INTERSECT:
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
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case Ifc2x3tc1Package.IFC_COMPOSITE_CURVE__SELF_INTERSECT:
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
		result.append(" (SelfIntersect: ");
		result.append(selfIntersect);
		result.append(')');
		return result.toString();
	}

} //IfcCompositeCurveImpl
