/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCalendarDate;
import ifc2x3tc1.IfcDateAndTime;
import ifc2x3tc1.IfcLocalTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Date And Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDateAndTimeImpl#getDateComponent <em>Date Component</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDateAndTimeImpl#getTimeComponent <em>Time Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDateAndTimeImpl extends EObjectImpl implements IfcDateAndTime {
	/**
	 * The cached value of the '{@link #getDateComponent() <em>Date Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateComponent()
	 * @generated
	 * @ordered
	 */
	protected IfcCalendarDate dateComponent;

	/**
	 * The cached value of the '{@link #getTimeComponent() <em>Time Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeComponent()
	 * @generated
	 * @ordered
	 */
	protected IfcLocalTime timeComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDateAndTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDateAndTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getDateComponent() {
		if (dateComponent != null && dateComponent.eIsProxy()) {
			InternalEObject oldDateComponent = (InternalEObject)dateComponent;
			dateComponent = (IfcCalendarDate)eResolveProxy(oldDateComponent);
			if (dateComponent != oldDateComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DATE_AND_TIME__DATE_COMPONENT, oldDateComponent, dateComponent));
			}
		}
		return dateComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate basicGetDateComponent() {
		return dateComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateComponent(IfcCalendarDate newDateComponent) {
		IfcCalendarDate oldDateComponent = dateComponent;
		dateComponent = newDateComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DATE_AND_TIME__DATE_COMPONENT, oldDateComponent, dateComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLocalTime getTimeComponent() {
		if (timeComponent != null && timeComponent.eIsProxy()) {
			InternalEObject oldTimeComponent = (InternalEObject)timeComponent;
			timeComponent = (IfcLocalTime)eResolveProxy(oldTimeComponent);
			if (timeComponent != oldTimeComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_DATE_AND_TIME__TIME_COMPONENT, oldTimeComponent, timeComponent));
			}
		}
		return timeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLocalTime basicGetTimeComponent() {
		return timeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeComponent(IfcLocalTime newTimeComponent) {
		IfcLocalTime oldTimeComponent = timeComponent;
		timeComponent = newTimeComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DATE_AND_TIME__TIME_COMPONENT, oldTimeComponent, timeComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DATE_AND_TIME__DATE_COMPONENT:
				if (resolve) return getDateComponent();
				return basicGetDateComponent();
			case Ifc2x3tc1Package.IFC_DATE_AND_TIME__TIME_COMPONENT:
				if (resolve) return getTimeComponent();
				return basicGetTimeComponent();
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
			case Ifc2x3tc1Package.IFC_DATE_AND_TIME__DATE_COMPONENT:
				setDateComponent((IfcCalendarDate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DATE_AND_TIME__TIME_COMPONENT:
				setTimeComponent((IfcLocalTime)newValue);
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
			case Ifc2x3tc1Package.IFC_DATE_AND_TIME__DATE_COMPONENT:
				setDateComponent((IfcCalendarDate)null);
				return;
			case Ifc2x3tc1Package.IFC_DATE_AND_TIME__TIME_COMPONENT:
				setTimeComponent((IfcLocalTime)null);
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
			case Ifc2x3tc1Package.IFC_DATE_AND_TIME__DATE_COMPONENT:
				return dateComponent != null;
			case Ifc2x3tc1Package.IFC_DATE_AND_TIME__TIME_COMPONENT:
				return timeComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcDateAndTimeImpl
