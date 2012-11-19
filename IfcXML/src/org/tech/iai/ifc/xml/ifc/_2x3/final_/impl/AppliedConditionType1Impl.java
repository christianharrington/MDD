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

import org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedConditionType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundaryCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applied Condition Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AppliedConditionType1Impl#getIfcBoundaryConditionGroup <em>Ifc Boundary Condition Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AppliedConditionType1Impl#getIfcBoundaryCondition <em>Ifc Boundary Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppliedConditionType1Impl extends EObjectImpl implements AppliedConditionType1 {
	/**
	 * The cached value of the '{@link #getIfcBoundaryConditionGroup() <em>Ifc Boundary Condition Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcBoundaryConditionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcBoundaryConditionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppliedConditionType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getAppliedConditionType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcBoundaryConditionGroup() {
		if (ifcBoundaryConditionGroup == null) {
			ifcBoundaryConditionGroup = new BasicFeatureMap(this, FinalPackage.APPLIED_CONDITION_TYPE1__IFC_BOUNDARY_CONDITION_GROUP);
		}
		return ifcBoundaryConditionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryCondition getIfcBoundaryCondition() {
		return (IfcBoundaryCondition)getIfcBoundaryConditionGroup().get(FinalPackage.eINSTANCE.getAppliedConditionType1_IfcBoundaryCondition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcBoundaryCondition(IfcBoundaryCondition newIfcBoundaryCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcBoundaryConditionGroup()).basicAdd(FinalPackage.eINSTANCE.getAppliedConditionType1_IfcBoundaryCondition(), newIfcBoundaryCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.APPLIED_CONDITION_TYPE1__IFC_BOUNDARY_CONDITION_GROUP:
				return ((InternalEList<?>)getIfcBoundaryConditionGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.APPLIED_CONDITION_TYPE1__IFC_BOUNDARY_CONDITION:
				return basicSetIfcBoundaryCondition(null, msgs);
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
			case FinalPackage.APPLIED_CONDITION_TYPE1__IFC_BOUNDARY_CONDITION_GROUP:
				if (coreType) return getIfcBoundaryConditionGroup();
				return ((FeatureMap.Internal)getIfcBoundaryConditionGroup()).getWrapper();
			case FinalPackage.APPLIED_CONDITION_TYPE1__IFC_BOUNDARY_CONDITION:
				return getIfcBoundaryCondition();
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
			case FinalPackage.APPLIED_CONDITION_TYPE1__IFC_BOUNDARY_CONDITION_GROUP:
				((FeatureMap.Internal)getIfcBoundaryConditionGroup()).set(newValue);
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
			case FinalPackage.APPLIED_CONDITION_TYPE1__IFC_BOUNDARY_CONDITION_GROUP:
				getIfcBoundaryConditionGroup().clear();
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
			case FinalPackage.APPLIED_CONDITION_TYPE1__IFC_BOUNDARY_CONDITION_GROUP:
				return ifcBoundaryConditionGroup != null && !ifcBoundaryConditionGroup.isEmpty();
			case FinalPackage.APPLIED_CONDITION_TYPE1__IFC_BOUNDARY_CONDITION:
				return getIfcBoundaryCondition() != null;
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
		result.append(" (ifcBoundaryConditionGroup: ");
		result.append(ifcBoundaryConditionGroup);
		result.append(')');
		return result.toString();
	}

} //AppliedConditionType1Impl
