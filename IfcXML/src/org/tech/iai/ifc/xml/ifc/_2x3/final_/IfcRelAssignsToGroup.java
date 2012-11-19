/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToGroup#getRelatingGroup <em>Relating Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToGroup()
 * @model extendedMetaData="name='IfcRelAssignsToGroup' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssignsToGroup extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Group</em>' containment reference.
	 * @see #setRelatingGroup(RelatingGroupType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToGroup_RelatingGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingGroupType getRelatingGroup();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToGroup#getRelatingGroup <em>Relating Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Group</em>' containment reference.
	 * @see #getRelatingGroup()
	 * @generated
	 */
	void setRelatingGroup(RelatingGroupType value);

} // IfcRelAssignsToGroup
