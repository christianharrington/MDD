/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Planar Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStructuralPlanarAction#getProjectedOrTrue <em>Projected Or True</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralPlanarAction()
 * @model
 * @generated
 */
public interface IfcStructuralPlanarAction extends IfcStructuralAction {
	/**
	 * Returns the value of the '<em><b>Projected Or True</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcProjectedOrTrueLengthEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projected Or True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projected Or True</em>' attribute.
	 * @see ifc2x3tc1.IfcProjectedOrTrueLengthEnum
	 * @see #setProjectedOrTrue(IfcProjectedOrTrueLengthEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralPlanarAction_ProjectedOrTrue()
	 * @model
	 * @generated
	 */
	IfcProjectedOrTrueLengthEnum getProjectedOrTrue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralPlanarAction#getProjectedOrTrue <em>Projected Or True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projected Or True</em>' attribute.
	 * @see ifc2x3tc1.IfcProjectedOrTrueLengthEnum
	 * @see #getProjectedOrTrue()
	 * @generated
	 */
	void setProjectedOrTrue(IfcProjectedOrTrueLengthEnum value);

} // IfcStructuralPlanarAction
