/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPath#getEdgeList <em>Edge List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPath()
 * @model extendedMetaData="name='IfcPath' kind='elementOnly'"
 * @generated
 */
public interface IfcPath extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Edge List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge List</em>' containment reference.
	 * @see #setEdgeList(EdgeListType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPath_EdgeList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EdgeList' namespace='##targetNamespace'"
	 * @generated
	 */
	EdgeListType getEdgeList();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPath#getEdgeList <em>Edge List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge List</em>' containment reference.
	 * @see #getEdgeList()
	 * @generated
	 */
	void setEdgeList(EdgeListType value);

} // IfcPath
