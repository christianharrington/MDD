/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcQuantityCount;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityCountImpl#getCountValue <em>Count Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityCountImpl#getCountValueAsString <em>Count Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcQuantityCountImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityCount {
	/**
	 * The default value of the '{@link #getCountValue() <em>Count Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountValue()
	 * @generated
	 * @ordered
	 */
	protected static final double COUNT_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCountValue() <em>Count Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountValue()
	 * @generated
	 * @ordered
	 */
	protected double countValue = COUNT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountValueAsString() <em>Count Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNT_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountValueAsString() <em>Count Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String countValueAsString = COUNT_VALUE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcQuantityCount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCountValue() {
		return countValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountValue(double newCountValue) {
		double oldCountValue = countValue;
		countValue = newCountValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE, oldCountValue, countValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountValueAsString() {
		return countValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountValueAsString(String newCountValueAsString) {
		String oldCountValueAsString = countValueAsString;
		countValueAsString = newCountValueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE_AS_STRING, oldCountValueAsString, countValueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE:
				return getCountValue();
			case Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE_AS_STRING:
				return getCountValueAsString();
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
			case Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE:
				setCountValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE_AS_STRING:
				setCountValueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE:
				setCountValue(COUNT_VALUE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE_AS_STRING:
				setCountValueAsString(COUNT_VALUE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE:
				return countValue != COUNT_VALUE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_QUANTITY_COUNT__COUNT_VALUE_AS_STRING:
				return COUNT_VALUE_AS_STRING_EDEFAULT == null ? countValueAsString != null : !COUNT_VALUE_AS_STRING_EDEFAULT.equals(countValueAsString);
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
		result.append(" (CountValue: ");
		result.append(countValue);
		result.append(", CountValueAsString: ");
		result.append(countValueAsString);
		result.append(')');
		return result.toString();
	}

} //IfcQuantityCountImpl
