/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcArbitraryOpenProfileDef;
import ifc2x3tc1.IfcBoundedCurve;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Arbitrary Open Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcArbitraryOpenProfileDefImpl#getCurve <em>Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcArbitraryOpenProfileDefImpl extends IfcProfileDefImpl implements IfcArbitraryOpenProfileDef {
	/**
	 * The cached value of the '{@link #getCurve() <em>Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcBoundedCurve curve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcArbitraryOpenProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcArbitraryOpenProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundedCurve getCurve() {
		if (curve != null && curve.eIsProxy()) {
			InternalEObject oldCurve = (InternalEObject)curve;
			curve = (IfcBoundedCurve)eResolveProxy(oldCurve);
			if (curve != oldCurve) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_ARBITRARY_OPEN_PROFILE_DEF__CURVE, oldCurve, curve));
			}
		}
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundedCurve basicGetCurve() {
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurve(IfcBoundedCurve newCurve) {
		IfcBoundedCurve oldCurve = curve;
		curve = newCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ARBITRARY_OPEN_PROFILE_DEF__CURVE, oldCurve, curve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ARBITRARY_OPEN_PROFILE_DEF__CURVE:
				if (resolve) return getCurve();
				return basicGetCurve();
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
			case Ifc2x3tc1Package.IFC_ARBITRARY_OPEN_PROFILE_DEF__CURVE:
				setCurve((IfcBoundedCurve)newValue);
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
			case Ifc2x3tc1Package.IFC_ARBITRARY_OPEN_PROFILE_DEF__CURVE:
				setCurve((IfcBoundedCurve)null);
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
			case Ifc2x3tc1Package.IFC_ARBITRARY_OPEN_PROFILE_DEF__CURVE:
				return curve != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcArbitraryOpenProfileDefImpl
