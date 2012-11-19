/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencedDocumentType#getIfcDocumentReference <em>Ifc Document Reference</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencedDocumentType#getIfcDocumentInformation <em>Ifc Document Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getReferencedDocumentType()
 * @model extendedMetaData="name='ReferencedDocument_._type' kind='elementOnly'"
 * @generated
 */
public interface ReferencedDocumentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Document Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Document Reference</em>' containment reference.
	 * @see #setIfcDocumentReference(IfcDocumentReference)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getReferencedDocumentType_IfcDocumentReference()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDocumentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDocumentReference getIfcDocumentReference();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencedDocumentType#getIfcDocumentReference <em>Ifc Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Document Reference</em>' containment reference.
	 * @see #getIfcDocumentReference()
	 * @generated
	 */
	void setIfcDocumentReference(IfcDocumentReference value);

	/**
	 * Returns the value of the '<em><b>Ifc Document Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Document Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Document Information</em>' containment reference.
	 * @see #setIfcDocumentInformation(IfcDocumentInformation)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getReferencedDocumentType_IfcDocumentInformation()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDocumentInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDocumentInformation getIfcDocumentInformation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencedDocumentType#getIfcDocumentInformation <em>Ifc Document Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Document Information</em>' containment reference.
	 * @see #getIfcDocumentInformation()
	 * @generated
	 */
	void setIfcDocumentInformation(IfcDocumentInformation value);

} // ReferencedDocumentType
