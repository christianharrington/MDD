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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGroup;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingGroupType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingGroupTypeImpl#getIfcGroupGroup <em>Ifc Group Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingGroupTypeImpl#getIfcGroup <em>Ifc Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingGroupTypeImpl extends EObjectImpl implements RelatingGroupType {
	/**
	 * The cached value of the '{@link #getIfcGroupGroup() <em>Ifc Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcGroupGroup() {
		if (ifcGroupGroup == null) {
			ifcGroupGroup = new BasicFeatureMap(this, FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP_GROUP);
		}
		return ifcGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGroup getIfcGroup() {
		return (IfcGroup)getIfcGroupGroup().get(FinalPackage.eINSTANCE.getRelatingGroupType_IfcGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcGroup(IfcGroup newIfcGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcGroupGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingGroupType_IfcGroup(), newIfcGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcGroup(IfcGroup newIfcGroup) {
		((FeatureMap.Internal)getIfcGroupGroup()).set(FinalPackage.eINSTANCE.getRelatingGroupType_IfcGroup(), newIfcGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP_GROUP:
				return ((InternalEList<?>)getIfcGroupGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP:
				return basicSetIfcGroup(null, msgs);
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
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP_GROUP:
				if (coreType) return getIfcGroupGroup();
				return ((FeatureMap.Internal)getIfcGroupGroup()).getWrapper();
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP:
				return getIfcGroup();
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
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP_GROUP:
				((FeatureMap.Internal)getIfcGroupGroup()).set(newValue);
				return;
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP:
				setIfcGroup((IfcGroup)newValue);
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
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP_GROUP:
				getIfcGroupGroup().clear();
				return;
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP:
				setIfcGroup((IfcGroup)null);
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
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP_GROUP:
				return ifcGroupGroup != null && !ifcGroupGroup.isEmpty();
			case FinalPackage.RELATING_GROUP_TYPE__IFC_GROUP:
				return getIfcGroup() != null;
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
		result.append(" (ifcGroupGroup: ");
		result.append(ifcGroupGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingGroupTypeImpl
