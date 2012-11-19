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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCompositeCurve;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SpineCurveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spine Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SpineCurveTypeImpl#getIfcCompositeCurveGroup <em>Ifc Composite Curve Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SpineCurveTypeImpl#getIfcCompositeCurve <em>Ifc Composite Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpineCurveTypeImpl extends EObjectImpl implements SpineCurveType {
	/**
	 * The cached value of the '{@link #getIfcCompositeCurveGroup() <em>Ifc Composite Curve Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCompositeCurveGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcCompositeCurveGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpineCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getSpineCurveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcCompositeCurveGroup() {
		if (ifcCompositeCurveGroup == null) {
			ifcCompositeCurveGroup = new BasicFeatureMap(this, FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE_GROUP);
		}
		return ifcCompositeCurveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompositeCurve getIfcCompositeCurve() {
		return (IfcCompositeCurve)getIfcCompositeCurveGroup().get(FinalPackage.eINSTANCE.getSpineCurveType_IfcCompositeCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCompositeCurve(IfcCompositeCurve newIfcCompositeCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcCompositeCurveGroup()).basicAdd(FinalPackage.eINSTANCE.getSpineCurveType_IfcCompositeCurve(), newIfcCompositeCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCompositeCurve(IfcCompositeCurve newIfcCompositeCurve) {
		((FeatureMap.Internal)getIfcCompositeCurveGroup()).set(FinalPackage.eINSTANCE.getSpineCurveType_IfcCompositeCurve(), newIfcCompositeCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE_GROUP:
				return ((InternalEList<?>)getIfcCompositeCurveGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE:
				return basicSetIfcCompositeCurve(null, msgs);
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
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE_GROUP:
				if (coreType) return getIfcCompositeCurveGroup();
				return ((FeatureMap.Internal)getIfcCompositeCurveGroup()).getWrapper();
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE:
				return getIfcCompositeCurve();
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
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE_GROUP:
				((FeatureMap.Internal)getIfcCompositeCurveGroup()).set(newValue);
				return;
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE:
				setIfcCompositeCurve((IfcCompositeCurve)newValue);
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
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE_GROUP:
				getIfcCompositeCurveGroup().clear();
				return;
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE:
				setIfcCompositeCurve((IfcCompositeCurve)null);
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
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE_GROUP:
				return ifcCompositeCurveGroup != null && !ifcCompositeCurveGroup.isEmpty();
			case FinalPackage.SPINE_CURVE_TYPE__IFC_COMPOSITE_CURVE:
				return getIfcCompositeCurve() != null;
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
		result.append(" (ifcCompositeCurveGroup: ");
		result.append(ifcCompositeCurveGroup);
		result.append(')');
		return result.toString();
	}

} //SpineCurveTypeImpl
