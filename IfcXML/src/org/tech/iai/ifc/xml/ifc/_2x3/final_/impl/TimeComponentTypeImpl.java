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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TimeComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TimeComponentTypeImpl#getIfcLocalTime <em>Ifc Local Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeComponentTypeImpl extends EObjectImpl implements TimeComponentType {
	/**
	 * The cached value of the '{@link #getIfcLocalTime() <em>Ifc Local Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLocalTime()
	 * @generated
	 * @ordered
	 */
	protected IfcLocalTime ifcLocalTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getTimeComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLocalTime getIfcLocalTime() {
		return ifcLocalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLocalTime(IfcLocalTime newIfcLocalTime, NotificationChain msgs) {
		IfcLocalTime oldIfcLocalTime = ifcLocalTime;
		ifcLocalTime = newIfcLocalTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.TIME_COMPONENT_TYPE__IFC_LOCAL_TIME, oldIfcLocalTime, newIfcLocalTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLocalTime(IfcLocalTime newIfcLocalTime) {
		if (newIfcLocalTime != ifcLocalTime) {
			NotificationChain msgs = null;
			if (ifcLocalTime != null)
				msgs = ((InternalEObject)ifcLocalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TIME_COMPONENT_TYPE__IFC_LOCAL_TIME, null, msgs);
			if (newIfcLocalTime != null)
				msgs = ((InternalEObject)newIfcLocalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TIME_COMPONENT_TYPE__IFC_LOCAL_TIME, null, msgs);
			msgs = basicSetIfcLocalTime(newIfcLocalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.TIME_COMPONENT_TYPE__IFC_LOCAL_TIME, newIfcLocalTime, newIfcLocalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.TIME_COMPONENT_TYPE__IFC_LOCAL_TIME:
				return basicSetIfcLocalTime(null, msgs);
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
			case FinalPackage.TIME_COMPONENT_TYPE__IFC_LOCAL_TIME:
				return getIfcLocalTime();
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
			case FinalPackage.TIME_COMPONENT_TYPE__IFC_LOCAL_TIME:
				setIfcLocalTime((IfcLocalTime)newValue);
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
			case FinalPackage.TIME_COMPONENT_TYPE__IFC_LOCAL_TIME:
				setIfcLocalTime((IfcLocalTime)null);
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
			case FinalPackage.TIME_COMPONENT_TYPE__IFC_LOCAL_TIME:
				return ifcLocalTime != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeComponentTypeImpl
