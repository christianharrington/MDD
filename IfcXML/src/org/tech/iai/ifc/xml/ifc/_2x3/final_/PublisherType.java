/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.PublisherType#getIfcOrganization <em>Ifc Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getPublisherType()
 * @model extendedMetaData="name='Publisher_._type' kind='elementOnly'"
 * @generated
 */
public interface PublisherType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Organization</em>' containment reference.
	 * @see #setIfcOrganization(IfcOrganization)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getPublisherType_IfcOrganization()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcOrganization getIfcOrganization();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.PublisherType#getIfcOrganization <em>Ifc Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Organization</em>' containment reference.
	 * @see #getIfcOrganization()
	 * @generated
	 */
	void setIfcOrganization(IfcOrganization value);

} // PublisherType
