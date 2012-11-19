/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Bounded Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyBoundedValue#getUpperBoundValue <em>Upper Bound Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyBoundedValue#getLowerBoundValue <em>Lower Bound Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyBoundedValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyBoundedValue()
 * @model extendedMetaData="name='IfcPropertyBoundedValue' kind='elementOnly'"
 * @generated
 */
public interface IfcPropertyBoundedValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Upper Bound Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound Value</em>' containment reference.
	 * @see #setUpperBoundValue(UpperBoundValueType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyBoundedValue_UpperBoundValue()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='UpperBoundValue' namespace='##targetNamespace'"
	 * @generated
	 */
	UpperBoundValueType getUpperBoundValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyBoundedValue#getUpperBoundValue <em>Upper Bound Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound Value</em>' containment reference.
	 * @see #getUpperBoundValue()
	 * @generated
	 */
	void setUpperBoundValue(UpperBoundValueType value);

	/**
	 * Returns the value of the '<em><b>Lower Bound Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound Value</em>' containment reference.
	 * @see #setLowerBoundValue(LowerBoundValueType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyBoundedValue_LowerBoundValue()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LowerBoundValue' namespace='##targetNamespace'"
	 * @generated
	 */
	LowerBoundValueType getLowerBoundValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyBoundedValue#getLowerBoundValue <em>Lower Bound Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound Value</em>' containment reference.
	 * @see #getLowerBoundValue()
	 * @generated
	 */
	void setLowerBoundValue(LowerBoundValueType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(UnitType3)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyBoundedValue_Unit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Unit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType3 getUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyBoundedValue#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType3 value);

} // IfcPropertyBoundedValue
