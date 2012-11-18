/**
 */
package pipes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipes.WallRelation#getWall <em>Wall</em>}</li>
 *   <li>{@link pipes.WallRelation#getOpening <em>Opening</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipes.PipesPackage#getWallRelation()
 * @model
 * @generated
 */
public interface WallRelation extends GUIDElement {
	/**
	 * Returns the value of the '<em><b>Wall</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wall</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall</em>' reference.
	 * @see #setWall(Wall)
	 * @see pipes.PipesPackage#getWallRelation_Wall()
	 * @model required="true"
	 * @generated
	 */
	Wall getWall();

	/**
	 * Sets the value of the '{@link pipes.WallRelation#getWall <em>Wall</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall</em>' reference.
	 * @see #getWall()
	 * @generated
	 */
	void setWall(Wall value);

	/**
	 * Returns the value of the '<em><b>Opening</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening</em>' reference.
	 * @see #setOpening(Opening)
	 * @see pipes.PipesPackage#getWallRelation_Opening()
	 * @model required="true"
	 * @generated
	 */
	Opening getOpening();

	/**
	 * Sets the value of the '{@link pipes.WallRelation#getOpening <em>Opening</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening</em>' reference.
	 * @see #getOpening()
	 * @generated
	 */
	void setOpening(Opening value);

} // WallRelation
