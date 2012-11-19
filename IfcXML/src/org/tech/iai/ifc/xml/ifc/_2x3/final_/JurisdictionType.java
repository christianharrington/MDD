/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jurisdiction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.JurisdictionType#getIfcOrganization <em>Ifc Organization</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.JurisdictionType#getIfcPerson <em>Ifc Person</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.JurisdictionType#getIfcPersonAndOrganization <em>Ifc Person And Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getJurisdictionType()
 * @model extendedMetaData="name='Jurisdiction_._type' kind='elementOnly'"
 * @generated
 */
public interface JurisdictionType extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getJurisdictionType_IfcOrganization()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcOrganization getIfcOrganization();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.JurisdictionType#getIfcOrganization <em>Ifc Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Organization</em>' containment reference.
	 * @see #getIfcOrganization()
	 * @generated
	 */
	void setIfcOrganization(IfcOrganization value);

	/**
	 * Returns the value of the '<em><b>Ifc Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Person</em>' containment reference.
	 * @see #setIfcPerson(IfcPerson)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getJurisdictionType_IfcPerson()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPerson getIfcPerson();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.JurisdictionType#getIfcPerson <em>Ifc Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Person</em>' containment reference.
	 * @see #getIfcPerson()
	 * @generated
	 */
	void setIfcPerson(IfcPerson value);

	/**
	 * Returns the value of the '<em><b>Ifc Person And Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Person And Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Person And Organization</em>' containment reference.
	 * @see #setIfcPersonAndOrganization(IfcPersonAndOrganization)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getJurisdictionType_IfcPersonAndOrganization()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcPersonAndOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPersonAndOrganization getIfcPersonAndOrganization();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.JurisdictionType#getIfcPersonAndOrganization <em>Ifc Person And Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Person And Organization</em>' containment reference.
	 * @see #getIfcPersonAndOrganization()
	 * @generated
	 */
	void setIfcPersonAndOrganization(IfcPersonAndOrganization value);

} // JurisdictionType
