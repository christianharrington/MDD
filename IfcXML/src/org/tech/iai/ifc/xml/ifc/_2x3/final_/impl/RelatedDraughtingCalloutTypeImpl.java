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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDraughtingCallout;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedDraughtingCalloutType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Draughting Callout Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedDraughtingCalloutTypeImpl#getIfcDraughtingCalloutGroup <em>Ifc Draughting Callout Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatedDraughtingCalloutTypeImpl#getIfcDraughtingCallout <em>Ifc Draughting Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedDraughtingCalloutTypeImpl extends EObjectImpl implements RelatedDraughtingCalloutType {
	/**
	 * The cached value of the '{@link #getIfcDraughtingCalloutGroup() <em>Ifc Draughting Callout Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDraughtingCalloutGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcDraughtingCalloutGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedDraughtingCalloutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatedDraughtingCalloutType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcDraughtingCalloutGroup() {
		if (ifcDraughtingCalloutGroup == null) {
			ifcDraughtingCalloutGroup = new BasicFeatureMap(this, FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT_GROUP);
		}
		return ifcDraughtingCalloutGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingCallout getIfcDraughtingCallout() {
		return (IfcDraughtingCallout)getIfcDraughtingCalloutGroup().get(FinalPackage.eINSTANCE.getRelatedDraughtingCalloutType_IfcDraughtingCallout(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDraughtingCallout(IfcDraughtingCallout newIfcDraughtingCallout, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcDraughtingCalloutGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatedDraughtingCalloutType_IfcDraughtingCallout(), newIfcDraughtingCallout, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDraughtingCallout(IfcDraughtingCallout newIfcDraughtingCallout) {
		((FeatureMap.Internal)getIfcDraughtingCalloutGroup()).set(FinalPackage.eINSTANCE.getRelatedDraughtingCalloutType_IfcDraughtingCallout(), newIfcDraughtingCallout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT_GROUP:
				return ((InternalEList<?>)getIfcDraughtingCalloutGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT:
				return basicSetIfcDraughtingCallout(null, msgs);
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
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT_GROUP:
				if (coreType) return getIfcDraughtingCalloutGroup();
				return ((FeatureMap.Internal)getIfcDraughtingCalloutGroup()).getWrapper();
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT:
				return getIfcDraughtingCallout();
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
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT_GROUP:
				((FeatureMap.Internal)getIfcDraughtingCalloutGroup()).set(newValue);
				return;
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT:
				setIfcDraughtingCallout((IfcDraughtingCallout)newValue);
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
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT_GROUP:
				getIfcDraughtingCalloutGroup().clear();
				return;
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT:
				setIfcDraughtingCallout((IfcDraughtingCallout)null);
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
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT_GROUP:
				return ifcDraughtingCalloutGroup != null && !ifcDraughtingCalloutGroup.isEmpty();
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE__IFC_DRAUGHTING_CALLOUT:
				return getIfcDraughtingCallout() != null;
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
		result.append(" (ifcDraughtingCalloutGroup: ");
		result.append(ifcDraughtingCalloutGroup);
		result.append(')');
		return result.toString();
	}

} //RelatedDraughtingCalloutTypeImpl
