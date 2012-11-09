/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStructuralMember#getReferencesElement <em>References Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralMember#getConnectedBy <em>Connected By</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralMember()
 * @model
 * @generated
 */
public interface IfcStructuralMember extends IfcStructuralItem {
	/**
	 * Returns the value of the '<em><b>References Element</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelConnectsStructuralElement}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelConnectsStructuralElement#getRelatedStructuralMember <em>Related Structural Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References Element</em>' reference list.
	 * @see #isSetReferencesElement()
	 * @see #unsetReferencesElement()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralMember_ReferencesElement()
	 * @see ifc2x3tc1.IfcRelConnectsStructuralElement#getRelatedStructuralMember
	 * @model opposite="RelatedStructuralMember" unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralElement> getReferencesElement();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralMember#getReferencesElement <em>References Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencesElement()
	 * @see #getReferencesElement()
	 * @generated
	 */
	void unsetReferencesElement();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralMember#getReferencesElement <em>References Element</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>References Element</em>' reference list is set.
	 * @see #unsetReferencesElement()
	 * @see #getReferencesElement()
	 * @generated
	 */
	boolean isSetReferencesElement();

	/**
	 * Returns the value of the '<em><b>Connected By</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelConnectsStructuralMember}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelConnectsStructuralMember#getRelatingStructuralMember <em>Relating Structural Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected By</em>' reference list.
	 * @see #isSetConnectedBy()
	 * @see #unsetConnectedBy()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralMember_ConnectedBy()
	 * @see ifc2x3tc1.IfcRelConnectsStructuralMember#getRelatingStructuralMember
	 * @model opposite="RelatingStructuralMember" unsettable="true"
	 * @generated
	 */
	EList<IfcRelConnectsStructuralMember> getConnectedBy();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralMember#getConnectedBy <em>Connected By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConnectedBy()
	 * @see #getConnectedBy()
	 * @generated
	 */
	void unsetConnectedBy();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralMember#getConnectedBy <em>Connected By</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Connected By</em>' reference list is set.
	 * @see #unsetConnectedBy()
	 * @see #getConnectedBy()
	 * @generated
	 */
	boolean isSetConnectedBy();

} // IfcStructuralMember
