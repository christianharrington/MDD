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
	 * @see #setCartesianX(double)
	 * @see pipes.PipesPackage#getAxis2Placement3D_CartesianX()
	 * @model required="true"
	 * @generated
	 */
	double getCartesianX();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getCartesianX <em>Cartesian X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian X</em>' attribute.
	 * @see #getCartesianX()
	 * @generated
	 */
	void setCartesianX(double value);

	/**
	 * Returns the value of the '<em><b>Cartesian Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartesian Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartesian Y</em>' attribute.
	 * @see #setCartesianY(double)
	 * @see pipes.PipesPackage#getAxis2Placement3D_CartesianY()
	 * @model required="true"
	 * @generated
	 */
	double getCartesianY();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getCartesianY <em>Cartesian Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian Y</em>' attribute.
	 * @see #getCartesianY()
	 * @generated
	 */
	void setCartesianY(double value);

	/**
	 * Returns the value of the '<em><b>Cartesian Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cartesian Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cartesian Z</em>' attribute.
	 * @see #setCartesianZ(double)
	 * @see pipes.PipesPackage#getAxis2Placement3D_CartesianZ()
	 * @model required="true"
	 * @generated
	 */
	double getCartesianZ();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getCartesianZ <em>Cartesian Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cartesian Z</em>' attribute.
	 * @see #getCartesianZ()
	 * @generated
	 */
	void setCartesianZ(double value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(Direction)
	 * @see pipes.PipesPackage#getAxis2Placement3D_Axis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Direction getAxis();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Direction value);

	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' containment reference.
	 * @see #setRefDirection(Direction)
	 * @see pipes.PipesPackage#getAxis2Placement3D_RefDirection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Direction getRefDirection();

	/**
	 * Sets the value of the '{@link pipes.Axis2Placement3D#getRefDirection <em>Ref Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Direction</em>' containment reference.
	 * @see #getRefDirection()
	 * @generated
	 */
	void setRefDirection(Direction value);

} // Axis2Placement3D
