/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToResource()
 * @model extendedMetaData="name='IfcRelAssignsToResource' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssignsToResource extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Resource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Resource</em>' containment reference.
	 * @see #setRelatingResource(RelatingResourceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToResource_RelatingResource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingResource' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingResourceType getRelatingResource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToResource#getRelatingResource <em>Relating Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Resource</em>' containment reference.
	 * @see #getRelatingResource()
	 * @generated
	 */
	void setRelatingResource(RelatingResourceType value);

} // IfcRelAssignsToResource
