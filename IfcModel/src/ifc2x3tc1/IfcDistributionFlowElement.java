/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Distribution Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDistributionFlowElement#getHasControlElements <em>Has Control Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDistributionFlowElement()
 * @model
 * @generated
 */
public interface IfcDistributionFlowElement extends IfcDistributionElement {
	/**
	 * Returns the value of the '<em><b>Has Control Elements</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelFlowControlElements}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelFlowControlElements#getRelatingFlowElement <em>Relating Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Control Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Control Elements</em>' reference list.
	 * @see #isSetHasControlElements()
	 * @see #unsetHasControlElements()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDistributionFlowElement_HasControlElements()
	 * @see ifc2x3tc1.IfcRelFlowControlElements#getRelatingFlowElement
	 * @model opposite="RelatingFlowElement" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelFlowControlElements> getHasControlElements();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDistributionFlowElement#getHasControlElements <em>Has Control Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasControlElements()
	 * @see #getHasControlElements()
	 * @generated
	 */
	void unsetHasControlElements();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDistributionFlowElement#getHasControlElements <em>Has Control Elements</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Control Elements</em>' reference list is set.
	 * @see #unsetHasControlElements()
	 * @see #getHasControlElements()
	 * @generated
	 */
	boolean isSetHasControlElements();

} // IfcDistributionFlowElement
