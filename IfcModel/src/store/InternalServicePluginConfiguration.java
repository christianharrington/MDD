/**
 */
package store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Service Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.InternalServicePluginConfiguration#isRemoteAccessible <em>Remote Accessible</em>}</li>
 *   <li>{@link store.InternalServicePluginConfiguration#getUserSettings <em>User Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getInternalServicePluginConfiguration()
 * @model
 * @generated
 */
public interface InternalServicePluginConfiguration extends PluginConfiguration {
	/**
	 * Returns the value of the '<em><b>Remote Accessible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Accessible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Accessible</em>' attribute.
	 * @see #setRemoteAccessible(boolean)
	 * @see store.StorePackage#getInternalServicePluginConfiguration_RemoteAccessible()
	 * @model
	 * @generated
	 */
	boolean isRemoteAccessible();

	/**
	 * Sets the value of the '{@link store.InternalServicePluginConfiguration#isRemoteAccessible <em>Remote Accessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Accessible</em>' attribute.
	 * @see #isRemoteAccessible()
	 * @generated
	 */
	void setRemoteAccessible(boolean value);

	/**
	 * Returns the value of the '<em><b>User Settings</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.UserSettings#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Settings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Settings</em>' reference.
	 * @see #setUserSettings(UserSettings)
	 * @see store.StorePackage#getInternalServicePluginConfiguration_UserSettings()
	 * @see store.UserSettings#getServices
	 * @model opposite="services"
	 * @generated
	 */
	UserSettings getUserSettings();

	/**
	 * Sets the value of the '{@link store.InternalServicePluginConfiguration#getUserSettings <em>User Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Settings</em>' reference.
	 * @see #getUserSettings()
	 * @generated
	 */
	void setUserSettings(UserSettings value);

} // InternalServicePluginConfiguration
