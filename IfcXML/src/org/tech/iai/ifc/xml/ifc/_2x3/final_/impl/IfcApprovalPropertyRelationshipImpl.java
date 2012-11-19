/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ApprovalType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ApprovedPropertiesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApprovalPropertyRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval Property Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalPropertyRelationshipImpl#getApprovedProperties <em>Approved Properties</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalPropertyRelationshipImpl#getApproval <em>Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApprovalPropertyRelationshipImpl extends EntityImpl implements IfcApprovalPropertyRelationship {
	/**
	 * The cached value of the '{@link #getApprovedProperties() <em>Approved Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedProperties()
	 * @generated
	 * @ordered
	 */
	protected ApprovedPropertiesType approvedProperties;

	/**
	 * The cached value of the '{@link #getApproval() <em>Approval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproval()
	 * @generated
	 * @ordered
	 */
	protected ApprovalType approval;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApprovalPropertyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcApprovalPropertyRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovedPropertiesType getApprovedProperties() {
		return approvedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApprovedProperties(ApprovedPropertiesType newApprovedProperties, NotificationChain msgs) {
		ApprovedPropertiesType oldApprovedProperties = approvedProperties;
		approvedProperties = newApprovedProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES, oldApprovedProperties, newApprovedProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovedProperties(ApprovedPropertiesType newApprovedProperties) {
		if (newApprovedProperties != approvedProperties) {
			NotificationChain msgs = null;
			if (approvedProperties != null)
				msgs = ((InternalEObject)approvedProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES, null, msgs);
			if (newApprovedProperties != null)
				msgs = ((InternalEObject)newApprovedProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES, null, msgs);
			msgs = basicSetApprovedProperties(newApprovedProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES, newApprovedProperties, newApprovedProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalType getApproval() {
		return approval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproval(ApprovalType newApproval, NotificationChain msgs) {
		ApprovalType oldApproval = approval;
		approval = newApproval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL, oldApproval, newApproval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproval(ApprovalType newApproval) {
		if (newApproval != approval) {
			NotificationChain msgs = null;
			if (approval != null)
				msgs = ((InternalEObject)approval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL, null, msgs);
			if (newApproval != null)
				msgs = ((InternalEObject)newApproval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL, null, msgs);
			msgs = basicSetApproval(newApproval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL, newApproval, newApproval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES:
				return basicSetApprovedProperties(null, msgs);
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL:
				return basicSetApproval(null, msgs);
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
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES:
				return getApprovedProperties();
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL:
				return getApproval();
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
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES:
				setApprovedProperties((ApprovedPropertiesType)newValue);
				return;
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL:
				setApproval((ApprovalType)newValue);
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
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES:
				setApprovedProperties((ApprovedPropertiesType)null);
				return;
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL:
				setApproval((ApprovalType)null);
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
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES:
				return approvedProperties != null;
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL:
				return approval != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcApprovalPropertyRelationshipImpl
