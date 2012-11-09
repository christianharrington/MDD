/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcQuantityWeight;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Weight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityWeightImpl#getWeightValue <em>Weight Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityWeightImpl#getWeightValueAsString <em>Weight Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcQuantityWeightImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityWeight {
	/**
	 * The default value of the '{@link #getWeightValue() <em>Weight Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightValue()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeightValue() <em>Weight Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightValue()
	 * @generated
	 * @ordered
	 */
	protected double weightValue = WEIGHT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeightValueAsString() <em>Weight Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeightValueAsString() <em>Weight Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String weightValueAsString = WEIGHT_VALUE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityWeightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcQuantityWeight();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeightValue() {
		return weightValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightValue(double newWeightValue) {
		double oldWeightValue = weightValue;
		weightValue = newWeightValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE, oldWeightValue, weightValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeightValueAsString() {
		return weightValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightValueAsString(String newWeightValueAsString) {
		String oldWeightValueAsString = weightValueAsString;
		weightValueAsString = newWeightValueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE_AS_STRING, oldWeightValueAsString, weightValueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE:
				return getWeightValue();
			case Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE_AS_STRING:
				return getWeightValueAsString();
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
			case Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE:
				setWeightValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE_AS_STRING:
				setWeightValueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE:
				setWeightValue(WEIGHT_VALUE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE_AS_STRING:
				setWeightValueAsString(WEIGHT_VALUE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE:
				return weightValue != WEIGHT_VALUE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_QUANTITY_WEIGHT__WEIGHT_VALUE_AS_STRING:
				return WEIGHT_VALUE_AS_STRING_EDEFAULT == null ? weightValueAsString != null : !WEIGHT_VALUE_AS_STRING_EDEFAULT.equals(weightValueAsString);
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
		result.append(" (WeightValue: ");
		result.append(weightValue);
		result.append(", WeightValueAsString: ");
		result.append(weightValueAsString);
		result.append(')');
		return result.toString();
	}

} //IfcQuantityWeightImpl
