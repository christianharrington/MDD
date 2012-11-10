/**
 */
package store.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import store.ObjectIDMPluginConfiguration;
import store.SerializerPluginConfiguration;
import store.StorePackage;
import store.UserSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object IDM Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.ObjectIDMPluginConfigurationImpl#getSerializers <em>Serializers</em>}</li>
 *   <li>{@link store.impl.ObjectIDMPluginConfigurationImpl#getUserSettings <em>User Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectIDMPluginConfigurationImpl extends PluginConfigurationImpl implements ObjectIDMPluginConfiguration {
	/**
	 * The cached value of the '{@link #getSerializers() <em>Serializers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializers()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializerPluginConfiguration> serializers;

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
	protected ObjectIDMPluginConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.OBJECT_IDM_PLUGIN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializerPluginConfiguration> getSerializers() {
		if (serializers == null) {
			serializers = new EObjectWithInverseResolvingEList<SerializerPluginConfiguration>(SerializerPluginConfiguration.class, this, StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM);
		}
		return serializers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS, oldUserSettings, userSettings));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS, oldUserSettings, newUserSettings);
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
				msgs = ((InternalEObject)userSettings).eInverseRemove(this, StorePackage.USER_SETTINGS__OBJECT_ID_MS, UserSettings.class, msgs);
			if (newUserSettings != null)
				msgs = ((InternalEObject)newUserSettings).eInverseAdd(this, StorePackage.USER_SETTINGS__OBJECT_ID_MS, UserSettings.class, msgs);
			msgs = basicSetUserSettings(newUserSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS, newUserSettings, newUserSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSerializers()).basicAdd(otherEnd, msgs);
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS:
				if (userSettings != null)
					msgs = ((InternalEObject)userSettings).eInverseRemove(this, StorePackage.USER_SETTINGS__OBJECT_ID_MS, UserSettings.class, msgs);
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
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS:
				return ((InternalEList<?>)getSerializers()).basicRemove(otherEnd, msgs);
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS:
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
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS:
				return getSerializers();
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS:
				getSerializers().clear();
				getSerializers().addAll((Collection<? extends SerializerPluginConfiguration>)newValue);
				return;
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS:
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
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS:
				getSerializers().clear();
				return;
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS:
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
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS:
				return serializers != null && !serializers.isEmpty();
			case StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS:
				return userSettings != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectIDMPluginConfigurationImpl
