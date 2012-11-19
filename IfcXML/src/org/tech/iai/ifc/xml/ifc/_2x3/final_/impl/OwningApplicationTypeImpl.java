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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApplication;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OwningApplicationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owning Application Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.OwningApplicationTypeImpl#getIfcApplication <em>Ifc Application</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwningApplicationTypeImpl extends EObjectImpl implements OwningApplicationType {
	/**
	 * The cached value of the '{@link #getIfcApplication() <em>Ifc Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcApplication()
	 * @generated
	 * @ordered
	 */
	protected IfcApplication ifcApplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwningApplicationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getOwningApplicationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApplication getIfcApplication() {
		return ifcApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcApplication(IfcApplication newIfcApplication, NotificationChain msgs) {
		IfcApplication oldIfcApplication = ifcApplication;
		ifcApplication = newIfcApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.OWNING_APPLICATION_TYPE__IFC_APPLICATION, oldIfcApplication, newIfcApplication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcApplication(IfcApplication newIfcApplication) {
		if (newIfcApplication != ifcApplication) {
			NotificationChain msgs = null;
			if (ifcApplication != null)
				msgs = ((InternalEObject)ifcApplication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.OWNING_APPLICATION_TYPE__IFC_APPLICATION, null, msgs);
			if (newIfcApplication != null)
				msgs = ((InternalEObject)newIfcApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.OWNING_APPLICATION_TYPE__IFC_APPLICATION, null, msgs);
			msgs = basicSetIfcApplication(newIfcApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.OWNING_APPLICATION_TYPE__IFC_APPLICATION, newIfcApplication, newIfcApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.OWNING_APPLICATION_TYPE__IFC_APPLICATION:
				return basicSetIfcApplication(null, msgs);
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
			case FinalPackage.OWNING_APPLICATION_TYPE__IFC_APPLICATION:
				return getIfcApplication();
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
			case FinalPackage.OWNING_APPLICATION_TYPE__IFC_APPLICATION:
				setIfcApplication((IfcApplication)newValue);
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
			case FinalPackage.OWNING_APPLICATION_TYPE__IFC_APPLICATION:
				setIfcApplication((IfcApplication)null);
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
			case FinalPackage.OWNING_APPLICATION_TYPE__IFC_APPLICATION:
				return ifcApplication != null;
		}
		return super.eIsSet(featureID);
	}

} //OwningApplicationTypeImpl
