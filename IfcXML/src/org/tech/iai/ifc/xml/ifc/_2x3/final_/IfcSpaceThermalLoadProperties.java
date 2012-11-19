/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Space Thermal Load Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getThermalLoadSource <em>Thermal Load Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getThermalLoadType <em>Thermal Load Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties()
 * @model extendedMetaData="name='IfcSpaceThermalLoadProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcSpaceThermalLoadProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Applicable Value Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicable Value Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicable Value Ratio</em>' attribute.
	 * @see #setApplicableValueRatio(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_ApplicableValueRatio()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='ApplicableValueRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getApplicableValueRatio();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getApplicableValueRatio <em>Applicable Value Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Value Ratio</em>' attribute.
	 * @see #getApplicableValueRatio()
	 * @generated
	 */
	void setApplicableValueRatio(Double value);

	/**
	 * Returns the value of the '<em><b>Thermal Load Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalLoadSourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Load Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Load Source</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalLoadSourceEnum
	 * @see #setThermalLoadSource(IfcThermalLoadSourceEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_ThermalLoadSource()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ThermalLoadSource' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcThermalLoadSourceEnum getThermalLoadSource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getThermalLoadSource <em>Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load Source</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalLoadSourceEnum
	 * @see #getThermalLoadSource()
	 * @generated
	 */
	void setThermalLoadSource(IfcThermalLoadSourceEnum value);

	/**
	 * Returns the value of the '<em><b>Property Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Source</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySourceEnum
	 * @see #setPropertySource(IfcPropertySourceEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_PropertySource()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertySource' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPropertySourceEnum getPropertySource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getPropertySource <em>Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Source</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySourceEnum
	 * @see #getPropertySource()
	 * @generated
	 */
	void setPropertySource(IfcPropertySourceEnum value);

	/**
	 * Returns the value of the '<em><b>Source Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Description</em>' attribute.
	 * @see #setSourceDescription(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_SourceDescription()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='SourceDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceDescription();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getSourceDescription <em>Source Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Description</em>' attribute.
	 * @see #getSourceDescription()
	 * @generated
	 */
	void setSourceDescription(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Value</em>' attribute.
	 * @see #setMaximumValue(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_MaximumValue()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPowerMeasure" required="true"
	 *        extendedMetaData="kind='element' name='MaximumValue' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaximumValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' attribute.
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(double value);

	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Value</em>' attribute.
	 * @see #setMinimumValue(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_MinimumValue()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPowerMeasureObject"
	 *        extendedMetaData="kind='element' name='MinimumValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMinimumValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' attribute.
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(Double value);

	/**
	 * Returns the value of the '<em><b>Thermal Load Time Series Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Load Time Series Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Load Time Series Values</em>' containment reference.
	 * @see #setThermalLoadTimeSeriesValues(ThermalLoadTimeSeriesValuesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_ThermalLoadTimeSeriesValues()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ThermalLoadTimeSeriesValues' namespace='##targetNamespace'"
	 * @generated
	 */
	ThermalLoadTimeSeriesValuesType getThermalLoadTimeSeriesValues();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load Time Series Values</em>' containment reference.
	 * @see #getThermalLoadTimeSeriesValues()
	 * @generated
	 */
	void setThermalLoadTimeSeriesValues(ThermalLoadTimeSeriesValuesType value);

	/**
	 * Returns the value of the '<em><b>User Defined Thermal Load Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Thermal Load Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Thermal Load Source</em>' attribute.
	 * @see #setUserDefinedThermalLoadSource(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_UserDefinedThermalLoadSource()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='UserDefinedThermalLoadSource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserDefinedThermalLoadSource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Thermal Load Source</em>' attribute.
	 * @see #getUserDefinedThermalLoadSource()
	 * @generated
	 */
	void setUserDefinedThermalLoadSource(String value);

	/**
	 * Returns the value of the '<em><b>User Defined Property Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Property Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Property Source</em>' attribute.
	 * @see #setUserDefinedPropertySource(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_UserDefinedPropertySource()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='UserDefinedPropertySource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserDefinedPropertySource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Property Source</em>' attribute.
	 * @see #getUserDefinedPropertySource()
	 * @generated
	 */
	void setUserDefinedPropertySource(String value);

	/**
	 * Returns the value of the '<em><b>Thermal Load Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalLoadTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Load Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Load Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalLoadTypeEnum
	 * @see #setThermalLoadType(IfcThermalLoadTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpaceThermalLoadProperties_ThermalLoadType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ThermalLoadType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcThermalLoadTypeEnum getThermalLoadType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties#getThermalLoadType <em>Thermal Load Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Load Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalLoadTypeEnum
	 * @see #getThermalLoadType()
	 * @generated
	 */
	void setThermalLoadType(IfcThermalLoadTypeEnum value);

} // IfcSpaceThermalLoadProperties
