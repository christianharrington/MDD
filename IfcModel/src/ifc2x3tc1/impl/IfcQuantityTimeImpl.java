/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcQuantityTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityTimeImpl#getTimeValue <em>Time Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityTimeImpl#getTimeValueAsString <em>Time Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcQuantityTimeImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityTime {
	/**
	 * The default value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeValue() <em>Time Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValue()
	 * @generated
	 * @ordered
	 */
	protected double timeValue = TIME_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeValueAsString() <em>Time Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeValueAsString() <em>Time Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String timeValueAsString = TIME_VALUE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcQuantityTime();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeValue() {
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValue(double newTimeValue) {
		double oldTimeValue = timeValue;
		timeValue = newTimeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE, oldTimeValue, timeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeValueAsString() {
		return timeValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeValueAsString(String newTimeValueAsString) {
		String oldTimeValueAsString = timeValueAsString;
		timeValueAsString = newTimeValueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE_AS_STRING, oldTimeValueAsString, timeValueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE:
				return getTimeValue();
			case Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE_AS_STRING:
				return getTimeValueAsString();
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
			case Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE:
				setTimeValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE_AS_STRING:
				setTimeValueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE:
				setTimeValue(TIME_VALUE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE_AS_STRING:
				setTimeValueAsString(TIME_VALUE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE:
				return timeValue != TIME_VALUE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_QUANTITY_TIME__TIME_VALUE_AS_STRING:
				return TIME_VALUE_AS_STRING_EDEFAULT == null ? timeValueAsString != null : !TIME_VALUE_AS_STRING_EDEFAULT.equals(timeValueAsString);
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
		result.append(" (TimeValue: ");
		result.append(timeValue);
		result.append(", TimeValueAsString: ");
		result.append(timeValueAsString);
		result.append(')');
		return result.toString();
	}

} //IfcQuantityTimeImpl
