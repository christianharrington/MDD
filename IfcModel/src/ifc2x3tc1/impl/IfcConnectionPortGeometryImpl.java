/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement;
import ifc2x3tc1.IfcConnectionPortGeometry;
import ifc2x3tc1.IfcProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Port Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPortGeometryImpl#getLocationAtRelatingElement <em>Location At Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPortGeometryImpl#getLocationAtRelatedElement <em>Location At Related Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPortGeometryImpl#getProfileOfPort <em>Profile Of Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionPortGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionPortGeometry {
	/**
	 * The cached value of the '{@link #getLocationAtRelatingElement() <em>Location At Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationAtRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement locationAtRelatingElement;

	/**
	 * The cached value of the '{@link #getLocationAtRelatedElement() <em>Location At Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationAtRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement locationAtRelatedElement;

	/**
	 * This is true if the Location At Related Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locationAtRelatedElementESet;

	/**
	 * The cached value of the '{@link #getProfileOfPort() <em>Profile Of Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileOfPort()
	 * @generated
	 * @ordered
	 */
	protected IfcProfileDef profileOfPort;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcConnectionPortGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getLocationAtRelatingElement() {
		if (locationAtRelatingElement != null && locationAtRelatingElement.eIsProxy()) {
			InternalEObject oldLocationAtRelatingElement = (InternalEObject)locationAtRelatingElement;
			locationAtRelatingElement = (IfcAxis2Placement)eResolveProxy(oldLocationAtRelatingElement);
			if (locationAtRelatingElement != oldLocationAtRelatingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT, oldLocationAtRelatingElement, locationAtRelatingElement));
			}
		}
		return locationAtRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement basicGetLocationAtRelatingElement() {
		return locationAtRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationAtRelatingElement(IfcAxis2Placement newLocationAtRelatingElement) {
		IfcAxis2Placement oldLocationAtRelatingElement = locationAtRelatingElement;
		locationAtRelatingElement = newLocationAtRelatingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT, oldLocationAtRelatingElement, locationAtRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getLocationAtRelatedElement() {
		if (locationAtRelatedElement != null && locationAtRelatedElement.eIsProxy()) {
			InternalEObject oldLocationAtRelatedElement = (InternalEObject)locationAtRelatedElement;
			locationAtRelatedElement = (IfcAxis2Placement)eResolveProxy(oldLocationAtRelatedElement);
			if (locationAtRelatedElement != oldLocationAtRelatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT, oldLocationAtRelatedElement, locationAtRelatedElement));
			}
		}
		return locationAtRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement basicGetLocationAtRelatedElement() {
		return locationAtRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationAtRelatedElement(IfcAxis2Placement newLocationAtRelatedElement) {
		IfcAxis2Placement oldLocationAtRelatedElement = locationAtRelatedElement;
		locationAtRelatedElement = newLocationAtRelatedElement;
		boolean oldLocationAtRelatedElementESet = locationAtRelatedElementESet;
		locationAtRelatedElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT, oldLocationAtRelatedElement, locationAtRelatedElement, !oldLocationAtRelatedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocationAtRelatedElement() {
		IfcAxis2Placement oldLocationAtRelatedElement = locationAtRelatedElement;
		boolean oldLocationAtRelatedElementESet = locationAtRelatedElementESet;
		locationAtRelatedElement = null;
		locationAtRelatedElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT, oldLocationAtRelatedElement, null, oldLocationAtRelatedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocationAtRelatedElement() {
		return locationAtRelatedElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getProfileOfPort() {
		if (profileOfPort != null && profileOfPort.eIsProxy()) {
			InternalEObject oldProfileOfPort = (InternalEObject)profileOfPort;
			profileOfPort = (IfcProfileDef)eResolveProxy(oldProfileOfPort);
			if (profileOfPort != oldProfileOfPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT, oldProfileOfPort, profileOfPort));
			}
		}
		return profileOfPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef basicGetProfileOfPort() {
		return profileOfPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileOfPort(IfcProfileDef newProfileOfPort) {
		IfcProfileDef oldProfileOfPort = profileOfPort;
		profileOfPort = newProfileOfPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT, oldProfileOfPort, profileOfPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT:
				if (resolve) return getLocationAtRelatingElement();
				return basicGetLocationAtRelatingElement();
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT:
				if (resolve) return getLocationAtRelatedElement();
				return basicGetLocationAtRelatedElement();
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT:
				if (resolve) return getProfileOfPort();
				return basicGetProfileOfPort();
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
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT:
				setLocationAtRelatingElement((IfcAxis2Placement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT:
				setLocationAtRelatedElement((IfcAxis2Placement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT:
				setProfileOfPort((IfcProfileDef)newValue);
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
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT:
				setLocationAtRelatingElement((IfcAxis2Placement)null);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT:
				unsetLocationAtRelatedElement();
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT:
				setProfileOfPort((IfcProfileDef)null);
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
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATING_ELEMENT:
				return locationAtRelatingElement != null;
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__LOCATION_AT_RELATED_ELEMENT:
				return isSetLocationAtRelatedElement();
			case Ifc2x3tc1Package.IFC_CONNECTION_PORT_GEOMETRY__PROFILE_OF_PORT:
				return profileOfPort != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcConnectionPortGeometryImpl
