/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Voids Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelVoidsElement()
 * @model extendedMetaData="name='IfcRelVoidsElement' kind='elementOnly'"
 * @generated
 */
public interface IfcRelVoidsElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Building Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElement#getHasOpenings <em>Has Openings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Building Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Building Element</em>' reference.
	 * @see #setRelatingBuildingElement(IfcElement)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelVoidsElement_RelatingBuildingElement()
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElement#getHasOpenings
	 * @model opposite="HasOpenings"
	 *        extendedMetaData="kind='element' name='RelatingBuildingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcElement getRelatingBuildingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Building Element</em>' reference.
	 * @see #getRelatingBuildingElement()
	 * @generated
	 */
	void setRelatingBuildingElement(IfcElement value);

	/**
	 * Returns the value of the '<em><b>Related Opening Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Opening Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Opening Element</em>' containment reference.
	 * @see #setRelatedOpeningElement(RelatedOpeningElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelVoidsElement_RelatedOpeningElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedOpeningElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedOpeningElementType getRelatedOpeningElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Opening Element</em>' containment reference.
	 * @see #getRelatedOpeningElement()
	 * @generated
	 */
	void setRelatedOpeningElement(RelatedOpeningElementType value);

} // IfcRelVoidsElement
