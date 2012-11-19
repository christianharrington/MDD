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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProfileDef;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SweptCurveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swept Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SweptCurveTypeImpl#getIfcProfileDefGroup <em>Ifc Profile Def Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.SweptCurveTypeImpl#getIfcProfileDef <em>Ifc Profile Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SweptCurveTypeImpl extends EObjectImpl implements SweptCurveType {
	/**
	 * The cached value of the '{@link #getIfcProfileDefGroup() <em>Ifc Profile Def Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcProfileDefGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcProfileDefGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SweptCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getSweptCurveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcProfileDefGroup() {
		if (ifcProfileDefGroup == null) {
			ifcProfileDefGroup = new BasicFeatureMap(this, FinalPackage.SWEPT_CURVE_TYPE__IFC_PROFILE_DEF_GROUP);
		}
		return ifcProfileDefGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getIfcProfileDef() {
		return (IfcProfileDef)getIfcProfileDefGroup().get(FinalPackage.eINSTANCE.getSweptCurveType_IfcProfileDef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcProfileDef(IfcProfileDef newIfcProfileDef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcProfileDefGroup()).basicAdd(FinalPackage.eINSTANCE.getSweptCurveType_IfcProfileDef(), newIfcProfileDef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.SWEPT_CURVE_TYPE__IFC_PROFILE_DEF_GROUP:
				return ((InternalEList<?>)getIfcProfileDefGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.SWEPT_CURVE_TYPE__IFC_PROFILE_DEF:
				return basicSetIfcProfileDef(null, msgs);
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
			case FinalPackage.SWEPT_CURVE_TYPE__IFC_PROFILE_DEF_GROUP:
				if (coreType) return getIfcProfileDefGroup();
				return ((FeatureMap.Internal)getIfcProfileDefGroup()).getWrapper();
			case FinalPackage.SWEPT_CURVE_TYPE__IFC_PROFILE_DEF:
				return getIfcProfileDef();
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
			case FinalPackage.SWEPT_CURVE_TYPE__IFC_PROFILE_DEF_GROUP:
				((FeatureMap.Internal)getIfcProfileDefGroup()).set(newValue);
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
			case FinalPackage.SWEPT_CURVE_TYPE__IFC_PROFILE_DEF_GROUP:
				getIfcProfileDefGroup().clear();
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
			case FinalPackage.SWEPT_CURVE_TYPE__IFC_PROFILE_DEF_GROUP:
				return ifcProfileDefGroup != null && !ifcProfileDefGroup.isEmpty();
			case FinalPackage.SWEPT_CURVE_TYPE__IFC_PROFILE_DEF:
				return getIfcProfileDef() != null;
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
		result.append(" (ifcProfileDefGroup: ");
		result.append(ifcProfileDefGroup);
		result.append(')');
		return result.toString();
	}

} //SweptCurveTypeImpl
