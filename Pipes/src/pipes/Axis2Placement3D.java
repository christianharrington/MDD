/**
 */
package pipes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis2 Placement3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipes.Axis2Placement3D#getCartesianX <em>Cartesian X</em>}</li>
 *   <li>{@link pipes.Axis2Placement3D#getCartesianY <em>Cartesian Y</em>}</li>
 *   <li>{@link pipes.Axis2Placement3D#getCartesianZ <em>Cartesian Z</em>}</li>
 *   <li>{@link pipes.Axis2Placement3D#getAxis <em>Axis</em>}</li>
 *   <li>{@link pipes.Axis2Placement3D#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipes.PipesPackage#getAxis2Placement3D()
 * @model
 * @generated
 */
public interface Axis2Placement3D extends GUIDElement {
	/**
	 * Returns the value of the '<em><b>Cartesian X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartesian X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartesian X</em>' attribute.
	 * @see #setCartesianX(float)
	 * @see pipes.PipesPackage#getAxis2Placement3D_CartesianX()
	 * @model required="true"
	 * @generated
	 */
	float getCartesianX();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getCartesianX <em>Cartesian X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian X</em>' attribute.
	 * @see #getCartesianX()
	 * @generated
	 */
	void setCartesianX(float value);

	/**
	 * Returns the value of the '<em><b>Cartesian Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartesian Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartesian Y</em>' attribute.
	 * @see #setCartesianY(float)
	 * @see pipes.PipesPackage#getAxis2Placement3D_CartesianY()
	 * @model required="true"
	 * @generated
	 */
	float getCartesianY();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getCartesianY <em>Cartesian Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian Y</em>' attribute.
	 * @see #getCartesianY()
	 * @generated
	 */
	void setCartesianY(float value);

	/**
	 * Returns the value of the '<em><b>Cartesian Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartesian Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartesian Z</em>' attribute.
	 * @see #setCartesianZ(float)
	 * @see pipes.PipesPackage#getAxis2Placement3D_CartesianZ()
	 * @model required="true"
	 * @generated
	 */
	float getCartesianZ();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getCartesianZ <em>Cartesian Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian Z</em>' attribute.
	 * @see #getCartesianZ()
	 * @generated
	 */
	void setCartesianZ(float value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' reference.
	 * @see #setAxis(Direction)
	 * @see pipes.PipesPackage#getAxis2Placement3D_Axis()
	 * @model required="true"
	 * @generated
	 */
	Direction getAxis();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getAxis <em>Axis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Direction value);

	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' reference.
	 * @see #setRefDirection(Direction)
	 * @see pipes.PipesPackage#getAxis2Placement3D_RefDirection()
	 * @model required="true"
	 * @generated
	 */
	Direction getRefDirection();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getRefDirection <em>Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Direction</em>' reference.
	 * @see #getRefDirection()
	 * @generated
	 */
	void setRefDirection(Direction value);

} // Axis2Placement3D
