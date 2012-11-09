/**
 */
package store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serializer Plugin Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.SerializerPluginDescriptor#getDefaultExtension <em>Default Extension</em>}</li>
 *   <li>{@link store.SerializerPluginDescriptor#getDefaultContentType <em>Default Content Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getSerializerPluginDescriptor()
 * @model
 * @generated
 */
public interface SerializerPluginDescriptor extends PluginDescriptor {
	/**
	 * Returns the value of the '<em><b>Default Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Extension</em>' attribute.
	 * @see #setDefaultExtension(String)
	 * @see store.StorePackage#getSerializerPluginDescriptor_DefaultExtension()
	 * @model
	 * @generated
	 */
	String getDefaultExtension();

	/**
	 * Sets the value of the '{@link store.SerializerPluginDescriptor#getDefaultExtension <em>Default Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Extension</em>' attribute.
	 * @see #getDefaultExtension()
	 * @generated
	 */
	void setDefaultExtension(String value);

	/**
	 * Returns the value of the '<em><b>Default Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Content Type</em>' attribute.
	 * @see #setDefaultContentType(String)
	 * @see store.StorePackage#getSerializerPluginDescriptor_DefaultContentType()
	 * @model
	 * @generated
	 */
	String getDefaultContentType();

	/**
	 * Sets the value of the '{@link store.SerializerPluginDescriptor#getDefaultContentType <em>Default Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Content Type</em>' attribute.
	 * @see #getDefaultContentType()
	 * @generated
	 */
	void setDefaultContentType(String value);

} // SerializerPluginDescriptor
