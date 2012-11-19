/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Type4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType4#getIfcDerivedUnit <em>Ifc Derived Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType4#getIfcNamedUnitGroup <em>Ifc Named Unit Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType4#getIfcNamedUnit <em>Ifc Named Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType4#getIfcMonetaryUnit <em>Ifc Monetary Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getUnitType4()
 * @model extendedMetaData="name='Unit_._4_._type' kind='elementOnly'"
 * @generated
 */
public interface UnitType4 extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Derived Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Derived Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Derived Unit</em>' containment reference.
	 * @see #setIfcDerivedUnit(IfcDerivedUnit)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getUnitType4_IfcDerivedUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDerivedUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDerivedUnit getIfcDerivedUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType4#getIfcDerivedUnit <em>Ifc Derived Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Derived Unit</em>' containment reference.
	 * @see #getIfcDerivedUnit()
	 * @generated
	 */
	void setIfcDerivedUnit(IfcDerivedUnit value);

	/**
	 * Returns the value of the '<em><b>Ifc Named Unit Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Named Unit Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Named Unit Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getUnitType4_IfcNamedUnitGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcNamedUnit:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcNamedUnitGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Named Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Named Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Named Unit</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getUnitType4_IfcNamedUnit()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcNamedUnit' namespace='##targetNamespace' group='IfcNamedUnit:group'"
	 * @generated
	 */
	IfcNamedUnit getIfcNamedUnit();

	/**
	 * Returns the value of the '<em><b>Ifc Monetary Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Monetary Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Monetary Unit</em>' containment reference.
	 * @see #setIfcMonetaryUnit(IfcMonetaryUnit)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getUnitType4_IfcMonetaryUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMonetaryUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMonetaryUnit getIfcMonetaryUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitType4#getIfcMonetaryUnit <em>Ifc Monetary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Monetary Unit</em>' containment reference.
	 * @see #getIfcMonetaryUnit()
	 * @generated
	 */
	void setIfcMonetaryUnit(IfcMonetaryUnit value);

} // UnitType4
