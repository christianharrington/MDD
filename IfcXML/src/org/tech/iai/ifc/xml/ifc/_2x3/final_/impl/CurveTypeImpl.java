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

import org.tech.iai.ifc.xml.ifc._2x3.final_.CurveType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundedCurve;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CurveTypeImpl#getIfcBoundedCurveGroup <em>Ifc Bounded Curve Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CurveTypeImpl#getIfcBoundedCurve <em>Ifc Bounded Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurveTypeImpl extends EObjectImpl implements CurveType {
	/**
	 * The cached value of the '{@link #getIfcBoundedCurveGroup() <em>Ifc Bounded Curve Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcBoundedCurveGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcBoundedCurveGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getCurveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcBoundedCurveGroup() {
		if (ifcBoundedCurveGroup == null) {
			ifcBoundedCurveGroup = new BasicFeatureMap(this, FinalPackage.CURVE_TYPE__IFC_BOUNDED_CURVE_GROUP);
		}
		return ifcBoundedCurveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundedCurve getIfcBoundedCurve() {
		return (IfcBoundedCurve)getIfcBoundedCurveGroup().get(FinalPackage.eINSTANCE.getCurveType_IfcBoundedCurve(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcBoundedCurve(IfcBoundedCurve newIfcBoundedCurve, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcBoundedCurveGroup()).basicAdd(FinalPackage.eINSTANCE.getCurveType_IfcBoundedCurve(), newIfcBoundedCurve, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.CURVE_TYPE__IFC_BOUNDED_CURVE_GROUP:
				return ((InternalEList<?>)getIfcBoundedCurveGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.CURVE_TYPE__IFC_BOUNDED_CURVE:
				return basicSetIfcBoundedCurve(null, msgs);
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
			case FinalPackage.CURVE_TYPE__IFC_BOUNDED_CURVE_GROUP:
				if (coreType) return getIfcBoundedCurveGroup();
				return ((FeatureMap.Internal)getIfcBoundedCurveGroup()).getWrapper();
			case FinalPackage.CURVE_TYPE__IFC_BOUNDED_CURVE:
				return getIfcBoundedCurve();
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
			case FinalPackage.CURVE_TYPE__IFC_BOUNDED_CURVE_GROUP:
				((FeatureMap.Internal)getIfcBoundedCurveGroup()).set(newValue);
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
			case FinalPackage.CURVE_TYPE__IFC_BOUNDED_CURVE_GROUP:
				getIfcBoundedCurveGroup().clear();
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
			case FinalPackage.CURVE_TYPE__IFC_BOUNDED_CURVE_GROUP:
				return ifcBoundedCurveGroup != null && !ifcBoundedCurveGroup.isEmpty();
			case FinalPackage.CURVE_TYPE__IFC_BOUNDED_CURVE:
				return getIfcBoundedCurve() != null;
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
		result.append(" (ifcBoundedCurveGroup: ");
		result.append(ifcBoundedCurveGroup);
		result.append(')');
		return result.toString();
	}

} //CurveTypeImpl
