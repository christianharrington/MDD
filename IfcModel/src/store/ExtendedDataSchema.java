/**
 */
package store;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Data Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.ExtendedDataSchema#getName <em>Name</em>}</li>
 *   <li>{@link store.ExtendedDataSchema#getUrl <em>Url</em>}</li>
 *   <li>{@link store.ExtendedDataSchema#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link store.ExtendedDataSchema#getDescription <em>Description</em>}</li>
 *   <li>{@link store.ExtendedDataSchema#getFile <em>File</em>}</li>
 *   <li>{@link store.ExtendedDataSchema#getSize <em>Size</em>}</li>
 *   <li>{@link store.ExtendedDataSchema#isValidate <em>Validate</em>}</li>
 *   <li>{@link store.ExtendedDataSchema#getType <em>Type</em>}</li>
 *   <li>{@link store.ExtendedDataSchema#getUsers <em>Users</em>}</li>
 *   <li>{@link store.ExtendedDataSchema#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getExtendedDataSchema()
 * @model
 * @generated
 */
public interface ExtendedDataSchema extends EObject {
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
	 * @see store.StorePackage#getExtendedDataSchema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link store.ExtendedDataSchema#getName <em>Name</em>}' attribute.
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
	 * @see store.StorePackage#getExtendedDataSchema_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link store.ExtendedDataSchema#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see store.StorePackage#getExtendedDataSchema_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link store.ExtendedDataSchema#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

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
	 * @see store.StorePackage#getExtendedDataSchema_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link store.ExtendedDataSchema#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see store.StorePackage#getExtendedDataSchema_File()
	 * @model
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link store.ExtendedDataSchema#getFile <em>File</em>}' reference.
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
	 * @see store.StorePackage#getExtendedDataSchema_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link store.ExtendedDataSchema#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate</em>' attribute.
	 * @see #setValidate(boolean)
	 * @see store.StorePackage#getExtendedDataSchema_Validate()
	 * @model
	 * @generated
	 */
	boolean isValidate();

	/**
	 * Sets the value of the '{@link store.ExtendedDataSchema#isValidate <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate</em>' attribute.
	 * @see #isValidate()
	 * @generated
	 */
	void setValidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link store.ExtendedDataSchemaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see store.ExtendedDataSchemaType
	 * @see #setType(ExtendedDataSchemaType)
	 * @see store.StorePackage#getExtendedDataSchema_Type()
	 * @model
	 * @generated
	 */
	ExtendedDataSchemaType getType();

	/**
	 * Sets the value of the '{@link store.ExtendedDataSchema#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see store.ExtendedDataSchemaType
	 * @see #getType()
	 * @generated
	 */
	void setType(ExtendedDataSchemaType value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link store.User}.
	 * It is bidirectional and its opposite is '{@link store.User#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see store.StorePackage#getExtendedDataSchema_Users()
	 * @see store.User#getSchemas
	 * @model opposite="schemas"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Extended Data</b></em>' reference list.
	 * The list contents are of type {@link store.ExtendedData}.
	 * It is bidirectional and its opposite is '{@link store.ExtendedData#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Data</em>' reference list.
	 * @see store.StorePackage#getExtendedDataSchema_ExtendedData()
	 * @see store.ExtendedData#getSchema
	 * @model opposite="schema"
	 * @generated
	 */
	EList<ExtendedData> getExtendedData();

} // ExtendedDataSchema
