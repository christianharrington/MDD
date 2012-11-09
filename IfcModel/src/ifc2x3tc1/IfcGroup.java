/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcGroup#getIsGroupedBy <em>Is Grouped By</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGroup()
 * @model
 * @generated
 */
public interface IfcGroup extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Is Grouped By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelAssignsToGroup#getRelatingGroup <em>Relating Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Grouped By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Grouped By</em>' reference.
	 * @see #isSetIsGroupedBy()
	 * @see #unsetIsGroupedBy()
	 * @see #setIsGroupedBy(IfcRelAssignsToGroup)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGroup_IsGroupedBy()
	 * @see ifc2x3tc1.IfcRelAssignsToGroup#getRelatingGroup
	 * @model opposite="RelatingGroup" unsettable="true"
	 * @generated
	 */
	IfcRelAssignsToGroup getIsGroupedBy();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGroup#getIsGroupedBy <em>Is Grouped By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Grouped By</em>' reference.
	 * @see #isSetIsGroupedBy()
	 * @see #unsetIsGroupedBy()
	 * @see #getIsGroupedBy()
	 * @generated
	 */
	void setIsGroupedBy(IfcRelAssignsToGroup value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGroup#getIsGroupedBy <em>Is Grouped By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsGroupedBy()
	 * @see #getIsGroupedBy()
	 * @see #setIsGroupedBy(IfcRelAssignsToGroup)
	 * @generated
	 */
	void unsetIsGroupedBy();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGroup#getIsGroupedBy <em>Is Grouped By</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Grouped By</em>' reference is set.
	 * @see #unsetIsGroupedBy()
	 * @see #getIsGroupedBy()
	 * @see #setIsGroupedBy(IfcRelAssignsToGroup)
	 * @generated
	 */
	boolean isSetIsGroupedBy();

} // IfcGroup
