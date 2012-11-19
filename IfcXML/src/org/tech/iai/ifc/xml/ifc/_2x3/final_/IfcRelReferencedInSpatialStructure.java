/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Referenced In Spatial Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelReferencedInSpatialStructure#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelReferencedInSpatialStructure#getRelatingStructure <em>Relating Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelReferencedInSpatialStructure()
 * @model extendedMetaData="name='IfcRelReferencedInSpatialStructure' kind='elementOnly'"
 * @generated
 */
public interface IfcRelReferencedInSpatialStructure extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Elements</em>' containment reference.
	 * @see #setRelatedElements(RelatedElementsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelReferencedInSpatialStructure_RelatedElements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedElements' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedElementsType getRelatedElements();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelReferencedInSpatialStructure#getRelatedElements <em>Related Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Elements</em>' containment reference.
	 * @see #getRelatedElements()
	 * @generated
	 */
	void setRelatedElements(RelatedElementsType value);

	/**
	 * Returns the value of the '<em><b>Relating Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Structure</em>' containment reference.
	 * @see #setRelatingStructure(RelatingStructureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelReferencedInSpatialStructure_RelatingStructure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingStructureType getRelatingStructure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelReferencedInSpatialStructure#getRelatingStructure <em>Relating Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Structure</em>' containment reference.
	 * @see #getRelatingStructure()
	 * @generated
	 */
	void setRelatingStructure(RelatingStructureType value);

} // IfcRelReferencedInSpatialStructure
