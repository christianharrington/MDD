/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Thermal Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcThermalMaterialProperties()
 * @model extendedMetaData="name='IfcThermalMaterialProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcThermalMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Specific Heat Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Heat Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Heat Capacity</em>' attribute.
	 * @see #setSpecificHeatCapacity(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcThermalMaterialProperties_SpecificHeatCapacity()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecificHeatCapacityMeasureObject"
	 *        extendedMetaData="kind='element' name='SpecificHeatCapacity' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getSpecificHeatCapacity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalMaterialProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Heat Capacity</em>' attribute.
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 */
	void setSpecificHeatCapacity(Double value);

	/**
	 * Returns the value of the '<em><b>Boiling Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boiling Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boiling Point</em>' attribute.
	 * @see #setBoilingPoint(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcThermalMaterialProperties_BoilingPoint()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureObject"
	 *        extendedMetaData="kind='element' name='BoilingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getBoilingPoint();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalMaterialProperties#getBoilingPoint <em>Boiling Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boiling Point</em>' attribute.
	 * @see #getBoilingPoint()
	 * @generated
	 */
	void setBoilingPoint(Double value);

	/**
	 * Returns the value of the '<em><b>Freezing Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freezing Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freezing Point</em>' attribute.
	 * @see #setFreezingPoint(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcThermalMaterialProperties_FreezingPoint()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureObject"
	 *        extendedMetaData="kind='element' name='FreezingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getFreezingPoint();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalMaterialProperties#getFreezingPoint <em>Freezing Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freezing Point</em>' attribute.
	 * @see #getFreezingPoint()
	 * @generated
	 */
	void setFreezingPoint(Double value);

	/**
	 * Returns the value of the '<em><b>Thermal Conductivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Conductivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Conductivity</em>' attribute.
	 * @see #setThermalConductivity(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcThermalMaterialProperties_ThermalConductivity()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalConductivityMeasureObject"
	 *        extendedMetaData="kind='element' name='ThermalConductivity' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getThermalConductivity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalMaterialProperties#getThermalConductivity <em>Thermal Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity</em>' attribute.
	 * @see #getThermalConductivity()
	 * @generated
	 */
	void setThermalConductivity(Double value);

} // IfcThermalMaterialProperties
