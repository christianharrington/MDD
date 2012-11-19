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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralMember;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingStructuralMemberType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Structural Member Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingStructuralMemberTypeImpl#getIfcStructuralMemberGroup <em>Ifc Structural Member Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingStructuralMemberTypeImpl#getIfcStructuralMember <em>Ifc Structural Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingStructuralMemberTypeImpl extends EObjectImpl implements RelatingStructuralMemberType {
	/**
	 * The cached value of the '{@link #getIfcStructuralMemberGroup() <em>Ifc Structural Member Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcStructuralMemberGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcStructuralMemberGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingStructuralMemberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingStructuralMemberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcStructuralMemberGroup() {
		if (ifcStructuralMemberGroup == null) {
			ifcStructuralMemberGroup = new BasicFeatureMap(this, FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE__IFC_STRUCTURAL_MEMBER_GROUP);
		}
		return ifcStructuralMemberGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralMember getIfcStructuralMember() {
		return (IfcStructuralMember)getIfcStructuralMemberGroup().get(FinalPackage.eINSTANCE.getRelatingStructuralMemberType_IfcStructuralMember(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcStructuralMember(IfcStructuralMember newIfcStructuralMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcStructuralMemberGroup()).basicAdd(FinalPackage.eINSTANCE.getRelatingStructuralMemberType_IfcStructuralMember(), newIfcStructuralMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE__IFC_STRUCTURAL_MEMBER_GROUP:
				return ((InternalEList<?>)getIfcStructuralMemberGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE__IFC_STRUCTURAL_MEMBER:
				return basicSetIfcStructuralMember(null, msgs);
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
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE__IFC_STRUCTURAL_MEMBER_GROUP:
				if (coreType) return getIfcStructuralMemberGroup();
				return ((FeatureMap.Internal)getIfcStructuralMemberGroup()).getWrapper();
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE__IFC_STRUCTURAL_MEMBER:
				return getIfcStructuralMember();
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
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE__IFC_STRUCTURAL_MEMBER_GROUP:
				((FeatureMap.Internal)getIfcStructuralMemberGroup()).set(newValue);
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
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE__IFC_STRUCTURAL_MEMBER_GROUP:
				getIfcStructuralMemberGroup().clear();
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
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE__IFC_STRUCTURAL_MEMBER_GROUP:
				return ifcStructuralMemberGroup != null && !ifcStructuralMemberGroup.isEmpty();
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE__IFC_STRUCTURAL_MEMBER:
				return getIfcStructuralMember() != null;
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
		result.append(" (ifcStructuralMemberGroup: ");
		result.append(ifcStructuralMemberGroup);
		result.append(')');
		return result.toString();
	}

} //RelatingStructuralMemberTypeImpl
