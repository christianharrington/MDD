/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.SerializerPluginDescriptor;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serializer Plugin Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.SerializerPluginDescriptorImpl#getDefaultExtension <em>Default Extension</em>}</li>
 *   <li>{@link store.impl.SerializerPluginDescriptorImpl#getDefaultContentType <em>Default Content Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializerPluginDescriptorImpl extends PluginDescriptorImpl implements SerializerPluginDescriptor {
	/**
	 * The default value of the '{@link #getDefaultExtension() <em>Default Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultExtension() <em>Default Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExtension()
	 * @generated
	 * @ordered
	 */
	protected String defaultExtension = DEFAULT_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultContentType() <em>Default Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultContentType() <em>Default Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultContentType()
	 * @generated
	 * @ordered
	 */
	protected String defaultContentType = DEFAULT_CONTENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializerPluginDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.SERIALIZER_PLUGIN_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultExtension() {
		return defaultExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultExtension(String newDefaultExtension) {
		String oldDefaultExtension = defaultExtension;
		defaultExtension = newDefaultExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_EXTENSION, oldDefaultExtension, defaultExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultContentType() {
		return defaultContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultContentType(String newDefaultContentType) {
		String oldDefaultContentType = defaultContentType;
		defaultContentType = newDefaultContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_CONTENT_TYPE, oldDefaultContentType, defaultContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_EXTENSION:
				return getDefaultExtension();
			case StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_CONTENT_TYPE:
				return getDefaultContentType();
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
			case StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_EXTENSION:
				setDefaultExtension((String)newValue);
				return;
			case StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_CONTENT_TYPE:
				setDefaultContentType((String)newValue);
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
			case StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_EXTENSION:
				setDefaultExtension(DEFAULT_EXTENSION_EDEFAULT);
				return;
			case StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_CONTENT_TYPE:
				setDefaultContentType(DEFAULT_CONTENT_TYPE_EDEFAULT);
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
			case StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_EXTENSION:
				return DEFAULT_EXTENSION_EDEFAULT == null ? defaultExtension != null : !DEFAULT_EXTENSION_EDEFAULT.equals(defaultExtension);
			case StorePackage.SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_CONTENT_TYPE:
				return DEFAULT_CONTENT_TYPE_EDEFAULT == null ? defaultContentType != null : !DEFAULT_CONTENT_TYPE_EDEFAULT.equals(defaultContentType);
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
		result.append(" (defaultExtension: ");
		result.append(defaultExtension);
		result.append(", defaultContentType: ");
		result.append(defaultContentType);
		result.append(')');
		return result.toString();
	}

} //SerializerPluginDescriptorImpl
