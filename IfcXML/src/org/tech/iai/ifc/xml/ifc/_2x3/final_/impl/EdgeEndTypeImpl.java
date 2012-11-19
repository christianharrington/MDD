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

import org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeEndType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge End Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.EdgeEndTypeImpl#getIfcVertexGroup <em>Ifc Vertex Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.EdgeEndTypeImpl#getIfcVertex <em>Ifc Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeEndTypeImpl extends EObjectImpl implements EdgeEndType {
	/**
	 * The cached value of the '{@link #getIfcVertexGroup() <em>Ifc Vertex Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcVertexGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcVertexGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeEndTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getEdgeEndType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcVertexGroup() {
		if (ifcVertexGroup == null) {
			ifcVertexGroup = new BasicFeatureMap(this, FinalPackage.EDGE_END_TYPE__IFC_VERTEX_GROUP);
		}
		return ifcVertexGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex getIfcVertex() {
		return (IfcVertex)getIfcVertexGroup().get(FinalPackage.eINSTANCE.getEdgeEndType_IfcVertex(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcVertex(IfcVertex newIfcVertex, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcVertexGroup()).basicAdd(FinalPackage.eINSTANCE.getEdgeEndType_IfcVertex(), newIfcVertex, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVertex(IfcVertex newIfcVertex) {
		((FeatureMap.Internal)getIfcVertexGroup()).set(FinalPackage.eINSTANCE.getEdgeEndType_IfcVertex(), newIfcVertex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX_GROUP:
				return ((InternalEList<?>)getIfcVertexGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX:
				return basicSetIfcVertex(null, msgs);
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
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX_GROUP:
				if (coreType) return getIfcVertexGroup();
				return ((FeatureMap.Internal)getIfcVertexGroup()).getWrapper();
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX:
				return getIfcVertex();
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
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX_GROUP:
				((FeatureMap.Internal)getIfcVertexGroup()).set(newValue);
				return;
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX:
				setIfcVertex((IfcVertex)newValue);
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
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX_GROUP:
				getIfcVertexGroup().clear();
				return;
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX:
				setIfcVertex((IfcVertex)null);
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
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX_GROUP:
				return ifcVertexGroup != null && !ifcVertexGroup.isEmpty();
			case FinalPackage.EDGE_END_TYPE__IFC_VERTEX:
				return getIfcVertex() != null;
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
		result.append(" (ifcVertexGroup: ");
		result.append(ifcVertexGroup);
		result.append(')');
		return result.toString();
	}

} //EdgeEndTypeImpl
