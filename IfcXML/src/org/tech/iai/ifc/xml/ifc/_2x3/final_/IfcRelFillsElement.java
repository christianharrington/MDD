/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Fills Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFillsElement#getRelatingOpeningElement <em>Relating Opening Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFillsElement#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelFillsElement()
 * @model extendedMetaData="name='IfcRelFillsElement' kind='elementOnly'"
 * @generated
 */
public interface IfcRelFillsElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Opening Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Opening Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Opening Element</em>' containment reference.
	 * @see #setRelatingOpeningElement(RelatingOpeningElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelFillsElement_RelatingOpeningElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingOpeningElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingOpeningElementType getRelatingOpeningElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFillsElement#getRelatingOpeningElement <em>Relating Opening Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Opening Element</em>' containment reference.
	 * @see #getRelatingOpeningElement()
	 * @generated
	 */
	void setRelatingOpeningElement(RelatingOpeningElementType value);

	/**
	 * Returns the value of the '<em><b>Related Building Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Building Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Building Element</em>' containment reference.
	 * @see #setRelatedBuildingElement(RelatedBuildingElementType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelFillsElement_RelatedBuildingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedBuildingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedBuildingElementType1 getRelatedBuildingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFillsElement#getRelatedBuildingElement <em>Related Building Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Building Element</em>' containment reference.
	 * @see #getRelatedBuildingElement()
	 * @generated
	 */
	void setRelatedBuildingElement(RelatedBuildingElementType1 value);

} // IfcRelFillsElement
