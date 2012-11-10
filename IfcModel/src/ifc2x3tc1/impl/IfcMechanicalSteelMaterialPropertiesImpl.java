/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMechanicalSteelMaterialProperties;
import ifc2x3tc1.IfcRelaxation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Steel Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getYieldStress <em>Yield Stress</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getYieldStressAsString <em>Yield Stress As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getUltimateStress <em>Ultimate Stress</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getUltimateStressAsString <em>Ultimate Stress As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getUltimateStrain <em>Ultimate Strain</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getUltimateStrainAsString <em>Ultimate Strain As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getHardeningModule <em>Hardening Module</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getHardeningModuleAsString <em>Hardening Module As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getProportionalStress <em>Proportional Stress</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getProportionalStressAsString <em>Proportional Stress As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getPlasticStrain <em>Plastic Strain</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getPlasticStrainAsString <em>Plastic Strain As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalSteelMaterialPropertiesImpl#getRelaxations <em>Relaxations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMechanicalSteelMaterialPropertiesImpl extends IfcMechanicalMaterialPropertiesImpl implements IfcMechanicalSteelMaterialProperties {
	/**
	 * The default value of the '{@link #getYieldStress() <em>Yield Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldStress()
	 * @generated
	 * @ordered
	 */
	protected static final double YIELD_STRESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYieldStress() <em>Yield Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldStress()
	 * @generated
	 * @ordered
	 */
	protected double yieldStress = YIELD_STRESS_EDEFAULT;

	/**
	 * This is true if the Yield Stress attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yieldStressESet;

	/**
	 * The default value of the '{@link #getYieldStressAsString() <em>Yield Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldStressAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String YIELD_STRESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYieldStressAsString() <em>Yield Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldStressAsString()
	 * @generated
	 * @ordered
	 */
	protected String yieldStressAsString = YIELD_STRESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Yield Stress As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean yieldStressAsStringESet;

	/**
	 * The default value of the '{@link #getUltimateStress() <em>Ultimate Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStress()
	 * @generated
	 * @ordered
	 */
	protected static final double ULTIMATE_STRESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUltimateStress() <em>Ultimate Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStress()
	 * @generated
	 * @ordered
	 */
	protected double ultimateStress = ULTIMATE_STRESS_EDEFAULT;

	/**
	 * This is true if the Ultimate Stress attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ultimateStressESet;

	/**
	 * The default value of the '{@link #getUltimateStressAsString() <em>Ultimate Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStressAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ULTIMATE_STRESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUltimateStressAsString() <em>Ultimate Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStressAsString()
	 * @generated
	 * @ordered
	 */
	protected String ultimateStressAsString = ULTIMATE_STRESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Ultimate Stress As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ultimateStressAsStringESet;

	/**
	 * The default value of the '{@link #getUltimateStrain() <em>Ultimate Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStrain()
	 * @generated
	 * @ordered
	 */
	protected static final double ULTIMATE_STRAIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUltimateStrain() <em>Ultimate Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStrain()
	 * @generated
	 * @ordered
	 */
	protected double ultimateStrain = ULTIMATE_STRAIN_EDEFAULT;

	/**
	 * This is true if the Ultimate Strain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ultimateStrainESet;

	/**
	 * The default value of the '{@link #getUltimateStrainAsString() <em>Ultimate Strain As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStrainAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ULTIMATE_STRAIN_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUltimateStrainAsString() <em>Ultimate Strain As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStrainAsString()
	 * @generated
	 * @ordered
	 */
	protected String ultimateStrainAsString = ULTIMATE_STRAIN_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Ultimate Strain As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ultimateStrainAsStringESet;

	/**
	 * The default value of the '{@link #getHardeningModule() <em>Hardening Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardeningModule()
	 * @generated
	 * @ordered
	 */
	protected static final double HARDENING_MODULE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHardeningModule() <em>Hardening Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardeningModule()
	 * @generated
	 * @ordered
	 */
	protected double hardeningModule = HARDENING_MODULE_EDEFAULT;

	/**
	 * This is true if the Hardening Module attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hardeningModuleESet;

	/**
	 * The default value of the '{@link #getHardeningModuleAsString() <em>Hardening Module As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardeningModuleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDENING_MODULE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardeningModuleAsString() <em>Hardening Module As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardeningModuleAsString()
	 * @generated
	 * @ordered
	 */
	protected String hardeningModuleAsString = HARDENING_MODULE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Hardening Module As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hardeningModuleAsStringESet;

	/**
	 * The default value of the '{@link #getProportionalStress() <em>Proportional Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProportionalStress()
	 * @generated
	 * @ordered
	 */
	protected static final double PROPORTIONAL_STRESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProportionalStress() <em>Proportional Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProportionalStress()
	 * @generated
	 * @ordered
	 */
	protected double proportionalStress = PROPORTIONAL_STRESS_EDEFAULT;

	/**
	 * This is true if the Proportional Stress attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean proportionalStressESet;

	/**
	 * The default value of the '{@link #getProportionalStressAsString() <em>Proportional Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProportionalStressAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPORTIONAL_STRESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProportionalStressAsString() <em>Proportional Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProportionalStressAsString()
	 * @generated
	 * @ordered
	 */
	protected String proportionalStressAsString = PROPORTIONAL_STRESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Proportional Stress As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean proportionalStressAsStringESet;

	/**
	 * The default value of the '{@link #getPlasticStrain() <em>Plastic Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticStrain()
	 * @generated
	 * @ordered
	 */
	protected static final double PLASTIC_STRAIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPlasticStrain() <em>Plastic Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticStrain()
	 * @generated
	 * @ordered
	 */
	protected double plasticStrain = PLASTIC_STRAIN_EDEFAULT;

	/**
	 * This is true if the Plastic Strain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plasticStrainESet;

	/**
	 * The default value of the '{@link #getPlasticStrainAsString() <em>Plastic Strain As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticStrainAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PLASTIC_STRAIN_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlasticStrainAsString() <em>Plastic Strain As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticStrainAsString()
	 * @generated
	 * @ordered
	 */
	protected String plasticStrainAsString = PLASTIC_STRAIN_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Plastic Strain As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plasticStrainAsStringESet;

	/**
	 * The cached value of the '{@link #getRelaxations() <em>Relaxations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaxations()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelaxation> relaxations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalSteelMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalSteelMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYieldStress() {
		return yieldStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYieldStress(double newYieldStress) {
		double oldYieldStress = yieldStress;
		yieldStress = newYieldStress;
		boolean oldYieldStressESet = yieldStressESet;
		yieldStressESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS, oldYieldStress, yieldStress, !oldYieldStressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYieldStress() {
		double oldYieldStress = yieldStress;
		boolean oldYieldStressESet = yieldStressESet;
		yieldStress = YIELD_STRESS_EDEFAULT;
		yieldStressESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS, oldYieldStress, YIELD_STRESS_EDEFAULT, oldYieldStressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYieldStress() {
		return yieldStressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYieldStressAsString() {
		return yieldStressAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYieldStressAsString(String newYieldStressAsString) {
		String oldYieldStressAsString = yieldStressAsString;
		yieldStressAsString = newYieldStressAsString;
		boolean oldYieldStressAsStringESet = yieldStressAsStringESet;
		yieldStressAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS_AS_STRING, oldYieldStressAsString, yieldStressAsString, !oldYieldStressAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetYieldStressAsString() {
		String oldYieldStressAsString = yieldStressAsString;
		boolean oldYieldStressAsStringESet = yieldStressAsStringESet;
		yieldStressAsString = YIELD_STRESS_AS_STRING_EDEFAULT;
		yieldStressAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS_AS_STRING, oldYieldStressAsString, YIELD_STRESS_AS_STRING_EDEFAULT, oldYieldStressAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetYieldStressAsString() {
		return yieldStressAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUltimateStress() {
		return ultimateStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimateStress(double newUltimateStress) {
		double oldUltimateStress = ultimateStress;
		ultimateStress = newUltimateStress;
		boolean oldUltimateStressESet = ultimateStressESet;
		ultimateStressESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS, oldUltimateStress, ultimateStress, !oldUltimateStressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUltimateStress() {
		double oldUltimateStress = ultimateStress;
		boolean oldUltimateStressESet = ultimateStressESet;
		ultimateStress = ULTIMATE_STRESS_EDEFAULT;
		ultimateStressESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS, oldUltimateStress, ULTIMATE_STRESS_EDEFAULT, oldUltimateStressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUltimateStress() {
		return ultimateStressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUltimateStressAsString() {
		return ultimateStressAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimateStressAsString(String newUltimateStressAsString) {
		String oldUltimateStressAsString = ultimateStressAsString;
		ultimateStressAsString = newUltimateStressAsString;
		boolean oldUltimateStressAsStringESet = ultimateStressAsStringESet;
		ultimateStressAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS_AS_STRING, oldUltimateStressAsString, ultimateStressAsString, !oldUltimateStressAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUltimateStressAsString() {
		String oldUltimateStressAsString = ultimateStressAsString;
		boolean oldUltimateStressAsStringESet = ultimateStressAsStringESet;
		ultimateStressAsString = ULTIMATE_STRESS_AS_STRING_EDEFAULT;
		ultimateStressAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS_AS_STRING, oldUltimateStressAsString, ULTIMATE_STRESS_AS_STRING_EDEFAULT, oldUltimateStressAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUltimateStressAsString() {
		return ultimateStressAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUltimateStrain() {
		return ultimateStrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimateStrain(double newUltimateStrain) {
		double oldUltimateStrain = ultimateStrain;
		ultimateStrain = newUltimateStrain;
		boolean oldUltimateStrainESet = ultimateStrainESet;
		ultimateStrainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN, oldUltimateStrain, ultimateStrain, !oldUltimateStrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUltimateStrain() {
		double oldUltimateStrain = ultimateStrain;
		boolean oldUltimateStrainESet = ultimateStrainESet;
		ultimateStrain = ULTIMATE_STRAIN_EDEFAULT;
		ultimateStrainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN, oldUltimateStrain, ULTIMATE_STRAIN_EDEFAULT, oldUltimateStrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUltimateStrain() {
		return ultimateStrainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUltimateStrainAsString() {
		return ultimateStrainAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimateStrainAsString(String newUltimateStrainAsString) {
		String oldUltimateStrainAsString = ultimateStrainAsString;
		ultimateStrainAsString = newUltimateStrainAsString;
		boolean oldUltimateStrainAsStringESet = ultimateStrainAsStringESet;
		ultimateStrainAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN_AS_STRING, oldUltimateStrainAsString, ultimateStrainAsString, !oldUltimateStrainAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUltimateStrainAsString() {
		String oldUltimateStrainAsString = ultimateStrainAsString;
		boolean oldUltimateStrainAsStringESet = ultimateStrainAsStringESet;
		ultimateStrainAsString = ULTIMATE_STRAIN_AS_STRING_EDEFAULT;
		ultimateStrainAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN_AS_STRING, oldUltimateStrainAsString, ULTIMATE_STRAIN_AS_STRING_EDEFAULT, oldUltimateStrainAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUltimateStrainAsString() {
		return ultimateStrainAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHardeningModule() {
		return hardeningModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardeningModule(double newHardeningModule) {
		double oldHardeningModule = hardeningModule;
		hardeningModule = newHardeningModule;
		boolean oldHardeningModuleESet = hardeningModuleESet;
		hardeningModuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE, oldHardeningModule, hardeningModule, !oldHardeningModuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHardeningModule() {
		double oldHardeningModule = hardeningModule;
		boolean oldHardeningModuleESet = hardeningModuleESet;
		hardeningModule = HARDENING_MODULE_EDEFAULT;
		hardeningModuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE, oldHardeningModule, HARDENING_MODULE_EDEFAULT, oldHardeningModuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHardeningModule() {
		return hardeningModuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardeningModuleAsString() {
		return hardeningModuleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardeningModuleAsString(String newHardeningModuleAsString) {
		String oldHardeningModuleAsString = hardeningModuleAsString;
		hardeningModuleAsString = newHardeningModuleAsString;
		boolean oldHardeningModuleAsStringESet = hardeningModuleAsStringESet;
		hardeningModuleAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE_AS_STRING, oldHardeningModuleAsString, hardeningModuleAsString, !oldHardeningModuleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHardeningModuleAsString() {
		String oldHardeningModuleAsString = hardeningModuleAsString;
		boolean oldHardeningModuleAsStringESet = hardeningModuleAsStringESet;
		hardeningModuleAsString = HARDENING_MODULE_AS_STRING_EDEFAULT;
		hardeningModuleAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE_AS_STRING, oldHardeningModuleAsString, HARDENING_MODULE_AS_STRING_EDEFAULT, oldHardeningModuleAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHardeningModuleAsString() {
		return hardeningModuleAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProportionalStress() {
		return proportionalStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProportionalStress(double newProportionalStress) {
		double oldProportionalStress = proportionalStress;
		proportionalStress = newProportionalStress;
		boolean oldProportionalStressESet = proportionalStressESet;
		proportionalStressESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS, oldProportionalStress, proportionalStress, !oldProportionalStressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProportionalStress() {
		double oldProportionalStress = proportionalStress;
		boolean oldProportionalStressESet = proportionalStressESet;
		proportionalStress = PROPORTIONAL_STRESS_EDEFAULT;
		proportionalStressESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS, oldProportionalStress, PROPORTIONAL_STRESS_EDEFAULT, oldProportionalStressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProportionalStress() {
		return proportionalStressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProportionalStressAsString() {
		return proportionalStressAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProportionalStressAsString(String newProportionalStressAsString) {
		String oldProportionalStressAsString = proportionalStressAsString;
		proportionalStressAsString = newProportionalStressAsString;
		boolean oldProportionalStressAsStringESet = proportionalStressAsStringESet;
		proportionalStressAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS_AS_STRING, oldProportionalStressAsString, proportionalStressAsString, !oldProportionalStressAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProportionalStressAsString() {
		String oldProportionalStressAsString = proportionalStressAsString;
		boolean oldProportionalStressAsStringESet = proportionalStressAsStringESet;
		proportionalStressAsString = PROPORTIONAL_STRESS_AS_STRING_EDEFAULT;
		proportionalStressAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS_AS_STRING, oldProportionalStressAsString, PROPORTIONAL_STRESS_AS_STRING_EDEFAULT, oldProportionalStressAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProportionalStressAsString() {
		return proportionalStressAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlasticStrain() {
		return plasticStrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticStrain(double newPlasticStrain) {
		double oldPlasticStrain = plasticStrain;
		plasticStrain = newPlasticStrain;
		boolean oldPlasticStrainESet = plasticStrainESet;
		plasticStrainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN, oldPlasticStrain, plasticStrain, !oldPlasticStrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlasticStrain() {
		double oldPlasticStrain = plasticStrain;
		boolean oldPlasticStrainESet = plasticStrainESet;
		plasticStrain = PLASTIC_STRAIN_EDEFAULT;
		plasticStrainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN, oldPlasticStrain, PLASTIC_STRAIN_EDEFAULT, oldPlasticStrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlasticStrain() {
		return plasticStrainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlasticStrainAsString() {
		return plasticStrainAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticStrainAsString(String newPlasticStrainAsString) {
		String oldPlasticStrainAsString = plasticStrainAsString;
		plasticStrainAsString = newPlasticStrainAsString;
		boolean oldPlasticStrainAsStringESet = plasticStrainAsStringESet;
		plasticStrainAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN_AS_STRING, oldPlasticStrainAsString, plasticStrainAsString, !oldPlasticStrainAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlasticStrainAsString() {
		String oldPlasticStrainAsString = plasticStrainAsString;
		boolean oldPlasticStrainAsStringESet = plasticStrainAsStringESet;
		plasticStrainAsString = PLASTIC_STRAIN_AS_STRING_EDEFAULT;
		plasticStrainAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN_AS_STRING, oldPlasticStrainAsString, PLASTIC_STRAIN_AS_STRING_EDEFAULT, oldPlasticStrainAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlasticStrainAsString() {
		return plasticStrainAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelaxation> getRelaxations() {
		if (relaxations == null) {
			relaxations = new EObjectResolvingEList.Unsettable<IfcRelaxation>(IfcRelaxation.class, this, Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS);
		}
		return relaxations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelaxations() {
		if (relaxations != null) ((InternalEList.Unsettable<?>)relaxations).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelaxations() {
		return relaxations != null && ((InternalEList.Unsettable<?>)relaxations).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS:
				return getYieldStress();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS_AS_STRING:
				return getYieldStressAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS:
				return getUltimateStress();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS_AS_STRING:
				return getUltimateStressAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN:
				return getUltimateStrain();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN_AS_STRING:
				return getUltimateStrainAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE:
				return getHardeningModule();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE_AS_STRING:
				return getHardeningModuleAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS:
				return getProportionalStress();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS_AS_STRING:
				return getProportionalStressAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN:
				return getPlasticStrain();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN_AS_STRING:
				return getPlasticStrainAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS:
				return getRelaxations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS:
				setYieldStress((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS_AS_STRING:
				setYieldStressAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS:
				setUltimateStress((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS_AS_STRING:
				setUltimateStressAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN:
				setUltimateStrain((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN_AS_STRING:
				setUltimateStrainAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE:
				setHardeningModule((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE_AS_STRING:
				setHardeningModuleAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS:
				setProportionalStress((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS_AS_STRING:
				setProportionalStressAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN:
				setPlasticStrain((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN_AS_STRING:
				setPlasticStrainAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS:
				getRelaxations().clear();
				getRelaxations().addAll((Collection<? extends IfcRelaxation>)newValue);
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS:
				unsetYieldStress();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS_AS_STRING:
				unsetYieldStressAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS:
				unsetUltimateStress();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS_AS_STRING:
				unsetUltimateStressAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN:
				unsetUltimateStrain();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN_AS_STRING:
				unsetUltimateStrainAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE:
				unsetHardeningModule();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE_AS_STRING:
				unsetHardeningModuleAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS:
				unsetProportionalStress();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS_AS_STRING:
				unsetProportionalStressAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN:
				unsetPlasticStrain();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN_AS_STRING:
				unsetPlasticStrainAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS:
				unsetRelaxations();
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS:
				return isSetYieldStress();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS_AS_STRING:
				return isSetYieldStressAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS:
				return isSetUltimateStress();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS_AS_STRING:
				return isSetUltimateStressAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN:
				return isSetUltimateStrain();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN_AS_STRING:
				return isSetUltimateStrainAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE:
				return isSetHardeningModule();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE_AS_STRING:
				return isSetHardeningModuleAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS:
				return isSetProportionalStress();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS_AS_STRING:
				return isSetProportionalStressAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN:
				return isSetPlasticStrain();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN_AS_STRING:
				return isSetPlasticStrainAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS:
				return isSetRelaxations();
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
		result.append(" (YieldStress: ");
		if (yieldStressESet) result.append(yieldStress); else result.append("<unset>");
		result.append(", YieldStressAsString: ");
		if (yieldStressAsStringESet) result.append(yieldStressAsString); else result.append("<unset>");
		result.append(", UltimateStress: ");
		if (ultimateStressESet) result.append(ultimateStress); else result.append("<unset>");
		result.append(", UltimateStressAsString: ");
		if (ultimateStressAsStringESet) result.append(ultimateStressAsString); else result.append("<unset>");
		result.append(", UltimateStrain: ");
		if (ultimateStrainESet) result.append(ultimateStrain); else result.append("<unset>");
		result.append(", UltimateStrainAsString: ");
		if (ultimateStrainAsStringESet) result.append(ultimateStrainAsString); else result.append("<unset>");
		result.append(", HardeningModule: ");
		if (hardeningModuleESet) result.append(hardeningModule); else result.append("<unset>");
		result.append(", HardeningModuleAsString: ");
		if (hardeningModuleAsStringESet) result.append(hardeningModuleAsString); else result.append("<unset>");
		result.append(", ProportionalStress: ");
		if (proportionalStressESet) result.append(proportionalStress); else result.append("<unset>");
		result.append(", ProportionalStressAsString: ");
		if (proportionalStressAsStringESet) result.append(proportionalStressAsString); else result.append("<unset>");
		result.append(", PlasticStrain: ");
		if (plasticStrainESet) result.append(plasticStrain); else result.append("<unset>");
		result.append(", PlasticStrainAsString: ");
		if (plasticStrainAsStringESet) result.append(plasticStrainAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcMechanicalSteelMaterialPropertiesImpl
