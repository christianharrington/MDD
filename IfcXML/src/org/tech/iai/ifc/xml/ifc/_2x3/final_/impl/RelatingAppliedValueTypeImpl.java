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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingAppliedValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Applied Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingAppliedValueTypeImpl#getIfcAppliedValueGroup <em>Ifc Applied Value Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingAppliedValueTypeImpl#getIfcAppliedValue <em>Ifc Applied Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingAppliedValueTypeImpl extends EObjectImpl implements RelatingAppliedValueType {
	/**
	 * The cached value of the '{@link #getIfcAppliedValueGroup() <em>Ifc Applied Value Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAppliedValueGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcAppliedValueGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingAppliedValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingAppliedValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcAppliedValueGroup() {
		if (ifcAppliedValueGroup == null) {
			ifcAppliedValueGroup = new BasicFeatureMap(this, FinalPackage.RELATING_APPLIED_VALUE_TYPE__IFC_APPLIED_VALUE_GROUP);
		}
		return ifcAppliedValueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValue getIfcAppliedValue() {
		return (IfcAppliedValue)getIfcAppliedValueGroup().get(FinalPackage.eINSTANCE.getRelatingAppliedValueType_IfcAppliedValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAppliedValue(IfcAppliedValue newIfcAppliedValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcAppliedValueGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingAppliedValueType_IfcAppliedValue(), newIfcAppliedValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE__IFC_APPLIED_VALUE_GROUP:
				return ((InternalEList<?>)getIfcAppliedValueGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE__IFC_APPLIED_VALUE:
				return basicSetIfcAppliedValue(null, msgs);
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
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE__IFC_APPLIED_VALUE_GROUP:
				if (coreType) return getIfcAppliedValueGroup();
				return ((FeatureMap.Internal)getIfcAppliedValueGroup()).getWrapper();
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE__IFC_APPLIED_VALUE:
				return getIfcAppliedValue();
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
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE__IFC_APPLIED_VALUE_GROUP:
				((FeatureMap.Internal)getIfcAppliedValueGroup()).set(newValue);
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
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE__IFC_APPLIED_VALUE_GROUP:
				getIfcAppliedValueGroup().clear();
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
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE__IFC_APPLIED_VALUE_GROUP:
				return ifcAppliedValueGroup != null && !ifcAppliedValueGroup.isEmpty();
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE__IFC_APPLIED_VALUE:
				return getIfcAppliedValue() != null;
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
		result.append(" (ifcAppliedValueGroup: ");
		result.append(ifcAppliedValueGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingAppliedValueTypeImpl
