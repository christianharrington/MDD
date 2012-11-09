/**
 */
package store;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.ServerInfo#getServerState <em>Server State</em>}</li>
 *   <li>{@link store.ServerInfo#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getServerInfo()
 * @model
 * @generated
 */
public interface ServerInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Server State</b></em>' attribute.
	 * The literals are from the enumeration {@link store.ServerState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server State</em>' attribute.
	 * @see store.ServerState
	 * @see #setServerState(ServerState)
	 * @see store.StorePackage#getServerInfo_ServerState()
	 * @model
	 * @generated
	 */
	ServerState getServerState();

	/**
	 * Sets the value of the '{@link store.ServerInfo#getServerState <em>Server State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server State</em>' attribute.
	 * @see store.ServerState
	 * @see #getServerState()
	 * @generated
	 */
	void setServerState(ServerState value);

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see store.StorePackage#getServerInfo_ErrorMessage()
	 * @model
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link store.ServerInfo#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

} // ServerInfo
