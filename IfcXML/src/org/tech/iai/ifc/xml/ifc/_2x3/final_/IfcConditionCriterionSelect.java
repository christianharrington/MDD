/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Condition Criterion Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConditionCriterionSelect#getIfcLabel <em>Ifc Label</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConditionCriterionSelect#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConditionCriterionSelect()
 * @model extendedMetaData="name='IfcConditionCriterionSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcConditionCriterionSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Label</em>' containment reference.
	 * @see #setIfcLabel(IfcLabelType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConditionCriterionSelect_IfcLabel()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcLabelType getIfcLabel();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConditionCriterionSelect#getIfcLabel <em>Ifc Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Label</em>' containment reference.
	 * @see #getIfcLabel()
	 * @generated
	 */
	void setIfcLabel(IfcLabelType value);

	/**
	 * Returns the value of the '<em><b>Ifc Measure With Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Measure With Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Measure With Unit</em>' containment reference.
	 * @see #setIfcMeasureWithUnit(IfcMeasureWithUnit)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConditionCriterionSelect_IfcMeasureWithUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMeasureWithUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMeasureWithUnit getIfcMeasureWithUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConditionCriterionSelect#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Measure With Unit</em>' containment reference.
	 * @see #getIfcMeasureWithUnit()
	 * @generated
	 */
	void setIfcMeasureWithUnit(IfcMeasureWithUnit value);

} // IfcConditionCriterionSelect
