/**
 */
package store;

import log.AccessMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.ServiceDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link store.ServiceDescriptor#getUrl <em>Url</em>}</li>
 *   <li>{@link store.ServiceDescriptor#getToken <em>Token</em>}</li>
 *   <li>{@link store.ServiceDescriptor#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link store.ServiceDescriptor#getNotificationProtocol <em>Notification Protocol</em>}</li>
 *   <li>{@link store.ServiceDescriptor#getDescription <em>Description</em>}</li>
 *   <li>{@link store.ServiceDescriptor#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link store.ServiceDescriptor#isReadRevision <em>Read Revision</em>}</li>
 *   <li>{@link store.ServiceDescriptor#getReadExtendedData <em>Read Extended Data</em>}</li>
 *   <li>{@link store.ServiceDescriptor#isWriteRevision <em>Write Revision</em>}</li>
 *   <li>{@link store.ServiceDescriptor#getWriteExtendedData <em>Write Extended Data</em>}</li>
 *   <li>{@link store.ServiceDescriptor#getProviderName <em>Provider Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getServiceDescriptor()
 * @model
 * @generated
 */
public interface ServiceDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see store.StorePackage#getServiceDescriptor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see store.StorePackage#getServiceDescriptor_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see store.StorePackage#getServiceDescriptor_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see store.StorePackage#getServiceDescriptor_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Notification Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link log.AccessMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Protocol</em>' attribute.
	 * @see log.AccessMethod
	 * @see #setNotificationProtocol(AccessMethod)
	 * @see store.StorePackage#getServiceDescriptor_NotificationProtocol()
	 * @model
	 * @generated
	 */
	AccessMethod getNotificationProtocol();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getNotificationProtocol <em>Notification Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Protocol</em>' attribute.
	 * @see log.AccessMethod
	 * @see #getNotificationProtocol()
	 * @generated
	 */
	void setNotificationProtocol(AccessMethod value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see store.StorePackage#getServiceDescriptor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link store.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see store.Trigger
	 * @see #setTrigger(Trigger)
	 * @see store.StorePackage#getServiceDescriptor_Trigger()
	 * @model
	 * @generated
	 */
	Trigger getTrigger();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see store.Trigger
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Trigger value);

	/**
	 * Returns the value of the '<em><b>Read Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Revision</em>' attribute.
	 * @see #setReadRevision(boolean)
	 * @see store.StorePackage#getServiceDescriptor_ReadRevision()
	 * @model
	 * @generated
	 */
	boolean isReadRevision();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#isReadRevision <em>Read Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Revision</em>' attribute.
	 * @see #isReadRevision()
	 * @generated
	 */
	void setReadRevision(boolean value);

	/**
	 * Returns the value of the '<em><b>Read Extended Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Extended Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Extended Data</em>' attribute.
	 * @see #setReadExtendedData(String)
	 * @see store.StorePackage#getServiceDescriptor_ReadExtendedData()
	 * @model
	 * @generated
	 */
	String getReadExtendedData();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getReadExtendedData <em>Read Extended Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Extended Data</em>' attribute.
	 * @see #getReadExtendedData()
	 * @generated
	 */
	void setReadExtendedData(String value);

	/**
	 * Returns the value of the '<em><b>Write Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Revision</em>' attribute.
	 * @see #setWriteRevision(boolean)
	 * @see store.StorePackage#getServiceDescriptor_WriteRevision()
	 * @model
	 * @generated
	 */
	boolean isWriteRevision();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#isWriteRevision <em>Write Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Revision</em>' attribute.
	 * @see #isWriteRevision()
	 * @generated
	 */
	void setWriteRevision(boolean value);

	/**
	 * Returns the value of the '<em><b>Write Extended Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Extended Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Extended Data</em>' attribute.
	 * @see #setWriteExtendedData(String)
	 * @see store.StorePackage#getServiceDescriptor_WriteExtendedData()
	 * @model
	 * @generated
	 */
	String getWriteExtendedData();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getWriteExtendedData <em>Write Extended Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Extended Data</em>' attribute.
	 * @see #getWriteExtendedData()
	 * @generated
	 */
	void setWriteExtendedData(String value);

	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see store.StorePackage#getServiceDescriptor_ProviderName()
	 * @model
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link store.ServiceDescriptor#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

} // ServiceDescriptor
