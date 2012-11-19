/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricCurrentEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricalBaseProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electrical Base Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricalBasePropertiesImpl#getElectricCurrentType <em>Electric Current Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricalBasePropertiesImpl#getInputVoltage <em>Input Voltage</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricalBasePropertiesImpl#getInputFrequency <em>Input Frequency</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricalBasePropertiesImpl#getFullLoadCurrent <em>Full Load Current</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricalBasePropertiesImpl#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricalBasePropertiesImpl#getMaximumPowerInput <em>Maximum Power Input</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricalBasePropertiesImpl#getRatedPowerInput <em>Rated Power Input</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricalBasePropertiesImpl#getInputPhase <em>Input Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElectricalBasePropertiesImpl extends IfcEnergyPropertiesImpl implements IfcElectricalBaseProperties {
	/**
	 * The default value of the '{@link #getElectricCurrentType() <em>Electric Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrentType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcElectricCurrentEnum ELECTRIC_CURRENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElectricCurrentType() <em>Electric Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrentType()
	 * @generated
	 * @ordered
	 */
	protected IfcElectricCurrentEnum electricCurrentType = ELECTRIC_CURRENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputVoltage() <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double INPUT_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInputVoltage() <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVoltage()
	 * @generated
	 * @ordered
	 */
	protected double inputVoltage = INPUT_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputFrequency() <em>Input Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final double INPUT_FREQUENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInputFrequency() <em>Input Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFrequency()
	 * @generated
	 * @ordered
	 */
	protected double inputFrequency = INPUT_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullLoadCurrent() <em>Full Load Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullLoadCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final Double FULL_LOAD_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullLoadCurrent() <em>Full Load Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullLoadCurrent()
	 * @generated
	 * @ordered
	 */
	protected Double fullLoadCurrent = FULL_LOAD_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumCircuitCurrent() <em>Minimum Circuit Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCircuitCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_CIRCUIT_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumCircuitCurrent() <em>Minimum Circuit Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCircuitCurrent()
	 * @generated
	 * @ordered
	 */
	protected Double minimumCircuitCurrent = MINIMUM_CIRCUIT_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumPowerInput() <em>Maximum Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPowerInput()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAXIMUM_POWER_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumPowerInput() <em>Maximum Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPowerInput()
	 * @generated
	 * @ordered
	 */
	protected Double maximumPowerInput = MAXIMUM_POWER_INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatedPowerInput() <em>Rated Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPowerInput()
	 * @generated
	 * @ordered
	 */
	protected static final Double RATED_POWER_INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRatedPowerInput() <em>Rated Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPowerInput()
	 * @generated
	 * @ordered
	 */
	protected Double ratedPowerInput = RATED_POWER_INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputPhase() <em>Input Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPhase()
	 * @generated
	 * @ordered
	 */
	protected static final long INPUT_PHASE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInputPhase() <em>Input Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPhase()
	 * @generated
	 * @ordered
	 */
	protected long inputPhase = INPUT_PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElectricalBasePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcElectricalBaseProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentEnum getElectricCurrentType() {
		return electricCurrentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricCurrentType(IfcElectricCurrentEnum newElectricCurrentType) {
		IfcElectricCurrentEnum oldElectricCurrentType = electricCurrentType;
		electricCurrentType = newElectricCurrentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE, oldElectricCurrentType, electricCurrentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInputVoltage() {
		return inputVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVoltage(double newInputVoltage) {
		double oldInputVoltage = inputVoltage;
		inputVoltage = newInputVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE, oldInputVoltage, inputVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInputFrequency() {
		return inputFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFrequency(double newInputFrequency) {
		double oldInputFrequency = inputFrequency;
		inputFrequency = newInputFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY, oldInputFrequency, inputFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFullLoadCurrent() {
		return fullLoadCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullLoadCurrent(Double newFullLoadCurrent) {
		Double oldFullLoadCurrent = fullLoadCurrent;
		fullLoadCurrent = newFullLoadCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT, oldFullLoadCurrent, fullLoadCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumCircuitCurrent() {
		return minimumCircuitCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCircuitCurrent(Double newMinimumCircuitCurrent) {
		Double oldMinimumCircuitCurrent = minimumCircuitCurrent;
		minimumCircuitCurrent = newMinimumCircuitCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT, oldMinimumCircuitCurrent, minimumCircuitCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximumPowerInput() {
		return maximumPowerInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPowerInput(Double newMaximumPowerInput) {
		Double oldMaximumPowerInput = maximumPowerInput;
		maximumPowerInput = newMaximumPowerInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT, oldMaximumPowerInput, maximumPowerInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRatedPowerInput() {
		return ratedPowerInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedPowerInput(Double newRatedPowerInput) {
		Double oldRatedPowerInput = ratedPowerInput;
		ratedPowerInput = newRatedPowerInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT, oldRatedPowerInput, ratedPowerInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getInputPhase() {
		return inputPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPhase(long newInputPhase) {
		long oldInputPhase = inputPhase;
		inputPhase = newInputPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE, oldInputPhase, inputPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE:
				return getElectricCurrentType();
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE:
				return getInputVoltage();
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY:
				return getInputFrequency();
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT:
				return getFullLoadCurrent();
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT:
				return getMinimumCircuitCurrent();
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT:
				return getMaximumPowerInput();
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT:
				return getRatedPowerInput();
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE:
				return getInputPhase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE:
				setElectricCurrentType((IfcElectricCurrentEnum)newValue);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE:
				setInputVoltage((Double)newValue);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY:
				setInputFrequency((Double)newValue);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT:
				setFullLoadCurrent((Double)newValue);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT:
				setMinimumCircuitCurrent((Double)newValue);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT:
				setMaximumPowerInput((Double)newValue);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT:
				setRatedPowerInput((Double)newValue);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE:
				setInputPhase((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE:
				setElectricCurrentType(ELECTRIC_CURRENT_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE:
				setInputVoltage(INPUT_VOLTAGE_EDEFAULT);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY:
				setInputFrequency(INPUT_FREQUENCY_EDEFAULT);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT:
				setFullLoadCurrent(FULL_LOAD_CURRENT_EDEFAULT);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT:
				setMinimumCircuitCurrent(MINIMUM_CIRCUIT_CURRENT_EDEFAULT);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT:
				setMaximumPowerInput(MAXIMUM_POWER_INPUT_EDEFAULT);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT:
				setRatedPowerInput(RATED_POWER_INPUT_EDEFAULT);
				return;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE:
				setInputPhase(INPUT_PHASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE:
				return ELECTRIC_CURRENT_TYPE_EDEFAULT == null ? electricCurrentType != null : !ELECTRIC_CURRENT_TYPE_EDEFAULT.equals(electricCurrentType);
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE:
				return inputVoltage != INPUT_VOLTAGE_EDEFAULT;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY:
				return inputFrequency != INPUT_FREQUENCY_EDEFAULT;
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT:
				return FULL_LOAD_CURRENT_EDEFAULT == null ? fullLoadCurrent != null : !FULL_LOAD_CURRENT_EDEFAULT.equals(fullLoadCurrent);
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT:
				return MINIMUM_CIRCUIT_CURRENT_EDEFAULT == null ? minimumCircuitCurrent != null : !MINIMUM_CIRCUIT_CURRENT_EDEFAULT.equals(minimumCircuitCurrent);
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT:
				return MAXIMUM_POWER_INPUT_EDEFAULT == null ? maximumPowerInput != null : !MAXIMUM_POWER_INPUT_EDEFAULT.equals(maximumPowerInput);
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT:
				return RATED_POWER_INPUT_EDEFAULT == null ? ratedPowerInput != null : !RATED_POWER_INPUT_EDEFAULT.equals(ratedPowerInput);
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE:
				return inputPhase != INPUT_PHASE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (electricCurrentType: ");
		result.append(electricCurrentType);
		result.append(", inputVoltage: ");
		result.append(inputVoltage);
		result.append(", inputFrequency: ");
		result.append(inputFrequency);
		result.append(", fullLoadCurrent: ");
		result.append(fullLoadCurrent);
		result.append(", minimumCircuitCurrent: ");
		result.append(minimumCircuitCurrent);
		result.append(", maximumPowerInput: ");
		result.append(maximumPowerInput);
		result.append(", ratedPowerInput: ");
		result.append(ratedPowerInput);
		result.append(", inputPhase: ");
		result.append(inputPhase);
		result.append(')');
		return result.toString();
	}

} //IfcElectricalBasePropertiesImpl
