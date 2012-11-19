/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesApproval;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingApprovalType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Approval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssociatesApprovalImpl#getRelatingApproval <em>Relating Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesApprovalImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesApproval {
	/**
	 * The cached value of the '{@link #getRelatingApproval() <em>Relating Approval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingApproval()
	 * @generated
	 * @ordered
	 */
	protected RelatingApprovalType relatingApproval;

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
		return FinalPackage.eINSTANCE.getIfcRelAssociatesApproval();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingApprovalType getRelatingApproval() {
		return relatingApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingApproval(RelatingApprovalType newRelatingApproval, NotificationChain msgs) {
		RelatingApprovalType oldRelatingApproval = relatingApproval;
		relatingApproval = newRelatingApproval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL, oldRelatingApproval, newRelatingApproval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingApproval(RelatingApprovalType newRelatingApproval) {
		if (newRelatingApproval != relatingApproval) {
			NotificationChain msgs = null;
			if (relatingApproval != null)
				msgs = ((InternalEObject)relatingApproval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL, null, msgs);
			if (newRelatingApproval != null)
				msgs = ((InternalEObject)newRelatingApproval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL, null, msgs);
			msgs = basicSetRelatingApproval(newRelatingApproval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL, newRelatingApproval, newRelatingApproval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL:
				return basicSetRelatingApproval(null, msgs);
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
			case FinalPackage.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL:
				return getRelatingApproval();
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
			case FinalPackage.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL:
				setRelatingApproval((RelatingApprovalType)newValue);
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
			case FinalPackage.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL:
				setRelatingApproval((RelatingApprovalType)null);
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
			case FinalPackage.IFC_REL_ASSOCIATES_APPROVAL__RELATING_APPROVAL:
				return relatingApproval != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesApprovalImpl
