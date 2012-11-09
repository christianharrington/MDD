/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcFeatureElementSubtraction;
import ifc2x3tc1.IfcRelVoidsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Voids Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelVoidsElementImpl#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelVoidsElementImpl#getRelatedOpeningElement <em>Related Opening Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelVoidsElementImpl extends IfcRelConnectsImpl implements IfcRelVoidsElement {
	/**
	 * The cached value of the '{@link #getRelatingBuildingElement() <em>Relating Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingBuildingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcElement relatingBuildingElement;

	/**
	 * The cached value of the '{@link #getRelatedOpeningElement() <em>Related Opening Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedOpeningElement()
	 * @generated
	 * @ordered
	 */
	protected IfcFeatureElementSubtraction relatedOpeningElement;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelVoidsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatingBuildingElement() {
		if (relatingBuildingElement != null && relatingBuildingElement.eIsProxy()) {
			InternalEObject oldRelatingBuildingElement = (InternalEObject)relatingBuildingElement;
			relatingBuildingElement = (IfcElement)eResolveProxy(oldRelatingBuildingElement);
			if (relatingBuildingElement != oldRelatingBuildingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT, oldRelatingBuildingElement, relatingBuildingElement));
			}
		}
		return relatingBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement basicGetRelatingBuildingElement() {
		return relatingBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingBuildingElement(IfcElement newRelatingBuildingElement, NotificationChain msgs) {
		IfcElement oldRelatingBuildingElement = relatingBuildingElement;
		relatingBuildingElement = newRelatingBuildingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT, oldRelatingBuildingElement, newRelatingBuildingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingBuildingElement(IfcElement newRelatingBuildingElement) {
		if (newRelatingBuildingElement != relatingBuildingElement) {
			NotificationChain msgs = null;
			if (relatingBuildingElement != null)
				msgs = ((InternalEObject)relatingBuildingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS, IfcElement.class, msgs);
			if (newRelatingBuildingElement != null)
				msgs = ((InternalEObject)newRelatingBuildingElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS, IfcElement.class, msgs);
			msgs = basicSetRelatingBuildingElement(newRelatingBuildingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT, newRelatingBuildingElement, newRelatingBuildingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFeatureElementSubtraction getRelatedOpeningElement() {
		if (relatedOpeningElement != null && relatedOpeningElement.eIsProxy()) {
			InternalEObject oldRelatedOpeningElement = (InternalEObject)relatedOpeningElement;
			relatedOpeningElement = (IfcFeatureElementSubtraction)eResolveProxy(oldRelatedOpeningElement);
			if (relatedOpeningElement != oldRelatedOpeningElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, oldRelatedOpeningElement, relatedOpeningElement));
			}
		}
		return relatedOpeningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFeatureElementSubtraction basicGetRelatedOpeningElement() {
		return relatedOpeningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedOpeningElement(IfcFeatureElementSubtraction newRelatedOpeningElement, NotificationChain msgs) {
		IfcFeatureElementSubtraction oldRelatedOpeningElement = relatedOpeningElement;
		relatedOpeningElement = newRelatedOpeningElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, oldRelatedOpeningElement, newRelatedOpeningElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedOpeningElement(IfcFeatureElementSubtraction newRelatedOpeningElement) {
		if (newRelatedOpeningElement != relatedOpeningElement) {
			NotificationChain msgs = null;
			if (relatedOpeningElement != null)
				msgs = ((InternalEObject)relatedOpeningElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, IfcFeatureElementSubtraction.class, msgs);
			if (newRelatedOpeningElement != null)
				msgs = ((InternalEObject)newRelatedOpeningElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, IfcFeatureElementSubtraction.class, msgs);
			msgs = basicSetRelatedOpeningElement(newRelatedOpeningElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT, newRelatedOpeningElement, newRelatedOpeningElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				if (relatingBuildingElement != null)
					msgs = ((InternalEObject)relatingBuildingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_OPENINGS, IfcElement.class, msgs);
				return basicSetRelatingBuildingElement((IfcElement)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				if (relatedOpeningElement != null)
					msgs = ((InternalEObject)relatedOpeningElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_FEATURE_ELEMENT_SUBTRACTION__VOIDS_ELEMENTS, IfcFeatureElementSubtraction.class, msgs);
				return basicSetRelatedOpeningElement((IfcFeatureElementSubtraction)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				return basicSetRelatingBuildingElement(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
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
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				if (resolve) return getRelatingBuildingElement();
				return basicGetRelatingBuildingElement();
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				if (resolve) return getRelatedOpeningElement();
				return basicGetRelatedOpeningElement();
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
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				setRelatingBuildingElement((IfcElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				setRelatedOpeningElement((IfcFeatureElementSubtraction)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				setRelatingBuildingElement((IfcElement)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				setRelatedOpeningElement((IfcFeatureElementSubtraction)null);
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
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATING_BUILDING_ELEMENT:
				return relatingBuildingElement != null;
			case Ifc2x3tc1Package.IFC_REL_VOIDS_ELEMENT__RELATED_OPENING_ELEMENT:
				return relatedOpeningElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelVoidsElementImpl
