/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Projects Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelProjectsElement#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelProjectsElement#getRelatedFeatureElement <em>Related Feature Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelProjectsElement()
 * @model
 * @generated
 */
public interface IfcRelProjectsElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcElement#getHasProjections <em>Has Projections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' reference.
	 * @see #setRelatingElement(IfcElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelProjectsElement_RelatingElement()
	 * @see ifc2x3tc1.IfcElement#getHasProjections
	 * @model opposite="HasProjections"
	 * @generated
	 */
	IfcElement getRelatingElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelProjectsElement#getRelatingElement <em>Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(IfcElement value);

	/**
	 * Returns the value of the '<em><b>Related Feature Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcFeatureElementAddition#getProjectsElements <em>Projects Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Feature Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Feature Element</em>' reference.
	 * @see #setRelatedFeatureElement(IfcFeatureElementAddition)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelProjectsElement_RelatedFeatureElement()
	 * @see ifc2x3tc1.IfcFeatureElementAddition#getProjectsElements
	 * @model opposite="ProjectsElements"
	 * @generated
	 */
	IfcFeatureElementAddition getRelatedFeatureElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelProjectsElement#getRelatedFeatureElement <em>Related Feature Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Feature Element</em>' reference.
	 * @see #getRelatedFeatureElement()
	 * @generated
	 */
	void setRelatedFeatureElement(IfcFeatureElementAddition value);

} // IfcRelProjectsElement
