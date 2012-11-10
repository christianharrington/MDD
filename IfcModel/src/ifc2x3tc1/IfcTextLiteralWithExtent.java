/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Literal With Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTextLiteralWithExtent#getExtent <em>Extent</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTextLiteralWithExtent#getBoxAlignment <em>Box Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextLiteralWithExtent()
 * @model
 * @generated
 */
public interface IfcTextLiteralWithExtent extends IfcTextLiteral {
	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(IfcPlanarExtent)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextLiteralWithExtent_Extent()
	 * @model
	 * @generated
	 */
	IfcPlanarExtent getExtent();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTextLiteralWithExtent#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(IfcPlanarExtent value);

	/**
	 * Returns the value of the '<em><b>Box Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Alignment</em>' attribute.
	 * @see #setBoxAlignment(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextLiteralWithExtent_BoxAlignment()
	 * @model
	 * @generated
	 */
	String getBoxAlignment();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTextLiteralWithExtent#getBoxAlignment <em>Box Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Alignment</em>' attribute.
	 * @see #getBoxAlignment()
	 * @generated
	 */
	void setBoxAlignment(String value);

} // IfcTextLiteralWithExtent
