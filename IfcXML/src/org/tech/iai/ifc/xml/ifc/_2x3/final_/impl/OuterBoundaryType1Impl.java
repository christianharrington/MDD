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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurve;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OuterBoundaryType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outer Boundary Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.OuterBoundaryType1Impl#getIfcCurveGroup <em>Ifc Curve Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.OuterBoundaryType1Impl#getIfcCurve <em>Ifc Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OuterBoundaryType1Impl extends EObjectImpl implements OuterBoundaryType1 {
	/**
	 * The cached value of the '{@link #getIfcCurveGroup() <em>Ifc Curve Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCurveGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcCurveGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OuterBoundaryType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getOuterBoundaryType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcCurveGroup() {
		if (ifcCurveGroup == null) {
			ifcCurveGroup = new BasicFeatureMap(this, FinalPackage.OUTER_BOUNDARY_TYPE1__IFC_CURVE_GROUP);
		}
		return ifcCurveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getIfcCurve() {
		return (IfcCurve)getIfcCurveGroup().get(FinalPackage.eINSTANCE.getOuterBoundaryType1_IfcCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCurve(IfcCurve newIfcCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcCurveGroup()).basicAdd(FinalPackage.eINSTANCE.getOuterBoundaryType1_IfcCurve(), newIfcCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.OUTER_BOUNDARY_TYPE1__IFC_CURVE_GROUP:
				return ((InternalEList<?>)getIfcCurveGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.OUTER_BOUNDARY_TYPE1__IFC_CURVE:
				return basicSetIfcCurve(null, msgs);
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
			case FinalPackage.OUTER_BOUNDARY_TYPE1__IFC_CURVE_GROUP:
				if (coreType) return getIfcCurveGroup();
				return ((FeatureMap.Internal)getIfcCurveGroup()).getWrapper();
			case FinalPackage.OUTER_BOUNDARY_TYPE1__IFC_CURVE:
				return getIfcCurve();
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
			case FinalPackage.OUTER_BOUNDARY_TYPE1__IFC_CURVE_GROUP:
				((FeatureMap.Internal)getIfcCurveGroup()).set(newValue);
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
			case FinalPackage.OUTER_BOUNDARY_TYPE1__IFC_CURVE_GROUP:
				getIfcCurveGroup().clear();
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
			case FinalPackage.OUTER_BOUNDARY_TYPE1__IFC_CURVE_GROUP:
				return ifcCurveGroup != null && !ifcCurveGroup.isEmpty();
			case FinalPackage.OUTER_BOUNDARY_TYPE1__IFC_CURVE:
				return getIfcCurve() != null;
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
		result.append(" (ifcCurveGroup: ");
		result.append(ifcCurveGroup);
		result.append(')');
		return result.toString();
	}

} //OuterBoundaryType1Impl
