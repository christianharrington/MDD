/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesSchedule;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesScheduleTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesScheduleImpl#getApplicableDates <em>Applicable Dates</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesScheduleImpl#getTimeSeriesScheduleType <em>Time Series Schedule Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesScheduleImpl#getTimeSeries <em>Time Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTimeSeriesScheduleImpl extends IfcControlImpl implements IfcTimeSeriesSchedule {
	/**
	 * The cached value of the '{@link #getApplicableDates() <em>Applicable Dates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDates()
	 * @generated
	 * @ordered
	 */
	protected ApplicableDatesType applicableDates;

	/**
	 * The default value of the '{@link #getTimeSeriesScheduleType() <em>Time Series Schedule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesScheduleType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTimeSeriesScheduleTypeEnum TIME_SERIES_SCHEDULE_TYPE_EDEFAULT = IfcTimeSeriesScheduleTypeEnum.ANNUAL;

	/**
	 * The cached value of the '{@link #getTimeSeriesScheduleType() <em>Time Series Schedule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesScheduleType()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeriesScheduleTypeEnum timeSeriesScheduleType = TIME_SERIES_SCHEDULE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSeries() <em>Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected TimeSeriesType timeSeries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTimeSeriesScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcTimeSeriesSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableDatesType getApplicableDates() {
		return applicableDates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicableDates(ApplicableDatesType newApplicableDates, NotificationChain msgs) {
		ApplicableDatesType oldApplicableDates = applicableDates;
		applicableDates = newApplicableDates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES, oldApplicableDates, newApplicableDates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableDates(ApplicableDatesType newApplicableDates) {
		if (newApplicableDates != applicableDates) {
			NotificationChain msgs = null;
			if (applicableDates != null)
				msgs = ((InternalEObject)applicableDates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES, null, msgs);
			if (newApplicableDates != null)
				msgs = ((InternalEObject)newApplicableDates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES, null, msgs);
			msgs = basicSetApplicableDates(newApplicableDates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES, newApplicableDates, newApplicableDates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesScheduleTypeEnum getTimeSeriesScheduleType() {
		return timeSeriesScheduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum newTimeSeriesScheduleType) {
		IfcTimeSeriesScheduleTypeEnum oldTimeSeriesScheduleType = timeSeriesScheduleType;
		timeSeriesScheduleType = newTimeSeriesScheduleType == null ? TIME_SERIES_SCHEDULE_TYPE_EDEFAULT : newTimeSeriesScheduleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE, oldTimeSeriesScheduleType, timeSeriesScheduleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeriesType getTimeSeries() {
		return timeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSeries(TimeSeriesType newTimeSeries, NotificationChain msgs) {
		TimeSeriesType oldTimeSeries = timeSeries;
		timeSeries = newTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES, oldTimeSeries, newTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeries(TimeSeriesType newTimeSeries) {
		if (newTimeSeries != timeSeries) {
			NotificationChain msgs = null;
			if (timeSeries != null)
				msgs = ((InternalEObject)timeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES, null, msgs);
			if (newTimeSeries != null)
				msgs = ((InternalEObject)newTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES, null, msgs);
			msgs = basicSetTimeSeries(newTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES, newTimeSeries, newTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES:
				return basicSetApplicableDates(null, msgs);
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES:
				return basicSetTimeSeries(null, msgs);
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
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES:
				return getApplicableDates();
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE:
				return getTimeSeriesScheduleType();
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES:
				return getTimeSeries();
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
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES:
				setApplicableDates((ApplicableDatesType)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE:
				setTimeSeriesScheduleType((IfcTimeSeriesScheduleTypeEnum)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES:
				setTimeSeries((TimeSeriesType)newValue);
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
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES:
				setApplicableDates((ApplicableDatesType)null);
				return;
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE:
				setTimeSeriesScheduleType(TIME_SERIES_SCHEDULE_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES:
				setTimeSeries((TimeSeriesType)null);
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
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES:
				return applicableDates != null;
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE:
				return timeSeriesScheduleType != TIME_SERIES_SCHEDULE_TYPE_EDEFAULT;
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES:
				return timeSeries != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (timeSeriesScheduleType: ");
		result.append(timeSeriesScheduleType);
		result.append(')');
		return result.toString();
	}

} //IfcTimeSeriesScheduleImpl
