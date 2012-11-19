/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Approval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesApproval#getRelatingApproval <em>Relating Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesApproval()
 * @model extendedMetaData="name='IfcRelAssociatesApproval' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssociatesApproval extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Approval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Approval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Approval</em>' containment reference.
	 * @see #setRelatingApproval(RelatingApprovalType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesApproval_RelatingApproval()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingApproval' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingApprovalType getRelatingApproval();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesApproval#getRelatingApproval <em>Relating Approval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Approval</em>' containment reference.
	 * @see #getRelatingApproval()
	 * @generated
	 */
	void setRelatingApproval(RelatingApprovalType value);

} // IfcRelAssociatesApproval
