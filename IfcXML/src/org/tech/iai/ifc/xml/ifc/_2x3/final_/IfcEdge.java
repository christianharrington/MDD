/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdge#getEdgeStart <em>Edge Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdge#getEdgeEnd <em>Edge End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcEdge()
 * @model extendedMetaData="name='IfcEdge' kind='elementOnly'"
 * @generated
 */
public interface IfcEdge extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Edge Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Start</em>' containment reference.
	 * @see #setEdgeStart(EdgeStartType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcEdge_EdgeStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EdgeStart' namespace='##targetNamespace'"
	 * @generated
	 */
	EdgeStartType getEdgeStart();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdge#getEdgeStart <em>Edge Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Start</em>' containment reference.
	 * @see #getEdgeStart()
	 * @generated
	 */
	void setEdgeStart(EdgeStartType value);

	/**
	 * Returns the value of the '<em><b>Edge End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge End</em>' containment reference.
	 * @see #setEdgeEnd(EdgeEndType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcEdge_EdgeEnd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EdgeEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	EdgeEndType getEdgeEnd();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdge#getEdgeEnd <em>Edge End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge End</em>' containment reference.
	 * @see #getEdgeEnd()
	 * @generated
	 */
	void setEdgeEnd(EdgeEndType value);

} // IfcEdge
