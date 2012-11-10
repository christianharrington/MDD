/**
 */
package store;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.PrimitiveDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getPrimitiveDefinition()
 * @model
 * @generated
 */
public interface PrimitiveDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link store.PrimitiveEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see store.PrimitiveEnum
	 * @see #setType(PrimitiveEnum)
	 * @see store.StorePackage#getPrimitiveDefinition_Type()
	 * @model
	 * @generated
	 */
	PrimitiveEnum getType();

	/**
	 * Sets the value of the '{@link store.PrimitiveDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see store.PrimitiveEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveEnum value);

} // PrimitiveDefinition
