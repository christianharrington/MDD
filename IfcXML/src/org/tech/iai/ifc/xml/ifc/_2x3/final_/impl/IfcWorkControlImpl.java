/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CreationDateType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.CreatorsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinishTimeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWorkControl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWorkControlTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.StartTimeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Work Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getCreators <em>Creators</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getWorkControlType <em>Work Control Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWorkControlImpl#getUserDefinedControlType <em>User Defined Control Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcWorkControlImpl extends IfcControlImpl implements IfcWorkControl {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected CreationDateType creationDate;

	/**
	 * The cached value of the '{@link #getCreators() <em>Creators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreators()
	 * @generated
	 * @ordered
	 */
	protected CreatorsType creators;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Double DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Double duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalFloat() <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloat()
	 * @generated
	 * @ordered
	 */
	protected static final Double TOTAL_FLOAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalFloat() <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloat()
	 * @generated
	 * @ordered
	 */
	protected Double totalFloat = TOTAL_FLOAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected StartTimeType startTime;

	/**
	 * The cached value of the '{@link #getFinishTime() <em>Finish Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishTime()
	 * @generated
	 * @ordered
	 */
	protected FinishTimeType finishTime;

	/**
	 * The default value of the '{@link #getWorkControlType() <em>Work Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkControlType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcWorkControlTypeEnum WORK_CONTROL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkControlType() <em>Work Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkControlType()
	 * @generated
	 * @ordered
	 */
	protected IfcWorkControlTypeEnum workControlType = WORK_CONTROL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedControlType() <em>User Defined Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedControlType()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_CONTROL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedControlType() <em>User Defined Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedControlType()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedControlType = USER_DEFINED_CONTROL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWorkControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcWorkControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationDateType getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationDate(CreationDateType newCreationDate, NotificationChain msgs) {
		CreationDateType oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__CREATION_DATE, oldCreationDate, newCreationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(CreationDateType newCreationDate) {
		if (newCreationDate != creationDate) {
			NotificationChain msgs = null;
			if (creationDate != null)
				msgs = ((InternalEObject)creationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WORK_CONTROL__CREATION_DATE, null, msgs);
			if (newCreationDate != null)
				msgs = ((InternalEObject)newCreationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WORK_CONTROL__CREATION_DATE, null, msgs);
			msgs = basicSetCreationDate(newCreationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__CREATION_DATE, newCreationDate, newCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatorsType getCreators() {
		return creators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreators(CreatorsType newCreators, NotificationChain msgs) {
		CreatorsType oldCreators = creators;
		creators = newCreators;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__CREATORS, oldCreators, newCreators);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreators(CreatorsType newCreators) {
		if (newCreators != creators) {
			NotificationChain msgs = null;
			if (creators != null)
				msgs = ((InternalEObject)creators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WORK_CONTROL__CREATORS, null, msgs);
			if (newCreators != null)
				msgs = ((InternalEObject)newCreators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WORK_CONTROL__CREATORS, null, msgs);
			msgs = basicSetCreators(newCreators, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__CREATORS, newCreators, newCreators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Double newDuration) {
		Double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTotalFloat() {
		return totalFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalFloat(Double newTotalFloat) {
		Double oldTotalFloat = totalFloat;
		totalFloat = newTotalFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__TOTAL_FLOAT, oldTotalFloat, totalFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimeType getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartTime(StartTimeType newStartTime, NotificationChain msgs) {
		StartTimeType oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__START_TIME, oldStartTime, newStartTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(StartTimeType newStartTime) {
		if (newStartTime != startTime) {
			NotificationChain msgs = null;
			if (startTime != null)
				msgs = ((InternalEObject)startTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WORK_CONTROL__START_TIME, null, msgs);
			if (newStartTime != null)
				msgs = ((InternalEObject)newStartTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WORK_CONTROL__START_TIME, null, msgs);
			msgs = basicSetStartTime(newStartTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__START_TIME, newStartTime, newStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishTimeType getFinishTime() {
		return finishTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinishTime(FinishTimeType newFinishTime, NotificationChain msgs) {
		FinishTimeType oldFinishTime = finishTime;
		finishTime = newFinishTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__FINISH_TIME, oldFinishTime, newFinishTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishTime(FinishTimeType newFinishTime) {
		if (newFinishTime != finishTime) {
			NotificationChain msgs = null;
			if (finishTime != null)
				msgs = ((InternalEObject)finishTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WORK_CONTROL__FINISH_TIME, null, msgs);
			if (newFinishTime != null)
				msgs = ((InternalEObject)newFinishTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_WORK_CONTROL__FINISH_TIME, null, msgs);
			msgs = basicSetFinishTime(newFinishTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__FINISH_TIME, newFinishTime, newFinishTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWorkControlTypeEnum getWorkControlType() {
		return workControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkControlType(IfcWorkControlTypeEnum newWorkControlType) {
		IfcWorkControlTypeEnum oldWorkControlType = workControlType;
		workControlType = newWorkControlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__WORK_CONTROL_TYPE, oldWorkControlType, workControlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedControlType() {
		return userDefinedControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedControlType(String newUserDefinedControlType) {
		String oldUserDefinedControlType = userDefinedControlType;
		userDefinedControlType = newUserDefinedControlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE, oldUserDefinedControlType, userDefinedControlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_WORK_CONTROL__CREATION_DATE:
				return basicSetCreationDate(null, msgs);
			case FinalPackage.IFC_WORK_CONTROL__CREATORS:
				return basicSetCreators(null, msgs);
			case FinalPackage.IFC_WORK_CONTROL__START_TIME:
				return basicSetStartTime(null, msgs);
			case FinalPackage.IFC_WORK_CONTROL__FINISH_TIME:
				return basicSetFinishTime(null, msgs);
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
			case FinalPackage.IFC_WORK_CONTROL__IDENTIFIER:
				return getIdentifier();
			case FinalPackage.IFC_WORK_CONTROL__CREATION_DATE:
				return getCreationDate();
			case FinalPackage.IFC_WORK_CONTROL__CREATORS:
				return getCreators();
			case FinalPackage.IFC_WORK_CONTROL__PURPOSE:
				return getPurpose();
			case FinalPackage.IFC_WORK_CONTROL__DURATION:
				return getDuration();
			case FinalPackage.IFC_WORK_CONTROL__TOTAL_FLOAT:
				return getTotalFloat();
			case FinalPackage.IFC_WORK_CONTROL__START_TIME:
				return getStartTime();
			case FinalPackage.IFC_WORK_CONTROL__FINISH_TIME:
				return getFinishTime();
			case FinalPackage.IFC_WORK_CONTROL__WORK_CONTROL_TYPE:
				return getWorkControlType();
			case FinalPackage.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE:
				return getUserDefinedControlType();
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
			case FinalPackage.IFC_WORK_CONTROL__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case FinalPackage.IFC_WORK_CONTROL__CREATION_DATE:
				setCreationDate((CreationDateType)newValue);
				return;
			case FinalPackage.IFC_WORK_CONTROL__CREATORS:
				setCreators((CreatorsType)newValue);
				return;
			case FinalPackage.IFC_WORK_CONTROL__PURPOSE:
				setPurpose((String)newValue);
				return;
			case FinalPackage.IFC_WORK_CONTROL__DURATION:
				setDuration((Double)newValue);
				return;
			case FinalPackage.IFC_WORK_CONTROL__TOTAL_FLOAT:
				setTotalFloat((Double)newValue);
				return;
			case FinalPackage.IFC_WORK_CONTROL__START_TIME:
				setStartTime((StartTimeType)newValue);
				return;
			case FinalPackage.IFC_WORK_CONTROL__FINISH_TIME:
				setFinishTime((FinishTimeType)newValue);
				return;
			case FinalPackage.IFC_WORK_CONTROL__WORK_CONTROL_TYPE:
				setWorkControlType((IfcWorkControlTypeEnum)newValue);
				return;
			case FinalPackage.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE:
				setUserDefinedControlType((String)newValue);
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
			case FinalPackage.IFC_WORK_CONTROL__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case FinalPackage.IFC_WORK_CONTROL__CREATION_DATE:
				setCreationDate((CreationDateType)null);
				return;
			case FinalPackage.IFC_WORK_CONTROL__CREATORS:
				setCreators((CreatorsType)null);
				return;
			case FinalPackage.IFC_WORK_CONTROL__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case FinalPackage.IFC_WORK_CONTROL__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case FinalPackage.IFC_WORK_CONTROL__TOTAL_FLOAT:
				setTotalFloat(TOTAL_FLOAT_EDEFAULT);
				return;
			case FinalPackage.IFC_WORK_CONTROL__START_TIME:
				setStartTime((StartTimeType)null);
				return;
			case FinalPackage.IFC_WORK_CONTROL__FINISH_TIME:
				setFinishTime((FinishTimeType)null);
				return;
			case FinalPackage.IFC_WORK_CONTROL__WORK_CONTROL_TYPE:
				setWorkControlType(WORK_CONTROL_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE:
				setUserDefinedControlType(USER_DEFINED_CONTROL_TYPE_EDEFAULT);
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
			case FinalPackage.IFC_WORK_CONTROL__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case FinalPackage.IFC_WORK_CONTROL__CREATION_DATE:
				return creationDate != null;
			case FinalPackage.IFC_WORK_CONTROL__CREATORS:
				return creators != null;
			case FinalPackage.IFC_WORK_CONTROL__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case FinalPackage.IFC_WORK_CONTROL__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case FinalPackage.IFC_WORK_CONTROL__TOTAL_FLOAT:
				return TOTAL_FLOAT_EDEFAULT == null ? totalFloat != null : !TOTAL_FLOAT_EDEFAULT.equals(totalFloat);
			case FinalPackage.IFC_WORK_CONTROL__START_TIME:
				return startTime != null;
			case FinalPackage.IFC_WORK_CONTROL__FINISH_TIME:
				return finishTime != null;
			case FinalPackage.IFC_WORK_CONTROL__WORK_CONTROL_TYPE:
				return WORK_CONTROL_TYPE_EDEFAULT == null ? workControlType != null : !WORK_CONTROL_TYPE_EDEFAULT.equals(workControlType);
			case FinalPackage.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE:
				return USER_DEFINED_CONTROL_TYPE_EDEFAULT == null ? userDefinedControlType != null : !USER_DEFINED_CONTROL_TYPE_EDEFAULT.equals(userDefinedControlType);
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", duration: ");
		result.append(duration);
		result.append(", totalFloat: ");
		result.append(totalFloat);
		result.append(", workControlType: ");
		result.append(workControlType);
		result.append(", userDefinedControlType: ");
		result.append(userDefinedControlType);
		result.append(')');
		return result.toString();
	}

} //IfcWorkControlImpl
