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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductRepresentation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RepresentationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RepresentationTypeImpl#getIfcProductRepresentationGroup <em>Ifc Product Representation Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RepresentationTypeImpl#getIfcProductRepresentation <em>Ifc Product Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepresentationTypeImpl extends EObjectImpl implements RepresentationType {
	/**
	 * The cached value of the '{@link #getIfcProductRepresentationGroup() <em>Ifc Product Representation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcProductRepresentationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcProductRepresentationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRepresentationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcProductRepresentationGroup() {
		if (ifcProductRepresentationGroup == null) {
			ifcProductRepresentationGroup = new BasicFeatureMap(this, FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION_GROUP);
		}
		return ifcProductRepresentationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductRepresentation getIfcProductRepresentation() {
		return (IfcProductRepresentation)getIfcProductRepresentationGroup().get(FinalPackage.eINSTANCE.getRepresentationType_IfcProductRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcProductRepresentation(IfcProductRepresentation newIfcProductRepresentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcProductRepresentationGroup()).basicAdd(FinalPackage.eINSTANCE.getRepresentationType_IfcProductRepresentation(), newIfcProductRepresentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcProductRepresentation(IfcProductRepresentation newIfcProductRepresentation) {
		((FeatureMap.Internal)getIfcProductRepresentationGroup()).set(FinalPackage.eINSTANCE.getRepresentationType_IfcProductRepresentation(), newIfcProductRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getIfcProductRepresentationGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION:
				return basicSetIfcProductRepresentation(null, msgs);
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
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION_GROUP:
				if (coreType) return getIfcProductRepresentationGroup();
				return ((FeatureMap.Internal)getIfcProductRepresentationGroup()).getWrapper();
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION:
				return getIfcProductRepresentation();
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
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getIfcProductRepresentationGroup()).set(newValue);
				return;
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION:
				setIfcProductRepresentation((IfcProductRepresentation)newValue);
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
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION_GROUP:
				getIfcProductRepresentationGroup().clear();
				return;
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION:
				setIfcProductRepresentation((IfcProductRepresentation)null);
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
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION_GROUP:
				return ifcProductRepresentationGroup != null && !ifcProductRepresentationGroup.isEmpty();
			case FinalPackage.REPRESENTATION_TYPE__IFC_PRODUCT_REPRESENTATION:
				return getIfcProductRepresentation() != null;
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
		result.append(" (ifcProductRepresentationGroup: ");
		result.append(ifcProductRepresentationGroup);
		result.append(')');
		return result.toString();
	}

} //RepresentationTypeImpl
