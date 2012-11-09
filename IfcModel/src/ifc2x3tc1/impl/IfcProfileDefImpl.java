/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProfileDef;
import ifc2x3tc1.IfcProfileTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcProfileDefImpl#getProfileType <em>Profile Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProfileDefImpl#getProfileName <em>Profile Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProfileDefImpl extends EObjectImpl implements IfcProfileDef {
	/**
	 * The default value of the '{@link #getProfileType() <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcProfileTypeEnum PROFILE_TYPE_EDEFAULT = IfcProfileTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getProfileType() <em>Profile Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileType()
	 * @generated
	 * @ordered
	 */
	protected IfcProfileTypeEnum profileType = PROFILE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileName()
	 * @generated
	 * @ordered
	 */
	protected String profileName = PROFILE_NAME_EDEFAULT;

	/**
	 * This is true if the Profile Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profileNameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileTypeEnum getProfileType() {
		return profileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileType(IfcProfileTypeEnum newProfileType) {
		IfcProfileTypeEnum oldProfileType = profileType;
		profileType = newProfileType == null ? PROFILE_TYPE_EDEFAULT : newProfileType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_TYPE, oldProfileType, profileType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileName() {
		return profileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileName(String newProfileName) {
		String oldProfileName = profileName;
		profileName = newProfileName;
		boolean oldProfileNameESet = profileNameESet;
		profileNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_NAME, oldProfileName, profileName, !oldProfileNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileName() {
		String oldProfileName = profileName;
		boolean oldProfileNameESet = profileNameESet;
		profileName = PROFILE_NAME_EDEFAULT;
		profileNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_NAME, oldProfileName, PROFILE_NAME_EDEFAULT, oldProfileNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileName() {
		return profileNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_TYPE:
				return getProfileType();
			case Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_NAME:
				return getProfileName();
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
			case Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_TYPE:
				setProfileType((IfcProfileTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_NAME:
				setProfileName((String)newValue);
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
			case Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_TYPE:
				setProfileType(PROFILE_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_NAME:
				unsetProfileName();
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
			case Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_TYPE:
				return profileType != PROFILE_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PROFILE_DEF__PROFILE_NAME:
				return isSetProfileName();
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
		result.append(" (ProfileType: ");
		result.append(profileType);
		result.append(", ProfileName: ");
		if (profileNameESet) result.append(profileName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcProfileDefImpl
