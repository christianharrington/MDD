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

import org.tech.iai.ifc.xml.ifc._2x3.final_.ExtentType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlanarExtent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extent Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ExtentTypeImpl#getIfcPlanarExtentGroup <em>Ifc Planar Extent Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ExtentTypeImpl#getIfcPlanarExtent <em>Ifc Planar Extent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtentTypeImpl extends EObjectImpl implements ExtentType {
	/**
	 * The cached value of the '{@link #getIfcPlanarExtentGroup() <em>Ifc Planar Extent Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPlanarExtentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPlanarExtentGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getExtentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPlanarExtentGroup() {
		if (ifcPlanarExtentGroup == null) {
			ifcPlanarExtentGroup = new BasicFeatureMap(this, FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT_GROUP);
		}
		return ifcPlanarExtentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarExtent getIfcPlanarExtent() {
		return (IfcPlanarExtent)getIfcPlanarExtentGroup().get(FinalPackage.eINSTANCE.getExtentType_IfcPlanarExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPlanarExtent(IfcPlanarExtent newIfcPlanarExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPlanarExtentGroup()).basicAdd(FinalPackage.eINSTANCE.getExtentType_IfcPlanarExtent(), newIfcPlanarExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlanarExtent(IfcPlanarExtent newIfcPlanarExtent) {
		((FeatureMap.Internal)getIfcPlanarExtentGroup()).set(FinalPackage.eINSTANCE.getExtentType_IfcPlanarExtent(), newIfcPlanarExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT_GROUP:
				return ((InternalEList<?>)getIfcPlanarExtentGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT:
				return basicSetIfcPlanarExtent(null, msgs);
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
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT_GROUP:
				if (coreType) return getIfcPlanarExtentGroup();
				return ((FeatureMap.Internal)getIfcPlanarExtentGroup()).getWrapper();
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT:
				return getIfcPlanarExtent();
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
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT_GROUP:
				((FeatureMap.Internal)getIfcPlanarExtentGroup()).set(newValue);
				return;
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT:
				setIfcPlanarExtent((IfcPlanarExtent)newValue);
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
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT_GROUP:
				getIfcPlanarExtentGroup().clear();
				return;
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT:
				setIfcPlanarExtent((IfcPlanarExtent)null);
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
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT_GROUP:
				return ifcPlanarExtentGroup != null && !ifcPlanarExtentGroup.isEmpty();
			case FinalPackage.EXTENT_TYPE__IFC_PLANAR_EXTENT:
				return getIfcPlanarExtent() != null;
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
		result.append(" (ifcPlanarExtentGroup: ");
		result.append(ifcPlanarExtentGroup);
		result.append(')');
		return result.toString();
	}

} //ExtentTypeImpl
