/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DateComponentType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TimeComponentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Date And Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDateAndTimeImpl#getDateComponent <em>Date Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDateAndTimeImpl#getTimeComponent <em>Time Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDateAndTimeImpl extends EntityImpl implements IfcDateAndTime {
	/**
	 * The cached value of the '{@link #getDateComponent() <em>Date Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateComponent()
	 * @generated
	 * @ordered
	 */
	protected DateComponentType dateComponent;

	/**
	 * The cached value of the '{@link #getTimeComponent() <em>Time Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeComponent()
	 * @generated
	 * @ordered
	 */
	protected TimeComponentType timeComponent;

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
		return FinalPackage.eINSTANCE.getIfcDateAndTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateComponentType getDateComponent() {
		return dateComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateComponent(DateComponentType newDateComponent, NotificationChain msgs) {
		DateComponentType oldDateComponent = dateComponent;
		dateComponent = newDateComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DATE_AND_TIME__DATE_COMPONENT, oldDateComponent, newDateComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateComponent(DateComponentType newDateComponent) {
		if (newDateComponent != dateComponent) {
			NotificationChain msgs = null;
			if (dateComponent != null)
				msgs = ((InternalEObject)dateComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DATE_AND_TIME__DATE_COMPONENT, null, msgs);
			if (newDateComponent != null)
				msgs = ((InternalEObject)newDateComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DATE_AND_TIME__DATE_COMPONENT, null, msgs);
			msgs = basicSetDateComponent(newDateComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DATE_AND_TIME__DATE_COMPONENT, newDateComponent, newDateComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeComponentType getTimeComponent() {
		return timeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeComponent(TimeComponentType newTimeComponent, NotificationChain msgs) {
		TimeComponentType oldTimeComponent = timeComponent;
		timeComponent = newTimeComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DATE_AND_TIME__TIME_COMPONENT, oldTimeComponent, newTimeComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeComponent(TimeComponentType newTimeComponent) {
		if (newTimeComponent != timeComponent) {
			NotificationChain msgs = null;
			if (timeComponent != null)
				msgs = ((InternalEObject)timeComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DATE_AND_TIME__TIME_COMPONENT, null, msgs);
			if (newTimeComponent != null)
				msgs = ((InternalEObject)newTimeComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DATE_AND_TIME__TIME_COMPONENT, null, msgs);
			msgs = basicSetTimeComponent(newTimeComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DATE_AND_TIME__TIME_COMPONENT, newTimeComponent, newTimeComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_DATE_AND_TIME__DATE_COMPONENT:
				return basicSetDateComponent(null, msgs);
			case FinalPackage.IFC_DATE_AND_TIME__TIME_COMPONENT:
				return basicSetTimeComponent(null, msgs);
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
			case FinalPackage.IFC_DATE_AND_TIME__DATE_COMPONENT:
				return getDateComponent();
			case FinalPackage.IFC_DATE_AND_TIME__TIME_COMPONENT:
				return getTimeComponent();
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
			case FinalPackage.IFC_DATE_AND_TIME__DATE_COMPONENT:
				setDateComponent((DateComponentType)newValue);
				return;
			case FinalPackage.IFC_DATE_AND_TIME__TIME_COMPONENT:
				setTimeComponent((TimeComponentType)newValue);
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
			case FinalPackage.IFC_DATE_AND_TIME__DATE_COMPONENT:
				setDateComponent((DateComponentType)null);
				return;
			case FinalPackage.IFC_DATE_AND_TIME__TIME_COMPONENT:
				setTimeComponent((TimeComponentType)null);
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
			case FinalPackage.IFC_DATE_AND_TIME__DATE_COMPONENT:
				return dateComponent != null;
			case FinalPackage.IFC_DATE_AND_TIME__TIME_COMPONENT:
				return timeComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcDateAndTimeImpl
