/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcOpeningElement;
import ifc2x3tc1.IfcRelFillsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Fills Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelFillsElementImpl#getRelatingOpeningElement <em>Relating Opening Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelFillsElementImpl#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelFillsElementImpl extends IfcRelConnectsImpl implements IfcRelFillsElement {
	/**
	 * The cached value of the '{@link #getRelatingOpeningElement() <em>Relating Opening Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingOpeningElement()
	 * @generated
	 * @ordered
	 */
	protected IfcOpeningElement relatingOpeningElement;

	/**
	 * The cached value of the '{@link #getRelatedBuildingElement() <em>Related Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedBuildingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcElement relatedBuildingElement;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelFillsElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpeningElement getRelatingOpeningElement() {
		if (relatingOpeningElement != null && relatingOpeningElement.eIsProxy()) {
			InternalEObject oldRelatingOpeningElement = (InternalEObject)relatingOpeningElement;
			relatingOpeningElement = (IfcOpeningElement)eResolveProxy(oldRelatingOpeningElement);
			if (relatingOpeningElement != oldRelatingOpeningElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT, oldRelatingOpeningElement, relatingOpeningElement));
			}
		}
		return relatingOpeningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpeningElement basicGetRelatingOpeningElement() {
		return relatingOpeningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingOpeningElement(IfcOpeningElement newRelatingOpeningElement, NotificationChain msgs) {
		IfcOpeningElement oldRelatingOpeningElement = relatingOpeningElement;
		relatingOpeningElement = newRelatingOpeningElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT, oldRelatingOpeningElement, newRelatingOpeningElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingOpeningElement(IfcOpeningElement newRelatingOpeningElement) {
		if (newRelatingOpeningElement != relatingOpeningElement) {
			NotificationChain msgs = null;
			if (relatingOpeningElement != null)
				msgs = ((InternalEObject)relatingOpeningElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS, IfcOpeningElement.class, msgs);
			if (newRelatingOpeningElement != null)
				msgs = ((InternalEObject)newRelatingOpeningElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS, IfcOpeningElement.class, msgs);
			msgs = basicSetRelatingOpeningElement(newRelatingOpeningElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT, newRelatingOpeningElement, newRelatingOpeningElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatedBuildingElement() {
		if (relatedBuildingElement != null && relatedBuildingElement.eIsProxy()) {
			InternalEObject oldRelatedBuildingElement = (InternalEObject)relatedBuildingElement;
			relatedBuildingElement = (IfcElement)eResolveProxy(oldRelatedBuildingElement);
			if (relatedBuildingElement != oldRelatedBuildingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT, oldRelatedBuildingElement, relatedBuildingElement));
			}
		}
		return relatedBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement basicGetRelatedBuildingElement() {
		return relatedBuildingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedBuildingElement(IfcElement newRelatedBuildingElement, NotificationChain msgs) {
		IfcElement oldRelatedBuildingElement = relatedBuildingElement;
		relatedBuildingElement = newRelatedBuildingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT, oldRelatedBuildingElement, newRelatedBuildingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedBuildingElement(IfcElement newRelatedBuildingElement) {
		if (newRelatedBuildingElement != relatedBuildingElement) {
			NotificationChain msgs = null;
			if (relatedBuildingElement != null)
				msgs = ((InternalEObject)relatedBuildingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS, IfcElement.class, msgs);
			if (newRelatedBuildingElement != null)
				msgs = ((InternalEObject)newRelatedBuildingElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS, IfcElement.class, msgs);
			msgs = basicSetRelatedBuildingElement(newRelatedBuildingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT, newRelatedBuildingElement, newRelatedBuildingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				if (relatingOpeningElement != null)
					msgs = ((InternalEObject)relatingOpeningElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_OPENING_ELEMENT__HAS_FILLINGS, IfcOpeningElement.class, msgs);
				return basicSetRelatingOpeningElement((IfcOpeningElement)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				if (relatedBuildingElement != null)
					msgs = ((InternalEObject)relatedBuildingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__FILLS_VOIDS, IfcElement.class, msgs);
				return basicSetRelatedBuildingElement((IfcElement)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				return basicSetRelatingOpeningElement(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
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
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				if (resolve) return getRelatingOpeningElement();
				return basicGetRelatingOpeningElement();
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				if (resolve) return getRelatedBuildingElement();
				return basicGetRelatedBuildingElement();
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
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				setRelatingOpeningElement((IfcOpeningElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				setRelatedBuildingElement((IfcElement)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				setRelatingOpeningElement((IfcOpeningElement)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				setRelatedBuildingElement((IfcElement)null);
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
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATING_OPENING_ELEMENT:
				return relatingOpeningElement != null;
			case Ifc2x3tc1Package.IFC_REL_FILLS_ELEMENT__RELATED_BUILDING_ELEMENT:
				return relatedBuildingElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelFillsElementImpl
