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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationItem;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ItemType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ItemType1Impl#getIfcRepresentationItemGroup <em>Ifc Representation Item Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ItemType1Impl#getIfcRepresentationItem <em>Ifc Representation Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemType1Impl extends EObjectImpl implements ItemType1 {
	/**
	 * The cached value of the '{@link #getIfcRepresentationItemGroup() <em>Ifc Representation Item Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRepresentationItemGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcRepresentationItemGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getItemType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcRepresentationItemGroup() {
		if (ifcRepresentationItemGroup == null) {
			ifcRepresentationItemGroup = new BasicFeatureMap(this, FinalPackage.ITEM_TYPE1__IFC_REPRESENTATION_ITEM_GROUP);
		}
		return ifcRepresentationItemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationItem getIfcRepresentationItem() {
		return (IfcRepresentationItem)getIfcRepresentationItemGroup().get(FinalPackage.eINSTANCE.getItemType1_IfcRepresentationItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRepresentationItem(IfcRepresentationItem newIfcRepresentationItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcRepresentationItemGroup()).basicAdd(FinalPackage.eINSTANCE.getItemType1_IfcRepresentationItem(), newIfcRepresentationItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.ITEM_TYPE1__IFC_REPRESENTATION_ITEM_GROUP:
				return ((InternalEList<?>)getIfcRepresentationItemGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.ITEM_TYPE1__IFC_REPRESENTATION_ITEM:
				return basicSetIfcRepresentationItem(null, msgs);
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
			case FinalPackage.ITEM_TYPE1__IFC_REPRESENTATION_ITEM_GROUP:
				if (coreType) return getIfcRepresentationItemGroup();
				return ((FeatureMap.Internal)getIfcRepresentationItemGroup()).getWrapper();
			case FinalPackage.ITEM_TYPE1__IFC_REPRESENTATION_ITEM:
				return getIfcRepresentationItem();
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
			case FinalPackage.ITEM_TYPE1__IFC_REPRESENTATION_ITEM_GROUP:
				((FeatureMap.Internal)getIfcRepresentationItemGroup()).set(newValue);
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
			case FinalPackage.ITEM_TYPE1__IFC_REPRESENTATION_ITEM_GROUP:
				getIfcRepresentationItemGroup().clear();
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
			case FinalPackage.ITEM_TYPE1__IFC_REPRESENTATION_ITEM_GROUP:
				return ifcRepresentationItemGroup != null && !ifcRepresentationItemGroup.isEmpty();
			case FinalPackage.ITEM_TYPE1__IFC_REPRESENTATION_ITEM:
				return getIfcRepresentationItem() != null;
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
		result.append(" (ifcRepresentationItemGroup: ");
		result.append(ifcRepresentationItemGroup);
		result.append(')');
		return result.toString();
	}

} //ItemType1Impl
