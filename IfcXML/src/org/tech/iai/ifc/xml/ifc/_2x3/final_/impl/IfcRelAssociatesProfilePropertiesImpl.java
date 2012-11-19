/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesProfileProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileOrientationType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileSectionLocationType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingProfilePropertiesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssociatesProfilePropertiesImpl#getRelatingProfileProperties <em>Relating Profile Properties</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssociatesProfilePropertiesImpl#getProfileSectionLocation <em>Profile Section Location</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssociatesProfilePropertiesImpl#getProfileOrientation <em>Profile Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesProfilePropertiesImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesProfileProperties {
	/**
	 * The cached value of the '{@link #getRelatingProfileProperties() <em>Relating Profile Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingProfileProperties()
	 * @generated
	 * @ordered
	 */
	protected RelatingProfilePropertiesType relatingProfileProperties;

	/**
	 * The cached value of the '{@link #getProfileSectionLocation() <em>Profile Section Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileSectionLocation()
	 * @generated
	 * @ordered
	 */
	protected ProfileSectionLocationType profileSectionLocation;

	/**
	 * The cached value of the '{@link #getProfileOrientation() <em>Profile Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileOrientation()
	 * @generated
	 * @ordered
	 */
	protected ProfileOrientationType profileOrientation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssociatesProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelAssociatesProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingProfilePropertiesType getRelatingProfileProperties() {
		return relatingProfileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingProfileProperties(RelatingProfilePropertiesType newRelatingProfileProperties, NotificationChain msgs) {
		RelatingProfilePropertiesType oldRelatingProfileProperties = relatingProfileProperties;
		relatingProfileProperties = newRelatingProfileProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES, oldRelatingProfileProperties, newRelatingProfileProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProfileProperties(RelatingProfilePropertiesType newRelatingProfileProperties) {
		if (newRelatingProfileProperties != relatingProfileProperties) {
			NotificationChain msgs = null;
			if (relatingProfileProperties != null)
				msgs = ((InternalEObject)relatingProfileProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES, null, msgs);
			if (newRelatingProfileProperties != null)
				msgs = ((InternalEObject)newRelatingProfileProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES, null, msgs);
			msgs = basicSetRelatingProfileProperties(newRelatingProfileProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES, newRelatingProfileProperties, newRelatingProfileProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileSectionLocationType getProfileSectionLocation() {
		return profileSectionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileSectionLocation(ProfileSectionLocationType newProfileSectionLocation, NotificationChain msgs) {
		ProfileSectionLocationType oldProfileSectionLocation = profileSectionLocation;
		profileSectionLocation = newProfileSectionLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION, oldProfileSectionLocation, newProfileSectionLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileSectionLocation(ProfileSectionLocationType newProfileSectionLocation) {
		if (newProfileSectionLocation != profileSectionLocation) {
			NotificationChain msgs = null;
			if (profileSectionLocation != null)
				msgs = ((InternalEObject)profileSectionLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION, null, msgs);
			if (newProfileSectionLocation != null)
				msgs = ((InternalEObject)newProfileSectionLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION, null, msgs);
			msgs = basicSetProfileSectionLocation(newProfileSectionLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION, newProfileSectionLocation, newProfileSectionLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileOrientationType getProfileOrientation() {
		return profileOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileOrientation(ProfileOrientationType newProfileOrientation, NotificationChain msgs) {
		ProfileOrientationType oldProfileOrientation = profileOrientation;
		profileOrientation = newProfileOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION, oldProfileOrientation, newProfileOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileOrientation(ProfileOrientationType newProfileOrientation) {
		if (newProfileOrientation != profileOrientation) {
			NotificationChain msgs = null;
			if (profileOrientation != null)
				msgs = ((InternalEObject)profileOrientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION, null, msgs);
			if (newProfileOrientation != null)
				msgs = ((InternalEObject)newProfileOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION, null, msgs);
			msgs = basicSetProfileOrientation(newProfileOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION, newProfileOrientation, newProfileOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES:
				return basicSetRelatingProfileProperties(null, msgs);
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION:
				return basicSetProfileSectionLocation(null, msgs);
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION:
				return basicSetProfileOrientation(null, msgs);
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
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES:
				return getRelatingProfileProperties();
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION:
				return getProfileSectionLocation();
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION:
				return getProfileOrientation();
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
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES:
				setRelatingProfileProperties((RelatingProfilePropertiesType)newValue);
				return;
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION:
				setProfileSectionLocation((ProfileSectionLocationType)newValue);
				return;
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION:
				setProfileOrientation((ProfileOrientationType)newValue);
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
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES:
				setRelatingProfileProperties((RelatingProfilePropertiesType)null);
				return;
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION:
				setProfileSectionLocation((ProfileSectionLocationType)null);
				return;
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION:
				setProfileOrientation((ProfileOrientationType)null);
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
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES:
				return relatingProfileProperties != null;
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION:
				return profileSectionLocation != null;
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION:
				return profileOrientation != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesProfilePropertiesImpl
