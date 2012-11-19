/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Condition Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConditionCriterion#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConditionCriterion#getCriterionDateTime <em>Criterion Date Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConditionCriterion()
 * @model extendedMetaData="name='IfcConditionCriterion' kind='elementOnly'"
 * @generated
 */
public interface IfcConditionCriterion extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' containment reference.
	 * @see #setCriterion(CriterionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConditionCriterion_Criterion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Criterion' namespace='##targetNamespace'"
	 * @generated
	 */
	CriterionType getCriterion();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConditionCriterion#getCriterion <em>Criterion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' containment reference.
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(CriterionType value);

	/**
	 * Returns the value of the '<em><b>Criterion Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterion Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion Date Time</em>' containment reference.
	 * @see #setCriterionDateTime(CriterionDateTimeType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConditionCriterion_CriterionDateTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CriterionDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	CriterionDateTimeType getCriterionDateTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConditionCriterion#getCriterionDateTime <em>Criterion Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion Date Time</em>' containment reference.
	 * @see #getCriterionDateTime()
	 * @generated
	 */
	void setCriterionDateTime(CriterionDateTimeType value);

} // IfcConditionCriterion
