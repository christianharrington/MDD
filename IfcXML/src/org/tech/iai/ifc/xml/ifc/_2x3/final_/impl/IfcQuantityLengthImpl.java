/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcQuantityLength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Length</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcQuantityLengthImpl#getLengthValue <em>Length Value</em>}</li>
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
	protected static final Double LENGTH_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLengthValue() <em>Length Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthValue()
	 * @generated
	 * @ordered
	 */
	protected Double lengthValue = LENGTH_VALUE_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcQuantityLength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLengthValue() {
		return lengthValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLengthValue(Double newLengthValue) {
		Double oldLengthValue = lengthValue;
		lengthValue = newLengthValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_QUANTITY_LENGTH__LENGTH_VALUE, oldLengthValue, lengthValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_QUANTITY_LENGTH__LENGTH_VALUE:
				return getLengthValue();
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
			case FinalPackage.IFC_QUANTITY_LENGTH__LENGTH_VALUE:
				setLengthValue((Double)newValue);
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
			case FinalPackage.IFC_QUANTITY_LENGTH__LENGTH_VALUE:
				setLengthValue(LENGTH_VALUE_EDEFAULT);
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
			case FinalPackage.IFC_QUANTITY_LENGTH__LENGTH_VALUE:
				return LENGTH_VALUE_EDEFAULT == null ? lengthValue != null : !LENGTH_VALUE_EDEFAULT.equals(lengthValue);
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
		result.append(" (lengthValue: ");
		result.append(lengthValue);
		result.append(')');
		return result.toString();
	}

} //IfcQuantityLengthImpl
