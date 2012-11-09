/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Feature Element Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcFeatureElementAddition#getProjectsElements <em>Projects Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFeatureElementAddition()
 * @model
 * @generated
 */
public interface IfcFeatureElementAddition extends IfcFeatureElement {
	/**
	 * Returns the value of the '<em><b>Projects Elements</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelProjectsElement#getRelatedFeatureElement <em>Related Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects Elements</em>' reference.
	 * @see #isSetProjectsElements()
	 * @see #unsetProjectsElements()
	 * @see #setProjectsElements(IfcRelProjectsElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFeatureElementAddition_ProjectsElements()
	 * @see ifc2x3tc1.IfcRelProjectsElement#getRelatedFeatureElement
	 * @model opposite="RelatedFeatureElement" unsettable="true"
	 * @generated
	 */
	IfcRelProjectsElement getProjectsElements();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcFeatureElementAddition#getProjectsElements <em>Projects Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projects Elements</em>' reference.
	 * @see #isSetProjectsElements()
	 * @see #unsetProjectsElements()
	 * @see #getProjectsElements()
	 * @generated
	 */
	void setProjectsElements(IfcRelProjectsElement value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcFeatureElementAddition#getProjectsElements <em>Projects Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjectsElements()
	 * @see #getProjectsElements()
	 * @see #setProjectsElements(IfcRelProjectsElement)
	 * @generated
	 */
	void unsetProjectsElements();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcFeatureElementAddition#getProjectsElements <em>Projects Elements</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Projects Elements</em>' reference is set.
	 * @see #unsetProjectsElements()
	 * @see #getProjectsElements()
	 * @see #setProjectsElements(IfcRelProjectsElement)
	 * @generated
	 */
	boolean isSetProjectsElements();

} // IfcFeatureElementAddition
