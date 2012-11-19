/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAheadOrBehind;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCoordinatedUniversalTimeOffset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Coordinated Universal Time Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCoordinatedUniversalTimeOffsetImpl#getHourOffset <em>Hour Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCoordinatedUniversalTimeOffsetImpl#getMinuteOffset <em>Minute Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCoordinatedUniversalTimeOffsetImpl#getSense <em>Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCoordinatedUniversalTimeOffsetImpl extends EntityImpl implements IfcCoordinatedUniversalTimeOffset {
	/**
	 * The default value of the '{@link #getHourOffset() <em>Hour Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourOffset()
	 * @generated
	 * @ordered
	 */
	protected static final long HOUR_OFFSET_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getHourOffset() <em>Hour Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHourOffset()
	 * @generated
	 * @ordered
	 */
	protected long hourOffset = HOUR_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinuteOffset() <em>Minute Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinuteOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Long MINUTE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinuteOffset() <em>Minute Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinuteOffset()
	 * @generated
	 * @ordered
	 */
	protected Long minuteOffset = MINUTE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSense() <em>Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSense()
	 * @generated
	 * @ordered
	 */
	protected static final IfcAheadOrBehind SENSE_EDEFAULT = IfcAheadOrBehind.AHEAD;

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
		return FinalPackage.eINSTANCE.getIfcCoordinatedUniversalTimeOffset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getHourOffset() {
		return hourOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourOffset(long newHourOffset) {
		long oldHourOffset = hourOffset;
		hourOffset = newHourOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET, oldHourOffset, hourOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getMinuteOffset() {
		return minuteOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinuteOffset(Long newMinuteOffset) {
		Long oldMinuteOffset = minuteOffset;
		minuteOffset = newMinuteOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET, oldMinuteOffset, minuteOffset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE, oldSense, sense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET:
				return getHourOffset();
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET:
				return getMinuteOffset();
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE:
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
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET:
				setHourOffset((Long)newValue);
				return;
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET:
				setMinuteOffset((Long)newValue);
				return;
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE:
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
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET:
				setHourOffset(HOUR_OFFSET_EDEFAULT);
				return;
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET:
				setMinuteOffset(MINUTE_OFFSET_EDEFAULT);
				return;
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE:
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
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__HOUR_OFFSET:
				return hourOffset != HOUR_OFFSET_EDEFAULT;
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__MINUTE_OFFSET:
				return MINUTE_OFFSET_EDEFAULT == null ? minuteOffset != null : !MINUTE_OFFSET_EDEFAULT.equals(minuteOffset);
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET__SENSE:
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
		result.append(" (hourOffset: ");
		result.append(hourOffset);
		result.append(", minuteOffset: ");
		result.append(minuteOffset);
		result.append(", sense: ");
		result.append(sense);
		result.append(')');
		return result.toString();
	}

} //IfcCoordinatedUniversalTimeOffsetImpl
