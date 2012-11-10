/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcPort;
import ifc2x3tc1.IfcRelConnectsPortToElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Port To Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsPortToElementImpl#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsPortToElementImpl#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsPortToElementImpl extends IfcRelConnectsImpl implements IfcRelConnectsPortToElement {
	/**
	 * The cached value of the '{@link #getRelatingPort() <em>Relating Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingPort()
	 * @generated
	 * @ordered
	 */
	protected IfcPort relatingPort;

	/**
	 * The cached value of the '{@link #getRelatedElement() <em>Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected IfcElement relatedElement;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsPortToElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort getRelatingPort() {
		if (relatingPort != null && relatingPort.eIsProxy()) {
			InternalEObject oldRelatingPort = (InternalEObject)relatingPort;
			relatingPort = (IfcPort)eResolveProxy(oldRelatingPort);
			if (relatingPort != oldRelatingPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, oldRelatingPort, relatingPort));
			}
		}
		return relatingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort basicGetRelatingPort() {
		return relatingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingPort(IfcPort newRelatingPort, NotificationChain msgs) {
		IfcPort oldRelatingPort = relatingPort;
		relatingPort = newRelatingPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, oldRelatingPort, newRelatingPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingPort(IfcPort newRelatingPort) {
		if (newRelatingPort != relatingPort) {
			NotificationChain msgs = null;
			if (relatingPort != null)
				msgs = ((InternalEObject)relatingPort).eInverseRemove(this, Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN, IfcPort.class, msgs);
			if (newRelatingPort != null)
				msgs = ((InternalEObject)newRelatingPort).eInverseAdd(this, Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN, IfcPort.class, msgs);
			msgs = basicSetRelatingPort(newRelatingPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, newRelatingPort, newRelatingPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRelatedElement() {
		if (relatedElement != null && relatedElement.eIsProxy()) {
			InternalEObject oldRelatedElement = (InternalEObject)relatedElement;
			relatedElement = (IfcElement)eResolveProxy(oldRelatedElement);
			if (relatedElement != oldRelatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT, oldRelatedElement, relatedElement));
			}
		}
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement basicGetRelatedElement() {
		return relatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedElement(IfcElement newRelatedElement, NotificationChain msgs) {
		IfcElement oldRelatedElement = relatedElement;
		relatedElement = newRelatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT, oldRelatedElement, newRelatedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedElement(IfcElement newRelatedElement) {
		if (newRelatedElement != relatedElement) {
			NotificationChain msgs = null;
			if (relatedElement != null)
				msgs = ((InternalEObject)relatedElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS, IfcElement.class, msgs);
			if (newRelatedElement != null)
				msgs = ((InternalEObject)newRelatedElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS, IfcElement.class, msgs);
			msgs = basicSetRelatedElement(newRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT, newRelatedElement, newRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				if (relatingPort != null)
					msgs = ((InternalEObject)relatingPort).eInverseRemove(this, Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN, IfcPort.class, msgs);
				return basicSetRelatingPort((IfcPort)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				if (relatedElement != null)
					msgs = ((InternalEObject)relatedElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__HAS_PORTS, IfcElement.class, msgs);
				return basicSetRelatedElement((IfcElement)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				return basicSetRelatingPort(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				if (resolve) return getRelatingPort();
				return basicGetRelatingPort();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				if (resolve) return getRelatedElement();
				return basicGetRelatedElement();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				setRelatingPort((IfcPort)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				setRelatedElement((IfcElement)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				setRelatingPort((IfcPort)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				setRelatedElement((IfcElement)null);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT:
				return relatingPort != null;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATED_ELEMENT:
				return relatedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsPortToElementImpl
