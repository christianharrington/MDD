/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDateTimeSelect;
import ifc2x3tc1.IfcRelAssignsTasks;
import ifc2x3tc1.IfcScheduleTimeControl;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Schedule Time Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getEarlyStart <em>Early Start</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getLateStart <em>Late Start</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getScheduleStart <em>Schedule Start</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getEarlyFinish <em>Early Finish</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getLateFinish <em>Late Finish</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getScheduleFinish <em>Schedule Finish</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getScheduleDuration <em>Schedule Duration</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getScheduleDurationAsString <em>Schedule Duration As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getActualDuration <em>Actual Duration</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getActualDurationAsString <em>Actual Duration As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getRemainingTime <em>Remaining Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getRemainingTimeAsString <em>Remaining Time As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getFreeFloat <em>Free Float</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getFreeFloatAsString <em>Free Float As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getTotalFloatAsString <em>Total Float As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getIsCritical <em>Is Critical</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getStatusTime <em>Status Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getStartFloat <em>Start Float</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getStartFloatAsString <em>Start Float As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getFinishFloat <em>Finish Float</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getFinishFloatAsString <em>Finish Float As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getCompletionAsString <em>Completion As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcScheduleTimeControlImpl#getScheduleTimeControlAssigned <em>Schedule Time Control Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcScheduleTimeControlImpl extends IfcControlImpl implements IfcScheduleTimeControl {
	/**
	 * The cached value of the '{@link #getActualStart() <em>Actual Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualStart()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect actualStart;

	/**
	 * This is true if the Actual Start reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actualStartESet;

	/**
	 * The cached value of the '{@link #getEarlyStart() <em>Early Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyStart()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect earlyStart;

	/**
	 * This is true if the Early Start reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean earlyStartESet;

	/**
	 * The cached value of the '{@link #getLateStart() <em>Late Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateStart()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect lateStart;

	/**
	 * This is true if the Late Start reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lateStartESet;

	/**
	 * The cached value of the '{@link #getScheduleStart() <em>Schedule Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleStart()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect scheduleStart;

	/**
	 * This is true if the Schedule Start reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scheduleStartESet;

	/**
	 * The cached value of the '{@link #getActualFinish() <em>Actual Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualFinish()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect actualFinish;

	/**
	 * This is true if the Actual Finish reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actualFinishESet;

	/**
	 * The cached value of the '{@link #getEarlyFinish() <em>Early Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyFinish()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect earlyFinish;

	/**
	 * This is true if the Early Finish reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean earlyFinishESet;

	/**
	 * The cached value of the '{@link #getLateFinish() <em>Late Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateFinish()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect lateFinish;

	/**
	 * This is true if the Late Finish reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lateFinishESet;

	/**
	 * The cached value of the '{@link #getScheduleFinish() <em>Schedule Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleFinish()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect scheduleFinish;

	/**
	 * This is true if the Schedule Finish reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scheduleFinishESet;

	/**
	 * The default value of the '{@link #getScheduleDuration() <em>Schedule Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double SCHEDULE_DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScheduleDuration() <em>Schedule Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDuration()
	 * @generated
	 * @ordered
	 */
	protected double scheduleDuration = SCHEDULE_DURATION_EDEFAULT;

	/**
	 * This is true if the Schedule Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scheduleDurationESet;

	/**
	 * The default value of the '{@link #getScheduleDurationAsString() <em>Schedule Duration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDurationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_DURATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleDurationAsString() <em>Schedule Duration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDurationAsString()
	 * @generated
	 * @ordered
	 */
	protected String scheduleDurationAsString = SCHEDULE_DURATION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Schedule Duration As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scheduleDurationAsStringESet;

	/**
	 * The default value of the '{@link #getActualDuration() <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualDuration() <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDuration()
	 * @generated
	 * @ordered
	 */
	protected double actualDuration = ACTUAL_DURATION_EDEFAULT;

	/**
	 * This is true if the Actual Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actualDurationESet;

	/**
	 * The default value of the '{@link #getActualDurationAsString() <em>Actual Duration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDurationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_DURATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualDurationAsString() <em>Actual Duration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDurationAsString()
	 * @generated
	 * @ordered
	 */
	protected String actualDurationAsString = ACTUAL_DURATION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Actual Duration As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actualDurationAsStringESet;

	/**
	 * The default value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double REMAINING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRemainingTime() <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTime()
	 * @generated
	 * @ordered
	 */
	protected double remainingTime = REMAINING_TIME_EDEFAULT;

	/**
	 * This is true if the Remaining Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remainingTimeESet;

	/**
	 * The default value of the '{@link #getRemainingTimeAsString() <em>Remaining Time As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTimeAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String REMAINING_TIME_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingTimeAsString() <em>Remaining Time As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingTimeAsString()
	 * @generated
	 * @ordered
	 */
	protected String remainingTimeAsString = REMAINING_TIME_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Remaining Time As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean remainingTimeAsStringESet;

	/**
	 * The default value of the '{@link #getFreeFloat() <em>Free Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeFloat()
	 * @generated
	 * @ordered
	 */
	protected static final double FREE_FLOAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFreeFloat() <em>Free Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeFloat()
	 * @generated
	 * @ordered
	 */
	protected double freeFloat = FREE_FLOAT_EDEFAULT;

	/**
	 * This is true if the Free Float attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean freeFloatESet;

	/**
	 * The default value of the '{@link #getFreeFloatAsString() <em>Free Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FREE_FLOAT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreeFloatAsString() <em>Free Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected String freeFloatAsString = FREE_FLOAT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Free Float As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean freeFloatAsStringESet;

	/**
	 * The default value of the '{@link #getTotalFloat() <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloat()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_FLOAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalFloat() <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloat()
	 * @generated
	 * @ordered
	 */
	protected double totalFloat = TOTAL_FLOAT_EDEFAULT;

	/**
	 * This is true if the Total Float attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalFloatESet;

	/**
	 * The default value of the '{@link #getTotalFloatAsString() <em>Total Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_FLOAT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalFloatAsString() <em>Total Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected String totalFloatAsString = TOTAL_FLOAT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Total Float As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean totalFloatAsStringESet;

	/**
	 * The default value of the '{@link #getIsCritical() <em>Is Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCritical()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate IS_CRITICAL_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getIsCritical() <em>Is Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCritical()
	 * @generated
	 * @ordered
	 */
	protected Tristate isCritical = IS_CRITICAL_EDEFAULT;

	/**
	 * This is true if the Is Critical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCriticalESet;

	/**
	 * The cached value of the '{@link #getStatusTime() <em>Status Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateTimeSelect statusTime;

	/**
	 * This is true if the Status Time reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusTimeESet;

	/**
	 * The default value of the '{@link #getStartFloat() <em>Start Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFloat()
	 * @generated
	 * @ordered
	 */
	protected static final double START_FLOAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStartFloat() <em>Start Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFloat()
	 * @generated
	 * @ordered
	 */
	protected double startFloat = START_FLOAT_EDEFAULT;

	/**
	 * This is true if the Start Float attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startFloatESet;

	/**
	 * The default value of the '{@link #getStartFloatAsString() <em>Start Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String START_FLOAT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartFloatAsString() <em>Start Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected String startFloatAsString = START_FLOAT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Start Float As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startFloatAsStringESet;

	/**
	 * The default value of the '{@link #getFinishFloat() <em>Finish Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishFloat()
	 * @generated
	 * @ordered
	 */
	protected static final double FINISH_FLOAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFinishFloat() <em>Finish Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishFloat()
	 * @generated
	 * @ordered
	 */
	protected double finishFloat = FINISH_FLOAT_EDEFAULT;

	/**
	 * This is true if the Finish Float attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finishFloatESet;

	/**
	 * The default value of the '{@link #getFinishFloatAsString() <em>Finish Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FINISH_FLOAT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinishFloatAsString() <em>Finish Float As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishFloatAsString()
	 * @generated
	 * @ordered
	 */
	protected String finishFloatAsString = FINISH_FLOAT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Finish Float As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finishFloatAsStringESet;

	/**
	 * The default value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPLETION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected double completion = COMPLETION_EDEFAULT;

	/**
	 * This is true if the Completion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean completionESet;

	/**
	 * The default value of the '{@link #getCompletionAsString() <em>Completion As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletionAsString() <em>Completion As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionAsString()
	 * @generated
	 * @ordered
	 */
	protected String completionAsString = COMPLETION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Completion As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean completionAsStringESet;

	/**
	 * The cached value of the '{@link #getScheduleTimeControlAssigned() <em>Schedule Time Control Assigned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleTimeControlAssigned()
	 * @generated
	 * @ordered
	 */
	protected IfcRelAssignsTasks scheduleTimeControlAssigned;

	/**
	 * This is true if the Schedule Time Control Assigned reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scheduleTimeControlAssignedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcScheduleTimeControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcScheduleTimeControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getActualStart() {
		if (actualStart != null && actualStart.eIsProxy()) {
			InternalEObject oldActualStart = (InternalEObject)actualStart;
			actualStart = (IfcDateTimeSelect)eResolveProxy(oldActualStart);
			if (actualStart != oldActualStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START, oldActualStart, actualStart));
			}
		}
		return actualStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetActualStart() {
		return actualStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualStart(IfcDateTimeSelect newActualStart) {
		IfcDateTimeSelect oldActualStart = actualStart;
		actualStart = newActualStart;
		boolean oldActualStartESet = actualStartESet;
		actualStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START, oldActualStart, actualStart, !oldActualStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActualStart() {
		IfcDateTimeSelect oldActualStart = actualStart;
		boolean oldActualStartESet = actualStartESet;
		actualStart = null;
		actualStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START, oldActualStart, null, oldActualStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActualStart() {
		return actualStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getEarlyStart() {
		if (earlyStart != null && earlyStart.eIsProxy()) {
			InternalEObject oldEarlyStart = (InternalEObject)earlyStart;
			earlyStart = (IfcDateTimeSelect)eResolveProxy(oldEarlyStart);
			if (earlyStart != oldEarlyStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_START, oldEarlyStart, earlyStart));
			}
		}
		return earlyStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetEarlyStart() {
		return earlyStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyStart(IfcDateTimeSelect newEarlyStart) {
		IfcDateTimeSelect oldEarlyStart = earlyStart;
		earlyStart = newEarlyStart;
		boolean oldEarlyStartESet = earlyStartESet;
		earlyStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_START, oldEarlyStart, earlyStart, !oldEarlyStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEarlyStart() {
		IfcDateTimeSelect oldEarlyStart = earlyStart;
		boolean oldEarlyStartESet = earlyStartESet;
		earlyStart = null;
		earlyStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_START, oldEarlyStart, null, oldEarlyStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEarlyStart() {
		return earlyStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getLateStart() {
		if (lateStart != null && lateStart.eIsProxy()) {
			InternalEObject oldLateStart = (InternalEObject)lateStart;
			lateStart = (IfcDateTimeSelect)eResolveProxy(oldLateStart);
			if (lateStart != oldLateStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_START, oldLateStart, lateStart));
			}
		}
		return lateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetLateStart() {
		return lateStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLateStart(IfcDateTimeSelect newLateStart) {
		IfcDateTimeSelect oldLateStart = lateStart;
		lateStart = newLateStart;
		boolean oldLateStartESet = lateStartESet;
		lateStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_START, oldLateStart, lateStart, !oldLateStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLateStart() {
		IfcDateTimeSelect oldLateStart = lateStart;
		boolean oldLateStartESet = lateStartESet;
		lateStart = null;
		lateStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_START, oldLateStart, null, oldLateStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLateStart() {
		return lateStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getScheduleStart() {
		if (scheduleStart != null && scheduleStart.eIsProxy()) {
			InternalEObject oldScheduleStart = (InternalEObject)scheduleStart;
			scheduleStart = (IfcDateTimeSelect)eResolveProxy(oldScheduleStart);
			if (scheduleStart != oldScheduleStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START, oldScheduleStart, scheduleStart));
			}
		}
		return scheduleStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetScheduleStart() {
		return scheduleStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleStart(IfcDateTimeSelect newScheduleStart) {
		IfcDateTimeSelect oldScheduleStart = scheduleStart;
		scheduleStart = newScheduleStart;
		boolean oldScheduleStartESet = scheduleStartESet;
		scheduleStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START, oldScheduleStart, scheduleStart, !oldScheduleStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScheduleStart() {
		IfcDateTimeSelect oldScheduleStart = scheduleStart;
		boolean oldScheduleStartESet = scheduleStartESet;
		scheduleStart = null;
		scheduleStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START, oldScheduleStart, null, oldScheduleStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScheduleStart() {
		return scheduleStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getActualFinish() {
		if (actualFinish != null && actualFinish.eIsProxy()) {
			InternalEObject oldActualFinish = (InternalEObject)actualFinish;
			actualFinish = (IfcDateTimeSelect)eResolveProxy(oldActualFinish);
			if (actualFinish != oldActualFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH, oldActualFinish, actualFinish));
			}
		}
		return actualFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetActualFinish() {
		return actualFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualFinish(IfcDateTimeSelect newActualFinish) {
		IfcDateTimeSelect oldActualFinish = actualFinish;
		actualFinish = newActualFinish;
		boolean oldActualFinishESet = actualFinishESet;
		actualFinishESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH, oldActualFinish, actualFinish, !oldActualFinishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActualFinish() {
		IfcDateTimeSelect oldActualFinish = actualFinish;
		boolean oldActualFinishESet = actualFinishESet;
		actualFinish = null;
		actualFinishESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH, oldActualFinish, null, oldActualFinishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActualFinish() {
		return actualFinishESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getEarlyFinish() {
		if (earlyFinish != null && earlyFinish.eIsProxy()) {
			InternalEObject oldEarlyFinish = (InternalEObject)earlyFinish;
			earlyFinish = (IfcDateTimeSelect)eResolveProxy(oldEarlyFinish);
			if (earlyFinish != oldEarlyFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH, oldEarlyFinish, earlyFinish));
			}
		}
		return earlyFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetEarlyFinish() {
		return earlyFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyFinish(IfcDateTimeSelect newEarlyFinish) {
		IfcDateTimeSelect oldEarlyFinish = earlyFinish;
		earlyFinish = newEarlyFinish;
		boolean oldEarlyFinishESet = earlyFinishESet;
		earlyFinishESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH, oldEarlyFinish, earlyFinish, !oldEarlyFinishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEarlyFinish() {
		IfcDateTimeSelect oldEarlyFinish = earlyFinish;
		boolean oldEarlyFinishESet = earlyFinishESet;
		earlyFinish = null;
		earlyFinishESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH, oldEarlyFinish, null, oldEarlyFinishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEarlyFinish() {
		return earlyFinishESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getLateFinish() {
		if (lateFinish != null && lateFinish.eIsProxy()) {
			InternalEObject oldLateFinish = (InternalEObject)lateFinish;
			lateFinish = (IfcDateTimeSelect)eResolveProxy(oldLateFinish);
			if (lateFinish != oldLateFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH, oldLateFinish, lateFinish));
			}
		}
		return lateFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetLateFinish() {
		return lateFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLateFinish(IfcDateTimeSelect newLateFinish) {
		IfcDateTimeSelect oldLateFinish = lateFinish;
		lateFinish = newLateFinish;
		boolean oldLateFinishESet = lateFinishESet;
		lateFinishESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH, oldLateFinish, lateFinish, !oldLateFinishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLateFinish() {
		IfcDateTimeSelect oldLateFinish = lateFinish;
		boolean oldLateFinishESet = lateFinishESet;
		lateFinish = null;
		lateFinishESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH, oldLateFinish, null, oldLateFinishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLateFinish() {
		return lateFinishESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getScheduleFinish() {
		if (scheduleFinish != null && scheduleFinish.eIsProxy()) {
			InternalEObject oldScheduleFinish = (InternalEObject)scheduleFinish;
			scheduleFinish = (IfcDateTimeSelect)eResolveProxy(oldScheduleFinish);
			if (scheduleFinish != oldScheduleFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH, oldScheduleFinish, scheduleFinish));
			}
		}
		return scheduleFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetScheduleFinish() {
		return scheduleFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleFinish(IfcDateTimeSelect newScheduleFinish) {
		IfcDateTimeSelect oldScheduleFinish = scheduleFinish;
		scheduleFinish = newScheduleFinish;
		boolean oldScheduleFinishESet = scheduleFinishESet;
		scheduleFinishESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH, oldScheduleFinish, scheduleFinish, !oldScheduleFinishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScheduleFinish() {
		IfcDateTimeSelect oldScheduleFinish = scheduleFinish;
		boolean oldScheduleFinishESet = scheduleFinishESet;
		scheduleFinish = null;
		scheduleFinishESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH, oldScheduleFinish, null, oldScheduleFinishESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScheduleFinish() {
		return scheduleFinishESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScheduleDuration() {
		return scheduleDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDuration(double newScheduleDuration) {
		double oldScheduleDuration = scheduleDuration;
		scheduleDuration = newScheduleDuration;
		boolean oldScheduleDurationESet = scheduleDurationESet;
		scheduleDurationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION, oldScheduleDuration, scheduleDuration, !oldScheduleDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScheduleDuration() {
		double oldScheduleDuration = scheduleDuration;
		boolean oldScheduleDurationESet = scheduleDurationESet;
		scheduleDuration = SCHEDULE_DURATION_EDEFAULT;
		scheduleDurationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION, oldScheduleDuration, SCHEDULE_DURATION_EDEFAULT, oldScheduleDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScheduleDuration() {
		return scheduleDurationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScheduleDurationAsString() {
		return scheduleDurationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDurationAsString(String newScheduleDurationAsString) {
		String oldScheduleDurationAsString = scheduleDurationAsString;
		scheduleDurationAsString = newScheduleDurationAsString;
		boolean oldScheduleDurationAsStringESet = scheduleDurationAsStringESet;
		scheduleDurationAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION_AS_STRING, oldScheduleDurationAsString, scheduleDurationAsString, !oldScheduleDurationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScheduleDurationAsString() {
		String oldScheduleDurationAsString = scheduleDurationAsString;
		boolean oldScheduleDurationAsStringESet = scheduleDurationAsStringESet;
		scheduleDurationAsString = SCHEDULE_DURATION_AS_STRING_EDEFAULT;
		scheduleDurationAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION_AS_STRING, oldScheduleDurationAsString, SCHEDULE_DURATION_AS_STRING_EDEFAULT, oldScheduleDurationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScheduleDurationAsString() {
		return scheduleDurationAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActualDuration() {
		return actualDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualDuration(double newActualDuration) {
		double oldActualDuration = actualDuration;
		actualDuration = newActualDuration;
		boolean oldActualDurationESet = actualDurationESet;
		actualDurationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION, oldActualDuration, actualDuration, !oldActualDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActualDuration() {
		double oldActualDuration = actualDuration;
		boolean oldActualDurationESet = actualDurationESet;
		actualDuration = ACTUAL_DURATION_EDEFAULT;
		actualDurationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION, oldActualDuration, ACTUAL_DURATION_EDEFAULT, oldActualDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActualDuration() {
		return actualDurationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActualDurationAsString() {
		return actualDurationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualDurationAsString(String newActualDurationAsString) {
		String oldActualDurationAsString = actualDurationAsString;
		actualDurationAsString = newActualDurationAsString;
		boolean oldActualDurationAsStringESet = actualDurationAsStringESet;
		actualDurationAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION_AS_STRING, oldActualDurationAsString, actualDurationAsString, !oldActualDurationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActualDurationAsString() {
		String oldActualDurationAsString = actualDurationAsString;
		boolean oldActualDurationAsStringESet = actualDurationAsStringESet;
		actualDurationAsString = ACTUAL_DURATION_AS_STRING_EDEFAULT;
		actualDurationAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION_AS_STRING, oldActualDurationAsString, ACTUAL_DURATION_AS_STRING_EDEFAULT, oldActualDurationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActualDurationAsString() {
		return actualDurationAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRemainingTime() {
		return remainingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingTime(double newRemainingTime) {
		double oldRemainingTime = remainingTime;
		remainingTime = newRemainingTime;
		boolean oldRemainingTimeESet = remainingTimeESet;
		remainingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME, oldRemainingTime, remainingTime, !oldRemainingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRemainingTime() {
		double oldRemainingTime = remainingTime;
		boolean oldRemainingTimeESet = remainingTimeESet;
		remainingTime = REMAINING_TIME_EDEFAULT;
		remainingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME, oldRemainingTime, REMAINING_TIME_EDEFAULT, oldRemainingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRemainingTime() {
		return remainingTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemainingTimeAsString() {
		return remainingTimeAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingTimeAsString(String newRemainingTimeAsString) {
		String oldRemainingTimeAsString = remainingTimeAsString;
		remainingTimeAsString = newRemainingTimeAsString;
		boolean oldRemainingTimeAsStringESet = remainingTimeAsStringESet;
		remainingTimeAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME_AS_STRING, oldRemainingTimeAsString, remainingTimeAsString, !oldRemainingTimeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRemainingTimeAsString() {
		String oldRemainingTimeAsString = remainingTimeAsString;
		boolean oldRemainingTimeAsStringESet = remainingTimeAsStringESet;
		remainingTimeAsString = REMAINING_TIME_AS_STRING_EDEFAULT;
		remainingTimeAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME_AS_STRING, oldRemainingTimeAsString, REMAINING_TIME_AS_STRING_EDEFAULT, oldRemainingTimeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRemainingTimeAsString() {
		return remainingTimeAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFreeFloat() {
		return freeFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeFloat(double newFreeFloat) {
		double oldFreeFloat = freeFloat;
		freeFloat = newFreeFloat;
		boolean oldFreeFloatESet = freeFloatESet;
		freeFloatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT, oldFreeFloat, freeFloat, !oldFreeFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFreeFloat() {
		double oldFreeFloat = freeFloat;
		boolean oldFreeFloatESet = freeFloatESet;
		freeFloat = FREE_FLOAT_EDEFAULT;
		freeFloatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT, oldFreeFloat, FREE_FLOAT_EDEFAULT, oldFreeFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFreeFloat() {
		return freeFloatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFreeFloatAsString() {
		return freeFloatAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeFloatAsString(String newFreeFloatAsString) {
		String oldFreeFloatAsString = freeFloatAsString;
		freeFloatAsString = newFreeFloatAsString;
		boolean oldFreeFloatAsStringESet = freeFloatAsStringESet;
		freeFloatAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT_AS_STRING, oldFreeFloatAsString, freeFloatAsString, !oldFreeFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFreeFloatAsString() {
		String oldFreeFloatAsString = freeFloatAsString;
		boolean oldFreeFloatAsStringESet = freeFloatAsStringESet;
		freeFloatAsString = FREE_FLOAT_AS_STRING_EDEFAULT;
		freeFloatAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT_AS_STRING, oldFreeFloatAsString, FREE_FLOAT_AS_STRING_EDEFAULT, oldFreeFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFreeFloatAsString() {
		return freeFloatAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalFloat() {
		return totalFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalFloat(double newTotalFloat) {
		double oldTotalFloat = totalFloat;
		totalFloat = newTotalFloat;
		boolean oldTotalFloatESet = totalFloatESet;
		totalFloatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT, oldTotalFloat, totalFloat, !oldTotalFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalFloat() {
		double oldTotalFloat = totalFloat;
		boolean oldTotalFloatESet = totalFloatESet;
		totalFloat = TOTAL_FLOAT_EDEFAULT;
		totalFloatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT, oldTotalFloat, TOTAL_FLOAT_EDEFAULT, oldTotalFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalFloat() {
		return totalFloatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalFloatAsString() {
		return totalFloatAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalFloatAsString(String newTotalFloatAsString) {
		String oldTotalFloatAsString = totalFloatAsString;
		totalFloatAsString = newTotalFloatAsString;
		boolean oldTotalFloatAsStringESet = totalFloatAsStringESet;
		totalFloatAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT_AS_STRING, oldTotalFloatAsString, totalFloatAsString, !oldTotalFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTotalFloatAsString() {
		String oldTotalFloatAsString = totalFloatAsString;
		boolean oldTotalFloatAsStringESet = totalFloatAsStringESet;
		totalFloatAsString = TOTAL_FLOAT_AS_STRING_EDEFAULT;
		totalFloatAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT_AS_STRING, oldTotalFloatAsString, TOTAL_FLOAT_AS_STRING_EDEFAULT, oldTotalFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTotalFloatAsString() {
		return totalFloatAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getIsCritical() {
		return isCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCritical(Tristate newIsCritical) {
		Tristate oldIsCritical = isCritical;
		isCritical = newIsCritical == null ? IS_CRITICAL_EDEFAULT : newIsCritical;
		boolean oldIsCriticalESet = isCriticalESet;
		isCriticalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL, oldIsCritical, isCritical, !oldIsCriticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsCritical() {
		Tristate oldIsCritical = isCritical;
		boolean oldIsCriticalESet = isCriticalESet;
		isCritical = IS_CRITICAL_EDEFAULT;
		isCriticalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL, oldIsCritical, IS_CRITICAL_EDEFAULT, oldIsCriticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCritical() {
		return isCriticalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getStatusTime() {
		if (statusTime != null && statusTime.eIsProxy()) {
			InternalEObject oldStatusTime = (InternalEObject)statusTime;
			statusTime = (IfcDateTimeSelect)eResolveProxy(oldStatusTime);
			if (statusTime != oldStatusTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME, oldStatusTime, statusTime));
			}
		}
		return statusTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect basicGetStatusTime() {
		return statusTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusTime(IfcDateTimeSelect newStatusTime) {
		IfcDateTimeSelect oldStatusTime = statusTime;
		statusTime = newStatusTime;
		boolean oldStatusTimeESet = statusTimeESet;
		statusTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME, oldStatusTime, statusTime, !oldStatusTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatusTime() {
		IfcDateTimeSelect oldStatusTime = statusTime;
		boolean oldStatusTimeESet = statusTimeESet;
		statusTime = null;
		statusTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME, oldStatusTime, null, oldStatusTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatusTime() {
		return statusTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartFloat() {
		return startFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartFloat(double newStartFloat) {
		double oldStartFloat = startFloat;
		startFloat = newStartFloat;
		boolean oldStartFloatESet = startFloatESet;
		startFloatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT, oldStartFloat, startFloat, !oldStartFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartFloat() {
		double oldStartFloat = startFloat;
		boolean oldStartFloatESet = startFloatESet;
		startFloat = START_FLOAT_EDEFAULT;
		startFloatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT, oldStartFloat, START_FLOAT_EDEFAULT, oldStartFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartFloat() {
		return startFloatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartFloatAsString() {
		return startFloatAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartFloatAsString(String newStartFloatAsString) {
		String oldStartFloatAsString = startFloatAsString;
		startFloatAsString = newStartFloatAsString;
		boolean oldStartFloatAsStringESet = startFloatAsStringESet;
		startFloatAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT_AS_STRING, oldStartFloatAsString, startFloatAsString, !oldStartFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartFloatAsString() {
		String oldStartFloatAsString = startFloatAsString;
		boolean oldStartFloatAsStringESet = startFloatAsStringESet;
		startFloatAsString = START_FLOAT_AS_STRING_EDEFAULT;
		startFloatAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT_AS_STRING, oldStartFloatAsString, START_FLOAT_AS_STRING_EDEFAULT, oldStartFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartFloatAsString() {
		return startFloatAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFinishFloat() {
		return finishFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishFloat(double newFinishFloat) {
		double oldFinishFloat = finishFloat;
		finishFloat = newFinishFloat;
		boolean oldFinishFloatESet = finishFloatESet;
		finishFloatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT, oldFinishFloat, finishFloat, !oldFinishFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFinishFloat() {
		double oldFinishFloat = finishFloat;
		boolean oldFinishFloatESet = finishFloatESet;
		finishFloat = FINISH_FLOAT_EDEFAULT;
		finishFloatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT, oldFinishFloat, FINISH_FLOAT_EDEFAULT, oldFinishFloatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFinishFloat() {
		return finishFloatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinishFloatAsString() {
		return finishFloatAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishFloatAsString(String newFinishFloatAsString) {
		String oldFinishFloatAsString = finishFloatAsString;
		finishFloatAsString = newFinishFloatAsString;
		boolean oldFinishFloatAsStringESet = finishFloatAsStringESet;
		finishFloatAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT_AS_STRING, oldFinishFloatAsString, finishFloatAsString, !oldFinishFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFinishFloatAsString() {
		String oldFinishFloatAsString = finishFloatAsString;
		boolean oldFinishFloatAsStringESet = finishFloatAsStringESet;
		finishFloatAsString = FINISH_FLOAT_AS_STRING_EDEFAULT;
		finishFloatAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT_AS_STRING, oldFinishFloatAsString, FINISH_FLOAT_AS_STRING_EDEFAULT, oldFinishFloatAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFinishFloatAsString() {
		return finishFloatAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompletion() {
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(double newCompletion) {
		double oldCompletion = completion;
		completion = newCompletion;
		boolean oldCompletionESet = completionESet;
		completionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION, oldCompletion, completion, !oldCompletionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompletion() {
		double oldCompletion = completion;
		boolean oldCompletionESet = completionESet;
		completion = COMPLETION_EDEFAULT;
		completionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION, oldCompletion, COMPLETION_EDEFAULT, oldCompletionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompletion() {
		return completionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompletionAsString() {
		return completionAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionAsString(String newCompletionAsString) {
		String oldCompletionAsString = completionAsString;
		completionAsString = newCompletionAsString;
		boolean oldCompletionAsStringESet = completionAsStringESet;
		completionAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION_AS_STRING, oldCompletionAsString, completionAsString, !oldCompletionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompletionAsString() {
		String oldCompletionAsString = completionAsString;
		boolean oldCompletionAsStringESet = completionAsStringESet;
		completionAsString = COMPLETION_AS_STRING_EDEFAULT;
		completionAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION_AS_STRING, oldCompletionAsString, COMPLETION_AS_STRING_EDEFAULT, oldCompletionAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompletionAsString() {
		return completionAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsTasks getScheduleTimeControlAssigned() {
		if (scheduleTimeControlAssigned != null && scheduleTimeControlAssigned.eIsProxy()) {
			InternalEObject oldScheduleTimeControlAssigned = (InternalEObject)scheduleTimeControlAssigned;
			scheduleTimeControlAssigned = (IfcRelAssignsTasks)eResolveProxy(oldScheduleTimeControlAssigned);
			if (scheduleTimeControlAssigned != oldScheduleTimeControlAssigned) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED, oldScheduleTimeControlAssigned, scheduleTimeControlAssigned));
			}
		}
		return scheduleTimeControlAssigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsTasks basicGetScheduleTimeControlAssigned() {
		return scheduleTimeControlAssigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduleTimeControlAssigned(IfcRelAssignsTasks newScheduleTimeControlAssigned, NotificationChain msgs) {
		IfcRelAssignsTasks oldScheduleTimeControlAssigned = scheduleTimeControlAssigned;
		scheduleTimeControlAssigned = newScheduleTimeControlAssigned;
		boolean oldScheduleTimeControlAssignedESet = scheduleTimeControlAssignedESet;
		scheduleTimeControlAssignedESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED, oldScheduleTimeControlAssigned, newScheduleTimeControlAssigned, !oldScheduleTimeControlAssignedESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleTimeControlAssigned(IfcRelAssignsTasks newScheduleTimeControlAssigned) {
		if (newScheduleTimeControlAssigned != scheduleTimeControlAssigned) {
			NotificationChain msgs = null;
			if (scheduleTimeControlAssigned != null)
				msgs = ((InternalEObject)scheduleTimeControlAssigned).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK, IfcRelAssignsTasks.class, msgs);
			if (newScheduleTimeControlAssigned != null)
				msgs = ((InternalEObject)newScheduleTimeControlAssigned).eInverseAdd(this, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK, IfcRelAssignsTasks.class, msgs);
			msgs = basicSetScheduleTimeControlAssigned(newScheduleTimeControlAssigned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldScheduleTimeControlAssignedESet = scheduleTimeControlAssignedESet;
			scheduleTimeControlAssignedESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED, newScheduleTimeControlAssigned, newScheduleTimeControlAssigned, !oldScheduleTimeControlAssignedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetScheduleTimeControlAssigned(NotificationChain msgs) {
		IfcRelAssignsTasks oldScheduleTimeControlAssigned = scheduleTimeControlAssigned;
		scheduleTimeControlAssigned = null;
		boolean oldScheduleTimeControlAssignedESet = scheduleTimeControlAssignedESet;
		scheduleTimeControlAssignedESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED, oldScheduleTimeControlAssigned, null, oldScheduleTimeControlAssignedESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScheduleTimeControlAssigned() {
		if (scheduleTimeControlAssigned != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)scheduleTimeControlAssigned).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK, IfcRelAssignsTasks.class, msgs);
			msgs = basicUnsetScheduleTimeControlAssigned(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldScheduleTimeControlAssignedESet = scheduleTimeControlAssignedESet;
			scheduleTimeControlAssignedESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED, null, null, oldScheduleTimeControlAssignedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScheduleTimeControlAssigned() {
		return scheduleTimeControlAssignedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED:
				if (scheduleTimeControlAssigned != null)
					msgs = ((InternalEObject)scheduleTimeControlAssigned).eInverseRemove(this, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TASKS__TIME_FOR_TASK, IfcRelAssignsTasks.class, msgs);
				return basicSetScheduleTimeControlAssigned((IfcRelAssignsTasks)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED:
				return basicUnsetScheduleTimeControlAssigned(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START:
				if (resolve) return getActualStart();
				return basicGetActualStart();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_START:
				if (resolve) return getEarlyStart();
				return basicGetEarlyStart();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_START:
				if (resolve) return getLateStart();
				return basicGetLateStart();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START:
				if (resolve) return getScheduleStart();
				return basicGetScheduleStart();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH:
				if (resolve) return getActualFinish();
				return basicGetActualFinish();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH:
				if (resolve) return getEarlyFinish();
				return basicGetEarlyFinish();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH:
				if (resolve) return getLateFinish();
				return basicGetLateFinish();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH:
				if (resolve) return getScheduleFinish();
				return basicGetScheduleFinish();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION:
				return getScheduleDuration();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION_AS_STRING:
				return getScheduleDurationAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION:
				return getActualDuration();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION_AS_STRING:
				return getActualDurationAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME:
				return getRemainingTime();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME_AS_STRING:
				return getRemainingTimeAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT:
				return getFreeFloat();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT_AS_STRING:
				return getFreeFloatAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT:
				return getTotalFloat();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT_AS_STRING:
				return getTotalFloatAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL:
				return getIsCritical();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME:
				if (resolve) return getStatusTime();
				return basicGetStatusTime();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT:
				return getStartFloat();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT_AS_STRING:
				return getStartFloatAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT:
				return getFinishFloat();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT_AS_STRING:
				return getFinishFloatAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION:
				return getCompletion();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION_AS_STRING:
				return getCompletionAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED:
				if (resolve) return getScheduleTimeControlAssigned();
				return basicGetScheduleTimeControlAssigned();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START:
				setActualStart((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_START:
				setEarlyStart((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_START:
				setLateStart((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START:
				setScheduleStart((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH:
				setActualFinish((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH:
				setEarlyFinish((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH:
				setLateFinish((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH:
				setScheduleFinish((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION:
				setScheduleDuration((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION_AS_STRING:
				setScheduleDurationAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION:
				setActualDuration((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION_AS_STRING:
				setActualDurationAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME:
				setRemainingTime((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME_AS_STRING:
				setRemainingTimeAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT:
				setFreeFloat((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT_AS_STRING:
				setFreeFloatAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT:
				setTotalFloat((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT_AS_STRING:
				setTotalFloatAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL:
				setIsCritical((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME:
				setStatusTime((IfcDateTimeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT:
				setStartFloat((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT_AS_STRING:
				setStartFloatAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT:
				setFinishFloat((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT_AS_STRING:
				setFinishFloatAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION:
				setCompletion((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION_AS_STRING:
				setCompletionAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED:
				setScheduleTimeControlAssigned((IfcRelAssignsTasks)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START:
				unsetActualStart();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_START:
				unsetEarlyStart();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_START:
				unsetLateStart();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START:
				unsetScheduleStart();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH:
				unsetActualFinish();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH:
				unsetEarlyFinish();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH:
				unsetLateFinish();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH:
				unsetScheduleFinish();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION:
				unsetScheduleDuration();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION_AS_STRING:
				unsetScheduleDurationAsString();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION:
				unsetActualDuration();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION_AS_STRING:
				unsetActualDurationAsString();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME:
				unsetRemainingTime();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME_AS_STRING:
				unsetRemainingTimeAsString();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT:
				unsetFreeFloat();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT_AS_STRING:
				unsetFreeFloatAsString();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT:
				unsetTotalFloat();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT_AS_STRING:
				unsetTotalFloatAsString();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL:
				unsetIsCritical();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME:
				unsetStatusTime();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT:
				unsetStartFloat();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT_AS_STRING:
				unsetStartFloatAsString();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT:
				unsetFinishFloat();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT_AS_STRING:
				unsetFinishFloatAsString();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION:
				unsetCompletion();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION_AS_STRING:
				unsetCompletionAsString();
				return;
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED:
				unsetScheduleTimeControlAssigned();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_START:
				return isSetActualStart();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_START:
				return isSetEarlyStart();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_START:
				return isSetLateStart();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_START:
				return isSetScheduleStart();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_FINISH:
				return isSetActualFinish();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__EARLY_FINISH:
				return isSetEarlyFinish();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__LATE_FINISH:
				return isSetLateFinish();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_FINISH:
				return isSetScheduleFinish();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION:
				return isSetScheduleDuration();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_DURATION_AS_STRING:
				return isSetScheduleDurationAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION:
				return isSetActualDuration();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__ACTUAL_DURATION_AS_STRING:
				return isSetActualDurationAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME:
				return isSetRemainingTime();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__REMAINING_TIME_AS_STRING:
				return isSetRemainingTimeAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT:
				return isSetFreeFloat();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FREE_FLOAT_AS_STRING:
				return isSetFreeFloatAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT:
				return isSetTotalFloat();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__TOTAL_FLOAT_AS_STRING:
				return isSetTotalFloatAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__IS_CRITICAL:
				return isSetIsCritical();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__STATUS_TIME:
				return isSetStatusTime();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT:
				return isSetStartFloat();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__START_FLOAT_AS_STRING:
				return isSetStartFloatAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT:
				return isSetFinishFloat();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__FINISH_FLOAT_AS_STRING:
				return isSetFinishFloatAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION:
				return isSetCompletion();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__COMPLETION_AS_STRING:
				return isSetCompletionAsString();
			case Ifc2x3tc1Package.IFC_SCHEDULE_TIME_CONTROL__SCHEDULE_TIME_CONTROL_ASSIGNED:
				return isSetScheduleTimeControlAssigned();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ScheduleDuration: ");
		if (scheduleDurationESet) result.append(scheduleDuration); else result.append("<unset>");
		result.append(", ScheduleDurationAsString: ");
		if (scheduleDurationAsStringESet) result.append(scheduleDurationAsString); else result.append("<unset>");
		result.append(", ActualDuration: ");
		if (actualDurationESet) result.append(actualDuration); else result.append("<unset>");
		result.append(", ActualDurationAsString: ");
		if (actualDurationAsStringESet) result.append(actualDurationAsString); else result.append("<unset>");
		result.append(", RemainingTime: ");
		if (remainingTimeESet) result.append(remainingTime); else result.append("<unset>");
		result.append(", RemainingTimeAsString: ");
		if (remainingTimeAsStringESet) result.append(remainingTimeAsString); else result.append("<unset>");
		result.append(", FreeFloat: ");
		if (freeFloatESet) result.append(freeFloat); else result.append("<unset>");
		result.append(", FreeFloatAsString: ");
		if (freeFloatAsStringESet) result.append(freeFloatAsString); else result.append("<unset>");
		result.append(", TotalFloat: ");
		if (totalFloatESet) result.append(totalFloat); else result.append("<unset>");
		result.append(", TotalFloatAsString: ");
		if (totalFloatAsStringESet) result.append(totalFloatAsString); else result.append("<unset>");
		result.append(", IsCritical: ");
		if (isCriticalESet) result.append(isCritical); else result.append("<unset>");
		result.append(", StartFloat: ");
		if (startFloatESet) result.append(startFloat); else result.append("<unset>");
		result.append(", StartFloatAsString: ");
		if (startFloatAsStringESet) result.append(startFloatAsString); else result.append("<unset>");
		result.append(", FinishFloat: ");
		if (finishFloatESet) result.append(finishFloat); else result.append("<unset>");
		result.append(", FinishFloatAsString: ");
		if (finishFloatAsStringESet) result.append(finishFloatAsString); else result.append("<unset>");
		result.append(", Completion: ");
		if (completionESet) result.append(completion); else result.append("<unset>");
		result.append(", CompletionAsString: ");
		if (completionAsStringESet) result.append(completionAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcScheduleTimeControlImpl
