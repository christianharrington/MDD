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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNamedUnit;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.UnitType1Impl#getIfcNamedUnitGroup <em>Ifc Named Unit Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.UnitType1Impl#getIfcNamedUnit <em>Ifc Named Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitType1Impl extends EObjectImpl implements UnitType1 {
	/**
	 * The cached value of the '{@link #getIfcNamedUnitGroup() <em>Ifc Named Unit Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcNamedUnitGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcNamedUnitGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getUnitType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcNamedUnitGroup() {
		if (ifcNamedUnitGroup == null) {
			ifcNamedUnitGroup = new BasicFeatureMap(this, FinalPackage.UNIT_TYPE1__IFC_NAMED_UNIT_GROUP);
		}
		return ifcNamedUnitGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNamedUnit getIfcNamedUnit() {
		return (IfcNamedUnit)getIfcNamedUnitGroup().get(FinalPackage.eINSTANCE.getUnitType1_IfcNamedUnit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcNamedUnit(IfcNamedUnit newIfcNamedUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcNamedUnitGroup()).basicAdd(FinalPackage.eINSTANCE.getUnitType1_IfcNamedUnit(), newIfcNamedUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.UNIT_TYPE1__IFC_NAMED_UNIT_GROUP:
				return ((InternalEList<?>)getIfcNamedUnitGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.UNIT_TYPE1__IFC_NAMED_UNIT:
				return basicSetIfcNamedUnit(null, msgs);
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
			case FinalPackage.UNIT_TYPE1__IFC_NAMED_UNIT_GROUP:
				if (coreType) return getIfcNamedUnitGroup();
				return ((FeatureMap.Internal)getIfcNamedUnitGroup()).getWrapper();
			case FinalPackage.UNIT_TYPE1__IFC_NAMED_UNIT:
				return getIfcNamedUnit();
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
			case FinalPackage.UNIT_TYPE1__IFC_NAMED_UNIT_GROUP:
				((FeatureMap.Internal)getIfcNamedUnitGroup()).set(newValue);
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
			case FinalPackage.UNIT_TYPE1__IFC_NAMED_UNIT_GROUP:
				getIfcNamedUnitGroup().clear();
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
			case FinalPackage.UNIT_TYPE1__IFC_NAMED_UNIT_GROUP:
				return ifcNamedUnitGroup != null && !ifcNamedUnitGroup.isEmpty();
			case FinalPackage.UNIT_TYPE1__IFC_NAMED_UNIT:
				return getIfcNamedUnit() != null;
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
		result.append(" (ifcNamedUnitGroup: ");
		result.append(ifcNamedUnitGroup);
		result.append(')');
		return result.toString();
	}

} //UnitType1Impl
