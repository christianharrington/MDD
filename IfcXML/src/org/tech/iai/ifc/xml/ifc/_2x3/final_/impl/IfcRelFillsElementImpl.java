/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFillsElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedBuildingElementType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingOpeningElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Fills Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelFillsElementImpl#getRelatingOpeningElement <em>Relating Opening Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelFillsElementImpl#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelFillsElementImpl extends IfcRelConnectsImpl implements IfcRelFillsElement {
	/**
	 * The cached value of the '{@link #getRelatingOpeningElement() <em>Relating Opening Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingOpeningElement()
	 * @generated
	 * @ordered
	 */
	protected RelatingOpeningElementType relatingOpeningElement;

	/**
	 * The cached value of the '{@link #getRelatedBuildingElement() <em>Related Building Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedBuildingElement()
	 * @generated
	 * @ordered
	 */
	protected RelatedBuildingElementType1 relatedBuildingElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelFillsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelFillsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingOpeningElementType getRelatingOpeningElement() {
		return relatingOpeningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingOpeningElement(RelatingOpeningElementType newRelatingOpeningElement, NotificationChain msgs) {
		RelatingOpeningElementType oldRelatingOpeningElement = relatingOpeningElement;
		relatingOpeningElement = newRelatingOpeningElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT, oldRelatingOpeningElement, newRelatingOpeningElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingOpeningElement(RelatingOpeningElementType newRelatingOpeningElement) {
		if (newRelatingOpeningElement != relatingOpeningElement) {
			NotificationChain msgs = null;
			if (relatingOpeningElement != null)
				msgs = ((InternalEObject)relatingOpeningElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT, null, msgs);
			if (newRelatingOpeningElement != null)
				msgs = ((InternalEObject)newRelatingOpeningElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT, null, msgs);
			msgs = basicSetRelatingOpeningElement(newRelatingOpeningElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT, newRelatingOpeningElement, newRelatingOpeningElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedBuildingElementType1 getRelatedBuildingElement() {
		return relatedBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedBuildingElement(RelatedBuildingElementType1 newRelatedBuildingElement, NotificationChain msgs) {
		RelatedBuildingElementType1 oldRelatedBuildingElement = relatedBuildingElement;
		relatedBuildingElement = newRelatedBuildingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT, oldRelatedBuildingElement, newRelatedBuildingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedBuildingElement(RelatedBuildingElementType1 newRelatedBuildingElement) {
		if (newRelatedBuildingElement != relatedBuildingElement) {
			NotificationChain msgs = null;
			if (relatedBuildingElement != null)
				msgs = ((InternalEObject)relatedBuildingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT, null, msgs);
			if (newRelatedBuildingElement != null)
				msgs = ((InternalEObject)newRelatedBuildingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT, null, msgs);
			msgs = basicSetRelatedBuildingElement(newRelatedBuildingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT, newRelatedBuildingElement, newRelatedBuildingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				return basicSetRelatingOpeningElement(null, msgs);
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				return basicSetRelatedBuildingElement(null, msgs);
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
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				return getRelatingOpeningElement();
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				return getRelatedBuildingElement();
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
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				setRelatingOpeningElement((RelatingOpeningElementType)newValue);
				return;
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				setRelatedBuildingElement((RelatedBuildingElementType1)newValue);
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
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				setRelatingOpeningElement((RelatingOpeningElementType)null);
				return;
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				setRelatedBuildingElement((RelatedBuildingElementType1)null);
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
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				return relatingOpeningElement != null;
			case FinalPackage.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				return relatedBuildingElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelFillsElementImpl
