/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonFactory;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAbsorbedDoseMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAccelerationMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAmountOfSubstanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAngularVelocityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAreaMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcComplexNumberType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCompoundPlaneAngleMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcContextDependentMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCountMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurvatureMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDescriptiveMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoseEquivalentMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDynamicViscosityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricCapacitanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricChargeMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricConductanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricCurrentMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricResistanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricVoltageMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEnergyMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcForceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFrequencyMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHeatFluxDensityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHeatingValueMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIdentifierType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIlluminanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInductanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIntegerCountRateMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIntegerType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIonConcentrationMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIsothermalMoistureCapacityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcKinematicViscosityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabelType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLinearForceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLinearMomentMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLinearStiffnessMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLinearVelocityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLogicalType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLuminousFluxMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLuminousIntensityDistributionMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLuminousIntensityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMagneticFluxDensityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMagneticFluxMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassDensityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassFlowRateMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassPerLengthMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfElasticityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfLinearSubgradeReactionMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfRotationalSubgradeReactionMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfSubgradeReactionMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMoistureDiffusivityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMolecularWeightMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMomentOfInertiaMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMonetaryMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNumericMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPHMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcParameterValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlanarForceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlaneAngleMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositivePlaneAngleMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPowerMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPressureMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRadioActivityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRatioMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRealType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRotationalFrequencyMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRotationalMassMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRotationalStiffnessMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionModulusMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionalAreaIntegralMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShearModulusMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSolidAngleMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundPowerMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundPressureMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecificHeatCapacityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTemperatureGradientMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalAdmittanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalConductivityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalExpansionCoefficientMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalResistanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalTransmittanceMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeStampType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTorqueMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVaporPermeabilityMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVolumeMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVolumetricFlowRateMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWarpingConstantMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWarpingMomentMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ListValuesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Values Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcValue <em>Ifc Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcVolumeMeasure <em>Ifc Volume Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcTimeMeasure <em>Ifc Time Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcThermodynamicTemperatureMeasure <em>Ifc Thermodynamic Temperature Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcSolidAngleMeasure <em>Ifc Solid Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcPositiveRatioMeasure <em>Ifc Positive Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcRatioMeasure <em>Ifc Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcPositivePlaneAngleMeasure <em>Ifc Positive Plane Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcPlaneAngleMeasure <em>Ifc Plane Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcParameterValue <em>Ifc Parameter Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcNumericMeasure <em>Ifc Numeric Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMassMeasure <em>Ifc Mass Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcPositiveLengthMeasure <em>Ifc Positive Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLengthMeasure <em>Ifc Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcElectricCurrentMeasure <em>Ifc Electric Current Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcDescriptiveMeasure <em>Ifc Descriptive Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcCountMeasure <em>Ifc Count Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcContextDependentMeasure <em>Ifc Context Dependent Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcAreaMeasure <em>Ifc Area Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcAmountOfSubstanceMeasure <em>Ifc Amount Of Substance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLuminousIntensityMeasure <em>Ifc Luminous Intensity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcNormalisedRatioMeasure <em>Ifc Normalised Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcComplexNumber <em>Ifc Complex Number</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcInteger <em>Ifc Integer</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcReal <em>Ifc Real</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcBoolean <em>Ifc Boolean</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcIdentifier <em>Ifc Identifier</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcText <em>Ifc Text</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLabel <em>Ifc Label</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLogical <em>Ifc Logical</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcVolumetricFlowRateMeasure <em>Ifc Volumetric Flow Rate Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcTimeStamp <em>Ifc Time Stamp</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcThermalTransmittanceMeasure <em>Ifc Thermal Transmittance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcThermalResistanceMeasure <em>Ifc Thermal Resistance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcThermalAdmittanceMeasure <em>Ifc Thermal Admittance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcPressureMeasure <em>Ifc Pressure Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcPowerMeasure <em>Ifc Power Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMassFlowRateMeasure <em>Ifc Mass Flow Rate Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMassDensityMeasure <em>Ifc Mass Density Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLinearVelocityMeasure <em>Ifc Linear Velocity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcKinematicViscosityMeasure <em>Ifc Kinematic Viscosity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcIntegerCountRateMeasure <em>Ifc Integer Count Rate Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcHeatFluxDensityMeasure <em>Ifc Heat Flux Density Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcFrequencyMeasure <em>Ifc Frequency Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcEnergyMeasure <em>Ifc Energy Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcElectricVoltageMeasure <em>Ifc Electric Voltage Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcDynamicViscosityMeasure <em>Ifc Dynamic Viscosity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcCompoundPlaneAngleMeasure <em>Ifc Compound Plane Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcAngularVelocityMeasure <em>Ifc Angular Velocity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcThermalConductivityMeasure <em>Ifc Thermal Conductivity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMolecularWeightMeasure <em>Ifc Molecular Weight Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcVaporPermeabilityMeasure <em>Ifc Vapor Permeability Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMoistureDiffusivityMeasure <em>Ifc Moisture Diffusivity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcIsothermalMoistureCapacityMeasure <em>Ifc Isothermal Moisture Capacity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcSpecificHeatCapacityMeasure <em>Ifc Specific Heat Capacity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMonetaryMeasure <em>Ifc Monetary Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMagneticFluxDensityMeasure <em>Ifc Magnetic Flux Density Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMagneticFluxMeasure <em>Ifc Magnetic Flux Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLuminousFluxMeasure <em>Ifc Luminous Flux Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcForceMeasure <em>Ifc Force Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcInductanceMeasure <em>Ifc Inductance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcIlluminanceMeasure <em>Ifc Illuminance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcElectricResistanceMeasure <em>Ifc Electric Resistance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcElectricConductanceMeasure <em>Ifc Electric Conductance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcElectricChargeMeasure <em>Ifc Electric Charge Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcDoseEquivalentMeasure <em>Ifc Dose Equivalent Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcElectricCapacitanceMeasure <em>Ifc Electric Capacitance Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcAbsorbedDoseMeasure <em>Ifc Absorbed Dose Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcRadioActivityMeasure <em>Ifc Radio Activity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcRotationalFrequencyMeasure <em>Ifc Rotational Frequency Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcTorqueMeasure <em>Ifc Torque Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcAccelerationMeasure <em>Ifc Acceleration Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLinearForceMeasure <em>Ifc Linear Force Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLinearStiffnessMeasure <em>Ifc Linear Stiffness Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcModulusOfSubgradeReactionMeasure <em>Ifc Modulus Of Subgrade Reaction Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcModulusOfElasticityMeasure <em>Ifc Modulus Of Elasticity Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMomentOfInertiaMeasure <em>Ifc Moment Of Inertia Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcPlanarForceMeasure <em>Ifc Planar Force Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcRotationalStiffnessMeasure <em>Ifc Rotational Stiffness Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcShearModulusMeasure <em>Ifc Shear Modulus Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLinearMomentMeasure <em>Ifc Linear Moment Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcLuminousIntensityDistributionMeasure <em>Ifc Luminous Intensity Distribution Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcCurvatureMeasure <em>Ifc Curvature Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcMassPerLengthMeasure <em>Ifc Mass Per Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcModulusOfLinearSubgradeReactionMeasure <em>Ifc Modulus Of Linear Subgrade Reaction Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcModulusOfRotationalSubgradeReactionMeasure <em>Ifc Modulus Of Rotational Subgrade Reaction Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcRotationalMassMeasure <em>Ifc Rotational Mass Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcSectionalAreaIntegralMeasure <em>Ifc Sectional Area Integral Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcSectionModulusMeasure <em>Ifc Section Modulus Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcTemperatureGradientMeasure <em>Ifc Temperature Gradient Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcThermalExpansionCoefficientMeasure <em>Ifc Thermal Expansion Coefficient Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcWarpingConstantMeasure <em>Ifc Warping Constant Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcWarpingMomentMeasure <em>Ifc Warping Moment Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcSoundPowerMeasure <em>Ifc Sound Power Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcSoundPressureMeasure <em>Ifc Sound Pressure Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcHeatingValueMeasure <em>Ifc Heating Value Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcPHMeasure <em>Ifc PH Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getIfcIonConcentrationMeasure <em>Ifc Ion Concentration Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ListValuesTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListValuesTypeImpl extends EObjectImpl implements ListValuesType {
	/**
	 * The cached value of the '{@link #getIfcValue() <em>Ifc Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcValue()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcValue;

	/**
	 * The default value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> ARRAY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected List<BigInteger> arraySize = ARRAY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCType() <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCType()
	 * @generated
	 * @ordered
	 */
	@SuppressWarnings("unchecked")
	protected static final List<AggregateType> CTYPE_EDEFAULT = (List<AggregateType>)CommonFactory.eINSTANCE.createFromString(CommonPackage.eINSTANCE.getCTypeType(), "list");

	/**
	 * The cached value of the '{@link #getCType() <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCType()
	 * @generated
	 * @ordered
	 */
	protected List<AggregateType> cType = CTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final QName ITEM_TYPE_EDEFAULT = (QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getQName(), "ifc:IfcValue");

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected QName itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListValuesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getListValuesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcValue() {
		if (ifcValue == null) {
			ifcValue = new BasicFeatureMap(this, FinalPackage.LIST_VALUES_TYPE__IFC_VALUE);
		}
		return ifcValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcVolumeMeasureType> getIfcVolumeMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcVolumeMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTimeMeasureType> getIfcTimeMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcTimeMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcThermodynamicTemperatureMeasureType> getIfcThermodynamicTemperatureMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcThermodynamicTemperatureMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSolidAngleMeasureType> getIfcSolidAngleMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcSolidAngleMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPositiveRatioMeasureType> getIfcPositiveRatioMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcPositiveRatioMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRatioMeasureType> getIfcRatioMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcRatioMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPositivePlaneAngleMeasureType> getIfcPositivePlaneAngleMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcPositivePlaneAngleMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPlaneAngleMeasureType> getIfcPlaneAngleMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcPlaneAngleMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcParameterValueType> getIfcParameterValue() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcParameterValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcNumericMeasureType> getIfcNumericMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcNumericMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMassMeasureType> getIfcMassMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMassMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPositiveLengthMeasureType> getIfcPositiveLengthMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcPositiveLengthMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLengthMeasureType> getIfcLengthMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLengthMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcElectricCurrentMeasureType> getIfcElectricCurrentMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcElectricCurrentMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDescriptiveMeasureType> getIfcDescriptiveMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcDescriptiveMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCountMeasureType> getIfcCountMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcCountMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcContextDependentMeasureType> getIfcContextDependentMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcContextDependentMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAreaMeasureType> getIfcAreaMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcAreaMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAmountOfSubstanceMeasureType> getIfcAmountOfSubstanceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcAmountOfSubstanceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLuminousIntensityMeasureType> getIfcLuminousIntensityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLuminousIntensityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcNormalisedRatioMeasureType> getIfcNormalisedRatioMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcNormalisedRatioMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcComplexNumberType> getIfcComplexNumber() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcComplexNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcIntegerType> getIfcInteger() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcInteger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRealType> getIfcReal() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcReal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcBooleanType> getIfcBoolean() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcBoolean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcIdentifierType> getIfcIdentifier() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTextType> getIfcText() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcText());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLabelType> getIfcLabel() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLogicalType> getIfcLogical() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLogical());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcVolumetricFlowRateMeasureType> getIfcVolumetricFlowRateMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcVolumetricFlowRateMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTimeStampType> getIfcTimeStamp() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcTimeStamp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcThermalTransmittanceMeasureType> getIfcThermalTransmittanceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcThermalTransmittanceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcThermalResistanceMeasureType> getIfcThermalResistanceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcThermalResistanceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcThermalAdmittanceMeasureType> getIfcThermalAdmittanceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcThermalAdmittanceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPressureMeasureType> getIfcPressureMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcPressureMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPowerMeasureType> getIfcPowerMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcPowerMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMassFlowRateMeasureType> getIfcMassFlowRateMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMassFlowRateMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMassDensityMeasureType> getIfcMassDensityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMassDensityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLinearVelocityMeasureType> getIfcLinearVelocityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLinearVelocityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcKinematicViscosityMeasureType> getIfcKinematicViscosityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcKinematicViscosityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcIntegerCountRateMeasureType> getIfcIntegerCountRateMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcIntegerCountRateMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcHeatFluxDensityMeasureType> getIfcHeatFluxDensityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcHeatFluxDensityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcFrequencyMeasureType> getIfcFrequencyMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcFrequencyMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcEnergyMeasureType> getIfcEnergyMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcEnergyMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcElectricVoltageMeasureType> getIfcElectricVoltageMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcElectricVoltageMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDynamicViscosityMeasureType> getIfcDynamicViscosityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcDynamicViscosityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCompoundPlaneAngleMeasureType> getIfcCompoundPlaneAngleMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcCompoundPlaneAngleMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAngularVelocityMeasureType> getIfcAngularVelocityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcAngularVelocityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcThermalConductivityMeasureType> getIfcThermalConductivityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcThermalConductivityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMolecularWeightMeasureType> getIfcMolecularWeightMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMolecularWeightMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcVaporPermeabilityMeasureType> getIfcVaporPermeabilityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcVaporPermeabilityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMoistureDiffusivityMeasureType> getIfcMoistureDiffusivityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMoistureDiffusivityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcIsothermalMoistureCapacityMeasureType> getIfcIsothermalMoistureCapacityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcIsothermalMoistureCapacityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSpecificHeatCapacityMeasureType> getIfcSpecificHeatCapacityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcSpecificHeatCapacityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMonetaryMeasureType> getIfcMonetaryMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMonetaryMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMagneticFluxDensityMeasureType> getIfcMagneticFluxDensityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMagneticFluxDensityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMagneticFluxMeasureType> getIfcMagneticFluxMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMagneticFluxMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLuminousFluxMeasureType> getIfcLuminousFluxMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLuminousFluxMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcForceMeasureType> getIfcForceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcForceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcInductanceMeasureType> getIfcInductanceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcInductanceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcIlluminanceMeasureType> getIfcIlluminanceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcIlluminanceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcElectricResistanceMeasureType> getIfcElectricResistanceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcElectricResistanceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcElectricConductanceMeasureType> getIfcElectricConductanceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcElectricConductanceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcElectricChargeMeasureType> getIfcElectricChargeMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcElectricChargeMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDoseEquivalentMeasureType> getIfcDoseEquivalentMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcDoseEquivalentMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcElectricCapacitanceMeasureType> getIfcElectricCapacitanceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcElectricCapacitanceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAbsorbedDoseMeasureType> getIfcAbsorbedDoseMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcAbsorbedDoseMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRadioActivityMeasureType> getIfcRadioActivityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcRadioActivityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRotationalFrequencyMeasureType> getIfcRotationalFrequencyMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcRotationalFrequencyMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTorqueMeasureType> getIfcTorqueMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcTorqueMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcAccelerationMeasureType> getIfcAccelerationMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcAccelerationMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLinearForceMeasureType> getIfcLinearForceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLinearForceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLinearStiffnessMeasureType> getIfcLinearStiffnessMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLinearStiffnessMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcModulusOfSubgradeReactionMeasureType> getIfcModulusOfSubgradeReactionMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcModulusOfSubgradeReactionMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcModulusOfElasticityMeasureType> getIfcModulusOfElasticityMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcModulusOfElasticityMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMomentOfInertiaMeasureType> getIfcMomentOfInertiaMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMomentOfInertiaMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPlanarForceMeasureType> getIfcPlanarForceMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcPlanarForceMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRotationalStiffnessMeasureType> getIfcRotationalStiffnessMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcRotationalStiffnessMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcShearModulusMeasureType> getIfcShearModulusMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcShearModulusMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLinearMomentMeasureType> getIfcLinearMomentMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLinearMomentMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLuminousIntensityDistributionMeasureType> getIfcLuminousIntensityDistributionMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcLuminousIntensityDistributionMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcCurvatureMeasureType> getIfcCurvatureMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcCurvatureMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMassPerLengthMeasureType> getIfcMassPerLengthMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcMassPerLengthMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcModulusOfLinearSubgradeReactionMeasureType> getIfcModulusOfLinearSubgradeReactionMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcModulusOfLinearSubgradeReactionMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcModulusOfRotationalSubgradeReactionMeasureType> getIfcModulusOfRotationalSubgradeReactionMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcModulusOfRotationalSubgradeReactionMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRotationalMassMeasureType> getIfcRotationalMassMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcRotationalMassMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSectionalAreaIntegralMeasureType> getIfcSectionalAreaIntegralMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcSectionalAreaIntegralMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSectionModulusMeasureType> getIfcSectionModulusMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcSectionModulusMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcTemperatureGradientMeasureType> getIfcTemperatureGradientMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcTemperatureGradientMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcThermalExpansionCoefficientMeasureType> getIfcThermalExpansionCoefficientMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcThermalExpansionCoefficientMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcWarpingConstantMeasureType> getIfcWarpingConstantMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcWarpingConstantMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcWarpingMomentMeasureType> getIfcWarpingMomentMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcWarpingMomentMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSoundPowerMeasureType> getIfcSoundPowerMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcSoundPowerMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSoundPressureMeasureType> getIfcSoundPressureMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcSoundPressureMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcHeatingValueMeasureType> getIfcHeatingValueMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcHeatingValueMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcPHMeasureType> getIfcPHMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcPHMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcIonConcentrationMeasureType> getIfcIonConcentrationMeasure() {
		return getIfcValue().list(FinalPackage.eINSTANCE.getListValuesType_IfcIonConcentrationMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> getArraySize() {
		return arraySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArraySize(List<BigInteger> newArraySize) {
		List<BigInteger> oldArraySize = arraySize;
		arraySize = newArraySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.LIST_VALUES_TYPE__ARRAY_SIZE, oldArraySize, arraySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AggregateType> getCType() {
		return cType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCType(List<AggregateType> newCType) {
		List<AggregateType> oldCType = cType;
		cType = newCType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.LIST_VALUES_TYPE__CTYPE, oldCType, cType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(QName newItemType) {
		QName oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.LIST_VALUES_TYPE__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.LIST_VALUES_TYPE__IFC_VALUE:
				return ((InternalEList<?>)getIfcValue()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUME_MEASURE:
				return ((InternalEList<?>)getIfcVolumeMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_MEASURE:
				return ((InternalEList<?>)getIfcTimeMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				return ((InternalEList<?>)getIfcThermodynamicTemperatureMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOLID_ANGLE_MEASURE:
				return ((InternalEList<?>)getIfcSolidAngleMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				return ((InternalEList<?>)getIfcPositiveRatioMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_RATIO_MEASURE:
				return ((InternalEList<?>)getIfcRatioMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				return ((InternalEList<?>)getIfcPositivePlaneAngleMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANE_ANGLE_MEASURE:
				return ((InternalEList<?>)getIfcPlaneAngleMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_PARAMETER_VALUE:
				return ((InternalEList<?>)getIfcParameterValue()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_NUMERIC_MEASURE:
				return ((InternalEList<?>)getIfcNumericMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_MEASURE:
				return ((InternalEList<?>)getIfcMassMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return ((InternalEList<?>)getIfcPositiveLengthMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LENGTH_MEASURE:
				return ((InternalEList<?>)getIfcLengthMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				return ((InternalEList<?>)getIfcElectricCurrentMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_DESCRIPTIVE_MEASURE:
				return ((InternalEList<?>)getIfcDescriptiveMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_COUNT_MEASURE:
				return ((InternalEList<?>)getIfcCountMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				return ((InternalEList<?>)getIfcContextDependentMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_AREA_MEASURE:
				return ((InternalEList<?>)getIfcAreaMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				return ((InternalEList<?>)getIfcAmountOfSubstanceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				return ((InternalEList<?>)getIfcLuminousIntensityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return ((InternalEList<?>)getIfcNormalisedRatioMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPLEX_NUMBER:
				return ((InternalEList<?>)getIfcComplexNumber()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER:
				return ((InternalEList<?>)getIfcInteger()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_REAL:
				return ((InternalEList<?>)getIfcReal()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_BOOLEAN:
				return ((InternalEList<?>)getIfcBoolean()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_IDENTIFIER:
				return ((InternalEList<?>)getIfcIdentifier()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEXT:
				return ((InternalEList<?>)getIfcText()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LABEL:
				return ((InternalEList<?>)getIfcLabel()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LOGICAL:
				return ((InternalEList<?>)getIfcLogical()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				return ((InternalEList<?>)getIfcVolumetricFlowRateMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_STAMP:
				return ((InternalEList<?>)getIfcTimeStamp()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				return ((InternalEList<?>)getIfcThermalTransmittanceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_RESISTANCE_MEASURE:
				return ((InternalEList<?>)getIfcThermalResistanceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_ADMITTANCE_MEASURE:
				return ((InternalEList<?>)getIfcThermalAdmittanceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_PRESSURE_MEASURE:
				return ((InternalEList<?>)getIfcPressureMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_POWER_MEASURE:
				return ((InternalEList<?>)getIfcPowerMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_FLOW_RATE_MEASURE:
				return ((InternalEList<?>)getIfcMassFlowRateMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_DENSITY_MEASURE:
				return ((InternalEList<?>)getIfcMassDensityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_VELOCITY_MEASURE:
				return ((InternalEList<?>)getIfcLinearVelocityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				return ((InternalEList<?>)getIfcKinematicViscosityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER_COUNT_RATE_MEASURE:
				return ((InternalEList<?>)getIfcIntegerCountRateMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				return ((InternalEList<?>)getIfcHeatFluxDensityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_FREQUENCY_MEASURE:
				return ((InternalEList<?>)getIfcFrequencyMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ENERGY_MEASURE:
				return ((InternalEList<?>)getIfcEnergyMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				return ((InternalEList<?>)getIfcElectricVoltageMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				return ((InternalEList<?>)getIfcDynamicViscosityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				return ((InternalEList<?>)getIfcCompoundPlaneAngleMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ANGULAR_VELOCITY_MEASURE:
				return ((InternalEList<?>)getIfcAngularVelocityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				return ((InternalEList<?>)getIfcThermalConductivityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOLECULAR_WEIGHT_MEASURE:
				return ((InternalEList<?>)getIfcMolecularWeightMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_VAPOR_PERMEABILITY_MEASURE:
				return ((InternalEList<?>)getIfcVaporPermeabilityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				return ((InternalEList<?>)getIfcMoistureDiffusivityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				return ((InternalEList<?>)getIfcIsothermalMoistureCapacityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				return ((InternalEList<?>)getIfcSpecificHeatCapacityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MONETARY_MEASURE:
				return ((InternalEList<?>)getIfcMonetaryMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				return ((InternalEList<?>)getIfcMagneticFluxDensityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_MEASURE:
				return ((InternalEList<?>)getIfcMagneticFluxMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_FLUX_MEASURE:
				return ((InternalEList<?>)getIfcLuminousFluxMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_FORCE_MEASURE:
				return ((InternalEList<?>)getIfcForceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_INDUCTANCE_MEASURE:
				return ((InternalEList<?>)getIfcInductanceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ILLUMINANCE_MEASURE:
				return ((InternalEList<?>)getIfcIlluminanceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				return ((InternalEList<?>)getIfcElectricResistanceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				return ((InternalEList<?>)getIfcElectricConductanceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CHARGE_MEASURE:
				return ((InternalEList<?>)getIfcElectricChargeMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_DOSE_EQUIVALENT_MEASURE:
				return ((InternalEList<?>)getIfcDoseEquivalentMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				return ((InternalEList<?>)getIfcElectricCapacitanceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ABSORBED_DOSE_MEASURE:
				return ((InternalEList<?>)getIfcAbsorbedDoseMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_RADIO_ACTIVITY_MEASURE:
				return ((InternalEList<?>)getIfcRadioActivityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				return ((InternalEList<?>)getIfcRotationalFrequencyMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_TORQUE_MEASURE:
				return ((InternalEList<?>)getIfcTorqueMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ACCELERATION_MEASURE:
				return ((InternalEList<?>)getIfcAccelerationMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_FORCE_MEASURE:
				return ((InternalEList<?>)getIfcLinearForceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_STIFFNESS_MEASURE:
				return ((InternalEList<?>)getIfcLinearStiffnessMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				return ((InternalEList<?>)getIfcModulusOfSubgradeReactionMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				return ((InternalEList<?>)getIfcModulusOfElasticityMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOMENT_OF_INERTIA_MEASURE:
				return ((InternalEList<?>)getIfcMomentOfInertiaMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANAR_FORCE_MEASURE:
				return ((InternalEList<?>)getIfcPlanarForceMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				return ((InternalEList<?>)getIfcRotationalStiffnessMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_SHEAR_MODULUS_MEASURE:
				return ((InternalEList<?>)getIfcShearModulusMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_MOMENT_MEASURE:
				return ((InternalEList<?>)getIfcLinearMomentMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				return ((InternalEList<?>)getIfcLuminousIntensityDistributionMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_CURVATURE_MEASURE:
				return ((InternalEList<?>)getIfcCurvatureMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_PER_LENGTH_MEASURE:
				return ((InternalEList<?>)getIfcMassPerLengthMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				return ((InternalEList<?>)getIfcModulusOfLinearSubgradeReactionMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				return ((InternalEList<?>)getIfcModulusOfRotationalSubgradeReactionMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_MASS_MEASURE:
				return ((InternalEList<?>)getIfcRotationalMassMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				return ((InternalEList<?>)getIfcSectionalAreaIntegralMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTION_MODULUS_MEASURE:
				return ((InternalEList<?>)getIfcSectionModulusMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				return ((InternalEList<?>)getIfcTemperatureGradientMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				return ((InternalEList<?>)getIfcThermalExpansionCoefficientMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_CONSTANT_MEASURE:
				return ((InternalEList<?>)getIfcWarpingConstantMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_MOMENT_MEASURE:
				return ((InternalEList<?>)getIfcWarpingMomentMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_POWER_MEASURE:
				return ((InternalEList<?>)getIfcSoundPowerMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_PRESSURE_MEASURE:
				return ((InternalEList<?>)getIfcSoundPressureMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEATING_VALUE_MEASURE:
				return ((InternalEList<?>)getIfcHeatingValueMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_PH_MEASURE:
				return ((InternalEList<?>)getIfcPHMeasure()).basicRemove(otherEnd, msgs);
			case FinalPackage.LIST_VALUES_TYPE__IFC_ION_CONCENTRATION_MEASURE:
				return ((InternalEList<?>)getIfcIonConcentrationMeasure()).basicRemove(otherEnd, msgs);
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
			case FinalPackage.LIST_VALUES_TYPE__IFC_VALUE:
				if (coreType) return getIfcValue();
				return ((FeatureMap.Internal)getIfcValue()).getWrapper();
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUME_MEASURE:
				return getIfcVolumeMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_MEASURE:
				return getIfcTimeMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				return getIfcThermodynamicTemperatureMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOLID_ANGLE_MEASURE:
				return getIfcSolidAngleMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				return getIfcPositiveRatioMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_RATIO_MEASURE:
				return getIfcRatioMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				return getIfcPositivePlaneAngleMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANE_ANGLE_MEASURE:
				return getIfcPlaneAngleMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PARAMETER_VALUE:
				return getIfcParameterValue();
			case FinalPackage.LIST_VALUES_TYPE__IFC_NUMERIC_MEASURE:
				return getIfcNumericMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_MEASURE:
				return getIfcMassMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return getIfcPositiveLengthMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LENGTH_MEASURE:
				return getIfcLengthMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				return getIfcElectricCurrentMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_DESCRIPTIVE_MEASURE:
				return getIfcDescriptiveMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_COUNT_MEASURE:
				return getIfcCountMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				return getIfcContextDependentMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_AREA_MEASURE:
				return getIfcAreaMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				return getIfcAmountOfSubstanceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				return getIfcLuminousIntensityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return getIfcNormalisedRatioMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPLEX_NUMBER:
				return getIfcComplexNumber();
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER:
				return getIfcInteger();
			case FinalPackage.LIST_VALUES_TYPE__IFC_REAL:
				return getIfcReal();
			case FinalPackage.LIST_VALUES_TYPE__IFC_BOOLEAN:
				return getIfcBoolean();
			case FinalPackage.LIST_VALUES_TYPE__IFC_IDENTIFIER:
				return getIfcIdentifier();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEXT:
				return getIfcText();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LABEL:
				return getIfcLabel();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LOGICAL:
				return getIfcLogical();
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				return getIfcVolumetricFlowRateMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_STAMP:
				return getIfcTimeStamp();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				return getIfcThermalTransmittanceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_RESISTANCE_MEASURE:
				return getIfcThermalResistanceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_ADMITTANCE_MEASURE:
				return getIfcThermalAdmittanceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PRESSURE_MEASURE:
				return getIfcPressureMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_POWER_MEASURE:
				return getIfcPowerMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_FLOW_RATE_MEASURE:
				return getIfcMassFlowRateMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_DENSITY_MEASURE:
				return getIfcMassDensityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_VELOCITY_MEASURE:
				return getIfcLinearVelocityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				return getIfcKinematicViscosityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER_COUNT_RATE_MEASURE:
				return getIfcIntegerCountRateMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				return getIfcHeatFluxDensityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_FREQUENCY_MEASURE:
				return getIfcFrequencyMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ENERGY_MEASURE:
				return getIfcEnergyMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				return getIfcElectricVoltageMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				return getIfcDynamicViscosityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				return getIfcCompoundPlaneAngleMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ANGULAR_VELOCITY_MEASURE:
				return getIfcAngularVelocityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				return getIfcThermalConductivityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOLECULAR_WEIGHT_MEASURE:
				return getIfcMolecularWeightMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_VAPOR_PERMEABILITY_MEASURE:
				return getIfcVaporPermeabilityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				return getIfcMoistureDiffusivityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				return getIfcIsothermalMoistureCapacityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				return getIfcSpecificHeatCapacityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MONETARY_MEASURE:
				return getIfcMonetaryMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				return getIfcMagneticFluxDensityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_MEASURE:
				return getIfcMagneticFluxMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_FLUX_MEASURE:
				return getIfcLuminousFluxMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_FORCE_MEASURE:
				return getIfcForceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_INDUCTANCE_MEASURE:
				return getIfcInductanceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ILLUMINANCE_MEASURE:
				return getIfcIlluminanceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				return getIfcElectricResistanceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				return getIfcElectricConductanceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CHARGE_MEASURE:
				return getIfcElectricChargeMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_DOSE_EQUIVALENT_MEASURE:
				return getIfcDoseEquivalentMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				return getIfcElectricCapacitanceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ABSORBED_DOSE_MEASURE:
				return getIfcAbsorbedDoseMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_RADIO_ACTIVITY_MEASURE:
				return getIfcRadioActivityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				return getIfcRotationalFrequencyMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TORQUE_MEASURE:
				return getIfcTorqueMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ACCELERATION_MEASURE:
				return getIfcAccelerationMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_FORCE_MEASURE:
				return getIfcLinearForceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_STIFFNESS_MEASURE:
				return getIfcLinearStiffnessMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				return getIfcModulusOfSubgradeReactionMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				return getIfcModulusOfElasticityMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOMENT_OF_INERTIA_MEASURE:
				return getIfcMomentOfInertiaMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANAR_FORCE_MEASURE:
				return getIfcPlanarForceMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				return getIfcRotationalStiffnessMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SHEAR_MODULUS_MEASURE:
				return getIfcShearModulusMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_MOMENT_MEASURE:
				return getIfcLinearMomentMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				return getIfcLuminousIntensityDistributionMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_CURVATURE_MEASURE:
				return getIfcCurvatureMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_PER_LENGTH_MEASURE:
				return getIfcMassPerLengthMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				return getIfcModulusOfLinearSubgradeReactionMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				return getIfcModulusOfRotationalSubgradeReactionMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_MASS_MEASURE:
				return getIfcRotationalMassMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				return getIfcSectionalAreaIntegralMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTION_MODULUS_MEASURE:
				return getIfcSectionModulusMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				return getIfcTemperatureGradientMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				return getIfcThermalExpansionCoefficientMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_CONSTANT_MEASURE:
				return getIfcWarpingConstantMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_MOMENT_MEASURE:
				return getIfcWarpingMomentMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_POWER_MEASURE:
				return getIfcSoundPowerMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_PRESSURE_MEASURE:
				return getIfcSoundPressureMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEATING_VALUE_MEASURE:
				return getIfcHeatingValueMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PH_MEASURE:
				return getIfcPHMeasure();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ION_CONCENTRATION_MEASURE:
				return getIfcIonConcentrationMeasure();
			case FinalPackage.LIST_VALUES_TYPE__ARRAY_SIZE:
				return getArraySize();
			case FinalPackage.LIST_VALUES_TYPE__CTYPE:
				return getCType();
			case FinalPackage.LIST_VALUES_TYPE__ITEM_TYPE:
				return getItemType();
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
			case FinalPackage.LIST_VALUES_TYPE__IFC_VALUE:
				((FeatureMap.Internal)getIfcValue()).set(newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUME_MEASURE:
				getIfcVolumeMeasure().clear();
				getIfcVolumeMeasure().addAll((Collection<? extends IfcVolumeMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_MEASURE:
				getIfcTimeMeasure().clear();
				getIfcTimeMeasure().addAll((Collection<? extends IfcTimeMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				getIfcThermodynamicTemperatureMeasure().clear();
				getIfcThermodynamicTemperatureMeasure().addAll((Collection<? extends IfcThermodynamicTemperatureMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOLID_ANGLE_MEASURE:
				getIfcSolidAngleMeasure().clear();
				getIfcSolidAngleMeasure().addAll((Collection<? extends IfcSolidAngleMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				getIfcPositiveRatioMeasure().clear();
				getIfcPositiveRatioMeasure().addAll((Collection<? extends IfcPositiveRatioMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_RATIO_MEASURE:
				getIfcRatioMeasure().clear();
				getIfcRatioMeasure().addAll((Collection<? extends IfcRatioMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				getIfcPositivePlaneAngleMeasure().clear();
				getIfcPositivePlaneAngleMeasure().addAll((Collection<? extends IfcPositivePlaneAngleMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANE_ANGLE_MEASURE:
				getIfcPlaneAngleMeasure().clear();
				getIfcPlaneAngleMeasure().addAll((Collection<? extends IfcPlaneAngleMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PARAMETER_VALUE:
				getIfcParameterValue().clear();
				getIfcParameterValue().addAll((Collection<? extends IfcParameterValueType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_NUMERIC_MEASURE:
				getIfcNumericMeasure().clear();
				getIfcNumericMeasure().addAll((Collection<? extends IfcNumericMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_MEASURE:
				getIfcMassMeasure().clear();
				getIfcMassMeasure().addAll((Collection<? extends IfcMassMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				getIfcPositiveLengthMeasure().clear();
				getIfcPositiveLengthMeasure().addAll((Collection<? extends IfcPositiveLengthMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LENGTH_MEASURE:
				getIfcLengthMeasure().clear();
				getIfcLengthMeasure().addAll((Collection<? extends IfcLengthMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				getIfcElectricCurrentMeasure().clear();
				getIfcElectricCurrentMeasure().addAll((Collection<? extends IfcElectricCurrentMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_DESCRIPTIVE_MEASURE:
				getIfcDescriptiveMeasure().clear();
				getIfcDescriptiveMeasure().addAll((Collection<? extends IfcDescriptiveMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_COUNT_MEASURE:
				getIfcCountMeasure().clear();
				getIfcCountMeasure().addAll((Collection<? extends IfcCountMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				getIfcContextDependentMeasure().clear();
				getIfcContextDependentMeasure().addAll((Collection<? extends IfcContextDependentMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_AREA_MEASURE:
				getIfcAreaMeasure().clear();
				getIfcAreaMeasure().addAll((Collection<? extends IfcAreaMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				getIfcAmountOfSubstanceMeasure().clear();
				getIfcAmountOfSubstanceMeasure().addAll((Collection<? extends IfcAmountOfSubstanceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				getIfcLuminousIntensityMeasure().clear();
				getIfcLuminousIntensityMeasure().addAll((Collection<? extends IfcLuminousIntensityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				getIfcNormalisedRatioMeasure().clear();
				getIfcNormalisedRatioMeasure().addAll((Collection<? extends IfcNormalisedRatioMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPLEX_NUMBER:
				getIfcComplexNumber().clear();
				getIfcComplexNumber().addAll((Collection<? extends IfcComplexNumberType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER:
				getIfcInteger().clear();
				getIfcInteger().addAll((Collection<? extends IfcIntegerType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_REAL:
				getIfcReal().clear();
				getIfcReal().addAll((Collection<? extends IfcRealType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_BOOLEAN:
				getIfcBoolean().clear();
				getIfcBoolean().addAll((Collection<? extends IfcBooleanType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_IDENTIFIER:
				getIfcIdentifier().clear();
				getIfcIdentifier().addAll((Collection<? extends IfcIdentifierType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEXT:
				getIfcText().clear();
				getIfcText().addAll((Collection<? extends IfcTextType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LABEL:
				getIfcLabel().clear();
				getIfcLabel().addAll((Collection<? extends IfcLabelType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LOGICAL:
				getIfcLogical().clear();
				getIfcLogical().addAll((Collection<? extends IfcLogicalType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				getIfcVolumetricFlowRateMeasure().clear();
				getIfcVolumetricFlowRateMeasure().addAll((Collection<? extends IfcVolumetricFlowRateMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_STAMP:
				getIfcTimeStamp().clear();
				getIfcTimeStamp().addAll((Collection<? extends IfcTimeStampType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				getIfcThermalTransmittanceMeasure().clear();
				getIfcThermalTransmittanceMeasure().addAll((Collection<? extends IfcThermalTransmittanceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_RESISTANCE_MEASURE:
				getIfcThermalResistanceMeasure().clear();
				getIfcThermalResistanceMeasure().addAll((Collection<? extends IfcThermalResistanceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_ADMITTANCE_MEASURE:
				getIfcThermalAdmittanceMeasure().clear();
				getIfcThermalAdmittanceMeasure().addAll((Collection<? extends IfcThermalAdmittanceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PRESSURE_MEASURE:
				getIfcPressureMeasure().clear();
				getIfcPressureMeasure().addAll((Collection<? extends IfcPressureMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_POWER_MEASURE:
				getIfcPowerMeasure().clear();
				getIfcPowerMeasure().addAll((Collection<? extends IfcPowerMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_FLOW_RATE_MEASURE:
				getIfcMassFlowRateMeasure().clear();
				getIfcMassFlowRateMeasure().addAll((Collection<? extends IfcMassFlowRateMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_DENSITY_MEASURE:
				getIfcMassDensityMeasure().clear();
				getIfcMassDensityMeasure().addAll((Collection<? extends IfcMassDensityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_VELOCITY_MEASURE:
				getIfcLinearVelocityMeasure().clear();
				getIfcLinearVelocityMeasure().addAll((Collection<? extends IfcLinearVelocityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				getIfcKinematicViscosityMeasure().clear();
				getIfcKinematicViscosityMeasure().addAll((Collection<? extends IfcKinematicViscosityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER_COUNT_RATE_MEASURE:
				getIfcIntegerCountRateMeasure().clear();
				getIfcIntegerCountRateMeasure().addAll((Collection<? extends IfcIntegerCountRateMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				getIfcHeatFluxDensityMeasure().clear();
				getIfcHeatFluxDensityMeasure().addAll((Collection<? extends IfcHeatFluxDensityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_FREQUENCY_MEASURE:
				getIfcFrequencyMeasure().clear();
				getIfcFrequencyMeasure().addAll((Collection<? extends IfcFrequencyMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ENERGY_MEASURE:
				getIfcEnergyMeasure().clear();
				getIfcEnergyMeasure().addAll((Collection<? extends IfcEnergyMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				getIfcElectricVoltageMeasure().clear();
				getIfcElectricVoltageMeasure().addAll((Collection<? extends IfcElectricVoltageMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				getIfcDynamicViscosityMeasure().clear();
				getIfcDynamicViscosityMeasure().addAll((Collection<? extends IfcDynamicViscosityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				getIfcCompoundPlaneAngleMeasure().clear();
				getIfcCompoundPlaneAngleMeasure().addAll((Collection<? extends IfcCompoundPlaneAngleMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ANGULAR_VELOCITY_MEASURE:
				getIfcAngularVelocityMeasure().clear();
				getIfcAngularVelocityMeasure().addAll((Collection<? extends IfcAngularVelocityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				getIfcThermalConductivityMeasure().clear();
				getIfcThermalConductivityMeasure().addAll((Collection<? extends IfcThermalConductivityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOLECULAR_WEIGHT_MEASURE:
				getIfcMolecularWeightMeasure().clear();
				getIfcMolecularWeightMeasure().addAll((Collection<? extends IfcMolecularWeightMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_VAPOR_PERMEABILITY_MEASURE:
				getIfcVaporPermeabilityMeasure().clear();
				getIfcVaporPermeabilityMeasure().addAll((Collection<? extends IfcVaporPermeabilityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				getIfcMoistureDiffusivityMeasure().clear();
				getIfcMoistureDiffusivityMeasure().addAll((Collection<? extends IfcMoistureDiffusivityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				getIfcIsothermalMoistureCapacityMeasure().clear();
				getIfcIsothermalMoistureCapacityMeasure().addAll((Collection<? extends IfcIsothermalMoistureCapacityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				getIfcSpecificHeatCapacityMeasure().clear();
				getIfcSpecificHeatCapacityMeasure().addAll((Collection<? extends IfcSpecificHeatCapacityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MONETARY_MEASURE:
				getIfcMonetaryMeasure().clear();
				getIfcMonetaryMeasure().addAll((Collection<? extends IfcMonetaryMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				getIfcMagneticFluxDensityMeasure().clear();
				getIfcMagneticFluxDensityMeasure().addAll((Collection<? extends IfcMagneticFluxDensityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_MEASURE:
				getIfcMagneticFluxMeasure().clear();
				getIfcMagneticFluxMeasure().addAll((Collection<? extends IfcMagneticFluxMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_FLUX_MEASURE:
				getIfcLuminousFluxMeasure().clear();
				getIfcLuminousFluxMeasure().addAll((Collection<? extends IfcLuminousFluxMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_FORCE_MEASURE:
				getIfcForceMeasure().clear();
				getIfcForceMeasure().addAll((Collection<? extends IfcForceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_INDUCTANCE_MEASURE:
				getIfcInductanceMeasure().clear();
				getIfcInductanceMeasure().addAll((Collection<? extends IfcInductanceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ILLUMINANCE_MEASURE:
				getIfcIlluminanceMeasure().clear();
				getIfcIlluminanceMeasure().addAll((Collection<? extends IfcIlluminanceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				getIfcElectricResistanceMeasure().clear();
				getIfcElectricResistanceMeasure().addAll((Collection<? extends IfcElectricResistanceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				getIfcElectricConductanceMeasure().clear();
				getIfcElectricConductanceMeasure().addAll((Collection<? extends IfcElectricConductanceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CHARGE_MEASURE:
				getIfcElectricChargeMeasure().clear();
				getIfcElectricChargeMeasure().addAll((Collection<? extends IfcElectricChargeMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_DOSE_EQUIVALENT_MEASURE:
				getIfcDoseEquivalentMeasure().clear();
				getIfcDoseEquivalentMeasure().addAll((Collection<? extends IfcDoseEquivalentMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				getIfcElectricCapacitanceMeasure().clear();
				getIfcElectricCapacitanceMeasure().addAll((Collection<? extends IfcElectricCapacitanceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ABSORBED_DOSE_MEASURE:
				getIfcAbsorbedDoseMeasure().clear();
				getIfcAbsorbedDoseMeasure().addAll((Collection<? extends IfcAbsorbedDoseMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_RADIO_ACTIVITY_MEASURE:
				getIfcRadioActivityMeasure().clear();
				getIfcRadioActivityMeasure().addAll((Collection<? extends IfcRadioActivityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				getIfcRotationalFrequencyMeasure().clear();
				getIfcRotationalFrequencyMeasure().addAll((Collection<? extends IfcRotationalFrequencyMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TORQUE_MEASURE:
				getIfcTorqueMeasure().clear();
				getIfcTorqueMeasure().addAll((Collection<? extends IfcTorqueMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ACCELERATION_MEASURE:
				getIfcAccelerationMeasure().clear();
				getIfcAccelerationMeasure().addAll((Collection<? extends IfcAccelerationMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_FORCE_MEASURE:
				getIfcLinearForceMeasure().clear();
				getIfcLinearForceMeasure().addAll((Collection<? extends IfcLinearForceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_STIFFNESS_MEASURE:
				getIfcLinearStiffnessMeasure().clear();
				getIfcLinearStiffnessMeasure().addAll((Collection<? extends IfcLinearStiffnessMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				getIfcModulusOfSubgradeReactionMeasure().clear();
				getIfcModulusOfSubgradeReactionMeasure().addAll((Collection<? extends IfcModulusOfSubgradeReactionMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				getIfcModulusOfElasticityMeasure().clear();
				getIfcModulusOfElasticityMeasure().addAll((Collection<? extends IfcModulusOfElasticityMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOMENT_OF_INERTIA_MEASURE:
				getIfcMomentOfInertiaMeasure().clear();
				getIfcMomentOfInertiaMeasure().addAll((Collection<? extends IfcMomentOfInertiaMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANAR_FORCE_MEASURE:
				getIfcPlanarForceMeasure().clear();
				getIfcPlanarForceMeasure().addAll((Collection<? extends IfcPlanarForceMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				getIfcRotationalStiffnessMeasure().clear();
				getIfcRotationalStiffnessMeasure().addAll((Collection<? extends IfcRotationalStiffnessMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SHEAR_MODULUS_MEASURE:
				getIfcShearModulusMeasure().clear();
				getIfcShearModulusMeasure().addAll((Collection<? extends IfcShearModulusMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_MOMENT_MEASURE:
				getIfcLinearMomentMeasure().clear();
				getIfcLinearMomentMeasure().addAll((Collection<? extends IfcLinearMomentMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				getIfcLuminousIntensityDistributionMeasure().clear();
				getIfcLuminousIntensityDistributionMeasure().addAll((Collection<? extends IfcLuminousIntensityDistributionMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_CURVATURE_MEASURE:
				getIfcCurvatureMeasure().clear();
				getIfcCurvatureMeasure().addAll((Collection<? extends IfcCurvatureMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_PER_LENGTH_MEASURE:
				getIfcMassPerLengthMeasure().clear();
				getIfcMassPerLengthMeasure().addAll((Collection<? extends IfcMassPerLengthMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				getIfcModulusOfLinearSubgradeReactionMeasure().clear();
				getIfcModulusOfLinearSubgradeReactionMeasure().addAll((Collection<? extends IfcModulusOfLinearSubgradeReactionMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				getIfcModulusOfRotationalSubgradeReactionMeasure().clear();
				getIfcModulusOfRotationalSubgradeReactionMeasure().addAll((Collection<? extends IfcModulusOfRotationalSubgradeReactionMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_MASS_MEASURE:
				getIfcRotationalMassMeasure().clear();
				getIfcRotationalMassMeasure().addAll((Collection<? extends IfcRotationalMassMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				getIfcSectionalAreaIntegralMeasure().clear();
				getIfcSectionalAreaIntegralMeasure().addAll((Collection<? extends IfcSectionalAreaIntegralMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTION_MODULUS_MEASURE:
				getIfcSectionModulusMeasure().clear();
				getIfcSectionModulusMeasure().addAll((Collection<? extends IfcSectionModulusMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				getIfcTemperatureGradientMeasure().clear();
				getIfcTemperatureGradientMeasure().addAll((Collection<? extends IfcTemperatureGradientMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				getIfcThermalExpansionCoefficientMeasure().clear();
				getIfcThermalExpansionCoefficientMeasure().addAll((Collection<? extends IfcThermalExpansionCoefficientMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_CONSTANT_MEASURE:
				getIfcWarpingConstantMeasure().clear();
				getIfcWarpingConstantMeasure().addAll((Collection<? extends IfcWarpingConstantMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_MOMENT_MEASURE:
				getIfcWarpingMomentMeasure().clear();
				getIfcWarpingMomentMeasure().addAll((Collection<? extends IfcWarpingMomentMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_POWER_MEASURE:
				getIfcSoundPowerMeasure().clear();
				getIfcSoundPowerMeasure().addAll((Collection<? extends IfcSoundPowerMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_PRESSURE_MEASURE:
				getIfcSoundPressureMeasure().clear();
				getIfcSoundPressureMeasure().addAll((Collection<? extends IfcSoundPressureMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEATING_VALUE_MEASURE:
				getIfcHeatingValueMeasure().clear();
				getIfcHeatingValueMeasure().addAll((Collection<? extends IfcHeatingValueMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PH_MEASURE:
				getIfcPHMeasure().clear();
				getIfcPHMeasure().addAll((Collection<? extends IfcPHMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ION_CONCENTRATION_MEASURE:
				getIfcIonConcentrationMeasure().clear();
				getIfcIonConcentrationMeasure().addAll((Collection<? extends IfcIonConcentrationMeasureType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case FinalPackage.LIST_VALUES_TYPE__ITEM_TYPE:
				setItemType((QName)newValue);
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
			case FinalPackage.LIST_VALUES_TYPE__IFC_VALUE:
				getIfcValue().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUME_MEASURE:
				getIfcVolumeMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_MEASURE:
				getIfcTimeMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				getIfcThermodynamicTemperatureMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOLID_ANGLE_MEASURE:
				getIfcSolidAngleMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				getIfcPositiveRatioMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_RATIO_MEASURE:
				getIfcRatioMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				getIfcPositivePlaneAngleMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANE_ANGLE_MEASURE:
				getIfcPlaneAngleMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PARAMETER_VALUE:
				getIfcParameterValue().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_NUMERIC_MEASURE:
				getIfcNumericMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_MEASURE:
				getIfcMassMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				getIfcPositiveLengthMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LENGTH_MEASURE:
				getIfcLengthMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				getIfcElectricCurrentMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_DESCRIPTIVE_MEASURE:
				getIfcDescriptiveMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_COUNT_MEASURE:
				getIfcCountMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				getIfcContextDependentMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_AREA_MEASURE:
				getIfcAreaMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				getIfcAmountOfSubstanceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				getIfcLuminousIntensityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				getIfcNormalisedRatioMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPLEX_NUMBER:
				getIfcComplexNumber().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER:
				getIfcInteger().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_REAL:
				getIfcReal().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_BOOLEAN:
				getIfcBoolean().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_IDENTIFIER:
				getIfcIdentifier().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEXT:
				getIfcText().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LABEL:
				getIfcLabel().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LOGICAL:
				getIfcLogical().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				getIfcVolumetricFlowRateMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_STAMP:
				getIfcTimeStamp().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				getIfcThermalTransmittanceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_RESISTANCE_MEASURE:
				getIfcThermalResistanceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_ADMITTANCE_MEASURE:
				getIfcThermalAdmittanceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PRESSURE_MEASURE:
				getIfcPressureMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_POWER_MEASURE:
				getIfcPowerMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_FLOW_RATE_MEASURE:
				getIfcMassFlowRateMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_DENSITY_MEASURE:
				getIfcMassDensityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_VELOCITY_MEASURE:
				getIfcLinearVelocityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				getIfcKinematicViscosityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER_COUNT_RATE_MEASURE:
				getIfcIntegerCountRateMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				getIfcHeatFluxDensityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_FREQUENCY_MEASURE:
				getIfcFrequencyMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ENERGY_MEASURE:
				getIfcEnergyMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				getIfcElectricVoltageMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				getIfcDynamicViscosityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				getIfcCompoundPlaneAngleMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ANGULAR_VELOCITY_MEASURE:
				getIfcAngularVelocityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				getIfcThermalConductivityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOLECULAR_WEIGHT_MEASURE:
				getIfcMolecularWeightMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_VAPOR_PERMEABILITY_MEASURE:
				getIfcVaporPermeabilityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				getIfcMoistureDiffusivityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				getIfcIsothermalMoistureCapacityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				getIfcSpecificHeatCapacityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MONETARY_MEASURE:
				getIfcMonetaryMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				getIfcMagneticFluxDensityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_MEASURE:
				getIfcMagneticFluxMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_FLUX_MEASURE:
				getIfcLuminousFluxMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_FORCE_MEASURE:
				getIfcForceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_INDUCTANCE_MEASURE:
				getIfcInductanceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ILLUMINANCE_MEASURE:
				getIfcIlluminanceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				getIfcElectricResistanceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				getIfcElectricConductanceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CHARGE_MEASURE:
				getIfcElectricChargeMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_DOSE_EQUIVALENT_MEASURE:
				getIfcDoseEquivalentMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				getIfcElectricCapacitanceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ABSORBED_DOSE_MEASURE:
				getIfcAbsorbedDoseMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_RADIO_ACTIVITY_MEASURE:
				getIfcRadioActivityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				getIfcRotationalFrequencyMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TORQUE_MEASURE:
				getIfcTorqueMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ACCELERATION_MEASURE:
				getIfcAccelerationMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_FORCE_MEASURE:
				getIfcLinearForceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_STIFFNESS_MEASURE:
				getIfcLinearStiffnessMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				getIfcModulusOfSubgradeReactionMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				getIfcModulusOfElasticityMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOMENT_OF_INERTIA_MEASURE:
				getIfcMomentOfInertiaMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANAR_FORCE_MEASURE:
				getIfcPlanarForceMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				getIfcRotationalStiffnessMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SHEAR_MODULUS_MEASURE:
				getIfcShearModulusMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_MOMENT_MEASURE:
				getIfcLinearMomentMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				getIfcLuminousIntensityDistributionMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_CURVATURE_MEASURE:
				getIfcCurvatureMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_PER_LENGTH_MEASURE:
				getIfcMassPerLengthMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				getIfcModulusOfLinearSubgradeReactionMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				getIfcModulusOfRotationalSubgradeReactionMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_MASS_MEASURE:
				getIfcRotationalMassMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				getIfcSectionalAreaIntegralMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTION_MODULUS_MEASURE:
				getIfcSectionModulusMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				getIfcTemperatureGradientMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				getIfcThermalExpansionCoefficientMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_CONSTANT_MEASURE:
				getIfcWarpingConstantMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_MOMENT_MEASURE:
				getIfcWarpingMomentMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_POWER_MEASURE:
				getIfcSoundPowerMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_PRESSURE_MEASURE:
				getIfcSoundPressureMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEATING_VALUE_MEASURE:
				getIfcHeatingValueMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_PH_MEASURE:
				getIfcPHMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__IFC_ION_CONCENTRATION_MEASURE:
				getIfcIonConcentrationMeasure().clear();
				return;
			case FinalPackage.LIST_VALUES_TYPE__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case FinalPackage.LIST_VALUES_TYPE__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case FinalPackage.LIST_VALUES_TYPE__ITEM_TYPE:
				setItemType(ITEM_TYPE_EDEFAULT);
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
			case FinalPackage.LIST_VALUES_TYPE__IFC_VALUE:
				return ifcValue != null && !ifcValue.isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUME_MEASURE:
				return !getIfcVolumeMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_MEASURE:
				return !getIfcTimeMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				return !getIfcThermodynamicTemperatureMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOLID_ANGLE_MEASURE:
				return !getIfcSolidAngleMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_RATIO_MEASURE:
				return !getIfcPositiveRatioMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_RATIO_MEASURE:
				return !getIfcRatioMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				return !getIfcPositivePlaneAngleMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANE_ANGLE_MEASURE:
				return !getIfcPlaneAngleMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PARAMETER_VALUE:
				return !getIfcParameterValue().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_NUMERIC_MEASURE:
				return !getIfcNumericMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_MEASURE:
				return !getIfcMassMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_POSITIVE_LENGTH_MEASURE:
				return !getIfcPositiveLengthMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LENGTH_MEASURE:
				return !getIfcLengthMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CURRENT_MEASURE:
				return !getIfcElectricCurrentMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_DESCRIPTIVE_MEASURE:
				return !getIfcDescriptiveMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_COUNT_MEASURE:
				return !getIfcCountMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_CONTEXT_DEPENDENT_MEASURE:
				return !getIfcContextDependentMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_AREA_MEASURE:
				return !getIfcAreaMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				return !getIfcAmountOfSubstanceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_MEASURE:
				return !getIfcLuminousIntensityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_NORMALISED_RATIO_MEASURE:
				return !getIfcNormalisedRatioMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPLEX_NUMBER:
				return !getIfcComplexNumber().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER:
				return !getIfcInteger().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_REAL:
				return !getIfcReal().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_BOOLEAN:
				return !getIfcBoolean().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_IDENTIFIER:
				return !getIfcIdentifier().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEXT:
				return !getIfcText().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LABEL:
				return !getIfcLabel().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LOGICAL:
				return !getIfcLogical().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				return !getIfcVolumetricFlowRateMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TIME_STAMP:
				return !getIfcTimeStamp().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_TRANSMITTANCE_MEASURE:
				return !getIfcThermalTransmittanceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_RESISTANCE_MEASURE:
				return !getIfcThermalResistanceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_ADMITTANCE_MEASURE:
				return !getIfcThermalAdmittanceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PRESSURE_MEASURE:
				return !getIfcPressureMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_POWER_MEASURE:
				return !getIfcPowerMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_FLOW_RATE_MEASURE:
				return !getIfcMassFlowRateMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_DENSITY_MEASURE:
				return !getIfcMassDensityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_VELOCITY_MEASURE:
				return !getIfcLinearVelocityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_KINEMATIC_VISCOSITY_MEASURE:
				return !getIfcKinematicViscosityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_INTEGER_COUNT_RATE_MEASURE:
				return !getIfcIntegerCountRateMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEAT_FLUX_DENSITY_MEASURE:
				return !getIfcHeatFluxDensityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_FREQUENCY_MEASURE:
				return !getIfcFrequencyMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ENERGY_MEASURE:
				return !getIfcEnergyMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_VOLTAGE_MEASURE:
				return !getIfcElectricVoltageMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_DYNAMIC_VISCOSITY_MEASURE:
				return !getIfcDynamicViscosityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				return !getIfcCompoundPlaneAngleMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ANGULAR_VELOCITY_MEASURE:
				return !getIfcAngularVelocityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_CONDUCTIVITY_MEASURE:
				return !getIfcThermalConductivityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOLECULAR_WEIGHT_MEASURE:
				return !getIfcMolecularWeightMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_VAPOR_PERMEABILITY_MEASURE:
				return !getIfcVaporPermeabilityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				return !getIfcMoistureDiffusivityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				return !getIfcIsothermalMoistureCapacityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				return !getIfcSpecificHeatCapacityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MONETARY_MEASURE:
				return !getIfcMonetaryMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				return !getIfcMagneticFluxDensityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MAGNETIC_FLUX_MEASURE:
				return !getIfcMagneticFluxMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_FLUX_MEASURE:
				return !getIfcLuminousFluxMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_FORCE_MEASURE:
				return !getIfcForceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_INDUCTANCE_MEASURE:
				return !getIfcInductanceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ILLUMINANCE_MEASURE:
				return !getIfcIlluminanceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_RESISTANCE_MEASURE:
				return !getIfcElectricResistanceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				return !getIfcElectricConductanceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CHARGE_MEASURE:
				return !getIfcElectricChargeMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_DOSE_EQUIVALENT_MEASURE:
				return !getIfcDoseEquivalentMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ELECTRIC_CAPACITANCE_MEASURE:
				return !getIfcElectricCapacitanceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ABSORBED_DOSE_MEASURE:
				return !getIfcAbsorbedDoseMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_RADIO_ACTIVITY_MEASURE:
				return !getIfcRadioActivityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_FREQUENCY_MEASURE:
				return !getIfcRotationalFrequencyMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TORQUE_MEASURE:
				return !getIfcTorqueMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ACCELERATION_MEASURE:
				return !getIfcAccelerationMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_FORCE_MEASURE:
				return !getIfcLinearForceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_STIFFNESS_MEASURE:
				return !getIfcLinearStiffnessMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				return !getIfcModulusOfSubgradeReactionMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ELASTICITY_MEASURE:
				return !getIfcModulusOfElasticityMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MOMENT_OF_INERTIA_MEASURE:
				return !getIfcMomentOfInertiaMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PLANAR_FORCE_MEASURE:
				return !getIfcPlanarForceMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_STIFFNESS_MEASURE:
				return !getIfcRotationalStiffnessMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SHEAR_MODULUS_MEASURE:
				return !getIfcShearModulusMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LINEAR_MOMENT_MEASURE:
				return !getIfcLinearMomentMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				return !getIfcLuminousIntensityDistributionMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_CURVATURE_MEASURE:
				return !getIfcCurvatureMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MASS_PER_LENGTH_MEASURE:
				return !getIfcMassPerLengthMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				return !getIfcModulusOfLinearSubgradeReactionMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				return !getIfcModulusOfRotationalSubgradeReactionMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ROTATIONAL_MASS_MEASURE:
				return !getIfcRotationalMassMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				return !getIfcSectionalAreaIntegralMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SECTION_MODULUS_MEASURE:
				return !getIfcSectionModulusMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_TEMPERATURE_GRADIENT_MEASURE:
				return !getIfcTemperatureGradientMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				return !getIfcThermalExpansionCoefficientMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_CONSTANT_MEASURE:
				return !getIfcWarpingConstantMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_WARPING_MOMENT_MEASURE:
				return !getIfcWarpingMomentMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_POWER_MEASURE:
				return !getIfcSoundPowerMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_SOUND_PRESSURE_MEASURE:
				return !getIfcSoundPressureMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_HEATING_VALUE_MEASURE:
				return !getIfcHeatingValueMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_PH_MEASURE:
				return !getIfcPHMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__IFC_ION_CONCENTRATION_MEASURE:
				return !getIfcIonConcentrationMeasure().isEmpty();
			case FinalPackage.LIST_VALUES_TYPE__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case FinalPackage.LIST_VALUES_TYPE__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case FinalPackage.LIST_VALUES_TYPE__ITEM_TYPE:
				return ITEM_TYPE_EDEFAULT == null ? itemType != null : !ITEM_TYPE_EDEFAULT.equals(itemType);
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
		result.append(" (ifcValue: ");
		result.append(ifcValue);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //ListValuesTypeImpl