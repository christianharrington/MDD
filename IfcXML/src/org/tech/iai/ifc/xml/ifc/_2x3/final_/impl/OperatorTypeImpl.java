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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator2D;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OperatorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.OperatorTypeImpl#getIfcCartesianTransformationOperator2DGroup <em>Ifc Cartesian Transformation Operator2 DGroup</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.OperatorTypeImpl#getIfcCartesianTransformationOperator2D <em>Ifc Cartesian Transformation Operator2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorTypeImpl extends EObjectImpl implements OperatorType {
	/**
	 * The cached value of the '{@link #getIfcCartesianTransformationOperator2DGroup() <em>Ifc Cartesian Transformation Operator2 DGroup</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCartesianTransformationOperator2DGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcCartesianTransformationOperator2DGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getOperatorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcCartesianTransformationOperator2DGroup() {
		if (ifcCartesianTransformationOperator2DGroup == null) {
			ifcCartesianTransformationOperator2DGroup = new BasicFeatureMap(this, FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DGROUP);
		}
		return ifcCartesianTransformationOperator2DGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D getIfcCartesianTransformationOperator2D() {
		return (IfcCartesianTransformationOperator2D)getIfcCartesianTransformationOperator2DGroup().get(FinalPackage.eINSTANCE.getOperatorType_IfcCartesianTransformationOperator2D(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCartesianTransformationOperator2D(IfcCartesianTransformationOperator2D newIfcCartesianTransformationOperator2D, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcCartesianTransformationOperator2DGroup()).basicAdd(FinalPackage.eINSTANCE.getOperatorType_IfcCartesianTransformationOperator2D(), newIfcCartesianTransformationOperator2D, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCartesianTransformationOperator2D(IfcCartesianTransformationOperator2D newIfcCartesianTransformationOperator2D) {
		((FeatureMap.Internal)getIfcCartesianTransformationOperator2DGroup()).set(FinalPackage.eINSTANCE.getOperatorType_IfcCartesianTransformationOperator2D(), newIfcCartesianTransformationOperator2D);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DGROUP:
				return ((InternalEList<?>)getIfcCartesianTransformationOperator2DGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_D:
				return basicSetIfcCartesianTransformationOperator2D(null, msgs);
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
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DGROUP:
				if (coreType) return getIfcCartesianTransformationOperator2DGroup();
				return ((FeatureMap.Internal)getIfcCartesianTransformationOperator2DGroup()).getWrapper();
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_D:
				return getIfcCartesianTransformationOperator2D();
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
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DGROUP:
				((FeatureMap.Internal)getIfcCartesianTransformationOperator2DGroup()).set(newValue);
				return;
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_D:
				setIfcCartesianTransformationOperator2D((IfcCartesianTransformationOperator2D)newValue);
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
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DGROUP:
				getIfcCartesianTransformationOperator2DGroup().clear();
				return;
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_D:
				setIfcCartesianTransformationOperator2D((IfcCartesianTransformationOperator2D)null);
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
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DGROUP:
				return ifcCartesianTransformationOperator2DGroup != null && !ifcCartesianTransformationOperator2DGroup.isEmpty();
			case FinalPackage.OPERATOR_TYPE__IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_D:
				return getIfcCartesianTransformationOperator2D() != null;
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
		result.append(" (ifcCartesianTransformationOperator2DGroup: ");
		result.append(ifcCartesianTransformationOperator2DGroup);
		result.append(')');
		return result.toString();
	}

} //OperatorTypeImpl
