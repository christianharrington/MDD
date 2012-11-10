/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActor;
import ifc2x3tc1.IfcActorRole;
import ifc2x3tc1.IfcRelAssignsToActor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsToActorImpl#getRelatingActor <em>Relating Actor</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsToActorImpl#getActingRole <em>Acting Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToActorImpl extends IfcRelAssignsImpl implements IfcRelAssignsToActor {
	/**
	 * The cached value of the '{@link #getRelatingActor() <em>Relating Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingActor()
	 * @generated
	 * @ordered
	 */
	protected IfcActor relatingActor;

	/**
	 * The cached value of the '{@link #getActingRole() <em>Acting Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActingRole()
	 * @generated
	 * @ordered
	 */
	protected IfcActorRole actingRole;

	/**
	 * This is true if the Acting Role reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actingRoleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssignsToActor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActor getRelatingActor() {
		if (relatingActor != null && relatingActor.eIsProxy()) {
			InternalEObject oldRelatingActor = (InternalEObject)relatingActor;
			relatingActor = (IfcActor)eResolveProxy(oldRelatingActor);
			if (relatingActor != oldRelatingActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR, oldRelatingActor, relatingActor));
			}
		}
		return relatingActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActor basicGetRelatingActor() {
		return relatingActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingActor(IfcActor newRelatingActor, NotificationChain msgs) {
		IfcActor oldRelatingActor = relatingActor;
		relatingActor = newRelatingActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR, oldRelatingActor, newRelatingActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingActor(IfcActor newRelatingActor) {
		if (newRelatingActor != relatingActor) {
			NotificationChain msgs = null;
			if (relatingActor != null)
				msgs = ((InternalEObject)relatingActor).eInverseRemove(this, Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON, IfcActor.class, msgs);
			if (newRelatingActor != null)
				msgs = ((InternalEObject)newRelatingActor).eInverseAdd(this, Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON, IfcActor.class, msgs);
			msgs = basicSetRelatingActor(newRelatingActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR, newRelatingActor, newRelatingActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorRole getActingRole() {
		if (actingRole != null && actingRole.eIsProxy()) {
			InternalEObject oldActingRole = (InternalEObject)actingRole;
			actingRole = (IfcActorRole)eResolveProxy(oldActingRole);
			if (actingRole != oldActingRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE, oldActingRole, actingRole));
			}
		}
		return actingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorRole basicGetActingRole() {
		return actingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActingRole(IfcActorRole newActingRole) {
		IfcActorRole oldActingRole = actingRole;
		actingRole = newActingRole;
		boolean oldActingRoleESet = actingRoleESet;
		actingRoleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE, oldActingRole, actingRole, !oldActingRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActingRole() {
		IfcActorRole oldActingRole = actingRole;
		boolean oldActingRoleESet = actingRoleESet;
		actingRole = null;
		actingRoleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE, oldActingRole, null, oldActingRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActingRole() {
		return actingRoleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				if (relatingActor != null)
					msgs = ((InternalEObject)relatingActor).eInverseRemove(this, Ifc2x3tc1Package.IFC_ACTOR__IS_ACTING_UPON, IfcActor.class, msgs);
				return basicSetRelatingActor((IfcActor)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				return basicSetRelatingActor(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				if (resolve) return getRelatingActor();
				return basicGetRelatingActor();
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE:
				if (resolve) return getActingRole();
				return basicGetActingRole();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				setRelatingActor((IfcActor)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE:
				setActingRole((IfcActorRole)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				setRelatingActor((IfcActor)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE:
				unsetActingRole();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				return relatingActor != null;
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE:
				return isSetActingRole();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToActorImpl
