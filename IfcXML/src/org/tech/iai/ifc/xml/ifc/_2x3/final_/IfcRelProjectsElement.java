/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Projects Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelProjectsElement#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelProjectsElement#getRelatedFeatureElement <em>Related Feature Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelProjectsElement()
 * @model extendedMetaData="name='IfcRelProjectsElement' kind='elementOnly'"
 * @generated
 */
public interface IfcRelProjectsElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' containment reference.
	 * @see #setRelatingElement(RelatingElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelProjectsElement_RelatingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingElementType getRelatingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelProjectsElement#getRelatingElement <em>Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' containment reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(RelatingElementType value);

	/**
	 * Returns the value of the '<em><b>Related Feature Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Feature Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Feature Element</em>' containment reference.
	 * @see #setRelatedFeatureElement(RelatedFeatureElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelProjectsElement_RelatedFeatureElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedFeatureElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedFeatureElementType getRelatedFeatureElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelProjectsElement#getRelatedFeatureElement <em>Related Feature Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Feature Element</em>' containment reference.
	 * @see #getRelatedFeatureElement()
	 * @generated
	 */
	void setRelatedFeatureElement(RelatedFeatureElementType value);

} // IfcRelProjectsElement
