/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BuildingAddressType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPostalAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building Address Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.BuildingAddressTypeImpl#getIfcPostalAddress <em>Ifc Postal Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildingAddressTypeImpl extends EObjectImpl implements BuildingAddressType {
	/**
	 * The cached value of the '{@link #getIfcPostalAddress() <em>Ifc Postal Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPostalAddress()
	 * @generated
	 * @ordered
	 */
	protected IfcPostalAddress ifcPostalAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingAddressTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getBuildingAddressType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPostalAddress getIfcPostalAddress() {
		return ifcPostalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPostalAddress(IfcPostalAddress newIfcPostalAddress, NotificationChain msgs) {
		IfcPostalAddress oldIfcPostalAddress = ifcPostalAddress;
		ifcPostalAddress = newIfcPostalAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.BUILDING_ADDRESS_TYPE__IFC_POSTAL_ADDRESS, oldIfcPostalAddress, newIfcPostalAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPostalAddress(IfcPostalAddress newIfcPostalAddress) {
		if (newIfcPostalAddress != ifcPostalAddress) {
			NotificationChain msgs = null;
			if (ifcPostalAddress != null)
				msgs = ((InternalEObject)ifcPostalAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.BUILDING_ADDRESS_TYPE__IFC_POSTAL_ADDRESS, null, msgs);
			if (newIfcPostalAddress != null)
				msgs = ((InternalEObject)newIfcPostalAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.BUILDING_ADDRESS_TYPE__IFC_POSTAL_ADDRESS, null, msgs);
			msgs = basicSetIfcPostalAddress(newIfcPostalAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.BUILDING_ADDRESS_TYPE__IFC_POSTAL_ADDRESS, newIfcPostalAddress, newIfcPostalAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.BUILDING_ADDRESS_TYPE__IFC_POSTAL_ADDRESS:
				return basicSetIfcPostalAddress(null, msgs);
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
			case FinalPackage.BUILDING_ADDRESS_TYPE__IFC_POSTAL_ADDRESS:
				return getIfcPostalAddress();
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
			case FinalPackage.BUILDING_ADDRESS_TYPE__IFC_POSTAL_ADDRESS:
				setIfcPostalAddress((IfcPostalAddress)newValue);
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
			case FinalPackage.BUILDING_ADDRESS_TYPE__IFC_POSTAL_ADDRESS:
				setIfcPostalAddress((IfcPostalAddress)null);
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
			case FinalPackage.BUILDING_ADDRESS_TYPE__IFC_POSTAL_ADDRESS:
				return ifcPostalAddress != null;
		}
		return super.eIsSet(featureID);
	}

} //BuildingAddressTypeImpl
