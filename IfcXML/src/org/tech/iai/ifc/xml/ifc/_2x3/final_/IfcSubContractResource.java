/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sub Contract Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSubContractResource#getSubContractor <em>Sub Contractor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSubContractResource#getJobDescription <em>Job Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSubContractResource()
 * @model extendedMetaData="name='IfcSubContractResource' kind='elementOnly'"
 * @generated
 */
public interface IfcSubContractResource extends IfcConstructionResource {
	/**
	 * Returns the value of the '<em><b>Sub Contractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Contractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Contractor</em>' containment reference.
	 * @see #setSubContractor(SubContractorType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSubContractResource_SubContractor()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SubContractor' namespace='##targetNamespace'"
	 * @generated
	 */
	SubContractorType getSubContractor();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSubContractResource#getSubContractor <em>Sub Contractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Contractor</em>' containment reference.
	 * @see #getSubContractor()
	 * @generated
	 */
	void setSubContractor(SubContractorType value);

	/**
	 * Returns the value of the '<em><b>Job Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Description</em>' attribute.
	 * @see #setJobDescription(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSubContractResource_JobDescription()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='JobDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJobDescription();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSubContractResource#getJobDescription <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Description</em>' attribute.
	 * @see #getJobDescription()
	 * @generated
	 */
	void setJobDescription(String value);

} // IfcSubContractResource
