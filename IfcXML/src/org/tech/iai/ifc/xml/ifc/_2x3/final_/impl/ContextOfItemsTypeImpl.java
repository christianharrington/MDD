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

import org.tech.iai.ifc.xml.ifc._2x3.final_.ContextOfItemsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Of Items Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContextOfItemsTypeImpl#getIfcRepresentationContextGroup <em>Ifc Representation Context Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ContextOfItemsTypeImpl#getIfcRepresentationContext <em>Ifc Representation Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextOfItemsTypeImpl extends EObjectImpl implements ContextOfItemsType {
	/**
	 * The cached value of the '{@link #getIfcRepresentationContextGroup() <em>Ifc Representation Context Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRepresentationContextGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcRepresentationContextGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextOfItemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getContextOfItemsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcRepresentationContextGroup() {
		if (ifcRepresentationContextGroup == null) {
			ifcRepresentationContextGroup = new BasicFeatureMap(this, FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT_GROUP);
		}
		return ifcRepresentationContextGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationContext getIfcRepresentationContext() {
		return (IfcRepresentationContext)getIfcRepresentationContextGroup().get(FinalPackage.eINSTANCE.getContextOfItemsType_IfcRepresentationContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRepresentationContext(IfcRepresentationContext newIfcRepresentationContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcRepresentationContextGroup()).basicAdd(FinalPackage.eINSTANCE.getContextOfItemsType_IfcRepresentationContext(), newIfcRepresentationContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRepresentationContext(IfcRepresentationContext newIfcRepresentationContext) {
		((FeatureMap.Internal)getIfcRepresentationContextGroup()).set(FinalPackage.eINSTANCE.getContextOfItemsType_IfcRepresentationContext(), newIfcRepresentationContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT_GROUP:
				return ((InternalEList<?>)getIfcRepresentationContextGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT:
				return basicSetIfcRepresentationContext(null, msgs);
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
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT_GROUP:
				if (coreType) return getIfcRepresentationContextGroup();
				return ((FeatureMap.Internal)getIfcRepresentationContextGroup()).getWrapper();
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT:
				return getIfcRepresentationContext();
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
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT_GROUP:
				((FeatureMap.Internal)getIfcRepresentationContextGroup()).set(newValue);
				return;
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT:
				setIfcRepresentationContext((IfcRepresentationContext)newValue);
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
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT_GROUP:
				getIfcRepresentationContextGroup().clear();
				return;
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT:
				setIfcRepresentationContext((IfcRepresentationContext)null);
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
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT_GROUP:
				return ifcRepresentationContextGroup != null && !ifcRepresentationContextGroup.isEmpty();
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE__IFC_REPRESENTATION_CONTEXT:
				return getIfcRepresentationContext() != null;
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
		result.append(" (ifcRepresentationContextGroup: ");
		result.append(ifcRepresentationContextGroup);
		result.append(')');
		return result.toString();
	}

} //ContextOfItemsTypeImpl
