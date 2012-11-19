/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPorts#getRelatingPort <em>Relating Port</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPorts#getRelatedPort <em>Related Port</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPorts#getRealizingElement <em>Realizing Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsPorts()
 * @model extendedMetaData="name='IfcRelConnectsPorts' kind='elementOnly'"
 * @generated
 */
public interface IfcRelConnectsPorts extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Port</em>' containment reference.
	 * @see #setRelatingPort(RelatingPortType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsPorts_RelatingPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingPort' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingPortType1 getRelatingPort();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPorts#getRelatingPort <em>Relating Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Port</em>' containment reference.
	 * @see #getRelatingPort()
	 * @generated
	 */
	void setRelatingPort(RelatingPortType1 value);

	/**
	 * Returns the value of the '<em><b>Related Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Port</em>' containment reference.
	 * @see #setRelatedPort(RelatedPortType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsPorts_RelatedPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedPort' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedPortType getRelatedPort();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPorts#getRelatedPort <em>Related Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Port</em>' containment reference.
	 * @see #getRelatedPort()
	 * @generated
	 */
	void setRelatedPort(RelatedPortType value);

	/**
	 * Returns the value of the '<em><b>Realizing Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Element</em>' containment reference.
	 * @see #setRealizingElement(RealizingElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsPorts_RealizingElement()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RealizingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RealizingElementType getRealizingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsPorts#getRealizingElement <em>Realizing Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizing Element</em>' containment reference.
	 * @see #getRealizingElement()
	 * @generated
	 */
	void setRealizingElement(RealizingElementType value);

} // IfcRelConnectsPorts
