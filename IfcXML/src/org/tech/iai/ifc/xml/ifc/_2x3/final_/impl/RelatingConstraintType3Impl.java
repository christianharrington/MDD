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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingConstraintType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Constraint Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingConstraintType3Impl#getIfcConstraintGroup <em>Ifc Constraint Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingConstraintType3Impl#getIfcConstraint <em>Ifc Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingConstraintType3Impl extends EObjectImpl implements RelatingConstraintType3 {
	/**
	 * The cached value of the '{@link #getIfcConstraintGroup() <em>Ifc Constraint Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcConstraintGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcConstraintGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingConstraintType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingConstraintType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcConstraintGroup() {
		if (ifcConstraintGroup == null) {
			ifcConstraintGroup = new BasicFeatureMap(this, FinalPackage.RELATING_CONSTRAINT_TYPE3__IFC_CONSTRAINT_GROUP);
		}
		return ifcConstraintGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraint getIfcConstraint() {
		return (IfcConstraint)getIfcConstraintGroup().get(FinalPackage.eINSTANCE.getRelatingConstraintType3_IfcConstraint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcConstraint(IfcConstraint newIfcConstraint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcConstraintGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingConstraintType3_IfcConstraint(), newIfcConstraint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_CONSTRAINT_TYPE3__IFC_CONSTRAINT_GROUP:
				return ((InternalEList<?>)getIfcConstraintGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_CONSTRAINT_TYPE3__IFC_CONSTRAINT:
				return basicSetIfcConstraint(null, msgs);
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
			case FinalPackage.RELATING_CONSTRAINT_TYPE3__IFC_CONSTRAINT_GROUP:
				if (coreType) return getIfcConstraintGroup();
				return ((FeatureMap.Internal)getIfcConstraintGroup()).getWrapper();
			case FinalPackage.RELATING_CONSTRAINT_TYPE3__IFC_CONSTRAINT:
				return getIfcConstraint();
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
			case FinalPackage.RELATING_CONSTRAINT_TYPE3__IFC_CONSTRAINT_GROUP:
				((FeatureMap.Internal)getIfcConstraintGroup()).set(newValue);
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
			case FinalPackage.RELATING_CONSTRAINT_TYPE3__IFC_CONSTRAINT_GROUP:
				getIfcConstraintGroup().clear();
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
			case FinalPackage.RELATING_CONSTRAINT_TYPE3__IFC_CONSTRAINT_GROUP:
				return ifcConstraintGroup != null && !ifcConstraintGroup.isEmpty();
			case FinalPackage.RELATING_CONSTRAINT_TYPE3__IFC_CONSTRAINT:
				return getIfcConstraint() != null;
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
		result.append(" (ifcConstraintGroup: ");
		result.append(ifcConstraintGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingConstraintType3Impl
