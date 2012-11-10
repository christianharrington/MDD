/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsStructuralActivity()
 * @model
 * @generated
 */
public interface IfcRelConnectsStructuralActivity extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' reference.
	 * @see #setRelatingElement(IfcStructuralActivityAssignmentSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsStructuralActivity_RelatingElement()
	 * @model
	 * @generated
	 */
	IfcStructuralActivityAssignmentSelect getRelatingElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatingElement <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(IfcStructuralActivityAssignmentSelect value);

	/**
	 * Returns the value of the '<em><b>Related Structural Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcStructuralActivity#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Activity</em>' reference.
	 * @see #setRelatedStructuralActivity(IfcStructuralActivity)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsStructuralActivity_RelatedStructuralActivity()
	 * @see ifc2x3tc1.IfcStructuralActivity#getAssignedToStructuralItem
	 * @model opposite="AssignedToStructuralItem"
	 * @generated
	 */
	IfcStructuralActivity getRelatedStructuralActivity();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Activity</em>' reference.
	 * @see #getRelatedStructuralActivity()
	 * @generated
	 */
	void setRelatedStructuralActivity(IfcStructuralActivity value);

} // IfcRelConnectsStructuralActivity
