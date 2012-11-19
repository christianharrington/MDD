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
import org.tech.iai.ifc.xml.ifc._2x3.final_.RateSourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RateSourceTypeImpl#getIfcLibraryInformation <em>Ifc Library Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RateSourceTypeImpl extends EObjectImpl implements RateSourceType {
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
	protected RateSourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRateSourceType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RATE_SOURCE_TYPE__IFC_LIBRARY_INFORMATION, oldIfcLibraryInformation, newIfcLibraryInformation);
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
				msgs = ((InternalEObject)ifcLibraryInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RATE_SOURCE_TYPE__IFC_LIBRARY_INFORMATION, null, msgs);
			if (newIfcLibraryInformation != null)
				msgs = ((InternalEObject)newIfcLibraryInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RATE_SOURCE_TYPE__IFC_LIBRARY_INFORMATION, null, msgs);
			msgs = basicSetIfcLibraryInformation(newIfcLibraryInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RATE_SOURCE_TYPE__IFC_LIBRARY_INFORMATION, newIfcLibraryInformation, newIfcLibraryInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RATE_SOURCE_TYPE__IFC_LIBRARY_INFORMATION:
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
			case FinalPackage.RATE_SOURCE_TYPE__IFC_LIBRARY_INFORMATION:
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
			case FinalPackage.RATE_SOURCE_TYPE__IFC_LIBRARY_INFORMATION:
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
			case FinalPackage.RATE_SOURCE_TYPE__IFC_LIBRARY_INFORMATION:
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
			case FinalPackage.RATE_SOURCE_TYPE__IFC_LIBRARY_INFORMATION:
				return ifcLibraryInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //RateSourceTypeImpl
