/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Date And Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDateAndTime#getDateComponent <em>Date Component</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDateAndTime#getTimeComponent <em>Time Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDateAndTime()
 * @model
 * @generated
 */
public interface IfcDateAndTime extends IfcDateTimeSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Date Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Component</em>' reference.
	 * @see #setDateComponent(IfcCalendarDate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDateAndTime_DateComponent()
	 * @model
	 * @generated
	 */
	IfcCalendarDate getDateComponent();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDateAndTime#getDateComponent <em>Date Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Component</em>' reference.
	 * @see #getDateComponent()
	 * @generated
	 */
	void setDateComponent(IfcCalendarDate value);

	/**
	 * Returns the value of the '<em><b>Time Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Component</em>' reference.
	 * @see #setTimeComponent(IfcLocalTime)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDateAndTime_TimeComponent()
	 * @model
	 * @generated
	 */
	IfcLocalTime getTimeComponent();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDateAndTime#getTimeComponent <em>Time Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Component</em>' reference.
	 * @see #getTimeComponent()
	 * @generated
	 */
	void setTimeComponent(IfcLocalTime value);

} // IfcDateAndTime
