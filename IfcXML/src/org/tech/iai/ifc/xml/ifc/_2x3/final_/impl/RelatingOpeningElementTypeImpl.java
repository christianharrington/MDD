/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpeningElement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingOpeningElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relating Opening Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.RelatingOpeningElementTypeImpl#getIfcOpeningElement <em>Ifc Opening Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatingOpeningElementTypeImpl extends EObjectImpl implements RelatingOpeningElementType {
	/**
	 * The cached value of the '{@link #getIfcOpeningElement() <em>Ifc Opening Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcOpeningElement()
	 * @generated
	 * @ordered
	 */
	protected IfcOpeningElement ifcOpeningElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatingOpeningElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getRelatingOpeningElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpeningElement getIfcOpeningElement() {
		return ifcOpeningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcOpeningElement(IfcOpeningElement newIfcOpeningElement, NotificationChain msgs) {
		IfcOpeningElement oldIfcOpeningElement = ifcOpeningElement;
		ifcOpeningElement = newIfcOpeningElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_OPENING_ELEMENT_TYPE__IFC_OPENING_ELEMENT, oldIfcOpeningElement, newIfcOpeningElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcOpeningElement(IfcOpeningElement newIfcOpeningElement) {
		if (newIfcOpeningElement != ifcOpeningElement) {
			NotificationChain msgs = null;
			if (ifcOpeningElement != null)
				msgs = ((InternalEObject)ifcOpeningElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_OPENING_ELEMENT_TYPE__IFC_OPENING_ELEMENT, null, msgs);
			if (newIfcOpeningElement != null)
				msgs = ((InternalEObject)newIfcOpeningElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RELATING_OPENING_ELEMENT_TYPE__IFC_OPENING_ELEMENT, null, msgs);
			msgs = basicSetIfcOpeningElement(newIfcOpeningElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RELATING_OPENING_ELEMENT_TYPE__IFC_OPENING_ELEMENT, newIfcOpeningElement, newIfcOpeningElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RELATING_OPENING_ELEMENT_TYPE__IFC_OPENING_ELEMENT:
				return basicSetIfcOpeningElement(null, msgs);
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
			case FinalPackage.RELATING_OPENING_ELEMENT_TYPE__IFC_OPENING_ELEMENT:
				return getIfcOpeningElement();
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
			case FinalPackage.RELATING_OPENING_ELEMENT_TYPE__IFC_OPENING_ELEMENT:
				setIfcOpeningElement((IfcOpeningElement)newValue);
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
			case FinalPackage.RELATING_OPENING_ELEMENT_TYPE__IFC_OPENING_ELEMENT:
				setIfcOpeningElement((IfcOpeningElement)null);
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
			case FinalPackage.RELATING_OPENING_ELEMENT_TYPE__IFC_OPENING_ELEMENT:
				return ifcOpeningElement != null;
		}
		return super.eIsSet(featureID);
	}

} //RelatingOpeningElementTypeImpl
