/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelAssignsTasks;
import ifc2x3tc1.IfcScheduleTimeControl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns Tasks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsTasksImpl#getTimeForTask <em>Time For Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsTasksImpl extends IfcRelAssignsToControlImpl implements IfcRelAssignsTasks {
	/**
	 * The cached value of the '{@link #getTimeForTask() <em>Time For Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeForTask()
	 * @generated
	 * @ordered
	 */
	protected IfcScheduleTimeControl timeForTask;

	/**
	 * This is true if the Time For Task reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeForTaskESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsTasksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssignsTasks();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcScheduleTimeControl getTimeForTask() {
		if (timeForTask != null && timeForTask.eIsProxy()) {
			InternalEObject oldTimeForTask = (InternalEObject)timeForTask;
			timeForTask = (IfcScheduleTimeControl)eResolveProxy(oldTimeForTask);
			if (timeForTask != oldTimeForTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK, oldTimeForTask, timeForTask));
			}
		}
		return timeForTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcScheduleTimeControl basicGetTimeForTask() {
		return timeForTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeForTask(IfcScheduleTimeControl newTimeForTask, NotificationChain msgs) {
		IfcScheduleTimeControl oldTimeForTask = timeForTask;
		timeForTask = newTimeForTask;
		boolean oldTimeForTaskESet = timeForTaskESet;
		timeForTaskESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK, oldTimeForTask, newTimeForTask, !oldTimeForTaskESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeForTask(IfcScheduleTimeControl newTimeForTask) {
		if (newTimeForTask != timeForTask) {
			NotificationChain msgs = null;
			if (timeForTask != null)
				msgs = ((InternalEObject)timeForTask).eInverseRemove(this, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED, IfcScheduleTimeControl.class, msgs);
			if (newTimeForTask != null)
				msgs = ((InternalEObject)newTimeForTask).eInverseAdd(this, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED, IfcScheduleTimeControl.class, msgs);
			msgs = basicSetTimeForTask(newTimeForTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTimeForTaskESet = timeForTaskESet;
			timeForTaskESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK, newTimeForTask, newTimeForTask, !oldTimeForTaskESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTimeForTask(NotificationChain msgs) {
		IfcScheduleTimeControl oldTimeForTask = timeForTask;
		timeForTask = null;
		boolean oldTimeForTaskESet = timeForTaskESet;
		timeForTaskESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK, oldTimeForTask, null, oldTimeForTaskESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeForTask() {
		if (timeForTask != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)timeForTask).eInverseRemove(this, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED, IfcScheduleTimeControl.class, msgs);
			msgs = basicUnsetTimeForTask(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTimeForTaskESet = timeForTaskESet;
			timeForTaskESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK, null, null, oldTimeForTaskESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeForTask() {
		return timeForTaskESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK:
				if (timeForTask != null)
					msgs = ((InternalEObject)timeForTask).eInverseRemove(this, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED, IfcScheduleTimeControl.class, msgs);
				return basicSetTimeForTask((IfcScheduleTimeControl)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK:
				return basicUnsetTimeForTask(msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK:
				if (resolve) return getTimeForTask();
				return basicGetTimeForTask();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK:
				setTimeForTask((IfcScheduleTimeControl)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK:
				unsetTimeForTask();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK:
				return isSetTimeForTask();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsTasksImpl
