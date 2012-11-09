/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.IfcEnginePluginConfiguration;
import store.ObjectIDMPluginConfiguration;
import store.SerializerPluginConfiguration;
import store.StorePackage;
import store.UserSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serializer Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.SerializerPluginConfigurationImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link store.impl.SerializerPluginConfigurationImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link store.impl.SerializerPluginConfigurationImpl#getObjectIDM <em>Object IDM</em>}</li>
 *   <li>{@link store.impl.SerializerPluginConfigurationImpl#getUserSettings <em>User Settings</em>}</li>
 *   <li>{@link store.impl.SerializerPluginConfigurationImpl#getIfcEngine <em>Ifc Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializerPluginConfigurationImpl extends PluginConfigurationImpl implements SerializerPluginConfiguration {
	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectIDM() <em>Object IDM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectIDM()
	 * @generated
	 * @ordered
	 */
	protected ObjectIDMPluginConfiguration objectIDM;

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
	 * The cached value of the '{@link #getIfcEngine() <em>Ifc Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcEngine()
	 * @generated
	 * @ordered
	 */
	protected IfcEnginePluginConfiguration ifcEngine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializerPluginConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.SERIALIZER_PLUGIN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIDMPluginConfiguration getObjectIDM() {
		if (objectIDM != null && objectIDM.eIsProxy()) {
			InternalEObject oldObjectIDM = (InternalEObject)objectIDM;
			objectIDM = (ObjectIDMPluginConfiguration)eResolveProxy(oldObjectIDM);
			if (objectIDM != oldObjectIDM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM, oldObjectIDM, objectIDM));
			}
		}
		return objectIDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIDMPluginConfiguration basicGetObjectIDM() {
		return objectIDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectIDM(ObjectIDMPluginConfiguration newObjectIDM, NotificationChain msgs) {
		ObjectIDMPluginConfiguration oldObjectIDM = objectIDM;
		objectIDM = newObjectIDM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM, oldObjectIDM, newObjectIDM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectIDM(ObjectIDMPluginConfiguration newObjectIDM) {
		if (newObjectIDM != objectIDM) {
			NotificationChain msgs = null;
			if (objectIDM != null)
				msgs = ((InternalEObject)objectIDM).eInverseRemove(this, StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS, ObjectIDMPluginConfiguration.class, msgs);
			if (newObjectIDM != null)
				msgs = ((InternalEObject)newObjectIDM).eInverseAdd(this, StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS, ObjectIDMPluginConfiguration.class, msgs);
			msgs = basicSetObjectIDM(newObjectIDM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM, newObjectIDM, newObjectIDM));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS, oldUserSettings, userSettings));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS, oldUserSettings, newUserSettings);
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
				msgs = ((InternalEObject)userSettings).eInverseRemove(this, StorePackage.USER_SETTINGS__SERIALIZERS, UserSettings.class, msgs);
			if (newUserSettings != null)
				msgs = ((InternalEObject)newUserSettings).eInverseAdd(this, StorePackage.USER_SETTINGS__SERIALIZERS, UserSettings.class, msgs);
			msgs = basicSetUserSettings(newUserSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS, newUserSettings, newUserSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnginePluginConfiguration getIfcEngine() {
		if (ifcEngine != null && ifcEngine.eIsProxy()) {
			InternalEObject oldIfcEngine = (InternalEObject)ifcEngine;
			ifcEngine = (IfcEnginePluginConfiguration)eResolveProxy(oldIfcEngine);
			if (ifcEngine != oldIfcEngine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE, oldIfcEngine, ifcEngine));
			}
		}
		return ifcEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnginePluginConfiguration basicGetIfcEngine() {
		return ifcEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcEngine(IfcEnginePluginConfiguration newIfcEngine, NotificationChain msgs) {
		IfcEnginePluginConfiguration oldIfcEngine = ifcEngine;
		ifcEngine = newIfcEngine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE, oldIfcEngine, newIfcEngine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcEngine(IfcEnginePluginConfiguration newIfcEngine) {
		if (newIfcEngine != ifcEngine) {
			NotificationChain msgs = null;
			if (ifcEngine != null)
				msgs = ((InternalEObject)ifcEngine).eInverseRemove(this, StorePackage.IFC_ENGINE_PLUGIN_CONFIGURATION__SERIALIZERS, IfcEnginePluginConfiguration.class, msgs);
			if (newIfcEngine != null)
				msgs = ((InternalEObject)newIfcEngine).eInverseAdd(this, StorePackage.IFC_ENGINE_PLUGIN_CONFIGURATION__SERIALIZERS, IfcEnginePluginConfiguration.class, msgs);
			msgs = basicSetIfcEngine(newIfcEngine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE, newIfcEngine, newIfcEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM:
				if (objectIDM != null)
					msgs = ((InternalEObject)objectIDM).eInverseRemove(this, StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS, ObjectIDMPluginConfiguration.class, msgs);
				return basicSetObjectIDM((ObjectIDMPluginConfiguration)otherEnd, msgs);
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS:
				if (userSettings != null)
					msgs = ((InternalEObject)userSettings).eInverseRemove(this, StorePackage.USER_SETTINGS__SERIALIZERS, UserSettings.class, msgs);
				return basicSetUserSettings((UserSettings)otherEnd, msgs);
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE:
				if (ifcEngine != null)
					msgs = ((InternalEObject)ifcEngine).eInverseRemove(this, StorePackage.IFC_ENGINE_PLUGIN_CONFIGURATION__SERIALIZERS, IfcEnginePluginConfiguration.class, msgs);
				return basicSetIfcEngine((IfcEnginePluginConfiguration)otherEnd, msgs);
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
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM:
				return basicSetObjectIDM(null, msgs);
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS:
				return basicSetUserSettings(null, msgs);
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE:
				return basicSetIfcEngine(null, msgs);
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
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__EXTENSION:
				return getExtension();
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__CONTENT_TYPE:
				return getContentType();
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM:
				if (resolve) return getObjectIDM();
				return basicGetObjectIDM();
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS:
				if (resolve) return getUserSettings();
				return basicGetUserSettings();
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE:
				if (resolve) return getIfcEngine();
				return basicGetIfcEngine();
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
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__EXTENSION:
				setExtension((String)newValue);
				return;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM:
				setObjectIDM((ObjectIDMPluginConfiguration)newValue);
				return;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS:
				setUserSettings((UserSettings)newValue);
				return;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE:
				setIfcEngine((IfcEnginePluginConfiguration)newValue);
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
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM:
				setObjectIDM((ObjectIDMPluginConfiguration)null);
				return;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS:
				setUserSettings((UserSettings)null);
				return;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE:
				setIfcEngine((IfcEnginePluginConfiguration)null);
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
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM:
				return objectIDM != null;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS:
				return userSettings != null;
			case StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE:
				return ifcEngine != null;
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
		result.append(" (extension: ");
		result.append(extension);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(')');
		return result.toString();
	}

} //SerializerPluginConfigurationImpl
