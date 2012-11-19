/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicationDeveloperType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOrganization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Developer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ApplicationDeveloperTypeImpl#getIfcOrganization <em>Ifc Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationDeveloperTypeImpl extends EObjectImpl implements ApplicationDeveloperType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationDeveloperTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getApplicationDeveloperType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.APPLICATION_DEVELOPER_TYPE__IFC_ORGANIZATION, oldIfcOrganization, newIfcOrganization);
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
				msgs = ((InternalEObject)ifcOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.APPLICATION_DEVELOPER_TYPE__IFC_ORGANIZATION, null, msgs);
			if (newIfcOrganization != null)
				msgs = ((InternalEObject)newIfcOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.APPLICATION_DEVELOPER_TYPE__IFC_ORGANIZATION, null, msgs);
			msgs = basicSetIfcOrganization(newIfcOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.APPLICATION_DEVELOPER_TYPE__IFC_ORGANIZATION, newIfcOrganization, newIfcOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.APPLICATION_DEVELOPER_TYPE__IFC_ORGANIZATION:
				return basicSetIfcOrganization(null, msgs);
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
			case FinalPackage.APPLICATION_DEVELOPER_TYPE__IFC_ORGANIZATION:
				return getIfcOrganization();
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
			case FinalPackage.APPLICATION_DEVELOPER_TYPE__IFC_ORGANIZATION:
				setIfcOrganization((IfcOrganization)newValue);
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
			case FinalPackage.APPLICATION_DEVELOPER_TYPE__IFC_ORGANIZATION:
				setIfcOrganization((IfcOrganization)null);
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
			case FinalPackage.APPLICATION_DEVELOPER_TYPE__IFC_ORGANIZATION:
				return ifcOrganization != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationDeveloperTypeImpl
