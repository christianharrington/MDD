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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySetDefinition;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingPropertyDefinitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Property Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingPropertyDefinitionTypeImpl#getIfcPropertySetDefinitionGroup <em>Ifc Property Set Definition Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingPropertyDefinitionTypeImpl#getIfcPropertySetDefinition <em>Ifc Property Set Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingPropertyDefinitionTypeImpl extends EObjectImpl implements RelatingPropertyDefinitionType {
	/**
	 * The cached value of the '{@link #getIfcPropertySetDefinitionGroup() <em>Ifc Property Set Definition Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPropertySetDefinitionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPropertySetDefinitionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingPropertyDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingPropertyDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPropertySetDefinitionGroup() {
		if (ifcPropertySetDefinitionGroup == null) {
			ifcPropertySetDefinitionGroup = new BasicFeatureMap(this, FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE__IFC_PROPERTY_SET_DEFINITION_GROUP);
		}
		return ifcPropertySetDefinitionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySetDefinition getIfcPropertySetDefinition() {
		return (IfcPropertySetDefinition)getIfcPropertySetDefinitionGroup().get(FinalPackage.eINSTANCE.getRelatingPropertyDefinitionType_IfcPropertySetDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPropertySetDefinition(IfcPropertySetDefinition newIfcPropertySetDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPropertySetDefinitionGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingPropertyDefinitionType_IfcPropertySetDefinition(), newIfcPropertySetDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE__IFC_PROPERTY_SET_DEFINITION_GROUP:
				return ((InternalEList<?>)getIfcPropertySetDefinitionGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE__IFC_PROPERTY_SET_DEFINITION:
				return basicSetIfcPropertySetDefinition(null, msgs);
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
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE__IFC_PROPERTY_SET_DEFINITION_GROUP:
				if (coreType) return getIfcPropertySetDefinitionGroup();
				return ((FeatureMap.Internal)getIfcPropertySetDefinitionGroup()).getWrapper();
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE__IFC_PROPERTY_SET_DEFINITION:
				return getIfcPropertySetDefinition();
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
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE__IFC_PROPERTY_SET_DEFINITION_GROUP:
				((FeatureMap.Internal)getIfcPropertySetDefinitionGroup()).set(newValue);
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
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE__IFC_PROPERTY_SET_DEFINITION_GROUP:
				getIfcPropertySetDefinitionGroup().clear();
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
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE__IFC_PROPERTY_SET_DEFINITION_GROUP:
				return ifcPropertySetDefinitionGroup != null && !ifcPropertySetDefinitionGroup.isEmpty();
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE__IFC_PROPERTY_SET_DEFINITION:
				return getIfcPropertySetDefinition() != null;
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
		result.append(" (ifcPropertySetDefinitionGroup: ");
		result.append(ifcPropertySetDefinitionGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingPropertyDefinitionTypeImpl
