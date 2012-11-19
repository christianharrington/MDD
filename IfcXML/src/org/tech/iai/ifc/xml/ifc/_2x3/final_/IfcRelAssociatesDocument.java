/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesDocument#getRelatingDocument <em>Relating Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesDocument()
 * @model extendedMetaData="name='IfcRelAssociatesDocument' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssociatesDocument extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Document</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Document</em>' containment reference.
	 * @see #setRelatingDocument(RelatingDocumentType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesDocument_RelatingDocument()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingDocument' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingDocumentType getRelatingDocument();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesDocument#getRelatingDocument <em>Relating Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Document</em>' containment reference.
	 * @see #getRelatingDocument()
	 * @generated
	 */
	void setRelatingDocument(RelatingDocumentType value);

} // IfcRelAssociatesDocument
