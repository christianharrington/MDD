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

import org.tech.iai.ifc.xml.ifc._2x3.final_.ColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColourSpecification;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedColour;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colour Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ColourTypeImpl#getIfcColourSpecificationGroup <em>Ifc Colour Specification Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ColourTypeImpl#getIfcColourSpecification <em>Ifc Colour Specification</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ColourTypeImpl#getIfcPreDefinedColourGroup <em>Ifc Pre Defined Colour Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ColourTypeImpl#getIfcPreDefinedColour <em>Ifc Pre Defined Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColourTypeImpl extends EObjectImpl implements ColourType {
	/**
	 * The cached value of the '{@link #getIfcColourSpecificationGroup() <em>Ifc Colour Specification Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcColourSpecificationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcColourSpecificationGroup;

	/**
	 * The cached value of the '{@link #getIfcPreDefinedColourGroup() <em>Ifc Pre Defined Colour Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPreDefinedColourGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPreDefinedColourGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColourTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getColourType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcColourSpecificationGroup() {
		if (ifcColourSpecificationGroup == null) {
			ifcColourSpecificationGroup = new BasicFeatureMap(this, FinalPackage.COLOUR_TYPE__IFC_COLOUR_SPECIFICATION_GROUP);
		}
		return ifcColourSpecificationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourSpecification getIfcColourSpecification() {
		return (IfcColourSpecification)getIfcColourSpecificationGroup().get(FinalPackage.eINSTANCE.getColourType_IfcColourSpecification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcColourSpecification(IfcColourSpecification newIfcColourSpecification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcColourSpecificationGroup()).basicAdd(FinalPackage.eINSTANCE.getColourType_IfcColourSpecification(), newIfcColourSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPreDefinedColourGroup() {
		if (ifcPreDefinedColourGroup == null) {
			ifcPreDefinedColourGroup = new BasicFeatureMap(this, FinalPackage.COLOUR_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP);
		}
		return ifcPreDefinedColourGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreDefinedColour getIfcPreDefinedColour() {
		return (IfcPreDefinedColour)getIfcPreDefinedColourGroup().get(FinalPackage.eINSTANCE.getColourType_IfcPreDefinedColour(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPreDefinedColour(IfcPreDefinedColour newIfcPreDefinedColour, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPreDefinedColourGroup()).basicAdd(FinalPackage.eINSTANCE.getColourType_IfcPreDefinedColour(), newIfcPreDefinedColour, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.COLOUR_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				return ((InternalEList<?>)getIfcColourSpecificationGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.COLOUR_TYPE__IFC_COLOUR_SPECIFICATION:
				return basicSetIfcColourSpecification(null, msgs);
			case FinalPackage.COLOUR_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				return ((InternalEList<?>)getIfcPreDefinedColourGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.COLOUR_TYPE__IFC_PRE_DEFINED_COLOUR:
				return basicSetIfcPreDefinedColour(null, msgs);
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
			case FinalPackage.COLOUR_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				if (coreType) return getIfcColourSpecificationGroup();
				return ((FeatureMap.Internal)getIfcColourSpecificationGroup()).getWrapper();
			case FinalPackage.COLOUR_TYPE__IFC_COLOUR_SPECIFICATION:
				return getIfcColourSpecification();
			case FinalPackage.COLOUR_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				if (coreType) return getIfcPreDefinedColourGroup();
				return ((FeatureMap.Internal)getIfcPreDefinedColourGroup()).getWrapper();
			case FinalPackage.COLOUR_TYPE__IFC_PRE_DEFINED_COLOUR:
				return getIfcPreDefinedColour();
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
			case FinalPackage.COLOUR_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				((FeatureMap.Internal)getIfcColourSpecificationGroup()).set(newValue);
				return;
			case FinalPackage.COLOUR_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				((FeatureMap.Internal)getIfcPreDefinedColourGroup()).set(newValue);
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
			case FinalPackage.COLOUR_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				getIfcColourSpecificationGroup().clear();
				return;
			case FinalPackage.COLOUR_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				getIfcPreDefinedColourGroup().clear();
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
			case FinalPackage.COLOUR_TYPE__IFC_COLOUR_SPECIFICATION_GROUP:
				return ifcColourSpecificationGroup != null && !ifcColourSpecificationGroup.isEmpty();
			case FinalPackage.COLOUR_TYPE__IFC_COLOUR_SPECIFICATION:
				return getIfcColourSpecification() != null;
			case FinalPackage.COLOUR_TYPE__IFC_PRE_DEFINED_COLOUR_GROUP:
				return ifcPreDefinedColourGroup != null && !ifcPreDefinedColourGroup.isEmpty();
			case FinalPackage.COLOUR_TYPE__IFC_PRE_DEFINED_COLOUR:
				return getIfcPreDefinedColour() != null;
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
		result.append(" (ifcColourSpecificationGroup: ");
		result.append(ifcColourSpecificationGroup);
		result.append(", ifcPreDefinedColourGroup: ");
		result.append(ifcPreDefinedColourGroup);
		result.append(')');
		return result.toString();
	}

} //ColourTypeImpl