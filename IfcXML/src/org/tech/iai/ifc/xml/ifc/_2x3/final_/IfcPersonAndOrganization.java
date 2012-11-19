/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Person And Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization#getThePerson <em>The Person</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization#getTheOrganization <em>The Organization</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPersonAndOrganization()
 * @model extendedMetaData="name='IfcPersonAndOrganization' kind='elementOnly'"
 * @generated
 */
public interface IfcPersonAndOrganization extends Entity {
	/**
	 * Returns the value of the '<em><b>The Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Person</em>' containment reference.
	 * @see #setThePerson(ThePersonType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPersonAndOrganization_ThePerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ThePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	ThePersonType getThePerson();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization#getThePerson <em>The Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Person</em>' containment reference.
	 * @see #getThePerson()
	 * @generated
	 */
	void setThePerson(ThePersonType value);

	/**
	 * Returns the value of the '<em><b>The Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Organization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Organization</em>' containment reference.
	 * @see #setTheOrganization(TheOrganizationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPersonAndOrganization_TheOrganization()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TheOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	TheOrganizationType getTheOrganization();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization#getTheOrganization <em>The Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Organization</em>' containment reference.
	 * @see #getTheOrganization()
	 * @generated
	 */
	void setTheOrganization(TheOrganizationType value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(RolesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPersonAndOrganization_Roles()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Roles' namespace='##targetNamespace'"
	 * @generated
	 */
	RolesType getRoles();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPersonAndOrganization#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(RolesType value);

} // IfcPersonAndOrganization
