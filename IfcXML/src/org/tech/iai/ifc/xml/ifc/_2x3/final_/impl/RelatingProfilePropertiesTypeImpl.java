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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProfileProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingProfilePropertiesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Profile Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingProfilePropertiesTypeImpl#getIfcProfilePropertiesGroup <em>Ifc Profile Properties Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingProfilePropertiesTypeImpl#getIfcProfileProperties <em>Ifc Profile Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingProfilePropertiesTypeImpl extends EObjectImpl implements RelatingProfilePropertiesType {
	/**
	 * The cached value of the '{@link #getIfcProfilePropertiesGroup() <em>Ifc Profile Properties Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcProfilePropertiesGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcProfilePropertiesGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingProfilePropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingProfilePropertiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcProfilePropertiesGroup() {
		if (ifcProfilePropertiesGroup == null) {
			ifcProfilePropertiesGroup = new BasicFeatureMap(this, FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE__IFC_PROFILE_PROPERTIES_GROUP);
		}
		return ifcProfilePropertiesGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileProperties getIfcProfileProperties() {
		return (IfcProfileProperties)getIfcProfilePropertiesGroup().get(FinalPackage.eINSTANCE.getRelatingProfilePropertiesType_IfcProfileProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcProfileProperties(IfcProfileProperties newIfcProfileProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcProfilePropertiesGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingProfilePropertiesType_IfcProfileProperties(), newIfcProfileProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE__IFC_PROFILE_PROPERTIES_GROUP:
				return ((InternalEList<?>)getIfcProfilePropertiesGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE__IFC_PROFILE_PROPERTIES:
				return basicSetIfcProfileProperties(null, msgs);
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
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE__IFC_PROFILE_PROPERTIES_GROUP:
				if (coreType) return getIfcProfilePropertiesGroup();
				return ((FeatureMap.Internal)getIfcProfilePropertiesGroup()).getWrapper();
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE__IFC_PROFILE_PROPERTIES:
				return getIfcProfileProperties();
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
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE__IFC_PROFILE_PROPERTIES_GROUP:
				((FeatureMap.Internal)getIfcProfilePropertiesGroup()).set(newValue);
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
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE__IFC_PROFILE_PROPERTIES_GROUP:
				getIfcProfilePropertiesGroup().clear();
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
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE__IFC_PROFILE_PROPERTIES_GROUP:
				return ifcProfilePropertiesGroup != null && !ifcProfilePropertiesGroup.isEmpty();
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE__IFC_PROFILE_PROPERTIES:
				return getIfcProfileProperties() != null;
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
		result.append(" (ifcProfilePropertiesGroup: ");
		result.append(ifcProfilePropertiesGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingProfilePropertiesTypeImpl
