/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCalendarDate;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMeasureWithUnit;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMetricValueSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTable;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeries;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Metric Value Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricValueSelectImpl#getIfcCalendarDate <em>Ifc Calendar Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricValueSelectImpl#getIfcLocalTime <em>Ifc Local Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricValueSelectImpl#getIfcDateAndTime <em>Ifc Date And Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricValueSelectImpl#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricValueSelectImpl#getIfcTable <em>Ifc Table</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricValueSelectImpl#getIfcText <em>Ifc Text</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricValueSelectImpl#getIfcTimeSeriesGroup <em>Ifc Time Series Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricValueSelectImpl#getIfcTimeSeries <em>Ifc Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMetricValueSelectImpl#getIfcCostValue <em>Ifc Cost Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMetricValueSelectImpl extends EObjectImpl implements IfcMetricValueSelect {
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
	 * The cached value of the '{@link #getIfcMeasureWithUnit() <em>Ifc Measure With Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMeasureWithUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcMeasureWithUnit ifcMeasureWithUnit;

	/**
	 * The cached value of the '{@link #getIfcTable() <em>Ifc Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTable()
	 * @generated
	 * @ordered
	 */
	protected IfcTable ifcTable;

	/**
	 * The cached value of the '{@link #getIfcText() <em>Ifc Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcText()
	 * @generated
	 * @ordered
	 */
	protected IfcTextType ifcText;

	/**
	 * The cached value of the '{@link #getIfcTimeSeriesGroup() <em>Ifc Time Series Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTimeSeriesGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcTimeSeriesGroup;

	/**
	 * The cached value of the '{@link #getIfcCostValue() <em>Ifc Cost Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCostValue()
	 * @generated
	 * @ordered
	 */
	protected IfcCostValue ifcCostValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMetricValueSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMetricValueSelect();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_CALENDAR_DATE, oldIfcCalendarDate, newIfcCalendarDate);
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
				msgs = ((InternalEObject)ifcCalendarDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_CALENDAR_DATE, null, msgs);
			if (newIfcCalendarDate != null)
				msgs = ((InternalEObject)newIfcCalendarDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_CALENDAR_DATE, null, msgs);
			msgs = basicSetIfcCalendarDate(newIfcCalendarDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_CALENDAR_DATE, newIfcCalendarDate, newIfcCalendarDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_LOCAL_TIME, oldIfcLocalTime, newIfcLocalTime);
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
				msgs = ((InternalEObject)ifcLocalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_LOCAL_TIME, null, msgs);
			if (newIfcLocalTime != null)
				msgs = ((InternalEObject)newIfcLocalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_LOCAL_TIME, null, msgs);
			msgs = basicSetIfcLocalTime(newIfcLocalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_LOCAL_TIME, newIfcLocalTime, newIfcLocalTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_DATE_AND_TIME, oldIfcDateAndTime, newIfcDateAndTime);
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
				msgs = ((InternalEObject)ifcDateAndTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_DATE_AND_TIME, null, msgs);
			if (newIfcDateAndTime != null)
				msgs = ((InternalEObject)newIfcDateAndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_DATE_AND_TIME, null, msgs);
			msgs = basicSetIfcDateAndTime(newIfcDateAndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_DATE_AND_TIME, newIfcDateAndTime, newIfcDateAndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getIfcMeasureWithUnit() {
		return ifcMeasureWithUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMeasureWithUnit(IfcMeasureWithUnit newIfcMeasureWithUnit, NotificationChain msgs) {
		IfcMeasureWithUnit oldIfcMeasureWithUnit = ifcMeasureWithUnit;
		ifcMeasureWithUnit = newIfcMeasureWithUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_MEASURE_WITH_UNIT, oldIfcMeasureWithUnit, newIfcMeasureWithUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMeasureWithUnit(IfcMeasureWithUnit newIfcMeasureWithUnit) {
		if (newIfcMeasureWithUnit != ifcMeasureWithUnit) {
			NotificationChain msgs = null;
			if (ifcMeasureWithUnit != null)
				msgs = ((InternalEObject)ifcMeasureWithUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_MEASURE_WITH_UNIT, null, msgs);
			if (newIfcMeasureWithUnit != null)
				msgs = ((InternalEObject)newIfcMeasureWithUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_MEASURE_WITH_UNIT, null, msgs);
			msgs = basicSetIfcMeasureWithUnit(newIfcMeasureWithUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_MEASURE_WITH_UNIT, newIfcMeasureWithUnit, newIfcMeasureWithUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTable getIfcTable() {
		return ifcTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTable(IfcTable newIfcTable, NotificationChain msgs) {
		IfcTable oldIfcTable = ifcTable;
		ifcTable = newIfcTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TABLE, oldIfcTable, newIfcTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTable(IfcTable newIfcTable) {
		if (newIfcTable != ifcTable) {
			NotificationChain msgs = null;
			if (ifcTable != null)
				msgs = ((InternalEObject)ifcTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TABLE, null, msgs);
			if (newIfcTable != null)
				msgs = ((InternalEObject)newIfcTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TABLE, null, msgs);
			msgs = basicSetIfcTable(newIfcTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TABLE, newIfcTable, newIfcTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextType getIfcText() {
		return ifcText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcText(IfcTextType newIfcText, NotificationChain msgs) {
		IfcTextType oldIfcText = ifcText;
		ifcText = newIfcText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TEXT, oldIfcText, newIfcText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcText(IfcTextType newIfcText) {
		if (newIfcText != ifcText) {
			NotificationChain msgs = null;
			if (ifcText != null)
				msgs = ((InternalEObject)ifcText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TEXT, null, msgs);
			if (newIfcText != null)
				msgs = ((InternalEObject)newIfcText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TEXT, null, msgs);
			msgs = basicSetIfcText(newIfcText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TEXT, newIfcText, newIfcText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcTimeSeriesGroup() {
		if (ifcTimeSeriesGroup == null) {
			ifcTimeSeriesGroup = new BasicFeatureMap(this, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TIME_SERIES_GROUP);
		}
		return ifcTimeSeriesGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getIfcTimeSeries() {
		return (IfcTimeSeries)getIfcTimeSeriesGroup().get(FinalPackage.eINSTANCE.getIfcMetricValueSelect_IfcTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTimeSeries(IfcTimeSeries newIfcTimeSeries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcTimeSeriesGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcMetricValueSelect_IfcTimeSeries(), newIfcTimeSeries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getIfcCostValue() {
		return ifcCostValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCostValue(IfcCostValue newIfcCostValue, NotificationChain msgs) {
		IfcCostValue oldIfcCostValue = ifcCostValue;
		ifcCostValue = newIfcCostValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_COST_VALUE, oldIfcCostValue, newIfcCostValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCostValue(IfcCostValue newIfcCostValue) {
		if (newIfcCostValue != ifcCostValue) {
			NotificationChain msgs = null;
			if (ifcCostValue != null)
				msgs = ((InternalEObject)ifcCostValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_COST_VALUE, null, msgs);
			if (newIfcCostValue != null)
				msgs = ((InternalEObject)newIfcCostValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_COST_VALUE, null, msgs);
			msgs = basicSetIfcCostValue(newIfcCostValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_COST_VALUE, newIfcCostValue, newIfcCostValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_CALENDAR_DATE:
				return basicSetIfcCalendarDate(null, msgs);
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_LOCAL_TIME:
				return basicSetIfcLocalTime(null, msgs);
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_DATE_AND_TIME:
				return basicSetIfcDateAndTime(null, msgs);
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_MEASURE_WITH_UNIT:
				return basicSetIfcMeasureWithUnit(null, msgs);
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TABLE:
				return basicSetIfcTable(null, msgs);
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TEXT:
				return basicSetIfcText(null, msgs);
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TIME_SERIES_GROUP:
				return ((InternalEList<?>)getIfcTimeSeriesGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TIME_SERIES:
				return basicSetIfcTimeSeries(null, msgs);
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_COST_VALUE:
				return basicSetIfcCostValue(null, msgs);
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
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_CALENDAR_DATE:
				return getIfcCalendarDate();
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_LOCAL_TIME:
				return getIfcLocalTime();
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_DATE_AND_TIME:
				return getIfcDateAndTime();
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_MEASURE_WITH_UNIT:
				return getIfcMeasureWithUnit();
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TABLE:
				return getIfcTable();
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TEXT:
				return getIfcText();
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TIME_SERIES_GROUP:
				if (coreType) return getIfcTimeSeriesGroup();
				return ((FeatureMap.Internal)getIfcTimeSeriesGroup()).getWrapper();
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TIME_SERIES:
				return getIfcTimeSeries();
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_COST_VALUE:
				return getIfcCostValue();
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
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_CALENDAR_DATE:
				setIfcCalendarDate((IfcCalendarDate)newValue);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_LOCAL_TIME:
				setIfcLocalTime((IfcLocalTime)newValue);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_DATE_AND_TIME:
				setIfcDateAndTime((IfcDateAndTime)newValue);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_MEASURE_WITH_UNIT:
				setIfcMeasureWithUnit((IfcMeasureWithUnit)newValue);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TABLE:
				setIfcTable((IfcTable)newValue);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TEXT:
				setIfcText((IfcTextType)newValue);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TIME_SERIES_GROUP:
				((FeatureMap.Internal)getIfcTimeSeriesGroup()).set(newValue);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_COST_VALUE:
				setIfcCostValue((IfcCostValue)newValue);
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
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_CALENDAR_DATE:
				setIfcCalendarDate((IfcCalendarDate)null);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_LOCAL_TIME:
				setIfcLocalTime((IfcLocalTime)null);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_DATE_AND_TIME:
				setIfcDateAndTime((IfcDateAndTime)null);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_MEASURE_WITH_UNIT:
				setIfcMeasureWithUnit((IfcMeasureWithUnit)null);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TABLE:
				setIfcTable((IfcTable)null);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TEXT:
				setIfcText((IfcTextType)null);
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TIME_SERIES_GROUP:
				getIfcTimeSeriesGroup().clear();
				return;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_COST_VALUE:
				setIfcCostValue((IfcCostValue)null);
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
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_CALENDAR_DATE:
				return ifcCalendarDate != null;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_LOCAL_TIME:
				return ifcLocalTime != null;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_DATE_AND_TIME:
				return ifcDateAndTime != null;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_MEASURE_WITH_UNIT:
				return ifcMeasureWithUnit != null;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TABLE:
				return ifcTable != null;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TEXT:
				return ifcText != null;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TIME_SERIES_GROUP:
				return ifcTimeSeriesGroup != null && !ifcTimeSeriesGroup.isEmpty();
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_TIME_SERIES:
				return getIfcTimeSeries() != null;
			case FinalPackage.IFC_METRIC_VALUE_SELECT__IFC_COST_VALUE:
				return ifcCostValue != null;
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
		result.append(" (ifcTimeSeriesGroup: ");
		result.append(ifcTimeSeriesGroup);
		result.append(')');
		return result.toString();
	}

} //IfcMetricValueSelectImpl
