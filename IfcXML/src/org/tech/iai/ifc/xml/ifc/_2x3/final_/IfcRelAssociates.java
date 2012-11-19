/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociates#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociates()
 * @model extendedMetaData="name='IfcRelAssociates' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssociates extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' containment reference.
	 * @see #setRelatedObjects(RelatedObjectsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociates_RelatedObjects()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedObjects' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedObjectsType getRelatedObjects();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociates#getRelatedObjects <em>Related Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Objects</em>' containment reference.
	 * @see #getRelatedObjects()
	 * @generated
	 */
	void setRelatedObjects(RelatedObjectsType value);

} // IfcRelAssociates
