/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssociatesLibrary#getRelatingLibrary <em>Relating Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesLibrary()
 * @model
 * @generated
 */
public interface IfcRelAssociatesLibrary extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Library</em>' reference.
	 * @see #setRelatingLibrary(IfcLibrarySelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesLibrary_RelatingLibrary()
	 * @model
	 * @generated
	 */
	IfcLibrarySelect getRelatingLibrary();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssociatesLibrary#getRelatingLibrary <em>Relating Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Library</em>' reference.
	 * @see #getRelatingLibrary()
	 * @generated
	 */
	void setRelatingLibrary(IfcLibrarySelect value);

} // IfcRelAssociatesLibrary
