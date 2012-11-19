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

import org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedLoadType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoad;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applied Load Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AppliedLoadTypeImpl#getIfcStructuralLoadGroup <em>Ifc Structural Load Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AppliedLoadTypeImpl#getIfcStructuralLoad <em>Ifc Structural Load</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppliedLoadTypeImpl extends EObjectImpl implements AppliedLoadType {
	/**
	 * The cached value of the '{@link #getIfcStructuralLoadGroup() <em>Ifc Structural Load Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcStructuralLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcStructuralLoadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppliedLoadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getAppliedLoadType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcStructuralLoadGroup() {
		if (ifcStructuralLoadGroup == null) {
			ifcStructuralLoadGroup = new BasicFeatureMap(this, FinalPackage.APPLIED_LOAD_TYPE__IFC_STRUCTURAL_LOAD_GROUP);
		}
		return ifcStructuralLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoad getIfcStructuralLoad() {
		return (IfcStructuralLoad)getIfcStructuralLoadGroup().get(FinalPackage.eINSTANCE.getAppliedLoadType_IfcStructuralLoad(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcStructuralLoad(IfcStructuralLoad newIfcStructuralLoad, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcStructuralLoadGroup()).basicAdd(FinalPackage.eINSTANCE.getAppliedLoadType_IfcStructuralLoad(), newIfcStructuralLoad, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.APPLIED_LOAD_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				return ((InternalEList<?>)getIfcStructuralLoadGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.APPLIED_LOAD_TYPE__IFC_STRUCTURAL_LOAD:
				return basicSetIfcStructuralLoad(null, msgs);
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
			case FinalPackage.APPLIED_LOAD_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				if (coreType) return getIfcStructuralLoadGroup();
				return ((FeatureMap.Internal)getIfcStructuralLoadGroup()).getWrapper();
			case FinalPackage.APPLIED_LOAD_TYPE__IFC_STRUCTURAL_LOAD:
				return getIfcStructuralLoad();
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
			case FinalPackage.APPLIED_LOAD_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				((FeatureMap.Internal)getIfcStructuralLoadGroup()).set(newValue);
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
			case FinalPackage.APPLIED_LOAD_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				getIfcStructuralLoadGroup().clear();
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
			case FinalPackage.APPLIED_LOAD_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				return ifcStructuralLoadGroup != null && !ifcStructuralLoadGroup.isEmpty();
			case FinalPackage.APPLIED_LOAD_TYPE__IFC_STRUCTURAL_LOAD:
				return getIfcStructuralLoad() != null;
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
		result.append(" (ifcStructuralLoadGroup: ");
		result.append(ifcStructuralLoadGroup);
		result.append(')');
		return result.toString();
	}

} //AppliedLoadTypeImpl
