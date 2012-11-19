/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralElement#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralElement#getRelatedStructuralMember <em>Related Structural Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralElement()
 * @model extendedMetaData="name='IfcRelConnectsStructuralElement' kind='elementOnly'"
 * @generated
 */
public interface IfcRelConnectsStructuralElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' containment reference.
	 * @see #setRelatingElement(RelatingElementType2)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralElement_RelatingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingElementType2 getRelatingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralElement#getRelatingElement <em>Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' containment reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(RelatingElementType2 value);

	/**
	 * Returns the value of the '<em><b>Related Structural Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Member</em>' containment reference.
	 * @see #setRelatedStructuralMember(RelatedStructuralMemberType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralElement_RelatedStructuralMember()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedStructuralMember' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedStructuralMemberType getRelatedStructuralMember();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralElement#getRelatedStructuralMember <em>Related Structural Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Member</em>' containment reference.
	 * @see #getRelatedStructuralMember()
	 * @generated
	 */
	void setRelatedStructuralMember(RelatedStructuralMemberType value);

} // IfcRelConnectsStructuralElement
