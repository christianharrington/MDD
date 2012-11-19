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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MappedRepresentationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapped Representation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MappedRepresentationTypeImpl#getIfcRepresentationGroup <em>Ifc Representation Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.MappedRepresentationTypeImpl#getIfcRepresentation <em>Ifc Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappedRepresentationTypeImpl extends EObjectImpl implements MappedRepresentationType {
	/**
	 * The cached value of the '{@link #getIfcRepresentationGroup() <em>Ifc Representation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRepresentationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcRepresentationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedRepresentationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getMappedRepresentationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcRepresentationGroup() {
		if (ifcRepresentationGroup == null) {
			ifcRepresentationGroup = new BasicFeatureMap(this, FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION_GROUP);
		}
		return ifcRepresentationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentation getIfcRepresentation() {
		return (IfcRepresentation)getIfcRepresentationGroup().get(FinalPackage.eINSTANCE.getMappedRepresentationType_IfcRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRepresentation(IfcRepresentation newIfcRepresentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcRepresentationGroup()).basicAdd(FinalPackage.eINSTANCE.getMappedRepresentationType_IfcRepresentation(), newIfcRepresentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRepresentation(IfcRepresentation newIfcRepresentation) {
		((FeatureMap.Internal)getIfcRepresentationGroup()).set(FinalPackage.eINSTANCE.getMappedRepresentationType_IfcRepresentation(), newIfcRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getIfcRepresentationGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION:
				return basicSetIfcRepresentation(null, msgs);
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
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION_GROUP:
				if (coreType) return getIfcRepresentationGroup();
				return ((FeatureMap.Internal)getIfcRepresentationGroup()).getWrapper();
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION:
				return getIfcRepresentation();
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
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getIfcRepresentationGroup()).set(newValue);
				return;
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION:
				setIfcRepresentation((IfcRepresentation)newValue);
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
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION_GROUP:
				getIfcRepresentationGroup().clear();
				return;
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION:
				setIfcRepresentation((IfcRepresentation)null);
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
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION_GROUP:
				return ifcRepresentationGroup != null && !ifcRepresentationGroup.isEmpty();
			case FinalPackage.MAPPED_REPRESENTATION_TYPE__IFC_REPRESENTATION:
				return getIfcRepresentation() != null;
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
		result.append(" (ifcRepresentationGroup: ");
		result.append(ifcRepresentationGroup);
		result.append(')');
		return result.toString();
	}

} //MappedRepresentationTypeImpl
