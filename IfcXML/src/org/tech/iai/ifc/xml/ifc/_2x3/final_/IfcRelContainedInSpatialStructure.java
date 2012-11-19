/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Contained In Spatial Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelContainedInSpatialStructure#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelContainedInSpatialStructure#getRelatingStructure <em>Relating Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelContainedInSpatialStructure()
 * @model extendedMetaData="name='IfcRelContainedInSpatialStructure' kind='elementOnly'"
 * @generated
 */
public interface IfcRelContainedInSpatialStructure extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Elements</em>' containment reference.
	 * @see #setRelatedElements(RelatedElementsType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelContainedInSpatialStructure_RelatedElements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedElements' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedElementsType1 getRelatedElements();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelContainedInSpatialStructure#getRelatedElements <em>Related Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Elements</em>' containment reference.
	 * @see #getRelatedElements()
	 * @generated
	 */
	void setRelatedElements(RelatedElementsType1 value);

	/**
	 * Returns the value of the '<em><b>Relating Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Structure</em>' containment reference.
	 * @see #setRelatingStructure(RelatingStructureType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelContainedInSpatialStructure_RelatingStructure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingStructureType1 getRelatingStructure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelContainedInSpatialStructure#getRelatingStructure <em>Relating Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Structure</em>' containment reference.
	 * @see #getRelatingStructure()
	 * @generated
	 */
	void setRelatingStructure(RelatingStructureType1 value);

} // IfcRelContainedInSpatialStructure
