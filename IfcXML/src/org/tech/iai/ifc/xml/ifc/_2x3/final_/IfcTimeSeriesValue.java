/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Time Series Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesValue#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTimeSeriesValue()
 * @model extendedMetaData="name='IfcTimeSeriesValue' kind='elementOnly'"
 * @generated
 */
public interface IfcTimeSeriesValue extends Entity {
	/**
	 * Returns the value of the '<em><b>List Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Values</em>' containment reference.
	 * @see #setListValues(ListValuesType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTimeSeriesValue_ListValues()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ListValues' namespace='##targetNamespace'"
	 * @generated
	 */
	ListValuesType1 getListValues();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesValue#getListValues <em>List Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Values</em>' containment reference.
	 * @see #getListValues()
	 * @generated
	 */
	void setListValues(ListValuesType1 value);

} // IfcTimeSeriesValue
