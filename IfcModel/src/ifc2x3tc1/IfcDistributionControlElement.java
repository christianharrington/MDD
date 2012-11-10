/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Distribution Control Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDistributionControlElement#getControlElementId <em>Control Element Id</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDistributionControlElement#getAssignedToFlowElement <em>Assigned To Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDistributionControlElement()
 * @model
 * @generated
 */
public interface IfcDistributionControlElement extends IfcDistributionElement {
	/**
	 * Returns the value of the '<em><b>Control Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Element Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Element Id</em>' attribute.
	 * @see #isSetControlElementId()
	 * @see #unsetControlElementId()
	 * @see #setControlElementId(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDistributionControlElement_ControlElementId()
	 * @model unsettable="true"
	 * @generated
	 */
	String getControlElementId();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDistributionControlElement#getControlElementId <em>Control Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Element Id</em>' attribute.
	 * @see #isSetControlElementId()
	 * @see #unsetControlElementId()
	 * @see #getControlElementId()
	 * @generated
	 */
	void setControlElementId(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDistributionControlElement#getControlElementId <em>Control Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlElementId()
	 * @see #getControlElementId()
	 * @see #setControlElementId(String)
	 * @generated
	 */
	void unsetControlElementId();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDistributionControlElement#getControlElementId <em>Control Element Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Control Element Id</em>' attribute is set.
	 * @see #unsetControlElementId()
	 * @see #getControlElementId()
	 * @see #setControlElementId(String)
	 * @generated
	 */
	boolean isSetControlElementId();

	/**
	 * Returns the value of the '<em><b>Assigned To Flow Element</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelFlowControlElements}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelFlowControlElements#getRelatedControlElements <em>Related Control Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To Flow Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To Flow Element</em>' reference list.
	 * @see #isSetAssignedToFlowElement()
	 * @see #unsetAssignedToFlowElement()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDistributionControlElement_AssignedToFlowElement()
	 * @see ifc2x3tc1.IfcRelFlowControlElements#getRelatedControlElements
	 * @model opposite="RelatedControlElements" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelFlowControlElements> getAssignedToFlowElement();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDistributionControlElement#getAssignedToFlowElement <em>Assigned To Flow Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssignedToFlowElement()
	 * @see #getAssignedToFlowElement()
	 * @generated
	 */
	void unsetAssignedToFlowElement();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDistributionControlElement#getAssignedToFlowElement <em>Assigned To Flow Element</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Assigned To Flow Element</em>' reference list is set.
	 * @see #unsetAssignedToFlowElement()
	 * @see #getAssignedToFlowElement()
	 * @generated
	 */
	boolean isSetAssignedToFlowElement();

} // IfcDistributionControlElement
