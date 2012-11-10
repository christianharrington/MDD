/**
 */
package store;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.ConcreteRevision#getId <em>Id</em>}</li>
 *   <li>{@link store.ConcreteRevision#getProject <em>Project</em>}</li>
 *   <li>{@link store.ConcreteRevision#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link store.ConcreteRevision#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link store.ConcreteRevision#getSize <em>Size</em>}</li>
 *   <li>{@link store.ConcreteRevision#getDate <em>Date</em>}</li>
 *   <li>{@link store.ConcreteRevision#getLastError <em>Last Error</em>}</li>
 *   <li>{@link store.ConcreteRevision#getSummary <em>Summary</em>}</li>
 *   <li>{@link store.ConcreteRevision#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getConcreteRevision()
 * @model
 * @generated
 */
public interface ConcreteRevision extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see store.StorePackage#getConcreteRevision_Id()
	 * @model
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link store.ConcreteRevision#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.Project#getConcreteRevisions <em>Concrete Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see store.StorePackage#getConcreteRevision_Project()
	 * @see store.Project#getConcreteRevisions
	 * @model opposite="concreteRevisions"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link store.ConcreteRevision#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum</em>' attribute.
	 * @see #setChecksum(byte[])
	 * @see store.StorePackage#getConcreteRevision_Checksum()
	 * @model
	 * @generated
	 */
	byte[] getChecksum();

	/**
	 * Sets the value of the '{@link store.ConcreteRevision#getChecksum <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' attribute.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(byte[] value);

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' reference list.
	 * The list contents are of type {@link store.Revision}.
	 * It is bidirectional and its opposite is '{@link store.Revision#getConcreteRevisions <em>Concrete Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' reference list.
	 * @see store.StorePackage#getConcreteRevision_Revisions()
	 * @see store.Revision#getConcreteRevisions
	 * @model opposite="concreteRevisions"
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Long)
	 * @see store.StorePackage#getConcreteRevision_Size()
	 * @model
	 * @generated
	 */
	Long getSize();

	/**
	 * Sets the value of the '{@link store.ConcreteRevision#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Long value);

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
	 * @see store.StorePackage#getConcreteRevision_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link store.ConcreteRevision#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Error</em>' attribute.
	 * @see #setLastError(String)
	 * @see store.StorePackage#getConcreteRevision_LastError()
	 * @model
	 * @generated
	 */
	String getLastError();

	/**
	 * Sets the value of the '{@link store.ConcreteRevision#getLastError <em>Last Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Error</em>' attribute.
	 * @see #getLastError()
	 * @generated
	 */
	void setLastError(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' reference.
	 * @see #setSummary(RevisionSummary)
	 * @see store.StorePackage#getConcreteRevision_Summary()
	 * @model
	 * @generated
	 */
	RevisionSummary getSummary();

	/**
	 * Sets the value of the '{@link store.ConcreteRevision#getSummary <em>Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(RevisionSummary value);

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
	 * @see store.StorePackage#getConcreteRevision_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link store.ConcreteRevision#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // ConcreteRevision
