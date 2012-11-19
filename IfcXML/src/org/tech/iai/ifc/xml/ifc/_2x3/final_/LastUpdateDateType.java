/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Last Update Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LastUpdateDateType#getIfcCalendarDate <em>Ifc Calendar Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLastUpdateDateType()
 * @model extendedMetaData="name='LastUpdateDate_._type' kind='elementOnly'"
 * @generated
 */
public interface LastUpdateDateType extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLastUpdateDateType_IfcCalendarDate()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCalendarDate' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCalendarDate getIfcCalendarDate();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LastUpdateDateType#getIfcCalendarDate <em>Ifc Calendar Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Calendar Date</em>' containment reference.
	 * @see #getIfcCalendarDate()
	 * @generated
	 */
	void setIfcCalendarDate(IfcCalendarDate value);

} // LastUpdateDateType
