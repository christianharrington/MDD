/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns Tasks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsTasks()
 * @model
 * @generated
 */
public interface IfcRelAssignsTasks extends IfcRelAssignsToControl {
	/**
	 * Returns the value of the '<em><b>Time For Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcScheduleTimeControl#getScheduleTimeControlAssigned <em>Schedule Time Control Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time For Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time For Task</em>' reference.
	 * @see #isSetTimeForTask()
	 * @see #unsetTimeForTask()
	 * @see #setTimeForTask(IfcScheduleTimeControl)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsTasks_TimeForTask()
	 * @see ifc2x3tc1.IfcScheduleTimeControl#getScheduleTimeControlAssigned
	 * @model opposite="ScheduleTimeControlAssigned" unsettable="true"
	 * @generated
	 */
	IfcScheduleTimeControl getTimeForTask();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time For Task</em>' reference.
	 * @see #isSetTimeForTask()
	 * @see #unsetTimeForTask()
	 * @see #getTimeForTask()
	 * @generated
	 */
	void setTimeForTask(IfcScheduleTimeControl value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeForTask()
	 * @see #getTimeForTask()
	 * @see #setTimeForTask(IfcScheduleTimeControl)
	 * @generated
	 */
	void unsetTimeForTask();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRelAssignsTasks#getTimeForTask <em>Time For Task</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time For Task</em>' reference is set.
	 * @see #unsetTimeForTask()
	 * @see #getTimeForTask()
	 * @see #setTimeForTask(IfcScheduleTimeControl)
	 * @generated
	 */
	boolean isSetTimeForTask();

} // IfcRelAssignsTasks
