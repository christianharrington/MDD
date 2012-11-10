/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssignsToProduct#getRelatingProduct <em>Relating Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToProduct()
 * @model
 * @generated
 */
public interface IfcRelAssignsToProduct extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcProduct#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Product</em>' reference.
	 * @see #setRelatingProduct(IfcProduct)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToProduct_RelatingProduct()
	 * @see ifc2x3tc1.IfcProduct#getReferencedBy
	 * @model opposite="ReferencedBy"
	 * @generated
	 */
	IfcProduct getRelatingProduct();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssignsToProduct#getRelatingProduct <em>Relating Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Product</em>' reference.
	 * @see #getRelatingProduct()
	 * @generated
	 */
	void setRelatingProduct(IfcProduct value);

} // IfcRelAssignsToProduct
