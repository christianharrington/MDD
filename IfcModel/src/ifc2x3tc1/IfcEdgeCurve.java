/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Edge Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcEdgeCurve#getEdgeGeometry <em>Edge Geometry</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcEdgeCurve#getSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdgeCurve()
 * @model
 * @generated
 */
public interface IfcEdgeCurve extends IfcEdge, IfcCurveOrEdgeCurve {
	/**
	 * Returns the value of the '<em><b>Edge Geometry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Geometry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Geometry</em>' reference.
	 * @see #setEdgeGeometry(IfcCurve)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdgeCurve_EdgeGeometry()
	 * @model
	 * @generated
	 */
	IfcCurve getEdgeGeometry();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEdgeCurve#getEdgeGeometry <em>Edge Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Geometry</em>' reference.
	 * @see #getEdgeGeometry()
	 * @generated
	 */
	void setEdgeGeometry(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setSameSense(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdgeCurve_SameSense()
	 * @model
	 * @generated
	 */
	Tristate getSameSense();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEdgeCurve#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getSameSense()
	 * @generated
	 */
	void setSameSense(Tristate value);

} // IfcEdgeCurve
