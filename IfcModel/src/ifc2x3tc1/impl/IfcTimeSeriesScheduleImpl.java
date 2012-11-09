/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDateTimeSelect;
import ifc2x3tc1.IfcTimeSeries;
import ifc2x3tc1.IfcTimeSeriesSchedule;
import ifc2x3tc1.IfcTimeSeriesScheduleTypeEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesScheduleImpl#getApplicableDates <em>Applicable Dates</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesScheduleImpl#getTimeSeriesScheduleType <em>Time Series Schedule Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesScheduleImpl#getTimeSeries <em>Time Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTimeSeriesScheduleImpl extends IfcControlImpl implements IfcTimeSeriesSchedule {
	/**
	 * The cached value of the '{@link #getApplicableDates() <em>Applicable Dates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableDates()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDateTimeSelect> applicableDates;

	/**
	 * The default value of the '{@link #getTimeSeriesScheduleType() <em>Time Series Schedule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesScheduleType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTimeSeriesScheduleTypeEnum TIME_SERIES_SCHEDULE_TYPE_EDEFAULT = IfcTimeSeriesScheduleTypeEnum.NULL;

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
	 * The cached value of the '{@link #getTimeSeries() <em>Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries timeSeries;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcTimeSeriesSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDateTimeSelect> getApplicableDates() {
		if (applicableDates == null) {
			applicableDates = new EObjectResolvingEList.Unsettable<IfcDateTimeSelect>(IfcDateTimeSelect.class, this, Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES);
		}
		return applicableDates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableDates() {
		if (applicableDates != null) ((InternalEList.Unsettable<?>)applicableDates).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableDates() {
		return applicableDates != null && ((InternalEList.Unsettable<?>)applicableDates).isSet();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE, oldTimeSeriesScheduleType, timeSeriesScheduleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getTimeSeries() {
		if (timeSeries != null && timeSeries.eIsProxy()) {
			InternalEObject oldTimeSeries = (InternalEObject)timeSeries;
			timeSeries = (IfcTimeSeries)eResolveProxy(oldTimeSeries);
			if (timeSeries != oldTimeSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES, oldTimeSeries, timeSeries));
			}
		}
		return timeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetTimeSeries() {
		return timeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeries(IfcTimeSeries newTimeSeries) {
		IfcTimeSeries oldTimeSeries = timeSeries;
		timeSeries = newTimeSeries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES, oldTimeSeries, timeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES:
				return getApplicableDates();
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE:
				return getTimeSeriesScheduleType();
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES:
				if (resolve) return getTimeSeries();
				return basicGetTimeSeries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES:
				getApplicableDates().clear();
				getApplicableDates().addAll((Collection<? extends IfcDateTimeSelect>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE:
				setTimeSeriesScheduleType((IfcTimeSeriesScheduleTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES:
				setTimeSeries((IfcTimeSeries)newValue);
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES:
				unsetApplicableDates();
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE:
				setTimeSeriesScheduleType(TIME_SERIES_SCHEDULE_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES:
				setTimeSeries((IfcTimeSeries)null);
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__APPLICABLE_DATES:
				return isSetApplicableDates();
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES_SCHEDULE_TYPE:
				return timeSeriesScheduleType != TIME_SERIES_SCHEDULE_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TIME_SERIES_SCHEDULE__TIME_SERIES:
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
		result.append(" (TimeSeriesScheduleType: ");
		result.append(timeSeriesScheduleType);
		result.append(')');
		return result.toString();
	}

} //IfcTimeSeriesScheduleImpl
