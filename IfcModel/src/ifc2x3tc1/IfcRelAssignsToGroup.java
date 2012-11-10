/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssignsToGroup#getRelatingGroup <em>Relating Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToGroup()
 * @model
 * @generated
 */
public interface IfcRelAssignsToGroup extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcGroup#getIsGroupedBy <em>Is Grouped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Group</em>' reference.
	 * @see #setRelatingGroup(IfcGroup)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToGroup_RelatingGroup()
	 * @see ifc2x3tc1.IfcGroup#getIsGroupedBy
	 * @model opposite="IsGroupedBy"
	 * @generated
	 */
	IfcGroup getRelatingGroup();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssignsToGroup#getRelatingGroup <em>Relating Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Group</em>' reference.
	 * @see #getRelatingGroup()
	 * @generated
	 */
	void setRelatingGroup(IfcGroup value);

} // IfcRelAssignsToGroup
