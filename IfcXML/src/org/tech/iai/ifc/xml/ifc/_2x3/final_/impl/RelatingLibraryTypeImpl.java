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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLibraryInformation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLibraryReference;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingLibraryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Library Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingLibraryTypeImpl#getIfcLibraryReference <em>Ifc Library Reference</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingLibraryTypeImpl#getIfcLibraryInformation <em>Ifc Library Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingLibraryTypeImpl extends EObjectImpl implements RelatingLibraryType {
	/**
	 * The cached value of the '{@link #getIfcLibraryReference() <em>Ifc Library Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLibraryReference()
	 * @generated
	 * @ordered
	 */
	protected IfcLibraryReference ifcLibraryReference;

	/**
	 * The cached value of the '{@link #getIfcLibraryInformation() <em>Ifc Library Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLibraryInformation()
	 * @generated
	 * @ordered
	 */
	protected IfcLibraryInformation ifcLibraryInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingLibraryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingLibraryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibraryReference getIfcLibraryReference() {
		return ifcLibraryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLibraryReference(IfcLibraryReference newIfcLibraryReference, NotificationChain msgs) {
		IfcLibraryReference oldIfcLibraryReference = ifcLibraryReference;
		ifcLibraryReference = newIfcLibraryReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_REFERENCE, oldIfcLibraryReference, newIfcLibraryReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLibraryReference(IfcLibraryReference newIfcLibraryReference) {
		if (newIfcLibraryReference != ifcLibraryReference) {
			NotificationChain msgs = null;
			if (ifcLibraryReference != null)
				msgs = ((InternalEObject)ifcLibraryReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_REFERENCE, null, msgs);
			if (newIfcLibraryReference != null)
				msgs = ((InternalEObject)newIfcLibraryReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_REFERENCE, null, msgs);
			msgs = basicSetIfcLibraryReference(newIfcLibraryReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_REFERENCE, newIfcLibraryReference, newIfcLibraryReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibraryInformation getIfcLibraryInformation() {
		return ifcLibraryInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLibraryInformation(IfcLibraryInformation newIfcLibraryInformation, NotificationChain msgs) {
		IfcLibraryInformation oldIfcLibraryInformation = ifcLibraryInformation;
		ifcLibraryInformation = newIfcLibraryInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_INFORMATION, oldIfcLibraryInformation, newIfcLibraryInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLibraryInformation(IfcLibraryInformation newIfcLibraryInformation) {
		if (newIfcLibraryInformation != ifcLibraryInformation) {
			NotificationChain msgs = null;
			if (ifcLibraryInformation != null)
				msgs = ((InternalEObject)ifcLibraryInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_INFORMATION, null, msgs);
			if (newIfcLibraryInformation != null)
				msgs = ((InternalEObject)newIfcLibraryInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_INFORMATION, null, msgs);
			msgs = basicSetIfcLibraryInformation(newIfcLibraryInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_INFORMATION, newIfcLibraryInformation, newIfcLibraryInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_REFERENCE:
				return basicSetIfcLibraryReference(null, msgs);
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_INFORMATION:
				return basicSetIfcLibraryInformation(null, msgs);
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
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_REFERENCE:
				return getIfcLibraryReference();
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_INFORMATION:
				return getIfcLibraryInformation();
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
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_REFERENCE:
				setIfcLibraryReference((IfcLibraryReference)newValue);
				return;
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_INFORMATION:
				setIfcLibraryInformation((IfcLibraryInformation)newValue);
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
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_REFERENCE:
				setIfcLibraryReference((IfcLibraryReference)null);
				return;
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_INFORMATION:
				setIfcLibraryInformation((IfcLibraryInformation)null);
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
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_REFERENCE:
				return ifcLibraryReference != null;
			case FinalPackage.RELATING_LIBRARY_TYPE__IFC_LIBRARY_INFORMATION:
				return ifcLibraryInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatingLibraryTypeImpl
