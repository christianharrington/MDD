/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcRelConnectsStructuralElement;
import ifc2x3tc1.IfcStructuralMember;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Structural Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralElementImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsStructuralElementImpl#getRelatedStructuralMember <em>Related Structural Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsStructuralElementImpl extends IfcRelConnectsImpl implements IfcRelConnectsStructuralElement {
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
	 * The cached value of the '{@link #getRelatedStructuralMember() <em>Related Structural Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStructuralMember()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralMember relatedStructuralMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsStructuralElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsStructuralElement();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT, oldRelatingElement, relatingElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT, oldRelatingElement, newRelatingElement);
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
				msgs = ((InternalEObject)relatingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER, IfcElement.class, msgs);
			if (newRelatingElement != null)
				msgs = ((InternalEObject)newRelatingElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER, IfcElement.class, msgs);
			msgs = basicSetRelatingElement(newRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT, newRelatingElement, newRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralMember getRelatedStructuralMember() {
		if (relatedStructuralMember != null && relatedStructuralMember.eIsProxy()) {
			InternalEObject oldRelatedStructuralMember = (InternalEObject)relatedStructuralMember;
			relatedStructuralMember = (IfcStructuralMember)eResolveProxy(oldRelatedStructuralMember);
			if (relatedStructuralMember != oldRelatedStructuralMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER, oldRelatedStructuralMember, relatedStructuralMember));
			}
		}
		return relatedStructuralMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralMember basicGetRelatedStructuralMember() {
		return relatedStructuralMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedStructuralMember(IfcStructuralMember newRelatedStructuralMember, NotificationChain msgs) {
		IfcStructuralMember oldRelatedStructuralMember = relatedStructuralMember;
		relatedStructuralMember = newRelatedStructuralMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER, oldRelatedStructuralMember, newRelatedStructuralMember);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStructuralMember(IfcStructuralMember newRelatedStructuralMember) {
		if (newRelatedStructuralMember != relatedStructuralMember) {
			NotificationChain msgs = null;
			if (relatedStructuralMember != null)
				msgs = ((InternalEObject)relatedStructuralMember).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT, IfcStructuralMember.class, msgs);
			if (newRelatedStructuralMember != null)
				msgs = ((InternalEObject)newRelatedStructuralMember).eInverseAdd(this, Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT, IfcStructuralMember.class, msgs);
			msgs = basicSetRelatedStructuralMember(newRelatedStructuralMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER, newRelatedStructuralMember, newRelatedStructuralMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				if (relatingElement != null)
					msgs = ((InternalEObject)relatingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_STRUCTURAL_MEMBER, IfcElement.class, msgs);
				return basicSetRelatingElement((IfcElement)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				if (relatedStructuralMember != null)
					msgs = ((InternalEObject)relatedStructuralMember).eInverseRemove(this, Ifc2x3tc1Package.IFC_STRUCTURAL_MEMBER__REFERENCES_ELEMENT, IfcStructuralMember.class, msgs);
				return basicSetRelatedStructuralMember((IfcStructuralMember)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				return basicSetRelatingElement(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				return basicSetRelatedStructuralMember(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				if (resolve) return getRelatingElement();
				return basicGetRelatingElement();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				if (resolve) return getRelatedStructuralMember();
				return basicGetRelatedStructuralMember();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				setRelatingElement((IfcElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				setRelatedStructuralMember((IfcStructuralMember)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				setRelatingElement((IfcElement)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				setRelatedStructuralMember((IfcStructuralMember)null);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				return relatingElement != null;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				return relatedStructuralMember != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsStructuralElementImpl
