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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPoint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.VertexGeometryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.VertexGeometryTypeImpl#getIfcPointGroup <em>Ifc Point Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.VertexGeometryTypeImpl#getIfcPoint <em>Ifc Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VertexGeometryTypeImpl extends EObjectImpl implements VertexGeometryType {
	/**
	 * The cached value of the '{@link #getIfcPointGroup() <em>Ifc Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getVertexGeometryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPointGroup() {
		if (ifcPointGroup == null) {
			ifcPointGroup = new BasicFeatureMap(this, FinalPackage.VERTEX_GEOMETRY_TYPE__IFC_POINT_GROUP);
		}
		return ifcPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPoint getIfcPoint() {
		return (IfcPoint)getIfcPointGroup().get(FinalPackage.eINSTANCE.getVertexGeometryType_IfcPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPoint(IfcPoint newIfcPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPointGroup()).basicAdd(FinalPackage.eINSTANCE.getVertexGeometryType_IfcPoint(), newIfcPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.VERTEX_GEOMETRY_TYPE__IFC_POINT_GROUP:
				return ((InternalEList<?>)getIfcPointGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.VERTEX_GEOMETRY_TYPE__IFC_POINT:
				return basicSetIfcPoint(null, msgs);
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
			case FinalPackage.VERTEX_GEOMETRY_TYPE__IFC_POINT_GROUP:
				if (coreType) return getIfcPointGroup();
				return ((FeatureMap.Internal)getIfcPointGroup()).getWrapper();
			case FinalPackage.VERTEX_GEOMETRY_TYPE__IFC_POINT:
				return getIfcPoint();
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
			case FinalPackage.VERTEX_GEOMETRY_TYPE__IFC_POINT_GROUP:
				((FeatureMap.Internal)getIfcPointGroup()).set(newValue);
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
			case FinalPackage.VERTEX_GEOMETRY_TYPE__IFC_POINT_GROUP:
				getIfcPointGroup().clear();
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
			case FinalPackage.VERTEX_GEOMETRY_TYPE__IFC_POINT_GROUP:
				return ifcPointGroup != null && !ifcPointGroup.isEmpty();
			case FinalPackage.VERTEX_GEOMETRY_TYPE__IFC_POINT:
				return getIfcPoint() != null;
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
		result.append(" (ifcPointGroup: ");
		result.append(ifcPointGroup);
		result.append(')');
		return result.toString();
	}

} //VertexGeometryTypeImpl
