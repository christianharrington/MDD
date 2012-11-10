/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Oriented Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcOrientedEdge#getEdgeElement <em>Edge Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOrientedEdge#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrientedEdge()
 * @model
 * @generated
 */
public interface IfcOrientedEdge extends IfcEdge {
	/**
	 * Returns the value of the '<em><b>Edge Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Element</em>' reference.
	 * @see #setEdgeElement(IfcEdge)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrientedEdge_EdgeElement()
	 * @model
	 * @generated
	 */
	IfcEdge getEdgeElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOrientedEdge#getEdgeElement <em>Edge Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Element</em>' reference.
	 * @see #getEdgeElement()
	 * @generated
	 */
	void setEdgeElement(IfcEdge value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setOrientation(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrientedEdge_Orientation()
	 * @model
	 * @generated
	 */
	Tristate getOrientation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOrientedEdge#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Tristate value);

} // IfcOrientedEdge
