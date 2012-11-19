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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralItem;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingElementType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Element Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingElementType1Impl#getIfcStructuralItemGroup <em>Ifc Structural Item Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingElementType1Impl#getIfcStructuralItem <em>Ifc Structural Item</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingElementType1Impl#getIfcElementGroup <em>Ifc Element Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingElementType1Impl#getIfcElement <em>Ifc Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingElementType1Impl extends EObjectImpl implements RelatingElementType1 {
	/**
	 * The cached value of the '{@link #getIfcStructuralItemGroup() <em>Ifc Structural Item Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcStructuralItemGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcStructuralItemGroup;

	/**
	 * The cached value of the '{@link #getIfcElementGroup() <em>Ifc Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcElementGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingElementType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingElementType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcStructuralItemGroup() {
		if (ifcStructuralItemGroup == null) {
			ifcStructuralItemGroup = new BasicFeatureMap(this, FinalPackage.RELATING_ELEMENT_TYPE1__IFC_STRUCTURAL_ITEM_GROUP);
		}
		return ifcStructuralItemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralItem getIfcStructuralItem() {
		return (IfcStructuralItem)getIfcStructuralItemGroup().get(FinalPackage.eINSTANCE.getRelatingElementType1_IfcStructuralItem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcStructuralItem(IfcStructuralItem newIfcStructuralItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcStructuralItemGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingElementType1_IfcStructuralItem(), newIfcStructuralItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcElementGroup() {
		if (ifcElementGroup == null) {
			ifcElementGroup = new BasicFeatureMap(this, FinalPackage.RELATING_ELEMENT_TYPE1__IFC_ELEMENT_GROUP);
		}
		return ifcElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getIfcElement() {
		return (IfcElement)getIfcElementGroup().get(FinalPackage.eINSTANCE.getRelatingElementType1_IfcElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcElement(IfcElement newIfcElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcElementGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingElementType1_IfcElement(), newIfcElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_STRUCTURAL_ITEM_GROUP:
				return ((InternalEList<?>)getIfcStructuralItemGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_STRUCTURAL_ITEM:
				return basicSetIfcStructuralItem(null, msgs);
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_ELEMENT_GROUP:
				return ((InternalEList<?>)getIfcElementGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_ELEMENT:
				return basicSetIfcElement(null, msgs);
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
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_STRUCTURAL_ITEM_GROUP:
				if (coreType) return getIfcStructuralItemGroup();
				return ((FeatureMap.Internal)getIfcStructuralItemGroup()).getWrapper();
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_STRUCTURAL_ITEM:
				return getIfcStructuralItem();
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_ELEMENT_GROUP:
				if (coreType) return getIfcElementGroup();
				return ((FeatureMap.Internal)getIfcElementGroup()).getWrapper();
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_ELEMENT:
				return getIfcElement();
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
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_STRUCTURAL_ITEM_GROUP:
				((FeatureMap.Internal)getIfcStructuralItemGroup()).set(newValue);
				return;
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_ELEMENT_GROUP:
				((FeatureMap.Internal)getIfcElementGroup()).set(newValue);
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
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_STRUCTURAL_ITEM_GROUP:
				getIfcStructuralItemGroup().clear();
				return;
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_ELEMENT_GROUP:
				getIfcElementGroup().clear();
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
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_STRUCTURAL_ITEM_GROUP:
				return ifcStructuralItemGroup != null && !ifcStructuralItemGroup.isEmpty();
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_STRUCTURAL_ITEM:
				return getIfcStructuralItem() != null;
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_ELEMENT_GROUP:
				return ifcElementGroup != null && !ifcElementGroup.isEmpty();
			case FinalPackage.RELATING_ELEMENT_TYPE1__IFC_ELEMENT:
				return getIfcElement() != null;
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
		result.append(" (ifcStructuralItemGroup: ");
		result.append(ifcStructuralItemGroup);
		result.append(", ifcElementGroup: ");
		result.append(ifcElementGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingElementType1Impl
