/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcQuantityLength;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityLengthImpl#getLengthValue <em>Length Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityLengthImpl#getLengthValueAsString <em>Length Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcQuantityLengthImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityLength {
	/**
	 * The default value of the '{@link #getLengthValue() <em>Length Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthValue()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLengthValue() <em>Length Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthValue()
	 * @generated
	 * @ordered
	 */
	protected double lengthValue = LENGTH_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLengthValueAsString() <em>Length Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLengthValueAsString() <em>Length Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String lengthValueAsString = LENGTH_VALUE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityLengthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcQuantityLength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLengthValue() {
		return lengthValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthValue(double newLengthValue) {
		double oldLengthValue = lengthValue;
		lengthValue = newLengthValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE, oldLengthValue, lengthValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLengthValueAsString() {
		return lengthValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthValueAsString(String newLengthValueAsString) {
		String oldLengthValueAsString = lengthValueAsString;
		lengthValueAsString = newLengthValueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE_AS_STRING, oldLengthValueAsString, lengthValueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE:
				return getLengthValue();
			case Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE_AS_STRING:
				return getLengthValueAsString();
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
			case Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE:
				setLengthValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE_AS_STRING:
				setLengthValueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE:
				setLengthValue(LENGTH_VALUE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE_AS_STRING:
				setLengthValueAsString(LENGTH_VALUE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE:
				return lengthValue != LENGTH_VALUE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_QUANTITY_LENGTH__LENGTH_VALUE_AS_STRING:
				return LENGTH_VALUE_AS_STRING_EDEFAULT == null ? lengthValueAsString != null : !LENGTH_VALUE_AS_STRING_EDEFAULT.equals(lengthValueAsString);
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
		result.append(" (LengthValue: ");
		result.append(lengthValue);
		result.append(", LengthValueAsString: ");
		result.append(lengthValueAsString);
		result.append(')');
		return result.toString();
	}

} //IfcQuantityLengthImpl
