/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransportElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransportElementTypeEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Transport Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTransportElementImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTransportElementImpl#getCapacityByWeight <em>Capacity By Weight</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTransportElementImpl#getCapacityByNumber <em>Capacity By Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTransportElementImpl extends IfcElementImpl implements IfcTransportElement {
	/**
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTransportElementTypeEnum OPERATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected IfcTransportElementTypeEnum operationType = OPERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacityByWeight() <em>Capacity By Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double CAPACITY_BY_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityByWeight() <em>Capacity By Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByWeight()
	 * @generated
	 * @ordered
	 */
	protected Double capacityByWeight = CAPACITY_BY_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacityByNumber() <em>Capacity By Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Double CAPACITY_BY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityByNumber() <em>Capacity By Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByNumber()
	 * @generated
	 * @ordered
	 */
	protected Double capacityByNumber = CAPACITY_BY_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTransportElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcTransportElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransportElementTypeEnum getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcTransportElementTypeEnum newOperationType) {
		IfcTransportElementTypeEnum oldOperationType = operationType;
		operationType = newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE, oldOperationType, operationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCapacityByWeight() {
		return capacityByWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByWeight(Double newCapacityByWeight) {
		Double oldCapacityByWeight = capacityByWeight;
		capacityByWeight = newCapacityByWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT, oldCapacityByWeight, capacityByWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCapacityByNumber() {
		return capacityByNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByNumber(Double newCapacityByNumber) {
		Double oldCapacityByNumber = capacityByNumber;
		capacityByNumber = newCapacityByNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER, oldCapacityByNumber, capacityByNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE:
				return getOperationType();
			case FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT:
				return getCapacityByWeight();
			case FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER:
				return getCapacityByNumber();
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
			case FinalPackage.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE:
				setOperationType((IfcTransportElementTypeEnum)newValue);
				return;
			case FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT:
				setCapacityByWeight((Double)newValue);
				return;
			case FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER:
				setCapacityByNumber((Double)newValue);
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
			case FinalPackage.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT:
				setCapacityByWeight(CAPACITY_BY_WEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER:
				setCapacityByNumber(CAPACITY_BY_NUMBER_EDEFAULT);
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
			case FinalPackage.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE:
				return OPERATION_TYPE_EDEFAULT == null ? operationType != null : !OPERATION_TYPE_EDEFAULT.equals(operationType);
			case FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT:
				return CAPACITY_BY_WEIGHT_EDEFAULT == null ? capacityByWeight != null : !CAPACITY_BY_WEIGHT_EDEFAULT.equals(capacityByWeight);
			case FinalPackage.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER:
				return CAPACITY_BY_NUMBER_EDEFAULT == null ? capacityByNumber != null : !CAPACITY_BY_NUMBER_EDEFAULT.equals(capacityByNumber);
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
		result.append(" (operationType: ");
		result.append(operationType);
		result.append(", capacityByWeight: ");
		result.append(capacityByWeight);
		result.append(", capacityByNumber: ");
		result.append(capacityByNumber);
		result.append(')');
		return result.toString();
	}

} //IfcTransportElementImpl
