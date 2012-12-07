/**
 */
package Pipes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GUID Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Pipes.GUIDElement#getGUID <em>GUID</em>}</li>
 *   <li>{@link Pipes.GUIDElement#getName <em>Name</em>}</li>
 *   <li>{@link Pipes.GUIDElement#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see Pipes.PipesPackage#getGUIDElement()
 * @model
 * @generated
 */
public interface GUIDElement extends EObject {
	/**
	 * Returns the value of the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GUID</em>' attribute.
	 * @see #setGUID(String)
	 * @see Pipes.PipesPackage#getGUIDElement_GUID()
	 * @model
	 * @generated
	 */
	String getGUID();

	/**
	 * Sets the value of the '{@link Pipes.GUIDElement#getGUID <em>GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' attribute.
	 * @see #getGUID()
	 * @generated
	 */
	void setGUID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Pipes.PipesPackage#getGUIDElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Pipes.GUIDElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Pipes.PipesPackage#getGUIDElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Pipes.GUIDElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // GUIDElement
