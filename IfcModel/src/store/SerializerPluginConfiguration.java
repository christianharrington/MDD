/**
 */
package store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serializer Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.SerializerPluginConfiguration#getExtension <em>Extension</em>}</li>
 *   <li>{@link store.SerializerPluginConfiguration#getContentType <em>Content Type</em>}</li>
 *   <li>{@link store.SerializerPluginConfiguration#getObjectIDM <em>Object IDM</em>}</li>
 *   <li>{@link store.SerializerPluginConfiguration#getUserSettings <em>User Settings</em>}</li>
 *   <li>{@link store.SerializerPluginConfiguration#getIfcEngine <em>Ifc Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getSerializerPluginConfiguration()
 * @model
 * @generated
 */
public interface SerializerPluginConfiguration extends PluginConfiguration {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see store.StorePackage#getSerializerPluginConfiguration_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link store.SerializerPluginConfiguration#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see store.StorePackage#getSerializerPluginConfiguration_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link store.SerializerPluginConfiguration#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Object IDM</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.ObjectIDMPluginConfiguration#getSerializers <em>Serializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object IDM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object IDM</em>' reference.
	 * @see #setObjectIDM(ObjectIDMPluginConfiguration)
	 * @see store.StorePackage#getSerializerPluginConfiguration_ObjectIDM()
	 * @see store.ObjectIDMPluginConfiguration#getSerializers
	 * @model opposite="serializers"
	 * @generated
	 */
	ObjectIDMPluginConfiguration getObjectIDM();

	/**
	 * Sets the value of the '{@link store.SerializerPluginConfiguration#getObjectIDM <em>Object IDM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object IDM</em>' reference.
	 * @see #getObjectIDM()
	 * @generated
	 */
	void setObjectIDM(ObjectIDMPluginConfiguration value);

	/**
	 * Returns the value of the '<em><b>User Settings</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.UserSettings#getSerializers <em>Serializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Settings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Settings</em>' reference.
	 * @see #setUserSettings(UserSettings)
	 * @see store.StorePackage#getSerializerPluginConfiguration_UserSettings()
	 * @see store.UserSettings#getSerializers
	 * @model opposite="serializers"
	 * @generated
	 */
	UserSettings getUserSettings();

	/**
	 * Sets the value of the '{@link store.SerializerPluginConfiguration#getUserSettings <em>User Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Settings</em>' reference.
	 * @see #getUserSettings()
	 * @generated
	 */
	void setUserSettings(UserSettings value);

	/**
	 * Returns the value of the '<em><b>Ifc Engine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.IfcEnginePluginConfiguration#getSerializers <em>Serializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Engine</em>' reference.
	 * @see #setIfcEngine(IfcEnginePluginConfiguration)
	 * @see store.StorePackage#getSerializerPluginConfiguration_IfcEngine()
	 * @see store.IfcEnginePluginConfiguration#getSerializers
	 * @model opposite="serializers"
	 * @generated
	 */
	IfcEnginePluginConfiguration getIfcEngine();

	/**
	 * Sets the value of the '{@link store.SerializerPluginConfiguration#getIfcEngine <em>Ifc Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Engine</em>' reference.
	 * @see #getIfcEngine()
	 * @generated
	 */
	void setIfcEngine(IfcEnginePluginConfiguration value);

} // SerializerPluginConfiguration
