/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ActingRoleType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToActor;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingActorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssignsToActorImpl#getRelatingActor <em>Relating Actor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssignsToActorImpl#getActingRole <em>Acting Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToActorImpl extends IfcRelAssignsImpl implements IfcRelAssignsToActor {
	/**
	 * The cached value of the '{@link #getRelatingActor() <em>Relating Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingActor()
	 * @generated
	 * @ordered
	 */
	protected RelatingActorType relatingActor;

	/**
	 * The cached value of the '{@link #getActingRole() <em>Acting Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActingRole()
	 * @generated
	 * @ordered
	 */
	protected ActingRoleType actingRole;

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
		return FinalPackage.eINSTANCE.getIfcRelAssignsToActor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingActorType getRelatingActor() {
		return relatingActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingActor(RelatingActorType newRelatingActor, NotificationChain msgs) {
		RelatingActorType oldRelatingActor = relatingActor;
		relatingActor = newRelatingActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR, oldRelatingActor, newRelatingActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingActor(RelatingActorType newRelatingActor) {
		if (newRelatingActor != relatingActor) {
			NotificationChain msgs = null;
			if (relatingActor != null)
				msgs = ((InternalEObject)relatingActor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR, null, msgs);
			if (newRelatingActor != null)
				msgs = ((InternalEObject)newRelatingActor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR, null, msgs);
			msgs = basicSetRelatingActor(newRelatingActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR, newRelatingActor, newRelatingActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActingRoleType getActingRole() {
		return actingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActingRole(ActingRoleType newActingRole, NotificationChain msgs) {
		ActingRoleType oldActingRole = actingRole;
		actingRole = newActingRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE, oldActingRole, newActingRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActingRole(ActingRoleType newActingRole) {
		if (newActingRole != actingRole) {
			NotificationChain msgs = null;
			if (actingRole != null)
				msgs = ((InternalEObject)actingRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE, null, msgs);
			if (newActingRole != null)
				msgs = ((InternalEObject)newActingRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE, null, msgs);
			msgs = basicSetActingRole(newActingRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE, newActingRole, newActingRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				return basicSetRelatingActor(null, msgs);
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE:
				return basicSetActingRole(null, msgs);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				return getRelatingActor();
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE:
				return getActingRole();
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				setRelatingActor((RelatingActorType)newValue);
				return;
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE:
				setActingRole((ActingRoleType)newValue);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				setRelatingActor((RelatingActorType)null);
				return;
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE:
				setActingRole((ActingRoleType)null);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__RELATING_ACTOR:
				return relatingActor != null;
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR__ACTING_ROLE:
				return actingRole != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToActorImpl
