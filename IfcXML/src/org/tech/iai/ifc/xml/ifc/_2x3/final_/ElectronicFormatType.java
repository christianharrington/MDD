/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electronic Format Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ElectronicFormatType#getIfcDocumentElectronicFormat <em>Ifc Document Electronic Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getElectronicFormatType()
 * @model extendedMetaData="name='ElectronicFormat_._type' kind='elementOnly'"
 * @generated
 */
public interface ElectronicFormatType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Document Electronic Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Document Electronic Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Document Electronic Format</em>' containment reference.
	 * @see #setIfcDocumentElectronicFormat(IfcDocumentElectronicFormat)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getElectronicFormatType_IfcDocumentElectronicFormat()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDocumentElectronicFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDocumentElectronicFormat getIfcDocumentElectronicFormat();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ElectronicFormatType#getIfcDocumentElectronicFormat <em>Ifc Document Electronic Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Document Electronic Format</em>' containment reference.
	 * @see #getIfcDocumentElectronicFormat()
	 * @generated
	 */
	void setIfcDocumentElectronicFormat(IfcDocumentElectronicFormat value);

} // ElectronicFormatType
