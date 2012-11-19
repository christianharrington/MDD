/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owning User Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OwningUserType#getIfcPersonAndOrganization <em>Ifc Person And Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOwningUserType()
 * @model extendedMetaData="name='OwningUser_._type' kind='elementOnly'"
 * @generated
 */
public interface OwningUserType extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOwningUserType_IfcPersonAndOrganization()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcPersonAndOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPersonAndOrganization getIfcPersonAndOrganization();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OwningUserType#getIfcPersonAndOrganization <em>Ifc Person And Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Person And Organization</em>' containment reference.
	 * @see #getIfcPersonAndOrganization()
	 * @generated
	 */
	void setIfcPersonAndOrganization(IfcPersonAndOrganization value);

} // OwningUserType
