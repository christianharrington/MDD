/**
 */
package pipes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pipes.Direction#getX <em>X</em>}</li>
 *   <li>{@link pipes.Direction#getY <em>Y</em>}</li>
 *   <li>{@link pipes.Direction#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see pipes.PipesPackage#getDirection()
 * @model
 * @generated
 */
public interface Direction extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see pipes.PipesPackage#getDirection_X()
	 * @model required="true"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link pipes.Direction#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see pipes.PipesPackage#getDirection_Y()
	 * @model required="true"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link pipes.Direction#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(float)
	 * @see pipes.PipesPackage#getDirection_Z()
	 * @model
	 * @generated
	 */
	float getZ();

	/**
	 * Sets the value of the '{@link pipes.Direction#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(float value);

} // Direction
