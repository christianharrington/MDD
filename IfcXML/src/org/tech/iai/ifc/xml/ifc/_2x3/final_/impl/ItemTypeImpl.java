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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationItem;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ItemTypeImpl#getIfcGeometricRepresentationItemGroup <em>Ifc Geometric Representation Item Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ItemTypeImpl#getIfcGeometricRepresentationItem <em>Ifc Geometric Representation Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemTypeImpl extends EObjectImpl implements ItemType {
	/**
	 * The cached value of the '{@link #getIfcGeometricRepresentationItemGroup() <em>Ifc Geometric Representation Item Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcGeometricRepresentationItemGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcGeometricRepresentationItemGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getItemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcGeometricRepresentationItemGroup() {
		if (ifcGeometricRepresentationItemGroup == null) {
			ifcGeometricRepresentationItemGroup = new BasicFeatureMap(this, FinalPackage.ITEM_TYPE__IFC_GEOMETRIC_REPRESENTATION_ITEM_GROUP);
		}
		return ifcGeometricRepresentationItemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationItem getIfcGeometricRepresentationItem() {
		return (IfcGeometricRepresentationItem)getIfcGeometricRepresentationItemGroup().get(FinalPackage.eINSTANCE.getItemType_IfcGeometricRepresentationItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcGeometricRepresentationItem(IfcGeometricRepresentationItem newIfcGeometricRepresentationItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcGeometricRepresentationItemGroup()).basicAdd(FinalPackage.eINSTANCE.getItemType_IfcGeometricRepresentationItem(), newIfcGeometricRepresentationItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ITEM_TYPE__IFC_GEOMETRIC_REPRESENTATION_ITEM_GROUP:
				return ((InternalEList<?>)getIfcGeometricRepresentationItemGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.ITEM_TYPE__IFC_GEOMETRIC_REPRESENTATION_ITEM:
				return basicSetIfcGeometricRepresentationItem(null, msgs);
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
			case FinalPackage.ITEM_TYPE__IFC_GEOMETRIC_REPRESENTATION_ITEM_GROUP:
				if (coreType) return getIfcGeometricRepresentationItemGroup();
				return ((FeatureMap.Internal)getIfcGeometricRepresentationItemGroup()).getWrapper();
			case FinalPackage.ITEM_TYPE__IFC_GEOMETRIC_REPRESENTATION_ITEM:
				return getIfcGeometricRepresentationItem();
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
			case FinalPackage.ITEM_TYPE__IFC_GEOMETRIC_REPRESENTATION_ITEM_GROUP:
				((FeatureMap.Internal)getIfcGeometricRepresentationItemGroup()).set(newValue);
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
			case FinalPackage.ITEM_TYPE__IFC_GEOMETRIC_REPRESENTATION_ITEM_GROUP:
				getIfcGeometricRepresentationItemGroup().clear();
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
			case FinalPackage.ITEM_TYPE__IFC_GEOMETRIC_REPRESENTATION_ITEM_GROUP:
				return ifcGeometricRepresentationItemGroup != null && !ifcGeometricRepresentationItemGroup.isEmpty();
			case FinalPackage.ITEM_TYPE__IFC_GEOMETRIC_REPRESENTATION_ITEM:
				return getIfcGeometricRepresentationItem() != null;
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
		result.append(" (ifcGeometricRepresentationItemGroup: ");
		result.append(ifcGeometricRepresentationItemGroup);
		result.append(')');
		return result.toString();
	}

} //ItemTypeImpl
