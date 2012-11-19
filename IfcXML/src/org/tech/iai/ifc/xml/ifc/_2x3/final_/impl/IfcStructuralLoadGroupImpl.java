/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcActionSourceTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcActionTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLoadGroupTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadGroupImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadGroupImpl#getActionType <em>Action Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadGroupImpl#getActionSource <em>Action Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadGroupImpl#getCoefficient <em>Coefficient</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadGroupImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadGroupImpl extends IfcGroupImpl implements IfcStructuralLoadGroup {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcLoadGroupTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcLoadGroupTypeEnum.LOAD_GROUP;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcLoadGroupTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcActionTypeEnum ACTION_TYPE_EDEFAULT = IfcActionTypeEnum.PERMANENT_G;

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected IfcActionTypeEnum actionType = ACTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionSource() <em>Action Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSource()
	 * @generated
	 * @ordered
	 */
	protected static final IfcActionSourceTypeEnum ACTION_SOURCE_EDEFAULT = IfcActionSourceTypeEnum.DEAD_LOAD_G;

	/**
	 * The cached value of the '{@link #getActionSource() <em>Action Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSource()
	 * @generated
	 * @ordered
	 */
	protected IfcActionSourceTypeEnum actionSource = ACTION_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoefficient() <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final Double COEFFICIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoefficient() <em>Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient()
	 * @generated
	 * @ordered
	 */
	protected Double coefficient = COEFFICIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralLoadGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLoadGroupTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcLoadGroupTypeEnum newPredefinedType) {
		IfcLoadGroupTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionTypeEnum getActionType() {
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionType(IfcActionTypeEnum newActionType) {
		IfcActionTypeEnum oldActionType = actionType;
		actionType = newActionType == null ? ACTION_TYPE_EDEFAULT : newActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE, oldActionType, actionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionSourceTypeEnum getActionSource() {
		return actionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionSource(IfcActionSourceTypeEnum newActionSource) {
		IfcActionSourceTypeEnum oldActionSource = actionSource;
		actionSource = newActionSource == null ? ACTION_SOURCE_EDEFAULT : newActionSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE, oldActionSource, actionSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCoefficient() {
		return coefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficient(Double newCoefficient) {
		Double oldCoefficient = coefficient;
		coefficient = newCoefficient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT, oldCoefficient, coefficient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE:
				return getPredefinedType();
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE:
				return getActionType();
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE:
				return getActionSource();
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT:
				return getCoefficient();
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE:
				return getPurpose();
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE:
				setPredefinedType((IfcLoadGroupTypeEnum)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE:
				setActionType((IfcActionTypeEnum)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE:
				setActionSource((IfcActionSourceTypeEnum)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT:
				setCoefficient((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE:
				setPurpose((String)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE:
				setActionType(ACTION_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE:
				setActionSource(ACTION_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT:
				setCoefficient(COEFFICIENT_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_TYPE:
				return actionType != ACTION_TYPE_EDEFAULT;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__ACTION_SOURCE:
				return actionSource != ACTION_SOURCE_EDEFAULT;
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__COEFFICIENT:
				return COEFFICIENT_EDEFAULT == null ? coefficient != null : !COEFFICIENT_EDEFAULT.equals(coefficient);
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
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
		result.append(", actionType: ");
		result.append(actionType);
		result.append(", actionSource: ");
		result.append(actionSource);
		result.append(", coefficient: ");
		result.append(coefficient);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadGroupImpl
