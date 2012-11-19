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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOneDirectionRepeatFactor;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TilingPatternType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tiling Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TilingPatternTypeImpl#getIfcOneDirectionRepeatFactorGroup <em>Ifc One Direction Repeat Factor Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.TilingPatternTypeImpl#getIfcOneDirectionRepeatFactor <em>Ifc One Direction Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TilingPatternTypeImpl extends EObjectImpl implements TilingPatternType {
	/**
	 * The cached value of the '{@link #getIfcOneDirectionRepeatFactorGroup() <em>Ifc One Direction Repeat Factor Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcOneDirectionRepeatFactorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcOneDirectionRepeatFactorGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TilingPatternTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getTilingPatternType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcOneDirectionRepeatFactorGroup() {
		if (ifcOneDirectionRepeatFactorGroup == null) {
			ifcOneDirectionRepeatFactorGroup = new BasicFeatureMap(this, FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP);
		}
		return ifcOneDirectionRepeatFactorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOneDirectionRepeatFactor getIfcOneDirectionRepeatFactor() {
		return (IfcOneDirectionRepeatFactor)getIfcOneDirectionRepeatFactorGroup().get(FinalPackage.eINSTANCE.getTilingPatternType_IfcOneDirectionRepeatFactor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcOneDirectionRepeatFactor(IfcOneDirectionRepeatFactor newIfcOneDirectionRepeatFactor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcOneDirectionRepeatFactorGroup()).basicAdd(FinalPackage.eINSTANCE.getTilingPatternType_IfcOneDirectionRepeatFactor(), newIfcOneDirectionRepeatFactor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcOneDirectionRepeatFactor(IfcOneDirectionRepeatFactor newIfcOneDirectionRepeatFactor) {
		((FeatureMap.Internal)getIfcOneDirectionRepeatFactorGroup()).set(FinalPackage.eINSTANCE.getTilingPatternType_IfcOneDirectionRepeatFactor(), newIfcOneDirectionRepeatFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				return ((InternalEList<?>)getIfcOneDirectionRepeatFactorGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				return basicSetIfcOneDirectionRepeatFactor(null, msgs);
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
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				if (coreType) return getIfcOneDirectionRepeatFactorGroup();
				return ((FeatureMap.Internal)getIfcOneDirectionRepeatFactorGroup()).getWrapper();
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				return getIfcOneDirectionRepeatFactor();
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
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				((FeatureMap.Internal)getIfcOneDirectionRepeatFactorGroup()).set(newValue);
				return;
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				setIfcOneDirectionRepeatFactor((IfcOneDirectionRepeatFactor)newValue);
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
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				getIfcOneDirectionRepeatFactorGroup().clear();
				return;
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				setIfcOneDirectionRepeatFactor((IfcOneDirectionRepeatFactor)null);
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
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR_GROUP:
				return ifcOneDirectionRepeatFactorGroup != null && !ifcOneDirectionRepeatFactorGroup.isEmpty();
			case FinalPackage.TILING_PATTERN_TYPE__IFC_ONE_DIRECTION_REPEAT_FACTOR:
				return getIfcOneDirectionRepeatFactor() != null;
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
		result.append(" (ifcOneDirectionRepeatFactorGroup: ");
		result.append(ifcOneDirectionRepeatFactorGroup);
		result.append(')');
		return result.toString();
	}

} //TilingPatternTypeImpl
