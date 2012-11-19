/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EarlyFinishType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCalendarDate;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Early Finish Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.EarlyFinishTypeImpl#getIfcCalendarDate <em>Ifc Calendar Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.EarlyFinishTypeImpl#getIfcLocalTime <em>Ifc Local Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.EarlyFinishTypeImpl#getIfcDateAndTime <em>Ifc Date And Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EarlyFinishTypeImpl extends EObjectImpl implements EarlyFinishType {
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
	 * The cached value of the '{@link #getIfcLocalTime() <em>Ifc Local Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLocalTime()
	 * @generated
	 * @ordered
	 */
	protected IfcLocalTime ifcLocalTime;

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
	protected EarlyFinishTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getEarlyFinishType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.EARLY_FINISH_TYPE__IFC_CALENDAR_DATE, oldIfcCalendarDate, newIfcCalendarDate);
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
				msgs = ((InternalEObject)ifcCalendarDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.EARLY_FINISH_TYPE__IFC_CALENDAR_DATE, null, msgs);
			if (newIfcCalendarDate != null)
				msgs = ((InternalEObject)newIfcCalendarDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.EARLY_FINISH_TYPE__IFC_CALENDAR_DATE, null, msgs);
			msgs = basicSetIfcCalendarDate(newIfcCalendarDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.EARLY_FINISH_TYPE__IFC_CALENDAR_DATE, newIfcCalendarDate, newIfcCalendarDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.EARLY_FINISH_TYPE__IFC_LOCAL_TIME, oldIfcLocalTime, newIfcLocalTime);
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
				msgs = ((InternalEObject)ifcLocalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.EARLY_FINISH_TYPE__IFC_LOCAL_TIME, null, msgs);
			if (newIfcLocalTime != null)
				msgs = ((InternalEObject)newIfcLocalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.EARLY_FINISH_TYPE__IFC_LOCAL_TIME, null, msgs);
			msgs = basicSetIfcLocalTime(newIfcLocalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.EARLY_FINISH_TYPE__IFC_LOCAL_TIME, newIfcLocalTime, newIfcLocalTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.EARLY_FINISH_TYPE__IFC_DATE_AND_TIME, oldIfcDateAndTime, newIfcDateAndTime);
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
				msgs = ((InternalEObject)ifcDateAndTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.EARLY_FINISH_TYPE__IFC_DATE_AND_TIME, null, msgs);
			if (newIfcDateAndTime != null)
				msgs = ((InternalEObject)newIfcDateAndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.EARLY_FINISH_TYPE__IFC_DATE_AND_TIME, null, msgs);
			msgs = basicSetIfcDateAndTime(newIfcDateAndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.EARLY_FINISH_TYPE__IFC_DATE_AND_TIME, newIfcDateAndTime, newIfcDateAndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.EARLY_FINISH_TYPE__IFC_CALENDAR_DATE:
				return basicSetIfcCalendarDate(null, msgs);
			case FinalPackage.EARLY_FINISH_TYPE__IFC_LOCAL_TIME:
				return basicSetIfcLocalTime(null, msgs);
			case FinalPackage.EARLY_FINISH_TYPE__IFC_DATE_AND_TIME:
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
			case FinalPackage.EARLY_FINISH_TYPE__IFC_CALENDAR_DATE:
				return getIfcCalendarDate();
			case FinalPackage.EARLY_FINISH_TYPE__IFC_LOCAL_TIME:
				return getIfcLocalTime();
			case FinalPackage.EARLY_FINISH_TYPE__IFC_DATE_AND_TIME:
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
			case FinalPackage.EARLY_FINISH_TYPE__IFC_CALENDAR_DATE:
				setIfcCalendarDate((IfcCalendarDate)newValue);
				return;
			case FinalPackage.EARLY_FINISH_TYPE__IFC_LOCAL_TIME:
				setIfcLocalTime((IfcLocalTime)newValue);
				return;
			case FinalPackage.EARLY_FINISH_TYPE__IFC_DATE_AND_TIME:
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
			case FinalPackage.EARLY_FINISH_TYPE__IFC_CALENDAR_DATE:
				setIfcCalendarDate((IfcCalendarDate)null);
				return;
			case FinalPackage.EARLY_FINISH_TYPE__IFC_LOCAL_TIME:
				setIfcLocalTime((IfcLocalTime)null);
				return;
			case FinalPackage.EARLY_FINISH_TYPE__IFC_DATE_AND_TIME:
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
			case FinalPackage.EARLY_FINISH_TYPE__IFC_CALENDAR_DATE:
				return ifcCalendarDate != null;
			case FinalPackage.EARLY_FINISH_TYPE__IFC_LOCAL_TIME:
				return ifcLocalTime != null;
			case FinalPackage.EARLY_FINISH_TYPE__IFC_DATE_AND_TIME:
				return ifcDateAndTime != null;
		}
		return super.eIsSet(featureID);
	}

} //EarlyFinishTypeImpl
