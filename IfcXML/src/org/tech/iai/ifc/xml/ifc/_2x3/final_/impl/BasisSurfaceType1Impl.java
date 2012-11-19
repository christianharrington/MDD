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

import org.tech.iai.ifc.xml.ifc._2x3.final_.BasisSurfaceType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basis Surface Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.BasisSurfaceType1Impl#getIfcSurfaceGroup <em>Ifc Surface Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.BasisSurfaceType1Impl#getIfcSurface <em>Ifc Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasisSurfaceType1Impl extends EObjectImpl implements BasisSurfaceType1 {
	/**
	 * The cached value of the '{@link #getIfcSurfaceGroup() <em>Ifc Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcSurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisSurfaceType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getBasisSurfaceType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcSurfaceGroup() {
		if (ifcSurfaceGroup == null) {
			ifcSurfaceGroup = new BasicFeatureMap(this, FinalPackage.BASIS_SURFACE_TYPE1__IFC_SURFACE_GROUP);
		}
		return ifcSurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getIfcSurface() {
		return (IfcSurface)getIfcSurfaceGroup().get(FinalPackage.eINSTANCE.getBasisSurfaceType1_IfcSurface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSurface(IfcSurface newIfcSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcSurfaceGroup()).basicAdd(FinalPackage.eINSTANCE.getBasisSurfaceType1_IfcSurface(), newIfcSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.BASIS_SURFACE_TYPE1__IFC_SURFACE_GROUP:
				return ((InternalEList<?>)getIfcSurfaceGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.BASIS_SURFACE_TYPE1__IFC_SURFACE:
				return basicSetIfcSurface(null, msgs);
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
			case FinalPackage.BASIS_SURFACE_TYPE1__IFC_SURFACE_GROUP:
				if (coreType) return getIfcSurfaceGroup();
				return ((FeatureMap.Internal)getIfcSurfaceGroup()).getWrapper();
			case FinalPackage.BASIS_SURFACE_TYPE1__IFC_SURFACE:
				return getIfcSurface();
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
			case FinalPackage.BASIS_SURFACE_TYPE1__IFC_SURFACE_GROUP:
				((FeatureMap.Internal)getIfcSurfaceGroup()).set(newValue);
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
			case FinalPackage.BASIS_SURFACE_TYPE1__IFC_SURFACE_GROUP:
				getIfcSurfaceGroup().clear();
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
			case FinalPackage.BASIS_SURFACE_TYPE1__IFC_SURFACE_GROUP:
				return ifcSurfaceGroup != null && !ifcSurfaceGroup.isEmpty();
			case FinalPackage.BASIS_SURFACE_TYPE1__IFC_SURFACE:
				return getIfcSurface() != null;
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
		result.append(" (ifcSurfaceGroup: ");
		result.append(ifcSurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //BasisSurfaceType1Impl
