/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcActor#getTheActor <em>The Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcActor()
 * @model extendedMetaData="name='IfcActor' kind='elementOnly'"
 * @generated
 */
public interface IfcActor extends IfcObject {
	/**
	 * Returns the value of the '<em><b>The Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Actor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Actor</em>' containment reference.
	 * @see #setTheActor(TheActorType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcActor_TheActor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TheActor' namespace='##targetNamespace'"
	 * @generated
	 */
	TheActorType getTheActor();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcActor#getTheActor <em>The Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Actor</em>' containment reference.
	 * @see #getTheActor()
	 * @generated
	 */
	void setTheActor(TheActorType value);

} // IfcActor
