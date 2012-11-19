/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ElectronicFormatType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentElectronicFormat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electronic Format Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ElectronicFormatTypeImpl#getIfcDocumentElectronicFormat <em>Ifc Document Electronic Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElectronicFormatTypeImpl extends EObjectImpl implements ElectronicFormatType {
	/**
	 * The cached value of the '{@link #getIfcDocumentElectronicFormat() <em>Ifc Document Electronic Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDocumentElectronicFormat()
	 * @generated
	 * @ordered
	 */
	protected IfcDocumentElectronicFormat ifcDocumentElectronicFormat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectronicFormatTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getElectronicFormatType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentElectronicFormat getIfcDocumentElectronicFormat() {
		return ifcDocumentElectronicFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDocumentElectronicFormat(IfcDocumentElectronicFormat newIfcDocumentElectronicFormat, NotificationChain msgs) {
		IfcDocumentElectronicFormat oldIfcDocumentElectronicFormat = ifcDocumentElectronicFormat;
		ifcDocumentElectronicFormat = newIfcDocumentElectronicFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.ELECTRONIC_FORMAT_TYPE__IFC_DOCUMENT_ELECTRONIC_FORMAT, oldIfcDocumentElectronicFormat, newIfcDocumentElectronicFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDocumentElectronicFormat(IfcDocumentElectronicFormat newIfcDocumentElectronicFormat) {
		if (newIfcDocumentElectronicFormat != ifcDocumentElectronicFormat) {
			NotificationChain msgs = null;
			if (ifcDocumentElectronicFormat != null)
				msgs = ((InternalEObject)ifcDocumentElectronicFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ELECTRONIC_FORMAT_TYPE__IFC_DOCUMENT_ELECTRONIC_FORMAT, null, msgs);
			if (newIfcDocumentElectronicFormat != null)
				msgs = ((InternalEObject)newIfcDocumentElectronicFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.ELECTRONIC_FORMAT_TYPE__IFC_DOCUMENT_ELECTRONIC_FORMAT, null, msgs);
			msgs = basicSetIfcDocumentElectronicFormat(newIfcDocumentElectronicFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.ELECTRONIC_FORMAT_TYPE__IFC_DOCUMENT_ELECTRONIC_FORMAT, newIfcDocumentElectronicFormat, newIfcDocumentElectronicFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ELECTRONIC_FORMAT_TYPE__IFC_DOCUMENT_ELECTRONIC_FORMAT:
				return basicSetIfcDocumentElectronicFormat(null, msgs);
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
			case FinalPackage.ELECTRONIC_FORMAT_TYPE__IFC_DOCUMENT_ELECTRONIC_FORMAT:
				return getIfcDocumentElectronicFormat();
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
			case FinalPackage.ELECTRONIC_FORMAT_TYPE__IFC_DOCUMENT_ELECTRONIC_FORMAT:
				setIfcDocumentElectronicFormat((IfcDocumentElectronicFormat)newValue);
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
			case FinalPackage.ELECTRONIC_FORMAT_TYPE__IFC_DOCUMENT_ELECTRONIC_FORMAT:
				setIfcDocumentElectronicFormat((IfcDocumentElectronicFormat)null);
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
			case FinalPackage.ELECTRONIC_FORMAT_TYPE__IFC_DOCUMENT_ELECTRONIC_FORMAT:
				return ifcDocumentElectronicFormat != null;
		}
		return super.eIsSet(featureID);
	}

} //ElectronicFormatTypeImpl
