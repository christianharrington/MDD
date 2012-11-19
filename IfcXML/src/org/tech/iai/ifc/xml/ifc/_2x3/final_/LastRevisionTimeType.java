/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Last Revision Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LastRevisionTimeType#getIfcDateAndTime <em>Ifc Date And Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLastRevisionTimeType()
 * @model extendedMetaData="name='LastRevisionTime_._type' kind='elementOnly'"
 * @generated
 */
public interface LastRevisionTimeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Date And Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Date And Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Date And Time</em>' containment reference.
	 * @see #setIfcDateAndTime(IfcDateAndTime)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLastRevisionTimeType_IfcDateAndTime()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDateAndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDateAndTime getIfcDateAndTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LastRevisionTimeType#getIfcDateAndTime <em>Ifc Date And Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Date And Time</em>' containment reference.
	 * @see #getIfcDateAndTime()
	 * @generated
	 */
	void setIfcDateAndTime(IfcDateAndTime value);

} // LastRevisionTimeType
