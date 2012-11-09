/**
 */
package store;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.Bounds#getMin <em>Min</em>}</li>
 *   <li>{@link store.Bounds#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getBounds()
 * @model
 * @generated
 */
public interface Bounds extends EObject {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(Vector3f)
	 * @see store.StorePackage#getBounds_Min()
	 * @model
	 * @generated
	 */
	Vector3f getMin();

	/**
	 * Sets the value of the '{@link store.Bounds#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Vector3f value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(Vector3f)
	 * @see store.StorePackage#getBounds_Max()
	 * @model
	 * @generated
	 */
	Vector3f getMax();

	/**
	 * Sets the value of the '{@link store.Bounds#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Vector3f value);

} // Bounds
