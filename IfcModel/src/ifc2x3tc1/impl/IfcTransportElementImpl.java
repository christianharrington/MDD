/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTransportElement;
import ifc2x3tc1.IfcTransportElementTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Transport Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTransportElementImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByWeight <em>Capacity By Weight</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByWeightAsString <em>Capacity By Weight As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByNumber <em>Capacity By Number</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTransportElementImpl#getCapacityByNumberAsString <em>Capacity By Number As String</em>}</li>
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
	protected static final IfcTransportElementTypeEnum OPERATION_TYPE_EDEFAULT = IfcTransportElementTypeEnum.NULL;

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
	 * This is true if the Operation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationTypeESet;

	/**
	 * The default value of the '{@link #getCapacityByWeight() <em>Capacity By Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITY_BY_WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCapacityByWeight() <em>Capacity By Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByWeight()
	 * @generated
	 * @ordered
	 */
	protected double capacityByWeight = CAPACITY_BY_WEIGHT_EDEFAULT;

	/**
	 * This is true if the Capacity By Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capacityByWeightESet;

	/**
	 * The default value of the '{@link #getCapacityByWeightAsString() <em>Capacity By Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByWeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_BY_WEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityByWeightAsString() <em>Capacity By Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByWeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String capacityByWeightAsString = CAPACITY_BY_WEIGHT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Capacity By Weight As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capacityByWeightAsStringESet;

	/**
	 * The default value of the '{@link #getCapacityByNumber() <em>Capacity By Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByNumber()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITY_BY_NUMBER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCapacityByNumber() <em>Capacity By Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByNumber()
	 * @generated
	 * @ordered
	 */
	protected double capacityByNumber = CAPACITY_BY_NUMBER_EDEFAULT;

	/**
	 * This is true if the Capacity By Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capacityByNumberESet;

	/**
	 * The default value of the '{@link #getCapacityByNumberAsString() <em>Capacity By Number As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByNumberAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_BY_NUMBER_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityByNumberAsString() <em>Capacity By Number As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityByNumberAsString()
	 * @generated
	 * @ordered
	 */
	protected String capacityByNumberAsString = CAPACITY_BY_NUMBER_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Capacity By Number As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capacityByNumberAsStringESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcTransportElement();
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
		operationType = newOperationType == null ? OPERATION_TYPE_EDEFAULT : newOperationType;
		boolean oldOperationTypeESet = operationTypeESet;
		operationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE, oldOperationType, operationType, !oldOperationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationType() {
		IfcTransportElementTypeEnum oldOperationType = operationType;
		boolean oldOperationTypeESet = operationTypeESet;
		operationType = OPERATION_TYPE_EDEFAULT;
		operationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE, oldOperationType, OPERATION_TYPE_EDEFAULT, oldOperationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationType() {
		return operationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapacityByWeight() {
		return capacityByWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByWeight(double newCapacityByWeight) {
		double oldCapacityByWeight = capacityByWeight;
		capacityByWeight = newCapacityByWeight;
		boolean oldCapacityByWeightESet = capacityByWeightESet;
		capacityByWeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT, oldCapacityByWeight, capacityByWeight, !oldCapacityByWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByWeight() {
		double oldCapacityByWeight = capacityByWeight;
		boolean oldCapacityByWeightESet = capacityByWeightESet;
		capacityByWeight = CAPACITY_BY_WEIGHT_EDEFAULT;
		capacityByWeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT, oldCapacityByWeight, CAPACITY_BY_WEIGHT_EDEFAULT, oldCapacityByWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByWeight() {
		return capacityByWeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityByWeightAsString() {
		return capacityByWeightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByWeightAsString(String newCapacityByWeightAsString) {
		String oldCapacityByWeightAsString = capacityByWeightAsString;
		capacityByWeightAsString = newCapacityByWeightAsString;
		boolean oldCapacityByWeightAsStringESet = capacityByWeightAsStringESet;
		capacityByWeightAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING, oldCapacityByWeightAsString, capacityByWeightAsString, !oldCapacityByWeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByWeightAsString() {
		String oldCapacityByWeightAsString = capacityByWeightAsString;
		boolean oldCapacityByWeightAsStringESet = capacityByWeightAsStringESet;
		capacityByWeightAsString = CAPACITY_BY_WEIGHT_AS_STRING_EDEFAULT;
		capacityByWeightAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING, oldCapacityByWeightAsString, CAPACITY_BY_WEIGHT_AS_STRING_EDEFAULT, oldCapacityByWeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByWeightAsString() {
		return capacityByWeightAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapacityByNumber() {
		return capacityByNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByNumber(double newCapacityByNumber) {
		double oldCapacityByNumber = capacityByNumber;
		capacityByNumber = newCapacityByNumber;
		boolean oldCapacityByNumberESet = capacityByNumberESet;
		capacityByNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER, oldCapacityByNumber, capacityByNumber, !oldCapacityByNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByNumber() {
		double oldCapacityByNumber = capacityByNumber;
		boolean oldCapacityByNumberESet = capacityByNumberESet;
		capacityByNumber = CAPACITY_BY_NUMBER_EDEFAULT;
		capacityByNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER, oldCapacityByNumber, CAPACITY_BY_NUMBER_EDEFAULT, oldCapacityByNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByNumber() {
		return capacityByNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityByNumberAsString() {
		return capacityByNumberAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByNumberAsString(String newCapacityByNumberAsString) {
		String oldCapacityByNumberAsString = capacityByNumberAsString;
		capacityByNumberAsString = newCapacityByNumberAsString;
		boolean oldCapacityByNumberAsStringESet = capacityByNumberAsStringESet;
		capacityByNumberAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING, oldCapacityByNumberAsString, capacityByNumberAsString, !oldCapacityByNumberAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByNumberAsString() {
		String oldCapacityByNumberAsString = capacityByNumberAsString;
		boolean oldCapacityByNumberAsStringESet = capacityByNumberAsStringESet;
		capacityByNumberAsString = CAPACITY_BY_NUMBER_AS_STRING_EDEFAULT;
		capacityByNumberAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING, oldCapacityByNumberAsString, CAPACITY_BY_NUMBER_AS_STRING_EDEFAULT, oldCapacityByNumberAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByNumberAsString() {
		return capacityByNumberAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE:
				return getOperationType();
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT:
				return getCapacityByWeight();
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING:
				return getCapacityByWeightAsString();
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER:
				return getCapacityByNumber();
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING:
				return getCapacityByNumberAsString();
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
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE:
				setOperationType((IfcTransportElementTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT:
				setCapacityByWeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING:
				setCapacityByWeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER:
				setCapacityByNumber((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING:
				setCapacityByNumberAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE:
				unsetOperationType();
				return;
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT:
				unsetCapacityByWeight();
				return;
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING:
				unsetCapacityByWeightAsString();
				return;
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER:
				unsetCapacityByNumber();
				return;
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING:
				unsetCapacityByNumberAsString();
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
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__OPERATION_TYPE:
				return isSetOperationType();
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT:
				return isSetCapacityByWeight();
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_WEIGHT_AS_STRING:
				return isSetCapacityByWeightAsString();
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER:
				return isSetCapacityByNumber();
			case Ifc2x3tc1Package.IFC_TRANSPORT_ELEMENT__CAPACITY_BY_NUMBER_AS_STRING:
				return isSetCapacityByNumberAsString();
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
		result.append(" (OperationType: ");
		if (operationTypeESet) result.append(operationType); else result.append("<unset>");
		result.append(", CapacityByWeight: ");
		if (capacityByWeightESet) result.append(capacityByWeight); else result.append("<unset>");
		result.append(", CapacityByWeightAsString: ");
		if (capacityByWeightAsStringESet) result.append(capacityByWeightAsString); else result.append("<unset>");
		result.append(", CapacityByNumber: ");
		if (capacityByNumberESet) result.append(capacityByNumber); else result.append("<unset>");
		result.append(", CapacityByNumberAsString: ");
		if (capacityByNumberAsStringESet) result.append(capacityByNumberAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTransportElementImpl
