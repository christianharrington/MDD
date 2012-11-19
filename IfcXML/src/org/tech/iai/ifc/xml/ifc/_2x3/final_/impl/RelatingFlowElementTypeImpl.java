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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDistributionFlowElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingFlowElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Flow Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingFlowElementTypeImpl#getIfcDistributionFlowElementGroup <em>Ifc Distribution Flow Element Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingFlowElementTypeImpl#getIfcDistributionFlowElement <em>Ifc Distribution Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingFlowElementTypeImpl extends EObjectImpl implements RelatingFlowElementType {
	/**
	 * The cached value of the '{@link #getIfcDistributionFlowElementGroup() <em>Ifc Distribution Flow Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDistributionFlowElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcDistributionFlowElementGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingFlowElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingFlowElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcDistributionFlowElementGroup() {
		if (ifcDistributionFlowElementGroup == null) {
			ifcDistributionFlowElementGroup = new BasicFeatureMap(this, FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT_GROUP);
		}
		return ifcDistributionFlowElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionFlowElement getIfcDistributionFlowElement() {
		return (IfcDistributionFlowElement)getIfcDistributionFlowElementGroup().get(FinalPackage.eINSTANCE.getRelatingFlowElementType_IfcDistributionFlowElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDistributionFlowElement(IfcDistributionFlowElement newIfcDistributionFlowElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcDistributionFlowElementGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingFlowElementType_IfcDistributionFlowElement(), newIfcDistributionFlowElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDistributionFlowElement(IfcDistributionFlowElement newIfcDistributionFlowElement) {
		((FeatureMap.Internal)getIfcDistributionFlowElementGroup()).set(FinalPackage.eINSTANCE.getRelatingFlowElementType_IfcDistributionFlowElement(), newIfcDistributionFlowElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT_GROUP:
				return ((InternalEList<?>)getIfcDistributionFlowElementGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT:
				return basicSetIfcDistributionFlowElement(null, msgs);
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
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT_GROUP:
				if (coreType) return getIfcDistributionFlowElementGroup();
				return ((FeatureMap.Internal)getIfcDistributionFlowElementGroup()).getWrapper();
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT:
				return getIfcDistributionFlowElement();
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
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT_GROUP:
				((FeatureMap.Internal)getIfcDistributionFlowElementGroup()).set(newValue);
				return;
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT:
				setIfcDistributionFlowElement((IfcDistributionFlowElement)newValue);
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
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT_GROUP:
				getIfcDistributionFlowElementGroup().clear();
				return;
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT:
				setIfcDistributionFlowElement((IfcDistributionFlowElement)null);
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
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT_GROUP:
				return ifcDistributionFlowElementGroup != null && !ifcDistributionFlowElementGroup.isEmpty();
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE__IFC_DISTRIBUTION_FLOW_ELEMENT:
				return getIfcDistributionFlowElement() != null;
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
		result.append(" (ifcDistributionFlowElementGroup: ");
		result.append(ifcDistributionFlowElementGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingFlowElementTypeImpl
