/**
 */
package pipes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipes.Product#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipes.PipesPackage#getProduct()
 * @model abstract="true"
 * @generated
 */
public interface Product extends EObject {

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' reference.
	 * @see #setPlacement(LocalPlacement)
	 * @see pipes.PipesPackage#getProduct_Placement()
	 * @model required="true"
	 * @generated
	 */
	LocalPlacement getPlacement();

	/**
	 * Sets the value of the '{@link pipes.Product#getPlacement <em>Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(LocalPlacement value);
} // Product
