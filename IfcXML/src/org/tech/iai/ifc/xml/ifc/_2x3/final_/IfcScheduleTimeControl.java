/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Schedule Time Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getActualStart <em>Actual Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getEarlyStart <em>Early Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getLateStart <em>Late Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getScheduleStart <em>Schedule Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getActualFinish <em>Actual Finish</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getEarlyFinish <em>Early Finish</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getLateFinish <em>Late Finish</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getScheduleFinish <em>Schedule Finish</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getIsCritical <em>Is Critical</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getStatusTime <em>Status Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getCompletion <em>Completion</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl()
 * @model extendedMetaData="name='IfcScheduleTimeControl' kind='elementOnly'"
 * @generated
 */
public interface IfcScheduleTimeControl extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Actual Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Start</em>' containment reference.
	 * @see #setActualStart(ActualStartType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_ActualStart()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ActualStart' namespace='##targetNamespace'"
	 * @generated
	 */
	ActualStartType getActualStart();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getActualStart <em>Actual Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start</em>' containment reference.
	 * @see #getActualStart()
	 * @generated
	 */
	void setActualStart(ActualStartType value);

	/**
	 * Returns the value of the '<em><b>Early Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Early Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Early Start</em>' containment reference.
	 * @see #setEarlyStart(EarlyStartType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_EarlyStart()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EarlyStart' namespace='##targetNamespace'"
	 * @generated
	 */
	EarlyStartType getEarlyStart();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getEarlyStart <em>Early Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Start</em>' containment reference.
	 * @see #getEarlyStart()
	 * @generated
	 */
	void setEarlyStart(EarlyStartType value);

	/**
	 * Returns the value of the '<em><b>Late Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Late Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Late Start</em>' containment reference.
	 * @see #setLateStart(LateStartType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_LateStart()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LateStart' namespace='##targetNamespace'"
	 * @generated
	 */
	LateStartType getLateStart();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getLateStart <em>Late Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Start</em>' containment reference.
	 * @see #getLateStart()
	 * @generated
	 */
	void setLateStart(LateStartType value);

	/**
	 * Returns the value of the '<em><b>Schedule Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Start</em>' containment reference.
	 * @see #setScheduleStart(ScheduleStartType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_ScheduleStart()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ScheduleStart' namespace='##targetNamespace'"
	 * @generated
	 */
	ScheduleStartType getScheduleStart();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getScheduleStart <em>Schedule Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Start</em>' containment reference.
	 * @see #getScheduleStart()
	 * @generated
	 */
	void setScheduleStart(ScheduleStartType value);

	/**
	 * Returns the value of the '<em><b>Actual Finish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Finish</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Finish</em>' containment reference.
	 * @see #setActualFinish(ActualFinishType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_ActualFinish()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ActualFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	ActualFinishType getActualFinish();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getActualFinish <em>Actual Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Finish</em>' containment reference.
	 * @see #getActualFinish()
	 * @generated
	 */
	void setActualFinish(ActualFinishType value);

	/**
	 * Returns the value of the '<em><b>Early Finish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Early Finish</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Early Finish</em>' containment reference.
	 * @see #setEarlyFinish(EarlyFinishType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_EarlyFinish()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EarlyFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	EarlyFinishType getEarlyFinish();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getEarlyFinish <em>Early Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Early Finish</em>' containment reference.
	 * @see #getEarlyFinish()
	 * @generated
	 */
	void setEarlyFinish(EarlyFinishType value);

	/**
	 * Returns the value of the '<em><b>Late Finish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Late Finish</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Late Finish</em>' containment reference.
	 * @see #setLateFinish(LateFinishType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_LateFinish()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LateFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	LateFinishType getLateFinish();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getLateFinish <em>Late Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Finish</em>' containment reference.
	 * @see #getLateFinish()
	 * @generated
	 */
	void setLateFinish(LateFinishType value);

	/**
	 * Returns the value of the '<em><b>Schedule Finish</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Finish</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Finish</em>' containment reference.
	 * @see #setScheduleFinish(ScheduleFinishType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_ScheduleFinish()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ScheduleFinish' namespace='##targetNamespace'"
	 * @generated
	 */
	ScheduleFinishType getScheduleFinish();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getScheduleFinish <em>Schedule Finish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Finish</em>' containment reference.
	 * @see #getScheduleFinish()
	 * @generated
	 */
	void setScheduleFinish(ScheduleFinishType value);

	/**
	 * Returns the value of the '<em><b>Schedule Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Duration</em>' attribute.
	 * @see #setScheduleDuration(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_ScheduleDuration()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasureObject"
	 *        extendedMetaData="kind='element' name='ScheduleDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getScheduleDuration();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getScheduleDuration <em>Schedule Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Duration</em>' attribute.
	 * @see #getScheduleDuration()
	 * @generated
	 */
	void setScheduleDuration(Double value);

	/**
	 * Returns the value of the '<em><b>Actual Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Duration</em>' attribute.
	 * @see #setActualDuration(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_ActualDuration()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasureObject"
	 *        extendedMetaData="kind='element' name='ActualDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getActualDuration();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getActualDuration <em>Actual Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Duration</em>' attribute.
	 * @see #getActualDuration()
	 * @generated
	 */
	void setActualDuration(Double value);

	/**
	 * Returns the value of the '<em><b>Remaining Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Time</em>' attribute.
	 * @see #setRemainingTime(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_RemainingTime()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasureObject"
	 *        extendedMetaData="kind='element' name='RemainingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getRemainingTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getRemainingTime <em>Remaining Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Time</em>' attribute.
	 * @see #getRemainingTime()
	 * @generated
	 */
	void setRemainingTime(Double value);

	/**
	 * Returns the value of the '<em><b>Free Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Float</em>' attribute.
	 * @see #setFreeFloat(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_FreeFloat()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasureObject"
	 *        extendedMetaData="kind='element' name='FreeFloat' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getFreeFloat();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getFreeFloat <em>Free Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Float</em>' attribute.
	 * @see #getFreeFloat()
	 * @generated
	 */
	void setFreeFloat(Double value);

	/**
	 * Returns the value of the '<em><b>Total Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Float</em>' attribute.
	 * @see #setTotalFloat(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_TotalFloat()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasureObject"
	 *        extendedMetaData="kind='element' name='TotalFloat' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getTotalFloat();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getTotalFloat <em>Total Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Float</em>' attribute.
	 * @see #getTotalFloat()
	 * @generated
	 */
	void setTotalFloat(Double value);

	/**
	 * Returns the value of the '<em><b>Is Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Critical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Critical</em>' attribute.
	 * @see #setIsCritical(Boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_IsCritical()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 *        extendedMetaData="kind='element' name='IsCritical' namespace='##targetNamespace'"
	 * @generated
	 */
	Boolean getIsCritical();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getIsCritical <em>Is Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Critical</em>' attribute.
	 * @see #getIsCritical()
	 * @generated
	 */
	void setIsCritical(Boolean value);

	/**
	 * Returns the value of the '<em><b>Status Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Time</em>' containment reference.
	 * @see #setStatusTime(StatusTimeType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_StatusTime()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='StatusTime' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusTimeType getStatusTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getStatusTime <em>Status Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Time</em>' containment reference.
	 * @see #getStatusTime()
	 * @generated
	 */
	void setStatusTime(StatusTimeType value);

	/**
	 * Returns the value of the '<em><b>Start Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Float</em>' attribute.
	 * @see #setStartFloat(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_StartFloat()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasureObject"
	 *        extendedMetaData="kind='element' name='StartFloat' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getStartFloat();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getStartFloat <em>Start Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Float</em>' attribute.
	 * @see #getStartFloat()
	 * @generated
	 */
	void setStartFloat(Double value);

	/**
	 * Returns the value of the '<em><b>Finish Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Float</em>' attribute.
	 * @see #setFinishFloat(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_FinishFloat()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasureObject"
	 *        extendedMetaData="kind='element' name='FinishFloat' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getFinishFloat();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getFinishFloat <em>Finish Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Float</em>' attribute.
	 * @see #getFinishFloat()
	 * @generated
	 */
	void setFinishFloat(Double value);

	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see #setCompletion(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcScheduleTimeControl_Completion()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='Completion' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCompletion();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcScheduleTimeControl#getCompletion <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion</em>' attribute.
	 * @see #getCompletion()
	 * @generated
	 */
	void setCompletion(Double value);

} // IfcScheduleTimeControl
