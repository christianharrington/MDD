/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedStructuralMemberType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingElementType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Structural Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralElementImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsStructuralElementImpl#getRelatedStructuralMember <em>Related Structural Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsStructuralElementImpl extends IfcRelConnectsImpl implements IfcRelConnectsStructuralElement {
	/**
	 * The cached value of the '{@link #getRelatingElement() <em>Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected RelatingElementType2 relatingElement;

	/**
	 * The cached value of the '{@link #getRelatedStructuralMember() <em>Related Structural Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedStructuralMember()
	 * @generated
	 * @ordered
	 */
	protected RelatedStructuralMemberType relatedStructuralMember;

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
		return FinalPackage.eINSTANCE.getIfcRelConnectsStructuralElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingElementType2 getRelatingElement() {
		return relatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingElement(RelatingElementType2 newRelatingElement, NotificationChain msgs) {
		RelatingElementType2 oldRelatingElement = relatingElement;
		relatingElement = newRelatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT, oldRelatingElement, newRelatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingElement(RelatingElementType2 newRelatingElement) {
		if (newRelatingElement != relatingElement) {
			NotificationChain msgs = null;
			if (relatingElement != null)
				msgs = ((InternalEObject)relatingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT, null, msgs);
			if (newRelatingElement != null)
				msgs = ((InternalEObject)newRelatingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT, null, msgs);
			msgs = basicSetRelatingElement(newRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT, newRelatingElement, newRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedStructuralMemberType getRelatedStructuralMember() {
		return relatedStructuralMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedStructuralMember(RelatedStructuralMemberType newRelatedStructuralMember, NotificationChain msgs) {
		RelatedStructuralMemberType oldRelatedStructuralMember = relatedStructuralMember;
		relatedStructuralMember = newRelatedStructuralMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER, oldRelatedStructuralMember, newRelatedStructuralMember);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedStructuralMember(RelatedStructuralMemberType newRelatedStructuralMember) {
		if (newRelatedStructuralMember != relatedStructuralMember) {
			NotificationChain msgs = null;
			if (relatedStructuralMember != null)
				msgs = ((InternalEObject)relatedStructuralMember).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER, null, msgs);
			if (newRelatedStructuralMember != null)
				msgs = ((InternalEObject)newRelatedStructuralMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER, null, msgs);
			msgs = basicSetRelatedStructuralMember(newRelatedStructuralMember, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER, newRelatedStructuralMember, newRelatedStructuralMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				return basicSetRelatingElement(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				return getRelatingElement();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				return getRelatedStructuralMember();
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				setRelatingElement((RelatingElementType2)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				setRelatedStructuralMember((RelatedStructuralMemberType)newValue);
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				setRelatingElement((RelatingElementType2)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				setRelatedStructuralMember((RelatedStructuralMemberType)null);
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
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATING_ELEMENT:
				return relatingElement != null;
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT__RELATED_STRUCTURAL_MEMBER:
				return relatedStructuralMember != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsStructuralElementImpl
