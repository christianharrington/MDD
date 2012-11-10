/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcApproval;
import ifc2x3tc1.IfcApprovalPropertyRelationship;
import ifc2x3tc1.IfcProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval Property Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalPropertyRelationshipImpl#getApprovedProperties <em>Approved Properties</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalPropertyRelationshipImpl#getApproval <em>Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApprovalPropertyRelationshipImpl extends EObjectImpl implements IfcApprovalPropertyRelationship {
	/**
	 * The cached value of the '{@link #getApprovedProperties() <em>Approved Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcProperty> approvedProperties;

	/**
	 * The cached value of the '{@link #getApproval() <em>Approval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproval()
	 * @generated
	 * @ordered
	 */
	protected IfcApproval approval;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcApprovalPropertyRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcProperty> getApprovedProperties() {
		if (approvedProperties == null) {
			approvedProperties = new EObjectResolvingEList<IfcProperty>(IfcProperty.class, this, Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES);
		}
		return approvedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval getApproval() {
		if (approval != null && approval.eIsProxy()) {
			InternalEObject oldApproval = (InternalEObject)approval;
			approval = (IfcApproval)eResolveProxy(oldApproval);
			if (approval != oldApproval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL, oldApproval, approval));
			}
		}
		return approval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval basicGetApproval() {
		return approval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproval(IfcApproval newApproval) {
		IfcApproval oldApproval = approval;
		approval = newApproval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL, oldApproval, approval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES:
				return getApprovedProperties();
			case Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL:
				if (resolve) return getApproval();
				return basicGetApproval();
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
			case Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES:
				getApprovedProperties().clear();
				getApprovedProperties().addAll((Collection<? extends IfcProperty>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL:
				setApproval((IfcApproval)newValue);
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
			case Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES:
				getApprovedProperties().clear();
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL:
				setApproval((IfcApproval)null);
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
			case Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVED_PROPERTIES:
				return approvedProperties != null && !approvedProperties.isEmpty();
			case Ifc2x3tc1Package.IFC_APPROVAL_PROPERTY_RELATIONSHIP__APPROVAL:
				return approval != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcApprovalPropertyRelationshipImpl
