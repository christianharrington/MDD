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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcActor;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingActorType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Actor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingActorTypeImpl#getIfcActorGroup <em>Ifc Actor Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingActorTypeImpl#getIfcActor <em>Ifc Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingActorTypeImpl extends EObjectImpl implements RelatingActorType {
	/**
	 * The cached value of the '{@link #getIfcActorGroup() <em>Ifc Actor Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcActorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcActorGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingActorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingActorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcActorGroup() {
		if (ifcActorGroup == null) {
			ifcActorGroup = new BasicFeatureMap(this, FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR_GROUP);
		}
		return ifcActorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActor getIfcActor() {
		return (IfcActor)getIfcActorGroup().get(FinalPackage.eINSTANCE.getRelatingActorType_IfcActor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcActor(IfcActor newIfcActor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcActorGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingActorType_IfcActor(), newIfcActor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcActor(IfcActor newIfcActor) {
		((FeatureMap.Internal)getIfcActorGroup()).set(FinalPackage.eINSTANCE.getRelatingActorType_IfcActor(), newIfcActor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR_GROUP:
				return ((InternalEList<?>)getIfcActorGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR:
				return basicSetIfcActor(null, msgs);
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
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR_GROUP:
				if (coreType) return getIfcActorGroup();
				return ((FeatureMap.Internal)getIfcActorGroup()).getWrapper();
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR:
				return getIfcActor();
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
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR_GROUP:
				((FeatureMap.Internal)getIfcActorGroup()).set(newValue);
				return;
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR:
				setIfcActor((IfcActor)newValue);
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
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR_GROUP:
				getIfcActorGroup().clear();
				return;
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR:
				setIfcActor((IfcActor)null);
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
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR_GROUP:
				return ifcActorGroup != null && !ifcActorGroup.isEmpty();
			case FinalPackage.RELATING_ACTOR_TYPE__IFC_ACTOR:
				return getIfcActor() != null;
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
		result.append(" (ifcActorGroup: ");
		result.append(ifcActorGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingActorTypeImpl
