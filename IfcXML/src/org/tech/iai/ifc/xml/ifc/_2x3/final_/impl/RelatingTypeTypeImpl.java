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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTypeObject;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingTypeTypeImpl#getIfcTypeObjectGroup <em>Ifc Type Object Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingTypeTypeImpl#getIfcTypeObject <em>Ifc Type Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingTypeTypeImpl extends EObjectImpl implements RelatingTypeType {
	/**
	 * The cached value of the '{@link #getIfcTypeObjectGroup() <em>Ifc Type Object Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTypeObjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcTypeObjectGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcTypeObjectGroup() {
		if (ifcTypeObjectGroup == null) {
			ifcTypeObjectGroup = new BasicFeatureMap(this, FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT_GROUP);
		}
		return ifcTypeObjectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTypeObject getIfcTypeObject() {
		return (IfcTypeObject)getIfcTypeObjectGroup().get(FinalPackage.eINSTANCE.getRelatingTypeType_IfcTypeObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTypeObject(IfcTypeObject newIfcTypeObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcTypeObjectGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingTypeType_IfcTypeObject(), newIfcTypeObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTypeObject(IfcTypeObject newIfcTypeObject) {
		((FeatureMap.Internal)getIfcTypeObjectGroup()).set(FinalPackage.eINSTANCE.getRelatingTypeType_IfcTypeObject(), newIfcTypeObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT_GROUP:
				return ((InternalEList<?>)getIfcTypeObjectGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT:
				return basicSetIfcTypeObject(null, msgs);
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
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT_GROUP:
				if (coreType) return getIfcTypeObjectGroup();
				return ((FeatureMap.Internal)getIfcTypeObjectGroup()).getWrapper();
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT:
				return getIfcTypeObject();
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
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT_GROUP:
				((FeatureMap.Internal)getIfcTypeObjectGroup()).set(newValue);
				return;
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT:
				setIfcTypeObject((IfcTypeObject)newValue);
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
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT_GROUP:
				getIfcTypeObjectGroup().clear();
				return;
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT:
				setIfcTypeObject((IfcTypeObject)null);
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
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT_GROUP:
				return ifcTypeObjectGroup != null && !ifcTypeObjectGroup.isEmpty();
			case FinalPackage.RELATING_TYPE_TYPE__IFC_TYPE_OBJECT:
				return getIfcTypeObject() != null;
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
		result.append(" (ifcTypeObjectGroup: ");
		result.append(ifcTypeObjectGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingTypeTypeImpl
