/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BaseSurfaceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHalfSpaceSolid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Half Space Solid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcHalfSpaceSolidImpl#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcHalfSpaceSolidImpl#isAgreementFlag <em>Agreement Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcHalfSpaceSolidImpl extends IfcGeometricRepresentationItemImpl implements IfcHalfSpaceSolid {
	/**
	 * The cached value of the '{@link #getBaseSurface() <em>Base Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSurface()
	 * @generated
	 * @ordered
	 */
	protected BaseSurfaceType baseSurface;

	/**
	 * The default value of the '{@link #isAgreementFlag() <em>Agreement Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAgreementFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AGREEMENT_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAgreementFlag() <em>Agreement Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAgreementFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean agreementFlag = AGREEMENT_FLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcHalfSpaceSolidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcHalfSpaceSolid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseSurfaceType getBaseSurface() {
		return baseSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseSurface(BaseSurfaceType newBaseSurface, NotificationChain msgs) {
		BaseSurfaceType oldBaseSurface = baseSurface;
		baseSurface = newBaseSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_HALF_SPACE_SOLID__BASE_SURFACE, oldBaseSurface, newBaseSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseSurface(BaseSurfaceType newBaseSurface) {
		if (newBaseSurface != baseSurface) {
			NotificationChain msgs = null;
			if (baseSurface != null)
				msgs = ((InternalEObject)baseSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_HALF_SPACE_SOLID__BASE_SURFACE, null, msgs);
			if (newBaseSurface != null)
				msgs = ((InternalEObject)newBaseSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_HALF_SPACE_SOLID__BASE_SURFACE, null, msgs);
			msgs = basicSetBaseSurface(newBaseSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_HALF_SPACE_SOLID__BASE_SURFACE, newBaseSurface, newBaseSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAgreementFlag() {
		return agreementFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgreementFlag(boolean newAgreementFlag) {
		boolean oldAgreementFlag = agreementFlag;
		agreementFlag = newAgreementFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG, oldAgreementFlag, agreementFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_HALF_SPACE_SOLID__BASE_SURFACE:
				return basicSetBaseSurface(null, msgs);
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
			case FinalPackage.IFC_HALF_SPACE_SOLID__BASE_SURFACE:
				return getBaseSurface();
			case FinalPackage.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG:
				return isAgreementFlag();
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
			case FinalPackage.IFC_HALF_SPACE_SOLID__BASE_SURFACE:
				setBaseSurface((BaseSurfaceType)newValue);
				return;
			case FinalPackage.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG:
				setAgreementFlag((Boolean)newValue);
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
			case FinalPackage.IFC_HALF_SPACE_SOLID__BASE_SURFACE:
				setBaseSurface((BaseSurfaceType)null);
				return;
			case FinalPackage.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG:
				setAgreementFlag(AGREEMENT_FLAG_EDEFAULT);
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
			case FinalPackage.IFC_HALF_SPACE_SOLID__BASE_SURFACE:
				return baseSurface != null;
			case FinalPackage.IFC_HALF_SPACE_SOLID__AGREEMENT_FLAG:
				return agreementFlag != AGREEMENT_FLAG_EDEFAULT;
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
		result.append(" (agreementFlag: ");
		result.append(agreementFlag);
		result.append(')');
		return result.toString();
	}

} //IfcHalfSpaceSolidImpl
