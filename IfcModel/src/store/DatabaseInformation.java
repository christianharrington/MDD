/**
 */
package store;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.DatabaseInformation#getNumberOfProjects <em>Number Of Projects</em>}</li>
 *   <li>{@link store.DatabaseInformation#getNumberOfUsers <em>Number Of Users</em>}</li>
 *   <li>{@link store.DatabaseInformation#getNumberOfRevisions <em>Number Of Revisions</em>}</li>
 *   <li>{@link store.DatabaseInformation#getNumberOfCheckouts <em>Number Of Checkouts</em>}</li>
 *   <li>{@link store.DatabaseInformation#getDatabaseSizeInBytes <em>Database Size In Bytes</em>}</li>
 *   <li>{@link store.DatabaseInformation#getType <em>Type</em>}</li>
 *   <li>{@link store.DatabaseInformation#getCreated <em>Created</em>}</li>
 *   <li>{@link store.DatabaseInformation#getLocation <em>Location</em>}</li>
 *   <li>{@link store.DatabaseInformation#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link store.DatabaseInformation#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getDatabaseInformation()
 * @model
 * @generated
 */
public interface DatabaseInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Projects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Projects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Projects</em>' attribute.
	 * @see #setNumberOfProjects(Integer)
	 * @see store.StorePackage#getDatabaseInformation_NumberOfProjects()
	 * @model
	 * @generated
	 */
	Integer getNumberOfProjects();

	/**
	 * Sets the value of the '{@link store.DatabaseInformation#getNumberOfProjects <em>Number Of Projects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Projects</em>' attribute.
	 * @see #getNumberOfProjects()
	 * @generated
	 */
	void setNumberOfProjects(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Users</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Users</em>' attribute.
	 * @see #setNumberOfUsers(Integer)
	 * @see store.StorePackage#getDatabaseInformation_NumberOfUsers()
	 * @model
	 * @generated
	 */
	Integer getNumberOfUsers();

	/**
	 * Sets the value of the '{@link store.DatabaseInformation#getNumberOfUsers <em>Number Of Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Users</em>' attribute.
	 * @see #getNumberOfUsers()
	 * @generated
	 */
	void setNumberOfUsers(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Revisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Revisions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Revisions</em>' attribute.
	 * @see #setNumberOfRevisions(Integer)
	 * @see store.StorePackage#getDatabaseInformation_NumberOfRevisions()
	 * @model
	 * @generated
	 */
	Integer getNumberOfRevisions();

	/**
	 * Sets the value of the '{@link store.DatabaseInformation#getNumberOfRevisions <em>Number Of Revisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Revisions</em>' attribute.
	 * @see #getNumberOfRevisions()
	 * @generated
	 */
	void setNumberOfRevisions(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Checkouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Checkouts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Checkouts</em>' attribute.
	 * @see #setNumberOfCheckouts(Integer)
	 * @see store.StorePackage#getDatabaseInformation_NumberOfCheckouts()
	 * @model
	 * @generated
	 */
	Integer getNumberOfCheckouts();

	/**
	 * Sets the value of the '{@link store.DatabaseInformation#getNumberOfCheckouts <em>Number Of Checkouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Checkouts</em>' attribute.
	 * @see #getNumberOfCheckouts()
	 * @generated
	 */
	void setNumberOfCheckouts(Integer value);

	/**
	 * Returns the value of the '<em><b>Database Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Size In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Size In Bytes</em>' attribute.
	 * @see #setDatabaseSizeInBytes(Long)
	 * @see store.StorePackage#getDatabaseInformation_DatabaseSizeInBytes()
	 * @model
	 * @generated
	 */
	Long getDatabaseSizeInBytes();

	/**
	 * Sets the value of the '{@link store.DatabaseInformation#getDatabaseSizeInBytes <em>Database Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Size In Bytes</em>' attribute.
	 * @see #getDatabaseSizeInBytes()
	 * @generated
	 */
	void setDatabaseSizeInBytes(Long value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see store.StorePackage#getDatabaseInformation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link store.DatabaseInformation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see store.StorePackage#getDatabaseInformation_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link store.DatabaseInformation#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see store.StorePackage#getDatabaseInformation_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link store.DatabaseInformation#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #setSchemaVersion(Integer)
	 * @see store.StorePackage#getDatabaseInformation_SchemaVersion()
	 * @model
	 * @generated
	 */
	Integer getSchemaVersion();

	/**
	 * Sets the value of the '{@link store.DatabaseInformation#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link store.DatabaseInformationCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see store.StorePackage#getDatabaseInformation_Categories()
	 * @model
	 * @generated
	 */
	EList<DatabaseInformationCategory> getCategories();

} // DatabaseInformation
