/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRadioActivityMeasure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Radio Activity Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRadioActivityMeasureImpl#getWrappedValue <em>Wrapped Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRadioActivityMeasureImpl#getWrappedValueAsString <em>Wrapped Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRadioActivityMeasureImpl extends WrappedValueImpl implements IfcRadioActivityMeasure {
	/**
	 * The default value of the '{@link #getWrappedValue() <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValue()
	 * @generated
	 * @ordered
	 */
	protected static final double WRAPPED_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWrappedValue() <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValue()
	 * @generated
	 * @ordered
	 */
	protected double wrappedValue = WRAPPED_VALUE_EDEFAULT;

	/**
	 * This is true if the Wrapped Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrappedValueESet;

	/**
	 * The default value of the '{@link #getWrappedValueAsString() <em>Wrapped Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WRAPPED_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrappedValueAsString() <em>Wrapped Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String wrappedValueAsString = WRAPPED_VALUE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Wrapped Value As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrappedValueAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRadioActivityMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRadioActivityMeasure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWrappedValue() {
		return wrappedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedValue(double newWrappedValue) {
		double oldWrappedValue = wrappedValue;
		wrappedValue = newWrappedValue;
		boolean oldWrappedValueESet = wrappedValueESet;
		wrappedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE, oldWrappedValue, wrappedValue, !oldWrappedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrappedValue() {
		double oldWrappedValue = wrappedValue;
		boolean oldWrappedValueESet = wrappedValueESet;
		wrappedValue = WRAPPED_VALUE_EDEFAULT;
		wrappedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE, oldWrappedValue, WRAPPED_VALUE_EDEFAULT, oldWrappedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrappedValue() {
		return wrappedValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrappedValueAsString() {
		return wrappedValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedValueAsString(String newWrappedValueAsString) {
		String oldWrappedValueAsString = wrappedValueAsString;
		wrappedValueAsString = newWrappedValueAsString;
		boolean oldWrappedValueAsStringESet = wrappedValueAsStringESet;
		wrappedValueAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE_AS_STRING, oldWrappedValueAsString, wrappedValueAsString, !oldWrappedValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrappedValueAsString() {
		String oldWrappedValueAsString = wrappedValueAsString;
		boolean oldWrappedValueAsStringESet = wrappedValueAsStringESet;
		wrappedValueAsString = WRAPPED_VALUE_AS_STRING_EDEFAULT;
		wrappedValueAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE_AS_STRING, oldWrappedValueAsString, WRAPPED_VALUE_AS_STRING_EDEFAULT, oldWrappedValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrappedValueAsString() {
		return wrappedValueAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE:
				return getWrappedValue();
			case Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE_AS_STRING:
				return getWrappedValueAsString();
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
			case Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE:
				setWrappedValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE_AS_STRING:
				setWrappedValueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE:
				unsetWrappedValue();
				return;
			case Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE_AS_STRING:
				unsetWrappedValueAsString();
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
			case Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE:
				return isSetWrappedValue();
			case Ifc2x3tc1Package.IFC_RADIO_ACTIVITY_MEASURE__WRAPPED_VALUE_AS_STRING:
				return isSetWrappedValueAsString();
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
		result.append(" (wrappedValue: ");
		if (wrappedValueESet) result.append(wrappedValue); else result.append("<unset>");
		result.append(", wrappedValueAsString: ");
		if (wrappedValueAsStringESet) result.append(wrappedValueAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcRadioActivityMeasureImpl
