/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcArbitraryProfileDefWithVoids;
import org.tech.iai.ifc.xml.ifc._2x3.final_.InnerCurvesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Arbitrary Profile Def With Voids</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcArbitraryProfileDefWithVoidsImpl#getInnerCurves <em>Inner Curves</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcArbitraryProfileDefWithVoidsImpl extends IfcArbitraryClosedProfileDefImpl implements IfcArbitraryProfileDefWithVoids {
	/**
	 * The cached value of the '{@link #getInnerCurves() <em>Inner Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerCurves()
	 * @generated
	 * @ordered
	 */
	protected InnerCurvesType innerCurves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcArbitraryProfileDefWithVoidsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcArbitraryProfileDefWithVoids();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerCurvesType getInnerCurves() {
		return innerCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerCurves(InnerCurvesType newInnerCurves, NotificationChain msgs) {
		InnerCurvesType oldInnerCurves = innerCurves;
		innerCurves = newInnerCurves;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES, oldInnerCurves, newInnerCurves);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerCurves(InnerCurvesType newInnerCurves) {
		if (newInnerCurves != innerCurves) {
			NotificationChain msgs = null;
			if (innerCurves != null)
				msgs = ((InternalEObject)innerCurves).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES, null, msgs);
			if (newInnerCurves != null)
				msgs = ((InternalEObject)newInnerCurves).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES, null, msgs);
			msgs = basicSetInnerCurves(newInnerCurves, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES, newInnerCurves, newInnerCurves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES:
				return basicSetInnerCurves(null, msgs);
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
			case FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES:
				return getInnerCurves();
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
			case FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES:
				setInnerCurves((InnerCurvesType)newValue);
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
			case FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES:
				setInnerCurves((InnerCurvesType)null);
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
			case FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS__INNER_CURVES:
				return innerCurves != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcArbitraryProfileDefWithVoidsImpl
