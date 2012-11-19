/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Edge Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdgeLoop#getEdgeList <em>Edge List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcEdgeLoop()
 * @model extendedMetaData="name='IfcEdgeLoop' kind='elementOnly'"
 * @generated
 */
public interface IfcEdgeLoop extends IfcLoop {
	/**
	 * Returns the value of the '<em><b>Edge List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge List</em>' containment reference.
	 * @see #setEdgeList(EdgeListType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcEdgeLoop_EdgeList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EdgeList' namespace='##targetNamespace'"
	 * @generated
	 */
	EdgeListType1 getEdgeList();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdgeLoop#getEdgeList <em>Edge List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge List</em>' containment reference.
	 * @see #getEdgeList()
	 * @generated
	 */
	void setEdgeList(EdgeListType1 value);

} // IfcEdgeLoop
