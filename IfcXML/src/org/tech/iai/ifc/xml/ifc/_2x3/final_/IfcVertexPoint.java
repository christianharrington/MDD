/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vertex Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexPoint#getVertexGeometry <em>Vertex Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVertexPoint()
 * @model extendedMetaData="name='IfcVertexPoint' kind='elementOnly'"
 * @generated
 */
public interface IfcVertexPoint extends IfcVertex {
	/**
	 * Returns the value of the '<em><b>Vertex Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex Geometry</em>' containment reference.
	 * @see #setVertexGeometry(VertexGeometryType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVertexPoint_VertexGeometry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VertexGeometry' namespace='##targetNamespace'"
	 * @generated
	 */
	VertexGeometryType getVertexGeometry();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexPoint#getVertexGeometry <em>Vertex Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertex Geometry</em>' containment reference.
	 * @see #getVertexGeometry()
	 * @generated
	 */
	void setVertexGeometry(VertexGeometryType value);

} // IfcVertexPoint
