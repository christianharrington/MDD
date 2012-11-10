/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.PluginDescriptor;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.PluginDescriptorImpl#getDefaultName <em>Default Name</em>}</li>
 *   <li>{@link store.impl.PluginDescriptorImpl#getPluginClassName <em>Plugin Class Name</em>}</li>
 *   <li>{@link store.impl.PluginDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link store.impl.PluginDescriptorImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link store.impl.PluginDescriptorImpl#getEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PluginDescriptorImpl extends EObjectImpl implements PluginDescriptor {
	/**
	 * The default value of the '{@link #getDefaultName() <em>Default Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultName() <em>Default Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultName()
	 * @generated
	 * @ordered
	 */
	protected String defaultName = DEFAULT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluginClassName() <em>Plugin Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginClassName() <em>Plugin Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginClassName()
	 * @generated
	 * @ordered
	 */
	protected String pluginClassName = PLUGIN_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PLUGIN_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultName() {
		return defaultName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultName(String newDefaultName) {
		String oldDefaultName = defaultName;
		defaultName = newDefaultName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PLUGIN_DESCRIPTOR__DEFAULT_NAME, oldDefaultName, defaultName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginClassName() {
		return pluginClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginClassName(String newPluginClassName) {
		String oldPluginClassName = pluginClassName;
		pluginClassName = newPluginClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PLUGIN_DESCRIPTOR__PLUGIN_CLASS_NAME, oldPluginClassName, pluginClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PLUGIN_DESCRIPTOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PLUGIN_DESCRIPTOR__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(Boolean newEnabled) {
		Boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PLUGIN_DESCRIPTOR__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PLUGIN_DESCRIPTOR__DEFAULT_NAME:
				return getDefaultName();
			case StorePackage.PLUGIN_DESCRIPTOR__PLUGIN_CLASS_NAME:
				return getPluginClassName();
			case StorePackage.PLUGIN_DESCRIPTOR__DESCRIPTION:
				return getDescription();
			case StorePackage.PLUGIN_DESCRIPTOR__LOCATION:
				return getLocation();
			case StorePackage.PLUGIN_DESCRIPTOR__ENABLED:
				return getEnabled();
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
			case StorePackage.PLUGIN_DESCRIPTOR__DEFAULT_NAME:
				setDefaultName((String)newValue);
				return;
			case StorePackage.PLUGIN_DESCRIPTOR__PLUGIN_CLASS_NAME:
				setPluginClassName((String)newValue);
				return;
			case StorePackage.PLUGIN_DESCRIPTOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StorePackage.PLUGIN_DESCRIPTOR__LOCATION:
				setLocation((String)newValue);
				return;
			case StorePackage.PLUGIN_DESCRIPTOR__ENABLED:
				setEnabled((Boolean)newValue);
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
			case StorePackage.PLUGIN_DESCRIPTOR__DEFAULT_NAME:
				setDefaultName(DEFAULT_NAME_EDEFAULT);
				return;
			case StorePackage.PLUGIN_DESCRIPTOR__PLUGIN_CLASS_NAME:
				setPluginClassName(PLUGIN_CLASS_NAME_EDEFAULT);
				return;
			case StorePackage.PLUGIN_DESCRIPTOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StorePackage.PLUGIN_DESCRIPTOR__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case StorePackage.PLUGIN_DESCRIPTOR__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
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
			case StorePackage.PLUGIN_DESCRIPTOR__DEFAULT_NAME:
				return DEFAULT_NAME_EDEFAULT == null ? defaultName != null : !DEFAULT_NAME_EDEFAULT.equals(defaultName);
			case StorePackage.PLUGIN_DESCRIPTOR__PLUGIN_CLASS_NAME:
				return PLUGIN_CLASS_NAME_EDEFAULT == null ? pluginClassName != null : !PLUGIN_CLASS_NAME_EDEFAULT.equals(pluginClassName);
			case StorePackage.PLUGIN_DESCRIPTOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StorePackage.PLUGIN_DESCRIPTOR__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case StorePackage.PLUGIN_DESCRIPTOR__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
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
		result.append(" (defaultName: ");
		result.append(defaultName);
		result.append(", pluginClassName: ");
		result.append(pluginClassName);
		result.append(", description: ");
		result.append(description);
		result.append(", location: ");
		result.append(location);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //PluginDescriptorImpl
