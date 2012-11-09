/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDocumentInformationRelationship#getRelatedDocuments <em>Related Documents</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDocumentInformationRelationship()
 * @model
 * @generated
 */
public interface IfcDocumentInformationRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Relating Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcDocumentInformation#getIsPointer <em>Is Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Document</em>' reference.
	 * @see #setRelatingDocument(IfcDocumentInformation)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDocumentInformationRelationship_RelatingDocument()
	 * @see ifc2x3tc1.IfcDocumentInformation#getIsPointer
	 * @model opposite="IsPointer"
	 * @generated
	 */
	IfcDocumentInformation getRelatingDocument();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Document</em>' reference.
	 * @see #getRelatingDocument()
	 * @generated
	 */
	void setRelatingDocument(IfcDocumentInformation value);

	/**
	 * Returns the value of the '<em><b>Related Documents</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcDocumentInformation}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcDocumentInformation#getIsPointedTo <em>Is Pointed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Documents</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDocumentInformationRelationship_RelatedDocuments()
	 * @see ifc2x3tc1.IfcDocumentInformation#getIsPointedTo
	 * @model opposite="IsPointedTo"
	 * @generated
	 */
	EList<IfcDocumentInformation> getRelatedDocuments();

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #setRelationshipType(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDocumentInformationRelationship_RelationshipType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getRelationshipType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(String)
	 * @generated
	 */
	void unsetRelationshipType();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Type</em>' attribute is set.
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(String)
	 * @generated
	 */
	boolean isSetRelationshipType();

} // IfcDocumentInformationRelationship
