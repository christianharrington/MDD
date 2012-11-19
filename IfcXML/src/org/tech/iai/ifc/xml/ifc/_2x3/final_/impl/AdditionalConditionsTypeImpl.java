/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AdditionalConditionsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralConnectionCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AdditionalConditionsTypeImpl#getIfcStructuralConnectionConditionGroup <em>Ifc Structural Connection Condition Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AdditionalConditionsTypeImpl#getIfcStructuralConnectionCondition <em>Ifc Structural Connection Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalConditionsTypeImpl extends EObjectImpl implements AdditionalConditionsType {
	/**
	 * The cached value of the '{@link #getIfcStructuralConnectionConditionGroup() <em>Ifc Structural Connection Condition Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcStructuralConnectionConditionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcStructuralConnectionConditionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getAdditionalConditionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcStructuralConnectionConditionGroup() {
		if (ifcStructuralConnectionConditionGroup == null) {
			ifcStructuralConnectionConditionGroup = new BasicFeatureMap(this, FinalPackage.ADDITIONAL_CONDITIONS_TYPE__IFC_STRUCTURAL_CONNECTION_CONDITION_GROUP);
		}
		return ifcStructuralConnectionConditionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralConnectionCondition getIfcStructuralConnectionCondition() {
		return (IfcStructuralConnectionCondition)getIfcStructuralConnectionConditionGroup().get(FinalPackage.eINSTANCE.getAdditionalConditionsType_IfcStructuralConnectionCondition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcStructuralConnectionCondition(IfcStructuralConnectionCondition newIfcStructuralConnectionCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcStructuralConnectionConditionGroup()).basicAdd(FinalPackage.eINSTANCE.getAdditionalConditionsType_IfcStructuralConnectionCondition(), newIfcStructuralConnectionCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE__IFC_STRUCTURAL_CONNECTION_CONDITION_GROUP:
				return ((InternalEList<?>)getIfcStructuralConnectionConditionGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE__IFC_STRUCTURAL_CONNECTION_CONDITION:
				return basicSetIfcStructuralConnectionCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE__IFC_STRUCTURAL_CONNECTION_CONDITION_GROUP:
				if (coreType) return getIfcStructuralConnectionConditionGroup();
				return ((FeatureMap.Internal)getIfcStructuralConnectionConditionGroup()).getWrapper();
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE__IFC_STRUCTURAL_CONNECTION_CONDITION:
				return getIfcStructuralConnectionCondition();
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
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE__IFC_STRUCTURAL_CONNECTION_CONDITION_GROUP:
				((FeatureMap.Internal)getIfcStructuralConnectionConditionGroup()).set(newValue);
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
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE__IFC_STRUCTURAL_CONNECTION_CONDITION_GROUP:
				getIfcStructuralConnectionConditionGroup().clear();
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
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE__IFC_STRUCTURAL_CONNECTION_CONDITION_GROUP:
				return ifcStructuralConnectionConditionGroup != null && !ifcStructuralConnectionConditionGroup.isEmpty();
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE__IFC_STRUCTURAL_CONNECTION_CONDITION:
				return getIfcStructuralConnectionCondition() != null;
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
		result.append(" (ifcStructuralConnectionConditionGroup: ");
		result.append(ifcStructuralConnectionConditionGroup);
		result.append(')');
		return result.toString();
	}

} //AdditionalConditionsTypeImpl
