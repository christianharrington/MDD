/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDoorStyle;
import ifc2x3tc1.IfcDoorStyleConstructionEnum;
import ifc2x3tc1.IfcDoorStyleOperationEnum;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorStyleImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorStyleImpl#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorStyleImpl#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDoorStyleImpl#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDoorStyleImpl extends IfcTypeProductImpl implements IfcDoorStyle {
	/**
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDoorStyleOperationEnum OPERATION_TYPE_EDEFAULT = IfcDoorStyleOperationEnum.NULL;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected IfcDoorStyleOperationEnum operationType = OPERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstructionType() <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDoorStyleConstructionEnum CONSTRUCTION_TYPE_EDEFAULT = IfcDoorStyleConstructionEnum.NULL;

	/**
	 * The cached value of the '{@link #getConstructionType() <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionType()
	 * @generated
	 * @ordered
	 */
	protected IfcDoorStyleConstructionEnum constructionType = CONSTRUCTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterTakesPrecedence() <em>Parameter Takes Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTakesPrecedence()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate PARAMETER_TAKES_PRECEDENCE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getParameterTakesPrecedence() <em>Parameter Takes Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTakesPrecedence()
	 * @generated
	 * @ordered
	 */
	protected Tristate parameterTakesPrecedence = PARAMETER_TAKES_PRECEDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeable() <em>Sizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeable()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate SIZEABLE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getSizeable() <em>Sizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeable()
	 * @generated
	 * @ordered
	 */
	protected Tristate sizeable = SIZEABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDoorStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleOperationEnum getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcDoorStyleOperationEnum newOperationType) {
		IfcDoorStyleOperationEnum oldOperationType = operationType;
		operationType = newOperationType == null ? OPERATION_TYPE_EDEFAULT : newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_STYLE__OPERATION_TYPE, oldOperationType, operationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleConstructionEnum getConstructionType() {
		return constructionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionType(IfcDoorStyleConstructionEnum newConstructionType) {
		IfcDoorStyleConstructionEnum oldConstructionType = constructionType;
		constructionType = newConstructionType == null ? CONSTRUCTION_TYPE_EDEFAULT : newConstructionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_STYLE__CONSTRUCTION_TYPE, oldConstructionType, constructionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getParameterTakesPrecedence() {
		return parameterTakesPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTakesPrecedence(Tristate newParameterTakesPrecedence) {
		Tristate oldParameterTakesPrecedence = parameterTakesPrecedence;
		parameterTakesPrecedence = newParameterTakesPrecedence == null ? PARAMETER_TAKES_PRECEDENCE_EDEFAULT : newParameterTakesPrecedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_STYLE__PARAMETER_TAKES_PRECEDENCE, oldParameterTakesPrecedence, parameterTakesPrecedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getSizeable() {
		return sizeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeable(Tristate newSizeable) {
		Tristate oldSizeable = sizeable;
		sizeable = newSizeable == null ? SIZEABLE_EDEFAULT : newSizeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DOOR_STYLE__SIZEABLE, oldSizeable, sizeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__OPERATION_TYPE:
				return getOperationType();
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__CONSTRUCTION_TYPE:
				return getConstructionType();
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__PARAMETER_TAKES_PRECEDENCE:
				return getParameterTakesPrecedence();
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__SIZEABLE:
				return getSizeable();
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
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__OPERATION_TYPE:
				setOperationType((IfcDoorStyleOperationEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__CONSTRUCTION_TYPE:
				setConstructionType((IfcDoorStyleConstructionEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__PARAMETER_TAKES_PRECEDENCE:
				setParameterTakesPrecedence((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__SIZEABLE:
				setSizeable((Tristate)newValue);
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
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__CONSTRUCTION_TYPE:
				setConstructionType(CONSTRUCTION_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__PARAMETER_TAKES_PRECEDENCE:
				setParameterTakesPrecedence(PARAMETER_TAKES_PRECEDENCE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__SIZEABLE:
				setSizeable(SIZEABLE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__OPERATION_TYPE:
				return operationType != OPERATION_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__CONSTRUCTION_TYPE:
				return constructionType != CONSTRUCTION_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__PARAMETER_TAKES_PRECEDENCE:
				return parameterTakesPrecedence != PARAMETER_TAKES_PRECEDENCE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DOOR_STYLE__SIZEABLE:
				return sizeable != SIZEABLE_EDEFAULT;
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
		result.append(operationType);
		result.append(", ConstructionType: ");
		result.append(constructionType);
		result.append(", ParameterTakesPrecedence: ");
		result.append(parameterTakesPrecedence);
		result.append(", Sizeable: ");
		result.append(sizeable);
		result.append(')');
		return result.toString();
	}

} //IfcDoorStyleImpl
