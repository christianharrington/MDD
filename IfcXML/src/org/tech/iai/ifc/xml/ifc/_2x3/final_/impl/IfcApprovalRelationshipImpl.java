/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApprovalRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedApprovalType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingApprovalType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalRelationshipImpl#getRelatedApproval <em>Related Approval</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalRelationshipImpl#getRelatingApproval <em>Relating Approval</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalRelationshipImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApprovalRelationshipImpl extends EntityImpl implements IfcApprovalRelationship {
	/**
	 * The cached value of the '{@link #getRelatedApproval() <em>Related Approval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedApproval()
	 * @generated
	 * @ordered
	 */
	protected RelatedApprovalType relatedApproval;

	/**
	 * The cached value of the '{@link #getRelatingApproval() <em>Relating Approval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingApproval()
	 * @generated
	 * @ordered
	 */
	protected RelatingApprovalType1 relatingApproval;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApprovalRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcApprovalRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedApprovalType getRelatedApproval() {
		return relatedApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedApproval(RelatedApprovalType newRelatedApproval, NotificationChain msgs) {
		RelatedApprovalType oldRelatedApproval = relatedApproval;
		relatedApproval = newRelatedApproval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL, oldRelatedApproval, newRelatedApproval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedApproval(RelatedApprovalType newRelatedApproval) {
		if (newRelatedApproval != relatedApproval) {
			NotificationChain msgs = null;
			if (relatedApproval != null)
				msgs = ((InternalEObject)relatedApproval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL, null, msgs);
			if (newRelatedApproval != null)
				msgs = ((InternalEObject)newRelatedApproval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL, null, msgs);
			msgs = basicSetRelatedApproval(newRelatedApproval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL, newRelatedApproval, newRelatedApproval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingApprovalType1 getRelatingApproval() {
		return relatingApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingApproval(RelatingApprovalType1 newRelatingApproval, NotificationChain msgs) {
		RelatingApprovalType1 oldRelatingApproval = relatingApproval;
		relatingApproval = newRelatingApproval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL, oldRelatingApproval, newRelatingApproval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingApproval(RelatingApprovalType1 newRelatingApproval) {
		if (newRelatingApproval != relatingApproval) {
			NotificationChain msgs = null;
			if (relatingApproval != null)
				msgs = ((InternalEObject)relatingApproval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL, null, msgs);
			if (newRelatingApproval != null)
				msgs = ((InternalEObject)newRelatingApproval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL, null, msgs);
			msgs = basicSetRelatingApproval(newRelatingApproval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL, newRelatingApproval, newRelatingApproval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				return basicSetRelatedApproval(null, msgs);
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
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
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				return getRelatedApproval();
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
				return getRelatingApproval();
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__NAME:
				return getName();
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
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				setRelatedApproval((RelatedApprovalType)newValue);
				return;
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
				setRelatingApproval((RelatingApprovalType1)newValue);
				return;
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__NAME:
				setName((String)newValue);
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
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				setRelatedApproval((RelatedApprovalType)null);
				return;
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
				setRelatingApproval((RelatingApprovalType1)null);
				return;
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
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
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				return relatedApproval != null;
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
				return relatingApproval != null;
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IfcApprovalRelationshipImpl
