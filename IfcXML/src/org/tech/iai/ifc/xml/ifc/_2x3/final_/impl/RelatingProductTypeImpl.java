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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingProductTypeImpl#getIfcProductGroup <em>Ifc Product Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingProductTypeImpl#getIfcProduct <em>Ifc Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingProductTypeImpl extends EObjectImpl implements RelatingProductType {
	/**
	 * The cached value of the '{@link #getIfcProductGroup() <em>Ifc Product Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcProductGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcProductGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingProductType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcProductGroup() {
		if (ifcProductGroup == null) {
			ifcProductGroup = new BasicFeatureMap(this, FinalPackage.RELATING_PRODUCT_TYPE__IFC_PRODUCT_GROUP);
		}
		return ifcProductGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProduct getIfcProduct() {
		return (IfcProduct)getIfcProductGroup().get(FinalPackage.eINSTANCE.getRelatingProductType_IfcProduct(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcProduct(IfcProduct newIfcProduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcProductGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingProductType_IfcProduct(), newIfcProduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_PRODUCT_TYPE__IFC_PRODUCT_GROUP:
				return ((InternalEList<?>)getIfcProductGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_PRODUCT_TYPE__IFC_PRODUCT:
				return basicSetIfcProduct(null, msgs);
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
			case FinalPackage.RELATING_PRODUCT_TYPE__IFC_PRODUCT_GROUP:
				if (coreType) return getIfcProductGroup();
				return ((FeatureMap.Internal)getIfcProductGroup()).getWrapper();
			case FinalPackage.RELATING_PRODUCT_TYPE__IFC_PRODUCT:
				return getIfcProduct();
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
			case FinalPackage.RELATING_PRODUCT_TYPE__IFC_PRODUCT_GROUP:
				((FeatureMap.Internal)getIfcProductGroup()).set(newValue);
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
			case FinalPackage.RELATING_PRODUCT_TYPE__IFC_PRODUCT_GROUP:
				getIfcProductGroup().clear();
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
			case FinalPackage.RELATING_PRODUCT_TYPE__IFC_PRODUCT_GROUP:
				return ifcProductGroup != null && !ifcProductGroup.isEmpty();
			case FinalPackage.RELATING_PRODUCT_TYPE__IFC_PRODUCT:
				return getIfcProduct() != null;
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
		result.append(" (ifcProductGroup: ");
		result.append(ifcProductGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingProductTypeImpl
