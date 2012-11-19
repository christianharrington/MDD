/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ActualFinishType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ActualStartType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.EarlyFinishType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.EarlyStartType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LateFinishType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LateStartType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ScheduleFinishType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ScheduleStartType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.StatusTimeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Schedule Time Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getEarlyStart <em>Early Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getLateStart <em>Late Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getScheduleStart <em>Schedule Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getEarlyFinish <em>Early Finish</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getLateFinish <em>Late Finish</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getScheduleFinish <em>Schedule Finish</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getScheduleDuration <em>Schedule Duration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getActualDuration <em>Actual Duration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getRemainingTime <em>Remaining Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getFreeFloat <em>Free Float</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getIsCritical <em>Is Critical</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getStatusTime <em>Status Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getStartFloat <em>Start Float</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getFinishFloat <em>Finish Float</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcScheduleTimeControlImpl#getCompletion <em>Completion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcScheduleTimeControlImpl extends IfcControlImpl implements IfcScheduleTimeControl {
	/**
	 * The cached value of the '{@link #getActualStart() <em>Actual Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStart()
	 * @generated
	 * @ordered
	 */
	protected ActualStartType actualStart;

	/**
	 * The cached value of the '{@link #getEarlyStart() <em>Early Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyStart()
	 * @generated
	 * @ordered
	 */
	protected EarlyStartType earlyStart;

	/**
	 * The cached value of the '{@link #getLateStart() <em>Late Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateStart()
	 * @generated
	 * @ordered
	 */
	protected LateStartType lateStart;

	/**
	 * The cached value of the '{@link #getScheduleStart() <em>Schedule Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleStart()
	 * @generated
	 * @ordered
	 */
	protected ScheduleStartType scheduleStart;

	/**
	 * The cached value of the '{@link #getActualFinish() <em>Actual Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFinish()
	 * @generated
	 * @ordered
	 */
	protected ActualFinishType actualFinish;

	/**
	 * The cached value of the '{@link #getEarlyFinish() <em>Early Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyFinish()
	 * @generated
	 * @ordered
	 */
	protected EarlyFinishType earlyFinish;

	/**
	 * The cached value of the '{@link #getLateFinish() <em>Late Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateFinish()
	 * @generated
	 * @ordered
	 */
	protected LateFinishType lateFinish;

	/**
	 * The cached value of the '{@link #getScheduleFinish() <em>Schedule Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleFinish()
	 * @generated
	 * @ordered
	 */
	protected ScheduleFinishType scheduleFinish;

	/**
	 * The default value of the '{@link #getScheduleDuration() <em>Schedule Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCHEDULE_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleDuration() <em>Schedule Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDuration()
	 * @generated
	 * @ordered
	 */
	protected Double scheduleDuration = SCHEDULE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualDuration() <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Double ACTUAL_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualDuration() <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDuration()
	 * @generated
	 * @ordered
	 */
	protected Double actualDuration = ACTUAL_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected static final Double REMAINING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected Double remainingTime = REMAINING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreeFloat() <em>Free Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeFloat()
	 * @generated
	 * @ordered
	 */
	protected static final Double FREE_FLOAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreeFloat() <em>Free Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeFloat()
	 * @generated
	 * @ordered
	 */
	protected Double freeFloat = FREE_FLOAT_EDEFAULT;

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
	 * The default value of the '{@link #getIsCritical() <em>Is Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCritical()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CRITICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCritical() <em>Is Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCritical()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCritical = IS_CRITICAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatusTime() <em>Status Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusTime()
	 * @generated
	 * @ordered
	 */
	protected StatusTimeType statusTime;

	/**
	 * The default value of the '{@link #getStartFloat() <em>Start Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFloat()
	 * @generated
	 * @ordered
	 */
	protected static final Double START_FLOAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartFloat() <em>Start Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFloat()
	 * @generated
	 * @ordered
	 */
	protected Double startFloat = START_FLOAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinishFloat() <em>Finish Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishFloat()
	 * @generated
	 * @ordered
	 */
	protected static final Double FINISH_FLOAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinishFloat() <em>Finish Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishFloat()
	 * @generated
	 * @ordered
	 */
	protected Double finishFloat = FINISH_FLOAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final Double COMPLETION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected Double completion = COMPLETION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcScheduleTimeControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcScheduleTimeControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStartType getActualStart() {
		return actualStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualStart(ActualStartType newActualStart, NotificationChain msgs) {
		ActualStartType oldActualStart = actualStart;
		actualStart = newActualStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START, oldActualStart, newActualStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualStart(ActualStartType newActualStart) {
		if (newActualStart != actualStart) {
			NotificationChain msgs = null;
			if (actualStart != null)
				msgs = ((InternalEObject)actualStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START, null, msgs);
			if (newActualStart != null)
				msgs = ((InternalEObject)newActualStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START, null, msgs);
			msgs = basicSetActualStart(newActualStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START, newActualStart, newActualStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyStartType getEarlyStart() {
		return earlyStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEarlyStart(EarlyStartType newEarlyStart, NotificationChain msgs) {
		EarlyStartType oldEarlyStart = earlyStart;
		earlyStart = newEarlyStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_START, oldEarlyStart, newEarlyStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyStart(EarlyStartType newEarlyStart) {
		if (newEarlyStart != earlyStart) {
			NotificationChain msgs = null;
			if (earlyStart != null)
				msgs = ((InternalEObject)earlyStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_START, null, msgs);
			if (newEarlyStart != null)
				msgs = ((InternalEObject)newEarlyStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_START, null, msgs);
			msgs = basicSetEarlyStart(newEarlyStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_START, newEarlyStart, newEarlyStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LateStartType getLateStart() {
		return lateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLateStart(LateStartType newLateStart, NotificationChain msgs) {
		LateStartType oldLateStart = lateStart;
		lateStart = newLateStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_START, oldLateStart, newLateStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLateStart(LateStartType newLateStart) {
		if (newLateStart != lateStart) {
			NotificationChain msgs = null;
			if (lateStart != null)
				msgs = ((InternalEObject)lateStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_START, null, msgs);
			if (newLateStart != null)
				msgs = ((InternalEObject)newLateStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_START, null, msgs);
			msgs = basicSetLateStart(newLateStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_START, newLateStart, newLateStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleStartType getScheduleStart() {
		return scheduleStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleStart(ScheduleStartType newScheduleStart, NotificationChain msgs) {
		ScheduleStartType oldScheduleStart = scheduleStart;
		scheduleStart = newScheduleStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START, oldScheduleStart, newScheduleStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleStart(ScheduleStartType newScheduleStart) {
		if (newScheduleStart != scheduleStart) {
			NotificationChain msgs = null;
			if (scheduleStart != null)
				msgs = ((InternalEObject)scheduleStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START, null, msgs);
			if (newScheduleStart != null)
				msgs = ((InternalEObject)newScheduleStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START, null, msgs);
			msgs = basicSetScheduleStart(newScheduleStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START, newScheduleStart, newScheduleStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualFinishType getActualFinish() {
		return actualFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualFinish(ActualFinishType newActualFinish, NotificationChain msgs) {
		ActualFinishType oldActualFinish = actualFinish;
		actualFinish = newActualFinish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH, oldActualFinish, newActualFinish);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualFinish(ActualFinishType newActualFinish) {
		if (newActualFinish != actualFinish) {
			NotificationChain msgs = null;
			if (actualFinish != null)
				msgs = ((InternalEObject)actualFinish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH, null, msgs);
			if (newActualFinish != null)
				msgs = ((InternalEObject)newActualFinish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH, null, msgs);
			msgs = basicSetActualFinish(newActualFinish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH, newActualFinish, newActualFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyFinishType getEarlyFinish() {
		return earlyFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEarlyFinish(EarlyFinishType newEarlyFinish, NotificationChain msgs) {
		EarlyFinishType oldEarlyFinish = earlyFinish;
		earlyFinish = newEarlyFinish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH, oldEarlyFinish, newEarlyFinish);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyFinish(EarlyFinishType newEarlyFinish) {
		if (newEarlyFinish != earlyFinish) {
			NotificationChain msgs = null;
			if (earlyFinish != null)
				msgs = ((InternalEObject)earlyFinish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH, null, msgs);
			if (newEarlyFinish != null)
				msgs = ((InternalEObject)newEarlyFinish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH, null, msgs);
			msgs = basicSetEarlyFinish(newEarlyFinish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH, newEarlyFinish, newEarlyFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LateFinishType getLateFinish() {
		return lateFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLateFinish(LateFinishType newLateFinish, NotificationChain msgs) {
		LateFinishType oldLateFinish = lateFinish;
		lateFinish = newLateFinish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH, oldLateFinish, newLateFinish);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLateFinish(LateFinishType newLateFinish) {
		if (newLateFinish != lateFinish) {
			NotificationChain msgs = null;
			if (lateFinish != null)
				msgs = ((InternalEObject)lateFinish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH, null, msgs);
			if (newLateFinish != null)
				msgs = ((InternalEObject)newLateFinish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH, null, msgs);
			msgs = basicSetLateFinish(newLateFinish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH, newLateFinish, newLateFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleFinishType getScheduleFinish() {
		return scheduleFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleFinish(ScheduleFinishType newScheduleFinish, NotificationChain msgs) {
		ScheduleFinishType oldScheduleFinish = scheduleFinish;
		scheduleFinish = newScheduleFinish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH, oldScheduleFinish, newScheduleFinish);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleFinish(ScheduleFinishType newScheduleFinish) {
		if (newScheduleFinish != scheduleFinish) {
			NotificationChain msgs = null;
			if (scheduleFinish != null)
				msgs = ((InternalEObject)scheduleFinish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH, null, msgs);
			if (newScheduleFinish != null)
				msgs = ((InternalEObject)newScheduleFinish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH, null, msgs);
			msgs = basicSetScheduleFinish(newScheduleFinish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH, newScheduleFinish, newScheduleFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScheduleDuration() {
		return scheduleDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDuration(Double newScheduleDuration) {
		Double oldScheduleDuration = scheduleDuration;
		scheduleDuration = newScheduleDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION, oldScheduleDuration, scheduleDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getActualDuration() {
		return actualDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualDuration(Double newActualDuration) {
		Double oldActualDuration = actualDuration;
		actualDuration = newActualDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION, oldActualDuration, actualDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRemainingTime() {
		return remainingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingTime(Double newRemainingTime) {
		Double oldRemainingTime = remainingTime;
		remainingTime = newRemainingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME, oldRemainingTime, remainingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFreeFloat() {
		return freeFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeFloat(Double newFreeFloat) {
		Double oldFreeFloat = freeFloat;
		freeFloat = newFreeFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT, oldFreeFloat, freeFloat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT, oldTotalFloat, totalFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCritical() {
		return isCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCritical(Boolean newIsCritical) {
		Boolean oldIsCritical = isCritical;
		isCritical = newIsCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL, oldIsCritical, isCritical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusTimeType getStatusTime() {
		return statusTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusTime(StatusTimeType newStatusTime, NotificationChain msgs) {
		StatusTimeType oldStatusTime = statusTime;
		statusTime = newStatusTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME, oldStatusTime, newStatusTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusTime(StatusTimeType newStatusTime) {
		if (newStatusTime != statusTime) {
			NotificationChain msgs = null;
			if (statusTime != null)
				msgs = ((InternalEObject)statusTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME, null, msgs);
			if (newStatusTime != null)
				msgs = ((InternalEObject)newStatusTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME, null, msgs);
			msgs = basicSetStatusTime(newStatusTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME, newStatusTime, newStatusTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getStartFloat() {
		return startFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartFloat(Double newStartFloat) {
		Double oldStartFloat = startFloat;
		startFloat = newStartFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT, oldStartFloat, startFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFinishFloat() {
		return finishFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishFloat(Double newFinishFloat) {
		Double oldFinishFloat = finishFloat;
		finishFloat = newFinishFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT, oldFinishFloat, finishFloat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompletion() {
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(Double newCompletion) {
		Double oldCompletion = completion;
		completion = newCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SCHEDULE_TIME_CONTROL__COMPLETION, oldCompletion, completion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START:
				return basicSetActualStart(null, msgs);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_START:
				return basicSetEarlyStart(null, msgs);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_START:
				return basicSetLateStart(null, msgs);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START:
				return basicSetScheduleStart(null, msgs);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH:
				return basicSetActualFinish(null, msgs);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH:
				return basicSetEarlyFinish(null, msgs);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH:
				return basicSetLateFinish(null, msgs);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH:
				return basicSetScheduleFinish(null, msgs);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME:
				return basicSetStatusTime(null, msgs);
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
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START:
				return getActualStart();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_START:
				return getEarlyStart();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_START:
				return getLateStart();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START:
				return getScheduleStart();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH:
				return getActualFinish();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH:
				return getEarlyFinish();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH:
				return getLateFinish();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH:
				return getScheduleFinish();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION:
				return getScheduleDuration();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION:
				return getActualDuration();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME:
				return getRemainingTime();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT:
				return getFreeFloat();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT:
				return getTotalFloat();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL:
				return getIsCritical();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME:
				return getStatusTime();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT:
				return getStartFloat();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT:
				return getFinishFloat();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__COMPLETION:
				return getCompletion();
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
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START:
				setActualStart((ActualStartType)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_START:
				setEarlyStart((EarlyStartType)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_START:
				setLateStart((LateStartType)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START:
				setScheduleStart((ScheduleStartType)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH:
				setActualFinish((ActualFinishType)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH:
				setEarlyFinish((EarlyFinishType)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH:
				setLateFinish((LateFinishType)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH:
				setScheduleFinish((ScheduleFinishType)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION:
				setScheduleDuration((Double)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION:
				setActualDuration((Double)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME:
				setRemainingTime((Double)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT:
				setFreeFloat((Double)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT:
				setTotalFloat((Double)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL:
				setIsCritical((Boolean)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME:
				setStatusTime((StatusTimeType)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT:
				setStartFloat((Double)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT:
				setFinishFloat((Double)newValue);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__COMPLETION:
				setCompletion((Double)newValue);
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
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START:
				setActualStart((ActualStartType)null);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_START:
				setEarlyStart((EarlyStartType)null);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_START:
				setLateStart((LateStartType)null);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START:
				setScheduleStart((ScheduleStartType)null);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH:
				setActualFinish((ActualFinishType)null);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH:
				setEarlyFinish((EarlyFinishType)null);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH:
				setLateFinish((LateFinishType)null);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH:
				setScheduleFinish((ScheduleFinishType)null);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION:
				setScheduleDuration(SCHEDULE_DURATION_EDEFAULT);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION:
				setActualDuration(ACTUAL_DURATION_EDEFAULT);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME:
				setRemainingTime(REMAINING_TIME_EDEFAULT);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT:
				setFreeFloat(FREE_FLOAT_EDEFAULT);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT:
				setTotalFloat(TOTAL_FLOAT_EDEFAULT);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL:
				setIsCritical(IS_CRITICAL_EDEFAULT);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME:
				setStatusTime((StatusTimeType)null);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT:
				setStartFloat(START_FLOAT_EDEFAULT);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT:
				setFinishFloat(FINISH_FLOAT_EDEFAULT);
				return;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__COMPLETION:
				setCompletion(COMPLETION_EDEFAULT);
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
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START:
				return actualStart != null;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_START:
				return earlyStart != null;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_START:
				return lateStart != null;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START:
				return scheduleStart != null;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH:
				return actualFinish != null;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH:
				return earlyFinish != null;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH:
				return lateFinish != null;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH:
				return scheduleFinish != null;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION:
				return SCHEDULE_DURATION_EDEFAULT == null ? scheduleDuration != null : !SCHEDULE_DURATION_EDEFAULT.equals(scheduleDuration);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION:
				return ACTUAL_DURATION_EDEFAULT == null ? actualDuration != null : !ACTUAL_DURATION_EDEFAULT.equals(actualDuration);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME:
				return REMAINING_TIME_EDEFAULT == null ? remainingTime != null : !REMAINING_TIME_EDEFAULT.equals(remainingTime);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT:
				return FREE_FLOAT_EDEFAULT == null ? freeFloat != null : !FREE_FLOAT_EDEFAULT.equals(freeFloat);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT:
				return TOTAL_FLOAT_EDEFAULT == null ? totalFloat != null : !TOTAL_FLOAT_EDEFAULT.equals(totalFloat);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL:
				return IS_CRITICAL_EDEFAULT == null ? isCritical != null : !IS_CRITICAL_EDEFAULT.equals(isCritical);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME:
				return statusTime != null;
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT:
				return START_FLOAT_EDEFAULT == null ? startFloat != null : !START_FLOAT_EDEFAULT.equals(startFloat);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT:
				return FINISH_FLOAT_EDEFAULT == null ? finishFloat != null : !FINISH_FLOAT_EDEFAULT.equals(finishFloat);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL__COMPLETION:
				return COMPLETION_EDEFAULT == null ? completion != null : !COMPLETION_EDEFAULT.equals(completion);
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
		result.append(" (scheduleDuration: ");
		result.append(scheduleDuration);
		result.append(", actualDuration: ");
		result.append(actualDuration);
		result.append(", remainingTime: ");
		result.append(remainingTime);
		result.append(", freeFloat: ");
		result.append(freeFloat);
		result.append(", totalFloat: ");
		result.append(totalFloat);
		result.append(", isCritical: ");
		result.append(isCritical);
		result.append(", startFloat: ");
		result.append(startFloat);
		result.append(", finishFloat: ");
		result.append(finishFloat);
		result.append(", completion: ");
		result.append(completion);
		result.append(')');
		return result.toString();
	}

} //IfcScheduleTimeControlImpl
