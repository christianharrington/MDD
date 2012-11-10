/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMechanicalMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getDynamicViscosity <em>Dynamic Viscosity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getDynamicViscosityAsString <em>Dynamic Viscosity As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getYoungModulus <em>Young Modulus</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getYoungModulusAsString <em>Young Modulus As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getShearModulus <em>Shear Modulus</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getShearModulusAsString <em>Shear Modulus As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getPoissonRatio <em>Poisson Ratio</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getPoissonRatioAsString <em>Poisson Ratio As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalMaterialPropertiesImpl#getThermalExpansionCoefficientAsString <em>Thermal Expansion Coefficient As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMechanicalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcMechanicalMaterialProperties {
	/**
	 * The default value of the '{@link #getDynamicViscosity() <em>Dynamic Viscosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicViscosity()
	 * @generated
	 * @ordered
	 */
	protected static final double DYNAMIC_VISCOSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDynamicViscosity() <em>Dynamic Viscosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicViscosity()
	 * @generated
	 * @ordered
	 */
	protected double dynamicViscosity = DYNAMIC_VISCOSITY_EDEFAULT;

	/**
	 * This is true if the Dynamic Viscosity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicViscosityESet;

	/**
	 * The default value of the '{@link #getDynamicViscosityAsString() <em>Dynamic Viscosity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicViscosityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DYNAMIC_VISCOSITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicViscosityAsString() <em>Dynamic Viscosity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicViscosityAsString()
	 * @generated
	 * @ordered
	 */
	protected String dynamicViscosityAsString = DYNAMIC_VISCOSITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Dynamic Viscosity As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicViscosityAsStringESet;

	/**
	 * The default value of the '{@link #getYoungModulus() <em>Young Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoungModulus()
	 * @generated
	 * @ordered
	 */
	protected static final double YOUNG_MODULUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYoungModulus() <em>Young Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoungModulus()
	 * @generated
	 * @ordered
	 */
	protected double youngModulus = YOUNG_MODULUS_EDEFAULT;

	/**
	 * This is true if the Young Modulus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean youngModulusESet;

	/**
	 * The default value of the '{@link #getYoungModulusAsString() <em>Young Modulus As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoungModulusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String YOUNG_MODULUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYoungModulusAsString() <em>Young Modulus As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoungModulusAsString()
	 * @generated
	 * @ordered
	 */
	protected String youngModulusAsString = YOUNG_MODULUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Young Modulus As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean youngModulusAsStringESet;

	/**
	 * The default value of the '{@link #getShearModulus() <em>Shear Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearModulus()
	 * @generated
	 * @ordered
	 */
	protected static final double SHEAR_MODULUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShearModulus() <em>Shear Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearModulus()
	 * @generated
	 * @ordered
	 */
	protected double shearModulus = SHEAR_MODULUS_EDEFAULT;

	/**
	 * This is true if the Shear Modulus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearModulusESet;

	/**
	 * The default value of the '{@link #getShearModulusAsString() <em>Shear Modulus As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearModulusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEAR_MODULUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearModulusAsString() <em>Shear Modulus As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearModulusAsString()
	 * @generated
	 * @ordered
	 */
	protected String shearModulusAsString = SHEAR_MODULUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Shear Modulus As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearModulusAsStringESet;

	/**
	 * The default value of the '{@link #getPoissonRatio() <em>Poisson Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoissonRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double POISSON_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPoissonRatio() <em>Poisson Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoissonRatio()
	 * @generated
	 * @ordered
	 */
	protected double poissonRatio = POISSON_RATIO_EDEFAULT;

	/**
	 * This is true if the Poisson Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean poissonRatioESet;

	/**
	 * The default value of the '{@link #getPoissonRatioAsString() <em>Poisson Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoissonRatioAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String POISSON_RATIO_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoissonRatioAsString() <em>Poisson Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoissonRatioAsString()
	 * @generated
	 * @ordered
	 */
	protected String poissonRatioAsString = POISSON_RATIO_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Poisson Ratio As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean poissonRatioAsStringESet;

	/**
	 * The default value of the '{@link #getThermalExpansionCoefficient() <em>Thermal Expansion Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final double THERMAL_EXPANSION_COEFFICIENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThermalExpansionCoefficient() <em>Thermal Expansion Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoefficient()
	 * @generated
	 * @ordered
	 */
	protected double thermalExpansionCoefficient = THERMAL_EXPANSION_COEFFICIENT_EDEFAULT;

	/**
	 * This is true if the Thermal Expansion Coefficient attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalExpansionCoefficientESet;

	/**
	 * The default value of the '{@link #getThermalExpansionCoefficientAsString() <em>Thermal Expansion Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoefficientAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMAL_EXPANSION_COEFFICIENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalExpansionCoefficientAsString() <em>Thermal Expansion Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoefficientAsString()
	 * @generated
	 * @ordered
	 */
	protected String thermalExpansionCoefficientAsString = THERMAL_EXPANSION_COEFFICIENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Thermal Expansion Coefficient As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalExpansionCoefficientAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDynamicViscosity() {
		return dynamicViscosity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicViscosity(double newDynamicViscosity) {
		double oldDynamicViscosity = dynamicViscosity;
		dynamicViscosity = newDynamicViscosity;
		boolean oldDynamicViscosityESet = dynamicViscosityESet;
		dynamicViscosityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY, oldDynamicViscosity, dynamicViscosity, !oldDynamicViscosityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDynamicViscosity() {
		double oldDynamicViscosity = dynamicViscosity;
		boolean oldDynamicViscosityESet = dynamicViscosityESet;
		dynamicViscosity = DYNAMIC_VISCOSITY_EDEFAULT;
		dynamicViscosityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY, oldDynamicViscosity, DYNAMIC_VISCOSITY_EDEFAULT, oldDynamicViscosityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDynamicViscosity() {
		return dynamicViscosityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDynamicViscosityAsString() {
		return dynamicViscosityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicViscosityAsString(String newDynamicViscosityAsString) {
		String oldDynamicViscosityAsString = dynamicViscosityAsString;
		dynamicViscosityAsString = newDynamicViscosityAsString;
		boolean oldDynamicViscosityAsStringESet = dynamicViscosityAsStringESet;
		dynamicViscosityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY_AS_STRING, oldDynamicViscosityAsString, dynamicViscosityAsString, !oldDynamicViscosityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDynamicViscosityAsString() {
		String oldDynamicViscosityAsString = dynamicViscosityAsString;
		boolean oldDynamicViscosityAsStringESet = dynamicViscosityAsStringESet;
		dynamicViscosityAsString = DYNAMIC_VISCOSITY_AS_STRING_EDEFAULT;
		dynamicViscosityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY_AS_STRING, oldDynamicViscosityAsString, DYNAMIC_VISCOSITY_AS_STRING_EDEFAULT, oldDynamicViscosityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDynamicViscosityAsString() {
		return dynamicViscosityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYoungModulus() {
		return youngModulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoungModulus(double newYoungModulus) {
		double oldYoungModulus = youngModulus;
		youngModulus = newYoungModulus;
		boolean oldYoungModulusESet = youngModulusESet;
		youngModulusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS, oldYoungModulus, youngModulus, !oldYoungModulusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYoungModulus() {
		double oldYoungModulus = youngModulus;
		boolean oldYoungModulusESet = youngModulusESet;
		youngModulus = YOUNG_MODULUS_EDEFAULT;
		youngModulusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS, oldYoungModulus, YOUNG_MODULUS_EDEFAULT, oldYoungModulusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYoungModulus() {
		return youngModulusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYoungModulusAsString() {
		return youngModulusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoungModulusAsString(String newYoungModulusAsString) {
		String oldYoungModulusAsString = youngModulusAsString;
		youngModulusAsString = newYoungModulusAsString;
		boolean oldYoungModulusAsStringESet = youngModulusAsStringESet;
		youngModulusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS_AS_STRING, oldYoungModulusAsString, youngModulusAsString, !oldYoungModulusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYoungModulusAsString() {
		String oldYoungModulusAsString = youngModulusAsString;
		boolean oldYoungModulusAsStringESet = youngModulusAsStringESet;
		youngModulusAsString = YOUNG_MODULUS_AS_STRING_EDEFAULT;
		youngModulusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS_AS_STRING, oldYoungModulusAsString, YOUNG_MODULUS_AS_STRING_EDEFAULT, oldYoungModulusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYoungModulusAsString() {
		return youngModulusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShearModulus() {
		return shearModulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearModulus(double newShearModulus) {
		double oldShearModulus = shearModulus;
		shearModulus = newShearModulus;
		boolean oldShearModulusESet = shearModulusESet;
		shearModulusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS, oldShearModulus, shearModulus, !oldShearModulusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearModulus() {
		double oldShearModulus = shearModulus;
		boolean oldShearModulusESet = shearModulusESet;
		shearModulus = SHEAR_MODULUS_EDEFAULT;
		shearModulusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS, oldShearModulus, SHEAR_MODULUS_EDEFAULT, oldShearModulusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearModulus() {
		return shearModulusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShearModulusAsString() {
		return shearModulusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearModulusAsString(String newShearModulusAsString) {
		String oldShearModulusAsString = shearModulusAsString;
		shearModulusAsString = newShearModulusAsString;
		boolean oldShearModulusAsStringESet = shearModulusAsStringESet;
		shearModulusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS_AS_STRING, oldShearModulusAsString, shearModulusAsString, !oldShearModulusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearModulusAsString() {
		String oldShearModulusAsString = shearModulusAsString;
		boolean oldShearModulusAsStringESet = shearModulusAsStringESet;
		shearModulusAsString = SHEAR_MODULUS_AS_STRING_EDEFAULT;
		shearModulusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS_AS_STRING, oldShearModulusAsString, SHEAR_MODULUS_AS_STRING_EDEFAULT, oldShearModulusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearModulusAsString() {
		return shearModulusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPoissonRatio() {
		return poissonRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoissonRatio(double newPoissonRatio) {
		double oldPoissonRatio = poissonRatio;
		poissonRatio = newPoissonRatio;
		boolean oldPoissonRatioESet = poissonRatioESet;
		poissonRatioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO, oldPoissonRatio, poissonRatio, !oldPoissonRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPoissonRatio() {
		double oldPoissonRatio = poissonRatio;
		boolean oldPoissonRatioESet = poissonRatioESet;
		poissonRatio = POISSON_RATIO_EDEFAULT;
		poissonRatioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO, oldPoissonRatio, POISSON_RATIO_EDEFAULT, oldPoissonRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPoissonRatio() {
		return poissonRatioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPoissonRatioAsString() {
		return poissonRatioAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoissonRatioAsString(String newPoissonRatioAsString) {
		String oldPoissonRatioAsString = poissonRatioAsString;
		poissonRatioAsString = newPoissonRatioAsString;
		boolean oldPoissonRatioAsStringESet = poissonRatioAsStringESet;
		poissonRatioAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO_AS_STRING, oldPoissonRatioAsString, poissonRatioAsString, !oldPoissonRatioAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPoissonRatioAsString() {
		String oldPoissonRatioAsString = poissonRatioAsString;
		boolean oldPoissonRatioAsStringESet = poissonRatioAsStringESet;
		poissonRatioAsString = POISSON_RATIO_AS_STRING_EDEFAULT;
		poissonRatioAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO_AS_STRING, oldPoissonRatioAsString, POISSON_RATIO_AS_STRING_EDEFAULT, oldPoissonRatioAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPoissonRatioAsString() {
		return poissonRatioAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThermalExpansionCoefficient() {
		return thermalExpansionCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalExpansionCoefficient(double newThermalExpansionCoefficient) {
		double oldThermalExpansionCoefficient = thermalExpansionCoefficient;
		thermalExpansionCoefficient = newThermalExpansionCoefficient;
		boolean oldThermalExpansionCoefficientESet = thermalExpansionCoefficientESet;
		thermalExpansionCoefficientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT, oldThermalExpansionCoefficient, thermalExpansionCoefficient, !oldThermalExpansionCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalExpansionCoefficient() {
		double oldThermalExpansionCoefficient = thermalExpansionCoefficient;
		boolean oldThermalExpansionCoefficientESet = thermalExpansionCoefficientESet;
		thermalExpansionCoefficient = THERMAL_EXPANSION_COEFFICIENT_EDEFAULT;
		thermalExpansionCoefficientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT, oldThermalExpansionCoefficient, THERMAL_EXPANSION_COEFFICIENT_EDEFAULT, oldThermalExpansionCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalExpansionCoefficient() {
		return thermalExpansionCoefficientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermalExpansionCoefficientAsString() {
		return thermalExpansionCoefficientAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalExpansionCoefficientAsString(String newThermalExpansionCoefficientAsString) {
		String oldThermalExpansionCoefficientAsString = thermalExpansionCoefficientAsString;
		thermalExpansionCoefficientAsString = newThermalExpansionCoefficientAsString;
		boolean oldThermalExpansionCoefficientAsStringESet = thermalExpansionCoefficientAsStringESet;
		thermalExpansionCoefficientAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT_AS_STRING, oldThermalExpansionCoefficientAsString, thermalExpansionCoefficientAsString, !oldThermalExpansionCoefficientAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalExpansionCoefficientAsString() {
		String oldThermalExpansionCoefficientAsString = thermalExpansionCoefficientAsString;
		boolean oldThermalExpansionCoefficientAsStringESet = thermalExpansionCoefficientAsStringESet;
		thermalExpansionCoefficientAsString = THERMAL_EXPANSION_COEFFICIENT_AS_STRING_EDEFAULT;
		thermalExpansionCoefficientAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT_AS_STRING, oldThermalExpansionCoefficientAsString, THERMAL_EXPANSION_COEFFICIENT_AS_STRING_EDEFAULT, oldThermalExpansionCoefficientAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalExpansionCoefficientAsString() {
		return thermalExpansionCoefficientAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY:
				return getDynamicViscosity();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY_AS_STRING:
				return getDynamicViscosityAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS:
				return getYoungModulus();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS_AS_STRING:
				return getYoungModulusAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS:
				return getShearModulus();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS_AS_STRING:
				return getShearModulusAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO:
				return getPoissonRatio();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO_AS_STRING:
				return getPoissonRatioAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT:
				return getThermalExpansionCoefficient();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT_AS_STRING:
				return getThermalExpansionCoefficientAsString();
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY:
				setDynamicViscosity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY_AS_STRING:
				setDynamicViscosityAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS:
				setYoungModulus((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS_AS_STRING:
				setYoungModulusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS:
				setShearModulus((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS_AS_STRING:
				setShearModulusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO:
				setPoissonRatio((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO_AS_STRING:
				setPoissonRatioAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT:
				setThermalExpansionCoefficient((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT_AS_STRING:
				setThermalExpansionCoefficientAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY:
				unsetDynamicViscosity();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY_AS_STRING:
				unsetDynamicViscosityAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS:
				unsetYoungModulus();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS_AS_STRING:
				unsetYoungModulusAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS:
				unsetShearModulus();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS_AS_STRING:
				unsetShearModulusAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO:
				unsetPoissonRatio();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO_AS_STRING:
				unsetPoissonRatioAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT:
				unsetThermalExpansionCoefficient();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT_AS_STRING:
				unsetThermalExpansionCoefficientAsString();
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY:
				return isSetDynamicViscosity();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY_AS_STRING:
				return isSetDynamicViscosityAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS:
				return isSetYoungModulus();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS_AS_STRING:
				return isSetYoungModulusAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS:
				return isSetShearModulus();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS_AS_STRING:
				return isSetShearModulusAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO:
				return isSetPoissonRatio();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO_AS_STRING:
				return isSetPoissonRatioAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT:
				return isSetThermalExpansionCoefficient();
			case Ifc2x3tc1Package.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT_AS_STRING:
				return isSetThermalExpansionCoefficientAsString();
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
		result.append(" (DynamicViscosity: ");
		if (dynamicViscosityESet) result.append(dynamicViscosity); else result.append("<unset>");
		result.append(", DynamicViscosityAsString: ");
		if (dynamicViscosityAsStringESet) result.append(dynamicViscosityAsString); else result.append("<unset>");
		result.append(", YoungModulus: ");
		if (youngModulusESet) result.append(youngModulus); else result.append("<unset>");
		result.append(", YoungModulusAsString: ");
		if (youngModulusAsStringESet) result.append(youngModulusAsString); else result.append("<unset>");
		result.append(", ShearModulus: ");
		if (shearModulusESet) result.append(shearModulus); else result.append("<unset>");
		result.append(", ShearModulusAsString: ");
		if (shearModulusAsStringESet) result.append(shearModulusAsString); else result.append("<unset>");
		result.append(", PoissonRatio: ");
		if (poissonRatioESet) result.append(poissonRatio); else result.append("<unset>");
		result.append(", PoissonRatioAsString: ");
		if (poissonRatioAsStringESet) result.append(poissonRatioAsString); else result.append("<unset>");
		result.append(", ThermalExpansionCoefficient: ");
		if (thermalExpansionCoefficientESet) result.append(thermalExpansionCoefficient); else result.append("<unset>");
		result.append(", ThermalExpansionCoefficientAsString: ");
		if (thermalExpansionCoefficientAsStringESet) result.append(thermalExpansionCoefficientAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcMechanicalMaterialPropertiesImpl
