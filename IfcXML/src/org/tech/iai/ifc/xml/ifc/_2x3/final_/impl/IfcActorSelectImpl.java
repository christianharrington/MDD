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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcActorSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOrganization;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPerson;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Actor Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcActorSelectImpl#getIfcOrganization <em>Ifc Organization</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcActorSelectImpl#getIfcPerson <em>Ifc Person</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcActorSelectImpl#getIfcPersonAndOrganization <em>Ifc Person And Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcActorSelectImpl extends EObjectImpl implements IfcActorSelect {
	/**
	 * The cached value of the '{@link #getIfcOrganization() <em>Ifc Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcOrganization()
	 * @generated
	 * @ordered
	 */
	protected IfcOrganization ifcOrganization;

	/**
	 * The cached value of the '{@link #getIfcPerson() <em>Ifc Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPerson()
	 * @generated
	 * @ordered
	 */
	protected IfcPerson ifcPerson;

	/**
	 * The cached value of the '{@link #getIfcPersonAndOrganization() <em>Ifc Person And Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPersonAndOrganization()
	 * @generated
	 * @ordered
	 */
	protected IfcPersonAndOrganization ifcPersonAndOrganization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcActorSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcActorSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization getIfcOrganization() {
		return ifcOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcOrganization(IfcOrganization newIfcOrganization, NotificationChain msgs) {
		IfcOrganization oldIfcOrganization = ifcOrganization;
		ifcOrganization = newIfcOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ACTOR_SELECT__IFC_ORGANIZATION, oldIfcOrganization, newIfcOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcOrganization(IfcOrganization newIfcOrganization) {
		if (newIfcOrganization != ifcOrganization) {
			NotificationChain msgs = null;
			if (ifcOrganization != null)
				msgs = ((InternalEObject)ifcOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ACTOR_SELECT__IFC_ORGANIZATION, null, msgs);
			if (newIfcOrganization != null)
				msgs = ((InternalEObject)newIfcOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ACTOR_SELECT__IFC_ORGANIZATION, null, msgs);
			msgs = basicSetIfcOrganization(newIfcOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ACTOR_SELECT__IFC_ORGANIZATION, newIfcOrganization, newIfcOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerson getIfcPerson() {
		return ifcPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPerson(IfcPerson newIfcPerson, NotificationChain msgs) {
		IfcPerson oldIfcPerson = ifcPerson;
		ifcPerson = newIfcPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON, oldIfcPerson, newIfcPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPerson(IfcPerson newIfcPerson) {
		if (newIfcPerson != ifcPerson) {
			NotificationChain msgs = null;
			if (ifcPerson != null)
				msgs = ((InternalEObject)ifcPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON, null, msgs);
			if (newIfcPerson != null)
				msgs = ((InternalEObject)newIfcPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON, null, msgs);
			msgs = basicSetIfcPerson(newIfcPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON, newIfcPerson, newIfcPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPersonAndOrganization getIfcPersonAndOrganization() {
		return ifcPersonAndOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPersonAndOrganization(IfcPersonAndOrganization newIfcPersonAndOrganization, NotificationChain msgs) {
		IfcPersonAndOrganization oldIfcPersonAndOrganization = ifcPersonAndOrganization;
		ifcPersonAndOrganization = newIfcPersonAndOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON_AND_ORGANIZATION, oldIfcPersonAndOrganization, newIfcPersonAndOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPersonAndOrganization(IfcPersonAndOrganization newIfcPersonAndOrganization) {
		if (newIfcPersonAndOrganization != ifcPersonAndOrganization) {
			NotificationChain msgs = null;
			if (ifcPersonAndOrganization != null)
				msgs = ((InternalEObject)ifcPersonAndOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON_AND_ORGANIZATION, null, msgs);
			if (newIfcPersonAndOrganization != null)
				msgs = ((InternalEObject)newIfcPersonAndOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON_AND_ORGANIZATION, null, msgs);
			msgs = basicSetIfcPersonAndOrganization(newIfcPersonAndOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON_AND_ORGANIZATION, newIfcPersonAndOrganization, newIfcPersonAndOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_ACTOR_SELECT__IFC_ORGANIZATION:
				return basicSetIfcOrganization(null, msgs);
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON:
				return basicSetIfcPerson(null, msgs);
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON_AND_ORGANIZATION:
				return basicSetIfcPersonAndOrganization(null, msgs);
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
			case FinalPackage.IFC_ACTOR_SELECT__IFC_ORGANIZATION:
				return getIfcOrganization();
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON:
				return getIfcPerson();
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON_AND_ORGANIZATION:
				return getIfcPersonAndOrganization();
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
			case FinalPackage.IFC_ACTOR_SELECT__IFC_ORGANIZATION:
				setIfcOrganization((IfcOrganization)newValue);
				return;
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON:
				setIfcPerson((IfcPerson)newValue);
				return;
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON_AND_ORGANIZATION:
				setIfcPersonAndOrganization((IfcPersonAndOrganization)newValue);
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
			case FinalPackage.IFC_ACTOR_SELECT__IFC_ORGANIZATION:
				setIfcOrganization((IfcOrganization)null);
				return;
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON:
				setIfcPerson((IfcPerson)null);
				return;
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON_AND_ORGANIZATION:
				setIfcPersonAndOrganization((IfcPersonAndOrganization)null);
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
			case FinalPackage.IFC_ACTOR_SELECT__IFC_ORGANIZATION:
				return ifcOrganization != null;
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON:
				return ifcPerson != null;
			case FinalPackage.IFC_ACTOR_SELECT__IFC_PERSON_AND_ORGANIZATION:
				return ifcPersonAndOrganization != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcActorSelectImpl
