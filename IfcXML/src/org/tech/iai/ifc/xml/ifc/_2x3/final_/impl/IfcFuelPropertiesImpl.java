/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFuelProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fuel Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFuelPropertiesImpl#getCombustionTemperature <em>Combustion Temperature</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFuelPropertiesImpl#getCarbonContent <em>Carbon Content</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFuelPropertiesImpl#getLowerHeatingValue <em>Lower Heating Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFuelPropertiesImpl#getHigherHeatingValue <em>Higher Heating Value</em>}</li>
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
	protected static final Double COMBUSTION_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCombustionTemperature() <em>Combustion Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombustionTemperature()
	 * @generated
	 * @ordered
	 */
	protected Double combustionTemperature = COMBUSTION_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarbonContent() <em>Carbon Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonContent()
	 * @generated
	 * @ordered
	 */
	protected static final Double CARBON_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarbonContent() <em>Carbon Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarbonContent()
	 * @generated
	 * @ordered
	 */
	protected Double carbonContent = CARBON_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerHeatingValue() <em>Lower Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerHeatingValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double LOWER_HEATING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerHeatingValue() <em>Lower Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerHeatingValue()
	 * @generated
	 * @ordered
	 */
	protected Double lowerHeatingValue = LOWER_HEATING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHigherHeatingValue() <em>Higher Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherHeatingValue()
	 * @generated
	 * @ordered
	 */
	protected static final Double HIGHER_HEATING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHigherHeatingValue() <em>Higher Heating Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherHeatingValue()
	 * @generated
	 * @ordered
	 */
	protected Double higherHeatingValue = HIGHER_HEATING_VALUE_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcFuelProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCombustionTemperature() {
		return combustionTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCombustionTemperature(Double newCombustionTemperature) {
		Double oldCombustionTemperature = combustionTemperature;
		combustionTemperature = newCombustionTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE, oldCombustionTemperature, combustionTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCarbonContent() {
		return carbonContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarbonContent(Double newCarbonContent) {
		Double oldCarbonContent = carbonContent;
		carbonContent = newCarbonContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FUEL_PROPERTIES__CARBON_CONTENT, oldCarbonContent, carbonContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLowerHeatingValue() {
		return lowerHeatingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerHeatingValue(Double newLowerHeatingValue) {
		Double oldLowerHeatingValue = lowerHeatingValue;
		lowerHeatingValue = newLowerHeatingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE, oldLowerHeatingValue, lowerHeatingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHigherHeatingValue() {
		return higherHeatingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigherHeatingValue(Double newHigherHeatingValue) {
		Double oldHigherHeatingValue = higherHeatingValue;
		higherHeatingValue = newHigherHeatingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE, oldHigherHeatingValue, higherHeatingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE:
				return getCombustionTemperature();
			case FinalPackage.IFC_FUEL_PROPERTIES__CARBON_CONTENT:
				return getCarbonContent();
			case FinalPackage.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE:
				return getLowerHeatingValue();
			case FinalPackage.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE:
				return getHigherHeatingValue();
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
			case FinalPackage.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE:
				setCombustionTemperature((Double)newValue);
				return;
			case FinalPackage.IFC_FUEL_PROPERTIES__CARBON_CONTENT:
				setCarbonContent((Double)newValue);
				return;
			case FinalPackage.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE:
				setLowerHeatingValue((Double)newValue);
				return;
			case FinalPackage.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE:
				setHigherHeatingValue((Double)newValue);
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
			case FinalPackage.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE:
				setCombustionTemperature(COMBUSTION_TEMPERATURE_EDEFAULT);
				return;
			case FinalPackage.IFC_FUEL_PROPERTIES__CARBON_CONTENT:
				setCarbonContent(CARBON_CONTENT_EDEFAULT);
				return;
			case FinalPackage.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE:
				setLowerHeatingValue(LOWER_HEATING_VALUE_EDEFAULT);
				return;
			case FinalPackage.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE:
				setHigherHeatingValue(HIGHER_HEATING_VALUE_EDEFAULT);
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
			case FinalPackage.IFC_FUEL_PROPERTIES__COMBUSTION_TEMPERATURE:
				return COMBUSTION_TEMPERATURE_EDEFAULT == null ? combustionTemperature != null : !COMBUSTION_TEMPERATURE_EDEFAULT.equals(combustionTemperature);
			case FinalPackage.IFC_FUEL_PROPERTIES__CARBON_CONTENT:
				return CARBON_CONTENT_EDEFAULT == null ? carbonContent != null : !CARBON_CONTENT_EDEFAULT.equals(carbonContent);
			case FinalPackage.IFC_FUEL_PROPERTIES__LOWER_HEATING_VALUE:
				return LOWER_HEATING_VALUE_EDEFAULT == null ? lowerHeatingValue != null : !LOWER_HEATING_VALUE_EDEFAULT.equals(lowerHeatingValue);
			case FinalPackage.IFC_FUEL_PROPERTIES__HIGHER_HEATING_VALUE:
				return HIGHER_HEATING_VALUE_EDEFAULT == null ? higherHeatingValue != null : !HIGHER_HEATING_VALUE_EDEFAULT.equals(higherHeatingValue);
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
		result.append(" (combustionTemperature: ");
		result.append(combustionTemperature);
		result.append(", carbonContent: ");
		result.append(carbonContent);
		result.append(", lowerHeatingValue: ");
		result.append(lowerHeatingValue);
		result.append(", higherHeatingValue: ");
		result.append(higherHeatingValue);
		result.append(')');
		return result.toString();
	}

} //IfcFuelPropertiesImpl
