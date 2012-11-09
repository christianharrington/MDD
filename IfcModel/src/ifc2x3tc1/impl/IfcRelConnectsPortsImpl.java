/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcPort;
import ifc2x3tc1.IfcRelConnectsPorts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsPortsImpl#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsPortsImpl#getRelatedPort <em>Related Port</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsPortsImpl#getRealizingElement <em>Realizing Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsPortsImpl extends IfcRelConnectsImpl implements IfcRelConnectsPorts {
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
	 * The cached value of the '{@link #getRelatedPort() <em>Related Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPort()
	 * @generated
	 * @ordered
	 */
	protected IfcPort relatedPort;

	/**
	 * The cached value of the '{@link #getRealizingElement() <em>Realizing Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcElement realizingElement;

	/**
	 * This is true if the Realizing Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean realizingElementESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsPorts();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT, oldRelatingPort, relatingPort));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT, oldRelatingPort, newRelatingPort);
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
				msgs = ((InternalEObject)relatingPort).eInverseRemove(this, Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO, IfcPort.class, msgs);
			if (newRelatingPort != null)
				msgs = ((InternalEObject)newRelatingPort).eInverseAdd(this, Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO, IfcPort.class, msgs);
			msgs = basicSetRelatingPort(newRelatingPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT, newRelatingPort, newRelatingPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort getRelatedPort() {
		if (relatedPort != null && relatedPort.eIsProxy()) {
			InternalEObject oldRelatedPort = (InternalEObject)relatedPort;
			relatedPort = (IfcPort)eResolveProxy(oldRelatedPort);
			if (relatedPort != oldRelatedPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT, oldRelatedPort, relatedPort));
			}
		}
		return relatedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPort basicGetRelatedPort() {
		return relatedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedPort(IfcPort newRelatedPort, NotificationChain msgs) {
		IfcPort oldRelatedPort = relatedPort;
		relatedPort = newRelatedPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT, oldRelatedPort, newRelatedPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedPort(IfcPort newRelatedPort) {
		if (newRelatedPort != relatedPort) {
			NotificationChain msgs = null;
			if (relatedPort != null)
				msgs = ((InternalEObject)relatedPort).eInverseRemove(this, Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM, IfcPort.class, msgs);
			if (newRelatedPort != null)
				msgs = ((InternalEObject)newRelatedPort).eInverseAdd(this, Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM, IfcPort.class, msgs);
			msgs = basicSetRelatedPort(newRelatedPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT, newRelatedPort, newRelatedPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement getRealizingElement() {
		if (realizingElement != null && realizingElement.eIsProxy()) {
			InternalEObject oldRealizingElement = (InternalEObject)realizingElement;
			realizingElement = (IfcElement)eResolveProxy(oldRealizingElement);
			if (realizingElement != oldRealizingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT, oldRealizingElement, realizingElement));
			}
		}
		return realizingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElement basicGetRealizingElement() {
		return realizingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizingElement(IfcElement newRealizingElement) {
		IfcElement oldRealizingElement = realizingElement;
		realizingElement = newRealizingElement;
		boolean oldRealizingElementESet = realizingElementESet;
		realizingElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT, oldRealizingElement, realizingElement, !oldRealizingElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRealizingElement() {
		IfcElement oldRealizingElement = realizingElement;
		boolean oldRealizingElementESet = realizingElementESet;
		realizingElement = null;
		realizingElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT, oldRealizingElement, null, oldRealizingElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRealizingElement() {
		return realizingElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				if (relatingPort != null)
					msgs = ((InternalEObject)relatingPort).eInverseRemove(this, Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO, IfcPort.class, msgs);
				return basicSetRelatingPort((IfcPort)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				if (relatedPort != null)
					msgs = ((InternalEObject)relatedPort).eInverseRemove(this, Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM, IfcPort.class, msgs);
				return basicSetRelatedPort((IfcPort)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				return basicSetRelatingPort(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				return basicSetRelatedPort(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				if (resolve) return getRelatingPort();
				return basicGetRelatingPort();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				if (resolve) return getRelatedPort();
				return basicGetRelatedPort();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT:
				if (resolve) return getRealizingElement();
				return basicGetRealizingElement();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				setRelatingPort((IfcPort)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				setRelatedPort((IfcPort)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT:
				setRealizingElement((IfcElement)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				setRelatingPort((IfcPort)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				setRelatedPort((IfcPort)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT:
				unsetRealizingElement();
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT:
				return relatingPort != null;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT:
				return relatedPort != null;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__REALIZING_ELEMENT:
				return isSetRealizingElement();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsPortsImpl
