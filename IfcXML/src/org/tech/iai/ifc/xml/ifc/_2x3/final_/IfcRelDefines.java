/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Defines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDefines#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelDefines()
 * @model abstract="true"
 *        extendedMetaData="name='IfcRelDefines' kind='elementOnly'"
 * @generated
 */
public interface IfcRelDefines extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' containment reference.
	 * @see #setRelatedObjects(RelatedObjectsType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelDefines_RelatedObjects()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedObjects' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedObjectsType1 getRelatedObjects();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDefines#getRelatedObjects <em>Related Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Objects</em>' containment reference.
	 * @see #getRelatedObjects()
	 * @generated
	 */
	void setRelatedObjects(RelatedObjectsType1 value);

} // IfcRelDefines
