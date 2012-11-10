/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vertex Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcVertexLoop#getLoopVertex <em>Loop Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVertexLoop()
 * @model
 * @generated
 */
public interface IfcVertexLoop extends IfcLoop {
	/**
	 * Returns the value of the '<em><b>Loop Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Vertex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Vertex</em>' reference.
	 * @see #setLoopVertex(IfcVertex)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVertexLoop_LoopVertex()
	 * @model
	 * @generated
	 */
	IfcVertex getLoopVertex();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcVertexLoop#getLoopVertex <em>Loop Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Vertex</em>' reference.
	 * @see #getLoopVertex()
	 * @generated
	 */
	void setLoopVertex(IfcVertex value);

} // IfcVertexLoop
