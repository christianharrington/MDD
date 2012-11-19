/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalMaterialProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Thermal Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcThermalMaterialPropertiesImpl#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcThermalMaterialPropertiesImpl#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcThermalMaterialPropertiesImpl#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcThermalMaterialPropertiesImpl#getThermalConductivity <em>Thermal Conductivity</em>}</li>
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
	protected static final Double SPECIFIC_HEAT_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificHeatCapacity() <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 * @ordered
	 */
	protected Double specificHeatCapacity = SPECIFIC_HEAT_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoilingPoint() <em>Boiling Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilingPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Double BOILING_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoilingPoint() <em>Boiling Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoilingPoint()
	 * @generated
	 * @ordered
	 */
	protected Double boilingPoint = BOILING_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreezingPoint() <em>Freezing Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreezingPoint()
	 * @generated
	 * @ordered
	 */
	protected static final Double FREEZING_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreezingPoint() <em>Freezing Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreezingPoint()
	 * @generated
	 * @ordered
	 */
	protected Double freezingPoint = FREEZING_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermalConductivity() <em>Thermal Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity()
	 * @generated
	 * @ordered
	 */
	protected static final Double THERMAL_CONDUCTIVITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalConductivity() <em>Thermal Conductivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalConductivity()
	 * @generated
	 * @ordered
	 */
	protected Double thermalConductivity = THERMAL_CONDUCTIVITY_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcThermalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSpecificHeatCapacity() {
		return specificHeatCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificHeatCapacity(Double newSpecificHeatCapacity) {
		Double oldSpecificHeatCapacity = specificHeatCapacity;
		specificHeatCapacity = newSpecificHeatCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY, oldSpecificHeatCapacity, specificHeatCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBoilingPoint() {
		return boilingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoilingPoint(Double newBoilingPoint) {
		Double oldBoilingPoint = boilingPoint;
		boilingPoint = newBoilingPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT, oldBoilingPoint, boilingPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFreezingPoint() {
		return freezingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreezingPoint(Double newFreezingPoint) {
		Double oldFreezingPoint = freezingPoint;
		freezingPoint = newFreezingPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT, oldFreezingPoint, freezingPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalConductivity() {
		return thermalConductivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalConductivity(Double newThermalConductivity) {
		Double oldThermalConductivity = thermalConductivity;
		thermalConductivity = newThermalConductivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY, oldThermalConductivity, thermalConductivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				return getSpecificHeatCapacity();
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT:
				return getBoilingPoint();
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT:
				return getFreezingPoint();
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY:
				return getThermalConductivity();
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
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				setSpecificHeatCapacity((Double)newValue);
				return;
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT:
				setBoilingPoint((Double)newValue);
				return;
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT:
				setFreezingPoint((Double)newValue);
				return;
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY:
				setThermalConductivity((Double)newValue);
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
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				setSpecificHeatCapacity(SPECIFIC_HEAT_CAPACITY_EDEFAULT);
				return;
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT:
				setBoilingPoint(BOILING_POINT_EDEFAULT);
				return;
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT:
				setFreezingPoint(FREEZING_POINT_EDEFAULT);
				return;
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY:
				setThermalConductivity(THERMAL_CONDUCTIVITY_EDEFAULT);
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
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				return SPECIFIC_HEAT_CAPACITY_EDEFAULT == null ? specificHeatCapacity != null : !SPECIFIC_HEAT_CAPACITY_EDEFAULT.equals(specificHeatCapacity);
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__BOILING_POINT:
				return BOILING_POINT_EDEFAULT == null ? boilingPoint != null : !BOILING_POINT_EDEFAULT.equals(boilingPoint);
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__FREEZING_POINT:
				return FREEZING_POINT_EDEFAULT == null ? freezingPoint != null : !FREEZING_POINT_EDEFAULT.equals(freezingPoint);
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES__THERMAL_CONDUCTIVITY:
				return THERMAL_CONDUCTIVITY_EDEFAULT == null ? thermalConductivity != null : !THERMAL_CONDUCTIVITY_EDEFAULT.equals(thermalConductivity);
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
		result.append(" (specificHeatCapacity: ");
		result.append(specificHeatCapacity);
		result.append(", boilingPoint: ");
		result.append(boilingPoint);
		result.append(", freezingPoint: ");
		result.append(freezingPoint);
		result.append(", thermalConductivity: ");
		result.append(thermalConductivity);
		result.append(')');
		return result.toString();
	}

} //IfcThermalMaterialPropertiesImpl
