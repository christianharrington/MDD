/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeComponentType#getIfcLocalTime <em>Ifc Local Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeComponentType()
 * @model extendedMetaData="name='TimeComponent_._type' kind='elementOnly'"
 * @generated
 */
public interface TimeComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Local Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Local Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Local Time</em>' containment reference.
	 * @see #setIfcLocalTime(IfcLocalTime)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeComponentType_IfcLocalTime()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcLocalTime' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcLocalTime getIfcLocalTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeComponentType#getIfcLocalTime <em>Ifc Local Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Local Time</em>' containment reference.
	 * @see #getIfcLocalTime()
	 * @generated
	 */
	void setIfcLocalTime(IfcLocalTime value);

} // TimeComponentType
