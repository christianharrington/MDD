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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSystem;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingSystemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingSystemTypeImpl#getIfcSystemGroup <em>Ifc System Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingSystemTypeImpl#getIfcSystem <em>Ifc System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingSystemTypeImpl extends EObjectImpl implements RelatingSystemType {
	/**
	 * The cached value of the '{@link #getIfcSystemGroup() <em>Ifc System Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSystemGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcSystemGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSystemGroup() {
		if (ifcSystemGroup == null) {
			ifcSystemGroup = new BasicFeatureMap(this, FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM_GROUP);
		}
		return ifcSystemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSystem getIfcSystem() {
		return (IfcSystem)getIfcSystemGroup().get(FinalPackage.eINSTANCE.getRelatingSystemType_IfcSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSystem(IfcSystem newIfcSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcSystemGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingSystemType_IfcSystem(), newIfcSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSystem(IfcSystem newIfcSystem) {
		((FeatureMap.Internal)getIfcSystemGroup()).set(FinalPackage.eINSTANCE.getRelatingSystemType_IfcSystem(), newIfcSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM_GROUP:
				return ((InternalEList<?>)getIfcSystemGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM:
				return basicSetIfcSystem(null, msgs);
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
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM_GROUP:
				if (coreType) return getIfcSystemGroup();
				return ((FeatureMap.Internal)getIfcSystemGroup()).getWrapper();
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM:
				return getIfcSystem();
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
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM_GROUP:
				((FeatureMap.Internal)getIfcSystemGroup()).set(newValue);
				return;
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM:
				setIfcSystem((IfcSystem)newValue);
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
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM_GROUP:
				getIfcSystemGroup().clear();
				return;
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM:
				setIfcSystem((IfcSystem)null);
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
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM_GROUP:
				return ifcSystemGroup != null && !ifcSystemGroup.isEmpty();
			case FinalPackage.RELATING_SYSTEM_TYPE__IFC_SYSTEM:
				return getIfcSystem() != null;
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
		result.append(" (ifcSystemGroup: ");
		result.append(ifcSystemGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingSystemTypeImpl
