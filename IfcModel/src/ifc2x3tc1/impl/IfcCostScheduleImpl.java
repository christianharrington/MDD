/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcActorSelect;
import ifc2x3tc1.IfcCostSchedule;
import ifc2x3tc1.IfcCostScheduleTypeEnum;
import ifc2x3tc1.IfcDateTimeSelect;

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
 * An implementation of the model object '<em><b>Ifc Cost Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCostScheduleImpl#getSubmittedBy <em>Submitted By</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCostScheduleImpl#getPreparedBy <em>Prepared By</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCostScheduleImpl#getSubmittedOn <em>Submitted On</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCostScheduleImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCostScheduleImpl#getTargetUsers <em>Target Users</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCostScheduleImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCostScheduleImpl#getID <em>ID</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCostScheduleImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCostScheduleImpl extends IfcControlImpl implements IfcCostSchedule {
	/**
	 * The cached value of the '{@link #getSubmittedBy() <em>Submitted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedBy()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect submittedBy;

	/**
	 * This is true if the Submitted By reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean submittedByESet;

	/**
	 * The cached value of the '{@link #getPreparedBy() <em>Prepared By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparedBy()
	 * @generated
	 * @ordered
	 */
	protected IfcActorSelect preparedBy;

	/**
	 * This is true if the Prepared By reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preparedByESet;

	/**
	 * The cached value of the '{@link #getSubmittedOn() <em>Submitted On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedOn()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect submittedOn;

	/**
	 * This is true if the Submitted On reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean submittedOnESet;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * The cached value of the '{@link #getTargetUsers() <em>Target Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcActorSelect> targetUsers;

	/**
	 * The cached value of the '{@link #getUpdateDate() <em>Update Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect updateDate;

	/**
	 * This is true if the Update Date reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateDateESet;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcCostScheduleTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcCostScheduleTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcCostScheduleTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCostScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCostSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getSubmittedBy() {
		if (submittedBy != null && submittedBy.eIsProxy()) {
			InternalEObject oldSubmittedBy = (InternalEObject)submittedBy;
			submittedBy = (IfcActorSelect)eResolveProxy(oldSubmittedBy);
			if (submittedBy != oldSubmittedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_BY, oldSubmittedBy, submittedBy));
			}
		}
		return submittedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetSubmittedBy() {
		return submittedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmittedBy(IfcActorSelect newSubmittedBy) {
		IfcActorSelect oldSubmittedBy = submittedBy;
		submittedBy = newSubmittedBy;
		boolean oldSubmittedByESet = submittedByESet;
		submittedByESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_BY, oldSubmittedBy, submittedBy, !oldSubmittedByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubmittedBy() {
		IfcActorSelect oldSubmittedBy = submittedBy;
		boolean oldSubmittedByESet = submittedByESet;
		submittedBy = null;
		submittedByESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_BY, oldSubmittedBy, null, oldSubmittedByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubmittedBy() {
		return submittedByESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getPreparedBy() {
		if (preparedBy != null && preparedBy.eIsProxy()) {
			InternalEObject oldPreparedBy = (InternalEObject)preparedBy;
			preparedBy = (IfcActorSelect)eResolveProxy(oldPreparedBy);
			if (preparedBy != oldPreparedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREPARED_BY, oldPreparedBy, preparedBy));
			}
		}
		return preparedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect basicGetPreparedBy() {
		return preparedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreparedBy(IfcActorSelect newPreparedBy) {
		IfcActorSelect oldPreparedBy = preparedBy;
		preparedBy = newPreparedBy;
		boolean oldPreparedByESet = preparedByESet;
		preparedByESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREPARED_BY, oldPreparedBy, preparedBy, !oldPreparedByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreparedBy() {
		IfcActorSelect oldPreparedBy = preparedBy;
		boolean oldPreparedByESet = preparedByESet;
		preparedBy = null;
		preparedByESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREPARED_BY, oldPreparedBy, null, oldPreparedByESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreparedBy() {
		return preparedByESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getSubmittedOn() {
		if (submittedOn != null && submittedOn.eIsProxy()) {
			InternalEObject oldSubmittedOn = (InternalEObject)submittedOn;
			submittedOn = (IfcDateTimeSelect)eResolveProxy(oldSubmittedOn);
			if (submittedOn != oldSubmittedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_ON, oldSubmittedOn, submittedOn));
			}
		}
		return submittedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetSubmittedOn() {
		return submittedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmittedOn(IfcDateTimeSelect newSubmittedOn) {
		IfcDateTimeSelect oldSubmittedOn = submittedOn;
		submittedOn = newSubmittedOn;
		boolean oldSubmittedOnESet = submittedOnESet;
		submittedOnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_ON, oldSubmittedOn, submittedOn, !oldSubmittedOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubmittedOn() {
		IfcDateTimeSelect oldSubmittedOn = submittedOn;
		boolean oldSubmittedOnESet = submittedOnESet;
		submittedOn = null;
		submittedOnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_ON, oldSubmittedOn, null, oldSubmittedOnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubmittedOn() {
		return submittedOnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		String oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcActorSelect> getTargetUsers() {
		if (targetUsers == null) {
			targetUsers = new EObjectResolvingEList.Unsettable<IfcActorSelect>(IfcActorSelect.class, this, Ifc2x3tc1Package.IFC_COST_SCHEDULE__TARGET_USERS);
		}
		return targetUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetUsers() {
		if (targetUsers != null) ((InternalEList.Unsettable<?>)targetUsers).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetUsers() {
		return targetUsers != null && ((InternalEList.Unsettable<?>)targetUsers).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getUpdateDate() {
		if (updateDate != null && updateDate.eIsProxy()) {
			InternalEObject oldUpdateDate = (InternalEObject)updateDate;
			updateDate = (IfcDateTimeSelect)eResolveProxy(oldUpdateDate);
			if (updateDate != oldUpdateDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_COST_SCHEDULE__UPDATE_DATE, oldUpdateDate, updateDate));
			}
		}
		return updateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetUpdateDate() {
		return updateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateDate(IfcDateTimeSelect newUpdateDate) {
		IfcDateTimeSelect oldUpdateDate = updateDate;
		updateDate = newUpdateDate;
		boolean oldUpdateDateESet = updateDateESet;
		updateDateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__UPDATE_DATE, oldUpdateDate, updateDate, !oldUpdateDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdateDate() {
		IfcDateTimeSelect oldUpdateDate = updateDate;
		boolean oldUpdateDateESet = updateDateESet;
		updateDate = null;
		updateDateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__UPDATE_DATE, oldUpdateDate, null, oldUpdateDateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdateDate() {
		return updateDateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostScheduleTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcCostScheduleTypeEnum newPredefinedType) {
		IfcCostScheduleTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_BY:
				if (resolve) return getSubmittedBy();
				return basicGetSubmittedBy();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREPARED_BY:
				if (resolve) return getPreparedBy();
				return basicGetPreparedBy();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_ON:
				if (resolve) return getSubmittedOn();
				return basicGetSubmittedOn();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__STATUS:
				return getStatus();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__TARGET_USERS:
				return getTargetUsers();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__UPDATE_DATE:
				if (resolve) return getUpdateDate();
				return basicGetUpdateDate();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__ID:
				return getID();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREDEFINED_TYPE:
				return getPredefinedType();
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
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_BY:
				setSubmittedBy((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREPARED_BY:
				setPreparedBy((IfcActorSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_ON:
				setSubmittedOn((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__STATUS:
				setStatus((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__TARGET_USERS:
				getTargetUsers().clear();
				getTargetUsers().addAll((Collection<? extends IfcActorSelect>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__UPDATE_DATE:
				setUpdateDate((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__ID:
				setID((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREDEFINED_TYPE:
				setPredefinedType((IfcCostScheduleTypeEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_BY:
				unsetSubmittedBy();
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREPARED_BY:
				unsetPreparedBy();
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_ON:
				unsetSubmittedOn();
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__STATUS:
				unsetStatus();
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__TARGET_USERS:
				unsetTargetUsers();
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__UPDATE_DATE:
				unsetUpdateDate();
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__ID:
				setID(ID_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_BY:
				return isSetSubmittedBy();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREPARED_BY:
				return isSetPreparedBy();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__SUBMITTED_ON:
				return isSetSubmittedOn();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__STATUS:
				return isSetStatus();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__TARGET_USERS:
				return isSetTargetUsers();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__UPDATE_DATE:
				return isSetUpdateDate();
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Ifc2x3tc1Package.IFC_COST_SCHEDULE__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
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
		result.append(" (Status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(", ID: ");
		result.append(id);
		result.append(", PredefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //IfcCostScheduleImpl
