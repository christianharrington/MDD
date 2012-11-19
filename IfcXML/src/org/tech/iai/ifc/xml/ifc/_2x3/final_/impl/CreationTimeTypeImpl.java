/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CreationTimeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creation Time Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CreationTimeTypeImpl#getIfcDateAndTime <em>Ifc Date And Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreationTimeTypeImpl extends EObjectImpl implements CreationTimeType {
	/**
	 * The cached value of the '{@link #getIfcDateAndTime() <em>Ifc Date And Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDateAndTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateAndTime ifcDateAndTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreationTimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getCreationTimeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime getIfcDateAndTime() {
		return ifcDateAndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDateAndTime(IfcDateAndTime newIfcDateAndTime, NotificationChain msgs) {
		IfcDateAndTime oldIfcDateAndTime = ifcDateAndTime;
		ifcDateAndTime = newIfcDateAndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.CREATION_TIME_TYPE__IFC_DATE_AND_TIME, oldIfcDateAndTime, newIfcDateAndTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDateAndTime(IfcDateAndTime newIfcDateAndTime) {
		if (newIfcDateAndTime != ifcDateAndTime) {
			NotificationChain msgs = null;
			if (ifcDateAndTime != null)
				msgs = ((InternalEObject)ifcDateAndTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CREATION_TIME_TYPE__IFC_DATE_AND_TIME, null, msgs);
			if (newIfcDateAndTime != null)
				msgs = ((InternalEObject)newIfcDateAndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CREATION_TIME_TYPE__IFC_DATE_AND_TIME, null, msgs);
			msgs = basicSetIfcDateAndTime(newIfcDateAndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.CREATION_TIME_TYPE__IFC_DATE_AND_TIME, newIfcDateAndTime, newIfcDateAndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.CREATION_TIME_TYPE__IFC_DATE_AND_TIME:
				return basicSetIfcDateAndTime(null, msgs);
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
			case FinalPackage.CREATION_TIME_TYPE__IFC_DATE_AND_TIME:
				return getIfcDateAndTime();
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
			case FinalPackage.CREATION_TIME_TYPE__IFC_DATE_AND_TIME:
				setIfcDateAndTime((IfcDateAndTime)newValue);
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
			case FinalPackage.CREATION_TIME_TYPE__IFC_DATE_AND_TIME:
				setIfcDateAndTime((IfcDateAndTime)null);
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
			case FinalPackage.CREATION_TIME_TYPE__IFC_DATE_AND_TIME:
				return ifcDateAndTime != null;
		}
		return super.eIsSet(featureID);
	}

} //CreationTimeTypeImpl
