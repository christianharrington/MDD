/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Measure With Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcMeasureWithUnit#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcMeasureWithUnit#getUnitComponent <em>Unit Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMeasureWithUnit()
 * @model
 * @generated
 */
public interface IfcMeasureWithUnit extends IfcAppliedValueSelect, IfcConditionCriterionSelect, IfcMetricValueSelect {
	/**
	 * Returns the value of the '<em><b>Value Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Component</em>' reference.
	 * @see #setValueComponent(IfcValue)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMeasureWithUnit_ValueComponent()
	 * @model
	 * @generated
	 */
	IfcValue getValueComponent();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMeasureWithUnit#getValueComponent <em>Value Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Component</em>' reference.
	 * @see #getValueComponent()
	 * @generated
	 */
	void setValueComponent(IfcValue value);

	/**
	 * Returns the value of the '<em><b>Unit Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Component</em>' reference.
	 * @see #setUnitComponent(IfcUnit)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMeasureWithUnit_UnitComponent()
	 * @model
	 * @generated
	 */
	IfcUnit getUnitComponent();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMeasureWithUnit#getUnitComponent <em>Unit Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Component</em>' reference.
	 * @see #getUnitComponent()
	 * @generated
	 */
	void setUnitComponent(IfcUnit value);

} // IfcMeasureWithUnit
