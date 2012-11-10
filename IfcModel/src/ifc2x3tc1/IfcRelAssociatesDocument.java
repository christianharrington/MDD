/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssociatesDocument#getRelatingDocument <em>Relating Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesDocument()
 * @model
 * @generated
 */
public interface IfcRelAssociatesDocument extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Document</em>' reference.
	 * @see #setRelatingDocument(IfcDocumentSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesDocument_RelatingDocument()
	 * @model
	 * @generated
	 */
	IfcDocumentSelect getRelatingDocument();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssociatesDocument#getRelatingDocument <em>Relating Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Document</em>' reference.
	 * @see #getRelatingDocument()
	 * @generated
	 */
	void setRelatingDocument(IfcDocumentSelect value);

} // IfcRelAssociatesDocument
