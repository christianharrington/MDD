/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Approval Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingApprovalType1#getIfcApproval <em>Ifc Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingApprovalType1()
 * @model extendedMetaData="name='RelatingApproval_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingApprovalType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Approval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Approval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Approval</em>' containment reference.
	 * @see #setIfcApproval(IfcApproval)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingApprovalType1_IfcApproval()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcApproval' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcApproval getIfcApproval();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingApprovalType1#getIfcApproval <em>Ifc Approval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Approval</em>' containment reference.
	 * @see #getIfcApproval()
	 * @generated
	 */
	void setIfcApproval(IfcApproval value);

} // RelatingApprovalType1
