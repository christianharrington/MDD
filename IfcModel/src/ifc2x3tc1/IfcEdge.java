/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcEdge#getEdgeStart <em>Edge Start</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcEdge#getEdgeEnd <em>Edge End</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdge()
 * @model
 * @generated
 */
public interface IfcEdge extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Edge Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Start</em>' reference.
	 * @see #setEdgeStart(IfcVertex)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdge_EdgeStart()
	 * @model
	 * @generated
	 */
	IfcVertex getEdgeStart();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEdge#getEdgeStart <em>Edge Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Start</em>' reference.
	 * @see #getEdgeStart()
	 * @generated
	 */
	void setEdgeStart(IfcVertex value);

	/**
	 * Returns the value of the '<em><b>Edge End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge End</em>' reference.
	 * @see #setEdgeEnd(IfcVertex)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdge_EdgeEnd()
	 * @model
	 * @generated
	 */
	IfcVertex getEdgeEnd();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEdge#getEdgeEnd <em>Edge End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge End</em>' reference.
	 * @see #getEdgeEnd()
	 * @generated
	 */
	void setEdgeEnd(IfcVertex value);

} // IfcEdge
