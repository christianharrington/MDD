/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorRole;
import ifc2x3tc1.IfcActorSelect;
import ifc2x3tc1.IfcApproval;
import ifc2x3tc1.IfcApprovalActorRelationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval Actor Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalActorRelationshipImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalActorRelationshipImpl#getApproval <em>Approval</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApprovalActorRelationshipImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApprovalActorRelationshipImpl extends EObjectImpl implements IfcApprovalActorRelationship {
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect actor;

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
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected IfcActorRole role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApprovalActorRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcApprovalActorRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (IfcActorSelect)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(IfcActorSelect newActor) {
		IfcActorSelect oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR, oldActor, actor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL, oldApproval, approval));
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
	public NotificationChain basicSetApproval(IfcApproval newApproval, NotificationChain msgs) {
		IfcApproval oldApproval = approval;
		approval = newApproval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL, oldApproval, newApproval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproval(IfcApproval newApproval) {
		if (newApproval != approval) {
			NotificationChain msgs = null;
			if (approval != null)
				msgs = ((InternalEObject)approval).eInverseRemove(this, Ifc2x3tc1Package.IFC_APPROVAL__ACTORS, IfcApproval.class, msgs);
			if (newApproval != null)
				msgs = ((InternalEObject)newApproval).eInverseAdd(this, Ifc2x3tc1Package.IFC_APPROVAL__ACTORS, IfcApproval.class, msgs);
			msgs = basicSetApproval(newApproval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL, newApproval, newApproval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorRole getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (IfcActorRole)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorRole basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(IfcActorRole newRole) {
		IfcActorRole oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				if (approval != null)
					msgs = ((InternalEObject)approval).eInverseRemove(this, Ifc2x3tc1Package.IFC_APPROVAL__ACTORS, IfcApproval.class, msgs);
				return basicSetApproval((IfcApproval)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
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
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				if (resolve) return getApproval();
				return basicGetApproval();
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
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
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR:
				setActor((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				setApproval((IfcApproval)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE:
				setRole((IfcActorRole)newValue);
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
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR:
				setActor((IfcActorSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				setApproval((IfcApproval)null);
				return;
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE:
				setRole((IfcActorRole)null);
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
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR:
				return actor != null;
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				return approval != null;
			case Ifc2x3tc1Package.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcApprovalActorRelationshipImpl
