/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Feature Element Subtraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcFeatureElementSubtraction#getVoidsElements <em>Voids Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFeatureElementSubtraction()
 * @model
 * @generated
 */
public interface IfcFeatureElementSubtraction extends IfcFeatureElement {
	/**
	 * Returns the value of the '<em><b>Voids Elements</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelVoidsElement#getRelatedOpeningElement <em>Related Opening Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voids Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voids Elements</em>' reference.
	 * @see #isSetVoidsElements()
	 * @see #unsetVoidsElements()
	 * @see #setVoidsElements(IfcRelVoidsElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFeatureElementSubtraction_VoidsElements()
	 * @see ifc2x3tc1.IfcRelVoidsElement#getRelatedOpeningElement
	 * @model opposite="RelatedOpeningElement" unsettable="true"
	 * @generated
	 */
	IfcRelVoidsElement getVoidsElements();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcFeatureElementSubtraction#getVoidsElements <em>Voids Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voids Elements</em>' reference.
	 * @see #isSetVoidsElements()
	 * @see #unsetVoidsElements()
	 * @see #getVoidsElements()
	 * @generated
	 */
	void setVoidsElements(IfcRelVoidsElement value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcFeatureElementSubtraction#getVoidsElements <em>Voids Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoidsElements()
	 * @see #getVoidsElements()
	 * @see #setVoidsElements(IfcRelVoidsElement)
	 * @generated
	 */
	void unsetVoidsElements();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcFeatureElementSubtraction#getVoidsElements <em>Voids Elements</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voids Elements</em>' reference is set.
	 * @see #unsetVoidsElements()
	 * @see #getVoidsElements()
	 * @see #setVoidsElements(IfcRelVoidsElement)
	 * @generated
	 */
	boolean isSetVoidsElements();

} // IfcFeatureElementSubtraction
