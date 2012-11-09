/**
 */
package store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.ArrayDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getArrayDefinition()
 * @model
 * @generated
 */
public interface ArrayDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDefinition)
	 * @see store.StorePackage#getArrayDefinition_Type()
	 * @model
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link store.ArrayDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

} // ArrayDefinition
