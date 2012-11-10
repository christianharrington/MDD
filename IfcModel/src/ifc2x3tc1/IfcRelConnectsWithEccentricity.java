/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects With Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelConnectsWithEccentricity#getConnectionConstraint <em>Connection Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsWithEccentricity()
 * @model
 * @generated
 */
public interface IfcRelConnectsWithEccentricity extends IfcRelConnectsStructuralMember {
	/**
	 * Returns the value of the '<em><b>Connection Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Constraint</em>' reference.
	 * @see #setConnectionConstraint(IfcConnectionGeometry)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsWithEccentricity_ConnectionConstraint()
	 * @model
	 * @generated
	 */
	IfcConnectionGeometry getConnectionConstraint();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelConnectsWithEccentricity#getConnectionConstraint <em>Connection Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Constraint</em>' reference.
	 * @see #getConnectionConstraint()
	 * @generated
	 */
	void setConnectionConstraint(IfcConnectionGeometry value);

} // IfcRelConnectsWithEccentricity
