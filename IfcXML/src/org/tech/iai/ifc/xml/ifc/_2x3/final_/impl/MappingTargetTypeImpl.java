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

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MappingTargetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Target Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MappingTargetTypeImpl#getIfcCartesianTransformationOperatorGroup <em>Ifc Cartesian Transformation Operator Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MappingTargetTypeImpl#getIfcCartesianTransformationOperator <em>Ifc Cartesian Transformation Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingTargetTypeImpl extends EObjectImpl implements MappingTargetType {
	/**
	 * The cached value of the '{@link #getIfcCartesianTransformationOperatorGroup() <em>Ifc Cartesian Transformation Operator Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCartesianTransformationOperatorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcCartesianTransformationOperatorGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingTargetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getMappingTargetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcCartesianTransformationOperatorGroup() {
		if (ifcCartesianTransformationOperatorGroup == null) {
			ifcCartesianTransformationOperatorGroup = new BasicFeatureMap(this, FinalPackage.MAPPING_TARGET_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR_GROUP);
		}
		return ifcCartesianTransformationOperatorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator getIfcCartesianTransformationOperator() {
		return (IfcCartesianTransformationOperator)getIfcCartesianTransformationOperatorGroup().get(FinalPackage.eINSTANCE.getMappingTargetType_IfcCartesianTransformationOperator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCartesianTransformationOperator(IfcCartesianTransformationOperator newIfcCartesianTransformationOperator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcCartesianTransformationOperatorGroup()).basicAdd(FinalPackage.eINSTANCE.getMappingTargetType_IfcCartesianTransformationOperator(), newIfcCartesianTransformationOperator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.MAPPING_TARGET_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR_GROUP:
				return ((InternalEList<?>)getIfcCartesianTransformationOperatorGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.MAPPING_TARGET_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR:
				return basicSetIfcCartesianTransformationOperator(null, msgs);
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
			case FinalPackage.MAPPING_TARGET_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR_GROUP:
				if (coreType) return getIfcCartesianTransformationOperatorGroup();
				return ((FeatureMap.Internal)getIfcCartesianTransformationOperatorGroup()).getWrapper();
			case FinalPackage.MAPPING_TARGET_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR:
				return getIfcCartesianTransformationOperator();
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
			case FinalPackage.MAPPING_TARGET_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR_GROUP:
				((FeatureMap.Internal)getIfcCartesianTransformationOperatorGroup()).set(newValue);
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
			case FinalPackage.MAPPING_TARGET_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR_GROUP:
				getIfcCartesianTransformationOperatorGroup().clear();
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
			case FinalPackage.MAPPING_TARGET_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR_GROUP:
				return ifcCartesianTransformationOperatorGroup != null && !ifcCartesianTransformationOperatorGroup.isEmpty();
			case FinalPackage.MAPPING_TARGET_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR:
				return getIfcCartesianTransformationOperator() != null;
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
		result.append(" (ifcCartesianTransformationOperatorGroup: ");
		result.append(ifcCartesianTransformationOperatorGroup);
		result.append(')');
		return result.toString();
	}

} //MappingTargetTypeImpl
