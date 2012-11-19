/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Document Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingDocumentType1#getIfcDocumentInformation <em>Ifc Document Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingDocumentType1()
 * @model extendedMetaData="name='RelatingDocument_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingDocumentType1 extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingDocumentType1_IfcDocumentInformation()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDocumentInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDocumentInformation getIfcDocumentInformation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingDocumentType1#getIfcDocumentInformation <em>Ifc Document Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Document Information</em>' containment reference.
	 * @see #getIfcDocumentInformation()
	 * @generated
	 */
	void setIfcDocumentInformation(IfcDocumentInformation value);

} // RelatingDocumentType1
