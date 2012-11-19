/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToProcess#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToProcess#getQuantityInProcess <em>Quantity In Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToProcess()
 * @model extendedMetaData="name='IfcRelAssignsToProcess' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssignsToProcess extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Process</em>' containment reference.
	 * @see #setRelatingProcess(RelatingProcessType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToProcess_RelatingProcess()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingProcessType1 getRelatingProcess();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToProcess#getRelatingProcess <em>Relating Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Process</em>' containment reference.
	 * @see #getRelatingProcess()
	 * @generated
	 */
	void setRelatingProcess(RelatingProcessType1 value);

	/**
	 * Returns the value of the '<em><b>Quantity In Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity In Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity In Process</em>' containment reference.
	 * @see #setQuantityInProcess(QuantityInProcessType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToProcess_QuantityInProcess()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='QuantityInProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	QuantityInProcessType getQuantityInProcess();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToProcess#getQuantityInProcess <em>Quantity In Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity In Process</em>' containment reference.
	 * @see #getQuantityInProcess()
	 * @generated
	 */
	void setQuantityInProcess(QuantityInProcessType value);

} // IfcRelAssignsToProcess
