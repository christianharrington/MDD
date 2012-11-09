/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcElectricCurrentEnum;
import ifc2x3tc1.IfcElectricalBaseProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electrical Base Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getElectricCurrentType <em>Electric Current Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getInputVoltage <em>Input Voltage</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getInputVoltageAsString <em>Input Voltage As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getInputFrequency <em>Input Frequency</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getInputFrequencyAsString <em>Input Frequency As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getFullLoadCurrent <em>Full Load Current</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getFullLoadCurrentAsString <em>Full Load Current As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getMinimumCircuitCurrentAsString <em>Minimum Circuit Current As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getMaximumPowerInput <em>Maximum Power Input</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getMaximumPowerInputAsString <em>Maximum Power Input As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getRatedPowerInput <em>Rated Power Input</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getRatedPowerInputAsString <em>Rated Power Input As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElectricalBasePropertiesImpl#getInputPhase <em>Input Phase</em>}</li>
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
	protected static final IfcElectricCurrentEnum ELECTRIC_CURRENT_TYPE_EDEFAULT = IfcElectricCurrentEnum.NULL;

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
	 * This is true if the Electric Current Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean electricCurrentTypeESet;

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
	 * The default value of the '{@link #getInputVoltageAsString() <em>Input Voltage As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVoltageAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_VOLTAGE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputVoltageAsString() <em>Input Voltage As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVoltageAsString()
	 * @generated
	 * @ordered
	 */
	protected String inputVoltageAsString = INPUT_VOLTAGE_AS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getInputFrequencyAsString() <em>Input Frequency As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFrequencyAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_FREQUENCY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputFrequencyAsString() <em>Input Frequency As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFrequencyAsString()
	 * @generated
	 * @ordered
	 */
	protected String inputFrequencyAsString = INPUT_FREQUENCY_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullLoadCurrent() <em>Full Load Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullLoadCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final double FULL_LOAD_CURRENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFullLoadCurrent() <em>Full Load Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullLoadCurrent()
	 * @generated
	 * @ordered
	 */
	protected double fullLoadCurrent = FULL_LOAD_CURRENT_EDEFAULT;

	/**
	 * This is true if the Full Load Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fullLoadCurrentESet;

	/**
	 * The default value of the '{@link #getFullLoadCurrentAsString() <em>Full Load Current As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullLoadCurrentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_LOAD_CURRENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullLoadCurrentAsString() <em>Full Load Current As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullLoadCurrentAsString()
	 * @generated
	 * @ordered
	 */
	protected String fullLoadCurrentAsString = FULL_LOAD_CURRENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Full Load Current As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fullLoadCurrentAsStringESet;

	/**
	 * The default value of the '{@link #getMinimumCircuitCurrent() <em>Minimum Circuit Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCircuitCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_CIRCUIT_CURRENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumCircuitCurrent() <em>Minimum Circuit Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCircuitCurrent()
	 * @generated
	 * @ordered
	 */
	protected double minimumCircuitCurrent = MINIMUM_CIRCUIT_CURRENT_EDEFAULT;

	/**
	 * This is true if the Minimum Circuit Current attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumCircuitCurrentESet;

	/**
	 * The default value of the '{@link #getMinimumCircuitCurrentAsString() <em>Minimum Circuit Current As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCircuitCurrentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_CIRCUIT_CURRENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumCircuitCurrentAsString() <em>Minimum Circuit Current As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCircuitCurrentAsString()
	 * @generated
	 * @ordered
	 */
	protected String minimumCircuitCurrentAsString = MINIMUM_CIRCUIT_CURRENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Minimum Circuit Current As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumCircuitCurrentAsStringESet;

	/**
	 * The default value of the '{@link #getMaximumPowerInput() <em>Maximum Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPowerInput()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_POWER_INPUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumPowerInput() <em>Maximum Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPowerInput()
	 * @generated
	 * @ordered
	 */
	protected double maximumPowerInput = MAXIMUM_POWER_INPUT_EDEFAULT;

	/**
	 * This is true if the Maximum Power Input attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumPowerInputESet;

	/**
	 * The default value of the '{@link #getMaximumPowerInputAsString() <em>Maximum Power Input As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPowerInputAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_POWER_INPUT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumPowerInputAsString() <em>Maximum Power Input As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPowerInputAsString()
	 * @generated
	 * @ordered
	 */
	protected String maximumPowerInputAsString = MAXIMUM_POWER_INPUT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Maximum Power Input As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumPowerInputAsStringESet;

	/**
	 * The default value of the '{@link #getRatedPowerInput() <em>Rated Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPowerInput()
	 * @generated
	 * @ordered
	 */
	protected static final double RATED_POWER_INPUT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRatedPowerInput() <em>Rated Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPowerInput()
	 * @generated
	 * @ordered
	 */
	protected double ratedPowerInput = RATED_POWER_INPUT_EDEFAULT;

	/**
	 * This is true if the Rated Power Input attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedPowerInputESet;

	/**
	 * The default value of the '{@link #getRatedPowerInputAsString() <em>Rated Power Input As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPowerInputAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RATED_POWER_INPUT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRatedPowerInputAsString() <em>Rated Power Input As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedPowerInputAsString()
	 * @generated
	 * @ordered
	 */
	protected String ratedPowerInputAsString = RATED_POWER_INPUT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Rated Power Input As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ratedPowerInputAsStringESet;

	/**
	 * The default value of the '{@link #getInputPhase() <em>Input Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPhase()
	 * @generated
	 * @ordered
	 */
	protected static final int INPUT_PHASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInputPhase() <em>Input Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPhase()
	 * @generated
	 * @ordered
	 */
	protected int inputPhase = INPUT_PHASE_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcElectricalBaseProperties();
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
		electricCurrentType = newElectricCurrentType == null ? ELECTRIC_CURRENT_TYPE_EDEFAULT : newElectricCurrentType;
		boolean oldElectricCurrentTypeESet = electricCurrentTypeESet;
		electricCurrentTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE, oldElectricCurrentType, electricCurrentType, !oldElectricCurrentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElectricCurrentType() {
		IfcElectricCurrentEnum oldElectricCurrentType = electricCurrentType;
		boolean oldElectricCurrentTypeESet = electricCurrentTypeESet;
		electricCurrentType = ELECTRIC_CURRENT_TYPE_EDEFAULT;
		electricCurrentTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE, oldElectricCurrentType, ELECTRIC_CURRENT_TYPE_EDEFAULT, oldElectricCurrentTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElectricCurrentType() {
		return electricCurrentTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE, oldInputVoltage, inputVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputVoltageAsString() {
		return inputVoltageAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVoltageAsString(String newInputVoltageAsString) {
		String oldInputVoltageAsString = inputVoltageAsString;
		inputVoltageAsString = newInputVoltageAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE_AS_STRING, oldInputVoltageAsString, inputVoltageAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY, oldInputFrequency, inputFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputFrequencyAsString() {
		return inputFrequencyAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFrequencyAsString(String newInputFrequencyAsString) {
		String oldInputFrequencyAsString = inputFrequencyAsString;
		inputFrequencyAsString = newInputFrequencyAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY_AS_STRING, oldInputFrequencyAsString, inputFrequencyAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFullLoadCurrent() {
		return fullLoadCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullLoadCurrent(double newFullLoadCurrent) {
		double oldFullLoadCurrent = fullLoadCurrent;
		fullLoadCurrent = newFullLoadCurrent;
		boolean oldFullLoadCurrentESet = fullLoadCurrentESet;
		fullLoadCurrentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT, oldFullLoadCurrent, fullLoadCurrent, !oldFullLoadCurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFullLoadCurrent() {
		double oldFullLoadCurrent = fullLoadCurrent;
		boolean oldFullLoadCurrentESet = fullLoadCurrentESet;
		fullLoadCurrent = FULL_LOAD_CURRENT_EDEFAULT;
		fullLoadCurrentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT, oldFullLoadCurrent, FULL_LOAD_CURRENT_EDEFAULT, oldFullLoadCurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFullLoadCurrent() {
		return fullLoadCurrentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullLoadCurrentAsString() {
		return fullLoadCurrentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullLoadCurrentAsString(String newFullLoadCurrentAsString) {
		String oldFullLoadCurrentAsString = fullLoadCurrentAsString;
		fullLoadCurrentAsString = newFullLoadCurrentAsString;
		boolean oldFullLoadCurrentAsStringESet = fullLoadCurrentAsStringESet;
		fullLoadCurrentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT_AS_STRING, oldFullLoadCurrentAsString, fullLoadCurrentAsString, !oldFullLoadCurrentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFullLoadCurrentAsString() {
		String oldFullLoadCurrentAsString = fullLoadCurrentAsString;
		boolean oldFullLoadCurrentAsStringESet = fullLoadCurrentAsStringESet;
		fullLoadCurrentAsString = FULL_LOAD_CURRENT_AS_STRING_EDEFAULT;
		fullLoadCurrentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT_AS_STRING, oldFullLoadCurrentAsString, FULL_LOAD_CURRENT_AS_STRING_EDEFAULT, oldFullLoadCurrentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFullLoadCurrentAsString() {
		return fullLoadCurrentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumCircuitCurrent() {
		return minimumCircuitCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCircuitCurrent(double newMinimumCircuitCurrent) {
		double oldMinimumCircuitCurrent = minimumCircuitCurrent;
		minimumCircuitCurrent = newMinimumCircuitCurrent;
		boolean oldMinimumCircuitCurrentESet = minimumCircuitCurrentESet;
		minimumCircuitCurrentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT, oldMinimumCircuitCurrent, minimumCircuitCurrent, !oldMinimumCircuitCurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumCircuitCurrent() {
		double oldMinimumCircuitCurrent = minimumCircuitCurrent;
		boolean oldMinimumCircuitCurrentESet = minimumCircuitCurrentESet;
		minimumCircuitCurrent = MINIMUM_CIRCUIT_CURRENT_EDEFAULT;
		minimumCircuitCurrentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT, oldMinimumCircuitCurrent, MINIMUM_CIRCUIT_CURRENT_EDEFAULT, oldMinimumCircuitCurrentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumCircuitCurrent() {
		return minimumCircuitCurrentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumCircuitCurrentAsString() {
		return minimumCircuitCurrentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCircuitCurrentAsString(String newMinimumCircuitCurrentAsString) {
		String oldMinimumCircuitCurrentAsString = minimumCircuitCurrentAsString;
		minimumCircuitCurrentAsString = newMinimumCircuitCurrentAsString;
		boolean oldMinimumCircuitCurrentAsStringESet = minimumCircuitCurrentAsStringESet;
		minimumCircuitCurrentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT_AS_STRING, oldMinimumCircuitCurrentAsString, minimumCircuitCurrentAsString, !oldMinimumCircuitCurrentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumCircuitCurrentAsString() {
		String oldMinimumCircuitCurrentAsString = minimumCircuitCurrentAsString;
		boolean oldMinimumCircuitCurrentAsStringESet = minimumCircuitCurrentAsStringESet;
		minimumCircuitCurrentAsString = MINIMUM_CIRCUIT_CURRENT_AS_STRING_EDEFAULT;
		minimumCircuitCurrentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT_AS_STRING, oldMinimumCircuitCurrentAsString, MINIMUM_CIRCUIT_CURRENT_AS_STRING_EDEFAULT, oldMinimumCircuitCurrentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumCircuitCurrentAsString() {
		return minimumCircuitCurrentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumPowerInput() {
		return maximumPowerInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPowerInput(double newMaximumPowerInput) {
		double oldMaximumPowerInput = maximumPowerInput;
		maximumPowerInput = newMaximumPowerInput;
		boolean oldMaximumPowerInputESet = maximumPowerInputESet;
		maximumPowerInputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT, oldMaximumPowerInput, maximumPowerInput, !oldMaximumPowerInputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumPowerInput() {
		double oldMaximumPowerInput = maximumPowerInput;
		boolean oldMaximumPowerInputESet = maximumPowerInputESet;
		maximumPowerInput = MAXIMUM_POWER_INPUT_EDEFAULT;
		maximumPowerInputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT, oldMaximumPowerInput, MAXIMUM_POWER_INPUT_EDEFAULT, oldMaximumPowerInputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumPowerInput() {
		return maximumPowerInputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumPowerInputAsString() {
		return maximumPowerInputAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPowerInputAsString(String newMaximumPowerInputAsString) {
		String oldMaximumPowerInputAsString = maximumPowerInputAsString;
		maximumPowerInputAsString = newMaximumPowerInputAsString;
		boolean oldMaximumPowerInputAsStringESet = maximumPowerInputAsStringESet;
		maximumPowerInputAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT_AS_STRING, oldMaximumPowerInputAsString, maximumPowerInputAsString, !oldMaximumPowerInputAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumPowerInputAsString() {
		String oldMaximumPowerInputAsString = maximumPowerInputAsString;
		boolean oldMaximumPowerInputAsStringESet = maximumPowerInputAsStringESet;
		maximumPowerInputAsString = MAXIMUM_POWER_INPUT_AS_STRING_EDEFAULT;
		maximumPowerInputAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT_AS_STRING, oldMaximumPowerInputAsString, MAXIMUM_POWER_INPUT_AS_STRING_EDEFAULT, oldMaximumPowerInputAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumPowerInputAsString() {
		return maximumPowerInputAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRatedPowerInput() {
		return ratedPowerInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedPowerInput(double newRatedPowerInput) {
		double oldRatedPowerInput = ratedPowerInput;
		ratedPowerInput = newRatedPowerInput;
		boolean oldRatedPowerInputESet = ratedPowerInputESet;
		ratedPowerInputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT, oldRatedPowerInput, ratedPowerInput, !oldRatedPowerInputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRatedPowerInput() {
		double oldRatedPowerInput = ratedPowerInput;
		boolean oldRatedPowerInputESet = ratedPowerInputESet;
		ratedPowerInput = RATED_POWER_INPUT_EDEFAULT;
		ratedPowerInputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT, oldRatedPowerInput, RATED_POWER_INPUT_EDEFAULT, oldRatedPowerInputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRatedPowerInput() {
		return ratedPowerInputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRatedPowerInputAsString() {
		return ratedPowerInputAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatedPowerInputAsString(String newRatedPowerInputAsString) {
		String oldRatedPowerInputAsString = ratedPowerInputAsString;
		ratedPowerInputAsString = newRatedPowerInputAsString;
		boolean oldRatedPowerInputAsStringESet = ratedPowerInputAsStringESet;
		ratedPowerInputAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT_AS_STRING, oldRatedPowerInputAsString, ratedPowerInputAsString, !oldRatedPowerInputAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRatedPowerInputAsString() {
		String oldRatedPowerInputAsString = ratedPowerInputAsString;
		boolean oldRatedPowerInputAsStringESet = ratedPowerInputAsStringESet;
		ratedPowerInputAsString = RATED_POWER_INPUT_AS_STRING_EDEFAULT;
		ratedPowerInputAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT_AS_STRING, oldRatedPowerInputAsString, RATED_POWER_INPUT_AS_STRING_EDEFAULT, oldRatedPowerInputAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRatedPowerInputAsString() {
		return ratedPowerInputAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInputPhase() {
		return inputPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPhase(int newInputPhase) {
		int oldInputPhase = inputPhase;
		inputPhase = newInputPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE, oldInputPhase, inputPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE:
				return getElectricCurrentType();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE:
				return getInputVoltage();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE_AS_STRING:
				return getInputVoltageAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY:
				return getInputFrequency();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY_AS_STRING:
				return getInputFrequencyAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT:
				return getFullLoadCurrent();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT_AS_STRING:
				return getFullLoadCurrentAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT:
				return getMinimumCircuitCurrent();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT_AS_STRING:
				return getMinimumCircuitCurrentAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT:
				return getMaximumPowerInput();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT_AS_STRING:
				return getMaximumPowerInputAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT:
				return getRatedPowerInput();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT_AS_STRING:
				return getRatedPowerInputAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE:
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
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE:
				setElectricCurrentType((IfcElectricCurrentEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE:
				setInputVoltage((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE_AS_STRING:
				setInputVoltageAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY:
				setInputFrequency((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY_AS_STRING:
				setInputFrequencyAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT:
				setFullLoadCurrent((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT_AS_STRING:
				setFullLoadCurrentAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT:
				setMinimumCircuitCurrent((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT_AS_STRING:
				setMinimumCircuitCurrentAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT:
				setMaximumPowerInput((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT_AS_STRING:
				setMaximumPowerInputAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT:
				setRatedPowerInput((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT_AS_STRING:
				setRatedPowerInputAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE:
				setInputPhase((Integer)newValue);
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
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE:
				unsetElectricCurrentType();
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE:
				setInputVoltage(INPUT_VOLTAGE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE_AS_STRING:
				setInputVoltageAsString(INPUT_VOLTAGE_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY:
				setInputFrequency(INPUT_FREQUENCY_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY_AS_STRING:
				setInputFrequencyAsString(INPUT_FREQUENCY_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT:
				unsetFullLoadCurrent();
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT_AS_STRING:
				unsetFullLoadCurrentAsString();
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT:
				unsetMinimumCircuitCurrent();
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT_AS_STRING:
				unsetMinimumCircuitCurrentAsString();
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT:
				unsetMaximumPowerInput();
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT_AS_STRING:
				unsetMaximumPowerInputAsString();
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT:
				unsetRatedPowerInput();
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT_AS_STRING:
				unsetRatedPowerInputAsString();
				return;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE:
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
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__ELECTRIC_CURRENT_TYPE:
				return isSetElectricCurrentType();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE:
				return inputVoltage != INPUT_VOLTAGE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_VOLTAGE_AS_STRING:
				return INPUT_VOLTAGE_AS_STRING_EDEFAULT == null ? inputVoltageAsString != null : !INPUT_VOLTAGE_AS_STRING_EDEFAULT.equals(inputVoltageAsString);
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY:
				return inputFrequency != INPUT_FREQUENCY_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_FREQUENCY_AS_STRING:
				return INPUT_FREQUENCY_AS_STRING_EDEFAULT == null ? inputFrequencyAsString != null : !INPUT_FREQUENCY_AS_STRING_EDEFAULT.equals(inputFrequencyAsString);
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT:
				return isSetFullLoadCurrent();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__FULL_LOAD_CURRENT_AS_STRING:
				return isSetFullLoadCurrentAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT:
				return isSetMinimumCircuitCurrent();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MINIMUM_CIRCUIT_CURRENT_AS_STRING:
				return isSetMinimumCircuitCurrentAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT:
				return isSetMaximumPowerInput();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__MAXIMUM_POWER_INPUT_AS_STRING:
				return isSetMaximumPowerInputAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT:
				return isSetRatedPowerInput();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__RATED_POWER_INPUT_AS_STRING:
				return isSetRatedPowerInputAsString();
			case Ifc2x3tc1Package.IFC_ELECTRICAL_BASE_PROPERTIES__INPUT_PHASE:
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
		result.append(" (ElectricCurrentType: ");
		if (electricCurrentTypeESet) result.append(electricCurrentType); else result.append("<unset>");
		result.append(", InputVoltage: ");
		result.append(inputVoltage);
		result.append(", InputVoltageAsString: ");
		result.append(inputVoltageAsString);
		result.append(", InputFrequency: ");
		result.append(inputFrequency);
		result.append(", InputFrequencyAsString: ");
		result.append(inputFrequencyAsString);
		result.append(", FullLoadCurrent: ");
		if (fullLoadCurrentESet) result.append(fullLoadCurrent); else result.append("<unset>");
		result.append(", FullLoadCurrentAsString: ");
		if (fullLoadCurrentAsStringESet) result.append(fullLoadCurrentAsString); else result.append("<unset>");
		result.append(", MinimumCircuitCurrent: ");
		if (minimumCircuitCurrentESet) result.append(minimumCircuitCurrent); else result.append("<unset>");
		result.append(", MinimumCircuitCurrentAsString: ");
		if (minimumCircuitCurrentAsStringESet) result.append(minimumCircuitCurrentAsString); else result.append("<unset>");
		result.append(", MaximumPowerInput: ");
		if (maximumPowerInputESet) result.append(maximumPowerInput); else result.append("<unset>");
		result.append(", MaximumPowerInputAsString: ");
		if (maximumPowerInputAsStringESet) result.append(maximumPowerInputAsString); else result.append("<unset>");
		result.append(", RatedPowerInput: ");
		if (ratedPowerInputESet) result.append(ratedPowerInput); else result.append("<unset>");
		result.append(", RatedPowerInputAsString: ");
		if (ratedPowerInputAsStringESet) result.append(ratedPowerInputAsString); else result.append("<unset>");
		result.append(", InputPhase: ");
		result.append(inputPhase);
		result.append(')');
		return result.toString();
	}

} //IfcElectricalBasePropertiesImpl
