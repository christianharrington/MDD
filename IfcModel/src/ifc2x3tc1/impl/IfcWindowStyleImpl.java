/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcWindowStyle;
import ifc2x3tc1.IfcWindowStyleConstructionEnum;
import ifc2x3tc1.IfcWindowStyleOperationEnum;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowStyleImpl#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowStyleImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowStyleImpl#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWindowStyleImpl#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcWindowStyleImpl extends IfcTypeProductImpl implements IfcWindowStyle {
	/**
	 * The default value of the '{@link #getConstructionType() <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcWindowStyleConstructionEnum CONSTRUCTION_TYPE_EDEFAULT = IfcWindowStyleConstructionEnum.NULL;

	/**
	 * The cached value of the '{@link #getConstructionType() <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructionType()
	 * @generated
	 * @ordered
	 */
	protected IfcWindowStyleConstructionEnum constructionType = CONSTRUCTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcWindowStyleOperationEnum OPERATION_TYPE_EDEFAULT = IfcWindowStyleOperationEnum.NULL;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected IfcWindowStyleOperationEnum operationType = OPERATION_TYPE_EDEFAULT;

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
	protected IfcWindowStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcWindowStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleConstructionEnum getConstructionType() {
		return constructionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionType(IfcWindowStyleConstructionEnum newConstructionType) {
		IfcWindowStyleConstructionEnum oldConstructionType = constructionType;
		constructionType = newConstructionType == null ? CONSTRUCTION_TYPE_EDEFAULT : newConstructionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE, oldConstructionType, constructionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleOperationEnum getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcWindowStyleOperationEnum newOperationType) {
		IfcWindowStyleOperationEnum oldOperationType = operationType;
		operationType = newOperationType == null ? OPERATION_TYPE_EDEFAULT : newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_STYLE__OPERATION_TYPE, oldOperationType, operationType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE, oldParameterTakesPrecedence, parameterTakesPrecedence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WINDOW_STYLE__SIZEABLE, oldSizeable, sizeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE:
				return getConstructionType();
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__OPERATION_TYPE:
				return getOperationType();
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE:
				return getParameterTakesPrecedence();
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__SIZEABLE:
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
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE:
				setConstructionType((IfcWindowStyleConstructionEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__OPERATION_TYPE:
				setOperationType((IfcWindowStyleOperationEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE:
				setParameterTakesPrecedence((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__SIZEABLE:
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
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE:
				setConstructionType(CONSTRUCTION_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE:
				setParameterTakesPrecedence(PARAMETER_TAKES_PRECEDENCE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__SIZEABLE:
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
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE:
				return constructionType != CONSTRUCTION_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__OPERATION_TYPE:
				return operationType != OPERATION_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE:
				return parameterTakesPrecedence != PARAMETER_TAKES_PRECEDENCE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_WINDOW_STYLE__SIZEABLE:
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
		result.append(" (ConstructionType: ");
		result.append(constructionType);
		result.append(", OperationType: ");
		result.append(operationType);
		result.append(", ParameterTakesPrecedence: ");
		result.append(parameterTakesPrecedence);
		result.append(", Sizeable: ");
		result.append(sizeable);
		result.append(')');
		return result.toString();
	}

} //IfcWindowStyleImpl
