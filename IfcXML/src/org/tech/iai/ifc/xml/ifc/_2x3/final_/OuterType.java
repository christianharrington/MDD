/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OuterType#getIfcClosedShell <em>Ifc Closed Shell</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOuterType()
 * @model extendedMetaData="name='Outer_._type' kind='elementOnly'"
 * @generated
 */
public interface OuterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Closed Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Closed Shell</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Closed Shell</em>' containment reference.
	 * @see #setIfcClosedShell(IfcClosedShell)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOuterType_IfcClosedShell()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcClosedShell' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcClosedShell getIfcClosedShell();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OuterType#getIfcClosedShell <em>Ifc Closed Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Closed Shell</em>' containment reference.
	 * @see #getIfcClosedShell()
	 * @generated
	 */
	void setIfcClosedShell(IfcClosedShell value);

} // OuterType
