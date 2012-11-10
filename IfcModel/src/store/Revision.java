/**
 */
package store;

import java.util.Date;

import log.LogAction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.Revision#getId <em>Id</em>}</li>
 *   <li>{@link store.Revision#getUser <em>User</em>}</li>
 *   <li>{@link store.Revision#getDate <em>Date</em>}</li>
 *   <li>{@link store.Revision#getComment <em>Comment</em>}</li>
 *   <li>{@link store.Revision#getSize <em>Size</em>}</li>
 *   <li>{@link store.Revision#getConcreteRevisions <em>Concrete Revisions</em>}</li>
 *   <li>{@link store.Revision#getLastConcreteRevision <em>Last Concrete Revision</em>}</li>
 *   <li>{@link store.Revision#getCheckouts <em>Checkouts</em>}</li>
 *   <li>{@link store.Revision#getProject <em>Project</em>}</li>
 *   <li>{@link store.Revision#getTag <em>Tag</em>}</li>
 *   <li>{@link store.Revision#getLastError <em>Last Error</em>}</li>
 *   <li>{@link store.Revision#getBmi <em>Bmi</em>}</li>
 *   <li>{@link store.Revision#getLaid <em>Laid</em>}</li>
 *   <li>{@link store.Revision#getExtendedData <em>Extended Data</em>}</li>
 *   <li>{@link store.Revision#getLogs <em>Logs</em>}</li>
 *   <li>{@link store.Revision#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getRevision()
 * @model
 * @generated
 */
public interface Revision extends EObject {
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
	 * @see store.StorePackage#getRevision_Id()
	 * @model
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link store.Revision#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.User#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see store.StorePackage#getRevision_User()
	 * @see store.User#getRevisions
	 * @model opposite="revisions"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link store.Revision#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

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
	 * @see store.StorePackage#getRevision_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link store.Revision#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see store.StorePackage#getRevision_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link store.Revision#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

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
	 * @see store.StorePackage#getRevision_Size()
	 * @model
	 * @generated
	 */
	Long getSize();

	/**
	 * Sets the value of the '{@link store.Revision#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Long value);

	/**
	 * Returns the value of the '<em><b>Concrete Revisions</b></em>' reference list.
	 * The list contents are of type {@link store.ConcreteRevision}.
	 * It is bidirectional and its opposite is '{@link store.ConcreteRevision#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Revisions</em>' reference list.
	 * @see store.StorePackage#getRevision_ConcreteRevisions()
	 * @see store.ConcreteRevision#getRevisions
	 * @model opposite="revisions"
	 * @generated
	 */
	EList<ConcreteRevision> getConcreteRevisions();

	/**
	 * Returns the value of the '<em><b>Last Concrete Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Concrete Revision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Concrete Revision</em>' reference.
	 * @see #setLastConcreteRevision(ConcreteRevision)
	 * @see store.StorePackage#getRevision_LastConcreteRevision()
	 * @model
	 * @generated
	 */
	ConcreteRevision getLastConcreteRevision();

	/**
	 * Sets the value of the '{@link store.Revision#getLastConcreteRevision <em>Last Concrete Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Concrete Revision</em>' reference.
	 * @see #getLastConcreteRevision()
	 * @generated
	 */
	void setLastConcreteRevision(ConcreteRevision value);

	/**
	 * Returns the value of the '<em><b>Checkouts</b></em>' reference list.
	 * The list contents are of type {@link store.Checkout}.
	 * It is bidirectional and its opposite is '{@link store.Checkout#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkouts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkouts</em>' reference list.
	 * @see store.StorePackage#getRevision_Checkouts()
	 * @see store.Checkout#getRevision
	 * @model opposite="revision"
	 * @generated
	 */
	EList<Checkout> getCheckouts();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.Project#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see store.StorePackage#getRevision_Project()
	 * @see store.Project#getRevisions
	 * @model opposite="revisions"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link store.Revision#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see store.StorePackage#getRevision_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link store.Revision#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

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
	 * @see store.StorePackage#getRevision_LastError()
	 * @model
	 * @generated
	 */
	String getLastError();

	/**
	 * Sets the value of the '{@link store.Revision#getLastError <em>Last Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Error</em>' attribute.
	 * @see #getLastError()
	 * @generated
	 */
	void setLastError(String value);

	/**
	 * Returns the value of the '<em><b>Bmi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bmi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bmi</em>' attribute.
	 * @see #setBmi(Integer)
	 * @see store.StorePackage#getRevision_Bmi()
	 * @model
	 * @generated
	 */
	Integer getBmi();

	/**
	 * Sets the value of the '{@link store.Revision#getBmi <em>Bmi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bmi</em>' attribute.
	 * @see #getBmi()
	 * @generated
	 */
	void setBmi(Integer value);

	/**
	 * Returns the value of the '<em><b>Laid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Laid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laid</em>' attribute.
	 * @see #setLaid(Long)
	 * @see store.StorePackage#getRevision_Laid()
	 * @model
	 * @generated
	 */
	Long getLaid();

	/**
	 * Sets the value of the '{@link store.Revision#getLaid <em>Laid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laid</em>' attribute.
	 * @see #getLaid()
	 * @generated
	 */
	void setLaid(Long value);

	/**
	 * Returns the value of the '<em><b>Extended Data</b></em>' reference list.
	 * The list contents are of type {@link store.ExtendedData}.
	 * It is bidirectional and its opposite is '{@link store.ExtendedData#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Data</em>' reference list.
	 * @see store.StorePackage#getRevision_ExtendedData()
	 * @see store.ExtendedData#getRevision
	 * @model opposite="revision"
	 * @generated
	 */
	EList<ExtendedData> getExtendedData();

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' reference list.
	 * The list contents are of type {@link log.LogAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' reference list.
	 * @see store.StorePackage#getRevision_Logs()
	 * @model
	 * @generated
	 */
	EList<LogAction> getLogs();

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' reference.
	 * @see #setGeometry(Geometry)
	 * @see store.StorePackage#getRevision_Geometry()
	 * @model
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link store.Revision#getGeometry <em>Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

} // Revision
