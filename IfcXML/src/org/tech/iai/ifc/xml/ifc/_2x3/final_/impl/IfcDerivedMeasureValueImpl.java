/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAbsorbedDoseMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAccelerationMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAngularVelocityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCompoundPlaneAngleMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurvatureMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDerivedMeasureValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoseEquivalentMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDynamicViscosityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricCapacitanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricChargeMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricConductanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricResistanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricVoltageMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEnergyMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcForceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFrequencyMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHeatFluxDensityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHeatingValueMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIlluminanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInductanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIntegerCountRateMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIonConcentrationMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIsothermalMoistureCapacityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcKinematicViscosityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLinearForceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLinearMomentMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLinearStiffnessMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLinearVelocityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLuminousFluxMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLuminousIntensityDistributionMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMagneticFluxDensityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMagneticFluxMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassDensityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassFlowRateMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassPerLengthMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfElasticityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfLinearSubgradeReactionMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfRotationalSubgradeReactionMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfSubgradeReactionMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMoistureDiffusivityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMolecularWeightMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMomentOfInertiaMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMonetaryMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPHMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlanarForceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPowerMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPressureMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRadioActivityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRotationalFrequencyMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRotationalMassMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRotationalStiffnessMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionModulusMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionalAreaIntegralMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShearModulusMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundPowerMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundPressureMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecificHeatCapacityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTemperatureGradientMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalAdmittanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalConductivityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalExpansionCoefficientMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalResistanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalTransmittanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeStampType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTorqueMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVaporPermeabilityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVolumetricFlowRateMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWarpingConstantMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWarpingMomentMeasureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Derived Measure Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcVolumetricFlowRateMeasure <em>Ifc Volumetric Flow Rate Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcTimeStamp <em>Ifc Time Stamp</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcThermalTransmittanceMeasure <em>Ifc Thermal Transmittance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcThermalResistanceMeasure <em>Ifc Thermal Resistance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcThermalAdmittanceMeasure <em>Ifc Thermal Admittance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcPressureMeasure <em>Ifc Pressure Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcPowerMeasure <em>Ifc Power Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcMassFlowRateMeasure <em>Ifc Mass Flow Rate Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcMassDensityMeasure <em>Ifc Mass Density Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcLinearVelocityMeasure <em>Ifc Linear Velocity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcKinematicViscosityMeasure <em>Ifc Kinematic Viscosity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcIntegerCountRateMeasure <em>Ifc Integer Count Rate Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcHeatFluxDensityMeasure <em>Ifc Heat Flux Density Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcFrequencyMeasure <em>Ifc Frequency Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcEnergyMeasure <em>Ifc Energy Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcElectricVoltageMeasure <em>Ifc Electric Voltage Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcDynamicViscosityMeasure <em>Ifc Dynamic Viscosity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcCompoundPlaneAngleMeasure <em>Ifc Compound Plane Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcAngularVelocityMeasure <em>Ifc Angular Velocity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcThermalConductivityMeasure <em>Ifc Thermal Conductivity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcMolecularWeightMeasure <em>Ifc Molecular Weight Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcVaporPermeabilityMeasure <em>Ifc Vapor Permeability Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcMoistureDiffusivityMeasure <em>Ifc Moisture Diffusivity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcIsothermalMoistureCapacityMeasure <em>Ifc Isothermal Moisture Capacity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcSpecificHeatCapacityMeasure <em>Ifc Specific Heat Capacity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcMonetaryMeasure <em>Ifc Monetary Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcMagneticFluxDensityMeasure <em>Ifc Magnetic Flux Density Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcMagneticFluxMeasure <em>Ifc Magnetic Flux Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcLuminousFluxMeasure <em>Ifc Luminous Flux Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcForceMeasure <em>Ifc Force Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcInductanceMeasure <em>Ifc Inductance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcIlluminanceMeasure <em>Ifc Illuminance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcElectricResistanceMeasure <em>Ifc Electric Resistance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcElectricConductanceMeasure <em>Ifc Electric Conductance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcElectricChargeMeasure <em>Ifc Electric Charge Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcDoseEquivalentMeasure <em>Ifc Dose Equivalent Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcElectricCapacitanceMeasure <em>Ifc Electric Capacitance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcAbsorbedDoseMeasure <em>Ifc Absorbed Dose Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcRadioActivityMeasure <em>Ifc Radio Activity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcRotationalFrequencyMeasure <em>Ifc Rotational Frequency Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcTorqueMeasure <em>Ifc Torque Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcAccelerationMeasure <em>Ifc Acceleration Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcLinearForceMeasure <em>Ifc Linear Force Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcLinearStiffnessMeasure <em>Ifc Linear Stiffness Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcModulusOfSubgradeReactionMeasure <em>Ifc Modulus Of Subgrade Reaction Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcModulusOfElasticityMeasure <em>Ifc Modulus Of Elasticity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcMomentOfInertiaMeasure <em>Ifc Moment Of Inertia Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcPlanarForceMeasure <em>Ifc Planar Force Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcRotationalStiffnessMeasure <em>Ifc Rotational Stiffness Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcShearModulusMeasure <em>Ifc Shear Modulus Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcLinearMomentMeasure <em>Ifc Linear Moment Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcLuminousIntensityDistributionMeasure <em>Ifc Luminous Intensity Distribution Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcCurvatureMeasure <em>Ifc Curvature Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcMassPerLengthMeasure <em>Ifc Mass Per Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcModulusOfLinearSubgradeReactionMeasure <em>Ifc Modulus Of Linear Subgrade Reaction Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcModulusOfRotationalSubgradeReactionMeasure <em>Ifc Modulus Of Rotational Subgrade Reaction Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcRotationalMassMeasure <em>Ifc Rotational Mass Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcSectionalAreaIntegralMeasure <em>Ifc Sectional Area Integral Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcSectionModulusMeasure <em>Ifc Section Modulus Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcTemperatureGradientMeasure <em>Ifc Temperature Gradient Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcThermalExpansionCoefficientMeasure <em>Ifc Thermal Expansion Coefficient Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcWarpingConstantMeasure <em>Ifc Warping Constant Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcWarpingMomentMeasure <em>Ifc Warping Moment Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcSoundPowerMeasure <em>Ifc Sound Power Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcSoundPressureMeasure <em>Ifc Sound Pressure Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcHeatingValueMeasure <em>Ifc Heating Value Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcPHMeasure <em>Ifc PH Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcDerivedMeasureValueImpl#getIfcIonConcentrationMeasure <em>Ifc Ion Concentration Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDerivedMeasureValueImpl extends EObjectImpl implements IfcDerivedMeasureValue {
	/**
	 * The cached value of the '{@link #getIfcVolumetricFlowRateMeasure() <em>Ifc Volumetric Flow Rate Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcVolumetricFlowRateMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcVolumetricFlowRateMeasureType ifcVolumetricFlowRateMeasure;

	/**
	 * The cached value of the '{@link #getIfcTimeStamp() <em>Ifc Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeStampType ifcTimeStamp;

	/**
	 * The cached value of the '{@link #getIfcThermalTransmittanceMeasure() <em>Ifc Thermal Transmittance Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcThermalTransmittanceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcThermalTransmittanceMeasureType ifcThermalTransmittanceMeasure;

	/**
	 * The cached value of the '{@link #getIfcThermalResistanceMeasure() <em>Ifc Thermal Resistance Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcThermalResistanceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcThermalResistanceMeasureType ifcThermalResistanceMeasure;

	/**
	 * The cached value of the '{@link #getIfcThermalAdmittanceMeasure() <em>Ifc Thermal Admittance Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcThermalAdmittanceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcThermalAdmittanceMeasureType ifcThermalAdmittanceMeasure;

	/**
	 * The cached value of the '{@link #getIfcPressureMeasure() <em>Ifc Pressure Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPressureMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPressureMeasureType ifcPressureMeasure;

	/**
	 * The cached value of the '{@link #getIfcPowerMeasure() <em>Ifc Power Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPowerMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPowerMeasureType ifcPowerMeasure;

	/**
	 * The cached value of the '{@link #getIfcMassFlowRateMeasure() <em>Ifc Mass Flow Rate Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMassFlowRateMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMassFlowRateMeasureType ifcMassFlowRateMeasure;

	/**
	 * The cached value of the '{@link #getIfcMassDensityMeasure() <em>Ifc Mass Density Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMassDensityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMassDensityMeasureType ifcMassDensityMeasure;

	/**
	 * The cached value of the '{@link #getIfcLinearVelocityMeasure() <em>Ifc Linear Velocity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLinearVelocityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcLinearVelocityMeasureType ifcLinearVelocityMeasure;

	/**
	 * The cached value of the '{@link #getIfcKinematicViscosityMeasure() <em>Ifc Kinematic Viscosity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcKinematicViscosityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcKinematicViscosityMeasureType ifcKinematicViscosityMeasure;

	/**
	 * The cached value of the '{@link #getIfcIntegerCountRateMeasure() <em>Ifc Integer Count Rate Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcIntegerCountRateMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcIntegerCountRateMeasureType ifcIntegerCountRateMeasure;

	/**
	 * The cached value of the '{@link #getIfcHeatFluxDensityMeasure() <em>Ifc Heat Flux Density Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcHeatFluxDensityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcHeatFluxDensityMeasureType ifcHeatFluxDensityMeasure;

	/**
	 * The cached value of the '{@link #getIfcFrequencyMeasure() <em>Ifc Frequency Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcFrequencyMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcFrequencyMeasureType ifcFrequencyMeasure;

	/**
	 * The cached value of the '{@link #getIfcEnergyMeasure() <em>Ifc Energy Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcEnergyMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcEnergyMeasureType ifcEnergyMeasure;

	/**
	 * The cached value of the '{@link #getIfcElectricVoltageMeasure() <em>Ifc Electric Voltage Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcElectricVoltageMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcElectricVoltageMeasureType ifcElectricVoltageMeasure;

	/**
	 * The cached value of the '{@link #getIfcDynamicViscosityMeasure() <em>Ifc Dynamic Viscosity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDynamicViscosityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcDynamicViscosityMeasureType ifcDynamicViscosityMeasure;

	/**
	 * The cached value of the '{@link #getIfcCompoundPlaneAngleMeasure() <em>Ifc Compound Plane Angle Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCompoundPlaneAngleMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcCompoundPlaneAngleMeasureType ifcCompoundPlaneAngleMeasure;

	/**
	 * The cached value of the '{@link #getIfcAngularVelocityMeasure() <em>Ifc Angular Velocity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAngularVelocityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcAngularVelocityMeasureType ifcAngularVelocityMeasure;

	/**
	 * The cached value of the '{@link #getIfcThermalConductivityMeasure() <em>Ifc Thermal Conductivity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcThermalConductivityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcThermalConductivityMeasureType ifcThermalConductivityMeasure;

	/**
	 * The cached value of the '{@link #getIfcMolecularWeightMeasure() <em>Ifc Molecular Weight Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMolecularWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMolecularWeightMeasureType ifcMolecularWeightMeasure;

	/**
	 * The cached value of the '{@link #getIfcVaporPermeabilityMeasure() <em>Ifc Vapor Permeability Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcVaporPermeabilityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcVaporPermeabilityMeasureType ifcVaporPermeabilityMeasure;

	/**
	 * The cached value of the '{@link #getIfcMoistureDiffusivityMeasure() <em>Ifc Moisture Diffusivity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMoistureDiffusivityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMoistureDiffusivityMeasureType ifcMoistureDiffusivityMeasure;

	/**
	 * The cached value of the '{@link #getIfcIsothermalMoistureCapacityMeasure() <em>Ifc Isothermal Moisture Capacity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcIsothermalMoistureCapacityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcIsothermalMoistureCapacityMeasureType ifcIsothermalMoistureCapacityMeasure;

	/**
	 * The cached value of the '{@link #getIfcSpecificHeatCapacityMeasure() <em>Ifc Specific Heat Capacity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSpecificHeatCapacityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcSpecificHeatCapacityMeasureType ifcSpecificHeatCapacityMeasure;

	/**
	 * The cached value of the '{@link #getIfcMonetaryMeasure() <em>Ifc Monetary Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMonetaryMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMonetaryMeasureType ifcMonetaryMeasure;

	/**
	 * The cached value of the '{@link #getIfcMagneticFluxDensityMeasure() <em>Ifc Magnetic Flux Density Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMagneticFluxDensityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMagneticFluxDensityMeasureType ifcMagneticFluxDensityMeasure;

	/**
	 * The cached value of the '{@link #getIfcMagneticFluxMeasure() <em>Ifc Magnetic Flux Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMagneticFluxMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMagneticFluxMeasureType ifcMagneticFluxMeasure;

	/**
	 * The cached value of the '{@link #getIfcLuminousFluxMeasure() <em>Ifc Luminous Flux Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLuminousFluxMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcLuminousFluxMeasureType ifcLuminousFluxMeasure;

	/**
	 * The cached value of the '{@link #getIfcForceMeasure() <em>Ifc Force Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcForceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcForceMeasureType ifcForceMeasure;

	/**
	 * The cached value of the '{@link #getIfcInductanceMeasure() <em>Ifc Inductance Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcInductanceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcInductanceMeasureType ifcInductanceMeasure;

	/**
	 * The cached value of the '{@link #getIfcIlluminanceMeasure() <em>Ifc Illuminance Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcIlluminanceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcIlluminanceMeasureType ifcIlluminanceMeasure;

	/**
	 * The cached value of the '{@link #getIfcElectricResistanceMeasure() <em>Ifc Electric Resistance Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcElectricResistanceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcElectricResistanceMeasureType ifcElectricResistanceMeasure;

	/**
	 * The cached value of the '{@link #getIfcElectricConductanceMeasure() <em>Ifc Electric Conductance Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcElectricConductanceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcElectricConductanceMeasureType ifcElectricConductanceMeasure;

	/**
	 * The cached value of the '{@link #getIfcElectricChargeMeasure() <em>Ifc Electric Charge Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcElectricChargeMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcElectricChargeMeasureType ifcElectricChargeMeasure;

	/**
	 * The cached value of the '{@link #getIfcDoseEquivalentMeasure() <em>Ifc Dose Equivalent Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDoseEquivalentMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcDoseEquivalentMeasureType ifcDoseEquivalentMeasure;

	/**
	 * The cached value of the '{@link #getIfcElectricCapacitanceMeasure() <em>Ifc Electric Capacitance Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcElectricCapacitanceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcElectricCapacitanceMeasureType ifcElectricCapacitanceMeasure;

	/**
	 * The cached value of the '{@link #getIfcAbsorbedDoseMeasure() <em>Ifc Absorbed Dose Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAbsorbedDoseMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcAbsorbedDoseMeasureType ifcAbsorbedDoseMeasure;

	/**
	 * The cached value of the '{@link #getIfcRadioActivityMeasure() <em>Ifc Radio Activity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRadioActivityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcRadioActivityMeasureType ifcRadioActivityMeasure;

	/**
	 * The cached value of the '{@link #getIfcRotationalFrequencyMeasure() <em>Ifc Rotational Frequency Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRotationalFrequencyMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcRotationalFrequencyMeasureType ifcRotationalFrequencyMeasure;

	/**
	 * The cached value of the '{@link #getIfcTorqueMeasure() <em>Ifc Torque Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTorqueMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcTorqueMeasureType ifcTorqueMeasure;

	/**
	 * The cached value of the '{@link #getIfcAccelerationMeasure() <em>Ifc Acceleration Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAccelerationMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcAccelerationMeasureType ifcAccelerationMeasure;

	/**
	 * The cached value of the '{@link #getIfcLinearForceMeasure() <em>Ifc Linear Force Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLinearForceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcLinearForceMeasureType ifcLinearForceMeasure;

	/**
	 * The cached value of the '{@link #getIfcLinearStiffnessMeasure() <em>Ifc Linear Stiffness Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLinearStiffnessMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcLinearStiffnessMeasureType ifcLinearStiffnessMeasure;

	/**
	 * The cached value of the '{@link #getIfcModulusOfSubgradeReactionMeasure() <em>Ifc Modulus Of Subgrade Reaction Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcModulusOfSubgradeReactionMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcModulusOfSubgradeReactionMeasureType ifcModulusOfSubgradeReactionMeasure;

	/**
	 * The cached value of the '{@link #getIfcModulusOfElasticityMeasure() <em>Ifc Modulus Of Elasticity Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcModulusOfElasticityMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcModulusOfElasticityMeasureType ifcModulusOfElasticityMeasure;

	/**
	 * The cached value of the '{@link #getIfcMomentOfInertiaMeasure() <em>Ifc Moment Of Inertia Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMomentOfInertiaMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMomentOfInertiaMeasureType ifcMomentOfInertiaMeasure;

	/**
	 * The cached value of the '{@link #getIfcPlanarForceMeasure() <em>Ifc Planar Force Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPlanarForceMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPlanarForceMeasureType ifcPlanarForceMeasure;

	/**
	 * The cached value of the '{@link #getIfcRotationalStiffnessMeasure() <em>Ifc Rotational Stiffness Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRotationalStiffnessMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcRotationalStiffnessMeasureType ifcRotationalStiffnessMeasure;

	/**
	 * The cached value of the '{@link #getIfcShearModulusMeasure() <em>Ifc Shear Modulus Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcShearModulusMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcShearModulusMeasureType ifcShearModulusMeasure;

	/**
	 * The cached value of the '{@link #getIfcLinearMomentMeasure() <em>Ifc Linear Moment Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLinearMomentMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcLinearMomentMeasureType ifcLinearMomentMeasure;

	/**
	 * The cached value of the '{@link #getIfcLuminousIntensityDistributionMeasure() <em>Ifc Luminous Intensity Distribution Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcLuminousIntensityDistributionMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcLuminousIntensityDistributionMeasureType ifcLuminousIntensityDistributionMeasure;

	/**
	 * The cached value of the '{@link #getIfcCurvatureMeasure() <em>Ifc Curvature Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCurvatureMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcCurvatureMeasureType ifcCurvatureMeasure;

	/**
	 * The cached value of the '{@link #getIfcMassPerLengthMeasure() <em>Ifc Mass Per Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcMassPerLengthMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcMassPerLengthMeasureType ifcMassPerLengthMeasure;

	/**
	 * The cached value of the '{@link #getIfcModulusOfLinearSubgradeReactionMeasure() <em>Ifc Modulus Of Linear Subgrade Reaction Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcModulusOfLinearSubgradeReactionMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcModulusOfLinearSubgradeReactionMeasureType ifcModulusOfLinearSubgradeReactionMeasure;

	/**
	 * The cached value of the '{@link #getIfcModulusOfRotationalSubgradeReactionMeasure() <em>Ifc Modulus Of Rotational Subgrade Reaction Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcModulusOfRotationalSubgradeReactionMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcModulusOfRotationalSubgradeReactionMeasureType ifcModulusOfRotationalSubgradeReactionMeasure;

	/**
	 * The cached value of the '{@link #getIfcRotationalMassMeasure() <em>Ifc Rotational Mass Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRotationalMassMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcRotationalMassMeasureType ifcRotationalMassMeasure;

	/**
	 * The cached value of the '{@link #getIfcSectionalAreaIntegralMeasure() <em>Ifc Sectional Area Integral Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSectionalAreaIntegralMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcSectionalAreaIntegralMeasureType ifcSectionalAreaIntegralMeasure;

	/**
	 * The cached value of the '{@link #getIfcSectionModulusMeasure() <em>Ifc Section Modulus Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSectionModulusMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcSectionModulusMeasureType ifcSectionModulusMeasure;

	/**
	 * The cached value of the '{@link #getIfcTemperatureGradientMeasure() <em>Ifc Temperature Gradient Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcTemperatureGradientMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcTemperatureGradientMeasureType ifcTemperatureGradientMeasure;

	/**
	 * The cached value of the '{@link #getIfcThermalExpansionCoefficientMeasure() <em>Ifc Thermal Expansion Coefficient Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcThermalExpansionCoefficientMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcThermalExpansionCoefficientMeasureType ifcThermalExpansionCoefficientMeasure;

	/**
	 * The cached value of the '{@link #getIfcWarpingConstantMeasure() <em>Ifc Warping Constant Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcWarpingConstantMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcWarpingConstantMeasureType ifcWarpingConstantMeasure;

	/**
	 * The cached value of the '{@link #getIfcWarpingMomentMeasure() <em>Ifc Warping Moment Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcWarpingMomentMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcWarpingMomentMeasureType ifcWarpingMomentMeasure;

	/**
	 * The cached value of the '{@link #getIfcSoundPowerMeasure() <em>Ifc Sound Power Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSoundPowerMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcSoundPowerMeasureType ifcSoundPowerMeasure;

	/**
	 * The cached value of the '{@link #getIfcSoundPressureMeasure() <em>Ifc Sound Pressure Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcSoundPressureMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcSoundPressureMeasureType ifcSoundPressureMeasure;

	/**
	 * The cached value of the '{@link #getIfcHeatingValueMeasure() <em>Ifc Heating Value Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcHeatingValueMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcHeatingValueMeasureType ifcHeatingValueMeasure;

	/**
	 * The cached value of the '{@link #getIfcPHMeasure() <em>Ifc PH Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPHMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPHMeasureType ifcPHMeasure;

	/**
	 * The cached value of the '{@link #getIfcIonConcentrationMeasure() <em>Ifc Ion Concentration Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcIonConcentrationMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcIonConcentrationMeasureType ifcIonConcentrationMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDerivedMeasureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcDerivedMeasureValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVolumetricFlowRateMeasureType getIfcVolumetricFlowRateMeasure() {
		return ifcVolumetricFlowRateMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcVolumetricFlowRateMeasure(IfcVolumetricFlowRateMeasureType newIfcVolumetricFlowRateMeasure, NotificationChain msgs) {
		IfcVolumetricFlowRateMeasureType oldIfcVolumetricFlowRateMeasure = ifcVolumetricFlowRateMeasure;
		ifcVolumetricFlowRateMeasure = newIfcVolumetricFlowRateMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE, oldIfcVolumetricFlowRateMeasure, newIfcVolumetricFlowRateMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVolumetricFlowRateMeasure(IfcVolumetricFlowRateMeasureType newIfcVolumetricFlowRateMeasure) {
		if (newIfcVolumetricFlowRateMeasure != ifcVolumetricFlowRateMeasure) {
			NotificationChain msgs = null;
			if (ifcVolumetricFlowRateMeasure != null)
				msgs = ((InternalEObject)ifcVolumetricFlowRateMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE, null, msgs);
			if (newIfcVolumetricFlowRateMeasure != null)
				msgs = ((InternalEObject)newIfcVolumetricFlowRateMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE, null, msgs);
			msgs = basicSetIfcVolumetricFlowRateMeasure(newIfcVolumetricFlowRateMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE, newIfcVolumetricFlowRateMeasure, newIfcVolumetricFlowRateMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeStampType getIfcTimeStamp() {
		return ifcTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTimeStamp(IfcTimeStampType newIfcTimeStamp, NotificationChain msgs) {
		IfcTimeStampType oldIfcTimeStamp = ifcTimeStamp;
		ifcTimeStamp = newIfcTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TIME_STAMP, oldIfcTimeStamp, newIfcTimeStamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTimeStamp(IfcTimeStampType newIfcTimeStamp) {
		if (newIfcTimeStamp != ifcTimeStamp) {
			NotificationChain msgs = null;
			if (ifcTimeStamp != null)
				msgs = ((InternalEObject)ifcTimeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TIME_STAMP, null, msgs);
			if (newIfcTimeStamp != null)
				msgs = ((InternalEObject)newIfcTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TIME_STAMP, null, msgs);
			msgs = basicSetIfcTimeStamp(newIfcTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TIME_STAMP, newIfcTimeStamp, newIfcTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalTransmittanceMeasureType getIfcThermalTransmittanceMeasure() {
		return ifcThermalTransmittanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcThermalTransmittanceMeasure(IfcThermalTransmittanceMeasureType newIfcThermalTransmittanceMeasure, NotificationChain msgs) {
		IfcThermalTransmittanceMeasureType oldIfcThermalTransmittanceMeasure = ifcThermalTransmittanceMeasure;
		ifcThermalTransmittanceMeasure = newIfcThermalTransmittanceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_TRANSMITTANCE_MEASURE, oldIfcThermalTransmittanceMeasure, newIfcThermalTransmittanceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalTransmittanceMeasure(IfcThermalTransmittanceMeasureType newIfcThermalTransmittanceMeasure) {
		if (newIfcThermalTransmittanceMeasure != ifcThermalTransmittanceMeasure) {
			NotificationChain msgs = null;
			if (ifcThermalTransmittanceMeasure != null)
				msgs = ((InternalEObject)ifcThermalTransmittanceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_TRANSMITTANCE_MEASURE, null, msgs);
			if (newIfcThermalTransmittanceMeasure != null)
				msgs = ((InternalEObject)newIfcThermalTransmittanceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_TRANSMITTANCE_MEASURE, null, msgs);
			msgs = basicSetIfcThermalTransmittanceMeasure(newIfcThermalTransmittanceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_TRANSMITTANCE_MEASURE, newIfcThermalTransmittanceMeasure, newIfcThermalTransmittanceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalResistanceMeasureType getIfcThermalResistanceMeasure() {
		return ifcThermalResistanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcThermalResistanceMeasure(IfcThermalResistanceMeasureType newIfcThermalResistanceMeasure, NotificationChain msgs) {
		IfcThermalResistanceMeasureType oldIfcThermalResistanceMeasure = ifcThermalResistanceMeasure;
		ifcThermalResistanceMeasure = newIfcThermalResistanceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_RESISTANCE_MEASURE, oldIfcThermalResistanceMeasure, newIfcThermalResistanceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalResistanceMeasure(IfcThermalResistanceMeasureType newIfcThermalResistanceMeasure) {
		if (newIfcThermalResistanceMeasure != ifcThermalResistanceMeasure) {
			NotificationChain msgs = null;
			if (ifcThermalResistanceMeasure != null)
				msgs = ((InternalEObject)ifcThermalResistanceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_RESISTANCE_MEASURE, null, msgs);
			if (newIfcThermalResistanceMeasure != null)
				msgs = ((InternalEObject)newIfcThermalResistanceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_RESISTANCE_MEASURE, null, msgs);
			msgs = basicSetIfcThermalResistanceMeasure(newIfcThermalResistanceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_RESISTANCE_MEASURE, newIfcThermalResistanceMeasure, newIfcThermalResistanceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalAdmittanceMeasureType getIfcThermalAdmittanceMeasure() {
		return ifcThermalAdmittanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcThermalAdmittanceMeasure(IfcThermalAdmittanceMeasureType newIfcThermalAdmittanceMeasure, NotificationChain msgs) {
		IfcThermalAdmittanceMeasureType oldIfcThermalAdmittanceMeasure = ifcThermalAdmittanceMeasure;
		ifcThermalAdmittanceMeasure = newIfcThermalAdmittanceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_ADMITTANCE_MEASURE, oldIfcThermalAdmittanceMeasure, newIfcThermalAdmittanceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalAdmittanceMeasure(IfcThermalAdmittanceMeasureType newIfcThermalAdmittanceMeasure) {
		if (newIfcThermalAdmittanceMeasure != ifcThermalAdmittanceMeasure) {
			NotificationChain msgs = null;
			if (ifcThermalAdmittanceMeasure != null)
				msgs = ((InternalEObject)ifcThermalAdmittanceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_ADMITTANCE_MEASURE, null, msgs);
			if (newIfcThermalAdmittanceMeasure != null)
				msgs = ((InternalEObject)newIfcThermalAdmittanceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_ADMITTANCE_MEASURE, null, msgs);
			msgs = basicSetIfcThermalAdmittanceMeasure(newIfcThermalAdmittanceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_ADMITTANCE_MEASURE, newIfcThermalAdmittanceMeasure, newIfcThermalAdmittanceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPressureMeasureType getIfcPressureMeasure() {
		return ifcPressureMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPressureMeasure(IfcPressureMeasureType newIfcPressureMeasure, NotificationChain msgs) {
		IfcPressureMeasureType oldIfcPressureMeasure = ifcPressureMeasure;
		ifcPressureMeasure = newIfcPressureMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PRESSURE_MEASURE, oldIfcPressureMeasure, newIfcPressureMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPressureMeasure(IfcPressureMeasureType newIfcPressureMeasure) {
		if (newIfcPressureMeasure != ifcPressureMeasure) {
			NotificationChain msgs = null;
			if (ifcPressureMeasure != null)
				msgs = ((InternalEObject)ifcPressureMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PRESSURE_MEASURE, null, msgs);
			if (newIfcPressureMeasure != null)
				msgs = ((InternalEObject)newIfcPressureMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PRESSURE_MEASURE, null, msgs);
			msgs = basicSetIfcPressureMeasure(newIfcPressureMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PRESSURE_MEASURE, newIfcPressureMeasure, newIfcPressureMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPowerMeasureType getIfcPowerMeasure() {
		return ifcPowerMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPowerMeasure(IfcPowerMeasureType newIfcPowerMeasure, NotificationChain msgs) {
		IfcPowerMeasureType oldIfcPowerMeasure = ifcPowerMeasure;
		ifcPowerMeasure = newIfcPowerMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_POWER_MEASURE, oldIfcPowerMeasure, newIfcPowerMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPowerMeasure(IfcPowerMeasureType newIfcPowerMeasure) {
		if (newIfcPowerMeasure != ifcPowerMeasure) {
			NotificationChain msgs = null;
			if (ifcPowerMeasure != null)
				msgs = ((InternalEObject)ifcPowerMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_POWER_MEASURE, null, msgs);
			if (newIfcPowerMeasure != null)
				msgs = ((InternalEObject)newIfcPowerMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_POWER_MEASURE, null, msgs);
			msgs = basicSetIfcPowerMeasure(newIfcPowerMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_POWER_MEASURE, newIfcPowerMeasure, newIfcPowerMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMassFlowRateMeasureType getIfcMassFlowRateMeasure() {
		return ifcMassFlowRateMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMassFlowRateMeasure(IfcMassFlowRateMeasureType newIfcMassFlowRateMeasure, NotificationChain msgs) {
		IfcMassFlowRateMeasureType oldIfcMassFlowRateMeasure = ifcMassFlowRateMeasure;
		ifcMassFlowRateMeasure = newIfcMassFlowRateMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_FLOW_RATE_MEASURE, oldIfcMassFlowRateMeasure, newIfcMassFlowRateMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassFlowRateMeasure(IfcMassFlowRateMeasureType newIfcMassFlowRateMeasure) {
		if (newIfcMassFlowRateMeasure != ifcMassFlowRateMeasure) {
			NotificationChain msgs = null;
			if (ifcMassFlowRateMeasure != null)
				msgs = ((InternalEObject)ifcMassFlowRateMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_FLOW_RATE_MEASURE, null, msgs);
			if (newIfcMassFlowRateMeasure != null)
				msgs = ((InternalEObject)newIfcMassFlowRateMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_FLOW_RATE_MEASURE, null, msgs);
			msgs = basicSetIfcMassFlowRateMeasure(newIfcMassFlowRateMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_FLOW_RATE_MEASURE, newIfcMassFlowRateMeasure, newIfcMassFlowRateMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMassDensityMeasureType getIfcMassDensityMeasure() {
		return ifcMassDensityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMassDensityMeasure(IfcMassDensityMeasureType newIfcMassDensityMeasure, NotificationChain msgs) {
		IfcMassDensityMeasureType oldIfcMassDensityMeasure = ifcMassDensityMeasure;
		ifcMassDensityMeasure = newIfcMassDensityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_DENSITY_MEASURE, oldIfcMassDensityMeasure, newIfcMassDensityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassDensityMeasure(IfcMassDensityMeasureType newIfcMassDensityMeasure) {
		if (newIfcMassDensityMeasure != ifcMassDensityMeasure) {
			NotificationChain msgs = null;
			if (ifcMassDensityMeasure != null)
				msgs = ((InternalEObject)ifcMassDensityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_DENSITY_MEASURE, null, msgs);
			if (newIfcMassDensityMeasure != null)
				msgs = ((InternalEObject)newIfcMassDensityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_DENSITY_MEASURE, null, msgs);
			msgs = basicSetIfcMassDensityMeasure(newIfcMassDensityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_DENSITY_MEASURE, newIfcMassDensityMeasure, newIfcMassDensityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearVelocityMeasureType getIfcLinearVelocityMeasure() {
		return ifcLinearVelocityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLinearVelocityMeasure(IfcLinearVelocityMeasureType newIfcLinearVelocityMeasure, NotificationChain msgs) {
		IfcLinearVelocityMeasureType oldIfcLinearVelocityMeasure = ifcLinearVelocityMeasure;
		ifcLinearVelocityMeasure = newIfcLinearVelocityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_VELOCITY_MEASURE, oldIfcLinearVelocityMeasure, newIfcLinearVelocityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearVelocityMeasure(IfcLinearVelocityMeasureType newIfcLinearVelocityMeasure) {
		if (newIfcLinearVelocityMeasure != ifcLinearVelocityMeasure) {
			NotificationChain msgs = null;
			if (ifcLinearVelocityMeasure != null)
				msgs = ((InternalEObject)ifcLinearVelocityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_VELOCITY_MEASURE, null, msgs);
			if (newIfcLinearVelocityMeasure != null)
				msgs = ((InternalEObject)newIfcLinearVelocityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_VELOCITY_MEASURE, null, msgs);
			msgs = basicSetIfcLinearVelocityMeasure(newIfcLinearVelocityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_VELOCITY_MEASURE, newIfcLinearVelocityMeasure, newIfcLinearVelocityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcKinematicViscosityMeasureType getIfcKinematicViscosityMeasure() {
		return ifcKinematicViscosityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcKinematicViscosityMeasure(IfcKinematicViscosityMeasureType newIfcKinematicViscosityMeasure, NotificationChain msgs) {
		IfcKinematicViscosityMeasureType oldIfcKinematicViscosityMeasure = ifcKinematicViscosityMeasure;
		ifcKinematicViscosityMeasure = newIfcKinematicViscosityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_KINEMATIC_VISCOSITY_MEASURE, oldIfcKinematicViscosityMeasure, newIfcKinematicViscosityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcKinematicViscosityMeasure(IfcKinematicViscosityMeasureType newIfcKinematicViscosityMeasure) {
		if (newIfcKinematicViscosityMeasure != ifcKinematicViscosityMeasure) {
			NotificationChain msgs = null;
			if (ifcKinematicViscosityMeasure != null)
				msgs = ((InternalEObject)ifcKinematicViscosityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_KINEMATIC_VISCOSITY_MEASURE, null, msgs);
			if (newIfcKinematicViscosityMeasure != null)
				msgs = ((InternalEObject)newIfcKinematicViscosityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_KINEMATIC_VISCOSITY_MEASURE, null, msgs);
			msgs = basicSetIfcKinematicViscosityMeasure(newIfcKinematicViscosityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_KINEMATIC_VISCOSITY_MEASURE, newIfcKinematicViscosityMeasure, newIfcKinematicViscosityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIntegerCountRateMeasureType getIfcIntegerCountRateMeasure() {
		return ifcIntegerCountRateMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcIntegerCountRateMeasure(IfcIntegerCountRateMeasureType newIfcIntegerCountRateMeasure, NotificationChain msgs) {
		IfcIntegerCountRateMeasureType oldIfcIntegerCountRateMeasure = ifcIntegerCountRateMeasure;
		ifcIntegerCountRateMeasure = newIfcIntegerCountRateMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INTEGER_COUNT_RATE_MEASURE, oldIfcIntegerCountRateMeasure, newIfcIntegerCountRateMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIntegerCountRateMeasure(IfcIntegerCountRateMeasureType newIfcIntegerCountRateMeasure) {
		if (newIfcIntegerCountRateMeasure != ifcIntegerCountRateMeasure) {
			NotificationChain msgs = null;
			if (ifcIntegerCountRateMeasure != null)
				msgs = ((InternalEObject)ifcIntegerCountRateMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INTEGER_COUNT_RATE_MEASURE, null, msgs);
			if (newIfcIntegerCountRateMeasure != null)
				msgs = ((InternalEObject)newIfcIntegerCountRateMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INTEGER_COUNT_RATE_MEASURE, null, msgs);
			msgs = basicSetIfcIntegerCountRateMeasure(newIfcIntegerCountRateMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INTEGER_COUNT_RATE_MEASURE, newIfcIntegerCountRateMeasure, newIfcIntegerCountRateMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatFluxDensityMeasureType getIfcHeatFluxDensityMeasure() {
		return ifcHeatFluxDensityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcHeatFluxDensityMeasure(IfcHeatFluxDensityMeasureType newIfcHeatFluxDensityMeasure, NotificationChain msgs) {
		IfcHeatFluxDensityMeasureType oldIfcHeatFluxDensityMeasure = ifcHeatFluxDensityMeasure;
		ifcHeatFluxDensityMeasure = newIfcHeatFluxDensityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEAT_FLUX_DENSITY_MEASURE, oldIfcHeatFluxDensityMeasure, newIfcHeatFluxDensityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcHeatFluxDensityMeasure(IfcHeatFluxDensityMeasureType newIfcHeatFluxDensityMeasure) {
		if (newIfcHeatFluxDensityMeasure != ifcHeatFluxDensityMeasure) {
			NotificationChain msgs = null;
			if (ifcHeatFluxDensityMeasure != null)
				msgs = ((InternalEObject)ifcHeatFluxDensityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEAT_FLUX_DENSITY_MEASURE, null, msgs);
			if (newIfcHeatFluxDensityMeasure != null)
				msgs = ((InternalEObject)newIfcHeatFluxDensityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEAT_FLUX_DENSITY_MEASURE, null, msgs);
			msgs = basicSetIfcHeatFluxDensityMeasure(newIfcHeatFluxDensityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEAT_FLUX_DENSITY_MEASURE, newIfcHeatFluxDensityMeasure, newIfcHeatFluxDensityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFrequencyMeasureType getIfcFrequencyMeasure() {
		return ifcFrequencyMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcFrequencyMeasure(IfcFrequencyMeasureType newIfcFrequencyMeasure, NotificationChain msgs) {
		IfcFrequencyMeasureType oldIfcFrequencyMeasure = ifcFrequencyMeasure;
		ifcFrequencyMeasure = newIfcFrequencyMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FREQUENCY_MEASURE, oldIfcFrequencyMeasure, newIfcFrequencyMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcFrequencyMeasure(IfcFrequencyMeasureType newIfcFrequencyMeasure) {
		if (newIfcFrequencyMeasure != ifcFrequencyMeasure) {
			NotificationChain msgs = null;
			if (ifcFrequencyMeasure != null)
				msgs = ((InternalEObject)ifcFrequencyMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FREQUENCY_MEASURE, null, msgs);
			if (newIfcFrequencyMeasure != null)
				msgs = ((InternalEObject)newIfcFrequencyMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FREQUENCY_MEASURE, null, msgs);
			msgs = basicSetIfcFrequencyMeasure(newIfcFrequencyMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FREQUENCY_MEASURE, newIfcFrequencyMeasure, newIfcFrequencyMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnergyMeasureType getIfcEnergyMeasure() {
		return ifcEnergyMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcEnergyMeasure(IfcEnergyMeasureType newIfcEnergyMeasure, NotificationChain msgs) {
		IfcEnergyMeasureType oldIfcEnergyMeasure = ifcEnergyMeasure;
		ifcEnergyMeasure = newIfcEnergyMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ENERGY_MEASURE, oldIfcEnergyMeasure, newIfcEnergyMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcEnergyMeasure(IfcEnergyMeasureType newIfcEnergyMeasure) {
		if (newIfcEnergyMeasure != ifcEnergyMeasure) {
			NotificationChain msgs = null;
			if (ifcEnergyMeasure != null)
				msgs = ((InternalEObject)ifcEnergyMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ENERGY_MEASURE, null, msgs);
			if (newIfcEnergyMeasure != null)
				msgs = ((InternalEObject)newIfcEnergyMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ENERGY_MEASURE, null, msgs);
			msgs = basicSetIfcEnergyMeasure(newIfcEnergyMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ENERGY_MEASURE, newIfcEnergyMeasure, newIfcEnergyMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricVoltageMeasureType getIfcElectricVoltageMeasure() {
		return ifcElectricVoltageMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcElectricVoltageMeasure(IfcElectricVoltageMeasureType newIfcElectricVoltageMeasure, NotificationChain msgs) {
		IfcElectricVoltageMeasureType oldIfcElectricVoltageMeasure = ifcElectricVoltageMeasure;
		ifcElectricVoltageMeasure = newIfcElectricVoltageMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_VOLTAGE_MEASURE, oldIfcElectricVoltageMeasure, newIfcElectricVoltageMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricVoltageMeasure(IfcElectricVoltageMeasureType newIfcElectricVoltageMeasure) {
		if (newIfcElectricVoltageMeasure != ifcElectricVoltageMeasure) {
			NotificationChain msgs = null;
			if (ifcElectricVoltageMeasure != null)
				msgs = ((InternalEObject)ifcElectricVoltageMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_VOLTAGE_MEASURE, null, msgs);
			if (newIfcElectricVoltageMeasure != null)
				msgs = ((InternalEObject)newIfcElectricVoltageMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_VOLTAGE_MEASURE, null, msgs);
			msgs = basicSetIfcElectricVoltageMeasure(newIfcElectricVoltageMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_VOLTAGE_MEASURE, newIfcElectricVoltageMeasure, newIfcElectricVoltageMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDynamicViscosityMeasureType getIfcDynamicViscosityMeasure() {
		return ifcDynamicViscosityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDynamicViscosityMeasure(IfcDynamicViscosityMeasureType newIfcDynamicViscosityMeasure, NotificationChain msgs) {
		IfcDynamicViscosityMeasureType oldIfcDynamicViscosityMeasure = ifcDynamicViscosityMeasure;
		ifcDynamicViscosityMeasure = newIfcDynamicViscosityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DYNAMIC_VISCOSITY_MEASURE, oldIfcDynamicViscosityMeasure, newIfcDynamicViscosityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDynamicViscosityMeasure(IfcDynamicViscosityMeasureType newIfcDynamicViscosityMeasure) {
		if (newIfcDynamicViscosityMeasure != ifcDynamicViscosityMeasure) {
			NotificationChain msgs = null;
			if (ifcDynamicViscosityMeasure != null)
				msgs = ((InternalEObject)ifcDynamicViscosityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DYNAMIC_VISCOSITY_MEASURE, null, msgs);
			if (newIfcDynamicViscosityMeasure != null)
				msgs = ((InternalEObject)newIfcDynamicViscosityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DYNAMIC_VISCOSITY_MEASURE, null, msgs);
			msgs = basicSetIfcDynamicViscosityMeasure(newIfcDynamicViscosityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DYNAMIC_VISCOSITY_MEASURE, newIfcDynamicViscosityMeasure, newIfcDynamicViscosityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompoundPlaneAngleMeasureType getIfcCompoundPlaneAngleMeasure() {
		return ifcCompoundPlaneAngleMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCompoundPlaneAngleMeasure(IfcCompoundPlaneAngleMeasureType newIfcCompoundPlaneAngleMeasure, NotificationChain msgs) {
		IfcCompoundPlaneAngleMeasureType oldIfcCompoundPlaneAngleMeasure = ifcCompoundPlaneAngleMeasure;
		ifcCompoundPlaneAngleMeasure = newIfcCompoundPlaneAngleMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_COMPOUND_PLANE_ANGLE_MEASURE, oldIfcCompoundPlaneAngleMeasure, newIfcCompoundPlaneAngleMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCompoundPlaneAngleMeasure(IfcCompoundPlaneAngleMeasureType newIfcCompoundPlaneAngleMeasure) {
		if (newIfcCompoundPlaneAngleMeasure != ifcCompoundPlaneAngleMeasure) {
			NotificationChain msgs = null;
			if (ifcCompoundPlaneAngleMeasure != null)
				msgs = ((InternalEObject)ifcCompoundPlaneAngleMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_COMPOUND_PLANE_ANGLE_MEASURE, null, msgs);
			if (newIfcCompoundPlaneAngleMeasure != null)
				msgs = ((InternalEObject)newIfcCompoundPlaneAngleMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_COMPOUND_PLANE_ANGLE_MEASURE, null, msgs);
			msgs = basicSetIfcCompoundPlaneAngleMeasure(newIfcCompoundPlaneAngleMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_COMPOUND_PLANE_ANGLE_MEASURE, newIfcCompoundPlaneAngleMeasure, newIfcCompoundPlaneAngleMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAngularVelocityMeasureType getIfcAngularVelocityMeasure() {
		return ifcAngularVelocityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAngularVelocityMeasure(IfcAngularVelocityMeasureType newIfcAngularVelocityMeasure, NotificationChain msgs) {
		IfcAngularVelocityMeasureType oldIfcAngularVelocityMeasure = ifcAngularVelocityMeasure;
		ifcAngularVelocityMeasure = newIfcAngularVelocityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ANGULAR_VELOCITY_MEASURE, oldIfcAngularVelocityMeasure, newIfcAngularVelocityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAngularVelocityMeasure(IfcAngularVelocityMeasureType newIfcAngularVelocityMeasure) {
		if (newIfcAngularVelocityMeasure != ifcAngularVelocityMeasure) {
			NotificationChain msgs = null;
			if (ifcAngularVelocityMeasure != null)
				msgs = ((InternalEObject)ifcAngularVelocityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ANGULAR_VELOCITY_MEASURE, null, msgs);
			if (newIfcAngularVelocityMeasure != null)
				msgs = ((InternalEObject)newIfcAngularVelocityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ANGULAR_VELOCITY_MEASURE, null, msgs);
			msgs = basicSetIfcAngularVelocityMeasure(newIfcAngularVelocityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ANGULAR_VELOCITY_MEASURE, newIfcAngularVelocityMeasure, newIfcAngularVelocityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalConductivityMeasureType getIfcThermalConductivityMeasure() {
		return ifcThermalConductivityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcThermalConductivityMeasure(IfcThermalConductivityMeasureType newIfcThermalConductivityMeasure, NotificationChain msgs) {
		IfcThermalConductivityMeasureType oldIfcThermalConductivityMeasure = ifcThermalConductivityMeasure;
		ifcThermalConductivityMeasure = newIfcThermalConductivityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_CONDUCTIVITY_MEASURE, oldIfcThermalConductivityMeasure, newIfcThermalConductivityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalConductivityMeasure(IfcThermalConductivityMeasureType newIfcThermalConductivityMeasure) {
		if (newIfcThermalConductivityMeasure != ifcThermalConductivityMeasure) {
			NotificationChain msgs = null;
			if (ifcThermalConductivityMeasure != null)
				msgs = ((InternalEObject)ifcThermalConductivityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_CONDUCTIVITY_MEASURE, null, msgs);
			if (newIfcThermalConductivityMeasure != null)
				msgs = ((InternalEObject)newIfcThermalConductivityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_CONDUCTIVITY_MEASURE, null, msgs);
			msgs = basicSetIfcThermalConductivityMeasure(newIfcThermalConductivityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_CONDUCTIVITY_MEASURE, newIfcThermalConductivityMeasure, newIfcThermalConductivityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMolecularWeightMeasureType getIfcMolecularWeightMeasure() {
		return ifcMolecularWeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMolecularWeightMeasure(IfcMolecularWeightMeasureType newIfcMolecularWeightMeasure, NotificationChain msgs) {
		IfcMolecularWeightMeasureType oldIfcMolecularWeightMeasure = ifcMolecularWeightMeasure;
		ifcMolecularWeightMeasure = newIfcMolecularWeightMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOLECULAR_WEIGHT_MEASURE, oldIfcMolecularWeightMeasure, newIfcMolecularWeightMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMolecularWeightMeasure(IfcMolecularWeightMeasureType newIfcMolecularWeightMeasure) {
		if (newIfcMolecularWeightMeasure != ifcMolecularWeightMeasure) {
			NotificationChain msgs = null;
			if (ifcMolecularWeightMeasure != null)
				msgs = ((InternalEObject)ifcMolecularWeightMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOLECULAR_WEIGHT_MEASURE, null, msgs);
			if (newIfcMolecularWeightMeasure != null)
				msgs = ((InternalEObject)newIfcMolecularWeightMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOLECULAR_WEIGHT_MEASURE, null, msgs);
			msgs = basicSetIfcMolecularWeightMeasure(newIfcMolecularWeightMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOLECULAR_WEIGHT_MEASURE, newIfcMolecularWeightMeasure, newIfcMolecularWeightMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVaporPermeabilityMeasureType getIfcVaporPermeabilityMeasure() {
		return ifcVaporPermeabilityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcVaporPermeabilityMeasure(IfcVaporPermeabilityMeasureType newIfcVaporPermeabilityMeasure, NotificationChain msgs) {
		IfcVaporPermeabilityMeasureType oldIfcVaporPermeabilityMeasure = ifcVaporPermeabilityMeasure;
		ifcVaporPermeabilityMeasure = newIfcVaporPermeabilityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VAPOR_PERMEABILITY_MEASURE, oldIfcVaporPermeabilityMeasure, newIfcVaporPermeabilityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVaporPermeabilityMeasure(IfcVaporPermeabilityMeasureType newIfcVaporPermeabilityMeasure) {
		if (newIfcVaporPermeabilityMeasure != ifcVaporPermeabilityMeasure) {
			NotificationChain msgs = null;
			if (ifcVaporPermeabilityMeasure != null)
				msgs = ((InternalEObject)ifcVaporPermeabilityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VAPOR_PERMEABILITY_MEASURE, null, msgs);
			if (newIfcVaporPermeabilityMeasure != null)
				msgs = ((InternalEObject)newIfcVaporPermeabilityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VAPOR_PERMEABILITY_MEASURE, null, msgs);
			msgs = basicSetIfcVaporPermeabilityMeasure(newIfcVaporPermeabilityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VAPOR_PERMEABILITY_MEASURE, newIfcVaporPermeabilityMeasure, newIfcVaporPermeabilityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMoistureDiffusivityMeasureType getIfcMoistureDiffusivityMeasure() {
		return ifcMoistureDiffusivityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMoistureDiffusivityMeasure(IfcMoistureDiffusivityMeasureType newIfcMoistureDiffusivityMeasure, NotificationChain msgs) {
		IfcMoistureDiffusivityMeasureType oldIfcMoistureDiffusivityMeasure = ifcMoistureDiffusivityMeasure;
		ifcMoistureDiffusivityMeasure = newIfcMoistureDiffusivityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOISTURE_DIFFUSIVITY_MEASURE, oldIfcMoistureDiffusivityMeasure, newIfcMoistureDiffusivityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMoistureDiffusivityMeasure(IfcMoistureDiffusivityMeasureType newIfcMoistureDiffusivityMeasure) {
		if (newIfcMoistureDiffusivityMeasure != ifcMoistureDiffusivityMeasure) {
			NotificationChain msgs = null;
			if (ifcMoistureDiffusivityMeasure != null)
				msgs = ((InternalEObject)ifcMoistureDiffusivityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOISTURE_DIFFUSIVITY_MEASURE, null, msgs);
			if (newIfcMoistureDiffusivityMeasure != null)
				msgs = ((InternalEObject)newIfcMoistureDiffusivityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOISTURE_DIFFUSIVITY_MEASURE, null, msgs);
			msgs = basicSetIfcMoistureDiffusivityMeasure(newIfcMoistureDiffusivityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOISTURE_DIFFUSIVITY_MEASURE, newIfcMoistureDiffusivityMeasure, newIfcMoistureDiffusivityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIsothermalMoistureCapacityMeasureType getIfcIsothermalMoistureCapacityMeasure() {
		return ifcIsothermalMoistureCapacityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcIsothermalMoistureCapacityMeasure(IfcIsothermalMoistureCapacityMeasureType newIfcIsothermalMoistureCapacityMeasure, NotificationChain msgs) {
		IfcIsothermalMoistureCapacityMeasureType oldIfcIsothermalMoistureCapacityMeasure = ifcIsothermalMoistureCapacityMeasure;
		ifcIsothermalMoistureCapacityMeasure = newIfcIsothermalMoistureCapacityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE, oldIfcIsothermalMoistureCapacityMeasure, newIfcIsothermalMoistureCapacityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIsothermalMoistureCapacityMeasure(IfcIsothermalMoistureCapacityMeasureType newIfcIsothermalMoistureCapacityMeasure) {
		if (newIfcIsothermalMoistureCapacityMeasure != ifcIsothermalMoistureCapacityMeasure) {
			NotificationChain msgs = null;
			if (ifcIsothermalMoistureCapacityMeasure != null)
				msgs = ((InternalEObject)ifcIsothermalMoistureCapacityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE, null, msgs);
			if (newIfcIsothermalMoistureCapacityMeasure != null)
				msgs = ((InternalEObject)newIfcIsothermalMoistureCapacityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE, null, msgs);
			msgs = basicSetIfcIsothermalMoistureCapacityMeasure(newIfcIsothermalMoistureCapacityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE, newIfcIsothermalMoistureCapacityMeasure, newIfcIsothermalMoistureCapacityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecificHeatCapacityMeasureType getIfcSpecificHeatCapacityMeasure() {
		return ifcSpecificHeatCapacityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSpecificHeatCapacityMeasure(IfcSpecificHeatCapacityMeasureType newIfcSpecificHeatCapacityMeasure, NotificationChain msgs) {
		IfcSpecificHeatCapacityMeasureType oldIfcSpecificHeatCapacityMeasure = ifcSpecificHeatCapacityMeasure;
		ifcSpecificHeatCapacityMeasure = newIfcSpecificHeatCapacityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE, oldIfcSpecificHeatCapacityMeasure, newIfcSpecificHeatCapacityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSpecificHeatCapacityMeasure(IfcSpecificHeatCapacityMeasureType newIfcSpecificHeatCapacityMeasure) {
		if (newIfcSpecificHeatCapacityMeasure != ifcSpecificHeatCapacityMeasure) {
			NotificationChain msgs = null;
			if (ifcSpecificHeatCapacityMeasure != null)
				msgs = ((InternalEObject)ifcSpecificHeatCapacityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE, null, msgs);
			if (newIfcSpecificHeatCapacityMeasure != null)
				msgs = ((InternalEObject)newIfcSpecificHeatCapacityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE, null, msgs);
			msgs = basicSetIfcSpecificHeatCapacityMeasure(newIfcSpecificHeatCapacityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE, newIfcSpecificHeatCapacityMeasure, newIfcSpecificHeatCapacityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryMeasureType getIfcMonetaryMeasure() {
		return ifcMonetaryMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMonetaryMeasure(IfcMonetaryMeasureType newIfcMonetaryMeasure, NotificationChain msgs) {
		IfcMonetaryMeasureType oldIfcMonetaryMeasure = ifcMonetaryMeasure;
		ifcMonetaryMeasure = newIfcMonetaryMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MONETARY_MEASURE, oldIfcMonetaryMeasure, newIfcMonetaryMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMonetaryMeasure(IfcMonetaryMeasureType newIfcMonetaryMeasure) {
		if (newIfcMonetaryMeasure != ifcMonetaryMeasure) {
			NotificationChain msgs = null;
			if (ifcMonetaryMeasure != null)
				msgs = ((InternalEObject)ifcMonetaryMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MONETARY_MEASURE, null, msgs);
			if (newIfcMonetaryMeasure != null)
				msgs = ((InternalEObject)newIfcMonetaryMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MONETARY_MEASURE, null, msgs);
			msgs = basicSetIfcMonetaryMeasure(newIfcMonetaryMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MONETARY_MEASURE, newIfcMonetaryMeasure, newIfcMonetaryMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMagneticFluxDensityMeasureType getIfcMagneticFluxDensityMeasure() {
		return ifcMagneticFluxDensityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMagneticFluxDensityMeasure(IfcMagneticFluxDensityMeasureType newIfcMagneticFluxDensityMeasure, NotificationChain msgs) {
		IfcMagneticFluxDensityMeasureType oldIfcMagneticFluxDensityMeasure = ifcMagneticFluxDensityMeasure;
		ifcMagneticFluxDensityMeasure = newIfcMagneticFluxDensityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE, oldIfcMagneticFluxDensityMeasure, newIfcMagneticFluxDensityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMagneticFluxDensityMeasure(IfcMagneticFluxDensityMeasureType newIfcMagneticFluxDensityMeasure) {
		if (newIfcMagneticFluxDensityMeasure != ifcMagneticFluxDensityMeasure) {
			NotificationChain msgs = null;
			if (ifcMagneticFluxDensityMeasure != null)
				msgs = ((InternalEObject)ifcMagneticFluxDensityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE, null, msgs);
			if (newIfcMagneticFluxDensityMeasure != null)
				msgs = ((InternalEObject)newIfcMagneticFluxDensityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE, null, msgs);
			msgs = basicSetIfcMagneticFluxDensityMeasure(newIfcMagneticFluxDensityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE, newIfcMagneticFluxDensityMeasure, newIfcMagneticFluxDensityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMagneticFluxMeasureType getIfcMagneticFluxMeasure() {
		return ifcMagneticFluxMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMagneticFluxMeasure(IfcMagneticFluxMeasureType newIfcMagneticFluxMeasure, NotificationChain msgs) {
		IfcMagneticFluxMeasureType oldIfcMagneticFluxMeasure = ifcMagneticFluxMeasure;
		ifcMagneticFluxMeasure = newIfcMagneticFluxMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_MEASURE, oldIfcMagneticFluxMeasure, newIfcMagneticFluxMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMagneticFluxMeasure(IfcMagneticFluxMeasureType newIfcMagneticFluxMeasure) {
		if (newIfcMagneticFluxMeasure != ifcMagneticFluxMeasure) {
			NotificationChain msgs = null;
			if (ifcMagneticFluxMeasure != null)
				msgs = ((InternalEObject)ifcMagneticFluxMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_MEASURE, null, msgs);
			if (newIfcMagneticFluxMeasure != null)
				msgs = ((InternalEObject)newIfcMagneticFluxMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_MEASURE, null, msgs);
			msgs = basicSetIfcMagneticFluxMeasure(newIfcMagneticFluxMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_MEASURE, newIfcMagneticFluxMeasure, newIfcMagneticFluxMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLuminousFluxMeasureType getIfcLuminousFluxMeasure() {
		return ifcLuminousFluxMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLuminousFluxMeasure(IfcLuminousFluxMeasureType newIfcLuminousFluxMeasure, NotificationChain msgs) {
		IfcLuminousFluxMeasureType oldIfcLuminousFluxMeasure = ifcLuminousFluxMeasure;
		ifcLuminousFluxMeasure = newIfcLuminousFluxMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_FLUX_MEASURE, oldIfcLuminousFluxMeasure, newIfcLuminousFluxMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLuminousFluxMeasure(IfcLuminousFluxMeasureType newIfcLuminousFluxMeasure) {
		if (newIfcLuminousFluxMeasure != ifcLuminousFluxMeasure) {
			NotificationChain msgs = null;
			if (ifcLuminousFluxMeasure != null)
				msgs = ((InternalEObject)ifcLuminousFluxMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_FLUX_MEASURE, null, msgs);
			if (newIfcLuminousFluxMeasure != null)
				msgs = ((InternalEObject)newIfcLuminousFluxMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_FLUX_MEASURE, null, msgs);
			msgs = basicSetIfcLuminousFluxMeasure(newIfcLuminousFluxMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_FLUX_MEASURE, newIfcLuminousFluxMeasure, newIfcLuminousFluxMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasureType getIfcForceMeasure() {
		return ifcForceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcForceMeasure(IfcForceMeasureType newIfcForceMeasure, NotificationChain msgs) {
		IfcForceMeasureType oldIfcForceMeasure = ifcForceMeasure;
		ifcForceMeasure = newIfcForceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FORCE_MEASURE, oldIfcForceMeasure, newIfcForceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcForceMeasure(IfcForceMeasureType newIfcForceMeasure) {
		if (newIfcForceMeasure != ifcForceMeasure) {
			NotificationChain msgs = null;
			if (ifcForceMeasure != null)
				msgs = ((InternalEObject)ifcForceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FORCE_MEASURE, null, msgs);
			if (newIfcForceMeasure != null)
				msgs = ((InternalEObject)newIfcForceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FORCE_MEASURE, null, msgs);
			msgs = basicSetIfcForceMeasure(newIfcForceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FORCE_MEASURE, newIfcForceMeasure, newIfcForceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInductanceMeasureType getIfcInductanceMeasure() {
		return ifcInductanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcInductanceMeasure(IfcInductanceMeasureType newIfcInductanceMeasure, NotificationChain msgs) {
		IfcInductanceMeasureType oldIfcInductanceMeasure = ifcInductanceMeasure;
		ifcInductanceMeasure = newIfcInductanceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INDUCTANCE_MEASURE, oldIfcInductanceMeasure, newIfcInductanceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcInductanceMeasure(IfcInductanceMeasureType newIfcInductanceMeasure) {
		if (newIfcInductanceMeasure != ifcInductanceMeasure) {
			NotificationChain msgs = null;
			if (ifcInductanceMeasure != null)
				msgs = ((InternalEObject)ifcInductanceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INDUCTANCE_MEASURE, null, msgs);
			if (newIfcInductanceMeasure != null)
				msgs = ((InternalEObject)newIfcInductanceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INDUCTANCE_MEASURE, null, msgs);
			msgs = basicSetIfcInductanceMeasure(newIfcInductanceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INDUCTANCE_MEASURE, newIfcInductanceMeasure, newIfcInductanceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIlluminanceMeasureType getIfcIlluminanceMeasure() {
		return ifcIlluminanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcIlluminanceMeasure(IfcIlluminanceMeasureType newIfcIlluminanceMeasure, NotificationChain msgs) {
		IfcIlluminanceMeasureType oldIfcIlluminanceMeasure = ifcIlluminanceMeasure;
		ifcIlluminanceMeasure = newIfcIlluminanceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ILLUMINANCE_MEASURE, oldIfcIlluminanceMeasure, newIfcIlluminanceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIlluminanceMeasure(IfcIlluminanceMeasureType newIfcIlluminanceMeasure) {
		if (newIfcIlluminanceMeasure != ifcIlluminanceMeasure) {
			NotificationChain msgs = null;
			if (ifcIlluminanceMeasure != null)
				msgs = ((InternalEObject)ifcIlluminanceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ILLUMINANCE_MEASURE, null, msgs);
			if (newIfcIlluminanceMeasure != null)
				msgs = ((InternalEObject)newIfcIlluminanceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ILLUMINANCE_MEASURE, null, msgs);
			msgs = basicSetIfcIlluminanceMeasure(newIfcIlluminanceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ILLUMINANCE_MEASURE, newIfcIlluminanceMeasure, newIfcIlluminanceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricResistanceMeasureType getIfcElectricResistanceMeasure() {
		return ifcElectricResistanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcElectricResistanceMeasure(IfcElectricResistanceMeasureType newIfcElectricResistanceMeasure, NotificationChain msgs) {
		IfcElectricResistanceMeasureType oldIfcElectricResistanceMeasure = ifcElectricResistanceMeasure;
		ifcElectricResistanceMeasure = newIfcElectricResistanceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_RESISTANCE_MEASURE, oldIfcElectricResistanceMeasure, newIfcElectricResistanceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricResistanceMeasure(IfcElectricResistanceMeasureType newIfcElectricResistanceMeasure) {
		if (newIfcElectricResistanceMeasure != ifcElectricResistanceMeasure) {
			NotificationChain msgs = null;
			if (ifcElectricResistanceMeasure != null)
				msgs = ((InternalEObject)ifcElectricResistanceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_RESISTANCE_MEASURE, null, msgs);
			if (newIfcElectricResistanceMeasure != null)
				msgs = ((InternalEObject)newIfcElectricResistanceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_RESISTANCE_MEASURE, null, msgs);
			msgs = basicSetIfcElectricResistanceMeasure(newIfcElectricResistanceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_RESISTANCE_MEASURE, newIfcElectricResistanceMeasure, newIfcElectricResistanceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricConductanceMeasureType getIfcElectricConductanceMeasure() {
		return ifcElectricConductanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcElectricConductanceMeasure(IfcElectricConductanceMeasureType newIfcElectricConductanceMeasure, NotificationChain msgs) {
		IfcElectricConductanceMeasureType oldIfcElectricConductanceMeasure = ifcElectricConductanceMeasure;
		ifcElectricConductanceMeasure = newIfcElectricConductanceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CONDUCTANCE_MEASURE, oldIfcElectricConductanceMeasure, newIfcElectricConductanceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricConductanceMeasure(IfcElectricConductanceMeasureType newIfcElectricConductanceMeasure) {
		if (newIfcElectricConductanceMeasure != ifcElectricConductanceMeasure) {
			NotificationChain msgs = null;
			if (ifcElectricConductanceMeasure != null)
				msgs = ((InternalEObject)ifcElectricConductanceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CONDUCTANCE_MEASURE, null, msgs);
			if (newIfcElectricConductanceMeasure != null)
				msgs = ((InternalEObject)newIfcElectricConductanceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CONDUCTANCE_MEASURE, null, msgs);
			msgs = basicSetIfcElectricConductanceMeasure(newIfcElectricConductanceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CONDUCTANCE_MEASURE, newIfcElectricConductanceMeasure, newIfcElectricConductanceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricChargeMeasureType getIfcElectricChargeMeasure() {
		return ifcElectricChargeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcElectricChargeMeasure(IfcElectricChargeMeasureType newIfcElectricChargeMeasure, NotificationChain msgs) {
		IfcElectricChargeMeasureType oldIfcElectricChargeMeasure = ifcElectricChargeMeasure;
		ifcElectricChargeMeasure = newIfcElectricChargeMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CHARGE_MEASURE, oldIfcElectricChargeMeasure, newIfcElectricChargeMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricChargeMeasure(IfcElectricChargeMeasureType newIfcElectricChargeMeasure) {
		if (newIfcElectricChargeMeasure != ifcElectricChargeMeasure) {
			NotificationChain msgs = null;
			if (ifcElectricChargeMeasure != null)
				msgs = ((InternalEObject)ifcElectricChargeMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CHARGE_MEASURE, null, msgs);
			if (newIfcElectricChargeMeasure != null)
				msgs = ((InternalEObject)newIfcElectricChargeMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CHARGE_MEASURE, null, msgs);
			msgs = basicSetIfcElectricChargeMeasure(newIfcElectricChargeMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CHARGE_MEASURE, newIfcElectricChargeMeasure, newIfcElectricChargeMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoseEquivalentMeasureType getIfcDoseEquivalentMeasure() {
		return ifcDoseEquivalentMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDoseEquivalentMeasure(IfcDoseEquivalentMeasureType newIfcDoseEquivalentMeasure, NotificationChain msgs) {
		IfcDoseEquivalentMeasureType oldIfcDoseEquivalentMeasure = ifcDoseEquivalentMeasure;
		ifcDoseEquivalentMeasure = newIfcDoseEquivalentMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DOSE_EQUIVALENT_MEASURE, oldIfcDoseEquivalentMeasure, newIfcDoseEquivalentMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDoseEquivalentMeasure(IfcDoseEquivalentMeasureType newIfcDoseEquivalentMeasure) {
		if (newIfcDoseEquivalentMeasure != ifcDoseEquivalentMeasure) {
			NotificationChain msgs = null;
			if (ifcDoseEquivalentMeasure != null)
				msgs = ((InternalEObject)ifcDoseEquivalentMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DOSE_EQUIVALENT_MEASURE, null, msgs);
			if (newIfcDoseEquivalentMeasure != null)
				msgs = ((InternalEObject)newIfcDoseEquivalentMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DOSE_EQUIVALENT_MEASURE, null, msgs);
			msgs = basicSetIfcDoseEquivalentMeasure(newIfcDoseEquivalentMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DOSE_EQUIVALENT_MEASURE, newIfcDoseEquivalentMeasure, newIfcDoseEquivalentMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCapacitanceMeasureType getIfcElectricCapacitanceMeasure() {
		return ifcElectricCapacitanceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcElectricCapacitanceMeasure(IfcElectricCapacitanceMeasureType newIfcElectricCapacitanceMeasure, NotificationChain msgs) {
		IfcElectricCapacitanceMeasureType oldIfcElectricCapacitanceMeasure = ifcElectricCapacitanceMeasure;
		ifcElectricCapacitanceMeasure = newIfcElectricCapacitanceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CAPACITANCE_MEASURE, oldIfcElectricCapacitanceMeasure, newIfcElectricCapacitanceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcElectricCapacitanceMeasure(IfcElectricCapacitanceMeasureType newIfcElectricCapacitanceMeasure) {
		if (newIfcElectricCapacitanceMeasure != ifcElectricCapacitanceMeasure) {
			NotificationChain msgs = null;
			if (ifcElectricCapacitanceMeasure != null)
				msgs = ((InternalEObject)ifcElectricCapacitanceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CAPACITANCE_MEASURE, null, msgs);
			if (newIfcElectricCapacitanceMeasure != null)
				msgs = ((InternalEObject)newIfcElectricCapacitanceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CAPACITANCE_MEASURE, null, msgs);
			msgs = basicSetIfcElectricCapacitanceMeasure(newIfcElectricCapacitanceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CAPACITANCE_MEASURE, newIfcElectricCapacitanceMeasure, newIfcElectricCapacitanceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAbsorbedDoseMeasureType getIfcAbsorbedDoseMeasure() {
		return ifcAbsorbedDoseMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAbsorbedDoseMeasure(IfcAbsorbedDoseMeasureType newIfcAbsorbedDoseMeasure, NotificationChain msgs) {
		IfcAbsorbedDoseMeasureType oldIfcAbsorbedDoseMeasure = ifcAbsorbedDoseMeasure;
		ifcAbsorbedDoseMeasure = newIfcAbsorbedDoseMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ABSORBED_DOSE_MEASURE, oldIfcAbsorbedDoseMeasure, newIfcAbsorbedDoseMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAbsorbedDoseMeasure(IfcAbsorbedDoseMeasureType newIfcAbsorbedDoseMeasure) {
		if (newIfcAbsorbedDoseMeasure != ifcAbsorbedDoseMeasure) {
			NotificationChain msgs = null;
			if (ifcAbsorbedDoseMeasure != null)
				msgs = ((InternalEObject)ifcAbsorbedDoseMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ABSORBED_DOSE_MEASURE, null, msgs);
			if (newIfcAbsorbedDoseMeasure != null)
				msgs = ((InternalEObject)newIfcAbsorbedDoseMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ABSORBED_DOSE_MEASURE, null, msgs);
			msgs = basicSetIfcAbsorbedDoseMeasure(newIfcAbsorbedDoseMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ABSORBED_DOSE_MEASURE, newIfcAbsorbedDoseMeasure, newIfcAbsorbedDoseMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRadioActivityMeasureType getIfcRadioActivityMeasure() {
		return ifcRadioActivityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRadioActivityMeasure(IfcRadioActivityMeasureType newIfcRadioActivityMeasure, NotificationChain msgs) {
		IfcRadioActivityMeasureType oldIfcRadioActivityMeasure = ifcRadioActivityMeasure;
		ifcRadioActivityMeasure = newIfcRadioActivityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_RADIO_ACTIVITY_MEASURE, oldIfcRadioActivityMeasure, newIfcRadioActivityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRadioActivityMeasure(IfcRadioActivityMeasureType newIfcRadioActivityMeasure) {
		if (newIfcRadioActivityMeasure != ifcRadioActivityMeasure) {
			NotificationChain msgs = null;
			if (ifcRadioActivityMeasure != null)
				msgs = ((InternalEObject)ifcRadioActivityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_RADIO_ACTIVITY_MEASURE, null, msgs);
			if (newIfcRadioActivityMeasure != null)
				msgs = ((InternalEObject)newIfcRadioActivityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_RADIO_ACTIVITY_MEASURE, null, msgs);
			msgs = basicSetIfcRadioActivityMeasure(newIfcRadioActivityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_RADIO_ACTIVITY_MEASURE, newIfcRadioActivityMeasure, newIfcRadioActivityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRotationalFrequencyMeasureType getIfcRotationalFrequencyMeasure() {
		return ifcRotationalFrequencyMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRotationalFrequencyMeasure(IfcRotationalFrequencyMeasureType newIfcRotationalFrequencyMeasure, NotificationChain msgs) {
		IfcRotationalFrequencyMeasureType oldIfcRotationalFrequencyMeasure = ifcRotationalFrequencyMeasure;
		ifcRotationalFrequencyMeasure = newIfcRotationalFrequencyMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_FREQUENCY_MEASURE, oldIfcRotationalFrequencyMeasure, newIfcRotationalFrequencyMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRotationalFrequencyMeasure(IfcRotationalFrequencyMeasureType newIfcRotationalFrequencyMeasure) {
		if (newIfcRotationalFrequencyMeasure != ifcRotationalFrequencyMeasure) {
			NotificationChain msgs = null;
			if (ifcRotationalFrequencyMeasure != null)
				msgs = ((InternalEObject)ifcRotationalFrequencyMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_FREQUENCY_MEASURE, null, msgs);
			if (newIfcRotationalFrequencyMeasure != null)
				msgs = ((InternalEObject)newIfcRotationalFrequencyMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_FREQUENCY_MEASURE, null, msgs);
			msgs = basicSetIfcRotationalFrequencyMeasure(newIfcRotationalFrequencyMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_FREQUENCY_MEASURE, newIfcRotationalFrequencyMeasure, newIfcRotationalFrequencyMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTorqueMeasureType getIfcTorqueMeasure() {
		return ifcTorqueMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTorqueMeasure(IfcTorqueMeasureType newIfcTorqueMeasure, NotificationChain msgs) {
		IfcTorqueMeasureType oldIfcTorqueMeasure = ifcTorqueMeasure;
		ifcTorqueMeasure = newIfcTorqueMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TORQUE_MEASURE, oldIfcTorqueMeasure, newIfcTorqueMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTorqueMeasure(IfcTorqueMeasureType newIfcTorqueMeasure) {
		if (newIfcTorqueMeasure != ifcTorqueMeasure) {
			NotificationChain msgs = null;
			if (ifcTorqueMeasure != null)
				msgs = ((InternalEObject)ifcTorqueMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TORQUE_MEASURE, null, msgs);
			if (newIfcTorqueMeasure != null)
				msgs = ((InternalEObject)newIfcTorqueMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TORQUE_MEASURE, null, msgs);
			msgs = basicSetIfcTorqueMeasure(newIfcTorqueMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TORQUE_MEASURE, newIfcTorqueMeasure, newIfcTorqueMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAccelerationMeasureType getIfcAccelerationMeasure() {
		return ifcAccelerationMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAccelerationMeasure(IfcAccelerationMeasureType newIfcAccelerationMeasure, NotificationChain msgs) {
		IfcAccelerationMeasureType oldIfcAccelerationMeasure = ifcAccelerationMeasure;
		ifcAccelerationMeasure = newIfcAccelerationMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ACCELERATION_MEASURE, oldIfcAccelerationMeasure, newIfcAccelerationMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAccelerationMeasure(IfcAccelerationMeasureType newIfcAccelerationMeasure) {
		if (newIfcAccelerationMeasure != ifcAccelerationMeasure) {
			NotificationChain msgs = null;
			if (ifcAccelerationMeasure != null)
				msgs = ((InternalEObject)ifcAccelerationMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ACCELERATION_MEASURE, null, msgs);
			if (newIfcAccelerationMeasure != null)
				msgs = ((InternalEObject)newIfcAccelerationMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ACCELERATION_MEASURE, null, msgs);
			msgs = basicSetIfcAccelerationMeasure(newIfcAccelerationMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ACCELERATION_MEASURE, newIfcAccelerationMeasure, newIfcAccelerationMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearForceMeasureType getIfcLinearForceMeasure() {
		return ifcLinearForceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLinearForceMeasure(IfcLinearForceMeasureType newIfcLinearForceMeasure, NotificationChain msgs) {
		IfcLinearForceMeasureType oldIfcLinearForceMeasure = ifcLinearForceMeasure;
		ifcLinearForceMeasure = newIfcLinearForceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_FORCE_MEASURE, oldIfcLinearForceMeasure, newIfcLinearForceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearForceMeasure(IfcLinearForceMeasureType newIfcLinearForceMeasure) {
		if (newIfcLinearForceMeasure != ifcLinearForceMeasure) {
			NotificationChain msgs = null;
			if (ifcLinearForceMeasure != null)
				msgs = ((InternalEObject)ifcLinearForceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_FORCE_MEASURE, null, msgs);
			if (newIfcLinearForceMeasure != null)
				msgs = ((InternalEObject)newIfcLinearForceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_FORCE_MEASURE, null, msgs);
			msgs = basicSetIfcLinearForceMeasure(newIfcLinearForceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_FORCE_MEASURE, newIfcLinearForceMeasure, newIfcLinearForceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearStiffnessMeasureType getIfcLinearStiffnessMeasure() {
		return ifcLinearStiffnessMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLinearStiffnessMeasure(IfcLinearStiffnessMeasureType newIfcLinearStiffnessMeasure, NotificationChain msgs) {
		IfcLinearStiffnessMeasureType oldIfcLinearStiffnessMeasure = ifcLinearStiffnessMeasure;
		ifcLinearStiffnessMeasure = newIfcLinearStiffnessMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_STIFFNESS_MEASURE, oldIfcLinearStiffnessMeasure, newIfcLinearStiffnessMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearStiffnessMeasure(IfcLinearStiffnessMeasureType newIfcLinearStiffnessMeasure) {
		if (newIfcLinearStiffnessMeasure != ifcLinearStiffnessMeasure) {
			NotificationChain msgs = null;
			if (ifcLinearStiffnessMeasure != null)
				msgs = ((InternalEObject)ifcLinearStiffnessMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_STIFFNESS_MEASURE, null, msgs);
			if (newIfcLinearStiffnessMeasure != null)
				msgs = ((InternalEObject)newIfcLinearStiffnessMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_STIFFNESS_MEASURE, null, msgs);
			msgs = basicSetIfcLinearStiffnessMeasure(newIfcLinearStiffnessMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_STIFFNESS_MEASURE, newIfcLinearStiffnessMeasure, newIfcLinearStiffnessMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfSubgradeReactionMeasureType getIfcModulusOfSubgradeReactionMeasure() {
		return ifcModulusOfSubgradeReactionMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcModulusOfSubgradeReactionMeasure(IfcModulusOfSubgradeReactionMeasureType newIfcModulusOfSubgradeReactionMeasure, NotificationChain msgs) {
		IfcModulusOfSubgradeReactionMeasureType oldIfcModulusOfSubgradeReactionMeasure = ifcModulusOfSubgradeReactionMeasure;
		ifcModulusOfSubgradeReactionMeasure = newIfcModulusOfSubgradeReactionMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE, oldIfcModulusOfSubgradeReactionMeasure, newIfcModulusOfSubgradeReactionMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfSubgradeReactionMeasure(IfcModulusOfSubgradeReactionMeasureType newIfcModulusOfSubgradeReactionMeasure) {
		if (newIfcModulusOfSubgradeReactionMeasure != ifcModulusOfSubgradeReactionMeasure) {
			NotificationChain msgs = null;
			if (ifcModulusOfSubgradeReactionMeasure != null)
				msgs = ((InternalEObject)ifcModulusOfSubgradeReactionMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE, null, msgs);
			if (newIfcModulusOfSubgradeReactionMeasure != null)
				msgs = ((InternalEObject)newIfcModulusOfSubgradeReactionMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE, null, msgs);
			msgs = basicSetIfcModulusOfSubgradeReactionMeasure(newIfcModulusOfSubgradeReactionMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE, newIfcModulusOfSubgradeReactionMeasure, newIfcModulusOfSubgradeReactionMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfElasticityMeasureType getIfcModulusOfElasticityMeasure() {
		return ifcModulusOfElasticityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcModulusOfElasticityMeasure(IfcModulusOfElasticityMeasureType newIfcModulusOfElasticityMeasure, NotificationChain msgs) {
		IfcModulusOfElasticityMeasureType oldIfcModulusOfElasticityMeasure = ifcModulusOfElasticityMeasure;
		ifcModulusOfElasticityMeasure = newIfcModulusOfElasticityMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ELASTICITY_MEASURE, oldIfcModulusOfElasticityMeasure, newIfcModulusOfElasticityMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfElasticityMeasure(IfcModulusOfElasticityMeasureType newIfcModulusOfElasticityMeasure) {
		if (newIfcModulusOfElasticityMeasure != ifcModulusOfElasticityMeasure) {
			NotificationChain msgs = null;
			if (ifcModulusOfElasticityMeasure != null)
				msgs = ((InternalEObject)ifcModulusOfElasticityMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ELASTICITY_MEASURE, null, msgs);
			if (newIfcModulusOfElasticityMeasure != null)
				msgs = ((InternalEObject)newIfcModulusOfElasticityMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ELASTICITY_MEASURE, null, msgs);
			msgs = basicSetIfcModulusOfElasticityMeasure(newIfcModulusOfElasticityMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ELASTICITY_MEASURE, newIfcModulusOfElasticityMeasure, newIfcModulusOfElasticityMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMomentOfInertiaMeasureType getIfcMomentOfInertiaMeasure() {
		return ifcMomentOfInertiaMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMomentOfInertiaMeasure(IfcMomentOfInertiaMeasureType newIfcMomentOfInertiaMeasure, NotificationChain msgs) {
		IfcMomentOfInertiaMeasureType oldIfcMomentOfInertiaMeasure = ifcMomentOfInertiaMeasure;
		ifcMomentOfInertiaMeasure = newIfcMomentOfInertiaMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOMENT_OF_INERTIA_MEASURE, oldIfcMomentOfInertiaMeasure, newIfcMomentOfInertiaMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMomentOfInertiaMeasure(IfcMomentOfInertiaMeasureType newIfcMomentOfInertiaMeasure) {
		if (newIfcMomentOfInertiaMeasure != ifcMomentOfInertiaMeasure) {
			NotificationChain msgs = null;
			if (ifcMomentOfInertiaMeasure != null)
				msgs = ((InternalEObject)ifcMomentOfInertiaMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOMENT_OF_INERTIA_MEASURE, null, msgs);
			if (newIfcMomentOfInertiaMeasure != null)
				msgs = ((InternalEObject)newIfcMomentOfInertiaMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOMENT_OF_INERTIA_MEASURE, null, msgs);
			msgs = basicSetIfcMomentOfInertiaMeasure(newIfcMomentOfInertiaMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOMENT_OF_INERTIA_MEASURE, newIfcMomentOfInertiaMeasure, newIfcMomentOfInertiaMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarForceMeasureType getIfcPlanarForceMeasure() {
		return ifcPlanarForceMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPlanarForceMeasure(IfcPlanarForceMeasureType newIfcPlanarForceMeasure, NotificationChain msgs) {
		IfcPlanarForceMeasureType oldIfcPlanarForceMeasure = ifcPlanarForceMeasure;
		ifcPlanarForceMeasure = newIfcPlanarForceMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PLANAR_FORCE_MEASURE, oldIfcPlanarForceMeasure, newIfcPlanarForceMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlanarForceMeasure(IfcPlanarForceMeasureType newIfcPlanarForceMeasure) {
		if (newIfcPlanarForceMeasure != ifcPlanarForceMeasure) {
			NotificationChain msgs = null;
			if (ifcPlanarForceMeasure != null)
				msgs = ((InternalEObject)ifcPlanarForceMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PLANAR_FORCE_MEASURE, null, msgs);
			if (newIfcPlanarForceMeasure != null)
				msgs = ((InternalEObject)newIfcPlanarForceMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PLANAR_FORCE_MEASURE, null, msgs);
			msgs = basicSetIfcPlanarForceMeasure(newIfcPlanarForceMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PLANAR_FORCE_MEASURE, newIfcPlanarForceMeasure, newIfcPlanarForceMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRotationalStiffnessMeasureType getIfcRotationalStiffnessMeasure() {
		return ifcRotationalStiffnessMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRotationalStiffnessMeasure(IfcRotationalStiffnessMeasureType newIfcRotationalStiffnessMeasure, NotificationChain msgs) {
		IfcRotationalStiffnessMeasureType oldIfcRotationalStiffnessMeasure = ifcRotationalStiffnessMeasure;
		ifcRotationalStiffnessMeasure = newIfcRotationalStiffnessMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_STIFFNESS_MEASURE, oldIfcRotationalStiffnessMeasure, newIfcRotationalStiffnessMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRotationalStiffnessMeasure(IfcRotationalStiffnessMeasureType newIfcRotationalStiffnessMeasure) {
		if (newIfcRotationalStiffnessMeasure != ifcRotationalStiffnessMeasure) {
			NotificationChain msgs = null;
			if (ifcRotationalStiffnessMeasure != null)
				msgs = ((InternalEObject)ifcRotationalStiffnessMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_STIFFNESS_MEASURE, null, msgs);
			if (newIfcRotationalStiffnessMeasure != null)
				msgs = ((InternalEObject)newIfcRotationalStiffnessMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_STIFFNESS_MEASURE, null, msgs);
			msgs = basicSetIfcRotationalStiffnessMeasure(newIfcRotationalStiffnessMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_STIFFNESS_MEASURE, newIfcRotationalStiffnessMeasure, newIfcRotationalStiffnessMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShearModulusMeasureType getIfcShearModulusMeasure() {
		return ifcShearModulusMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcShearModulusMeasure(IfcShearModulusMeasureType newIfcShearModulusMeasure, NotificationChain msgs) {
		IfcShearModulusMeasureType oldIfcShearModulusMeasure = ifcShearModulusMeasure;
		ifcShearModulusMeasure = newIfcShearModulusMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SHEAR_MODULUS_MEASURE, oldIfcShearModulusMeasure, newIfcShearModulusMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcShearModulusMeasure(IfcShearModulusMeasureType newIfcShearModulusMeasure) {
		if (newIfcShearModulusMeasure != ifcShearModulusMeasure) {
			NotificationChain msgs = null;
			if (ifcShearModulusMeasure != null)
				msgs = ((InternalEObject)ifcShearModulusMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SHEAR_MODULUS_MEASURE, null, msgs);
			if (newIfcShearModulusMeasure != null)
				msgs = ((InternalEObject)newIfcShearModulusMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SHEAR_MODULUS_MEASURE, null, msgs);
			msgs = basicSetIfcShearModulusMeasure(newIfcShearModulusMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SHEAR_MODULUS_MEASURE, newIfcShearModulusMeasure, newIfcShearModulusMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearMomentMeasureType getIfcLinearMomentMeasure() {
		return ifcLinearMomentMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLinearMomentMeasure(IfcLinearMomentMeasureType newIfcLinearMomentMeasure, NotificationChain msgs) {
		IfcLinearMomentMeasureType oldIfcLinearMomentMeasure = ifcLinearMomentMeasure;
		ifcLinearMomentMeasure = newIfcLinearMomentMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_MOMENT_MEASURE, oldIfcLinearMomentMeasure, newIfcLinearMomentMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLinearMomentMeasure(IfcLinearMomentMeasureType newIfcLinearMomentMeasure) {
		if (newIfcLinearMomentMeasure != ifcLinearMomentMeasure) {
			NotificationChain msgs = null;
			if (ifcLinearMomentMeasure != null)
				msgs = ((InternalEObject)ifcLinearMomentMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_MOMENT_MEASURE, null, msgs);
			if (newIfcLinearMomentMeasure != null)
				msgs = ((InternalEObject)newIfcLinearMomentMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_MOMENT_MEASURE, null, msgs);
			msgs = basicSetIfcLinearMomentMeasure(newIfcLinearMomentMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_MOMENT_MEASURE, newIfcLinearMomentMeasure, newIfcLinearMomentMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLuminousIntensityDistributionMeasureType getIfcLuminousIntensityDistributionMeasure() {
		return ifcLuminousIntensityDistributionMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcLuminousIntensityDistributionMeasure(IfcLuminousIntensityDistributionMeasureType newIfcLuminousIntensityDistributionMeasure, NotificationChain msgs) {
		IfcLuminousIntensityDistributionMeasureType oldIfcLuminousIntensityDistributionMeasure = ifcLuminousIntensityDistributionMeasure;
		ifcLuminousIntensityDistributionMeasure = newIfcLuminousIntensityDistributionMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE, oldIfcLuminousIntensityDistributionMeasure, newIfcLuminousIntensityDistributionMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcLuminousIntensityDistributionMeasure(IfcLuminousIntensityDistributionMeasureType newIfcLuminousIntensityDistributionMeasure) {
		if (newIfcLuminousIntensityDistributionMeasure != ifcLuminousIntensityDistributionMeasure) {
			NotificationChain msgs = null;
			if (ifcLuminousIntensityDistributionMeasure != null)
				msgs = ((InternalEObject)ifcLuminousIntensityDistributionMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE, null, msgs);
			if (newIfcLuminousIntensityDistributionMeasure != null)
				msgs = ((InternalEObject)newIfcLuminousIntensityDistributionMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE, null, msgs);
			msgs = basicSetIfcLuminousIntensityDistributionMeasure(newIfcLuminousIntensityDistributionMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE, newIfcLuminousIntensityDistributionMeasure, newIfcLuminousIntensityDistributionMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurvatureMeasureType getIfcCurvatureMeasure() {
		return ifcCurvatureMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCurvatureMeasure(IfcCurvatureMeasureType newIfcCurvatureMeasure, NotificationChain msgs) {
		IfcCurvatureMeasureType oldIfcCurvatureMeasure = ifcCurvatureMeasure;
		ifcCurvatureMeasure = newIfcCurvatureMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_CURVATURE_MEASURE, oldIfcCurvatureMeasure, newIfcCurvatureMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCurvatureMeasure(IfcCurvatureMeasureType newIfcCurvatureMeasure) {
		if (newIfcCurvatureMeasure != ifcCurvatureMeasure) {
			NotificationChain msgs = null;
			if (ifcCurvatureMeasure != null)
				msgs = ((InternalEObject)ifcCurvatureMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_CURVATURE_MEASURE, null, msgs);
			if (newIfcCurvatureMeasure != null)
				msgs = ((InternalEObject)newIfcCurvatureMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_CURVATURE_MEASURE, null, msgs);
			msgs = basicSetIfcCurvatureMeasure(newIfcCurvatureMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_CURVATURE_MEASURE, newIfcCurvatureMeasure, newIfcCurvatureMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMassPerLengthMeasureType getIfcMassPerLengthMeasure() {
		return ifcMassPerLengthMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcMassPerLengthMeasure(IfcMassPerLengthMeasureType newIfcMassPerLengthMeasure, NotificationChain msgs) {
		IfcMassPerLengthMeasureType oldIfcMassPerLengthMeasure = ifcMassPerLengthMeasure;
		ifcMassPerLengthMeasure = newIfcMassPerLengthMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_PER_LENGTH_MEASURE, oldIfcMassPerLengthMeasure, newIfcMassPerLengthMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcMassPerLengthMeasure(IfcMassPerLengthMeasureType newIfcMassPerLengthMeasure) {
		if (newIfcMassPerLengthMeasure != ifcMassPerLengthMeasure) {
			NotificationChain msgs = null;
			if (ifcMassPerLengthMeasure != null)
				msgs = ((InternalEObject)ifcMassPerLengthMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_PER_LENGTH_MEASURE, null, msgs);
			if (newIfcMassPerLengthMeasure != null)
				msgs = ((InternalEObject)newIfcMassPerLengthMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_PER_LENGTH_MEASURE, null, msgs);
			msgs = basicSetIfcMassPerLengthMeasure(newIfcMassPerLengthMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_PER_LENGTH_MEASURE, newIfcMassPerLengthMeasure, newIfcMassPerLengthMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfLinearSubgradeReactionMeasureType getIfcModulusOfLinearSubgradeReactionMeasure() {
		return ifcModulusOfLinearSubgradeReactionMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcModulusOfLinearSubgradeReactionMeasure(IfcModulusOfLinearSubgradeReactionMeasureType newIfcModulusOfLinearSubgradeReactionMeasure, NotificationChain msgs) {
		IfcModulusOfLinearSubgradeReactionMeasureType oldIfcModulusOfLinearSubgradeReactionMeasure = ifcModulusOfLinearSubgradeReactionMeasure;
		ifcModulusOfLinearSubgradeReactionMeasure = newIfcModulusOfLinearSubgradeReactionMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE, oldIfcModulusOfLinearSubgradeReactionMeasure, newIfcModulusOfLinearSubgradeReactionMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfLinearSubgradeReactionMeasure(IfcModulusOfLinearSubgradeReactionMeasureType newIfcModulusOfLinearSubgradeReactionMeasure) {
		if (newIfcModulusOfLinearSubgradeReactionMeasure != ifcModulusOfLinearSubgradeReactionMeasure) {
			NotificationChain msgs = null;
			if (ifcModulusOfLinearSubgradeReactionMeasure != null)
				msgs = ((InternalEObject)ifcModulusOfLinearSubgradeReactionMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE, null, msgs);
			if (newIfcModulusOfLinearSubgradeReactionMeasure != null)
				msgs = ((InternalEObject)newIfcModulusOfLinearSubgradeReactionMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE, null, msgs);
			msgs = basicSetIfcModulusOfLinearSubgradeReactionMeasure(newIfcModulusOfLinearSubgradeReactionMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE, newIfcModulusOfLinearSubgradeReactionMeasure, newIfcModulusOfLinearSubgradeReactionMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfRotationalSubgradeReactionMeasureType getIfcModulusOfRotationalSubgradeReactionMeasure() {
		return ifcModulusOfRotationalSubgradeReactionMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcModulusOfRotationalSubgradeReactionMeasure(IfcModulusOfRotationalSubgradeReactionMeasureType newIfcModulusOfRotationalSubgradeReactionMeasure, NotificationChain msgs) {
		IfcModulusOfRotationalSubgradeReactionMeasureType oldIfcModulusOfRotationalSubgradeReactionMeasure = ifcModulusOfRotationalSubgradeReactionMeasure;
		ifcModulusOfRotationalSubgradeReactionMeasure = newIfcModulusOfRotationalSubgradeReactionMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE, oldIfcModulusOfRotationalSubgradeReactionMeasure, newIfcModulusOfRotationalSubgradeReactionMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcModulusOfRotationalSubgradeReactionMeasure(IfcModulusOfRotationalSubgradeReactionMeasureType newIfcModulusOfRotationalSubgradeReactionMeasure) {
		if (newIfcModulusOfRotationalSubgradeReactionMeasure != ifcModulusOfRotationalSubgradeReactionMeasure) {
			NotificationChain msgs = null;
			if (ifcModulusOfRotationalSubgradeReactionMeasure != null)
				msgs = ((InternalEObject)ifcModulusOfRotationalSubgradeReactionMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE, null, msgs);
			if (newIfcModulusOfRotationalSubgradeReactionMeasure != null)
				msgs = ((InternalEObject)newIfcModulusOfRotationalSubgradeReactionMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE, null, msgs);
			msgs = basicSetIfcModulusOfRotationalSubgradeReactionMeasure(newIfcModulusOfRotationalSubgradeReactionMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE, newIfcModulusOfRotationalSubgradeReactionMeasure, newIfcModulusOfRotationalSubgradeReactionMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRotationalMassMeasureType getIfcRotationalMassMeasure() {
		return ifcRotationalMassMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRotationalMassMeasure(IfcRotationalMassMeasureType newIfcRotationalMassMeasure, NotificationChain msgs) {
		IfcRotationalMassMeasureType oldIfcRotationalMassMeasure = ifcRotationalMassMeasure;
		ifcRotationalMassMeasure = newIfcRotationalMassMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_MASS_MEASURE, oldIfcRotationalMassMeasure, newIfcRotationalMassMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRotationalMassMeasure(IfcRotationalMassMeasureType newIfcRotationalMassMeasure) {
		if (newIfcRotationalMassMeasure != ifcRotationalMassMeasure) {
			NotificationChain msgs = null;
			if (ifcRotationalMassMeasure != null)
				msgs = ((InternalEObject)ifcRotationalMassMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_MASS_MEASURE, null, msgs);
			if (newIfcRotationalMassMeasure != null)
				msgs = ((InternalEObject)newIfcRotationalMassMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_MASS_MEASURE, null, msgs);
			msgs = basicSetIfcRotationalMassMeasure(newIfcRotationalMassMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_MASS_MEASURE, newIfcRotationalMassMeasure, newIfcRotationalMassMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionalAreaIntegralMeasureType getIfcSectionalAreaIntegralMeasure() {
		return ifcSectionalAreaIntegralMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSectionalAreaIntegralMeasure(IfcSectionalAreaIntegralMeasureType newIfcSectionalAreaIntegralMeasure, NotificationChain msgs) {
		IfcSectionalAreaIntegralMeasureType oldIfcSectionalAreaIntegralMeasure = ifcSectionalAreaIntegralMeasure;
		ifcSectionalAreaIntegralMeasure = newIfcSectionalAreaIntegralMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE, oldIfcSectionalAreaIntegralMeasure, newIfcSectionalAreaIntegralMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSectionalAreaIntegralMeasure(IfcSectionalAreaIntegralMeasureType newIfcSectionalAreaIntegralMeasure) {
		if (newIfcSectionalAreaIntegralMeasure != ifcSectionalAreaIntegralMeasure) {
			NotificationChain msgs = null;
			if (ifcSectionalAreaIntegralMeasure != null)
				msgs = ((InternalEObject)ifcSectionalAreaIntegralMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE, null, msgs);
			if (newIfcSectionalAreaIntegralMeasure != null)
				msgs = ((InternalEObject)newIfcSectionalAreaIntegralMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE, null, msgs);
			msgs = basicSetIfcSectionalAreaIntegralMeasure(newIfcSectionalAreaIntegralMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE, newIfcSectionalAreaIntegralMeasure, newIfcSectionalAreaIntegralMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionModulusMeasureType getIfcSectionModulusMeasure() {
		return ifcSectionModulusMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSectionModulusMeasure(IfcSectionModulusMeasureType newIfcSectionModulusMeasure, NotificationChain msgs) {
		IfcSectionModulusMeasureType oldIfcSectionModulusMeasure = ifcSectionModulusMeasure;
		ifcSectionModulusMeasure = newIfcSectionModulusMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTION_MODULUS_MEASURE, oldIfcSectionModulusMeasure, newIfcSectionModulusMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSectionModulusMeasure(IfcSectionModulusMeasureType newIfcSectionModulusMeasure) {
		if (newIfcSectionModulusMeasure != ifcSectionModulusMeasure) {
			NotificationChain msgs = null;
			if (ifcSectionModulusMeasure != null)
				msgs = ((InternalEObject)ifcSectionModulusMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTION_MODULUS_MEASURE, null, msgs);
			if (newIfcSectionModulusMeasure != null)
				msgs = ((InternalEObject)newIfcSectionModulusMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTION_MODULUS_MEASURE, null, msgs);
			msgs = basicSetIfcSectionModulusMeasure(newIfcSectionModulusMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTION_MODULUS_MEASURE, newIfcSectionModulusMeasure, newIfcSectionModulusMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTemperatureGradientMeasureType getIfcTemperatureGradientMeasure() {
		return ifcTemperatureGradientMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcTemperatureGradientMeasure(IfcTemperatureGradientMeasureType newIfcTemperatureGradientMeasure, NotificationChain msgs) {
		IfcTemperatureGradientMeasureType oldIfcTemperatureGradientMeasure = ifcTemperatureGradientMeasure;
		ifcTemperatureGradientMeasure = newIfcTemperatureGradientMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TEMPERATURE_GRADIENT_MEASURE, oldIfcTemperatureGradientMeasure, newIfcTemperatureGradientMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcTemperatureGradientMeasure(IfcTemperatureGradientMeasureType newIfcTemperatureGradientMeasure) {
		if (newIfcTemperatureGradientMeasure != ifcTemperatureGradientMeasure) {
			NotificationChain msgs = null;
			if (ifcTemperatureGradientMeasure != null)
				msgs = ((InternalEObject)ifcTemperatureGradientMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TEMPERATURE_GRADIENT_MEASURE, null, msgs);
			if (newIfcTemperatureGradientMeasure != null)
				msgs = ((InternalEObject)newIfcTemperatureGradientMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TEMPERATURE_GRADIENT_MEASURE, null, msgs);
			msgs = basicSetIfcTemperatureGradientMeasure(newIfcTemperatureGradientMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TEMPERATURE_GRADIENT_MEASURE, newIfcTemperatureGradientMeasure, newIfcTemperatureGradientMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalExpansionCoefficientMeasureType getIfcThermalExpansionCoefficientMeasure() {
		return ifcThermalExpansionCoefficientMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcThermalExpansionCoefficientMeasure(IfcThermalExpansionCoefficientMeasureType newIfcThermalExpansionCoefficientMeasure, NotificationChain msgs) {
		IfcThermalExpansionCoefficientMeasureType oldIfcThermalExpansionCoefficientMeasure = ifcThermalExpansionCoefficientMeasure;
		ifcThermalExpansionCoefficientMeasure = newIfcThermalExpansionCoefficientMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE, oldIfcThermalExpansionCoefficientMeasure, newIfcThermalExpansionCoefficientMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcThermalExpansionCoefficientMeasure(IfcThermalExpansionCoefficientMeasureType newIfcThermalExpansionCoefficientMeasure) {
		if (newIfcThermalExpansionCoefficientMeasure != ifcThermalExpansionCoefficientMeasure) {
			NotificationChain msgs = null;
			if (ifcThermalExpansionCoefficientMeasure != null)
				msgs = ((InternalEObject)ifcThermalExpansionCoefficientMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE, null, msgs);
			if (newIfcThermalExpansionCoefficientMeasure != null)
				msgs = ((InternalEObject)newIfcThermalExpansionCoefficientMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE, null, msgs);
			msgs = basicSetIfcThermalExpansionCoefficientMeasure(newIfcThermalExpansionCoefficientMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE, newIfcThermalExpansionCoefficientMeasure, newIfcThermalExpansionCoefficientMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWarpingConstantMeasureType getIfcWarpingConstantMeasure() {
		return ifcWarpingConstantMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcWarpingConstantMeasure(IfcWarpingConstantMeasureType newIfcWarpingConstantMeasure, NotificationChain msgs) {
		IfcWarpingConstantMeasureType oldIfcWarpingConstantMeasure = ifcWarpingConstantMeasure;
		ifcWarpingConstantMeasure = newIfcWarpingConstantMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_CONSTANT_MEASURE, oldIfcWarpingConstantMeasure, newIfcWarpingConstantMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcWarpingConstantMeasure(IfcWarpingConstantMeasureType newIfcWarpingConstantMeasure) {
		if (newIfcWarpingConstantMeasure != ifcWarpingConstantMeasure) {
			NotificationChain msgs = null;
			if (ifcWarpingConstantMeasure != null)
				msgs = ((InternalEObject)ifcWarpingConstantMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_CONSTANT_MEASURE, null, msgs);
			if (newIfcWarpingConstantMeasure != null)
				msgs = ((InternalEObject)newIfcWarpingConstantMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_CONSTANT_MEASURE, null, msgs);
			msgs = basicSetIfcWarpingConstantMeasure(newIfcWarpingConstantMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_CONSTANT_MEASURE, newIfcWarpingConstantMeasure, newIfcWarpingConstantMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWarpingMomentMeasureType getIfcWarpingMomentMeasure() {
		return ifcWarpingMomentMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcWarpingMomentMeasure(IfcWarpingMomentMeasureType newIfcWarpingMomentMeasure, NotificationChain msgs) {
		IfcWarpingMomentMeasureType oldIfcWarpingMomentMeasure = ifcWarpingMomentMeasure;
		ifcWarpingMomentMeasure = newIfcWarpingMomentMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_MOMENT_MEASURE, oldIfcWarpingMomentMeasure, newIfcWarpingMomentMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcWarpingMomentMeasure(IfcWarpingMomentMeasureType newIfcWarpingMomentMeasure) {
		if (newIfcWarpingMomentMeasure != ifcWarpingMomentMeasure) {
			NotificationChain msgs = null;
			if (ifcWarpingMomentMeasure != null)
				msgs = ((InternalEObject)ifcWarpingMomentMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_MOMENT_MEASURE, null, msgs);
			if (newIfcWarpingMomentMeasure != null)
				msgs = ((InternalEObject)newIfcWarpingMomentMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_MOMENT_MEASURE, null, msgs);
			msgs = basicSetIfcWarpingMomentMeasure(newIfcWarpingMomentMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_MOMENT_MEASURE, newIfcWarpingMomentMeasure, newIfcWarpingMomentMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundPowerMeasureType getIfcSoundPowerMeasure() {
		return ifcSoundPowerMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSoundPowerMeasure(IfcSoundPowerMeasureType newIfcSoundPowerMeasure, NotificationChain msgs) {
		IfcSoundPowerMeasureType oldIfcSoundPowerMeasure = ifcSoundPowerMeasure;
		ifcSoundPowerMeasure = newIfcSoundPowerMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_POWER_MEASURE, oldIfcSoundPowerMeasure, newIfcSoundPowerMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSoundPowerMeasure(IfcSoundPowerMeasureType newIfcSoundPowerMeasure) {
		if (newIfcSoundPowerMeasure != ifcSoundPowerMeasure) {
			NotificationChain msgs = null;
			if (ifcSoundPowerMeasure != null)
				msgs = ((InternalEObject)ifcSoundPowerMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_POWER_MEASURE, null, msgs);
			if (newIfcSoundPowerMeasure != null)
				msgs = ((InternalEObject)newIfcSoundPowerMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_POWER_MEASURE, null, msgs);
			msgs = basicSetIfcSoundPowerMeasure(newIfcSoundPowerMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_POWER_MEASURE, newIfcSoundPowerMeasure, newIfcSoundPowerMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundPressureMeasureType getIfcSoundPressureMeasure() {
		return ifcSoundPressureMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcSoundPressureMeasure(IfcSoundPressureMeasureType newIfcSoundPressureMeasure, NotificationChain msgs) {
		IfcSoundPressureMeasureType oldIfcSoundPressureMeasure = ifcSoundPressureMeasure;
		ifcSoundPressureMeasure = newIfcSoundPressureMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_PRESSURE_MEASURE, oldIfcSoundPressureMeasure, newIfcSoundPressureMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcSoundPressureMeasure(IfcSoundPressureMeasureType newIfcSoundPressureMeasure) {
		if (newIfcSoundPressureMeasure != ifcSoundPressureMeasure) {
			NotificationChain msgs = null;
			if (ifcSoundPressureMeasure != null)
				msgs = ((InternalEObject)ifcSoundPressureMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_PRESSURE_MEASURE, null, msgs);
			if (newIfcSoundPressureMeasure != null)
				msgs = ((InternalEObject)newIfcSoundPressureMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_PRESSURE_MEASURE, null, msgs);
			msgs = basicSetIfcSoundPressureMeasure(newIfcSoundPressureMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_PRESSURE_MEASURE, newIfcSoundPressureMeasure, newIfcSoundPressureMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatingValueMeasureType getIfcHeatingValueMeasure() {
		return ifcHeatingValueMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcHeatingValueMeasure(IfcHeatingValueMeasureType newIfcHeatingValueMeasure, NotificationChain msgs) {
		IfcHeatingValueMeasureType oldIfcHeatingValueMeasure = ifcHeatingValueMeasure;
		ifcHeatingValueMeasure = newIfcHeatingValueMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEATING_VALUE_MEASURE, oldIfcHeatingValueMeasure, newIfcHeatingValueMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcHeatingValueMeasure(IfcHeatingValueMeasureType newIfcHeatingValueMeasure) {
		if (newIfcHeatingValueMeasure != ifcHeatingValueMeasure) {
			NotificationChain msgs = null;
			if (ifcHeatingValueMeasure != null)
				msgs = ((InternalEObject)ifcHeatingValueMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEATING_VALUE_MEASURE, null, msgs);
			if (newIfcHeatingValueMeasure != null)
				msgs = ((InternalEObject)newIfcHeatingValueMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEATING_VALUE_MEASURE, null, msgs);
			msgs = basicSetIfcHeatingValueMeasure(newIfcHeatingValueMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEATING_VALUE_MEASURE, newIfcHeatingValueMeasure, newIfcHeatingValueMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPHMeasureType getIfcPHMeasure() {
		return ifcPHMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPHMeasure(IfcPHMeasureType newIfcPHMeasure, NotificationChain msgs) {
		IfcPHMeasureType oldIfcPHMeasure = ifcPHMeasure;
		ifcPHMeasure = newIfcPHMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PH_MEASURE, oldIfcPHMeasure, newIfcPHMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPHMeasure(IfcPHMeasureType newIfcPHMeasure) {
		if (newIfcPHMeasure != ifcPHMeasure) {
			NotificationChain msgs = null;
			if (ifcPHMeasure != null)
				msgs = ((InternalEObject)ifcPHMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PH_MEASURE, null, msgs);
			if (newIfcPHMeasure != null)
				msgs = ((InternalEObject)newIfcPHMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PH_MEASURE, null, msgs);
			msgs = basicSetIfcPHMeasure(newIfcPHMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PH_MEASURE, newIfcPHMeasure, newIfcPHMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIonConcentrationMeasureType getIfcIonConcentrationMeasure() {
		return ifcIonConcentrationMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcIonConcentrationMeasure(IfcIonConcentrationMeasureType newIfcIonConcentrationMeasure, NotificationChain msgs) {
		IfcIonConcentrationMeasureType oldIfcIonConcentrationMeasure = ifcIonConcentrationMeasure;
		ifcIonConcentrationMeasure = newIfcIonConcentrationMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ION_CONCENTRATION_MEASURE, oldIfcIonConcentrationMeasure, newIfcIonConcentrationMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcIonConcentrationMeasure(IfcIonConcentrationMeasureType newIfcIonConcentrationMeasure) {
		if (newIfcIonConcentrationMeasure != ifcIonConcentrationMeasure) {
			NotificationChain msgs = null;
			if (ifcIonConcentrationMeasure != null)
				msgs = ((InternalEObject)ifcIonConcentrationMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ION_CONCENTRATION_MEASURE, null, msgs);
			if (newIfcIonConcentrationMeasure != null)
				msgs = ((InternalEObject)newIfcIonConcentrationMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ION_CONCENTRATION_MEASURE, null, msgs);
			msgs = basicSetIfcIonConcentrationMeasure(newIfcIonConcentrationMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ION_CONCENTRATION_MEASURE, newIfcIonConcentrationMeasure, newIfcIonConcentrationMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				return basicSetIfcVolumetricFlowRateMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TIME_STAMP:
				return basicSetIfcTimeStamp(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				return basicSetIfcThermalTransmittanceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_RESISTANCE_MEASURE:
				return basicSetIfcThermalResistanceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_ADMITTANCE_MEASURE:
				return basicSetIfcThermalAdmittanceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PRESSURE_MEASURE:
				return basicSetIfcPressureMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_POWER_MEASURE:
				return basicSetIfcPowerMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_FLOW_RATE_MEASURE:
				return basicSetIfcMassFlowRateMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_DENSITY_MEASURE:
				return basicSetIfcMassDensityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_VELOCITY_MEASURE:
				return basicSetIfcLinearVelocityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				return basicSetIfcKinematicViscosityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INTEGER_COUNT_RATE_MEASURE:
				return basicSetIfcIntegerCountRateMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				return basicSetIfcHeatFluxDensityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FREQUENCY_MEASURE:
				return basicSetIfcFrequencyMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ENERGY_MEASURE:
				return basicSetIfcEnergyMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				return basicSetIfcElectricVoltageMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				return basicSetIfcDynamicViscosityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				return basicSetIfcCompoundPlaneAngleMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ANGULAR_VELOCITY_MEASURE:
				return basicSetIfcAngularVelocityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				return basicSetIfcThermalConductivityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOLECULAR_WEIGHT_MEASURE:
				return basicSetIfcMolecularWeightMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VAPOR_PERMEABILITY_MEASURE:
				return basicSetIfcVaporPermeabilityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				return basicSetIfcMoistureDiffusivityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				return basicSetIfcIsothermalMoistureCapacityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				return basicSetIfcSpecificHeatCapacityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MONETARY_MEASURE:
				return basicSetIfcMonetaryMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				return basicSetIfcMagneticFluxDensityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_MEASURE:
				return basicSetIfcMagneticFluxMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_FLUX_MEASURE:
				return basicSetIfcLuminousFluxMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FORCE_MEASURE:
				return basicSetIfcForceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INDUCTANCE_MEASURE:
				return basicSetIfcInductanceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ILLUMINANCE_MEASURE:
				return basicSetIfcIlluminanceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				return basicSetIfcElectricResistanceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				return basicSetIfcElectricConductanceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CHARGE_MEASURE:
				return basicSetIfcElectricChargeMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DOSE_EQUIVALENT_MEASURE:
				return basicSetIfcDoseEquivalentMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				return basicSetIfcElectricCapacitanceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ABSORBED_DOSE_MEASURE:
				return basicSetIfcAbsorbedDoseMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_RADIO_ACTIVITY_MEASURE:
				return basicSetIfcRadioActivityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				return basicSetIfcRotationalFrequencyMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TORQUE_MEASURE:
				return basicSetIfcTorqueMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ACCELERATION_MEASURE:
				return basicSetIfcAccelerationMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_FORCE_MEASURE:
				return basicSetIfcLinearForceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_STIFFNESS_MEASURE:
				return basicSetIfcLinearStiffnessMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				return basicSetIfcModulusOfSubgradeReactionMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				return basicSetIfcModulusOfElasticityMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOMENT_OF_INERTIA_MEASURE:
				return basicSetIfcMomentOfInertiaMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PLANAR_FORCE_MEASURE:
				return basicSetIfcPlanarForceMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				return basicSetIfcRotationalStiffnessMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SHEAR_MODULUS_MEASURE:
				return basicSetIfcShearModulusMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_MOMENT_MEASURE:
				return basicSetIfcLinearMomentMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				return basicSetIfcLuminousIntensityDistributionMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_CURVATURE_MEASURE:
				return basicSetIfcCurvatureMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_PER_LENGTH_MEASURE:
				return basicSetIfcMassPerLengthMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				return basicSetIfcModulusOfLinearSubgradeReactionMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				return basicSetIfcModulusOfRotationalSubgradeReactionMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_MASS_MEASURE:
				return basicSetIfcRotationalMassMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				return basicSetIfcSectionalAreaIntegralMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTION_MODULUS_MEASURE:
				return basicSetIfcSectionModulusMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				return basicSetIfcTemperatureGradientMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				return basicSetIfcThermalExpansionCoefficientMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_CONSTANT_MEASURE:
				return basicSetIfcWarpingConstantMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_MOMENT_MEASURE:
				return basicSetIfcWarpingMomentMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_POWER_MEASURE:
				return basicSetIfcSoundPowerMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_PRESSURE_MEASURE:
				return basicSetIfcSoundPressureMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEATING_VALUE_MEASURE:
				return basicSetIfcHeatingValueMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PH_MEASURE:
				return basicSetIfcPHMeasure(null, msgs);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ION_CONCENTRATION_MEASURE:
				return basicSetIfcIonConcentrationMeasure(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				return getIfcVolumetricFlowRateMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TIME_STAMP:
				return getIfcTimeStamp();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				return getIfcThermalTransmittanceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_RESISTANCE_MEASURE:
				return getIfcThermalResistanceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_ADMITTANCE_MEASURE:
				return getIfcThermalAdmittanceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PRESSURE_MEASURE:
				return getIfcPressureMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_POWER_MEASURE:
				return getIfcPowerMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_FLOW_RATE_MEASURE:
				return getIfcMassFlowRateMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_DENSITY_MEASURE:
				return getIfcMassDensityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_VELOCITY_MEASURE:
				return getIfcLinearVelocityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				return getIfcKinematicViscosityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INTEGER_COUNT_RATE_MEASURE:
				return getIfcIntegerCountRateMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				return getIfcHeatFluxDensityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FREQUENCY_MEASURE:
				return getIfcFrequencyMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ENERGY_MEASURE:
				return getIfcEnergyMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				return getIfcElectricVoltageMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				return getIfcDynamicViscosityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				return getIfcCompoundPlaneAngleMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ANGULAR_VELOCITY_MEASURE:
				return getIfcAngularVelocityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				return getIfcThermalConductivityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOLECULAR_WEIGHT_MEASURE:
				return getIfcMolecularWeightMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VAPOR_PERMEABILITY_MEASURE:
				return getIfcVaporPermeabilityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				return getIfcMoistureDiffusivityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				return getIfcIsothermalMoistureCapacityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				return getIfcSpecificHeatCapacityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MONETARY_MEASURE:
				return getIfcMonetaryMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				return getIfcMagneticFluxDensityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_MEASURE:
				return getIfcMagneticFluxMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_FLUX_MEASURE:
				return getIfcLuminousFluxMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FORCE_MEASURE:
				return getIfcForceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INDUCTANCE_MEASURE:
				return getIfcInductanceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ILLUMINANCE_MEASURE:
				return getIfcIlluminanceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				return getIfcElectricResistanceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				return getIfcElectricConductanceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CHARGE_MEASURE:
				return getIfcElectricChargeMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DOSE_EQUIVALENT_MEASURE:
				return getIfcDoseEquivalentMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				return getIfcElectricCapacitanceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ABSORBED_DOSE_MEASURE:
				return getIfcAbsorbedDoseMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_RADIO_ACTIVITY_MEASURE:
				return getIfcRadioActivityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				return getIfcRotationalFrequencyMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TORQUE_MEASURE:
				return getIfcTorqueMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ACCELERATION_MEASURE:
				return getIfcAccelerationMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_FORCE_MEASURE:
				return getIfcLinearForceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_STIFFNESS_MEASURE:
				return getIfcLinearStiffnessMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				return getIfcModulusOfSubgradeReactionMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				return getIfcModulusOfElasticityMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOMENT_OF_INERTIA_MEASURE:
				return getIfcMomentOfInertiaMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PLANAR_FORCE_MEASURE:
				return getIfcPlanarForceMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				return getIfcRotationalStiffnessMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SHEAR_MODULUS_MEASURE:
				return getIfcShearModulusMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_MOMENT_MEASURE:
				return getIfcLinearMomentMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				return getIfcLuminousIntensityDistributionMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_CURVATURE_MEASURE:
				return getIfcCurvatureMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_PER_LENGTH_MEASURE:
				return getIfcMassPerLengthMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				return getIfcModulusOfLinearSubgradeReactionMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				return getIfcModulusOfRotationalSubgradeReactionMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_MASS_MEASURE:
				return getIfcRotationalMassMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				return getIfcSectionalAreaIntegralMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTION_MODULUS_MEASURE:
				return getIfcSectionModulusMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				return getIfcTemperatureGradientMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				return getIfcThermalExpansionCoefficientMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_CONSTANT_MEASURE:
				return getIfcWarpingConstantMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_MOMENT_MEASURE:
				return getIfcWarpingMomentMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_POWER_MEASURE:
				return getIfcSoundPowerMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_PRESSURE_MEASURE:
				return getIfcSoundPressureMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEATING_VALUE_MEASURE:
				return getIfcHeatingValueMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PH_MEASURE:
				return getIfcPHMeasure();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ION_CONCENTRATION_MEASURE:
				return getIfcIonConcentrationMeasure();
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
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				setIfcVolumetricFlowRateMeasure((IfcVolumetricFlowRateMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TIME_STAMP:
				setIfcTimeStamp((IfcTimeStampType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				setIfcThermalTransmittanceMeasure((IfcThermalTransmittanceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_RESISTANCE_MEASURE:
				setIfcThermalResistanceMeasure((IfcThermalResistanceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_ADMITTANCE_MEASURE:
				setIfcThermalAdmittanceMeasure((IfcThermalAdmittanceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PRESSURE_MEASURE:
				setIfcPressureMeasure((IfcPressureMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_POWER_MEASURE:
				setIfcPowerMeasure((IfcPowerMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_FLOW_RATE_MEASURE:
				setIfcMassFlowRateMeasure((IfcMassFlowRateMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_DENSITY_MEASURE:
				setIfcMassDensityMeasure((IfcMassDensityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_VELOCITY_MEASURE:
				setIfcLinearVelocityMeasure((IfcLinearVelocityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				setIfcKinematicViscosityMeasure((IfcKinematicViscosityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INTEGER_COUNT_RATE_MEASURE:
				setIfcIntegerCountRateMeasure((IfcIntegerCountRateMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				setIfcHeatFluxDensityMeasure((IfcHeatFluxDensityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FREQUENCY_MEASURE:
				setIfcFrequencyMeasure((IfcFrequencyMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ENERGY_MEASURE:
				setIfcEnergyMeasure((IfcEnergyMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				setIfcElectricVoltageMeasure((IfcElectricVoltageMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				setIfcDynamicViscosityMeasure((IfcDynamicViscosityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				setIfcCompoundPlaneAngleMeasure((IfcCompoundPlaneAngleMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ANGULAR_VELOCITY_MEASURE:
				setIfcAngularVelocityMeasure((IfcAngularVelocityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				setIfcThermalConductivityMeasure((IfcThermalConductivityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOLECULAR_WEIGHT_MEASURE:
				setIfcMolecularWeightMeasure((IfcMolecularWeightMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VAPOR_PERMEABILITY_MEASURE:
				setIfcVaporPermeabilityMeasure((IfcVaporPermeabilityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				setIfcMoistureDiffusivityMeasure((IfcMoistureDiffusivityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				setIfcIsothermalMoistureCapacityMeasure((IfcIsothermalMoistureCapacityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				setIfcSpecificHeatCapacityMeasure((IfcSpecificHeatCapacityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MONETARY_MEASURE:
				setIfcMonetaryMeasure((IfcMonetaryMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				setIfcMagneticFluxDensityMeasure((IfcMagneticFluxDensityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_MEASURE:
				setIfcMagneticFluxMeasure((IfcMagneticFluxMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_FLUX_MEASURE:
				setIfcLuminousFluxMeasure((IfcLuminousFluxMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FORCE_MEASURE:
				setIfcForceMeasure((IfcForceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INDUCTANCE_MEASURE:
				setIfcInductanceMeasure((IfcInductanceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ILLUMINANCE_MEASURE:
				setIfcIlluminanceMeasure((IfcIlluminanceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				setIfcElectricResistanceMeasure((IfcElectricResistanceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				setIfcElectricConductanceMeasure((IfcElectricConductanceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CHARGE_MEASURE:
				setIfcElectricChargeMeasure((IfcElectricChargeMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DOSE_EQUIVALENT_MEASURE:
				setIfcDoseEquivalentMeasure((IfcDoseEquivalentMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				setIfcElectricCapacitanceMeasure((IfcElectricCapacitanceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ABSORBED_DOSE_MEASURE:
				setIfcAbsorbedDoseMeasure((IfcAbsorbedDoseMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_RADIO_ACTIVITY_MEASURE:
				setIfcRadioActivityMeasure((IfcRadioActivityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				setIfcRotationalFrequencyMeasure((IfcRotationalFrequencyMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TORQUE_MEASURE:
				setIfcTorqueMeasure((IfcTorqueMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ACCELERATION_MEASURE:
				setIfcAccelerationMeasure((IfcAccelerationMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_FORCE_MEASURE:
				setIfcLinearForceMeasure((IfcLinearForceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_STIFFNESS_MEASURE:
				setIfcLinearStiffnessMeasure((IfcLinearStiffnessMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				setIfcModulusOfSubgradeReactionMeasure((IfcModulusOfSubgradeReactionMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				setIfcModulusOfElasticityMeasure((IfcModulusOfElasticityMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOMENT_OF_INERTIA_MEASURE:
				setIfcMomentOfInertiaMeasure((IfcMomentOfInertiaMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PLANAR_FORCE_MEASURE:
				setIfcPlanarForceMeasure((IfcPlanarForceMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				setIfcRotationalStiffnessMeasure((IfcRotationalStiffnessMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SHEAR_MODULUS_MEASURE:
				setIfcShearModulusMeasure((IfcShearModulusMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_MOMENT_MEASURE:
				setIfcLinearMomentMeasure((IfcLinearMomentMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				setIfcLuminousIntensityDistributionMeasure((IfcLuminousIntensityDistributionMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_CURVATURE_MEASURE:
				setIfcCurvatureMeasure((IfcCurvatureMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_PER_LENGTH_MEASURE:
				setIfcMassPerLengthMeasure((IfcMassPerLengthMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				setIfcModulusOfLinearSubgradeReactionMeasure((IfcModulusOfLinearSubgradeReactionMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				setIfcModulusOfRotationalSubgradeReactionMeasure((IfcModulusOfRotationalSubgradeReactionMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_MASS_MEASURE:
				setIfcRotationalMassMeasure((IfcRotationalMassMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				setIfcSectionalAreaIntegralMeasure((IfcSectionalAreaIntegralMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTION_MODULUS_MEASURE:
				setIfcSectionModulusMeasure((IfcSectionModulusMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				setIfcTemperatureGradientMeasure((IfcTemperatureGradientMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				setIfcThermalExpansionCoefficientMeasure((IfcThermalExpansionCoefficientMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_CONSTANT_MEASURE:
				setIfcWarpingConstantMeasure((IfcWarpingConstantMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_MOMENT_MEASURE:
				setIfcWarpingMomentMeasure((IfcWarpingMomentMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_POWER_MEASURE:
				setIfcSoundPowerMeasure((IfcSoundPowerMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_PRESSURE_MEASURE:
				setIfcSoundPressureMeasure((IfcSoundPressureMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEATING_VALUE_MEASURE:
				setIfcHeatingValueMeasure((IfcHeatingValueMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PH_MEASURE:
				setIfcPHMeasure((IfcPHMeasureType)newValue);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ION_CONCENTRATION_MEASURE:
				setIfcIonConcentrationMeasure((IfcIonConcentrationMeasureType)newValue);
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
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				setIfcVolumetricFlowRateMeasure((IfcVolumetricFlowRateMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TIME_STAMP:
				setIfcTimeStamp((IfcTimeStampType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				setIfcThermalTransmittanceMeasure((IfcThermalTransmittanceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_RESISTANCE_MEASURE:
				setIfcThermalResistanceMeasure((IfcThermalResistanceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_ADMITTANCE_MEASURE:
				setIfcThermalAdmittanceMeasure((IfcThermalAdmittanceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PRESSURE_MEASURE:
				setIfcPressureMeasure((IfcPressureMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_POWER_MEASURE:
				setIfcPowerMeasure((IfcPowerMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_FLOW_RATE_MEASURE:
				setIfcMassFlowRateMeasure((IfcMassFlowRateMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_DENSITY_MEASURE:
				setIfcMassDensityMeasure((IfcMassDensityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_VELOCITY_MEASURE:
				setIfcLinearVelocityMeasure((IfcLinearVelocityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				setIfcKinematicViscosityMeasure((IfcKinematicViscosityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INTEGER_COUNT_RATE_MEASURE:
				setIfcIntegerCountRateMeasure((IfcIntegerCountRateMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				setIfcHeatFluxDensityMeasure((IfcHeatFluxDensityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FREQUENCY_MEASURE:
				setIfcFrequencyMeasure((IfcFrequencyMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ENERGY_MEASURE:
				setIfcEnergyMeasure((IfcEnergyMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				setIfcElectricVoltageMeasure((IfcElectricVoltageMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				setIfcDynamicViscosityMeasure((IfcDynamicViscosityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				setIfcCompoundPlaneAngleMeasure((IfcCompoundPlaneAngleMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ANGULAR_VELOCITY_MEASURE:
				setIfcAngularVelocityMeasure((IfcAngularVelocityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				setIfcThermalConductivityMeasure((IfcThermalConductivityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOLECULAR_WEIGHT_MEASURE:
				setIfcMolecularWeightMeasure((IfcMolecularWeightMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VAPOR_PERMEABILITY_MEASURE:
				setIfcVaporPermeabilityMeasure((IfcVaporPermeabilityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				setIfcMoistureDiffusivityMeasure((IfcMoistureDiffusivityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				setIfcIsothermalMoistureCapacityMeasure((IfcIsothermalMoistureCapacityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				setIfcSpecificHeatCapacityMeasure((IfcSpecificHeatCapacityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MONETARY_MEASURE:
				setIfcMonetaryMeasure((IfcMonetaryMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				setIfcMagneticFluxDensityMeasure((IfcMagneticFluxDensityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_MEASURE:
				setIfcMagneticFluxMeasure((IfcMagneticFluxMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_FLUX_MEASURE:
				setIfcLuminousFluxMeasure((IfcLuminousFluxMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FORCE_MEASURE:
				setIfcForceMeasure((IfcForceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INDUCTANCE_MEASURE:
				setIfcInductanceMeasure((IfcInductanceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ILLUMINANCE_MEASURE:
				setIfcIlluminanceMeasure((IfcIlluminanceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				setIfcElectricResistanceMeasure((IfcElectricResistanceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				setIfcElectricConductanceMeasure((IfcElectricConductanceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CHARGE_MEASURE:
				setIfcElectricChargeMeasure((IfcElectricChargeMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DOSE_EQUIVALENT_MEASURE:
				setIfcDoseEquivalentMeasure((IfcDoseEquivalentMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				setIfcElectricCapacitanceMeasure((IfcElectricCapacitanceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ABSORBED_DOSE_MEASURE:
				setIfcAbsorbedDoseMeasure((IfcAbsorbedDoseMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_RADIO_ACTIVITY_MEASURE:
				setIfcRadioActivityMeasure((IfcRadioActivityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				setIfcRotationalFrequencyMeasure((IfcRotationalFrequencyMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TORQUE_MEASURE:
				setIfcTorqueMeasure((IfcTorqueMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ACCELERATION_MEASURE:
				setIfcAccelerationMeasure((IfcAccelerationMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_FORCE_MEASURE:
				setIfcLinearForceMeasure((IfcLinearForceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_STIFFNESS_MEASURE:
				setIfcLinearStiffnessMeasure((IfcLinearStiffnessMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				setIfcModulusOfSubgradeReactionMeasure((IfcModulusOfSubgradeReactionMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				setIfcModulusOfElasticityMeasure((IfcModulusOfElasticityMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOMENT_OF_INERTIA_MEASURE:
				setIfcMomentOfInertiaMeasure((IfcMomentOfInertiaMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PLANAR_FORCE_MEASURE:
				setIfcPlanarForceMeasure((IfcPlanarForceMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				setIfcRotationalStiffnessMeasure((IfcRotationalStiffnessMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SHEAR_MODULUS_MEASURE:
				setIfcShearModulusMeasure((IfcShearModulusMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_MOMENT_MEASURE:
				setIfcLinearMomentMeasure((IfcLinearMomentMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				setIfcLuminousIntensityDistributionMeasure((IfcLuminousIntensityDistributionMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_CURVATURE_MEASURE:
				setIfcCurvatureMeasure((IfcCurvatureMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_PER_LENGTH_MEASURE:
				setIfcMassPerLengthMeasure((IfcMassPerLengthMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				setIfcModulusOfLinearSubgradeReactionMeasure((IfcModulusOfLinearSubgradeReactionMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				setIfcModulusOfRotationalSubgradeReactionMeasure((IfcModulusOfRotationalSubgradeReactionMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_MASS_MEASURE:
				setIfcRotationalMassMeasure((IfcRotationalMassMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				setIfcSectionalAreaIntegralMeasure((IfcSectionalAreaIntegralMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTION_MODULUS_MEASURE:
				setIfcSectionModulusMeasure((IfcSectionModulusMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				setIfcTemperatureGradientMeasure((IfcTemperatureGradientMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				setIfcThermalExpansionCoefficientMeasure((IfcThermalExpansionCoefficientMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_CONSTANT_MEASURE:
				setIfcWarpingConstantMeasure((IfcWarpingConstantMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_MOMENT_MEASURE:
				setIfcWarpingMomentMeasure((IfcWarpingMomentMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_POWER_MEASURE:
				setIfcSoundPowerMeasure((IfcSoundPowerMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_PRESSURE_MEASURE:
				setIfcSoundPressureMeasure((IfcSoundPressureMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEATING_VALUE_MEASURE:
				setIfcHeatingValueMeasure((IfcHeatingValueMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PH_MEASURE:
				setIfcPHMeasure((IfcPHMeasureType)null);
				return;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ION_CONCENTRATION_MEASURE:
				setIfcIonConcentrationMeasure((IfcIonConcentrationMeasureType)null);
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
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				return ifcVolumetricFlowRateMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TIME_STAMP:
				return ifcTimeStamp != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				return ifcThermalTransmittanceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_RESISTANCE_MEASURE:
				return ifcThermalResistanceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_ADMITTANCE_MEASURE:
				return ifcThermalAdmittanceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PRESSURE_MEASURE:
				return ifcPressureMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_POWER_MEASURE:
				return ifcPowerMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_FLOW_RATE_MEASURE:
				return ifcMassFlowRateMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_DENSITY_MEASURE:
				return ifcMassDensityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_VELOCITY_MEASURE:
				return ifcLinearVelocityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				return ifcKinematicViscosityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INTEGER_COUNT_RATE_MEASURE:
				return ifcIntegerCountRateMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				return ifcHeatFluxDensityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FREQUENCY_MEASURE:
				return ifcFrequencyMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ENERGY_MEASURE:
				return ifcEnergyMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				return ifcElectricVoltageMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				return ifcDynamicViscosityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				return ifcCompoundPlaneAngleMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ANGULAR_VELOCITY_MEASURE:
				return ifcAngularVelocityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				return ifcThermalConductivityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOLECULAR_WEIGHT_MEASURE:
				return ifcMolecularWeightMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_VAPOR_PERMEABILITY_MEASURE:
				return ifcVaporPermeabilityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				return ifcMoistureDiffusivityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				return ifcIsothermalMoistureCapacityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				return ifcSpecificHeatCapacityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MONETARY_MEASURE:
				return ifcMonetaryMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				return ifcMagneticFluxDensityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MAGNETIC_FLUX_MEASURE:
				return ifcMagneticFluxMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_FLUX_MEASURE:
				return ifcLuminousFluxMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_FORCE_MEASURE:
				return ifcForceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_INDUCTANCE_MEASURE:
				return ifcInductanceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ILLUMINANCE_MEASURE:
				return ifcIlluminanceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				return ifcElectricResistanceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				return ifcElectricConductanceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CHARGE_MEASURE:
				return ifcElectricChargeMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_DOSE_EQUIVALENT_MEASURE:
				return ifcDoseEquivalentMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				return ifcElectricCapacitanceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ABSORBED_DOSE_MEASURE:
				return ifcAbsorbedDoseMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_RADIO_ACTIVITY_MEASURE:
				return ifcRadioActivityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				return ifcRotationalFrequencyMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TORQUE_MEASURE:
				return ifcTorqueMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ACCELERATION_MEASURE:
				return ifcAccelerationMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_FORCE_MEASURE:
				return ifcLinearForceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_STIFFNESS_MEASURE:
				return ifcLinearStiffnessMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				return ifcModulusOfSubgradeReactionMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				return ifcModulusOfElasticityMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MOMENT_OF_INERTIA_MEASURE:
				return ifcMomentOfInertiaMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PLANAR_FORCE_MEASURE:
				return ifcPlanarForceMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				return ifcRotationalStiffnessMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SHEAR_MODULUS_MEASURE:
				return ifcShearModulusMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LINEAR_MOMENT_MEASURE:
				return ifcLinearMomentMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				return ifcLuminousIntensityDistributionMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_CURVATURE_MEASURE:
				return ifcCurvatureMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MASS_PER_LENGTH_MEASURE:
				return ifcMassPerLengthMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				return ifcModulusOfLinearSubgradeReactionMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				return ifcModulusOfRotationalSubgradeReactionMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ROTATIONAL_MASS_MEASURE:
				return ifcRotationalMassMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				return ifcSectionalAreaIntegralMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SECTION_MODULUS_MEASURE:
				return ifcSectionModulusMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				return ifcTemperatureGradientMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				return ifcThermalExpansionCoefficientMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_CONSTANT_MEASURE:
				return ifcWarpingConstantMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_WARPING_MOMENT_MEASURE:
				return ifcWarpingMomentMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_POWER_MEASURE:
				return ifcSoundPowerMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_SOUND_PRESSURE_MEASURE:
				return ifcSoundPressureMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_HEATING_VALUE_MEASURE:
				return ifcHeatingValueMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_PH_MEASURE:
				return ifcPHMeasure != null;
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE__IFC_ION_CONCENTRATION_MEASURE:
				return ifcIonConcentrationMeasure != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcDerivedMeasureValueImpl