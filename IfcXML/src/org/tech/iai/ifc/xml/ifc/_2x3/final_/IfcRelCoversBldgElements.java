/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Covers Bldg Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversBldgElements#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversBldgElements#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelCoversBldgElements()
 * @model extendedMetaData="name='IfcRelCoversBldgElements' kind='elementOnly'"
 * @generated
 */
public interface IfcRelCoversBldgElements extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Building Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Building Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Building Element</em>' containment reference.
	 * @see #setRelatingBuildingElement(RelatingBuildingElementType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelCoversBldgElements_RelatingBuildingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingBuildingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingBuildingElementType1 getRelatingBuildingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversBldgElements#getRelatingBuildingElement <em>Relating Building Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Building Element</em>' containment reference.
	 * @see #getRelatingBuildingElement()
	 * @generated
	 */
	void setRelatingBuildingElement(RelatingBuildingElementType1 value);

	/**
	 * Returns the value of the '<em><b>Related Coverings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Coverings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Coverings</em>' containment reference.
	 * @see #setRelatedCoverings(RelatedCoveringsType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelCoversBldgElements_RelatedCoverings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedCoverings' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedCoveringsType1 getRelatedCoverings();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversBldgElements#getRelatedCoverings <em>Related Coverings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Coverings</em>' containment reference.
	 * @see #getRelatedCoverings()
	 * @generated
	 */
	void setRelatedCoverings(RelatedCoveringsType1 value);

} // IfcRelCoversBldgElements
