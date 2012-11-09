/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProfileDef;
import ifc2x3tc1.IfcSectionProperties;
import ifc2x3tc1.IfcSectionTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Section Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionPropertiesImpl#getSectionType <em>Section Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionPropertiesImpl#getStartProfile <em>Start Profile</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSectionPropertiesImpl#getEndProfile <em>End Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSectionPropertiesImpl extends EObjectImpl implements IfcSectionProperties {
	/**
	 * The default value of the '{@link #getSectionType() <em>Section Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcSectionTypeEnum SECTION_TYPE_EDEFAULT = IfcSectionTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getSectionType() <em>Section Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionType()
	 * @generated
	 * @ordered
	 */
	protected IfcSectionTypeEnum sectionType = SECTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartProfile() <em>Start Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartProfile()
	 * @generated
	 * @ordered
	 */
	protected IfcProfileDef startProfile;

	/**
	 * The cached value of the '{@link #getEndProfile() <em>End Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndProfile()
	 * @generated
	 * @ordered
	 */
	protected IfcProfileDef endProfile;

	/**
	 * This is true if the End Profile reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endProfileESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSectionProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionTypeEnum getSectionType() {
		return sectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionType(IfcSectionTypeEnum newSectionType) {
		IfcSectionTypeEnum oldSectionType = sectionType;
		sectionType = newSectionType == null ? SECTION_TYPE_EDEFAULT : newSectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__SECTION_TYPE, oldSectionType, sectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getStartProfile() {
		if (startProfile != null && startProfile.eIsProxy()) {
			InternalEObject oldStartProfile = (InternalEObject)startProfile;
			startProfile = (IfcProfileDef)eResolveProxy(oldStartProfile);
			if (startProfile != oldStartProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__START_PROFILE, oldStartProfile, startProfile));
			}
		}
		return startProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef basicGetStartProfile() {
		return startProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartProfile(IfcProfileDef newStartProfile) {
		IfcProfileDef oldStartProfile = startProfile;
		startProfile = newStartProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__START_PROFILE, oldStartProfile, startProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef getEndProfile() {
		if (endProfile != null && endProfile.eIsProxy()) {
			InternalEObject oldEndProfile = (InternalEObject)endProfile;
			endProfile = (IfcProfileDef)eResolveProxy(oldEndProfile);
			if (endProfile != oldEndProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__END_PROFILE, oldEndProfile, endProfile));
			}
		}
		return endProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef basicGetEndProfile() {
		return endProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndProfile(IfcProfileDef newEndProfile) {
		IfcProfileDef oldEndProfile = endProfile;
		endProfile = newEndProfile;
		boolean oldEndProfileESet = endProfileESet;
		endProfileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__END_PROFILE, oldEndProfile, endProfile, !oldEndProfileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndProfile() {
		IfcProfileDef oldEndProfile = endProfile;
		boolean oldEndProfileESet = endProfileESet;
		endProfile = null;
		endProfileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__END_PROFILE, oldEndProfile, null, oldEndProfileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndProfile() {
		return endProfileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__SECTION_TYPE:
				return getSectionType();
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__START_PROFILE:
				if (resolve) return getStartProfile();
				return basicGetStartProfile();
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__END_PROFILE:
				if (resolve) return getEndProfile();
				return basicGetEndProfile();
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
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__SECTION_TYPE:
				setSectionType((IfcSectionTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__START_PROFILE:
				setStartProfile((IfcProfileDef)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__END_PROFILE:
				setEndProfile((IfcProfileDef)newValue);
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
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__SECTION_TYPE:
				setSectionType(SECTION_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__START_PROFILE:
				setStartProfile((IfcProfileDef)null);
				return;
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__END_PROFILE:
				unsetEndProfile();
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
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__SECTION_TYPE:
				return sectionType != SECTION_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__START_PROFILE:
				return startProfile != null;
			case Ifc2x3tc1Package.IFC_SECTION_PROPERTIES__END_PROFILE:
				return isSetEndProfile();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (SectionType: ");
		result.append(sectionType);
		result.append(')');
		return result.toString();
	}

} //IfcSectionPropertiesImpl
