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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcActorRole;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RoleTypeImpl#getIfcActorRole <em>Ifc Actor Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeImpl extends EObjectImpl implements RoleType {
	/**
	 * The cached value of the '{@link #getIfcActorRole() <em>Ifc Actor Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcActorRole()
	 * @generated
	 * @ordered
	 */
	protected IfcActorRole ifcActorRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRoleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorRole getIfcActorRole() {
		return ifcActorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcActorRole(IfcActorRole newIfcActorRole, NotificationChain msgs) {
		IfcActorRole oldIfcActorRole = ifcActorRole;
		ifcActorRole = newIfcActorRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.ROLE_TYPE__IFC_ACTOR_ROLE, oldIfcActorRole, newIfcActorRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcActorRole(IfcActorRole newIfcActorRole) {
		if (newIfcActorRole != ifcActorRole) {
			NotificationChain msgs = null;
			if (ifcActorRole != null)
				msgs = ((InternalEObject)ifcActorRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ROLE_TYPE__IFC_ACTOR_ROLE, null, msgs);
			if (newIfcActorRole != null)
				msgs = ((InternalEObject)newIfcActorRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ROLE_TYPE__IFC_ACTOR_ROLE, null, msgs);
			msgs = basicSetIfcActorRole(newIfcActorRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ROLE_TYPE__IFC_ACTOR_ROLE, newIfcActorRole, newIfcActorRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ROLE_TYPE__IFC_ACTOR_ROLE:
				return basicSetIfcActorRole(null, msgs);
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
			case FinalPackage.ROLE_TYPE__IFC_ACTOR_ROLE:
				return getIfcActorRole();
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
			case FinalPackage.ROLE_TYPE__IFC_ACTOR_ROLE:
				setIfcActorRole((IfcActorRole)newValue);
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
			case FinalPackage.ROLE_TYPE__IFC_ACTOR_ROLE:
				setIfcActorRole((IfcActorRole)null);
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
			case FinalPackage.ROLE_TYPE__IFC_ACTOR_ROLE:
				return ifcActorRole != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleTypeImpl
