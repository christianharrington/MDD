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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcObjectDefinition;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingObjectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingObjectTypeImpl#getIfcObjectDefinitionGroup <em>Ifc Object Definition Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingObjectTypeImpl#getIfcObjectDefinition <em>Ifc Object Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingObjectTypeImpl extends EObjectImpl implements RelatingObjectType {
	/**
	 * The cached value of the '{@link #getIfcObjectDefinitionGroup() <em>Ifc Object Definition Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcObjectDefinitionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcObjectDefinitionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingObjectType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcObjectDefinitionGroup() {
		if (ifcObjectDefinitionGroup == null) {
			ifcObjectDefinitionGroup = new BasicFeatureMap(this, FinalPackage.RELATING_OBJECT_TYPE__IFC_OBJECT_DEFINITION_GROUP);
		}
		return ifcObjectDefinitionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectDefinition getIfcObjectDefinition() {
		return (IfcObjectDefinition)getIfcObjectDefinitionGroup().get(FinalPackage.eINSTANCE.getRelatingObjectType_IfcObjectDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcObjectDefinition(IfcObjectDefinition newIfcObjectDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcObjectDefinitionGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingObjectType_IfcObjectDefinition(), newIfcObjectDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_OBJECT_TYPE__IFC_OBJECT_DEFINITION_GROUP:
				return ((InternalEList<?>)getIfcObjectDefinitionGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_OBJECT_TYPE__IFC_OBJECT_DEFINITION:
				return basicSetIfcObjectDefinition(null, msgs);
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
			case FinalPackage.RELATING_OBJECT_TYPE__IFC_OBJECT_DEFINITION_GROUP:
				if (coreType) return getIfcObjectDefinitionGroup();
				return ((FeatureMap.Internal)getIfcObjectDefinitionGroup()).getWrapper();
			case FinalPackage.RELATING_OBJECT_TYPE__IFC_OBJECT_DEFINITION:
				return getIfcObjectDefinition();
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
			case FinalPackage.RELATING_OBJECT_TYPE__IFC_OBJECT_DEFINITION_GROUP:
				((FeatureMap.Internal)getIfcObjectDefinitionGroup()).set(newValue);
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
			case FinalPackage.RELATING_OBJECT_TYPE__IFC_OBJECT_DEFINITION_GROUP:
				getIfcObjectDefinitionGroup().clear();
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
			case FinalPackage.RELATING_OBJECT_TYPE__IFC_OBJECT_DEFINITION_GROUP:
				return ifcObjectDefinitionGroup != null && !ifcObjectDefinitionGroup.isEmpty();
			case FinalPackage.RELATING_OBJECT_TYPE__IFC_OBJECT_DEFINITION:
				return getIfcObjectDefinition() != null;
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
		result.append(" (ifcObjectDefinitionGroup: ");
		result.append(ifcObjectDefinitionGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingObjectTypeImpl
