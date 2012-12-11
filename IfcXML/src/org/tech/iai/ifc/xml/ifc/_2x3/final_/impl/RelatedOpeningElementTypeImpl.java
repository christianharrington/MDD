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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFeatureElementSubtraction;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedOpeningElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Opening Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedOpeningElementTypeImpl#getIfcFeatureElementSubtractionGroup <em>Ifc Feature Element Subtraction Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedOpeningElementTypeImpl#getIfcFeatureElementSubtraction <em>Ifc Feature Element Subtraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedOpeningElementTypeImpl extends EObjectImpl implements RelatedOpeningElementType {
	/**
	 * The cached value of the '{@link #getIfcFeatureElementSubtractionGroup() <em>Ifc Feature Element Subtraction Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFeatureElementSubtractionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcFeatureElementSubtractionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedOpeningElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatedOpeningElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcFeatureElementSubtractionGroup() {
		if (ifcFeatureElementSubtractionGroup == null) {
			ifcFeatureElementSubtractionGroup = new BasicFeatureMap(this, FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION_GROUP);
		}
		return ifcFeatureElementSubtractionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFeatureElementSubtraction getIfcFeatureElementSubtraction() {
		return (IfcFeatureElementSubtraction)getIfcFeatureElementSubtractionGroup().get(FinalPackage.eINSTANCE.getRelatedOpeningElementType_IfcFeatureElementSubtraction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcFeatureElementSubtraction(IfcFeatureElementSubtraction newIfcFeatureElementSubtraction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcFeatureElementSubtractionGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatedOpeningElementType_IfcFeatureElementSubtraction(), newIfcFeatureElementSubtraction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFeatureElementSubtraction(IfcFeatureElementSubtraction newIfcFeatureElementSubtraction) {
		((FeatureMap.Internal)getIfcFeatureElementSubtractionGroup()).set(FinalPackage.eINSTANCE.getRelatedOpeningElementType_IfcFeatureElementSubtraction(), newIfcFeatureElementSubtraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION_GROUP:
				return ((InternalEList<?>)getIfcFeatureElementSubtractionGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION:
				return basicSetIfcFeatureElementSubtraction(null, msgs);
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
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION_GROUP:
				if (coreType) return getIfcFeatureElementSubtractionGroup();
				return ((FeatureMap.Internal)getIfcFeatureElementSubtractionGroup()).getWrapper();
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION:
				return getIfcFeatureElementSubtraction();
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
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION_GROUP:
				((FeatureMap.Internal)getIfcFeatureElementSubtractionGroup()).set(newValue);
				return;
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION:
				setIfcFeatureElementSubtraction((IfcFeatureElementSubtraction)newValue);
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
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION_GROUP:
				getIfcFeatureElementSubtractionGroup().clear();
				return;
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION:
				setIfcFeatureElementSubtraction((IfcFeatureElementSubtraction)null);
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
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION_GROUP:
				return ifcFeatureElementSubtractionGroup != null && !ifcFeatureElementSubtractionGroup.isEmpty();
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE__IFC_FEATURE_ELEMENT_SUBTRACTION:
				return getIfcFeatureElementSubtraction() != null;
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
		result.append(" (ifcFeatureElementSubtractionGroup: ");
		result.append(ifcFeatureElementSubtractionGroup);
		result.append(')');
		return result.toString();
	}

} //RelatedOpeningElementTypeImpl
