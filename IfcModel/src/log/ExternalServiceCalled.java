/**
 */
package log;

import org.eclipse.emf.common.util.EList;

import store.NotifictionResultEnum;
import store.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Service Called</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link log.ExternalServiceCalled#getService <em>Service</em>}</li>
 *   <li>{@link log.ExternalServiceCalled#getState <em>State</em>}</li>
 *   <li>{@link log.ExternalServiceCalled#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link log.ExternalServiceCalled#getInfos <em>Infos</em>}</li>
 *   <li>{@link log.ExternalServiceCalled#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link log.ExternalServiceCalled#getErrors <em>Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @see log.LogPackage#getExternalServiceCalled()
 * @model
 * @generated
 */
public interface ExternalServiceCalled extends LogAction {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see log.LogPackage#getExternalServiceCalled_Service()
	 * @model
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link log.ExternalServiceCalled#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link store.NotifictionResultEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see store.NotifictionResultEnum
	 * @see #setState(NotifictionResultEnum)
	 * @see log.LogPackage#getExternalServiceCalled_State()
	 * @model
	 * @generated
	 */
	NotifictionResultEnum getState();

	/**
	 * Sets the value of the '{@link log.ExternalServiceCalled#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see store.NotifictionResultEnum
	 * @see #getState()
	 * @generated
	 */
	void setState(NotifictionResultEnum value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(int)
	 * @see log.LogPackage#getExternalServiceCalled_Percentage()
	 * @model
	 * @generated
	 */
	int getPercentage();

	/**
	 * Sets the value of the '{@link log.ExternalServiceCalled#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(int value);

	/**
	 * Returns the value of the '<em><b>Infos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infos</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infos</em>' attribute list.
	 * @see log.LogPackage#getExternalServiceCalled_Infos()
	 * @model
	 * @generated
	 */
	EList<String> getInfos();

	/**
	 * Returns the value of the '<em><b>Warnings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warnings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warnings</em>' attribute list.
	 * @see log.LogPackage#getExternalServiceCalled_Warnings()
	 * @model
	 * @generated
	 */
	EList<String> getWarnings();

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' attribute list.
	 * @see log.LogPackage#getExternalServiceCalled_Errors()
	 * @model
	 * @generated
	 */
	EList<String> getErrors();

} // ExternalServiceCalled
