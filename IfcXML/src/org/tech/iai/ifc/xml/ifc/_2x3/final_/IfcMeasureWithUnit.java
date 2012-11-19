/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Measure With Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMeasureWithUnit#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMeasureWithUnit#getUnitComponent <em>Unit Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMeasureWithUnit()
 * @model extendedMetaData="name='IfcMeasureWithUnit' kind='elementOnly'"
 * @generated
 */
public interface IfcMeasureWithUnit extends Entity {
	/**
	 * Returns the value of the '<em><b>Value Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Component</em>' containment reference.
	 * @see #setValueComponent(ValueComponentType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMeasureWithUnit_ValueComponent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ValueComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueComponentType getValueComponent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMeasureWithUnit#getValueComponent <em>Value Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Component</em>' containment reference.
	 * @see #getValueComponent()
	 * @generated
	 */
	void setValueComponent(ValueComponentType value);

	/**
	 * Returns the value of the '<em><b>Unit Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Component</em>' containment reference.
	 * @see #setUnitComponent(UnitComponentType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMeasureWithUnit_UnitComponent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UnitComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitComponentType getUnitComponent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMeasureWithUnit#getUnitComponent <em>Unit Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Component</em>' containment reference.
	 * @see #getUnitComponent()
	 * @generated
	 */
	void setUnitComponent(UnitComponentType value);

} // IfcMeasureWithUnit
