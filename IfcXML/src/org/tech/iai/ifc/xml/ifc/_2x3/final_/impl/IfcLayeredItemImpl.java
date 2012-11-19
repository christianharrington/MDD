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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLayeredItem;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Layered Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLayeredItemImpl#getIfcRepresentationItemGroup <em>Ifc Representation Item Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLayeredItemImpl#getIfcRepresentationItem <em>Ifc Representation Item</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLayeredItemImpl#getIfcRepresentationGroup <em>Ifc Representation Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLayeredItemImpl#getIfcRepresentation <em>Ifc Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLayeredItemImpl extends EObjectImpl implements IfcLayeredItem {
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
	 * The cached value of the '{@link #getIfcRepresentationGroup() <em>Ifc Representation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRepresentationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcRepresentationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLayeredItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcLayeredItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcRepresentationItemGroup() {
		if (ifcRepresentationItemGroup == null) {
			ifcRepresentationItemGroup = new BasicFeatureMap(this, FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_ITEM_GROUP);
		}
		return ifcRepresentationItemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationItem getIfcRepresentationItem() {
		return (IfcRepresentationItem)getIfcRepresentationItemGroup().get(FinalPackage.eINSTANCE.getIfcLayeredItem_IfcRepresentationItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRepresentationItem(IfcRepresentationItem newIfcRepresentationItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcRepresentationItemGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcLayeredItem_IfcRepresentationItem(), newIfcRepresentationItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcRepresentationGroup() {
		if (ifcRepresentationGroup == null) {
			ifcRepresentationGroup = new BasicFeatureMap(this, FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_GROUP);
		}
		return ifcRepresentationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentation getIfcRepresentation() {
		return (IfcRepresentation)getIfcRepresentationGroup().get(FinalPackage.eINSTANCE.getIfcLayeredItem_IfcRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRepresentation(IfcRepresentation newIfcRepresentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcRepresentationGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcLayeredItem_IfcRepresentation(), newIfcRepresentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRepresentation(IfcRepresentation newIfcRepresentation) {
		((FeatureMap.Internal)getIfcRepresentationGroup()).set(FinalPackage.eINSTANCE.getIfcLayeredItem_IfcRepresentation(), newIfcRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_ITEM_GROUP:
				return ((InternalEList<?>)getIfcRepresentationItemGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_ITEM:
				return basicSetIfcRepresentationItem(null, msgs);
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getIfcRepresentationGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION:
				return basicSetIfcRepresentation(null, msgs);
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
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_ITEM_GROUP:
				if (coreType) return getIfcRepresentationItemGroup();
				return ((FeatureMap.Internal)getIfcRepresentationItemGroup()).getWrapper();
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_ITEM:
				return getIfcRepresentationItem();
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_GROUP:
				if (coreType) return getIfcRepresentationGroup();
				return ((FeatureMap.Internal)getIfcRepresentationGroup()).getWrapper();
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION:
				return getIfcRepresentation();
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
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_ITEM_GROUP:
				((FeatureMap.Internal)getIfcRepresentationItemGroup()).set(newValue);
				return;
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getIfcRepresentationGroup()).set(newValue);
				return;
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION:
				setIfcRepresentation((IfcRepresentation)newValue);
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
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_ITEM_GROUP:
				getIfcRepresentationItemGroup().clear();
				return;
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_GROUP:
				getIfcRepresentationGroup().clear();
				return;
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION:
				setIfcRepresentation((IfcRepresentation)null);
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
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_ITEM_GROUP:
				return ifcRepresentationItemGroup != null && !ifcRepresentationItemGroup.isEmpty();
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_ITEM:
				return getIfcRepresentationItem() != null;
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION_GROUP:
				return ifcRepresentationGroup != null && !ifcRepresentationGroup.isEmpty();
			case FinalPackage.IFC_LAYERED_ITEM__IFC_REPRESENTATION:
				return getIfcRepresentation() != null;
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
		result.append(", ifcRepresentationGroup: ");
		result.append(ifcRepresentationGroup);
		result.append(')');
		return result.toString();
	}

} //IfcLayeredItemImpl
