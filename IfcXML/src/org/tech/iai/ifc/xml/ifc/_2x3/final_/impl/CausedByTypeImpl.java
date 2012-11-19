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

import org.tech.iai.ifc.xml.ifc._2x3.final_.CausedByType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralReaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Caused By Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CausedByTypeImpl#getIfcStructuralReactionGroup <em>Ifc Structural Reaction Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CausedByTypeImpl#getIfcStructuralReaction <em>Ifc Structural Reaction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CausedByTypeImpl extends EObjectImpl implements CausedByType {
	/**
	 * The cached value of the '{@link #getIfcStructuralReactionGroup() <em>Ifc Structural Reaction Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcStructuralReactionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcStructuralReactionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CausedByTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getCausedByType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcStructuralReactionGroup() {
		if (ifcStructuralReactionGroup == null) {
			ifcStructuralReactionGroup = new BasicFeatureMap(this, FinalPackage.CAUSED_BY_TYPE__IFC_STRUCTURAL_REACTION_GROUP);
		}
		return ifcStructuralReactionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralReaction getIfcStructuralReaction() {
		return (IfcStructuralReaction)getIfcStructuralReactionGroup().get(FinalPackage.eINSTANCE.getCausedByType_IfcStructuralReaction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcStructuralReaction(IfcStructuralReaction newIfcStructuralReaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcStructuralReactionGroup()).basicAdd(FinalPackage.eINSTANCE.getCausedByType_IfcStructuralReaction(), newIfcStructuralReaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.CAUSED_BY_TYPE__IFC_STRUCTURAL_REACTION_GROUP:
				return ((InternalEList<?>)getIfcStructuralReactionGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.CAUSED_BY_TYPE__IFC_STRUCTURAL_REACTION:
				return basicSetIfcStructuralReaction(null, msgs);
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
			case FinalPackage.CAUSED_BY_TYPE__IFC_STRUCTURAL_REACTION_GROUP:
				if (coreType) return getIfcStructuralReactionGroup();
				return ((FeatureMap.Internal)getIfcStructuralReactionGroup()).getWrapper();
			case FinalPackage.CAUSED_BY_TYPE__IFC_STRUCTURAL_REACTION:
				return getIfcStructuralReaction();
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
			case FinalPackage.CAUSED_BY_TYPE__IFC_STRUCTURAL_REACTION_GROUP:
				((FeatureMap.Internal)getIfcStructuralReactionGroup()).set(newValue);
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
			case FinalPackage.CAUSED_BY_TYPE__IFC_STRUCTURAL_REACTION_GROUP:
				getIfcStructuralReactionGroup().clear();
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
			case FinalPackage.CAUSED_BY_TYPE__IFC_STRUCTURAL_REACTION_GROUP:
				return ifcStructuralReactionGroup != null && !ifcStructuralReactionGroup.isEmpty();
			case FinalPackage.CAUSED_BY_TYPE__IFC_STRUCTURAL_REACTION:
				return getIfcStructuralReaction() != null;
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
		result.append(" (ifcStructuralReactionGroup: ");
		result.append(ifcStructuralReactionGroup);
		result.append(')');
		return result.toString();
	}

} //CausedByTypeImpl
