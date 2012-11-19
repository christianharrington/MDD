/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPortGeometry;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LocationAtRelatedElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LocationAtRelatingElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileOfPortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Port Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionPortGeometryImpl#getLocationAtRelatingElement <em>Location At Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionPortGeometryImpl#getLocationAtRelatedElement <em>Location At Related Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionPortGeometryImpl#getProfileOfPort <em>Profile Of Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionPortGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionPortGeometry {
	/**
	 * The cached value of the '{@link #getLocationAtRelatingElement() <em>Location At Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationAtRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected LocationAtRelatingElementType locationAtRelatingElement;

	/**
	 * The cached value of the '{@link #getLocationAtRelatedElement() <em>Location At Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationAtRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected LocationAtRelatedElementType locationAtRelatedElement;

	/**
	 * The cached value of the '{@link #getProfileOfPort() <em>Profile Of Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileOfPort()
	 * @generated
	 * @ordered
	 */
	protected ProfileOfPortType profileOfPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionPortGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcConnectionPortGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationAtRelatingElementType getLocationAtRelatingElement() {
		return locationAtRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationAtRelatingElement(LocationAtRelatingElementType newLocationAtRelatingElement, NotificationChain msgs) {
		LocationAtRelatingElementType oldLocationAtRelatingElement = locationAtRelatingElement;
		locationAtRelatingElement = newLocationAtRelatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT, oldLocationAtRelatingElement, newLocationAtRelatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationAtRelatingElement(LocationAtRelatingElementType newLocationAtRelatingElement) {
		if (newLocationAtRelatingElement != locationAtRelatingElement) {
			NotificationChain msgs = null;
			if (locationAtRelatingElement != null)
				msgs = ((InternalEObject)locationAtRelatingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT, null, msgs);
			if (newLocationAtRelatingElement != null)
				msgs = ((InternalEObject)newLocationAtRelatingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT, null, msgs);
			msgs = basicSetLocationAtRelatingElement(newLocationAtRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT, newLocationAtRelatingElement, newLocationAtRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationAtRelatedElementType getLocationAtRelatedElement() {
		return locationAtRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationAtRelatedElement(LocationAtRelatedElementType newLocationAtRelatedElement, NotificationChain msgs) {
		LocationAtRelatedElementType oldLocationAtRelatedElement = locationAtRelatedElement;
		locationAtRelatedElement = newLocationAtRelatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT, oldLocationAtRelatedElement, newLocationAtRelatedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationAtRelatedElement(LocationAtRelatedElementType newLocationAtRelatedElement) {
		if (newLocationAtRelatedElement != locationAtRelatedElement) {
			NotificationChain msgs = null;
			if (locationAtRelatedElement != null)
				msgs = ((InternalEObject)locationAtRelatedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT, null, msgs);
			if (newLocationAtRelatedElement != null)
				msgs = ((InternalEObject)newLocationAtRelatedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT, null, msgs);
			msgs = basicSetLocationAtRelatedElement(newLocationAtRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT, newLocationAtRelatedElement, newLocationAtRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileOfPortType getProfileOfPort() {
		return profileOfPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileOfPort(ProfileOfPortType newProfileOfPort, NotificationChain msgs) {
		ProfileOfPortType oldProfileOfPort = profileOfPort;
		profileOfPort = newProfileOfPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT, oldProfileOfPort, newProfileOfPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileOfPort(ProfileOfPortType newProfileOfPort) {
		if (newProfileOfPort != profileOfPort) {
			NotificationChain msgs = null;
			if (profileOfPort != null)
				msgs = ((InternalEObject)profileOfPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT, null, msgs);
			if (newProfileOfPort != null)
				msgs = ((InternalEObject)newProfileOfPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT, null, msgs);
			msgs = basicSetProfileOfPort(newProfileOfPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT, newProfileOfPort, newProfileOfPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT:
				return basicSetLocationAtRelatingElement(null, msgs);
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT:
				return basicSetLocationAtRelatedElement(null, msgs);
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT:
				return basicSetProfileOfPort(null, msgs);
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
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT:
				return getLocationAtRelatingElement();
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT:
				return getLocationAtRelatedElement();
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT:
				return getProfileOfPort();
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
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT:
				setLocationAtRelatingElement((LocationAtRelatingElementType)newValue);
				return;
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT:
				setLocationAtRelatedElement((LocationAtRelatedElementType)newValue);
				return;
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT:
				setProfileOfPort((ProfileOfPortType)newValue);
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
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT:
				setLocationAtRelatingElement((LocationAtRelatingElementType)null);
				return;
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT:
				setLocationAtRelatedElement((LocationAtRelatedElementType)null);
				return;
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT:
				setProfileOfPort((ProfileOfPortType)null);
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
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT:
				return locationAtRelatingElement != null;
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT:
				return locationAtRelatedElement != null;
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT:
				return profileOfPort != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcConnectionPortGeometryImpl
