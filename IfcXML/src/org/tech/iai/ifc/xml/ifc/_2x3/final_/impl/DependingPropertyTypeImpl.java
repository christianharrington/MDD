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

import org.tech.iai.ifc.xml.ifc._2x3.final_.DependingPropertyType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depending Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DependingPropertyTypeImpl#getIfcPropertyGroup <em>Ifc Property Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.DependingPropertyTypeImpl#getIfcProperty <em>Ifc Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependingPropertyTypeImpl extends EObjectImpl implements DependingPropertyType {
	/**
	 * The cached value of the '{@link #getIfcPropertyGroup() <em>Ifc Property Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPropertyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPropertyGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependingPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getDependingPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPropertyGroup() {
		if (ifcPropertyGroup == null) {
			ifcPropertyGroup = new BasicFeatureMap(this, FinalPackage.DEPENDING_PROPERTY_TYPE__IFC_PROPERTY_GROUP);
		}
		return ifcPropertyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProperty getIfcProperty() {
		return (IfcProperty)getIfcPropertyGroup().get(FinalPackage.eINSTANCE.getDependingPropertyType_IfcProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcProperty(IfcProperty newIfcProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPropertyGroup()).basicAdd(FinalPackage.eINSTANCE.getDependingPropertyType_IfcProperty(), newIfcProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.DEPENDING_PROPERTY_TYPE__IFC_PROPERTY_GROUP:
				return ((InternalEList<?>)getIfcPropertyGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.DEPENDING_PROPERTY_TYPE__IFC_PROPERTY:
				return basicSetIfcProperty(null, msgs);
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
			case FinalPackage.DEPENDING_PROPERTY_TYPE__IFC_PROPERTY_GROUP:
				if (coreType) return getIfcPropertyGroup();
				return ((FeatureMap.Internal)getIfcPropertyGroup()).getWrapper();
			case FinalPackage.DEPENDING_PROPERTY_TYPE__IFC_PROPERTY:
				return getIfcProperty();
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
			case FinalPackage.DEPENDING_PROPERTY_TYPE__IFC_PROPERTY_GROUP:
				((FeatureMap.Internal)getIfcPropertyGroup()).set(newValue);
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
			case FinalPackage.DEPENDING_PROPERTY_TYPE__IFC_PROPERTY_GROUP:
				getIfcPropertyGroup().clear();
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
			case FinalPackage.DEPENDING_PROPERTY_TYPE__IFC_PROPERTY_GROUP:
				return ifcPropertyGroup != null && !ifcPropertyGroup.isEmpty();
			case FinalPackage.DEPENDING_PROPERTY_TYPE__IFC_PROPERTY:
				return getIfcProperty() != null;
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
		result.append(" (ifcPropertyGroup: ");
		result.append(ifcPropertyGroup);
		result.append(')');
		return result.toString();
	}

} //DependingPropertyTypeImpl
