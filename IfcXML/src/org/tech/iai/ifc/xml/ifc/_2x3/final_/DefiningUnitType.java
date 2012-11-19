/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defining Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefiningUnitType#getIfcDerivedUnit <em>Ifc Derived Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefiningUnitType#getIfcNamedUnitGroup <em>Ifc Named Unit Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefiningUnitType#getIfcNamedUnit <em>Ifc Named Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefiningUnitType#getIfcMonetaryUnit <em>Ifc Monetary Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDefiningUnitType()
 * @model extendedMetaData="name='DefiningUnit_._type' kind='elementOnly'"
 * @generated
 */
public interface DefiningUnitType extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDefiningUnitType_IfcDerivedUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDerivedUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDerivedUnit getIfcDerivedUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefiningUnitType#getIfcDerivedUnit <em>Ifc Derived Unit</em>}' containment reference.
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDefiningUnitType_IfcNamedUnitGroup()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDefiningUnitType_IfcNamedUnit()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDefiningUnitType_IfcMonetaryUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMonetaryUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMonetaryUnit getIfcMonetaryUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefiningUnitType#getIfcMonetaryUnit <em>Ifc Monetary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Monetary Unit</em>' containment reference.
	 * @see #getIfcMonetaryUnit()
	 * @generated
	 */
	void setIfcMonetaryUnit(IfcMonetaryUnit value);

} // DefiningUnitType
