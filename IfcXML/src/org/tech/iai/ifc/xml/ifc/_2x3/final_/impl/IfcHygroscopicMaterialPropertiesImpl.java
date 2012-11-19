/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Hygroscopic Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcHygroscopicMaterialPropertiesImpl#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcHygroscopicMaterialPropertiesImpl#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcHygroscopicMaterialPropertiesImpl#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcHygroscopicMaterialPropertiesImpl#getVaporPermeability <em>Vapor Permeability</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcHygroscopicMaterialPropertiesImpl#getMoistureDiffusivity <em>Moisture Diffusivity</em>}</li>
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
	protected static final Double UPPER_VAPOR_RESISTANCE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperVaporResistanceFactor() <em>Upper Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperVaporResistanceFactor()
	 * @generated
	 * @ordered
	 */
	protected Double upperVaporResistanceFactor = UPPER_VAPOR_RESISTANCE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerVaporResistanceFactor() <em>Lower Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerVaporResistanceFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Double LOWER_VAPOR_RESISTANCE_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerVaporResistanceFactor() <em>Lower Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerVaporResistanceFactor()
	 * @generated
	 * @ordered
	 */
	protected Double lowerVaporResistanceFactor = LOWER_VAPOR_RESISTANCE_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsothermalMoistureCapacity() <em>Isothermal Moisture Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsothermalMoistureCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Double ISOTHERMAL_MOISTURE_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsothermalMoistureCapacity() <em>Isothermal Moisture Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsothermalMoistureCapacity()
	 * @generated
	 * @ordered
	 */
	protected Double isothermalMoistureCapacity = ISOTHERMAL_MOISTURE_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVaporPermeability() <em>Vapor Permeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaporPermeability()
	 * @generated
	 * @ordered
	 */
	protected static final Double VAPOR_PERMEABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVaporPermeability() <em>Vapor Permeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVaporPermeability()
	 * @generated
	 * @ordered
	 */
	protected Double vaporPermeability = VAPOR_PERMEABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoistureDiffusivity() <em>Moisture Diffusivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoistureDiffusivity()
	 * @generated
	 * @ordered
	 */
	protected static final Double MOISTURE_DIFFUSIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoistureDiffusivity() <em>Moisture Diffusivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoistureDiffusivity()
	 * @generated
	 * @ordered
	 */
	protected Double moistureDiffusivity = MOISTURE_DIFFUSIVITY_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcHygroscopicMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUpperVaporResistanceFactor() {
		return upperVaporResistanceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperVaporResistanceFactor(Double newUpperVaporResistanceFactor) {
		Double oldUpperVaporResistanceFactor = upperVaporResistanceFactor;
		upperVaporResistanceFactor = newUpperVaporResistanceFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR, oldUpperVaporResistanceFactor, upperVaporResistanceFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLowerVaporResistanceFactor() {
		return lowerVaporResistanceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerVaporResistanceFactor(Double newLowerVaporResistanceFactor) {
		Double oldLowerVaporResistanceFactor = lowerVaporResistanceFactor;
		lowerVaporResistanceFactor = newLowerVaporResistanceFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR, oldLowerVaporResistanceFactor, lowerVaporResistanceFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIsothermalMoistureCapacity() {
		return isothermalMoistureCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsothermalMoistureCapacity(Double newIsothermalMoistureCapacity) {
		Double oldIsothermalMoistureCapacity = isothermalMoistureCapacity;
		isothermalMoistureCapacity = newIsothermalMoistureCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY, oldIsothermalMoistureCapacity, isothermalMoistureCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVaporPermeability() {
		return vaporPermeability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVaporPermeability(Double newVaporPermeability) {
		Double oldVaporPermeability = vaporPermeability;
		vaporPermeability = newVaporPermeability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY, oldVaporPermeability, vaporPermeability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMoistureDiffusivity() {
		return moistureDiffusivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoistureDiffusivity(Double newMoistureDiffusivity) {
		Double oldMoistureDiffusivity = moistureDiffusivity;
		moistureDiffusivity = newMoistureDiffusivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY, oldMoistureDiffusivity, moistureDiffusivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR:
				return getUpperVaporResistanceFactor();
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR:
				return getLowerVaporResistanceFactor();
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY:
				return getIsothermalMoistureCapacity();
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY:
				return getVaporPermeability();
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY:
				return getMoistureDiffusivity();
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
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR:
				setUpperVaporResistanceFactor((Double)newValue);
				return;
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR:
				setLowerVaporResistanceFactor((Double)newValue);
				return;
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY:
				setIsothermalMoistureCapacity((Double)newValue);
				return;
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY:
				setVaporPermeability((Double)newValue);
				return;
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY:
				setMoistureDiffusivity((Double)newValue);
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
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR:
				setUpperVaporResistanceFactor(UPPER_VAPOR_RESISTANCE_FACTOR_EDEFAULT);
				return;
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR:
				setLowerVaporResistanceFactor(LOWER_VAPOR_RESISTANCE_FACTOR_EDEFAULT);
				return;
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY:
				setIsothermalMoistureCapacity(ISOTHERMAL_MOISTURE_CAPACITY_EDEFAULT);
				return;
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY:
				setVaporPermeability(VAPOR_PERMEABILITY_EDEFAULT);
				return;
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY:
				setMoistureDiffusivity(MOISTURE_DIFFUSIVITY_EDEFAULT);
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
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__UPPER_VAPOR_RESISTANCE_FACTOR:
				return UPPER_VAPOR_RESISTANCE_FACTOR_EDEFAULT == null ? upperVaporResistanceFactor != null : !UPPER_VAPOR_RESISTANCE_FACTOR_EDEFAULT.equals(upperVaporResistanceFactor);
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__LOWER_VAPOR_RESISTANCE_FACTOR:
				return LOWER_VAPOR_RESISTANCE_FACTOR_EDEFAULT == null ? lowerVaporResistanceFactor != null : !LOWER_VAPOR_RESISTANCE_FACTOR_EDEFAULT.equals(lowerVaporResistanceFactor);
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__ISOTHERMAL_MOISTURE_CAPACITY:
				return ISOTHERMAL_MOISTURE_CAPACITY_EDEFAULT == null ? isothermalMoistureCapacity != null : !ISOTHERMAL_MOISTURE_CAPACITY_EDEFAULT.equals(isothermalMoistureCapacity);
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__VAPOR_PERMEABILITY:
				return VAPOR_PERMEABILITY_EDEFAULT == null ? vaporPermeability != null : !VAPOR_PERMEABILITY_EDEFAULT.equals(vaporPermeability);
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES__MOISTURE_DIFFUSIVITY:
				return MOISTURE_DIFFUSIVITY_EDEFAULT == null ? moistureDiffusivity != null : !MOISTURE_DIFFUSIVITY_EDEFAULT.equals(moistureDiffusivity);
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
		result.append(" (upperVaporResistanceFactor: ");
		result.append(upperVaporResistanceFactor);
		result.append(", lowerVaporResistanceFactor: ");
		result.append(lowerVaporResistanceFactor);
		result.append(", isothermalMoistureCapacity: ");
		result.append(isothermalMoistureCapacity);
		result.append(", vaporPermeability: ");
		result.append(vaporPermeability);
		result.append(", moistureDiffusivity: ");
		result.append(moistureDiffusivity);
		result.append(')');
		return result.toString();
	}

} //IfcHygroscopicMaterialPropertiesImpl
