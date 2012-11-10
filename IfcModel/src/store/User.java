/**
 */
package store;

import java.util.Date;

import log.LogAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.User#getName <em>Name</em>}</li>
 *   <li>{@link store.User#getPassword <em>Password</em>}</li>
 *   <li>{@link store.User#getHasRightsOn <em>Has Rights On</em>}</li>
 *   <li>{@link store.User#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link store.User#getState <em>State</em>}</li>
 *   <li>{@link store.User#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link store.User#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link store.User#getUserType <em>User Type</em>}</li>
 *   <li>{@link store.User#getUsername <em>Username</em>}</li>
 *   <li>{@link store.User#getLastSeen <em>Last Seen</em>}</li>
 *   <li>{@link store.User#getToken <em>Token</em>}</li>
 *   <li>{@link store.User#getValidationToken <em>Validation Token</em>}</li>
 *   <li>{@link store.User#getValidationTokenCreated <em>Validation Token Created</em>}</li>
 *   <li>{@link store.User#getUserSettings <em>User Settings</em>}</li>
 *   <li>{@link store.User#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link store.User#getExtendedData <em>Extended Data</em>}</li>
 *   <li>{@link store.User#getServices <em>Services</em>}</li>
 *   <li>{@link store.User#getLogs <em>Logs</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
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
	 * @see store.StorePackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link store.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see store.StorePackage#getUser_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link store.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Has Rights On</b></em>' reference list.
	 * The list contents are of type {@link store.Project}.
	 * It is bidirectional and its opposite is '{@link store.Project#getHasAuthorizedUsers <em>Has Authorized Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Rights On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Rights On</em>' reference list.
	 * @see store.StorePackage#getUser_HasRightsOn()
	 * @see store.Project#getHasAuthorizedUsers
	 * @model opposite="hasAuthorizedUsers"
	 * @generated
	 */
	EList<Project> getHasRightsOn();

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' reference list.
	 * The list contents are of type {@link store.Revision}.
	 * It is bidirectional and its opposite is '{@link store.Revision#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' reference list.
	 * @see store.StorePackage#getUser_Revisions()
	 * @see store.Revision#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link store.ObjectState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see store.ObjectState
	 * @see #setState(ObjectState)
	 * @see store.StorePackage#getUser_State()
	 * @model
	 * @generated
	 */
	ObjectState getState();

	/**
	 * Sets the value of the '{@link store.User#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see store.ObjectState
	 * @see #getState()
	 * @generated
	 */
	void setState(ObjectState value);

	/**
	 * Returns the value of the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created On</em>' attribute.
	 * @see #setCreatedOn(Date)
	 * @see store.StorePackage#getUser_CreatedOn()
	 * @model
	 * @generated
	 */
	Date getCreatedOn();

	/**
	 * Sets the value of the '{@link store.User#getCreatedOn <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created On</em>' attribute.
	 * @see #getCreatedOn()
	 * @generated
	 */
	void setCreatedOn(Date value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(User)
	 * @see store.StorePackage#getUser_CreatedBy()
	 * @model
	 * @generated
	 */
	User getCreatedBy();

	/**
	 * Sets the value of the '{@link store.User#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(User value);

	/**
	 * Returns the value of the '<em><b>User Type</b></em>' attribute.
	 * The literals are from the enumeration {@link store.UserType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Type</em>' attribute.
	 * @see store.UserType
	 * @see #setUserType(UserType)
	 * @see store.StorePackage#getUser_UserType()
	 * @model
	 * @generated
	 */
	UserType getUserType();

	/**
	 * Sets the value of the '{@link store.User#getUserType <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Type</em>' attribute.
	 * @see store.UserType
	 * @see #getUserType()
	 * @generated
	 */
	void setUserType(UserType value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see store.StorePackage#getUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link store.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Seen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Seen</em>' attribute.
	 * @see #setLastSeen(Date)
	 * @see store.StorePackage#getUser_LastSeen()
	 * @model
	 * @generated
	 */
	Date getLastSeen();

	/**
	 * Sets the value of the '{@link store.User#getLastSeen <em>Last Seen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Seen</em>' attribute.
	 * @see #getLastSeen()
	 * @generated
	 */
	void setLastSeen(Date value);

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
	 * @see store.StorePackage#getUser_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link store.User#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Validation Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Token</em>' attribute.
	 * @see #setValidationToken(String)
	 * @see store.StorePackage#getUser_ValidationToken()
	 * @model
	 * @generated
	 */
	String getValidationToken();

	/**
	 * Sets the value of the '{@link store.User#getValidationToken <em>Validation Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Token</em>' attribute.
	 * @see #getValidationToken()
	 * @generated
	 */
	void setValidationToken(String value);

	/**
	 * Returns the value of the '<em><b>Validation Token Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Token Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Token Created</em>' attribute.
	 * @see #setValidationTokenCreated(Date)
	 * @see store.StorePackage#getUser_ValidationTokenCreated()
	 * @model
	 * @generated
	 */
	Date getValidationTokenCreated();

	/**
	 * Sets the value of the '{@link store.User#getValidationTokenCreated <em>Validation Token Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Token Created</em>' attribute.
	 * @see #getValidationTokenCreated()
	 * @generated
	 */
	void setValidationTokenCreated(Date value);

	/**
	 * Returns the value of the '<em><b>User Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Settings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Settings</em>' reference.
	 * @see #setUserSettings(UserSettings)
	 * @see store.StorePackage#getUser_UserSettings()
	 * @model
	 * @generated
	 */
	UserSettings getUserSettings();

	/**
	 * Sets the value of the '{@link store.User#getUserSettings <em>User Settings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Settings</em>' reference.
	 * @see #getUserSettings()
	 * @generated
	 */
	void setUserSettings(UserSettings value);

	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' reference list.
	 * The list contents are of type {@link store.ExtendedDataSchema}.
	 * It is bidirectional and its opposite is '{@link store.ExtendedDataSchema#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' reference list.
	 * @see store.StorePackage#getUser_Schemas()
	 * @see store.ExtendedDataSchema#getUsers
	 * @model opposite="users"
	 * @generated
	 */
	EList<ExtendedDataSchema> getSchemas();

	/**
	 * Returns the value of the '<em><b>Extended Data</b></em>' reference list.
	 * The list contents are of type {@link store.ExtendedData}.
	 * It is bidirectional and its opposite is '{@link store.ExtendedData#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Data</em>' reference list.
	 * @see store.StorePackage#getUser_ExtendedData()
	 * @see store.ExtendedData#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<ExtendedData> getExtendedData();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link store.Service}.
	 * It is bidirectional and its opposite is '{@link store.Service#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see store.StorePackage#getUser_Services()
	 * @see store.Service#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' reference list.
	 * The list contents are of type {@link log.LogAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' reference list.
	 * @see store.StorePackage#getUser_Logs()
	 * @model
	 * @generated
	 */
	EList<LogAction> getLogs();

} // User
