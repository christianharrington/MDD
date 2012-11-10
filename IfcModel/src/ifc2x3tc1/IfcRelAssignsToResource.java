/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToResource()
 * @model
 * @generated
 */
public interface IfcRelAssignsToResource extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcResource#getResourceOf <em>Resource Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Resource</em>' reference.
	 * @see #setRelatingResource(IfcResource)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToResource_RelatingResource()
	 * @see ifc2x3tc1.IfcResource#getResourceOf
	 * @model opposite="ResourceOf"
	 * @generated
	 */
	IfcResource getRelatingResource();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Resource</em>' reference.
	 * @see #getRelatingResource()
	 * @generated
	 */
	void setRelatingResource(IfcResource value);

} // IfcRelAssignsToResource
