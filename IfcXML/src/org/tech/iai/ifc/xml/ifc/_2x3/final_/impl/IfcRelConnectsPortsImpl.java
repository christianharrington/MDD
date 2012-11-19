/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPorts;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RealizingElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedPortType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingPortType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsPortsImpl#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsPortsImpl#getRelatedPort <em>Related Port</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelConnectsPortsImpl#getRealizingElement <em>Realizing Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsPortsImpl extends IfcRelConnectsImpl implements IfcRelConnectsPorts {
	/**
	 * The cached value of the '{@link #getRelatingPort() <em>Relating Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingPort()
	 * @generated
	 * @ordered
	 */
	protected RelatingPortType1 relatingPort;

	/**
	 * The cached value of the '{@link #getRelatedPort() <em>Related Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPort()
	 * @generated
	 * @ordered
	 */
	protected RelatedPortType relatedPort;

	/**
	 * The cached value of the '{@link #getRealizingElement() <em>Realizing Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingElement()
	 * @generated
	 * @ordered
	 */
	protected RealizingElementType realizingElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelConnectsPortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelConnectsPorts();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingPortType1 getRelatingPort() {
		return relatingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingPort(RelatingPortType1 newRelatingPort, NotificationChain msgs) {
		RelatingPortType1 oldRelatingPort = relatingPort;
		relatingPort = newRelatingPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORTS__RELATING_PORT, oldRelatingPort, newRelatingPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPort(RelatingPortType1 newRelatingPort) {
		if (newRelatingPort != relatingPort) {
			NotificationChain msgs = null;
			if (relatingPort != null)
				msgs = ((InternalEObject)relatingPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORTS__RELATING_PORT, null, msgs);
			if (newRelatingPort != null)
				msgs = ((InternalEObject)newRelatingPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORTS__RELATING_PORT, null, msgs);
			msgs = basicSetRelatingPort(newRelatingPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORTS__RELATING_PORT, newRelatingPort, newRelatingPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPortType getRelatedPort() {
		return relatedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedPort(RelatedPortType newRelatedPort, NotificationChain msgs) {
		RelatedPortType oldRelatedPort = relatedPort;
		relatedPort = newRelatedPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORTS__RELATED_PORT, oldRelatedPort, newRelatedPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedPort(RelatedPortType newRelatedPort) {
		if (newRelatedPort != relatedPort) {
			NotificationChain msgs = null;
			if (relatedPort != null)
				msgs = ((InternalEObject)relatedPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORTS__RELATED_PORT, null, msgs);
			if (newRelatedPort != null)
				msgs = ((InternalEObject)newRelatedPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORTS__RELATED_PORT, null, msgs);
			msgs = basicSetRelatedPort(newRelatedPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORTS__RELATED_PORT, newRelatedPort, newRelatedPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizingElementType getRealizingElement() {
		return realizingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealizingElement(RealizingElementType newRealizingElement, NotificationChain msgs) {
		RealizingElementType oldRealizingElement = realizingElement;
		realizingElement = newRealizingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT, oldRealizingElement, newRealizingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingElement(RealizingElementType newRealizingElement) {
		if (newRealizingElement != realizingElement) {
			NotificationChain msgs = null;
			if (realizingElement != null)
				msgs = ((InternalEObject)realizingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT, null, msgs);
			if (newRealizingElement != null)
				msgs = ((InternalEObject)newRealizingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT, null, msgs);
			msgs = basicSetRealizingElement(newRealizingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT, newRealizingElement, newRealizingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				return basicSetRelatingPort(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				return basicSetRelatedPort(null, msgs);
			case FinalPackage.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT:
				return basicSetRealizingElement(null, msgs);
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
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				return getRelatingPort();
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				return getRelatedPort();
			case FinalPackage.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT:
				return getRealizingElement();
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
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				setRelatingPort((RelatingPortType1)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				setRelatedPort((RelatedPortType)newValue);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT:
				setRealizingElement((RealizingElementType)newValue);
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
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				setRelatingPort((RelatingPortType1)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				setRelatedPort((RelatedPortType)null);
				return;
			case FinalPackage.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT:
				setRealizingElement((RealizingElementType)null);
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
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				return relatingPort != null;
			case FinalPackage.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				return relatedPort != null;
			case FinalPackage.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT:
				return realizingElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsPortsImpl
