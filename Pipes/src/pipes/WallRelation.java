/**
 */
package Pipes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Pipes.WallRelation#getWall <em>Wall</em>}</li>
 *   <li>{@link Pipes.WallRelation#getOpening <em>Opening</em>}</li>
 * </ul>
 * </p>
 *
 * @see Pipes.PipesPackage#getWallRelation()
 * @model
 * @generated
 */
public interface WallRelation extends GUIDElement {
	/**
	 * Returns the value of the '<em><b>Wall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wall</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall</em>' containment reference.
	 * @see #setWall(Wall)
	 * @see Pipes.PipesPackage#getWallRelation_Wall()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Wall getWall();

	/**
	 * Sets the value of the '{@link Pipes.WallRelation#getWall <em>Wall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall</em>' containment reference.
	 * @see #getWall()
	 * @generated
	 */
	void setWall(Wall value);

	/**
	 * Returns the value of the '<em><b>Opening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening</em>' containment reference.
	 * @see #setOpening(Opening)
	 * @see Pipes.PipesPackage#getWallRelation_Opening()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Opening getOpening();

	/**
	 * Sets the value of the '{@link Pipes.WallRelation#getOpening <em>Opening</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening</em>' containment reference.
	 * @see #getOpening()
	 * @generated
	 */
	void setOpening(Opening value);

} // WallRelation
