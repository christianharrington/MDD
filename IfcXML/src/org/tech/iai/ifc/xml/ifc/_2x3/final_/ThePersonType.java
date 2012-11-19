/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>The Person Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ThePersonType#getIfcPerson <em>Ifc Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getThePersonType()
 * @model extendedMetaData="name='ThePerson_._type' kind='elementOnly'"
 * @generated
 */
public interface ThePersonType extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getThePersonType_IfcPerson()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPerson getIfcPerson();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ThePersonType#getIfcPerson <em>Ifc Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Person</em>' containment reference.
	 * @see #getIfcPerson()
	 * @generated
	 */
	void setIfcPerson(IfcPerson value);

} // ThePersonType
