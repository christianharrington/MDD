/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDerivedMeasureValue;
import ifc2x3tc1.IfcFluidFlowProperties;
import ifc2x3tc1.IfcMaterial;
import ifc2x3tc1.IfcPropertySourceEnum;
import ifc2x3tc1.IfcTimeSeries;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fluid Flow Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getVelocityTimeSeries <em>Velocity Time Series</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getFlowrateTimeSeries <em>Flowrate Time Series</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getFluid <em>Fluid</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getPressureTimeSeries <em>Pressure Time Series</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getTemperatureSingleValue <em>Temperature Single Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getTemperatureSingleValueAsString <em>Temperature Single Value As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getWetBulbTemperatureSingleValueAsString <em>Wet Bulb Temperature Single Value As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getTemperatureTimeSeries <em>Temperature Time Series</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getFlowrateSingleValue <em>Flowrate Single Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getFlowConditionSingleValueAsString <em>Flow Condition Single Value As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getVelocitySingleValue <em>Velocity Single Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getVelocitySingleValueAsString <em>Velocity Single Value As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getPressureSingleValue <em>Pressure Single Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFluidFlowPropertiesImpl#getPressureSingleValueAsString <em>Pressure Single Value As String</em>}</li>
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
	protected static final IfcPropertySourceEnum PROPERTY_SOURCE_EDEFAULT = IfcPropertySourceEnum.NULL;

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
	 * The cached value of the '{@link #getFlowConditionTimeSeries() <em>Flow Condition Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConditionTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries flowConditionTimeSeries;

	/**
	 * This is true if the Flow Condition Time Series reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flowConditionTimeSeriesESet;

	/**
	 * The cached value of the '{@link #getVelocityTimeSeries() <em>Velocity Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocityTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries velocityTimeSeries;

	/**
	 * This is true if the Velocity Time Series reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean velocityTimeSeriesESet;

	/**
	 * The cached value of the '{@link #getFlowrateTimeSeries() <em>Flowrate Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowrateTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries flowrateTimeSeries;

	/**
	 * This is true if the Flowrate Time Series reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flowrateTimeSeriesESet;

	/**
	 * The cached value of the '{@link #getFluid() <em>Fluid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFluid()
	 * @generated
	 * @ordered
	 */
	protected IfcMaterial fluid;

	/**
	 * The cached value of the '{@link #getPressureTimeSeries() <em>Pressure Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries pressureTimeSeries;

	/**
	 * This is true if the Pressure Time Series reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressureTimeSeriesESet;

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
	 * This is true if the User Defined Property Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedPropertySourceESet;

	/**
	 * The default value of the '{@link #getTemperatureSingleValue() <em>Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATURE_SINGLE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemperatureSingleValue() <em>Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected double temperatureSingleValue = TEMPERATURE_SINGLE_VALUE_EDEFAULT;

	/**
	 * This is true if the Temperature Single Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean temperatureSingleValueESet;

	/**
	 * The default value of the '{@link #getTemperatureSingleValueAsString() <em>Temperature Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureSingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPERATURE_SINGLE_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemperatureSingleValueAsString() <em>Temperature Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureSingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String temperatureSingleValueAsString = TEMPERATURE_SINGLE_VALUE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Temperature Single Value As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean temperatureSingleValueAsStringESet;

	/**
	 * The default value of the '{@link #getWetBulbTemperatureSingleValue() <em>Wet Bulb Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWetBulbTemperatureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final double WET_BULB_TEMPERATURE_SINGLE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWetBulbTemperatureSingleValue() <em>Wet Bulb Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWetBulbTemperatureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected double wetBulbTemperatureSingleValue = WET_BULB_TEMPERATURE_SINGLE_VALUE_EDEFAULT;

	/**
	 * This is true if the Wet Bulb Temperature Single Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wetBulbTemperatureSingleValueESet;

	/**
	 * The default value of the '{@link #getWetBulbTemperatureSingleValueAsString() <em>Wet Bulb Temperature Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWetBulbTemperatureSingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWetBulbTemperatureSingleValueAsString() <em>Wet Bulb Temperature Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWetBulbTemperatureSingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String wetBulbTemperatureSingleValueAsString = WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Wet Bulb Temperature Single Value As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wetBulbTemperatureSingleValueAsStringESet;

	/**
	 * The cached value of the '{@link #getWetBulbTemperatureTimeSeries() <em>Wet Bulb Temperature Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWetBulbTemperatureTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries wetBulbTemperatureTimeSeries;

	/**
	 * This is true if the Wet Bulb Temperature Time Series reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wetBulbTemperatureTimeSeriesESet;

	/**
	 * The cached value of the '{@link #getTemperatureTimeSeries() <em>Temperature Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries temperatureTimeSeries;

	/**
	 * This is true if the Temperature Time Series reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean temperatureTimeSeriesESet;

	/**
	 * The cached value of the '{@link #getFlowrateSingleValue() <em>Flowrate Single Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowrateSingleValue()
	 * @generated
	 * @ordered
	 */
	protected IfcDerivedMeasureValue flowrateSingleValue;

	/**
	 * This is true if the Flowrate Single Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flowrateSingleValueESet;

	/**
	 * The default value of the '{@link #getFlowConditionSingleValue() <em>Flow Condition Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConditionSingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final double FLOW_CONDITION_SINGLE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFlowConditionSingleValue() <em>Flow Condition Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConditionSingleValue()
	 * @generated
	 * @ordered
	 */
	protected double flowConditionSingleValue = FLOW_CONDITION_SINGLE_VALUE_EDEFAULT;

	/**
	 * This is true if the Flow Condition Single Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flowConditionSingleValueESet;

	/**
	 * The default value of the '{@link #getFlowConditionSingleValueAsString() <em>Flow Condition Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConditionSingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOW_CONDITION_SINGLE_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlowConditionSingleValueAsString() <em>Flow Condition Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConditionSingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String flowConditionSingleValueAsString = FLOW_CONDITION_SINGLE_VALUE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Flow Condition Single Value As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flowConditionSingleValueAsStringESet;

	/**
	 * The default value of the '{@link #getVelocitySingleValue() <em>Velocity Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocitySingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VELOCITY_SINGLE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVelocitySingleValue() <em>Velocity Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocitySingleValue()
	 * @generated
	 * @ordered
	 */
	protected double velocitySingleValue = VELOCITY_SINGLE_VALUE_EDEFAULT;

	/**
	 * This is true if the Velocity Single Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean velocitySingleValueESet;

	/**
	 * The default value of the '{@link #getVelocitySingleValueAsString() <em>Velocity Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocitySingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String VELOCITY_SINGLE_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVelocitySingleValueAsString() <em>Velocity Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocitySingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String velocitySingleValueAsString = VELOCITY_SINGLE_VALUE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Velocity Single Value As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean velocitySingleValueAsStringESet;

	/**
	 * The default value of the '{@link #getPressureSingleValue() <em>Pressure Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected static final double PRESSURE_SINGLE_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPressureSingleValue() <em>Pressure Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSingleValue()
	 * @generated
	 * @ordered
	 */
	protected double pressureSingleValue = PRESSURE_SINGLE_VALUE_EDEFAULT;

	/**
	 * This is true if the Pressure Single Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressureSingleValueESet;

	/**
	 * The default value of the '{@link #getPressureSingleValueAsString() <em>Pressure Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESSURE_SINGLE_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPressureSingleValueAsString() <em>Pressure Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureSingleValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String pressureSingleValueAsString = PRESSURE_SINGLE_VALUE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Pressure Single Value As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pressureSingleValueAsStringESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcFluidFlowProperties();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE, oldPropertySource, propertySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getFlowConditionTimeSeries() {
		if (flowConditionTimeSeries != null && flowConditionTimeSeries.eIsProxy()) {
			InternalEObject oldFlowConditionTimeSeries = (InternalEObject)flowConditionTimeSeries;
			flowConditionTimeSeries = (IfcTimeSeries)eResolveProxy(oldFlowConditionTimeSeries);
			if (flowConditionTimeSeries != oldFlowConditionTimeSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES, oldFlowConditionTimeSeries, flowConditionTimeSeries));
			}
		}
		return flowConditionTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetFlowConditionTimeSeries() {
		return flowConditionTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowConditionTimeSeries(IfcTimeSeries newFlowConditionTimeSeries) {
		IfcTimeSeries oldFlowConditionTimeSeries = flowConditionTimeSeries;
		flowConditionTimeSeries = newFlowConditionTimeSeries;
		boolean oldFlowConditionTimeSeriesESet = flowConditionTimeSeriesESet;
		flowConditionTimeSeriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES, oldFlowConditionTimeSeries, flowConditionTimeSeries, !oldFlowConditionTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowConditionTimeSeries() {
		IfcTimeSeries oldFlowConditionTimeSeries = flowConditionTimeSeries;
		boolean oldFlowConditionTimeSeriesESet = flowConditionTimeSeriesESet;
		flowConditionTimeSeries = null;
		flowConditionTimeSeriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES, oldFlowConditionTimeSeries, null, oldFlowConditionTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowConditionTimeSeries() {
		return flowConditionTimeSeriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getVelocityTimeSeries() {
		if (velocityTimeSeries != null && velocityTimeSeries.eIsProxy()) {
			InternalEObject oldVelocityTimeSeries = (InternalEObject)velocityTimeSeries;
			velocityTimeSeries = (IfcTimeSeries)eResolveProxy(oldVelocityTimeSeries);
			if (velocityTimeSeries != oldVelocityTimeSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES, oldVelocityTimeSeries, velocityTimeSeries));
			}
		}
		return velocityTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetVelocityTimeSeries() {
		return velocityTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocityTimeSeries(IfcTimeSeries newVelocityTimeSeries) {
		IfcTimeSeries oldVelocityTimeSeries = velocityTimeSeries;
		velocityTimeSeries = newVelocityTimeSeries;
		boolean oldVelocityTimeSeriesESet = velocityTimeSeriesESet;
		velocityTimeSeriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES, oldVelocityTimeSeries, velocityTimeSeries, !oldVelocityTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVelocityTimeSeries() {
		IfcTimeSeries oldVelocityTimeSeries = velocityTimeSeries;
		boolean oldVelocityTimeSeriesESet = velocityTimeSeriesESet;
		velocityTimeSeries = null;
		velocityTimeSeriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES, oldVelocityTimeSeries, null, oldVelocityTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVelocityTimeSeries() {
		return velocityTimeSeriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getFlowrateTimeSeries() {
		if (flowrateTimeSeries != null && flowrateTimeSeries.eIsProxy()) {
			InternalEObject oldFlowrateTimeSeries = (InternalEObject)flowrateTimeSeries;
			flowrateTimeSeries = (IfcTimeSeries)eResolveProxy(oldFlowrateTimeSeries);
			if (flowrateTimeSeries != oldFlowrateTimeSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES, oldFlowrateTimeSeries, flowrateTimeSeries));
			}
		}
		return flowrateTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetFlowrateTimeSeries() {
		return flowrateTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowrateTimeSeries(IfcTimeSeries newFlowrateTimeSeries) {
		IfcTimeSeries oldFlowrateTimeSeries = flowrateTimeSeries;
		flowrateTimeSeries = newFlowrateTimeSeries;
		boolean oldFlowrateTimeSeriesESet = flowrateTimeSeriesESet;
		flowrateTimeSeriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES, oldFlowrateTimeSeries, flowrateTimeSeries, !oldFlowrateTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowrateTimeSeries() {
		IfcTimeSeries oldFlowrateTimeSeries = flowrateTimeSeries;
		boolean oldFlowrateTimeSeriesESet = flowrateTimeSeriesESet;
		flowrateTimeSeries = null;
		flowrateTimeSeriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES, oldFlowrateTimeSeries, null, oldFlowrateTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowrateTimeSeries() {
		return flowrateTimeSeriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial getFluid() {
		if (fluid != null && fluid.eIsProxy()) {
			InternalEObject oldFluid = (InternalEObject)fluid;
			fluid = (IfcMaterial)eResolveProxy(oldFluid);
			if (fluid != oldFluid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLUID, oldFluid, fluid));
			}
		}
		return fluid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial basicGetFluid() {
		return fluid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFluid(IfcMaterial newFluid) {
		IfcMaterial oldFluid = fluid;
		fluid = newFluid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLUID, oldFluid, fluid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getPressureTimeSeries() {
		if (pressureTimeSeries != null && pressureTimeSeries.eIsProxy()) {
			InternalEObject oldPressureTimeSeries = (InternalEObject)pressureTimeSeries;
			pressureTimeSeries = (IfcTimeSeries)eResolveProxy(oldPressureTimeSeries);
			if (pressureTimeSeries != oldPressureTimeSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES, oldPressureTimeSeries, pressureTimeSeries));
			}
		}
		return pressureTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetPressureTimeSeries() {
		return pressureTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureTimeSeries(IfcTimeSeries newPressureTimeSeries) {
		IfcTimeSeries oldPressureTimeSeries = pressureTimeSeries;
		pressureTimeSeries = newPressureTimeSeries;
		boolean oldPressureTimeSeriesESet = pressureTimeSeriesESet;
		pressureTimeSeriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES, oldPressureTimeSeries, pressureTimeSeries, !oldPressureTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPressureTimeSeries() {
		IfcTimeSeries oldPressureTimeSeries = pressureTimeSeries;
		boolean oldPressureTimeSeriesESet = pressureTimeSeriesESet;
		pressureTimeSeries = null;
		pressureTimeSeriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES, oldPressureTimeSeries, null, oldPressureTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPressureTimeSeries() {
		return pressureTimeSeriesESet;
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
		boolean oldUserDefinedPropertySourceESet = userDefinedPropertySourceESet;
		userDefinedPropertySourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE, oldUserDefinedPropertySource, userDefinedPropertySource, !oldUserDefinedPropertySourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedPropertySource() {
		String oldUserDefinedPropertySource = userDefinedPropertySource;
		boolean oldUserDefinedPropertySourceESet = userDefinedPropertySourceESet;
		userDefinedPropertySource = USER_DEFINED_PROPERTY_SOURCE_EDEFAULT;
		userDefinedPropertySourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE, oldUserDefinedPropertySource, USER_DEFINED_PROPERTY_SOURCE_EDEFAULT, oldUserDefinedPropertySourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedPropertySource() {
		return userDefinedPropertySourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTemperatureSingleValue() {
		return temperatureSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureSingleValue(double newTemperatureSingleValue) {
		double oldTemperatureSingleValue = temperatureSingleValue;
		temperatureSingleValue = newTemperatureSingleValue;
		boolean oldTemperatureSingleValueESet = temperatureSingleValueESet;
		temperatureSingleValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE, oldTemperatureSingleValue, temperatureSingleValue, !oldTemperatureSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTemperatureSingleValue() {
		double oldTemperatureSingleValue = temperatureSingleValue;
		boolean oldTemperatureSingleValueESet = temperatureSingleValueESet;
		temperatureSingleValue = TEMPERATURE_SINGLE_VALUE_EDEFAULT;
		temperatureSingleValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE, oldTemperatureSingleValue, TEMPERATURE_SINGLE_VALUE_EDEFAULT, oldTemperatureSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemperatureSingleValue() {
		return temperatureSingleValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemperatureSingleValueAsString() {
		return temperatureSingleValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureSingleValueAsString(String newTemperatureSingleValueAsString) {
		String oldTemperatureSingleValueAsString = temperatureSingleValueAsString;
		temperatureSingleValueAsString = newTemperatureSingleValueAsString;
		boolean oldTemperatureSingleValueAsStringESet = temperatureSingleValueAsStringESet;
		temperatureSingleValueAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE_AS_STRING, oldTemperatureSingleValueAsString, temperatureSingleValueAsString, !oldTemperatureSingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTemperatureSingleValueAsString() {
		String oldTemperatureSingleValueAsString = temperatureSingleValueAsString;
		boolean oldTemperatureSingleValueAsStringESet = temperatureSingleValueAsStringESet;
		temperatureSingleValueAsString = TEMPERATURE_SINGLE_VALUE_AS_STRING_EDEFAULT;
		temperatureSingleValueAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE_AS_STRING, oldTemperatureSingleValueAsString, TEMPERATURE_SINGLE_VALUE_AS_STRING_EDEFAULT, oldTemperatureSingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemperatureSingleValueAsString() {
		return temperatureSingleValueAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWetBulbTemperatureSingleValue() {
		return wetBulbTemperatureSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWetBulbTemperatureSingleValue(double newWetBulbTemperatureSingleValue) {
		double oldWetBulbTemperatureSingleValue = wetBulbTemperatureSingleValue;
		wetBulbTemperatureSingleValue = newWetBulbTemperatureSingleValue;
		boolean oldWetBulbTemperatureSingleValueESet = wetBulbTemperatureSingleValueESet;
		wetBulbTemperatureSingleValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE, oldWetBulbTemperatureSingleValue, wetBulbTemperatureSingleValue, !oldWetBulbTemperatureSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWetBulbTemperatureSingleValue() {
		double oldWetBulbTemperatureSingleValue = wetBulbTemperatureSingleValue;
		boolean oldWetBulbTemperatureSingleValueESet = wetBulbTemperatureSingleValueESet;
		wetBulbTemperatureSingleValue = WET_BULB_TEMPERATURE_SINGLE_VALUE_EDEFAULT;
		wetBulbTemperatureSingleValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE, oldWetBulbTemperatureSingleValue, WET_BULB_TEMPERATURE_SINGLE_VALUE_EDEFAULT, oldWetBulbTemperatureSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWetBulbTemperatureSingleValue() {
		return wetBulbTemperatureSingleValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWetBulbTemperatureSingleValueAsString() {
		return wetBulbTemperatureSingleValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWetBulbTemperatureSingleValueAsString(String newWetBulbTemperatureSingleValueAsString) {
		String oldWetBulbTemperatureSingleValueAsString = wetBulbTemperatureSingleValueAsString;
		wetBulbTemperatureSingleValueAsString = newWetBulbTemperatureSingleValueAsString;
		boolean oldWetBulbTemperatureSingleValueAsStringESet = wetBulbTemperatureSingleValueAsStringESet;
		wetBulbTemperatureSingleValueAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING, oldWetBulbTemperatureSingleValueAsString, wetBulbTemperatureSingleValueAsString, !oldWetBulbTemperatureSingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWetBulbTemperatureSingleValueAsString() {
		String oldWetBulbTemperatureSingleValueAsString = wetBulbTemperatureSingleValueAsString;
		boolean oldWetBulbTemperatureSingleValueAsStringESet = wetBulbTemperatureSingleValueAsStringESet;
		wetBulbTemperatureSingleValueAsString = WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING_EDEFAULT;
		wetBulbTemperatureSingleValueAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING, oldWetBulbTemperatureSingleValueAsString, WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING_EDEFAULT, oldWetBulbTemperatureSingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWetBulbTemperatureSingleValueAsString() {
		return wetBulbTemperatureSingleValueAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getWetBulbTemperatureTimeSeries() {
		if (wetBulbTemperatureTimeSeries != null && wetBulbTemperatureTimeSeries.eIsProxy()) {
			InternalEObject oldWetBulbTemperatureTimeSeries = (InternalEObject)wetBulbTemperatureTimeSeries;
			wetBulbTemperatureTimeSeries = (IfcTimeSeries)eResolveProxy(oldWetBulbTemperatureTimeSeries);
			if (wetBulbTemperatureTimeSeries != oldWetBulbTemperatureTimeSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES, oldWetBulbTemperatureTimeSeries, wetBulbTemperatureTimeSeries));
			}
		}
		return wetBulbTemperatureTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetWetBulbTemperatureTimeSeries() {
		return wetBulbTemperatureTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWetBulbTemperatureTimeSeries(IfcTimeSeries newWetBulbTemperatureTimeSeries) {
		IfcTimeSeries oldWetBulbTemperatureTimeSeries = wetBulbTemperatureTimeSeries;
		wetBulbTemperatureTimeSeries = newWetBulbTemperatureTimeSeries;
		boolean oldWetBulbTemperatureTimeSeriesESet = wetBulbTemperatureTimeSeriesESet;
		wetBulbTemperatureTimeSeriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES, oldWetBulbTemperatureTimeSeries, wetBulbTemperatureTimeSeries, !oldWetBulbTemperatureTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWetBulbTemperatureTimeSeries() {
		IfcTimeSeries oldWetBulbTemperatureTimeSeries = wetBulbTemperatureTimeSeries;
		boolean oldWetBulbTemperatureTimeSeriesESet = wetBulbTemperatureTimeSeriesESet;
		wetBulbTemperatureTimeSeries = null;
		wetBulbTemperatureTimeSeriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES, oldWetBulbTemperatureTimeSeries, null, oldWetBulbTemperatureTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWetBulbTemperatureTimeSeries() {
		return wetBulbTemperatureTimeSeriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getTemperatureTimeSeries() {
		if (temperatureTimeSeries != null && temperatureTimeSeries.eIsProxy()) {
			InternalEObject oldTemperatureTimeSeries = (InternalEObject)temperatureTimeSeries;
			temperatureTimeSeries = (IfcTimeSeries)eResolveProxy(oldTemperatureTimeSeries);
			if (temperatureTimeSeries != oldTemperatureTimeSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES, oldTemperatureTimeSeries, temperatureTimeSeries));
			}
		}
		return temperatureTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetTemperatureTimeSeries() {
		return temperatureTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureTimeSeries(IfcTimeSeries newTemperatureTimeSeries) {
		IfcTimeSeries oldTemperatureTimeSeries = temperatureTimeSeries;
		temperatureTimeSeries = newTemperatureTimeSeries;
		boolean oldTemperatureTimeSeriesESet = temperatureTimeSeriesESet;
		temperatureTimeSeriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES, oldTemperatureTimeSeries, temperatureTimeSeries, !oldTemperatureTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTemperatureTimeSeries() {
		IfcTimeSeries oldTemperatureTimeSeries = temperatureTimeSeries;
		boolean oldTemperatureTimeSeriesESet = temperatureTimeSeriesESet;
		temperatureTimeSeries = null;
		temperatureTimeSeriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES, oldTemperatureTimeSeries, null, oldTemperatureTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemperatureTimeSeries() {
		return temperatureTimeSeriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedMeasureValue getFlowrateSingleValue() {
		if (flowrateSingleValue != null && flowrateSingleValue.eIsProxy()) {
			InternalEObject oldFlowrateSingleValue = (InternalEObject)flowrateSingleValue;
			flowrateSingleValue = (IfcDerivedMeasureValue)eResolveProxy(oldFlowrateSingleValue);
			if (flowrateSingleValue != oldFlowrateSingleValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE, oldFlowrateSingleValue, flowrateSingleValue));
			}
		}
		return flowrateSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedMeasureValue basicGetFlowrateSingleValue() {
		return flowrateSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowrateSingleValue(IfcDerivedMeasureValue newFlowrateSingleValue) {
		IfcDerivedMeasureValue oldFlowrateSingleValue = flowrateSingleValue;
		flowrateSingleValue = newFlowrateSingleValue;
		boolean oldFlowrateSingleValueESet = flowrateSingleValueESet;
		flowrateSingleValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE, oldFlowrateSingleValue, flowrateSingleValue, !oldFlowrateSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowrateSingleValue() {
		IfcDerivedMeasureValue oldFlowrateSingleValue = flowrateSingleValue;
		boolean oldFlowrateSingleValueESet = flowrateSingleValueESet;
		flowrateSingleValue = null;
		flowrateSingleValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE, oldFlowrateSingleValue, null, oldFlowrateSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowrateSingleValue() {
		return flowrateSingleValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFlowConditionSingleValue() {
		return flowConditionSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowConditionSingleValue(double newFlowConditionSingleValue) {
		double oldFlowConditionSingleValue = flowConditionSingleValue;
		flowConditionSingleValue = newFlowConditionSingleValue;
		boolean oldFlowConditionSingleValueESet = flowConditionSingleValueESet;
		flowConditionSingleValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE, oldFlowConditionSingleValue, flowConditionSingleValue, !oldFlowConditionSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowConditionSingleValue() {
		double oldFlowConditionSingleValue = flowConditionSingleValue;
		boolean oldFlowConditionSingleValueESet = flowConditionSingleValueESet;
		flowConditionSingleValue = FLOW_CONDITION_SINGLE_VALUE_EDEFAULT;
		flowConditionSingleValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE, oldFlowConditionSingleValue, FLOW_CONDITION_SINGLE_VALUE_EDEFAULT, oldFlowConditionSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowConditionSingleValue() {
		return flowConditionSingleValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlowConditionSingleValueAsString() {
		return flowConditionSingleValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowConditionSingleValueAsString(String newFlowConditionSingleValueAsString) {
		String oldFlowConditionSingleValueAsString = flowConditionSingleValueAsString;
		flowConditionSingleValueAsString = newFlowConditionSingleValueAsString;
		boolean oldFlowConditionSingleValueAsStringESet = flowConditionSingleValueAsStringESet;
		flowConditionSingleValueAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE_AS_STRING, oldFlowConditionSingleValueAsString, flowConditionSingleValueAsString, !oldFlowConditionSingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowConditionSingleValueAsString() {
		String oldFlowConditionSingleValueAsString = flowConditionSingleValueAsString;
		boolean oldFlowConditionSingleValueAsStringESet = flowConditionSingleValueAsStringESet;
		flowConditionSingleValueAsString = FLOW_CONDITION_SINGLE_VALUE_AS_STRING_EDEFAULT;
		flowConditionSingleValueAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE_AS_STRING, oldFlowConditionSingleValueAsString, FLOW_CONDITION_SINGLE_VALUE_AS_STRING_EDEFAULT, oldFlowConditionSingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowConditionSingleValueAsString() {
		return flowConditionSingleValueAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVelocitySingleValue() {
		return velocitySingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocitySingleValue(double newVelocitySingleValue) {
		double oldVelocitySingleValue = velocitySingleValue;
		velocitySingleValue = newVelocitySingleValue;
		boolean oldVelocitySingleValueESet = velocitySingleValueESet;
		velocitySingleValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE, oldVelocitySingleValue, velocitySingleValue, !oldVelocitySingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVelocitySingleValue() {
		double oldVelocitySingleValue = velocitySingleValue;
		boolean oldVelocitySingleValueESet = velocitySingleValueESet;
		velocitySingleValue = VELOCITY_SINGLE_VALUE_EDEFAULT;
		velocitySingleValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE, oldVelocitySingleValue, VELOCITY_SINGLE_VALUE_EDEFAULT, oldVelocitySingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVelocitySingleValue() {
		return velocitySingleValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVelocitySingleValueAsString() {
		return velocitySingleValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocitySingleValueAsString(String newVelocitySingleValueAsString) {
		String oldVelocitySingleValueAsString = velocitySingleValueAsString;
		velocitySingleValueAsString = newVelocitySingleValueAsString;
		boolean oldVelocitySingleValueAsStringESet = velocitySingleValueAsStringESet;
		velocitySingleValueAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE_AS_STRING, oldVelocitySingleValueAsString, velocitySingleValueAsString, !oldVelocitySingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVelocitySingleValueAsString() {
		String oldVelocitySingleValueAsString = velocitySingleValueAsString;
		boolean oldVelocitySingleValueAsStringESet = velocitySingleValueAsStringESet;
		velocitySingleValueAsString = VELOCITY_SINGLE_VALUE_AS_STRING_EDEFAULT;
		velocitySingleValueAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE_AS_STRING, oldVelocitySingleValueAsString, VELOCITY_SINGLE_VALUE_AS_STRING_EDEFAULT, oldVelocitySingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVelocitySingleValueAsString() {
		return velocitySingleValueAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPressureSingleValue() {
		return pressureSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureSingleValue(double newPressureSingleValue) {
		double oldPressureSingleValue = pressureSingleValue;
		pressureSingleValue = newPressureSingleValue;
		boolean oldPressureSingleValueESet = pressureSingleValueESet;
		pressureSingleValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE, oldPressureSingleValue, pressureSingleValue, !oldPressureSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPressureSingleValue() {
		double oldPressureSingleValue = pressureSingleValue;
		boolean oldPressureSingleValueESet = pressureSingleValueESet;
		pressureSingleValue = PRESSURE_SINGLE_VALUE_EDEFAULT;
		pressureSingleValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE, oldPressureSingleValue, PRESSURE_SINGLE_VALUE_EDEFAULT, oldPressureSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPressureSingleValue() {
		return pressureSingleValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPressureSingleValueAsString() {
		return pressureSingleValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressureSingleValueAsString(String newPressureSingleValueAsString) {
		String oldPressureSingleValueAsString = pressureSingleValueAsString;
		pressureSingleValueAsString = newPressureSingleValueAsString;
		boolean oldPressureSingleValueAsStringESet = pressureSingleValueAsStringESet;
		pressureSingleValueAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE_AS_STRING, oldPressureSingleValueAsString, pressureSingleValueAsString, !oldPressureSingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPressureSingleValueAsString() {
		String oldPressureSingleValueAsString = pressureSingleValueAsString;
		boolean oldPressureSingleValueAsStringESet = pressureSingleValueAsStringESet;
		pressureSingleValueAsString = PRESSURE_SINGLE_VALUE_AS_STRING_EDEFAULT;
		pressureSingleValueAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE_AS_STRING, oldPressureSingleValueAsString, PRESSURE_SINGLE_VALUE_AS_STRING_EDEFAULT, oldPressureSingleValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPressureSingleValueAsString() {
		return pressureSingleValueAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE:
				return getPropertySource();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES:
				if (resolve) return getFlowConditionTimeSeries();
				return basicGetFlowConditionTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES:
				if (resolve) return getVelocityTimeSeries();
				return basicGetVelocityTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES:
				if (resolve) return getFlowrateTimeSeries();
				return basicGetFlowrateTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLUID:
				if (resolve) return getFluid();
				return basicGetFluid();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES:
				if (resolve) return getPressureTimeSeries();
				return basicGetPressureTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				return getUserDefinedPropertySource();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE:
				return getTemperatureSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE_AS_STRING:
				return getTemperatureSingleValueAsString();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE:
				return getWetBulbTemperatureSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING:
				return getWetBulbTemperatureSingleValueAsString();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES:
				if (resolve) return getWetBulbTemperatureTimeSeries();
				return basicGetWetBulbTemperatureTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES:
				if (resolve) return getTemperatureTimeSeries();
				return basicGetTemperatureTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE:
				if (resolve) return getFlowrateSingleValue();
				return basicGetFlowrateSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE:
				return getFlowConditionSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE_AS_STRING:
				return getFlowConditionSingleValueAsString();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE:
				return getVelocitySingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE_AS_STRING:
				return getVelocitySingleValueAsString();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE:
				return getPressureSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE_AS_STRING:
				return getPressureSingleValueAsString();
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
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE:
				setPropertySource((IfcPropertySourceEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES:
				setFlowConditionTimeSeries((IfcTimeSeries)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES:
				setVelocityTimeSeries((IfcTimeSeries)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES:
				setFlowrateTimeSeries((IfcTimeSeries)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLUID:
				setFluid((IfcMaterial)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES:
				setPressureTimeSeries((IfcTimeSeries)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				setUserDefinedPropertySource((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE:
				setTemperatureSingleValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE_AS_STRING:
				setTemperatureSingleValueAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE:
				setWetBulbTemperatureSingleValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING:
				setWetBulbTemperatureSingleValueAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES:
				setWetBulbTemperatureTimeSeries((IfcTimeSeries)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES:
				setTemperatureTimeSeries((IfcTimeSeries)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE:
				setFlowrateSingleValue((IfcDerivedMeasureValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE:
				setFlowConditionSingleValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE_AS_STRING:
				setFlowConditionSingleValueAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE:
				setVelocitySingleValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE_AS_STRING:
				setVelocitySingleValueAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE:
				setPressureSingleValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE_AS_STRING:
				setPressureSingleValueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE:
				setPropertySource(PROPERTY_SOURCE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES:
				unsetFlowConditionTimeSeries();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES:
				unsetVelocityTimeSeries();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES:
				unsetFlowrateTimeSeries();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLUID:
				setFluid((IfcMaterial)null);
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES:
				unsetPressureTimeSeries();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				unsetUserDefinedPropertySource();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE:
				unsetTemperatureSingleValue();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE_AS_STRING:
				unsetTemperatureSingleValueAsString();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE:
				unsetWetBulbTemperatureSingleValue();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING:
				unsetWetBulbTemperatureSingleValueAsString();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES:
				unsetWetBulbTemperatureTimeSeries();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES:
				unsetTemperatureTimeSeries();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE:
				unsetFlowrateSingleValue();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE:
				unsetFlowConditionSingleValue();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE_AS_STRING:
				unsetFlowConditionSingleValueAsString();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE:
				unsetVelocitySingleValue();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE_AS_STRING:
				unsetVelocitySingleValueAsString();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE:
				unsetPressureSingleValue();
				return;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE_AS_STRING:
				unsetPressureSingleValueAsString();
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
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PROPERTY_SOURCE:
				return propertySource != PROPERTY_SOURCE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_TIME_SERIES:
				return isSetFlowConditionTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_TIME_SERIES:
				return isSetVelocityTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_TIME_SERIES:
				return isSetFlowrateTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLUID:
				return fluid != null;
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_TIME_SERIES:
				return isSetPressureTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				return isSetUserDefinedPropertySource();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE:
				return isSetTemperatureSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_SINGLE_VALUE_AS_STRING:
				return isSetTemperatureSingleValueAsString();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE:
				return isSetWetBulbTemperatureSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_SINGLE_VALUE_AS_STRING:
				return isSetWetBulbTemperatureSingleValueAsString();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__WET_BULB_TEMPERATURE_TIME_SERIES:
				return isSetWetBulbTemperatureTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__TEMPERATURE_TIME_SERIES:
				return isSetTemperatureTimeSeries();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOWRATE_SINGLE_VALUE:
				return isSetFlowrateSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE:
				return isSetFlowConditionSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__FLOW_CONDITION_SINGLE_VALUE_AS_STRING:
				return isSetFlowConditionSingleValueAsString();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE:
				return isSetVelocitySingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__VELOCITY_SINGLE_VALUE_AS_STRING:
				return isSetVelocitySingleValueAsString();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE:
				return isSetPressureSingleValue();
			case Ifc2x3tc1Package.IFC_FLUID_FLOW_PROPERTIES__PRESSURE_SINGLE_VALUE_AS_STRING:
				return isSetPressureSingleValueAsString();
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
		result.append(" (PropertySource: ");
		result.append(propertySource);
		result.append(", UserDefinedPropertySource: ");
		if (userDefinedPropertySourceESet) result.append(userDefinedPropertySource); else result.append("<unset>");
		result.append(", TemperatureSingleValue: ");
		if (temperatureSingleValueESet) result.append(temperatureSingleValue); else result.append("<unset>");
		result.append(", TemperatureSingleValueAsString: ");
		if (temperatureSingleValueAsStringESet) result.append(temperatureSingleValueAsString); else result.append("<unset>");
		result.append(", WetBulbTemperatureSingleValue: ");
		if (wetBulbTemperatureSingleValueESet) result.append(wetBulbTemperatureSingleValue); else result.append("<unset>");
		result.append(", WetBulbTemperatureSingleValueAsString: ");
		if (wetBulbTemperatureSingleValueAsStringESet) result.append(wetBulbTemperatureSingleValueAsString); else result.append("<unset>");
		result.append(", FlowConditionSingleValue: ");
		if (flowConditionSingleValueESet) result.append(flowConditionSingleValue); else result.append("<unset>");
		result.append(", FlowConditionSingleValueAsString: ");
		if (flowConditionSingleValueAsStringESet) result.append(flowConditionSingleValueAsString); else result.append("<unset>");
		result.append(", VelocitySingleValue: ");
		if (velocitySingleValueESet) result.append(velocitySingleValue); else result.append("<unset>");
		result.append(", VelocitySingleValueAsString: ");
		if (velocitySingleValueAsStringESet) result.append(velocitySingleValueAsString); else result.append("<unset>");
		result.append(", PressureSingleValue: ");
		if (pressureSingleValueESet) result.append(pressureSingleValue); else result.append("<unset>");
		result.append(", PressureSingleValueAsString: ");
		if (pressureSingleValueAsStringESet) result.append(pressureSingleValueAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcFluidFlowPropertiesImpl
