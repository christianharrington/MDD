/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.ModelMergerPluginConfiguration;
import store.StorePackage;
import store.UserSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Merger Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.ModelMergerPluginConfigurationImpl#getUserSettings <em>User Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelMergerPluginConfigurationImpl extends PluginConfigurationImpl implements ModelMergerPluginConfiguration {
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
	protected ModelMergerPluginConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.MODEL_MERGER_PLUGIN_CONFIGURATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS, oldUserSettings, userSettings));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS, oldUserSettings, newUserSettings);
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
				msgs = ((InternalEObject)userSettings).eInverseRemove(this, StorePackage.USER_SETTINGS__MODELMERGERS, UserSettings.class, msgs);
			if (newUserSettings != null)
				msgs = ((InternalEObject)newUserSettings).eInverseAdd(this, StorePackage.USER_SETTINGS__MODELMERGERS, UserSettings.class, msgs);
			msgs = basicSetUserSettings(newUserSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS, newUserSettings, newUserSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS:
				if (userSettings != null)
					msgs = ((InternalEObject)userSettings).eInverseRemove(this, StorePackage.USER_SETTINGS__MODELMERGERS, UserSettings.class, msgs);
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
			case StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS:
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
			case StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS:
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
			case StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS:
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
			case StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS:
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
			case StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS:
				return userSettings != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelMergerPluginConfigurationImpl
