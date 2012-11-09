/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcApproval;
import ifc2x3tc1.IfcRelAssociatesApproval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Approval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesApprovalImpl#getRelatingApproval <em>Relating Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesApprovalImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesApproval {
	/**
	 * The cached value of the '{@link #getRelatingApproval() <em>Relating Approval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingApproval()
	 * @generated
	 * @ordered
	 */
	protected IfcApproval relatingApproval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesApprovalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssociatesApproval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval getRelatingApproval() {
		if (relatingApproval != null && relatingApproval.eIsProxy()) {
			InternalEObject oldRelatingApproval = (InternalEObject)relatingApproval;
			relatingApproval = (IfcApproval)eResolveProxy(oldRelatingApproval);
			if (relatingApproval != oldRelatingApproval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL, oldRelatingApproval, relatingApproval));
			}
		}
		return relatingApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval basicGetRelatingApproval() {
		return relatingApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingApproval(IfcApproval newRelatingApproval) {
		IfcApproval oldRelatingApproval = relatingApproval;
		relatingApproval = newRelatingApproval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL, oldRelatingApproval, relatingApproval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL:
				if (resolve) return getRelatingApproval();
				return basicGetRelatingApproval();
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL:
				setRelatingApproval((IfcApproval)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL:
				setRelatingApproval((IfcApproval)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL:
				return relatingApproval != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesApprovalImpl
