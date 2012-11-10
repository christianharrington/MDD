/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcThermalMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Thermal Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getSpecificHeatCapacityAsString <em>Specific Heat Capacity As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getBoilingPointAsString <em>Boiling Point As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getFreezingPointAsString <em>Freezing Point As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getThermalConductivity <em>Thermal Conductivity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcThermalMaterialPropertiesImpl#getThermalConductivityAsString <em>Thermal Conductivity As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcThermalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcThermalMaterialProperties {
	/**
	 * The default value of the '{@link #getSpecificHeatCapacity() <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double SPECIFIC_HEAT_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpecificHeatCapacity() <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 * @ordered
	 */
	protected double specificHeatCapacity = SPECIFIC_HEAT_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Specific Heat Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specificHeatCapacityESet;

	/**
	 * The default value of the '{@link #getSpecificHeatCapacityAsString() <em>Specific Heat Capacity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_HEAT_CAPACITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificHeatCapacityAsString() <em>Specific Heat Capacity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacityAsString()
	 * @generated
	 * @ordered
	 */
	protected String specificHeatCapacityAsString = SPECIFIC_HEAT_CAPACITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Specific Heat Capacity As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specificHeatCapacityAsStringESet;

	/**
	 * The default value of the '{@link #getBoilingPoint() <em>Boiling Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilingPoint()
	 * @generated
	 * @ordered
	 */
	protected static final double BOILING_POINT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoilingPoint() <em>Boiling Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilingPoint()
	 * @generated
	 * @ordered
	 */
	protected double boilingPoint = BOILING_POINT_EDEFAULT;

	/**
	 * This is true if the Boiling Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boilingPointESet;

	/**
	 * The default value of the '{@link #getBoilingPointAsString() <em>Boiling Point As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilingPointAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOILING_POINT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoilingPointAsString() <em>Boiling Point As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilingPointAsString()
	 * @generated
	 * @ordered
	 */
	protected String boilingPointAsString = BOILING_POINT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Boiling Point As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boilingPointAsStringESet;

	/**
	 * The default value of the '{@link #getFreezingPoint() <em>Freezing Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreezingPoint()
	 * @generated
	 * @ordered
	 */
	protected static final double FREEZING_POINT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFreezingPoint() <em>Freezing Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreezingPoint()
	 * @generated
	 * @ordered
	 */
	protected double freezingPoint = FREEZING_POINT_EDEFAULT;

	/**
	 * This is true if the Freezing Point attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean freezingPointESet;

	/**
	 * The default value of the '{@link #getFreezingPointAsString() <em>Freezing Point As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreezingPointAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FREEZING_POINT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreezingPointAsString() <em>Freezing Point As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreezingPointAsString()
	 * @generated
	 * @ordered
	 */
	protected String freezingPointAsString = FREEZING_POINT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Freezing Point As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean freezingPointAsStringESet;

	/**
	 * The default value of the '{@link #getThermalConductivity() <em>Thermal Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity()
	 * @generated
	 * @ordered
	 */
	protected static final double THERMAL_CONDUCTIVITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThermalConductivity() <em>Thermal Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity()
	 * @generated
	 * @ordered
	 */
	protected double thermalConductivity = THERMAL_CONDUCTIVITY_EDEFAULT;

	/**
	 * This is true if the Thermal Conductivity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalConductivityESet;

	/**
	 * The default value of the '{@link #getThermalConductivityAsString() <em>Thermal Conductivity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMAL_CONDUCTIVITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalConductivityAsString() <em>Thermal Conductivity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivityAsString()
	 * @generated
	 * @ordered
	 */
	protected String thermalConductivityAsString = THERMAL_CONDUCTIVITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Thermal Conductivity As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalConductivityAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcThermalMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcThermalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpecificHeatCapacity() {
		return specificHeatCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificHeatCapacity(double newSpecificHeatCapacity) {
		double oldSpecificHeatCapacity = specificHeatCapacity;
		specificHeatCapacity = newSpecificHeatCapacity;
		boolean oldSpecificHeatCapacityESet = specificHeatCapacityESet;
		specificHeatCapacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY, oldSpecificHeatCapacity, specificHeatCapacity, !oldSpecificHeatCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecificHeatCapacity() {
		double oldSpecificHeatCapacity = specificHeatCapacity;
		boolean oldSpecificHeatCapacityESet = specificHeatCapacityESet;
		specificHeatCapacity = SPECIFIC_HEAT_CAPACITY_EDEFAULT;
		specificHeatCapacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY, oldSpecificHeatCapacity, SPECIFIC_HEAT_CAPACITY_EDEFAULT, oldSpecificHeatCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecificHeatCapacity() {
		return specificHeatCapacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificHeatCapacityAsString() {
		return specificHeatCapacityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificHeatCapacityAsString(String newSpecificHeatCapacityAsString) {
		String oldSpecificHeatCapacityAsString = specificHeatCapacityAsString;
		specificHeatCapacityAsString = newSpecificHeatCapacityAsString;
		boolean oldSpecificHeatCapacityAsStringESet = specificHeatCapacityAsStringESet;
		specificHeatCapacityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING, oldSpecificHeatCapacityAsString, specificHeatCapacityAsString, !oldSpecificHeatCapacityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecificHeatCapacityAsString() {
		String oldSpecificHeatCapacityAsString = specificHeatCapacityAsString;
		boolean oldSpecificHeatCapacityAsStringESet = specificHeatCapacityAsStringESet;
		specificHeatCapacityAsString = SPECIFIC_HEAT_CAPACITY_AS_STRING_EDEFAULT;
		specificHeatCapacityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING, oldSpecificHeatCapacityAsString, SPECIFIC_HEAT_CAPACITY_AS_STRING_EDEFAULT, oldSpecificHeatCapacityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecificHeatCapacityAsString() {
		return specificHeatCapacityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoilingPoint() {
		return boilingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoilingPoint(double newBoilingPoint) {
		double oldBoilingPoint = boilingPoint;
		boilingPoint = newBoilingPoint;
		boolean oldBoilingPointESet = boilingPointESet;
		boilingPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT, oldBoilingPoint, boilingPoint, !oldBoilingPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoilingPoint() {
		double oldBoilingPoint = boilingPoint;
		boolean oldBoilingPointESet = boilingPointESet;
		boilingPoint = BOILING_POINT_EDEFAULT;
		boilingPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT, oldBoilingPoint, BOILING_POINT_EDEFAULT, oldBoilingPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoilingPoint() {
		return boilingPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoilingPointAsString() {
		return boilingPointAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoilingPointAsString(String newBoilingPointAsString) {
		String oldBoilingPointAsString = boilingPointAsString;
		boilingPointAsString = newBoilingPointAsString;
		boolean oldBoilingPointAsStringESet = boilingPointAsStringESet;
		boilingPointAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT_AS_STRING, oldBoilingPointAsString, boilingPointAsString, !oldBoilingPointAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoilingPointAsString() {
		String oldBoilingPointAsString = boilingPointAsString;
		boolean oldBoilingPointAsStringESet = boilingPointAsStringESet;
		boilingPointAsString = BOILING_POINT_AS_STRING_EDEFAULT;
		boilingPointAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT_AS_STRING, oldBoilingPointAsString, BOILING_POINT_AS_STRING_EDEFAULT, oldBoilingPointAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoilingPointAsString() {
		return boilingPointAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFreezingPoint() {
		return freezingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreezingPoint(double newFreezingPoint) {
		double oldFreezingPoint = freezingPoint;
		freezingPoint = newFreezingPoint;
		boolean oldFreezingPointESet = freezingPointESet;
		freezingPointESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT, oldFreezingPoint, freezingPoint, !oldFreezingPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFreezingPoint() {
		double oldFreezingPoint = freezingPoint;
		boolean oldFreezingPointESet = freezingPointESet;
		freezingPoint = FREEZING_POINT_EDEFAULT;
		freezingPointESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT, oldFreezingPoint, FREEZING_POINT_EDEFAULT, oldFreezingPointESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFreezingPoint() {
		return freezingPointESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFreezingPointAsString() {
		return freezingPointAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreezingPointAsString(String newFreezingPointAsString) {
		String oldFreezingPointAsString = freezingPointAsString;
		freezingPointAsString = newFreezingPointAsString;
		boolean oldFreezingPointAsStringESet = freezingPointAsStringESet;
		freezingPointAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT_AS_STRING, oldFreezingPointAsString, freezingPointAsString, !oldFreezingPointAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFreezingPointAsString() {
		String oldFreezingPointAsString = freezingPointAsString;
		boolean oldFreezingPointAsStringESet = freezingPointAsStringESet;
		freezingPointAsString = FREEZING_POINT_AS_STRING_EDEFAULT;
		freezingPointAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT_AS_STRING, oldFreezingPointAsString, FREEZING_POINT_AS_STRING_EDEFAULT, oldFreezingPointAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFreezingPointAsString() {
		return freezingPointAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThermalConductivity() {
		return thermalConductivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalConductivity(double newThermalConductivity) {
		double oldThermalConductivity = thermalConductivity;
		thermalConductivity = newThermalConductivity;
		boolean oldThermalConductivityESet = thermalConductivityESet;
		thermalConductivityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY, oldThermalConductivity, thermalConductivity, !oldThermalConductivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalConductivity() {
		double oldThermalConductivity = thermalConductivity;
		boolean oldThermalConductivityESet = thermalConductivityESet;
		thermalConductivity = THERMAL_CONDUCTIVITY_EDEFAULT;
		thermalConductivityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY, oldThermalConductivity, THERMAL_CONDUCTIVITY_EDEFAULT, oldThermalConductivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalConductivity() {
		return thermalConductivityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermalConductivityAsString() {
		return thermalConductivityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalConductivityAsString(String newThermalConductivityAsString) {
		String oldThermalConductivityAsString = thermalConductivityAsString;
		thermalConductivityAsString = newThermalConductivityAsString;
		boolean oldThermalConductivityAsStringESet = thermalConductivityAsStringESet;
		thermalConductivityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY_AS_STRING, oldThermalConductivityAsString, thermalConductivityAsString, !oldThermalConductivityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalConductivityAsString() {
		String oldThermalConductivityAsString = thermalConductivityAsString;
		boolean oldThermalConductivityAsStringESet = thermalConductivityAsStringESet;
		thermalConductivityAsString = THERMAL_CONDUCTIVITY_AS_STRING_EDEFAULT;
		thermalConductivityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY_AS_STRING, oldThermalConductivityAsString, THERMAL_CONDUCTIVITY_AS_STRING_EDEFAULT, oldThermalConductivityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalConductivityAsString() {
		return thermalConductivityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				return getSpecificHeatCapacity();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
				return getSpecificHeatCapacityAsString();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT:
				return getBoilingPoint();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT_AS_STRING:
				return getBoilingPointAsString();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT:
				return getFreezingPoint();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT_AS_STRING:
				return getFreezingPointAsString();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY:
				return getThermalConductivity();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY_AS_STRING:
				return getThermalConductivityAsString();
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
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				setSpecificHeatCapacity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
				setSpecificHeatCapacityAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT:
				setBoilingPoint((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT_AS_STRING:
				setBoilingPointAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT:
				setFreezingPoint((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT_AS_STRING:
				setFreezingPointAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY:
				setThermalConductivity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY_AS_STRING:
				setThermalConductivityAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				unsetSpecificHeatCapacity();
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
				unsetSpecificHeatCapacityAsString();
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT:
				unsetBoilingPoint();
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT_AS_STRING:
				unsetBoilingPointAsString();
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT:
				unsetFreezingPoint();
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT_AS_STRING:
				unsetFreezingPointAsString();
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY:
				unsetThermalConductivity();
				return;
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY_AS_STRING:
				unsetThermalConductivityAsString();
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
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				return isSetSpecificHeatCapacity();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY_AS_STRING:
				return isSetSpecificHeatCapacityAsString();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT:
				return isSetBoilingPoint();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT_AS_STRING:
				return isSetBoilingPointAsString();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT:
				return isSetFreezingPoint();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT_AS_STRING:
				return isSetFreezingPointAsString();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY:
				return isSetThermalConductivity();
			case Ifc2x3tc1Package.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY_AS_STRING:
				return isSetThermalConductivityAsString();
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
		result.append(" (SpecificHeatCapacity: ");
		if (specificHeatCapacityESet) result.append(specificHeatCapacity); else result.append("<unset>");
		result.append(", SpecificHeatCapacityAsString: ");
		if (specificHeatCapacityAsStringESet) result.append(specificHeatCapacityAsString); else result.append("<unset>");
		result.append(", BoilingPoint: ");
		if (boilingPointESet) result.append(boilingPoint); else result.append("<unset>");
		result.append(", BoilingPointAsString: ");
		if (boilingPointAsStringESet) result.append(boilingPointAsString); else result.append("<unset>");
		result.append(", FreezingPoint: ");
		if (freezingPointESet) result.append(freezingPoint); else result.append("<unset>");
		result.append(", FreezingPointAsString: ");
		if (freezingPointAsStringESet) result.append(freezingPointAsString); else result.append("<unset>");
		result.append(", ThermalConductivity: ");
		if (thermalConductivityESet) result.append(thermalConductivity); else result.append("<unset>");
		result.append(", ThermalConductivityAsString: ");
		if (thermalConductivityAsStringESet) result.append(thermalConductivityAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcThermalMaterialPropertiesImpl
