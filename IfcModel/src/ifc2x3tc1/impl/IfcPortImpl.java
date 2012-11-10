/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPort;
import ifc2x3tc1.IfcRelConnectsPortToElement;
import ifc2x3tc1.IfcRelConnectsPorts;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPortImpl#getContainedIn <em>Contained In</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPortImpl#getConnectedFrom <em>Connected From</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPortImpl#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPortImpl extends IfcProductImpl implements IfcPort {
	/**
	 * The cached value of the '{@link #getContainedIn() <em>Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedIn()
	 * @generated
	 * @ordered
	 */
	protected IfcRelConnectsPortToElement containedIn;

	/**
	 * This is true if the Contained In reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean containedInESet;

	/**
	 * The cached value of the '{@link #getConnectedFrom() <em>Connected From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsPorts> connectedFrom;

	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsPorts> connectedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsPortToElement getContainedIn() {
		if (containedIn != null && containedIn.eIsProxy()) {
			InternalEObject oldContainedIn = (InternalEObject)containedIn;
			containedIn = (IfcRelConnectsPortToElement)eResolveProxy(oldContainedIn);
			if (containedIn != oldContainedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN, oldContainedIn, containedIn));
			}
		}
		return containedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsPortToElement basicGetContainedIn() {
		return containedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedIn(IfcRelConnectsPortToElement newContainedIn, NotificationChain msgs) {
		IfcRelConnectsPortToElement oldContainedIn = containedIn;
		containedIn = newContainedIn;
		boolean oldContainedInESet = containedInESet;
		containedInESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN, oldContainedIn, newContainedIn, !oldContainedInESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedIn(IfcRelConnectsPortToElement newContainedIn) {
		if (newContainedIn != containedIn) {
			NotificationChain msgs = null;
			if (containedIn != null)
				msgs = ((InternalEObject)containedIn).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, IfcRelConnectsPortToElement.class, msgs);
			if (newContainedIn != null)
				msgs = ((InternalEObject)newContainedIn).eInverseAdd(this, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, IfcRelConnectsPortToElement.class, msgs);
			msgs = basicSetContainedIn(newContainedIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldContainedInESet = containedInESet;
			containedInESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN, newContainedIn, newContainedIn, !oldContainedInESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetContainedIn(NotificationChain msgs) {
		IfcRelConnectsPortToElement oldContainedIn = containedIn;
		containedIn = null;
		boolean oldContainedInESet = containedInESet;
		containedInESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN, oldContainedIn, null, oldContainedInESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContainedIn() {
		if (containedIn != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)containedIn).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, IfcRelConnectsPortToElement.class, msgs);
			msgs = basicUnsetContainedIn(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldContainedInESet = containedInESet;
			containedInESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN, null, null, oldContainedInESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainedIn() {
		return containedInESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsPorts> getConnectedFrom() {
		if (connectedFrom == null) {
			connectedFrom = new EObjectWithInverseResolvingEList.Unsettable<IfcRelConnectsPorts>(IfcRelConnectsPorts.class, this, Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATED_PORT);
		}
		return connectedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectedFrom() {
		if (connectedFrom != null) ((InternalEList.Unsettable<?>)connectedFrom).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectedFrom() {
		return connectedFrom != null && ((InternalEList.Unsettable<?>)connectedFrom).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsPorts> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectWithInverseResolvingEList.Unsettable<IfcRelConnectsPorts>(IfcRelConnectsPorts.class, this, Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORTS__RELATING_PORT);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectedTo() {
		if (connectedTo != null) ((InternalEList.Unsettable<?>)connectedTo).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectedTo() {
		return connectedTo != null && ((InternalEList.Unsettable<?>)connectedTo).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN:
				if (containedIn != null)
					msgs = ((InternalEObject)containedIn).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_CONNECTS_PORT_TO_ELEMENT__RELATING_PORT, IfcRelConnectsPortToElement.class, msgs);
				return basicSetContainedIn((IfcRelConnectsPortToElement)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedFrom()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedTo()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN:
				return basicUnsetContainedIn(msgs);
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM:
				return ((InternalEList<?>)getConnectedFrom()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO:
				return ((InternalEList<?>)getConnectedTo()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN:
				if (resolve) return getContainedIn();
				return basicGetContainedIn();
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM:
				return getConnectedFrom();
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO:
				return getConnectedTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN:
				setContainedIn((IfcRelConnectsPortToElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM:
				getConnectedFrom().clear();
				getConnectedFrom().addAll((Collection<? extends IfcRelConnectsPorts>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection<? extends IfcRelConnectsPorts>)newValue);
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
			case Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN:
				unsetContainedIn();
				return;
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM:
				unsetConnectedFrom();
				return;
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO:
				unsetConnectedTo();
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
			case Ifc2x3tc1Package.IFC_PORT__CONTAINED_IN:
				return isSetContainedIn();
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_FROM:
				return isSetConnectedFrom();
			case Ifc2x3tc1Package.IFC_PORT__CONNECTED_TO:
				return isSetConnectedTo();
		}
		return super.eIsSet(featureID);
	}

} //IfcPortImpl
