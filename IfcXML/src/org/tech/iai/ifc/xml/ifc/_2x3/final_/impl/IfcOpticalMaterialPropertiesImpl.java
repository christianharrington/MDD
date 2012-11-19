/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpticalMaterialProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Optical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOpticalMaterialPropertiesImpl#getVisibleTransmittance <em>Visible Transmittance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOpticalMaterialPropertiesImpl#getSolarTransmittance <em>Solar Transmittance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceFront <em>Solar Reflectance Front</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceBack <em>Solar Reflectance Back</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOpticalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcOpticalMaterialProperties {
	/**
	 * The default value of the '{@link #getVisibleTransmittance() <em>Visible Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleTransmittance()
	 * @generated
	 * @ordered
	 */
	protected static final Double VISIBLE_TRANSMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleTransmittance() <em>Visible Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleTransmittance()
	 * @generated
	 * @ordered
	 */
	protected Double visibleTransmittance = VISIBLE_TRANSMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolarTransmittance() <em>Solar Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarTransmittance()
	 * @generated
	 * @ordered
	 */
	protected static final Double SOLAR_TRANSMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarTransmittance() <em>Solar Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarTransmittance()
	 * @generated
	 * @ordered
	 */
	protected Double solarTransmittance = SOLAR_TRANSMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermalIrTransmittance() <em>Thermal Ir Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrTransmittance()
	 * @generated
	 * @ordered
	 */
	protected static final Double THERMAL_IR_TRANSMITTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalIrTransmittance() <em>Thermal Ir Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrTransmittance()
	 * @generated
	 * @ordered
	 */
	protected Double thermalIrTransmittance = THERMAL_IR_TRANSMITTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermalIrEmissivityBack() <em>Thermal Ir Emissivity Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityBack()
	 * @generated
	 * @ordered
	 */
	protected static final Double THERMAL_IR_EMISSIVITY_BACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalIrEmissivityBack() <em>Thermal Ir Emissivity Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityBack()
	 * @generated
	 * @ordered
	 */
	protected Double thermalIrEmissivityBack = THERMAL_IR_EMISSIVITY_BACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermalIrEmissivityFront() <em>Thermal Ir Emissivity Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityFront()
	 * @generated
	 * @ordered
	 */
	protected static final Double THERMAL_IR_EMISSIVITY_FRONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalIrEmissivityFront() <em>Thermal Ir Emissivity Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityFront()
	 * @generated
	 * @ordered
	 */
	protected Double thermalIrEmissivityFront = THERMAL_IR_EMISSIVITY_FRONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleReflectanceBack() <em>Visible Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceBack()
	 * @generated
	 * @ordered
	 */
	protected static final Double VISIBLE_REFLECTANCE_BACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleReflectanceBack() <em>Visible Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceBack()
	 * @generated
	 * @ordered
	 */
	protected Double visibleReflectanceBack = VISIBLE_REFLECTANCE_BACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleReflectanceFront() <em>Visible Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceFront()
	 * @generated
	 * @ordered
	 */
	protected static final Double VISIBLE_REFLECTANCE_FRONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleReflectanceFront() <em>Visible Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceFront()
	 * @generated
	 * @ordered
	 */
	protected Double visibleReflectanceFront = VISIBLE_REFLECTANCE_FRONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolarReflectanceFront() <em>Solar Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceFront()
	 * @generated
	 * @ordered
	 */
	protected static final Double SOLAR_REFLECTANCE_FRONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarReflectanceFront() <em>Solar Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceFront()
	 * @generated
	 * @ordered
	 */
	protected Double solarReflectanceFront = SOLAR_REFLECTANCE_FRONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolarReflectanceBack() <em>Solar Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceBack()
	 * @generated
	 * @ordered
	 */
	protected static final Double SOLAR_REFLECTANCE_BACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarReflectanceBack() <em>Solar Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceBack()
	 * @generated
	 * @ordered
	 */
	protected Double solarReflectanceBack = SOLAR_REFLECTANCE_BACK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOpticalMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcOpticalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVisibleTransmittance() {
		return visibleTransmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleTransmittance(Double newVisibleTransmittance) {
		Double oldVisibleTransmittance = visibleTransmittance;
		visibleTransmittance = newVisibleTransmittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE, oldVisibleTransmittance, visibleTransmittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSolarTransmittance() {
		return solarTransmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarTransmittance(Double newSolarTransmittance) {
		Double oldSolarTransmittance = solarTransmittance;
		solarTransmittance = newSolarTransmittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE, oldSolarTransmittance, solarTransmittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalIrTransmittance() {
		return thermalIrTransmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrTransmittance(Double newThermalIrTransmittance) {
		Double oldThermalIrTransmittance = thermalIrTransmittance;
		thermalIrTransmittance = newThermalIrTransmittance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE, oldThermalIrTransmittance, thermalIrTransmittance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalIrEmissivityBack() {
		return thermalIrEmissivityBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityBack(Double newThermalIrEmissivityBack) {
		Double oldThermalIrEmissivityBack = thermalIrEmissivityBack;
		thermalIrEmissivityBack = newThermalIrEmissivityBack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK, oldThermalIrEmissivityBack, thermalIrEmissivityBack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getThermalIrEmissivityFront() {
		return thermalIrEmissivityFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityFront(Double newThermalIrEmissivityFront) {
		Double oldThermalIrEmissivityFront = thermalIrEmissivityFront;
		thermalIrEmissivityFront = newThermalIrEmissivityFront;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT, oldThermalIrEmissivityFront, thermalIrEmissivityFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVisibleReflectanceBack() {
		return visibleReflectanceBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceBack(Double newVisibleReflectanceBack) {
		Double oldVisibleReflectanceBack = visibleReflectanceBack;
		visibleReflectanceBack = newVisibleReflectanceBack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK, oldVisibleReflectanceBack, visibleReflectanceBack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVisibleReflectanceFront() {
		return visibleReflectanceFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceFront(Double newVisibleReflectanceFront) {
		Double oldVisibleReflectanceFront = visibleReflectanceFront;
		visibleReflectanceFront = newVisibleReflectanceFront;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT, oldVisibleReflectanceFront, visibleReflectanceFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSolarReflectanceFront() {
		return solarReflectanceFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceFront(Double newSolarReflectanceFront) {
		Double oldSolarReflectanceFront = solarReflectanceFront;
		solarReflectanceFront = newSolarReflectanceFront;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT, oldSolarReflectanceFront, solarReflectanceFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSolarReflectanceBack() {
		return solarReflectanceBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceBack(Double newSolarReflectanceBack) {
		Double oldSolarReflectanceBack = solarReflectanceBack;
		solarReflectanceBack = newSolarReflectanceBack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK, oldSolarReflectanceBack, solarReflectanceBack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE:
				return getVisibleTransmittance();
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE:
				return getSolarTransmittance();
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE:
				return getThermalIrTransmittance();
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK:
				return getThermalIrEmissivityBack();
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT:
				return getThermalIrEmissivityFront();
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK:
				return getVisibleReflectanceBack();
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT:
				return getVisibleReflectanceFront();
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT:
				return getSolarReflectanceFront();
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK:
				return getSolarReflectanceBack();
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
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE:
				setVisibleTransmittance((Double)newValue);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE:
				setSolarTransmittance((Double)newValue);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE:
				setThermalIrTransmittance((Double)newValue);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK:
				setThermalIrEmissivityBack((Double)newValue);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT:
				setThermalIrEmissivityFront((Double)newValue);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK:
				setVisibleReflectanceBack((Double)newValue);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT:
				setVisibleReflectanceFront((Double)newValue);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT:
				setSolarReflectanceFront((Double)newValue);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK:
				setSolarReflectanceBack((Double)newValue);
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
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE:
				setVisibleTransmittance(VISIBLE_TRANSMITTANCE_EDEFAULT);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE:
				setSolarTransmittance(SOLAR_TRANSMITTANCE_EDEFAULT);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE:
				setThermalIrTransmittance(THERMAL_IR_TRANSMITTANCE_EDEFAULT);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK:
				setThermalIrEmissivityBack(THERMAL_IR_EMISSIVITY_BACK_EDEFAULT);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT:
				setThermalIrEmissivityFront(THERMAL_IR_EMISSIVITY_FRONT_EDEFAULT);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK:
				setVisibleReflectanceBack(VISIBLE_REFLECTANCE_BACK_EDEFAULT);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT:
				setVisibleReflectanceFront(VISIBLE_REFLECTANCE_FRONT_EDEFAULT);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT:
				setSolarReflectanceFront(SOLAR_REFLECTANCE_FRONT_EDEFAULT);
				return;
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK:
				setSolarReflectanceBack(SOLAR_REFLECTANCE_BACK_EDEFAULT);
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
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE:
				return VISIBLE_TRANSMITTANCE_EDEFAULT == null ? visibleTransmittance != null : !VISIBLE_TRANSMITTANCE_EDEFAULT.equals(visibleTransmittance);
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE:
				return SOLAR_TRANSMITTANCE_EDEFAULT == null ? solarTransmittance != null : !SOLAR_TRANSMITTANCE_EDEFAULT.equals(solarTransmittance);
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE:
				return THERMAL_IR_TRANSMITTANCE_EDEFAULT == null ? thermalIrTransmittance != null : !THERMAL_IR_TRANSMITTANCE_EDEFAULT.equals(thermalIrTransmittance);
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK:
				return THERMAL_IR_EMISSIVITY_BACK_EDEFAULT == null ? thermalIrEmissivityBack != null : !THERMAL_IR_EMISSIVITY_BACK_EDEFAULT.equals(thermalIrEmissivityBack);
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT:
				return THERMAL_IR_EMISSIVITY_FRONT_EDEFAULT == null ? thermalIrEmissivityFront != null : !THERMAL_IR_EMISSIVITY_FRONT_EDEFAULT.equals(thermalIrEmissivityFront);
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK:
				return VISIBLE_REFLECTANCE_BACK_EDEFAULT == null ? visibleReflectanceBack != null : !VISIBLE_REFLECTANCE_BACK_EDEFAULT.equals(visibleReflectanceBack);
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT:
				return VISIBLE_REFLECTANCE_FRONT_EDEFAULT == null ? visibleReflectanceFront != null : !VISIBLE_REFLECTANCE_FRONT_EDEFAULT.equals(visibleReflectanceFront);
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT:
				return SOLAR_REFLECTANCE_FRONT_EDEFAULT == null ? solarReflectanceFront != null : !SOLAR_REFLECTANCE_FRONT_EDEFAULT.equals(solarReflectanceFront);
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK:
				return SOLAR_REFLECTANCE_BACK_EDEFAULT == null ? solarReflectanceBack != null : !SOLAR_REFLECTANCE_BACK_EDEFAULT.equals(solarReflectanceBack);
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
		result.append(" (visibleTransmittance: ");
		result.append(visibleTransmittance);
		result.append(", solarTransmittance: ");
		result.append(solarTransmittance);
		result.append(", thermalIrTransmittance: ");
		result.append(thermalIrTransmittance);
		result.append(", thermalIrEmissivityBack: ");
		result.append(thermalIrEmissivityBack);
		result.append(", thermalIrEmissivityFront: ");
		result.append(thermalIrEmissivityFront);
		result.append(", visibleReflectanceBack: ");
		result.append(visibleReflectanceBack);
		result.append(", visibleReflectanceFront: ");
		result.append(visibleReflectanceFront);
		result.append(", solarReflectanceFront: ");
		result.append(solarReflectanceFront);
		result.append(", solarReflectanceBack: ");
		result.append(solarReflectanceBack);
		result.append(')');
		return result.toString();
	}

} //IfcOpticalMaterialPropertiesImpl
