/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcArbitraryClosedProfileDef;
import ifc2x3tc1.IfcCurve;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Arbitrary Closed Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcArbitraryClosedProfileDefImpl#getOuterCurve <em>Outer Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcArbitraryClosedProfileDefImpl extends IfcProfileDefImpl implements IfcArbitraryClosedProfileDef {
	/**
	 * The cached value of the '{@link #getOuterCurve() <em>Outer Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcCurve outerCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcArbitraryClosedProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcArbitraryClosedProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getOuterCurve() {
		if (outerCurve != null && outerCurve.eIsProxy()) {
			InternalEObject oldOuterCurve = (InternalEObject)outerCurve;
			outerCurve = (IfcCurve)eResolveProxy(oldOuterCurve);
			if (outerCurve != oldOuterCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE, oldOuterCurve, outerCurve));
			}
		}
		return outerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve basicGetOuterCurve() {
		return outerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterCurve(IfcCurve newOuterCurve) {
		IfcCurve oldOuterCurve = outerCurve;
		outerCurve = newOuterCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE, oldOuterCurve, outerCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE:
				if (resolve) return getOuterCurve();
				return basicGetOuterCurve();
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
			case Ifc2x3tc1Package.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE:
				setOuterCurve((IfcCurve)newValue);
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
			case Ifc2x3tc1Package.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE:
				setOuterCurve((IfcCurve)null);
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
			case Ifc2x3tc1Package.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE:
				return outerCurve != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcArbitraryClosedProfileDefImpl
