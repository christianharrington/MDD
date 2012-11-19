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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFeatureElementAddition;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedFeatureElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Feature Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedFeatureElementTypeImpl#getIfcFeatureElementAdditionGroup <em>Ifc Feature Element Addition Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedFeatureElementTypeImpl#getIfcFeatureElementAddition <em>Ifc Feature Element Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedFeatureElementTypeImpl extends EObjectImpl implements RelatedFeatureElementType {
	/**
	 * The cached value of the '{@link #getIfcFeatureElementAdditionGroup() <em>Ifc Feature Element Addition Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFeatureElementAdditionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcFeatureElementAdditionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedFeatureElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatedFeatureElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcFeatureElementAdditionGroup() {
		if (ifcFeatureElementAdditionGroup == null) {
			ifcFeatureElementAdditionGroup = new BasicFeatureMap(this, FinalPackage.RELATED_FEATURE_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_ADDITION_GROUP);
		}
		return ifcFeatureElementAdditionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFeatureElementAddition getIfcFeatureElementAddition() {
		return (IfcFeatureElementAddition)getIfcFeatureElementAdditionGroup().get(FinalPackage.eINSTANCE.getRelatedFeatureElementType_IfcFeatureElementAddition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcFeatureElementAddition(IfcFeatureElementAddition newIfcFeatureElementAddition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcFeatureElementAdditionGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatedFeatureElementType_IfcFeatureElementAddition(), newIfcFeatureElementAddition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_ADDITION_GROUP:
				return ((InternalEList<?>)getIfcFeatureElementAdditionGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_ADDITION:
				return basicSetIfcFeatureElementAddition(null, msgs);
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
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_ADDITION_GROUP:
				if (coreType) return getIfcFeatureElementAdditionGroup();
				return ((FeatureMap.Internal)getIfcFeatureElementAdditionGroup()).getWrapper();
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_ADDITION:
				return getIfcFeatureElementAddition();
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
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_ADDITION_GROUP:
				((FeatureMap.Internal)getIfcFeatureElementAdditionGroup()).set(newValue);
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
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_ADDITION_GROUP:
				getIfcFeatureElementAdditionGroup().clear();
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
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_ADDITION_GROUP:
				return ifcFeatureElementAdditionGroup != null && !ifcFeatureElementAdditionGroup.isEmpty();
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_ADDITION:
				return getIfcFeatureElementAddition() != null;
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
		result.append(" (ifcFeatureElementAdditionGroup: ");
		result.append(ifcFeatureElementAdditionGroup);
		result.append(')');
		return result.toString();
	}

} //RelatedFeatureElementTypeImpl
