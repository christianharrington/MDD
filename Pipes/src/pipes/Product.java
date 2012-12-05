/**
 */
package Pipes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Pipes.Product#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see Pipes.PipesPackage#getProduct()
 * @model abstract="true"
 * @generated
 */
public interface Product extends GUIDElement {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' containment reference.
	 * @see #setPlacement(LocalPlacement)
	 * @see Pipes.PipesPackage#getProduct_Placement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LocalPlacement getPlacement();

	/**
	 * Sets the value of the '{@link Pipes.Product#getPlacement <em>Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' containment reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(LocalPlacement value);

} // Product
