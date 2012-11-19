/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Subedge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSubedge#getParentEdge <em>Parent Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSubedge()
 * @model extendedMetaData="name='IfcSubedge' kind='elementOnly'"
 * @generated
 */
public interface IfcSubedge extends IfcEdge {
	/**
	 * Returns the value of the '<em><b>Parent Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Edge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Edge</em>' containment reference.
	 * @see #setParentEdge(ParentEdgeType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSubedge_ParentEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ParentEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	ParentEdgeType getParentEdge();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSubedge#getParentEdge <em>Parent Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Edge</em>' containment reference.
	 * @see #getParentEdge()
	 * @generated
	 */
	void setParentEdge(ParentEdgeType value);

} // IfcSubedge
