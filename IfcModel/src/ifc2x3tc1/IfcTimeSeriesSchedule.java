/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Time Series Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTimeSeriesSchedule#getApplicableDates <em>Applicable Dates</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTimeSeriesSchedule#getTimeSeriesScheduleType <em>Time Series Schedule Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTimeSeriesSchedule#getTimeSeries <em>Time Series</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTimeSeriesSchedule()
 * @model
 * @generated
 */
public interface IfcTimeSeriesSchedule extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Applicable Dates</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcDateTimeSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Dates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Dates</em>' reference list.
	 * @see #isSetApplicableDates()
	 * @see #unsetApplicableDates()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTimeSeriesSchedule_ApplicableDates()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcDateTimeSelect> getApplicableDates();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTimeSeriesSchedule#getApplicableDates <em>Applicable Dates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplicableDates()
	 * @see #getApplicableDates()
	 * @generated
	 */
	void unsetApplicableDates();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTimeSeriesSchedule#getApplicableDates <em>Applicable Dates</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applicable Dates</em>' reference list is set.
	 * @see #unsetApplicableDates()
	 * @see #getApplicableDates()
	 * @generated
	 */
	boolean isSetApplicableDates();

	/**
	 * Returns the value of the '<em><b>Time Series Schedule Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcTimeSeriesScheduleTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series Schedule Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series Schedule Type</em>' attribute.
	 * @see ifc2x3tc1.IfcTimeSeriesScheduleTypeEnum
	 * @see #setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTimeSeriesSchedule_TimeSeriesScheduleType()
	 * @model
	 * @generated
	 */
	IfcTimeSeriesScheduleTypeEnum getTimeSeriesScheduleType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTimeSeriesSchedule#getTimeSeriesScheduleType <em>Time Series Schedule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Series Schedule Type</em>' attribute.
	 * @see ifc2x3tc1.IfcTimeSeriesScheduleTypeEnum
	 * @see #getTimeSeriesScheduleType()
	 * @generated
	 */
	void setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series</em>' reference.
	 * @see #setTimeSeries(IfcTimeSeries)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTimeSeriesSchedule_TimeSeries()
	 * @model
	 * @generated
	 */
	IfcTimeSeries getTimeSeries();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTimeSeriesSchedule#getTimeSeries <em>Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Series</em>' reference.
	 * @see #getTimeSeries()
	 * @generated
	 */
	void setTimeSeries(IfcTimeSeries value);

} // IfcTimeSeriesSchedule
