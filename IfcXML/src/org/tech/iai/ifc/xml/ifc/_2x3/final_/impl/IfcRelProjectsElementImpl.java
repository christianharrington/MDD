/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelProjectsElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedFeatureElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Projects Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelProjectsElementImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelProjectsElementImpl#getRelatedFeatureElement <em>Related Feature Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelProjectsElementImpl extends IfcRelConnectsImpl implements IfcRelProjectsElement {
	/**
	 * The cached value of the '{@link #getRelatingElement() <em>Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected RelatingElementType relatingElement;

	/**
	 * The cached value of the '{@link #getRelatedFeatureElement() <em>Related Feature Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedFeatureElement()
	 * @generated
	 * @ordered
	 */
	protected RelatedFeatureElementType relatedFeatureElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelProjectsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelProjectsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingElementType getRelatingElement() {
		return relatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingElement(RelatingElementType newRelatingElement, NotificationChain msgs) {
		RelatingElementType oldRelatingElement = relatingElement;
		relatingElement = newRelatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT, oldRelatingElement, newRelatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(RelatingElementType newRelatingElement) {
		if (newRelatingElement != relatingElement) {
			NotificationChain msgs = null;
			if (relatingElement != null)
				msgs = ((InternalEObject)relatingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT, null, msgs);
			if (newRelatingElement != null)
				msgs = ((InternalEObject)newRelatingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT, null, msgs);
			msgs = basicSetRelatingElement(newRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT, newRelatingElement, newRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedFeatureElementType getRelatedFeatureElement() {
		return relatedFeatureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedFeatureElement(RelatedFeatureElementType newRelatedFeatureElement, NotificationChain msgs) {
		RelatedFeatureElementType oldRelatedFeatureElement = relatedFeatureElement;
		relatedFeatureElement = newRelatedFeatureElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, oldRelatedFeatureElement, newRelatedFeatureElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedFeatureElement(RelatedFeatureElementType newRelatedFeatureElement) {
		if (newRelatedFeatureElement != relatedFeatureElement) {
			NotificationChain msgs = null;
			if (relatedFeatureElement != null)
				msgs = ((InternalEObject)relatedFeatureElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, null, msgs);
			if (newRelatedFeatureElement != null)
				msgs = ((InternalEObject)newRelatedFeatureElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, null, msgs);
			msgs = basicSetRelatedFeatureElement(newRelatedFeatureElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, newRelatedFeatureElement, newRelatedFeatureElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				return basicSetRelatingElement(null, msgs);
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				return basicSetRelatedFeatureElement(null, msgs);
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
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				return getRelatingElement();
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				return getRelatedFeatureElement();
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
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				setRelatingElement((RelatingElementType)newValue);
				return;
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				setRelatedFeatureElement((RelatedFeatureElementType)newValue);
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
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				setRelatingElement((RelatingElementType)null);
				return;
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				setRelatedFeatureElement((RelatedFeatureElementType)null);
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
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				return relatingElement != null;
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				return relatedFeatureElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelProjectsElementImpl
