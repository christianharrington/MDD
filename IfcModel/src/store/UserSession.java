/**
 */
package store;

import java.util.Date;

import log.AccessMethod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.UserSession#getUser <em>User</em>}</li>
 *   <li>{@link store.UserSession#getUsername <em>Username</em>}</li>
 *   <li>{@link store.UserSession#getName <em>Name</em>}</li>
 *   <li>{@link store.UserSession#getType <em>Type</em>}</li>
 *   <li>{@link store.UserSession#getRemoteAddress <em>Remote Address</em>}</li>
 *   <li>{@link store.UserSession#getActiveSince <em>Active Since</em>}</li>
 *   <li>{@link store.UserSession#getLastActive <em>Last Active</em>}</li>
 *   <li>{@link store.UserSession#getAccessMethod <em>Access Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getUserSession()
 * @model
 * @generated
 */
public interface UserSession extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see store.StorePackage#getUserSession_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link store.UserSession#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

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
	 * @see store.StorePackage#getUserSession_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link store.UserSession#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

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
	 * @see store.StorePackage#getUserSession_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link store.UserSession#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link store.UserType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see store.UserType
	 * @see #setType(UserType)
	 * @see store.StorePackage#getUserSession_Type()
	 * @model
	 * @generated
	 */
	UserType getType();

	/**
	 * Sets the value of the '{@link store.UserSession#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see store.UserType
	 * @see #getType()
	 * @generated
	 */
	void setType(UserType value);

	/**
	 * Returns the value of the '<em><b>Remote Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Address</em>' attribute.
	 * @see #setRemoteAddress(String)
	 * @see store.StorePackage#getUserSession_RemoteAddress()
	 * @model
	 * @generated
	 */
	String getRemoteAddress();

	/**
	 * Sets the value of the '{@link store.UserSession#getRemoteAddress <em>Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Address</em>' attribute.
	 * @see #getRemoteAddress()
	 * @generated
	 */
	void setRemoteAddress(String value);

	/**
	 * Returns the value of the '<em><b>Active Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Since</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Since</em>' attribute.
	 * @see #setActiveSince(Date)
	 * @see store.StorePackage#getUserSession_ActiveSince()
	 * @model
	 * @generated
	 */
	Date getActiveSince();

	/**
	 * Sets the value of the '{@link store.UserSession#getActiveSince <em>Active Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Since</em>' attribute.
	 * @see #getActiveSince()
	 * @generated
	 */
	void setActiveSince(Date value);

	/**
	 * Returns the value of the '<em><b>Last Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Active</em>' attribute.
	 * @see #setLastActive(Date)
	 * @see store.StorePackage#getUserSession_LastActive()
	 * @model
	 * @generated
	 */
	Date getLastActive();

	/**
	 * Sets the value of the '{@link store.UserSession#getLastActive <em>Last Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Active</em>' attribute.
	 * @see #getLastActive()
	 * @generated
	 */
	void setLastActive(Date value);

	/**
	 * Returns the value of the '<em><b>Access Method</b></em>' attribute.
	 * The literals are from the enumeration {@link log.AccessMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Method</em>' attribute.
	 * @see log.AccessMethod
	 * @see #setAccessMethod(AccessMethod)
	 * @see store.StorePackage#getUserSession_AccessMethod()
	 * @model
	 * @generated
	 */
	AccessMethod getAccessMethod();

	/**
	 * Sets the value of the '{@link store.UserSession#getAccessMethod <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Method</em>' attribute.
	 * @see log.AccessMethod
	 * @see #getAccessMethod()
	 * @generated
	 */
	void setAccessMethod(AccessMethod value);

} // UserSession
