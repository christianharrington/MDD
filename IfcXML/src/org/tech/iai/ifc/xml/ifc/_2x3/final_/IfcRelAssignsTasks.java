/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns Tasks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsTasks()
 * @model extendedMetaData="name='IfcRelAssignsTasks' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssignsTasks extends IfcRelAssignsToControl {
	/**
	 * Returns the value of the '<em><b>Time For Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time For Task</em>' containment reference.
	 * @see #setTimeForTask(TimeForTaskType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsTasks_TimeForTask()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TimeForTask' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeForTaskType getTimeForTask();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Task</em>' containment reference.
	 * @see #getTimeForTask()
	 * @generated
	 */
	void setTimeForTask(TimeForTaskType value);

} // IfcRelAssignsTasks
