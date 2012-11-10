/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelConnectsStructuralElement#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelConnectsStructuralElement#getRelatedStructuralMember <em>Related Structural Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsStructuralElement()
 * @model
 * @generated
 */
public interface IfcRelConnectsStructuralElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcElement#getHasStructuralMember <em>Has Structural Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' reference.
	 * @see #setRelatingElement(IfcElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsStructuralElement_RelatingElement()
	 * @see ifc2x3tc1.IfcElement#getHasStructuralMember
	 * @model opposite="HasStructuralMember"
	 * @generated
	 */
	IfcElement getRelatingElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelConnectsStructuralElement#getRelatingElement <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(IfcElement value);

	/**
	 * Returns the value of the '<em><b>Related Structural Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcStructuralMember#getReferencesElement <em>References Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Member</em>' reference.
	 * @see #setRelatedStructuralMember(IfcStructuralMember)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsStructuralElement_RelatedStructuralMember()
	 * @see ifc2x3tc1.IfcStructuralMember#getReferencesElement
	 * @model opposite="ReferencesElement"
	 * @generated
	 */
	IfcStructuralMember getRelatedStructuralMember();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelConnectsStructuralElement#getRelatedStructuralMember <em>Related Structural Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Member</em>' reference.
	 * @see #getRelatedStructuralMember()
	 * @generated
	 */
	void setRelatedStructuralMember(IfcStructuralMember value);

} // IfcRelConnectsStructuralElement
