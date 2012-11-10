/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProfileDef;
import ifc2x3tc1.IfcProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcProfilePropertiesImpl#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProfilePropertiesImpl#getProfileDefinition <em>Profile Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProfilePropertiesImpl extends EObjectImpl implements IfcProfileProperties {
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
	 * The cached value of the '{@link #getProfileDefinition() <em>Profile Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileDefinition()
	 * @generated
	 * @ordered
	 */
	protected IfcProfileDef profileDefinition;

	/**
	 * This is true if the Profile Definition reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean profileDefinitionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcProfileProperties();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_NAME, oldProfileName, profileName, !oldProfileNameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_NAME, oldProfileName, PROFILE_NAME_EDEFAULT, oldProfileNameESet));
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
	public IfcProfileDef getProfileDefinition() {
		if (profileDefinition != null && profileDefinition.eIsProxy()) {
			InternalEObject oldProfileDefinition = (InternalEObject)profileDefinition;
			profileDefinition = (IfcProfileDef)eResolveProxy(oldProfileDefinition);
			if (profileDefinition != oldProfileDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_DEFINITION, oldProfileDefinition, profileDefinition));
			}
		}
		return profileDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileDef basicGetProfileDefinition() {
		return profileDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileDefinition(IfcProfileDef newProfileDefinition) {
		IfcProfileDef oldProfileDefinition = profileDefinition;
		profileDefinition = newProfileDefinition;
		boolean oldProfileDefinitionESet = profileDefinitionESet;
		profileDefinitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_DEFINITION, oldProfileDefinition, profileDefinition, !oldProfileDefinitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProfileDefinition() {
		IfcProfileDef oldProfileDefinition = profileDefinition;
		boolean oldProfileDefinitionESet = profileDefinitionESet;
		profileDefinition = null;
		profileDefinitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_DEFINITION, oldProfileDefinition, null, oldProfileDefinitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProfileDefinition() {
		return profileDefinitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_NAME:
				return getProfileName();
			case Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_DEFINITION:
				if (resolve) return getProfileDefinition();
				return basicGetProfileDefinition();
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
			case Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_NAME:
				setProfileName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_DEFINITION:
				setProfileDefinition((IfcProfileDef)newValue);
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
			case Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_NAME:
				unsetProfileName();
				return;
			case Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_DEFINITION:
				unsetProfileDefinition();
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
			case Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_NAME:
				return isSetProfileName();
			case Ifc2x3tc1Package.IFC_PROFILE_PROPERTIES__PROFILE_DEFINITION:
				return isSetProfileDefinition();
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
		result.append(" (ProfileName: ");
		if (profileNameESet) result.append(profileName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcProfilePropertiesImpl
