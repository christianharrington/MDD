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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RolesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TheOrganizationType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ThePersonType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Person And Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonAndOrganizationImpl#getThePerson <em>The Person</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonAndOrganizationImpl#getTheOrganization <em>The Organization</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPersonAndOrganizationImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPersonAndOrganizationImpl extends EntityImpl implements IfcPersonAndOrganization {
	/**
	 * The cached value of the '{@link #getThePerson() <em>The Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePerson()
	 * @generated
	 * @ordered
	 */
	protected ThePersonType thePerson;

	/**
	 * The cached value of the '{@link #getTheOrganization() <em>The Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheOrganization()
	 * @generated
	 * @ordered
	 */
	protected TheOrganizationType theOrganization;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected RolesType roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPersonAndOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPersonAndOrganization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThePersonType getThePerson() {
		return thePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThePerson(ThePersonType newThePerson, NotificationChain msgs) {
		ThePersonType oldThePerson = thePerson;
		thePerson = newThePerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_PERSON, oldThePerson, newThePerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePerson(ThePersonType newThePerson) {
		if (newThePerson != thePerson) {
			NotificationChain msgs = null;
			if (thePerson != null)
				msgs = ((InternalEObject)thePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_PERSON, null, msgs);
			if (newThePerson != null)
				msgs = ((InternalEObject)newThePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_PERSON, null, msgs);
			msgs = basicSetThePerson(newThePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_PERSON, newThePerson, newThePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheOrganizationType getTheOrganization() {
		return theOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheOrganization(TheOrganizationType newTheOrganization, NotificationChain msgs) {
		TheOrganizationType oldTheOrganization = theOrganization;
		theOrganization = newTheOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION, oldTheOrganization, newTheOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheOrganization(TheOrganizationType newTheOrganization) {
		if (newTheOrganization != theOrganization) {
			NotificationChain msgs = null;
			if (theOrganization != null)
				msgs = ((InternalEObject)theOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION, null, msgs);
			if (newTheOrganization != null)
				msgs = ((InternalEObject)newTheOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION, null, msgs);
			msgs = basicSetTheOrganization(newTheOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION, newTheOrganization, newTheOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoles(RolesType newRoles, NotificationChain msgs) {
		RolesType oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON_AND_ORGANIZATION__ROLES, oldRoles, newRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(RolesType newRoles) {
		if (newRoles != roles) {
			NotificationChain msgs = null;
			if (roles != null)
				msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON_AND_ORGANIZATION__ROLES, null, msgs);
			if (newRoles != null)
				msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PERSON_AND_ORGANIZATION__ROLES, null, msgs);
			msgs = basicSetRoles(newRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PERSON_AND_ORGANIZATION__ROLES, newRoles, newRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				return basicSetThePerson(null, msgs);
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				return basicSetTheOrganization(null, msgs);
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__ROLES:
				return basicSetRoles(null, msgs);
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
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				return getThePerson();
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				return getTheOrganization();
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__ROLES:
				return getRoles();
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
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				setThePerson((ThePersonType)newValue);
				return;
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				setTheOrganization((TheOrganizationType)newValue);
				return;
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__ROLES:
				setRoles((RolesType)newValue);
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
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				setThePerson((ThePersonType)null);
				return;
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				setTheOrganization((TheOrganizationType)null);
				return;
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__ROLES:
				setRoles((RolesType)null);
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
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				return thePerson != null;
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				return theOrganization != null;
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION__ROLES:
				return roles != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcPersonAndOrganizationImpl
