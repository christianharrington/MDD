/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EndTimeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDataOriginEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeries;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesDataTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.StartTimeType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesImpl#getTimeSeriesDataType <em>Time Series Data Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesImpl#getDataOrigin <em>Data Origin</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesImpl#getUserDefinedDataOrigin <em>User Defined Data Origin</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTimeSeriesImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcTimeSeriesImpl extends EntityImpl implements IfcTimeSeries {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected StartTimeType1 startTime;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected EndTimeType endTime;

	/**
	 * The default value of the '{@link #getTimeSeriesDataType() <em>Time Series Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesDataType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTimeSeriesDataTypeEnum TIME_SERIES_DATA_TYPE_EDEFAULT = IfcTimeSeriesDataTypeEnum.CONTINUOUS;

	/**
	 * The cached value of the '{@link #getTimeSeriesDataType() <em>Time Series Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesDataType()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeriesDataTypeEnum timeSeriesDataType = TIME_SERIES_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataOrigin() <em>Data Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDataOriginEnum DATA_ORIGIN_EDEFAULT = IfcDataOriginEnum.MEASURED;

	/**
	 * The cached value of the '{@link #getDataOrigin() <em>Data Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOrigin()
	 * @generated
	 * @ordered
	 */
	protected IfcDataOriginEnum dataOrigin = DATA_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedDataOrigin() <em>User Defined Data Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedDataOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_DATA_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedDataOrigin() <em>User Defined Data Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedDataOrigin()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedDataOrigin = USER_DEFINED_DATA_ORIGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitType2 unit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTimeSeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcTimeSeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimeType1 getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartTime(StartTimeType1 newStartTime, NotificationChain msgs) {
		StartTimeType1 oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__START_TIME, oldStartTime, newStartTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(StartTimeType1 newStartTime) {
		if (newStartTime != startTime) {
			NotificationChain msgs = null;
			if (startTime != null)
				msgs = ((InternalEObject)startTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES__START_TIME, null, msgs);
			if (newStartTime != null)
				msgs = ((InternalEObject)newStartTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES__START_TIME, null, msgs);
			msgs = basicSetStartTime(newStartTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__START_TIME, newStartTime, newStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndTimeType getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndTime(EndTimeType newEndTime, NotificationChain msgs) {
		EndTimeType oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__END_TIME, oldEndTime, newEndTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(EndTimeType newEndTime) {
		if (newEndTime != endTime) {
			NotificationChain msgs = null;
			if (endTime != null)
				msgs = ((InternalEObject)endTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES__END_TIME, null, msgs);
			if (newEndTime != null)
				msgs = ((InternalEObject)newEndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES__END_TIME, null, msgs);
			msgs = basicSetEndTime(newEndTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__END_TIME, newEndTime, newEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesDataTypeEnum getTimeSeriesDataType() {
		return timeSeriesDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum newTimeSeriesDataType) {
		IfcTimeSeriesDataTypeEnum oldTimeSeriesDataType = timeSeriesDataType;
		timeSeriesDataType = newTimeSeriesDataType == null ? TIME_SERIES_DATA_TYPE_EDEFAULT : newTimeSeriesDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE, oldTimeSeriesDataType, timeSeriesDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDataOriginEnum getDataOrigin() {
		return dataOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataOrigin(IfcDataOriginEnum newDataOrigin) {
		IfcDataOriginEnum oldDataOrigin = dataOrigin;
		dataOrigin = newDataOrigin == null ? DATA_ORIGIN_EDEFAULT : newDataOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__DATA_ORIGIN, oldDataOrigin, dataOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedDataOrigin() {
		return userDefinedDataOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedDataOrigin(String newUserDefinedDataOrigin) {
		String oldUserDefinedDataOrigin = userDefinedDataOrigin;
		userDefinedDataOrigin = newUserDefinedDataOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN, oldUserDefinedDataOrigin, userDefinedDataOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType2 getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnit(UnitType2 newUnit, NotificationChain msgs) {
		UnitType2 oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitType2 newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TIME_SERIES__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TIME_SERIES__UNIT, newUnit, newUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TIME_SERIES__START_TIME:
				return basicSetStartTime(null, msgs);
			case FinalPackage.IFC_TIME_SERIES__END_TIME:
				return basicSetEndTime(null, msgs);
			case FinalPackage.IFC_TIME_SERIES__UNIT:
				return basicSetUnit(null, msgs);
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
			case FinalPackage.IFC_TIME_SERIES__NAME:
				return getName();
			case FinalPackage.IFC_TIME_SERIES__DESCRIPTION:
				return getDescription();
			case FinalPackage.IFC_TIME_SERIES__START_TIME:
				return getStartTime();
			case FinalPackage.IFC_TIME_SERIES__END_TIME:
				return getEndTime();
			case FinalPackage.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE:
				return getTimeSeriesDataType();
			case FinalPackage.IFC_TIME_SERIES__DATA_ORIGIN:
				return getDataOrigin();
			case FinalPackage.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN:
				return getUserDefinedDataOrigin();
			case FinalPackage.IFC_TIME_SERIES__UNIT:
				return getUnit();
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
			case FinalPackage.IFC_TIME_SERIES__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES__START_TIME:
				setStartTime((StartTimeType1)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES__END_TIME:
				setEndTime((EndTimeType)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE:
				setTimeSeriesDataType((IfcTimeSeriesDataTypeEnum)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES__DATA_ORIGIN:
				setDataOrigin((IfcDataOriginEnum)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN:
				setUserDefinedDataOrigin((String)newValue);
				return;
			case FinalPackage.IFC_TIME_SERIES__UNIT:
				setUnit((UnitType2)newValue);
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
			case FinalPackage.IFC_TIME_SERIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_TIME_SERIES__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_TIME_SERIES__START_TIME:
				setStartTime((StartTimeType1)null);
				return;
			case FinalPackage.IFC_TIME_SERIES__END_TIME:
				setEndTime((EndTimeType)null);
				return;
			case FinalPackage.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE:
				setTimeSeriesDataType(TIME_SERIES_DATA_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_TIME_SERIES__DATA_ORIGIN:
				setDataOrigin(DATA_ORIGIN_EDEFAULT);
				return;
			case FinalPackage.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN:
				setUserDefinedDataOrigin(USER_DEFINED_DATA_ORIGIN_EDEFAULT);
				return;
			case FinalPackage.IFC_TIME_SERIES__UNIT:
				setUnit((UnitType2)null);
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
			case FinalPackage.IFC_TIME_SERIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_TIME_SERIES__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinalPackage.IFC_TIME_SERIES__START_TIME:
				return startTime != null;
			case FinalPackage.IFC_TIME_SERIES__END_TIME:
				return endTime != null;
			case FinalPackage.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE:
				return timeSeriesDataType != TIME_SERIES_DATA_TYPE_EDEFAULT;
			case FinalPackage.IFC_TIME_SERIES__DATA_ORIGIN:
				return dataOrigin != DATA_ORIGIN_EDEFAULT;
			case FinalPackage.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN:
				return USER_DEFINED_DATA_ORIGIN_EDEFAULT == null ? userDefinedDataOrigin != null : !USER_DEFINED_DATA_ORIGIN_EDEFAULT.equals(userDefinedDataOrigin);
			case FinalPackage.IFC_TIME_SERIES__UNIT:
				return unit != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", timeSeriesDataType: ");
		result.append(timeSeriesDataType);
		result.append(", dataOrigin: ");
		result.append(dataOrigin);
		result.append(", userDefinedDataOrigin: ");
		result.append(userDefinedDataOrigin);
		result.append(')');
		return result.toString();
	}

} //IfcTimeSeriesImpl
