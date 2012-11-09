/**
 */
package log;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Created</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.DatabaseCreated#getPath <em>Path</em>}</li>
 *   <li>{@link log.DatabaseCreated#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getDatabaseCreated()
 * @model
 * @generated
 */
public interface DatabaseCreated extends LogAction {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see log.LogPackage#getDatabaseCreated_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link log.DatabaseCreated#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Integer)
	 * @see log.LogPackage#getDatabaseCreated_Version()
	 * @model
	 * @generated
	 */
	Integer getVersion();

	/**
	 * Sets the value of the '{@link log.DatabaseCreated#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Integer value);

} // DatabaseCreated
