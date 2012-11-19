/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acting Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ActingRoleType#getIfcActorRole <em>Ifc Actor Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getActingRoleType()
 * @model extendedMetaData="name='ActingRole_._type' kind='elementOnly'"
 * @generated
 */
public interface ActingRoleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Actor Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Actor Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Actor Role</em>' containment reference.
	 * @see #setIfcActorRole(IfcActorRole)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getActingRoleType_IfcActorRole()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcActorRole' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcActorRole getIfcActorRole();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ActingRoleType#getIfcActorRole <em>Ifc Actor Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Actor Role</em>' containment reference.
	 * @see #getIfcActorRole()
	 * @generated
	 */
	void setIfcActorRole(IfcActorRole value);

} // ActingRoleType
