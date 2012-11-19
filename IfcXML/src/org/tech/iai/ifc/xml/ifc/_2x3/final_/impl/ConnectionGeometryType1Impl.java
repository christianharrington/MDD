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

import org.tech.iai.ifc.xml.ifc._2x3.final_.ConnectionGeometryType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionGeometry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Geometry Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ConnectionGeometryType1Impl#getIfcConnectionGeometryGroup <em>Ifc Connection Geometry Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ConnectionGeometryType1Impl#getIfcConnectionGeometry <em>Ifc Connection Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionGeometryType1Impl extends EObjectImpl implements ConnectionGeometryType1 {
	/**
	 * The cached value of the '{@link #getIfcConnectionGeometryGroup() <em>Ifc Connection Geometry Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcConnectionGeometryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcConnectionGeometryGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionGeometryType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getConnectionGeometryType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcConnectionGeometryGroup() {
		if (ifcConnectionGeometryGroup == null) {
			ifcConnectionGeometryGroup = new BasicFeatureMap(this, FinalPackage.CONNECTION_GEOMETRY_TYPE1__IFC_CONNECTION_GEOMETRY_GROUP);
		}
		return ifcConnectionGeometryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry getIfcConnectionGeometry() {
		return (IfcConnectionGeometry)getIfcConnectionGeometryGroup().get(FinalPackage.eINSTANCE.getConnectionGeometryType1_IfcConnectionGeometry(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcConnectionGeometry(IfcConnectionGeometry newIfcConnectionGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcConnectionGeometryGroup()).basicAdd(FinalPackage.eINSTANCE.getConnectionGeometryType1_IfcConnectionGeometry(), newIfcConnectionGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1__IFC_CONNECTION_GEOMETRY_GROUP:
				return ((InternalEList<?>)getIfcConnectionGeometryGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1__IFC_CONNECTION_GEOMETRY:
				return basicSetIfcConnectionGeometry(null, msgs);
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
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1__IFC_CONNECTION_GEOMETRY_GROUP:
				if (coreType) return getIfcConnectionGeometryGroup();
				return ((FeatureMap.Internal)getIfcConnectionGeometryGroup()).getWrapper();
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1__IFC_CONNECTION_GEOMETRY:
				return getIfcConnectionGeometry();
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
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1__IFC_CONNECTION_GEOMETRY_GROUP:
				((FeatureMap.Internal)getIfcConnectionGeometryGroup()).set(newValue);
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
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1__IFC_CONNECTION_GEOMETRY_GROUP:
				getIfcConnectionGeometryGroup().clear();
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
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1__IFC_CONNECTION_GEOMETRY_GROUP:
				return ifcConnectionGeometryGroup != null && !ifcConnectionGeometryGroup.isEmpty();
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1__IFC_CONNECTION_GEOMETRY:
				return getIfcConnectionGeometry() != null;
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
		result.append(" (ifcConnectionGeometryGroup: ");
		result.append(ifcConnectionGeometryGroup);
		result.append(')');
		return result.toString();
	}

} //ConnectionGeometryType1Impl
