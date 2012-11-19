/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySourceEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpaceThermalLoadProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalLoadSourceEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalLoadTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ThermalLoadTimeSeriesValuesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space Thermal Load Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getApplicableValueRatio <em>Applicable Value Ratio</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadSource <em>Thermal Load Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getSourceDescription <em>Source Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadTimeSeriesValues <em>Thermal Load Time Series Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedThermalLoadSource <em>User Defined Thermal Load Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceThermalLoadPropertiesImpl#getThermalLoadType <em>Thermal Load Type</em>}</li>
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
	protected static final Double APPLICABLE_VALUE_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicableValueRatio() <em>Applicable Value Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicableValueRatio()
	 * @generated
	 * @ordered
	 */
	protected Double applicableValueRatio = APPLICABLE_VALUE_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermalLoadSource() <em>Thermal Load Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalLoadSource()
	 * @generated
	 * @ordered
	 */
	protected static final IfcThermalLoadSourceEnum THERMAL_LOAD_SOURCE_EDEFAULT = IfcThermalLoadSourceEnum.PEOPLE;

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
	 * The default value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected Double minimumValue = MINIMUM_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThermalLoadTimeSeriesValues() <em>Thermal Load Time Series Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalLoadTimeSeriesValues()
	 * @generated
	 * @ordered
	 */
	protected ThermalLoadTimeSeriesValuesType thermalLoadTimeSeriesValues;

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
	 * The default value of the '{@link #getThermalLoadType() <em>Thermal Load Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalLoadType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcThermalLoadTypeEnum THERMAL_LOAD_TYPE_EDEFAULT = IfcThermalLoadTypeEnum.SENSIBLE;

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
		return FinalPackage.eINSTANCE.getIfcSpaceThermalLoadProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getApplicableValueRatio() {
		return applicableValueRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicableValueRatio(Double newApplicableValueRatio) {
		Double oldApplicableValueRatio = applicableValueRatio;
		applicableValueRatio = newApplicableValueRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO, oldApplicableValueRatio, applicableValueRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE, oldThermalLoadSource, thermalLoadSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE, oldPropertySource, propertySource));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION, oldSourceDescription, sourceDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE, oldMaximumValue, maximumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumValue() {
		return minimumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValue(Double newMinimumValue) {
		Double oldMinimumValue = minimumValue;
		minimumValue = newMinimumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE, oldMinimumValue, minimumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalLoadTimeSeriesValuesType getThermalLoadTimeSeriesValues() {
		return thermalLoadTimeSeriesValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThermalLoadTimeSeriesValues(ThermalLoadTimeSeriesValuesType newThermalLoadTimeSeriesValues, NotificationChain msgs) {
		ThermalLoadTimeSeriesValuesType oldThermalLoadTimeSeriesValues = thermalLoadTimeSeriesValues;
		thermalLoadTimeSeriesValues = newThermalLoadTimeSeriesValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES, oldThermalLoadTimeSeriesValues, newThermalLoadTimeSeriesValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalLoadTimeSeriesValues(ThermalLoadTimeSeriesValuesType newThermalLoadTimeSeriesValues) {
		if (newThermalLoadTimeSeriesValues != thermalLoadTimeSeriesValues) {
			NotificationChain msgs = null;
			if (thermalLoadTimeSeriesValues != null)
				msgs = ((InternalEObject)thermalLoadTimeSeriesValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES, null, msgs);
			if (newThermalLoadTimeSeriesValues != null)
				msgs = ((InternalEObject)newThermalLoadTimeSeriesValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES, null, msgs);
			msgs = basicSetThermalLoadTimeSeriesValues(newThermalLoadTimeSeriesValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES, newThermalLoadTimeSeriesValues, newThermalLoadTimeSeriesValues));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE, oldUserDefinedThermalLoadSource, userDefinedThermalLoadSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE, oldUserDefinedPropertySource, userDefinedPropertySource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE, oldThermalLoadType, thermalLoadType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES:
				return basicSetThermalLoadTimeSeriesValues(null, msgs);
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
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO:
				return getApplicableValueRatio();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE:
				return getThermalLoadSource();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE:
				return getPropertySource();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION:
				return getSourceDescription();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE:
				return getMaximumValue();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE:
				return getMinimumValue();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES:
				return getThermalLoadTimeSeriesValues();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE:
				return getUserDefinedThermalLoadSource();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				return getUserDefinedPropertySource();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE:
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
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO:
				setApplicableValueRatio((Double)newValue);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE:
				setThermalLoadSource((IfcThermalLoadSourceEnum)newValue);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE:
				setPropertySource((IfcPropertySourceEnum)newValue);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION:
				setSourceDescription((String)newValue);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE:
				setMaximumValue((Double)newValue);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE:
				setMinimumValue((Double)newValue);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES:
				setThermalLoadTimeSeriesValues((ThermalLoadTimeSeriesValuesType)newValue);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE:
				setUserDefinedThermalLoadSource((String)newValue);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				setUserDefinedPropertySource((String)newValue);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE:
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
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO:
				setApplicableValueRatio(APPLICABLE_VALUE_RATIO_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE:
				setThermalLoadSource(THERMAL_LOAD_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE:
				setPropertySource(PROPERTY_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION:
				setSourceDescription(SOURCE_DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE:
				setMaximumValue(MAXIMUM_VALUE_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE:
				setMinimumValue(MINIMUM_VALUE_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES:
				setThermalLoadTimeSeriesValues((ThermalLoadTimeSeriesValuesType)null);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE:
				setUserDefinedThermalLoadSource(USER_DEFINED_THERMAL_LOAD_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				setUserDefinedPropertySource(USER_DEFINED_PROPERTY_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE:
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
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__APPLICABLE_VALUE_RATIO:
				return APPLICABLE_VALUE_RATIO_EDEFAULT == null ? applicableValueRatio != null : !APPLICABLE_VALUE_RATIO_EDEFAULT.equals(applicableValueRatio);
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_SOURCE:
				return thermalLoadSource != THERMAL_LOAD_SOURCE_EDEFAULT;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__PROPERTY_SOURCE:
				return propertySource != PROPERTY_SOURCE_EDEFAULT;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__SOURCE_DESCRIPTION:
				return SOURCE_DESCRIPTION_EDEFAULT == null ? sourceDescription != null : !SOURCE_DESCRIPTION_EDEFAULT.equals(sourceDescription);
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MAXIMUM_VALUE:
				return maximumValue != MAXIMUM_VALUE_EDEFAULT;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__MINIMUM_VALUE:
				return MINIMUM_VALUE_EDEFAULT == null ? minimumValue != null : !MINIMUM_VALUE_EDEFAULT.equals(minimumValue);
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TIME_SERIES_VALUES:
				return thermalLoadTimeSeriesValues != null;
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_THERMAL_LOAD_SOURCE:
				return USER_DEFINED_THERMAL_LOAD_SOURCE_EDEFAULT == null ? userDefinedThermalLoadSource != null : !USER_DEFINED_THERMAL_LOAD_SOURCE_EDEFAULT.equals(userDefinedThermalLoadSource);
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__USER_DEFINED_PROPERTY_SOURCE:
				return USER_DEFINED_PROPERTY_SOURCE_EDEFAULT == null ? userDefinedPropertySource != null : !USER_DEFINED_PROPERTY_SOURCE_EDEFAULT.equals(userDefinedPropertySource);
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES__THERMAL_LOAD_TYPE:
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
		result.append(" (applicableValueRatio: ");
		result.append(applicableValueRatio);
		result.append(", thermalLoadSource: ");
		result.append(thermalLoadSource);
		result.append(", propertySource: ");
		result.append(propertySource);
		result.append(", sourceDescription: ");
		result.append(sourceDescription);
		result.append(", maximumValue: ");
		result.append(maximumValue);
		result.append(", minimumValue: ");
		result.append(minimumValue);
		result.append(", userDefinedThermalLoadSource: ");
		result.append(userDefinedThermalLoadSource);
		result.append(", userDefinedPropertySource: ");
		result.append(userDefinedPropertySource);
		result.append(", thermalLoadType: ");
		result.append(thermalLoadType);
		result.append(')');
		return result.toString();
	}

} //IfcSpaceThermalLoadPropertiesImpl
