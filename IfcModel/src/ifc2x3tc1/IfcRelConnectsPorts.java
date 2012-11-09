/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelConnectsPorts#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelConnectsPorts#getRelatedPort <em>Related Port</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelConnectsPorts#getRealizingElement <em>Realizing Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsPorts()
 * @model
 * @generated
 */
public interface IfcRelConnectsPorts extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcPort#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Port</em>' reference.
	 * @see #setRelatingPort(IfcPort)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsPorts_RelatingPort()
	 * @see ifc2x3tc1.IfcPort#getConnectedTo
	 * @model opposite="ConnectedTo"
	 * @generated
	 */
	IfcPort getRelatingPort();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelConnectsPorts#getRelatingPort <em>Relating Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Port</em>' reference.
	 * @see #getRelatingPort()
	 * @generated
	 */
	void setRelatingPort(IfcPort value);

	/**
	 * Returns the value of the '<em><b>Related Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcPort#getConnectedFrom <em>Connected From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Port</em>' reference.
	 * @see #setRelatedPort(IfcPort)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsPorts_RelatedPort()
	 * @see ifc2x3tc1.IfcPort#getConnectedFrom
	 * @model opposite="ConnectedFrom"
	 * @generated
	 */
	IfcPort getRelatedPort();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelConnectsPorts#getRelatedPort <em>Related Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Port</em>' reference.
	 * @see #getRelatedPort()
	 * @generated
	 */
	void setRelatedPort(IfcPort value);

	/**
	 * Returns the value of the '<em><b>Realizing Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Element</em>' reference.
	 * @see #isSetRealizingElement()
	 * @see #unsetRealizingElement()
	 * @see #setRealizingElement(IfcElement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelConnectsPorts_RealizingElement()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcElement getRealizingElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelConnectsPorts#getRealizingElement <em>Realizing Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizing Element</em>' reference.
	 * @see #isSetRealizingElement()
	 * @see #unsetRealizingElement()
	 * @see #getRealizingElement()
	 * @generated
	 */
	void setRealizingElement(IfcElement value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRelConnectsPorts#getRealizingElement <em>Realizing Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRealizingElement()
	 * @see #getRealizingElement()
	 * @see #setRealizingElement(IfcElement)
	 * @generated
	 */
	void unsetRealizingElement();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRelConnectsPorts#getRealizingElement <em>Realizing Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Realizing Element</em>' reference is set.
	 * @see #unsetRealizingElement()
	 * @see #getRealizingElement()
	 * @see #setRealizingElement(IfcElement)
	 * @generated
	 */
	boolean isSetRealizingElement();

} // IfcRelConnectsPorts
