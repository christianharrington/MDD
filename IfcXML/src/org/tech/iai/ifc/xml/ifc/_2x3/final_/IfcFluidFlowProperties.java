/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fluid Flow Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getVelocityTimeSeries <em>Velocity Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFlowrateTimeSeries <em>Flowrate Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFluid <em>Fluid</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getPressureTimeSeries <em>Pressure Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getTemperatureTimeSeries <em>Temperature Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFlowrateSingleValue <em>Flowrate Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties()
 * @model extendedMetaData="name='IfcFluidFlowProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcFluidFlowProperties extends IfcPropertySetDefinition {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_PropertySource()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertySource' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPropertySourceEnum getPropertySource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getPropertySource <em>Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Source</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySourceEnum
	 * @see #getPropertySource()
	 * @generated
	 */
	void setPropertySource(IfcPropertySourceEnum value);

	/**
	 * Returns the value of the '<em><b>Flow Condition Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Condition Time Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Condition Time Series</em>' containment reference.
	 * @see #setFlowConditionTimeSeries(FlowConditionTimeSeriesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_FlowConditionTimeSeries()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FlowConditionTimeSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	FlowConditionTimeSeriesType getFlowConditionTimeSeries();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Condition Time Series</em>' containment reference.
	 * @see #getFlowConditionTimeSeries()
	 * @generated
	 */
	void setFlowConditionTimeSeries(FlowConditionTimeSeriesType value);

	/**
	 * Returns the value of the '<em><b>Velocity Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Time Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Time Series</em>' containment reference.
	 * @see #setVelocityTimeSeries(VelocityTimeSeriesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_VelocityTimeSeries()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='VelocityTimeSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	VelocityTimeSeriesType getVelocityTimeSeries();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getVelocityTimeSeries <em>Velocity Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Time Series</em>' containment reference.
	 * @see #getVelocityTimeSeries()
	 * @generated
	 */
	void setVelocityTimeSeries(VelocityTimeSeriesType value);

	/**
	 * Returns the value of the '<em><b>Flowrate Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowrate Time Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowrate Time Series</em>' containment reference.
	 * @see #setFlowrateTimeSeries(FlowrateTimeSeriesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_FlowrateTimeSeries()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FlowrateTimeSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	FlowrateTimeSeriesType getFlowrateTimeSeries();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFlowrateTimeSeries <em>Flowrate Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowrate Time Series</em>' containment reference.
	 * @see #getFlowrateTimeSeries()
	 * @generated
	 */
	void setFlowrateTimeSeries(FlowrateTimeSeriesType value);

	/**
	 * Returns the value of the '<em><b>Fluid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fluid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fluid</em>' containment reference.
	 * @see #setFluid(FluidType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_Fluid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fluid' namespace='##targetNamespace'"
	 * @generated
	 */
	FluidType getFluid();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFluid <em>Fluid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluid</em>' containment reference.
	 * @see #getFluid()
	 * @generated
	 */
	void setFluid(FluidType value);

	/**
	 * Returns the value of the '<em><b>Pressure Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Time Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Time Series</em>' containment reference.
	 * @see #setPressureTimeSeries(PressureTimeSeriesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_PressureTimeSeries()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PressureTimeSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	PressureTimeSeriesType getPressureTimeSeries();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getPressureTimeSeries <em>Pressure Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Time Series</em>' containment reference.
	 * @see #getPressureTimeSeries()
	 * @generated
	 */
	void setPressureTimeSeries(PressureTimeSeriesType value);

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_UserDefinedPropertySource()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='UserDefinedPropertySource' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserDefinedPropertySource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Property Source</em>' attribute.
	 * @see #getUserDefinedPropertySource()
	 * @generated
	 */
	void setUserDefinedPropertySource(String value);

	/**
	 * Returns the value of the '<em><b>Temperature Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Single Value</em>' attribute.
	 * @see #setTemperatureSingleValue(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_TemperatureSingleValue()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureObject"
	 *        extendedMetaData="kind='element' name='TemperatureSingleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getTemperatureSingleValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Single Value</em>' attribute.
	 * @see #getTemperatureSingleValue()
	 * @generated
	 */
	void setTemperatureSingleValue(Double value);

	/**
	 * Returns the value of the '<em><b>Wet Bulb Temperature Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wet Bulb Temperature Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wet Bulb Temperature Single Value</em>' attribute.
	 * @see #setWetBulbTemperatureSingleValue(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_WetBulbTemperatureSingleValue()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureObject"
	 *        extendedMetaData="kind='element' name='WetBulbTemperatureSingleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getWetBulbTemperatureSingleValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wet Bulb Temperature Single Value</em>' attribute.
	 * @see #getWetBulbTemperatureSingleValue()
	 * @generated
	 */
	void setWetBulbTemperatureSingleValue(Double value);

	/**
	 * Returns the value of the '<em><b>Wet Bulb Temperature Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wet Bulb Temperature Time Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wet Bulb Temperature Time Series</em>' containment reference.
	 * @see #setWetBulbTemperatureTimeSeries(WetBulbTemperatureTimeSeriesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='WetBulbTemperatureTimeSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	WetBulbTemperatureTimeSeriesType getWetBulbTemperatureTimeSeries();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wet Bulb Temperature Time Series</em>' containment reference.
	 * @see #getWetBulbTemperatureTimeSeries()
	 * @generated
	 */
	void setWetBulbTemperatureTimeSeries(WetBulbTemperatureTimeSeriesType value);

	/**
	 * Returns the value of the '<em><b>Temperature Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Time Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Time Series</em>' containment reference.
	 * @see #setTemperatureTimeSeries(TemperatureTimeSeriesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_TemperatureTimeSeries()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TemperatureTimeSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	TemperatureTimeSeriesType getTemperatureTimeSeries();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getTemperatureTimeSeries <em>Temperature Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Time Series</em>' containment reference.
	 * @see #getTemperatureTimeSeries()
	 * @generated
	 */
	void setTemperatureTimeSeries(TemperatureTimeSeriesType value);

	/**
	 * Returns the value of the '<em><b>Flowrate Single Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowrate Single Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowrate Single Value</em>' containment reference.
	 * @see #setFlowrateSingleValue(FlowrateSingleValueType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_FlowrateSingleValue()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FlowrateSingleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	FlowrateSingleValueType getFlowrateSingleValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFlowrateSingleValue <em>Flowrate Single Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowrate Single Value</em>' containment reference.
	 * @see #getFlowrateSingleValue()
	 * @generated
	 */
	void setFlowrateSingleValue(FlowrateSingleValueType value);

	/**
	 * Returns the value of the '<em><b>Flow Condition Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Condition Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Condition Single Value</em>' attribute.
	 * @see #setFlowConditionSingleValue(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_FlowConditionSingleValue()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='FlowConditionSingleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getFlowConditionSingleValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Condition Single Value</em>' attribute.
	 * @see #getFlowConditionSingleValue()
	 * @generated
	 */
	void setFlowConditionSingleValue(Double value);

	/**
	 * Returns the value of the '<em><b>Velocity Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Single Value</em>' attribute.
	 * @see #setVelocitySingleValue(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_VelocitySingleValue()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLinearVelocityMeasureObject"
	 *        extendedMetaData="kind='element' name='VelocitySingleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getVelocitySingleValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Single Value</em>' attribute.
	 * @see #getVelocitySingleValue()
	 * @generated
	 */
	void setVelocitySingleValue(Double value);

	/**
	 * Returns the value of the '<em><b>Pressure Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Single Value</em>' attribute.
	 * @see #setPressureSingleValue(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFluidFlowProperties_PressureSingleValue()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPressureMeasureObject"
	 *        extendedMetaData="kind='element' name='PressureSingleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getPressureSingleValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Single Value</em>' attribute.
	 * @see #getPressureSingleValue()
	 * @generated
	 */
	void setPressureSingleValue(Double value);

} // IfcFluidFlowProperties
