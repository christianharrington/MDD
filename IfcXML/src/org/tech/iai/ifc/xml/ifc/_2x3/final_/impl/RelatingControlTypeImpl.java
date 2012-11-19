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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcControl;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingControlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Control Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingControlTypeImpl#getIfcControlGroup <em>Ifc Control Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingControlTypeImpl#getIfcControl <em>Ifc Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingControlTypeImpl extends EObjectImpl implements RelatingControlType {
	/**
	 * The cached value of the '{@link #getIfcControlGroup() <em>Ifc Control Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcControlGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcControlGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingControlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingControlType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcControlGroup() {
		if (ifcControlGroup == null) {
			ifcControlGroup = new BasicFeatureMap(this, FinalPackage.RELATING_CONTROL_TYPE__IFC_CONTROL_GROUP);
		}
		return ifcControlGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcControl getIfcControl() {
		return (IfcControl)getIfcControlGroup().get(FinalPackage.eINSTANCE.getRelatingControlType_IfcControl(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcControl(IfcControl newIfcControl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcControlGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingControlType_IfcControl(), newIfcControl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_CONTROL_TYPE__IFC_CONTROL_GROUP:
				return ((InternalEList<?>)getIfcControlGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_CONTROL_TYPE__IFC_CONTROL:
				return basicSetIfcControl(null, msgs);
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
			case FinalPackage.RELATING_CONTROL_TYPE__IFC_CONTROL_GROUP:
				if (coreType) return getIfcControlGroup();
				return ((FeatureMap.Internal)getIfcControlGroup()).getWrapper();
			case FinalPackage.RELATING_CONTROL_TYPE__IFC_CONTROL:
				return getIfcControl();
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
			case FinalPackage.RELATING_CONTROL_TYPE__IFC_CONTROL_GROUP:
				((FeatureMap.Internal)getIfcControlGroup()).set(newValue);
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
			case FinalPackage.RELATING_CONTROL_TYPE__IFC_CONTROL_GROUP:
				getIfcControlGroup().clear();
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
			case FinalPackage.RELATING_CONTROL_TYPE__IFC_CONTROL_GROUP:
				return ifcControlGroup != null && !ifcControlGroup.isEmpty();
			case FinalPackage.RELATING_CONTROL_TYPE__IFC_CONTROL:
				return getIfcControl() != null;
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
		result.append(" (ifcControlGroup: ");
		result.append(ifcControlGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingControlTypeImpl
