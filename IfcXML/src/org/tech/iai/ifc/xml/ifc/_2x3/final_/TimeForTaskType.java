/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time For Task Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeForTaskType#getIfcScheduleTimeControl <em>Ifc Schedule Time Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeForTaskType()
 * @model extendedMetaData="name='TimeForTask_._type' kind='elementOnly'"
 * @generated
 */
public interface TimeForTaskType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Schedule Time Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Schedule Time Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Schedule Time Control</em>' containment reference.
	 * @see #setIfcScheduleTimeControl(IfcScheduleTimeControl)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeForTaskType_IfcScheduleTimeControl()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcScheduleTimeControl' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcScheduleTimeControl getIfcScheduleTimeControl();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeForTaskType#getIfcScheduleTimeControl <em>Ifc Schedule Time Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Schedule Time Control</em>' containment reference.
	 * @see #getIfcScheduleTimeControl()
	 * @generated
	 */
	void setIfcScheduleTimeControl(IfcScheduleTimeControl value);

} // TimeForTaskType
