/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcHygroscopicMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Hygroscopic Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getUpperVaporResistanceFactorAsString <em>Upper Vapor Resistance Factor As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getLowerVaporResistanceFactorAsString <em>Lower Vapor Resistance Factor As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getIsothermalMoistureCapacityAsString <em>Isothermal Moisture Capacity As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getVaporPermeability <em>Vapor Permeability</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getVaporPermeabilityAsString <em>Vapor Permeability As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getMoistureDiffusivity <em>Moisture Diffusivity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcHygroscopicMaterialPropertiesImpl#getMoistureDiffusivityAsString <em>Moisture Diffusivity As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcHygroscopicMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcHygroscopicMaterialProperties {
	/**
	 * The default value of the '{@link #getUpperVaporResistanceFactor() <em>Upper Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperVaporResistanceFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double UPPER_VAPOR_RESISTANCE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUpperVaporResistanceFactor() <em>Upper Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperVaporResistanceFactor()
	 * @generated
	 * @ordered
	 */
	protected double upperVaporResistanceFactor = UPPER_VAPOR_RESISTANCE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Upper Vapor Resistance Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean upperVaporResistanceFactorESet;

	/**
	 * The default value of the '{@link #getUpperVaporResistanceFactorAsString() <em>Upper Vapor Resistance Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperVaporResistanceFactorAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperVaporResistanceFactorAsString() <em>Upper Vapor Resistance Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperVaporResistanceFactorAsString()
	 * @generated
	 * @ordered
	 */
	protected String upperVaporResistanceFactorAsString = UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Upper Vapor Resistance Factor As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean upperVaporResistanceFactorAsStringESet;

	/**
	 * The default value of the '{@link #getLowerVaporResistanceFactor() <em>Lower Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerVaporResistanceFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double LOWER_VAPOR_RESISTANCE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLowerVaporResistanceFactor() <em>Lower Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerVaporResistanceFactor()
	 * @generated
	 * @ordered
	 */
	protected double lowerVaporResistanceFactor = LOWER_VAPOR_RESISTANCE_FACTOR_EDEFAULT;

	/**
	 * This is true if the Lower Vapor Resistance Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowerVaporResistanceFactorESet;

	/**
	 * The default value of the '{@link #getLowerVaporResistanceFactorAsString() <em>Lower Vapor Resistance Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerVaporResistanceFactorAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerVaporResistanceFactorAsString() <em>Lower Vapor Resistance Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerVaporResistanceFactorAsString()
	 * @generated
	 * @ordered
	 */
	protected String lowerVaporResistanceFactorAsString = LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Lower Vapor Resistance Factor As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowerVaporResistanceFactorAsStringESet;

	/**
	 * The default value of the '{@link #getIsothermalMoistureCapacity() <em>Isothermal Moisture Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsothermalMoistureCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double ISOTHERMAL_MOISTURE_CAPACITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIsothermalMoistureCapacity() <em>Isothermal Moisture Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsothermalMoistureCapacity()
	 * @generated
	 * @ordered
	 */
	protected double isothermalMoistureCapacity = ISOTHERMAL_MOISTURE_CAPACITY_EDEFAULT;

	/**
	 * This is true if the Isothermal Moisture Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isothermalMoistureCapacityESet;

	/**
	 * The default value of the '{@link #getIsothermalMoistureCapacityAsString() <em>Isothermal Moisture Capacity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsothermalMoistureCapacityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsothermalMoistureCapacityAsString() <em>Isothermal Moisture Capacity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsothermalMoistureCapacityAsString()
	 * @generated
	 * @ordered
	 */
	protected String isothermalMoistureCapacityAsString = ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Isothermal Moisture Capacity As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isothermalMoistureCapacityAsStringESet;

	/**
	 * The default value of the '{@link #getVaporPermeability() <em>Vapor Permeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaporPermeability()
	 * @generated
	 * @ordered
	 */
	protected static final double VAPOR_PERMEABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVaporPermeability() <em>Vapor Permeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaporPermeability()
	 * @generated
	 * @ordered
	 */
	protected double vaporPermeability = VAPOR_PERMEABILITY_EDEFAULT;

	/**
	 * This is true if the Vapor Permeability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vaporPermeabilityESet;

	/**
	 * The default value of the '{@link #getVaporPermeabilityAsString() <em>Vapor Permeability As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaporPermeabilityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String VAPOR_PERMEABILITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVaporPermeabilityAsString() <em>Vapor Permeability As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaporPermeabilityAsString()
	 * @generated
	 * @ordered
	 */
	protected String vaporPermeabilityAsString = VAPOR_PERMEABILITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Vapor Permeability As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vaporPermeabilityAsStringESet;

	/**
	 * The default value of the '{@link #getMoistureDiffusivity() <em>Moisture Diffusivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoistureDiffusivity()
	 * @generated
	 * @ordered
	 */
	protected static final double MOISTURE_DIFFUSIVITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMoistureDiffusivity() <em>Moisture Diffusivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoistureDiffusivity()
	 * @generated
	 * @ordered
	 */
	protected double moistureDiffusivity = MOISTURE_DIFFUSIVITY_EDEFAULT;

	/**
	 * This is true if the Moisture Diffusivity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moistureDiffusivityESet;

	/**
	 * The default value of the '{@link #getMoistureDiffusivityAsString() <em>Moisture Diffusivity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoistureDiffusivityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MOISTURE_DIFFUSIVITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoistureDiffusivityAsString() <em>Moisture Diffusivity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoistureDiffusivityAsString()
	 * @generated
	 * @ordered
	 */
	protected String moistureDiffusivityAsString = MOISTURE_DIFFUSIVITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Moisture Diffusivity As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moistureDiffusivityAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcHygroscopicMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcHygroscopicMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUpperVaporResistanceFactor() {
		return upperVaporResistanceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperVaporResistanceFactor(double newUpperVaporResistanceFactor) {
		double oldUpperVaporResistanceFactor = upperVaporResistanceFactor;
		upperVaporResistanceFactor = newUpperVaporResistanceFactor;
		boolean oldUpperVaporResistanceFactorESet = upperVaporResistanceFactorESet;
		upperVaporResistanceFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR, oldUpperVaporResistanceFactor, upperVaporResistanceFactor, !oldUpperVaporResistanceFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpperVaporResistanceFactor() {
		double oldUpperVaporResistanceFactor = upperVaporResistanceFactor;
		boolean oldUpperVaporResistanceFactorESet = upperVaporResistanceFactorESet;
		upperVaporResistanceFactor = UPPER_VAPOR_RESISTANCE_FACTOR_EDEFAULT;
		upperVaporResistanceFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR, oldUpperVaporResistanceFactor, UPPER_VAPOR_RESISTANCE_FACTOR_EDEFAULT, oldUpperVaporResistanceFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpperVaporResistanceFactor() {
		return upperVaporResistanceFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperVaporResistanceFactorAsString() {
		return upperVaporResistanceFactorAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperVaporResistanceFactorAsString(String newUpperVaporResistanceFactorAsString) {
		String oldUpperVaporResistanceFactorAsString = upperVaporResistanceFactorAsString;
		upperVaporResistanceFactorAsString = newUpperVaporResistanceFactorAsString;
		boolean oldUpperVaporResistanceFactorAsStringESet = upperVaporResistanceFactorAsStringESet;
		upperVaporResistanceFactorAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING, oldUpperVaporResistanceFactorAsString, upperVaporResistanceFactorAsString, !oldUpperVaporResistanceFactorAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpperVaporResistanceFactorAsString() {
		String oldUpperVaporResistanceFactorAsString = upperVaporResistanceFactorAsString;
		boolean oldUpperVaporResistanceFactorAsStringESet = upperVaporResistanceFactorAsStringESet;
		upperVaporResistanceFactorAsString = UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING_EDEFAULT;
		upperVaporResistanceFactorAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING, oldUpperVaporResistanceFactorAsString, UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING_EDEFAULT, oldUpperVaporResistanceFactorAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpperVaporResistanceFactorAsString() {
		return upperVaporResistanceFactorAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLowerVaporResistanceFactor() {
		return lowerVaporResistanceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerVaporResistanceFactor(double newLowerVaporResistanceFactor) {
		double oldLowerVaporResistanceFactor = lowerVaporResistanceFactor;
		lowerVaporResistanceFactor = newLowerVaporResistanceFactor;
		boolean oldLowerVaporResistanceFactorESet = lowerVaporResistanceFactorESet;
		lowerVaporResistanceFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR, oldLowerVaporResistanceFactor, lowerVaporResistanceFactor, !oldLowerVaporResistanceFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerVaporResistanceFactor() {
		double oldLowerVaporResistanceFactor = lowerVaporResistanceFactor;
		boolean oldLowerVaporResistanceFactorESet = lowerVaporResistanceFactorESet;
		lowerVaporResistanceFactor = LOWER_VAPOR_RESISTANCE_FACTOR_EDEFAULT;
		lowerVaporResistanceFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR, oldLowerVaporResistanceFactor, LOWER_VAPOR_RESISTANCE_FACTOR_EDEFAULT, oldLowerVaporResistanceFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerVaporResistanceFactor() {
		return lowerVaporResistanceFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerVaporResistanceFactorAsString() {
		return lowerVaporResistanceFactorAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerVaporResistanceFactorAsString(String newLowerVaporResistanceFactorAsString) {
		String oldLowerVaporResistanceFactorAsString = lowerVaporResistanceFactorAsString;
		lowerVaporResistanceFactorAsString = newLowerVaporResistanceFactorAsString;
		boolean oldLowerVaporResistanceFactorAsStringESet = lowerVaporResistanceFactorAsStringESet;
		lowerVaporResistanceFactorAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING, oldLowerVaporResistanceFactorAsString, lowerVaporResistanceFactorAsString, !oldLowerVaporResistanceFactorAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerVaporResistanceFactorAsString() {
		String oldLowerVaporResistanceFactorAsString = lowerVaporResistanceFactorAsString;
		boolean oldLowerVaporResistanceFactorAsStringESet = lowerVaporResistanceFactorAsStringESet;
		lowerVaporResistanceFactorAsString = LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING_EDEFAULT;
		lowerVaporResistanceFactorAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING, oldLowerVaporResistanceFactorAsString, LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING_EDEFAULT, oldLowerVaporResistanceFactorAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerVaporResistanceFactorAsString() {
		return lowerVaporResistanceFactorAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIsothermalMoistureCapacity() {
		return isothermalMoistureCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsothermalMoistureCapacity(double newIsothermalMoistureCapacity) {
		double oldIsothermalMoistureCapacity = isothermalMoistureCapacity;
		isothermalMoistureCapacity = newIsothermalMoistureCapacity;
		boolean oldIsothermalMoistureCapacityESet = isothermalMoistureCapacityESet;
		isothermalMoistureCapacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY, oldIsothermalMoistureCapacity, isothermalMoistureCapacity, !oldIsothermalMoistureCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsothermalMoistureCapacity() {
		double oldIsothermalMoistureCapacity = isothermalMoistureCapacity;
		boolean oldIsothermalMoistureCapacityESet = isothermalMoistureCapacityESet;
		isothermalMoistureCapacity = ISOTHERMAL_MOISTURE_CAPACITY_EDEFAULT;
		isothermalMoistureCapacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY, oldIsothermalMoistureCapacity, ISOTHERMAL_MOISTURE_CAPACITY_EDEFAULT, oldIsothermalMoistureCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsothermalMoistureCapacity() {
		return isothermalMoistureCapacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsothermalMoistureCapacityAsString() {
		return isothermalMoistureCapacityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsothermalMoistureCapacityAsString(String newIsothermalMoistureCapacityAsString) {
		String oldIsothermalMoistureCapacityAsString = isothermalMoistureCapacityAsString;
		isothermalMoistureCapacityAsString = newIsothermalMoistureCapacityAsString;
		boolean oldIsothermalMoistureCapacityAsStringESet = isothermalMoistureCapacityAsStringESet;
		isothermalMoistureCapacityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING, oldIsothermalMoistureCapacityAsString, isothermalMoistureCapacityAsString, !oldIsothermalMoistureCapacityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsothermalMoistureCapacityAsString() {
		String oldIsothermalMoistureCapacityAsString = isothermalMoistureCapacityAsString;
		boolean oldIsothermalMoistureCapacityAsStringESet = isothermalMoistureCapacityAsStringESet;
		isothermalMoistureCapacityAsString = ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING_EDEFAULT;
		isothermalMoistureCapacityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING, oldIsothermalMoistureCapacityAsString, ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING_EDEFAULT, oldIsothermalMoistureCapacityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsothermalMoistureCapacityAsString() {
		return isothermalMoistureCapacityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVaporPermeability() {
		return vaporPermeability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaporPermeability(double newVaporPermeability) {
		double oldVaporPermeability = vaporPermeability;
		vaporPermeability = newVaporPermeability;
		boolean oldVaporPermeabilityESet = vaporPermeabilityESet;
		vaporPermeabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY, oldVaporPermeability, vaporPermeability, !oldVaporPermeabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVaporPermeability() {
		double oldVaporPermeability = vaporPermeability;
		boolean oldVaporPermeabilityESet = vaporPermeabilityESet;
		vaporPermeability = VAPOR_PERMEABILITY_EDEFAULT;
		vaporPermeabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY, oldVaporPermeability, VAPOR_PERMEABILITY_EDEFAULT, oldVaporPermeabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVaporPermeability() {
		return vaporPermeabilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVaporPermeabilityAsString() {
		return vaporPermeabilityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaporPermeabilityAsString(String newVaporPermeabilityAsString) {
		String oldVaporPermeabilityAsString = vaporPermeabilityAsString;
		vaporPermeabilityAsString = newVaporPermeabilityAsString;
		boolean oldVaporPermeabilityAsStringESet = vaporPermeabilityAsStringESet;
		vaporPermeabilityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY_AS_STRING, oldVaporPermeabilityAsString, vaporPermeabilityAsString, !oldVaporPermeabilityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVaporPermeabilityAsString() {
		String oldVaporPermeabilityAsString = vaporPermeabilityAsString;
		boolean oldVaporPermeabilityAsStringESet = vaporPermeabilityAsStringESet;
		vaporPermeabilityAsString = VAPOR_PERMEABILITY_AS_STRING_EDEFAULT;
		vaporPermeabilityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY_AS_STRING, oldVaporPermeabilityAsString, VAPOR_PERMEABILITY_AS_STRING_EDEFAULT, oldVaporPermeabilityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVaporPermeabilityAsString() {
		return vaporPermeabilityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMoistureDiffusivity() {
		return moistureDiffusivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoistureDiffusivity(double newMoistureDiffusivity) {
		double oldMoistureDiffusivity = moistureDiffusivity;
		moistureDiffusivity = newMoistureDiffusivity;
		boolean oldMoistureDiffusivityESet = moistureDiffusivityESet;
		moistureDiffusivityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY, oldMoistureDiffusivity, moistureDiffusivity, !oldMoistureDiffusivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoistureDiffusivity() {
		double oldMoistureDiffusivity = moistureDiffusivity;
		boolean oldMoistureDiffusivityESet = moistureDiffusivityESet;
		moistureDiffusivity = MOISTURE_DIFFUSIVITY_EDEFAULT;
		moistureDiffusivityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY, oldMoistureDiffusivity, MOISTURE_DIFFUSIVITY_EDEFAULT, oldMoistureDiffusivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoistureDiffusivity() {
		return moistureDiffusivityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoistureDiffusivityAsString() {
		return moistureDiffusivityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoistureDiffusivityAsString(String newMoistureDiffusivityAsString) {
		String oldMoistureDiffusivityAsString = moistureDiffusivityAsString;
		moistureDiffusivityAsString = newMoistureDiffusivityAsString;
		boolean oldMoistureDiffusivityAsStringESet = moistureDiffusivityAsStringESet;
		moistureDiffusivityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY_AS_STRING, oldMoistureDiffusivityAsString, moistureDiffusivityAsString, !oldMoistureDiffusivityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoistureDiffusivityAsString() {
		String oldMoistureDiffusivityAsString = moistureDiffusivityAsString;
		boolean oldMoistureDiffusivityAsStringESet = moistureDiffusivityAsStringESet;
		moistureDiffusivityAsString = MOISTURE_DIFFUSIVITY_AS_STRING_EDEFAULT;
		moistureDiffusivityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY_AS_STRING, oldMoistureDiffusivityAsString, MOISTURE_DIFFUSIVITY_AS_STRING_EDEFAULT, oldMoistureDiffusivityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoistureDiffusivityAsString() {
		return moistureDiffusivityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR:
				return getUpperVaporResistanceFactor();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
				return getUpperVaporResistanceFactorAsString();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR:
				return getLowerVaporResistanceFactor();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
				return getLowerVaporResistanceFactorAsString();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY:
				return getIsothermalMoistureCapacity();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING:
				return getIsothermalMoistureCapacityAsString();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY:
				return getVaporPermeability();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY_AS_STRING:
				return getVaporPermeabilityAsString();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY:
				return getMoistureDiffusivity();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY_AS_STRING:
				return getMoistureDiffusivityAsString();
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
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR:
				setUpperVaporResistanceFactor((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
				setUpperVaporResistanceFactorAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR:
				setLowerVaporResistanceFactor((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
				setLowerVaporResistanceFactorAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY:
				setIsothermalMoistureCapacity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING:
				setIsothermalMoistureCapacityAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY:
				setVaporPermeability((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY_AS_STRING:
				setVaporPermeabilityAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY:
				setMoistureDiffusivity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY_AS_STRING:
				setMoistureDiffusivityAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR:
				unsetUpperVaporResistanceFactor();
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
				unsetUpperVaporResistanceFactorAsString();
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR:
				unsetLowerVaporResistanceFactor();
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
				unsetLowerVaporResistanceFactorAsString();
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY:
				unsetIsothermalMoistureCapacity();
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING:
				unsetIsothermalMoistureCapacityAsString();
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY:
				unsetVaporPermeability();
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY_AS_STRING:
				unsetVaporPermeabilityAsString();
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY:
				unsetMoistureDiffusivity();
				return;
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY_AS_STRING:
				unsetMoistureDiffusivityAsString();
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
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR:
				return isSetUpperVaporResistanceFactor();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
				return isSetUpperVaporResistanceFactorAsString();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR:
				return isSetLowerVaporResistanceFactor();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR_AS_STRING:
				return isSetLowerVaporResistanceFactorAsString();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY:
				return isSetIsothermalMoistureCapacity();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY_AS_STRING:
				return isSetIsothermalMoistureCapacityAsString();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY:
				return isSetVaporPermeability();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY_AS_STRING:
				return isSetVaporPermeabilityAsString();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY:
				return isSetMoistureDiffusivity();
			case Ifc2x3tc1Package.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY_AS_STRING:
				return isSetMoistureDiffusivityAsString();
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
		result.append(" (UpperVaporResistanceFactor: ");
		if (upperVaporResistanceFactorESet) result.append(upperVaporResistanceFactor); else result.append("<unset>");
		result.append(", UpperVaporResistanceFactorAsString: ");
		if (upperVaporResistanceFactorAsStringESet) result.append(upperVaporResistanceFactorAsString); else result.append("<unset>");
		result.append(", LowerVaporResistanceFactor: ");
		if (lowerVaporResistanceFactorESet) result.append(lowerVaporResistanceFactor); else result.append("<unset>");
		result.append(", LowerVaporResistanceFactorAsString: ");
		if (lowerVaporResistanceFactorAsStringESet) result.append(lowerVaporResistanceFactorAsString); else result.append("<unset>");
		result.append(", IsothermalMoistureCapacity: ");
		if (isothermalMoistureCapacityESet) result.append(isothermalMoistureCapacity); else result.append("<unset>");
		result.append(", IsothermalMoistureCapacityAsString: ");
		if (isothermalMoistureCapacityAsStringESet) result.append(isothermalMoistureCapacityAsString); else result.append("<unset>");
		result.append(", VaporPermeability: ");
		if (vaporPermeabilityESet) result.append(vaporPermeability); else result.append("<unset>");
		result.append(", VaporPermeabilityAsString: ");
		if (vaporPermeabilityAsStringESet) result.append(vaporPermeabilityAsString); else result.append("<unset>");
		result.append(", MoistureDiffusivity: ");
		if (moistureDiffusivityESet) result.append(moistureDiffusivity); else result.append("<unset>");
		result.append(", MoistureDiffusivityAsString: ");
		if (moistureDiffusivityAsStringESet) result.append(moistureDiffusivityAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcHygroscopicMaterialPropertiesImpl
