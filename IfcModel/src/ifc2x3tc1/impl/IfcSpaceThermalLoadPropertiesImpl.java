/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPropertySourceEnum;
import ifc2x3tc1.IfcSpaceThermalLoadProperties;
import ifc2x3tc1.IfcThermalLoadSourceEnum;
import ifc2x3tc1.IfcThermalLoadTypeEnum;
import ifc2x3tc1.IfcTimeSeries;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space Thermal Load Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getApplicableValueRatio <em>Applicable Value Ratio</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getApplicableValueRatioAsString <em>Applicable Value Ratio As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadSource <em>Thermal Load Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getSourceDescription <em>Source Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getMaximumValueAsString <em>Maximum Value As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getMinimumValueAsString <em>Minimum Value As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadType <em>Thermal Load Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSpaceThermalLoadPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcSpaceThermalLoadProperties {
	/**
	 * The default value of the '{@link #getApplicableValueRatio() <em>Applicable Value Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableValueRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double APPLICABLE_VALUE_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getApplicableValueRatio() <em>Applicable Value Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableValueRatio()
	 * @generated
	 * @ordered
	 */
	protected double applicableValueRatio = APPLICABLE_VALUE_RATIO_EDEFAULT;

	/**
	 * This is true if the Applicable Value Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicableValueRatioESet;

	/**
	 * The default value of the '{@link #getApplicableValueRatioAsString() <em>Applicable Value Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableValueRatioAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICABLE_VALUE_RATIO_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicableValueRatioAsString() <em>Applicable Value Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableValueRatioAsString()
	 * @generated
	 * @ordered
	 */
	protected String applicableValueRatioAsString = APPLICABLE_VALUE_RATIO_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Applicable Value Ratio As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applicableValueRatioAsStringESet;

	/**
	 * The default value of the '{@link #getThermalLoadSource() <em>Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalLoadSource()
	 * @generated
	 * @ordered
	 */
	protected static final IfcThermalLoadSourceEnum THERMAL_LOAD_SOURCE_EDEFAULT = IfcThermalLoadSourceEnum.NULL;

	/**
	 * The cached value of the '{@link #getThermalLoadSource() <em>Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalLoadSource()
	 * @generated
	 * @ordered
	 */
	protected IfcThermalLoadSourceEnum thermalLoadSource = THERMAL_LOAD_SOURCE_EDEFAULT;

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
	 * The default value of the '{@link #getSourceDescription() <em>Source Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceDescription() <em>Source Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDescription()
	 * @generated
	 * @ordered
	 */
	protected String sourceDescription = SOURCE_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Source Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sourceDescriptionESet;

	/**
	 * The default value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected double maximumValue = MAXIMUM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumValueAsString() <em>Maximum Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumValueAsString() <em>Maximum Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String maximumValueAsString = MAXIMUM_VALUE_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected double minimumValue = MINIMUM_VALUE_EDEFAULT;

	/**
	 * This is true if the Minimum Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumValueESet;

	/**
	 * The default value of the '{@link #getMinimumValueAsString() <em>Minimum Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumValueAsString() <em>Minimum Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String minimumValueAsString = MINIMUM_VALUE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Minimum Value As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumValueAsStringESet;

	/**
	 * The cached value of the '{@link #getThermalLoadTimeSeriesValues() <em>Thermal Load Time Series Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalLoadTimeSeriesValues()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries thermalLoadTimeSeriesValues;

	/**
	 * This is true if the Thermal Load Time Series Values reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalLoadTimeSeriesValuesESet;

	/**
	 * The default value of the '{@link #getUserDefinedThermalLoadSource() <em>User Defined Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedThermalLoadSource()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_THERMAL_LOAD_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedThermalLoadSource() <em>User Defined Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedThermalLoadSource()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedThermalLoadSource = USER_DEFINED_THERMAL_LOAD_SOURCE_EDEFAULT;

	/**
	 * This is true if the User Defined Thermal Load Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedThermalLoadSourceESet;

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
	 * The default value of the '{@link #getThermalLoadType() <em>Thermal Load Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalLoadType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcThermalLoadTypeEnum THERMAL_LOAD_TYPE_EDEFAULT = IfcThermalLoadTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getThermalLoadType() <em>Thermal Load Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalLoadType()
	 * @generated
	 * @ordered
	 */
	protected IfcThermalLoadTypeEnum thermalLoadType = THERMAL_LOAD_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpaceThermalLoadPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSpaceThermalLoadProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getApplicableValueRatio() {
		return applicableValueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableValueRatio(double newApplicableValueRatio) {
		double oldApplicableValueRatio = applicableValueRatio;
		applicableValueRatio = newApplicableValueRatio;
		boolean oldApplicableValueRatioESet = applicableValueRatioESet;
		applicableValueRatioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO, oldApplicableValueRatio, applicableValueRatio, !oldApplicableValueRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableValueRatio() {
		double oldApplicableValueRatio = applicableValueRatio;
		boolean oldApplicableValueRatioESet = applicableValueRatioESet;
		applicableValueRatio = APPLICABLE_VALUE_RATIO_EDEFAULT;
		applicableValueRatioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO, oldApplicableValueRatio, APPLICABLE_VALUE_RATIO_EDEFAULT, oldApplicableValueRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableValueRatio() {
		return applicableValueRatioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicableValueRatioAsString() {
		return applicableValueRatioAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableValueRatioAsString(String newApplicableValueRatioAsString) {
		String oldApplicableValueRatioAsString = applicableValueRatioAsString;
		applicableValueRatioAsString = newApplicableValueRatioAsString;
		boolean oldApplicableValueRatioAsStringESet = applicableValueRatioAsStringESet;
		applicableValueRatioAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO_AS_STRING, oldApplicableValueRatioAsString, applicableValueRatioAsString, !oldApplicableValueRatioAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplicableValueRatioAsString() {
		String oldApplicableValueRatioAsString = applicableValueRatioAsString;
		boolean oldApplicableValueRatioAsStringESet = applicableValueRatioAsStringESet;
		applicableValueRatioAsString = APPLICABLE_VALUE_RATIO_AS_STRING_EDEFAULT;
		applicableValueRatioAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO_AS_STRING, oldApplicableValueRatioAsString, APPLICABLE_VALUE_RATIO_AS_STRING_EDEFAULT, oldApplicableValueRatioAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplicableValueRatioAsString() {
		return applicableValueRatioAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadSourceEnum getThermalLoadSource() {
		return thermalLoadSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadSource(IfcThermalLoadSourceEnum newThermalLoadSource) {
		IfcThermalLoadSourceEnum oldThermalLoadSource = thermalLoadSource;
		thermalLoadSource = newThermalLoadSource == null ? THERMAL_LOAD_SOURCE_EDEFAULT : newThermalLoadSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE, oldThermalLoadSource, thermalLoadSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE, oldPropertySource, propertySource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceDescription() {
		return sourceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDescription(String newSourceDescription) {
		String oldSourceDescription = sourceDescription;
		sourceDescription = newSourceDescription;
		boolean oldSourceDescriptionESet = sourceDescriptionESet;
		sourceDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION, oldSourceDescription, sourceDescription, !oldSourceDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSourceDescription() {
		String oldSourceDescription = sourceDescription;
		boolean oldSourceDescriptionESet = sourceDescriptionESet;
		sourceDescription = SOURCE_DESCRIPTION_EDEFAULT;
		sourceDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION, oldSourceDescription, SOURCE_DESCRIPTION_EDEFAULT, oldSourceDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceDescription() {
		return sourceDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumValue() {
		return maximumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumValue(double newMaximumValue) {
		double oldMaximumValue = maximumValue;
		maximumValue = newMaximumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE, oldMaximumValue, maximumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumValueAsString() {
		return maximumValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumValueAsString(String newMaximumValueAsString) {
		String oldMaximumValueAsString = maximumValueAsString;
		maximumValueAsString = newMaximumValueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE_AS_STRING, oldMaximumValueAsString, maximumValueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumValue() {
		return minimumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValue(double newMinimumValue) {
		double oldMinimumValue = minimumValue;
		minimumValue = newMinimumValue;
		boolean oldMinimumValueESet = minimumValueESet;
		minimumValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE, oldMinimumValue, minimumValue, !oldMinimumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumValue() {
		double oldMinimumValue = minimumValue;
		boolean oldMinimumValueESet = minimumValueESet;
		minimumValue = MINIMUM_VALUE_EDEFAULT;
		minimumValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE, oldMinimumValue, MINIMUM_VALUE_EDEFAULT, oldMinimumValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumValue() {
		return minimumValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumValueAsString() {
		return minimumValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValueAsString(String newMinimumValueAsString) {
		String oldMinimumValueAsString = minimumValueAsString;
		minimumValueAsString = newMinimumValueAsString;
		boolean oldMinimumValueAsStringESet = minimumValueAsStringESet;
		minimumValueAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE_AS_STRING, oldMinimumValueAsString, minimumValueAsString, !oldMinimumValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumValueAsString() {
		String oldMinimumValueAsString = minimumValueAsString;
		boolean oldMinimumValueAsStringESet = minimumValueAsStringESet;
		minimumValueAsString = MINIMUM_VALUE_AS_STRING_EDEFAULT;
		minimumValueAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE_AS_STRING, oldMinimumValueAsString, MINIMUM_VALUE_AS_STRING_EDEFAULT, oldMinimumValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumValueAsString() {
		return minimumValueAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getThermalLoadTimeSeriesValues() {
		if (thermalLoadTimeSeriesValues != null && thermalLoadTimeSeriesValues.eIsProxy()) {
			InternalEObject oldThermalLoadTimeSeriesValues = (InternalEObject)thermalLoadTimeSeriesValues;
			thermalLoadTimeSeriesValues = (IfcTimeSeries)eResolveProxy(oldThermalLoadTimeSeriesValues);
			if (thermalLoadTimeSeriesValues != oldThermalLoadTimeSeriesValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES, oldThermalLoadTimeSeriesValues, thermalLoadTimeSeriesValues));
			}
		}
		return thermalLoadTimeSeriesValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetThermalLoadTimeSeriesValues() {
		return thermalLoadTimeSeriesValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadTimeSeriesValues(IfcTimeSeries newThermalLoadTimeSeriesValues) {
		IfcTimeSeries oldThermalLoadTimeSeriesValues = thermalLoadTimeSeriesValues;
		thermalLoadTimeSeriesValues = newThermalLoadTimeSeriesValues;
		boolean oldThermalLoadTimeSeriesValuesESet = thermalLoadTimeSeriesValuesESet;
		thermalLoadTimeSeriesValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES, oldThermalLoadTimeSeriesValues, thermalLoadTimeSeriesValues, !oldThermalLoadTimeSeriesValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalLoadTimeSeriesValues() {
		IfcTimeSeries oldThermalLoadTimeSeriesValues = thermalLoadTimeSeriesValues;
		boolean oldThermalLoadTimeSeriesValuesESet = thermalLoadTimeSeriesValuesESet;
		thermalLoadTimeSeriesValues = null;
		thermalLoadTimeSeriesValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES, oldThermalLoadTimeSeriesValues, null, oldThermalLoadTimeSeriesValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalLoadTimeSeriesValues() {
		return thermalLoadTimeSeriesValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedThermalLoadSource() {
		return userDefinedThermalLoadSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedThermalLoadSource(String newUserDefinedThermalLoadSource) {
		String oldUserDefinedThermalLoadSource = userDefinedThermalLoadSource;
		userDefinedThermalLoadSource = newUserDefinedThermalLoadSource;
		boolean oldUserDefinedThermalLoadSourceESet = userDefinedThermalLoadSourceESet;
		userDefinedThermalLoadSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE, oldUserDefinedThermalLoadSource, userDefinedThermalLoadSource, !oldUserDefinedThermalLoadSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedThermalLoadSource() {
		String oldUserDefinedThermalLoadSource = userDefinedThermalLoadSource;
		boolean oldUserDefinedThermalLoadSourceESet = userDefinedThermalLoadSourceESet;
		userDefinedThermalLoadSource = USER_DEFINED_THERMAL_LOAD_SOURCE_EDEFAULT;
		userDefinedThermalLoadSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE, oldUserDefinedThermalLoadSource, USER_DEFINED_THERMAL_LOAD_SOURCE_EDEFAULT, oldUserDefinedThermalLoadSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedThermalLoadSource() {
		return userDefinedThermalLoadSourceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE, oldUserDefinedPropertySource, userDefinedPropertySource, !oldUserDefinedPropertySourceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE, oldUserDefinedPropertySource, USER_DEFINED_PROPERTY_SOURCE_EDEFAULT, oldUserDefinedPropertySourceESet));
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
	public IfcThermalLoadTypeEnum getThermalLoadType() {
		return thermalLoadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadType(IfcThermalLoadTypeEnum newThermalLoadType) {
		IfcThermalLoadTypeEnum oldThermalLoadType = thermalLoadType;
		thermalLoadType = newThermalLoadType == null ? THERMAL_LOAD_TYPE_EDEFAULT : newThermalLoadType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE, oldThermalLoadType, thermalLoadType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO:
				return getApplicableValueRatio();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO_AS_STRING:
				return getApplicableValueRatioAsString();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE:
				return getThermalLoadSource();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE:
				return getPropertySource();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION:
				return getSourceDescription();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE:
				return getMaximumValue();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE_AS_STRING:
				return getMaximumValueAsString();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE:
				return getMinimumValue();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE_AS_STRING:
				return getMinimumValueAsString();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES:
				if (resolve) return getThermalLoadTimeSeriesValues();
				return basicGetThermalLoadTimeSeriesValues();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE:
				return getUserDefinedThermalLoadSource();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				return getUserDefinedPropertySource();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE:
				return getThermalLoadType();
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
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO:
				setApplicableValueRatio((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO_AS_STRING:
				setApplicableValueRatioAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE:
				setThermalLoadSource((IfcThermalLoadSourceEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE:
				setPropertySource((IfcPropertySourceEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION:
				setSourceDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE:
				setMaximumValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE_AS_STRING:
				setMaximumValueAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE:
				setMinimumValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE_AS_STRING:
				setMinimumValueAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES:
				setThermalLoadTimeSeriesValues((IfcTimeSeries)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE:
				setUserDefinedThermalLoadSource((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				setUserDefinedPropertySource((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE:
				setThermalLoadType((IfcThermalLoadTypeEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO:
				unsetApplicableValueRatio();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO_AS_STRING:
				unsetApplicableValueRatioAsString();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE:
				setThermalLoadSource(THERMAL_LOAD_SOURCE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE:
				setPropertySource(PROPERTY_SOURCE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION:
				unsetSourceDescription();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE:
				setMaximumValue(MAXIMUM_VALUE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE_AS_STRING:
				setMaximumValueAsString(MAXIMUM_VALUE_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE:
				unsetMinimumValue();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE_AS_STRING:
				unsetMinimumValueAsString();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES:
				unsetThermalLoadTimeSeriesValues();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE:
				unsetUserDefinedThermalLoadSource();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				unsetUserDefinedPropertySource();
				return;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE:
				setThermalLoadType(THERMAL_LOAD_TYPE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO:
				return isSetApplicableValueRatio();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO_AS_STRING:
				return isSetApplicableValueRatioAsString();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE:
				return thermalLoadSource != THERMAL_LOAD_SOURCE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE:
				return propertySource != PROPERTY_SOURCE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION:
				return isSetSourceDescription();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE:
				return maximumValue != MAXIMUM_VALUE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE_AS_STRING:
				return MAXIMUM_VALUE_AS_STRING_EDEFAULT == null ? maximumValueAsString != null : !MAXIMUM_VALUE_AS_STRING_EDEFAULT.equals(maximumValueAsString);
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE:
				return isSetMinimumValue();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE_AS_STRING:
				return isSetMinimumValueAsString();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES:
				return isSetThermalLoadTimeSeriesValues();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE:
				return isSetUserDefinedThermalLoadSource();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				return isSetUserDefinedPropertySource();
			case Ifc2x3tc1Package.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE:
				return thermalLoadType != THERMAL_LOAD_TYPE_EDEFAULT;
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
		result.append(" (ApplicableValueRatio: ");
		if (applicableValueRatioESet) result.append(applicableValueRatio); else result.append("<unset>");
		result.append(", ApplicableValueRatioAsString: ");
		if (applicableValueRatioAsStringESet) result.append(applicableValueRatioAsString); else result.append("<unset>");
		result.append(", ThermalLoadSource: ");
		result.append(thermalLoadSource);
		result.append(", PropertySource: ");
		result.append(propertySource);
		result.append(", SourceDescription: ");
		if (sourceDescriptionESet) result.append(sourceDescription); else result.append("<unset>");
		result.append(", MaximumValue: ");
		result.append(maximumValue);
		result.append(", MaximumValueAsString: ");
		result.append(maximumValueAsString);
		result.append(", MinimumValue: ");
		if (minimumValueESet) result.append(minimumValue); else result.append("<unset>");
		result.append(", MinimumValueAsString: ");
		if (minimumValueAsStringESet) result.append(minimumValueAsString); else result.append("<unset>");
		result.append(", UserDefinedThermalLoadSource: ");
		if (userDefinedThermalLoadSourceESet) result.append(userDefinedThermalLoadSource); else result.append("<unset>");
		result.append(", UserDefinedPropertySource: ");
		if (userDefinedPropertySourceESet) result.append(userDefinedPropertySource); else result.append("<unset>");
		result.append(", ThermalLoadType: ");
		result.append(thermalLoadType);
		result.append(')');
		return result.toString();
	}

} //IfcSpaceThermalLoadPropertiesImpl
