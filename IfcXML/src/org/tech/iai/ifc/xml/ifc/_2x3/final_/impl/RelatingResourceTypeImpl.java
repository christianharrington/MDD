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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcResource;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingResourceTypeImpl#getIfcResourceGroup <em>Ifc Resource Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingResourceTypeImpl#getIfcResource <em>Ifc Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingResourceTypeImpl extends EObjectImpl implements RelatingResourceType {
	/**
	 * The cached value of the '{@link #getIfcResourceGroup() <em>Ifc Resource Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcResourceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcResourceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingResourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcResourceGroup() {
		if (ifcResourceGroup == null) {
			ifcResourceGroup = new BasicFeatureMap(this, FinalPackage.RELATING_RESOURCE_TYPE__IFC_RESOURCE_GROUP);
		}
		return ifcResourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcResource getIfcResource() {
		return (IfcResource)getIfcResourceGroup().get(FinalPackage.eINSTANCE.getRelatingResourceType_IfcResource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcResource(IfcResource newIfcResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcResourceGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingResourceType_IfcResource(), newIfcResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_RESOURCE_TYPE__IFC_RESOURCE_GROUP:
				return ((InternalEList<?>)getIfcResourceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_RESOURCE_TYPE__IFC_RESOURCE:
				return basicSetIfcResource(null, msgs);
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
			case FinalPackage.RELATING_RESOURCE_TYPE__IFC_RESOURCE_GROUP:
				if (coreType) return getIfcResourceGroup();
				return ((FeatureMap.Internal)getIfcResourceGroup()).getWrapper();
			case FinalPackage.RELATING_RESOURCE_TYPE__IFC_RESOURCE:
				return getIfcResource();
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
			case FinalPackage.RELATING_RESOURCE_TYPE__IFC_RESOURCE_GROUP:
				((FeatureMap.Internal)getIfcResourceGroup()).set(newValue);
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
			case FinalPackage.RELATING_RESOURCE_TYPE__IFC_RESOURCE_GROUP:
				getIfcResourceGroup().clear();
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
			case FinalPackage.RELATING_RESOURCE_TYPE__IFC_RESOURCE_GROUP:
				return ifcResourceGroup != null && !ifcResourceGroup.isEmpty();
			case FinalPackage.RELATING_RESOURCE_TYPE__IFC_RESOURCE:
				return getIfcResource() != null;
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
		result.append(" (ifcResourceGroup: ");
		result.append(ifcResourceGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingResourceTypeImpl
