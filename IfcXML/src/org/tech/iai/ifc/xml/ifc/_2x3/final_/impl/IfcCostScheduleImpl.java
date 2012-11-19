/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostScheduleTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PreparedByType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SubmittedByType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SubmittedOnType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TargetUsersType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UpdateDateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cost Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCostScheduleImpl#getSubmittedBy <em>Submitted By</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCostScheduleImpl#getPreparedBy <em>Prepared By</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCostScheduleImpl#getSubmittedOn <em>Submitted On</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCostScheduleImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCostScheduleImpl#getTargetUsers <em>Target Users</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCostScheduleImpl#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCostScheduleImpl#getID1 <em>ID1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCostScheduleImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCostScheduleImpl extends IfcControlImpl implements IfcCostSchedule {
	/**
	 * The cached value of the '{@link #getSubmittedBy() <em>Submitted By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedBy()
	 * @generated
	 * @ordered
	 */
	protected SubmittedByType submittedBy;

	/**
	 * The cached value of the '{@link #getPreparedBy() <em>Prepared By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparedBy()
	 * @generated
	 * @ordered
	 */
	protected PreparedByType preparedBy;

	/**
	 * The cached value of the '{@link #getSubmittedOn() <em>Submitted On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedOn()
	 * @generated
	 * @ordered
	 */
	protected SubmittedOnType submittedOn;

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
	 * The cached value of the '{@link #getTargetUsers() <em>Target Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUsers()
	 * @generated
	 * @ordered
	 */
	protected TargetUsersType targetUsers;

	/**
	 * The cached value of the '{@link #getUpdateDate() <em>Update Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected UpdateDateType updateDate;

	/**
	 * The default value of the '{@link #getID1() <em>ID1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID1()
	 * @generated
	 * @ordered
	 */
	protected static final String ID1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID1() <em>ID1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID1()
	 * @generated
	 * @ordered
	 */
	protected String iD1 = ID1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcCostScheduleTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcCostScheduleTypeEnum.BUDGET;

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
		return FinalPackage.eINSTANCE.getIfcCostSchedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmittedByType getSubmittedBy() {
		return submittedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmittedBy(SubmittedByType newSubmittedBy, NotificationChain msgs) {
		SubmittedByType oldSubmittedBy = submittedBy;
		submittedBy = newSubmittedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_BY, oldSubmittedBy, newSubmittedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmittedBy(SubmittedByType newSubmittedBy) {
		if (newSubmittedBy != submittedBy) {
			NotificationChain msgs = null;
			if (submittedBy != null)
				msgs = ((InternalEObject)submittedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_BY, null, msgs);
			if (newSubmittedBy != null)
				msgs = ((InternalEObject)newSubmittedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_BY, null, msgs);
			msgs = basicSetSubmittedBy(newSubmittedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_BY, newSubmittedBy, newSubmittedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreparedByType getPreparedBy() {
		return preparedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreparedBy(PreparedByType newPreparedBy, NotificationChain msgs) {
		PreparedByType oldPreparedBy = preparedBy;
		preparedBy = newPreparedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__PREPARED_BY, oldPreparedBy, newPreparedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreparedBy(PreparedByType newPreparedBy) {
		if (newPreparedBy != preparedBy) {
			NotificationChain msgs = null;
			if (preparedBy != null)
				msgs = ((InternalEObject)preparedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__PREPARED_BY, null, msgs);
			if (newPreparedBy != null)
				msgs = ((InternalEObject)newPreparedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__PREPARED_BY, null, msgs);
			msgs = basicSetPreparedBy(newPreparedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__PREPARED_BY, newPreparedBy, newPreparedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmittedOnType getSubmittedOn() {
		return submittedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmittedOn(SubmittedOnType newSubmittedOn, NotificationChain msgs) {
		SubmittedOnType oldSubmittedOn = submittedOn;
		submittedOn = newSubmittedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_ON, oldSubmittedOn, newSubmittedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmittedOn(SubmittedOnType newSubmittedOn) {
		if (newSubmittedOn != submittedOn) {
			NotificationChain msgs = null;
			if (submittedOn != null)
				msgs = ((InternalEObject)submittedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_ON, null, msgs);
			if (newSubmittedOn != null)
				msgs = ((InternalEObject)newSubmittedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_ON, null, msgs);
			msgs = basicSetSubmittedOn(newSubmittedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_ON, newSubmittedOn, newSubmittedOn));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetUsersType getTargetUsers() {
		return targetUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetUsers(TargetUsersType newTargetUsers, NotificationChain msgs) {
		TargetUsersType oldTargetUsers = targetUsers;
		targetUsers = newTargetUsers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__TARGET_USERS, oldTargetUsers, newTargetUsers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUsers(TargetUsersType newTargetUsers) {
		if (newTargetUsers != targetUsers) {
			NotificationChain msgs = null;
			if (targetUsers != null)
				msgs = ((InternalEObject)targetUsers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__TARGET_USERS, null, msgs);
			if (newTargetUsers != null)
				msgs = ((InternalEObject)newTargetUsers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__TARGET_USERS, null, msgs);
			msgs = basicSetTargetUsers(newTargetUsers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__TARGET_USERS, newTargetUsers, newTargetUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateDateType getUpdateDate() {
		return updateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateDate(UpdateDateType newUpdateDate, NotificationChain msgs) {
		UpdateDateType oldUpdateDate = updateDate;
		updateDate = newUpdateDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__UPDATE_DATE, oldUpdateDate, newUpdateDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateDate(UpdateDateType newUpdateDate) {
		if (newUpdateDate != updateDate) {
			NotificationChain msgs = null;
			if (updateDate != null)
				msgs = ((InternalEObject)updateDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__UPDATE_DATE, null, msgs);
			if (newUpdateDate != null)
				msgs = ((InternalEObject)newUpdateDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_COST_SCHEDULE__UPDATE_DATE, null, msgs);
			msgs = basicSetUpdateDate(newUpdateDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__UPDATE_DATE, newUpdateDate, newUpdateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID1() {
		return iD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID1(String newID1) {
		String oldID1 = iD1;
		iD1 = newID1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__ID1, oldID1, iD1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COST_SCHEDULE__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_BY:
				return basicSetSubmittedBy(null, msgs);
			case FinalPackage.IFC_COST_SCHEDULE__PREPARED_BY:
				return basicSetPreparedBy(null, msgs);
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_ON:
				return basicSetSubmittedOn(null, msgs);
			case FinalPackage.IFC_COST_SCHEDULE__TARGET_USERS:
				return basicSetTargetUsers(null, msgs);
			case FinalPackage.IFC_COST_SCHEDULE__UPDATE_DATE:
				return basicSetUpdateDate(null, msgs);
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
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_BY:
				return getSubmittedBy();
			case FinalPackage.IFC_COST_SCHEDULE__PREPARED_BY:
				return getPreparedBy();
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_ON:
				return getSubmittedOn();
			case FinalPackage.IFC_COST_SCHEDULE__STATUS:
				return getStatus();
			case FinalPackage.IFC_COST_SCHEDULE__TARGET_USERS:
				return getTargetUsers();
			case FinalPackage.IFC_COST_SCHEDULE__UPDATE_DATE:
				return getUpdateDate();
			case FinalPackage.IFC_COST_SCHEDULE__ID1:
				return getID1();
			case FinalPackage.IFC_COST_SCHEDULE__PREDEFINED_TYPE:
				return getPredefinedType();
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
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_BY:
				setSubmittedBy((SubmittedByType)newValue);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__PREPARED_BY:
				setPreparedBy((PreparedByType)newValue);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_ON:
				setSubmittedOn((SubmittedOnType)newValue);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__STATUS:
				setStatus((String)newValue);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__TARGET_USERS:
				setTargetUsers((TargetUsersType)newValue);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__UPDATE_DATE:
				setUpdateDate((UpdateDateType)newValue);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__ID1:
				setID1((String)newValue);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__PREDEFINED_TYPE:
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
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_BY:
				setSubmittedBy((SubmittedByType)null);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__PREPARED_BY:
				setPreparedBy((PreparedByType)null);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_ON:
				setSubmittedOn((SubmittedOnType)null);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__TARGET_USERS:
				setTargetUsers((TargetUsersType)null);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__UPDATE_DATE:
				setUpdateDate((UpdateDateType)null);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__ID1:
				setID1(ID1_EDEFAULT);
				return;
			case FinalPackage.IFC_COST_SCHEDULE__PREDEFINED_TYPE:
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
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_BY:
				return submittedBy != null;
			case FinalPackage.IFC_COST_SCHEDULE__PREPARED_BY:
				return preparedBy != null;
			case FinalPackage.IFC_COST_SCHEDULE__SUBMITTED_ON:
				return submittedOn != null;
			case FinalPackage.IFC_COST_SCHEDULE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case FinalPackage.IFC_COST_SCHEDULE__TARGET_USERS:
				return targetUsers != null;
			case FinalPackage.IFC_COST_SCHEDULE__UPDATE_DATE:
				return updateDate != null;
			case FinalPackage.IFC_COST_SCHEDULE__ID1:
				return ID1_EDEFAULT == null ? iD1 != null : !ID1_EDEFAULT.equals(iD1);
			case FinalPackage.IFC_COST_SCHEDULE__PREDEFINED_TYPE:
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
		result.append(" (status: ");
		result.append(status);
		result.append(", iD1: ");
		result.append(iD1);
		result.append(", predefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //IfcCostScheduleImpl
