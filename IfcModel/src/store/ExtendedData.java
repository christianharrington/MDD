/**
 */
package store;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.ExtendedData#getUrl <em>Url</em>}</li>
 *   <li>{@link store.ExtendedData#getFile <em>File</em>}</li>
 *   <li>{@link store.ExtendedData#getSize <em>Size</em>}</li>
 *   <li>{@link store.ExtendedData#getTitle <em>Title</em>}</li>
 *   <li>{@link store.ExtendedData#getAdded <em>Added</em>}</li>
 *   <li>{@link store.ExtendedData#getUser <em>User</em>}</li>
 *   <li>{@link store.ExtendedData#getSchema <em>Schema</em>}</li>
 *   <li>{@link store.ExtendedData#getRevision <em>Revision</em>}</li>
 *   <li>{@link store.ExtendedData#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getExtendedData()
 * @model
 * @generated
 */
public interface ExtendedData extends EObject {
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
	 * @see store.StorePackage#getExtendedData_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link store.ExtendedData#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(File)
	 * @see store.StorePackage#getExtendedData_File()
	 * @model
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link store.ExtendedData#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see store.StorePackage#getExtendedData_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link store.ExtendedData#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see store.StorePackage#getExtendedData_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link store.ExtendedData#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Added</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added</em>' attribute.
	 * @see #setAdded(Date)
	 * @see store.StorePackage#getExtendedData_Added()
	 * @model
	 * @generated
	 */
	Date getAdded();

	/**
	 * Sets the value of the '{@link store.ExtendedData#getAdded <em>Added</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added</em>' attribute.
	 * @see #getAdded()
	 * @generated
	 */
	void setAdded(Date value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.User#getExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see store.StorePackage#getExtendedData_User()
	 * @see store.User#getExtendedData
	 * @model opposite="extendedData"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link store.ExtendedData#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.ExtendedDataSchema#getExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(ExtendedDataSchema)
	 * @see store.StorePackage#getExtendedData_Schema()
	 * @see store.ExtendedDataSchema#getExtendedData
	 * @model opposite="extendedData"
	 * @generated
	 */
	ExtendedDataSchema getSchema();

	/**
	 * Sets the value of the '{@link store.ExtendedData#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(ExtendedDataSchema value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.Revision#getExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' reference.
	 * @see #setRevision(Revision)
	 * @see store.StorePackage#getExtendedData_Revision()
	 * @see store.Revision#getExtendedData
	 * @model opposite="extendedData"
	 * @generated
	 */
	Revision getRevision();

	/**
	 * Sets the value of the '{@link store.ExtendedData#getRevision <em>Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' reference.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Revision value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.Project#getExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see store.StorePackage#getExtendedData_Project()
	 * @see store.Project#getExtendedData
	 * @model opposite="extendedData"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link store.ExtendedData#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

} // ExtendedData
