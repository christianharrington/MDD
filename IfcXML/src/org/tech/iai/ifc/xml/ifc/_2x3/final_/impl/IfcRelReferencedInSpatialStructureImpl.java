/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelReferencedInSpatialStructure;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedElementsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingStructureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Referenced In Spatial Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelReferencedInSpatialStructureImpl#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelReferencedInSpatialStructureImpl#getRelatingStructure <em>Relating Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelReferencedInSpatialStructureImpl extends IfcRelConnectsImpl implements IfcRelReferencedInSpatialStructure {
	/**
	 * The cached value of the '{@link #getRelatedElements() <em>Related Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected RelatedElementsType relatedElements;

	/**
	 * The cached value of the '{@link #getRelatingStructure() <em>Relating Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingStructure()
	 * @generated
	 * @ordered
	 */
	protected RelatingStructureType relatingStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelReferencedInSpatialStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelReferencedInSpatialStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedElementsType getRelatedElements() {
		return relatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedElements(RelatedElementsType newRelatedElements, NotificationChain msgs) {
		RelatedElementsType oldRelatedElements = relatedElements;
		relatedElements = newRelatedElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS, oldRelatedElements, newRelatedElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedElements(RelatedElementsType newRelatedElements) {
		if (newRelatedElements != relatedElements) {
			NotificationChain msgs = null;
			if (relatedElements != null)
				msgs = ((InternalEObject)relatedElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS, null, msgs);
			if (newRelatedElements != null)
				msgs = ((InternalEObject)newRelatedElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS, null, msgs);
			msgs = basicSetRelatedElements(newRelatedElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS, newRelatedElements, newRelatedElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingStructureType getRelatingStructure() {
		return relatingStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingStructure(RelatingStructureType newRelatingStructure, NotificationChain msgs) {
		RelatingStructureType oldRelatingStructure = relatingStructure;
		relatingStructure = newRelatingStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE, oldRelatingStructure, newRelatingStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingStructure(RelatingStructureType newRelatingStructure) {
		if (newRelatingStructure != relatingStructure) {
			NotificationChain msgs = null;
			if (relatingStructure != null)
				msgs = ((InternalEObject)relatingStructure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE, null, msgs);
			if (newRelatingStructure != null)
				msgs = ((InternalEObject)newRelatingStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE, null, msgs);
			msgs = basicSetRelatingStructure(newRelatingStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE, newRelatingStructure, newRelatingStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS:
				return basicSetRelatedElements(null, msgs);
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				return basicSetRelatingStructure(null, msgs);
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
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS:
				return getRelatedElements();
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				return getRelatingStructure();
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
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS:
				setRelatedElements((RelatedElementsType)newValue);
				return;
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				setRelatingStructure((RelatingStructureType)newValue);
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
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS:
				setRelatedElements((RelatedElementsType)null);
				return;
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				setRelatingStructure((RelatingStructureType)null);
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
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATED_ELEMENTS:
				return relatedElements != null;
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE__RELATING_STRUCTURE:
				return relatingStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelReferencedInSpatialStructureImpl
