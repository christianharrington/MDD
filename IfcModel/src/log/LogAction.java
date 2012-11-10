/**
 */
package log;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import store.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.LogAction#getDate <em>Date</em>}</li>
 *   <li>{@link log.LogAction#getExecutor <em>Executor</em>}</li>
 *   <li>{@link log.LogAction#getAccessMethod <em>Access Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getLogAction()
 * @model
 * @generated
 */
public interface LogAction extends EObject {
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
	 * @see log.LogPackage#getLogAction_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link log.LogAction#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' reference.
	 * @see #setExecutor(User)
	 * @see log.LogPackage#getLogAction_Executor()
	 * @model
	 * @generated
	 */
	User getExecutor();

	/**
	 * Sets the value of the '{@link log.LogAction#getExecutor <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(User value);

	/**
	 * Returns the value of the '<em><b>Access Method</b></em>' attribute.
	 * The literals are from the enumeration {@link log.AccessMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Method</em>' attribute.
	 * @see log.AccessMethod
	 * @see #setAccessMethod(AccessMethod)
	 * @see log.LogPackage#getLogAction_AccessMethod()
	 * @model
	 * @generated
	 */
	AccessMethod getAccessMethod();

	/**
	 * Sets the value of the '{@link log.LogAction#getAccessMethod <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Method</em>' attribute.
	 * @see log.AccessMethod
	 * @see #getAccessMethod()
	 * @generated
	 */
	void setAccessMethod(AccessMethod value);

} // LogAction
