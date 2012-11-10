/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Calendar Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcCalendarDate#getDayComponent <em>Day Component</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcCalendarDate#getMonthComponent <em>Month Component</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcCalendarDate#getYearComponent <em>Year Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCalendarDate()
 * @model
 * @generated
 */
public interface IfcCalendarDate extends IfcDateTimeSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Day Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Component</em>' attribute.
	 * @see #setDayComponent(int)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCalendarDate_DayComponent()
	 * @model
	 * @generated
	 */
	int getDayComponent();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCalendarDate#getDayComponent <em>Day Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Component</em>' attribute.
	 * @see #getDayComponent()
	 * @generated
	 */
	void setDayComponent(int value);

	/**
	 * Returns the value of the '<em><b>Month Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month Component</em>' attribute.
	 * @see #setMonthComponent(int)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCalendarDate_MonthComponent()
	 * @model
	 * @generated
	 */
	int getMonthComponent();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCalendarDate#getMonthComponent <em>Month Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month Component</em>' attribute.
	 * @see #getMonthComponent()
	 * @generated
	 */
	void setMonthComponent(int value);

	/**
	 * Returns the value of the '<em><b>Year Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Component</em>' attribute.
	 * @see #setYearComponent(int)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCalendarDate_YearComponent()
	 * @model
	 * @generated
	 */
	int getYearComponent();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcCalendarDate#getYearComponent <em>Year Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Component</em>' attribute.
	 * @see #getYearComponent()
	 * @generated
	 */
	void setYearComponent(int value);

} // IfcCalendarDate
