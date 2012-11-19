/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FlowConditionTimeSeriesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FlowrateSingleValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FlowrateTimeSeriesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FluidType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFluidFlowProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySourceEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PressureTimeSeriesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TemperatureTimeSeriesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.VelocityTimeSeriesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.WetBulbTemperatureTimeSeriesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fluid Flow Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getVelocityTimeSeries <em>Velocity Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getFlowrateTimeSeries <em>Flowrate Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getFluid <em>Fluid</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getPressureTimeSeries <em>Pressure Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getTemperatureSingleValue <em>Temperature Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getTemperatureTimeSeries <em>Temperature Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getFlowrateSingleValue <em>Flowrate Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getVelocitySingleValue <em>Velocity Single Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFluidFlowPropertiesImpl#getPressureSingleValue <em>Pressure Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFluidFlowPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcFluidFlowProperties {
	/**
	 * The default value of the '{@link #getPropertySource() <em>Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySource()
	 * @generated
	 * @ordered
	 */
	protected static final IfcPropertySourceEnum PROPERTY_SOURCE_EDEFAULT = IfcPropertySourceEnum.DESIGN;

	/**
	 * The cached value of the '{@link #getPropertySource() <em>Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySource()
	 * @generated
	 * @ordered
	 */
	protected IfcPropertySourceEnum propertySource = PROPERTY_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlowConditionTimeSeries() <em>Flow Condition Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConditionTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected FlowConditionTimeSeriesType flowConditionTimeSeries;

	/**
	 * The cached value of the '{@link #getVelocityTimeSeries() <em>Velocity Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocityTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected VelocityTimeSeriesType velocityTimeSeries;

	/**
	 * The cached value of the '{@link #getFlowrateTimeSeries() <em>Flowrate Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowrateTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected FlowrateTimeSeriesType flowrateTimeSeries;

	/**
	 * The cached value of the '{@link #getFluid() <em>Fluid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFluid()
	 * @generated
	 * @ordered
	 */
	protected FluidType fluid;

	/**
	 * The cached value of the '{@link #getPressureTimeSeries() <em>Pressure Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected PressureTimeSeriesType pressureTimeSeries;

	/**
	 * The default value of the '{@link #getUserDefinedPropertySource() <em>User Defined Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedPropertySource()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_PROPERTY_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedPropertySource() <em>User Defined Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedPropertySource()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedPropertySource = USER_DEFINED_PROPERTY_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatureSingleValue() <em>Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double TEMPERATURE_SINGLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemperatureSingleValue() <em>Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected Double temperatureSingleValue = TEMPERATURE_SINGLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWetBulbTemperatureSingleValue() <em>Wet Bulb Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWetBulbTemperatureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double WET_BULB_TEMPERATURE_SINGLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWetBulbTemperatureSingleValue() <em>Wet Bulb Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWetBulbTemperatureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected Double wetBulbTemperatureSingleValue = WET_BULB_TEMPERATURE_SINGLE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWetBulbTemperatureTimeSeries() <em>Wet Bulb Temperature Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWetBulbTemperatureTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected WetBulbTemperatureTimeSeriesType wetBulbTemperatureTimeSeries;

	/**
	 * The cached value of the '{@link #getTemperatureTimeSeries() <em>Temperature Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected TemperatureTimeSeriesType temperatureTimeSeries;

	/**
	 * The cached value of the '{@link #getFlowrateSingleValue() <em>Flowrate Single Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowrateSingleValue()
	 * @generated
	 * @ordered
	 */
	protected FlowrateSingleValueType flowrateSingleValue;

	/**
	 * The default value of the '{@link #getFlowConditionSingleValue() <em>Flow Condition Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConditionSingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double FLOW_CONDITION_SINGLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowConditionSingleValue() <em>Flow Condition Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConditionSingleValue()
	 * @generated
	 * @ordered
	 */
	protected Double flowConditionSingleValue = FLOW_CONDITION_SINGLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVelocitySingleValue() <em>Velocity Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocitySingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double VELOCITY_SINGLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVelocitySingleValue() <em>Velocity Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocitySingleValue()
	 * @generated
	 * @ordered
	 */
	protected Double velocitySingleValue = VELOCITY_SINGLE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPressureSingleValue() <em>Pressure Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double PRESSURE_SINGLE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPressureSingleValue() <em>Pressure Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected Double pressureSingleValue = PRESSURE_SINGLE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFluidFlowPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcFluidFlowProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySourceEnum getPropertySource() {
		return propertySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySource(IfcPropertySourceEnum newPropertySource) {
		IfcPropertySourceEnum oldPropertySource = propertySource;
		propertySource = newPropertySource == null ? PROPERTY_SOURCE_EDEFAULT : newPropertySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE, oldPropertySource, propertySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowConditionTimeSeriesType getFlowConditionTimeSeries() {
		return flowConditionTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowConditionTimeSeries(FlowConditionTimeSeriesType newFlowConditionTimeSeries, NotificationChain msgs) {
		FlowConditionTimeSeriesType oldFlowConditionTimeSeries = flowConditionTimeSeries;
		flowConditionTimeSeries = newFlowConditionTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES, oldFlowConditionTimeSeries, newFlowConditionTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowConditionTimeSeries(FlowConditionTimeSeriesType newFlowConditionTimeSeries) {
		if (newFlowConditionTimeSeries != flowConditionTimeSeries) {
			NotificationChain msgs = null;
			if (flowConditionTimeSeries != null)
				msgs = ((InternalEObject)flowConditionTimeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES, null, msgs);
			if (newFlowConditionTimeSeries != null)
				msgs = ((InternalEObject)newFlowConditionTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES, null, msgs);
			msgs = basicSetFlowConditionTimeSeries(newFlowConditionTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES, newFlowConditionTimeSeries, newFlowConditionTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VelocityTimeSeriesType getVelocityTimeSeries() {
		return velocityTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVelocityTimeSeries(VelocityTimeSeriesType newVelocityTimeSeries, NotificationChain msgs) {
		VelocityTimeSeriesType oldVelocityTimeSeries = velocityTimeSeries;
		velocityTimeSeries = newVelocityTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES, oldVelocityTimeSeries, newVelocityTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocityTimeSeries(VelocityTimeSeriesType newVelocityTimeSeries) {
		if (newVelocityTimeSeries != velocityTimeSeries) {
			NotificationChain msgs = null;
			if (velocityTimeSeries != null)
				msgs = ((InternalEObject)velocityTimeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES, null, msgs);
			if (newVelocityTimeSeries != null)
				msgs = ((InternalEObject)newVelocityTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES, null, msgs);
			msgs = basicSetVelocityTimeSeries(newVelocityTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES, newVelocityTimeSeries, newVelocityTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowrateTimeSeriesType getFlowrateTimeSeries() {
		return flowrateTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowrateTimeSeries(FlowrateTimeSeriesType newFlowrateTimeSeries, NotificationChain msgs) {
		FlowrateTimeSeriesType oldFlowrateTimeSeries = flowrateTimeSeries;
		flowrateTimeSeries = newFlowrateTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES, oldFlowrateTimeSeries, newFlowrateTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowrateTimeSeries(FlowrateTimeSeriesType newFlowrateTimeSeries) {
		if (newFlowrateTimeSeries != flowrateTimeSeries) {
			NotificationChain msgs = null;
			if (flowrateTimeSeries != null)
				msgs = ((InternalEObject)flowrateTimeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES, null, msgs);
			if (newFlowrateTimeSeries != null)
				msgs = ((InternalEObject)newFlowrateTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES, null, msgs);
			msgs = basicSetFlowrateTimeSeries(newFlowrateTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES, newFlowrateTimeSeries, newFlowrateTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FluidType getFluid() {
		return fluid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFluid(FluidType newFluid, NotificationChain msgs) {
		FluidType oldFluid = fluid;
		fluid = newFluid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLUID, oldFluid, newFluid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFluid(FluidType newFluid) {
		if (newFluid != fluid) {
			NotificationChain msgs = null;
			if (fluid != null)
				msgs = ((InternalEObject)fluid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLUID, null, msgs);
			if (newFluid != null)
				msgs = ((InternalEObject)newFluid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLUID, null, msgs);
			msgs = basicSetFluid(newFluid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLUID, newFluid, newFluid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureTimeSeriesType getPressureTimeSeries() {
		return pressureTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPressureTimeSeries(PressureTimeSeriesType newPressureTimeSeries, NotificationChain msgs) {
		PressureTimeSeriesType oldPressureTimeSeries = pressureTimeSeries;
		pressureTimeSeries = newPressureTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES, oldPressureTimeSeries, newPressureTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureTimeSeries(PressureTimeSeriesType newPressureTimeSeries) {
		if (newPressureTimeSeries != pressureTimeSeries) {
			NotificationChain msgs = null;
			if (pressureTimeSeries != null)
				msgs = ((InternalEObject)pressureTimeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES, null, msgs);
			if (newPressureTimeSeries != null)
				msgs = ((InternalEObject)newPressureTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES, null, msgs);
			msgs = basicSetPressureTimeSeries(newPressureTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES, newPressureTimeSeries, newPressureTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedPropertySource() {
		return userDefinedPropertySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedPropertySource(String newUserDefinedPropertySource) {
		String oldUserDefinedPropertySource = userDefinedPropertySource;
		userDefinedPropertySource = newUserDefinedPropertySource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE, oldUserDefinedPropertySource, userDefinedPropertySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTemperatureSingleValue() {
		return temperatureSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureSingleValue(Double newTemperatureSingleValue) {
		Double oldTemperatureSingleValue = temperatureSingleValue;
		temperatureSingleValue = newTemperatureSingleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE, oldTemperatureSingleValue, temperatureSingleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWetBulbTemperatureSingleValue() {
		return wetBulbTemperatureSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWetBulbTemperatureSingleValue(Double newWetBulbTemperatureSingleValue) {
		Double oldWetBulbTemperatureSingleValue = wetBulbTemperatureSingleValue;
		wetBulbTemperatureSingleValue = newWetBulbTemperatureSingleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE, oldWetBulbTemperatureSingleValue, wetBulbTemperatureSingleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WetBulbTemperatureTimeSeriesType getWetBulbTemperatureTimeSeries() {
		return wetBulbTemperatureTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWetBulbTemperatureTimeSeries(WetBulbTemperatureTimeSeriesType newWetBulbTemperatureTimeSeries, NotificationChain msgs) {
		WetBulbTemperatureTimeSeriesType oldWetBulbTemperatureTimeSeries = wetBulbTemperatureTimeSeries;
		wetBulbTemperatureTimeSeries = newWetBulbTemperatureTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES, oldWetBulbTemperatureTimeSeries, newWetBulbTemperatureTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWetBulbTemperatureTimeSeries(WetBulbTemperatureTimeSeriesType newWetBulbTemperatureTimeSeries) {
		if (newWetBulbTemperatureTimeSeries != wetBulbTemperatureTimeSeries) {
			NotificationChain msgs = null;
			if (wetBulbTemperatureTimeSeries != null)
				msgs = ((InternalEObject)wetBulbTemperatureTimeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES, null, msgs);
			if (newWetBulbTemperatureTimeSeries != null)
				msgs = ((InternalEObject)newWetBulbTemperatureTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES, null, msgs);
			msgs = basicSetWetBulbTemperatureTimeSeries(newWetBulbTemperatureTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES, newWetBulbTemperatureTimeSeries, newWetBulbTemperatureTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureTimeSeriesType getTemperatureTimeSeries() {
		return temperatureTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperatureTimeSeries(TemperatureTimeSeriesType newTemperatureTimeSeries, NotificationChain msgs) {
		TemperatureTimeSeriesType oldTemperatureTimeSeries = temperatureTimeSeries;
		temperatureTimeSeries = newTemperatureTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES, oldTemperatureTimeSeries, newTemperatureTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureTimeSeries(TemperatureTimeSeriesType newTemperatureTimeSeries) {
		if (newTemperatureTimeSeries != temperatureTimeSeries) {
			NotificationChain msgs = null;
			if (temperatureTimeSeries != null)
				msgs = ((InternalEObject)temperatureTimeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES, null, msgs);
			if (newTemperatureTimeSeries != null)
				msgs = ((InternalEObject)newTemperatureTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES, null, msgs);
			msgs = basicSetTemperatureTimeSeries(newTemperatureTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES, newTemperatureTimeSeries, newTemperatureTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowrateSingleValueType getFlowrateSingleValue() {
		return flowrateSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowrateSingleValue(FlowrateSingleValueType newFlowrateSingleValue, NotificationChain msgs) {
		FlowrateSingleValueType oldFlowrateSingleValue = flowrateSingleValue;
		flowrateSingleValue = newFlowrateSingleValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE, oldFlowrateSingleValue, newFlowrateSingleValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowrateSingleValue(FlowrateSingleValueType newFlowrateSingleValue) {
		if (newFlowrateSingleValue != flowrateSingleValue) {
			NotificationChain msgs = null;
			if (flowrateSingleValue != null)
				msgs = ((InternalEObject)flowrateSingleValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE, null, msgs);
			if (newFlowrateSingleValue != null)
				msgs = ((InternalEObject)newFlowrateSingleValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE, null, msgs);
			msgs = basicSetFlowrateSingleValue(newFlowrateSingleValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE, newFlowrateSingleValue, newFlowrateSingleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlowConditionSingleValue() {
		return flowConditionSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowConditionSingleValue(Double newFlowConditionSingleValue) {
		Double oldFlowConditionSingleValue = flowConditionSingleValue;
		flowConditionSingleValue = newFlowConditionSingleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE, oldFlowConditionSingleValue, flowConditionSingleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVelocitySingleValue() {
		return velocitySingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocitySingleValue(Double newVelocitySingleValue) {
		Double oldVelocitySingleValue = velocitySingleValue;
		velocitySingleValue = newVelocitySingleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE, oldVelocitySingleValue, velocitySingleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPressureSingleValue() {
		return pressureSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureSingleValue(Double newPressureSingleValue) {
		Double oldPressureSingleValue = pressureSingleValue;
		pressureSingleValue = newPressureSingleValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE, oldPressureSingleValue, pressureSingleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES:
				return basicSetFlowConditionTimeSeries(null, msgs);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES:
				return basicSetVelocityTimeSeries(null, msgs);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES:
				return basicSetFlowrateTimeSeries(null, msgs);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLUID:
				return basicSetFluid(null, msgs);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES:
				return basicSetPressureTimeSeries(null, msgs);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES:
				return basicSetWetBulbTemperatureTimeSeries(null, msgs);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES:
				return basicSetTemperatureTimeSeries(null, msgs);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE:
				return basicSetFlowrateSingleValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE:
				return getPropertySource();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES:
				return getFlowConditionTimeSeries();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES:
				return getVelocityTimeSeries();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES:
				return getFlowrateTimeSeries();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLUID:
				return getFluid();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES:
				return getPressureTimeSeries();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				return getUserDefinedPropertySource();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE:
				return getTemperatureSingleValue();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE:
				return getWetBulbTemperatureSingleValue();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES:
				return getWetBulbTemperatureTimeSeries();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES:
				return getTemperatureTimeSeries();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE:
				return getFlowrateSingleValue();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE:
				return getFlowConditionSingleValue();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE:
				return getVelocitySingleValue();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE:
				return getPressureSingleValue();
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
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE:
				setPropertySource((IfcPropertySourceEnum)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES:
				setFlowConditionTimeSeries((FlowConditionTimeSeriesType)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES:
				setVelocityTimeSeries((VelocityTimeSeriesType)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES:
				setFlowrateTimeSeries((FlowrateTimeSeriesType)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLUID:
				setFluid((FluidType)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES:
				setPressureTimeSeries((PressureTimeSeriesType)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				setUserDefinedPropertySource((String)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE:
				setTemperatureSingleValue((Double)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE:
				setWetBulbTemperatureSingleValue((Double)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES:
				setWetBulbTemperatureTimeSeries((WetBulbTemperatureTimeSeriesType)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES:
				setTemperatureTimeSeries((TemperatureTimeSeriesType)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE:
				setFlowrateSingleValue((FlowrateSingleValueType)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE:
				setFlowConditionSingleValue((Double)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE:
				setVelocitySingleValue((Double)newValue);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE:
				setPressureSingleValue((Double)newValue);
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
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE:
				setPropertySource(PROPERTY_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES:
				setFlowConditionTimeSeries((FlowConditionTimeSeriesType)null);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES:
				setVelocityTimeSeries((VelocityTimeSeriesType)null);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES:
				setFlowrateTimeSeries((FlowrateTimeSeriesType)null);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLUID:
				setFluid((FluidType)null);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES:
				setPressureTimeSeries((PressureTimeSeriesType)null);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				setUserDefinedPropertySource(USER_DEFINED_PROPERTY_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE:
				setTemperatureSingleValue(TEMPERATURE_SINGLE_VALUE_EDEFAULT);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE:
				setWetBulbTemperatureSingleValue(WET_BULB_TEMPERATURE_SINGLE_VALUE_EDEFAULT);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES:
				setWetBulbTemperatureTimeSeries((WetBulbTemperatureTimeSeriesType)null);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES:
				setTemperatureTimeSeries((TemperatureTimeSeriesType)null);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE:
				setFlowrateSingleValue((FlowrateSingleValueType)null);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE:
				setFlowConditionSingleValue(FLOW_CONDITION_SINGLE_VALUE_EDEFAULT);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE:
				setVelocitySingleValue(VELOCITY_SINGLE_VALUE_EDEFAULT);
				return;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE:
				setPressureSingleValue(PRESSURE_SINGLE_VALUE_EDEFAULT);
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
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE:
				return propertySource != PROPERTY_SOURCE_EDEFAULT;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES:
				return flowConditionTimeSeries != null;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES:
				return velocityTimeSeries != null;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES:
				return flowrateTimeSeries != null;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLUID:
				return fluid != null;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES:
				return pressureTimeSeries != null;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				return USER_DEFINED_PROPERTY_SOURCE_EDEFAULT == null ? userDefinedPropertySource != null : !USER_DEFINED_PROPERTY_SOURCE_EDEFAULT.equals(userDefinedPropertySource);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE:
				return TEMPERATURE_SINGLE_VALUE_EDEFAULT == null ? temperatureSingleValue != null : !TEMPERATURE_SINGLE_VALUE_EDEFAULT.equals(temperatureSingleValue);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE:
				return WET_BULB_TEMPERATURE_SINGLE_VALUE_EDEFAULT == null ? wetBulbTemperatureSingleValue != null : !WET_BULB_TEMPERATURE_SINGLE_VALUE_EDEFAULT.equals(wetBulbTemperatureSingleValue);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES:
				return wetBulbTemperatureTimeSeries != null;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES:
				return temperatureTimeSeries != null;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE:
				return flowrateSingleValue != null;
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE:
				return FLOW_CONDITION_SINGLE_VALUE_EDEFAULT == null ? flowConditionSingleValue != null : !FLOW_CONDITION_SINGLE_VALUE_EDEFAULT.equals(flowConditionSingleValue);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE:
				return VELOCITY_SINGLE_VALUE_EDEFAULT == null ? velocitySingleValue != null : !VELOCITY_SINGLE_VALUE_EDEFAULT.equals(velocitySingleValue);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE:
				return PRESSURE_SINGLE_VALUE_EDEFAULT == null ? pressureSingleValue != null : !PRESSURE_SINGLE_VALUE_EDEFAULT.equals(pressureSingleValue);
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
		result.append(" (propertySource: ");
		result.append(propertySource);
		result.append(", userDefinedPropertySource: ");
		result.append(userDefinedPropertySource);
		result.append(", temperatureSingleValue: ");
		result.append(temperatureSingleValue);
		result.append(", wetBulbTemperatureSingleValue: ");
		result.append(wetBulbTemperatureSingleValue);
		result.append(", flowConditionSingleValue: ");
		result.append(flowConditionSingleValue);
		result.append(", velocitySingleValue: ");
		result.append(velocitySingleValue);
		result.append(", pressureSingleValue: ");
		result.append(pressureSingleValue);
		result.append(')');
		return result.toString();
	}

} //IfcFluidFlowPropertiesImpl
