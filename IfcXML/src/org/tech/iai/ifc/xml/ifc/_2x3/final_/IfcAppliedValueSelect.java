/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Applied Value Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValueSelect#getIfcRatioMeasure <em>Ifc Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValueSelect#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValueSelect#getIfcMonetaryMeasure <em>Ifc Monetary Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAppliedValueSelect()
 * @model extendedMetaData="name='IfcAppliedValueSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcAppliedValueSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Ratio Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Ratio Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Ratio Measure</em>' containment reference.
	 * @see #setIfcRatioMeasure(IfcRatioMeasureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAppliedValueSelect_IfcRatioMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcRatioMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcRatioMeasureType getIfcRatioMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValueSelect#getIfcRatioMeasure <em>Ifc Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Ratio Measure</em>' containment reference.
	 * @see #getIfcRatioMeasure()
	 * @generated
	 */
	void setIfcRatioMeasure(IfcRatioMeasureType value);

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAppliedValueSelect_IfcMeasureWithUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMeasureWithUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMeasureWithUnit getIfcMeasureWithUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValueSelect#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Measure With Unit</em>' containment reference.
	 * @see #getIfcMeasureWithUnit()
	 * @generated
	 */
	void setIfcMeasureWithUnit(IfcMeasureWithUnit value);

	/**
	 * Returns the value of the '<em><b>Ifc Monetary Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Monetary Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Monetary Measure</em>' containment reference.
	 * @see #setIfcMonetaryMeasure(IfcMonetaryMeasureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAppliedValueSelect_IfcMonetaryMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMonetaryMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMonetaryMeasureType getIfcMonetaryMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAppliedValueSelect#getIfcMonetaryMeasure <em>Ifc Monetary Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Monetary Measure</em>' containment reference.
	 * @see #getIfcMonetaryMeasure()
	 * @generated
	 */
	void setIfcMonetaryMeasure(IfcMonetaryMeasureType value);

} // IfcAppliedValueSelect
