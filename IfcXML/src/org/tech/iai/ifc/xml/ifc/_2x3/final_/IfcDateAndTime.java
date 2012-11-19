/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Date And Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime#getDateComponent <em>Date Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime#getTimeComponent <em>Time Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDateAndTime()
 * @model extendedMetaData="name='IfcDateAndTime' kind='elementOnly'"
 * @generated
 */
public interface IfcDateAndTime extends Entity {
	/**
	 * Returns the value of the '<em><b>Date Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Component</em>' containment reference.
	 * @see #setDateComponent(DateComponentType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDateAndTime_DateComponent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DateComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	DateComponentType getDateComponent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime#getDateComponent <em>Date Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Component</em>' containment reference.
	 * @see #getDateComponent()
	 * @generated
	 */
	void setDateComponent(DateComponentType value);

	/**
	 * Returns the value of the '<em><b>Time Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Component</em>' containment reference.
	 * @see #setTimeComponent(TimeComponentType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDateAndTime_TimeComponent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeComponentType getTimeComponent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime#getTimeComponent <em>Time Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Component</em>' containment reference.
	 * @see #getTimeComponent()
	 * @generated
	 */
	void setTimeComponent(TimeComponentType value);

} // IfcDateAndTime
