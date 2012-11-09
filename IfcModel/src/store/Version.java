/**
 */
package store;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.Version#getMajor <em>Major</em>}</li>
 *   <li>{@link store.Version#getMinor <em>Minor</em>}</li>
 *   <li>{@link store.Version#getRevision <em>Revision</em>}</li>
 *   <li>{@link store.Version#getDate <em>Date</em>}</li>
 *   <li>{@link store.Version#getDownloadUrl <em>Download Url</em>}</li>
 *   <li>{@link store.Version#getSupportUrl <em>Support Url</em>}</li>
 *   <li>{@link store.Version#getSupportEmail <em>Support Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(Integer)
	 * @see store.StorePackage#getVersion_Major()
	 * @model
	 * @generated
	 */
	Integer getMajor();

	/**
	 * Sets the value of the '{@link store.Version#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(Integer value);

	/**
	 * Returns the value of the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor</em>' attribute.
	 * @see #setMinor(Integer)
	 * @see store.StorePackage#getVersion_Minor()
	 * @model
	 * @generated
	 */
	Integer getMinor();

	/**
	 * Sets the value of the '{@link store.Version#getMinor <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor</em>' attribute.
	 * @see #getMinor()
	 * @generated
	 */
	void setMinor(Integer value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(Integer)
	 * @see store.StorePackage#getVersion_Revision()
	 * @model
	 * @generated
	 */
	Integer getRevision();

	/**
	 * Sets the value of the '{@link store.Version#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Integer value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see store.StorePackage#getVersion_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link store.Version#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Download Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Download Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Url</em>' attribute.
	 * @see #setDownloadUrl(String)
	 * @see store.StorePackage#getVersion_DownloadUrl()
	 * @model
	 * @generated
	 */
	String getDownloadUrl();

	/**
	 * Sets the value of the '{@link store.Version#getDownloadUrl <em>Download Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Url</em>' attribute.
	 * @see #getDownloadUrl()
	 * @generated
	 */
	void setDownloadUrl(String value);

	/**
	 * Returns the value of the '<em><b>Support Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Url</em>' attribute.
	 * @see #setSupportUrl(String)
	 * @see store.StorePackage#getVersion_SupportUrl()
	 * @model
	 * @generated
	 */
	String getSupportUrl();

	/**
	 * Sets the value of the '{@link store.Version#getSupportUrl <em>Support Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Url</em>' attribute.
	 * @see #getSupportUrl()
	 * @generated
	 */
	void setSupportUrl(String value);

	/**
	 * Returns the value of the '<em><b>Support Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Email</em>' attribute.
	 * @see #setSupportEmail(String)
	 * @see store.StorePackage#getVersion_SupportEmail()
	 * @model
	 * @generated
	 */
	String getSupportEmail();

	/**
	 * Sets the value of the '{@link store.Version#getSupportEmail <em>Support Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Email</em>' attribute.
	 * @see #getSupportEmail()
	 * @generated
	 */
	void setSupportEmail(String value);

} // Version
