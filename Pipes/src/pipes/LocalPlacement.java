/**
 */
package pipes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipes.LocalPlacement#getAxis2placement3d <em>Axis2placement3d</em>}</li>
 *   <li>{@link pipes.LocalPlacement#getRelativeTo <em>Relative To</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipes.PipesPackage#getLocalPlacement()
 * @model
 * @generated
 */
public interface LocalPlacement extends GUIDElement {
	/**
	 * Returns the value of the '<em><b>Axis2placement3d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis2placement3d</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis2placement3d</em>' reference.
	 * @see #setAxis2placement3d(Axis2Placement3D)
	 * @see pipes.PipesPackage#getLocalPlacement_Axis2placement3d()
	 * @model
	 * @generated
	 */
	Axis2Placement3D getAxis2placement3d();

	/**
	 * Sets the value of the '{@link pipes.LocalPlacement#getAxis2placement3d <em>Axis2placement3d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis2placement3d</em>' reference.
	 * @see #getAxis2placement3d()
	 * @generated
	 */
	void setAxis2placement3d(Axis2Placement3D value);

	/**
	 * Returns the value of the '<em><b>Relative To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative To</em>' reference.
	 * @see #setRelativeTo(LocalPlacement)
	 * @see pipes.PipesPackage#getLocalPlacement_RelativeTo()
	 * @model
	 * @generated
	 */
	LocalPlacement getRelativeTo();

	/**
	 * Sets the value of the '{@link pipes.LocalPlacement#getRelativeTo <em>Relative To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative To</em>' reference.
	 * @see #getRelativeTo()
	 * @generated
	 */
	void setRelativeTo(LocalPlacement value);

} // LocalPlacement
