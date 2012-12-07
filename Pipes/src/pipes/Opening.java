/**
 */
package pipes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opening</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipes.Opening#getWalls <em>Walls</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipes.PipesPackage#getOpening()
 * @model
 * @generated
 */
public interface Opening extends GUIDElement, Product {
	/**
	 * Returns the value of the '<em><b>Walls</b></em>' containment reference list.
	 * The list contents are of type {@link pipes.WallRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Walls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Walls</em>' containment reference list.
	 * @see pipes.PipesPackage#getOpening_Walls()
	 * @model containment="true"
	 * @generated
	 */
	EList<WallRelation> getWalls();

} // Opening
