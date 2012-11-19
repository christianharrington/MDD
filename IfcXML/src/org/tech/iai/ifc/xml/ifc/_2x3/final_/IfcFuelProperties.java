/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fuel Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFuelProperties()
 * @model extendedMetaData="name='IfcFuelProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcFuelProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Combustion Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combustion Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combustion Temperature</em>' attribute.
	 * @see #setCombustionTemperature(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFuelProperties_CombustionTemperature()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureObject"
	 *        extendedMetaData="kind='element' name='CombustionTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCombustionTemperature();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFuelProperties#getCombustionTemperature <em>Combustion Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combustion Temperature</em>' attribute.
	 * @see #getCombustionTemperature()
	 * @generated
	 */
	void setCombustionTemperature(Double value);

	/**
	 * Returns the value of the '<em><b>Carbon Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carbon Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carbon Content</em>' attribute.
	 * @see #setCarbonContent(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFuelProperties_CarbonContent()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='CarbonContent' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCarbonContent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFuelProperties#getCarbonContent <em>Carbon Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carbon Content</em>' attribute.
	 * @see #getCarbonContent()
	 * @generated
	 */
	void setCarbonContent(Double value);

	/**
	 * Returns the value of the '<em><b>Lower Heating Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Heating Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Heating Value</em>' attribute.
	 * @see #setLowerHeatingValue(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFuelProperties_LowerHeatingValue()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHeatingValueMeasureObject"
	 *        extendedMetaData="kind='element' name='LowerHeatingValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getLowerHeatingValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFuelProperties#getLowerHeatingValue <em>Lower Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Heating Value</em>' attribute.
	 * @see #getLowerHeatingValue()
	 * @generated
	 */
	void setLowerHeatingValue(Double value);

	/**
	 * Returns the value of the '<em><b>Higher Heating Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Higher Heating Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Higher Heating Value</em>' attribute.
	 * @see #setHigherHeatingValue(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFuelProperties_HigherHeatingValue()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHeatingValueMeasureObject"
	 *        extendedMetaData="kind='element' name='HigherHeatingValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getHigherHeatingValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFuelProperties#getHigherHeatingValue <em>Higher Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Higher Heating Value</em>' attribute.
	 * @see #getHigherHeatingValue()
	 * @generated
	 */
	void setHigherHeatingValue(Double value);

} // IfcFuelProperties
