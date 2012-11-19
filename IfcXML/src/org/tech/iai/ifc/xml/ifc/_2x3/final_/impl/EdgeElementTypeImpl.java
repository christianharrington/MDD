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

import org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.EdgeElementTypeImpl#getIfcEdgeGroup <em>Ifc Edge Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.EdgeElementTypeImpl#getIfcEdge <em>Ifc Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeElementTypeImpl extends EObjectImpl implements EdgeElementType {
	/**
	 * The cached value of the '{@link #getIfcEdgeGroup() <em>Ifc Edge Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcEdgeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcEdgeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getEdgeElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcEdgeGroup() {
		if (ifcEdgeGroup == null) {
			ifcEdgeGroup = new BasicFeatureMap(this, FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE_GROUP);
		}
		return ifcEdgeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdge getIfcEdge() {
		return (IfcEdge)getIfcEdgeGroup().get(FinalPackage.eINSTANCE.getEdgeElementType_IfcEdge(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcEdge(IfcEdge newIfcEdge, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcEdgeGroup()).basicAdd(FinalPackage.eINSTANCE.getEdgeElementType_IfcEdge(), newIfcEdge, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcEdge(IfcEdge newIfcEdge) {
		((FeatureMap.Internal)getIfcEdgeGroup()).set(FinalPackage.eINSTANCE.getEdgeElementType_IfcEdge(), newIfcEdge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE_GROUP:
				return ((InternalEList<?>)getIfcEdgeGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE:
				return basicSetIfcEdge(null, msgs);
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
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE_GROUP:
				if (coreType) return getIfcEdgeGroup();
				return ((FeatureMap.Internal)getIfcEdgeGroup()).getWrapper();
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE:
				return getIfcEdge();
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
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE_GROUP:
				((FeatureMap.Internal)getIfcEdgeGroup()).set(newValue);
				return;
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE:
				setIfcEdge((IfcEdge)newValue);
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
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE_GROUP:
				getIfcEdgeGroup().clear();
				return;
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE:
				setIfcEdge((IfcEdge)null);
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
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE_GROUP:
				return ifcEdgeGroup != null && !ifcEdgeGroup.isEmpty();
			case FinalPackage.EDGE_ELEMENT_TYPE__IFC_EDGE:
				return getIfcEdge() != null;
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
		result.append(" (ifcEdgeGroup: ");
		result.append(ifcEdgeGroup);
		result.append(')');
		return result.toString();
	}

} //EdgeElementTypeImpl
