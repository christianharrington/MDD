/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TimeForTaskType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time For Task Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TimeForTaskTypeImpl#getIfcScheduleTimeControl <em>Ifc Schedule Time Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeForTaskTypeImpl extends EObjectImpl implements TimeForTaskType {
	/**
	 * The cached value of the '{@link #getIfcScheduleTimeControl() <em>Ifc Schedule Time Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcScheduleTimeControl()
	 * @generated
	 * @ordered
	 */
	protected IfcScheduleTimeControl ifcScheduleTimeControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeForTaskTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getTimeForTaskType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcScheduleTimeControl getIfcScheduleTimeControl() {
		return ifcScheduleTimeControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcScheduleTimeControl(IfcScheduleTimeControl newIfcScheduleTimeControl, NotificationChain msgs) {
		IfcScheduleTimeControl oldIfcScheduleTimeControl = ifcScheduleTimeControl;
		ifcScheduleTimeControl = newIfcScheduleTimeControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.TIME_FOR_TASK_TYPE__IFC_SCHEDULE_TIME_CONTROL, oldIfcScheduleTimeControl, newIfcScheduleTimeControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcScheduleTimeControl(IfcScheduleTimeControl newIfcScheduleTimeControl) {
		if (newIfcScheduleTimeControl != ifcScheduleTimeControl) {
			NotificationChain msgs = null;
			if (ifcScheduleTimeControl != null)
				msgs = ((InternalEObject)ifcScheduleTimeControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TIME_FOR_TASK_TYPE__IFC_SCHEDULE_TIME_CONTROL, null, msgs);
			if (newIfcScheduleTimeControl != null)
				msgs = ((InternalEObject)newIfcScheduleTimeControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.TIME_FOR_TASK_TYPE__IFC_SCHEDULE_TIME_CONTROL, null, msgs);
			msgs = basicSetIfcScheduleTimeControl(newIfcScheduleTimeControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.TIME_FOR_TASK_TYPE__IFC_SCHEDULE_TIME_CONTROL, newIfcScheduleTimeControl, newIfcScheduleTimeControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.TIME_FOR_TASK_TYPE__IFC_SCHEDULE_TIME_CONTROL:
				return basicSetIfcScheduleTimeControl(null, msgs);
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
			case FinalPackage.TIME_FOR_TASK_TYPE__IFC_SCHEDULE_TIME_CONTROL:
				return getIfcScheduleTimeControl();
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
			case FinalPackage.TIME_FOR_TASK_TYPE__IFC_SCHEDULE_TIME_CONTROL:
				setIfcScheduleTimeControl((IfcScheduleTimeControl)newValue);
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
			case FinalPackage.TIME_FOR_TASK_TYPE__IFC_SCHEDULE_TIME_CONTROL:
				setIfcScheduleTimeControl((IfcScheduleTimeControl)null);
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
			case FinalPackage.TIME_FOR_TASK_TYPE__IFC_SCHEDULE_TIME_CONTROL:
				return ifcScheduleTimeControl != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeForTaskTypeImpl
