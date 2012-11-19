/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelVoidsElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedOpeningElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingBuildingElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Voids Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelVoidsElementImpl#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelVoidsElementImpl#getRelatedOpeningElement <em>Related Opening Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelVoidsElementImpl extends IfcRelConnectsImpl implements IfcRelVoidsElement {
	/**
	 * The cached value of the '{@link #getRelatingBuildingElement() <em>Relating Building Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingBuildingElement()
	 * @generated
	 * @ordered
	 */
	protected RelatingBuildingElementType relatingBuildingElement;

	/**
	 * The cached value of the '{@link #getRelatedOpeningElement() <em>Related Opening Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedOpeningElement()
	 * @generated
	 * @ordered
	 */
	protected RelatedOpeningElementType relatedOpeningElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelVoidsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelVoidsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingBuildingElementType getRelatingBuildingElement() {
		return relatingBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingBuildingElement(RelatingBuildingElementType newRelatingBuildingElement, NotificationChain msgs) {
		RelatingBuildingElementType oldRelatingBuildingElement = relatingBuildingElement;
		relatingBuildingElement = newRelatingBuildingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT, oldRelatingBuildingElement, newRelatingBuildingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingBuildingElement(RelatingBuildingElementType newRelatingBuildingElement) {
		if (newRelatingBuildingElement != relatingBuildingElement) {
			NotificationChain msgs = null;
			if (relatingBuildingElement != null)
				msgs = ((InternalEObject)relatingBuildingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT, null, msgs);
			if (newRelatingBuildingElement != null)
				msgs = ((InternalEObject)newRelatingBuildingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT, null, msgs);
			msgs = basicSetRelatingBuildingElement(newRelatingBuildingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT, newRelatingBuildingElement, newRelatingBuildingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedOpeningElementType getRelatedOpeningElement() {
		return relatedOpeningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedOpeningElement(RelatedOpeningElementType newRelatedOpeningElement, NotificationChain msgs) {
		RelatedOpeningElementType oldRelatedOpeningElement = relatedOpeningElement;
		relatedOpeningElement = newRelatedOpeningElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, oldRelatedOpeningElement, newRelatedOpeningElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedOpeningElement(RelatedOpeningElementType newRelatedOpeningElement) {
		if (newRelatedOpeningElement != relatedOpeningElement) {
			NotificationChain msgs = null;
			if (relatedOpeningElement != null)
				msgs = ((InternalEObject)relatedOpeningElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, null, msgs);
			if (newRelatedOpeningElement != null)
				msgs = ((InternalEObject)newRelatedOpeningElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, null, msgs);
			msgs = basicSetRelatedOpeningElement(newRelatedOpeningElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, newRelatedOpeningElement, newRelatedOpeningElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				return basicSetRelatingBuildingElement(null, msgs);
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				return basicSetRelatedOpeningElement(null, msgs);
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
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				return getRelatingBuildingElement();
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				return getRelatedOpeningElement();
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
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				setRelatingBuildingElement((RelatingBuildingElementType)newValue);
				return;
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				setRelatedOpeningElement((RelatedOpeningElementType)newValue);
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
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				setRelatingBuildingElement((RelatingBuildingElementType)null);
				return;
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				setRelatedOpeningElement((RelatedOpeningElementType)null);
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
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				return relatingBuildingElement != null;
			case FinalPackage.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				return relatedOpeningElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelVoidsElementImpl
