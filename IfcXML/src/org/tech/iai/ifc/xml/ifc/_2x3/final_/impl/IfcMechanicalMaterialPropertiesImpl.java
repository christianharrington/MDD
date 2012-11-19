/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalMaterialPropertiesImpl#getDynamicViscosity <em>Dynamic Viscosity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalMaterialPropertiesImpl#getYoungModulus <em>Young Modulus</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalMaterialPropertiesImpl#getShearModulus <em>Shear Modulus</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalMaterialPropertiesImpl#getPoissonRatio <em>Poisson Ratio</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalMaterialPropertiesImpl#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}</li>
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
	protected static final Double DYNAMIC_VISCOSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicViscosity() <em>Dynamic Viscosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicViscosity()
	 * @generated
	 * @ordered
	 */
	protected Double dynamicViscosity = DYNAMIC_VISCOSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getYoungModulus() <em>Young Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoungModulus()
	 * @generated
	 * @ordered
	 */
	protected static final Double YOUNG_MODULUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYoungModulus() <em>Young Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoungModulus()
	 * @generated
	 * @ordered
	 */
	protected Double youngModulus = YOUNG_MODULUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShearModulus() <em>Shear Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearModulus()
	 * @generated
	 * @ordered
	 */
	protected static final Double SHEAR_MODULUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearModulus() <em>Shear Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearModulus()
	 * @generated
	 * @ordered
	 */
	protected Double shearModulus = SHEAR_MODULUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoissonRatio() <em>Poisson Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoissonRatio()
	 * @generated
	 * @ordered
	 */
	protected static final Double POISSON_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoissonRatio() <em>Poisson Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoissonRatio()
	 * @generated
	 * @ordered
	 */
	protected Double poissonRatio = POISSON_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermalExpansionCoefficient() <em>Thermal Expansion Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final Double THERMAL_EXPANSION_COEFFICIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalExpansionCoefficient() <em>Thermal Expansion Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalExpansionCoefficient()
	 * @generated
	 * @ordered
	 */
	protected Double thermalExpansionCoefficient = THERMAL_EXPANSION_COEFFICIENT_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcMechanicalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDynamicViscosity() {
		return dynamicViscosity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicViscosity(Double newDynamicViscosity) {
		Double oldDynamicViscosity = dynamicViscosity;
		dynamicViscosity = newDynamicViscosity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY, oldDynamicViscosity, dynamicViscosity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYoungModulus() {
		return youngModulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoungModulus(Double newYoungModulus) {
		Double oldYoungModulus = youngModulus;
		youngModulus = newYoungModulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS, oldYoungModulus, youngModulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearModulus() {
		return shearModulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearModulus(Double newShearModulus) {
		Double oldShearModulus = shearModulus;
		shearModulus = newShearModulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS, oldShearModulus, shearModulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPoissonRatio() {
		return poissonRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoissonRatio(Double newPoissonRatio) {
		Double oldPoissonRatio = poissonRatio;
		poissonRatio = newPoissonRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO, oldPoissonRatio, poissonRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalExpansionCoefficient() {
		return thermalExpansionCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalExpansionCoefficient(Double newThermalExpansionCoefficient) {
		Double oldThermalExpansionCoefficient = thermalExpansionCoefficient;
		thermalExpansionCoefficient = newThermalExpansionCoefficient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT, oldThermalExpansionCoefficient, thermalExpansionCoefficient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY:
				return getDynamicViscosity();
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS:
				return getYoungModulus();
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS:
				return getShearModulus();
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO:
				return getPoissonRatio();
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT:
				return getThermalExpansionCoefficient();
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
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY:
				setDynamicViscosity((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS:
				setYoungModulus((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS:
				setShearModulus((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO:
				setPoissonRatio((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT:
				setThermalExpansionCoefficient((Double)newValue);
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
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY:
				setDynamicViscosity(DYNAMIC_VISCOSITY_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS:
				setYoungModulus(YOUNG_MODULUS_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS:
				setShearModulus(SHEAR_MODULUS_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO:
				setPoissonRatio(POISSON_RATIO_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT:
				setThermalExpansionCoefficient(THERMAL_EXPANSION_COEFFICIENT_EDEFAULT);
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
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__DYNAMIC_VISCOSITY:
				return DYNAMIC_VISCOSITY_EDEFAULT == null ? dynamicViscosity != null : !DYNAMIC_VISCOSITY_EDEFAULT.equals(dynamicViscosity);
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__YOUNG_MODULUS:
				return YOUNG_MODULUS_EDEFAULT == null ? youngModulus != null : !YOUNG_MODULUS_EDEFAULT.equals(youngModulus);
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__SHEAR_MODULUS:
				return SHEAR_MODULUS_EDEFAULT == null ? shearModulus != null : !SHEAR_MODULUS_EDEFAULT.equals(shearModulus);
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__POISSON_RATIO:
				return POISSON_RATIO_EDEFAULT == null ? poissonRatio != null : !POISSON_RATIO_EDEFAULT.equals(poissonRatio);
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES__THERMAL_EXPANSION_COEFFICIENT:
				return THERMAL_EXPANSION_COEFFICIENT_EDEFAULT == null ? thermalExpansionCoefficient != null : !THERMAL_EXPANSION_COEFFICIENT_EDEFAULT.equals(thermalExpansionCoefficient);
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
		result.append(" (dynamicViscosity: ");
		result.append(dynamicViscosity);
		result.append(", youngModulus: ");
		result.append(youngModulus);
		result.append(", shearModulus: ");
		result.append(shearModulus);
		result.append(", poissonRatio: ");
		result.append(poissonRatio);
		result.append(", thermalExpansionCoefficient: ");
		result.append(thermalExpansionCoefficient);
		result.append(')');
		return result.toString();
	}

} //IfcMechanicalMaterialPropertiesImpl
