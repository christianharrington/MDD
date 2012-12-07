/**
 */
package Pipes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Pipes.Wall#getOpenings <em>Openings</em>}</li>
 * </ul>
 * </p>
 *
 * @see Pipes.PipesPackage#getWall()
 * @model
 * @generated
 */
public interface Wall extends GUIDElement, Product {
	/**
	 * Returns the value of the '<em><b>Openings</b></em>' containment reference list.
	 * The list contents are of type {@link Pipes.WallRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Openings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openings</em>' containment reference list.
	 * @see Pipes.PipesPackage#getWall_Openings()
	 * @model containment="true"
	 * @generated
	 */
	EList<WallRelation> getOpenings();

} // Wall
