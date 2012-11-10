/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConnectionGeometry;
import ifc2x3tc1.IfcElement;
import ifc2x3tc1.IfcRelConnectsElements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Connects Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsElementsImpl#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsElementsImpl#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelConnectsElementsImpl#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelConnectsElementsImpl extends IfcRelConnectsImpl implements IfcRelConnectsElements {
	/**
	 * The cached value of the '{@link #getConnectionGeometry() <em>Connection Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionGeometry()
	 * @generated
	 * @ordered
	 */
	protected IfcConnectionGeometry connectionGeometry;

	/**
	 * This is true if the Connection Geometry reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionGeometryESet;

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
	protected IfcRelConnectsElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelConnectsElements();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry getConnectionGeometry() {
		if (connectionGeometry != null && connectionGeometry.eIsProxy()) {
			InternalEObject oldConnectionGeometry = (InternalEObject)connectionGeometry;
			connectionGeometry = (IfcConnectionGeometry)eResolveProxy(oldConnectionGeometry);
			if (connectionGeometry != oldConnectionGeometry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY, oldConnectionGeometry, connectionGeometry));
			}
		}
		return connectionGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionGeometry basicGetConnectionGeometry() {
		return connectionGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionGeometry(IfcConnectionGeometry newConnectionGeometry) {
		IfcConnectionGeometry oldConnectionGeometry = connectionGeometry;
		connectionGeometry = newConnectionGeometry;
		boolean oldConnectionGeometryESet = connectionGeometryESet;
		connectionGeometryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY, oldConnectionGeometry, connectionGeometry, !oldConnectionGeometryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectionGeometry() {
		IfcConnectionGeometry oldConnectionGeometry = connectionGeometry;
		boolean oldConnectionGeometryESet = connectionGeometryESet;
		connectionGeometry = null;
		connectionGeometryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY, oldConnectionGeometry, null, oldConnectionGeometryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionGeometry() {
		return connectionGeometryESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT, oldRelatingElement, relatingElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT, oldRelatingElement, newRelatingElement);
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
				msgs = ((InternalEObject)relatingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO, IfcElement.class, msgs);
			if (newRelatingElement != null)
				msgs = ((InternalEObject)newRelatingElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO, IfcElement.class, msgs);
			msgs = basicSetRelatingElement(newRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT, newRelatingElement, newRelatingElement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT, oldRelatedElement, relatedElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT, oldRelatedElement, newRelatedElement);
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
				msgs = ((InternalEObject)relatedElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM, IfcElement.class, msgs);
			if (newRelatedElement != null)
				msgs = ((InternalEObject)newRelatedElement).eInverseAdd(this, Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM, IfcElement.class, msgs);
			msgs = basicSetRelatedElement(newRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT, newRelatedElement, newRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				if (relatingElement != null)
					msgs = ((InternalEObject)relatingElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_TO, IfcElement.class, msgs);
				return basicSetRelatingElement((IfcElement)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
				if (relatedElement != null)
					msgs = ((InternalEObject)relatedElement).eInverseRemove(this, Ifc2x3tc1Package.IFC_ELEMENT__CONNECTED_FROM, IfcElement.class, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				return basicSetRelatingElement(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY:
				if (resolve) return getConnectionGeometry();
				return basicGetConnectionGeometry();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				if (resolve) return getRelatingElement();
				return basicGetRelatingElement();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY:
				setConnectionGeometry((IfcConnectionGeometry)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				setRelatingElement((IfcElement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY:
				unsetConnectionGeometry();
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				setRelatingElement((IfcElement)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
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
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__CONNECTION_GEOMETRY:
				return isSetConnectionGeometry();
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATING_ELEMENT:
				return relatingElement != null;
			case Ifc2x3tc1Package.IFC_REL_CONNECTS_ELEMENTS__RELATED_ELEMENT:
				return relatedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelConnectsElementsImpl
