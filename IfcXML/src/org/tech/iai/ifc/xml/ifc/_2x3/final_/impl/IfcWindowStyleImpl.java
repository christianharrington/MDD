/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowStyle;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowStyleConstructionEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowStyleOperationEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Window Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowStyleImpl#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowStyleImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowStyleImpl#isParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWindowStyleImpl#isSizeable <em>Sizeable</em>}</li>
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
	protected static final IfcWindowStyleConstructionEnum CONSTRUCTION_TYPE_EDEFAULT = IfcWindowStyleConstructionEnum.ALUMINIUM;

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
	protected static final IfcWindowStyleOperationEnum OPERATION_TYPE_EDEFAULT = IfcWindowStyleOperationEnum.SINGLE_PANEL;

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
	 * The default value of the '{@link #isParameterTakesPrecedence() <em>Parameter Takes Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameterTakesPrecedence()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARAMETER_TAKES_PRECEDENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParameterTakesPrecedence() <em>Parameter Takes Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameterTakesPrecedence()
	 * @generated
	 * @ordered
	 */
	protected boolean parameterTakesPrecedence = PARAMETER_TAKES_PRECEDENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSizeable() <em>Sizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSizeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIZEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSizeable() <em>Sizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSizeable()
	 * @generated
	 * @ordered
	 */
	protected boolean sizeable = SIZEABLE_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcWindowStyle();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE, oldConstructionType, constructionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_STYLE__OPERATION_TYPE, oldOperationType, operationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParameterTakesPrecedence() {
		return parameterTakesPrecedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTakesPrecedence(boolean newParameterTakesPrecedence) {
		boolean oldParameterTakesPrecedence = parameterTakesPrecedence;
		parameterTakesPrecedence = newParameterTakesPrecedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE, oldParameterTakesPrecedence, parameterTakesPrecedence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSizeable() {
		return sizeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeable(boolean newSizeable) {
		boolean oldSizeable = sizeable;
		sizeable = newSizeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WINDOW_STYLE__SIZEABLE, oldSizeable, sizeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE:
				return getConstructionType();
			case FinalPackage.IFC_WINDOW_STYLE__OPERATION_TYPE:
				return getOperationType();
			case FinalPackage.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE:
				return isParameterTakesPrecedence();
			case FinalPackage.IFC_WINDOW_STYLE__SIZEABLE:
				return isSizeable();
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
			case FinalPackage.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE:
				setConstructionType((IfcWindowStyleConstructionEnum)newValue);
				return;
			case FinalPackage.IFC_WINDOW_STYLE__OPERATION_TYPE:
				setOperationType((IfcWindowStyleOperationEnum)newValue);
				return;
			case FinalPackage.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE:
				setParameterTakesPrecedence((Boolean)newValue);
				return;
			case FinalPackage.IFC_WINDOW_STYLE__SIZEABLE:
				setSizeable((Boolean)newValue);
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
			case FinalPackage.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE:
				setConstructionType(CONSTRUCTION_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_STYLE__OPERATION_TYPE:
				setOperationType(OPERATION_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE:
				setParameterTakesPrecedence(PARAMETER_TAKES_PRECEDENCE_EDEFAULT);
				return;
			case FinalPackage.IFC_WINDOW_STYLE__SIZEABLE:
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
			case FinalPackage.IFC_WINDOW_STYLE__CONSTRUCTION_TYPE:
				return constructionType != CONSTRUCTION_TYPE_EDEFAULT;
			case FinalPackage.IFC_WINDOW_STYLE__OPERATION_TYPE:
				return operationType != OPERATION_TYPE_EDEFAULT;
			case FinalPackage.IFC_WINDOW_STYLE__PARAMETER_TAKES_PRECEDENCE:
				return parameterTakesPrecedence != PARAMETER_TAKES_PRECEDENCE_EDEFAULT;
			case FinalPackage.IFC_WINDOW_STYLE__SIZEABLE:
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
		result.append(" (constructionType: ");
		result.append(constructionType);
		result.append(", operationType: ");
		result.append(operationType);
		result.append(", parameterTakesPrecedence: ");
		result.append(parameterTakesPrecedence);
		result.append(", sizeable: ");
		result.append(sizeable);
		result.append(')');
		return result.toString();
	}

} //IfcWindowStyleImpl
