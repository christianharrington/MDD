/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ActorType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ApprovalType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApprovalActorRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval Actor Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalActorRelationshipImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalActorRelationshipImpl#getApproval <em>Approval</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApprovalActorRelationshipImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApprovalActorRelationshipImpl extends EntityImpl implements IfcApprovalActorRelationship {
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected ActorType actor;

	/**
	 * The cached value of the '{@link #getApproval() <em>Approval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproval()
	 * @generated
	 * @ordered
	 */
	protected ApprovalType1 approval;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected RoleType role;

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
		return FinalPackage.eINSTANCE.getIfcApprovalActorRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorType getActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActor(ActorType newActor, NotificationChain msgs) {
		ActorType oldActor = actor;
		actor = newActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR, oldActor, newActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(ActorType newActor) {
		if (newActor != actor) {
			NotificationChain msgs = null;
			if (actor != null)
				msgs = ((InternalEObject)actor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR, null, msgs);
			if (newActor != null)
				msgs = ((InternalEObject)newActor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR, null, msgs);
			msgs = basicSetActor(newActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR, newActor, newActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalType1 getApproval() {
		return approval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproval(ApprovalType1 newApproval, NotificationChain msgs) {
		ApprovalType1 oldApproval = approval;
		approval = newApproval;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL, oldApproval, newApproval);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproval(ApprovalType1 newApproval) {
		if (newApproval != approval) {
			NotificationChain msgs = null;
			if (approval != null)
				msgs = ((InternalEObject)approval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL, null, msgs);
			if (newApproval != null)
				msgs = ((InternalEObject)newApproval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL, null, msgs);
			msgs = basicSetApproval(newApproval, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL, newApproval, newApproval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(RoleType newRole, NotificationChain msgs) {
		RoleType oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(RoleType newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR:
				return basicSetActor(null, msgs);
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				return basicSetApproval(null, msgs);
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE:
				return basicSetRole(null, msgs);
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
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR:
				return getActor();
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				return getApproval();
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE:
				return getRole();
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
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR:
				setActor((ActorType)newValue);
				return;
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				setApproval((ApprovalType1)newValue);
				return;
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE:
				setRole((RoleType)newValue);
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
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR:
				setActor((ActorType)null);
				return;
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				setApproval((ApprovalType1)null);
				return;
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE:
				setRole((RoleType)null);
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
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ACTOR:
				return actor != null;
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__APPROVAL:
				return approval != null;
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcApprovalActorRelationshipImpl
