/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAheadOrBehind;
import ifc2x3tc1.IfcCoordinatedUniversalTimeOffset;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Coordinated Universal Time Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCoordinatedUniversalTimeOffsetImpl#getHourOffset <em>Hour Offset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCoordinatedUniversalTimeOffsetImpl#getMinuteOffset <em>Minute Offset</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCoordinatedUniversalTimeOffsetImpl#getSense <em>Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCoordinatedUniversalTimeOffsetImpl extends EObjectImpl implements IfcCoordinatedUniversalTimeOffset {
	/**
	 * The default value of the '{@link #getHourOffset() <em>Hour Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int HOUR_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHourOffset() <em>Hour Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourOffset()
	 * @generated
	 * @ordered
	 */
	protected int hourOffset = HOUR_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinuteOffset() <em>Minute Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinuteOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTE_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinuteOffset() <em>Minute Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinuteOffset()
	 * @generated
	 * @ordered
	 */
	protected int minuteOffset = MINUTE_OFFSET_EDEFAULT;

	/**
	 * This is true if the Minute Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minuteOffsetESet;

	/**
	 * The default value of the '{@link #getSense() <em>Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSense()
	 * @generated
	 * @ordered
	 */
	protected static final IfcAheadOrBehind SENSE_EDEFAULT = IfcAheadOrBehind.NULL;

	/**
	 * The cached value of the '{@link #getSense() <em>Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSense()
	 * @generated
	 * @ordered
	 */
	protected IfcAheadOrBehind sense = SENSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCoordinatedUniversalTimeOffsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHourOffset() {
		return hourOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourOffset(int newHourOffset) {
		int oldHourOffset = hourOffset;
		hourOffset = newHourOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET, oldHourOffset, hourOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinuteOffset() {
		return minuteOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinuteOffset(int newMinuteOffset) {
		int oldMinuteOffset = minuteOffset;
		minuteOffset = newMinuteOffset;
		boolean oldMinuteOffsetESet = minuteOffsetESet;
		minuteOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET, oldMinuteOffset, minuteOffset, !oldMinuteOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinuteOffset() {
		int oldMinuteOffset = minuteOffset;
		boolean oldMinuteOffsetESet = minuteOffsetESet;
		minuteOffset = MINUTE_OFFSET_EDEFAULT;
		minuteOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET, oldMinuteOffset, MINUTE_OFFSET_EDEFAULT, oldMinuteOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinuteOffset() {
		return minuteOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAheadOrBehind getSense() {
		return sense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSense(IfcAheadOrBehind newSense) {
		IfcAheadOrBehind oldSense = sense;
		sense = newSense == null ? SENSE_EDEFAULT : newSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE, oldSense, sense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET:
				return getHourOffset();
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET:
				return getMinuteOffset();
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE:
				return getSense();
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
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET:
				setHourOffset((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET:
				setMinuteOffset((Integer)newValue);
				return;
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE:
				setSense((IfcAheadOrBehind)newValue);
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
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET:
				setHourOffset(HOUR_OFFSET_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET:
				unsetMinuteOffset();
				return;
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE:
				setSense(SENSE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET:
				return hourOffset != HOUR_OFFSET_EDEFAULT;
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET:
				return isSetMinuteOffset();
			case Ifc2x3tc1Package.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE:
				return sense != SENSE_EDEFAULT;
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
		result.append(" (HourOffset: ");
		result.append(hourOffset);
		result.append(", MinuteOffset: ");
		if (minuteOffsetESet) result.append(minuteOffset); else result.append("<unset>");
		result.append(", Sense: ");
		result.append(sense);
		result.append(')');
		return result.toString();
	}

} //IfcCoordinatedUniversalTimeOffsetImpl
