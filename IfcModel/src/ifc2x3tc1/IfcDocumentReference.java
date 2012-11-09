/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDocumentReference#getReferenceToDocument <em>Reference To Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDocumentReference()
 * @model
 * @generated
 */
public interface IfcDocumentReference extends IfcExternalReference, IfcDocumentSelect {
	/**
	 * Returns the value of the '<em><b>Reference To Document</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcDocumentInformation}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcDocumentInformation#getDocumentReferences <em>Document References</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference To Document</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference To Document</em>' reference list.
	 * @see #isSetReferenceToDocument()
	 * @see #unsetReferenceToDocument()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDocumentReference_ReferenceToDocument()
	 * @see ifc2x3tc1.IfcDocumentInformation#getDocumentReferences
	 * @model opposite="DocumentReferences" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcDocumentInformation> getReferenceToDocument();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDocumentReference#getReferenceToDocument <em>Reference To Document</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceToDocument()
	 * @see #getReferenceToDocument()
	 * @generated
	 */
	void unsetReferenceToDocument();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDocumentReference#getReferenceToDocument <em>Reference To Document</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference To Document</em>' reference list is set.
	 * @see #unsetReferenceToDocument()
	 * @see #getReferenceToDocument()
	 * @generated
	 */
	boolean isSetReferenceToDocument();

} // IfcDocumentReference
