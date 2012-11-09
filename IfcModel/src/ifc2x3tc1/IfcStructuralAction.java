/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralAction#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralAction()
 * @model
 * @generated
 */
public interface IfcStructuralAction extends IfcStructuralActivity {
	/**
	 * Returns the value of the '<em><b>Destabilizing Load</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destabilizing Load</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destabilizing Load</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setDestabilizingLoad(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralAction_DestabilizingLoad()
	 * @model
	 * @generated
	 */
	Tristate getDestabilizingLoad();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralAction#getDestabilizingLoad <em>Destabilizing Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destabilizing Load</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getDestabilizingLoad()
	 * @generated
	 */
	void setDestabilizingLoad(Tristate value);

	/**
	 * Returns the value of the '<em><b>Caused By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcStructuralReaction#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caused By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By</em>' reference.
	 * @see #isSetCausedBy()
	 * @see #unsetCausedBy()
	 * @see #setCausedBy(IfcStructuralReaction)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralAction_CausedBy()
	 * @see ifc2x3tc1.IfcStructuralReaction#getCauses
	 * @model opposite="Causes" unsettable="true"
	 * @generated
	 */
	IfcStructuralReaction getCausedBy();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralAction#getCausedBy <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By</em>' reference.
	 * @see #isSetCausedBy()
	 * @see #unsetCausedBy()
	 * @see #getCausedBy()
	 * @generated
	 */
	void setCausedBy(IfcStructuralReaction value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralAction#getCausedBy <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCausedBy()
	 * @see #getCausedBy()
	 * @see #setCausedBy(IfcStructuralReaction)
	 * @generated
	 */
	void unsetCausedBy();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralAction#getCausedBy <em>Caused By</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caused By</em>' reference is set.
	 * @see #unsetCausedBy()
	 * @see #getCausedBy()
	 * @see #setCausedBy(IfcStructuralReaction)
	 * @generated
	 */
	boolean isSetCausedBy();

} // IfcStructuralAction
