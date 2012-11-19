/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFlowControlElements;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedControlElementsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingFlowElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Flow Control Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelFlowControlElementsImpl#getRelatedControlElements <em>Related Control Elements</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelFlowControlElementsImpl#getRelatingFlowElement <em>Relating Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelFlowControlElementsImpl extends IfcRelConnectsImpl implements IfcRelFlowControlElements {
	/**
	 * The cached value of the '{@link #getRelatedControlElements() <em>Related Control Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedControlElements()
	 * @generated
	 * @ordered
	 */
	protected RelatedControlElementsType relatedControlElements;

	/**
	 * The cached value of the '{@link #getRelatingFlowElement() <em>Relating Flow Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingFlowElement()
	 * @generated
	 * @ordered
	 */
	protected RelatingFlowElementType relatingFlowElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelFlowControlElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelFlowControlElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedControlElementsType getRelatedControlElements() {
		return relatedControlElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedControlElements(RelatedControlElementsType newRelatedControlElements, NotificationChain msgs) {
		RelatedControlElementsType oldRelatedControlElements = relatedControlElements;
		relatedControlElements = newRelatedControlElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS, oldRelatedControlElements, newRelatedControlElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedControlElements(RelatedControlElementsType newRelatedControlElements) {
		if (newRelatedControlElements != relatedControlElements) {
			NotificationChain msgs = null;
			if (relatedControlElements != null)
				msgs = ((InternalEObject)relatedControlElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS, null, msgs);
			if (newRelatedControlElements != null)
				msgs = ((InternalEObject)newRelatedControlElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS, null, msgs);
			msgs = basicSetRelatedControlElements(newRelatedControlElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS, newRelatedControlElements, newRelatedControlElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingFlowElementType getRelatingFlowElement() {
		return relatingFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingFlowElement(RelatingFlowElementType newRelatingFlowElement, NotificationChain msgs) {
		RelatingFlowElementType oldRelatingFlowElement = relatingFlowElement;
		relatingFlowElement = newRelatingFlowElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT, oldRelatingFlowElement, newRelatingFlowElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingFlowElement(RelatingFlowElementType newRelatingFlowElement) {
		if (newRelatingFlowElement != relatingFlowElement) {
			NotificationChain msgs = null;
			if (relatingFlowElement != null)
				msgs = ((InternalEObject)relatingFlowElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT, null, msgs);
			if (newRelatingFlowElement != null)
				msgs = ((InternalEObject)newRelatingFlowElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT, null, msgs);
			msgs = basicSetRelatingFlowElement(newRelatingFlowElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT, newRelatingFlowElement, newRelatingFlowElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				return basicSetRelatedControlElements(null, msgs);
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				return basicSetRelatingFlowElement(null, msgs);
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
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				return getRelatedControlElements();
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				return getRelatingFlowElement();
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
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				setRelatedControlElements((RelatedControlElementsType)newValue);
				return;
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				setRelatingFlowElement((RelatingFlowElementType)newValue);
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
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				setRelatedControlElements((RelatedControlElementsType)null);
				return;
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				setRelatingFlowElement((RelatingFlowElementType)null);
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
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATED_CONTROL_ELEMENTS:
				return relatedControlElements != null;
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS__RELATING_FLOW_ELEMENT:
				return relatingFlowElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelFlowControlElementsImpl
