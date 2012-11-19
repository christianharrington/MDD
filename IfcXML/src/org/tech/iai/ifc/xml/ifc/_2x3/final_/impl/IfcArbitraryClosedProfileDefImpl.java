/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcArbitraryClosedProfileDef;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OuterCurveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Arbitrary Closed Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcArbitraryClosedProfileDefImpl#getOuterCurve <em>Outer Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcArbitraryClosedProfileDefImpl extends IfcProfileDefImpl implements IfcArbitraryClosedProfileDef {
	/**
	 * The cached value of the '{@link #getOuterCurve() <em>Outer Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterCurve()
	 * @generated
	 * @ordered
	 */
	protected OuterCurveType outerCurve;

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
		return FinalPackage.eINSTANCE.getIfcArbitraryClosedProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuterCurveType getOuterCurve() {
		return outerCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterCurve(OuterCurveType newOuterCurve, NotificationChain msgs) {
		OuterCurveType oldOuterCurve = outerCurve;
		outerCurve = newOuterCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE, oldOuterCurve, newOuterCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterCurve(OuterCurveType newOuterCurve) {
		if (newOuterCurve != outerCurve) {
			NotificationChain msgs = null;
			if (outerCurve != null)
				msgs = ((InternalEObject)outerCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE, null, msgs);
			if (newOuterCurve != null)
				msgs = ((InternalEObject)newOuterCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE, null, msgs);
			msgs = basicSetOuterCurve(newOuterCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE, newOuterCurve, newOuterCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE:
				return basicSetOuterCurve(null, msgs);
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
			case FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE:
				return getOuterCurve();
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
			case FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE:
				setOuterCurve((OuterCurveType)newValue);
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
			case FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE:
				setOuterCurve((OuterCurveType)null);
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
			case FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF__OUTER_CURVE:
				return outerCurve != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcArbitraryClosedProfileDefImpl
