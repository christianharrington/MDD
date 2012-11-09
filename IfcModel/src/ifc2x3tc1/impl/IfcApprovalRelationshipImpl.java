/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcApproval;
import ifc2x3tc1.IfcApprovalRelationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalRelationshipImpl#getRelatedApproval <em>Related Approval</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalRelationshipImpl#getRelatingApproval <em>Relating Approval</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalRelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalRelationshipImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApprovalRelationshipImpl extends EObjectImpl implements IfcApprovalRelationship {
	/**
	 * The cached value of the '{@link #getRelatedApproval() <em>Related Approval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedApproval()
	 * @generated
	 * @ordered
	 */
	protected IfcApproval relatedApproval;

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
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcApprovalRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval getRelatedApproval() {
		if (relatedApproval != null && relatedApproval.eIsProxy()) {
			InternalEObject oldRelatedApproval = (InternalEObject)relatedApproval;
			relatedApproval = (IfcApproval)eResolveProxy(oldRelatedApproval);
			if (relatedApproval != oldRelatedApproval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL, oldRelatedApproval, relatedApproval));
			}
		}
		return relatedApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval basicGetRelatedApproval() {
		return relatedApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedApproval(IfcApproval newRelatedApproval, NotificationChain msgs) {
		IfcApproval oldRelatedApproval = relatedApproval;
		relatedApproval = newRelatedApproval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL, oldRelatedApproval, newRelatedApproval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedApproval(IfcApproval newRelatedApproval) {
		if (newRelatedApproval != relatedApproval) {
			NotificationChain msgs = null;
			if (relatedApproval != null)
				msgs = ((InternalEObject)relatedApproval).eInverseRemove(this, Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH, IfcApproval.class, msgs);
			if (newRelatedApproval != null)
				msgs = ((InternalEObject)newRelatedApproval).eInverseAdd(this, Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH, IfcApproval.class, msgs);
			msgs = basicSetRelatedApproval(newRelatedApproval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL, newRelatedApproval, newRelatedApproval));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL, oldRelatingApproval, relatingApproval));
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
	public NotificationChain basicSetRelatingApproval(IfcApproval newRelatingApproval, NotificationChain msgs) {
		IfcApproval oldRelatingApproval = relatingApproval;
		relatingApproval = newRelatingApproval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL, oldRelatingApproval, newRelatingApproval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingApproval(IfcApproval newRelatingApproval) {
		if (newRelatingApproval != relatingApproval) {
			NotificationChain msgs = null;
			if (relatingApproval != null)
				msgs = ((InternalEObject)relatingApproval).eInverseRemove(this, Ifc2x3tc1Package.IFC_APPROVAL__RELATES, IfcApproval.class, msgs);
			if (newRelatingApproval != null)
				msgs = ((InternalEObject)newRelatingApproval).eInverseAdd(this, Ifc2x3tc1Package.IFC_APPROVAL__RELATES, IfcApproval.class, msgs);
			msgs = basicSetRelatingApproval(newRelatingApproval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL, newRelatingApproval, newRelatingApproval));
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
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				if (relatedApproval != null)
					msgs = ((InternalEObject)relatedApproval).eInverseRemove(this, Ifc2x3tc1Package.IFC_APPROVAL__IS_RELATED_WITH, IfcApproval.class, msgs);
				return basicSetRelatedApproval((IfcApproval)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
				if (relatingApproval != null)
					msgs = ((InternalEObject)relatingApproval).eInverseRemove(this, Ifc2x3tc1Package.IFC_APPROVAL__RELATES, IfcApproval.class, msgs);
				return basicSetRelatingApproval((IfcApproval)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				return basicSetRelatedApproval(null, msgs);
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
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
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				if (resolve) return getRelatedApproval();
				return basicGetRelatedApproval();
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
				if (resolve) return getRelatingApproval();
				return basicGetRelatingApproval();
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__NAME:
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
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				setRelatedApproval((IfcApproval)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
				setRelatingApproval((IfcApproval)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__NAME:
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
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				setRelatedApproval((IfcApproval)null);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
				setRelatingApproval((IfcApproval)null);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__NAME:
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
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATED_APPROVAL:
				return relatedApproval != null;
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__RELATING_APPROVAL:
				return relatingApproval != null;
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_APPROVAL_RELATIONSHIP__NAME:
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
		result.append(" (Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IfcApprovalRelationshipImpl
