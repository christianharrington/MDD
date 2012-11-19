/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electrical Base Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricalBaseProperties()
 * @model extendedMetaData="name='IfcElectricalBaseProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcElectricalBaseProperties extends IfcEnergyProperties {
	/**
	 * Returns the value of the '<em><b>Electric Current Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electric Current Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric Current Type</em>' attribute.
	 * @see #setElectricCurrentType(IfcElectricCurrentEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricalBaseProperties_ElectricCurrentType()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricCurrentEnumObject"
	 *        extendedMetaData="kind='element' name='ElectricCurrentType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcElectricCurrentEnum getElectricCurrentType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric Current Type</em>' attribute.
	 * @see #getElectricCurrentType()
	 * @generated
	 */
	void setElectricCurrentType(IfcElectricCurrentEnum value);

	/**
	 * Returns the value of the '<em><b>Input Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Voltage</em>' attribute.
	 * @see #setInputVoltage(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricalBaseProperties_InputVoltage()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricVoltageMeasure" required="true"
	 *        extendedMetaData="kind='element' name='InputVoltage' namespace='##targetNamespace'"
	 * @generated
	 */
	double getInputVoltage();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Voltage</em>' attribute.
	 * @see #getInputVoltage()
	 * @generated
	 */
	void setInputVoltage(double value);

	/**
	 * Returns the value of the '<em><b>Input Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Frequency</em>' attribute.
	 * @see #setInputFrequency(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricalBaseProperties_InputFrequency()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFrequencyMeasure" required="true"
	 *        extendedMetaData="kind='element' name='InputFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	double getInputFrequency();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Frequency</em>' attribute.
	 * @see #getInputFrequency()
	 * @generated
	 */
	void setInputFrequency(double value);

	/**
	 * Returns the value of the '<em><b>Full Load Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Load Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Load Current</em>' attribute.
	 * @see #setFullLoadCurrent(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricalBaseProperties_FullLoadCurrent()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricCurrentMeasureObject"
	 *        extendedMetaData="kind='element' name='FullLoadCurrent' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getFullLoadCurrent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Load Current</em>' attribute.
	 * @see #getFullLoadCurrent()
	 * @generated
	 */
	void setFullLoadCurrent(Double value);

	/**
	 * Returns the value of the '<em><b>Minimum Circuit Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Circuit Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Circuit Current</em>' attribute.
	 * @see #setMinimumCircuitCurrent(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricalBaseProperties_MinimumCircuitCurrent()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricCurrentMeasureObject"
	 *        extendedMetaData="kind='element' name='MinimumCircuitCurrent' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMinimumCircuitCurrent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Circuit Current</em>' attribute.
	 * @see #getMinimumCircuitCurrent()
	 * @generated
	 */
	void setMinimumCircuitCurrent(Double value);

	/**
	 * Returns the value of the '<em><b>Maximum Power Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Power Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Power Input</em>' attribute.
	 * @see #setMaximumPowerInput(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricalBaseProperties_MaximumPowerInput()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPowerMeasureObject"
	 *        extendedMetaData="kind='element' name='MaximumPowerInput' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMaximumPowerInput();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Power Input</em>' attribute.
	 * @see #getMaximumPowerInput()
	 * @generated
	 */
	void setMaximumPowerInput(Double value);

	/**
	 * Returns the value of the '<em><b>Rated Power Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Power Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Power Input</em>' attribute.
	 * @see #setRatedPowerInput(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricalBaseProperties_RatedPowerInput()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPowerMeasureObject"
	 *        extendedMetaData="kind='element' name='RatedPowerInput' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getRatedPowerInput();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Power Input</em>' attribute.
	 * @see #getRatedPowerInput()
	 * @generated
	 */
	void setRatedPowerInput(Double value);

	/**
	 * Returns the value of the '<em><b>Input Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Phase</em>' attribute.
	 * @see #setInputPhase(long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricalBaseProperties_InputPhase()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='InputPhase' namespace='##targetNamespace'"
	 * @generated
	 */
	long getInputPhase();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Phase</em>' attribute.
	 * @see #getInputPhase()
	 * @generated
	 */
	void setInputPhase(long value);

} // IfcElectricalBaseProperties
