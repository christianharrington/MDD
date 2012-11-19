/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToActor#getRelatingActor <em>Relating Actor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToActor#getActingRole <em>Acting Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToActor()
 * @model extendedMetaData="name='IfcRelAssignsToActor' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssignsToActor extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Actor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Actor</em>' containment reference.
	 * @see #setRelatingActor(RelatingActorType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToActor_RelatingActor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingActor' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingActorType getRelatingActor();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToActor#getRelatingActor <em>Relating Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Actor</em>' containment reference.
	 * @see #getRelatingActor()
	 * @generated
	 */
	void setRelatingActor(RelatingActorType value);

	/**
	 * Returns the value of the '<em><b>Acting Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acting Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acting Role</em>' containment reference.
	 * @see #setActingRole(ActingRoleType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToActor_ActingRole()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ActingRole' namespace='##targetNamespace'"
	 * @generated
	 */
	ActingRoleType getActingRole();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToActor#getActingRole <em>Acting Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acting Role</em>' containment reference.
	 * @see #getActingRole()
	 * @generated
	 */
	void setActingRole(ActingRoleType value);

} // IfcRelAssignsToActor
