/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finish Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FinishTimeType#getIfcCalendarDate <em>Ifc Calendar Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FinishTimeType#getIfcLocalTime <em>Ifc Local Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FinishTimeType#getIfcDateAndTime <em>Ifc Date And Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFinishTimeType()
 * @model extendedMetaData="name='FinishTime_._type' kind='elementOnly'"
 * @generated
 */
public interface FinishTimeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Calendar Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Calendar Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Calendar Date</em>' containment reference.
	 * @see #setIfcCalendarDate(IfcCalendarDate)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFinishTimeType_IfcCalendarDate()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCalendarDate' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCalendarDate getIfcCalendarDate();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FinishTimeType#getIfcCalendarDate <em>Ifc Calendar Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Calendar Date</em>' containment reference.
	 * @see #getIfcCalendarDate()
	 * @generated
	 */
	void setIfcCalendarDate(IfcCalendarDate value);

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFinishTimeType_IfcLocalTime()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcLocalTime' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcLocalTime getIfcLocalTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FinishTimeType#getIfcLocalTime <em>Ifc Local Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Local Time</em>' containment reference.
	 * @see #getIfcLocalTime()
	 * @generated
	 */
	void setIfcLocalTime(IfcLocalTime value);

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFinishTimeType_IfcDateAndTime()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDateAndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDateAndTime getIfcDateAndTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FinishTimeType#getIfcDateAndTime <em>Ifc Date And Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Date And Time</em>' containment reference.
	 * @see #getIfcDateAndTime()
	 * @generated
	 */
	void setIfcDateAndTime(IfcDateAndTime value);

} // FinishTimeType
