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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPerson;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ResponsiblePersonType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsible Person Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ResponsiblePersonTypeImpl#getIfcPerson <em>Ifc Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsiblePersonTypeImpl extends EObjectImpl implements ResponsiblePersonType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsiblePersonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getResponsiblePersonType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RESPONSIBLE_PERSON_TYPE__IFC_PERSON, oldIfcPerson, newIfcPerson);
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
				msgs = ((InternalEObject)ifcPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RESPONSIBLE_PERSON_TYPE__IFC_PERSON, null, msgs);
			if (newIfcPerson != null)
				msgs = ((InternalEObject)newIfcPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RESPONSIBLE_PERSON_TYPE__IFC_PERSON, null, msgs);
			msgs = basicSetIfcPerson(newIfcPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RESPONSIBLE_PERSON_TYPE__IFC_PERSON, newIfcPerson, newIfcPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RESPONSIBLE_PERSON_TYPE__IFC_PERSON:
				return basicSetIfcPerson(null, msgs);
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
			case FinalPackage.RESPONSIBLE_PERSON_TYPE__IFC_PERSON:
				return getIfcPerson();
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
			case FinalPackage.RESPONSIBLE_PERSON_TYPE__IFC_PERSON:
				setIfcPerson((IfcPerson)newValue);
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
			case FinalPackage.RESPONSIBLE_PERSON_TYPE__IFC_PERSON:
				setIfcPerson((IfcPerson)null);
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
			case FinalPackage.RESPONSIBLE_PERSON_TYPE__IFC_PERSON:
				return ifcPerson != null;
		}
		return super.eIsSet(featureID);
	}

} //ResponsiblePersonTypeImpl
