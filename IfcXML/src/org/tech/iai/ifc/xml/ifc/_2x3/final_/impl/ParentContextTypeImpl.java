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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ParentContextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parent Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParentContextTypeImpl#getIfcGeometricRepresentationContextGroup <em>Ifc Geometric Representation Context Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ParentContextTypeImpl#getIfcGeometricRepresentationContext <em>Ifc Geometric Representation Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParentContextTypeImpl extends EObjectImpl implements ParentContextType {
	/**
	 * The cached value of the '{@link #getIfcGeometricRepresentationContextGroup() <em>Ifc Geometric Representation Context Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcGeometricRepresentationContextGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcGeometricRepresentationContextGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentContextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getParentContextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcGeometricRepresentationContextGroup() {
		if (ifcGeometricRepresentationContextGroup == null) {
			ifcGeometricRepresentationContextGroup = new BasicFeatureMap(this, FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT_GROUP);
		}
		return ifcGeometricRepresentationContextGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationContext getIfcGeometricRepresentationContext() {
		return (IfcGeometricRepresentationContext)getIfcGeometricRepresentationContextGroup().get(FinalPackage.eINSTANCE.getParentContextType_IfcGeometricRepresentationContext(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcGeometricRepresentationContext(IfcGeometricRepresentationContext newIfcGeometricRepresentationContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcGeometricRepresentationContextGroup()).basicAdd(FinalPackage.eINSTANCE.getParentContextType_IfcGeometricRepresentationContext(), newIfcGeometricRepresentationContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcGeometricRepresentationContext(IfcGeometricRepresentationContext newIfcGeometricRepresentationContext) {
		((FeatureMap.Internal)getIfcGeometricRepresentationContextGroup()).set(FinalPackage.eINSTANCE.getParentContextType_IfcGeometricRepresentationContext(), newIfcGeometricRepresentationContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT_GROUP:
				return ((InternalEList<?>)getIfcGeometricRepresentationContextGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT:
				return basicSetIfcGeometricRepresentationContext(null, msgs);
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
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT_GROUP:
				if (coreType) return getIfcGeometricRepresentationContextGroup();
				return ((FeatureMap.Internal)getIfcGeometricRepresentationContextGroup()).getWrapper();
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT:
				return getIfcGeometricRepresentationContext();
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
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT_GROUP:
				((FeatureMap.Internal)getIfcGeometricRepresentationContextGroup()).set(newValue);
				return;
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT:
				setIfcGeometricRepresentationContext((IfcGeometricRepresentationContext)newValue);
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
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT_GROUP:
				getIfcGeometricRepresentationContextGroup().clear();
				return;
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT:
				setIfcGeometricRepresentationContext((IfcGeometricRepresentationContext)null);
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
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT_GROUP:
				return ifcGeometricRepresentationContextGroup != null && !ifcGeometricRepresentationContextGroup.isEmpty();
			case FinalPackage.PARENT_CONTEXT_TYPE__IFC_GEOMETRIC_REPRESENTATION_CONTEXT:
				return getIfcGeometricRepresentationContext() != null;
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
		result.append(" (ifcGeometricRepresentationContextGroup: ");
		result.append(ifcGeometricRepresentationContextGroup);
		result.append(')');
		return result.toString();
	}

} //ParentContextTypeImpl
