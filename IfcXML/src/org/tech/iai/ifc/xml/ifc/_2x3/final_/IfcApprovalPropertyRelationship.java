/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Approval Property Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApprovalPropertyRelationship#getApprovedProperties <em>Approved Properties</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApprovalPropertyRelationship#getApproval <em>Approval</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcApprovalPropertyRelationship()
 * @model extendedMetaData="name='IfcApprovalPropertyRelationship' kind='elementOnly'"
 * @generated
 */
public interface IfcApprovalPropertyRelationship extends Entity {
	/**
	 * Returns the value of the '<em><b>Approved Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approved Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Properties</em>' containment reference.
	 * @see #setApprovedProperties(ApprovedPropertiesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcApprovalPropertyRelationship_ApprovedProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ApprovedProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	ApprovedPropertiesType getApprovedProperties();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApprovalPropertyRelationship#getApprovedProperties <em>Approved Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved Properties</em>' containment reference.
	 * @see #getApprovedProperties()
	 * @generated
	 */
	void setApprovedProperties(ApprovedPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Approval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval</em>' containment reference.
	 * @see #setApproval(ApprovalType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcApprovalPropertyRelationship_Approval()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Approval' namespace='##targetNamespace'"
	 * @generated
	 */
	ApprovalType getApproval();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApprovalPropertyRelationship#getApproval <em>Approval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval</em>' containment reference.
	 * @see #getApproval()
	 * @generated
	 */
	void setApproval(ApprovalType value);

} // IfcApprovalPropertyRelationship
