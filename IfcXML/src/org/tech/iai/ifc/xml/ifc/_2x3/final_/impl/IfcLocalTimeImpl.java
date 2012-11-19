/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ZoneType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Local Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLocalTimeImpl#getHourComponent <em>Hour Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLocalTimeImpl#getMinuteComponent <em>Minute Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLocalTimeImpl#getSecondComponent <em>Second Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLocalTimeImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLocalTimeImpl#getDaylightSavingOffset <em>Daylight Saving Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLocalTimeImpl extends EntityImpl implements IfcLocalTime {
	/**
	 * The default value of the '{@link #getHourComponent() <em>Hour Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourComponent()
	 * @generated
	 * @ordered
	 */
	protected static final long HOUR_COMPONENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getHourComponent() <em>Hour Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourComponent()
	 * @generated
	 * @ordered
	 */
	protected long hourComponent = HOUR_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinuteComponent() <em>Minute Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinuteComponent()
	 * @generated
	 * @ordered
	 */
	protected static final Long MINUTE_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinuteComponent() <em>Minute Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinuteComponent()
	 * @generated
	 * @ordered
	 */
	protected Long minuteComponent = MINUTE_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondComponent() <em>Second Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondComponent()
	 * @generated
	 * @ordered
	 */
	protected static final Double SECOND_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondComponent() <em>Second Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondComponent()
	 * @generated
	 * @ordered
	 */
	protected Double secondComponent = SECOND_COMPONENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected ZoneType zone;

	/**
	 * The default value of the '{@link #getDaylightSavingOffset() <em>Daylight Saving Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightSavingOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Long DAYLIGHT_SAVING_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDaylightSavingOffset() <em>Daylight Saving Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightSavingOffset()
	 * @generated
	 * @ordered
	 */
	protected Long daylightSavingOffset = DAYLIGHT_SAVING_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLocalTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcLocalTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getHourComponent() {
		return hourComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourComponent(long newHourComponent) {
		long oldHourComponent = hourComponent;
		hourComponent = newHourComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_TIME__HOUR_COMPONENT, oldHourComponent, hourComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMinuteComponent() {
		return minuteComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinuteComponent(Long newMinuteComponent) {
		Long oldMinuteComponent = minuteComponent;
		minuteComponent = newMinuteComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_TIME__MINUTE_COMPONENT, oldMinuteComponent, minuteComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSecondComponent() {
		return secondComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondComponent(Double newSecondComponent) {
		Double oldSecondComponent = secondComponent;
		secondComponent = newSecondComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_TIME__SECOND_COMPONENT, oldSecondComponent, secondComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneType getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZone(ZoneType newZone, NotificationChain msgs) {
		ZoneType oldZone = zone;
		zone = newZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_TIME__ZONE, oldZone, newZone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(ZoneType newZone) {
		if (newZone != zone) {
			NotificationChain msgs = null;
			if (zone != null)
				msgs = ((InternalEObject)zone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LOCAL_TIME__ZONE, null, msgs);
			if (newZone != null)
				msgs = ((InternalEObject)newZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LOCAL_TIME__ZONE, null, msgs);
			msgs = basicSetZone(newZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_TIME__ZONE, newZone, newZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDaylightSavingOffset() {
		return daylightSavingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaylightSavingOffset(Long newDaylightSavingOffset) {
		Long oldDaylightSavingOffset = daylightSavingOffset;
		daylightSavingOffset = newDaylightSavingOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET, oldDaylightSavingOffset, daylightSavingOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LOCAL_TIME__ZONE:
				return basicSetZone(null, msgs);
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
			case FinalPackage.IFC_LOCAL_TIME__HOUR_COMPONENT:
				return getHourComponent();
			case FinalPackage.IFC_LOCAL_TIME__MINUTE_COMPONENT:
				return getMinuteComponent();
			case FinalPackage.IFC_LOCAL_TIME__SECOND_COMPONENT:
				return getSecondComponent();
			case FinalPackage.IFC_LOCAL_TIME__ZONE:
				return getZone();
			case FinalPackage.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET:
				return getDaylightSavingOffset();
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
			case FinalPackage.IFC_LOCAL_TIME__HOUR_COMPONENT:
				setHourComponent((Long)newValue);
				return;
			case FinalPackage.IFC_LOCAL_TIME__MINUTE_COMPONENT:
				setMinuteComponent((Long)newValue);
				return;
			case FinalPackage.IFC_LOCAL_TIME__SECOND_COMPONENT:
				setSecondComponent((Double)newValue);
				return;
			case FinalPackage.IFC_LOCAL_TIME__ZONE:
				setZone((ZoneType)newValue);
				return;
			case FinalPackage.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET:
				setDaylightSavingOffset((Long)newValue);
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
			case FinalPackage.IFC_LOCAL_TIME__HOUR_COMPONENT:
				setHourComponent(HOUR_COMPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_LOCAL_TIME__MINUTE_COMPONENT:
				setMinuteComponent(MINUTE_COMPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_LOCAL_TIME__SECOND_COMPONENT:
				setSecondComponent(SECOND_COMPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_LOCAL_TIME__ZONE:
				setZone((ZoneType)null);
				return;
			case FinalPackage.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET:
				setDaylightSavingOffset(DAYLIGHT_SAVING_OFFSET_EDEFAULT);
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
			case FinalPackage.IFC_LOCAL_TIME__HOUR_COMPONENT:
				return hourComponent != HOUR_COMPONENT_EDEFAULT;
			case FinalPackage.IFC_LOCAL_TIME__MINUTE_COMPONENT:
				return MINUTE_COMPONENT_EDEFAULT == null ? minuteComponent != null : !MINUTE_COMPONENT_EDEFAULT.equals(minuteComponent);
			case FinalPackage.IFC_LOCAL_TIME__SECOND_COMPONENT:
				return SECOND_COMPONENT_EDEFAULT == null ? secondComponent != null : !SECOND_COMPONENT_EDEFAULT.equals(secondComponent);
			case FinalPackage.IFC_LOCAL_TIME__ZONE:
				return zone != null;
			case FinalPackage.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET:
				return DAYLIGHT_SAVING_OFFSET_EDEFAULT == null ? daylightSavingOffset != null : !DAYLIGHT_SAVING_OFFSET_EDEFAULT.equals(daylightSavingOffset);
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
		result.append(" (hourComponent: ");
		result.append(hourComponent);
		result.append(", minuteComponent: ");
		result.append(minuteComponent);
		result.append(", secondComponent: ");
		result.append(secondComponent);
		result.append(", daylightSavingOffset: ");
		result.append(daylightSavingOffset);
		result.append(')');
		return result.toString();
	}

} //IfcLocalTimeImpl
