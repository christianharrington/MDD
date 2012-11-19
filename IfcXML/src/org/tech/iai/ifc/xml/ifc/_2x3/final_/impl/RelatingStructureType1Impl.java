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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpatialStructureElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingStructureType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Structure Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingStructureType1Impl#getIfcSpatialStructureElementGroup <em>Ifc Spatial Structure Element Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingStructureType1Impl#getIfcSpatialStructureElement <em>Ifc Spatial Structure Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingStructureType1Impl extends EObjectImpl implements RelatingStructureType1 {
	/**
	 * The cached value of the '{@link #getIfcSpatialStructureElementGroup() <em>Ifc Spatial Structure Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSpatialStructureElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcSpatialStructureElementGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingStructureType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingStructureType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSpatialStructureElementGroup() {
		if (ifcSpatialStructureElementGroup == null) {
			ifcSpatialStructureElementGroup = new BasicFeatureMap(this, FinalPackage.RELATING_STRUCTURE_TYPE1__IFC_SPATIAL_STRUCTURE_ELEMENT_GROUP);
		}
		return ifcSpatialStructureElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpatialStructureElement getIfcSpatialStructureElement() {
		return (IfcSpatialStructureElement)getIfcSpatialStructureElementGroup().get(FinalPackage.eINSTANCE.getRelatingStructureType1_IfcSpatialStructureElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSpatialStructureElement(IfcSpatialStructureElement newIfcSpatialStructureElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcSpatialStructureElementGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingStructureType1_IfcSpatialStructureElement(), newIfcSpatialStructureElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_STRUCTURE_TYPE1__IFC_SPATIAL_STRUCTURE_ELEMENT_GROUP:
				return ((InternalEList<?>)getIfcSpatialStructureElementGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_STRUCTURE_TYPE1__IFC_SPATIAL_STRUCTURE_ELEMENT:
				return basicSetIfcSpatialStructureElement(null, msgs);
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
			case FinalPackage.RELATING_STRUCTURE_TYPE1__IFC_SPATIAL_STRUCTURE_ELEMENT_GROUP:
				if (coreType) return getIfcSpatialStructureElementGroup();
				return ((FeatureMap.Internal)getIfcSpatialStructureElementGroup()).getWrapper();
			case FinalPackage.RELATING_STRUCTURE_TYPE1__IFC_SPATIAL_STRUCTURE_ELEMENT:
				return getIfcSpatialStructureElement();
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
			case FinalPackage.RELATING_STRUCTURE_TYPE1__IFC_SPATIAL_STRUCTURE_ELEMENT_GROUP:
				((FeatureMap.Internal)getIfcSpatialStructureElementGroup()).set(newValue);
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
			case FinalPackage.RELATING_STRUCTURE_TYPE1__IFC_SPATIAL_STRUCTURE_ELEMENT_GROUP:
				getIfcSpatialStructureElementGroup().clear();
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
			case FinalPackage.RELATING_STRUCTURE_TYPE1__IFC_SPATIAL_STRUCTURE_ELEMENT_GROUP:
				return ifcSpatialStructureElementGroup != null && !ifcSpatialStructureElementGroup.isEmpty();
			case FinalPackage.RELATING_STRUCTURE_TYPE1__IFC_SPATIAL_STRUCTURE_ELEMENT:
				return getIfcSpatialStructureElement() != null;
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
		result.append(" (ifcSpatialStructureElementGroup: ");
		result.append(ifcSpatialStructureElementGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingStructureType1Impl
