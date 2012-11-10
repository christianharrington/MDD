/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDataOriginEnum;
import ifc2x3tc1.IfcDateTimeSelect;
import ifc2x3tc1.IfcTimeSeries;
import ifc2x3tc1.IfcTimeSeriesDataTypeEnum;
import ifc2x3tc1.IfcTimeSeriesReferenceRelationship;
import ifc2x3tc1.IfcUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Time Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesImpl#getTimeSeriesDataType <em>Time Series Data Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesImpl#getDataOrigin <em>Data Origin</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesImpl#getUserDefinedDataOrigin <em>User Defined Data Origin</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTimeSeriesImpl#getDocumentedBy <em>Documented By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTimeSeriesImpl extends EObjectImpl implements IfcTimeSeries {
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
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect startTime;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect endTime;

	/**
	 * The default value of the '{@link #getTimeSeriesDataType() <em>Time Series Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSeriesDataType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTimeSeriesDataTypeEnum TIME_SERIES_DATA_TYPE_EDEFAULT = IfcTimeSeriesDataTypeEnum.NULL;

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
	protected static final IfcDataOriginEnum DATA_ORIGIN_EDEFAULT = IfcDataOriginEnum.NULL;

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
	 * This is true if the User Defined Data Origin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedDataOriginESet;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcUnit unit;

	/**
	 * This is true if the Unit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * The cached value of the '{@link #getDocumentedBy() <em>Documented By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcTimeSeriesReferenceRelationship> documentedBy;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcTimeSeries();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES__NAME, oldName, name));
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
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TIME_SERIES__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getStartTime() {
		if (startTime != null && startTime.eIsProxy()) {
			InternalEObject oldStartTime = (InternalEObject)startTime;
			startTime = (IfcDateTimeSelect)eResolveProxy(oldStartTime);
			if (startTime != oldStartTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TIME_SERIES__START_TIME, oldStartTime, startTime));
			}
		}
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(IfcDateTimeSelect newStartTime) {
		IfcDateTimeSelect oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getEndTime() {
		if (endTime != null && endTime.eIsProxy()) {
			InternalEObject oldEndTime = (InternalEObject)endTime;
			endTime = (IfcDateTimeSelect)eResolveProxy(oldEndTime);
			if (endTime != oldEndTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TIME_SERIES__END_TIME, oldEndTime, endTime));
			}
		}
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(IfcDateTimeSelect newEndTime) {
		IfcDateTimeSelect oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES__END_TIME, oldEndTime, endTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE, oldTimeSeriesDataType, timeSeriesDataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES__DATA_ORIGIN, oldDataOrigin, dataOrigin));
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
		boolean oldUserDefinedDataOriginESet = userDefinedDataOriginESet;
		userDefinedDataOriginESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN, oldUserDefinedDataOrigin, userDefinedDataOrigin, !oldUserDefinedDataOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedDataOrigin() {
		String oldUserDefinedDataOrigin = userDefinedDataOrigin;
		boolean oldUserDefinedDataOriginESet = userDefinedDataOriginESet;
		userDefinedDataOrigin = USER_DEFINED_DATA_ORIGIN_EDEFAULT;
		userDefinedDataOriginESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN, oldUserDefinedDataOrigin, USER_DEFINED_DATA_ORIGIN_EDEFAULT, oldUserDefinedDataOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedDataOrigin() {
		return userDefinedDataOriginESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (IfcUnit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_TIME_SERIES__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(IfcUnit newUnit) {
		IfcUnit oldUnit = unit;
		unit = newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TIME_SERIES__UNIT, oldUnit, unit, !oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		IfcUnit oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = null;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TIME_SERIES__UNIT, oldUnit, null, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTimeSeriesReferenceRelationship> getDocumentedBy() {
		if (documentedBy == null) {
			documentedBy = new EObjectWithInverseResolvingEList.Unsettable<IfcTimeSeriesReferenceRelationship>(IfcTimeSeriesReferenceRelationship.class, this, Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY, Ifc2x3tc1Package.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP__REFERENCED_TIME_SERIES);
		}
		return documentedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDocumentedBy() {
		if (documentedBy != null) ((InternalEList.Unsettable<?>)documentedBy).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDocumentedBy() {
		return documentedBy != null && ((InternalEList.Unsettable<?>)documentedBy).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY:
				return ((InternalEList<?>)getDocumentedBy()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DESCRIPTION:
				return getDescription();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__START_TIME:
				if (resolve) return getStartTime();
				return basicGetStartTime();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__END_TIME:
				if (resolve) return getEndTime();
				return basicGetEndTime();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE:
				return getTimeSeriesDataType();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DATA_ORIGIN:
				return getDataOrigin();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN:
				return getUserDefinedDataOrigin();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY:
				return getDocumentedBy();
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__START_TIME:
				setStartTime((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__END_TIME:
				setEndTime((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE:
				setTimeSeriesDataType((IfcTimeSeriesDataTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DATA_ORIGIN:
				setDataOrigin((IfcDataOriginEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN:
				setUserDefinedDataOrigin((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__UNIT:
				setUnit((IfcUnit)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY:
				getDocumentedBy().clear();
				getDocumentedBy().addAll((Collection<? extends IfcTimeSeriesReferenceRelationship>)newValue);
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DESCRIPTION:
				unsetDescription();
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__START_TIME:
				setStartTime((IfcDateTimeSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__END_TIME:
				setEndTime((IfcDateTimeSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE:
				setTimeSeriesDataType(TIME_SERIES_DATA_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DATA_ORIGIN:
				setDataOrigin(DATA_ORIGIN_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN:
				unsetUserDefinedDataOrigin();
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__UNIT:
				unsetUnit();
				return;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY:
				unsetDocumentedBy();
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
			case Ifc2x3tc1Package.IFC_TIME_SERIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DESCRIPTION:
				return isSetDescription();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__START_TIME:
				return startTime != null;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__END_TIME:
				return endTime != null;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__TIME_SERIES_DATA_TYPE:
				return timeSeriesDataType != TIME_SERIES_DATA_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DATA_ORIGIN:
				return dataOrigin != DATA_ORIGIN_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TIME_SERIES__USER_DEFINED_DATA_ORIGIN:
				return isSetUserDefinedDataOrigin();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__UNIT:
				return isSetUnit();
			case Ifc2x3tc1Package.IFC_TIME_SERIES__DOCUMENTED_BY:
				return isSetDocumentedBy();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", TimeSeriesDataType: ");
		result.append(timeSeriesDataType);
		result.append(", DataOrigin: ");
		result.append(dataOrigin);
		result.append(", UserDefinedDataOrigin: ");
		if (userDefinedDataOriginESet) result.append(userDefinedDataOrigin); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTimeSeriesImpl
