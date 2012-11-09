/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Voids Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelVoidsElement()
 * @model
 * @generated
 */
public interface IfcRelVoidsElement extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Building Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcElement#getHasOpenings <em>Has Openings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Building Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Building Element</em>' reference.
	 * @see #setRelatingBuildingElement(IfcElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelVoidsElement_RelatingBuildingElement()
	 * @see ifc2x3tc1.IfcElement#getHasOpenings
	 * @model opposite="HasOpenings"
	 * @generated
	 */
	IfcElement getRelatingBuildingElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelVoidsElement#getRelatingBuildingElement <em>Relating Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Building Element</em>' reference.
	 * @see #getRelatingBuildingElement()
	 * @generated
	 */
	void setRelatingBuildingElement(IfcElement value);

	/**
	 * Returns the value of the '<em><b>Related Opening Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcFeatureElementSubtraction#getVoidsElements <em>Voids Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Opening Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Opening Element</em>' reference.
	 * @see #setRelatedOpeningElement(IfcFeatureElementSubtraction)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelVoidsElement_RelatedOpeningElement()
	 * @see ifc2x3tc1.IfcFeatureElementSubtraction#getVoidsElements
	 * @model opposite="VoidsElements"
	 * @generated
	 */
	IfcFeatureElementSubtraction getRelatedOpeningElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Opening Element</em>' reference.
	 * @see #getRelatedOpeningElement()
	 * @generated
	 */
	void setRelatedOpeningElement(IfcFeatureElementSubtraction value);

} // IfcRelVoidsElement
