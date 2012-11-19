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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OwningUserType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owning User Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.OwningUserTypeImpl#getIfcPersonAndOrganization <em>Ifc Person And Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwningUserTypeImpl extends EObjectImpl implements OwningUserType {
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
	protected OwningUserTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getOwningUserType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.OWNING_USER_TYPE__IFC_PERSON_AND_ORGANIZATION, oldIfcPersonAndOrganization, newIfcPersonAndOrganization);
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
				msgs = ((InternalEObject)ifcPersonAndOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.OWNING_USER_TYPE__IFC_PERSON_AND_ORGANIZATION, null, msgs);
			if (newIfcPersonAndOrganization != null)
				msgs = ((InternalEObject)newIfcPersonAndOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.OWNING_USER_TYPE__IFC_PERSON_AND_ORGANIZATION, null, msgs);
			msgs = basicSetIfcPersonAndOrganization(newIfcPersonAndOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.OWNING_USER_TYPE__IFC_PERSON_AND_ORGANIZATION, newIfcPersonAndOrganization, newIfcPersonAndOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.OWNING_USER_TYPE__IFC_PERSON_AND_ORGANIZATION:
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
			case FinalPackage.OWNING_USER_TYPE__IFC_PERSON_AND_ORGANIZATION:
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
			case FinalPackage.OWNING_USER_TYPE__IFC_PERSON_AND_ORGANIZATION:
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
			case FinalPackage.OWNING_USER_TYPE__IFC_PERSON_AND_ORGANIZATION:
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
			case FinalPackage.OWNING_USER_TYPE__IFC_PERSON_AND_ORGANIZATION:
				return ifcPersonAndOrganization != null;
		}
		return super.eIsSet(featureID);
	}

} //OwningUserTypeImpl
