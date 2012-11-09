/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorRole;
import ifc2x3tc1.IfcOrganization;
import ifc2x3tc1.IfcPerson;
import ifc2x3tc1.IfcPersonAndOrganization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Person And Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonAndOrganizationImpl#getThePerson <em>The Person</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonAndOrganizationImpl#getTheOrganization <em>The Organization</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPersonAndOrganizationImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPersonAndOrganizationImpl extends EObjectImpl implements IfcPersonAndOrganization {
	/**
	 * The cached value of the '{@link #getThePerson() <em>The Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePerson()
	 * @generated
	 * @ordered
	 */
	protected IfcPerson thePerson;

	/**
	 * The cached value of the '{@link #getTheOrganization() <em>The Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheOrganization()
	 * @generated
	 * @ordered
	 */
	protected IfcOrganization theOrganization;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcActorRole> roles;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPersonAndOrganization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerson getThePerson() {
		if (thePerson != null && thePerson.eIsProxy()) {
			InternalEObject oldThePerson = (InternalEObject)thePerson;
			thePerson = (IfcPerson)eResolveProxy(oldThePerson);
			if (thePerson != oldThePerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON, oldThePerson, thePerson));
			}
		}
		return thePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerson basicGetThePerson() {
		return thePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThePerson(IfcPerson newThePerson, NotificationChain msgs) {
		IfcPerson oldThePerson = thePerson;
		thePerson = newThePerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON, oldThePerson, newThePerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePerson(IfcPerson newThePerson) {
		if (newThePerson != thePerson) {
			NotificationChain msgs = null;
			if (thePerson != null)
				msgs = ((InternalEObject)thePerson).eInverseRemove(this, Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN, IfcPerson.class, msgs);
			if (newThePerson != null)
				msgs = ((InternalEObject)newThePerson).eInverseAdd(this, Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN, IfcPerson.class, msgs);
			msgs = basicSetThePerson(newThePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON, newThePerson, newThePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization getTheOrganization() {
		if (theOrganization != null && theOrganization.eIsProxy()) {
			InternalEObject oldTheOrganization = (InternalEObject)theOrganization;
			theOrganization = (IfcOrganization)eResolveProxy(oldTheOrganization);
			if (theOrganization != oldTheOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION, oldTheOrganization, theOrganization));
			}
		}
		return theOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization basicGetTheOrganization() {
		return theOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheOrganization(IfcOrganization newTheOrganization, NotificationChain msgs) {
		IfcOrganization oldTheOrganization = theOrganization;
		theOrganization = newTheOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION, oldTheOrganization, newTheOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheOrganization(IfcOrganization newTheOrganization) {
		if (newTheOrganization != theOrganization) {
			NotificationChain msgs = null;
			if (theOrganization != null)
				msgs = ((InternalEObject)theOrganization).eInverseRemove(this, Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES, IfcOrganization.class, msgs);
			if (newTheOrganization != null)
				msgs = ((InternalEObject)newTheOrganization).eInverseAdd(this, Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES, IfcOrganization.class, msgs);
			msgs = basicSetTheOrganization(newTheOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION, newTheOrganization, newTheOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcActorRole> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList.Unsettable<IfcActorRole>(IfcActorRole.class, this, Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRoles() {
		if (roles != null) ((InternalEList.Unsettable<?>)roles).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRoles() {
		return roles != null && ((InternalEList.Unsettable<?>)roles).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				if (thePerson != null)
					msgs = ((InternalEObject)thePerson).eInverseRemove(this, Ifc2x3tc1Package.IFC_PERSON__ENGAGED_IN, IfcPerson.class, msgs);
				return basicSetThePerson((IfcPerson)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				if (theOrganization != null)
					msgs = ((InternalEObject)theOrganization).eInverseRemove(this, Ifc2x3tc1Package.IFC_ORGANIZATION__ENGAGES, IfcOrganization.class, msgs);
				return basicSetTheOrganization((IfcOrganization)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				return basicSetThePerson(null, msgs);
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				return basicSetTheOrganization(null, msgs);
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
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				if (resolve) return getThePerson();
				return basicGetThePerson();
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				if (resolve) return getTheOrganization();
				return basicGetTheOrganization();
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__ROLES:
				return getRoles();
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
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				setThePerson((IfcPerson)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				setTheOrganization((IfcOrganization)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends IfcActorRole>)newValue);
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
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				setThePerson((IfcPerson)null);
				return;
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				setTheOrganization((IfcOrganization)null);
				return;
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__ROLES:
				unsetRoles();
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
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_PERSON:
				return thePerson != null;
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__THE_ORGANIZATION:
				return theOrganization != null;
			case Ifc2x3tc1Package.IFC_PERSON_AND_ORGANIZATION__ROLES:
				return isSetRoles();
		}
		return super.eIsSet(featureID);
	}

} //IfcPersonAndOrganizationImpl
