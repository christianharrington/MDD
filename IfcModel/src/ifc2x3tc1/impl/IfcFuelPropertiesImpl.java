/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcFuelProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fuel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFuelPropertiesImpl#getCombustionTemperature <em>Combustion Temperature</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFuelPropertiesImpl#getCombustionTemperatureAsString <em>Combustion Temperature As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFuelPropertiesImpl#getCarbonContent <em>Carbon Content</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFuelPropertiesImpl#getCarbonContentAsString <em>Carbon Content As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFuelPropertiesImpl#getLowerHeatingValue <em>Lower Heating Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFuelPropertiesImpl#getLowerHeatingValueAsString <em>Lower Heating Value As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFuelPropertiesImpl#getHigherHeatingValue <em>Higher Heating Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFuelPropertiesImpl#getHigherHeatingValueAsString <em>Higher Heating Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFuelPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcFuelProperties {
	/**
	 * The default value of the '{@link #getCombustionTemperature() <em>Combustion Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double COMBUSTION_TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCombustionTemperature() <em>Combustion Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTemperature()
	 * @generated
	 * @ordered
	 */
	protected double combustionTemperature = COMBUSTION_TEMPERATURE_EDEFAULT;

	/**
	 * This is true if the Combustion Temperature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean combustionTemperatureESet;

	/**
	 * The default value of the '{@link #getCombustionTemperatureAsString() <em>Combustion Temperature As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTemperatureAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMBUSTION_TEMPERATURE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCombustionTemperatureAsString() <em>Combustion Temperature As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTemperatureAsString()
	 * @generated
	 * @ordered
	 */
	protected String combustionTemperatureAsString = COMBUSTION_TEMPERATURE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Combustion Temperature As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean combustionTemperatureAsStringESet;

	/**
	 * The default value of the '{@link #getCarbonContent() <em>Carbon Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonContent()
	 * @generated
	 * @ordered
	 */
	protected static final double CARBON_CONTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCarbonContent() <em>Carbon Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonContent()
	 * @generated
	 * @ordered
	 */
	protected double carbonContent = CARBON_CONTENT_EDEFAULT;

	/**
	 * This is true if the Carbon Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean carbonContentESet;

	/**
	 * The default value of the '{@link #getCarbonContentAsString() <em>Carbon Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonContentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CARBON_CONTENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarbonContentAsString() <em>Carbon Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonContentAsString()
	 * @generated
	 * @ordered
	 */
	protected String carbonContentAsString = CARBON_CONTENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Carbon Content As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean carbonContentAsStringESet;

	/**
	 * The default value of the '{@link #getLowerHeatingValue() <em>Lower Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerHeatingValue()
	 * @generated
	 * @ordered
	 */
	protected static final double LOWER_HEATING_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLowerHeatingValue() <em>Lower Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerHeatingValue()
	 * @generated
	 * @ordered
	 */
	protected double lowerHeatingValue = LOWER_HEATING_VALUE_EDEFAULT;

	/**
	 * This is true if the Lower Heating Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowerHeatingValueESet;

	/**
	 * The default value of the '{@link #getLowerHeatingValueAsString() <em>Lower Heating Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerHeatingValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_HEATING_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerHeatingValueAsString() <em>Lower Heating Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerHeatingValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String lowerHeatingValueAsString = LOWER_HEATING_VALUE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Lower Heating Value As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowerHeatingValueAsStringESet;

	/**
	 * The default value of the '{@link #getHigherHeatingValue() <em>Higher Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherHeatingValue()
	 * @generated
	 * @ordered
	 */
	protected static final double HIGHER_HEATING_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHigherHeatingValue() <em>Higher Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherHeatingValue()
	 * @generated
	 * @ordered
	 */
	protected double higherHeatingValue = HIGHER_HEATING_VALUE_EDEFAULT;

	/**
	 * This is true if the Higher Heating Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean higherHeatingValueESet;

	/**
	 * The default value of the '{@link #getHigherHeatingValueAsString() <em>Higher Heating Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherHeatingValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String HIGHER_HEATING_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHigherHeatingValueAsString() <em>Higher Heating Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherHeatingValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String higherHeatingValueAsString = HIGHER_HEATING_VALUE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Higher Heating Value As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean higherHeatingValueAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFuelPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcFuelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCombustionTemperature() {
		return combustionTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombustionTemperature(double newCombustionTemperature) {
		double oldCombustionTemperature = combustionTemperature;
		combustionTemperature = newCombustionTemperature;
		boolean oldCombustionTemperatureESet = combustionTemperatureESet;
		combustionTemperatureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE, oldCombustionTemperature, combustionTemperature, !oldCombustionTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCombustionTemperature() {
		double oldCombustionTemperature = combustionTemperature;
		boolean oldCombustionTemperatureESet = combustionTemperatureESet;
		combustionTemperature = COMBUSTION_TEMPERATURE_EDEFAULT;
		combustionTemperatureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE, oldCombustionTemperature, COMBUSTION_TEMPERATURE_EDEFAULT, oldCombustionTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCombustionTemperature() {
		return combustionTemperatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCombustionTemperatureAsString() {
		return combustionTemperatureAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombustionTemperatureAsString(String newCombustionTemperatureAsString) {
		String oldCombustionTemperatureAsString = combustionTemperatureAsString;
		combustionTemperatureAsString = newCombustionTemperatureAsString;
		boolean oldCombustionTemperatureAsStringESet = combustionTemperatureAsStringESet;
		combustionTemperatureAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE_AS_STRING, oldCombustionTemperatureAsString, combustionTemperatureAsString, !oldCombustionTemperatureAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCombustionTemperatureAsString() {
		String oldCombustionTemperatureAsString = combustionTemperatureAsString;
		boolean oldCombustionTemperatureAsStringESet = combustionTemperatureAsStringESet;
		combustionTemperatureAsString = COMBUSTION_TEMPERATURE_AS_STRING_EDEFAULT;
		combustionTemperatureAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE_AS_STRING, oldCombustionTemperatureAsString, COMBUSTION_TEMPERATURE_AS_STRING_EDEFAULT, oldCombustionTemperatureAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCombustionTemperatureAsString() {
		return combustionTemperatureAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCarbonContent() {
		return carbonContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarbonContent(double newCarbonContent) {
		double oldCarbonContent = carbonContent;
		carbonContent = newCarbonContent;
		boolean oldCarbonContentESet = carbonContentESet;
		carbonContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT, oldCarbonContent, carbonContent, !oldCarbonContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCarbonContent() {
		double oldCarbonContent = carbonContent;
		boolean oldCarbonContentESet = carbonContentESet;
		carbonContent = CARBON_CONTENT_EDEFAULT;
		carbonContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT, oldCarbonContent, CARBON_CONTENT_EDEFAULT, oldCarbonContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCarbonContent() {
		return carbonContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarbonContentAsString() {
		return carbonContentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarbonContentAsString(String newCarbonContentAsString) {
		String oldCarbonContentAsString = carbonContentAsString;
		carbonContentAsString = newCarbonContentAsString;
		boolean oldCarbonContentAsStringESet = carbonContentAsStringESet;
		carbonContentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT_AS_STRING, oldCarbonContentAsString, carbonContentAsString, !oldCarbonContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCarbonContentAsString() {
		String oldCarbonContentAsString = carbonContentAsString;
		boolean oldCarbonContentAsStringESet = carbonContentAsStringESet;
		carbonContentAsString = CARBON_CONTENT_AS_STRING_EDEFAULT;
		carbonContentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT_AS_STRING, oldCarbonContentAsString, CARBON_CONTENT_AS_STRING_EDEFAULT, oldCarbonContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCarbonContentAsString() {
		return carbonContentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLowerHeatingValue() {
		return lowerHeatingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerHeatingValue(double newLowerHeatingValue) {
		double oldLowerHeatingValue = lowerHeatingValue;
		lowerHeatingValue = newLowerHeatingValue;
		boolean oldLowerHeatingValueESet = lowerHeatingValueESet;
		lowerHeatingValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE, oldLowerHeatingValue, lowerHeatingValue, !oldLowerHeatingValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerHeatingValue() {
		double oldLowerHeatingValue = lowerHeatingValue;
		boolean oldLowerHeatingValueESet = lowerHeatingValueESet;
		lowerHeatingValue = LOWER_HEATING_VALUE_EDEFAULT;
		lowerHeatingValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE, oldLowerHeatingValue, LOWER_HEATING_VALUE_EDEFAULT, oldLowerHeatingValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerHeatingValue() {
		return lowerHeatingValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerHeatingValueAsString() {
		return lowerHeatingValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerHeatingValueAsString(String newLowerHeatingValueAsString) {
		String oldLowerHeatingValueAsString = lowerHeatingValueAsString;
		lowerHeatingValueAsString = newLowerHeatingValueAsString;
		boolean oldLowerHeatingValueAsStringESet = lowerHeatingValueAsStringESet;
		lowerHeatingValueAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE_AS_STRING, oldLowerHeatingValueAsString, lowerHeatingValueAsString, !oldLowerHeatingValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerHeatingValueAsString() {
		String oldLowerHeatingValueAsString = lowerHeatingValueAsString;
		boolean oldLowerHeatingValueAsStringESet = lowerHeatingValueAsStringESet;
		lowerHeatingValueAsString = LOWER_HEATING_VALUE_AS_STRING_EDEFAULT;
		lowerHeatingValueAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE_AS_STRING, oldLowerHeatingValueAsString, LOWER_HEATING_VALUE_AS_STRING_EDEFAULT, oldLowerHeatingValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerHeatingValueAsString() {
		return lowerHeatingValueAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHigherHeatingValue() {
		return higherHeatingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigherHeatingValue(double newHigherHeatingValue) {
		double oldHigherHeatingValue = higherHeatingValue;
		higherHeatingValue = newHigherHeatingValue;
		boolean oldHigherHeatingValueESet = higherHeatingValueESet;
		higherHeatingValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE, oldHigherHeatingValue, higherHeatingValue, !oldHigherHeatingValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHigherHeatingValue() {
		double oldHigherHeatingValue = higherHeatingValue;
		boolean oldHigherHeatingValueESet = higherHeatingValueESet;
		higherHeatingValue = HIGHER_HEATING_VALUE_EDEFAULT;
		higherHeatingValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE, oldHigherHeatingValue, HIGHER_HEATING_VALUE_EDEFAULT, oldHigherHeatingValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHigherHeatingValue() {
		return higherHeatingValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHigherHeatingValueAsString() {
		return higherHeatingValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigherHeatingValueAsString(String newHigherHeatingValueAsString) {
		String oldHigherHeatingValueAsString = higherHeatingValueAsString;
		higherHeatingValueAsString = newHigherHeatingValueAsString;
		boolean oldHigherHeatingValueAsStringESet = higherHeatingValueAsStringESet;
		higherHeatingValueAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE_AS_STRING, oldHigherHeatingValueAsString, higherHeatingValueAsString, !oldHigherHeatingValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHigherHeatingValueAsString() {
		String oldHigherHeatingValueAsString = higherHeatingValueAsString;
		boolean oldHigherHeatingValueAsStringESet = higherHeatingValueAsStringESet;
		higherHeatingValueAsString = HIGHER_HEATING_VALUE_AS_STRING_EDEFAULT;
		higherHeatingValueAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE_AS_STRING, oldHigherHeatingValueAsString, HIGHER_HEATING_VALUE_AS_STRING_EDEFAULT, oldHigherHeatingValueAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHigherHeatingValueAsString() {
		return higherHeatingValueAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE:
				return getCombustionTemperature();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE_AS_STRING:
				return getCombustionTemperatureAsString();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT:
				return getCarbonContent();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT_AS_STRING:
				return getCarbonContentAsString();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE:
				return getLowerHeatingValue();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE_AS_STRING:
				return getLowerHeatingValueAsString();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE:
				return getHigherHeatingValue();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE_AS_STRING:
				return getHigherHeatingValueAsString();
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
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE:
				setCombustionTemperature((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE_AS_STRING:
				setCombustionTemperatureAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT:
				setCarbonContent((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT_AS_STRING:
				setCarbonContentAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE:
				setLowerHeatingValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE_AS_STRING:
				setLowerHeatingValueAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE:
				setHigherHeatingValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE_AS_STRING:
				setHigherHeatingValueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE:
				unsetCombustionTemperature();
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE_AS_STRING:
				unsetCombustionTemperatureAsString();
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT:
				unsetCarbonContent();
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT_AS_STRING:
				unsetCarbonContentAsString();
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE:
				unsetLowerHeatingValue();
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE_AS_STRING:
				unsetLowerHeatingValueAsString();
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE:
				unsetHigherHeatingValue();
				return;
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE_AS_STRING:
				unsetHigherHeatingValueAsString();
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
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE:
				return isSetCombustionTemperature();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE_AS_STRING:
				return isSetCombustionTemperatureAsString();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT:
				return isSetCarbonContent();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__CARBON_CONTENT_AS_STRING:
				return isSetCarbonContentAsString();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE:
				return isSetLowerHeatingValue();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE_AS_STRING:
				return isSetLowerHeatingValueAsString();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE:
				return isSetHigherHeatingValue();
			case Ifc2x3tc1Package.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE_AS_STRING:
				return isSetHigherHeatingValueAsString();
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
		result.append(" (CombustionTemperature: ");
		if (combustionTemperatureESet) result.append(combustionTemperature); else result.append("<unset>");
		result.append(", CombustionTemperatureAsString: ");
		if (combustionTemperatureAsStringESet) result.append(combustionTemperatureAsString); else result.append("<unset>");
		result.append(", CarbonContent: ");
		if (carbonContentESet) result.append(carbonContent); else result.append("<unset>");
		result.append(", CarbonContentAsString: ");
		if (carbonContentAsStringESet) result.append(carbonContentAsString); else result.append("<unset>");
		result.append(", LowerHeatingValue: ");
		if (lowerHeatingValueESet) result.append(lowerHeatingValue); else result.append("<unset>");
		result.append(", LowerHeatingValueAsString: ");
		if (lowerHeatingValueAsStringESet) result.append(lowerHeatingValueAsString); else result.append("<unset>");
		result.append(", HigherHeatingValue: ");
		if (higherHeatingValueESet) result.append(higherHeatingValue); else result.append("<unset>");
		result.append(", HigherHeatingValueAsString: ");
		if (higherHeatingValueAsStringESet) result.append(higherHeatingValueAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcFuelPropertiesImpl
