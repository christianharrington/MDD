/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColumnType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColumnTypeEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Column Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcColumnTypeImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcColumnTypeImpl extends IfcBuildingElementTypeImpl implements IfcColumnType {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcColumnTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcColumnTypeEnum.COLUMN;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcColumnTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcColumnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcColumnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColumnTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcColumnTypeEnum newPredefinedType) {
		IfcColumnTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_COLUMN_TYPE__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_COLUMN_TYPE__PREDEFINED_TYPE:
				return getPredefinedType();
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
			case FinalPackage.IFC_COLUMN_TYPE__PREDEFINED_TYPE:
				setPredefinedType((IfcColumnTypeEnum)newValue);
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
			case FinalPackage.IFC_COLUMN_TYPE__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
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
			case FinalPackage.IFC_COLUMN_TYPE__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
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
		result.append(" (predefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //IfcColumnTypeImpl
