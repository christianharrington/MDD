/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPortToElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingPortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Port To Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsPortToElementImpl#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsPortToElementImpl#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsPortToElementImpl extends IfcRelConnectsImpl implements IfcRelConnectsPortToElement {
	/**
	 * The cached value of the '{@link #getRelatingPort() <em>Relating Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingPort()
	 * @generated
	 * @ordered
	 */
	protected RelatingPortType relatingPort;

	/**
	 * The cached value of the '{@link #getRelatedElement() <em>Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected RelatedElementType relatedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPortToElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelConnectsPortToElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingPortType getRelatingPort() {
		return relatingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingPort(RelatingPortType newRelatingPort, NotificationChain msgs) {
		RelatingPortType oldRelatingPort = relatingPort;
		relatingPort = newRelatingPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, oldRelatingPort, newRelatingPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPort(RelatingPortType newRelatingPort) {
		if (newRelatingPort != relatingPort) {
			NotificationChain msgs = null;
			if (relatingPort != null)
				msgs = ((InternalEObject)relatingPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, null, msgs);
			if (newRelatingPort != null)
				msgs = ((InternalEObject)newRelatingPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, null, msgs);
			msgs = basicSetRelatingPort(newRelatingPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, newRelatingPort, newRelatingPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedElementType getRelatedElement() {
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedElement(RelatedElementType newRelatedElement, NotificationChain msgs) {
		RelatedElementType oldRelatedElement = relatedElement;
		relatedElement = newRelatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT, oldRelatedElement, newRelatedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedElement(RelatedElementType newRelatedElement) {
		if (newRelatedElement != relatedElement) {
			NotificationChain msgs = null;
			if (relatedElement != null)
				msgs = ((InternalEObject)relatedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT, null, msgs);
			if (newRelatedElement != null)
				msgs = ((InternalEObject)newRelatedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT, null, msgs);
			msgs = basicSetRelatedElement(newRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT, newRelatedElement, newRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				return basicSetRelatingPort(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				return basicSetRelatedElement(null, msgs);
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
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				return getRelatingPort();
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				return getRelatedElement();
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
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				setRelatingPort((RelatingPortType)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				setRelatedElement((RelatedElementType)newValue);
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
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				setRelatingPort((RelatingPortType)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				setRelatedElement((RelatedElementType)null);
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
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				return relatingPort != null;
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				return relatedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsPortToElementImpl
