/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShell#getIfcClosedShell <em>Ifc Closed Shell</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShell#getIfcOpenShell <em>Ifc Open Shell</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShell()
 * @model extendedMetaData="name='IfcShell' kind='elementOnly'"
 * @generated
 */
public interface IfcShell extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShell_IfcClosedShell()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcClosedShell' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcClosedShell getIfcClosedShell();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShell#getIfcClosedShell <em>Ifc Closed Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Closed Shell</em>' containment reference.
	 * @see #getIfcClosedShell()
	 * @generated
	 */
	void setIfcClosedShell(IfcClosedShell value);

	/**
	 * Returns the value of the '<em><b>Ifc Open Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Open Shell</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Open Shell</em>' containment reference.
	 * @see #setIfcOpenShell(IfcOpenShell)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShell_IfcOpenShell()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcOpenShell' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcOpenShell getIfcOpenShell();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShell#getIfcOpenShell <em>Ifc Open Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Open Shell</em>' containment reference.
	 * @see #getIfcOpenShell()
	 * @generated
	 */
	void setIfcOpenShell(IfcOpenShell value);

} // IfcShell
