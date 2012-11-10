/**
 */
package store;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immediate Notification Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.ImmediateNotificationResult#getResult <em>Result</em>}</li>
 *   <li>{@link store.ImmediateNotificationResult#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getImmediateNotificationResult()
 * @model
 * @generated
 */
public interface ImmediateNotificationResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link store.NotifictionResultEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see store.NotifictionResultEnum
	 * @see #setResult(NotifictionResultEnum)
	 * @see store.StorePackage#getImmediateNotificationResult_Result()
	 * @model
	 * @generated
	 */
	NotifictionResultEnum getResult();

	/**
	 * Sets the value of the '{@link store.ImmediateNotificationResult#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see store.NotifictionResultEnum
	 * @see #getResult()
	 * @generated
	 */
	void setResult(NotifictionResultEnum value);

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
	 * @see store.StorePackage#getImmediateNotificationResult_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link store.ImmediateNotificationResult#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ImmediateNotificationResult
