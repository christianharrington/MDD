/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cost Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getSubmittedBy <em>Submitted By</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getPreparedBy <em>Prepared By</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getSubmittedOn <em>Submitted On</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getStatus <em>Status</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getTargetUsers <em>Target Users</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getUpdateDate <em>Update Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getID1 <em>ID1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostSchedule()
 * @model extendedMetaData="name='IfcCostSchedule' kind='elementOnly'"
 * @generated
 */
public interface IfcCostSchedule extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Submitted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitted By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitted By</em>' containment reference.
	 * @see #setSubmittedBy(SubmittedByType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostSchedule_SubmittedBy()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SubmittedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	SubmittedByType getSubmittedBy();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getSubmittedBy <em>Submitted By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitted By</em>' containment reference.
	 * @see #getSubmittedBy()
	 * @generated
	 */
	void setSubmittedBy(SubmittedByType value);

	/**
	 * Returns the value of the '<em><b>Prepared By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prepared By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prepared By</em>' containment reference.
	 * @see #setPreparedBy(PreparedByType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostSchedule_PreparedBy()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PreparedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	PreparedByType getPreparedBy();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getPreparedBy <em>Prepared By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepared By</em>' containment reference.
	 * @see #getPreparedBy()
	 * @generated
	 */
	void setPreparedBy(PreparedByType value);

	/**
	 * Returns the value of the '<em><b>Submitted On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitted On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitted On</em>' containment reference.
	 * @see #setSubmittedOn(SubmittedOnType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostSchedule_SubmittedOn()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SubmittedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	SubmittedOnType getSubmittedOn();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getSubmittedOn <em>Submitted On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitted On</em>' containment reference.
	 * @see #getSubmittedOn()
	 * @generated
	 */
	void setSubmittedOn(SubmittedOnType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostSchedule_Status()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='Status' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Target Users</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Users</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Users</em>' containment reference.
	 * @see #setTargetUsers(TargetUsersType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostSchedule_TargetUsers()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TargetUsers' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetUsersType getTargetUsers();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getTargetUsers <em>Target Users</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Users</em>' containment reference.
	 * @see #getTargetUsers()
	 * @generated
	 */
	void setTargetUsers(TargetUsersType value);

	/**
	 * Returns the value of the '<em><b>Update Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Date</em>' containment reference.
	 * @see #setUpdateDate(UpdateDateType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostSchedule_UpdateDate()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UpdateDate' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateDateType getUpdateDate();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getUpdateDate <em>Update Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Date</em>' containment reference.
	 * @see #getUpdateDate()
	 * @generated
	 */
	void setUpdateDate(UpdateDateType value);

	/**
	 * Returns the value of the '<em><b>ID1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID1</em>' attribute.
	 * @see #setID1(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostSchedule_ID1()
	 * @model dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIdentifier" required="true"
	 *        extendedMetaData="kind='element' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getID1();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getID1 <em>ID1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID1</em>' attribute.
	 * @see #getID1()
	 * @generated
	 */
	void setID1(String value);

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostScheduleTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostScheduleTypeEnum
	 * @see #setPredefinedType(IfcCostScheduleTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCostSchedule_PredefinedType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PredefinedType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCostScheduleTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostSchedule#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCostScheduleTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcCostScheduleTypeEnum value);

} // IfcCostSchedule
