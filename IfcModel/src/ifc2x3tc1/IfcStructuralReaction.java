/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStructuralReaction#getCauses <em>Causes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralReaction()
 * @model
 * @generated
 */
public interface IfcStructuralReaction extends IfcStructuralActivity {
	/**
	 * Returns the value of the '<em><b>Causes</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcStructuralAction}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcStructuralAction#getCausedBy <em>Caused By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' reference list.
	 * @see #isSetCauses()
	 * @see #unsetCauses()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralReaction_Causes()
	 * @see ifc2x3tc1.IfcStructuralAction#getCausedBy
	 * @model opposite="CausedBy" unsettable="true"
	 * @generated
	 */
	EList<IfcStructuralAction> getCauses();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralReaction#getCauses <em>Causes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCauses()
	 * @see #getCauses()
	 * @generated
	 */
	void unsetCauses();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralReaction#getCauses <em>Causes</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Causes</em>' reference list is set.
	 * @see #unsetCauses()
	 * @see #getCauses()
	 * @generated
	 */
	boolean isSetCauses();

} // IfcStructuralReaction
