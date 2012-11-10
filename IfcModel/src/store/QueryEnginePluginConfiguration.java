/**
 */
package store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Engine Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.QueryEnginePluginConfiguration#getUserSettings <em>User Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getQueryEnginePluginConfiguration()
 * @model
 * @generated
 */
public interface QueryEnginePluginConfiguration extends PluginConfiguration {
	/**
	 * Returns the value of the '<em><b>User Settings</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.UserSettings#getQueryengines <em>Queryengines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Settings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Settings</em>' reference.
	 * @see #setUserSettings(UserSettings)
	 * @see store.StorePackage#getQueryEnginePluginConfiguration_UserSettings()
	 * @see store.UserSettings#getQueryengines
	 * @model opposite="queryengines"
	 * @generated
	 */
	UserSettings getUserSettings();

	/**
	 * Sets the value of the '{@link store.QueryEnginePluginConfiguration#getUserSettings <em>User Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Settings</em>' reference.
	 * @see #getUserSettings()
	 * @generated
	 */
	void setUserSettings(UserSettings value);

} // QueryEnginePluginConfiguration
