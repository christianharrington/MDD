/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversBldgElements;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedCoveringsType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingBuildingElementType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Covers Bldg Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelCoversBldgElementsImpl#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelCoversBldgElementsImpl#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelCoversBldgElementsImpl extends IfcRelConnectsImpl implements IfcRelCoversBldgElements {
	/**
	 * The cached value of the '{@link #getRelatingBuildingElement() <em>Relating Building Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingBuildingElement()
	 * @generated
	 * @ordered
	 */
	protected RelatingBuildingElementType1 relatingBuildingElement;

	/**
	 * The cached value of the '{@link #getRelatedCoverings() <em>Related Coverings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedCoverings()
	 * @generated
	 * @ordered
	 */
	protected RelatedCoveringsType1 relatedCoverings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelCoversBldgElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelCoversBldgElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingBuildingElementType1 getRelatingBuildingElement() {
		return relatingBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingBuildingElement(RelatingBuildingElementType1 newRelatingBuildingElement, NotificationChain msgs) {
		RelatingBuildingElementType1 oldRelatingBuildingElement = relatingBuildingElement;
		relatingBuildingElement = newRelatingBuildingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT, oldRelatingBuildingElement, newRelatingBuildingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingBuildingElement(RelatingBuildingElementType1 newRelatingBuildingElement) {
		if (newRelatingBuildingElement != relatingBuildingElement) {
			NotificationChain msgs = null;
			if (relatingBuildingElement != null)
				msgs = ((InternalEObject)relatingBuildingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT, null, msgs);
			if (newRelatingBuildingElement != null)
				msgs = ((InternalEObject)newRelatingBuildingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT, null, msgs);
			msgs = basicSetRelatingBuildingElement(newRelatingBuildingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT, newRelatingBuildingElement, newRelatingBuildingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedCoveringsType1 getRelatedCoverings() {
		return relatedCoverings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedCoverings(RelatedCoveringsType1 newRelatedCoverings, NotificationChain msgs) {
		RelatedCoveringsType1 oldRelatedCoverings = relatedCoverings;
		relatedCoverings = newRelatedCoverings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS, oldRelatedCoverings, newRelatedCoverings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedCoverings(RelatedCoveringsType1 newRelatedCoverings) {
		if (newRelatedCoverings != relatedCoverings) {
			NotificationChain msgs = null;
			if (relatedCoverings != null)
				msgs = ((InternalEObject)relatedCoverings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS, null, msgs);
			if (newRelatedCoverings != null)
				msgs = ((InternalEObject)newRelatedCoverings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS, null, msgs);
			msgs = basicSetRelatedCoverings(newRelatedCoverings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS, newRelatedCoverings, newRelatedCoverings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				return basicSetRelatingBuildingElement(null, msgs);
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				return basicSetRelatedCoverings(null, msgs);
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
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				return getRelatingBuildingElement();
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				return getRelatedCoverings();
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
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				setRelatingBuildingElement((RelatingBuildingElementType1)newValue);
				return;
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				setRelatedCoverings((RelatedCoveringsType1)newValue);
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
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				setRelatingBuildingElement((RelatingBuildingElementType1)null);
				return;
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				setRelatedCoverings((RelatedCoveringsType1)null);
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
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATING_BUILDING_ELEMENT:
				return relatingBuildingElement != null;
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS__RELATED_COVERINGS:
				return relatedCoverings != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelCoversBldgElementsImpl
