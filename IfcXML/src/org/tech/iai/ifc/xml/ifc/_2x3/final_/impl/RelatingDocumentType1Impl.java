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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingDocumentType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Document Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingDocumentType1Impl#getIfcDocumentInformation <em>Ifc Document Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingDocumentType1Impl extends EObjectImpl implements RelatingDocumentType1 {
	/**
	 * The cached value of the '{@link #getIfcDocumentInformation() <em>Ifc Document Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDocumentInformation()
	 * @generated
	 * @ordered
	 */
	protected IfcDocumentInformation ifcDocumentInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingDocumentType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingDocumentType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentInformation getIfcDocumentInformation() {
		return ifcDocumentInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDocumentInformation(IfcDocumentInformation newIfcDocumentInformation, NotificationChain msgs) {
		IfcDocumentInformation oldIfcDocumentInformation = ifcDocumentInformation;
		ifcDocumentInformation = newIfcDocumentInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_DOCUMENT_TYPE1__IFC_DOCUMENT_INFORMATION, oldIfcDocumentInformation, newIfcDocumentInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDocumentInformation(IfcDocumentInformation newIfcDocumentInformation) {
		if (newIfcDocumentInformation != ifcDocumentInformation) {
			NotificationChain msgs = null;
			if (ifcDocumentInformation != null)
				msgs = ((InternalEObject)ifcDocumentInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_DOCUMENT_TYPE1__IFC_DOCUMENT_INFORMATION, null, msgs);
			if (newIfcDocumentInformation != null)
				msgs = ((InternalEObject)newIfcDocumentInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_DOCUMENT_TYPE1__IFC_DOCUMENT_INFORMATION, null, msgs);
			msgs = basicSetIfcDocumentInformation(newIfcDocumentInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_DOCUMENT_TYPE1__IFC_DOCUMENT_INFORMATION, newIfcDocumentInformation, newIfcDocumentInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_DOCUMENT_TYPE1__IFC_DOCUMENT_INFORMATION:
				return basicSetIfcDocumentInformation(null, msgs);
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
			case FinalPackage.RELATING_DOCUMENT_TYPE1__IFC_DOCUMENT_INFORMATION:
				return getIfcDocumentInformation();
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
			case FinalPackage.RELATING_DOCUMENT_TYPE1__IFC_DOCUMENT_INFORMATION:
				setIfcDocumentInformation((IfcDocumentInformation)newValue);
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
			case FinalPackage.RELATING_DOCUMENT_TYPE1__IFC_DOCUMENT_INFORMATION:
				setIfcDocumentInformation((IfcDocumentInformation)null);
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
			case FinalPackage.RELATING_DOCUMENT_TYPE1__IFC_DOCUMENT_INFORMATION:
				return ifcDocumentInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatingDocumentType1Impl
