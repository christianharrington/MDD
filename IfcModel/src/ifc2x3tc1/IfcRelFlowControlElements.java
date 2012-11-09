/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Flow Control Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelFlowControlElements#getRelatedControlElements <em>Related Control Elements</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelFlowControlElements#getRelatingFlowElement <em>Relating Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelFlowControlElements()
 * @model
 * @generated
 */
public interface IfcRelFlowControlElements extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Control Elements</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcDistributionControlElement}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcDistributionControlElement#getAssignedToFlowElement <em>Assigned To Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Control Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Control Elements</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelFlowControlElements_RelatedControlElements()
	 * @see ifc2x3tc1.IfcDistributionControlElement#getAssignedToFlowElement
	 * @model opposite="AssignedToFlowElement"
	 * @generated
	 */
	EList<IfcDistributionControlElement> getRelatedControlElements();

	/**
	 * Returns the value of the '<em><b>Relating Flow Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcDistributionFlowElement#getHasControlElements <em>Has Control Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Flow Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Flow Element</em>' reference.
	 * @see #setRelatingFlowElement(IfcDistributionFlowElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelFlowControlElements_RelatingFlowElement()
	 * @see ifc2x3tc1.IfcDistributionFlowElement#getHasControlElements
	 * @model opposite="HasControlElements"
	 * @generated
	 */
	IfcDistributionFlowElement getRelatingFlowElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelFlowControlElements#getRelatingFlowElement <em>Relating Flow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Flow Element</em>' reference.
	 * @see #getRelatingFlowElement()
	 * @generated
	 */
	void setRelatingFlowElement(IfcDistributionFlowElement value);

} // IfcRelFlowControlElements
