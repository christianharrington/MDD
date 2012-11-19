/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Port To Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPortToElement#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPortToElement#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsPortToElement()
 * @model extendedMetaData="name='IfcRelConnectsPortToElement' kind='elementOnly'"
 * @generated
 */
public interface IfcRelConnectsPortToElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Port</em>' containment reference.
	 * @see #setRelatingPort(RelatingPortType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsPortToElement_RelatingPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingPort' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingPortType getRelatingPort();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPortToElement#getRelatingPort <em>Relating Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Port</em>' containment reference.
	 * @see #getRelatingPort()
	 * @generated
	 */
	void setRelatingPort(RelatingPortType value);

	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Element</em>' containment reference.
	 * @see #setRelatedElement(RelatedElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsPortToElement_RelatedElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedElementType getRelatedElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPortToElement#getRelatedElement <em>Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Element</em>' containment reference.
	 * @see #getRelatedElement()
	 * @generated
	 */
	void setRelatedElement(RelatedElementType value);

} // IfcRelConnectsPortToElement
