/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DateComponentType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCalendarDate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DateComponentTypeImpl#getIfcCalendarDate <em>Ifc Calendar Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateComponentTypeImpl extends EObjectImpl implements DateComponentType {
	/**
	 * The cached value of the '{@link #getIfcCalendarDate() <em>Ifc Calendar Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCalendarDate()
	 * @generated
	 * @ordered
	 */
	protected IfcCalendarDate ifcCalendarDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getDateComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getIfcCalendarDate() {
		return ifcCalendarDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCalendarDate(IfcCalendarDate newIfcCalendarDate, NotificationChain msgs) {
		IfcCalendarDate oldIfcCalendarDate = ifcCalendarDate;
		ifcCalendarDate = newIfcCalendarDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.DATE_COMPONENT_TYPE__IFC_CALENDAR_DATE, oldIfcCalendarDate, newIfcCalendarDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCalendarDate(IfcCalendarDate newIfcCalendarDate) {
		if (newIfcCalendarDate != ifcCalendarDate) {
			NotificationChain msgs = null;
			if (ifcCalendarDate != null)
				msgs = ((InternalEObject)ifcCalendarDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DATE_COMPONENT_TYPE__IFC_CALENDAR_DATE, null, msgs);
			if (newIfcCalendarDate != null)
				msgs = ((InternalEObject)newIfcCalendarDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.DATE_COMPONENT_TYPE__IFC_CALENDAR_DATE, null, msgs);
			msgs = basicSetIfcCalendarDate(newIfcCalendarDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.DATE_COMPONENT_TYPE__IFC_CALENDAR_DATE, newIfcCalendarDate, newIfcCalendarDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.DATE_COMPONENT_TYPE__IFC_CALENDAR_DATE:
				return basicSetIfcCalendarDate(null, msgs);
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
			case FinalPackage.DATE_COMPONENT_TYPE__IFC_CALENDAR_DATE:
				return getIfcCalendarDate();
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
			case FinalPackage.DATE_COMPONENT_TYPE__IFC_CALENDAR_DATE:
				setIfcCalendarDate((IfcCalendarDate)newValue);
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
			case FinalPackage.DATE_COMPONENT_TYPE__IFC_CALENDAR_DATE:
				setIfcCalendarDate((IfcCalendarDate)null);
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
			case FinalPackage.DATE_COMPONENT_TYPE__IFC_CALENDAR_DATE:
				return ifcCalendarDate != null;
		}
		return super.eIsSet(featureID);
	}

} //DateComponentTypeImpl
