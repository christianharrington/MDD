/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcFeatureElementAddition;
import ifc2x3tc1.IfcRelProjectsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Projects Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelProjectsElementImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelProjectsElementImpl#getRelatedFeatureElement <em>Related Feature Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelProjectsElementImpl extends IfcRelConnectsImpl implements IfcRelProjectsElement {
	/**
	 * The cached value of the '{@link #getRelatingElement() <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcElement relatingElement;

	/**
	 * The cached value of the '{@link #getRelatedFeatureElement() <em>Related Feature Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedFeatureElement()
	 * @generated
	 * @ordered
	 */
	protected IfcFeatureElementAddition relatedFeatureElement;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelProjectsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatingElement() {
		if (relatingElement != null && relatingElement.eIsProxy()) {
			InternalEObject oldRelatingElement = (InternalEObject)relatingElement;
			relatingElement = (IfcElement)eResolveProxy(oldRelatingElement);
			if (relatingElement != oldRelatingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT, oldRelatingElement, relatingElement));
			}
		}
		return relatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement basicGetRelatingElement() {
		return relatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingElement(IfcElement newRelatingElement, NotificationChain msgs) {
		IfcElement oldRelatingElement = relatingElement;
		relatingElement = newRelatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT, oldRelatingElement, newRelatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(IfcElement newRelatingElement) {
		if (newRelatingElement != relatingElement) {
			NotificationChain msgs = null;
			if (relatingElement != null)
				msgs = ((InternalEObject)relatingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS, IfcElement.class, msgs);
			if (newRelatingElement != null)
				msgs = ((InternalEObject)newRelatingElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS, IfcElement.class, msgs);
			msgs = basicSetRelatingElement(newRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT, newRelatingElement, newRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFeatureElementAddition getRelatedFeatureElement() {
		if (relatedFeatureElement != null && relatedFeatureElement.eIsProxy()) {
			InternalEObject oldRelatedFeatureElement = (InternalEObject)relatedFeatureElement;
			relatedFeatureElement = (IfcFeatureElementAddition)eResolveProxy(oldRelatedFeatureElement);
			if (relatedFeatureElement != oldRelatedFeatureElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, oldRelatedFeatureElement, relatedFeatureElement));
			}
		}
		return relatedFeatureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFeatureElementAddition basicGetRelatedFeatureElement() {
		return relatedFeatureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedFeatureElement(IfcFeatureElementAddition newRelatedFeatureElement, NotificationChain msgs) {
		IfcFeatureElementAddition oldRelatedFeatureElement = relatedFeatureElement;
		relatedFeatureElement = newRelatedFeatureElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, oldRelatedFeatureElement, newRelatedFeatureElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedFeatureElement(IfcFeatureElementAddition newRelatedFeatureElement) {
		if (newRelatedFeatureElement != relatedFeatureElement) {
			NotificationChain msgs = null;
			if (relatedFeatureElement != null)
				msgs = ((InternalEObject)relatedFeatureElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS, IfcFeatureElementAddition.class, msgs);
			if (newRelatedFeatureElement != null)
				msgs = ((InternalEObject)newRelatedFeatureElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS, IfcFeatureElementAddition.class, msgs);
			msgs = basicSetRelatedFeatureElement(newRelatedFeatureElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT, newRelatedFeatureElement, newRelatedFeatureElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				if (relatingElement != null)
					msgs = ((InternalEObject)relatingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_PROJECTIONS, IfcElement.class, msgs);
				return basicSetRelatingElement((IfcElement)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				if (relatedFeatureElement != null)
					msgs = ((InternalEObject)relatedFeatureElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_ADDITION__PROJECTS_ELEMENTS, IfcFeatureElementAddition.class, msgs);
				return basicSetRelatedFeatureElement((IfcFeatureElementAddition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				return basicSetRelatingElement(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
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
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				if (resolve) return getRelatingElement();
				return basicGetRelatingElement();
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				if (resolve) return getRelatedFeatureElement();
				return basicGetRelatedFeatureElement();
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
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				setRelatingElement((IfcElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				setRelatedFeatureElement((IfcFeatureElementAddition)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				setRelatingElement((IfcElement)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				setRelatedFeatureElement((IfcFeatureElementAddition)null);
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
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATING_ELEMENT:
				return relatingElement != null;
			case Ifc2x3tc1Package.IFC_REL_PROJECTS_ELEMENT__RELATED_FEATURE_ELEMENT:
				return relatedFeatureElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelProjectsElementImpl
