/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getDocumentReferences <em>Document References</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getScope <em>Scope</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getDocumentOwner <em>Document Owner</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getEditors <em>Editors</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getLastRevisionTime <em>Last Revision Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getElectronicFormat <em>Electronic Format</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getValidUntil <em>Valid Until</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation()
 * @model extendedMetaData="name='IfcDocumentInformation' kind='elementOnly'"
 * @generated
 */
public interface IfcDocumentInformation extends Entity {
	/**
	 * Returns the value of the '<em><b>Document Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Id</em>' attribute.
	 * @see #setDocumentId(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_DocumentId()
	 * @model dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIdentifier" required="true"
	 *        extendedMetaData="kind='element' name='DocumentId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentId();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getDocumentId <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Id</em>' attribute.
	 * @see #getDocumentId()
	 * @generated
	 */
	void setDocumentId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_Name()
	 * @model dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_Description()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Document References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document References</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document References</em>' containment reference.
	 * @see #setDocumentReferences(DocumentReferencesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_DocumentReferences()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DocumentReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentReferencesType getDocumentReferences();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getDocumentReferences <em>Document References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document References</em>' containment reference.
	 * @see #getDocumentReferences()
	 * @generated
	 */
	void setDocumentReferences(DocumentReferencesType value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_Purpose()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='Purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Intended Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intended Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intended Use</em>' attribute.
	 * @see #setIntendedUse(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_IntendedUse()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='IntendedUse' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIntendedUse();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getIntendedUse <em>Intended Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Use</em>' attribute.
	 * @see #getIntendedUse()
	 * @generated
	 */
	void setIntendedUse(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_Scope()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='Scope' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_Revision()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='Revision' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Document Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Owner</em>' containment reference.
	 * @see #setDocumentOwner(DocumentOwnerType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_DocumentOwner()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DocumentOwner' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentOwnerType getDocumentOwner();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getDocumentOwner <em>Document Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Owner</em>' containment reference.
	 * @see #getDocumentOwner()
	 * @generated
	 */
	void setDocumentOwner(DocumentOwnerType value);

	/**
	 * Returns the value of the '<em><b>Editors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' containment reference.
	 * @see #setEditors(EditorsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_Editors()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Editors' namespace='##targetNamespace'"
	 * @generated
	 */
	EditorsType getEditors();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getEditors <em>Editors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editors</em>' containment reference.
	 * @see #getEditors()
	 * @generated
	 */
	void setEditors(EditorsType value);

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' containment reference.
	 * @see #setCreationTime(CreationTimeType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_CreationTime()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CreationTime' namespace='##targetNamespace'"
	 * @generated
	 */
	CreationTimeType getCreationTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getCreationTime <em>Creation Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' containment reference.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(CreationTimeType value);

	/**
	 * Returns the value of the '<em><b>Last Revision Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Revision Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Revision Time</em>' containment reference.
	 * @see #setLastRevisionTime(LastRevisionTimeType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_LastRevisionTime()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LastRevisionTime' namespace='##targetNamespace'"
	 * @generated
	 */
	LastRevisionTimeType getLastRevisionTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getLastRevisionTime <em>Last Revision Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Revision Time</em>' containment reference.
	 * @see #getLastRevisionTime()
	 * @generated
	 */
	void setLastRevisionTime(LastRevisionTimeType value);

	/**
	 * Returns the value of the '<em><b>Electronic Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Format</em>' containment reference.
	 * @see #setElectronicFormat(ElectronicFormatType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_ElectronicFormat()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ElectronicFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	ElectronicFormatType getElectronicFormat();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getElectronicFormat <em>Electronic Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Format</em>' containment reference.
	 * @see #getElectronicFormat()
	 * @generated
	 */
	void setElectronicFormat(ElectronicFormatType value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' containment reference.
	 * @see #setValidFrom(ValidFromType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_ValidFrom()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ValidFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidFromType getValidFrom();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getValidFrom <em>Valid From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' containment reference.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(ValidFromType value);

	/**
	 * Returns the value of the '<em><b>Valid Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Until</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Until</em>' containment reference.
	 * @see #setValidUntil(ValidUntilType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_ValidUntil()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ValidUntil' namespace='##targetNamespace'"
	 * @generated
	 */
	ValidUntilType getValidUntil();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getValidUntil <em>Valid Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Until</em>' containment reference.
	 * @see #getValidUntil()
	 * @generated
	 */
	void setValidUntil(ValidUntilType value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confidentiality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see #setConfidentiality(IfcDocumentConfidentialityEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_Confidentiality()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentConfidentialityEnumObject"
	 *        extendedMetaData="kind='element' name='Confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDocumentConfidentialityEnum getConfidentiality();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(IfcDocumentConfidentialityEnum value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(IfcDocumentStatusEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDocumentInformation_Status()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentStatusEnumObject"
	 *        extendedMetaData="kind='element' name='Status' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDocumentStatusEnum getStatus();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IfcDocumentStatusEnum value);

} // IfcDocumentInformation
