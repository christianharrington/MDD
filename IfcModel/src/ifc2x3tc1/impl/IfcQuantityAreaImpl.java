/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcQuantityArea;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityAreaImpl#getAreaValue <em>Area Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityAreaImpl#getAreaValueAsString <em>Area Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcQuantityAreaImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityArea {
	/**
	 * The default value of the '{@link #getAreaValue() <em>Area Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaValue()
	 * @generated
	 * @ordered
	 */
	protected static final double AREA_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAreaValue() <em>Area Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaValue()
	 * @generated
	 * @ordered
	 */
	protected double areaValue = AREA_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAreaValueAsString() <em>Area Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaValueAsString() <em>Area Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String areaValueAsString = AREA_VALUE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcQuantityArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAreaValue() {
		return areaValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaValue(double newAreaValue) {
		double oldAreaValue = areaValue;
		areaValue = newAreaValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE, oldAreaValue, areaValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAreaValueAsString() {
		return areaValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaValueAsString(String newAreaValueAsString) {
		String oldAreaValueAsString = areaValueAsString;
		areaValueAsString = newAreaValueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE_AS_STRING, oldAreaValueAsString, areaValueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE:
				return getAreaValue();
			case Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE_AS_STRING:
				return getAreaValueAsString();
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
			case Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE:
				setAreaValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE_AS_STRING:
				setAreaValueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE:
				setAreaValue(AREA_VALUE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE_AS_STRING:
				setAreaValueAsString(AREA_VALUE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE:
				return areaValue != AREA_VALUE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_QUANTITY_AREA__AREA_VALUE_AS_STRING:
				return AREA_VALUE_AS_STRING_EDEFAULT == null ? areaValueAsString != null : !AREA_VALUE_AS_STRING_EDEFAULT.equals(areaValueAsString);
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
		result.append(" (AreaValue: ");
		result.append(areaValue);
		result.append(", AreaValueAsString: ");
		result.append(areaValueAsString);
		result.append(')');
		return result.toString();
	}

} //IfcQuantityAreaImpl
