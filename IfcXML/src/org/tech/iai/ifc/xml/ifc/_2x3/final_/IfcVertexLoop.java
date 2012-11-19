/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vertex Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexLoop#getLoopVertex <em>Loop Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVertexLoop()
 * @model extendedMetaData="name='IfcVertexLoop' kind='elementOnly'"
 * @generated
 */
public interface IfcVertexLoop extends IfcLoop {
	/**
	 * Returns the value of the '<em><b>Loop Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Vertex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Vertex</em>' containment reference.
	 * @see #setLoopVertex(LoopVertexType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVertexLoop_LoopVertex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LoopVertex' namespace='##targetNamespace'"
	 * @generated
	 */
	LoopVertexType getLoopVertex();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexLoop#getLoopVertex <em>Loop Vertex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Vertex</em>' containment reference.
	 * @see #getLoopVertex()
	 * @generated
	 */
	void setLoopVertex(LoopVertexType value);

} // IfcVertexLoop
