/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApproval;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingApprovalType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Approval Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingApprovalTypeImpl#getIfcApproval <em>Ifc Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingApprovalTypeImpl extends EObjectImpl implements RelatingApprovalType {
	/**
	 * The cached value of the '{@link #getIfcApproval() <em>Ifc Approval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcApproval()
	 * @generated
	 * @ordered
	 */
	protected IfcApproval ifcApproval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingApprovalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingApprovalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval getIfcApproval() {
		return ifcApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcApproval(IfcApproval newIfcApproval, NotificationChain msgs) {
		IfcApproval oldIfcApproval = ifcApproval;
		ifcApproval = newIfcApproval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_APPROVAL_TYPE__IFC_APPROVAL, oldIfcApproval, newIfcApproval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcApproval(IfcApproval newIfcApproval) {
		if (newIfcApproval != ifcApproval) {
			NotificationChain msgs = null;
			if (ifcApproval != null)
				msgs = ((InternalEObject)ifcApproval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_APPROVAL_TYPE__IFC_APPROVAL, null, msgs);
			if (newIfcApproval != null)
				msgs = ((InternalEObject)newIfcApproval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_APPROVAL_TYPE__IFC_APPROVAL, null, msgs);
			msgs = basicSetIfcApproval(newIfcApproval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_APPROVAL_TYPE__IFC_APPROVAL, newIfcApproval, newIfcApproval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_APPROVAL_TYPE__IFC_APPROVAL:
				return basicSetIfcApproval(null, msgs);
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
			case FinalPackage.RELATING_APPROVAL_TYPE__IFC_APPROVAL:
				return getIfcApproval();
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
			case FinalPackage.RELATING_APPROVAL_TYPE__IFC_APPROVAL:
				setIfcApproval((IfcApproval)newValue);
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
			case FinalPackage.RELATING_APPROVAL_TYPE__IFC_APPROVAL:
				setIfcApproval((IfcApproval)null);
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
			case FinalPackage.RELATING_APPROVAL_TYPE__IFC_APPROVAL:
				return ifcApproval != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatingApprovalTypeImpl
