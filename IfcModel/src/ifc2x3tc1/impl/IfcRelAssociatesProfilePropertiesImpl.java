/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcOrientationSelect;
import ifc2x3tc1.IfcProfileProperties;
import ifc2x3tc1.IfcRelAssociatesProfileProperties;
import ifc2x3tc1.IfcShapeAspect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Associates Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesProfilePropertiesImpl#getRelatingProfileProperties <em>Relating Profile Properties</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesProfilePropertiesImpl#getProfileSectionLocation <em>Profile Section Location</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssociatesProfilePropertiesImpl#getProfileOrientation <em>Profile Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssociatesProfilePropertiesImpl extends IfcRelAssociatesImpl implements IfcRelAssociatesProfileProperties {
	/**
	 * The cached value of the '{@link #getRelatingProfileProperties() <em>Relating Profile Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingProfileProperties()
	 * @generated
	 * @ordered
	 */
	protected IfcProfileProperties relatingProfileProperties;

	/**
	 * The cached value of the '{@link #getProfileSectionLocation() <em>Profile Section Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileSectionLocation()
	 * @generated
	 * @ordered
	 */
	protected IfcShapeAspect profileSectionLocation;

	/**
	 * This is true if the Profile Section Location reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profileSectionLocationESet;

	/**
	 * The cached value of the '{@link #getProfileOrientation() <em>Profile Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileOrientation()
	 * @generated
	 * @ordered
	 */
	protected IfcOrientationSelect profileOrientation;

	/**
	 * This is true if the Profile Orientation reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profileOrientationESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssociatesProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileProperties getRelatingProfileProperties() {
		if (relatingProfileProperties != null && relatingProfileProperties.eIsProxy()) {
			InternalEObject oldRelatingProfileProperties = (InternalEObject)relatingProfileProperties;
			relatingProfileProperties = (IfcProfileProperties)eResolveProxy(oldRelatingProfileProperties);
			if (relatingProfileProperties != oldRelatingProfileProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES, oldRelatingProfileProperties, relatingProfileProperties));
			}
		}
		return relatingProfileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileProperties basicGetRelatingProfileProperties() {
		return relatingProfileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProfileProperties(IfcProfileProperties newRelatingProfileProperties) {
		IfcProfileProperties oldRelatingProfileProperties = relatingProfileProperties;
		relatingProfileProperties = newRelatingProfileProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES, oldRelatingProfileProperties, relatingProfileProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect getProfileSectionLocation() {
		if (profileSectionLocation != null && profileSectionLocation.eIsProxy()) {
			InternalEObject oldProfileSectionLocation = (InternalEObject)profileSectionLocation;
			profileSectionLocation = (IfcShapeAspect)eResolveProxy(oldProfileSectionLocation);
			if (profileSectionLocation != oldProfileSectionLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION, oldProfileSectionLocation, profileSectionLocation));
			}
		}
		return profileSectionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect basicGetProfileSectionLocation() {
		return profileSectionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileSectionLocation(IfcShapeAspect newProfileSectionLocation) {
		IfcShapeAspect oldProfileSectionLocation = profileSectionLocation;
		profileSectionLocation = newProfileSectionLocation;
		boolean oldProfileSectionLocationESet = profileSectionLocationESet;
		profileSectionLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION, oldProfileSectionLocation, profileSectionLocation, !oldProfileSectionLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileSectionLocation() {
		IfcShapeAspect oldProfileSectionLocation = profileSectionLocation;
		boolean oldProfileSectionLocationESet = profileSectionLocationESet;
		profileSectionLocation = null;
		profileSectionLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION, oldProfileSectionLocation, null, oldProfileSectionLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileSectionLocation() {
		return profileSectionLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrientationSelect getProfileOrientation() {
		if (profileOrientation != null && profileOrientation.eIsProxy()) {
			InternalEObject oldProfileOrientation = (InternalEObject)profileOrientation;
			profileOrientation = (IfcOrientationSelect)eResolveProxy(oldProfileOrientation);
			if (profileOrientation != oldProfileOrientation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION, oldProfileOrientation, profileOrientation));
			}
		}
		return profileOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrientationSelect basicGetProfileOrientation() {
		return profileOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileOrientation(IfcOrientationSelect newProfileOrientation) {
		IfcOrientationSelect oldProfileOrientation = profileOrientation;
		profileOrientation = newProfileOrientation;
		boolean oldProfileOrientationESet = profileOrientationESet;
		profileOrientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION, oldProfileOrientation, profileOrientation, !oldProfileOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileOrientation() {
		IfcOrientationSelect oldProfileOrientation = profileOrientation;
		boolean oldProfileOrientationESet = profileOrientationESet;
		profileOrientation = null;
		profileOrientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION, oldProfileOrientation, null, oldProfileOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileOrientation() {
		return profileOrientationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES:
				if (resolve) return getRelatingProfileProperties();
				return basicGetRelatingProfileProperties();
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION:
				if (resolve) return getProfileSectionLocation();
				return basicGetProfileSectionLocation();
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION:
				if (resolve) return getProfileOrientation();
				return basicGetProfileOrientation();
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES:
				setRelatingProfileProperties((IfcProfileProperties)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION:
				setProfileSectionLocation((IfcShapeAspect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION:
				setProfileOrientation((IfcOrientationSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES:
				setRelatingProfileProperties((IfcProfileProperties)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION:
				unsetProfileSectionLocation();
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION:
				unsetProfileOrientation();
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
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__RELATING_PROFILE_PROPERTIES:
				return relatingProfileProperties != null;
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_SECTION_LOCATION:
				return isSetProfileSectionLocation();
			case Ifc2x3tc1Package.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES__PROFILE_ORIENTATION:
				return isSetProfileOrientation();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssociatesProfilePropertiesImpl
