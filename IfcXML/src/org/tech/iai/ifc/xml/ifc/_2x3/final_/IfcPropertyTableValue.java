/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Table Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getDefiningValues <em>Defining Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getDefinedValues <em>Defined Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getDefiningUnit <em>Defining Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getDefinedUnit <em>Defined Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyTableValue()
 * @model extendedMetaData="name='IfcPropertyTableValue' kind='elementOnly'"
 * @generated
 */
public interface IfcPropertyTableValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Defining Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Values</em>' containment reference.
	 * @see #setDefiningValues(DefiningValuesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyTableValue_DefiningValues()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DefiningValues' namespace='##targetNamespace'"
	 * @generated
	 */
	DefiningValuesType getDefiningValues();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getDefiningValues <em>Defining Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Values</em>' containment reference.
	 * @see #getDefiningValues()
	 * @generated
	 */
	void setDefiningValues(DefiningValuesType value);

	/**
	 * Returns the value of the '<em><b>Defined Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Values</em>' containment reference.
	 * @see #setDefinedValues(DefinedValuesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyTableValue_DefinedValues()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DefinedValues' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinedValuesType getDefinedValues();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getDefinedValues <em>Defined Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Values</em>' containment reference.
	 * @see #getDefinedValues()
	 * @generated
	 */
	void setDefinedValues(DefinedValuesType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyTableValue_Expression()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='Expression' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Defining Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Unit</em>' containment reference.
	 * @see #setDefiningUnit(DefiningUnitType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyTableValue_DefiningUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DefiningUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	DefiningUnitType getDefiningUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getDefiningUnit <em>Defining Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Unit</em>' containment reference.
	 * @see #getDefiningUnit()
	 * @generated
	 */
	void setDefiningUnit(DefiningUnitType value);

	/**
	 * Returns the value of the '<em><b>Defined Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Unit</em>' containment reference.
	 * @see #setDefinedUnit(DefinedUnitType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyTableValue_DefinedUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DefinedUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinedUnitType getDefinedUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyTableValue#getDefinedUnit <em>Defined Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined Unit</em>' containment reference.
	 * @see #getDefinedUnit()
	 * @generated
	 */
	void setDefinedUnit(DefinedUnitType value);

} // IfcPropertyTableValue
