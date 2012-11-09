/**
 */
package store;

import javax.activation.DataHandler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Download Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.DownloadResult#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link store.DownloadResult#getRevisionNr <em>Revision Nr</em>}</li>
 *   <li>{@link store.DownloadResult#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getDownloadResult()
 * @model
 * @generated
 */
public interface DownloadResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see store.StorePackage#getDownloadResult_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link store.DownloadResult#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Revision Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Nr</em>' attribute.
	 * @see #setRevisionNr(Integer)
	 * @see store.StorePackage#getDownloadResult_RevisionNr()
	 * @model
	 * @generated
	 */
	Integer getRevisionNr();

	/**
	 * Sets the value of the '{@link store.DownloadResult#getRevisionNr <em>Revision Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Nr</em>' attribute.
	 * @see #getRevisionNr()
	 * @generated
	 */
	void setRevisionNr(Integer value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(DataHandler)
	 * @see store.StorePackage#getDownloadResult_File()
	 * @model dataType="store.DataHandler"
	 * @generated
	 */
	DataHandler getFile();

	/**
	 * Sets the value of the '{@link store.DownloadResult#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(DataHandler value);

} // DownloadResult
