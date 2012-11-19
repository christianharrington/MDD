/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owning Application Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OwningApplicationType#getIfcApplication <em>Ifc Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOwningApplicationType()
 * @model extendedMetaData="name='OwningApplication_._type' kind='elementOnly'"
 * @generated
 */
public interface OwningApplicationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Application</em>' containment reference.
	 * @see #setIfcApplication(IfcApplication)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOwningApplicationType_IfcApplication()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcApplication' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcApplication getIfcApplication();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OwningApplicationType#getIfcApplication <em>Ifc Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Application</em>' containment reference.
	 * @see #getIfcApplication()
	 * @generated
	 */
	void setIfcApplication(IfcApplication value);

} // OwningApplicationType
