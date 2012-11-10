/**
 */
package store;

import log.AccessMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.Service#getName <em>Name</em>}</li>
 *   <li>{@link store.Service#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link store.Service#getServiceIdentifier <em>Service Identifier</em>}</li>
 *   <li>{@link store.Service#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link store.Service#getUrl <em>Url</em>}</li>
 *   <li>{@link store.Service#getToken <em>Token</em>}</li>
 *   <li>{@link store.Service#getNotificationProtocol <em>Notification Protocol</em>}</li>
 *   <li>{@link store.Service#getDescription <em>Description</em>}</li>
 *   <li>{@link store.Service#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link store.Service#isReadRevision <em>Read Revision</em>}</li>
 *   <li>{@link store.Service#getReadExtendedData <em>Read Extended Data</em>}</li>
 *   <li>{@link store.Service#getWriteRevision <em>Write Revision</em>}</li>
 *   <li>{@link store.Service#getWriteExtendedData <em>Write Extended Data</em>}</li>
 *   <li>{@link store.Service#getProfileIdentifier <em>Profile Identifier</em>}</li>
 *   <li>{@link store.Service#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link store.Service#getProfileDescription <em>Profile Description</em>}</li>
 *   <li>{@link store.Service#isProfilePublic <em>Profile Public</em>}</li>
 *   <li>{@link store.Service#getProject <em>Project</em>}</li>
 *   <li>{@link store.Service#getUser <em>User</em>}</li>
 *   <li>{@link store.Service#getInternalService <em>Internal Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
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
	 * @see store.StorePackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link store.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see store.StorePackage#getService_ServiceName()
	 * @model
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link store.Service#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Service Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Identifier</em>' attribute.
	 * @see #setServiceIdentifier(String)
	 * @see store.StorePackage#getService_ServiceIdentifier()
	 * @model
	 * @generated
	 */
	String getServiceIdentifier();

	/**
	 * Sets the value of the '{@link store.Service#getServiceIdentifier <em>Service Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Identifier</em>' attribute.
	 * @see #getServiceIdentifier()
	 * @generated
	 */
	void setServiceIdentifier(String value);

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
	 * @see store.StorePackage#getService_ProviderName()
	 * @model
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link store.Service#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

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
	 * @see store.StorePackage#getService_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link store.Service#getUrl <em>Url</em>}' attribute.
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
	 * @see store.StorePackage#getService_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link store.Service#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

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
	 * @see store.StorePackage#getService_NotificationProtocol()
	 * @model
	 * @generated
	 */
	AccessMethod getNotificationProtocol();

	/**
	 * Sets the value of the '{@link store.Service#getNotificationProtocol <em>Notification Protocol</em>}' attribute.
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
	 * @see store.StorePackage#getService_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link store.Service#getDescription <em>Description</em>}' attribute.
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
	 * @see store.StorePackage#getService_Trigger()
	 * @model
	 * @generated
	 */
	Trigger getTrigger();

	/**
	 * Sets the value of the '{@link store.Service#getTrigger <em>Trigger</em>}' attribute.
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
	 * @see store.StorePackage#getService_ReadRevision()
	 * @model
	 * @generated
	 */
	boolean isReadRevision();

	/**
	 * Sets the value of the '{@link store.Service#isReadRevision <em>Read Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Revision</em>' attribute.
	 * @see #isReadRevision()
	 * @generated
	 */
	void setReadRevision(boolean value);

	/**
	 * Returns the value of the '<em><b>Read Extended Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Extended Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Extended Data</em>' reference.
	 * @see #setReadExtendedData(ExtendedDataSchema)
	 * @see store.StorePackage#getService_ReadExtendedData()
	 * @model
	 * @generated
	 */
	ExtendedDataSchema getReadExtendedData();

	/**
	 * Sets the value of the '{@link store.Service#getReadExtendedData <em>Read Extended Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Extended Data</em>' reference.
	 * @see #getReadExtendedData()
	 * @generated
	 */
	void setReadExtendedData(ExtendedDataSchema value);

	/**
	 * Returns the value of the '<em><b>Write Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Revision</em>' reference.
	 * @see #setWriteRevision(Project)
	 * @see store.StorePackage#getService_WriteRevision()
	 * @model
	 * @generated
	 */
	Project getWriteRevision();

	/**
	 * Sets the value of the '{@link store.Service#getWriteRevision <em>Write Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Revision</em>' reference.
	 * @see #getWriteRevision()
	 * @generated
	 */
	void setWriteRevision(Project value);

	/**
	 * Returns the value of the '<em><b>Write Extended Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Extended Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Extended Data</em>' reference.
	 * @see #setWriteExtendedData(ExtendedDataSchema)
	 * @see store.StorePackage#getService_WriteExtendedData()
	 * @model
	 * @generated
	 */
	ExtendedDataSchema getWriteExtendedData();

	/**
	 * Sets the value of the '{@link store.Service#getWriteExtendedData <em>Write Extended Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Extended Data</em>' reference.
	 * @see #getWriteExtendedData()
	 * @generated
	 */
	void setWriteExtendedData(ExtendedDataSchema value);

	/**
	 * Returns the value of the '<em><b>Profile Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Identifier</em>' attribute.
	 * @see #setProfileIdentifier(String)
	 * @see store.StorePackage#getService_ProfileIdentifier()
	 * @model
	 * @generated
	 */
	String getProfileIdentifier();

	/**
	 * Sets the value of the '{@link store.Service#getProfileIdentifier <em>Profile Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Identifier</em>' attribute.
	 * @see #getProfileIdentifier()
	 * @generated
	 */
	void setProfileIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Profile Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Name</em>' attribute.
	 * @see #setProfileName(String)
	 * @see store.StorePackage#getService_ProfileName()
	 * @model
	 * @generated
	 */
	String getProfileName();

	/**
	 * Sets the value of the '{@link store.Service#getProfileName <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Name</em>' attribute.
	 * @see #getProfileName()
	 * @generated
	 */
	void setProfileName(String value);

	/**
	 * Returns the value of the '<em><b>Profile Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Description</em>' attribute.
	 * @see #setProfileDescription(String)
	 * @see store.StorePackage#getService_ProfileDescription()
	 * @model
	 * @generated
	 */
	String getProfileDescription();

	/**
	 * Sets the value of the '{@link store.Service#getProfileDescription <em>Profile Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Description</em>' attribute.
	 * @see #getProfileDescription()
	 * @generated
	 */
	void setProfileDescription(String value);

	/**
	 * Returns the value of the '<em><b>Profile Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Public</em>' attribute.
	 * @see #setProfilePublic(boolean)
	 * @see store.StorePackage#getService_ProfilePublic()
	 * @model
	 * @generated
	 */
	boolean isProfilePublic();

	/**
	 * Sets the value of the '{@link store.Service#isProfilePublic <em>Profile Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Public</em>' attribute.
	 * @see #isProfilePublic()
	 * @generated
	 */
	void setProfilePublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.Project#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see store.StorePackage#getService_Project()
	 * @see store.Project#getServices
	 * @model opposite="services"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link store.Service#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.User#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see store.StorePackage#getService_User()
	 * @see store.User#getServices
	 * @model opposite="services"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link store.Service#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Internal Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Service</em>' reference.
	 * @see #setInternalService(InternalServicePluginConfiguration)
	 * @see store.StorePackage#getService_InternalService()
	 * @model
	 * @generated
	 */
	InternalServicePluginConfiguration getInternalService();

	/**
	 * Sets the value of the '{@link store.Service#getInternalService <em>Internal Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Service</em>' reference.
	 * @see #getInternalService()
	 * @generated
	 */
	void setInternalService(InternalServicePluginConfiguration value);

} // Service
