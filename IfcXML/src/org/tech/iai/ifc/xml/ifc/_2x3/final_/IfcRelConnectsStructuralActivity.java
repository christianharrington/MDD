/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralActivity#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralActivity()
 * @model extendedMetaData="name='IfcRelConnectsStructuralActivity' kind='elementOnly'"
 * @generated
 */
public interface IfcRelConnectsStructuralActivity extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' containment reference.
	 * @see #setRelatingElement(RelatingElementType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralActivity_RelatingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingElementType1 getRelatingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralActivity#getRelatingElement <em>Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' containment reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(RelatingElementType1 value);

	/**
	 * Returns the value of the '<em><b>Related Structural Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Activity</em>' containment reference.
	 * @see #setRelatedStructuralActivity(RelatedStructuralActivityType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralActivity_RelatedStructuralActivity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedStructuralActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedStructuralActivityType getRelatedStructuralActivity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Activity</em>' containment reference.
	 * @see #getRelatedStructuralActivity()
	 * @generated
	 */
	void setRelatedStructuralActivity(RelatedStructuralActivityType value);

} // IfcRelConnectsStructuralActivity
