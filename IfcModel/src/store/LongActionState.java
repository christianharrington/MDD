/**
 */
package store;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Action State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.LongActionState#getProgress <em>Progress</em>}</li>
 *   <li>{@link store.LongActionState#getState <em>State</em>}</li>
 *   <li>{@link store.LongActionState#getErrors <em>Errors</em>}</li>
 *   <li>{@link store.LongActionState#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link store.LongActionState#getInfos <em>Infos</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getLongActionState()
 * @model
 * @generated
 */
public interface LongActionState extends EObject {
	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(Integer)
	 * @see store.StorePackage#getLongActionState_Progress()
	 * @model
	 * @generated
	 */
	Integer getProgress();

	/**
	 * Sets the value of the '{@link store.LongActionState#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(Integer value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link store.ActionState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see store.ActionState
	 * @see #setState(ActionState)
	 * @see store.StorePackage#getLongActionState_State()
	 * @model
	 * @generated
	 */
	ActionState getState();

	/**
	 * Sets the value of the '{@link store.LongActionState#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see store.ActionState
	 * @see #getState()
	 * @generated
	 */
	void setState(ActionState value);

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
	 * @see store.StorePackage#getLongActionState_Errors()
	 * @model
	 * @generated
	 */
	EList<String> getErrors();

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
	 * @see store.StorePackage#getLongActionState_Warnings()
	 * @model
	 * @generated
	 */
	EList<String> getWarnings();

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
	 * @see store.StorePackage#getLongActionState_Infos()
	 * @model
	 * @generated
	 */
	EList<String> getInfos();

} // LongActionState
