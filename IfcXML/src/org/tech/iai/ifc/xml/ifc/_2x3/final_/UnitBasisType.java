/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitBasisType#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getUnitBasisType()
 * @model extendedMetaData="name='UnitBasis_._type' kind='elementOnly'"
 * @generated
 */
public interface UnitBasisType extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getUnitBasisType_IfcMeasureWithUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMeasureWithUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMeasureWithUnit getIfcMeasureWithUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitBasisType#getIfcMeasureWithUnit <em>Ifc Measure With Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Measure With Unit</em>' containment reference.
	 * @see #getIfcMeasureWithUnit()
	 * @generated
	 */
	void setIfcMeasureWithUnit(IfcMeasureWithUnit value);

} // UnitBasisType
