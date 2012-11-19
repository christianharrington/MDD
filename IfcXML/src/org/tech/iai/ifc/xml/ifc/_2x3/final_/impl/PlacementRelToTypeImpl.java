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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcObjectPlacement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementRelToType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placement Rel To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PlacementRelToTypeImpl#getIfcObjectPlacementGroup <em>Ifc Object Placement Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PlacementRelToTypeImpl#getIfcObjectPlacement <em>Ifc Object Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlacementRelToTypeImpl extends EObjectImpl implements PlacementRelToType {
	/**
	 * The cached value of the '{@link #getIfcObjectPlacementGroup() <em>Ifc Object Placement Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcObjectPlacementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcObjectPlacementGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacementRelToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getPlacementRelToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcObjectPlacementGroup() {
		if (ifcObjectPlacementGroup == null) {
			ifcObjectPlacementGroup = new BasicFeatureMap(this, FinalPackage.PLACEMENT_REL_TO_TYPE__IFC_OBJECT_PLACEMENT_GROUP);
		}
		return ifcObjectPlacementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectPlacement getIfcObjectPlacement() {
		return (IfcObjectPlacement)getIfcObjectPlacementGroup().get(FinalPackage.eINSTANCE.getPlacementRelToType_IfcObjectPlacement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcObjectPlacement(IfcObjectPlacement newIfcObjectPlacement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcObjectPlacementGroup()).basicAdd(FinalPackage.eINSTANCE.getPlacementRelToType_IfcObjectPlacement(), newIfcObjectPlacement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.PLACEMENT_REL_TO_TYPE__IFC_OBJECT_PLACEMENT_GROUP:
				return ((InternalEList<?>)getIfcObjectPlacementGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.PLACEMENT_REL_TO_TYPE__IFC_OBJECT_PLACEMENT:
				return basicSetIfcObjectPlacement(null, msgs);
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
			case FinalPackage.PLACEMENT_REL_TO_TYPE__IFC_OBJECT_PLACEMENT_GROUP:
				if (coreType) return getIfcObjectPlacementGroup();
				return ((FeatureMap.Internal)getIfcObjectPlacementGroup()).getWrapper();
			case FinalPackage.PLACEMENT_REL_TO_TYPE__IFC_OBJECT_PLACEMENT:
				return getIfcObjectPlacement();
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
			case FinalPackage.PLACEMENT_REL_TO_TYPE__IFC_OBJECT_PLACEMENT_GROUP:
				((FeatureMap.Internal)getIfcObjectPlacementGroup()).set(newValue);
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
			case FinalPackage.PLACEMENT_REL_TO_TYPE__IFC_OBJECT_PLACEMENT_GROUP:
				getIfcObjectPlacementGroup().clear();
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
			case FinalPackage.PLACEMENT_REL_TO_TYPE__IFC_OBJECT_PLACEMENT_GROUP:
				return ifcObjectPlacementGroup != null && !ifcObjectPlacementGroup.isEmpty();
			case FinalPackage.PLACEMENT_REL_TO_TYPE__IFC_OBJECT_PLACEMENT:
				return getIfcObjectPlacement() != null;
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
		result.append(" (ifcObjectPlacementGroup: ");
		result.append(ifcObjectPlacementGroup);
		result.append(')');
		return result.toString();
	}

} //PlacementRelToTypeImpl
