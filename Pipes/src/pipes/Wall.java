/**
 */
package pipes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipes.Wall#getOpenings <em>Openings</em>}</li>
 *   <li>{@link pipes.Wall#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipes.PipesPackage#getWall()
 * @model
 * @generated
 */
public interface Wall extends GUIDElement {
	/**
	 * Returns the value of the '<em><b>Openings</b></em>' reference list.
	 * The list contents are of type {@link pipes.WallRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Openings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Openings</em>' reference list.
	 * @see pipes.PipesPackage#getWall_Openings()
	 * @model
	 * @generated
	 */
	EList<WallRelation> getOpenings();

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
	 * @see pipes.PipesPackage#getWall_Placement()
	 * @model
	 * @generated
	 */
	LocalPlacement getPlacement();

	/**
	 * Sets the value of the '{@link pipes.Wall#getPlacement <em>Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(LocalPlacement value);

} // Wall
