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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralActivity;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedStructuralActivityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Structural Activity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedStructuralActivityTypeImpl#getIfcStructuralActivityGroup <em>Ifc Structural Activity Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedStructuralActivityTypeImpl#getIfcStructuralActivity <em>Ifc Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedStructuralActivityTypeImpl extends EObjectImpl implements RelatedStructuralActivityType {
	/**
	 * The cached value of the '{@link #getIfcStructuralActivityGroup() <em>Ifc Structural Activity Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcStructuralActivityGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcStructuralActivityGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedStructuralActivityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatedStructuralActivityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcStructuralActivityGroup() {
		if (ifcStructuralActivityGroup == null) {
			ifcStructuralActivityGroup = new BasicFeatureMap(this, FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE__IFC_STRUCTURAL_ACTIVITY_GROUP);
		}
		return ifcStructuralActivityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralActivity getIfcStructuralActivity() {
		return (IfcStructuralActivity)getIfcStructuralActivityGroup().get(FinalPackage.eINSTANCE.getRelatedStructuralActivityType_IfcStructuralActivity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcStructuralActivity(IfcStructuralActivity newIfcStructuralActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcStructuralActivityGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatedStructuralActivityType_IfcStructuralActivity(), newIfcStructuralActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE__IFC_STRUCTURAL_ACTIVITY_GROUP:
				return ((InternalEList<?>)getIfcStructuralActivityGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE__IFC_STRUCTURAL_ACTIVITY:
				return basicSetIfcStructuralActivity(null, msgs);
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
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE__IFC_STRUCTURAL_ACTIVITY_GROUP:
				if (coreType) return getIfcStructuralActivityGroup();
				return ((FeatureMap.Internal)getIfcStructuralActivityGroup()).getWrapper();
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE__IFC_STRUCTURAL_ACTIVITY:
				return getIfcStructuralActivity();
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
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE__IFC_STRUCTURAL_ACTIVITY_GROUP:
				((FeatureMap.Internal)getIfcStructuralActivityGroup()).set(newValue);
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
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE__IFC_STRUCTURAL_ACTIVITY_GROUP:
				getIfcStructuralActivityGroup().clear();
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
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE__IFC_STRUCTURAL_ACTIVITY_GROUP:
				return ifcStructuralActivityGroup != null && !ifcStructuralActivityGroup.isEmpty();
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE__IFC_STRUCTURAL_ACTIVITY:
				return getIfcStructuralActivity() != null;
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
		result.append(" (ifcStructuralActivityGroup: ");
		result.append(ifcStructuralActivityGroup);
		result.append(')');
		return result.toString();
	}

} //RelatedStructuralActivityTypeImpl
