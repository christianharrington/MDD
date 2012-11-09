/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.InternalServicePluginConfiguration;
import store.StorePackage;
import store.UserSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Service Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.InternalServicePluginConfigurationImpl#isRemoteAccessible <em>Remote Accessible</em>}</li>
 *   <li>{@link store.impl.InternalServicePluginConfigurationImpl#getUserSettings <em>User Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalServicePluginConfigurationImpl extends PluginConfigurationImpl implements InternalServicePluginConfiguration {
	/**
	 * The default value of the '{@link #isRemoteAccessible() <em>Remote Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteAccessible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_ACCESSIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemoteAccessible() <em>Remote Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteAccessible()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteAccessible = REMOTE_ACCESSIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserSettings() <em>User Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSettings()
	 * @generated
	 * @ordered
	 */
	protected UserSettings userSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalServicePluginConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.INTERNAL_SERVICE_PLUGIN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoteAccessible() {
		return remoteAccessible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteAccessible(boolean newRemoteAccessible) {
		boolean oldRemoteAccessible = remoteAccessible;
		remoteAccessible = newRemoteAccessible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__REMOTE_ACCESSIBLE, oldRemoteAccessible, remoteAccessible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSettings getUserSettings() {
		if (userSettings != null && userSettings.eIsProxy()) {
			InternalEObject oldUserSettings = (InternalEObject)userSettings;
			userSettings = (UserSettings)eResolveProxy(oldUserSettings);
			if (userSettings != oldUserSettings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS, oldUserSettings, userSettings));
			}
		}
		return userSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSettings basicGetUserSettings() {
		return userSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserSettings(UserSettings newUserSettings, NotificationChain msgs) {
		UserSettings oldUserSettings = userSettings;
		userSettings = newUserSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS, oldUserSettings, newUserSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserSettings(UserSettings newUserSettings) {
		if (newUserSettings != userSettings) {
			NotificationChain msgs = null;
			if (userSettings != null)
				msgs = ((InternalEObject)userSettings).eInverseRemove(this, StorePackage.USER_SETTINGS__SERVICES, UserSettings.class, msgs);
			if (newUserSettings != null)
				msgs = ((InternalEObject)newUserSettings).eInverseAdd(this, StorePackage.USER_SETTINGS__SERVICES, UserSettings.class, msgs);
			msgs = basicSetUserSettings(newUserSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS, newUserSettings, newUserSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS:
				if (userSettings != null)
					msgs = ((InternalEObject)userSettings).eInverseRemove(this, StorePackage.USER_SETTINGS__SERVICES, UserSettings.class, msgs);
				return basicSetUserSettings((UserSettings)otherEnd, msgs);
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
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS:
				return basicSetUserSettings(null, msgs);
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
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__REMOTE_ACCESSIBLE:
				return isRemoteAccessible();
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS:
				if (resolve) return getUserSettings();
				return basicGetUserSettings();
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
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__REMOTE_ACCESSIBLE:
				setRemoteAccessible((Boolean)newValue);
				return;
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS:
				setUserSettings((UserSettings)newValue);
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
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__REMOTE_ACCESSIBLE:
				setRemoteAccessible(REMOTE_ACCESSIBLE_EDEFAULT);
				return;
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS:
				setUserSettings((UserSettings)null);
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
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__REMOTE_ACCESSIBLE:
				return remoteAccessible != REMOTE_ACCESSIBLE_EDEFAULT;
			case StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS:
				return userSettings != null;
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
		result.append(" (remoteAccessible: ");
		result.append(remoteAccessible);
		result.append(')');
		return result.toString();
	}

} //InternalServicePluginConfigurationImpl
