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
 *   <li>{@link pipes.Opening#getPlacement <em>Placement</em>}</li>
 *   <li>{@link pipes.Opening#getWalls <em>Walls</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipes.PipesPackage#getOpening()
 * @model
 * @generated
 */
public interface Opening extends GUIDElement {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' containment reference.
	 * @see #setPlacement(LocalPlacement)
	 * @see pipes.PipesPackage#getOpening_Placement()
	 * @model containment="true"
	 * @generated
	 */
	LocalPlacement getPlacement();

	/**
	 * Sets the value of the '{@link pipes.Opening#getPlacement <em>Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' containment reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(LocalPlacement value);

	/**
	 * Returns the value of the '<em><b>Walls</b></em>' reference list.
	 * The list contents are of type {@link pipes.WallRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Walls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Walls</em>' reference list.
	 * @see pipes.PipesPackage#getOpening_Walls()
	 * @model
	 * @generated
	 */
	EList<WallRelation> getWalls();

} // Opening
