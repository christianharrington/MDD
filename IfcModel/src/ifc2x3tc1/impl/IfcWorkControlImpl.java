/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDateTimeSelect;
import ifc2x3tc1.IfcPerson;
import ifc2x3tc1.IfcWorkControl;
import ifc2x3tc1.IfcWorkControlTypeEnum;

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
 * An implementation of the model object '<em><b>Ifc Work Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getCreators <em>Creators</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getDurationAsString <em>Duration As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getTotalFloatAsString <em>Total Float As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getWorkControlType <em>Work Control Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWorkControlImpl#getUserDefinedControlType <em>User Defined Control Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcWorkControlImpl extends IfcControlImpl implements IfcWorkControl {
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
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect creationDate;

	/**
	 * The cached value of the '{@link #getCreators() <em>Creators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreators()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcPerson> creators;

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
	 * This is true if the Purpose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean purposeESet;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * This is true if the Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationESet;

	/**
	 * The default value of the '{@link #getDurationAsString() <em>Duration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDurationAsString() <em>Duration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationAsString()
	 * @generated
	 * @ordered
	 */
	protected String durationAsString = DURATION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Duration As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationAsStringESet;

	/**
	 * The default value of the '{@link #getTotalFloat() <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloat()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_FLOAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalFloat() <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloat()
	 * @generated
	 * @ordered
	 */
	protected double totalFloat = TOTAL_FLOAT_EDEFAULT;

	/**
	 * This is true if the Total Float attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalFloatESet;

	/**
	 * The default value of the '{@link #getTotalFloatAsString() <em>Total Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_FLOAT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalFloatAsString() <em>Total Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected String totalFloatAsString = TOTAL_FLOAT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Total Float As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalFloatAsStringESet;

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
	 * The cached value of the '{@link #getFinishTime() <em>Finish Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect finishTime;

	/**
	 * This is true if the Finish Time reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finishTimeESet;

	/**
	 * The default value of the '{@link #getWorkControlType() <em>Work Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkControlType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcWorkControlTypeEnum WORK_CONTROL_TYPE_EDEFAULT = IfcWorkControlTypeEnum.NULL;

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
	 * This is true if the Work Control Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workControlTypeESet;

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
	 * This is true if the User Defined Control Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedControlTypeESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcWorkControl();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getCreationDate() {
		if (creationDate != null && creationDate.eIsProxy()) {
			InternalEObject oldCreationDate = (InternalEObject)creationDate;
			creationDate = (IfcDateTimeSelect)eResolveProxy(oldCreationDate);
			if (creationDate != oldCreationDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATION_DATE, oldCreationDate, creationDate));
			}
		}
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(IfcDateTimeSelect newCreationDate) {
		IfcDateTimeSelect oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPerson> getCreators() {
		if (creators == null) {
			creators = new EObjectResolvingEList.Unsettable<IfcPerson>(IfcPerson.class, this, Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATORS);
		}
		return creators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreators() {
		if (creators != null) ((InternalEList.Unsettable<?>)creators).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreators() {
		return creators != null && ((InternalEList.Unsettable<?>)creators).isSet();
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
		boolean oldPurposeESet = purposeESet;
		purposeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__PURPOSE, oldPurpose, purpose, !oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPurpose() {
		String oldPurpose = purpose;
		boolean oldPurposeESet = purposeESet;
		purpose = PURPOSE_EDEFAULT;
		purposeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WORK_CONTROL__PURPOSE, oldPurpose, PURPOSE_EDEFAULT, oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPurpose() {
		return purposeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		boolean oldDurationESet = durationESet;
		durationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION, oldDuration, duration, !oldDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDuration() {
		double oldDuration = duration;
		boolean oldDurationESet = durationESet;
		duration = DURATION_EDEFAULT;
		durationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION, oldDuration, DURATION_EDEFAULT, oldDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDuration() {
		return durationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDurationAsString() {
		return durationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationAsString(String newDurationAsString) {
		String oldDurationAsString = durationAsString;
		durationAsString = newDurationAsString;
		boolean oldDurationAsStringESet = durationAsStringESet;
		durationAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION_AS_STRING, oldDurationAsString, durationAsString, !oldDurationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDurationAsString() {
		String oldDurationAsString = durationAsString;
		boolean oldDurationAsStringESet = durationAsStringESet;
		durationAsString = DURATION_AS_STRING_EDEFAULT;
		durationAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION_AS_STRING, oldDurationAsString, DURATION_AS_STRING_EDEFAULT, oldDurationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDurationAsString() {
		return durationAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalFloat() {
		return totalFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalFloat(double newTotalFloat) {
		double oldTotalFloat = totalFloat;
		totalFloat = newTotalFloat;
		boolean oldTotalFloatESet = totalFloatESet;
		totalFloatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT, oldTotalFloat, totalFloat, !oldTotalFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalFloat() {
		double oldTotalFloat = totalFloat;
		boolean oldTotalFloatESet = totalFloatESet;
		totalFloat = TOTAL_FLOAT_EDEFAULT;
		totalFloatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT, oldTotalFloat, TOTAL_FLOAT_EDEFAULT, oldTotalFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalFloat() {
		return totalFloatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalFloatAsString() {
		return totalFloatAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalFloatAsString(String newTotalFloatAsString) {
		String oldTotalFloatAsString = totalFloatAsString;
		totalFloatAsString = newTotalFloatAsString;
		boolean oldTotalFloatAsStringESet = totalFloatAsStringESet;
		totalFloatAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT_AS_STRING, oldTotalFloatAsString, totalFloatAsString, !oldTotalFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalFloatAsString() {
		String oldTotalFloatAsString = totalFloatAsString;
		boolean oldTotalFloatAsStringESet = totalFloatAsStringESet;
		totalFloatAsString = TOTAL_FLOAT_AS_STRING_EDEFAULT;
		totalFloatAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT_AS_STRING, oldTotalFloatAsString, TOTAL_FLOAT_AS_STRING_EDEFAULT, oldTotalFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalFloatAsString() {
		return totalFloatAsStringESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_WORK_CONTROL__START_TIME, oldStartTime, startTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getFinishTime() {
		if (finishTime != null && finishTime.eIsProxy()) {
			InternalEObject oldFinishTime = (InternalEObject)finishTime;
			finishTime = (IfcDateTimeSelect)eResolveProxy(oldFinishTime);
			if (finishTime != oldFinishTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_WORK_CONTROL__FINISH_TIME, oldFinishTime, finishTime));
			}
		}
		return finishTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetFinishTime() {
		return finishTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishTime(IfcDateTimeSelect newFinishTime) {
		IfcDateTimeSelect oldFinishTime = finishTime;
		finishTime = newFinishTime;
		boolean oldFinishTimeESet = finishTimeESet;
		finishTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__FINISH_TIME, oldFinishTime, finishTime, !oldFinishTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFinishTime() {
		IfcDateTimeSelect oldFinishTime = finishTime;
		boolean oldFinishTimeESet = finishTimeESet;
		finishTime = null;
		finishTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WORK_CONTROL__FINISH_TIME, oldFinishTime, null, oldFinishTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFinishTime() {
		return finishTimeESet;
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
		workControlType = newWorkControlType == null ? WORK_CONTROL_TYPE_EDEFAULT : newWorkControlType;
		boolean oldWorkControlTypeESet = workControlTypeESet;
		workControlTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__WORK_CONTROL_TYPE, oldWorkControlType, workControlType, !oldWorkControlTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkControlType() {
		IfcWorkControlTypeEnum oldWorkControlType = workControlType;
		boolean oldWorkControlTypeESet = workControlTypeESet;
		workControlType = WORK_CONTROL_TYPE_EDEFAULT;
		workControlTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WORK_CONTROL__WORK_CONTROL_TYPE, oldWorkControlType, WORK_CONTROL_TYPE_EDEFAULT, oldWorkControlTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkControlType() {
		return workControlTypeESet;
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
		boolean oldUserDefinedControlTypeESet = userDefinedControlTypeESet;
		userDefinedControlTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE, oldUserDefinedControlType, userDefinedControlType, !oldUserDefinedControlTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedControlType() {
		String oldUserDefinedControlType = userDefinedControlType;
		boolean oldUserDefinedControlTypeESet = userDefinedControlTypeESet;
		userDefinedControlType = USER_DEFINED_CONTROL_TYPE_EDEFAULT;
		userDefinedControlTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE, oldUserDefinedControlType, USER_DEFINED_CONTROL_TYPE_EDEFAULT, oldUserDefinedControlTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedControlType() {
		return userDefinedControlTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__IDENTIFIER:
				return getIdentifier();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATION_DATE:
				if (resolve) return getCreationDate();
				return basicGetCreationDate();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATORS:
				return getCreators();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__PURPOSE:
				return getPurpose();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION:
				return getDuration();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION_AS_STRING:
				return getDurationAsString();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT:
				return getTotalFloat();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT_AS_STRING:
				return getTotalFloatAsString();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__START_TIME:
				if (resolve) return getStartTime();
				return basicGetStartTime();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__FINISH_TIME:
				if (resolve) return getFinishTime();
				return basicGetFinishTime();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__WORK_CONTROL_TYPE:
				return getWorkControlType();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE:
				return getUserDefinedControlType();
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
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATION_DATE:
				setCreationDate((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATORS:
				getCreators().clear();
				getCreators().addAll((Collection<? extends IfcPerson>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__PURPOSE:
				setPurpose((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION:
				setDuration((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION_AS_STRING:
				setDurationAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT:
				setTotalFloat((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT_AS_STRING:
				setTotalFloatAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__START_TIME:
				setStartTime((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__FINISH_TIME:
				setFinishTime((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__WORK_CONTROL_TYPE:
				setWorkControlType((IfcWorkControlTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE:
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
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATION_DATE:
				setCreationDate((IfcDateTimeSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATORS:
				unsetCreators();
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__PURPOSE:
				unsetPurpose();
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION:
				unsetDuration();
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION_AS_STRING:
				unsetDurationAsString();
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT:
				unsetTotalFloat();
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT_AS_STRING:
				unsetTotalFloatAsString();
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__START_TIME:
				setStartTime((IfcDateTimeSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__FINISH_TIME:
				unsetFinishTime();
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__WORK_CONTROL_TYPE:
				unsetWorkControlType();
				return;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE:
				unsetUserDefinedControlType();
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
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATION_DATE:
				return creationDate != null;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__CREATORS:
				return isSetCreators();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__PURPOSE:
				return isSetPurpose();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION:
				return isSetDuration();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__DURATION_AS_STRING:
				return isSetDurationAsString();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT:
				return isSetTotalFloat();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__TOTAL_FLOAT_AS_STRING:
				return isSetTotalFloatAsString();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__START_TIME:
				return startTime != null;
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__FINISH_TIME:
				return isSetFinishTime();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__WORK_CONTROL_TYPE:
				return isSetWorkControlType();
			case Ifc2x3tc1Package.IFC_WORK_CONTROL__USER_DEFINED_CONTROL_TYPE:
				return isSetUserDefinedControlType();
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
		result.append(" (Identifier: ");
		result.append(identifier);
		result.append(", Purpose: ");
		if (purposeESet) result.append(purpose); else result.append("<unset>");
		result.append(", Duration: ");
		if (durationESet) result.append(duration); else result.append("<unset>");
		result.append(", DurationAsString: ");
		if (durationAsStringESet) result.append(durationAsString); else result.append("<unset>");
		result.append(", TotalFloat: ");
		if (totalFloatESet) result.append(totalFloat); else result.append("<unset>");
		result.append(", TotalFloatAsString: ");
		if (totalFloatAsStringESet) result.append(totalFloatAsString); else result.append("<unset>");
		result.append(", WorkControlType: ");
		if (workControlTypeESet) result.append(workControlType); else result.append("<unset>");
		result.append(", UserDefinedControlType: ");
		if (userDefinedControlTypeESet) result.append(userDefinedControlType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcWorkControlImpl
