/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Decomposes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDecomposes#getRelatingObject <em>Relating Object</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDecomposes#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelDecomposes()
 * @model abstract="true"
 *        extendedMetaData="name='IfcRelDecomposes' kind='elementOnly'"
 * @generated
 */
public interface IfcRelDecomposes extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Relating Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Object</em>' containment reference.
	 * @see #setRelatingObject(RelatingObjectType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelDecomposes_RelatingObject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingObject' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingObjectType getRelatingObject();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDecomposes#getRelatingObject <em>Relating Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Object</em>' containment reference.
	 * @see #getRelatingObject()
	 * @generated
	 */
	void setRelatingObject(RelatingObjectType value);

	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' containment reference.
	 * @see #setRelatedObjects(RelatedObjectsType2)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelDecomposes_RelatedObjects()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedObjects' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedObjectsType2 getRelatedObjects();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDecomposes#getRelatedObjects <em>Related Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Objects</em>' containment reference.
	 * @see #getRelatedObjects()
	 * @generated
	 */
	void setRelatedObjects(RelatedObjectsType2 value);

} // IfcRelDecomposes
