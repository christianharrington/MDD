/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCoordinatedUniversalTimeOffset;
import ifc2x3tc1.IfcLocalTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Local Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLocalTimeImpl#getHourComponent <em>Hour Component</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLocalTimeImpl#getMinuteComponent <em>Minute Component</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLocalTimeImpl#getSecondComponent <em>Second Component</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLocalTimeImpl#getSecondComponentAsString <em>Second Component As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLocalTimeImpl#getZone <em>Zone</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLocalTimeImpl#getDaylightSavingOffset <em>Daylight Saving Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLocalTimeImpl extends EObjectImpl implements IfcLocalTime {
	/**
	 * The default value of the '{@link #getHourComponent() <em>Hour Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourComponent()
	 * @generated
	 * @ordered
	 */
	protected static final int HOUR_COMPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHourComponent() <em>Hour Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourComponent()
	 * @generated
	 * @ordered
	 */
	protected int hourComponent = HOUR_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinuteComponent() <em>Minute Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinuteComponent()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTE_COMPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinuteComponent() <em>Minute Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinuteComponent()
	 * @generated
	 * @ordered
	 */
	protected int minuteComponent = MINUTE_COMPONENT_EDEFAULT;

	/**
	 * This is true if the Minute Component attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minuteComponentESet;

	/**
	 * The default value of the '{@link #getSecondComponent() <em>Second Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondComponent()
	 * @generated
	 * @ordered
	 */
	protected static final double SECOND_COMPONENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSecondComponent() <em>Second Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondComponent()
	 * @generated
	 * @ordered
	 */
	protected double secondComponent = SECOND_COMPONENT_EDEFAULT;

	/**
	 * This is true if the Second Component attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondComponentESet;

	/**
	 * The default value of the '{@link #getSecondComponentAsString() <em>Second Component As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondComponentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_COMPONENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondComponentAsString() <em>Second Component As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondComponentAsString()
	 * @generated
	 * @ordered
	 */
	protected String secondComponentAsString = SECOND_COMPONENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Second Component As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean secondComponentAsStringESet;

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected IfcCoordinatedUniversalTimeOffset zone;

	/**
	 * This is true if the Zone reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zoneESet;

	/**
	 * The default value of the '{@link #getDaylightSavingOffset() <em>Daylight Saving Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightSavingOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int DAYLIGHT_SAVING_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDaylightSavingOffset() <em>Daylight Saving Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaylightSavingOffset()
	 * @generated
	 * @ordered
	 */
	protected int daylightSavingOffset = DAYLIGHT_SAVING_OFFSET_EDEFAULT;

	/**
	 * This is true if the Daylight Saving Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean daylightSavingOffsetESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcLocalTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHourComponent() {
		return hourComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourComponent(int newHourComponent) {
		int oldHourComponent = hourComponent;
		hourComponent = newHourComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LOCAL_TIME__HOUR_COMPONENT, oldHourComponent, hourComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinuteComponent() {
		return minuteComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinuteComponent(int newMinuteComponent) {
		int oldMinuteComponent = minuteComponent;
		minuteComponent = newMinuteComponent;
		boolean oldMinuteComponentESet = minuteComponentESet;
		minuteComponentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LOCAL_TIME__MINUTE_COMPONENT, oldMinuteComponent, minuteComponent, !oldMinuteComponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinuteComponent() {
		int oldMinuteComponent = minuteComponent;
		boolean oldMinuteComponentESet = minuteComponentESet;
		minuteComponent = MINUTE_COMPONENT_EDEFAULT;
		minuteComponentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LOCAL_TIME__MINUTE_COMPONENT, oldMinuteComponent, MINUTE_COMPONENT_EDEFAULT, oldMinuteComponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinuteComponent() {
		return minuteComponentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSecondComponent() {
		return secondComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondComponent(double newSecondComponent) {
		double oldSecondComponent = secondComponent;
		secondComponent = newSecondComponent;
		boolean oldSecondComponentESet = secondComponentESet;
		secondComponentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT, oldSecondComponent, secondComponent, !oldSecondComponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondComponent() {
		double oldSecondComponent = secondComponent;
		boolean oldSecondComponentESet = secondComponentESet;
		secondComponent = SECOND_COMPONENT_EDEFAULT;
		secondComponentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT, oldSecondComponent, SECOND_COMPONENT_EDEFAULT, oldSecondComponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondComponent() {
		return secondComponentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondComponentAsString() {
		return secondComponentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondComponentAsString(String newSecondComponentAsString) {
		String oldSecondComponentAsString = secondComponentAsString;
		secondComponentAsString = newSecondComponentAsString;
		boolean oldSecondComponentAsStringESet = secondComponentAsStringESet;
		secondComponentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT_AS_STRING, oldSecondComponentAsString, secondComponentAsString, !oldSecondComponentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecondComponentAsString() {
		String oldSecondComponentAsString = secondComponentAsString;
		boolean oldSecondComponentAsStringESet = secondComponentAsStringESet;
		secondComponentAsString = SECOND_COMPONENT_AS_STRING_EDEFAULT;
		secondComponentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT_AS_STRING, oldSecondComponentAsString, SECOND_COMPONENT_AS_STRING_EDEFAULT, oldSecondComponentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecondComponentAsString() {
		return secondComponentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoordinatedUniversalTimeOffset getZone() {
		if (zone != null && zone.eIsProxy()) {
			InternalEObject oldZone = (InternalEObject)zone;
			zone = (IfcCoordinatedUniversalTimeOffset)eResolveProxy(oldZone);
			if (zone != oldZone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LOCAL_TIME__ZONE, oldZone, zone));
			}
		}
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoordinatedUniversalTimeOffset basicGetZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(IfcCoordinatedUniversalTimeOffset newZone) {
		IfcCoordinatedUniversalTimeOffset oldZone = zone;
		zone = newZone;
		boolean oldZoneESet = zoneESet;
		zoneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LOCAL_TIME__ZONE, oldZone, zone, !oldZoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZone() {
		IfcCoordinatedUniversalTimeOffset oldZone = zone;
		boolean oldZoneESet = zoneESet;
		zone = null;
		zoneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LOCAL_TIME__ZONE, oldZone, null, oldZoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZone() {
		return zoneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDaylightSavingOffset() {
		return daylightSavingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaylightSavingOffset(int newDaylightSavingOffset) {
		int oldDaylightSavingOffset = daylightSavingOffset;
		daylightSavingOffset = newDaylightSavingOffset;
		boolean oldDaylightSavingOffsetESet = daylightSavingOffsetESet;
		daylightSavingOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET, oldDaylightSavingOffset, daylightSavingOffset, !oldDaylightSavingOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDaylightSavingOffset() {
		int oldDaylightSavingOffset = daylightSavingOffset;
		boolean oldDaylightSavingOffsetESet = daylightSavingOffsetESet;
		daylightSavingOffset = DAYLIGHT_SAVING_OFFSET_EDEFAULT;
		daylightSavingOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET, oldDaylightSavingOffset, DAYLIGHT_SAVING_OFFSET_EDEFAULT, oldDaylightSavingOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDaylightSavingOffset() {
		return daylightSavingOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__HOUR_COMPONENT:
				return getHourComponent();
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__MINUTE_COMPONENT:
				return getMinuteComponent();
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT:
				return getSecondComponent();
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT_AS_STRING:
				return getSecondComponentAsString();
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__ZONE:
				if (resolve) return getZone();
				return basicGetZone();
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET:
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
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__HOUR_COMPONENT:
				setHourComponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__MINUTE_COMPONENT:
				setMinuteComponent((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT:
				setSecondComponent((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT_AS_STRING:
				setSecondComponentAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__ZONE:
				setZone((IfcCoordinatedUniversalTimeOffset)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET:
				setDaylightSavingOffset((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__HOUR_COMPONENT:
				setHourComponent(HOUR_COMPONENT_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__MINUTE_COMPONENT:
				unsetMinuteComponent();
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT:
				unsetSecondComponent();
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT_AS_STRING:
				unsetSecondComponentAsString();
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__ZONE:
				unsetZone();
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET:
				unsetDaylightSavingOffset();
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
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__HOUR_COMPONENT:
				return hourComponent != HOUR_COMPONENT_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__MINUTE_COMPONENT:
				return isSetMinuteComponent();
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT:
				return isSetSecondComponent();
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__SECOND_COMPONENT_AS_STRING:
				return isSetSecondComponentAsString();
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__ZONE:
				return isSetZone();
			case Ifc2x3tc1Package.IFC_LOCAL_TIME__DAYLIGHT_SAVING_OFFSET:
				return isSetDaylightSavingOffset();
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
		result.append(" (HourComponent: ");
		result.append(hourComponent);
		result.append(", MinuteComponent: ");
		if (minuteComponentESet) result.append(minuteComponent); else result.append("<unset>");
		result.append(", SecondComponent: ");
		if (secondComponentESet) result.append(secondComponent); else result.append("<unset>");
		result.append(", SecondComponentAsString: ");
		if (secondComponentAsStringESet) result.append(secondComponentAsString); else result.append("<unset>");
		result.append(", DaylightSavingOffset: ");
		if (daylightSavingOffsetESet) result.append(daylightSavingOffset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcLocalTimeImpl
