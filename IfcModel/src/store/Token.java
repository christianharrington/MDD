/**
 */
package store;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.Token#getTokenString <em>Token String</em>}</li>
 *   <li>{@link store.Token#getExpires <em>Expires</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Token String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token String</em>' attribute.
	 * @see #setTokenString(String)
	 * @see store.StorePackage#getToken_TokenString()
	 * @model
	 * @generated
	 */
	String getTokenString();

	/**
	 * Sets the value of the '{@link store.Token#getTokenString <em>Token String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token String</em>' attribute.
	 * @see #getTokenString()
	 * @generated
	 */
	void setTokenString(String value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(long)
	 * @see store.StorePackage#getToken_Expires()
	 * @model
	 * @generated
	 */
	long getExpires();

	/**
	 * Sets the value of the '{@link store.Token#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(long value);

} // Token
