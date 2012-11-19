/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Flow Control Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFlowControlElements#getRelatedControlElements <em>Related Control Elements</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFlowControlElements#getRelatingFlowElement <em>Relating Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelFlowControlElements()
 * @model extendedMetaData="name='IfcRelFlowControlElements' kind='elementOnly'"
 * @generated
 */
public interface IfcRelFlowControlElements extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Control Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Control Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Control Elements</em>' containment reference.
	 * @see #setRelatedControlElements(RelatedControlElementsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelFlowControlElements_RelatedControlElements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedControlElements' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedControlElementsType getRelatedControlElements();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFlowControlElements#getRelatedControlElements <em>Related Control Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Control Elements</em>' containment reference.
	 * @see #getRelatedControlElements()
	 * @generated
	 */
	void setRelatedControlElements(RelatedControlElementsType value);

	/**
	 * Returns the value of the '<em><b>Relating Flow Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Flow Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Flow Element</em>' containment reference.
	 * @see #setRelatingFlowElement(RelatingFlowElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelFlowControlElements_RelatingFlowElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingFlowElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingFlowElementType getRelatingFlowElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelFlowControlElements#getRelatingFlowElement <em>Relating Flow Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Flow Element</em>' containment reference.
	 * @see #getRelatingFlowElement()
	 * @generated
	 */
	void setRelatingFlowElement(RelatingFlowElementType value);

} // IfcRelFlowControlElements
