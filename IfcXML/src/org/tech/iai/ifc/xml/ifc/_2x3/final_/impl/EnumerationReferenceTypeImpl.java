/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EnumerationReferenceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyEnumeration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.EnumerationReferenceTypeImpl#getIfcPropertyEnumeration <em>Ifc Property Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationReferenceTypeImpl extends EObjectImpl implements EnumerationReferenceType {
	/**
	 * The cached value of the '{@link #getIfcPropertyEnumeration() <em>Ifc Property Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPropertyEnumeration()
	 * @generated
	 * @ordered
	 */
	protected IfcPropertyEnumeration ifcPropertyEnumeration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getEnumerationReferenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyEnumeration getIfcPropertyEnumeration() {
		return ifcPropertyEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPropertyEnumeration(IfcPropertyEnumeration newIfcPropertyEnumeration, NotificationChain msgs) {
		IfcPropertyEnumeration oldIfcPropertyEnumeration = ifcPropertyEnumeration;
		ifcPropertyEnumeration = newIfcPropertyEnumeration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.ENUMERATION_REFERENCE_TYPE__IFC_PROPERTY_ENUMERATION, oldIfcPropertyEnumeration, newIfcPropertyEnumeration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPropertyEnumeration(IfcPropertyEnumeration newIfcPropertyEnumeration) {
		if (newIfcPropertyEnumeration != ifcPropertyEnumeration) {
			NotificationChain msgs = null;
			if (ifcPropertyEnumeration != null)
				msgs = ((InternalEObject)ifcPropertyEnumeration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ENUMERATION_REFERENCE_TYPE__IFC_PROPERTY_ENUMERATION, null, msgs);
			if (newIfcPropertyEnumeration != null)
				msgs = ((InternalEObject)newIfcPropertyEnumeration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ENUMERATION_REFERENCE_TYPE__IFC_PROPERTY_ENUMERATION, null, msgs);
			msgs = basicSetIfcPropertyEnumeration(newIfcPropertyEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ENUMERATION_REFERENCE_TYPE__IFC_PROPERTY_ENUMERATION, newIfcPropertyEnumeration, newIfcPropertyEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ENUMERATION_REFERENCE_TYPE__IFC_PROPERTY_ENUMERATION:
				return basicSetIfcPropertyEnumeration(null, msgs);
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
			case FinalPackage.ENUMERATION_REFERENCE_TYPE__IFC_PROPERTY_ENUMERATION:
				return getIfcPropertyEnumeration();
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
			case FinalPackage.ENUMERATION_REFERENCE_TYPE__IFC_PROPERTY_ENUMERATION:
				setIfcPropertyEnumeration((IfcPropertyEnumeration)newValue);
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
			case FinalPackage.ENUMERATION_REFERENCE_TYPE__IFC_PROPERTY_ENUMERATION:
				setIfcPropertyEnumeration((IfcPropertyEnumeration)null);
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
			case FinalPackage.ENUMERATION_REFERENCE_TYPE__IFC_PROPERTY_ENUMERATION:
				return ifcPropertyEnumeration != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationReferenceTypeImpl
