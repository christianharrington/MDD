/**
 */
package log;

import store.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Password Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.PasswordReset#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getPasswordReset()
 * @model
 * @generated
 */
public interface PasswordReset extends LogAction {
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
	 * @see log.LogPackage#getPasswordReset_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link log.PasswordReset#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // PasswordReset
