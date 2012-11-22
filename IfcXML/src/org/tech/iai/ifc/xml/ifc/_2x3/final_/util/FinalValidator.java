/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.util.CommonValidator;

import org.tech.iai.ifc.xml.ifc._2x3.final_.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage
 * @generated
 */
public class FinalValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FinalValidator INSTANCE = new FinalValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.tech.iai.ifc.xml.ifc._2x3.final_";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonValidator commonValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
		commonValidator = CommonValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FinalPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FinalPackage.ACTING_ROLE_TYPE:
				return validateActingRoleType((ActingRoleType)value, diagnostics, context);
			case FinalPackage.ACTOR_TYPE:
				return validateActorType((ActorType)value, diagnostics, context);
			case FinalPackage.ACTUAL_FINISH_TYPE:
				return validateActualFinishType((ActualFinishType)value, diagnostics, context);
			case FinalPackage.ACTUAL_START_TYPE:
				return validateActualStartType((ActualStartType)value, diagnostics, context);
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE:
				return validateAdditionalConditionsType((AdditionalConditionsType)value, diagnostics, context);
			case FinalPackage.ADDRESSES_TYPE:
				return validateAddressesType((AddressesType)value, diagnostics, context);
			case FinalPackage.ADDRESSES_TYPE1:
				return validateAddressesType1((AddressesType1)value, diagnostics, context);
			case FinalPackage.ADDRESS_LINES_TYPE:
				return validateAddressLinesType((AddressLinesType)value, diagnostics, context);
			case FinalPackage.ANNOTATED_CURVE_TYPE:
				return validateAnnotatedCurveType((AnnotatedCurveType)value, diagnostics, context);
			case FinalPackage.APPLICABLE_DATES_TYPE:
				return validateApplicableDatesType((ApplicableDatesType)value, diagnostics, context);
			case FinalPackage.APPLICABLE_DATE_TYPE:
				return validateApplicableDateType((ApplicableDateType)value, diagnostics, context);
			case FinalPackage.APPLICATION_DEVELOPER_TYPE:
				return validateApplicationDeveloperType((ApplicationDeveloperType)value, diagnostics, context);
			case FinalPackage.APPLIED_CONDITION_TYPE:
				return validateAppliedConditionType((AppliedConditionType)value, diagnostics, context);
			case FinalPackage.APPLIED_CONDITION_TYPE1:
				return validateAppliedConditionType1((AppliedConditionType1)value, diagnostics, context);
			case FinalPackage.APPLIED_LOAD_TYPE:
				return validateAppliedLoadType((AppliedLoadType)value, diagnostics, context);
			case FinalPackage.APPLIED_VALUE_TYPE:
				return validateAppliedValueType((AppliedValueType)value, diagnostics, context);
			case FinalPackage.APPROVAL_DATE_TIME_TYPE:
				return validateApprovalDateTimeType((ApprovalDateTimeType)value, diagnostics, context);
			case FinalPackage.APPROVAL_TYPE:
				return validateApprovalType((ApprovalType)value, diagnostics, context);
			case FinalPackage.APPROVAL_TYPE1:
				return validateApprovalType1((ApprovalType1)value, diagnostics, context);
			case FinalPackage.APPROVED_PROPERTIES_TYPE:
				return validateApprovedPropertiesType((ApprovedPropertiesType)value, diagnostics, context);
			case FinalPackage.ASSIGNED_ITEMS_TYPE:
				return validateAssignedItemsType((AssignedItemsType)value, diagnostics, context);
			case FinalPackage.AXIS1_TYPE:
				return validateAxis1Type((Axis1Type)value, diagnostics, context);
			case FinalPackage.AXIS2_TYPE:
				return validateAxis2Type((Axis2Type)value, diagnostics, context);
			case FinalPackage.AXIS3_TYPE:
				return validateAxis3Type((Axis3Type)value, diagnostics, context);
			case FinalPackage.AXIS_CURVE_TYPE:
				return validateAxisCurveType((AxisCurveType)value, diagnostics, context);
			case FinalPackage.AXIS_POSITION_TYPE:
				return validateAxisPositionType((AxisPositionType)value, diagnostics, context);
			case FinalPackage.AXIS_TYPE:
				return validateAxisType((AxisType)value, diagnostics, context);
			case FinalPackage.AXIS_TYPE1:
				return validateAxisType1((AxisType1)value, diagnostics, context);
			case FinalPackage.AXIS_TYPE2:
				return validateAxisType2((AxisType2)value, diagnostics, context);
			case FinalPackage.BACKGROUND_COLOUR_TYPE:
				return validateBackgroundColourType((BackgroundColourType)value, diagnostics, context);
			case FinalPackage.BASE_QUANTITY_TYPE:
				return validateBaseQuantityType((BaseQuantityType)value, diagnostics, context);
			case FinalPackage.BASE_SURFACE_TYPE:
				return validateBaseSurfaceType((BaseSurfaceType)value, diagnostics, context);
			case FinalPackage.BASIS_CURVE_TYPE:
				return validateBasisCurveType((BasisCurveType)value, diagnostics, context);
			case FinalPackage.BASIS_CURVE_TYPE1:
				return validateBasisCurveType1((BasisCurveType1)value, diagnostics, context);
			case FinalPackage.BASIS_CURVE_TYPE2:
				return validateBasisCurveType2((BasisCurveType2)value, diagnostics, context);
			case FinalPackage.BASIS_CURVE_TYPE3:
				return validateBasisCurveType3((BasisCurveType3)value, diagnostics, context);
			case FinalPackage.BASIS_SURFACE_TYPE:
				return validateBasisSurfaceType((BasisSurfaceType)value, diagnostics, context);
			case FinalPackage.BASIS_SURFACE_TYPE1:
				return validateBasisSurfaceType1((BasisSurfaceType1)value, diagnostics, context);
			case FinalPackage.BASIS_SURFACE_TYPE2:
				return validateBasisSurfaceType2((BasisSurfaceType2)value, diagnostics, context);
			case FinalPackage.BENCHMARK_VALUES_TYPE:
				return validateBenchmarkValuesType((BenchmarkValuesType)value, diagnostics, context);
			case FinalPackage.BOUNDS_TYPE:
				return validateBoundsType((BoundsType)value, diagnostics, context);
			case FinalPackage.BOUND_TYPE:
				return validateBoundType((BoundType)value, diagnostics, context);
			case FinalPackage.BUILDING_ADDRESS_TYPE:
				return validateBuildingAddressType((BuildingAddressType)value, diagnostics, context);
			case FinalPackage.CAUSED_BY_TYPE:
				return validateCausedByType((CausedByType)value, diagnostics, context);
			case FinalPackage.CFS_FACES_TYPE:
				return validateCfsFacesType((CfsFacesType)value, diagnostics, context);
			case FinalPackage.CHARACTER_SPACING_TYPE:
				return validateCharacterSpacingType((CharacterSpacingType)value, diagnostics, context);
			case FinalPackage.CLASSIFIED_CONSTRAINT_TYPE:
				return validateClassifiedConstraintType((ClassifiedConstraintType)value, diagnostics, context);
			case FinalPackage.CLASSIFIED_MATERIAL_TYPE:
				return validateClassifiedMaterialType((ClassifiedMaterialType)value, diagnostics, context);
			case FinalPackage.COLOUR_APPEARANCE_TYPE:
				return validateColourAppearanceType((ColourAppearanceType)value, diagnostics, context);
			case FinalPackage.COLOUR_TYPE:
				return validateColourType((ColourType)value, diagnostics, context);
			case FinalPackage.COMPONENT_OF_TOTAL_TYPE:
				return validateComponentOfTotalType((ComponentOfTotalType)value, diagnostics, context);
			case FinalPackage.COMPONENTS_TYPE:
				return validateComponentsType((ComponentsType)value, diagnostics, context);
			case FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE:
				return validateConditionCoordinateSystemType((ConditionCoordinateSystemType)value, diagnostics, context);
			case FinalPackage.CONNECTION_CONSTRAINT_TYPE:
				return validateConnectionConstraintType((ConnectionConstraintType)value, diagnostics, context);
			case FinalPackage.CONNECTION_GEOMETRY_TYPE:
				return validateConnectionGeometryType((ConnectionGeometryType)value, diagnostics, context);
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1:
				return validateConnectionGeometryType1((ConnectionGeometryType1)value, diagnostics, context);
			case FinalPackage.CONTENTS_TYPE:
				return validateContentsType((ContentsType)value, diagnostics, context);
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE:
				return validateContextOfItemsType((ContextOfItemsType)value, diagnostics, context);
			case FinalPackage.CONTROL_POINTS_LIST_TYPE:
				return validateControlPointsListType((ControlPointsListType)value, diagnostics, context);
			case FinalPackage.CONVERSION_FACTOR_TYPE:
				return validateConversionFactorType((ConversionFactorType)value, diagnostics, context);
			case FinalPackage.COORDINATES_TYPE:
				return validateCoordinatesType((CoordinatesType)value, diagnostics, context);
			case FinalPackage.COORDINATES_TYPE1:
				return validateCoordinatesType1((CoordinatesType1)value, diagnostics, context);
			case FinalPackage.CORNER_TYPE:
				return validateCornerType((CornerType)value, diagnostics, context);
			case FinalPackage.CREATING_ACTOR_TYPE:
				return validateCreatingActorType((CreatingActorType)value, diagnostics, context);
			case FinalPackage.CREATION_DATE_TYPE:
				return validateCreationDateType((CreationDateType)value, diagnostics, context);
			case FinalPackage.CREATION_TIME_TYPE:
				return validateCreationTimeType((CreationTimeType)value, diagnostics, context);
			case FinalPackage.CREATION_TIME_TYPE1:
				return validateCreationTimeType1((CreationTimeType1)value, diagnostics, context);
			case FinalPackage.CREATORS_TYPE:
				return validateCreatorsType((CreatorsType)value, diagnostics, context);
			case FinalPackage.CRITERION_DATE_TIME_TYPE:
				return validateCriterionDateTimeType((CriterionDateTimeType)value, diagnostics, context);
			case FinalPackage.CRITERION_TYPE:
				return validateCriterionType((CriterionType)value, diagnostics, context);
			case FinalPackage.CROSS_SECTION_POSITIONS_TYPE:
				return validateCrossSectionPositionsType((CrossSectionPositionsType)value, diagnostics, context);
			case FinalPackage.CROSS_SECTION_REINFORCEMENT_DEFINITIONS_TYPE:
				return validateCrossSectionReinforcementDefinitionsType((CrossSectionReinforcementDefinitionsType)value, diagnostics, context);
			case FinalPackage.CROSS_SECTIONS_TYPE:
				return validateCrossSectionsType((CrossSectionsType)value, diagnostics, context);
			case FinalPackage.CURRENT_VALUE_TYPE:
				return validateCurrentValueType((CurrentValueType)value, diagnostics, context);
			case FinalPackage.CURRENT_VALUE_TYPE1:
				return validateCurrentValueType1((CurrentValueType1)value, diagnostics, context);
			case FinalPackage.CURVE_COLOUR_TYPE:
				return validateCurveColourType((CurveColourType)value, diagnostics, context);
			case FinalPackage.CURVE_FONT_TYPE:
				return validateCurveFontType((CurveFontType)value, diagnostics, context);
			case FinalPackage.CURVE_FONT_TYPE1:
				return validateCurveFontType1((CurveFontType1)value, diagnostics, context);
			case FinalPackage.CURVE_ON_RELATED_ELEMENT_TYPE:
				return validateCurveOnRelatedElementType((CurveOnRelatedElementType)value, diagnostics, context);
			case FinalPackage.CURVE_ON_RELATING_ELEMENT_TYPE:
				return validateCurveOnRelatingElementType((CurveOnRelatingElementType)value, diagnostics, context);
			case FinalPackage.CURVE_TYPE:
				return validateCurveType((CurveType)value, diagnostics, context);
			case FinalPackage.CURVE_WIDTH_TYPE:
				return validateCurveWidthType((CurveWidthType)value, diagnostics, context);
			case FinalPackage.DATA_VALUE_TYPE:
				return validateDataValueType((DataValueType)value, diagnostics, context);
			case FinalPackage.DATE_COMPONENT_TYPE:
				return validateDateComponentType((DateComponentType)value, diagnostics, context);
			case FinalPackage.DEFINED_UNIT_TYPE:
				return validateDefinedUnitType((DefinedUnitType)value, diagnostics, context);
			case FinalPackage.DEFINED_VALUES_TYPE:
				return validateDefinedValuesType((DefinedValuesType)value, diagnostics, context);
			case FinalPackage.DEFINING_UNIT_TYPE:
				return validateDefiningUnitType((DefiningUnitType)value, diagnostics, context);
			case FinalPackage.DEFINING_VALUES_TYPE:
				return validateDefiningValuesType((DefiningValuesType)value, diagnostics, context);
			case FinalPackage.DEFINITION_TYPE:
				return validateDefinitionType((DefinitionType)value, diagnostics, context);
			case FinalPackage.DEPENDANT_PROPERTY_TYPE:
				return validateDependantPropertyType((DependantPropertyType)value, diagnostics, context);
			case FinalPackage.DEPENDING_PROPERTY_TYPE:
				return validateDependingPropertyType((DependingPropertyType)value, diagnostics, context);
			case FinalPackage.DEPRECIATED_VALUE_TYPE:
				return validateDepreciatedValueType((DepreciatedValueType)value, diagnostics, context);
			case FinalPackage.DIFFUSE_COLOUR_TYPE:
				return validateDiffuseColourType((DiffuseColourType)value, diagnostics, context);
			case FinalPackage.DIFFUSE_REFLECTION_COLOUR_TYPE:
				return validateDiffuseReflectionColourType((DiffuseReflectionColourType)value, diagnostics, context);
			case FinalPackage.DIFFUSE_TRANSMISSION_COLOUR_TYPE:
				return validateDiffuseTransmissionColourType((DiffuseTransmissionColourType)value, diagnostics, context);
			case FinalPackage.DIFFUSE_TRANSMISSION_COLOUR_TYPE1:
				return validateDiffuseTransmissionColourType1((DiffuseTransmissionColourType1)value, diagnostics, context);
			case FinalPackage.DIMENSIONS_TYPE:
				return validateDimensionsType((DimensionsType)value, diagnostics, context);
			case FinalPackage.DIRECTION_RATIOS_TYPE:
				return validateDirectionRatiosType((DirectionRatiosType)value, diagnostics, context);
			case FinalPackage.DIRECTRIX_TYPE:
				return validateDirectrixType((DirectrixType)value, diagnostics, context);
			case FinalPackage.DIRECTRIX_TYPE1:
				return validateDirectrixType1((DirectrixType1)value, diagnostics, context);
			case FinalPackage.DIR_TYPE:
				return validateDirType((DirType)value, diagnostics, context);
			case FinalPackage.DISTRIBUTION_DATA_TYPE:
				return validateDistributionDataType((DistributionDataType)value, diagnostics, context);
			case FinalPackage.DOCUMENT_OWNER_TYPE:
				return validateDocumentOwnerType((DocumentOwnerType)value, diagnostics, context);
			case FinalPackage.DOCUMENT_REFERENCES_TYPE:
				return validateDocumentReferencesType((DocumentReferencesType)value, diagnostics, context);
			case FinalPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case FinalPackage.EARLY_FINISH_TYPE:
				return validateEarlyFinishType((EarlyFinishType)value, diagnostics, context);
			case FinalPackage.EARLY_START_TYPE:
				return validateEarlyStartType((EarlyStartType)value, diagnostics, context);
			case FinalPackage.EDGE_ELEMENT_TYPE:
				return validateEdgeElementType((EdgeElementType)value, diagnostics, context);
			case FinalPackage.EDGE_END_TYPE:
				return validateEdgeEndType((EdgeEndType)value, diagnostics, context);
			case FinalPackage.EDGE_GEOMETRY_TYPE:
				return validateEdgeGeometryType((EdgeGeometryType)value, diagnostics, context);
			case FinalPackage.EDGE_LIST_TYPE:
				return validateEdgeListType((EdgeListType)value, diagnostics, context);
			case FinalPackage.EDGE_LIST_TYPE1:
				return validateEdgeListType1((EdgeListType1)value, diagnostics, context);
			case FinalPackage.EDGE_START_TYPE:
				return validateEdgeStartType((EdgeStartType)value, diagnostics, context);
			case FinalPackage.EDITION_DATE_TYPE:
				return validateEditionDateType((EditionDateType)value, diagnostics, context);
			case FinalPackage.EDITORS_TYPE:
				return validateEditorsType((EditorsType)value, diagnostics, context);
			case FinalPackage.ELECTRONIC_FORMAT_TYPE:
				return validateElectronicFormatType((ElectronicFormatType)value, diagnostics, context);
			case FinalPackage.ELECTRONIC_MAIL_ADDRESSES_TYPE:
				return validateElectronicMailAddressesType((ElectronicMailAddressesType)value, diagnostics, context);
			case FinalPackage.ELEMENTS_TYPE:
				return validateElementsType((ElementsType)value, diagnostics, context);
			case FinalPackage.ELEMENTS_TYPE1:
				return validateElementsType1((ElementsType1)value, diagnostics, context);
			case FinalPackage.ENCLOSURE_TYPE:
				return validateEnclosureType((EnclosureType)value, diagnostics, context);
			case FinalPackage.END_PROFILE_TYPE:
				return validateEndProfileType((EndProfileType)value, diagnostics, context);
			case FinalPackage.END_TIME_TYPE:
				return validateEndTimeType((EndTimeType)value, diagnostics, context);
			case FinalPackage.ENUMERATION_REFERENCE_TYPE:
				return validateEnumerationReferenceType((EnumerationReferenceType)value, diagnostics, context);
			case FinalPackage.ENUMERATION_VALUES_TYPE:
				return validateEnumerationValuesType((EnumerationValuesType)value, diagnostics, context);
			case FinalPackage.ENUMERATION_VALUES_TYPE1:
				return validateEnumerationValuesType1((EnumerationValuesType1)value, diagnostics, context);
			case FinalPackage.EXTENDED_PROPERTIES_TYPE:
				return validateExtendedPropertiesType((ExtendedPropertiesType)value, diagnostics, context);
			case FinalPackage.EXTENT_TYPE:
				return validateExtentType((ExtentType)value, diagnostics, context);
			case FinalPackage.EXTRUDED_DIRECTION_TYPE:
				return validateExtrudedDirectionType((ExtrudedDirectionType)value, diagnostics, context);
			case FinalPackage.EXTRUDED_DIRECTION_TYPE1:
				return validateExtrudedDirectionType1((ExtrudedDirectionType1)value, diagnostics, context);
			case FinalPackage.FACE_SURFACE_TYPE:
				return validateFaceSurfaceType((FaceSurfaceType)value, diagnostics, context);
			case FinalPackage.FACSIMILE_NUMBERS_TYPE:
				return validateFacsimileNumbersType((FacsimileNumbersType)value, diagnostics, context);
			case FinalPackage.FBSM_FACES_TYPE:
				return validateFbsmFacesType((FbsmFacesType)value, diagnostics, context);
			case FinalPackage.FILL_STYLES_TYPE:
				return validateFillStylesType((FillStylesType)value, diagnostics, context);
			case FinalPackage.FILL_STYLE_TARGET_TYPE:
				return validateFillStyleTargetType((FillStyleTargetType)value, diagnostics, context);
			case FinalPackage.FINISH_TIME_TYPE:
				return validateFinishTimeType((FinishTimeType)value, diagnostics, context);
			case FinalPackage.FIRST_OPERAND_TYPE:
				return validateFirstOperandType((FirstOperandType)value, diagnostics, context);
			case FinalPackage.FIXED_UNTIL_DATE_TYPE:
				return validateFixedUntilDateType((FixedUntilDateType)value, diagnostics, context);
			case FinalPackage.FLOW_CONDITION_TIME_SERIES_TYPE:
				return validateFlowConditionTimeSeriesType((FlowConditionTimeSeriesType)value, diagnostics, context);
			case FinalPackage.FLOWRATE_SINGLE_VALUE_TYPE:
				return validateFlowrateSingleValueType((FlowrateSingleValueType)value, diagnostics, context);
			case FinalPackage.FLOWRATE_TIME_SERIES_TYPE:
				return validateFlowrateTimeSeriesType((FlowrateTimeSeriesType)value, diagnostics, context);
			case FinalPackage.FLUID_TYPE:
				return validateFluidType((FluidType)value, diagnostics, context);
			case FinalPackage.FONT_FAMILY_TYPE:
				return validateFontFamilyType((FontFamilyType)value, diagnostics, context);
			case FinalPackage.FONT_SIZE_TYPE:
				return validateFontSizeType((FontSizeType)value, diagnostics, context);
			case FinalPackage.FOR_LAYER_SET_TYPE:
				return validateForLayerSetType((ForLayerSetType)value, diagnostics, context);
			case FinalPackage.HAS_PROPERTIES_TYPE:
				return validateHasPropertiesType((HasPropertiesType)value, diagnostics, context);
			case FinalPackage.HAS_PROPERTIES_TYPE1:
				return validateHasPropertiesType1((HasPropertiesType1)value, diagnostics, context);
			case FinalPackage.HAS_PROPERTY_SETS_TYPE:
				return validateHasPropertySetsType((HasPropertySetsType)value, diagnostics, context);
			case FinalPackage.HAS_QUANTITIES_TYPE:
				return validateHasQuantitiesType((HasQuantitiesType)value, diagnostics, context);
			case FinalPackage.HAS_RESULTS_TYPE:
				return validateHasResultsType((HasResultsType)value, diagnostics, context);
			case FinalPackage.HATCH_LINE_APPEARANCE_TYPE:
				return validateHatchLineAppearanceType((HatchLineAppearanceType)value, diagnostics, context);
			case FinalPackage.IFC2_DCOMPOSITE_CURVE:
				return validateIfc2DCompositeCurve((Ifc2DCompositeCurve)value, diagnostics, context);
			case FinalPackage.IFC_ABSORBED_DOSE_MEASURE_TYPE:
				return validateIfcAbsorbedDoseMeasureType((IfcAbsorbedDoseMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ACCELERATION_MEASURE_TYPE:
				return validateIfcAccelerationMeasureType((IfcAccelerationMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ACTION_REQUEST:
				return validateIfcActionRequest((IfcActionRequest)value, diagnostics, context);
			case FinalPackage.IFC_ACTION_SOURCE_TYPE_ENUM_TYPE:
				return validateIfcActionSourceTypeEnumType((IfcActionSourceTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ACTION_TYPE_ENUM_TYPE:
				return validateIfcActionTypeEnumType((IfcActionTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ACTOR:
				return validateIfcActor((IfcActor)value, diagnostics, context);
			case FinalPackage.IFC_ACTOR_ROLE:
				return validateIfcActorRole((IfcActorRole)value, diagnostics, context);
			case FinalPackage.IFC_ACTOR_SELECT:
				return validateIfcActorSelect((IfcActorSelect)value, diagnostics, context);
			case FinalPackage.IFC_ACTUATOR_TYPE:
				return validateIfcActuatorType((IfcActuatorType)value, diagnostics, context);
			case FinalPackage.IFC_ACTUATOR_TYPE_ENUM_TYPE:
				return validateIfcActuatorTypeEnumType((IfcActuatorTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ADDRESS:
				return validateIfcAddress((IfcAddress)value, diagnostics, context);
			case FinalPackage.IFC_ADDRESS_TYPE_ENUM_TYPE:
				return validateIfcAddressTypeEnumType((IfcAddressTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_AHEAD_OR_BEHIND_TYPE:
				return validateIfcAheadOrBehindType((IfcAheadOrBehindType)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE:
				return validateIfcAirTerminalBoxType((IfcAirTerminalBoxType)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE_ENUM_TYPE:
				return validateIfcAirTerminalBoxTypeEnumType((IfcAirTerminalBoxTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TERMINAL_TYPE:
				return validateIfcAirTerminalType((IfcAirTerminalType)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TERMINAL_TYPE_ENUM_TYPE:
				return validateIfcAirTerminalTypeEnumType((IfcAirTerminalTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE:
				return validateIfcAirToAirHeatRecoveryType((IfcAirToAirHeatRecoveryType)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE_ENUM_TYPE:
				return validateIfcAirToAirHeatRecoveryTypeEnumType((IfcAirToAirHeatRecoveryTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ALARM_TYPE:
				return validateIfcAlarmType((IfcAlarmType)value, diagnostics, context);
			case FinalPackage.IFC_ALARM_TYPE_ENUM_TYPE:
				return validateIfcAlarmTypeEnumType((IfcAlarmTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_AMOUNT_OF_SUBSTANCE_MEASURE_TYPE:
				return validateIfcAmountOfSubstanceMeasureType((IfcAmountOfSubstanceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ANALYSIS_MODEL_TYPE_ENUM_TYPE:
				return validateIfcAnalysisModelTypeEnumType((IfcAnalysisModelTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ANALYSIS_THEORY_TYPE_ENUM_TYPE:
				return validateIfcAnalysisTheoryTypeEnumType((IfcAnalysisTheoryTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ANGULAR_DIMENSION:
				return validateIfcAngularDimension((IfcAngularDimension)value, diagnostics, context);
			case FinalPackage.IFC_ANGULAR_VELOCITY_MEASURE_TYPE:
				return validateIfcAngularVelocityMeasureType((IfcAngularVelocityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ANNOTATION:
				return validateIfcAnnotation((IfcAnnotation)value, diagnostics, context);
			case FinalPackage.IFC_ANNOTATION_CURVE_OCCURRENCE:
				return validateIfcAnnotationCurveOccurrence((IfcAnnotationCurveOccurrence)value, diagnostics, context);
			case FinalPackage.IFC_ANNOTATION_FILL_AREA:
				return validateIfcAnnotationFillArea((IfcAnnotationFillArea)value, diagnostics, context);
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE:
				return validateIfcAnnotationFillAreaOccurrence((IfcAnnotationFillAreaOccurrence)value, diagnostics, context);
			case FinalPackage.IFC_ANNOTATION_OCCURRENCE:
				return validateIfcAnnotationOccurrence((IfcAnnotationOccurrence)value, diagnostics, context);
			case FinalPackage.IFC_ANNOTATION_SURFACE:
				return validateIfcAnnotationSurface((IfcAnnotationSurface)value, diagnostics, context);
			case FinalPackage.IFC_ANNOTATION_SURFACE_OCCURRENCE:
				return validateIfcAnnotationSurfaceOccurrence((IfcAnnotationSurfaceOccurrence)value, diagnostics, context);
			case FinalPackage.IFC_ANNOTATION_SYMBOL_OCCURRENCE:
				return validateIfcAnnotationSymbolOccurrence((IfcAnnotationSymbolOccurrence)value, diagnostics, context);
			case FinalPackage.IFC_ANNOTATION_TEXT_OCCURRENCE:
				return validateIfcAnnotationTextOccurrence((IfcAnnotationTextOccurrence)value, diagnostics, context);
			case FinalPackage.IFC_APPLICATION:
				return validateIfcApplication((IfcApplication)value, diagnostics, context);
			case FinalPackage.IFC_APPLIED_VALUE:
				return validateIfcAppliedValue((IfcAppliedValue)value, diagnostics, context);
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP:
				return validateIfcAppliedValueRelationship((IfcAppliedValueRelationship)value, diagnostics, context);
			case FinalPackage.IFC_APPLIED_VALUE_SELECT:
				return validateIfcAppliedValueSelect((IfcAppliedValueSelect)value, diagnostics, context);
			case FinalPackage.IFC_APPROVAL:
				return validateIfcApproval((IfcApproval)value, diagnostics, context);
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP:
				return validateIfcApprovalActorRelationship((IfcApprovalActorRelationship)value, diagnostics, context);
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP:
				return validateIfcApprovalPropertyRelationship((IfcApprovalPropertyRelationship)value, diagnostics, context);
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP:
				return validateIfcApprovalRelationship((IfcApprovalRelationship)value, diagnostics, context);
			case FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF:
				return validateIfcArbitraryClosedProfileDef((IfcArbitraryClosedProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_ARBITRARY_OPEN_PROFILE_DEF:
				return validateIfcArbitraryOpenProfileDef((IfcArbitraryOpenProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS:
				return validateIfcArbitraryProfileDefWithVoids((IfcArbitraryProfileDefWithVoids)value, diagnostics, context);
			case FinalPackage.IFC_AREA_MEASURE_TYPE:
				return validateIfcAreaMeasureType((IfcAreaMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ARITHMETIC_OPERATOR_ENUM_TYPE:
				return validateIfcArithmeticOperatorEnumType((IfcArithmeticOperatorEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ASSEMBLY_PLACE_ENUM_TYPE:
				return validateIfcAssemblyPlaceEnumType((IfcAssemblyPlaceEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ASSET:
				return validateIfcAsset((IfcAsset)value, diagnostics, context);
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF:
				return validateIfcAsymmetricIShapeProfileDef((IfcAsymmetricIShapeProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_AXIS1_PLACEMENT:
				return validateIfcAxis1Placement((IfcAxis1Placement)value, diagnostics, context);
			case FinalPackage.IFC_AXIS2_PLACEMENT:
				return validateIfcAxis2Placement((IfcAxis2Placement)value, diagnostics, context);
			case FinalPackage.IFC_AXIS2_PLACEMENT2_D:
				return validateIfcAxis2Placement2D((IfcAxis2Placement2D)value, diagnostics, context);
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D:
				return validateIfcAxis2Placement3D((IfcAxis2Placement3D)value, diagnostics, context);
			case FinalPackage.IFC_BEAM:
				return validateIfcBeam((IfcBeam)value, diagnostics, context);
			case FinalPackage.IFC_BEAM_TYPE:
				return validateIfcBeamType((IfcBeamType)value, diagnostics, context);
			case FinalPackage.IFC_BEAM_TYPE_ENUM_TYPE:
				return validateIfcBeamTypeEnumType((IfcBeamTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_BENCHMARK_ENUM_TYPE:
				return validateIfcBenchmarkEnumType((IfcBenchmarkEnumType)value, diagnostics, context);
			case FinalPackage.IFC_BEZIER_CURVE:
				return validateIfcBezierCurve((IfcBezierCurve)value, diagnostics, context);
			case FinalPackage.IFC_BLOB_TEXTURE:
				return validateIfcBlobTexture((IfcBlobTexture)value, diagnostics, context);
			case FinalPackage.IFC_BLOCK:
				return validateIfcBlock((IfcBlock)value, diagnostics, context);
			case FinalPackage.IFC_BOILER_TYPE:
				return validateIfcBoilerType((IfcBoilerType)value, diagnostics, context);
			case FinalPackage.IFC_BOILER_TYPE_ENUM_TYPE:
				return validateIfcBoilerTypeEnumType((IfcBoilerTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_BOOLEAN_CLIPPING_RESULT:
				return validateIfcBooleanClippingResult((IfcBooleanClippingResult)value, diagnostics, context);
			case FinalPackage.IFC_BOOLEAN_OPERAND:
				return validateIfcBooleanOperand((IfcBooleanOperand)value, diagnostics, context);
			case FinalPackage.IFC_BOOLEAN_OPERATOR_TYPE:
				return validateIfcBooleanOperatorType((IfcBooleanOperatorType)value, diagnostics, context);
			case FinalPackage.IFC_BOOLEAN_RESULT:
				return validateIfcBooleanResult((IfcBooleanResult)value, diagnostics, context);
			case FinalPackage.IFC_BOOLEAN_TYPE:
				return validateIfcBooleanType((IfcBooleanType)value, diagnostics, context);
			case FinalPackage.IFC_BOUNDARY_CONDITION:
				return validateIfcBoundaryCondition((IfcBoundaryCondition)value, diagnostics, context);
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION:
				return validateIfcBoundaryEdgeCondition((IfcBoundaryEdgeCondition)value, diagnostics, context);
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION:
				return validateIfcBoundaryFaceCondition((IfcBoundaryFaceCondition)value, diagnostics, context);
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION:
				return validateIfcBoundaryNodeCondition((IfcBoundaryNodeCondition)value, diagnostics, context);
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION_WARPING:
				return validateIfcBoundaryNodeConditionWarping((IfcBoundaryNodeConditionWarping)value, diagnostics, context);
			case FinalPackage.IFC_BOUNDED_CURVE:
				return validateIfcBoundedCurve((IfcBoundedCurve)value, diagnostics, context);
			case FinalPackage.IFC_BOUNDED_SURFACE:
				return validateIfcBoundedSurface((IfcBoundedSurface)value, diagnostics, context);
			case FinalPackage.IFC_BOUNDING_BOX:
				return validateIfcBoundingBox((IfcBoundingBox)value, diagnostics, context);
			case FinalPackage.IFC_BOX_ALIGNMENT_TYPE:
				return validateIfcBoxAlignmentType((IfcBoxAlignmentType)value, diagnostics, context);
			case FinalPackage.IFC_BOXED_HALF_SPACE:
				return validateIfcBoxedHalfSpace((IfcBoxedHalfSpace)value, diagnostics, context);
			case FinalPackage.IFC_BSPLINE_CURVE:
				return validateIfcBSplineCurve((IfcBSplineCurve)value, diagnostics, context);
			case FinalPackage.IFC_BSPLINE_CURVE_FORM_TYPE:
				return validateIfcBSplineCurveFormType((IfcBSplineCurveFormType)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING:
				return validateIfcBuilding((IfcBuilding)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_ELEMENT:
				return validateIfcBuildingElement((IfcBuildingElement)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_ELEMENT_COMPONENT:
				return validateIfcBuildingElementComponent((IfcBuildingElementComponent)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_ELEMENT_PART:
				return validateIfcBuildingElementPart((IfcBuildingElementPart)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY:
				return validateIfcBuildingElementProxy((IfcBuildingElementProxy)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE:
				return validateIfcBuildingElementProxyType((IfcBuildingElementProxyType)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE_ENUM_TYPE:
				return validateIfcBuildingElementProxyTypeEnumType((IfcBuildingElementProxyTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_ELEMENT_TYPE:
				return validateIfcBuildingElementType((IfcBuildingElementType)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_STOREY:
				return validateIfcBuildingStorey((IfcBuildingStorey)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE:
				return validateIfcCableCarrierFittingType((IfcCableCarrierFittingType)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE_ENUM_TYPE:
				return validateIfcCableCarrierFittingTypeEnumType((IfcCableCarrierFittingTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE:
				return validateIfcCableCarrierSegmentType((IfcCableCarrierSegmentType)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE_ENUM_TYPE:
				return validateIfcCableCarrierSegmentTypeEnumType((IfcCableCarrierSegmentTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE:
				return validateIfcCableSegmentType((IfcCableSegmentType)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE_ENUM_TYPE:
				return validateIfcCableSegmentTypeEnumType((IfcCableSegmentTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CALENDAR_DATE:
				return validateIfcCalendarDate((IfcCalendarDate)value, diagnostics, context);
			case FinalPackage.IFC_CARTESIAN_POINT:
				return validateIfcCartesianPoint((IfcCartesianPoint)value, diagnostics, context);
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR:
				return validateIfcCartesianTransformationOperator((IfcCartesianTransformationOperator)value, diagnostics, context);
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_D:
				return validateIfcCartesianTransformationOperator2D((IfcCartesianTransformationOperator2D)value, diagnostics, context);
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM:
				return validateIfcCartesianTransformationOperator2DnonUniform((IfcCartesianTransformationOperator2DnonUniform)value, diagnostics, context);
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D:
				return validateIfcCartesianTransformationOperator3D((IfcCartesianTransformationOperator3D)value, diagnostics, context);
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM:
				return validateIfcCartesianTransformationOperator3DnonUniform((IfcCartesianTransformationOperator3DnonUniform)value, diagnostics, context);
			case FinalPackage.IFC_CENTER_LINE_PROFILE_DEF:
				return validateIfcCenterLineProfileDef((IfcCenterLineProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_CHAMFER_EDGE_FEATURE:
				return validateIfcChamferEdgeFeature((IfcChamferEdgeFeature)value, diagnostics, context);
			case FinalPackage.IFC_CHANGE_ACTION_ENUM_TYPE:
				return validateIfcChangeActionEnumType((IfcChangeActionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CHARACTER_STYLE_SELECT:
				return validateIfcCharacterStyleSelect((IfcCharacterStyleSelect)value, diagnostics, context);
			case FinalPackage.IFC_CHILLER_TYPE:
				return validateIfcChillerType((IfcChillerType)value, diagnostics, context);
			case FinalPackage.IFC_CHILLER_TYPE_ENUM_TYPE:
				return validateIfcChillerTypeEnumType((IfcChillerTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CIRCLE:
				return validateIfcCircle((IfcCircle)value, diagnostics, context);
			case FinalPackage.IFC_CIRCLE_HOLLOW_PROFILE_DEF:
				return validateIfcCircleHollowProfileDef((IfcCircleHollowProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_CIRCLE_PROFILE_DEF:
				return validateIfcCircleProfileDef((IfcCircleProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_CLASSIFICATION:
				return validateIfcClassification((IfcClassification)value, diagnostics, context);
			case FinalPackage.IFC_CLASSIFICATION_ITEM:
				return validateIfcClassificationItem((IfcClassificationItem)value, diagnostics, context);
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP:
				return validateIfcClassificationItemRelationship((IfcClassificationItemRelationship)value, diagnostics, context);
			case FinalPackage.IFC_CLASSIFICATION_NOTATION:
				return validateIfcClassificationNotation((IfcClassificationNotation)value, diagnostics, context);
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_FACET:
				return validateIfcClassificationNotationFacet((IfcClassificationNotationFacet)value, diagnostics, context);
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT:
				return validateIfcClassificationNotationSelect((IfcClassificationNotationSelect)value, diagnostics, context);
			case FinalPackage.IFC_CLASSIFICATION_REFERENCE:
				return validateIfcClassificationReference((IfcClassificationReference)value, diagnostics, context);
			case FinalPackage.IFC_CLOSED_SHELL:
				return validateIfcClosedShell((IfcClosedShell)value, diagnostics, context);
			case FinalPackage.IFC_COIL_TYPE:
				return validateIfcCoilType((IfcCoilType)value, diagnostics, context);
			case FinalPackage.IFC_COIL_TYPE_ENUM_TYPE:
				return validateIfcCoilTypeEnumType((IfcCoilTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_COLOUR:
				return validateIfcColour((IfcColour)value, diagnostics, context);
			case FinalPackage.IFC_COLOUR_OR_FACTOR:
				return validateIfcColourOrFactor((IfcColourOrFactor)value, diagnostics, context);
			case FinalPackage.IFC_COLOUR_RGB:
				return validateIfcColourRgb((IfcColourRgb)value, diagnostics, context);
			case FinalPackage.IFC_COLOUR_SPECIFICATION:
				return validateIfcColourSpecification((IfcColourSpecification)value, diagnostics, context);
			case FinalPackage.IFC_COLUMN:
				return validateIfcColumn((IfcColumn)value, diagnostics, context);
			case FinalPackage.IFC_COLUMN_TYPE:
				return validateIfcColumnType((IfcColumnType)value, diagnostics, context);
			case FinalPackage.IFC_COLUMN_TYPE_ENUM_TYPE:
				return validateIfcColumnTypeEnumType((IfcColumnTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_COMPLEX_NUMBER:
				return validateIfcComplexNumber((IfcComplexNumber)value, diagnostics, context);
			case FinalPackage.IFC_COMPLEX_NUMBER_TYPE:
				return validateIfcComplexNumberType((IfcComplexNumberType)value, diagnostics, context);
			case FinalPackage.IFC_COMPLEX_PROPERTY:
				return validateIfcComplexProperty((IfcComplexProperty)value, diagnostics, context);
			case FinalPackage.IFC_COMPOSITE_CURVE:
				return validateIfcCompositeCurve((IfcCompositeCurve)value, diagnostics, context);
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT:
				return validateIfcCompositeCurveSegment((IfcCompositeCurveSegment)value, diagnostics, context);
			case FinalPackage.IFC_COMPOSITE_PROFILE_DEF:
				return validateIfcCompositeProfileDef((IfcCompositeProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_COMPOUND_PLANE_ANGLE_MEASURE:
				return validateIfcCompoundPlaneAngleMeasure((IfcCompoundPlaneAngleMeasure)value, diagnostics, context);
			case FinalPackage.IFC_COMPOUND_PLANE_ANGLE_MEASURE_TYPE:
				return validateIfcCompoundPlaneAngleMeasureType((IfcCompoundPlaneAngleMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_COMPRESSOR_TYPE:
				return validateIfcCompressorType((IfcCompressorType)value, diagnostics, context);
			case FinalPackage.IFC_COMPRESSOR_TYPE_ENUM_TYPE:
				return validateIfcCompressorTypeEnumType((IfcCompressorTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CONDENSER_TYPE:
				return validateIfcCondenserType((IfcCondenserType)value, diagnostics, context);
			case FinalPackage.IFC_CONDENSER_TYPE_ENUM_TYPE:
				return validateIfcCondenserTypeEnumType((IfcCondenserTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CONDITION:
				return validateIfcCondition((IfcCondition)value, diagnostics, context);
			case FinalPackage.IFC_CONDITION_CRITERION:
				return validateIfcConditionCriterion((IfcConditionCriterion)value, diagnostics, context);
			case FinalPackage.IFC_CONDITION_CRITERION_SELECT:
				return validateIfcConditionCriterionSelect((IfcConditionCriterionSelect)value, diagnostics, context);
			case FinalPackage.IFC_CONIC:
				return validateIfcConic((IfcConic)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTED_FACE_SET:
				return validateIfcConnectedFaceSet((IfcConnectedFaceSet)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY:
				return validateIfcConnectionCurveGeometry((IfcConnectionCurveGeometry)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTION_GEOMETRY:
				return validateIfcConnectionGeometry((IfcConnectionGeometry)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY:
				return validateIfcConnectionPointEccentricity((IfcConnectionPointEccentricity)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY:
				return validateIfcConnectionPointGeometry((IfcConnectionPointGeometry)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY:
				return validateIfcConnectionPortGeometry((IfcConnectionPortGeometry)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY:
				return validateIfcConnectionSurfaceGeometry((IfcConnectionSurfaceGeometry)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTION_TYPE_ENUM_TYPE:
				return validateIfcConnectionTypeEnumType((IfcConnectionTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRAINT:
				return validateIfcConstraint((IfcConstraint)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRAINT_AGGREGATION_RELATIONSHIP:
				return validateIfcConstraintAggregationRelationship((IfcConstraintAggregationRelationship)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP:
				return validateIfcConstraintClassificationRelationship((IfcConstraintClassificationRelationship)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRAINT_ENUM_TYPE:
				return validateIfcConstraintEnumType((IfcConstraintEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP:
				return validateIfcConstraintRelationship((IfcConstraintRelationship)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRUCTION_EQUIPMENT_RESOURCE:
				return validateIfcConstructionEquipmentResource((IfcConstructionEquipmentResource)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE:
				return validateIfcConstructionMaterialResource((IfcConstructionMaterialResource)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRUCTION_PRODUCT_RESOURCE:
				return validateIfcConstructionProductResource((IfcConstructionProductResource)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRUCTION_RESOURCE:
				return validateIfcConstructionResource((IfcConstructionResource)value, diagnostics, context);
			case FinalPackage.IFC_CONTEXT_DEPENDENT_MEASURE_TYPE:
				return validateIfcContextDependentMeasureType((IfcContextDependentMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_CONTEXT_DEPENDENT_UNIT:
				return validateIfcContextDependentUnit((IfcContextDependentUnit)value, diagnostics, context);
			case FinalPackage.IFC_CONTROL:
				return validateIfcControl((IfcControl)value, diagnostics, context);
			case FinalPackage.IFC_CONTROLLER_TYPE:
				return validateIfcControllerType((IfcControllerType)value, diagnostics, context);
			case FinalPackage.IFC_CONTROLLER_TYPE_ENUM_TYPE:
				return validateIfcControllerTypeEnumType((IfcControllerTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CONVERSION_BASED_UNIT:
				return validateIfcConversionBasedUnit((IfcConversionBasedUnit)value, diagnostics, context);
			case FinalPackage.IFC_COOLED_BEAM_TYPE:
				return validateIfcCooledBeamType((IfcCooledBeamType)value, diagnostics, context);
			case FinalPackage.IFC_COOLED_BEAM_TYPE_ENUM_TYPE:
				return validateIfcCooledBeamTypeEnumType((IfcCooledBeamTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_COOLING_TOWER_TYPE:
				return validateIfcCoolingTowerType((IfcCoolingTowerType)value, diagnostics, context);
			case FinalPackage.IFC_COOLING_TOWER_TYPE_ENUM_TYPE:
				return validateIfcCoolingTowerTypeEnumType((IfcCoolingTowerTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET:
				return validateIfcCoordinatedUniversalTimeOffset((IfcCoordinatedUniversalTimeOffset)value, diagnostics, context);
			case FinalPackage.IFC_COST_ITEM:
				return validateIfcCostItem((IfcCostItem)value, diagnostics, context);
			case FinalPackage.IFC_COST_SCHEDULE:
				return validateIfcCostSchedule((IfcCostSchedule)value, diagnostics, context);
			case FinalPackage.IFC_COST_SCHEDULE_TYPE_ENUM_TYPE:
				return validateIfcCostScheduleTypeEnumType((IfcCostScheduleTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_COST_VALUE:
				return validateIfcCostValue((IfcCostValue)value, diagnostics, context);
			case FinalPackage.IFC_COUNT_MEASURE_TYPE:
				return validateIfcCountMeasureType((IfcCountMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_COVERING:
				return validateIfcCovering((IfcCovering)value, diagnostics, context);
			case FinalPackage.IFC_COVERING_TYPE:
				return validateIfcCoveringType((IfcCoveringType)value, diagnostics, context);
			case FinalPackage.IFC_COVERING_TYPE_ENUM_TYPE:
				return validateIfcCoveringTypeEnumType((IfcCoveringTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF:
				return validateIfcCraneRailAShapeProfileDef((IfcCraneRailAShapeProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF:
				return validateIfcCraneRailFShapeProfileDef((IfcCraneRailFShapeProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_CREW_RESOURCE:
				return validateIfcCrewResource((IfcCrewResource)value, diagnostics, context);
			case FinalPackage.IFC_CSG_PRIMITIVE3_D:
				return validateIfcCsgPrimitive3D((IfcCsgPrimitive3D)value, diagnostics, context);
			case FinalPackage.IFC_CSG_SELECT:
				return validateIfcCsgSelect((IfcCsgSelect)value, diagnostics, context);
			case FinalPackage.IFC_CSG_SOLID:
				return validateIfcCsgSolid((IfcCsgSolid)value, diagnostics, context);
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF:
				return validateIfcCShapeProfileDef((IfcCShapeProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_CURRENCY_ENUM_TYPE:
				return validateIfcCurrencyEnumType((IfcCurrencyEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP:
				return validateIfcCurrencyRelationship((IfcCurrencyRelationship)value, diagnostics, context);
			case FinalPackage.IFC_CURTAIN_WALL:
				return validateIfcCurtainWall((IfcCurtainWall)value, diagnostics, context);
			case FinalPackage.IFC_CURTAIN_WALL_TYPE:
				return validateIfcCurtainWallType((IfcCurtainWallType)value, diagnostics, context);
			case FinalPackage.IFC_CURTAIN_WALL_TYPE_ENUM_TYPE:
				return validateIfcCurtainWallTypeEnumType((IfcCurtainWallTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_CURVATURE_MEASURE_TYPE:
				return validateIfcCurvatureMeasureType((IfcCurvatureMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_CURVE:
				return validateIfcCurve((IfcCurve)value, diagnostics, context);
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE:
				return validateIfcCurveBoundedPlane((IfcCurveBoundedPlane)value, diagnostics, context);
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT:
				return validateIfcCurveFontOrScaledCurveFontSelect((IfcCurveFontOrScaledCurveFontSelect)value, diagnostics, context);
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE:
				return validateIfcCurveOrEdgeCurve((IfcCurveOrEdgeCurve)value, diagnostics, context);
			case FinalPackage.IFC_CURVE_STYLE:
				return validateIfcCurveStyle((IfcCurveStyle)value, diagnostics, context);
			case FinalPackage.IFC_CURVE_STYLE_FONT:
				return validateIfcCurveStyleFont((IfcCurveStyleFont)value, diagnostics, context);
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING:
				return validateIfcCurveStyleFontAndScaling((IfcCurveStyleFontAndScaling)value, diagnostics, context);
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN:
				return validateIfcCurveStyleFontPattern((IfcCurveStyleFontPattern)value, diagnostics, context);
			case FinalPackage.IFC_CURVE_STYLE_FONT_SELECT:
				return validateIfcCurveStyleFontSelect((IfcCurveStyleFontSelect)value, diagnostics, context);
			case FinalPackage.IFC_DAMPER_TYPE:
				return validateIfcDamperType((IfcDamperType)value, diagnostics, context);
			case FinalPackage.IFC_DAMPER_TYPE_ENUM_TYPE:
				return validateIfcDamperTypeEnumType((IfcDamperTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DATA_ORIGIN_ENUM_TYPE:
				return validateIfcDataOriginEnumType((IfcDataOriginEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DATE_AND_TIME:
				return validateIfcDateAndTime((IfcDateAndTime)value, diagnostics, context);
			case FinalPackage.IFC_DATE_TIME_SELECT:
				return validateIfcDateTimeSelect((IfcDateTimeSelect)value, diagnostics, context);
			case FinalPackage.IFC_DAY_IN_MONTH_NUMBER_TYPE:
				return validateIfcDayInMonthNumberType((IfcDayInMonthNumberType)value, diagnostics, context);
			case FinalPackage.IFC_DAYLIGHT_SAVING_HOUR_TYPE:
				return validateIfcDaylightSavingHourType((IfcDaylightSavingHourType)value, diagnostics, context);
			case FinalPackage.IFC_DEFINED_SYMBOL:
				return validateIfcDefinedSymbol((IfcDefinedSymbol)value, diagnostics, context);
			case FinalPackage.IFC_DEFINED_SYMBOL_SELECT:
				return validateIfcDefinedSymbolSelect((IfcDefinedSymbolSelect)value, diagnostics, context);
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE:
				return validateIfcDerivedMeasureValue((IfcDerivedMeasureValue)value, diagnostics, context);
			case FinalPackage.IFC_DERIVED_PROFILE_DEF:
				return validateIfcDerivedProfileDef((IfcDerivedProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_DERIVED_UNIT:
				return validateIfcDerivedUnit((IfcDerivedUnit)value, diagnostics, context);
			case FinalPackage.IFC_DERIVED_UNIT_ELEMENT:
				return validateIfcDerivedUnitElement((IfcDerivedUnitElement)value, diagnostics, context);
			case FinalPackage.IFC_DERIVED_UNIT_ENUM_TYPE:
				return validateIfcDerivedUnitEnumType((IfcDerivedUnitEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DESCRIPTIVE_MEASURE_TYPE:
				return validateIfcDescriptiveMeasureType((IfcDescriptiveMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_DIAMETER_DIMENSION:
				return validateIfcDiameterDimension((IfcDiameterDimension)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS:
				return validateIfcDimensionalExponents((IfcDimensionalExponents)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_CALLOUT_RELATIONSHIP:
				return validateIfcDimensionCalloutRelationship((IfcDimensionCalloutRelationship)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_COUNT_TYPE:
				return validateIfcDimensionCountType((IfcDimensionCountType)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_CURVE:
				return validateIfcDimensionCurve((IfcDimensionCurve)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_CURVE_DIRECTED_CALLOUT:
				return validateIfcDimensionCurveDirectedCallout((IfcDimensionCurveDirectedCallout)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_CURVE_TERMINATOR:
				return validateIfcDimensionCurveTerminator((IfcDimensionCurveTerminator)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_EXTENT_USAGE_TYPE:
				return validateIfcDimensionExtentUsageType((IfcDimensionExtentUsageType)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_PAIR:
				return validateIfcDimensionPair((IfcDimensionPair)value, diagnostics, context);
			case FinalPackage.IFC_DIRECTION:
				return validateIfcDirection((IfcDirection)value, diagnostics, context);
			case FinalPackage.IFC_DIRECTION_SENSE_ENUM_TYPE:
				return validateIfcDirectionSenseEnumType((IfcDirectionSenseEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DISCRETE_ACCESSORY:
				return validateIfcDiscreteAccessory((IfcDiscreteAccessory)value, diagnostics, context);
			case FinalPackage.IFC_DISCRETE_ACCESSORY_TYPE:
				return validateIfcDiscreteAccessoryType((IfcDiscreteAccessoryType)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT:
				return validateIfcDistributionChamberElement((IfcDistributionChamberElement)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE:
				return validateIfcDistributionChamberElementType((IfcDistributionChamberElementType)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE_ENUM_TYPE:
				return validateIfcDistributionChamberElementTypeEnumType((IfcDistributionChamberElementTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_CONTROL_ELEMENT:
				return validateIfcDistributionControlElement((IfcDistributionControlElement)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_CONTROL_ELEMENT_TYPE:
				return validateIfcDistributionControlElementType((IfcDistributionControlElementType)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_ELEMENT:
				return validateIfcDistributionElement((IfcDistributionElement)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_ELEMENT_TYPE:
				return validateIfcDistributionElementType((IfcDistributionElementType)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_FLOW_ELEMENT:
				return validateIfcDistributionFlowElement((IfcDistributionFlowElement)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_FLOW_ELEMENT_TYPE:
				return validateIfcDistributionFlowElementType((IfcDistributionFlowElementType)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_PORT:
				return validateIfcDistributionPort((IfcDistributionPort)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_CONFIDENTIALITY_ENUM_TYPE:
				return validateIfcDocumentConfidentialityEnumType((IfcDocumentConfidentialityEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_ELECTRONIC_FORMAT:
				return validateIfcDocumentElectronicFormat((IfcDocumentElectronicFormat)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_INFORMATION:
				return validateIfcDocumentInformation((IfcDocumentInformation)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP:
				return validateIfcDocumentInformationRelationship((IfcDocumentInformationRelationship)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_REFERENCE:
				return validateIfcDocumentReference((IfcDocumentReference)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_SELECT:
				return validateIfcDocumentSelect((IfcDocumentSelect)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_STATUS_ENUM_TYPE:
				return validateIfcDocumentStatusEnumType((IfcDocumentStatusEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DOOR:
				return validateIfcDoor((IfcDoor)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES:
				return validateIfcDoorLiningProperties((IfcDoorLiningProperties)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_PANEL_OPERATION_ENUM_TYPE:
				return validateIfcDoorPanelOperationEnumType((IfcDoorPanelOperationEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_PANEL_POSITION_ENUM_TYPE:
				return validateIfcDoorPanelPositionEnumType((IfcDoorPanelPositionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES:
				return validateIfcDoorPanelProperties((IfcDoorPanelProperties)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_STYLE:
				return validateIfcDoorStyle((IfcDoorStyle)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_STYLE_CONSTRUCTION_ENUM_TYPE:
				return validateIfcDoorStyleConstructionEnumType((IfcDoorStyleConstructionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_STYLE_OPERATION_ENUM_TYPE:
				return validateIfcDoorStyleOperationEnumType((IfcDoorStyleOperationEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DOSE_EQUIVALENT_MEASURE_TYPE:
				return validateIfcDoseEquivalentMeasureType((IfcDoseEquivalentMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT:
				return validateIfcDraughtingCallout((IfcDraughtingCallout)value, diagnostics, context);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT:
				return validateIfcDraughtingCalloutElement((IfcDraughtingCalloutElement)value, diagnostics, context);
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP:
				return validateIfcDraughtingCalloutRelationship((IfcDraughtingCalloutRelationship)value, diagnostics, context);
			case FinalPackage.IFC_DRAUGHTING_PRE_DEFINED_COLOUR:
				return validateIfcDraughtingPreDefinedColour((IfcDraughtingPreDefinedColour)value, diagnostics, context);
			case FinalPackage.IFC_DRAUGHTING_PRE_DEFINED_CURVE_FONT:
				return validateIfcDraughtingPreDefinedCurveFont((IfcDraughtingPreDefinedCurveFont)value, diagnostics, context);
			case FinalPackage.IFC_DRAUGHTING_PRE_DEFINED_TEXT_FONT:
				return validateIfcDraughtingPreDefinedTextFont((IfcDraughtingPreDefinedTextFont)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_FITTING_TYPE:
				return validateIfcDuctFittingType((IfcDuctFittingType)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_FITTING_TYPE_ENUM_TYPE:
				return validateIfcDuctFittingTypeEnumType((IfcDuctFittingTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE:
				return validateIfcDuctSegmentType((IfcDuctSegmentType)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE_ENUM_TYPE:
				return validateIfcDuctSegmentTypeEnumType((IfcDuctSegmentTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_SILENCER_TYPE:
				return validateIfcDuctSilencerType((IfcDuctSilencerType)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_SILENCER_TYPE_ENUM_TYPE:
				return validateIfcDuctSilencerTypeEnumType((IfcDuctSilencerTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_DYNAMIC_VISCOSITY_MEASURE_TYPE:
				return validateIfcDynamicViscosityMeasureType((IfcDynamicViscosityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_EDGE:
				return validateIfcEdge((IfcEdge)value, diagnostics, context);
			case FinalPackage.IFC_EDGE_CURVE:
				return validateIfcEdgeCurve((IfcEdgeCurve)value, diagnostics, context);
			case FinalPackage.IFC_EDGE_FEATURE:
				return validateIfcEdgeFeature((IfcEdgeFeature)value, diagnostics, context);
			case FinalPackage.IFC_EDGE_LOOP:
				return validateIfcEdgeLoop((IfcEdgeLoop)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES:
				return validateIfcElectricalBaseProperties((IfcElectricalBaseProperties)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRICAL_CIRCUIT:
				return validateIfcElectricalCircuit((IfcElectricalCircuit)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRICAL_ELEMENT:
				return validateIfcElectricalElement((IfcElectricalElement)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE:
				return validateIfcElectricApplianceType((IfcElectricApplianceType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE_ENUM_TYPE:
				return validateIfcElectricApplianceTypeEnumType((IfcElectricApplianceTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CAPACITANCE_MEASURE_TYPE:
				return validateIfcElectricCapacitanceMeasureType((IfcElectricCapacitanceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CHARGE_MEASURE_TYPE:
				return validateIfcElectricChargeMeasureType((IfcElectricChargeMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CONDUCTANCE_MEASURE_TYPE:
				return validateIfcElectricConductanceMeasureType((IfcElectricConductanceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CURRENT_ENUM_TYPE:
				return validateIfcElectricCurrentEnumType((IfcElectricCurrentEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CURRENT_MEASURE_TYPE:
				return validateIfcElectricCurrentMeasureType((IfcElectricCurrentMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT:
				return validateIfcElectricDistributionPoint((IfcElectricDistributionPoint)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT_FUNCTION_ENUM_TYPE:
				return validateIfcElectricDistributionPointFunctionEnumType((IfcElectricDistributionPointFunctionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE:
				return validateIfcElectricFlowStorageDeviceType((IfcElectricFlowStorageDeviceType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE_ENUM_TYPE:
				return validateIfcElectricFlowStorageDeviceTypeEnumType((IfcElectricFlowStorageDeviceTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE:
				return validateIfcElectricGeneratorType((IfcElectricGeneratorType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE_ENUM_TYPE:
				return validateIfcElectricGeneratorTypeEnumType((IfcElectricGeneratorTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE:
				return validateIfcElectricHeaterType((IfcElectricHeaterType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE_ENUM_TYPE:
				return validateIfcElectricHeaterTypeEnumType((IfcElectricHeaterTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE:
				return validateIfcElectricMotorType((IfcElectricMotorType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE_ENUM_TYPE:
				return validateIfcElectricMotorTypeEnumType((IfcElectricMotorTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_RESISTANCE_MEASURE_TYPE:
				return validateIfcElectricResistanceMeasureType((IfcElectricResistanceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE:
				return validateIfcElectricTimeControlType((IfcElectricTimeControlType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE_ENUM_TYPE:
				return validateIfcElectricTimeControlTypeEnumType((IfcElectricTimeControlTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_VOLTAGE_MEASURE_TYPE:
				return validateIfcElectricVoltageMeasureType((IfcElectricVoltageMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT:
				return validateIfcElement((IfcElement)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENTARY_SURFACE:
				return validateIfcElementarySurface((IfcElementarySurface)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_ASSEMBLY:
				return validateIfcElementAssembly((IfcElementAssembly)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_ASSEMBLY_TYPE_ENUM_TYPE:
				return validateIfcElementAssemblyTypeEnumType((IfcElementAssemblyTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_COMPONENT:
				return validateIfcElementComponent((IfcElementComponent)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_COMPONENT_TYPE:
				return validateIfcElementComponentType((IfcElementComponentType)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_COMPOSITION_ENUM_TYPE:
				return validateIfcElementCompositionEnumType((IfcElementCompositionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_QUANTITY:
				return validateIfcElementQuantity((IfcElementQuantity)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_TYPE:
				return validateIfcElementType((IfcElementType)value, diagnostics, context);
			case FinalPackage.IFC_ELLIPSE:
				return validateIfcEllipse((IfcEllipse)value, diagnostics, context);
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF:
				return validateIfcEllipseProfileDef((IfcEllipseProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_ENERGY_CONVERSION_DEVICE:
				return validateIfcEnergyConversionDevice((IfcEnergyConversionDevice)value, diagnostics, context);
			case FinalPackage.IFC_ENERGY_CONVERSION_DEVICE_TYPE:
				return validateIfcEnergyConversionDeviceType((IfcEnergyConversionDeviceType)value, diagnostics, context);
			case FinalPackage.IFC_ENERGY_MEASURE_TYPE:
				return validateIfcEnergyMeasureType((IfcEnergyMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ENERGY_PROPERTIES:
				return validateIfcEnergyProperties((IfcEnergyProperties)value, diagnostics, context);
			case FinalPackage.IFC_ENERGY_SEQUENCE_ENUM_TYPE:
				return validateIfcEnergySequenceEnumType((IfcEnergySequenceEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_CATEGORY_ENUM_TYPE:
				return validateIfcEnvironmentalImpactCategoryEnumType((IfcEnvironmentalImpactCategoryEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_VALUE:
				return validateIfcEnvironmentalImpactValue((IfcEnvironmentalImpactValue)value, diagnostics, context);
			case FinalPackage.IFC_EQUIPMENT_ELEMENT:
				return validateIfcEquipmentElement((IfcEquipmentElement)value, diagnostics, context);
			case FinalPackage.IFC_EQUIPMENT_STANDARD:
				return validateIfcEquipmentStandard((IfcEquipmentStandard)value, diagnostics, context);
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE:
				return validateIfcEvaporativeCoolerType((IfcEvaporativeCoolerType)value, diagnostics, context);
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE_ENUM_TYPE:
				return validateIfcEvaporativeCoolerTypeEnumType((IfcEvaporativeCoolerTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_EVAPORATOR_TYPE:
				return validateIfcEvaporatorType((IfcEvaporatorType)value, diagnostics, context);
			case FinalPackage.IFC_EVAPORATOR_TYPE_ENUM_TYPE:
				return validateIfcEvaporatorTypeEnumType((IfcEvaporatorTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_EXTENDED_MATERIAL_PROPERTIES:
				return validateIfcExtendedMaterialProperties((IfcExtendedMaterialProperties)value, diagnostics, context);
			case FinalPackage.IFC_EXTERNALLY_DEFINED_HATCH_STYLE:
				return validateIfcExternallyDefinedHatchStyle((IfcExternallyDefinedHatchStyle)value, diagnostics, context);
			case FinalPackage.IFC_EXTERNALLY_DEFINED_SURFACE_STYLE:
				return validateIfcExternallyDefinedSurfaceStyle((IfcExternallyDefinedSurfaceStyle)value, diagnostics, context);
			case FinalPackage.IFC_EXTERNALLY_DEFINED_SYMBOL:
				return validateIfcExternallyDefinedSymbol((IfcExternallyDefinedSymbol)value, diagnostics, context);
			case FinalPackage.IFC_EXTERNALLY_DEFINED_TEXT_FONT:
				return validateIfcExternallyDefinedTextFont((IfcExternallyDefinedTextFont)value, diagnostics, context);
			case FinalPackage.IFC_EXTERNAL_REFERENCE:
				return validateIfcExternalReference((IfcExternalReference)value, diagnostics, context);
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID:
				return validateIfcExtrudedAreaSolid((IfcExtrudedAreaSolid)value, diagnostics, context);
			case FinalPackage.IFC_FACE:
				return validateIfcFace((IfcFace)value, diagnostics, context);
			case FinalPackage.IFC_FACE_BASED_SURFACE_MODEL:
				return validateIfcFaceBasedSurfaceModel((IfcFaceBasedSurfaceModel)value, diagnostics, context);
			case FinalPackage.IFC_FACE_BOUND:
				return validateIfcFaceBound((IfcFaceBound)value, diagnostics, context);
			case FinalPackage.IFC_FACE_OUTER_BOUND:
				return validateIfcFaceOuterBound((IfcFaceOuterBound)value, diagnostics, context);
			case FinalPackage.IFC_FACE_SURFACE:
				return validateIfcFaceSurface((IfcFaceSurface)value, diagnostics, context);
			case FinalPackage.IFC_FACETED_BREP:
				return validateIfcFacetedBrep((IfcFacetedBrep)value, diagnostics, context);
			case FinalPackage.IFC_FACETED_BREP_WITH_VOIDS:
				return validateIfcFacetedBrepWithVoids((IfcFacetedBrepWithVoids)value, diagnostics, context);
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION:
				return validateIfcFailureConnectionCondition((IfcFailureConnectionCondition)value, diagnostics, context);
			case FinalPackage.IFC_FAN_TYPE:
				return validateIfcFanType((IfcFanType)value, diagnostics, context);
			case FinalPackage.IFC_FAN_TYPE_ENUM_TYPE:
				return validateIfcFanTypeEnumType((IfcFanTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_FASTENER:
				return validateIfcFastener((IfcFastener)value, diagnostics, context);
			case FinalPackage.IFC_FASTENER_TYPE:
				return validateIfcFastenerType((IfcFastenerType)value, diagnostics, context);
			case FinalPackage.IFC_FEATURE_ELEMENT:
				return validateIfcFeatureElement((IfcFeatureElement)value, diagnostics, context);
			case FinalPackage.IFC_FEATURE_ELEMENT_ADDITION:
				return validateIfcFeatureElementAddition((IfcFeatureElementAddition)value, diagnostics, context);
			case FinalPackage.IFC_FEATURE_ELEMENT_SUBTRACTION:
				return validateIfcFeatureElementSubtraction((IfcFeatureElementSubtraction)value, diagnostics, context);
			case FinalPackage.IFC_FILL_AREA_STYLE:
				return validateIfcFillAreaStyle((IfcFillAreaStyle)value, diagnostics, context);
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING:
				return validateIfcFillAreaStyleHatching((IfcFillAreaStyleHatching)value, diagnostics, context);
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES:
				return validateIfcFillAreaStyleTiles((IfcFillAreaStyleTiles)value, diagnostics, context);
			case FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT:
				return validateIfcFillAreaStyleTileShapeSelect((IfcFillAreaStyleTileShapeSelect)value, diagnostics, context);
			case FinalPackage.IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE:
				return validateIfcFillAreaStyleTileSymbolWithStyle((IfcFillAreaStyleTileSymbolWithStyle)value, diagnostics, context);
			case FinalPackage.IFC_FILL_STYLE_SELECT:
				return validateIfcFillStyleSelect((IfcFillStyleSelect)value, diagnostics, context);
			case FinalPackage.IFC_FILTER_TYPE:
				return validateIfcFilterType((IfcFilterType)value, diagnostics, context);
			case FinalPackage.IFC_FILTER_TYPE_ENUM_TYPE:
				return validateIfcFilterTypeEnumType((IfcFilterTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE:
				return validateIfcFireSuppressionTerminalType((IfcFireSuppressionTerminalType)value, diagnostics, context);
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE_ENUM_TYPE:
				return validateIfcFireSuppressionTerminalTypeEnumType((IfcFireSuppressionTerminalTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_CONTROLLER:
				return validateIfcFlowController((IfcFlowController)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_CONTROLLER_TYPE:
				return validateIfcFlowControllerType((IfcFlowControllerType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_DIRECTION_ENUM_TYPE:
				return validateIfcFlowDirectionEnumType((IfcFlowDirectionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_FITTING:
				return validateIfcFlowFitting((IfcFlowFitting)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_FITTING_TYPE:
				return validateIfcFlowFittingType((IfcFlowFittingType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE:
				return validateIfcFlowInstrumentType((IfcFlowInstrumentType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE_ENUM_TYPE:
				return validateIfcFlowInstrumentTypeEnumType((IfcFlowInstrumentTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_METER_TYPE:
				return validateIfcFlowMeterType((IfcFlowMeterType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_METER_TYPE_ENUM_TYPE:
				return validateIfcFlowMeterTypeEnumType((IfcFlowMeterTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_MOVING_DEVICE:
				return validateIfcFlowMovingDevice((IfcFlowMovingDevice)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_MOVING_DEVICE_TYPE:
				return validateIfcFlowMovingDeviceType((IfcFlowMovingDeviceType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_SEGMENT:
				return validateIfcFlowSegment((IfcFlowSegment)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_SEGMENT_TYPE:
				return validateIfcFlowSegmentType((IfcFlowSegmentType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_STORAGE_DEVICE:
				return validateIfcFlowStorageDevice((IfcFlowStorageDevice)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_STORAGE_DEVICE_TYPE:
				return validateIfcFlowStorageDeviceType((IfcFlowStorageDeviceType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_TERMINAL:
				return validateIfcFlowTerminal((IfcFlowTerminal)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_TERMINAL_TYPE:
				return validateIfcFlowTerminalType((IfcFlowTerminalType)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_TREATMENT_DEVICE:
				return validateIfcFlowTreatmentDevice((IfcFlowTreatmentDevice)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_TREATMENT_DEVICE_TYPE:
				return validateIfcFlowTreatmentDeviceType((IfcFlowTreatmentDeviceType)value, diagnostics, context);
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES:
				return validateIfcFluidFlowProperties((IfcFluidFlowProperties)value, diagnostics, context);
			case FinalPackage.IFC_FONT_STYLE_TYPE:
				return validateIfcFontStyleType((IfcFontStyleType)value, diagnostics, context);
			case FinalPackage.IFC_FONT_VARIANT_TYPE:
				return validateIfcFontVariantType((IfcFontVariantType)value, diagnostics, context);
			case FinalPackage.IFC_FONT_WEIGHT_TYPE:
				return validateIfcFontWeightType((IfcFontWeightType)value, diagnostics, context);
			case FinalPackage.IFC_FOOTING:
				return validateIfcFooting((IfcFooting)value, diagnostics, context);
			case FinalPackage.IFC_FOOTING_TYPE_ENUM_TYPE:
				return validateIfcFootingTypeEnumType((IfcFootingTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_FORCE_MEASURE_TYPE:
				return validateIfcForceMeasureType((IfcForceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_FREQUENCY_MEASURE_TYPE:
				return validateIfcFrequencyMeasureType((IfcFrequencyMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_FUEL_PROPERTIES:
				return validateIfcFuelProperties((IfcFuelProperties)value, diagnostics, context);
			case FinalPackage.IFC_FURNISHING_ELEMENT:
				return validateIfcFurnishingElement((IfcFurnishingElement)value, diagnostics, context);
			case FinalPackage.IFC_FURNISHING_ELEMENT_TYPE:
				return validateIfcFurnishingElementType((IfcFurnishingElementType)value, diagnostics, context);
			case FinalPackage.IFC_FURNITURE_STANDARD:
				return validateIfcFurnitureStandard((IfcFurnitureStandard)value, diagnostics, context);
			case FinalPackage.IFC_FURNITURE_TYPE:
				return validateIfcFurnitureType((IfcFurnitureType)value, diagnostics, context);
			case FinalPackage.IFC_GAS_TERMINAL_TYPE:
				return validateIfcGasTerminalType((IfcGasTerminalType)value, diagnostics, context);
			case FinalPackage.IFC_GAS_TERMINAL_TYPE_ENUM_TYPE:
				return validateIfcGasTerminalTypeEnumType((IfcGasTerminalTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES:
				return validateIfcGeneralMaterialProperties((IfcGeneralMaterialProperties)value, diagnostics, context);
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES:
				return validateIfcGeneralProfileProperties((IfcGeneralProfileProperties)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_CURVE_SET:
				return validateIfcGeometricCurveSet((IfcGeometricCurveSet)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_PROJECTION_ENUM_TYPE:
				return validateIfcGeometricProjectionEnumType((IfcGeometricProjectionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT:
				return validateIfcGeometricRepresentationContext((IfcGeometricRepresentationContext)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_ITEM:
				return validateIfcGeometricRepresentationItem((IfcGeometricRepresentationItem)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT:
				return validateIfcGeometricRepresentationSubContext((IfcGeometricRepresentationSubContext)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT_TEMP:
				return validateIfcGeometricRepresentationSubContextTemp((IfcGeometricRepresentationSubContextTemp)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_SET:
				return validateIfcGeometricSet((IfcGeometricSet)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT:
				return validateIfcGeometricSetSelect((IfcGeometricSetSelect)value, diagnostics, context);
			case FinalPackage.IFC_GLOBALLY_UNIQUE_ID_TYPE:
				return validateIfcGloballyUniqueIdType((IfcGloballyUniqueIdType)value, diagnostics, context);
			case FinalPackage.IFC_GLOBAL_OR_LOCAL_ENUM_TYPE:
				return validateIfcGlobalOrLocalEnumType((IfcGlobalOrLocalEnumType)value, diagnostics, context);
			case FinalPackage.IFC_GRID:
				return validateIfcGrid((IfcGrid)value, diagnostics, context);
			case FinalPackage.IFC_GRID_AXIS:
				return validateIfcGridAxis((IfcGridAxis)value, diagnostics, context);
			case FinalPackage.IFC_GRID_PLACEMENT:
				return validateIfcGridPlacement((IfcGridPlacement)value, diagnostics, context);
			case FinalPackage.IFC_GROUP:
				return validateIfcGroup((IfcGroup)value, diagnostics, context);
			case FinalPackage.IFC_HALF_SPACE_SOLID:
				return validateIfcHalfSpaceSolid((IfcHalfSpaceSolid)value, diagnostics, context);
			case FinalPackage.IFC_HATCH_LINE_DISTANCE_SELECT:
				return validateIfcHatchLineDistanceSelect((IfcHatchLineDistanceSelect)value, diagnostics, context);
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE:
				return validateIfcHeatExchangerType((IfcHeatExchangerType)value, diagnostics, context);
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE_ENUM_TYPE:
				return validateIfcHeatExchangerTypeEnumType((IfcHeatExchangerTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_HEAT_FLUX_DENSITY_MEASURE_TYPE:
				return validateIfcHeatFluxDensityMeasureType((IfcHeatFluxDensityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_HEATING_VALUE_MEASURE_TYPE:
				return validateIfcHeatingValueMeasureType((IfcHeatingValueMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_HOUR_IN_DAY_TYPE:
				return validateIfcHourInDayType((IfcHourInDayType)value, diagnostics, context);
			case FinalPackage.IFC_HUMIDIFIER_TYPE:
				return validateIfcHumidifierType((IfcHumidifierType)value, diagnostics, context);
			case FinalPackage.IFC_HUMIDIFIER_TYPE_ENUM_TYPE:
				return validateIfcHumidifierTypeEnumType((IfcHumidifierTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES:
				return validateIfcHygroscopicMaterialProperties((IfcHygroscopicMaterialProperties)value, diagnostics, context);
			case FinalPackage.IFC_IDENTIFIER_TYPE:
				return validateIfcIdentifierType((IfcIdentifierType)value, diagnostics, context);
			case FinalPackage.IFC_ILLUMINANCE_MEASURE_TYPE:
				return validateIfcIlluminanceMeasureType((IfcIlluminanceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_IMAGE_TEXTURE:
				return validateIfcImageTexture((IfcImageTexture)value, diagnostics, context);
			case FinalPackage.IFC_INDUCTANCE_MEASURE_TYPE:
				return validateIfcInductanceMeasureType((IfcInductanceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_INTEGER_COUNT_RATE_MEASURE_TYPE:
				return validateIfcIntegerCountRateMeasureType((IfcIntegerCountRateMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_INTEGER_TYPE:
				return validateIfcIntegerType((IfcIntegerType)value, diagnostics, context);
			case FinalPackage.IFC_INTERNAL_OR_EXTERNAL_ENUM_TYPE:
				return validateIfcInternalOrExternalEnumType((IfcInternalOrExternalEnumType)value, diagnostics, context);
			case FinalPackage.IFC_INVENTORY:
				return validateIfcInventory((IfcInventory)value, diagnostics, context);
			case FinalPackage.IFC_INVENTORY_TYPE_ENUM_TYPE:
				return validateIfcInventoryTypeEnumType((IfcInventoryTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ION_CONCENTRATION_MEASURE_TYPE:
				return validateIfcIonConcentrationMeasureType((IfcIonConcentrationMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES:
				return validateIfcIrregularTimeSeries((IfcIrregularTimeSeries)value, diagnostics, context);
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE:
				return validateIfcIrregularTimeSeriesValue((IfcIrregularTimeSeriesValue)value, diagnostics, context);
			case FinalPackage.IFC_ISHAPE_PROFILE_DEF:
				return validateIfcIShapeProfileDef((IfcIShapeProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE_TYPE:
				return validateIfcIsothermalMoistureCapacityMeasureType((IfcIsothermalMoistureCapacityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_JUNCTION_BOX_TYPE:
				return validateIfcJunctionBoxType((IfcJunctionBoxType)value, diagnostics, context);
			case FinalPackage.IFC_JUNCTION_BOX_TYPE_ENUM_TYPE:
				return validateIfcJunctionBoxTypeEnumType((IfcJunctionBoxTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_KINEMATIC_VISCOSITY_MEASURE_TYPE:
				return validateIfcKinematicViscosityMeasureType((IfcKinematicViscosityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_LABEL_TYPE:
				return validateIfcLabelType((IfcLabelType)value, diagnostics, context);
			case FinalPackage.IFC_LABOR_RESOURCE:
				return validateIfcLaborResource((IfcLaborResource)value, diagnostics, context);
			case FinalPackage.IFC_LAMP_TYPE:
				return validateIfcLampType((IfcLampType)value, diagnostics, context);
			case FinalPackage.IFC_LAMP_TYPE_ENUM_TYPE:
				return validateIfcLampTypeEnumType((IfcLampTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_LAYERED_ITEM:
				return validateIfcLayeredItem((IfcLayeredItem)value, diagnostics, context);
			case FinalPackage.IFC_LAYER_SET_DIRECTION_ENUM_TYPE:
				return validateIfcLayerSetDirectionEnumType((IfcLayerSetDirectionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_LENGTH_MEASURE_TYPE:
				return validateIfcLengthMeasureType((IfcLengthMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_LIBRARY_INFORMATION:
				return validateIfcLibraryInformation((IfcLibraryInformation)value, diagnostics, context);
			case FinalPackage.IFC_LIBRARY_REFERENCE:
				return validateIfcLibraryReference((IfcLibraryReference)value, diagnostics, context);
			case FinalPackage.IFC_LIBRARY_SELECT:
				return validateIfcLibrarySelect((IfcLibrarySelect)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_CURVE_ENUM_TYPE:
				return validateIfcLightDistributionCurveEnumType((IfcLightDistributionCurveEnumType)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA:
				return validateIfcLightDistributionData((IfcLightDistributionData)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT:
				return validateIfcLightDistributionDataSourceSelect((IfcLightDistributionDataSourceSelect)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_EMISSION_SOURCE_ENUM_TYPE:
				return validateIfcLightEmissionSourceEnumType((IfcLightEmissionSourceEnumType)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE:
				return validateIfcLightFixtureType((IfcLightFixtureType)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE_ENUM_TYPE:
				return validateIfcLightFixtureTypeEnumType((IfcLightFixtureTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION:
				return validateIfcLightIntensityDistribution((IfcLightIntensityDistribution)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_SOURCE:
				return validateIfcLightSource((IfcLightSource)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_SOURCE_AMBIENT:
				return validateIfcLightSourceAmbient((IfcLightSourceAmbient)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_SOURCE_DIRECTIONAL:
				return validateIfcLightSourceDirectional((IfcLightSourceDirectional)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC:
				return validateIfcLightSourceGoniometric((IfcLightSourceGoniometric)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL:
				return validateIfcLightSourcePositional((IfcLightSourcePositional)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT:
				return validateIfcLightSourceSpot((IfcLightSourceSpot)value, diagnostics, context);
			case FinalPackage.IFC_LINE:
				return validateIfcLine((IfcLine)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_DIMENSION:
				return validateIfcLinearDimension((IfcLinearDimension)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_FORCE_MEASURE_TYPE:
				return validateIfcLinearForceMeasureType((IfcLinearForceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_MOMENT_MEASURE_TYPE:
				return validateIfcLinearMomentMeasureType((IfcLinearMomentMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_STIFFNESS_MEASURE_TYPE:
				return validateIfcLinearStiffnessMeasureType((IfcLinearStiffnessMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_VELOCITY_MEASURE_TYPE:
				return validateIfcLinearVelocityMeasureType((IfcLinearVelocityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_LOAD_GROUP_TYPE_ENUM_TYPE:
				return validateIfcLoadGroupTypeEnumType((IfcLoadGroupTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_LOCAL_PLACEMENT:
				return validateIfcLocalPlacement((IfcLocalPlacement)value, diagnostics, context);
			case FinalPackage.IFC_LOCAL_TIME:
				return validateIfcLocalTime((IfcLocalTime)value, diagnostics, context);
			case FinalPackage.IFC_LOGICAL_OPERATOR_ENUM_TYPE:
				return validateIfcLogicalOperatorEnumType((IfcLogicalOperatorEnumType)value, diagnostics, context);
			case FinalPackage.IFC_LOGICAL_TYPE:
				return validateIfcLogicalType((IfcLogicalType)value, diagnostics, context);
			case FinalPackage.IFC_LOOP:
				return validateIfcLoop((IfcLoop)value, diagnostics, context);
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF:
				return validateIfcLShapeProfileDef((IfcLShapeProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_LUMINOUS_FLUX_MEASURE_TYPE:
				return validateIfcLuminousFluxMeasureType((IfcLuminousFluxMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE_TYPE:
				return validateIfcLuminousIntensityDistributionMeasureType((IfcLuminousIntensityDistributionMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_MEASURE_TYPE:
				return validateIfcLuminousIntensityMeasureType((IfcLuminousIntensityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MAGNETIC_FLUX_DENSITY_MEASURE_TYPE:
				return validateIfcMagneticFluxDensityMeasureType((IfcMagneticFluxDensityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MAGNETIC_FLUX_MEASURE_TYPE:
				return validateIfcMagneticFluxMeasureType((IfcMagneticFluxMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MANIFOLD_SOLID_BREP:
				return validateIfcManifoldSolidBrep((IfcManifoldSolidBrep)value, diagnostics, context);
			case FinalPackage.IFC_MAPPED_ITEM:
				return validateIfcMappedItem((IfcMappedItem)value, diagnostics, context);
			case FinalPackage.IFC_MASS_DENSITY_MEASURE_TYPE:
				return validateIfcMassDensityMeasureType((IfcMassDensityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MASS_FLOW_RATE_MEASURE_TYPE:
				return validateIfcMassFlowRateMeasureType((IfcMassFlowRateMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MASS_MEASURE_TYPE:
				return validateIfcMassMeasureType((IfcMassMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MASS_PER_LENGTH_MEASURE_TYPE:
				return validateIfcMassPerLengthMeasureType((IfcMassPerLengthMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MATERIAL:
				return validateIfcMaterial((IfcMaterial)value, diagnostics, context);
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP:
				return validateIfcMaterialClassificationRelationship((IfcMaterialClassificationRelationship)value, diagnostics, context);
			case FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION:
				return validateIfcMaterialDefinitionRepresentation((IfcMaterialDefinitionRepresentation)value, diagnostics, context);
			case FinalPackage.IFC_MATERIAL_LAYER:
				return validateIfcMaterialLayer((IfcMaterialLayer)value, diagnostics, context);
			case FinalPackage.IFC_MATERIAL_LAYER_SET:
				return validateIfcMaterialLayerSet((IfcMaterialLayerSet)value, diagnostics, context);
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE:
				return validateIfcMaterialLayerSetUsage((IfcMaterialLayerSetUsage)value, diagnostics, context);
			case FinalPackage.IFC_MATERIAL_LIST:
				return validateIfcMaterialList((IfcMaterialList)value, diagnostics, context);
			case FinalPackage.IFC_MATERIAL_PROPERTIES:
				return validateIfcMaterialProperties((IfcMaterialProperties)value, diagnostics, context);
			case FinalPackage.IFC_MATERIAL_SELECT:
				return validateIfcMaterialSelect((IfcMaterialSelect)value, diagnostics, context);
			case FinalPackage.IFC_MEASURE_VALUE:
				return validateIfcMeasureValue((IfcMeasureValue)value, diagnostics, context);
			case FinalPackage.IFC_MEASURE_WITH_UNIT:
				return validateIfcMeasureWithUnit((IfcMeasureWithUnit)value, diagnostics, context);
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES:
				return validateIfcMechanicalConcreteMaterialProperties((IfcMechanicalConcreteMaterialProperties)value, diagnostics, context);
			case FinalPackage.IFC_MECHANICAL_FASTENER:
				return validateIfcMechanicalFastener((IfcMechanicalFastener)value, diagnostics, context);
			case FinalPackage.IFC_MECHANICAL_FASTENER_TYPE:
				return validateIfcMechanicalFastenerType((IfcMechanicalFastenerType)value, diagnostics, context);
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES:
				return validateIfcMechanicalMaterialProperties((IfcMechanicalMaterialProperties)value, diagnostics, context);
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES:
				return validateIfcMechanicalSteelMaterialProperties((IfcMechanicalSteelMaterialProperties)value, diagnostics, context);
			case FinalPackage.IFC_MEMBER:
				return validateIfcMember((IfcMember)value, diagnostics, context);
			case FinalPackage.IFC_MEMBER_TYPE:
				return validateIfcMemberType((IfcMemberType)value, diagnostics, context);
			case FinalPackage.IFC_MEMBER_TYPE_ENUM_TYPE:
				return validateIfcMemberTypeEnumType((IfcMemberTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_METRIC:
				return validateIfcMetric((IfcMetric)value, diagnostics, context);
			case FinalPackage.IFC_METRIC_VALUE_SELECT:
				return validateIfcMetricValueSelect((IfcMetricValueSelect)value, diagnostics, context);
			case FinalPackage.IFC_MINUTE_IN_HOUR_TYPE:
				return validateIfcMinuteInHourType((IfcMinuteInHourType)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_ELASTICITY_MEASURE_TYPE:
				return validateIfcModulusOfElasticityMeasureType((IfcModulusOfElasticityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE_TYPE:
				return validateIfcModulusOfLinearSubgradeReactionMeasureType((IfcModulusOfLinearSubgradeReactionMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE_TYPE:
				return validateIfcModulusOfRotationalSubgradeReactionMeasureType((IfcModulusOfRotationalSubgradeReactionMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE_TYPE:
				return validateIfcModulusOfSubgradeReactionMeasureType((IfcModulusOfSubgradeReactionMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MOISTURE_DIFFUSIVITY_MEASURE_TYPE:
				return validateIfcMoistureDiffusivityMeasureType((IfcMoistureDiffusivityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MOLECULAR_WEIGHT_MEASURE_TYPE:
				return validateIfcMolecularWeightMeasureType((IfcMolecularWeightMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MOMENT_OF_INERTIA_MEASURE_TYPE:
				return validateIfcMomentOfInertiaMeasureType((IfcMomentOfInertiaMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MONETARY_MEASURE_TYPE:
				return validateIfcMonetaryMeasureType((IfcMonetaryMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_MONETARY_UNIT:
				return validateIfcMonetaryUnit((IfcMonetaryUnit)value, diagnostics, context);
			case FinalPackage.IFC_MONTH_IN_YEAR_NUMBER_TYPE:
				return validateIfcMonthInYearNumberType((IfcMonthInYearNumberType)value, diagnostics, context);
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE:
				return validateIfcMotorConnectionType((IfcMotorConnectionType)value, diagnostics, context);
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE_ENUM_TYPE:
				return validateIfcMotorConnectionTypeEnumType((IfcMotorConnectionTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_MOVE:
				return validateIfcMove((IfcMove)value, diagnostics, context);
			case FinalPackage.IFC_NAMED_UNIT:
				return validateIfcNamedUnit((IfcNamedUnit)value, diagnostics, context);
			case FinalPackage.IFC_NORMALISED_RATIO_MEASURE_TYPE:
				return validateIfcNormalisedRatioMeasureType((IfcNormalisedRatioMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_NULL_STYLE_TYPE:
				return validateIfcNullStyleType((IfcNullStyleType)value, diagnostics, context);
			case FinalPackage.IFC_NUMERIC_MEASURE_TYPE:
				return validateIfcNumericMeasureType((IfcNumericMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_OBJECT:
				return validateIfcObject((IfcObject)value, diagnostics, context);
			case FinalPackage.IFC_OBJECT_DEFINITION:
				return validateIfcObjectDefinition((IfcObjectDefinition)value, diagnostics, context);
			case FinalPackage.IFC_OBJECTIVE:
				return validateIfcObjective((IfcObjective)value, diagnostics, context);
			case FinalPackage.IFC_OBJECTIVE_ENUM_TYPE:
				return validateIfcObjectiveEnumType((IfcObjectiveEnumType)value, diagnostics, context);
			case FinalPackage.IFC_OBJECT_PLACEMENT:
				return validateIfcObjectPlacement((IfcObjectPlacement)value, diagnostics, context);
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT:
				return validateIfcObjectReferenceSelect((IfcObjectReferenceSelect)value, diagnostics, context);
			case FinalPackage.IFC_OBJECT_TYPE_ENUM_TYPE:
				return validateIfcObjectTypeEnumType((IfcObjectTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_OCCUPANT:
				return validateIfcOccupant((IfcOccupant)value, diagnostics, context);
			case FinalPackage.IFC_OCCUPANT_TYPE_ENUM_TYPE:
				return validateIfcOccupantTypeEnumType((IfcOccupantTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_OFFSET_CURVE2_D:
				return validateIfcOffsetCurve2D((IfcOffsetCurve2D)value, diagnostics, context);
			case FinalPackage.IFC_OFFSET_CURVE3_D:
				return validateIfcOffsetCurve3D((IfcOffsetCurve3D)value, diagnostics, context);
			case FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR:
				return validateIfcOneDirectionRepeatFactor((IfcOneDirectionRepeatFactor)value, diagnostics, context);
			case FinalPackage.IFC_OPENING_ELEMENT:
				return validateIfcOpeningElement((IfcOpeningElement)value, diagnostics, context);
			case FinalPackage.IFC_OPEN_SHELL:
				return validateIfcOpenShell((IfcOpenShell)value, diagnostics, context);
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES:
				return validateIfcOpticalMaterialProperties((IfcOpticalMaterialProperties)value, diagnostics, context);
			case FinalPackage.IFC_ORDER_ACTION:
				return validateIfcOrderAction((IfcOrderAction)value, diagnostics, context);
			case FinalPackage.IFC_ORGANIZATION:
				return validateIfcOrganization((IfcOrganization)value, diagnostics, context);
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP:
				return validateIfcOrganizationRelationship((IfcOrganizationRelationship)value, diagnostics, context);
			case FinalPackage.IFC_ORIENTATION_SELECT:
				return validateIfcOrientationSelect((IfcOrientationSelect)value, diagnostics, context);
			case FinalPackage.IFC_ORIENTED_EDGE:
				return validateIfcOrientedEdge((IfcOrientedEdge)value, diagnostics, context);
			case FinalPackage.IFC_ORIENTED_EDGE_TEMP:
				return validateIfcOrientedEdgeTemp((IfcOrientedEdgeTemp)value, diagnostics, context);
			case FinalPackage.IFC_OUTLET_TYPE:
				return validateIfcOutletType((IfcOutletType)value, diagnostics, context);
			case FinalPackage.IFC_OUTLET_TYPE_ENUM_TYPE:
				return validateIfcOutletTypeEnumType((IfcOutletTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_OWNER_HISTORY:
				return validateIfcOwnerHistory((IfcOwnerHistory)value, diagnostics, context);
			case FinalPackage.IFC_PARAMETERIZED_PROFILE_DEF:
				return validateIfcParameterizedProfileDef((IfcParameterizedProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_PARAMETER_VALUE_TYPE:
				return validateIfcParameterValueType((IfcParameterValueType)value, diagnostics, context);
			case FinalPackage.IFC_PATH:
				return validateIfcPath((IfcPath)value, diagnostics, context);
			case FinalPackage.IFC_PERFORMANCE_HISTORY:
				return validateIfcPerformanceHistory((IfcPerformanceHistory)value, diagnostics, context);
			case FinalPackage.IFC_PERMEABLE_COVERING_OPERATION_ENUM_TYPE:
				return validateIfcPermeableCoveringOperationEnumType((IfcPermeableCoveringOperationEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES:
				return validateIfcPermeableCoveringProperties((IfcPermeableCoveringProperties)value, diagnostics, context);
			case FinalPackage.IFC_PERMIT:
				return validateIfcPermit((IfcPermit)value, diagnostics, context);
			case FinalPackage.IFC_PERSON:
				return validateIfcPerson((IfcPerson)value, diagnostics, context);
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION:
				return validateIfcPersonAndOrganization((IfcPersonAndOrganization)value, diagnostics, context);
			case FinalPackage.IFC_PH_MEASURE_TYPE:
				return validateIfcPHMeasureType((IfcPHMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY:
				return validateIfcPhysicalComplexQuantity((IfcPhysicalComplexQuantity)value, diagnostics, context);
			case FinalPackage.IFC_PHYSICAL_OR_VIRTUAL_ENUM_TYPE:
				return validateIfcPhysicalOrVirtualEnumType((IfcPhysicalOrVirtualEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PHYSICAL_QUANTITY:
				return validateIfcPhysicalQuantity((IfcPhysicalQuantity)value, diagnostics, context);
			case FinalPackage.IFC_PHYSICAL_SIMPLE_QUANTITY:
				return validateIfcPhysicalSimpleQuantity((IfcPhysicalSimpleQuantity)value, diagnostics, context);
			case FinalPackage.IFC_PILE:
				return validateIfcPile((IfcPile)value, diagnostics, context);
			case FinalPackage.IFC_PILE_CONSTRUCTION_ENUM_TYPE:
				return validateIfcPileConstructionEnumType((IfcPileConstructionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PILE_TYPE_ENUM_TYPE:
				return validateIfcPileTypeEnumType((IfcPileTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PIPE_FITTING_TYPE:
				return validateIfcPipeFittingType((IfcPipeFittingType)value, diagnostics, context);
			case FinalPackage.IFC_PIPE_FITTING_TYPE_ENUM_TYPE:
				return validateIfcPipeFittingTypeEnumType((IfcPipeFittingTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE:
				return validateIfcPipeSegmentType((IfcPipeSegmentType)value, diagnostics, context);
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE_ENUM_TYPE:
				return validateIfcPipeSegmentTypeEnumType((IfcPipeSegmentTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PIXEL_TEXTURE:
				return validateIfcPixelTexture((IfcPixelTexture)value, diagnostics, context);
			case FinalPackage.IFC_PLACEMENT:
				return validateIfcPlacement((IfcPlacement)value, diagnostics, context);
			case FinalPackage.IFC_PLANAR_BOX:
				return validateIfcPlanarBox((IfcPlanarBox)value, diagnostics, context);
			case FinalPackage.IFC_PLANAR_EXTENT:
				return validateIfcPlanarExtent((IfcPlanarExtent)value, diagnostics, context);
			case FinalPackage.IFC_PLANAR_FORCE_MEASURE_TYPE:
				return validateIfcPlanarForceMeasureType((IfcPlanarForceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_PLANE:
				return validateIfcPlane((IfcPlane)value, diagnostics, context);
			case FinalPackage.IFC_PLANE_ANGLE_MEASURE_TYPE:
				return validateIfcPlaneAngleMeasureType((IfcPlaneAngleMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_PLATE:
				return validateIfcPlate((IfcPlate)value, diagnostics, context);
			case FinalPackage.IFC_PLATE_TYPE:
				return validateIfcPlateType((IfcPlateType)value, diagnostics, context);
			case FinalPackage.IFC_PLATE_TYPE_ENUM_TYPE:
				return validateIfcPlateTypeEnumType((IfcPlateTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_POINT:
				return validateIfcPoint((IfcPoint)value, diagnostics, context);
			case FinalPackage.IFC_POINT_ON_CURVE:
				return validateIfcPointOnCurve((IfcPointOnCurve)value, diagnostics, context);
			case FinalPackage.IFC_POINT_ON_SURFACE:
				return validateIfcPointOnSurface((IfcPointOnSurface)value, diagnostics, context);
			case FinalPackage.IFC_POINT_OR_VERTEX_POINT:
				return validateIfcPointOrVertexPoint((IfcPointOrVertexPoint)value, diagnostics, context);
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE:
				return validateIfcPolygonalBoundedHalfSpace((IfcPolygonalBoundedHalfSpace)value, diagnostics, context);
			case FinalPackage.IFC_POLYLINE:
				return validateIfcPolyline((IfcPolyline)value, diagnostics, context);
			case FinalPackage.IFC_POLY_LOOP:
				return validateIfcPolyLoop((IfcPolyLoop)value, diagnostics, context);
			case FinalPackage.IFC_PORT:
				return validateIfcPort((IfcPort)value, diagnostics, context);
			case FinalPackage.IFC_POSITIVE_LENGTH_MEASURE_TYPE:
				return validateIfcPositiveLengthMeasureType((IfcPositiveLengthMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_POSITIVE_PLANE_ANGLE_MEASURE_TYPE:
				return validateIfcPositivePlaneAngleMeasureType((IfcPositivePlaneAngleMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_POSITIVE_RATIO_MEASURE_TYPE:
				return validateIfcPositiveRatioMeasureType((IfcPositiveRatioMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_POSTAL_ADDRESS:
				return validateIfcPostalAddress((IfcPostalAddress)value, diagnostics, context);
			case FinalPackage.IFC_POWER_MEASURE_TYPE:
				return validateIfcPowerMeasureType((IfcPowerMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_PRE_DEFINED_COLOUR:
				return validateIfcPreDefinedColour((IfcPreDefinedColour)value, diagnostics, context);
			case FinalPackage.IFC_PRE_DEFINED_CURVE_FONT:
				return validateIfcPreDefinedCurveFont((IfcPreDefinedCurveFont)value, diagnostics, context);
			case FinalPackage.IFC_PRE_DEFINED_DIMENSION_SYMBOL:
				return validateIfcPreDefinedDimensionSymbol((IfcPreDefinedDimensionSymbol)value, diagnostics, context);
			case FinalPackage.IFC_PRE_DEFINED_ITEM:
				return validateIfcPreDefinedItem((IfcPreDefinedItem)value, diagnostics, context);
			case FinalPackage.IFC_PRE_DEFINED_POINT_MARKER_SYMBOL:
				return validateIfcPreDefinedPointMarkerSymbol((IfcPreDefinedPointMarkerSymbol)value, diagnostics, context);
			case FinalPackage.IFC_PRE_DEFINED_SYMBOL:
				return validateIfcPreDefinedSymbol((IfcPreDefinedSymbol)value, diagnostics, context);
			case FinalPackage.IFC_PRE_DEFINED_TERMINATOR_SYMBOL:
				return validateIfcPreDefinedTerminatorSymbol((IfcPreDefinedTerminatorSymbol)value, diagnostics, context);
			case FinalPackage.IFC_PRE_DEFINED_TEXT_FONT:
				return validateIfcPreDefinedTextFont((IfcPreDefinedTextFont)value, diagnostics, context);
			case FinalPackage.IFC_PRESENTABLE_TEXT_TYPE:
				return validateIfcPresentableTextType((IfcPresentableTextType)value, diagnostics, context);
			case FinalPackage.IFC_PRESENTATION_LAYER_ASSIGNMENT:
				return validateIfcPresentationLayerAssignment((IfcPresentationLayerAssignment)value, diagnostics, context);
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE:
				return validateIfcPresentationLayerWithStyle((IfcPresentationLayerWithStyle)value, diagnostics, context);
			case FinalPackage.IFC_PRESENTATION_STYLE:
				return validateIfcPresentationStyle((IfcPresentationStyle)value, diagnostics, context);
			case FinalPackage.IFC_PRESENTATION_STYLE_ASSIGNMENT:
				return validateIfcPresentationStyleAssignment((IfcPresentationStyleAssignment)value, diagnostics, context);
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT:
				return validateIfcPresentationStyleSelect((IfcPresentationStyleSelect)value, diagnostics, context);
			case FinalPackage.IFC_PRESSURE_MEASURE_TYPE:
				return validateIfcPressureMeasureType((IfcPressureMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_PROCEDURE:
				return validateIfcProcedure((IfcProcedure)value, diagnostics, context);
			case FinalPackage.IFC_PROCEDURE_TYPE_ENUM_TYPE:
				return validateIfcProcedureTypeEnumType((IfcProcedureTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PROCESS:
				return validateIfcProcess((IfcProcess)value, diagnostics, context);
			case FinalPackage.IFC_PRODUCT:
				return validateIfcProduct((IfcProduct)value, diagnostics, context);
			case FinalPackage.IFC_PRODUCT_DEFINITION_SHAPE:
				return validateIfcProductDefinitionShape((IfcProductDefinitionShape)value, diagnostics, context);
			case FinalPackage.IFC_PRODUCT_REPRESENTATION:
				return validateIfcProductRepresentation((IfcProductRepresentation)value, diagnostics, context);
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES:
				return validateIfcProductsOfCombustionProperties((IfcProductsOfCombustionProperties)value, diagnostics, context);
			case FinalPackage.IFC_PROFILE_DEF:
				return validateIfcProfileDef((IfcProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_PROFILE_PROPERTIES:
				return validateIfcProfileProperties((IfcProfileProperties)value, diagnostics, context);
			case FinalPackage.IFC_PROFILE_TYPE_ENUM_TYPE:
				return validateIfcProfileTypeEnumType((IfcProfileTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PROJECT:
				return validateIfcProject((IfcProject)value, diagnostics, context);
			case FinalPackage.IFC_PROJECTED_OR_TRUE_LENGTH_ENUM_TYPE:
				return validateIfcProjectedOrTrueLengthEnumType((IfcProjectedOrTrueLengthEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PROJECTION_CURVE:
				return validateIfcProjectionCurve((IfcProjectionCurve)value, diagnostics, context);
			case FinalPackage.IFC_PROJECTION_ELEMENT:
				return validateIfcProjectionElement((IfcProjectionElement)value, diagnostics, context);
			case FinalPackage.IFC_PROJECT_ORDER:
				return validateIfcProjectOrder((IfcProjectOrder)value, diagnostics, context);
			case FinalPackage.IFC_PROJECT_ORDER_RECORD:
				return validateIfcProjectOrderRecord((IfcProjectOrderRecord)value, diagnostics, context);
			case FinalPackage.IFC_PROJECT_ORDER_RECORD_TYPE_ENUM_TYPE:
				return validateIfcProjectOrderRecordTypeEnumType((IfcProjectOrderRecordTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PROJECT_ORDER_TYPE_ENUM_TYPE:
				return validateIfcProjectOrderTypeEnumType((IfcProjectOrderTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY:
				return validateIfcProperty((IfcProperty)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE:
				return validateIfcPropertyBoundedValue((IfcPropertyBoundedValue)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP:
				return validateIfcPropertyConstraintRelationship((IfcPropertyConstraintRelationship)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_DEFINITION:
				return validateIfcPropertyDefinition((IfcPropertyDefinition)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP:
				return validateIfcPropertyDependencyRelationship((IfcPropertyDependencyRelationship)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE:
				return validateIfcPropertyEnumeratedValue((IfcPropertyEnumeratedValue)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_ENUMERATION:
				return validateIfcPropertyEnumeration((IfcPropertyEnumeration)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_LIST_VALUE:
				return validateIfcPropertyListValue((IfcPropertyListValue)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE:
				return validateIfcPropertyReferenceValue((IfcPropertyReferenceValue)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_SET:
				return validateIfcPropertySet((IfcPropertySet)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_SET_DEFINITION:
				return validateIfcPropertySetDefinition((IfcPropertySetDefinition)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE:
				return validateIfcPropertySingleValue((IfcPropertySingleValue)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_SOURCE_ENUM_TYPE:
				return validateIfcPropertySourceEnumType((IfcPropertySourceEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE:
				return validateIfcPropertyTableValue((IfcPropertyTableValue)value, diagnostics, context);
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE:
				return validateIfcProtectiveDeviceType((IfcProtectiveDeviceType)value, diagnostics, context);
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE_ENUM_TYPE:
				return validateIfcProtectiveDeviceTypeEnumType((IfcProtectiveDeviceTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_PROXY:
				return validateIfcProxy((IfcProxy)value, diagnostics, context);
			case FinalPackage.IFC_PUMP_TYPE:
				return validateIfcPumpType((IfcPumpType)value, diagnostics, context);
			case FinalPackage.IFC_PUMP_TYPE_ENUM_TYPE:
				return validateIfcPumpTypeEnumType((IfcPumpTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_QUANTITY_AREA:
				return validateIfcQuantityArea((IfcQuantityArea)value, diagnostics, context);
			case FinalPackage.IFC_QUANTITY_COUNT:
				return validateIfcQuantityCount((IfcQuantityCount)value, diagnostics, context);
			case FinalPackage.IFC_QUANTITY_LENGTH:
				return validateIfcQuantityLength((IfcQuantityLength)value, diagnostics, context);
			case FinalPackage.IFC_QUANTITY_TIME:
				return validateIfcQuantityTime((IfcQuantityTime)value, diagnostics, context);
			case FinalPackage.IFC_QUANTITY_VOLUME:
				return validateIfcQuantityVolume((IfcQuantityVolume)value, diagnostics, context);
			case FinalPackage.IFC_QUANTITY_WEIGHT:
				return validateIfcQuantityWeight((IfcQuantityWeight)value, diagnostics, context);
			case FinalPackage.IFC_RADIO_ACTIVITY_MEASURE_TYPE:
				return validateIfcRadioActivityMeasureType((IfcRadioActivityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_RADIUS_DIMENSION:
				return validateIfcRadiusDimension((IfcRadiusDimension)value, diagnostics, context);
			case FinalPackage.IFC_RAILING:
				return validateIfcRailing((IfcRailing)value, diagnostics, context);
			case FinalPackage.IFC_RAILING_TYPE:
				return validateIfcRailingType((IfcRailingType)value, diagnostics, context);
			case FinalPackage.IFC_RAILING_TYPE_ENUM_TYPE:
				return validateIfcRailingTypeEnumType((IfcRailingTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_RAMP:
				return validateIfcRamp((IfcRamp)value, diagnostics, context);
			case FinalPackage.IFC_RAMP_FLIGHT:
				return validateIfcRampFlight((IfcRampFlight)value, diagnostics, context);
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE:
				return validateIfcRampFlightType((IfcRampFlightType)value, diagnostics, context);
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE_ENUM_TYPE:
				return validateIfcRampFlightTypeEnumType((IfcRampFlightTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_RAMP_TYPE_ENUM_TYPE:
				return validateIfcRampTypeEnumType((IfcRampTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_RATIO_MEASURE_TYPE:
				return validateIfcRatioMeasureType((IfcRatioMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_RATIONAL_BEZIER_CURVE:
				return validateIfcRationalBezierCurve((IfcRationalBezierCurve)value, diagnostics, context);
			case FinalPackage.IFC_REAL_TYPE:
				return validateIfcRealType((IfcRealType)value, diagnostics, context);
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF:
				return validateIfcRectangleHollowProfileDef((IfcRectangleHollowProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_RECTANGLE_PROFILE_DEF:
				return validateIfcRectangleProfileDef((IfcRectangleProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_RECTANGULAR_PYRAMID:
				return validateIfcRectangularPyramid((IfcRectangularPyramid)value, diagnostics, context);
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE:
				return validateIfcRectangularTrimmedSurface((IfcRectangularTrimmedSurface)value, diagnostics, context);
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT:
				return validateIfcReferencesValueDocument((IfcReferencesValueDocument)value, diagnostics, context);
			case FinalPackage.IFC_REFLECTANCE_METHOD_ENUM_TYPE:
				return validateIfcReflectanceMethodEnumType((IfcReflectanceMethodEnumType)value, diagnostics, context);
			case FinalPackage.IFC_REGULAR_TIME_SERIES:
				return validateIfcRegularTimeSeries((IfcRegularTimeSeries)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES:
				return validateIfcReinforcementBarProperties((IfcReinforcementBarProperties)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES:
				return validateIfcReinforcementDefinitionProperties((IfcReinforcementDefinitionProperties)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCING_BAR:
				return validateIfcReinforcingBar((IfcReinforcingBar)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCING_BAR_ROLE_ENUM_TYPE:
				return validateIfcReinforcingBarRoleEnumType((IfcReinforcingBarRoleEnumType)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCING_BAR_SURFACE_ENUM_TYPE:
				return validateIfcReinforcingBarSurfaceEnumType((IfcReinforcingBarSurfaceEnumType)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCING_ELEMENT:
				return validateIfcReinforcingElement((IfcReinforcingElement)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCING_MESH:
				return validateIfcReinforcingMesh((IfcReinforcingMesh)value, diagnostics, context);
			case FinalPackage.IFC_REL_AGGREGATES:
				return validateIfcRelAggregates((IfcRelAggregates)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSIGNS:
				return validateIfcRelAssigns((IfcRelAssigns)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSIGNS_TASKS:
				return validateIfcRelAssignsTasks((IfcRelAssignsTasks)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR:
				return validateIfcRelAssignsToActor((IfcRelAssignsToActor)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSIGNS_TO_CONTROL:
				return validateIfcRelAssignsToControl((IfcRelAssignsToControl)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSIGNS_TO_GROUP:
				return validateIfcRelAssignsToGroup((IfcRelAssignsToGroup)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS:
				return validateIfcRelAssignsToProcess((IfcRelAssignsToProcess)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT:
				return validateIfcRelAssignsToProduct((IfcRelAssignsToProduct)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROJECT_ORDER:
				return validateIfcRelAssignsToProjectOrder((IfcRelAssignsToProjectOrder)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE:
				return validateIfcRelAssignsToResource((IfcRelAssignsToResource)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSOCIATES:
				return validateIfcRelAssociates((IfcRelAssociates)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE:
				return validateIfcRelAssociatesAppliedValue((IfcRelAssociatesAppliedValue)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSOCIATES_APPROVAL:
				return validateIfcRelAssociatesApproval((IfcRelAssociatesApproval)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION:
				return validateIfcRelAssociatesClassification((IfcRelAssociatesClassification)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT:
				return validateIfcRelAssociatesConstraint((IfcRelAssociatesConstraint)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSOCIATES_DOCUMENT:
				return validateIfcRelAssociatesDocument((IfcRelAssociatesDocument)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSOCIATES_LIBRARY:
				return validateIfcRelAssociatesLibrary((IfcRelAssociatesLibrary)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSOCIATES_MATERIAL:
				return validateIfcRelAssociatesMaterial((IfcRelAssociatesMaterial)value, diagnostics, context);
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES:
				return validateIfcRelAssociatesProfileProperties((IfcRelAssociatesProfileProperties)value, diagnostics, context);
			case FinalPackage.IFC_RELATIONSHIP:
				return validateIfcRelationship((IfcRelationship)value, diagnostics, context);
			case FinalPackage.IFC_RELAXATION:
				return validateIfcRelaxation((IfcRelaxation)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS:
				return validateIfcRelConnects((IfcRelConnects)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS:
				return validateIfcRelConnectsElements((IfcRelConnectsElements)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS:
				return validateIfcRelConnectsPathElements((IfcRelConnectsPathElements)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS_PORTS:
				return validateIfcRelConnectsPorts((IfcRelConnectsPorts)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT:
				return validateIfcRelConnectsPortToElement((IfcRelConnectsPortToElement)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY:
				return validateIfcRelConnectsStructuralActivity((IfcRelConnectsStructuralActivity)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT:
				return validateIfcRelConnectsStructuralElement((IfcRelConnectsStructuralElement)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER:
				return validateIfcRelConnectsStructuralMember((IfcRelConnectsStructuralMember)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY:
				return validateIfcRelConnectsWithEccentricity((IfcRelConnectsWithEccentricity)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS:
				return validateIfcRelConnectsWithRealizingElements((IfcRelConnectsWithRealizingElements)value, diagnostics, context);
			case FinalPackage.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE:
				return validateIfcRelContainedInSpatialStructure((IfcRelContainedInSpatialStructure)value, diagnostics, context);
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS:
				return validateIfcRelCoversBldgElements((IfcRelCoversBldgElements)value, diagnostics, context);
			case FinalPackage.IFC_REL_COVERS_SPACES:
				return validateIfcRelCoversSpaces((IfcRelCoversSpaces)value, diagnostics, context);
			case FinalPackage.IFC_REL_DECOMPOSES:
				return validateIfcRelDecomposes((IfcRelDecomposes)value, diagnostics, context);
			case FinalPackage.IFC_REL_DEFINES:
				return validateIfcRelDefines((IfcRelDefines)value, diagnostics, context);
			case FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES:
				return validateIfcRelDefinesByProperties((IfcRelDefinesByProperties)value, diagnostics, context);
			case FinalPackage.IFC_REL_DEFINES_BY_TYPE:
				return validateIfcRelDefinesByType((IfcRelDefinesByType)value, diagnostics, context);
			case FinalPackage.IFC_REL_FILLS_ELEMENT:
				return validateIfcRelFillsElement((IfcRelFillsElement)value, diagnostics, context);
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS:
				return validateIfcRelFlowControlElements((IfcRelFlowControlElements)value, diagnostics, context);
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS:
				return validateIfcRelInteractionRequirements((IfcRelInteractionRequirements)value, diagnostics, context);
			case FinalPackage.IFC_REL_NESTS:
				return validateIfcRelNests((IfcRelNests)value, diagnostics, context);
			case FinalPackage.IFC_REL_OCCUPIES_SPACES:
				return validateIfcRelOccupiesSpaces((IfcRelOccupiesSpaces)value, diagnostics, context);
			case FinalPackage.IFC_REL_OVERRIDES_PROPERTIES:
				return validateIfcRelOverridesProperties((IfcRelOverridesProperties)value, diagnostics, context);
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT:
				return validateIfcRelProjectsElement((IfcRelProjectsElement)value, diagnostics, context);
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE:
				return validateIfcRelReferencedInSpatialStructure((IfcRelReferencedInSpatialStructure)value, diagnostics, context);
			case FinalPackage.IFC_REL_SCHEDULES_COST_ITEMS:
				return validateIfcRelSchedulesCostItems((IfcRelSchedulesCostItems)value, diagnostics, context);
			case FinalPackage.IFC_REL_SEQUENCE:
				return validateIfcRelSequence((IfcRelSequence)value, diagnostics, context);
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS:
				return validateIfcRelServicesBuildings((IfcRelServicesBuildings)value, diagnostics, context);
			case FinalPackage.IFC_REL_SPACE_BOUNDARY:
				return validateIfcRelSpaceBoundary((IfcRelSpaceBoundary)value, diagnostics, context);
			case FinalPackage.IFC_REL_VOIDS_ELEMENT:
				return validateIfcRelVoidsElement((IfcRelVoidsElement)value, diagnostics, context);
			case FinalPackage.IFC_REPRESENTATION:
				return validateIfcRepresentation((IfcRepresentation)value, diagnostics, context);
			case FinalPackage.IFC_REPRESENTATION_CONTEXT:
				return validateIfcRepresentationContext((IfcRepresentationContext)value, diagnostics, context);
			case FinalPackage.IFC_REPRESENTATION_ITEM:
				return validateIfcRepresentationItem((IfcRepresentationItem)value, diagnostics, context);
			case FinalPackage.IFC_REPRESENTATION_MAP:
				return validateIfcRepresentationMap((IfcRepresentationMap)value, diagnostics, context);
			case FinalPackage.IFC_RESOURCE:
				return validateIfcResource((IfcResource)value, diagnostics, context);
			case FinalPackage.IFC_RESOURCE_CONSUMPTION_ENUM_TYPE:
				return validateIfcResourceConsumptionEnumType((IfcResourceConsumptionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_REVOLVED_AREA_SOLID:
				return validateIfcRevolvedAreaSolid((IfcRevolvedAreaSolid)value, diagnostics, context);
			case FinalPackage.IFC_RIB_PLATE_DIRECTION_ENUM_TYPE:
				return validateIfcRibPlateDirectionEnumType((IfcRibPlateDirectionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES:
				return validateIfcRibPlateProfileProperties((IfcRibPlateProfileProperties)value, diagnostics, context);
			case FinalPackage.IFC_RIGHT_CIRCULAR_CONE:
				return validateIfcRightCircularCone((IfcRightCircularCone)value, diagnostics, context);
			case FinalPackage.IFC_RIGHT_CIRCULAR_CYLINDER:
				return validateIfcRightCircularCylinder((IfcRightCircularCylinder)value, diagnostics, context);
			case FinalPackage.IFC_ROLE_ENUM_TYPE:
				return validateIfcRoleEnumType((IfcRoleEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ROOF:
				return validateIfcRoof((IfcRoof)value, diagnostics, context);
			case FinalPackage.IFC_ROOF_TYPE_ENUM_TYPE:
				return validateIfcRoofTypeEnumType((IfcRoofTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_ROOT:
				return validateIfcRoot((IfcRoot)value, diagnostics, context);
			case FinalPackage.IFC_ROTATIONAL_FREQUENCY_MEASURE_TYPE:
				return validateIfcRotationalFrequencyMeasureType((IfcRotationalFrequencyMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ROTATIONAL_MASS_MEASURE_TYPE:
				return validateIfcRotationalMassMeasureType((IfcRotationalMassMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ROTATIONAL_STIFFNESS_MEASURE_TYPE:
				return validateIfcRotationalStiffnessMeasureType((IfcRotationalStiffnessMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_ROUNDED_EDGE_FEATURE:
				return validateIfcRoundedEdgeFeature((IfcRoundedEdgeFeature)value, diagnostics, context);
			case FinalPackage.IFC_ROUNDED_RECTANGLE_PROFILE_DEF:
				return validateIfcRoundedRectangleProfileDef((IfcRoundedRectangleProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE:
				return validateIfcSanitaryTerminalType((IfcSanitaryTerminalType)value, diagnostics, context);
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE_ENUM_TYPE:
				return validateIfcSanitaryTerminalTypeEnumType((IfcSanitaryTerminalTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL:
				return validateIfcScheduleTimeControl((IfcScheduleTimeControl)value, diagnostics, context);
			case FinalPackage.IFC_SECOND_IN_MINUTE_TYPE:
				return validateIfcSecondInMinuteType((IfcSecondInMinuteType)value, diagnostics, context);
			case FinalPackage.IFC_SECTIONAL_AREA_INTEGRAL_MEASURE_TYPE:
				return validateIfcSectionalAreaIntegralMeasureType((IfcSectionalAreaIntegralMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_SECTIONED_SPINE:
				return validateIfcSectionedSpine((IfcSectionedSpine)value, diagnostics, context);
			case FinalPackage.IFC_SECTION_MODULUS_MEASURE_TYPE:
				return validateIfcSectionModulusMeasureType((IfcSectionModulusMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_SECTION_PROPERTIES:
				return validateIfcSectionProperties((IfcSectionProperties)value, diagnostics, context);
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES:
				return validateIfcSectionReinforcementProperties((IfcSectionReinforcementProperties)value, diagnostics, context);
			case FinalPackage.IFC_SECTION_TYPE_ENUM_TYPE:
				return validateIfcSectionTypeEnumType((IfcSectionTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SENSOR_TYPE:
				return validateIfcSensorType((IfcSensorType)value, diagnostics, context);
			case FinalPackage.IFC_SENSOR_TYPE_ENUM_TYPE:
				return validateIfcSensorTypeEnumType((IfcSensorTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SEQUENCE_ENUM_TYPE:
				return validateIfcSequenceEnumType((IfcSequenceEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SERVICE_LIFE:
				return validateIfcServiceLife((IfcServiceLife)value, diagnostics, context);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR:
				return validateIfcServiceLifeFactor((IfcServiceLifeFactor)value, diagnostics, context);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR_TYPE_ENUM_TYPE:
				return validateIfcServiceLifeFactorTypeEnumType((IfcServiceLifeFactorTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SERVICE_LIFE_TYPE_ENUM_TYPE:
				return validateIfcServiceLifeTypeEnumType((IfcServiceLifeTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SHAPE_ASPECT:
				return validateIfcShapeAspect((IfcShapeAspect)value, diagnostics, context);
			case FinalPackage.IFC_SHAPE_MODEL:
				return validateIfcShapeModel((IfcShapeModel)value, diagnostics, context);
			case FinalPackage.IFC_SHAPE_REPRESENTATION:
				return validateIfcShapeRepresentation((IfcShapeRepresentation)value, diagnostics, context);
			case FinalPackage.IFC_SHEAR_MODULUS_MEASURE_TYPE:
				return validateIfcShearModulusMeasureType((IfcShearModulusMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_SHELL:
				return validateIfcShell((IfcShell)value, diagnostics, context);
			case FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL:
				return validateIfcShellBasedSurfaceModel((IfcShellBasedSurfaceModel)value, diagnostics, context);
			case FinalPackage.IFC_SIMPLE_PROPERTY:
				return validateIfcSimpleProperty((IfcSimpleProperty)value, diagnostics, context);
			case FinalPackage.IFC_SIMPLE_VALUE:
				return validateIfcSimpleValue((IfcSimpleValue)value, diagnostics, context);
			case FinalPackage.IFC_SI_PREFIX_TYPE:
				return validateIfcSIPrefixType((IfcSIPrefixType)value, diagnostics, context);
			case FinalPackage.IFC_SITE:
				return validateIfcSite((IfcSite)value, diagnostics, context);
			case FinalPackage.IFC_SI_UNIT:
				return validateIfcSIUnit((IfcSIUnit)value, diagnostics, context);
			case FinalPackage.IFC_SI_UNIT_NAME_TYPE:
				return validateIfcSIUnitNameType((IfcSIUnitNameType)value, diagnostics, context);
			case FinalPackage.IFC_SI_UNIT_TEMP:
				return validateIfcSIUnitTemp((IfcSIUnitTemp)value, diagnostics, context);
			case FinalPackage.IFC_SIZE_SELECT:
				return validateIfcSizeSelect((IfcSizeSelect)value, diagnostics, context);
			case FinalPackage.IFC_SLAB:
				return validateIfcSlab((IfcSlab)value, diagnostics, context);
			case FinalPackage.IFC_SLAB_TYPE:
				return validateIfcSlabType((IfcSlabType)value, diagnostics, context);
			case FinalPackage.IFC_SLAB_TYPE_ENUM_TYPE:
				return validateIfcSlabTypeEnumType((IfcSlabTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION:
				return validateIfcSlippageConnectionCondition((IfcSlippageConnectionCondition)value, diagnostics, context);
			case FinalPackage.IFC_SOLID_ANGLE_MEASURE_TYPE:
				return validateIfcSolidAngleMeasureType((IfcSolidAngleMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_SOLID_MODEL:
				return validateIfcSolidModel((IfcSolidModel)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_POWER_MEASURE_TYPE:
				return validateIfcSoundPowerMeasureType((IfcSoundPowerMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_PRESSURE_MEASURE_TYPE:
				return validateIfcSoundPressureMeasureType((IfcSoundPressureMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_PROPERTIES:
				return validateIfcSoundProperties((IfcSoundProperties)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_SCALE_ENUM_TYPE:
				return validateIfcSoundScaleEnumType((IfcSoundScaleEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_VALUE:
				return validateIfcSoundValue((IfcSoundValue)value, diagnostics, context);
			case FinalPackage.IFC_SPACE:
				return validateIfcSpace((IfcSpace)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_HEATER_TYPE:
				return validateIfcSpaceHeaterType((IfcSpaceHeaterType)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_HEATER_TYPE_ENUM_TYPE:
				return validateIfcSpaceHeaterTypeEnumType((IfcSpaceHeaterTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_PROGRAM:
				return validateIfcSpaceProgram((IfcSpaceProgram)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES:
				return validateIfcSpaceThermalLoadProperties((IfcSpaceThermalLoadProperties)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_TYPE:
				return validateIfcSpaceType((IfcSpaceType)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_TYPE_ENUM_TYPE:
				return validateIfcSpaceTypeEnumType((IfcSpaceTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SPATIAL_STRUCTURE_ELEMENT:
				return validateIfcSpatialStructureElement((IfcSpatialStructureElement)value, diagnostics, context);
			case FinalPackage.IFC_SPATIAL_STRUCTURE_ELEMENT_TYPE:
				return validateIfcSpatialStructureElementType((IfcSpatialStructureElementType)value, diagnostics, context);
			case FinalPackage.IFC_SPECIFIC_HEAT_CAPACITY_MEASURE_TYPE:
				return validateIfcSpecificHeatCapacityMeasureType((IfcSpecificHeatCapacityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_SPECULAR_EXPONENT_TYPE:
				return validateIfcSpecularExponentType((IfcSpecularExponentType)value, diagnostics, context);
			case FinalPackage.IFC_SPECULAR_HIGHLIGHT_SELECT:
				return validateIfcSpecularHighlightSelect((IfcSpecularHighlightSelect)value, diagnostics, context);
			case FinalPackage.IFC_SPECULAR_ROUGHNESS_TYPE:
				return validateIfcSpecularRoughnessType((IfcSpecularRoughnessType)value, diagnostics, context);
			case FinalPackage.IFC_SPHERE:
				return validateIfcSphere((IfcSphere)value, diagnostics, context);
			case FinalPackage.IFC_STACK_TERMINAL_TYPE:
				return validateIfcStackTerminalType((IfcStackTerminalType)value, diagnostics, context);
			case FinalPackage.IFC_STACK_TERMINAL_TYPE_ENUM_TYPE:
				return validateIfcStackTerminalTypeEnumType((IfcStackTerminalTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_STAIR:
				return validateIfcStair((IfcStair)value, diagnostics, context);
			case FinalPackage.IFC_STAIR_FLIGHT:
				return validateIfcStairFlight((IfcStairFlight)value, diagnostics, context);
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE:
				return validateIfcStairFlightType((IfcStairFlightType)value, diagnostics, context);
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE_ENUM_TYPE:
				return validateIfcStairFlightTypeEnumType((IfcStairFlightTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_STAIR_TYPE_ENUM_TYPE:
				return validateIfcStairTypeEnumType((IfcStairTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_STATE_ENUM_TYPE:
				return validateIfcStateEnumType((IfcStateEnumType)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_ACTION:
				return validateIfcStructuralAction((IfcStructuralAction)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY:
				return validateIfcStructuralActivity((IfcStructuralActivity)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY_ASSIGNMENT_SELECT:
				return validateIfcStructuralActivityAssignmentSelect((IfcStructuralActivityAssignmentSelect)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL:
				return validateIfcStructuralAnalysisModel((IfcStructuralAnalysisModel)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_CONNECTION:
				return validateIfcStructuralConnection((IfcStructuralConnection)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_CONNECTION_CONDITION:
				return validateIfcStructuralConnectionCondition((IfcStructuralConnectionCondition)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_CURVE_CONNECTION:
				return validateIfcStructuralCurveConnection((IfcStructuralCurveConnection)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_CURVE_MEMBER:
				return validateIfcStructuralCurveMember((IfcStructuralCurveMember)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_CURVE_MEMBER_VARYING:
				return validateIfcStructuralCurveMemberVarying((IfcStructuralCurveMemberVarying)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_CURVE_TYPE_ENUM_TYPE:
				return validateIfcStructuralCurveTypeEnumType((IfcStructuralCurveTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_ITEM:
				return validateIfcStructuralItem((IfcStructuralItem)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LINEAR_ACTION:
				return validateIfcStructuralLinearAction((IfcStructuralLinearAction)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LINEAR_ACTION_VARYING:
				return validateIfcStructuralLinearActionVarying((IfcStructuralLinearActionVarying)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD:
				return validateIfcStructuralLoad((IfcStructuralLoad)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP:
				return validateIfcStructuralLoadGroup((IfcStructuralLoadGroup)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE:
				return validateIfcStructuralLoadLinearForce((IfcStructuralLoadLinearForce)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE:
				return validateIfcStructuralLoadPlanarForce((IfcStructuralLoadPlanarForce)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT:
				return validateIfcStructuralLoadSingleDisplacement((IfcStructuralLoadSingleDisplacement)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION:
				return validateIfcStructuralLoadSingleDisplacementDistortion((IfcStructuralLoadSingleDisplacementDistortion)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE:
				return validateIfcStructuralLoadSingleForce((IfcStructuralLoadSingleForce)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING:
				return validateIfcStructuralLoadSingleForceWarping((IfcStructuralLoadSingleForceWarping)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD_STATIC:
				return validateIfcStructuralLoadStatic((IfcStructuralLoadStatic)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE:
				return validateIfcStructuralLoadTemperature((IfcStructuralLoadTemperature)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_MEMBER:
				return validateIfcStructuralMember((IfcStructuralMember)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION:
				return validateIfcStructuralPlanarAction((IfcStructuralPlanarAction)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING:
				return validateIfcStructuralPlanarActionVarying((IfcStructuralPlanarActionVarying)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_POINT_ACTION:
				return validateIfcStructuralPointAction((IfcStructuralPointAction)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_POINT_CONNECTION:
				return validateIfcStructuralPointConnection((IfcStructuralPointConnection)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_POINT_REACTION:
				return validateIfcStructuralPointReaction((IfcStructuralPointReaction)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES:
				return validateIfcStructuralProfileProperties((IfcStructuralProfileProperties)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_REACTION:
				return validateIfcStructuralReaction((IfcStructuralReaction)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP:
				return validateIfcStructuralResultGroup((IfcStructuralResultGroup)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES:
				return validateIfcStructuralSteelProfileProperties((IfcStructuralSteelProfileProperties)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_CONNECTION:
				return validateIfcStructuralSurfaceConnection((IfcStructuralSurfaceConnection)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER:
				return validateIfcStructuralSurfaceMember((IfcStructuralSurfaceMember)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING:
				return validateIfcStructuralSurfaceMemberVarying((IfcStructuralSurfaceMemberVarying)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_TYPE_ENUM_TYPE:
				return validateIfcStructuralSurfaceTypeEnumType((IfcStructuralSurfaceTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURED_DIMENSION_CALLOUT:
				return validateIfcStructuredDimensionCallout((IfcStructuredDimensionCallout)value, diagnostics, context);
			case FinalPackage.IFC_STYLED_ITEM:
				return validateIfcStyledItem((IfcStyledItem)value, diagnostics, context);
			case FinalPackage.IFC_STYLED_REPRESENTATION:
				return validateIfcStyledRepresentation((IfcStyledRepresentation)value, diagnostics, context);
			case FinalPackage.IFC_STYLE_MODEL:
				return validateIfcStyleModel((IfcStyleModel)value, diagnostics, context);
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE:
				return validateIfcSubContractResource((IfcSubContractResource)value, diagnostics, context);
			case FinalPackage.IFC_SUBEDGE:
				return validateIfcSubedge((IfcSubedge)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE:
				return validateIfcSurface((IfcSurface)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID:
				return validateIfcSurfaceCurveSweptAreaSolid((IfcSurfaceCurveSweptAreaSolid)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_OF_LINEAR_EXTRUSION:
				return validateIfcSurfaceOfLinearExtrusion((IfcSurfaceOfLinearExtrusion)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_OF_REVOLUTION:
				return validateIfcSurfaceOfRevolution((IfcSurfaceOfRevolution)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_OR_FACE_SURFACE:
				return validateIfcSurfaceOrFaceSurface((IfcSurfaceOrFaceSurface)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_SIDE_TYPE:
				return validateIfcSurfaceSideType((IfcSurfaceSideType)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_STYLE:
				return validateIfcSurfaceStyle((IfcSurfaceStyle)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT:
				return validateIfcSurfaceStyleElementSelect((IfcSurfaceStyleElementSelect)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING:
				return validateIfcSurfaceStyleLighting((IfcSurfaceStyleLighting)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION:
				return validateIfcSurfaceStyleRefraction((IfcSurfaceStyleRefraction)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING:
				return validateIfcSurfaceStyleRendering((IfcSurfaceStyleRendering)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_STYLE_SHADING:
				return validateIfcSurfaceStyleShading((IfcSurfaceStyleShading)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES:
				return validateIfcSurfaceStyleWithTextures((IfcSurfaceStyleWithTextures)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_TEXTURE:
				return validateIfcSurfaceTexture((IfcSurfaceTexture)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_TEXTURE_ENUM_TYPE:
				return validateIfcSurfaceTextureEnumType((IfcSurfaceTextureEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SWEPT_AREA_SOLID:
				return validateIfcSweptAreaSolid((IfcSweptAreaSolid)value, diagnostics, context);
			case FinalPackage.IFC_SWEPT_DISK_SOLID:
				return validateIfcSweptDiskSolid((IfcSweptDiskSolid)value, diagnostics, context);
			case FinalPackage.IFC_SWEPT_SURFACE:
				return validateIfcSweptSurface((IfcSweptSurface)value, diagnostics, context);
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE:
				return validateIfcSwitchingDeviceType((IfcSwitchingDeviceType)value, diagnostics, context);
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE_ENUM_TYPE:
				return validateIfcSwitchingDeviceTypeEnumType((IfcSwitchingDeviceTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_SYMBOL_STYLE:
				return validateIfcSymbolStyle((IfcSymbolStyle)value, diagnostics, context);
			case FinalPackage.IFC_SYMBOL_STYLE_SELECT:
				return validateIfcSymbolStyleSelect((IfcSymbolStyleSelect)value, diagnostics, context);
			case FinalPackage.IFC_SYSTEM:
				return validateIfcSystem((IfcSystem)value, diagnostics, context);
			case FinalPackage.IFC_SYSTEM_FURNITURE_ELEMENT_TYPE:
				return validateIfcSystemFurnitureElementType((IfcSystemFurnitureElementType)value, diagnostics, context);
			case FinalPackage.IFC_TABLE:
				return validateIfcTable((IfcTable)value, diagnostics, context);
			case FinalPackage.IFC_TABLE_ROW:
				return validateIfcTableRow((IfcTableRow)value, diagnostics, context);
			case FinalPackage.IFC_TANK_TYPE:
				return validateIfcTankType((IfcTankType)value, diagnostics, context);
			case FinalPackage.IFC_TANK_TYPE_ENUM_TYPE:
				return validateIfcTankTypeEnumType((IfcTankTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_TASK:
				return validateIfcTask((IfcTask)value, diagnostics, context);
			case FinalPackage.IFC_TELECOM_ADDRESS:
				return validateIfcTelecomAddress((IfcTelecomAddress)value, diagnostics, context);
			case FinalPackage.IFC_TEMPERATURE_GRADIENT_MEASURE_TYPE:
				return validateIfcTemperatureGradientMeasureType((IfcTemperatureGradientMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_TENDON:
				return validateIfcTendon((IfcTendon)value, diagnostics, context);
			case FinalPackage.IFC_TENDON_ANCHOR:
				return validateIfcTendonAnchor((IfcTendonAnchor)value, diagnostics, context);
			case FinalPackage.IFC_TENDON_TYPE_ENUM_TYPE:
				return validateIfcTendonTypeEnumType((IfcTendonTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_TERMINATOR_SYMBOL:
				return validateIfcTerminatorSymbol((IfcTerminatorSymbol)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_ALIGNMENT_TYPE:
				return validateIfcTextAlignmentType((IfcTextAlignmentType)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_DECORATION_TYPE:
				return validateIfcTextDecorationType((IfcTextDecorationType)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_FONT_NAME_TYPE:
				return validateIfcTextFontNameType((IfcTextFontNameType)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_FONT_SELECT:
				return validateIfcTextFontSelect((IfcTextFontSelect)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_LITERAL:
				return validateIfcTextLiteral((IfcTextLiteral)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_LITERAL_WITH_EXTENT:
				return validateIfcTextLiteralWithExtent((IfcTextLiteralWithExtent)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_PATH_TYPE:
				return validateIfcTextPathType((IfcTextPathType)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_STYLE:
				return validateIfcTextStyle((IfcTextStyle)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL:
				return validateIfcTextStyleFontModel((IfcTextStyleFontModel)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT:
				return validateIfcTextStyleForDefinedFont((IfcTextStyleForDefinedFont)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_STYLE_SELECT:
				return validateIfcTextStyleSelect((IfcTextStyleSelect)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL:
				return validateIfcTextStyleTextModel((IfcTextStyleTextModel)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS:
				return validateIfcTextStyleWithBoxCharacteristics((IfcTextStyleWithBoxCharacteristics)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_TRANSFORMATION_TYPE:
				return validateIfcTextTransformationType((IfcTextTransformationType)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_TYPE:
				return validateIfcTextType((IfcTextType)value, diagnostics, context);
			case FinalPackage.IFC_TEXTURE_COORDINATE:
				return validateIfcTextureCoordinate((IfcTextureCoordinate)value, diagnostics, context);
			case FinalPackage.IFC_TEXTURE_COORDINATE_GENERATOR:
				return validateIfcTextureCoordinateGenerator((IfcTextureCoordinateGenerator)value, diagnostics, context);
			case FinalPackage.IFC_TEXTURE_MAP:
				return validateIfcTextureMap((IfcTextureMap)value, diagnostics, context);
			case FinalPackage.IFC_TEXTURE_VERTEX:
				return validateIfcTextureVertex((IfcTextureVertex)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_ADMITTANCE_MEASURE_TYPE:
				return validateIfcThermalAdmittanceMeasureType((IfcThermalAdmittanceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_CONDUCTIVITY_MEASURE_TYPE:
				return validateIfcThermalConductivityMeasureType((IfcThermalConductivityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE_TYPE:
				return validateIfcThermalExpansionCoefficientMeasureType((IfcThermalExpansionCoefficientMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_LOAD_SOURCE_ENUM_TYPE:
				return validateIfcThermalLoadSourceEnumType((IfcThermalLoadSourceEnumType)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_LOAD_TYPE_ENUM_TYPE:
				return validateIfcThermalLoadTypeEnumType((IfcThermalLoadTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES:
				return validateIfcThermalMaterialProperties((IfcThermalMaterialProperties)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_RESISTANCE_MEASURE_TYPE:
				return validateIfcThermalResistanceMeasureType((IfcThermalResistanceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_TRANSMITTANCE_MEASURE_TYPE:
				return validateIfcThermalTransmittanceMeasureType((IfcThermalTransmittanceMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_THERMODYNAMIC_TEMPERATURE_MEASURE_TYPE:
				return validateIfcThermodynamicTemperatureMeasureType((IfcThermodynamicTemperatureMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_TIME_MEASURE_TYPE:
				return validateIfcTimeMeasureType((IfcTimeMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES:
				return validateIfcTimeSeries((IfcTimeSeries)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES_DATA_TYPE_ENUM_TYPE:
				return validateIfcTimeSeriesDataTypeEnumType((IfcTimeSeriesDataTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP:
				return validateIfcTimeSeriesReferenceRelationship((IfcTimeSeriesReferenceRelationship)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE:
				return validateIfcTimeSeriesSchedule((IfcTimeSeriesSchedule)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE_TYPE_ENUM_TYPE:
				return validateIfcTimeSeriesScheduleTypeEnumType((IfcTimeSeriesScheduleTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES_VALUE:
				return validateIfcTimeSeriesValue((IfcTimeSeriesValue)value, diagnostics, context);
			case FinalPackage.IFC_TIME_STAMP_TYPE:
				return validateIfcTimeStampType((IfcTimeStampType)value, diagnostics, context);
			case FinalPackage.IFC_TOPOLOGICAL_REPRESENTATION_ITEM:
				return validateIfcTopologicalRepresentationItem((IfcTopologicalRepresentationItem)value, diagnostics, context);
			case FinalPackage.IFC_TOPOLOGY_REPRESENTATION:
				return validateIfcTopologyRepresentation((IfcTopologyRepresentation)value, diagnostics, context);
			case FinalPackage.IFC_TORQUE_MEASURE_TYPE:
				return validateIfcTorqueMeasureType((IfcTorqueMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_TRANSFORMER_TYPE:
				return validateIfcTransformerType((IfcTransformerType)value, diagnostics, context);
			case FinalPackage.IFC_TRANSFORMER_TYPE_ENUM_TYPE:
				return validateIfcTransformerTypeEnumType((IfcTransformerTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_TRANSITION_CODE_TYPE:
				return validateIfcTransitionCodeType((IfcTransitionCodeType)value, diagnostics, context);
			case FinalPackage.IFC_TRANSPORT_ELEMENT:
				return validateIfcTransportElement((IfcTransportElement)value, diagnostics, context);
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE:
				return validateIfcTransportElementType((IfcTransportElementType)value, diagnostics, context);
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE_ENUM_TYPE:
				return validateIfcTransportElementTypeEnumType((IfcTransportElementTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF:
				return validateIfcTrapeziumProfileDef((IfcTrapeziumProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_TRIMMED_CURVE:
				return validateIfcTrimmedCurve((IfcTrimmedCurve)value, diagnostics, context);
			case FinalPackage.IFC_TRIMMING_PREFERENCE_TYPE:
				return validateIfcTrimmingPreferenceType((IfcTrimmingPreferenceType)value, diagnostics, context);
			case FinalPackage.IFC_TRIMMING_SELECT:
				return validateIfcTrimmingSelect((IfcTrimmingSelect)value, diagnostics, context);
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF:
				return validateIfcTShapeProfileDef((IfcTShapeProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE:
				return validateIfcTubeBundleType((IfcTubeBundleType)value, diagnostics, context);
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE_ENUM_TYPE:
				return validateIfcTubeBundleTypeEnumType((IfcTubeBundleTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR:
				return validateIfcTwoDirectionRepeatFactor((IfcTwoDirectionRepeatFactor)value, diagnostics, context);
			case FinalPackage.IFC_TYPE_OBJECT:
				return validateIfcTypeObject((IfcTypeObject)value, diagnostics, context);
			case FinalPackage.IFC_TYPE_PRODUCT:
				return validateIfcTypeProduct((IfcTypeProduct)value, diagnostics, context);
			case FinalPackage.IFC_UNIT:
				return validateIfcUnit((IfcUnit)value, diagnostics, context);
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE:
				return validateIfcUnitaryEquipmentType((IfcUnitaryEquipmentType)value, diagnostics, context);
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE_ENUM_TYPE:
				return validateIfcUnitaryEquipmentTypeEnumType((IfcUnitaryEquipmentTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_UNIT_ASSIGNMENT:
				return validateIfcUnitAssignment((IfcUnitAssignment)value, diagnostics, context);
			case FinalPackage.IFC_UNIT_ENUM_TYPE:
				return validateIfcUnitEnumType((IfcUnitEnumType)value, diagnostics, context);
			case FinalPackage.IFC_USHAPE_PROFILE_DEF:
				return validateIfcUShapeProfileDef((IfcUShapeProfileDef)value, diagnostics, context);
			case FinalPackage.IFC_VALUE:
				return validateIfcValue((IfcValue)value, diagnostics, context);
			case FinalPackage.IFC_VALVE_TYPE:
				return validateIfcValveType((IfcValveType)value, diagnostics, context);
			case FinalPackage.IFC_VALVE_TYPE_ENUM_TYPE:
				return validateIfcValveTypeEnumType((IfcValveTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_VAPOR_PERMEABILITY_MEASURE_TYPE:
				return validateIfcVaporPermeabilityMeasureType((IfcVaporPermeabilityMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_VECTOR:
				return validateIfcVector((IfcVector)value, diagnostics, context);
			case FinalPackage.IFC_VECTOR_OR_DIRECTION:
				return validateIfcVectorOrDirection((IfcVectorOrDirection)value, diagnostics, context);
			case FinalPackage.IFC_VERTEX:
				return validateIfcVertex((IfcVertex)value, diagnostics, context);
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP:
				return validateIfcVertexBasedTextureMap((IfcVertexBasedTextureMap)value, diagnostics, context);
			case FinalPackage.IFC_VERTEX_LOOP:
				return validateIfcVertexLoop((IfcVertexLoop)value, diagnostics, context);
			case FinalPackage.IFC_VERTEX_POINT:
				return validateIfcVertexPoint((IfcVertexPoint)value, diagnostics, context);
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE:
				return validateIfcVibrationIsolatorType((IfcVibrationIsolatorType)value, diagnostics, context);
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE_ENUM_TYPE:
				return validateIfcVibrationIsolatorTypeEnumType((IfcVibrationIsolatorTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_VIRTUAL_ELEMENT:
				return validateIfcVirtualElement((IfcVirtualElement)value, diagnostics, context);
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION:
				return validateIfcVirtualGridIntersection((IfcVirtualGridIntersection)value, diagnostics, context);
			case FinalPackage.IFC_VOLUME_MEASURE_TYPE:
				return validateIfcVolumeMeasureType((IfcVolumeMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_VOLUMETRIC_FLOW_RATE_MEASURE_TYPE:
				return validateIfcVolumetricFlowRateMeasureType((IfcVolumetricFlowRateMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_WALL:
				return validateIfcWall((IfcWall)value, diagnostics, context);
			case FinalPackage.IFC_WALL_STANDARD_CASE:
				return validateIfcWallStandardCase((IfcWallStandardCase)value, diagnostics, context);
			case FinalPackage.IFC_WALL_TYPE:
				return validateIfcWallType((IfcWallType)value, diagnostics, context);
			case FinalPackage.IFC_WALL_TYPE_ENUM_TYPE:
				return validateIfcWallTypeEnumType((IfcWallTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_WARPING_CONSTANT_MEASURE_TYPE:
				return validateIfcWarpingConstantMeasureType((IfcWarpingConstantMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_WARPING_MOMENT_MEASURE_TYPE:
				return validateIfcWarpingMomentMeasureType((IfcWarpingMomentMeasureType)value, diagnostics, context);
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE:
				return validateIfcWasteTerminalType((IfcWasteTerminalType)value, diagnostics, context);
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE_ENUM_TYPE:
				return validateIfcWasteTerminalTypeEnumType((IfcWasteTerminalTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_WATER_PROPERTIES:
				return validateIfcWaterProperties((IfcWaterProperties)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW:
				return validateIfcWindow((IfcWindow)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES:
				return validateIfcWindowLiningProperties((IfcWindowLiningProperties)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_PANEL_OPERATION_ENUM_TYPE:
				return validateIfcWindowPanelOperationEnumType((IfcWindowPanelOperationEnumType)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_PANEL_POSITION_ENUM_TYPE:
				return validateIfcWindowPanelPositionEnumType((IfcWindowPanelPositionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_PANEL_PROPERTIES:
				return validateIfcWindowPanelProperties((IfcWindowPanelProperties)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_STYLE:
				return validateIfcWindowStyle((IfcWindowStyle)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_STYLE_CONSTRUCTION_ENUM_TYPE:
				return validateIfcWindowStyleConstructionEnumType((IfcWindowStyleConstructionEnumType)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_STYLE_OPERATION_ENUM_TYPE:
				return validateIfcWindowStyleOperationEnumType((IfcWindowStyleOperationEnumType)value, diagnostics, context);
			case FinalPackage.IFC_WORK_CONTROL:
				return validateIfcWorkControl((IfcWorkControl)value, diagnostics, context);
			case FinalPackage.IFC_WORK_CONTROL_TYPE_ENUM_TYPE:
				return validateIfcWorkControlTypeEnumType((IfcWorkControlTypeEnumType)value, diagnostics, context);
			case FinalPackage.IFC_WORK_PLAN:
				return validateIfcWorkPlan((IfcWorkPlan)value, diagnostics, context);
			case FinalPackage.IFC_WORK_SCHEDULE:
				return validateIfcWorkSchedule((IfcWorkSchedule)value, diagnostics, context);
			case FinalPackage.IFC_YEAR_NUMBER_TYPE:
				return validateIfcYearNumberType((IfcYearNumberType)value, diagnostics, context);
			case FinalPackage.IFC_ZONE:
				return validateIfcZone((IfcZone)value, diagnostics, context);
			case FinalPackage.IFC_ZSHAPE_PROFILE_DEF:
				return validateIfcZShapeProfileDef((IfcZShapeProfileDef)value, diagnostics, context);
			case FinalPackage.INCORPORATION_DATE_TYPE:
				return validateIncorporationDateType((IncorporationDateType)value, diagnostics, context);
			case FinalPackage.INNER_BOUNDARIES_TYPE:
				return validateInnerBoundariesType((InnerBoundariesType)value, diagnostics, context);
			case FinalPackage.INNER_BOUNDARIES_TYPE1:
				return validateInnerBoundariesType1((InnerBoundariesType1)value, diagnostics, context);
			case FinalPackage.INNER_CURVES_TYPE:
				return validateInnerCurvesType((InnerCurvesType)value, diagnostics, context);
			case FinalPackage.INTERSECTING_AXES_TYPE:
				return validateIntersectingAxesType((IntersectingAxesType)value, diagnostics, context);
			case FinalPackage.ITEM_OF_TYPE:
				return validateItemOfType((ItemOfType)value, diagnostics, context);
			case FinalPackage.ITEMS_TYPE:
				return validateItemsType((ItemsType)value, diagnostics, context);
			case FinalPackage.ITEM_TYPE:
				return validateItemType((ItemType)value, diagnostics, context);
			case FinalPackage.ITEM_TYPE1:
				return validateItemType1((ItemType1)value, diagnostics, context);
			case FinalPackage.JURISDICTION_TYPE:
				return validateJurisdictionType((JurisdictionType)value, diagnostics, context);
			case FinalPackage.LAST_MODIFYING_APPLICATION_TYPE:
				return validateLastModifyingApplicationType((LastModifyingApplicationType)value, diagnostics, context);
			case FinalPackage.LAST_MODIFYING_USER_TYPE:
				return validateLastModifyingUserType((LastModifyingUserType)value, diagnostics, context);
			case FinalPackage.LAST_REVISION_TIME_TYPE:
				return validateLastRevisionTimeType((LastRevisionTimeType)value, diagnostics, context);
			case FinalPackage.LAST_UPDATE_DATE_TYPE:
				return validateLastUpdateDateType((LastUpdateDateType)value, diagnostics, context);
			case FinalPackage.LATE_FINISH_TYPE:
				return validateLateFinishType((LateFinishType)value, diagnostics, context);
			case FinalPackage.LATE_START_TYPE:
				return validateLateStartType((LateStartType)value, diagnostics, context);
			case FinalPackage.LAYER_STYLES_TYPE:
				return validateLayerStylesType((LayerStylesType)value, diagnostics, context);
			case FinalPackage.LETTER_SPACING_TYPE:
				return validateLetterSpacingType((LetterSpacingType)value, diagnostics, context);
			case FinalPackage.LIBRARY_REFERENCE_TYPE:
				return validateLibraryReferenceType((LibraryReferenceType)value, diagnostics, context);
			case FinalPackage.LIGHT_COLOUR_TYPE:
				return validateLightColourType((LightColourType)value, diagnostics, context);
			case FinalPackage.LIGHT_DISTRIBUTION_DATA_SOURCE_TYPE:
				return validateLightDistributionDataSourceType((LightDistributionDataSourceType)value, diagnostics, context);
			case FinalPackage.LINE_HEIGHT_TYPE:
				return validateLineHeightType((LineHeightType)value, diagnostics, context);
			case FinalPackage.LIST_VALUES_TYPE:
				return validateListValuesType((ListValuesType)value, diagnostics, context);
			case FinalPackage.LIST_VALUES_TYPE1:
				return validateListValuesType1((ListValuesType1)value, diagnostics, context);
			case FinalPackage.LIST_VALUES_TYPE2:
				return validateListValuesType2((ListValuesType2)value, diagnostics, context);
			case FinalPackage.LOADED_BY_TYPE:
				return validateLoadedByType((LoadedByType)value, diagnostics, context);
			case FinalPackage.LOCAL_ORIGIN_TYPE:
				return validateLocalOriginType((LocalOriginType)value, diagnostics, context);
			case FinalPackage.LOCATION_AT_RELATED_ELEMENT_TYPE:
				return validateLocationAtRelatedElementType((LocationAtRelatedElementType)value, diagnostics, context);
			case FinalPackage.LOCATION_AT_RELATING_ELEMENT_TYPE:
				return validateLocationAtRelatingElementType((LocationAtRelatingElementType)value, diagnostics, context);
			case FinalPackage.LOCATION_OF_INTERACTION_TYPE:
				return validateLocationOfInteractionType((LocationOfInteractionType)value, diagnostics, context);
			case FinalPackage.LOCATION_TYPE:
				return validateLocationType((LocationType)value, diagnostics, context);
			case FinalPackage.LOOP_VERTEX_TYPE:
				return validateLoopVertexType((LoopVertexType)value, diagnostics, context);
			case FinalPackage.LOWER_BOUND_VALUE_TYPE:
				return validateLowerBoundValueType((LowerBoundValueType)value, diagnostics, context);
			case FinalPackage.LOWER_VALUE_TYPE:
				return validateLowerValueType((LowerValueType)value, diagnostics, context);
			case FinalPackage.LUMINOUS_INTENSITY_TYPE:
				return validateLuminousIntensityType((LuminousIntensityType)value, diagnostics, context);
			case FinalPackage.MAPPED_REPRESENTATION_TYPE:
				return validateMappedRepresentationType((MappedRepresentationType)value, diagnostics, context);
			case FinalPackage.MAPPING_ORIGIN_TYPE:
				return validateMappingOriginType((MappingOriginType)value, diagnostics, context);
			case FinalPackage.MAPPING_SOURCE_TYPE:
				return validateMappingSourceType((MappingSourceType)value, diagnostics, context);
			case FinalPackage.MAPPING_TARGET_TYPE:
				return validateMappingTargetType((MappingTargetType)value, diagnostics, context);
			case FinalPackage.MATERIAL_CLASSIFICATIONS_TYPE:
				return validateMaterialClassificationsType((MaterialClassificationsType)value, diagnostics, context);
			case FinalPackage.MATERIAL_LAYERS_TYPE:
				return validateMaterialLayersType((MaterialLayersType)value, diagnostics, context);
			case FinalPackage.MATERIALS_TYPE:
				return validateMaterialsType((MaterialsType)value, diagnostics, context);
			case FinalPackage.MATERIAL_TYPE:
				return validateMaterialType((MaterialType)value, diagnostics, context);
			case FinalPackage.MATERIAL_TYPE1:
				return validateMaterialType1((MaterialType1)value, diagnostics, context);
			case FinalPackage.MIDDLE_NAMES_TYPE:
				return validateMiddleNamesType((MiddleNamesType)value, diagnostics, context);
			case FinalPackage.MOST_USED_VALUE_TYPE:
				return validateMostUsedValueType((MostUsedValueType)value, diagnostics, context);
			case FinalPackage.MOVE_FROM_TYPE:
				return validateMoveFromType((MoveFromType)value, diagnostics, context);
			case FinalPackage.MOVE_TO_TYPE:
				return validateMoveToType((MoveToType)value, diagnostics, context);
			case FinalPackage.NOMINAL_VALUE_TYPE:
				return validateNominalValueType((NominalValueType)value, diagnostics, context);
			case FinalPackage.NOTATION_FACETS_TYPE:
				return validateNotationFacetsType((NotationFacetsType)value, diagnostics, context);
			case FinalPackage.NOTATION_TYPE:
				return validateNotationType((NotationType)value, diagnostics, context);
			case FinalPackage.OBJECT_PLACEMENT_TYPE:
				return validateObjectPlacementType((ObjectPlacementType)value, diagnostics, context);
			case FinalPackage.OFFSET_DISTANCES_TYPE:
				return validateOffsetDistancesType((OffsetDistancesType)value, diagnostics, context);
			case FinalPackage.OPERATOR_TYPE:
				return validateOperatorType((OperatorType)value, diagnostics, context);
			case FinalPackage.ORIENTATION_OF2_DPLANE_TYPE:
				return validateOrientationOf2DPlaneType((OrientationOf2DPlaneType)value, diagnostics, context);
			case FinalPackage.ORIENTATION_TYPE:
				return validateOrientationType((OrientationType)value, diagnostics, context);
			case FinalPackage.ORIENTATION_TYPE1:
				return validateOrientationType1((OrientationType1)value, diagnostics, context);
			case FinalPackage.ORIENTATION_TYPE2:
				return validateOrientationType2((OrientationType2)value, diagnostics, context);
			case FinalPackage.ORIGINAL_VALUE_TYPE:
				return validateOriginalValueType((OriginalValueType)value, diagnostics, context);
			case FinalPackage.ORIGINAL_VALUE_TYPE1:
				return validateOriginalValueType1((OriginalValueType1)value, diagnostics, context);
			case FinalPackage.OUTER_BOUNDARY_TYPE:
				return validateOuterBoundaryType((OuterBoundaryType)value, diagnostics, context);
			case FinalPackage.OUTER_BOUNDARY_TYPE1:
				return validateOuterBoundaryType1((OuterBoundaryType1)value, diagnostics, context);
			case FinalPackage.OUTER_CURVE_TYPE:
				return validateOuterCurveType((OuterCurveType)value, diagnostics, context);
			case FinalPackage.OUTER_TYPE:
				return validateOuterType((OuterType)value, diagnostics, context);
			case FinalPackage.OVERRIDING_PROPERTIES_TYPE:
				return validateOverridingPropertiesType((OverridingPropertiesType)value, diagnostics, context);
			case FinalPackage.OWNER_HISTORY_TYPE:
				return validateOwnerHistoryType((OwnerHistoryType)value, diagnostics, context);
			case FinalPackage.OWNER_TYPE:
				return validateOwnerType((OwnerType)value, diagnostics, context);
			case FinalPackage.OWNING_APPLICATION_TYPE:
				return validateOwningApplicationType((OwningApplicationType)value, diagnostics, context);
			case FinalPackage.OWNING_USER_TYPE:
				return validateOwningUserType((OwningUserType)value, diagnostics, context);
			case FinalPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case FinalPackage.PARENT_CONTEXT_TYPE:
				return validateParentContextType((ParentContextType)value, diagnostics, context);
			case FinalPackage.PARENT_CURVE_TYPE:
				return validateParentCurveType((ParentCurveType)value, diagnostics, context);
			case FinalPackage.PARENT_EDGE_TYPE:
				return validateParentEdgeType((ParentEdgeType)value, diagnostics, context);
			case FinalPackage.PARENT_PROFILE_TYPE:
				return validateParentProfileType((ParentProfileType)value, diagnostics, context);
			case FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE:
				return validatePartOfProductDefinitionShapeType((PartOfProductDefinitionShapeType)value, diagnostics, context);
			case FinalPackage.PATTERN_LIST_TYPE:
				return validatePatternListType((PatternListType)value, diagnostics, context);
			case FinalPackage.PATTERN_START_TYPE:
				return validatePatternStartType((PatternStartType)value, diagnostics, context);
			case FinalPackage.PIXEL_TYPE:
				return validatePixelType((PixelType)value, diagnostics, context);
			case FinalPackage.PLACEMENT_LOCATION_TYPE:
				return validatePlacementLocationType((PlacementLocationType)value, diagnostics, context);
			case FinalPackage.PLACEMENT_REF_DIRECTION_TYPE:
				return validatePlacementRefDirectionType((PlacementRefDirectionType)value, diagnostics, context);
			case FinalPackage.PLACEMENT_REL_TO_TYPE:
				return validatePlacementRelToType((PlacementRelToType)value, diagnostics, context);
			case FinalPackage.PLACEMENT_TYPE:
				return validatePlacementType((PlacementType)value, diagnostics, context);
			case FinalPackage.PLACEMENT_TYPE1:
				return validatePlacementType1((PlacementType1)value, diagnostics, context);
			case FinalPackage.PNT_TYPE:
				return validatePntType((PntType)value, diagnostics, context);
			case FinalPackage.POINT_OF_REFERENCE_HATCH_LINE_TYPE:
				return validatePointOfReferenceHatchLineType((PointOfReferenceHatchLineType)value, diagnostics, context);
			case FinalPackage.POINT_ON_RELATED_ELEMENT_TYPE:
				return validatePointOnRelatedElementType((PointOnRelatedElementType)value, diagnostics, context);
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE:
				return validatePointOnRelatingElementType((PointOnRelatingElementType)value, diagnostics, context);
			case FinalPackage.POINTS_TYPE:
				return validatePointsType((PointsType)value, diagnostics, context);
			case FinalPackage.POLYGONAL_BOUNDARY_TYPE:
				return validatePolygonalBoundaryType((PolygonalBoundaryType)value, diagnostics, context);
			case FinalPackage.POLYGON_TYPE:
				return validatePolygonType((PolygonType)value, diagnostics, context);
			case FinalPackage.POSITION_TYPE:
				return validatePositionType((PositionType)value, diagnostics, context);
			case FinalPackage.POSITION_TYPE1:
				return validatePositionType1((PositionType1)value, diagnostics, context);
			case FinalPackage.POSITION_TYPE2:
				return validatePositionType2((PositionType2)value, diagnostics, context);
			case FinalPackage.POSITION_TYPE3:
				return validatePositionType3((PositionType3)value, diagnostics, context);
			case FinalPackage.POSITION_TYPE4:
				return validatePositionType4((PositionType4)value, diagnostics, context);
			case FinalPackage.POSITION_TYPE5:
				return validatePositionType5((PositionType5)value, diagnostics, context);
			case FinalPackage.POSITION_TYPE6:
				return validatePositionType6((PositionType6)value, diagnostics, context);
			case FinalPackage.POSITION_TYPE7:
				return validatePositionType7((PositionType7)value, diagnostics, context);
			case FinalPackage.POSITION_TYPE8:
				return validatePositionType8((PositionType8)value, diagnostics, context);
			case FinalPackage.PREFIX_TITLES_TYPE:
				return validatePrefixTitlesType((PrefixTitlesType)value, diagnostics, context);
			case FinalPackage.PREPARED_BY_TYPE:
				return validatePreparedByType((PreparedByType)value, diagnostics, context);
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE:
				return validatePressureTimeSeriesType((PressureTimeSeriesType)value, diagnostics, context);
			case FinalPackage.PROFILE_DEFINITION_TYPE:
				return validateProfileDefinitionType((ProfileDefinitionType)value, diagnostics, context);
			case FinalPackage.PROFILE_OF_PORT_TYPE:
				return validateProfileOfPortType((ProfileOfPortType)value, diagnostics, context);
			case FinalPackage.PROFILE_ORIENTATION_TYPE:
				return validateProfileOrientationType((ProfileOrientationType)value, diagnostics, context);
			case FinalPackage.PROFILE_SECTION_LOCATION_TYPE:
				return validateProfileSectionLocationType((ProfileSectionLocationType)value, diagnostics, context);
			case FinalPackage.PROFILES_TYPE:
				return validateProfilesType((ProfilesType)value, diagnostics, context);
			case FinalPackage.PROPERTY_REFERENCE_TYPE:
				return validatePropertyReferenceType((PropertyReferenceType)value, diagnostics, context);
			case FinalPackage.PUBLISHER_TYPE:
				return validatePublisherType((PublisherType)value, diagnostics, context);
			case FinalPackage.PUNCH_LIST_TYPE:
				return validatePunchListType((PunchListType)value, diagnostics, context);
			case FinalPackage.QUANTITIES_TYPE:
				return validateQuantitiesType((QuantitiesType)value, diagnostics, context);
			case FinalPackage.QUANTITY_IN_PROCESS_TYPE:
				return validateQuantityInProcessType((QuantityInProcessType)value, diagnostics, context);
			case FinalPackage.RATE_DATE_TIME_TYPE:
				return validateRateDateTimeType((RateDateTimeType)value, diagnostics, context);
			case FinalPackage.RATE_SOURCE_TYPE:
				return validateRateSourceType((RateSourceType)value, diagnostics, context);
			case FinalPackage.REALIZING_ELEMENTS_TYPE:
				return validateRealizingElementsType((RealizingElementsType)value, diagnostics, context);
			case FinalPackage.REALIZING_ELEMENT_TYPE:
				return validateRealizingElementType((RealizingElementType)value, diagnostics, context);
			case FinalPackage.RECORDS_TYPE:
				return validateRecordsType((RecordsType)value, diagnostics, context);
			case FinalPackage.REF_DIRECTION_TYPE:
				return validateRefDirectionType((RefDirectionType)value, diagnostics, context);
			case FinalPackage.REF_DIRECTION_TYPE1:
				return validateRefDirectionType1((RefDirectionType1)value, diagnostics, context);
			case FinalPackage.REF_DIRECTION_TYPE2:
				return validateRefDirectionType2((RefDirectionType2)value, diagnostics, context);
			case FinalPackage.REFERENCED_DOCUMENT_TYPE:
				return validateReferencedDocumentType((ReferencedDocumentType)value, diagnostics, context);
			case FinalPackage.REFERENCED_SOURCE_TYPE:
				return validateReferencedSourceType((ReferencedSourceType)value, diagnostics, context);
			case FinalPackage.REFERENCED_TIME_SERIES_TYPE:
				return validateReferencedTimeSeriesType((ReferencedTimeSeriesType)value, diagnostics, context);
			case FinalPackage.REFERENCE_SURFACE_TYPE:
				return validateReferenceSurfaceType((ReferenceSurfaceType)value, diagnostics, context);
			case FinalPackage.REFERENCING_VALUES_TYPE:
				return validateReferencingValuesType((ReferencingValuesType)value, diagnostics, context);
			case FinalPackage.REFLECTANCE_COLOUR_TYPE:
				return validateReflectanceColourType((ReflectanceColourType)value, diagnostics, context);
			case FinalPackage.REFLECTION_COLOUR_TYPE:
				return validateReflectionColourType((ReflectionColourType)value, diagnostics, context);
			case FinalPackage.REINFORCEMENT_SECTION_DEFINITIONS_TYPE:
				return validateReinforcementSectionDefinitionsType((ReinforcementSectionDefinitionsType)value, diagnostics, context);
			case FinalPackage.RELATED_APPROVAL_TYPE:
				return validateRelatedApprovalType((RelatedApprovalType)value, diagnostics, context);
			case FinalPackage.RELATED_BUILDING_ELEMENT_TYPE:
				return validateRelatedBuildingElementType((RelatedBuildingElementType)value, diagnostics, context);
			case FinalPackage.RELATED_BUILDING_ELEMENT_TYPE1:
				return validateRelatedBuildingElementType1((RelatedBuildingElementType1)value, diagnostics, context);
			case FinalPackage.RELATED_BUILDINGS_TYPE:
				return validateRelatedBuildingsType((RelatedBuildingsType)value, diagnostics, context);
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE:
				return validateRelatedClassificationsType((RelatedClassificationsType)value, diagnostics, context);
			case FinalPackage.RELATED_CONSTRAINTS_TYPE:
				return validateRelatedConstraintsType((RelatedConstraintsType)value, diagnostics, context);
			case FinalPackage.RELATED_CONSTRAINTS_TYPE1:
				return validateRelatedConstraintsType1((RelatedConstraintsType1)value, diagnostics, context);
			case FinalPackage.RELATED_CONTROL_ELEMENTS_TYPE:
				return validateRelatedControlElementsType((RelatedControlElementsType)value, diagnostics, context);
			case FinalPackage.RELATED_COVERINGS_TYPE:
				return validateRelatedCoveringsType((RelatedCoveringsType)value, diagnostics, context);
			case FinalPackage.RELATED_COVERINGS_TYPE1:
				return validateRelatedCoveringsType1((RelatedCoveringsType1)value, diagnostics, context);
			case FinalPackage.RELATED_DOCUMENTS_TYPE:
				return validateRelatedDocumentsType((RelatedDocumentsType)value, diagnostics, context);
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE:
				return validateRelatedDraughtingCalloutType((RelatedDraughtingCalloutType)value, diagnostics, context);
			case FinalPackage.RELATED_ELEMENTS_TYPE:
				return validateRelatedElementsType((RelatedElementsType)value, diagnostics, context);
			case FinalPackage.RELATED_ELEMENTS_TYPE1:
				return validateRelatedElementsType1((RelatedElementsType1)value, diagnostics, context);
			case FinalPackage.RELATED_ELEMENT_TYPE:
				return validateRelatedElementType((RelatedElementType)value, diagnostics, context);
			case FinalPackage.RELATED_ELEMENT_TYPE1:
				return validateRelatedElementType1((RelatedElementType1)value, diagnostics, context);
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE:
				return validateRelatedFeatureElementType((RelatedFeatureElementType)value, diagnostics, context);
			case FinalPackage.RELATED_ITEMS_TYPE:
				return validateRelatedItemsType((RelatedItemsType)value, diagnostics, context);
			case FinalPackage.RELATED_MONETARY_UNIT_TYPE:
				return validateRelatedMonetaryUnitType((RelatedMonetaryUnitType)value, diagnostics, context);
			case FinalPackage.RELATED_OBJECTS_TYPE:
				return validateRelatedObjectsType((RelatedObjectsType)value, diagnostics, context);
			case FinalPackage.RELATED_OBJECTS_TYPE1:
				return validateRelatedObjectsType1((RelatedObjectsType1)value, diagnostics, context);
			case FinalPackage.RELATED_OBJECTS_TYPE2:
				return validateRelatedObjectsType2((RelatedObjectsType2)value, diagnostics, context);
			case FinalPackage.RELATED_OBJECTS_TYPE3:
				return validateRelatedObjectsType3((RelatedObjectsType3)value, diagnostics, context);
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE:
				return validateRelatedOpeningElementType((RelatedOpeningElementType)value, diagnostics, context);
			case FinalPackage.RELATED_ORGANIZATIONS_TYPE:
				return validateRelatedOrganizationsType((RelatedOrganizationsType)value, diagnostics, context);
			case FinalPackage.RELATED_PORT_TYPE:
				return validateRelatedPortType((RelatedPortType)value, diagnostics, context);
			case FinalPackage.RELATED_PRIORITIES_TYPE:
				return validateRelatedPrioritiesType((RelatedPrioritiesType)value, diagnostics, context);
			case FinalPackage.RELATED_PROCESS_TYPE:
				return validateRelatedProcessType((RelatedProcessType)value, diagnostics, context);
			case FinalPackage.RELATED_PROPERTIES_TYPE:
				return validateRelatedPropertiesType((RelatedPropertiesType)value, diagnostics, context);
			case FinalPackage.RELATED_SPACE_PROGRAM_TYPE:
				return validateRelatedSpaceProgramType((RelatedSpaceProgramType)value, diagnostics, context);
			case FinalPackage.RELATED_SPACE_TYPE:
				return validateRelatedSpaceType((RelatedSpaceType)value, diagnostics, context);
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE:
				return validateRelatedStructuralActivityType((RelatedStructuralActivityType)value, diagnostics, context);
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE:
				return validateRelatedStructuralConnectionType((RelatedStructuralConnectionType)value, diagnostics, context);
			case FinalPackage.RELATED_STRUCTURAL_MEMBER_TYPE:
				return validateRelatedStructuralMemberType((RelatedStructuralMemberType)value, diagnostics, context);
			case FinalPackage.RELATING_ACTOR_TYPE:
				return validateRelatingActorType((RelatingActorType)value, diagnostics, context);
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE:
				return validateRelatingAppliedValueType((RelatingAppliedValueType)value, diagnostics, context);
			case FinalPackage.RELATING_APPROVAL_TYPE:
				return validateRelatingApprovalType((RelatingApprovalType)value, diagnostics, context);
			case FinalPackage.RELATING_APPROVAL_TYPE1:
				return validateRelatingApprovalType1((RelatingApprovalType1)value, diagnostics, context);
			case FinalPackage.RELATING_BUILDING_ELEMENT_TYPE:
				return validateRelatingBuildingElementType((RelatingBuildingElementType)value, diagnostics, context);
			case FinalPackage.RELATING_BUILDING_ELEMENT_TYPE1:
				return validateRelatingBuildingElementType1((RelatingBuildingElementType1)value, diagnostics, context);
			case FinalPackage.RELATING_CLASSIFICATION_TYPE:
				return validateRelatingClassificationType((RelatingClassificationType)value, diagnostics, context);
			case FinalPackage.RELATING_CONSTRAINT_TYPE:
				return validateRelatingConstraintType((RelatingConstraintType)value, diagnostics, context);
			case FinalPackage.RELATING_CONSTRAINT_TYPE1:
				return validateRelatingConstraintType1((RelatingConstraintType1)value, diagnostics, context);
			case FinalPackage.RELATING_CONSTRAINT_TYPE2:
				return validateRelatingConstraintType2((RelatingConstraintType2)value, diagnostics, context);
			case FinalPackage.RELATING_CONSTRAINT_TYPE3:
				return validateRelatingConstraintType3((RelatingConstraintType3)value, diagnostics, context);
			case FinalPackage.RELATING_CONTROL_TYPE:
				return validateRelatingControlType((RelatingControlType)value, diagnostics, context);
			case FinalPackage.RELATING_DOCUMENT_TYPE:
				return validateRelatingDocumentType((RelatingDocumentType)value, diagnostics, context);
			case FinalPackage.RELATING_DOCUMENT_TYPE1:
				return validateRelatingDocumentType1((RelatingDocumentType1)value, diagnostics, context);
			case FinalPackage.RELATING_DRAUGHTING_CALLOUT_TYPE:
				return validateRelatingDraughtingCalloutType((RelatingDraughtingCalloutType)value, diagnostics, context);
			case FinalPackage.RELATING_ELEMENT_TYPE:
				return validateRelatingElementType((RelatingElementType)value, diagnostics, context);
			case FinalPackage.RELATING_ELEMENT_TYPE1:
				return validateRelatingElementType1((RelatingElementType1)value, diagnostics, context);
			case FinalPackage.RELATING_ELEMENT_TYPE2:
				return validateRelatingElementType2((RelatingElementType2)value, diagnostics, context);
			case FinalPackage.RELATING_ELEMENT_TYPE3:
				return validateRelatingElementType3((RelatingElementType3)value, diagnostics, context);
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE:
				return validateRelatingFlowElementType((RelatingFlowElementType)value, diagnostics, context);
			case FinalPackage.RELATING_GROUP_TYPE:
				return validateRelatingGroupType((RelatingGroupType)value, diagnostics, context);
			case FinalPackage.RELATING_ITEM_TYPE:
				return validateRelatingItemType((RelatingItemType)value, diagnostics, context);
			case FinalPackage.RELATING_LIBRARY_TYPE:
				return validateRelatingLibraryType((RelatingLibraryType)value, diagnostics, context);
			case FinalPackage.RELATING_MATERIAL_TYPE:
				return validateRelatingMaterialType((RelatingMaterialType)value, diagnostics, context);
			case FinalPackage.RELATING_MONETARY_UNIT_TYPE:
				return validateRelatingMonetaryUnitType((RelatingMonetaryUnitType)value, diagnostics, context);
			case FinalPackage.RELATING_OBJECT_TYPE:
				return validateRelatingObjectType((RelatingObjectType)value, diagnostics, context);
			case FinalPackage.RELATING_OPENING_ELEMENT_TYPE:
				return validateRelatingOpeningElementType((RelatingOpeningElementType)value, diagnostics, context);
			case FinalPackage.RELATING_ORGANIZATION_TYPE:
				return validateRelatingOrganizationType((RelatingOrganizationType)value, diagnostics, context);
			case FinalPackage.RELATING_PORT_TYPE:
				return validateRelatingPortType((RelatingPortType)value, diagnostics, context);
			case FinalPackage.RELATING_PORT_TYPE1:
				return validateRelatingPortType1((RelatingPortType1)value, diagnostics, context);
			case FinalPackage.RELATING_PRIORITIES_TYPE:
				return validateRelatingPrioritiesType((RelatingPrioritiesType)value, diagnostics, context);
			case FinalPackage.RELATING_PROCESS_TYPE:
				return validateRelatingProcessType((RelatingProcessType)value, diagnostics, context);
			case FinalPackage.RELATING_PROCESS_TYPE1:
				return validateRelatingProcessType1((RelatingProcessType1)value, diagnostics, context);
			case FinalPackage.RELATING_PRODUCT_TYPE:
				return validateRelatingProductType((RelatingProductType)value, diagnostics, context);
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE:
				return validateRelatingProfilePropertiesType((RelatingProfilePropertiesType)value, diagnostics, context);
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE:
				return validateRelatingPropertyDefinitionType((RelatingPropertyDefinitionType)value, diagnostics, context);
			case FinalPackage.RELATING_RESOURCE_TYPE:
				return validateRelatingResourceType((RelatingResourceType)value, diagnostics, context);
			case FinalPackage.RELATING_SPACE_PROGRAM_TYPE:
				return validateRelatingSpaceProgramType((RelatingSpaceProgramType)value, diagnostics, context);
			case FinalPackage.RELATING_SPACE_TYPE:
				return validateRelatingSpaceType((RelatingSpaceType)value, diagnostics, context);
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE:
				return validateRelatingStructuralMemberType((RelatingStructuralMemberType)value, diagnostics, context);
			case FinalPackage.RELATING_STRUCTURE_TYPE:
				return validateRelatingStructureType((RelatingStructureType)value, diagnostics, context);
			case FinalPackage.RELATING_STRUCTURE_TYPE1:
				return validateRelatingStructureType1((RelatingStructureType1)value, diagnostics, context);
			case FinalPackage.RELATING_SYSTEM_TYPE:
				return validateRelatingSystemType((RelatingSystemType)value, diagnostics, context);
			case FinalPackage.RELATING_TYPE_TYPE:
				return validateRelatingTypeType((RelatingTypeType)value, diagnostics, context);
			case FinalPackage.RELATIVE_PLACEMENT_TYPE:
				return validateRelativePlacementType((RelativePlacementType)value, diagnostics, context);
			case FinalPackage.RELAXATIONS_TYPE:
				return validateRelaxationsType((RelaxationsType)value, diagnostics, context);
			case FinalPackage.REPEAT_FACTOR_TYPE:
				return validateRepeatFactorType((RepeatFactorType)value, diagnostics, context);
			case FinalPackage.REPRESENTATION_CONTEXTS_TYPE:
				return validateRepresentationContextsType((RepresentationContextsType)value, diagnostics, context);
			case FinalPackage.REPRESENTATION_MAPS_TYPE:
				return validateRepresentationMapsType((RepresentationMapsType)value, diagnostics, context);
			case FinalPackage.REPRESENTATIONS_TYPE:
				return validateRepresentationsType((RepresentationsType)value, diagnostics, context);
			case FinalPackage.REPRESENTATION_TYPE:
				return validateRepresentationType((RepresentationType)value, diagnostics, context);
			case FinalPackage.REPRESENTED_MATERIAL_TYPE:
				return validateRepresentedMaterialType((RepresentedMaterialType)value, diagnostics, context);
			case FinalPackage.REQUESTED_LOCATION_TYPE:
				return validateRequestedLocationType((RequestedLocationType)value, diagnostics, context);
			case FinalPackage.RESPONSIBLE_PERSONS_TYPE:
				return validateResponsiblePersonsType((ResponsiblePersonsType)value, diagnostics, context);
			case FinalPackage.RESPONSIBLE_PERSON_TYPE:
				return validateResponsiblePersonType((ResponsiblePersonType)value, diagnostics, context);
			case FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE:
				return validateResultForLoadGroupType((ResultForLoadGroupType)value, diagnostics, context);
			case FinalPackage.RESULT_VALUES_TYPE:
				return validateResultValuesType((ResultValuesType)value, diagnostics, context);
			case FinalPackage.ROLES_TYPE:
				return validateRolesType((RolesType)value, diagnostics, context);
			case FinalPackage.ROLES_TYPE1:
				return validateRolesType1((RolesType1)value, diagnostics, context);
			case FinalPackage.ROLES_TYPE2:
				return validateRolesType2((RolesType2)value, diagnostics, context);
			case FinalPackage.ROLE_TYPE:
				return validateRoleType((RoleType)value, diagnostics, context);
			case FinalPackage.ROW_CELLS_TYPE:
				return validateRowCellsType((RowCellsType)value, diagnostics, context);
			case FinalPackage.ROWS_TYPE:
				return validateRowsType((RowsType)value, diagnostics, context);
			case FinalPackage.SBSM_BOUNDARY_TYPE:
				return validateSbsmBoundaryType((SbsmBoundaryType)value, diagnostics, context);
			case FinalPackage.SCHEDULE_FINISH_TYPE:
				return validateScheduleFinishType((ScheduleFinishType)value, diagnostics, context);
			case FinalPackage.SCHEDULE_START_TYPE:
				return validateScheduleStartType((ScheduleStartType)value, diagnostics, context);
			case FinalPackage.SECONDARY_PLANE_ANGLE_TYPE:
				return validateSecondaryPlaneAngleType((SecondaryPlaneAngleType)value, diagnostics, context);
			case FinalPackage.SECOND_OPERAND_TYPE:
				return validateSecondOperandType((SecondOperandType)value, diagnostics, context);
			case FinalPackage.SECOND_REPEAT_FACTOR_TYPE:
				return validateSecondRepeatFactorType((SecondRepeatFactorType)value, diagnostics, context);
			case FinalPackage.SECTION_DEFINITION_TYPE:
				return validateSectionDefinitionType((SectionDefinitionType)value, diagnostics, context);
			case FinalPackage.SEGMENTS_TYPE:
				return validateSegmentsType((SegmentsType)value, diagnostics, context);
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE:
				return validateShapeAspectStyleType((ShapeAspectStyleType)value, diagnostics, context);
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE1:
				return validateShapeAspectStyleType1((ShapeAspectStyleType1)value, diagnostics, context);
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE2:
				return validateShapeAspectStyleType2((ShapeAspectStyleType2)value, diagnostics, context);
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE3:
				return validateShapeAspectStyleType3((ShapeAspectStyleType3)value, diagnostics, context);
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE4:
				return validateShapeAspectStyleType4((ShapeAspectStyleType4)value, diagnostics, context);
			case FinalPackage.SHAPE_REPRESENTATIONS_TYPE:
				return validateShapeRepresentationsType((ShapeRepresentationsType)value, diagnostics, context);
			case FinalPackage.SITE_ADDRESS_TYPE:
				return validateSiteAddressType((SiteAddressType)value, diagnostics, context);
			case FinalPackage.SOUND_LEVEL_SINGLE_VALUE_TYPE:
				return validateSoundLevelSingleValueType((SoundLevelSingleValueType)value, diagnostics, context);
			case FinalPackage.SOUND_LEVEL_TIME_SERIES_TYPE:
				return validateSoundLevelTimeSeriesType((SoundLevelTimeSeriesType)value, diagnostics, context);
			case FinalPackage.SOUND_VALUES_TYPE:
				return validateSoundValuesType((SoundValuesType)value, diagnostics, context);
			case FinalPackage.SPECULAR_COLOUR_TYPE:
				return validateSpecularColourType((SpecularColourType)value, diagnostics, context);
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE:
				return validateSpecularHighlightType((SpecularHighlightType)value, diagnostics, context);
			case FinalPackage.SPINE_CURVE_TYPE:
				return validateSpineCurveType((SpineCurveType)value, diagnostics, context);
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE:
				return validateStartOfNextHatchLineType((StartOfNextHatchLineType)value, diagnostics, context);
			case FinalPackage.START_PROFILE_TYPE:
				return validateStartProfileType((StartProfileType)value, diagnostics, context);
			case FinalPackage.START_TIME_TYPE:
				return validateStartTimeType((StartTimeType)value, diagnostics, context);
			case FinalPackage.START_TIME_TYPE1:
				return validateStartTimeType1((StartTimeType1)value, diagnostics, context);
			case FinalPackage.STATUS_TIME_TYPE:
				return validateStatusTimeType((StatusTimeType)value, diagnostics, context);
			case FinalPackage.STYLE_OF_SYMBOL_TYPE:
				return validateStyleOfSymbolType((StyleOfSymbolType)value, diagnostics, context);
			case FinalPackage.STYLES_TYPE:
				return validateStylesType((StylesType)value, diagnostics, context);
			case FinalPackage.STYLES_TYPE1:
				return validateStylesType1((StylesType1)value, diagnostics, context);
			case FinalPackage.STYLES_TYPE2:
				return validateStylesType2((StylesType2)value, diagnostics, context);
			case FinalPackage.SUB_CONTRACTOR_TYPE:
				return validateSubContractorType((SubContractorType)value, diagnostics, context);
			case FinalPackage.SUBMITTED_BY_TYPE:
				return validateSubmittedByType((SubmittedByType)value, diagnostics, context);
			case FinalPackage.SUBMITTED_ON_TYPE:
				return validateSubmittedOnType((SubmittedOnType)value, diagnostics, context);
			case FinalPackage.SUBSEQUENT_APPLIED_LOADS_TYPE:
				return validateSubsequentAppliedLoadsType((SubsequentAppliedLoadsType)value, diagnostics, context);
			case FinalPackage.SUBSEQUENT_APPLIED_LOADS_TYPE1:
				return validateSubsequentAppliedLoadsType1((SubsequentAppliedLoadsType1)value, diagnostics, context);
			case FinalPackage.SUBSEQUENT_THICKNESS_TYPE:
				return validateSubsequentThicknessType((SubsequentThicknessType)value, diagnostics, context);
			case FinalPackage.SUFFIX_TITLES_TYPE:
				return validateSuffixTitlesType((SuffixTitlesType)value, diagnostics, context);
			case FinalPackage.SUPPLIERS_TYPE:
				return validateSuppliersType((SuppliersType)value, diagnostics, context);
			case FinalPackage.SURFACE_COLOUR_TYPE:
				return validateSurfaceColourType((SurfaceColourType)value, diagnostics, context);
			case FinalPackage.SURFACE_ON_RELATED_ELEMENT_TYPE:
				return validateSurfaceOnRelatedElementType((SurfaceOnRelatedElementType)value, diagnostics, context);
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE:
				return validateSurfaceOnRelatingElementType((SurfaceOnRelatingElementType)value, diagnostics, context);
			case FinalPackage.SWEPT_AREA_TYPE:
				return validateSweptAreaType((SweptAreaType)value, diagnostics, context);
			case FinalPackage.SWEPT_CURVE_TYPE:
				return validateSweptCurveType((SweptCurveType)value, diagnostics, context);
			case FinalPackage.SYMBOL_TYPE:
				return validateSymbolType((SymbolType)value, diagnostics, context);
			case FinalPackage.TARGET_TYPE:
				return validateTargetType((TargetType)value, diagnostics, context);
			case FinalPackage.TARGET_USERS_TYPE:
				return validateTargetUsersType((TargetUsersType)value, diagnostics, context);
			case FinalPackage.TELEPHONE_NUMBERS_TYPE:
				return validateTelephoneNumbersType((TelephoneNumbersType)value, diagnostics, context);
			case FinalPackage.TEMPERATURE_TIME_SERIES_TYPE:
				return validateTemperatureTimeSeriesType((TemperatureTimeSeriesType)value, diagnostics, context);
			case FinalPackage.TEXT_CHARACTER_APPEARANCE_TYPE:
				return validateTextCharacterAppearanceType((TextCharacterAppearanceType)value, diagnostics, context);
			case FinalPackage.TEXT_FONT_STYLE_TYPE:
				return validateTextFontStyleType((TextFontStyleType)value, diagnostics, context);
			case FinalPackage.TEXT_INDENT_TYPE:
				return validateTextIndentType((TextIndentType)value, diagnostics, context);
			case FinalPackage.TEXT_STYLE_TYPE:
				return validateTextStyleType((TextStyleType)value, diagnostics, context);
			case FinalPackage.TEXTURE_COORDINATES_TYPE:
				return validateTextureCoordinatesType((TextureCoordinatesType)value, diagnostics, context);
			case FinalPackage.TEXTURE_MAPS_TYPE:
				return validateTextureMapsType((TextureMapsType)value, diagnostics, context);
			case FinalPackage.TEXTURE_POINTS_TYPE:
				return validateTexturePointsType((TexturePointsType)value, diagnostics, context);
			case FinalPackage.TEXTURES_TYPE:
				return validateTexturesType((TexturesType)value, diagnostics, context);
			case FinalPackage.TEXTURE_TRANSFORM_TYPE:
				return validateTextureTransformType((TextureTransformType)value, diagnostics, context);
			case FinalPackage.TEXTURE_VERTICES_TYPE:
				return validateTextureVerticesType((TextureVerticesType)value, diagnostics, context);
			case FinalPackage.THE_ACTOR_TYPE:
				return validateTheActorType((TheActorType)value, diagnostics, context);
			case FinalPackage.THE_ORGANIZATION_TYPE:
				return validateTheOrganizationType((TheOrganizationType)value, diagnostics, context);
			case FinalPackage.THE_PERSON_TYPE:
				return validateThePersonType((ThePersonType)value, diagnostics, context);
			case FinalPackage.THERMAL_LOAD_TIME_SERIES_VALUES_TYPE:
				return validateThermalLoadTimeSeriesValuesType((ThermalLoadTimeSeriesValuesType)value, diagnostics, context);
			case FinalPackage.TILES_TYPE:
				return validateTilesType((TilesType)value, diagnostics, context);
			case FinalPackage.TILING_PATTERN_TYPE:
				return validateTilingPatternType((TilingPatternType)value, diagnostics, context);
			case FinalPackage.TIME_COMPONENT_TYPE:
				return validateTimeComponentType((TimeComponentType)value, diagnostics, context);
			case FinalPackage.TIME_FOR_TASK_TYPE:
				return validateTimeForTaskType((TimeForTaskType)value, diagnostics, context);
			case FinalPackage.TIME_SERIES_REFERENCES_TYPE:
				return validateTimeSeriesReferencesType((TimeSeriesReferencesType)value, diagnostics, context);
			case FinalPackage.TIME_SERIES_TYPE:
				return validateTimeSeriesType((TimeSeriesType)value, diagnostics, context);
			case FinalPackage.TIME_STAMP_TYPE:
				return validateTimeStampType((TimeStampType)value, diagnostics, context);
			case FinalPackage.TOTAL_REPLACEMENT_COST_TYPE:
				return validateTotalReplacementCostType((TotalReplacementCostType)value, diagnostics, context);
			case FinalPackage.TRANSMISSION_COLOUR_TYPE:
				return validateTransmissionColourType((TransmissionColourType)value, diagnostics, context);
			case FinalPackage.TRANSMISSION_COLOUR_TYPE1:
				return validateTransmissionColourType1((TransmissionColourType1)value, diagnostics, context);
			case FinalPackage.TREE_ROOT_EXPRESSION_TYPE:
				return validateTreeRootExpressionType((TreeRootExpressionType)value, diagnostics, context);
			case FinalPackage.TRIM1_TYPE:
				return validateTrim1Type((Trim1Type)value, diagnostics, context);
			case FinalPackage.TRIM2_TYPE:
				return validateTrim2Type((Trim2Type)value, diagnostics, context);
			case FinalPackage.TRUE_NORTH_TYPE:
				return validateTrueNorthType((TrueNorthType)value, diagnostics, context);
			case FinalPackage.UAXES_TYPE:
				return validateUAxesType((UAxesType)value, diagnostics, context);
			case FinalPackage.UNIT_BASIS_TYPE:
				return validateUnitBasisType((UnitBasisType)value, diagnostics, context);
			case FinalPackage.UNIT_COMPONENT_TYPE:
				return validateUnitComponentType((UnitComponentType)value, diagnostics, context);
			case FinalPackage.UNITS_IN_CONTEXT_TYPE:
				return validateUnitsInContextType((UnitsInContextType)value, diagnostics, context);
			case FinalPackage.UNITS_TYPE:
				return validateUnitsType((UnitsType)value, diagnostics, context);
			case FinalPackage.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			case FinalPackage.UNIT_TYPE1:
				return validateUnitType1((UnitType1)value, diagnostics, context);
			case FinalPackage.UNIT_TYPE2:
				return validateUnitType2((UnitType2)value, diagnostics, context);
			case FinalPackage.UNIT_TYPE3:
				return validateUnitType3((UnitType3)value, diagnostics, context);
			case FinalPackage.UNIT_TYPE4:
				return validateUnitType4((UnitType4)value, diagnostics, context);
			case FinalPackage.UNIT_TYPE5:
				return validateUnitType5((UnitType5)value, diagnostics, context);
			case FinalPackage.UNIT_TYPE6:
				return validateUnitType6((UnitType6)value, diagnostics, context);
			case FinalPackage.UOS:
				return validateUos((Uos)value, diagnostics, context);
			case FinalPackage.UPDATE_DATE_TYPE:
				return validateUpdateDateType((UpdateDateType)value, diagnostics, context);
			case FinalPackage.UPPER_BOUND_VALUE_TYPE:
				return validateUpperBoundValueType((UpperBoundValueType)value, diagnostics, context);
			case FinalPackage.UPPER_VALUE_TYPE:
				return validateUpperValueType((UpperValueType)value, diagnostics, context);
			case FinalPackage.USER_TYPE:
				return validateUserType((UserType)value, diagnostics, context);
			case FinalPackage.VALID_FROM_TYPE:
				return validateValidFromType((ValidFromType)value, diagnostics, context);
			case FinalPackage.VALID_UNTIL_TYPE:
				return validateValidUntilType((ValidUntilType)value, diagnostics, context);
			case FinalPackage.VALUE_COMPONENT_TYPE:
				return validateValueComponentType((ValueComponentType)value, diagnostics, context);
			case FinalPackage.VALUES_TYPE:
				return validateValuesType((ValuesType)value, diagnostics, context);
			case FinalPackage.VALUES_TYPE1:
				return validateValuesType1((ValuesType1)value, diagnostics, context);
			case FinalPackage.VARYING_APPLIED_LOAD_LOCATION_TYPE:
				return validateVaryingAppliedLoadLocationType((VaryingAppliedLoadLocationType)value, diagnostics, context);
			case FinalPackage.VARYING_APPLIED_LOAD_LOCATION_TYPE1:
				return validateVaryingAppliedLoadLocationType1((VaryingAppliedLoadLocationType1)value, diagnostics, context);
			case FinalPackage.VARYING_THICKNESS_LOCATION_TYPE:
				return validateVaryingThicknessLocationType((VaryingThicknessLocationType)value, diagnostics, context);
			case FinalPackage.VAXES_TYPE:
				return validateVAxesType((VAxesType)value, diagnostics, context);
			case FinalPackage.VELOCITY_TIME_SERIES_TYPE:
				return validateVelocityTimeSeriesType((VelocityTimeSeriesType)value, diagnostics, context);
			case FinalPackage.VERSION_DATE_TYPE:
				return validateVersionDateType((VersionDateType)value, diagnostics, context);
			case FinalPackage.VERTEX_GEOMETRY_TYPE:
				return validateVertexGeometryType((VertexGeometryType)value, diagnostics, context);
			case FinalPackage.VOIDS_TYPE:
				return validateVoidsType((VoidsType)value, diagnostics, context);
			case FinalPackage.WAXES_TYPE:
				return validateWAxesType((WAxesType)value, diagnostics, context);
			case FinalPackage.WEIGHTS_DATA_TYPE:
				return validateWeightsDataType((WeightsDataType)value, diagnostics, context);
			case FinalPackage.WET_BULB_TEMPERATURE_TIME_SERIES_TYPE:
				return validateWetBulbTemperatureTimeSeriesType((WetBulbTemperatureTimeSeriesType)value, diagnostics, context);
			case FinalPackage.WORD_SPACING_TYPE:
				return validateWordSpacingType((WordSpacingType)value, diagnostics, context);
			case FinalPackage.WORLD_COORDINATE_SYSTEM_TYPE:
				return validateWorldCoordinateSystemType((WorldCoordinateSystemType)value, diagnostics, context);
			case FinalPackage.ZONE_TYPE:
				return validateZoneType((ZoneType)value, diagnostics, context);
			case FinalPackage.IFC_ACTION_SOURCE_TYPE_ENUM:
				return validateIfcActionSourceTypeEnum((IfcActionSourceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ACTION_TYPE_ENUM:
				return validateIfcActionTypeEnum((IfcActionTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ACTUATOR_TYPE_ENUM:
				return validateIfcActuatorTypeEnum((IfcActuatorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ADDRESS_TYPE_ENUM:
				return validateIfcAddressTypeEnum((IfcAddressTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_AHEAD_OR_BEHIND:
				return validateIfcAheadOrBehind((IfcAheadOrBehind)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE_ENUM:
				return validateIfcAirTerminalBoxTypeEnum((IfcAirTerminalBoxTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TERMINAL_TYPE_ENUM:
				return validateIfcAirTerminalTypeEnum((IfcAirTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE_ENUM:
				return validateIfcAirToAirHeatRecoveryTypeEnum((IfcAirToAirHeatRecoveryTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ALARM_TYPE_ENUM:
				return validateIfcAlarmTypeEnum((IfcAlarmTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ANALYSIS_MODEL_TYPE_ENUM:
				return validateIfcAnalysisModelTypeEnum((IfcAnalysisModelTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ANALYSIS_THEORY_TYPE_ENUM:
				return validateIfcAnalysisTheoryTypeEnum((IfcAnalysisTheoryTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ARITHMETIC_OPERATOR_ENUM:
				return validateIfcArithmeticOperatorEnum((IfcArithmeticOperatorEnum)value, diagnostics, context);
			case FinalPackage.IFC_ASSEMBLY_PLACE_ENUM:
				return validateIfcAssemblyPlaceEnum((IfcAssemblyPlaceEnum)value, diagnostics, context);
			case FinalPackage.IFC_BEAM_TYPE_ENUM:
				return validateIfcBeamTypeEnum((IfcBeamTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_BENCHMARK_ENUM:
				return validateIfcBenchmarkEnum((IfcBenchmarkEnum)value, diagnostics, context);
			case FinalPackage.IFC_BOILER_TYPE_ENUM:
				return validateIfcBoilerTypeEnum((IfcBoilerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_BOOLEAN_OPERATOR:
				return validateIfcBooleanOperator((IfcBooleanOperator)value, diagnostics, context);
			case FinalPackage.IFC_BSPLINE_CURVE_FORM:
				return validateIfcBSplineCurveForm((IfcBSplineCurveForm)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE_ENUM:
				return validateIfcBuildingElementProxyTypeEnum((IfcBuildingElementProxyTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE_ENUM:
				return validateIfcCableCarrierFittingTypeEnum((IfcCableCarrierFittingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE_ENUM:
				return validateIfcCableCarrierSegmentTypeEnum((IfcCableCarrierSegmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE_ENUM:
				return validateIfcCableSegmentTypeEnum((IfcCableSegmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CHANGE_ACTION_ENUM:
				return validateIfcChangeActionEnum((IfcChangeActionEnum)value, diagnostics, context);
			case FinalPackage.IFC_CHILLER_TYPE_ENUM:
				return validateIfcChillerTypeEnum((IfcChillerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COIL_TYPE_ENUM:
				return validateIfcCoilTypeEnum((IfcCoilTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COLUMN_TYPE_ENUM:
				return validateIfcColumnTypeEnum((IfcColumnTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COMPRESSOR_TYPE_ENUM:
				return validateIfcCompressorTypeEnum((IfcCompressorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CONDENSER_TYPE_ENUM:
				return validateIfcCondenserTypeEnum((IfcCondenserTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTION_TYPE_ENUM:
				return validateIfcConnectionTypeEnum((IfcConnectionTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRAINT_ENUM:
				return validateIfcConstraintEnum((IfcConstraintEnum)value, diagnostics, context);
			case FinalPackage.IFC_CONTROLLER_TYPE_ENUM:
				return validateIfcControllerTypeEnum((IfcControllerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COOLED_BEAM_TYPE_ENUM:
				return validateIfcCooledBeamTypeEnum((IfcCooledBeamTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COOLING_TOWER_TYPE_ENUM:
				return validateIfcCoolingTowerTypeEnum((IfcCoolingTowerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COST_SCHEDULE_TYPE_ENUM:
				return validateIfcCostScheduleTypeEnum((IfcCostScheduleTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COVERING_TYPE_ENUM:
				return validateIfcCoveringTypeEnum((IfcCoveringTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CURRENCY_ENUM:
				return validateIfcCurrencyEnum((IfcCurrencyEnum)value, diagnostics, context);
			case FinalPackage.IFC_CURTAIN_WALL_TYPE_ENUM:
				return validateIfcCurtainWallTypeEnum((IfcCurtainWallTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DAMPER_TYPE_ENUM:
				return validateIfcDamperTypeEnum((IfcDamperTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DATA_ORIGIN_ENUM:
				return validateIfcDataOriginEnum((IfcDataOriginEnum)value, diagnostics, context);
			case FinalPackage.IFC_DERIVED_UNIT_ENUM:
				return validateIfcDerivedUnitEnum((IfcDerivedUnitEnum)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_EXTENT_USAGE:
				return validateIfcDimensionExtentUsage((IfcDimensionExtentUsage)value, diagnostics, context);
			case FinalPackage.IFC_DIRECTION_SENSE_ENUM:
				return validateIfcDirectionSenseEnum((IfcDirectionSenseEnum)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE_ENUM:
				return validateIfcDistributionChamberElementTypeEnum((IfcDistributionChamberElementTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_CONFIDENTIALITY_ENUM:
				return validateIfcDocumentConfidentialityEnum((IfcDocumentConfidentialityEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_STATUS_ENUM:
				return validateIfcDocumentStatusEnum((IfcDocumentStatusEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_PANEL_OPERATION_ENUM:
				return validateIfcDoorPanelOperationEnum((IfcDoorPanelOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_PANEL_POSITION_ENUM:
				return validateIfcDoorPanelPositionEnum((IfcDoorPanelPositionEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_STYLE_CONSTRUCTION_ENUM:
				return validateIfcDoorStyleConstructionEnum((IfcDoorStyleConstructionEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_STYLE_OPERATION_ENUM:
				return validateIfcDoorStyleOperationEnum((IfcDoorStyleOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_FITTING_TYPE_ENUM:
				return validateIfcDuctFittingTypeEnum((IfcDuctFittingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE_ENUM:
				return validateIfcDuctSegmentTypeEnum((IfcDuctSegmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_SILENCER_TYPE_ENUM:
				return validateIfcDuctSilencerTypeEnum((IfcDuctSilencerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE_ENUM:
				return validateIfcElectricApplianceTypeEnum((IfcElectricApplianceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CURRENT_ENUM:
				return validateIfcElectricCurrentEnum((IfcElectricCurrentEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT_FUNCTION_ENUM:
				return validateIfcElectricDistributionPointFunctionEnum((IfcElectricDistributionPointFunctionEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE_ENUM:
				return validateIfcElectricFlowStorageDeviceTypeEnum((IfcElectricFlowStorageDeviceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE_ENUM:
				return validateIfcElectricGeneratorTypeEnum((IfcElectricGeneratorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE_ENUM:
				return validateIfcElectricHeaterTypeEnum((IfcElectricHeaterTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE_ENUM:
				return validateIfcElectricMotorTypeEnum((IfcElectricMotorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE_ENUM:
				return validateIfcElectricTimeControlTypeEnum((IfcElectricTimeControlTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_ASSEMBLY_TYPE_ENUM:
				return validateIfcElementAssemblyTypeEnum((IfcElementAssemblyTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_COMPOSITION_ENUM:
				return validateIfcElementCompositionEnum((IfcElementCompositionEnum)value, diagnostics, context);
			case FinalPackage.IFC_ENERGY_SEQUENCE_ENUM:
				return validateIfcEnergySequenceEnum((IfcEnergySequenceEnum)value, diagnostics, context);
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_CATEGORY_ENUM:
				return validateIfcEnvironmentalImpactCategoryEnum((IfcEnvironmentalImpactCategoryEnum)value, diagnostics, context);
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE_ENUM:
				return validateIfcEvaporativeCoolerTypeEnum((IfcEvaporativeCoolerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_EVAPORATOR_TYPE_ENUM:
				return validateIfcEvaporatorTypeEnum((IfcEvaporatorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FAN_TYPE_ENUM:
				return validateIfcFanTypeEnum((IfcFanTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FILTER_TYPE_ENUM:
				return validateIfcFilterTypeEnum((IfcFilterTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE_ENUM:
				return validateIfcFireSuppressionTerminalTypeEnum((IfcFireSuppressionTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_DIRECTION_ENUM:
				return validateIfcFlowDirectionEnum((IfcFlowDirectionEnum)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE_ENUM:
				return validateIfcFlowInstrumentTypeEnum((IfcFlowInstrumentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_METER_TYPE_ENUM:
				return validateIfcFlowMeterTypeEnum((IfcFlowMeterTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FOOTING_TYPE_ENUM:
				return validateIfcFootingTypeEnum((IfcFootingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_GAS_TERMINAL_TYPE_ENUM:
				return validateIfcGasTerminalTypeEnum((IfcGasTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_PROJECTION_ENUM:
				return validateIfcGeometricProjectionEnum((IfcGeometricProjectionEnum)value, diagnostics, context);
			case FinalPackage.IFC_GLOBAL_OR_LOCAL_ENUM:
				return validateIfcGlobalOrLocalEnum((IfcGlobalOrLocalEnum)value, diagnostics, context);
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE_ENUM:
				return validateIfcHeatExchangerTypeEnum((IfcHeatExchangerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_HUMIDIFIER_TYPE_ENUM:
				return validateIfcHumidifierTypeEnum((IfcHumidifierTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_INTERNAL_OR_EXTERNAL_ENUM:
				return validateIfcInternalOrExternalEnum((IfcInternalOrExternalEnum)value, diagnostics, context);
			case FinalPackage.IFC_INVENTORY_TYPE_ENUM:
				return validateIfcInventoryTypeEnum((IfcInventoryTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_JUNCTION_BOX_TYPE_ENUM:
				return validateIfcJunctionBoxTypeEnum((IfcJunctionBoxTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_LAMP_TYPE_ENUM:
				return validateIfcLampTypeEnum((IfcLampTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_LAYER_SET_DIRECTION_ENUM:
				return validateIfcLayerSetDirectionEnum((IfcLayerSetDirectionEnum)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_CURVE_ENUM:
				return validateIfcLightDistributionCurveEnum((IfcLightDistributionCurveEnum)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_EMISSION_SOURCE_ENUM:
				return validateIfcLightEmissionSourceEnum((IfcLightEmissionSourceEnum)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE_ENUM:
				return validateIfcLightFixtureTypeEnum((IfcLightFixtureTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_LOAD_GROUP_TYPE_ENUM:
				return validateIfcLoadGroupTypeEnum((IfcLoadGroupTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_LOGICAL_OPERATOR_ENUM:
				return validateIfcLogicalOperatorEnum((IfcLogicalOperatorEnum)value, diagnostics, context);
			case FinalPackage.IFC_MEMBER_TYPE_ENUM:
				return validateIfcMemberTypeEnum((IfcMemberTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE_ENUM:
				return validateIfcMotorConnectionTypeEnum((IfcMotorConnectionTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_NULL_STYLE:
				return validateIfcNullStyle((IfcNullStyle)value, diagnostics, context);
			case FinalPackage.IFC_OBJECTIVE_ENUM:
				return validateIfcObjectiveEnum((IfcObjectiveEnum)value, diagnostics, context);
			case FinalPackage.IFC_OBJECT_TYPE_ENUM:
				return validateIfcObjectTypeEnum((IfcObjectTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_OCCUPANT_TYPE_ENUM:
				return validateIfcOccupantTypeEnum((IfcOccupantTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_OUTLET_TYPE_ENUM:
				return validateIfcOutletTypeEnum((IfcOutletTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PERMEABLE_COVERING_OPERATION_ENUM:
				return validateIfcPermeableCoveringOperationEnum((IfcPermeableCoveringOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_PHYSICAL_OR_VIRTUAL_ENUM:
				return validateIfcPhysicalOrVirtualEnum((IfcPhysicalOrVirtualEnum)value, diagnostics, context);
			case FinalPackage.IFC_PILE_CONSTRUCTION_ENUM:
				return validateIfcPileConstructionEnum((IfcPileConstructionEnum)value, diagnostics, context);
			case FinalPackage.IFC_PILE_TYPE_ENUM:
				return validateIfcPileTypeEnum((IfcPileTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PIPE_FITTING_TYPE_ENUM:
				return validateIfcPipeFittingTypeEnum((IfcPipeFittingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE_ENUM:
				return validateIfcPipeSegmentTypeEnum((IfcPipeSegmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PLATE_TYPE_ENUM:
				return validateIfcPlateTypeEnum((IfcPlateTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROCEDURE_TYPE_ENUM:
				return validateIfcProcedureTypeEnum((IfcProcedureTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROFILE_TYPE_ENUM:
				return validateIfcProfileTypeEnum((IfcProfileTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROJECTED_OR_TRUE_LENGTH_ENUM:
				return validateIfcProjectedOrTrueLengthEnum((IfcProjectedOrTrueLengthEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROJECT_ORDER_RECORD_TYPE_ENUM:
				return validateIfcProjectOrderRecordTypeEnum((IfcProjectOrderRecordTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROJECT_ORDER_TYPE_ENUM:
				return validateIfcProjectOrderTypeEnum((IfcProjectOrderTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_SOURCE_ENUM:
				return validateIfcPropertySourceEnum((IfcPropertySourceEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE_ENUM:
				return validateIfcProtectiveDeviceTypeEnum((IfcProtectiveDeviceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PUMP_TYPE_ENUM:
				return validateIfcPumpTypeEnum((IfcPumpTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_RAILING_TYPE_ENUM:
				return validateIfcRailingTypeEnum((IfcRailingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE_ENUM:
				return validateIfcRampFlightTypeEnum((IfcRampFlightTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_RAMP_TYPE_ENUM:
				return validateIfcRampTypeEnum((IfcRampTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_REFLECTANCE_METHOD_ENUM:
				return validateIfcReflectanceMethodEnum((IfcReflectanceMethodEnum)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCING_BAR_ROLE_ENUM:
				return validateIfcReinforcingBarRoleEnum((IfcReinforcingBarRoleEnum)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCING_BAR_SURFACE_ENUM:
				return validateIfcReinforcingBarSurfaceEnum((IfcReinforcingBarSurfaceEnum)value, diagnostics, context);
			case FinalPackage.IFC_RESOURCE_CONSUMPTION_ENUM:
				return validateIfcResourceConsumptionEnum((IfcResourceConsumptionEnum)value, diagnostics, context);
			case FinalPackage.IFC_RIB_PLATE_DIRECTION_ENUM:
				return validateIfcRibPlateDirectionEnum((IfcRibPlateDirectionEnum)value, diagnostics, context);
			case FinalPackage.IFC_ROLE_ENUM:
				return validateIfcRoleEnum((IfcRoleEnum)value, diagnostics, context);
			case FinalPackage.IFC_ROOF_TYPE_ENUM:
				return validateIfcRoofTypeEnum((IfcRoofTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE_ENUM:
				return validateIfcSanitaryTerminalTypeEnum((IfcSanitaryTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SECTION_TYPE_ENUM:
				return validateIfcSectionTypeEnum((IfcSectionTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SENSOR_TYPE_ENUM:
				return validateIfcSensorTypeEnum((IfcSensorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SEQUENCE_ENUM:
				return validateIfcSequenceEnum((IfcSequenceEnum)value, diagnostics, context);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR_TYPE_ENUM:
				return validateIfcServiceLifeFactorTypeEnum((IfcServiceLifeFactorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SERVICE_LIFE_TYPE_ENUM:
				return validateIfcServiceLifeTypeEnum((IfcServiceLifeTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SI_PREFIX:
				return validateIfcSIPrefix((IfcSIPrefix)value, diagnostics, context);
			case FinalPackage.IFC_SI_UNIT_NAME:
				return validateIfcSIUnitName((IfcSIUnitName)value, diagnostics, context);
			case FinalPackage.IFC_SLAB_TYPE_ENUM:
				return validateIfcSlabTypeEnum((IfcSlabTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_SCALE_ENUM:
				return validateIfcSoundScaleEnum((IfcSoundScaleEnum)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_HEATER_TYPE_ENUM:
				return validateIfcSpaceHeaterTypeEnum((IfcSpaceHeaterTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_TYPE_ENUM:
				return validateIfcSpaceTypeEnum((IfcSpaceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_STACK_TERMINAL_TYPE_ENUM:
				return validateIfcStackTerminalTypeEnum((IfcStackTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE_ENUM:
				return validateIfcStairFlightTypeEnum((IfcStairFlightTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_STAIR_TYPE_ENUM:
				return validateIfcStairTypeEnum((IfcStairTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_STATE_ENUM:
				return validateIfcStateEnum((IfcStateEnum)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_CURVE_TYPE_ENUM:
				return validateIfcStructuralCurveTypeEnum((IfcStructuralCurveTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_TYPE_ENUM:
				return validateIfcStructuralSurfaceTypeEnum((IfcStructuralSurfaceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_SIDE:
				return validateIfcSurfaceSide((IfcSurfaceSide)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_TEXTURE_ENUM:
				return validateIfcSurfaceTextureEnum((IfcSurfaceTextureEnum)value, diagnostics, context);
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE_ENUM:
				return validateIfcSwitchingDeviceTypeEnum((IfcSwitchingDeviceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TANK_TYPE_ENUM:
				return validateIfcTankTypeEnum((IfcTankTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TENDON_TYPE_ENUM:
				return validateIfcTendonTypeEnum((IfcTendonTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_PATH:
				return validateIfcTextPath((IfcTextPath)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_LOAD_SOURCE_ENUM:
				return validateIfcThermalLoadSourceEnum((IfcThermalLoadSourceEnum)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_LOAD_TYPE_ENUM:
				return validateIfcThermalLoadTypeEnum((IfcThermalLoadTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES_DATA_TYPE_ENUM:
				return validateIfcTimeSeriesDataTypeEnum((IfcTimeSeriesDataTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE_TYPE_ENUM:
				return validateIfcTimeSeriesScheduleTypeEnum((IfcTimeSeriesScheduleTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TRANSFORMER_TYPE_ENUM:
				return validateIfcTransformerTypeEnum((IfcTransformerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TRANSITION_CODE:
				return validateIfcTransitionCode((IfcTransitionCode)value, diagnostics, context);
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE_ENUM:
				return validateIfcTransportElementTypeEnum((IfcTransportElementTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TRIMMING_PREFERENCE:
				return validateIfcTrimmingPreference((IfcTrimmingPreference)value, diagnostics, context);
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE_ENUM:
				return validateIfcTubeBundleTypeEnum((IfcTubeBundleTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE_ENUM:
				return validateIfcUnitaryEquipmentTypeEnum((IfcUnitaryEquipmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_UNIT_ENUM:
				return validateIfcUnitEnum((IfcUnitEnum)value, diagnostics, context);
			case FinalPackage.IFC_VALVE_TYPE_ENUM:
				return validateIfcValveTypeEnum((IfcValveTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE_ENUM:
				return validateIfcVibrationIsolatorTypeEnum((IfcVibrationIsolatorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_WALL_TYPE_ENUM:
				return validateIfcWallTypeEnum((IfcWallTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE_ENUM:
				return validateIfcWasteTerminalTypeEnum((IfcWasteTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_PANEL_OPERATION_ENUM:
				return validateIfcWindowPanelOperationEnum((IfcWindowPanelOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_PANEL_POSITION_ENUM:
				return validateIfcWindowPanelPositionEnum((IfcWindowPanelPositionEnum)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_STYLE_CONSTRUCTION_ENUM:
				return validateIfcWindowStyleConstructionEnum((IfcWindowStyleConstructionEnum)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_STYLE_OPERATION_ENUM:
				return validateIfcWindowStyleOperationEnum((IfcWindowStyleOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_WORK_CONTROL_TYPE_ENUM:
				return validateIfcWorkControlTypeEnum((IfcWorkControlTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ABSORBED_DOSE_MEASURE:
				return validateIfcAbsorbedDoseMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ABSORBED_DOSE_MEASURE_OBJECT:
				return validateIfcAbsorbedDoseMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ACCELERATION_MEASURE:
				return validateIfcAccelerationMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ACCELERATION_MEASURE_OBJECT:
				return validateIfcAccelerationMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ACTION_SOURCE_TYPE_ENUM_OBJECT:
				return validateIfcActionSourceTypeEnumObject((IfcActionSourceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ACTION_TYPE_ENUM_OBJECT:
				return validateIfcActionTypeEnumObject((IfcActionTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ACTUATOR_TYPE_ENUM_OBJECT:
				return validateIfcActuatorTypeEnumObject((IfcActuatorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ADDRESS_TYPE_ENUM_OBJECT:
				return validateIfcAddressTypeEnumObject((IfcAddressTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_AHEAD_OR_BEHIND_OBJECT:
				return validateIfcAheadOrBehindObject((IfcAheadOrBehind)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE_ENUM_OBJECT:
				return validateIfcAirTerminalBoxTypeEnumObject((IfcAirTerminalBoxTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TERMINAL_TYPE_ENUM_OBJECT:
				return validateIfcAirTerminalTypeEnumObject((IfcAirTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE_ENUM_OBJECT:
				return validateIfcAirToAirHeatRecoveryTypeEnumObject((IfcAirToAirHeatRecoveryTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ALARM_TYPE_ENUM_OBJECT:
				return validateIfcAlarmTypeEnumObject((IfcAlarmTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				return validateIfcAmountOfSubstanceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_AMOUNT_OF_SUBSTANCE_MEASURE_OBJECT:
				return validateIfcAmountOfSubstanceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ANALYSIS_MODEL_TYPE_ENUM_OBJECT:
				return validateIfcAnalysisModelTypeEnumObject((IfcAnalysisModelTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ANALYSIS_THEORY_TYPE_ENUM_OBJECT:
				return validateIfcAnalysisTheoryTypeEnumObject((IfcAnalysisTheoryTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ANGULAR_VELOCITY_MEASURE:
				return validateIfcAngularVelocityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ANGULAR_VELOCITY_MEASURE_OBJECT:
				return validateIfcAngularVelocityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_AREA_MEASURE:
				return validateIfcAreaMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_AREA_MEASURE_OBJECT:
				return validateIfcAreaMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ARITHMETIC_OPERATOR_ENUM_OBJECT:
				return validateIfcArithmeticOperatorEnumObject((IfcArithmeticOperatorEnum)value, diagnostics, context);
			case FinalPackage.IFC_ASSEMBLY_PLACE_ENUM_OBJECT:
				return validateIfcAssemblyPlaceEnumObject((IfcAssemblyPlaceEnum)value, diagnostics, context);
			case FinalPackage.IFC_BEAM_TYPE_ENUM_OBJECT:
				return validateIfcBeamTypeEnumObject((IfcBeamTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_BENCHMARK_ENUM_OBJECT:
				return validateIfcBenchmarkEnumObject((IfcBenchmarkEnum)value, diagnostics, context);
			case FinalPackage.IFC_BOILER_TYPE_ENUM_OBJECT:
				return validateIfcBoilerTypeEnumObject((IfcBoilerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_BOOLEAN:
				return validateIfcBoolean((Boolean)value, diagnostics, context);
			case FinalPackage.IFC_BOOLEAN_OBJECT:
				return validateIfcBooleanObject((Boolean)value, diagnostics, context);
			case FinalPackage.IFC_BOOLEAN_OPERATOR_OBJECT:
				return validateIfcBooleanOperatorObject((IfcBooleanOperator)value, diagnostics, context);
			case FinalPackage.IFC_BOX_ALIGNMENT:
				return validateIfcBoxAlignment((String)value, diagnostics, context);
			case FinalPackage.IFC_BSPLINE_CURVE_FORM_OBJECT:
				return validateIfcBSplineCurveFormObject((IfcBSplineCurveForm)value, diagnostics, context);
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE_ENUM_OBJECT:
				return validateIfcBuildingElementProxyTypeEnumObject((IfcBuildingElementProxyTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE_ENUM_OBJECT:
				return validateIfcCableCarrierFittingTypeEnumObject((IfcCableCarrierFittingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE_ENUM_OBJECT:
				return validateIfcCableCarrierSegmentTypeEnumObject((IfcCableCarrierSegmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE_ENUM_OBJECT:
				return validateIfcCableSegmentTypeEnumObject((IfcCableSegmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CHANGE_ACTION_ENUM_OBJECT:
				return validateIfcChangeActionEnumObject((IfcChangeActionEnum)value, diagnostics, context);
			case FinalPackage.IFC_CHILLER_TYPE_ENUM_OBJECT:
				return validateIfcChillerTypeEnumObject((IfcChillerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COIL_TYPE_ENUM_OBJECT:
				return validateIfcCoilTypeEnumObject((IfcCoilTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COLUMN_TYPE_ENUM_OBJECT:
				return validateIfcColumnTypeEnumObject((IfcColumnTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COMPRESSOR_TYPE_ENUM_OBJECT:
				return validateIfcCompressorTypeEnumObject((IfcCompressorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CONDENSER_TYPE_ENUM_OBJECT:
				return validateIfcCondenserTypeEnumObject((IfcCondenserTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CONNECTION_TYPE_ENUM_OBJECT:
				return validateIfcConnectionTypeEnumObject((IfcConnectionTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CONSTRAINT_ENUM_OBJECT:
				return validateIfcConstraintEnumObject((IfcConstraintEnum)value, diagnostics, context);
			case FinalPackage.IFC_CONTEXT_DEPENDENT_MEASURE:
				return validateIfcContextDependentMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_CONTEXT_DEPENDENT_MEASURE_OBJECT:
				return validateIfcContextDependentMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_CONTROLLER_TYPE_ENUM_OBJECT:
				return validateIfcControllerTypeEnumObject((IfcControllerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COOLED_BEAM_TYPE_ENUM_OBJECT:
				return validateIfcCooledBeamTypeEnumObject((IfcCooledBeamTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COOLING_TOWER_TYPE_ENUM_OBJECT:
				return validateIfcCoolingTowerTypeEnumObject((IfcCoolingTowerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COST_SCHEDULE_TYPE_ENUM_OBJECT:
				return validateIfcCostScheduleTypeEnumObject((IfcCostScheduleTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_COUNT_MEASURE:
				return validateIfcCountMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_COUNT_MEASURE_OBJECT:
				return validateIfcCountMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_COVERING_TYPE_ENUM_OBJECT:
				return validateIfcCoveringTypeEnumObject((IfcCoveringTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CURRENCY_ENUM_OBJECT:
				return validateIfcCurrencyEnumObject((IfcCurrencyEnum)value, diagnostics, context);
			case FinalPackage.IFC_CURTAIN_WALL_TYPE_ENUM_OBJECT:
				return validateIfcCurtainWallTypeEnumObject((IfcCurtainWallTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_CURVATURE_MEASURE:
				return validateIfcCurvatureMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_CURVATURE_MEASURE_OBJECT:
				return validateIfcCurvatureMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_DAMPER_TYPE_ENUM_OBJECT:
				return validateIfcDamperTypeEnumObject((IfcDamperTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DATA_ORIGIN_ENUM_OBJECT:
				return validateIfcDataOriginEnumObject((IfcDataOriginEnum)value, diagnostics, context);
			case FinalPackage.IFC_DAY_IN_MONTH_NUMBER:
				return validateIfcDayInMonthNumber((Long)value, diagnostics, context);
			case FinalPackage.IFC_DAY_IN_MONTH_NUMBER_OBJECT:
				return validateIfcDayInMonthNumberObject((Long)value, diagnostics, context);
			case FinalPackage.IFC_DAYLIGHT_SAVING_HOUR:
				return validateIfcDaylightSavingHour((Long)value, diagnostics, context);
			case FinalPackage.IFC_DAYLIGHT_SAVING_HOUR_OBJECT:
				return validateIfcDaylightSavingHourObject((Long)value, diagnostics, context);
			case FinalPackage.IFC_DERIVED_UNIT_ENUM_OBJECT:
				return validateIfcDerivedUnitEnumObject((IfcDerivedUnitEnum)value, diagnostics, context);
			case FinalPackage.IFC_DESCRIPTIVE_MEASURE:
				return validateIfcDescriptiveMeasure((String)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_COUNT:
				return validateIfcDimensionCount((Long)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_COUNT_OBJECT:
				return validateIfcDimensionCountObject((Long)value, diagnostics, context);
			case FinalPackage.IFC_DIMENSION_EXTENT_USAGE_OBJECT:
				return validateIfcDimensionExtentUsageObject((IfcDimensionExtentUsage)value, diagnostics, context);
			case FinalPackage.IFC_DIRECTION_SENSE_ENUM_OBJECT:
				return validateIfcDirectionSenseEnumObject((IfcDirectionSenseEnum)value, diagnostics, context);
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE_ENUM_OBJECT:
				return validateIfcDistributionChamberElementTypeEnumObject((IfcDistributionChamberElementTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_CONFIDENTIALITY_ENUM_OBJECT:
				return validateIfcDocumentConfidentialityEnumObject((IfcDocumentConfidentialityEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOCUMENT_STATUS_ENUM_OBJECT:
				return validateIfcDocumentStatusEnumObject((IfcDocumentStatusEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_PANEL_OPERATION_ENUM_OBJECT:
				return validateIfcDoorPanelOperationEnumObject((IfcDoorPanelOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_PANEL_POSITION_ENUM_OBJECT:
				return validateIfcDoorPanelPositionEnumObject((IfcDoorPanelPositionEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_STYLE_CONSTRUCTION_ENUM_OBJECT:
				return validateIfcDoorStyleConstructionEnumObject((IfcDoorStyleConstructionEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOOR_STYLE_OPERATION_ENUM_OBJECT:
				return validateIfcDoorStyleOperationEnumObject((IfcDoorStyleOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_DOSE_EQUIVALENT_MEASURE:
				return validateIfcDoseEquivalentMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_DOSE_EQUIVALENT_MEASURE_OBJECT:
				return validateIfcDoseEquivalentMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_FITTING_TYPE_ENUM_OBJECT:
				return validateIfcDuctFittingTypeEnumObject((IfcDuctFittingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE_ENUM_OBJECT:
				return validateIfcDuctSegmentTypeEnumObject((IfcDuctSegmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DUCT_SILENCER_TYPE_ENUM_OBJECT:
				return validateIfcDuctSilencerTypeEnumObject((IfcDuctSilencerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_DYNAMIC_VISCOSITY_MEASURE:
				return validateIfcDynamicViscosityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_DYNAMIC_VISCOSITY_MEASURE_OBJECT:
				return validateIfcDynamicViscosityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE_ENUM_OBJECT:
				return validateIfcElectricApplianceTypeEnumObject((IfcElectricApplianceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CAPACITANCE_MEASURE:
				return validateIfcElectricCapacitanceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CAPACITANCE_MEASURE_OBJECT:
				return validateIfcElectricCapacitanceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CHARGE_MEASURE:
				return validateIfcElectricChargeMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CHARGE_MEASURE_OBJECT:
				return validateIfcElectricChargeMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				return validateIfcElectricConductanceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CONDUCTANCE_MEASURE_OBJECT:
				return validateIfcElectricConductanceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CURRENT_ENUM_OBJECT:
				return validateIfcElectricCurrentEnumObject((IfcElectricCurrentEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CURRENT_MEASURE:
				return validateIfcElectricCurrentMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_CURRENT_MEASURE_OBJECT:
				return validateIfcElectricCurrentMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT_FUNCTION_ENUM_OBJECT:
				return validateIfcElectricDistributionPointFunctionEnumObject((IfcElectricDistributionPointFunctionEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE_ENUM_OBJECT:
				return validateIfcElectricFlowStorageDeviceTypeEnumObject((IfcElectricFlowStorageDeviceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE_ENUM_OBJECT:
				return validateIfcElectricGeneratorTypeEnumObject((IfcElectricGeneratorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE_ENUM_OBJECT:
				return validateIfcElectricHeaterTypeEnumObject((IfcElectricHeaterTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE_ENUM_OBJECT:
				return validateIfcElectricMotorTypeEnumObject((IfcElectricMotorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_RESISTANCE_MEASURE:
				return validateIfcElectricResistanceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_RESISTANCE_MEASURE_OBJECT:
				return validateIfcElectricResistanceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE_ENUM_OBJECT:
				return validateIfcElectricTimeControlTypeEnumObject((IfcElectricTimeControlTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_VOLTAGE_MEASURE:
				return validateIfcElectricVoltageMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELECTRIC_VOLTAGE_MEASURE_OBJECT:
				return validateIfcElectricVoltageMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_ASSEMBLY_TYPE_ENUM_OBJECT:
				return validateIfcElementAssemblyTypeEnumObject((IfcElementAssemblyTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ELEMENT_COMPOSITION_ENUM_OBJECT:
				return validateIfcElementCompositionEnumObject((IfcElementCompositionEnum)value, diagnostics, context);
			case FinalPackage.IFC_ENERGY_MEASURE:
				return validateIfcEnergyMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ENERGY_MEASURE_OBJECT:
				return validateIfcEnergyMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ENERGY_SEQUENCE_ENUM_OBJECT:
				return validateIfcEnergySequenceEnumObject((IfcEnergySequenceEnum)value, diagnostics, context);
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_CATEGORY_ENUM_OBJECT:
				return validateIfcEnvironmentalImpactCategoryEnumObject((IfcEnvironmentalImpactCategoryEnum)value, diagnostics, context);
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE_ENUM_OBJECT:
				return validateIfcEvaporativeCoolerTypeEnumObject((IfcEvaporativeCoolerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_EVAPORATOR_TYPE_ENUM_OBJECT:
				return validateIfcEvaporatorTypeEnumObject((IfcEvaporatorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FAN_TYPE_ENUM_OBJECT:
				return validateIfcFanTypeEnumObject((IfcFanTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FILTER_TYPE_ENUM_OBJECT:
				return validateIfcFilterTypeEnumObject((IfcFilterTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE_ENUM_OBJECT:
				return validateIfcFireSuppressionTerminalTypeEnumObject((IfcFireSuppressionTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_DIRECTION_ENUM_OBJECT:
				return validateIfcFlowDirectionEnumObject((IfcFlowDirectionEnum)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE_ENUM_OBJECT:
				return validateIfcFlowInstrumentTypeEnumObject((IfcFlowInstrumentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FLOW_METER_TYPE_ENUM_OBJECT:
				return validateIfcFlowMeterTypeEnumObject((IfcFlowMeterTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FONT_STYLE:
				return validateIfcFontStyle((String)value, diagnostics, context);
			case FinalPackage.IFC_FONT_VARIANT:
				return validateIfcFontVariant((String)value, diagnostics, context);
			case FinalPackage.IFC_FONT_WEIGHT:
				return validateIfcFontWeight((String)value, diagnostics, context);
			case FinalPackage.IFC_FOOTING_TYPE_ENUM_OBJECT:
				return validateIfcFootingTypeEnumObject((IfcFootingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_FORCE_MEASURE:
				return validateIfcForceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_FORCE_MEASURE_OBJECT:
				return validateIfcForceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_FREQUENCY_MEASURE:
				return validateIfcFrequencyMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_FREQUENCY_MEASURE_OBJECT:
				return validateIfcFrequencyMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_GAS_TERMINAL_TYPE_ENUM_OBJECT:
				return validateIfcGasTerminalTypeEnumObject((IfcGasTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_GEOMETRIC_PROJECTION_ENUM_OBJECT:
				return validateIfcGeometricProjectionEnumObject((IfcGeometricProjectionEnum)value, diagnostics, context);
			case FinalPackage.IFC_GLOBALLY_UNIQUE_ID:
				return validateIfcGloballyUniqueId((String)value, diagnostics, context);
			case FinalPackage.IFC_GLOBAL_OR_LOCAL_ENUM_OBJECT:
				return validateIfcGlobalOrLocalEnumObject((IfcGlobalOrLocalEnum)value, diagnostics, context);
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE_ENUM_OBJECT:
				return validateIfcHeatExchangerTypeEnumObject((IfcHeatExchangerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_HEAT_FLUX_DENSITY_MEASURE:
				return validateIfcHeatFluxDensityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_HEAT_FLUX_DENSITY_MEASURE_OBJECT:
				return validateIfcHeatFluxDensityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_HEATING_VALUE_MEASURE:
				return validateIfcHeatingValueMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_HEATING_VALUE_MEASURE_OBJECT:
				return validateIfcHeatingValueMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_HOUR_IN_DAY:
				return validateIfcHourInDay((Long)value, diagnostics, context);
			case FinalPackage.IFC_HOUR_IN_DAY_OBJECT:
				return validateIfcHourInDayObject((Long)value, diagnostics, context);
			case FinalPackage.IFC_HUMIDIFIER_TYPE_ENUM_OBJECT:
				return validateIfcHumidifierTypeEnumObject((IfcHumidifierTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_IDENTIFIER:
				return validateIfcIdentifier((String)value, diagnostics, context);
			case FinalPackage.IFC_ILLUMINANCE_MEASURE:
				return validateIfcIlluminanceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ILLUMINANCE_MEASURE_OBJECT:
				return validateIfcIlluminanceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_INDUCTANCE_MEASURE:
				return validateIfcInductanceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_INDUCTANCE_MEASURE_OBJECT:
				return validateIfcInductanceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_INTEGER:
				return validateIfcInteger((Long)value, diagnostics, context);
			case FinalPackage.IFC_INTEGER_COUNT_RATE_MEASURE:
				return validateIfcIntegerCountRateMeasure((Long)value, diagnostics, context);
			case FinalPackage.IFC_INTEGER_COUNT_RATE_MEASURE_OBJECT:
				return validateIfcIntegerCountRateMeasureObject((Long)value, diagnostics, context);
			case FinalPackage.IFC_INTEGER_OBJECT:
				return validateIfcIntegerObject((Long)value, diagnostics, context);
			case FinalPackage.IFC_INTERNAL_OR_EXTERNAL_ENUM_OBJECT:
				return validateIfcInternalOrExternalEnumObject((IfcInternalOrExternalEnum)value, diagnostics, context);
			case FinalPackage.IFC_INVENTORY_TYPE_ENUM_OBJECT:
				return validateIfcInventoryTypeEnumObject((IfcInventoryTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ION_CONCENTRATION_MEASURE:
				return validateIfcIonConcentrationMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ION_CONCENTRATION_MEASURE_OBJECT:
				return validateIfcIonConcentrationMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				return validateIfcIsothermalMoistureCapacityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE_OBJECT:
				return validateIfcIsothermalMoistureCapacityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_JUNCTION_BOX_TYPE_ENUM_OBJECT:
				return validateIfcJunctionBoxTypeEnumObject((IfcJunctionBoxTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_KINEMATIC_VISCOSITY_MEASURE:
				return validateIfcKinematicViscosityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_KINEMATIC_VISCOSITY_MEASURE_OBJECT:
				return validateIfcKinematicViscosityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_LABEL:
				return validateIfcLabel((String)value, diagnostics, context);
			case FinalPackage.IFC_LAMP_TYPE_ENUM_OBJECT:
				return validateIfcLampTypeEnumObject((IfcLampTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_LAYER_SET_DIRECTION_ENUM_OBJECT:
				return validateIfcLayerSetDirectionEnumObject((IfcLayerSetDirectionEnum)value, diagnostics, context);
			case FinalPackage.IFC_LENGTH_MEASURE:
				return validateIfcLengthMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_LENGTH_MEASURE_OBJECT:
				return validateIfcLengthMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_CURVE_ENUM_OBJECT:
				return validateIfcLightDistributionCurveEnumObject((IfcLightDistributionCurveEnum)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_EMISSION_SOURCE_ENUM_OBJECT:
				return validateIfcLightEmissionSourceEnumObject((IfcLightEmissionSourceEnum)value, diagnostics, context);
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE_ENUM_OBJECT:
				return validateIfcLightFixtureTypeEnumObject((IfcLightFixtureTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_FORCE_MEASURE:
				return validateIfcLinearForceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_FORCE_MEASURE_OBJECT:
				return validateIfcLinearForceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_MOMENT_MEASURE:
				return validateIfcLinearMomentMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_MOMENT_MEASURE_OBJECT:
				return validateIfcLinearMomentMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_STIFFNESS_MEASURE:
				return validateIfcLinearStiffnessMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_STIFFNESS_MEASURE_OBJECT:
				return validateIfcLinearStiffnessMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_VELOCITY_MEASURE:
				return validateIfcLinearVelocityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_LINEAR_VELOCITY_MEASURE_OBJECT:
				return validateIfcLinearVelocityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_LOAD_GROUP_TYPE_ENUM_OBJECT:
				return validateIfcLoadGroupTypeEnumObject((IfcLoadGroupTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_LOGICAL:
				return validateIfcLogical((Logical)value, diagnostics, context);
			case FinalPackage.IFC_LOGICAL_OPERATOR_ENUM_OBJECT:
				return validateIfcLogicalOperatorEnumObject((IfcLogicalOperatorEnum)value, diagnostics, context);
			case FinalPackage.IFC_LUMINOUS_FLUX_MEASURE:
				return validateIfcLuminousFluxMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_LUMINOUS_FLUX_MEASURE_OBJECT:
				return validateIfcLuminousFluxMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				return validateIfcLuminousIntensityDistributionMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE_OBJECT:
				return validateIfcLuminousIntensityDistributionMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_MEASURE:
				return validateIfcLuminousIntensityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_MEASURE_OBJECT:
				return validateIfcLuminousIntensityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				return validateIfcMagneticFluxDensityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MAGNETIC_FLUX_DENSITY_MEASURE_OBJECT:
				return validateIfcMagneticFluxDensityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MAGNETIC_FLUX_MEASURE:
				return validateIfcMagneticFluxMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MAGNETIC_FLUX_MEASURE_OBJECT:
				return validateIfcMagneticFluxMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MASS_DENSITY_MEASURE:
				return validateIfcMassDensityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MASS_DENSITY_MEASURE_OBJECT:
				return validateIfcMassDensityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MASS_FLOW_RATE_MEASURE:
				return validateIfcMassFlowRateMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MASS_FLOW_RATE_MEASURE_OBJECT:
				return validateIfcMassFlowRateMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MASS_MEASURE:
				return validateIfcMassMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MASS_MEASURE_OBJECT:
				return validateIfcMassMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MASS_PER_LENGTH_MEASURE:
				return validateIfcMassPerLengthMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MASS_PER_LENGTH_MEASURE_OBJECT:
				return validateIfcMassPerLengthMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MEMBER_TYPE_ENUM_OBJECT:
				return validateIfcMemberTypeEnumObject((IfcMemberTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_MINUTE_IN_HOUR:
				return validateIfcMinuteInHour((Long)value, diagnostics, context);
			case FinalPackage.IFC_MINUTE_IN_HOUR_OBJECT:
				return validateIfcMinuteInHourObject((Long)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_ELASTICITY_MEASURE:
				return validateIfcModulusOfElasticityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_ELASTICITY_MEASURE_OBJECT:
				return validateIfcModulusOfElasticityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				return validateIfcModulusOfLinearSubgradeReactionMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE_OBJECT:
				return validateIfcModulusOfLinearSubgradeReactionMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				return validateIfcModulusOfRotationalSubgradeReactionMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE_OBJECT:
				return validateIfcModulusOfRotationalSubgradeReactionMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				return validateIfcModulusOfSubgradeReactionMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE_OBJECT:
				return validateIfcModulusOfSubgradeReactionMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				return validateIfcMoistureDiffusivityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MOISTURE_DIFFUSIVITY_MEASURE_OBJECT:
				return validateIfcMoistureDiffusivityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MOLECULAR_WEIGHT_MEASURE:
				return validateIfcMolecularWeightMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MOLECULAR_WEIGHT_MEASURE_OBJECT:
				return validateIfcMolecularWeightMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MOMENT_OF_INERTIA_MEASURE:
				return validateIfcMomentOfInertiaMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MOMENT_OF_INERTIA_MEASURE_OBJECT:
				return validateIfcMomentOfInertiaMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MONETARY_MEASURE:
				return validateIfcMonetaryMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_MONETARY_MEASURE_OBJECT:
				return validateIfcMonetaryMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_MONTH_IN_YEAR_NUMBER:
				return validateIfcMonthInYearNumber((Long)value, diagnostics, context);
			case FinalPackage.IFC_MONTH_IN_YEAR_NUMBER_OBJECT:
				return validateIfcMonthInYearNumberObject((Long)value, diagnostics, context);
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE_ENUM_OBJECT:
				return validateIfcMotorConnectionTypeEnumObject((IfcMotorConnectionTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_NORMALISED_RATIO_MEASURE:
				return validateIfcNormalisedRatioMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_NORMALISED_RATIO_MEASURE_OBJECT:
				return validateIfcNormalisedRatioMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_NULL_STYLE_OBJECT:
				return validateIfcNullStyleObject((IfcNullStyle)value, diagnostics, context);
			case FinalPackage.IFC_NUMERIC_MEASURE:
				return validateIfcNumericMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_NUMERIC_MEASURE_OBJECT:
				return validateIfcNumericMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_OBJECTIVE_ENUM_OBJECT:
				return validateIfcObjectiveEnumObject((IfcObjectiveEnum)value, diagnostics, context);
			case FinalPackage.IFC_OBJECT_TYPE_ENUM_OBJECT:
				return validateIfcObjectTypeEnumObject((IfcObjectTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_OCCUPANT_TYPE_ENUM_OBJECT:
				return validateIfcOccupantTypeEnumObject((IfcOccupantTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_OUTLET_TYPE_ENUM_OBJECT:
				return validateIfcOutletTypeEnumObject((IfcOutletTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PARAMETER_VALUE:
				return validateIfcParameterValue((Double)value, diagnostics, context);
			case FinalPackage.IFC_PARAMETER_VALUE_OBJECT:
				return validateIfcParameterValueObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_PERMEABLE_COVERING_OPERATION_ENUM_OBJECT:
				return validateIfcPermeableCoveringOperationEnumObject((IfcPermeableCoveringOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_PH_MEASURE:
				return validateIfcPHMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_PH_MEASURE_OBJECT:
				return validateIfcPHMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_PHYSICAL_OR_VIRTUAL_ENUM_OBJECT:
				return validateIfcPhysicalOrVirtualEnumObject((IfcPhysicalOrVirtualEnum)value, diagnostics, context);
			case FinalPackage.IFC_PILE_CONSTRUCTION_ENUM_OBJECT:
				return validateIfcPileConstructionEnumObject((IfcPileConstructionEnum)value, diagnostics, context);
			case FinalPackage.IFC_PILE_TYPE_ENUM_OBJECT:
				return validateIfcPileTypeEnumObject((IfcPileTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PIPE_FITTING_TYPE_ENUM_OBJECT:
				return validateIfcPipeFittingTypeEnumObject((IfcPipeFittingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE_ENUM_OBJECT:
				return validateIfcPipeSegmentTypeEnumObject((IfcPipeSegmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PLANAR_FORCE_MEASURE:
				return validateIfcPlanarForceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_PLANAR_FORCE_MEASURE_OBJECT:
				return validateIfcPlanarForceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_PLANE_ANGLE_MEASURE:
				return validateIfcPlaneAngleMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_PLANE_ANGLE_MEASURE_OBJECT:
				return validateIfcPlaneAngleMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_PLATE_TYPE_ENUM_OBJECT:
				return validateIfcPlateTypeEnumObject((IfcPlateTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_POSITIVE_LENGTH_MEASURE:
				return validateIfcPositiveLengthMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_POSITIVE_LENGTH_MEASURE_OBJECT:
				return validateIfcPositiveLengthMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				return validateIfcPositivePlaneAngleMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_POSITIVE_PLANE_ANGLE_MEASURE_OBJECT:
				return validateIfcPositivePlaneAngleMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_POSITIVE_RATIO_MEASURE:
				return validateIfcPositiveRatioMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_POSITIVE_RATIO_MEASURE_OBJECT:
				return validateIfcPositiveRatioMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_POWER_MEASURE:
				return validateIfcPowerMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_POWER_MEASURE_OBJECT:
				return validateIfcPowerMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_PRESENTABLE_TEXT:
				return validateIfcPresentableText((String)value, diagnostics, context);
			case FinalPackage.IFC_PRESSURE_MEASURE:
				return validateIfcPressureMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_PRESSURE_MEASURE_OBJECT:
				return validateIfcPressureMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_PROCEDURE_TYPE_ENUM_OBJECT:
				return validateIfcProcedureTypeEnumObject((IfcProcedureTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROFILE_TYPE_ENUM_OBJECT:
				return validateIfcProfileTypeEnumObject((IfcProfileTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROJECTED_OR_TRUE_LENGTH_ENUM_OBJECT:
				return validateIfcProjectedOrTrueLengthEnumObject((IfcProjectedOrTrueLengthEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROJECT_ORDER_RECORD_TYPE_ENUM_OBJECT:
				return validateIfcProjectOrderRecordTypeEnumObject((IfcProjectOrderRecordTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROJECT_ORDER_TYPE_ENUM_OBJECT:
				return validateIfcProjectOrderTypeEnumObject((IfcProjectOrderTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROPERTY_SOURCE_ENUM_OBJECT:
				return validateIfcPropertySourceEnumObject((IfcPropertySourceEnum)value, diagnostics, context);
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE_ENUM_OBJECT:
				return validateIfcProtectiveDeviceTypeEnumObject((IfcProtectiveDeviceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_PUMP_TYPE_ENUM_OBJECT:
				return validateIfcPumpTypeEnumObject((IfcPumpTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_RADIO_ACTIVITY_MEASURE:
				return validateIfcRadioActivityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_RADIO_ACTIVITY_MEASURE_OBJECT:
				return validateIfcRadioActivityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_RAILING_TYPE_ENUM_OBJECT:
				return validateIfcRailingTypeEnumObject((IfcRailingTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE_ENUM_OBJECT:
				return validateIfcRampFlightTypeEnumObject((IfcRampFlightTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_RAMP_TYPE_ENUM_OBJECT:
				return validateIfcRampTypeEnumObject((IfcRampTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_RATIO_MEASURE:
				return validateIfcRatioMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_RATIO_MEASURE_OBJECT:
				return validateIfcRatioMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_REAL:
				return validateIfcReal((Double)value, diagnostics, context);
			case FinalPackage.IFC_REAL_OBJECT:
				return validateIfcRealObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_REFLECTANCE_METHOD_ENUM_OBJECT:
				return validateIfcReflectanceMethodEnumObject((IfcReflectanceMethodEnum)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCING_BAR_ROLE_ENUM_OBJECT:
				return validateIfcReinforcingBarRoleEnumObject((IfcReinforcingBarRoleEnum)value, diagnostics, context);
			case FinalPackage.IFC_REINFORCING_BAR_SURFACE_ENUM_OBJECT:
				return validateIfcReinforcingBarSurfaceEnumObject((IfcReinforcingBarSurfaceEnum)value, diagnostics, context);
			case FinalPackage.IFC_RESOURCE_CONSUMPTION_ENUM_OBJECT:
				return validateIfcResourceConsumptionEnumObject((IfcResourceConsumptionEnum)value, diagnostics, context);
			case FinalPackage.IFC_RIB_PLATE_DIRECTION_ENUM_OBJECT:
				return validateIfcRibPlateDirectionEnumObject((IfcRibPlateDirectionEnum)value, diagnostics, context);
			case FinalPackage.IFC_ROLE_ENUM_OBJECT:
				return validateIfcRoleEnumObject((IfcRoleEnum)value, diagnostics, context);
			case FinalPackage.IFC_ROOF_TYPE_ENUM_OBJECT:
				return validateIfcRoofTypeEnumObject((IfcRoofTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_ROTATIONAL_FREQUENCY_MEASURE:
				return validateIfcRotationalFrequencyMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ROTATIONAL_FREQUENCY_MEASURE_OBJECT:
				return validateIfcRotationalFrequencyMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ROTATIONAL_MASS_MEASURE:
				return validateIfcRotationalMassMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ROTATIONAL_MASS_MEASURE_OBJECT:
				return validateIfcRotationalMassMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_ROTATIONAL_STIFFNESS_MEASURE:
				return validateIfcRotationalStiffnessMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_ROTATIONAL_STIFFNESS_MEASURE_OBJECT:
				return validateIfcRotationalStiffnessMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE_ENUM_OBJECT:
				return validateIfcSanitaryTerminalTypeEnumObject((IfcSanitaryTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SECOND_IN_MINUTE:
				return validateIfcSecondInMinute((Double)value, diagnostics, context);
			case FinalPackage.IFC_SECOND_IN_MINUTE_OBJECT:
				return validateIfcSecondInMinuteObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				return validateIfcSectionalAreaIntegralMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_SECTIONAL_AREA_INTEGRAL_MEASURE_OBJECT:
				return validateIfcSectionalAreaIntegralMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SECTION_MODULUS_MEASURE:
				return validateIfcSectionModulusMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_SECTION_MODULUS_MEASURE_OBJECT:
				return validateIfcSectionModulusMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SECTION_TYPE_ENUM_OBJECT:
				return validateIfcSectionTypeEnumObject((IfcSectionTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SENSOR_TYPE_ENUM_OBJECT:
				return validateIfcSensorTypeEnumObject((IfcSensorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SEQUENCE_ENUM_OBJECT:
				return validateIfcSequenceEnumObject((IfcSequenceEnum)value, diagnostics, context);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR_TYPE_ENUM_OBJECT:
				return validateIfcServiceLifeFactorTypeEnumObject((IfcServiceLifeFactorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SERVICE_LIFE_TYPE_ENUM_OBJECT:
				return validateIfcServiceLifeTypeEnumObject((IfcServiceLifeTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SHEAR_MODULUS_MEASURE:
				return validateIfcShearModulusMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_SHEAR_MODULUS_MEASURE_OBJECT:
				return validateIfcShearModulusMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SI_PREFIX_OBJECT:
				return validateIfcSIPrefixObject((IfcSIPrefix)value, diagnostics, context);
			case FinalPackage.IFC_SI_UNIT_NAME_OBJECT:
				return validateIfcSIUnitNameObject((IfcSIUnitName)value, diagnostics, context);
			case FinalPackage.IFC_SLAB_TYPE_ENUM_OBJECT:
				return validateIfcSlabTypeEnumObject((IfcSlabTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SOLID_ANGLE_MEASURE:
				return validateIfcSolidAngleMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_SOLID_ANGLE_MEASURE_OBJECT:
				return validateIfcSolidAngleMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_POWER_MEASURE:
				return validateIfcSoundPowerMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_POWER_MEASURE_OBJECT:
				return validateIfcSoundPowerMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_PRESSURE_MEASURE:
				return validateIfcSoundPressureMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_PRESSURE_MEASURE_OBJECT:
				return validateIfcSoundPressureMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SOUND_SCALE_ENUM_OBJECT:
				return validateIfcSoundScaleEnumObject((IfcSoundScaleEnum)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_HEATER_TYPE_ENUM_OBJECT:
				return validateIfcSpaceHeaterTypeEnumObject((IfcSpaceHeaterTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SPACE_TYPE_ENUM_OBJECT:
				return validateIfcSpaceTypeEnumObject((IfcSpaceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				return validateIfcSpecificHeatCapacityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_SPECIFIC_HEAT_CAPACITY_MEASURE_OBJECT:
				return validateIfcSpecificHeatCapacityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SPECULAR_EXPONENT:
				return validateIfcSpecularExponent((Double)value, diagnostics, context);
			case FinalPackage.IFC_SPECULAR_EXPONENT_OBJECT:
				return validateIfcSpecularExponentObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_SPECULAR_ROUGHNESS:
				return validateIfcSpecularRoughness((Double)value, diagnostics, context);
			case FinalPackage.IFC_SPECULAR_ROUGHNESS_OBJECT:
				return validateIfcSpecularRoughnessObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_STACK_TERMINAL_TYPE_ENUM_OBJECT:
				return validateIfcStackTerminalTypeEnumObject((IfcStackTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE_ENUM_OBJECT:
				return validateIfcStairFlightTypeEnumObject((IfcStairFlightTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_STAIR_TYPE_ENUM_OBJECT:
				return validateIfcStairTypeEnumObject((IfcStairTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_STATE_ENUM_OBJECT:
				return validateIfcStateEnumObject((IfcStateEnum)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_CURVE_TYPE_ENUM_OBJECT:
				return validateIfcStructuralCurveTypeEnumObject((IfcStructuralCurveTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_TYPE_ENUM_OBJECT:
				return validateIfcStructuralSurfaceTypeEnumObject((IfcStructuralSurfaceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_SIDE_OBJECT:
				return validateIfcSurfaceSideObject((IfcSurfaceSide)value, diagnostics, context);
			case FinalPackage.IFC_SURFACE_TEXTURE_ENUM_OBJECT:
				return validateIfcSurfaceTextureEnumObject((IfcSurfaceTextureEnum)value, diagnostics, context);
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE_ENUM_OBJECT:
				return validateIfcSwitchingDeviceTypeEnumObject((IfcSwitchingDeviceTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TANK_TYPE_ENUM_OBJECT:
				return validateIfcTankTypeEnumObject((IfcTankTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TEMPERATURE_GRADIENT_MEASURE:
				return validateIfcTemperatureGradientMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_TEMPERATURE_GRADIENT_MEASURE_OBJECT:
				return validateIfcTemperatureGradientMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_TENDON_TYPE_ENUM_OBJECT:
				return validateIfcTendonTypeEnumObject((IfcTendonTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TEXT:
				return validateIfcText((String)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_ALIGNMENT:
				return validateIfcTextAlignment((String)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_DECORATION:
				return validateIfcTextDecoration((String)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_FONT_NAME:
				return validateIfcTextFontName((String)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_PATH_OBJECT:
				return validateIfcTextPathObject((IfcTextPath)value, diagnostics, context);
			case FinalPackage.IFC_TEXT_TRANSFORMATION:
				return validateIfcTextTransformation((String)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_ADMITTANCE_MEASURE:
				return validateIfcThermalAdmittanceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_ADMITTANCE_MEASURE_OBJECT:
				return validateIfcThermalAdmittanceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_CONDUCTIVITY_MEASURE:
				return validateIfcThermalConductivityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_CONDUCTIVITY_MEASURE_OBJECT:
				return validateIfcThermalConductivityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				return validateIfcThermalExpansionCoefficientMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE_OBJECT:
				return validateIfcThermalExpansionCoefficientMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_LOAD_SOURCE_ENUM_OBJECT:
				return validateIfcThermalLoadSourceEnumObject((IfcThermalLoadSourceEnum)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_LOAD_TYPE_ENUM_OBJECT:
				return validateIfcThermalLoadTypeEnumObject((IfcThermalLoadTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_RESISTANCE_MEASURE:
				return validateIfcThermalResistanceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_RESISTANCE_MEASURE_OBJECT:
				return validateIfcThermalResistanceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_TRANSMITTANCE_MEASURE:
				return validateIfcThermalTransmittanceMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMAL_TRANSMITTANCE_MEASURE_OBJECT:
				return validateIfcThermalTransmittanceMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				return validateIfcThermodynamicTemperatureMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_THERMODYNAMIC_TEMPERATURE_MEASURE_OBJECT:
				return validateIfcThermodynamicTemperatureMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_TIME_MEASURE:
				return validateIfcTimeMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_TIME_MEASURE_OBJECT:
				return validateIfcTimeMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES_DATA_TYPE_ENUM_OBJECT:
				return validateIfcTimeSeriesDataTypeEnumObject((IfcTimeSeriesDataTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE_TYPE_ENUM_OBJECT:
				return validateIfcTimeSeriesScheduleTypeEnumObject((IfcTimeSeriesScheduleTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TIME_STAMP:
				return validateIfcTimeStamp((Long)value, diagnostics, context);
			case FinalPackage.IFC_TIME_STAMP_OBJECT:
				return validateIfcTimeStampObject((Long)value, diagnostics, context);
			case FinalPackage.IFC_TORQUE_MEASURE:
				return validateIfcTorqueMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_TORQUE_MEASURE_OBJECT:
				return validateIfcTorqueMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_TRANSFORMER_TYPE_ENUM_OBJECT:
				return validateIfcTransformerTypeEnumObject((IfcTransformerTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TRANSITION_CODE_OBJECT:
				return validateIfcTransitionCodeObject((IfcTransitionCode)value, diagnostics, context);
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE_ENUM_OBJECT:
				return validateIfcTransportElementTypeEnumObject((IfcTransportElementTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_TRIMMING_PREFERENCE_OBJECT:
				return validateIfcTrimmingPreferenceObject((IfcTrimmingPreference)value, diagnostics, context);
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE_ENUM_OBJECT:
				return validateIfcTubeBundleTypeEnumObject((IfcTubeBundleTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE_ENUM_OBJECT:
				return validateIfcUnitaryEquipmentTypeEnumObject((IfcUnitaryEquipmentTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_UNIT_ENUM_OBJECT:
				return validateIfcUnitEnumObject((IfcUnitEnum)value, diagnostics, context);
			case FinalPackage.IFC_VALVE_TYPE_ENUM_OBJECT:
				return validateIfcValveTypeEnumObject((IfcValveTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_VAPOR_PERMEABILITY_MEASURE:
				return validateIfcVaporPermeabilityMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_VAPOR_PERMEABILITY_MEASURE_OBJECT:
				return validateIfcVaporPermeabilityMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE_ENUM_OBJECT:
				return validateIfcVibrationIsolatorTypeEnumObject((IfcVibrationIsolatorTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_VOLUME_MEASURE:
				return validateIfcVolumeMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_VOLUME_MEASURE_OBJECT:
				return validateIfcVolumeMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				return validateIfcVolumetricFlowRateMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_VOLUMETRIC_FLOW_RATE_MEASURE_OBJECT:
				return validateIfcVolumetricFlowRateMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_WALL_TYPE_ENUM_OBJECT:
				return validateIfcWallTypeEnumObject((IfcWallTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_WARPING_CONSTANT_MEASURE:
				return validateIfcWarpingConstantMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_WARPING_CONSTANT_MEASURE_OBJECT:
				return validateIfcWarpingConstantMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_WARPING_MOMENT_MEASURE:
				return validateIfcWarpingMomentMeasure((Double)value, diagnostics, context);
			case FinalPackage.IFC_WARPING_MOMENT_MEASURE_OBJECT:
				return validateIfcWarpingMomentMeasureObject((Double)value, diagnostics, context);
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE_ENUM_OBJECT:
				return validateIfcWasteTerminalTypeEnumObject((IfcWasteTerminalTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_PANEL_OPERATION_ENUM_OBJECT:
				return validateIfcWindowPanelOperationEnumObject((IfcWindowPanelOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_PANEL_POSITION_ENUM_OBJECT:
				return validateIfcWindowPanelPositionEnumObject((IfcWindowPanelPositionEnum)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_STYLE_CONSTRUCTION_ENUM_OBJECT:
				return validateIfcWindowStyleConstructionEnumObject((IfcWindowStyleConstructionEnum)value, diagnostics, context);
			case FinalPackage.IFC_WINDOW_STYLE_OPERATION_ENUM_OBJECT:
				return validateIfcWindowStyleOperationEnumObject((IfcWindowStyleOperationEnum)value, diagnostics, context);
			case FinalPackage.IFC_WORK_CONTROL_TYPE_ENUM_OBJECT:
				return validateIfcWorkControlTypeEnumObject((IfcWorkControlTypeEnum)value, diagnostics, context);
			case FinalPackage.IFC_YEAR_NUMBER:
				return validateIfcYearNumber((Long)value, diagnostics, context);
			case FinalPackage.IFC_YEAR_NUMBER_OBJECT:
				return validateIfcYearNumberObject((Long)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActingRoleType(ActingRoleType actingRoleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actingRoleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActorType(ActorType actorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActualFinishType(ActualFinishType actualFinishType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actualFinishType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActualStartType(ActualStartType actualStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actualStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalConditionsType(AdditionalConditionsType additionalConditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalConditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressesType(AddressesType addressesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressesType1(AddressesType1 addressesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressLinesType(AddressLinesType addressLinesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressLinesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotatedCurveType(AnnotatedCurveType annotatedCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotatedCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicableDatesType(ApplicableDatesType applicableDatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicableDatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicableDateType(ApplicableDateType applicableDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicableDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationDeveloperType(ApplicationDeveloperType applicationDeveloperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationDeveloperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppliedConditionType(AppliedConditionType appliedConditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appliedConditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppliedConditionType1(AppliedConditionType1 appliedConditionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appliedConditionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppliedLoadType(AppliedLoadType appliedLoadType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appliedLoadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppliedValueType(AppliedValueType appliedValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appliedValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovalDateTimeType(ApprovalDateTimeType approvalDateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(approvalDateTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovalType(ApprovalType approvalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(approvalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovalType1(ApprovalType1 approvalType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(approvalType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApprovedPropertiesType(ApprovedPropertiesType approvedPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(approvedPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedItemsType(AssignedItemsType assignedItemsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignedItemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxis1Type(Axis1Type axis1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axis1Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxis2Type(Axis2Type axis2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axis2Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxis3Type(Axis3Type axis3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axis3Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisCurveType(AxisCurveType axisCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axisCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisPositionType(AxisPositionType axisPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axisPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisType(AxisType axisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisType1(AxisType1 axisType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axisType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisType2(AxisType2 axisType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(axisType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBackgroundColourType(BackgroundColourType backgroundColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(backgroundColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseQuantityType(BaseQuantityType baseQuantityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseQuantityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseSurfaceType(BaseSurfaceType baseSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisCurveType(BasisCurveType basisCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basisCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisCurveType1(BasisCurveType1 basisCurveType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basisCurveType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisCurveType2(BasisCurveType2 basisCurveType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basisCurveType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisCurveType3(BasisCurveType3 basisCurveType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basisCurveType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisSurfaceType(BasisSurfaceType basisSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basisSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisSurfaceType1(BasisSurfaceType1 basisSurfaceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basisSurfaceType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasisSurfaceType2(BasisSurfaceType2 basisSurfaceType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basisSurfaceType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBenchmarkValuesType(BenchmarkValuesType benchmarkValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(benchmarkValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundsType(BoundsType boundsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundType(BoundType boundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuildingAddressType(BuildingAddressType buildingAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buildingAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCausedByType(CausedByType causedByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(causedByType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCfsFacesType(CfsFacesType cfsFacesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cfsFacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterSpacingType(CharacterSpacingType characterSpacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characterSpacingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifiedConstraintType(ClassifiedConstraintType classifiedConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifiedConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifiedMaterialType(ClassifiedMaterialType classifiedMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classifiedMaterialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColourAppearanceType(ColourAppearanceType colourAppearanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colourAppearanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColourType(ColourType colourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentOfTotalType(ComponentOfTotalType componentOfTotalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentOfTotalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentsType(ComponentsType componentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionCoordinateSystemType(ConditionCoordinateSystemType conditionCoordinateSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionCoordinateSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionConstraintType(ConnectionConstraintType connectionConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionGeometryType(ConnectionGeometryType connectionGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionGeometryType1(ConnectionGeometryType1 connectionGeometryType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionGeometryType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentsType(ContentsType contentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContextOfItemsType(ContextOfItemsType contextOfItemsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contextOfItemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlPointsListType(ControlPointsListType controlPointsListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlPointsListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionFactorType(ConversionFactorType conversionFactorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionFactorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinatesType(CoordinatesType coordinatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinatesType1(CoordinatesType1 coordinatesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinatesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCornerType(CornerType cornerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cornerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreatingActorType(CreatingActorType creatingActorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creatingActorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreationDateType(CreationDateType creationDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creationDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreationTimeType(CreationTimeType creationTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creationTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreationTimeType1(CreationTimeType1 creationTimeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creationTimeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreatorsType(CreatorsType creatorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creatorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionDateTimeType(CriterionDateTimeType criterionDateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criterionDateTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterionType(CriterionType criterionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criterionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossSectionPositionsType(CrossSectionPositionsType crossSectionPositionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossSectionPositionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossSectionReinforcementDefinitionsType(CrossSectionReinforcementDefinitionsType crossSectionReinforcementDefinitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossSectionReinforcementDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrossSectionsType(CrossSectionsType crossSectionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crossSectionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentValueType(CurrentValueType currentValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentValueType1(CurrentValueType1 currentValueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentValueType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveColourType(CurveColourType curveColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveFontType(CurveFontType curveFontType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveFontType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveFontType1(CurveFontType1 curveFontType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveFontType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveOnRelatedElementType(CurveOnRelatedElementType curveOnRelatedElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveOnRelatedElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveOnRelatingElementType(CurveOnRelatingElementType curveOnRelatingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveOnRelatingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveType(CurveType curveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveWidthType(CurveWidthType curveWidthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveWidthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataValueType(DataValueType dataValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateComponentType(DateComponentType dateComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedUnitType(DefinedUnitType definedUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definedUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinedValuesType(DefinedValuesType definedValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definedValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefiningUnitType(DefiningUnitType definingUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definingUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefiningValuesType(DefiningValuesType definingValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definingValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionType(DefinitionType definitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependantPropertyType(DependantPropertyType dependantPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependantPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependingPropertyType(DependingPropertyType dependingPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependingPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepreciatedValueType(DepreciatedValueType depreciatedValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(depreciatedValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffuseColourType(DiffuseColourType diffuseColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffuseColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffuseReflectionColourType(DiffuseReflectionColourType diffuseReflectionColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffuseReflectionColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffuseTransmissionColourType(DiffuseTransmissionColourType diffuseTransmissionColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffuseTransmissionColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffuseTransmissionColourType1(DiffuseTransmissionColourType1 diffuseTransmissionColourType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffuseTransmissionColourType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionsType(DimensionsType dimensionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dimensionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionRatiosType(DirectionRatiosType directionRatiosType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directionRatiosType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectrixType(DirectrixType directrixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directrixType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectrixType1(DirectrixType1 directrixType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directrixType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirType(DirType dirType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dirType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistributionDataType(DistributionDataType distributionDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distributionDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentOwnerType(DocumentOwnerType documentOwnerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentOwnerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentReferencesType(DocumentReferencesType documentReferencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentReferencesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarlyFinishType(EarlyFinishType earlyFinishType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(earlyFinishType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEarlyStartType(EarlyStartType earlyStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(earlyStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeElementType(EdgeElementType edgeElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edgeElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeEndType(EdgeEndType edgeEndType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edgeEndType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeGeometryType(EdgeGeometryType edgeGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edgeGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeListType(EdgeListType edgeListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edgeListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeListType1(EdgeListType1 edgeListType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edgeListType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeStartType(EdgeStartType edgeStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edgeStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditionDateType(EditionDateType editionDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(editionDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEditorsType(EditorsType editorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(editorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectronicFormatType(ElectronicFormatType electronicFormatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electronicFormatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectronicMailAddressesType(ElectronicMailAddressesType electronicMailAddressesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electronicMailAddressesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementsType(ElementsType elementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementsType1(ElementsType1 elementsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnclosureType(EnclosureType enclosureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enclosureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndProfileType(EndProfileType endProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndTimeType(EndTimeType endTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationReferenceType(EnumerationReferenceType enumerationReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationValuesType(EnumerationValuesType enumerationValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationValuesType1(EnumerationValuesType1 enumerationValuesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationValuesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendedPropertiesType(ExtendedPropertiesType extendedPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendedPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtentType(ExtentType extentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrudedDirectionType(ExtrudedDirectionType extrudedDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extrudedDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtrudedDirectionType1(ExtrudedDirectionType1 extrudedDirectionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extrudedDirectionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaceSurfaceType(FaceSurfaceType faceSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(faceSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacsimileNumbersType(FacsimileNumbersType facsimileNumbersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facsimileNumbersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFbsmFacesType(FbsmFacesType fbsmFacesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fbsmFacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillStylesType(FillStylesType fillStylesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fillStylesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillStyleTargetType(FillStyleTargetType fillStyleTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fillStyleTargetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinishTimeType(FinishTimeType finishTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(finishTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstOperandType(FirstOperandType firstOperandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(firstOperandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedUntilDateType(FixedUntilDateType fixedUntilDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedUntilDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowConditionTimeSeriesType(FlowConditionTimeSeriesType flowConditionTimeSeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowConditionTimeSeriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowrateSingleValueType(FlowrateSingleValueType flowrateSingleValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowrateSingleValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowrateTimeSeriesType(FlowrateTimeSeriesType flowrateTimeSeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowrateTimeSeriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFluidType(FluidType fluidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fluidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFamilyType(FontFamilyType fontFamilyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontFamilyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontSizeType(FontSizeType fontSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fontSizeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForLayerSetType(ForLayerSetType forLayerSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forLayerSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasPropertiesType(HasPropertiesType hasPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hasPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasPropertiesType1(HasPropertiesType1 hasPropertiesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hasPropertiesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasPropertySetsType(HasPropertySetsType hasPropertySetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hasPropertySetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasQuantitiesType(HasQuantitiesType hasQuantitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hasQuantitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasResultsType(HasResultsType hasResultsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hasResultsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHatchLineAppearanceType(HatchLineAppearanceType hatchLineAppearanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hatchLineAppearanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfc2DCompositeCurve(Ifc2DCompositeCurve ifc2DCompositeCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifc2DCompositeCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAbsorbedDoseMeasureType(IfcAbsorbedDoseMeasureType ifcAbsorbedDoseMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAbsorbedDoseMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAccelerationMeasureType(IfcAccelerationMeasureType ifcAccelerationMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAccelerationMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActionRequest(IfcActionRequest ifcActionRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcActionRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActionSourceTypeEnumType(IfcActionSourceTypeEnumType ifcActionSourceTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcActionSourceTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActionTypeEnumType(IfcActionTypeEnumType ifcActionTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcActionTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActor(IfcActor ifcActor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActorRole(IfcActorRole ifcActorRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcActorRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActorSelect(IfcActorSelect ifcActorSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcActorSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActuatorType(IfcActuatorType ifcActuatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcActuatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActuatorTypeEnumType(IfcActuatorTypeEnumType ifcActuatorTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcActuatorTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAddress(IfcAddress ifcAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAddressTypeEnumType(IfcAddressTypeEnumType ifcAddressTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAddressTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAheadOrBehindType(IfcAheadOrBehindType ifcAheadOrBehindType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAheadOrBehindType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirTerminalBoxType(IfcAirTerminalBoxType ifcAirTerminalBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAirTerminalBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirTerminalBoxTypeEnumType(IfcAirTerminalBoxTypeEnumType ifcAirTerminalBoxTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAirTerminalBoxTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirTerminalType(IfcAirTerminalType ifcAirTerminalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAirTerminalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirTerminalTypeEnumType(IfcAirTerminalTypeEnumType ifcAirTerminalTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAirTerminalTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirToAirHeatRecoveryType(IfcAirToAirHeatRecoveryType ifcAirToAirHeatRecoveryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAirToAirHeatRecoveryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirToAirHeatRecoveryTypeEnumType(IfcAirToAirHeatRecoveryTypeEnumType ifcAirToAirHeatRecoveryTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAirToAirHeatRecoveryTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAlarmType(IfcAlarmType ifcAlarmType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAlarmType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAlarmTypeEnumType(IfcAlarmTypeEnumType ifcAlarmTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAlarmTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAmountOfSubstanceMeasureType(IfcAmountOfSubstanceMeasureType ifcAmountOfSubstanceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAmountOfSubstanceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnalysisModelTypeEnumType(IfcAnalysisModelTypeEnumType ifcAnalysisModelTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnalysisModelTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnalysisTheoryTypeEnumType(IfcAnalysisTheoryTypeEnumType ifcAnalysisTheoryTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnalysisTheoryTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAngularDimension(IfcAngularDimension ifcAngularDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAngularDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAngularVelocityMeasureType(IfcAngularVelocityMeasureType ifcAngularVelocityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAngularVelocityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnnotation(IfcAnnotation ifcAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnnotationCurveOccurrence(IfcAnnotationCurveOccurrence ifcAnnotationCurveOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnnotationCurveOccurrence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnnotationFillArea(IfcAnnotationFillArea ifcAnnotationFillArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnnotationFillArea, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnnotationFillAreaOccurrence(IfcAnnotationFillAreaOccurrence ifcAnnotationFillAreaOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnnotationFillAreaOccurrence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnnotationOccurrence(IfcAnnotationOccurrence ifcAnnotationOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnnotationOccurrence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnnotationSurface(IfcAnnotationSurface ifcAnnotationSurface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnnotationSurface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnnotationSurfaceOccurrence(IfcAnnotationSurfaceOccurrence ifcAnnotationSurfaceOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnnotationSurfaceOccurrence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnnotationSymbolOccurrence(IfcAnnotationSymbolOccurrence ifcAnnotationSymbolOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnnotationSymbolOccurrence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnnotationTextOccurrence(IfcAnnotationTextOccurrence ifcAnnotationTextOccurrence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAnnotationTextOccurrence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcApplication(IfcApplication ifcApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAppliedValue(IfcAppliedValue ifcAppliedValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAppliedValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAppliedValueRelationship(IfcAppliedValueRelationship ifcAppliedValueRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAppliedValueRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAppliedValueSelect(IfcAppliedValueSelect ifcAppliedValueSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAppliedValueSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcApproval(IfcApproval ifcApproval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcApproval, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcApprovalActorRelationship(IfcApprovalActorRelationship ifcApprovalActorRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcApprovalActorRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcApprovalPropertyRelationship(IfcApprovalPropertyRelationship ifcApprovalPropertyRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcApprovalPropertyRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcApprovalRelationship(IfcApprovalRelationship ifcApprovalRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcApprovalRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcArbitraryClosedProfileDef(IfcArbitraryClosedProfileDef ifcArbitraryClosedProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcArbitraryClosedProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcArbitraryOpenProfileDef(IfcArbitraryOpenProfileDef ifcArbitraryOpenProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcArbitraryOpenProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcArbitraryProfileDefWithVoids(IfcArbitraryProfileDefWithVoids ifcArbitraryProfileDefWithVoids, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcArbitraryProfileDefWithVoids, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAreaMeasureType(IfcAreaMeasureType ifcAreaMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAreaMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcArithmeticOperatorEnumType(IfcArithmeticOperatorEnumType ifcArithmeticOperatorEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcArithmeticOperatorEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAssemblyPlaceEnumType(IfcAssemblyPlaceEnumType ifcAssemblyPlaceEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAssemblyPlaceEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAsset(IfcAsset ifcAsset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAsset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAsymmetricIShapeProfileDef(IfcAsymmetricIShapeProfileDef ifcAsymmetricIShapeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAsymmetricIShapeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAxis1Placement(IfcAxis1Placement ifcAxis1Placement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAxis1Placement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAxis2Placement(IfcAxis2Placement ifcAxis2Placement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAxis2Placement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAxis2Placement2D(IfcAxis2Placement2D ifcAxis2Placement2D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAxis2Placement2D, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAxis2Placement3D(IfcAxis2Placement3D ifcAxis2Placement3D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcAxis2Placement3D, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBeam(IfcBeam ifcBeam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBeam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBeamType(IfcBeamType ifcBeamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBeamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBeamTypeEnumType(IfcBeamTypeEnumType ifcBeamTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBeamTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBenchmarkEnumType(IfcBenchmarkEnumType ifcBenchmarkEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBenchmarkEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBezierCurve(IfcBezierCurve ifcBezierCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBezierCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBlobTexture(IfcBlobTexture ifcBlobTexture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBlobTexture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBlock(IfcBlock ifcBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoilerType(IfcBoilerType ifcBoilerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoilerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoilerTypeEnumType(IfcBoilerTypeEnumType ifcBoilerTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoilerTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBooleanClippingResult(IfcBooleanClippingResult ifcBooleanClippingResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBooleanClippingResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBooleanOperand(IfcBooleanOperand ifcBooleanOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBooleanOperand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBooleanOperatorType(IfcBooleanOperatorType ifcBooleanOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBooleanOperatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBooleanResult(IfcBooleanResult ifcBooleanResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBooleanResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBooleanType(IfcBooleanType ifcBooleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBooleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoundaryCondition(IfcBoundaryCondition ifcBoundaryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoundaryCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoundaryEdgeCondition(IfcBoundaryEdgeCondition ifcBoundaryEdgeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoundaryEdgeCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoundaryFaceCondition(IfcBoundaryFaceCondition ifcBoundaryFaceCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoundaryFaceCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoundaryNodeCondition(IfcBoundaryNodeCondition ifcBoundaryNodeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoundaryNodeCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoundaryNodeConditionWarping(IfcBoundaryNodeConditionWarping ifcBoundaryNodeConditionWarping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoundaryNodeConditionWarping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoundedCurve(IfcBoundedCurve ifcBoundedCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoundedCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoundedSurface(IfcBoundedSurface ifcBoundedSurface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoundedSurface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoundingBox(IfcBoundingBox ifcBoundingBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoundingBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoxAlignmentType(IfcBoxAlignmentType ifcBoxAlignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoxAlignmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoxedHalfSpace(IfcBoxedHalfSpace ifcBoxedHalfSpace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBoxedHalfSpace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBSplineCurve(IfcBSplineCurve ifcBSplineCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBSplineCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBSplineCurveFormType(IfcBSplineCurveFormType ifcBSplineCurveFormType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBSplineCurveFormType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuilding(IfcBuilding ifcBuilding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBuilding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingElement(IfcBuildingElement ifcBuildingElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBuildingElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingElementComponent(IfcBuildingElementComponent ifcBuildingElementComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBuildingElementComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingElementPart(IfcBuildingElementPart ifcBuildingElementPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBuildingElementPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingElementProxy(IfcBuildingElementProxy ifcBuildingElementProxy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBuildingElementProxy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingElementProxyType(IfcBuildingElementProxyType ifcBuildingElementProxyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBuildingElementProxyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingElementProxyTypeEnumType(IfcBuildingElementProxyTypeEnumType ifcBuildingElementProxyTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBuildingElementProxyTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingElementType(IfcBuildingElementType ifcBuildingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBuildingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingStorey(IfcBuildingStorey ifcBuildingStorey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcBuildingStorey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableCarrierFittingType(IfcCableCarrierFittingType ifcCableCarrierFittingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCableCarrierFittingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableCarrierFittingTypeEnumType(IfcCableCarrierFittingTypeEnumType ifcCableCarrierFittingTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCableCarrierFittingTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableCarrierSegmentType(IfcCableCarrierSegmentType ifcCableCarrierSegmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCableCarrierSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableCarrierSegmentTypeEnumType(IfcCableCarrierSegmentTypeEnumType ifcCableCarrierSegmentTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCableCarrierSegmentTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableSegmentType(IfcCableSegmentType ifcCableSegmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCableSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableSegmentTypeEnumType(IfcCableSegmentTypeEnumType ifcCableSegmentTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCableSegmentTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCalendarDate(IfcCalendarDate ifcCalendarDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCalendarDate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCartesianPoint(IfcCartesianPoint ifcCartesianPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCartesianPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCartesianTransformationOperator(IfcCartesianTransformationOperator ifcCartesianTransformationOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCartesianTransformationOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCartesianTransformationOperator2D(IfcCartesianTransformationOperator2D ifcCartesianTransformationOperator2D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCartesianTransformationOperator2D, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCartesianTransformationOperator2DnonUniform(IfcCartesianTransformationOperator2DnonUniform ifcCartesianTransformationOperator2DnonUniform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCartesianTransformationOperator2DnonUniform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCartesianTransformationOperator3D(IfcCartesianTransformationOperator3D ifcCartesianTransformationOperator3D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCartesianTransformationOperator3D, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCartesianTransformationOperator3DnonUniform(IfcCartesianTransformationOperator3DnonUniform ifcCartesianTransformationOperator3DnonUniform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCartesianTransformationOperator3DnonUniform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCenterLineProfileDef(IfcCenterLineProfileDef ifcCenterLineProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCenterLineProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcChamferEdgeFeature(IfcChamferEdgeFeature ifcChamferEdgeFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcChamferEdgeFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcChangeActionEnumType(IfcChangeActionEnumType ifcChangeActionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcChangeActionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCharacterStyleSelect(IfcCharacterStyleSelect ifcCharacterStyleSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCharacterStyleSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcChillerType(IfcChillerType ifcChillerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcChillerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcChillerTypeEnumType(IfcChillerTypeEnumType ifcChillerTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcChillerTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCircle(IfcCircle ifcCircle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCircle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCircleHollowProfileDef(IfcCircleHollowProfileDef ifcCircleHollowProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCircleHollowProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCircleProfileDef(IfcCircleProfileDef ifcCircleProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCircleProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcClassification(IfcClassification ifcClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcClassification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcClassificationItem(IfcClassificationItem ifcClassificationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcClassificationItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcClassificationItemRelationship(IfcClassificationItemRelationship ifcClassificationItemRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcClassificationItemRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcClassificationNotation(IfcClassificationNotation ifcClassificationNotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcClassificationNotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcClassificationNotationFacet(IfcClassificationNotationFacet ifcClassificationNotationFacet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcClassificationNotationFacet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcClassificationNotationSelect(IfcClassificationNotationSelect ifcClassificationNotationSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcClassificationNotationSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcClassificationReference(IfcClassificationReference ifcClassificationReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcClassificationReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcClosedShell(IfcClosedShell ifcClosedShell, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcClosedShell, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoilType(IfcCoilType ifcCoilType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCoilType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoilTypeEnumType(IfcCoilTypeEnumType ifcCoilTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCoilTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcColour(IfcColour ifcColour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcColour, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcColourOrFactor(IfcColourOrFactor ifcColourOrFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcColourOrFactor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcColourRgb(IfcColourRgb ifcColourRgb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcColourRgb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcColourSpecification(IfcColourSpecification ifcColourSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcColourSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcColumn(IfcColumn ifcColumn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcColumn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcColumnType(IfcColumnType ifcColumnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcColumnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcColumnTypeEnumType(IfcColumnTypeEnumType ifcColumnTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcColumnTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcComplexNumber(IfcComplexNumber ifcComplexNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcComplexNumber, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcComplexNumberType(IfcComplexNumberType ifcComplexNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcComplexNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcComplexProperty(IfcComplexProperty ifcComplexProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcComplexProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCompositeCurve(IfcCompositeCurve ifcCompositeCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCompositeCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCompositeCurveSegment(IfcCompositeCurveSegment ifcCompositeCurveSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCompositeCurveSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCompositeProfileDef(IfcCompositeProfileDef ifcCompositeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCompositeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCompoundPlaneAngleMeasure(IfcCompoundPlaneAngleMeasure ifcCompoundPlaneAngleMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCompoundPlaneAngleMeasure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCompoundPlaneAngleMeasureType(IfcCompoundPlaneAngleMeasureType ifcCompoundPlaneAngleMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCompoundPlaneAngleMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCompressorType(IfcCompressorType ifcCompressorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCompressorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCompressorTypeEnumType(IfcCompressorTypeEnumType ifcCompressorTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCompressorTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCondenserType(IfcCondenserType ifcCondenserType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCondenserType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCondenserTypeEnumType(IfcCondenserTypeEnumType ifcCondenserTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCondenserTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCondition(IfcCondition ifcCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConditionCriterion(IfcConditionCriterion ifcConditionCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConditionCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConditionCriterionSelect(IfcConditionCriterionSelect ifcConditionCriterionSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConditionCriterionSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConic(IfcConic ifcConic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectedFaceSet(IfcConnectedFaceSet ifcConnectedFaceSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConnectedFaceSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectionCurveGeometry(IfcConnectionCurveGeometry ifcConnectionCurveGeometry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConnectionCurveGeometry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectionGeometry(IfcConnectionGeometry ifcConnectionGeometry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConnectionGeometry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectionPointEccentricity(IfcConnectionPointEccentricity ifcConnectionPointEccentricity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConnectionPointEccentricity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectionPointGeometry(IfcConnectionPointGeometry ifcConnectionPointGeometry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConnectionPointGeometry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectionPortGeometry(IfcConnectionPortGeometry ifcConnectionPortGeometry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConnectionPortGeometry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectionSurfaceGeometry(IfcConnectionSurfaceGeometry ifcConnectionSurfaceGeometry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConnectionSurfaceGeometry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectionTypeEnumType(IfcConnectionTypeEnumType ifcConnectionTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConnectionTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstraint(IfcConstraint ifcConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstraintAggregationRelationship(IfcConstraintAggregationRelationship ifcConstraintAggregationRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConstraintAggregationRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstraintClassificationRelationship(IfcConstraintClassificationRelationship ifcConstraintClassificationRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConstraintClassificationRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstraintEnumType(IfcConstraintEnumType ifcConstraintEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConstraintEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstraintRelationship(IfcConstraintRelationship ifcConstraintRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConstraintRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstructionEquipmentResource(IfcConstructionEquipmentResource ifcConstructionEquipmentResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConstructionEquipmentResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstructionMaterialResource(IfcConstructionMaterialResource ifcConstructionMaterialResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConstructionMaterialResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstructionProductResource(IfcConstructionProductResource ifcConstructionProductResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConstructionProductResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstructionResource(IfcConstructionResource ifcConstructionResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConstructionResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcContextDependentMeasureType(IfcContextDependentMeasureType ifcContextDependentMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcContextDependentMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcContextDependentUnit(IfcContextDependentUnit ifcContextDependentUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcContextDependentUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcControl(IfcControl ifcControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcControllerType(IfcControllerType ifcControllerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcControllerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcControllerTypeEnumType(IfcControllerTypeEnumType ifcControllerTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcControllerTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConversionBasedUnit(IfcConversionBasedUnit ifcConversionBasedUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcConversionBasedUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCooledBeamType(IfcCooledBeamType ifcCooledBeamType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCooledBeamType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCooledBeamTypeEnumType(IfcCooledBeamTypeEnumType ifcCooledBeamTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCooledBeamTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoolingTowerType(IfcCoolingTowerType ifcCoolingTowerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCoolingTowerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoolingTowerTypeEnumType(IfcCoolingTowerTypeEnumType ifcCoolingTowerTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCoolingTowerTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoordinatedUniversalTimeOffset(IfcCoordinatedUniversalTimeOffset ifcCoordinatedUniversalTimeOffset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCoordinatedUniversalTimeOffset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCostItem(IfcCostItem ifcCostItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCostItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCostSchedule(IfcCostSchedule ifcCostSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCostSchedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCostScheduleTypeEnumType(IfcCostScheduleTypeEnumType ifcCostScheduleTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCostScheduleTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCostValue(IfcCostValue ifcCostValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCostValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCountMeasureType(IfcCountMeasureType ifcCountMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCountMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCovering(IfcCovering ifcCovering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCovering, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoveringType(IfcCoveringType ifcCoveringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCoveringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoveringTypeEnumType(IfcCoveringTypeEnumType ifcCoveringTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCoveringTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCraneRailAShapeProfileDef(IfcCraneRailAShapeProfileDef ifcCraneRailAShapeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCraneRailAShapeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCraneRailFShapeProfileDef(IfcCraneRailFShapeProfileDef ifcCraneRailFShapeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCraneRailFShapeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCrewResource(IfcCrewResource ifcCrewResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCrewResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCsgPrimitive3D(IfcCsgPrimitive3D ifcCsgPrimitive3D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCsgPrimitive3D, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCsgSelect(IfcCsgSelect ifcCsgSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCsgSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCsgSolid(IfcCsgSolid ifcCsgSolid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCsgSolid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCShapeProfileDef(IfcCShapeProfileDef ifcCShapeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCShapeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurrencyEnumType(IfcCurrencyEnumType ifcCurrencyEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurrencyEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurrencyRelationship(IfcCurrencyRelationship ifcCurrencyRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurrencyRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurtainWall(IfcCurtainWall ifcCurtainWall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurtainWall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurtainWallType(IfcCurtainWallType ifcCurtainWallType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurtainWallType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurtainWallTypeEnumType(IfcCurtainWallTypeEnumType ifcCurtainWallTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurtainWallTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurvatureMeasureType(IfcCurvatureMeasureType ifcCurvatureMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurvatureMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurve(IfcCurve ifcCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurveBoundedPlane(IfcCurveBoundedPlane ifcCurveBoundedPlane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurveBoundedPlane, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurveFontOrScaledCurveFontSelect(IfcCurveFontOrScaledCurveFontSelect ifcCurveFontOrScaledCurveFontSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurveFontOrScaledCurveFontSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurveOrEdgeCurve(IfcCurveOrEdgeCurve ifcCurveOrEdgeCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurveOrEdgeCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurveStyle(IfcCurveStyle ifcCurveStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurveStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurveStyleFont(IfcCurveStyleFont ifcCurveStyleFont, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurveStyleFont, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurveStyleFontAndScaling(IfcCurveStyleFontAndScaling ifcCurveStyleFontAndScaling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurveStyleFontAndScaling, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurveStyleFontPattern(IfcCurveStyleFontPattern ifcCurveStyleFontPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurveStyleFontPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurveStyleFontSelect(IfcCurveStyleFontSelect ifcCurveStyleFontSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcCurveStyleFontSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDamperType(IfcDamperType ifcDamperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDamperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDamperTypeEnumType(IfcDamperTypeEnumType ifcDamperTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDamperTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDataOriginEnumType(IfcDataOriginEnumType ifcDataOriginEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDataOriginEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDateAndTime(IfcDateAndTime ifcDateAndTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDateAndTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDateTimeSelect(IfcDateTimeSelect ifcDateTimeSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDateTimeSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDayInMonthNumberType(IfcDayInMonthNumberType ifcDayInMonthNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDayInMonthNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDaylightSavingHourType(IfcDaylightSavingHourType ifcDaylightSavingHourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDaylightSavingHourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDefinedSymbol(IfcDefinedSymbol ifcDefinedSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDefinedSymbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDefinedSymbolSelect(IfcDefinedSymbolSelect ifcDefinedSymbolSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDefinedSymbolSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDerivedMeasureValue(IfcDerivedMeasureValue ifcDerivedMeasureValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDerivedMeasureValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDerivedProfileDef(IfcDerivedProfileDef ifcDerivedProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDerivedProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDerivedUnit(IfcDerivedUnit ifcDerivedUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDerivedUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDerivedUnitElement(IfcDerivedUnitElement ifcDerivedUnitElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDerivedUnitElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDerivedUnitEnumType(IfcDerivedUnitEnumType ifcDerivedUnitEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDerivedUnitEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDescriptiveMeasureType(IfcDescriptiveMeasureType ifcDescriptiveMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDescriptiveMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDiameterDimension(IfcDiameterDimension ifcDiameterDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDiameterDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionalExponents(IfcDimensionalExponents ifcDimensionalExponents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDimensionalExponents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionCalloutRelationship(IfcDimensionCalloutRelationship ifcDimensionCalloutRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDimensionCalloutRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionCountType(IfcDimensionCountType ifcDimensionCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDimensionCountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionCurve(IfcDimensionCurve ifcDimensionCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDimensionCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionCurveDirectedCallout(IfcDimensionCurveDirectedCallout ifcDimensionCurveDirectedCallout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDimensionCurveDirectedCallout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionCurveTerminator(IfcDimensionCurveTerminator ifcDimensionCurveTerminator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDimensionCurveTerminator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionExtentUsageType(IfcDimensionExtentUsageType ifcDimensionExtentUsageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDimensionExtentUsageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionPair(IfcDimensionPair ifcDimensionPair, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDimensionPair, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDirection(IfcDirection ifcDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDirection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDirectionSenseEnumType(IfcDirectionSenseEnumType ifcDirectionSenseEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDirectionSenseEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDiscreteAccessory(IfcDiscreteAccessory ifcDiscreteAccessory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDiscreteAccessory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDiscreteAccessoryType(IfcDiscreteAccessoryType ifcDiscreteAccessoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDiscreteAccessoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionChamberElement(IfcDistributionChamberElement ifcDistributionChamberElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionChamberElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionChamberElementType(IfcDistributionChamberElementType ifcDistributionChamberElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionChamberElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionChamberElementTypeEnumType(IfcDistributionChamberElementTypeEnumType ifcDistributionChamberElementTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionChamberElementTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionControlElement(IfcDistributionControlElement ifcDistributionControlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionControlElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionControlElementType(IfcDistributionControlElementType ifcDistributionControlElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionControlElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionElement(IfcDistributionElement ifcDistributionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionElementType(IfcDistributionElementType ifcDistributionElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionFlowElement(IfcDistributionFlowElement ifcDistributionFlowElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionFlowElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionFlowElementType(IfcDistributionFlowElementType ifcDistributionFlowElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionFlowElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionPort(IfcDistributionPort ifcDistributionPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDistributionPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentConfidentialityEnumType(IfcDocumentConfidentialityEnumType ifcDocumentConfidentialityEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDocumentConfidentialityEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentElectronicFormat(IfcDocumentElectronicFormat ifcDocumentElectronicFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDocumentElectronicFormat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentInformation(IfcDocumentInformation ifcDocumentInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDocumentInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentInformationRelationship(IfcDocumentInformationRelationship ifcDocumentInformationRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDocumentInformationRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentReference(IfcDocumentReference ifcDocumentReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDocumentReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentSelect(IfcDocumentSelect ifcDocumentSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDocumentSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentStatusEnumType(IfcDocumentStatusEnumType ifcDocumentStatusEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDocumentStatusEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoor(IfcDoor ifcDoor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDoor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorLiningProperties(IfcDoorLiningProperties ifcDoorLiningProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDoorLiningProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorPanelOperationEnumType(IfcDoorPanelOperationEnumType ifcDoorPanelOperationEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDoorPanelOperationEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorPanelPositionEnumType(IfcDoorPanelPositionEnumType ifcDoorPanelPositionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDoorPanelPositionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorPanelProperties(IfcDoorPanelProperties ifcDoorPanelProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDoorPanelProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorStyle(IfcDoorStyle ifcDoorStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDoorStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorStyleConstructionEnumType(IfcDoorStyleConstructionEnumType ifcDoorStyleConstructionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDoorStyleConstructionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorStyleOperationEnumType(IfcDoorStyleOperationEnumType ifcDoorStyleOperationEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDoorStyleOperationEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoseEquivalentMeasureType(IfcDoseEquivalentMeasureType ifcDoseEquivalentMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDoseEquivalentMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDraughtingCallout(IfcDraughtingCallout ifcDraughtingCallout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDraughtingCallout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDraughtingCalloutElement(IfcDraughtingCalloutElement ifcDraughtingCalloutElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDraughtingCalloutElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDraughtingCalloutRelationship(IfcDraughtingCalloutRelationship ifcDraughtingCalloutRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDraughtingCalloutRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDraughtingPreDefinedColour(IfcDraughtingPreDefinedColour ifcDraughtingPreDefinedColour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDraughtingPreDefinedColour, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDraughtingPreDefinedCurveFont(IfcDraughtingPreDefinedCurveFont ifcDraughtingPreDefinedCurveFont, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDraughtingPreDefinedCurveFont, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDraughtingPreDefinedTextFont(IfcDraughtingPreDefinedTextFont ifcDraughtingPreDefinedTextFont, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDraughtingPreDefinedTextFont, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctFittingType(IfcDuctFittingType ifcDuctFittingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDuctFittingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctFittingTypeEnumType(IfcDuctFittingTypeEnumType ifcDuctFittingTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDuctFittingTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctSegmentType(IfcDuctSegmentType ifcDuctSegmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDuctSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctSegmentTypeEnumType(IfcDuctSegmentTypeEnumType ifcDuctSegmentTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDuctSegmentTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctSilencerType(IfcDuctSilencerType ifcDuctSilencerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDuctSilencerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctSilencerTypeEnumType(IfcDuctSilencerTypeEnumType ifcDuctSilencerTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDuctSilencerTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDynamicViscosityMeasureType(IfcDynamicViscosityMeasureType ifcDynamicViscosityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcDynamicViscosityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEdge(IfcEdge ifcEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEdgeCurve(IfcEdgeCurve ifcEdgeCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEdgeCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEdgeFeature(IfcEdgeFeature ifcEdgeFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEdgeFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEdgeLoop(IfcEdgeLoop ifcEdgeLoop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEdgeLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricalBaseProperties(IfcElectricalBaseProperties ifcElectricalBaseProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricalBaseProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricalCircuit(IfcElectricalCircuit ifcElectricalCircuit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricalCircuit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricalElement(IfcElectricalElement ifcElectricalElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricalElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricApplianceType(IfcElectricApplianceType ifcElectricApplianceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricApplianceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricApplianceTypeEnumType(IfcElectricApplianceTypeEnumType ifcElectricApplianceTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricApplianceTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricCapacitanceMeasureType(IfcElectricCapacitanceMeasureType ifcElectricCapacitanceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricCapacitanceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricChargeMeasureType(IfcElectricChargeMeasureType ifcElectricChargeMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricChargeMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricConductanceMeasureType(IfcElectricConductanceMeasureType ifcElectricConductanceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricConductanceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricCurrentEnumType(IfcElectricCurrentEnumType ifcElectricCurrentEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricCurrentEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricCurrentMeasureType(IfcElectricCurrentMeasureType ifcElectricCurrentMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricCurrentMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricDistributionPoint(IfcElectricDistributionPoint ifcElectricDistributionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricDistributionPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricDistributionPointFunctionEnumType(IfcElectricDistributionPointFunctionEnumType ifcElectricDistributionPointFunctionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricDistributionPointFunctionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricFlowStorageDeviceType(IfcElectricFlowStorageDeviceType ifcElectricFlowStorageDeviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricFlowStorageDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricFlowStorageDeviceTypeEnumType(IfcElectricFlowStorageDeviceTypeEnumType ifcElectricFlowStorageDeviceTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricFlowStorageDeviceTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricGeneratorType(IfcElectricGeneratorType ifcElectricGeneratorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricGeneratorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricGeneratorTypeEnumType(IfcElectricGeneratorTypeEnumType ifcElectricGeneratorTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricGeneratorTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricHeaterType(IfcElectricHeaterType ifcElectricHeaterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricHeaterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricHeaterTypeEnumType(IfcElectricHeaterTypeEnumType ifcElectricHeaterTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricHeaterTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricMotorType(IfcElectricMotorType ifcElectricMotorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricMotorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricMotorTypeEnumType(IfcElectricMotorTypeEnumType ifcElectricMotorTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricMotorTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricResistanceMeasureType(IfcElectricResistanceMeasureType ifcElectricResistanceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricResistanceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricTimeControlType(IfcElectricTimeControlType ifcElectricTimeControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricTimeControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricTimeControlTypeEnumType(IfcElectricTimeControlTypeEnumType ifcElectricTimeControlTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricTimeControlTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricVoltageMeasureType(IfcElectricVoltageMeasureType ifcElectricVoltageMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElectricVoltageMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElement(IfcElement ifcElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementarySurface(IfcElementarySurface ifcElementarySurface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElementarySurface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementAssembly(IfcElementAssembly ifcElementAssembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElementAssembly, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementAssemblyTypeEnumType(IfcElementAssemblyTypeEnumType ifcElementAssemblyTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElementAssemblyTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementComponent(IfcElementComponent ifcElementComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElementComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementComponentType(IfcElementComponentType ifcElementComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElementComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementCompositionEnumType(IfcElementCompositionEnumType ifcElementCompositionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElementCompositionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementQuantity(IfcElementQuantity ifcElementQuantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElementQuantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementType(IfcElementType ifcElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEllipse(IfcEllipse ifcEllipse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEllipse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEllipseProfileDef(IfcEllipseProfileDef ifcEllipseProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEllipseProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnergyConversionDevice(IfcEnergyConversionDevice ifcEnergyConversionDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEnergyConversionDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnergyConversionDeviceType(IfcEnergyConversionDeviceType ifcEnergyConversionDeviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEnergyConversionDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnergyMeasureType(IfcEnergyMeasureType ifcEnergyMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEnergyMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnergyProperties(IfcEnergyProperties ifcEnergyProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEnergyProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnergySequenceEnumType(IfcEnergySequenceEnumType ifcEnergySequenceEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEnergySequenceEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnvironmentalImpactCategoryEnumType(IfcEnvironmentalImpactCategoryEnumType ifcEnvironmentalImpactCategoryEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEnvironmentalImpactCategoryEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnvironmentalImpactValue(IfcEnvironmentalImpactValue ifcEnvironmentalImpactValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEnvironmentalImpactValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEquipmentElement(IfcEquipmentElement ifcEquipmentElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEquipmentElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEquipmentStandard(IfcEquipmentStandard ifcEquipmentStandard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEquipmentStandard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEvaporativeCoolerType(IfcEvaporativeCoolerType ifcEvaporativeCoolerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEvaporativeCoolerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEvaporativeCoolerTypeEnumType(IfcEvaporativeCoolerTypeEnumType ifcEvaporativeCoolerTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEvaporativeCoolerTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEvaporatorType(IfcEvaporatorType ifcEvaporatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEvaporatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEvaporatorTypeEnumType(IfcEvaporatorTypeEnumType ifcEvaporatorTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcEvaporatorTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcExtendedMaterialProperties(IfcExtendedMaterialProperties ifcExtendedMaterialProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcExtendedMaterialProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcExternallyDefinedHatchStyle(IfcExternallyDefinedHatchStyle ifcExternallyDefinedHatchStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcExternallyDefinedHatchStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcExternallyDefinedSurfaceStyle(IfcExternallyDefinedSurfaceStyle ifcExternallyDefinedSurfaceStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcExternallyDefinedSurfaceStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcExternallyDefinedSymbol(IfcExternallyDefinedSymbol ifcExternallyDefinedSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcExternallyDefinedSymbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcExternallyDefinedTextFont(IfcExternallyDefinedTextFont ifcExternallyDefinedTextFont, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcExternallyDefinedTextFont, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcExternalReference(IfcExternalReference ifcExternalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcExternalReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcExtrudedAreaSolid(IfcExtrudedAreaSolid ifcExtrudedAreaSolid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcExtrudedAreaSolid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFace(IfcFace ifcFace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFaceBasedSurfaceModel(IfcFaceBasedSurfaceModel ifcFaceBasedSurfaceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFaceBasedSurfaceModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFaceBound(IfcFaceBound ifcFaceBound, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFaceBound, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFaceOuterBound(IfcFaceOuterBound ifcFaceOuterBound, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFaceOuterBound, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFaceSurface(IfcFaceSurface ifcFaceSurface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFaceSurface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFacetedBrep(IfcFacetedBrep ifcFacetedBrep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFacetedBrep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFacetedBrepWithVoids(IfcFacetedBrepWithVoids ifcFacetedBrepWithVoids, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFacetedBrepWithVoids, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFailureConnectionCondition(IfcFailureConnectionCondition ifcFailureConnectionCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFailureConnectionCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFanType(IfcFanType ifcFanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFanTypeEnumType(IfcFanTypeEnumType ifcFanTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFanTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFastener(IfcFastener ifcFastener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFastener, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFastenerType(IfcFastenerType ifcFastenerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFastenerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFeatureElement(IfcFeatureElement ifcFeatureElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFeatureElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFeatureElementAddition(IfcFeatureElementAddition ifcFeatureElementAddition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFeatureElementAddition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFeatureElementSubtraction(IfcFeatureElementSubtraction ifcFeatureElementSubtraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFeatureElementSubtraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFillAreaStyle(IfcFillAreaStyle ifcFillAreaStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFillAreaStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFillAreaStyleHatching(IfcFillAreaStyleHatching ifcFillAreaStyleHatching, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFillAreaStyleHatching, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFillAreaStyleTiles(IfcFillAreaStyleTiles ifcFillAreaStyleTiles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFillAreaStyleTiles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFillAreaStyleTileShapeSelect(IfcFillAreaStyleTileShapeSelect ifcFillAreaStyleTileShapeSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFillAreaStyleTileShapeSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFillAreaStyleTileSymbolWithStyle(IfcFillAreaStyleTileSymbolWithStyle ifcFillAreaStyleTileSymbolWithStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFillAreaStyleTileSymbolWithStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFillStyleSelect(IfcFillStyleSelect ifcFillStyleSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFillStyleSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFilterType(IfcFilterType ifcFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFilterTypeEnumType(IfcFilterTypeEnumType ifcFilterTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFilterTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFireSuppressionTerminalType(IfcFireSuppressionTerminalType ifcFireSuppressionTerminalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFireSuppressionTerminalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFireSuppressionTerminalTypeEnumType(IfcFireSuppressionTerminalTypeEnumType ifcFireSuppressionTerminalTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFireSuppressionTerminalTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowController(IfcFlowController ifcFlowController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowController, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowControllerType(IfcFlowControllerType ifcFlowControllerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowControllerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowDirectionEnumType(IfcFlowDirectionEnumType ifcFlowDirectionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowDirectionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowFitting(IfcFlowFitting ifcFlowFitting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowFitting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowFittingType(IfcFlowFittingType ifcFlowFittingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowFittingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowInstrumentType(IfcFlowInstrumentType ifcFlowInstrumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowInstrumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowInstrumentTypeEnumType(IfcFlowInstrumentTypeEnumType ifcFlowInstrumentTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowInstrumentTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowMeterType(IfcFlowMeterType ifcFlowMeterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowMeterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowMeterTypeEnumType(IfcFlowMeterTypeEnumType ifcFlowMeterTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowMeterTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowMovingDevice(IfcFlowMovingDevice ifcFlowMovingDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowMovingDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowMovingDeviceType(IfcFlowMovingDeviceType ifcFlowMovingDeviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowMovingDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowSegment(IfcFlowSegment ifcFlowSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowSegmentType(IfcFlowSegmentType ifcFlowSegmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowStorageDevice(IfcFlowStorageDevice ifcFlowStorageDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowStorageDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowStorageDeviceType(IfcFlowStorageDeviceType ifcFlowStorageDeviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowStorageDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowTerminal(IfcFlowTerminal ifcFlowTerminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowTerminal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowTerminalType(IfcFlowTerminalType ifcFlowTerminalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowTerminalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowTreatmentDevice(IfcFlowTreatmentDevice ifcFlowTreatmentDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowTreatmentDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowTreatmentDeviceType(IfcFlowTreatmentDeviceType ifcFlowTreatmentDeviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFlowTreatmentDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFluidFlowProperties(IfcFluidFlowProperties ifcFluidFlowProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFluidFlowProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFontStyleType(IfcFontStyleType ifcFontStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFontStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFontVariantType(IfcFontVariantType ifcFontVariantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFontVariantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFontWeightType(IfcFontWeightType ifcFontWeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFontWeightType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFooting(IfcFooting ifcFooting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFooting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFootingTypeEnumType(IfcFootingTypeEnumType ifcFootingTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFootingTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcForceMeasureType(IfcForceMeasureType ifcForceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcForceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFrequencyMeasureType(IfcFrequencyMeasureType ifcFrequencyMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFrequencyMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFuelProperties(IfcFuelProperties ifcFuelProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFuelProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFurnishingElement(IfcFurnishingElement ifcFurnishingElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFurnishingElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFurnishingElementType(IfcFurnishingElementType ifcFurnishingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFurnishingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFurnitureStandard(IfcFurnitureStandard ifcFurnitureStandard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFurnitureStandard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFurnitureType(IfcFurnitureType ifcFurnitureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcFurnitureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGasTerminalType(IfcGasTerminalType ifcGasTerminalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGasTerminalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGasTerminalTypeEnumType(IfcGasTerminalTypeEnumType ifcGasTerminalTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGasTerminalTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeneralMaterialProperties(IfcGeneralMaterialProperties ifcGeneralMaterialProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeneralMaterialProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeneralProfileProperties(IfcGeneralProfileProperties ifcGeneralProfileProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeneralProfileProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricCurveSet(IfcGeometricCurveSet ifcGeometricCurveSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeometricCurveSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricProjectionEnumType(IfcGeometricProjectionEnumType ifcGeometricProjectionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeometricProjectionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricRepresentationContext(IfcGeometricRepresentationContext ifcGeometricRepresentationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeometricRepresentationContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricRepresentationItem(IfcGeometricRepresentationItem ifcGeometricRepresentationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeometricRepresentationItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricRepresentationSubContext(IfcGeometricRepresentationSubContext ifcGeometricRepresentationSubContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeometricRepresentationSubContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricRepresentationSubContextTemp(IfcGeometricRepresentationSubContextTemp ifcGeometricRepresentationSubContextTemp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeometricRepresentationSubContextTemp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricSet(IfcGeometricSet ifcGeometricSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeometricSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricSetSelect(IfcGeometricSetSelect ifcGeometricSetSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGeometricSetSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGloballyUniqueIdType(IfcGloballyUniqueIdType ifcGloballyUniqueIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGloballyUniqueIdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGlobalOrLocalEnumType(IfcGlobalOrLocalEnumType ifcGlobalOrLocalEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGlobalOrLocalEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGrid(IfcGrid ifcGrid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGrid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGridAxis(IfcGridAxis ifcGridAxis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGridAxis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGridPlacement(IfcGridPlacement ifcGridPlacement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGridPlacement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGroup(IfcGroup ifcGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHalfSpaceSolid(IfcHalfSpaceSolid ifcHalfSpaceSolid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHalfSpaceSolid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHatchLineDistanceSelect(IfcHatchLineDistanceSelect ifcHatchLineDistanceSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHatchLineDistanceSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatExchangerType(IfcHeatExchangerType ifcHeatExchangerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHeatExchangerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatExchangerTypeEnumType(IfcHeatExchangerTypeEnumType ifcHeatExchangerTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHeatExchangerTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatFluxDensityMeasureType(IfcHeatFluxDensityMeasureType ifcHeatFluxDensityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHeatFluxDensityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatingValueMeasureType(IfcHeatingValueMeasureType ifcHeatingValueMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHeatingValueMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHourInDayType(IfcHourInDayType ifcHourInDayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHourInDayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHumidifierType(IfcHumidifierType ifcHumidifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHumidifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHumidifierTypeEnumType(IfcHumidifierTypeEnumType ifcHumidifierTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHumidifierTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHygroscopicMaterialProperties(IfcHygroscopicMaterialProperties ifcHygroscopicMaterialProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcHygroscopicMaterialProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIdentifierType(IfcIdentifierType ifcIdentifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcIdentifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIlluminanceMeasureType(IfcIlluminanceMeasureType ifcIlluminanceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcIlluminanceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcImageTexture(IfcImageTexture ifcImageTexture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcImageTexture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInductanceMeasureType(IfcInductanceMeasureType ifcInductanceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcInductanceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIntegerCountRateMeasureType(IfcIntegerCountRateMeasureType ifcIntegerCountRateMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcIntegerCountRateMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIntegerType(IfcIntegerType ifcIntegerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInternalOrExternalEnumType(IfcInternalOrExternalEnumType ifcInternalOrExternalEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcInternalOrExternalEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInventory(IfcInventory ifcInventory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcInventory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInventoryTypeEnumType(IfcInventoryTypeEnumType ifcInventoryTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcInventoryTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIonConcentrationMeasureType(IfcIonConcentrationMeasureType ifcIonConcentrationMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcIonConcentrationMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIrregularTimeSeries(IfcIrregularTimeSeries ifcIrregularTimeSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcIrregularTimeSeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIrregularTimeSeriesValue(IfcIrregularTimeSeriesValue ifcIrregularTimeSeriesValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcIrregularTimeSeriesValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIShapeProfileDef(IfcIShapeProfileDef ifcIShapeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcIShapeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIsothermalMoistureCapacityMeasureType(IfcIsothermalMoistureCapacityMeasureType ifcIsothermalMoistureCapacityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcIsothermalMoistureCapacityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcJunctionBoxType(IfcJunctionBoxType ifcJunctionBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcJunctionBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcJunctionBoxTypeEnumType(IfcJunctionBoxTypeEnumType ifcJunctionBoxTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcJunctionBoxTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcKinematicViscosityMeasureType(IfcKinematicViscosityMeasureType ifcKinematicViscosityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcKinematicViscosityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLabelType(IfcLabelType ifcLabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLaborResource(IfcLaborResource ifcLaborResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLaborResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLampType(IfcLampType ifcLampType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLampType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLampTypeEnumType(IfcLampTypeEnumType ifcLampTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLampTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLayeredItem(IfcLayeredItem ifcLayeredItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLayeredItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLayerSetDirectionEnumType(IfcLayerSetDirectionEnumType ifcLayerSetDirectionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLayerSetDirectionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLengthMeasureType(IfcLengthMeasureType ifcLengthMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLengthMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLibraryInformation(IfcLibraryInformation ifcLibraryInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLibraryInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLibraryReference(IfcLibraryReference ifcLibraryReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLibraryReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLibrarySelect(IfcLibrarySelect ifcLibrarySelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLibrarySelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightDistributionCurveEnumType(IfcLightDistributionCurveEnumType ifcLightDistributionCurveEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightDistributionCurveEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightDistributionData(IfcLightDistributionData ifcLightDistributionData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightDistributionData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightDistributionDataSourceSelect(IfcLightDistributionDataSourceSelect ifcLightDistributionDataSourceSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightDistributionDataSourceSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightEmissionSourceEnumType(IfcLightEmissionSourceEnumType ifcLightEmissionSourceEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightEmissionSourceEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightFixtureType(IfcLightFixtureType ifcLightFixtureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightFixtureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightFixtureTypeEnumType(IfcLightFixtureTypeEnumType ifcLightFixtureTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightFixtureTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightIntensityDistribution(IfcLightIntensityDistribution ifcLightIntensityDistribution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightIntensityDistribution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightSource(IfcLightSource ifcLightSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightSourceAmbient(IfcLightSourceAmbient ifcLightSourceAmbient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightSourceAmbient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightSourceDirectional(IfcLightSourceDirectional ifcLightSourceDirectional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightSourceDirectional, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightSourceGoniometric(IfcLightSourceGoniometric ifcLightSourceGoniometric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightSourceGoniometric, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightSourcePositional(IfcLightSourcePositional ifcLightSourcePositional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightSourcePositional, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightSourceSpot(IfcLightSourceSpot ifcLightSourceSpot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLightSourceSpot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLine(IfcLine ifcLine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearDimension(IfcLinearDimension ifcLinearDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLinearDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearForceMeasureType(IfcLinearForceMeasureType ifcLinearForceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLinearForceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearMomentMeasureType(IfcLinearMomentMeasureType ifcLinearMomentMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLinearMomentMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearStiffnessMeasureType(IfcLinearStiffnessMeasureType ifcLinearStiffnessMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLinearStiffnessMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearVelocityMeasureType(IfcLinearVelocityMeasureType ifcLinearVelocityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLinearVelocityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLoadGroupTypeEnumType(IfcLoadGroupTypeEnumType ifcLoadGroupTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLoadGroupTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLocalPlacement(IfcLocalPlacement ifcLocalPlacement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLocalPlacement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLocalTime(IfcLocalTime ifcLocalTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLocalTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLogicalOperatorEnumType(IfcLogicalOperatorEnumType ifcLogicalOperatorEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLogicalOperatorEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLogicalType(IfcLogicalType ifcLogicalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLogicalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLoop(IfcLoop ifcLoop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLShapeProfileDef(IfcLShapeProfileDef ifcLShapeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLShapeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLuminousFluxMeasureType(IfcLuminousFluxMeasureType ifcLuminousFluxMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLuminousFluxMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLuminousIntensityDistributionMeasureType(IfcLuminousIntensityDistributionMeasureType ifcLuminousIntensityDistributionMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLuminousIntensityDistributionMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLuminousIntensityMeasureType(IfcLuminousIntensityMeasureType ifcLuminousIntensityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcLuminousIntensityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMagneticFluxDensityMeasureType(IfcMagneticFluxDensityMeasureType ifcMagneticFluxDensityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMagneticFluxDensityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMagneticFluxMeasureType(IfcMagneticFluxMeasureType ifcMagneticFluxMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMagneticFluxMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcManifoldSolidBrep(IfcManifoldSolidBrep ifcManifoldSolidBrep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcManifoldSolidBrep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMappedItem(IfcMappedItem ifcMappedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMappedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassDensityMeasureType(IfcMassDensityMeasureType ifcMassDensityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMassDensityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassFlowRateMeasureType(IfcMassFlowRateMeasureType ifcMassFlowRateMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMassFlowRateMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassMeasureType(IfcMassMeasureType ifcMassMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMassMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassPerLengthMeasureType(IfcMassPerLengthMeasureType ifcMassPerLengthMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMassPerLengthMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMaterial(IfcMaterial ifcMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMaterial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMaterialClassificationRelationship(IfcMaterialClassificationRelationship ifcMaterialClassificationRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMaterialClassificationRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMaterialDefinitionRepresentation(IfcMaterialDefinitionRepresentation ifcMaterialDefinitionRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMaterialDefinitionRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMaterialLayer(IfcMaterialLayer ifcMaterialLayer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMaterialLayer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMaterialLayerSet(IfcMaterialLayerSet ifcMaterialLayerSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMaterialLayerSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMaterialLayerSetUsage(IfcMaterialLayerSetUsage ifcMaterialLayerSetUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMaterialLayerSetUsage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMaterialList(IfcMaterialList ifcMaterialList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMaterialList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMaterialProperties(IfcMaterialProperties ifcMaterialProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMaterialProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMaterialSelect(IfcMaterialSelect ifcMaterialSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMaterialSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMeasureValue(IfcMeasureValue ifcMeasureValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMeasureValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMeasureWithUnit(IfcMeasureWithUnit ifcMeasureWithUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMeasureWithUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMechanicalConcreteMaterialProperties(IfcMechanicalConcreteMaterialProperties ifcMechanicalConcreteMaterialProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMechanicalConcreteMaterialProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMechanicalFastener(IfcMechanicalFastener ifcMechanicalFastener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMechanicalFastener, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMechanicalFastenerType(IfcMechanicalFastenerType ifcMechanicalFastenerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMechanicalFastenerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMechanicalMaterialProperties(IfcMechanicalMaterialProperties ifcMechanicalMaterialProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMechanicalMaterialProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMechanicalSteelMaterialProperties(IfcMechanicalSteelMaterialProperties ifcMechanicalSteelMaterialProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMechanicalSteelMaterialProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMember(IfcMember ifcMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMemberType(IfcMemberType ifcMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMemberTypeEnumType(IfcMemberTypeEnumType ifcMemberTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMemberTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMetric(IfcMetric ifcMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMetric, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMetricValueSelect(IfcMetricValueSelect ifcMetricValueSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMetricValueSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMinuteInHourType(IfcMinuteInHourType ifcMinuteInHourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMinuteInHourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfElasticityMeasureType(IfcModulusOfElasticityMeasureType ifcModulusOfElasticityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcModulusOfElasticityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfLinearSubgradeReactionMeasureType(IfcModulusOfLinearSubgradeReactionMeasureType ifcModulusOfLinearSubgradeReactionMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcModulusOfLinearSubgradeReactionMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfRotationalSubgradeReactionMeasureType(IfcModulusOfRotationalSubgradeReactionMeasureType ifcModulusOfRotationalSubgradeReactionMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcModulusOfRotationalSubgradeReactionMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfSubgradeReactionMeasureType(IfcModulusOfSubgradeReactionMeasureType ifcModulusOfSubgradeReactionMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcModulusOfSubgradeReactionMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMoistureDiffusivityMeasureType(IfcMoistureDiffusivityMeasureType ifcMoistureDiffusivityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMoistureDiffusivityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMolecularWeightMeasureType(IfcMolecularWeightMeasureType ifcMolecularWeightMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMolecularWeightMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMomentOfInertiaMeasureType(IfcMomentOfInertiaMeasureType ifcMomentOfInertiaMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMomentOfInertiaMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMonetaryMeasureType(IfcMonetaryMeasureType ifcMonetaryMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMonetaryMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMonetaryUnit(IfcMonetaryUnit ifcMonetaryUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMonetaryUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMonthInYearNumberType(IfcMonthInYearNumberType ifcMonthInYearNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMonthInYearNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMotorConnectionType(IfcMotorConnectionType ifcMotorConnectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMotorConnectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMotorConnectionTypeEnumType(IfcMotorConnectionTypeEnumType ifcMotorConnectionTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMotorConnectionTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMove(IfcMove ifcMove, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcMove, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNamedUnit(IfcNamedUnit ifcNamedUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcNamedUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNormalisedRatioMeasureType(IfcNormalisedRatioMeasureType ifcNormalisedRatioMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcNormalisedRatioMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNullStyleType(IfcNullStyleType ifcNullStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcNullStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNumericMeasureType(IfcNumericMeasureType ifcNumericMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcNumericMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObject(IfcObject ifcObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjectDefinition(IfcObjectDefinition ifcObjectDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcObjectDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjective(IfcObjective ifcObjective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcObjective, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjectiveEnumType(IfcObjectiveEnumType ifcObjectiveEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcObjectiveEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjectPlacement(IfcObjectPlacement ifcObjectPlacement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcObjectPlacement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjectReferenceSelect(IfcObjectReferenceSelect ifcObjectReferenceSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcObjectReferenceSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjectTypeEnumType(IfcObjectTypeEnumType ifcObjectTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcObjectTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOccupant(IfcOccupant ifcOccupant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOccupant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOccupantTypeEnumType(IfcOccupantTypeEnumType ifcOccupantTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOccupantTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOffsetCurve2D(IfcOffsetCurve2D ifcOffsetCurve2D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOffsetCurve2D, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOffsetCurve3D(IfcOffsetCurve3D ifcOffsetCurve3D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOffsetCurve3D, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOneDirectionRepeatFactor(IfcOneDirectionRepeatFactor ifcOneDirectionRepeatFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOneDirectionRepeatFactor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOpeningElement(IfcOpeningElement ifcOpeningElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOpeningElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOpenShell(IfcOpenShell ifcOpenShell, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOpenShell, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOpticalMaterialProperties(IfcOpticalMaterialProperties ifcOpticalMaterialProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOpticalMaterialProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOrderAction(IfcOrderAction ifcOrderAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOrderAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOrganization(IfcOrganization ifcOrganization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOrganization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOrganizationRelationship(IfcOrganizationRelationship ifcOrganizationRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOrganizationRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOrientationSelect(IfcOrientationSelect ifcOrientationSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOrientationSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOrientedEdge(IfcOrientedEdge ifcOrientedEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOrientedEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOrientedEdgeTemp(IfcOrientedEdgeTemp ifcOrientedEdgeTemp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOrientedEdgeTemp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOutletType(IfcOutletType ifcOutletType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOutletType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOutletTypeEnumType(IfcOutletTypeEnumType ifcOutletTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOutletTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOwnerHistory(IfcOwnerHistory ifcOwnerHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcOwnerHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcParameterizedProfileDef(IfcParameterizedProfileDef ifcParameterizedProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcParameterizedProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcParameterValueType(IfcParameterValueType ifcParameterValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcParameterValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPath(IfcPath ifcPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPerformanceHistory(IfcPerformanceHistory ifcPerformanceHistory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPerformanceHistory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPermeableCoveringOperationEnumType(IfcPermeableCoveringOperationEnumType ifcPermeableCoveringOperationEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPermeableCoveringOperationEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPermeableCoveringProperties(IfcPermeableCoveringProperties ifcPermeableCoveringProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPermeableCoveringProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPermit(IfcPermit ifcPermit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPermit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPerson(IfcPerson ifcPerson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPerson, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPersonAndOrganization(IfcPersonAndOrganization ifcPersonAndOrganization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPersonAndOrganization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPHMeasureType(IfcPHMeasureType ifcPHMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPHMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPhysicalComplexQuantity(IfcPhysicalComplexQuantity ifcPhysicalComplexQuantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPhysicalComplexQuantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPhysicalOrVirtualEnumType(IfcPhysicalOrVirtualEnumType ifcPhysicalOrVirtualEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPhysicalOrVirtualEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPhysicalQuantity(IfcPhysicalQuantity ifcPhysicalQuantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPhysicalQuantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPhysicalSimpleQuantity(IfcPhysicalSimpleQuantity ifcPhysicalSimpleQuantity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPhysicalSimpleQuantity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPile(IfcPile ifcPile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPileConstructionEnumType(IfcPileConstructionEnumType ifcPileConstructionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPileConstructionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPileTypeEnumType(IfcPileTypeEnumType ifcPileTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPileTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPipeFittingType(IfcPipeFittingType ifcPipeFittingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPipeFittingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPipeFittingTypeEnumType(IfcPipeFittingTypeEnumType ifcPipeFittingTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPipeFittingTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPipeSegmentType(IfcPipeSegmentType ifcPipeSegmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPipeSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPipeSegmentTypeEnumType(IfcPipeSegmentTypeEnumType ifcPipeSegmentTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPipeSegmentTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPixelTexture(IfcPixelTexture ifcPixelTexture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPixelTexture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlacement(IfcPlacement ifcPlacement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPlacement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlanarBox(IfcPlanarBox ifcPlanarBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPlanarBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlanarExtent(IfcPlanarExtent ifcPlanarExtent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPlanarExtent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlanarForceMeasureType(IfcPlanarForceMeasureType ifcPlanarForceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPlanarForceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlane(IfcPlane ifcPlane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPlane, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlaneAngleMeasureType(IfcPlaneAngleMeasureType ifcPlaneAngleMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPlaneAngleMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlate(IfcPlate ifcPlate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPlate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlateType(IfcPlateType ifcPlateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPlateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlateTypeEnumType(IfcPlateTypeEnumType ifcPlateTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPlateTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPoint(IfcPoint ifcPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPointOnCurve(IfcPointOnCurve ifcPointOnCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPointOnCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPointOnSurface(IfcPointOnSurface ifcPointOnSurface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPointOnSurface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPointOrVertexPoint(IfcPointOrVertexPoint ifcPointOrVertexPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPointOrVertexPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPolygonalBoundedHalfSpace(IfcPolygonalBoundedHalfSpace ifcPolygonalBoundedHalfSpace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPolygonalBoundedHalfSpace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPolyline(IfcPolyline ifcPolyline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPolyline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPolyLoop(IfcPolyLoop ifcPolyLoop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPolyLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPort(IfcPort ifcPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPositiveLengthMeasureType(IfcPositiveLengthMeasureType ifcPositiveLengthMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPositiveLengthMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPositivePlaneAngleMeasureType(IfcPositivePlaneAngleMeasureType ifcPositivePlaneAngleMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPositivePlaneAngleMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPositiveRatioMeasureType(IfcPositiveRatioMeasureType ifcPositiveRatioMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPositiveRatioMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPostalAddress(IfcPostalAddress ifcPostalAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPostalAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPowerMeasureType(IfcPowerMeasureType ifcPowerMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPowerMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPreDefinedColour(IfcPreDefinedColour ifcPreDefinedColour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPreDefinedColour, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPreDefinedCurveFont(IfcPreDefinedCurveFont ifcPreDefinedCurveFont, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPreDefinedCurveFont, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPreDefinedDimensionSymbol(IfcPreDefinedDimensionSymbol ifcPreDefinedDimensionSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPreDefinedDimensionSymbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPreDefinedItem(IfcPreDefinedItem ifcPreDefinedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPreDefinedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPreDefinedPointMarkerSymbol(IfcPreDefinedPointMarkerSymbol ifcPreDefinedPointMarkerSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPreDefinedPointMarkerSymbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPreDefinedSymbol(IfcPreDefinedSymbol ifcPreDefinedSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPreDefinedSymbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPreDefinedTerminatorSymbol(IfcPreDefinedTerminatorSymbol ifcPreDefinedTerminatorSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPreDefinedTerminatorSymbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPreDefinedTextFont(IfcPreDefinedTextFont ifcPreDefinedTextFont, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPreDefinedTextFont, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPresentableTextType(IfcPresentableTextType ifcPresentableTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPresentableTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPresentationLayerAssignment(IfcPresentationLayerAssignment ifcPresentationLayerAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPresentationLayerAssignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPresentationLayerWithStyle(IfcPresentationLayerWithStyle ifcPresentationLayerWithStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPresentationLayerWithStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPresentationStyle(IfcPresentationStyle ifcPresentationStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPresentationStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPresentationStyleAssignment(IfcPresentationStyleAssignment ifcPresentationStyleAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPresentationStyleAssignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPresentationStyleSelect(IfcPresentationStyleSelect ifcPresentationStyleSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPresentationStyleSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPressureMeasureType(IfcPressureMeasureType ifcPressureMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPressureMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProcedure(IfcProcedure ifcProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProcedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProcedureTypeEnumType(IfcProcedureTypeEnumType ifcProcedureTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProcedureTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProcess(IfcProcess ifcProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProduct(IfcProduct ifcProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProduct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProductDefinitionShape(IfcProductDefinitionShape ifcProductDefinitionShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProductDefinitionShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProductRepresentation(IfcProductRepresentation ifcProductRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProductRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProductsOfCombustionProperties(IfcProductsOfCombustionProperties ifcProductsOfCombustionProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProductsOfCombustionProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProfileDef(IfcProfileDef ifcProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProfileProperties(IfcProfileProperties ifcProfileProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProfileProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProfileTypeEnumType(IfcProfileTypeEnumType ifcProfileTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProfileTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProject(IfcProject ifcProject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectedOrTrueLengthEnumType(IfcProjectedOrTrueLengthEnumType ifcProjectedOrTrueLengthEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProjectedOrTrueLengthEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectionCurve(IfcProjectionCurve ifcProjectionCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProjectionCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectionElement(IfcProjectionElement ifcProjectionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProjectionElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectOrder(IfcProjectOrder ifcProjectOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProjectOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectOrderRecord(IfcProjectOrderRecord ifcProjectOrderRecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProjectOrderRecord, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectOrderRecordTypeEnumType(IfcProjectOrderRecordTypeEnumType ifcProjectOrderRecordTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProjectOrderRecordTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectOrderTypeEnumType(IfcProjectOrderTypeEnumType ifcProjectOrderTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProjectOrderTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProperty(IfcProperty ifcProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertyBoundedValue(IfcPropertyBoundedValue ifcPropertyBoundedValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertyBoundedValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertyConstraintRelationship(IfcPropertyConstraintRelationship ifcPropertyConstraintRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertyConstraintRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertyDefinition(IfcPropertyDefinition ifcPropertyDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertyDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertyDependencyRelationship(IfcPropertyDependencyRelationship ifcPropertyDependencyRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertyDependencyRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertyEnumeratedValue(IfcPropertyEnumeratedValue ifcPropertyEnumeratedValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertyEnumeratedValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertyEnumeration(IfcPropertyEnumeration ifcPropertyEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertyEnumeration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertyListValue(IfcPropertyListValue ifcPropertyListValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertyListValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertyReferenceValue(IfcPropertyReferenceValue ifcPropertyReferenceValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertyReferenceValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertySet(IfcPropertySet ifcPropertySet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertySet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertySetDefinition(IfcPropertySetDefinition ifcPropertySetDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertySetDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertySingleValue(IfcPropertySingleValue ifcPropertySingleValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertySingleValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertySourceEnumType(IfcPropertySourceEnumType ifcPropertySourceEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertySourceEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertyTableValue(IfcPropertyTableValue ifcPropertyTableValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPropertyTableValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProtectiveDeviceType(IfcProtectiveDeviceType ifcProtectiveDeviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProtectiveDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProtectiveDeviceTypeEnumType(IfcProtectiveDeviceTypeEnumType ifcProtectiveDeviceTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProtectiveDeviceTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProxy(IfcProxy ifcProxy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcProxy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPumpType(IfcPumpType ifcPumpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPumpType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPumpTypeEnumType(IfcPumpTypeEnumType ifcPumpTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcPumpTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcQuantityArea(IfcQuantityArea ifcQuantityArea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcQuantityArea, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcQuantityCount(IfcQuantityCount ifcQuantityCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcQuantityCount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcQuantityLength(IfcQuantityLength ifcQuantityLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcQuantityLength, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcQuantityTime(IfcQuantityTime ifcQuantityTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcQuantityTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcQuantityVolume(IfcQuantityVolume ifcQuantityVolume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcQuantityVolume, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcQuantityWeight(IfcQuantityWeight ifcQuantityWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcQuantityWeight, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRadioActivityMeasureType(IfcRadioActivityMeasureType ifcRadioActivityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRadioActivityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRadiusDimension(IfcRadiusDimension ifcRadiusDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRadiusDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRailing(IfcRailing ifcRailing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRailing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRailingType(IfcRailingType ifcRailingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRailingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRailingTypeEnumType(IfcRailingTypeEnumType ifcRailingTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRailingTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRamp(IfcRamp ifcRamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRamp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRampFlight(IfcRampFlight ifcRampFlight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRampFlight, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRampFlightType(IfcRampFlightType ifcRampFlightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRampFlightType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRampFlightTypeEnumType(IfcRampFlightTypeEnumType ifcRampFlightTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRampFlightTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRampTypeEnumType(IfcRampTypeEnumType ifcRampTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRampTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRatioMeasureType(IfcRatioMeasureType ifcRatioMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRatioMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRationalBezierCurve(IfcRationalBezierCurve ifcRationalBezierCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRationalBezierCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRealType(IfcRealType ifcRealType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRealType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRectangleHollowProfileDef(IfcRectangleHollowProfileDef ifcRectangleHollowProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRectangleHollowProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRectangleProfileDef(IfcRectangleProfileDef ifcRectangleProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRectangleProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRectangularPyramid(IfcRectangularPyramid ifcRectangularPyramid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRectangularPyramid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRectangularTrimmedSurface(IfcRectangularTrimmedSurface ifcRectangularTrimmedSurface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRectangularTrimmedSurface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReferencesValueDocument(IfcReferencesValueDocument ifcReferencesValueDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcReferencesValueDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReflectanceMethodEnumType(IfcReflectanceMethodEnumType ifcReflectanceMethodEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcReflectanceMethodEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRegularTimeSeries(IfcRegularTimeSeries ifcRegularTimeSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRegularTimeSeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcementBarProperties(IfcReinforcementBarProperties ifcReinforcementBarProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcReinforcementBarProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcementDefinitionProperties(IfcReinforcementDefinitionProperties ifcReinforcementDefinitionProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcReinforcementDefinitionProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcingBar(IfcReinforcingBar ifcReinforcingBar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcReinforcingBar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcingBarRoleEnumType(IfcReinforcingBarRoleEnumType ifcReinforcingBarRoleEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcReinforcingBarRoleEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcingBarSurfaceEnumType(IfcReinforcingBarSurfaceEnumType ifcReinforcingBarSurfaceEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcReinforcingBarSurfaceEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcingElement(IfcReinforcingElement ifcReinforcingElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcReinforcingElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcingMesh(IfcReinforcingMesh ifcReinforcingMesh, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcReinforcingMesh, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAggregates(IfcRelAggregates ifcRelAggregates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAggregates, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssigns(IfcRelAssigns ifcRelAssigns, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssigns, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssignsTasks(IfcRelAssignsTasks ifcRelAssignsTasks, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssignsTasks, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssignsToActor(IfcRelAssignsToActor ifcRelAssignsToActor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssignsToActor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssignsToControl(IfcRelAssignsToControl ifcRelAssignsToControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssignsToControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssignsToGroup(IfcRelAssignsToGroup ifcRelAssignsToGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssignsToGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssignsToProcess(IfcRelAssignsToProcess ifcRelAssignsToProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssignsToProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssignsToProduct(IfcRelAssignsToProduct ifcRelAssignsToProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssignsToProduct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssignsToProjectOrder(IfcRelAssignsToProjectOrder ifcRelAssignsToProjectOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssignsToProjectOrder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssignsToResource(IfcRelAssignsToResource ifcRelAssignsToResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssignsToResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssociates(IfcRelAssociates ifcRelAssociates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssociates, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssociatesAppliedValue(IfcRelAssociatesAppliedValue ifcRelAssociatesAppliedValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssociatesAppliedValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssociatesApproval(IfcRelAssociatesApproval ifcRelAssociatesApproval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssociatesApproval, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssociatesClassification(IfcRelAssociatesClassification ifcRelAssociatesClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssociatesClassification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssociatesConstraint(IfcRelAssociatesConstraint ifcRelAssociatesConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssociatesConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssociatesDocument(IfcRelAssociatesDocument ifcRelAssociatesDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssociatesDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssociatesLibrary(IfcRelAssociatesLibrary ifcRelAssociatesLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssociatesLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssociatesMaterial(IfcRelAssociatesMaterial ifcRelAssociatesMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssociatesMaterial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelAssociatesProfileProperties(IfcRelAssociatesProfileProperties ifcRelAssociatesProfileProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelAssociatesProfileProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelationship(IfcRelationship ifcRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelaxation(IfcRelaxation ifcRelaxation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelaxation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnects(IfcRelConnects ifcRelConnects, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnects, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnectsElements(IfcRelConnectsElements ifcRelConnectsElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnectsElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnectsPathElements(IfcRelConnectsPathElements ifcRelConnectsPathElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnectsPathElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnectsPorts(IfcRelConnectsPorts ifcRelConnectsPorts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnectsPorts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnectsPortToElement(IfcRelConnectsPortToElement ifcRelConnectsPortToElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnectsPortToElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnectsStructuralActivity(IfcRelConnectsStructuralActivity ifcRelConnectsStructuralActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnectsStructuralActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnectsStructuralElement(IfcRelConnectsStructuralElement ifcRelConnectsStructuralElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnectsStructuralElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnectsStructuralMember(IfcRelConnectsStructuralMember ifcRelConnectsStructuralMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnectsStructuralMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnectsWithEccentricity(IfcRelConnectsWithEccentricity ifcRelConnectsWithEccentricity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnectsWithEccentricity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelConnectsWithRealizingElements(IfcRelConnectsWithRealizingElements ifcRelConnectsWithRealizingElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelConnectsWithRealizingElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelContainedInSpatialStructure(IfcRelContainedInSpatialStructure ifcRelContainedInSpatialStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelContainedInSpatialStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelCoversBldgElements(IfcRelCoversBldgElements ifcRelCoversBldgElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelCoversBldgElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelCoversSpaces(IfcRelCoversSpaces ifcRelCoversSpaces, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelCoversSpaces, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelDecomposes(IfcRelDecomposes ifcRelDecomposes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelDecomposes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelDefines(IfcRelDefines ifcRelDefines, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelDefines, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelDefinesByProperties(IfcRelDefinesByProperties ifcRelDefinesByProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelDefinesByProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelDefinesByType(IfcRelDefinesByType ifcRelDefinesByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelDefinesByType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelFillsElement(IfcRelFillsElement ifcRelFillsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelFillsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelFlowControlElements(IfcRelFlowControlElements ifcRelFlowControlElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelFlowControlElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelInteractionRequirements(IfcRelInteractionRequirements ifcRelInteractionRequirements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelInteractionRequirements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelNests(IfcRelNests ifcRelNests, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelNests, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelOccupiesSpaces(IfcRelOccupiesSpaces ifcRelOccupiesSpaces, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelOccupiesSpaces, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelOverridesProperties(IfcRelOverridesProperties ifcRelOverridesProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelOverridesProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelProjectsElement(IfcRelProjectsElement ifcRelProjectsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelProjectsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelReferencedInSpatialStructure(IfcRelReferencedInSpatialStructure ifcRelReferencedInSpatialStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelReferencedInSpatialStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelSchedulesCostItems(IfcRelSchedulesCostItems ifcRelSchedulesCostItems, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelSchedulesCostItems, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelSequence(IfcRelSequence ifcRelSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelServicesBuildings(IfcRelServicesBuildings ifcRelServicesBuildings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelServicesBuildings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelSpaceBoundary(IfcRelSpaceBoundary ifcRelSpaceBoundary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelSpaceBoundary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRelVoidsElement(IfcRelVoidsElement ifcRelVoidsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRelVoidsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRepresentation(IfcRepresentation ifcRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRepresentationContext(IfcRepresentationContext ifcRepresentationContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRepresentationContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRepresentationItem(IfcRepresentationItem ifcRepresentationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRepresentationItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRepresentationMap(IfcRepresentationMap ifcRepresentationMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRepresentationMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcResource(IfcResource ifcResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcResourceConsumptionEnumType(IfcResourceConsumptionEnumType ifcResourceConsumptionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcResourceConsumptionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRevolvedAreaSolid(IfcRevolvedAreaSolid ifcRevolvedAreaSolid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRevolvedAreaSolid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRibPlateDirectionEnumType(IfcRibPlateDirectionEnumType ifcRibPlateDirectionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRibPlateDirectionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRibPlateProfileProperties(IfcRibPlateProfileProperties ifcRibPlateProfileProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRibPlateProfileProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRightCircularCone(IfcRightCircularCone ifcRightCircularCone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRightCircularCone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRightCircularCylinder(IfcRightCircularCylinder ifcRightCircularCylinder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRightCircularCylinder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoleEnumType(IfcRoleEnumType ifcRoleEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRoleEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoof(IfcRoof ifcRoof, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRoof, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoofTypeEnumType(IfcRoofTypeEnumType ifcRoofTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRoofTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoot(IfcRoot ifcRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRotationalFrequencyMeasureType(IfcRotationalFrequencyMeasureType ifcRotationalFrequencyMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRotationalFrequencyMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRotationalMassMeasureType(IfcRotationalMassMeasureType ifcRotationalMassMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRotationalMassMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRotationalStiffnessMeasureType(IfcRotationalStiffnessMeasureType ifcRotationalStiffnessMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRotationalStiffnessMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoundedEdgeFeature(IfcRoundedEdgeFeature ifcRoundedEdgeFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRoundedEdgeFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoundedRectangleProfileDef(IfcRoundedRectangleProfileDef ifcRoundedRectangleProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcRoundedRectangleProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSanitaryTerminalType(IfcSanitaryTerminalType ifcSanitaryTerminalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSanitaryTerminalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSanitaryTerminalTypeEnumType(IfcSanitaryTerminalTypeEnumType ifcSanitaryTerminalTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSanitaryTerminalTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcScheduleTimeControl(IfcScheduleTimeControl ifcScheduleTimeControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcScheduleTimeControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSecondInMinuteType(IfcSecondInMinuteType ifcSecondInMinuteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSecondInMinuteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionalAreaIntegralMeasureType(IfcSectionalAreaIntegralMeasureType ifcSectionalAreaIntegralMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSectionalAreaIntegralMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionedSpine(IfcSectionedSpine ifcSectionedSpine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSectionedSpine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionModulusMeasureType(IfcSectionModulusMeasureType ifcSectionModulusMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSectionModulusMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionProperties(IfcSectionProperties ifcSectionProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSectionProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionReinforcementProperties(IfcSectionReinforcementProperties ifcSectionReinforcementProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSectionReinforcementProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionTypeEnumType(IfcSectionTypeEnumType ifcSectionTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSectionTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSensorType(IfcSensorType ifcSensorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSensorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSensorTypeEnumType(IfcSensorTypeEnumType ifcSensorTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSensorTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSequenceEnumType(IfcSequenceEnumType ifcSequenceEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSequenceEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcServiceLife(IfcServiceLife ifcServiceLife, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcServiceLife, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcServiceLifeFactor(IfcServiceLifeFactor ifcServiceLifeFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcServiceLifeFactor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcServiceLifeFactorTypeEnumType(IfcServiceLifeFactorTypeEnumType ifcServiceLifeFactorTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcServiceLifeFactorTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcServiceLifeTypeEnumType(IfcServiceLifeTypeEnumType ifcServiceLifeTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcServiceLifeTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcShapeAspect(IfcShapeAspect ifcShapeAspect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcShapeAspect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcShapeModel(IfcShapeModel ifcShapeModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcShapeModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcShapeRepresentation(IfcShapeRepresentation ifcShapeRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcShapeRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcShearModulusMeasureType(IfcShearModulusMeasureType ifcShearModulusMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcShearModulusMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcShell(IfcShell ifcShell, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcShell, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcShellBasedSurfaceModel(IfcShellBasedSurfaceModel ifcShellBasedSurfaceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcShellBasedSurfaceModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSimpleProperty(IfcSimpleProperty ifcSimpleProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSimpleProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSimpleValue(IfcSimpleValue ifcSimpleValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSimpleValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSIPrefixType(IfcSIPrefixType ifcSIPrefixType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSIPrefixType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSite(IfcSite ifcSite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSIUnit(IfcSIUnit ifcSIUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSIUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSIUnitNameType(IfcSIUnitNameType ifcSIUnitNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSIUnitNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSIUnitTemp(IfcSIUnitTemp ifcSIUnitTemp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSIUnitTemp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSizeSelect(IfcSizeSelect ifcSizeSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSizeSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSlab(IfcSlab ifcSlab, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSlab, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSlabType(IfcSlabType ifcSlabType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSlabType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSlabTypeEnumType(IfcSlabTypeEnumType ifcSlabTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSlabTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSlippageConnectionCondition(IfcSlippageConnectionCondition ifcSlippageConnectionCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSlippageConnectionCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSolidAngleMeasureType(IfcSolidAngleMeasureType ifcSolidAngleMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSolidAngleMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSolidModel(IfcSolidModel ifcSolidModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSolidModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundPowerMeasureType(IfcSoundPowerMeasureType ifcSoundPowerMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSoundPowerMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundPressureMeasureType(IfcSoundPressureMeasureType ifcSoundPressureMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSoundPressureMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundProperties(IfcSoundProperties ifcSoundProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSoundProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundScaleEnumType(IfcSoundScaleEnumType ifcSoundScaleEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSoundScaleEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundValue(IfcSoundValue ifcSoundValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSoundValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpace(IfcSpace ifcSpace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceHeaterType(IfcSpaceHeaterType ifcSpaceHeaterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpaceHeaterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceHeaterTypeEnumType(IfcSpaceHeaterTypeEnumType ifcSpaceHeaterTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpaceHeaterTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceProgram(IfcSpaceProgram ifcSpaceProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpaceProgram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceThermalLoadProperties(IfcSpaceThermalLoadProperties ifcSpaceThermalLoadProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpaceThermalLoadProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceType(IfcSpaceType ifcSpaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceTypeEnumType(IfcSpaceTypeEnumType ifcSpaceTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpaceTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpatialStructureElement(IfcSpatialStructureElement ifcSpatialStructureElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpatialStructureElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpatialStructureElementType(IfcSpatialStructureElementType ifcSpatialStructureElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpatialStructureElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecificHeatCapacityMeasureType(IfcSpecificHeatCapacityMeasureType ifcSpecificHeatCapacityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpecificHeatCapacityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecularExponentType(IfcSpecularExponentType ifcSpecularExponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpecularExponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecularHighlightSelect(IfcSpecularHighlightSelect ifcSpecularHighlightSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpecularHighlightSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecularRoughnessType(IfcSpecularRoughnessType ifcSpecularRoughnessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSpecularRoughnessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSphere(IfcSphere ifcSphere, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSphere, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStackTerminalType(IfcStackTerminalType ifcStackTerminalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStackTerminalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStackTerminalTypeEnumType(IfcStackTerminalTypeEnumType ifcStackTerminalTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStackTerminalTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStair(IfcStair ifcStair, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStair, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStairFlight(IfcStairFlight ifcStairFlight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStairFlight, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStairFlightType(IfcStairFlightType ifcStairFlightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStairFlightType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStairFlightTypeEnumType(IfcStairFlightTypeEnumType ifcStairFlightTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStairFlightTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStairTypeEnumType(IfcStairTypeEnumType ifcStairTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStairTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStateEnumType(IfcStateEnumType ifcStateEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStateEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralAction(IfcStructuralAction ifcStructuralAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralActivity(IfcStructuralActivity ifcStructuralActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralActivityAssignmentSelect(IfcStructuralActivityAssignmentSelect ifcStructuralActivityAssignmentSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralActivityAssignmentSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralAnalysisModel(IfcStructuralAnalysisModel ifcStructuralAnalysisModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralAnalysisModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralConnection(IfcStructuralConnection ifcStructuralConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralConnectionCondition(IfcStructuralConnectionCondition ifcStructuralConnectionCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralConnectionCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralCurveConnection(IfcStructuralCurveConnection ifcStructuralCurveConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralCurveConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralCurveMember(IfcStructuralCurveMember ifcStructuralCurveMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralCurveMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralCurveMemberVarying(IfcStructuralCurveMemberVarying ifcStructuralCurveMemberVarying, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralCurveMemberVarying, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralCurveTypeEnumType(IfcStructuralCurveTypeEnumType ifcStructuralCurveTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralCurveTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralItem(IfcStructuralItem ifcStructuralItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLinearAction(IfcStructuralLinearAction ifcStructuralLinearAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLinearAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLinearActionVarying(IfcStructuralLinearActionVarying ifcStructuralLinearActionVarying, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLinearActionVarying, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoad(IfcStructuralLoad ifcStructuralLoad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoadGroup(IfcStructuralLoadGroup ifcStructuralLoadGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoadGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoadLinearForce(IfcStructuralLoadLinearForce ifcStructuralLoadLinearForce, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoadLinearForce, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoadPlanarForce(IfcStructuralLoadPlanarForce ifcStructuralLoadPlanarForce, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoadPlanarForce, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoadSingleDisplacement(IfcStructuralLoadSingleDisplacement ifcStructuralLoadSingleDisplacement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoadSingleDisplacement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoadSingleDisplacementDistortion(IfcStructuralLoadSingleDisplacementDistortion ifcStructuralLoadSingleDisplacementDistortion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoadSingleDisplacementDistortion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoadSingleForce(IfcStructuralLoadSingleForce ifcStructuralLoadSingleForce, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoadSingleForce, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoadSingleForceWarping(IfcStructuralLoadSingleForceWarping ifcStructuralLoadSingleForceWarping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoadSingleForceWarping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoadStatic(IfcStructuralLoadStatic ifcStructuralLoadStatic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoadStatic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralLoadTemperature(IfcStructuralLoadTemperature ifcStructuralLoadTemperature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralLoadTemperature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralMember(IfcStructuralMember ifcStructuralMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralPlanarAction(IfcStructuralPlanarAction ifcStructuralPlanarAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralPlanarAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralPlanarActionVarying(IfcStructuralPlanarActionVarying ifcStructuralPlanarActionVarying, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralPlanarActionVarying, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralPointAction(IfcStructuralPointAction ifcStructuralPointAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralPointAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralPointConnection(IfcStructuralPointConnection ifcStructuralPointConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralPointConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralPointReaction(IfcStructuralPointReaction ifcStructuralPointReaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralPointReaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralProfileProperties(IfcStructuralProfileProperties ifcStructuralProfileProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralProfileProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralReaction(IfcStructuralReaction ifcStructuralReaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralReaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralResultGroup(IfcStructuralResultGroup ifcStructuralResultGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralResultGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralSteelProfileProperties(IfcStructuralSteelProfileProperties ifcStructuralSteelProfileProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralSteelProfileProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralSurfaceConnection(IfcStructuralSurfaceConnection ifcStructuralSurfaceConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralSurfaceConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralSurfaceMember(IfcStructuralSurfaceMember ifcStructuralSurfaceMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralSurfaceMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralSurfaceMemberVarying(IfcStructuralSurfaceMemberVarying ifcStructuralSurfaceMemberVarying, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralSurfaceMemberVarying, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralSurfaceTypeEnumType(IfcStructuralSurfaceTypeEnumType ifcStructuralSurfaceTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuralSurfaceTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuredDimensionCallout(IfcStructuredDimensionCallout ifcStructuredDimensionCallout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStructuredDimensionCallout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStyledItem(IfcStyledItem ifcStyledItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStyledItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStyledRepresentation(IfcStyledRepresentation ifcStyledRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStyledRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStyleModel(IfcStyleModel ifcStyleModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcStyleModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSubContractResource(IfcSubContractResource ifcSubContractResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSubContractResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSubedge(IfcSubedge ifcSubedge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSubedge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurface(IfcSurface ifcSurface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceCurveSweptAreaSolid(IfcSurfaceCurveSweptAreaSolid ifcSurfaceCurveSweptAreaSolid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceCurveSweptAreaSolid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceOfLinearExtrusion(IfcSurfaceOfLinearExtrusion ifcSurfaceOfLinearExtrusion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceOfLinearExtrusion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceOfRevolution(IfcSurfaceOfRevolution ifcSurfaceOfRevolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceOfRevolution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceOrFaceSurface(IfcSurfaceOrFaceSurface ifcSurfaceOrFaceSurface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceOrFaceSurface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceSideType(IfcSurfaceSideType ifcSurfaceSideType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceSideType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceStyle(IfcSurfaceStyle ifcSurfaceStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceStyleElementSelect(IfcSurfaceStyleElementSelect ifcSurfaceStyleElementSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceStyleElementSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceStyleLighting(IfcSurfaceStyleLighting ifcSurfaceStyleLighting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceStyleLighting, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceStyleRefraction(IfcSurfaceStyleRefraction ifcSurfaceStyleRefraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceStyleRefraction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceStyleRendering(IfcSurfaceStyleRendering ifcSurfaceStyleRendering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceStyleRendering, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceStyleShading(IfcSurfaceStyleShading ifcSurfaceStyleShading, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceStyleShading, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceStyleWithTextures(IfcSurfaceStyleWithTextures ifcSurfaceStyleWithTextures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceStyleWithTextures, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceTexture(IfcSurfaceTexture ifcSurfaceTexture, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceTexture, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceTextureEnumType(IfcSurfaceTextureEnumType ifcSurfaceTextureEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSurfaceTextureEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSweptAreaSolid(IfcSweptAreaSolid ifcSweptAreaSolid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSweptAreaSolid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSweptDiskSolid(IfcSweptDiskSolid ifcSweptDiskSolid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSweptDiskSolid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSweptSurface(IfcSweptSurface ifcSweptSurface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSweptSurface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSwitchingDeviceType(IfcSwitchingDeviceType ifcSwitchingDeviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSwitchingDeviceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSwitchingDeviceTypeEnumType(IfcSwitchingDeviceTypeEnumType ifcSwitchingDeviceTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSwitchingDeviceTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSymbolStyle(IfcSymbolStyle ifcSymbolStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSymbolStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSymbolStyleSelect(IfcSymbolStyleSelect ifcSymbolStyleSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSymbolStyleSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSystem(IfcSystem ifcSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSystemFurnitureElementType(IfcSystemFurnitureElementType ifcSystemFurnitureElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcSystemFurnitureElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTable(IfcTable ifcTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTableRow(IfcTableRow ifcTableRow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTableRow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTankType(IfcTankType ifcTankType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTankType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTankTypeEnumType(IfcTankTypeEnumType ifcTankTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTankTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTask(IfcTask ifcTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTask, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTelecomAddress(IfcTelecomAddress ifcTelecomAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTelecomAddress, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTemperatureGradientMeasureType(IfcTemperatureGradientMeasureType ifcTemperatureGradientMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTemperatureGradientMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTendon(IfcTendon ifcTendon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTendon, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTendonAnchor(IfcTendonAnchor ifcTendonAnchor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTendonAnchor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTendonTypeEnumType(IfcTendonTypeEnumType ifcTendonTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTendonTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTerminatorSymbol(IfcTerminatorSymbol ifcTerminatorSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTerminatorSymbol, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextAlignmentType(IfcTextAlignmentType ifcTextAlignmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextAlignmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextDecorationType(IfcTextDecorationType ifcTextDecorationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextDecorationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextFontNameType(IfcTextFontNameType ifcTextFontNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextFontNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextFontSelect(IfcTextFontSelect ifcTextFontSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextFontSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextLiteral(IfcTextLiteral ifcTextLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextLiteralWithExtent(IfcTextLiteralWithExtent ifcTextLiteralWithExtent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextLiteralWithExtent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextPathType(IfcTextPathType ifcTextPathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextPathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextStyle(IfcTextStyle ifcTextStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextStyleFontModel(IfcTextStyleFontModel ifcTextStyleFontModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextStyleFontModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextStyleForDefinedFont(IfcTextStyleForDefinedFont ifcTextStyleForDefinedFont, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextStyleForDefinedFont, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextStyleSelect(IfcTextStyleSelect ifcTextStyleSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextStyleSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextStyleTextModel(IfcTextStyleTextModel ifcTextStyleTextModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextStyleTextModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextStyleWithBoxCharacteristics(IfcTextStyleWithBoxCharacteristics ifcTextStyleWithBoxCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextStyleWithBoxCharacteristics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextTransformationType(IfcTextTransformationType ifcTextTransformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextTransformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextType(IfcTextType ifcTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextureCoordinate(IfcTextureCoordinate ifcTextureCoordinate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextureCoordinate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextureCoordinateGenerator(IfcTextureCoordinateGenerator ifcTextureCoordinateGenerator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextureCoordinateGenerator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextureMap(IfcTextureMap ifcTextureMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextureMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextureVertex(IfcTextureVertex ifcTextureVertex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTextureVertex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalAdmittanceMeasureType(IfcThermalAdmittanceMeasureType ifcThermalAdmittanceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcThermalAdmittanceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalConductivityMeasureType(IfcThermalConductivityMeasureType ifcThermalConductivityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcThermalConductivityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalExpansionCoefficientMeasureType(IfcThermalExpansionCoefficientMeasureType ifcThermalExpansionCoefficientMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcThermalExpansionCoefficientMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalLoadSourceEnumType(IfcThermalLoadSourceEnumType ifcThermalLoadSourceEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcThermalLoadSourceEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalLoadTypeEnumType(IfcThermalLoadTypeEnumType ifcThermalLoadTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcThermalLoadTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalMaterialProperties(IfcThermalMaterialProperties ifcThermalMaterialProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcThermalMaterialProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalResistanceMeasureType(IfcThermalResistanceMeasureType ifcThermalResistanceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcThermalResistanceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalTransmittanceMeasureType(IfcThermalTransmittanceMeasureType ifcThermalTransmittanceMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcThermalTransmittanceMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermodynamicTemperatureMeasureType(IfcThermodynamicTemperatureMeasureType ifcThermodynamicTemperatureMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcThermodynamicTemperatureMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeMeasureType(IfcTimeMeasureType ifcTimeMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTimeMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeries(IfcTimeSeries ifcTimeSeries, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTimeSeries, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeriesDataTypeEnumType(IfcTimeSeriesDataTypeEnumType ifcTimeSeriesDataTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTimeSeriesDataTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeriesReferenceRelationship(IfcTimeSeriesReferenceRelationship ifcTimeSeriesReferenceRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTimeSeriesReferenceRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeriesSchedule(IfcTimeSeriesSchedule ifcTimeSeriesSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTimeSeriesSchedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeriesScheduleTypeEnumType(IfcTimeSeriesScheduleTypeEnumType ifcTimeSeriesScheduleTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTimeSeriesScheduleTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeriesValue(IfcTimeSeriesValue ifcTimeSeriesValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTimeSeriesValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeStampType(IfcTimeStampType ifcTimeStampType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTimeStampType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTopologicalRepresentationItem(IfcTopologicalRepresentationItem ifcTopologicalRepresentationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTopologicalRepresentationItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTopologyRepresentation(IfcTopologyRepresentation ifcTopologyRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTopologyRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTorqueMeasureType(IfcTorqueMeasureType ifcTorqueMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTorqueMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransformerType(IfcTransformerType ifcTransformerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTransformerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransformerTypeEnumType(IfcTransformerTypeEnumType ifcTransformerTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTransformerTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransitionCodeType(IfcTransitionCodeType ifcTransitionCodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTransitionCodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransportElement(IfcTransportElement ifcTransportElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTransportElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransportElementType(IfcTransportElementType ifcTransportElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTransportElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransportElementTypeEnumType(IfcTransportElementTypeEnumType ifcTransportElementTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTransportElementTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTrapeziumProfileDef(IfcTrapeziumProfileDef ifcTrapeziumProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTrapeziumProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTrimmedCurve(IfcTrimmedCurve ifcTrimmedCurve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTrimmedCurve, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTrimmingPreferenceType(IfcTrimmingPreferenceType ifcTrimmingPreferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTrimmingPreferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTrimmingSelect(IfcTrimmingSelect ifcTrimmingSelect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTrimmingSelect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTShapeProfileDef(IfcTShapeProfileDef ifcTShapeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTShapeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTubeBundleType(IfcTubeBundleType ifcTubeBundleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTubeBundleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTubeBundleTypeEnumType(IfcTubeBundleTypeEnumType ifcTubeBundleTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTubeBundleTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTwoDirectionRepeatFactor(IfcTwoDirectionRepeatFactor ifcTwoDirectionRepeatFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTwoDirectionRepeatFactor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTypeObject(IfcTypeObject ifcTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTypeObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTypeProduct(IfcTypeProduct ifcTypeProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcTypeProduct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUnit(IfcUnit ifcUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUnitaryEquipmentType(IfcUnitaryEquipmentType ifcUnitaryEquipmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcUnitaryEquipmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUnitaryEquipmentTypeEnumType(IfcUnitaryEquipmentTypeEnumType ifcUnitaryEquipmentTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcUnitaryEquipmentTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUnitAssignment(IfcUnitAssignment ifcUnitAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcUnitAssignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUnitEnumType(IfcUnitEnumType ifcUnitEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcUnitEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUShapeProfileDef(IfcUShapeProfileDef ifcUShapeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcUShapeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcValue(IfcValue ifcValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcValveType(IfcValveType ifcValveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcValveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcValveTypeEnumType(IfcValveTypeEnumType ifcValveTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcValveTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVaporPermeabilityMeasureType(IfcVaporPermeabilityMeasureType ifcVaporPermeabilityMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVaporPermeabilityMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVector(IfcVector ifcVector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVectorOrDirection(IfcVectorOrDirection ifcVectorOrDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVectorOrDirection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVertex(IfcVertex ifcVertex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVertex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVertexBasedTextureMap(IfcVertexBasedTextureMap ifcVertexBasedTextureMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVertexBasedTextureMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVertexLoop(IfcVertexLoop ifcVertexLoop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVertexLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVertexPoint(IfcVertexPoint ifcVertexPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVertexPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVibrationIsolatorType(IfcVibrationIsolatorType ifcVibrationIsolatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVibrationIsolatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVibrationIsolatorTypeEnumType(IfcVibrationIsolatorTypeEnumType ifcVibrationIsolatorTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVibrationIsolatorTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVirtualElement(IfcVirtualElement ifcVirtualElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVirtualElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVirtualGridIntersection(IfcVirtualGridIntersection ifcVirtualGridIntersection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVirtualGridIntersection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVolumeMeasureType(IfcVolumeMeasureType ifcVolumeMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVolumeMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVolumetricFlowRateMeasureType(IfcVolumetricFlowRateMeasureType ifcVolumetricFlowRateMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcVolumetricFlowRateMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWall(IfcWall ifcWall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWallStandardCase(IfcWallStandardCase ifcWallStandardCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWallStandardCase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWallType(IfcWallType ifcWallType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWallType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWallTypeEnumType(IfcWallTypeEnumType ifcWallTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWallTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWarpingConstantMeasureType(IfcWarpingConstantMeasureType ifcWarpingConstantMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWarpingConstantMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWarpingMomentMeasureType(IfcWarpingMomentMeasureType ifcWarpingMomentMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWarpingMomentMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWasteTerminalType(IfcWasteTerminalType ifcWasteTerminalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWasteTerminalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWasteTerminalTypeEnumType(IfcWasteTerminalTypeEnumType ifcWasteTerminalTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWasteTerminalTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWaterProperties(IfcWaterProperties ifcWaterProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWaterProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindow(IfcWindow ifcWindow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWindow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowLiningProperties(IfcWindowLiningProperties ifcWindowLiningProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWindowLiningProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowPanelOperationEnumType(IfcWindowPanelOperationEnumType ifcWindowPanelOperationEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWindowPanelOperationEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowPanelPositionEnumType(IfcWindowPanelPositionEnumType ifcWindowPanelPositionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWindowPanelPositionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowPanelProperties(IfcWindowPanelProperties ifcWindowPanelProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWindowPanelProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowStyle(IfcWindowStyle ifcWindowStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWindowStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowStyleConstructionEnumType(IfcWindowStyleConstructionEnumType ifcWindowStyleConstructionEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWindowStyleConstructionEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowStyleOperationEnumType(IfcWindowStyleOperationEnumType ifcWindowStyleOperationEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWindowStyleOperationEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWorkControl(IfcWorkControl ifcWorkControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWorkControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWorkControlTypeEnumType(IfcWorkControlTypeEnumType ifcWorkControlTypeEnumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWorkControlTypeEnumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWorkPlan(IfcWorkPlan ifcWorkPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWorkPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWorkSchedule(IfcWorkSchedule ifcWorkSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcWorkSchedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcYearNumberType(IfcYearNumberType ifcYearNumberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcYearNumberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcZone(IfcZone ifcZone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcZone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcZShapeProfileDef(IfcZShapeProfileDef ifcZShapeProfileDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifcZShapeProfileDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncorporationDateType(IncorporationDateType incorporationDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(incorporationDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInnerBoundariesType(InnerBoundariesType innerBoundariesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(innerBoundariesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInnerBoundariesType1(InnerBoundariesType1 innerBoundariesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(innerBoundariesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInnerCurvesType(InnerCurvesType innerCurvesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(innerCurvesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntersectingAxesType(IntersectingAxesType intersectingAxesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intersectingAxesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemOfType(ItemOfType itemOfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemOfType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemsType(ItemsType itemsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType(ItemType itemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemType1(ItemType1 itemType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJurisdictionType(JurisdictionType jurisdictionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jurisdictionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastModifyingApplicationType(LastModifyingApplicationType lastModifyingApplicationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lastModifyingApplicationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastModifyingUserType(LastModifyingUserType lastModifyingUserType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lastModifyingUserType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastRevisionTimeType(LastRevisionTimeType lastRevisionTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lastRevisionTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastUpdateDateType(LastUpdateDateType lastUpdateDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lastUpdateDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLateFinishType(LateFinishType lateFinishType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lateFinishType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLateStartType(LateStartType lateStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lateStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLayerStylesType(LayerStylesType layerStylesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(layerStylesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLetterSpacingType(LetterSpacingType letterSpacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(letterSpacingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryReferenceType(LibraryReferenceType libraryReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(libraryReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightColourType(LightColourType lightColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightDistributionDataSourceType(LightDistributionDataSourceType lightDistributionDataSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightDistributionDataSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineHeightType(LineHeightType lineHeightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineHeightType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListValuesType(ListValuesType listValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListValuesType1(ListValuesType1 listValuesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listValuesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListValuesType2(ListValuesType2 listValuesType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listValuesType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadedByType(LoadedByType loadedByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadedByType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalOriginType(LocalOriginType localOriginType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localOriginType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationAtRelatedElementType(LocationAtRelatedElementType locationAtRelatedElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationAtRelatedElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationAtRelatingElementType(LocationAtRelatingElementType locationAtRelatingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationAtRelatingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationOfInteractionType(LocationOfInteractionType locationOfInteractionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationOfInteractionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType(LocationType locationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopVertexType(LoopVertexType loopVertexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loopVertexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerBoundValueType(LowerBoundValueType lowerBoundValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lowerBoundValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerValueType(LowerValueType lowerValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lowerValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuminousIntensityType(LuminousIntensityType luminousIntensityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luminousIntensityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappedRepresentationType(MappedRepresentationType mappedRepresentationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappedRepresentationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingOriginType(MappingOriginType mappingOriginType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingOriginType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingSourceType(MappingSourceType mappingSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingTargetType(MappingTargetType mappingTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingTargetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialClassificationsType(MaterialClassificationsType materialClassificationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialClassificationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialLayersType(MaterialLayersType materialLayersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialLayersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialsType(MaterialsType materialsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialType(MaterialType materialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialType1(MaterialType1 materialType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(materialType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiddleNamesType(MiddleNamesType middleNamesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(middleNamesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMostUsedValueType(MostUsedValueType mostUsedValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mostUsedValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoveFromType(MoveFromType moveFromType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moveFromType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoveToType(MoveToType moveToType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moveToType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNominalValueType(NominalValueType nominalValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nominalValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotationFacetsType(NotationFacetsType notationFacetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notationFacetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotationType(NotationType notationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPlacementType(ObjectPlacementType objectPlacementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPlacementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffsetDistancesType(OffsetDistancesType offsetDistancesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(offsetDistancesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatorType(OperatorType operatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationOf2DPlaneType(OrientationOf2DPlaneType orientationOf2DPlaneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientationOf2DPlaneType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType(OrientationType orientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType1(OrientationType1 orientationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientationType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType2(OrientationType2 orientationType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientationType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOriginalValueType(OriginalValueType originalValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(originalValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOriginalValueType1(OriginalValueType1 originalValueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(originalValueType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOuterBoundaryType(OuterBoundaryType outerBoundaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outerBoundaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOuterBoundaryType1(OuterBoundaryType1 outerBoundaryType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outerBoundaryType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOuterCurveType(OuterCurveType outerCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outerCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOuterType(OuterType outerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverridingPropertiesType(OverridingPropertiesType overridingPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(overridingPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnerHistoryType(OwnerHistoryType ownerHistoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ownerHistoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnerType(OwnerType ownerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ownerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwningApplicationType(OwningApplicationType owningApplicationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(owningApplicationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwningUserType(OwningUserType owningUserType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(owningUserType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentContextType(ParentContextType parentContextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parentContextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentCurveType(ParentCurveType parentCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parentCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentEdgeType(ParentEdgeType parentEdgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parentEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentProfileType(ParentProfileType parentProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parentProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartOfProductDefinitionShapeType(PartOfProductDefinitionShapeType partOfProductDefinitionShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partOfProductDefinitionShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternListType(PatternListType patternListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patternListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternStartType(PatternStartType patternStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patternStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixelType(PixelType pixelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pixelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementLocationType(PlacementLocationType placementLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placementLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementRefDirectionType(PlacementRefDirectionType placementRefDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placementRefDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementRelToType(PlacementRelToType placementRelToType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placementRelToType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementType(PlacementType placementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementType1(PlacementType1 placementType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placementType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePntType(PntType pntType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pntType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointOfReferenceHatchLineType(PointOfReferenceHatchLineType pointOfReferenceHatchLineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointOfReferenceHatchLineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointOnRelatedElementType(PointOnRelatedElementType pointOnRelatedElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointOnRelatedElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointOnRelatingElementType(PointOnRelatingElementType pointOnRelatingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointOnRelatingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointsType(PointsType pointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonalBoundaryType(PolygonalBoundaryType polygonalBoundaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonalBoundaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonType(PolygonType polygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType(PositionType positionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType1(PositionType1 positionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType2(PositionType2 positionType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType3(PositionType3 positionType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType4(PositionType4 positionType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType5(PositionType5 positionType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionType5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType6(PositionType6 positionType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionType6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType7(PositionType7 positionType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionType7, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionType8(PositionType8 positionType8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionType8, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrefixTitlesType(PrefixTitlesType prefixTitlesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prefixTitlesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreparedByType(PreparedByType preparedByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preparedByType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePressureTimeSeriesType(PressureTimeSeriesType pressureTimeSeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pressureTimeSeriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileDefinitionType(ProfileDefinitionType profileDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileOfPortType(ProfileOfPortType profileOfPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileOfPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileOrientationType(ProfileOrientationType profileOrientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileOrientationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileSectionLocationType(ProfileSectionLocationType profileSectionLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profileSectionLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfilesType(ProfilesType profilesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(profilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyReferenceType(PropertyReferenceType propertyReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublisherType(PublisherType publisherType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publisherType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePunchListType(PunchListType punchListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(punchListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantitiesType(QuantitiesType quantitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityInProcessType(QuantityInProcessType quantityInProcessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityInProcessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateDateTimeType(RateDateTimeType rateDateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateDateTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRateSourceType(RateSourceType rateSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rateSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealizingElementsType(RealizingElementsType realizingElementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realizingElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealizingElementType(RealizingElementType realizingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realizingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordsType(RecordsType recordsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recordsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefDirectionType(RefDirectionType refDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefDirectionType1(RefDirectionType1 refDirectionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refDirectionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefDirectionType2(RefDirectionType2 refDirectionType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refDirectionType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencedDocumentType(ReferencedDocumentType referencedDocumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencedDocumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencedSourceType(ReferencedSourceType referencedSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencedSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencedTimeSeriesType(ReferencedTimeSeriesType referencedTimeSeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencedTimeSeriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceSurfaceType(ReferenceSurfaceType referenceSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencingValuesType(ReferencingValuesType referencingValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencingValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflectanceColourType(ReflectanceColourType reflectanceColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflectanceColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflectionColourType(ReflectionColourType reflectionColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflectionColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReinforcementSectionDefinitionsType(ReinforcementSectionDefinitionsType reinforcementSectionDefinitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reinforcementSectionDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedApprovalType(RelatedApprovalType relatedApprovalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedApprovalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedBuildingElementType(RelatedBuildingElementType relatedBuildingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedBuildingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedBuildingElementType1(RelatedBuildingElementType1 relatedBuildingElementType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedBuildingElementType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedBuildingsType(RelatedBuildingsType relatedBuildingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedBuildingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedClassificationsType(RelatedClassificationsType relatedClassificationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedClassificationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedConstraintsType(RelatedConstraintsType relatedConstraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedConstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedConstraintsType1(RelatedConstraintsType1 relatedConstraintsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedConstraintsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedControlElementsType(RelatedControlElementsType relatedControlElementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedControlElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedCoveringsType(RelatedCoveringsType relatedCoveringsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedCoveringsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedCoveringsType1(RelatedCoveringsType1 relatedCoveringsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedCoveringsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedDocumentsType(RelatedDocumentsType relatedDocumentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedDocumentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedDraughtingCalloutType(RelatedDraughtingCalloutType relatedDraughtingCalloutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedDraughtingCalloutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedElementsType(RelatedElementsType relatedElementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedElementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedElementsType1(RelatedElementsType1 relatedElementsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedElementsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedElementType(RelatedElementType relatedElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedElementType1(RelatedElementType1 relatedElementType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedElementType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedFeatureElementType(RelatedFeatureElementType relatedFeatureElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedFeatureElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedItemsType(RelatedItemsType relatedItemsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedItemsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedMonetaryUnitType(RelatedMonetaryUnitType relatedMonetaryUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedMonetaryUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedObjectsType(RelatedObjectsType relatedObjectsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedObjectsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedObjectsType1(RelatedObjectsType1 relatedObjectsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedObjectsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedObjectsType2(RelatedObjectsType2 relatedObjectsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedObjectsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedObjectsType3(RelatedObjectsType3 relatedObjectsType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedObjectsType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedOpeningElementType(RelatedOpeningElementType relatedOpeningElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedOpeningElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedOrganizationsType(RelatedOrganizationsType relatedOrganizationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedOrganizationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPortType(RelatedPortType relatedPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPrioritiesType(RelatedPrioritiesType relatedPrioritiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedPrioritiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedProcessType(RelatedProcessType relatedProcessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedProcessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedPropertiesType(RelatedPropertiesType relatedPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedSpaceProgramType(RelatedSpaceProgramType relatedSpaceProgramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedSpaceProgramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedSpaceType(RelatedSpaceType relatedSpaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedSpaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedStructuralActivityType(RelatedStructuralActivityType relatedStructuralActivityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedStructuralActivityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedStructuralConnectionType(RelatedStructuralConnectionType relatedStructuralConnectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedStructuralConnectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedStructuralMemberType(RelatedStructuralMemberType relatedStructuralMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedStructuralMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingActorType(RelatingActorType relatingActorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingActorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingAppliedValueType(RelatingAppliedValueType relatingAppliedValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingAppliedValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingApprovalType(RelatingApprovalType relatingApprovalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingApprovalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingApprovalType1(RelatingApprovalType1 relatingApprovalType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingApprovalType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingBuildingElementType(RelatingBuildingElementType relatingBuildingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingBuildingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingBuildingElementType1(RelatingBuildingElementType1 relatingBuildingElementType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingBuildingElementType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingClassificationType(RelatingClassificationType relatingClassificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingClassificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingConstraintType(RelatingConstraintType relatingConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingConstraintType1(RelatingConstraintType1 relatingConstraintType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingConstraintType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingConstraintType2(RelatingConstraintType2 relatingConstraintType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingConstraintType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingConstraintType3(RelatingConstraintType3 relatingConstraintType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingConstraintType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingControlType(RelatingControlType relatingControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingDocumentType(RelatingDocumentType relatingDocumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingDocumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingDocumentType1(RelatingDocumentType1 relatingDocumentType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingDocumentType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingDraughtingCalloutType(RelatingDraughtingCalloutType relatingDraughtingCalloutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingDraughtingCalloutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingElementType(RelatingElementType relatingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingElementType1(RelatingElementType1 relatingElementType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingElementType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingElementType2(RelatingElementType2 relatingElementType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingElementType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingElementType3(RelatingElementType3 relatingElementType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingElementType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingFlowElementType(RelatingFlowElementType relatingFlowElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingFlowElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingGroupType(RelatingGroupType relatingGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingItemType(RelatingItemType relatingItemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingItemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingLibraryType(RelatingLibraryType relatingLibraryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingLibraryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingMaterialType(RelatingMaterialType relatingMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingMaterialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingMonetaryUnitType(RelatingMonetaryUnitType relatingMonetaryUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingMonetaryUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingObjectType(RelatingObjectType relatingObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingOpeningElementType(RelatingOpeningElementType relatingOpeningElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingOpeningElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingOrganizationType(RelatingOrganizationType relatingOrganizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingOrganizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingPortType(RelatingPortType relatingPortType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingPortType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingPortType1(RelatingPortType1 relatingPortType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingPortType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingPrioritiesType(RelatingPrioritiesType relatingPrioritiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingPrioritiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingProcessType(RelatingProcessType relatingProcessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingProcessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingProcessType1(RelatingProcessType1 relatingProcessType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingProcessType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingProductType(RelatingProductType relatingProductType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingProductType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingProfilePropertiesType(RelatingProfilePropertiesType relatingProfilePropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingProfilePropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingPropertyDefinitionType(RelatingPropertyDefinitionType relatingPropertyDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingPropertyDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingResourceType(RelatingResourceType relatingResourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingResourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingSpaceProgramType(RelatingSpaceProgramType relatingSpaceProgramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingSpaceProgramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingSpaceType(RelatingSpaceType relatingSpaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingSpaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingStructuralMemberType(RelatingStructuralMemberType relatingStructuralMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingStructuralMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingStructureType(RelatingStructureType relatingStructureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingStructureType1(RelatingStructureType1 relatingStructureType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingStructureType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingSystemType(RelatingSystemType relatingSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatingTypeType(RelatingTypeType relatingTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatingTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePlacementType(RelativePlacementType relativePlacementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativePlacementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelaxationsType(RelaxationsType relaxationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relaxationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatFactorType(RepeatFactorType repeatFactorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repeatFactorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentationContextsType(RepresentationContextsType representationContextsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representationContextsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentationMapsType(RepresentationMapsType representationMapsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representationMapsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentationsType(RepresentationsType representationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentationType(RepresentationType representationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepresentedMaterialType(RepresentedMaterialType representedMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(representedMaterialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestedLocationType(RequestedLocationType requestedLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestedLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsiblePersonsType(ResponsiblePersonsType responsiblePersonsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsiblePersonsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsiblePersonType(ResponsiblePersonType responsiblePersonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsiblePersonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultForLoadGroupType(ResultForLoadGroupType resultForLoadGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultForLoadGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultValuesType(ResultValuesType resultValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolesType(RolesType rolesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rolesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolesType1(RolesType1 rolesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rolesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolesType2(RolesType2 rolesType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rolesType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleType(RoleType roleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowCellsType(RowCellsType rowCellsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rowCellsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowsType(RowsType rowsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rowsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbsmBoundaryType(SbsmBoundaryType sbsmBoundaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sbsmBoundaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduleFinishType(ScheduleFinishType scheduleFinishType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scheduleFinishType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduleStartType(ScheduleStartType scheduleStartType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scheduleStartType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondaryPlaneAngleType(SecondaryPlaneAngleType secondaryPlaneAngleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secondaryPlaneAngleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondOperandType(SecondOperandType secondOperandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secondOperandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondRepeatFactorType(SecondRepeatFactorType secondRepeatFactorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secondRepeatFactorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSectionDefinitionType(SectionDefinitionType sectionDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sectionDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSegmentsType(SegmentsType segmentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(segmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeAspectStyleType(ShapeAspectStyleType shapeAspectStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shapeAspectStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeAspectStyleType1(ShapeAspectStyleType1 shapeAspectStyleType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shapeAspectStyleType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeAspectStyleType2(ShapeAspectStyleType2 shapeAspectStyleType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shapeAspectStyleType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeAspectStyleType3(ShapeAspectStyleType3 shapeAspectStyleType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shapeAspectStyleType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeAspectStyleType4(ShapeAspectStyleType4 shapeAspectStyleType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shapeAspectStyleType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeRepresentationsType(ShapeRepresentationsType shapeRepresentationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shapeRepresentationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiteAddressType(SiteAddressType siteAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(siteAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoundLevelSingleValueType(SoundLevelSingleValueType soundLevelSingleValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(soundLevelSingleValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoundLevelTimeSeriesType(SoundLevelTimeSeriesType soundLevelTimeSeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(soundLevelTimeSeriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoundValuesType(SoundValuesType soundValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(soundValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecularColourType(SpecularColourType specularColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specularColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecularHighlightType(SpecularHighlightType specularHighlightType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specularHighlightType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpineCurveType(SpineCurveType spineCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spineCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartOfNextHatchLineType(StartOfNextHatchLineType startOfNextHatchLineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startOfNextHatchLineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartProfileType(StartProfileType startProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTimeType(StartTimeType startTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartTimeType1(StartTimeType1 startTimeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startTimeType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusTimeType(StatusTimeType statusTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(statusTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleOfSymbolType(StyleOfSymbolType styleOfSymbolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleOfSymbolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStylesType(StylesType stylesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stylesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStylesType1(StylesType1 stylesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stylesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStylesType2(StylesType2 stylesType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stylesType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubContractorType(SubContractorType subContractorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subContractorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubmittedByType(SubmittedByType submittedByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(submittedByType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubmittedOnType(SubmittedOnType submittedOnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(submittedOnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsequentAppliedLoadsType(SubsequentAppliedLoadsType subsequentAppliedLoadsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subsequentAppliedLoadsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsequentAppliedLoadsType1(SubsequentAppliedLoadsType1 subsequentAppliedLoadsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subsequentAppliedLoadsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsequentThicknessType(SubsequentThicknessType subsequentThicknessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subsequentThicknessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuffixTitlesType(SuffixTitlesType suffixTitlesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(suffixTitlesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuppliersType(SuppliersType suppliersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(suppliersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfaceColourType(SurfaceColourType surfaceColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(surfaceColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfaceOnRelatedElementType(SurfaceOnRelatedElementType surfaceOnRelatedElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(surfaceOnRelatedElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfaceOnRelatingElementType(SurfaceOnRelatingElementType surfaceOnRelatingElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(surfaceOnRelatingElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSweptAreaType(SweptAreaType sweptAreaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sweptAreaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSweptCurveType(SweptCurveType sweptCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sweptCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSymbolType(SymbolType symbolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(symbolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetType(TargetType targetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetUsersType(TargetUsersType targetUsersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetUsersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTelephoneNumbersType(TelephoneNumbersType telephoneNumbersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(telephoneNumbersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemperatureTimeSeriesType(TemperatureTimeSeriesType temperatureTimeSeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temperatureTimeSeriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextCharacterAppearanceType(TextCharacterAppearanceType textCharacterAppearanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textCharacterAppearanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextFontStyleType(TextFontStyleType textFontStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textFontStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextIndentType(TextIndentType textIndentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textIndentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextStyleType(TextStyleType textStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureCoordinatesType(TextureCoordinatesType textureCoordinatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textureCoordinatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureMapsType(TextureMapsType textureMapsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textureMapsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTexturePointsType(TexturePointsType texturePointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(texturePointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTexturesType(TexturesType texturesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(texturesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureTransformType(TextureTransformType textureTransformType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textureTransformType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextureVerticesType(TextureVerticesType textureVerticesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textureVerticesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTheActorType(TheActorType theActorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(theActorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTheOrganizationType(TheOrganizationType theOrganizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(theOrganizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThePersonType(ThePersonType thePersonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thePersonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThermalLoadTimeSeriesValuesType(ThermalLoadTimeSeriesValuesType thermalLoadTimeSeriesValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thermalLoadTimeSeriesValuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTilesType(TilesType tilesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTilingPatternType(TilingPatternType tilingPatternType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tilingPatternType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeComponentType(TimeComponentType timeComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeForTaskType(TimeForTaskType timeForTaskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeForTaskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesReferencesType(TimeSeriesReferencesType timeSeriesReferencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeSeriesReferencesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesType(TimeSeriesType timeSeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeSeriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStampType(TimeStampType timeStampType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeStampType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTotalReplacementCostType(TotalReplacementCostType totalReplacementCostType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(totalReplacementCostType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionColourType(TransmissionColourType transmissionColourType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionColourType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmissionColourType1(TransmissionColourType1 transmissionColourType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmissionColourType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreeRootExpressionType(TreeRootExpressionType treeRootExpressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(treeRootExpressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrim1Type(Trim1Type trim1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trim1Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrim2Type(Trim2Type trim2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trim2Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrueNorthType(TrueNorthType trueNorthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trueNorthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUAxesType(UAxesType uAxesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uAxesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitBasisType(UnitBasisType unitBasisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitBasisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitComponentType(UnitComponentType unitComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsInContextType(UnitsInContextType unitsInContextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitsInContextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsType(UnitsType unitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType1(UnitType1 unitType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType2(UnitType2 unitType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType3(UnitType3 unitType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType4(UnitType4 unitType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType5(UnitType5 unitType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType6(UnitType6 unitType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUos(Uos uos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uos, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateDateType(UpdateDateType updateDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundValueType(UpperBoundValueType upperBoundValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(upperBoundValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperValueType(UpperValueType upperValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(upperValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserType(UserType userType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidFromType(ValidFromType validFromType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validFromType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidUntilType(ValidUntilType validUntilType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validUntilType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueComponentType(ValueComponentType valueComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuesType(ValuesType valuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuesType1(ValuesType1 valuesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valuesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVaryingAppliedLoadLocationType(VaryingAppliedLoadLocationType varyingAppliedLoadLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varyingAppliedLoadLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVaryingAppliedLoadLocationType1(VaryingAppliedLoadLocationType1 varyingAppliedLoadLocationType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varyingAppliedLoadLocationType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVaryingThicknessLocationType(VaryingThicknessLocationType varyingThicknessLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varyingThicknessLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVAxesType(VAxesType vAxesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vAxesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVelocityTimeSeriesType(VelocityTimeSeriesType velocityTimeSeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(velocityTimeSeriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionDateType(VersionDateType versionDateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionDateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertexGeometryType(VertexGeometryType vertexGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vertexGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoidsType(VoidsType voidsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(voidsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWAxesType(WAxesType wAxesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wAxesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeightsDataType(WeightsDataType weightsDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(weightsDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWetBulbTemperatureTimeSeriesType(WetBulbTemperatureTimeSeriesType wetBulbTemperatureTimeSeriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wetBulbTemperatureTimeSeriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWordSpacingType(WordSpacingType wordSpacingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wordSpacingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorldCoordinateSystemType(WorldCoordinateSystemType worldCoordinateSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(worldCoordinateSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZoneType(ZoneType zoneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zoneType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActionSourceTypeEnum(IfcActionSourceTypeEnum ifcActionSourceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActionTypeEnum(IfcActionTypeEnum ifcActionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActuatorTypeEnum(IfcActuatorTypeEnum ifcActuatorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAddressTypeEnum(IfcAddressTypeEnum ifcAddressTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAheadOrBehind(IfcAheadOrBehind ifcAheadOrBehind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirTerminalBoxTypeEnum(IfcAirTerminalBoxTypeEnum ifcAirTerminalBoxTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirTerminalTypeEnum(IfcAirTerminalTypeEnum ifcAirTerminalTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirToAirHeatRecoveryTypeEnum(IfcAirToAirHeatRecoveryTypeEnum ifcAirToAirHeatRecoveryTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAlarmTypeEnum(IfcAlarmTypeEnum ifcAlarmTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnalysisModelTypeEnum(IfcAnalysisModelTypeEnum ifcAnalysisModelTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnalysisTheoryTypeEnum(IfcAnalysisTheoryTypeEnum ifcAnalysisTheoryTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcArithmeticOperatorEnum(IfcArithmeticOperatorEnum ifcArithmeticOperatorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAssemblyPlaceEnum(IfcAssemblyPlaceEnum ifcAssemblyPlaceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBeamTypeEnum(IfcBeamTypeEnum ifcBeamTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBenchmarkEnum(IfcBenchmarkEnum ifcBenchmarkEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoilerTypeEnum(IfcBoilerTypeEnum ifcBoilerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBooleanOperator(IfcBooleanOperator ifcBooleanOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBSplineCurveForm(IfcBSplineCurveForm ifcBSplineCurveForm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingElementProxyTypeEnum(IfcBuildingElementProxyTypeEnum ifcBuildingElementProxyTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableCarrierFittingTypeEnum(IfcCableCarrierFittingTypeEnum ifcCableCarrierFittingTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableCarrierSegmentTypeEnum(IfcCableCarrierSegmentTypeEnum ifcCableCarrierSegmentTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableSegmentTypeEnum(IfcCableSegmentTypeEnum ifcCableSegmentTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcChangeActionEnum(IfcChangeActionEnum ifcChangeActionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcChillerTypeEnum(IfcChillerTypeEnum ifcChillerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoilTypeEnum(IfcCoilTypeEnum ifcCoilTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcColumnTypeEnum(IfcColumnTypeEnum ifcColumnTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCompressorTypeEnum(IfcCompressorTypeEnum ifcCompressorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCondenserTypeEnum(IfcCondenserTypeEnum ifcCondenserTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectionTypeEnum(IfcConnectionTypeEnum ifcConnectionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstraintEnum(IfcConstraintEnum ifcConstraintEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcControllerTypeEnum(IfcControllerTypeEnum ifcControllerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCooledBeamTypeEnum(IfcCooledBeamTypeEnum ifcCooledBeamTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoolingTowerTypeEnum(IfcCoolingTowerTypeEnum ifcCoolingTowerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCostScheduleTypeEnum(IfcCostScheduleTypeEnum ifcCostScheduleTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoveringTypeEnum(IfcCoveringTypeEnum ifcCoveringTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurrencyEnum(IfcCurrencyEnum ifcCurrencyEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurtainWallTypeEnum(IfcCurtainWallTypeEnum ifcCurtainWallTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDamperTypeEnum(IfcDamperTypeEnum ifcDamperTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDataOriginEnum(IfcDataOriginEnum ifcDataOriginEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDerivedUnitEnum(IfcDerivedUnitEnum ifcDerivedUnitEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionExtentUsage(IfcDimensionExtentUsage ifcDimensionExtentUsage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDirectionSenseEnum(IfcDirectionSenseEnum ifcDirectionSenseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionChamberElementTypeEnum(IfcDistributionChamberElementTypeEnum ifcDistributionChamberElementTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentConfidentialityEnum(IfcDocumentConfidentialityEnum ifcDocumentConfidentialityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentStatusEnum(IfcDocumentStatusEnum ifcDocumentStatusEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorPanelOperationEnum(IfcDoorPanelOperationEnum ifcDoorPanelOperationEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorPanelPositionEnum(IfcDoorPanelPositionEnum ifcDoorPanelPositionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorStyleConstructionEnum(IfcDoorStyleConstructionEnum ifcDoorStyleConstructionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorStyleOperationEnum(IfcDoorStyleOperationEnum ifcDoorStyleOperationEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctFittingTypeEnum(IfcDuctFittingTypeEnum ifcDuctFittingTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctSegmentTypeEnum(IfcDuctSegmentTypeEnum ifcDuctSegmentTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctSilencerTypeEnum(IfcDuctSilencerTypeEnum ifcDuctSilencerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricApplianceTypeEnum(IfcElectricApplianceTypeEnum ifcElectricApplianceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricCurrentEnum(IfcElectricCurrentEnum ifcElectricCurrentEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricDistributionPointFunctionEnum(IfcElectricDistributionPointFunctionEnum ifcElectricDistributionPointFunctionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricFlowStorageDeviceTypeEnum(IfcElectricFlowStorageDeviceTypeEnum ifcElectricFlowStorageDeviceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricGeneratorTypeEnum(IfcElectricGeneratorTypeEnum ifcElectricGeneratorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricHeaterTypeEnum(IfcElectricHeaterTypeEnum ifcElectricHeaterTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricMotorTypeEnum(IfcElectricMotorTypeEnum ifcElectricMotorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricTimeControlTypeEnum(IfcElectricTimeControlTypeEnum ifcElectricTimeControlTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementAssemblyTypeEnum(IfcElementAssemblyTypeEnum ifcElementAssemblyTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementCompositionEnum(IfcElementCompositionEnum ifcElementCompositionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnergySequenceEnum(IfcEnergySequenceEnum ifcEnergySequenceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnvironmentalImpactCategoryEnum(IfcEnvironmentalImpactCategoryEnum ifcEnvironmentalImpactCategoryEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEvaporativeCoolerTypeEnum(IfcEvaporativeCoolerTypeEnum ifcEvaporativeCoolerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEvaporatorTypeEnum(IfcEvaporatorTypeEnum ifcEvaporatorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFanTypeEnum(IfcFanTypeEnum ifcFanTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFilterTypeEnum(IfcFilterTypeEnum ifcFilterTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFireSuppressionTerminalTypeEnum(IfcFireSuppressionTerminalTypeEnum ifcFireSuppressionTerminalTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowDirectionEnum(IfcFlowDirectionEnum ifcFlowDirectionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowInstrumentTypeEnum(IfcFlowInstrumentTypeEnum ifcFlowInstrumentTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowMeterTypeEnum(IfcFlowMeterTypeEnum ifcFlowMeterTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFootingTypeEnum(IfcFootingTypeEnum ifcFootingTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGasTerminalTypeEnum(IfcGasTerminalTypeEnum ifcGasTerminalTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricProjectionEnum(IfcGeometricProjectionEnum ifcGeometricProjectionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGlobalOrLocalEnum(IfcGlobalOrLocalEnum ifcGlobalOrLocalEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatExchangerTypeEnum(IfcHeatExchangerTypeEnum ifcHeatExchangerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHumidifierTypeEnum(IfcHumidifierTypeEnum ifcHumidifierTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInternalOrExternalEnum(IfcInternalOrExternalEnum ifcInternalOrExternalEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInventoryTypeEnum(IfcInventoryTypeEnum ifcInventoryTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcJunctionBoxTypeEnum(IfcJunctionBoxTypeEnum ifcJunctionBoxTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLampTypeEnum(IfcLampTypeEnum ifcLampTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLayerSetDirectionEnum(IfcLayerSetDirectionEnum ifcLayerSetDirectionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightDistributionCurveEnum(IfcLightDistributionCurveEnum ifcLightDistributionCurveEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightEmissionSourceEnum(IfcLightEmissionSourceEnum ifcLightEmissionSourceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightFixtureTypeEnum(IfcLightFixtureTypeEnum ifcLightFixtureTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLoadGroupTypeEnum(IfcLoadGroupTypeEnum ifcLoadGroupTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLogicalOperatorEnum(IfcLogicalOperatorEnum ifcLogicalOperatorEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMemberTypeEnum(IfcMemberTypeEnum ifcMemberTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMotorConnectionTypeEnum(IfcMotorConnectionTypeEnum ifcMotorConnectionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNullStyle(IfcNullStyle ifcNullStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjectiveEnum(IfcObjectiveEnum ifcObjectiveEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjectTypeEnum(IfcObjectTypeEnum ifcObjectTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOccupantTypeEnum(IfcOccupantTypeEnum ifcOccupantTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOutletTypeEnum(IfcOutletTypeEnum ifcOutletTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPermeableCoveringOperationEnum(IfcPermeableCoveringOperationEnum ifcPermeableCoveringOperationEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPhysicalOrVirtualEnum(IfcPhysicalOrVirtualEnum ifcPhysicalOrVirtualEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPileConstructionEnum(IfcPileConstructionEnum ifcPileConstructionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPileTypeEnum(IfcPileTypeEnum ifcPileTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPipeFittingTypeEnum(IfcPipeFittingTypeEnum ifcPipeFittingTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPipeSegmentTypeEnum(IfcPipeSegmentTypeEnum ifcPipeSegmentTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlateTypeEnum(IfcPlateTypeEnum ifcPlateTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProcedureTypeEnum(IfcProcedureTypeEnum ifcProcedureTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProfileTypeEnum(IfcProfileTypeEnum ifcProfileTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectedOrTrueLengthEnum(IfcProjectedOrTrueLengthEnum ifcProjectedOrTrueLengthEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectOrderRecordTypeEnum(IfcProjectOrderRecordTypeEnum ifcProjectOrderRecordTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectOrderTypeEnum(IfcProjectOrderTypeEnum ifcProjectOrderTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertySourceEnum(IfcPropertySourceEnum ifcPropertySourceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProtectiveDeviceTypeEnum(IfcProtectiveDeviceTypeEnum ifcProtectiveDeviceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPumpTypeEnum(IfcPumpTypeEnum ifcPumpTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRailingTypeEnum(IfcRailingTypeEnum ifcRailingTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRampFlightTypeEnum(IfcRampFlightTypeEnum ifcRampFlightTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRampTypeEnum(IfcRampTypeEnum ifcRampTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReflectanceMethodEnum(IfcReflectanceMethodEnum ifcReflectanceMethodEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcingBarRoleEnum(IfcReinforcingBarRoleEnum ifcReinforcingBarRoleEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcingBarSurfaceEnum(IfcReinforcingBarSurfaceEnum ifcReinforcingBarSurfaceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcResourceConsumptionEnum(IfcResourceConsumptionEnum ifcResourceConsumptionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRibPlateDirectionEnum(IfcRibPlateDirectionEnum ifcRibPlateDirectionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoleEnum(IfcRoleEnum ifcRoleEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoofTypeEnum(IfcRoofTypeEnum ifcRoofTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSanitaryTerminalTypeEnum(IfcSanitaryTerminalTypeEnum ifcSanitaryTerminalTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionTypeEnum(IfcSectionTypeEnum ifcSectionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSensorTypeEnum(IfcSensorTypeEnum ifcSensorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSequenceEnum(IfcSequenceEnum ifcSequenceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcServiceLifeFactorTypeEnum(IfcServiceLifeFactorTypeEnum ifcServiceLifeFactorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcServiceLifeTypeEnum(IfcServiceLifeTypeEnum ifcServiceLifeTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSIPrefix(IfcSIPrefix ifcSIPrefix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSIUnitName(IfcSIUnitName ifcSIUnitName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSlabTypeEnum(IfcSlabTypeEnum ifcSlabTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundScaleEnum(IfcSoundScaleEnum ifcSoundScaleEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceHeaterTypeEnum(IfcSpaceHeaterTypeEnum ifcSpaceHeaterTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceTypeEnum(IfcSpaceTypeEnum ifcSpaceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStackTerminalTypeEnum(IfcStackTerminalTypeEnum ifcStackTerminalTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStairFlightTypeEnum(IfcStairFlightTypeEnum ifcStairFlightTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStairTypeEnum(IfcStairTypeEnum ifcStairTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStateEnum(IfcStateEnum ifcStateEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralCurveTypeEnum(IfcStructuralCurveTypeEnum ifcStructuralCurveTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralSurfaceTypeEnum(IfcStructuralSurfaceTypeEnum ifcStructuralSurfaceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceSide(IfcSurfaceSide ifcSurfaceSide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceTextureEnum(IfcSurfaceTextureEnum ifcSurfaceTextureEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSwitchingDeviceTypeEnum(IfcSwitchingDeviceTypeEnum ifcSwitchingDeviceTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTankTypeEnum(IfcTankTypeEnum ifcTankTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTendonTypeEnum(IfcTendonTypeEnum ifcTendonTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextPath(IfcTextPath ifcTextPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalLoadSourceEnum(IfcThermalLoadSourceEnum ifcThermalLoadSourceEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalLoadTypeEnum(IfcThermalLoadTypeEnum ifcThermalLoadTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeriesDataTypeEnum(IfcTimeSeriesDataTypeEnum ifcTimeSeriesDataTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeriesScheduleTypeEnum(IfcTimeSeriesScheduleTypeEnum ifcTimeSeriesScheduleTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransformerTypeEnum(IfcTransformerTypeEnum ifcTransformerTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransitionCode(IfcTransitionCode ifcTransitionCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransportElementTypeEnum(IfcTransportElementTypeEnum ifcTransportElementTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTrimmingPreference(IfcTrimmingPreference ifcTrimmingPreference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTubeBundleTypeEnum(IfcTubeBundleTypeEnum ifcTubeBundleTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUnitaryEquipmentTypeEnum(IfcUnitaryEquipmentTypeEnum ifcUnitaryEquipmentTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUnitEnum(IfcUnitEnum ifcUnitEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcValveTypeEnum(IfcValveTypeEnum ifcValveTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVibrationIsolatorTypeEnum(IfcVibrationIsolatorTypeEnum ifcVibrationIsolatorTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWallTypeEnum(IfcWallTypeEnum ifcWallTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWasteTerminalTypeEnum(IfcWasteTerminalTypeEnum ifcWasteTerminalTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowPanelOperationEnum(IfcWindowPanelOperationEnum ifcWindowPanelOperationEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowPanelPositionEnum(IfcWindowPanelPositionEnum ifcWindowPanelPositionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowStyleConstructionEnum(IfcWindowStyleConstructionEnum ifcWindowStyleConstructionEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowStyleOperationEnum(IfcWindowStyleOperationEnum ifcWindowStyleOperationEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWorkControlTypeEnum(IfcWorkControlTypeEnum ifcWorkControlTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAbsorbedDoseMeasure(double ifcAbsorbedDoseMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAbsorbedDoseMeasureObject(Double ifcAbsorbedDoseMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAccelerationMeasure(double ifcAccelerationMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAccelerationMeasureObject(Double ifcAccelerationMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActionSourceTypeEnumObject(IfcActionSourceTypeEnum ifcActionSourceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActionTypeEnumObject(IfcActionTypeEnum ifcActionTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcActuatorTypeEnumObject(IfcActuatorTypeEnum ifcActuatorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAddressTypeEnumObject(IfcAddressTypeEnum ifcAddressTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAheadOrBehindObject(IfcAheadOrBehind ifcAheadOrBehindObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirTerminalBoxTypeEnumObject(IfcAirTerminalBoxTypeEnum ifcAirTerminalBoxTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirTerminalTypeEnumObject(IfcAirTerminalTypeEnum ifcAirTerminalTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAirToAirHeatRecoveryTypeEnumObject(IfcAirToAirHeatRecoveryTypeEnum ifcAirToAirHeatRecoveryTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAlarmTypeEnumObject(IfcAlarmTypeEnum ifcAlarmTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAmountOfSubstanceMeasure(double ifcAmountOfSubstanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAmountOfSubstanceMeasureObject(Double ifcAmountOfSubstanceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnalysisModelTypeEnumObject(IfcAnalysisModelTypeEnum ifcAnalysisModelTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAnalysisTheoryTypeEnumObject(IfcAnalysisTheoryTypeEnum ifcAnalysisTheoryTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAngularVelocityMeasure(double ifcAngularVelocityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAngularVelocityMeasureObject(Double ifcAngularVelocityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAreaMeasure(double ifcAreaMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAreaMeasureObject(Double ifcAreaMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcArithmeticOperatorEnumObject(IfcArithmeticOperatorEnum ifcArithmeticOperatorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcAssemblyPlaceEnumObject(IfcAssemblyPlaceEnum ifcAssemblyPlaceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBeamTypeEnumObject(IfcBeamTypeEnum ifcBeamTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBenchmarkEnumObject(IfcBenchmarkEnum ifcBenchmarkEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoilerTypeEnumObject(IfcBoilerTypeEnum ifcBoilerTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoolean(Boolean ifcBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBooleanObject(Boolean ifcBooleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBooleanOperatorObject(IfcBooleanOperator ifcBooleanOperatorObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBoxAlignment(String ifcBoxAlignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBSplineCurveFormObject(IfcBSplineCurveForm ifcBSplineCurveFormObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcBuildingElementProxyTypeEnumObject(IfcBuildingElementProxyTypeEnum ifcBuildingElementProxyTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableCarrierFittingTypeEnumObject(IfcCableCarrierFittingTypeEnum ifcCableCarrierFittingTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableCarrierSegmentTypeEnumObject(IfcCableCarrierSegmentTypeEnum ifcCableCarrierSegmentTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCableSegmentTypeEnumObject(IfcCableSegmentTypeEnum ifcCableSegmentTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcChangeActionEnumObject(IfcChangeActionEnum ifcChangeActionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcChillerTypeEnumObject(IfcChillerTypeEnum ifcChillerTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoilTypeEnumObject(IfcCoilTypeEnum ifcCoilTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcColumnTypeEnumObject(IfcColumnTypeEnum ifcColumnTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCompressorTypeEnumObject(IfcCompressorTypeEnum ifcCompressorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCondenserTypeEnumObject(IfcCondenserTypeEnum ifcCondenserTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConnectionTypeEnumObject(IfcConnectionTypeEnum ifcConnectionTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcConstraintEnumObject(IfcConstraintEnum ifcConstraintEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcContextDependentMeasure(double ifcContextDependentMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcContextDependentMeasureObject(Double ifcContextDependentMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcControllerTypeEnumObject(IfcControllerTypeEnum ifcControllerTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCooledBeamTypeEnumObject(IfcCooledBeamTypeEnum ifcCooledBeamTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoolingTowerTypeEnumObject(IfcCoolingTowerTypeEnum ifcCoolingTowerTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCostScheduleTypeEnumObject(IfcCostScheduleTypeEnum ifcCostScheduleTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCountMeasure(double ifcCountMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCountMeasureObject(Double ifcCountMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCoveringTypeEnumObject(IfcCoveringTypeEnum ifcCoveringTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurrencyEnumObject(IfcCurrencyEnum ifcCurrencyEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurtainWallTypeEnumObject(IfcCurtainWallTypeEnum ifcCurtainWallTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurvatureMeasure(double ifcCurvatureMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcCurvatureMeasureObject(Double ifcCurvatureMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDamperTypeEnumObject(IfcDamperTypeEnum ifcDamperTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDataOriginEnumObject(IfcDataOriginEnum ifcDataOriginEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDayInMonthNumber(long ifcDayInMonthNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDayInMonthNumberObject(Long ifcDayInMonthNumberObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDaylightSavingHour(long ifcDaylightSavingHour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDaylightSavingHourObject(Long ifcDaylightSavingHourObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDerivedUnitEnumObject(IfcDerivedUnitEnum ifcDerivedUnitEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDescriptiveMeasure(String ifcDescriptiveMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionCount(long ifcDimensionCount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionCountObject(Long ifcDimensionCountObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDimensionExtentUsageObject(IfcDimensionExtentUsage ifcDimensionExtentUsageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDirectionSenseEnumObject(IfcDirectionSenseEnum ifcDirectionSenseEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDistributionChamberElementTypeEnumObject(IfcDistributionChamberElementTypeEnum ifcDistributionChamberElementTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentConfidentialityEnumObject(IfcDocumentConfidentialityEnum ifcDocumentConfidentialityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDocumentStatusEnumObject(IfcDocumentStatusEnum ifcDocumentStatusEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorPanelOperationEnumObject(IfcDoorPanelOperationEnum ifcDoorPanelOperationEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorPanelPositionEnumObject(IfcDoorPanelPositionEnum ifcDoorPanelPositionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorStyleConstructionEnumObject(IfcDoorStyleConstructionEnum ifcDoorStyleConstructionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoorStyleOperationEnumObject(IfcDoorStyleOperationEnum ifcDoorStyleOperationEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoseEquivalentMeasure(double ifcDoseEquivalentMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDoseEquivalentMeasureObject(Double ifcDoseEquivalentMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctFittingTypeEnumObject(IfcDuctFittingTypeEnum ifcDuctFittingTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctSegmentTypeEnumObject(IfcDuctSegmentTypeEnum ifcDuctSegmentTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDuctSilencerTypeEnumObject(IfcDuctSilencerTypeEnum ifcDuctSilencerTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDynamicViscosityMeasure(double ifcDynamicViscosityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcDynamicViscosityMeasureObject(Double ifcDynamicViscosityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricApplianceTypeEnumObject(IfcElectricApplianceTypeEnum ifcElectricApplianceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricCapacitanceMeasure(double ifcElectricCapacitanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricCapacitanceMeasureObject(Double ifcElectricCapacitanceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricChargeMeasure(double ifcElectricChargeMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricChargeMeasureObject(Double ifcElectricChargeMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricConductanceMeasure(double ifcElectricConductanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricConductanceMeasureObject(Double ifcElectricConductanceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricCurrentEnumObject(IfcElectricCurrentEnum ifcElectricCurrentEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricCurrentMeasure(double ifcElectricCurrentMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricCurrentMeasureObject(Double ifcElectricCurrentMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricDistributionPointFunctionEnumObject(IfcElectricDistributionPointFunctionEnum ifcElectricDistributionPointFunctionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricFlowStorageDeviceTypeEnumObject(IfcElectricFlowStorageDeviceTypeEnum ifcElectricFlowStorageDeviceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricGeneratorTypeEnumObject(IfcElectricGeneratorTypeEnum ifcElectricGeneratorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricHeaterTypeEnumObject(IfcElectricHeaterTypeEnum ifcElectricHeaterTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricMotorTypeEnumObject(IfcElectricMotorTypeEnum ifcElectricMotorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricResistanceMeasure(double ifcElectricResistanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricResistanceMeasureObject(Double ifcElectricResistanceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricTimeControlTypeEnumObject(IfcElectricTimeControlTypeEnum ifcElectricTimeControlTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricVoltageMeasure(double ifcElectricVoltageMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElectricVoltageMeasureObject(Double ifcElectricVoltageMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementAssemblyTypeEnumObject(IfcElementAssemblyTypeEnum ifcElementAssemblyTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcElementCompositionEnumObject(IfcElementCompositionEnum ifcElementCompositionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnergyMeasure(double ifcEnergyMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnergyMeasureObject(Double ifcEnergyMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnergySequenceEnumObject(IfcEnergySequenceEnum ifcEnergySequenceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEnvironmentalImpactCategoryEnumObject(IfcEnvironmentalImpactCategoryEnum ifcEnvironmentalImpactCategoryEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEvaporativeCoolerTypeEnumObject(IfcEvaporativeCoolerTypeEnum ifcEvaporativeCoolerTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcEvaporatorTypeEnumObject(IfcEvaporatorTypeEnum ifcEvaporatorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFanTypeEnumObject(IfcFanTypeEnum ifcFanTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFilterTypeEnumObject(IfcFilterTypeEnum ifcFilterTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFireSuppressionTerminalTypeEnumObject(IfcFireSuppressionTerminalTypeEnum ifcFireSuppressionTerminalTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowDirectionEnumObject(IfcFlowDirectionEnum ifcFlowDirectionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowInstrumentTypeEnumObject(IfcFlowInstrumentTypeEnum ifcFlowInstrumentTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFlowMeterTypeEnumObject(IfcFlowMeterTypeEnum ifcFlowMeterTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFontStyle(String ifcFontStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFontVariant(String ifcFontVariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFontWeight(String ifcFontWeight, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFootingTypeEnumObject(IfcFootingTypeEnum ifcFootingTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcForceMeasure(double ifcForceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcForceMeasureObject(Double ifcForceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFrequencyMeasure(double ifcFrequencyMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcFrequencyMeasureObject(Double ifcFrequencyMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGasTerminalTypeEnumObject(IfcGasTerminalTypeEnum ifcGasTerminalTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGeometricProjectionEnumObject(IfcGeometricProjectionEnum ifcGeometricProjectionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGloballyUniqueId(String ifcGloballyUniqueId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIfcGloballyUniqueId_MinLength(ifcGloballyUniqueId, diagnostics, context);
		if (result || diagnostics != null) result &= validateIfcGloballyUniqueId_MaxLength(ifcGloballyUniqueId, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Ifc Globally Unique Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGloballyUniqueId_MinLength(String ifcGloballyUniqueId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ifcGloballyUniqueId.length();
		boolean result = length >= 22;
		if (!result && diagnostics != null)
			reportMinLengthViolation(FinalPackage.eINSTANCE.getIfcGloballyUniqueId(), ifcGloballyUniqueId, length, 22, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Ifc Globally Unique Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGloballyUniqueId_MaxLength(String ifcGloballyUniqueId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = ifcGloballyUniqueId.length();
		boolean result = length <= 22;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(FinalPackage.eINSTANCE.getIfcGloballyUniqueId(), ifcGloballyUniqueId, length, 22, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcGlobalOrLocalEnumObject(IfcGlobalOrLocalEnum ifcGlobalOrLocalEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatExchangerTypeEnumObject(IfcHeatExchangerTypeEnum ifcHeatExchangerTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatFluxDensityMeasure(double ifcHeatFluxDensityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatFluxDensityMeasureObject(Double ifcHeatFluxDensityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatingValueMeasure(double ifcHeatingValueMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHeatingValueMeasureObject(Double ifcHeatingValueMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHourInDay(long ifcHourInDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHourInDayObject(Long ifcHourInDayObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcHumidifierTypeEnumObject(IfcHumidifierTypeEnum ifcHumidifierTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIdentifier(String ifcIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIlluminanceMeasure(double ifcIlluminanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIlluminanceMeasureObject(Double ifcIlluminanceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInductanceMeasure(double ifcInductanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInductanceMeasureObject(Double ifcInductanceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInteger(Long ifcInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIntegerCountRateMeasure(long ifcIntegerCountRateMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIntegerCountRateMeasureObject(Long ifcIntegerCountRateMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIntegerObject(Long ifcIntegerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInternalOrExternalEnumObject(IfcInternalOrExternalEnum ifcInternalOrExternalEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcInventoryTypeEnumObject(IfcInventoryTypeEnum ifcInventoryTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIonConcentrationMeasure(double ifcIonConcentrationMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIonConcentrationMeasureObject(Double ifcIonConcentrationMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIsothermalMoistureCapacityMeasure(double ifcIsothermalMoistureCapacityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcIsothermalMoistureCapacityMeasureObject(Double ifcIsothermalMoistureCapacityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcJunctionBoxTypeEnumObject(IfcJunctionBoxTypeEnum ifcJunctionBoxTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcKinematicViscosityMeasure(double ifcKinematicViscosityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcKinematicViscosityMeasureObject(Double ifcKinematicViscosityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLabel(String ifcLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLampTypeEnumObject(IfcLampTypeEnum ifcLampTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLayerSetDirectionEnumObject(IfcLayerSetDirectionEnum ifcLayerSetDirectionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLengthMeasure(Double ifcLengthMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLengthMeasureObject(Double ifcLengthMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightDistributionCurveEnumObject(IfcLightDistributionCurveEnum ifcLightDistributionCurveEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightEmissionSourceEnumObject(IfcLightEmissionSourceEnum ifcLightEmissionSourceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLightFixtureTypeEnumObject(IfcLightFixtureTypeEnum ifcLightFixtureTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearForceMeasure(double ifcLinearForceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearForceMeasureObject(Double ifcLinearForceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearMomentMeasure(double ifcLinearMomentMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearMomentMeasureObject(Double ifcLinearMomentMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearStiffnessMeasure(double ifcLinearStiffnessMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearStiffnessMeasureObject(Double ifcLinearStiffnessMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearVelocityMeasure(double ifcLinearVelocityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLinearVelocityMeasureObject(Double ifcLinearVelocityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLoadGroupTypeEnumObject(IfcLoadGroupTypeEnum ifcLoadGroupTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLogical(Logical ifcLogical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLogicalOperatorEnumObject(IfcLogicalOperatorEnum ifcLogicalOperatorEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLuminousFluxMeasure(double ifcLuminousFluxMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLuminousFluxMeasureObject(Double ifcLuminousFluxMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLuminousIntensityDistributionMeasure(double ifcLuminousIntensityDistributionMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLuminousIntensityDistributionMeasureObject(Double ifcLuminousIntensityDistributionMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLuminousIntensityMeasure(double ifcLuminousIntensityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcLuminousIntensityMeasureObject(Double ifcLuminousIntensityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMagneticFluxDensityMeasure(double ifcMagneticFluxDensityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMagneticFluxDensityMeasureObject(Double ifcMagneticFluxDensityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMagneticFluxMeasure(double ifcMagneticFluxMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMagneticFluxMeasureObject(Double ifcMagneticFluxMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassDensityMeasure(double ifcMassDensityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassDensityMeasureObject(Double ifcMassDensityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassFlowRateMeasure(double ifcMassFlowRateMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassFlowRateMeasureObject(Double ifcMassFlowRateMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassMeasure(double ifcMassMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassMeasureObject(Double ifcMassMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassPerLengthMeasure(double ifcMassPerLengthMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMassPerLengthMeasureObject(Double ifcMassPerLengthMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMemberTypeEnumObject(IfcMemberTypeEnum ifcMemberTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMinuteInHour(long ifcMinuteInHour, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMinuteInHourObject(Long ifcMinuteInHourObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfElasticityMeasure(double ifcModulusOfElasticityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfElasticityMeasureObject(Double ifcModulusOfElasticityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfLinearSubgradeReactionMeasure(double ifcModulusOfLinearSubgradeReactionMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfLinearSubgradeReactionMeasureObject(Double ifcModulusOfLinearSubgradeReactionMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfRotationalSubgradeReactionMeasure(double ifcModulusOfRotationalSubgradeReactionMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfRotationalSubgradeReactionMeasureObject(Double ifcModulusOfRotationalSubgradeReactionMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfSubgradeReactionMeasure(double ifcModulusOfSubgradeReactionMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcModulusOfSubgradeReactionMeasureObject(Double ifcModulusOfSubgradeReactionMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMoistureDiffusivityMeasure(double ifcMoistureDiffusivityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMoistureDiffusivityMeasureObject(Double ifcMoistureDiffusivityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMolecularWeightMeasure(double ifcMolecularWeightMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMolecularWeightMeasureObject(Double ifcMolecularWeightMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMomentOfInertiaMeasure(double ifcMomentOfInertiaMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMomentOfInertiaMeasureObject(Double ifcMomentOfInertiaMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMonetaryMeasure(double ifcMonetaryMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMonetaryMeasureObject(Double ifcMonetaryMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMonthInYearNumber(long ifcMonthInYearNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMonthInYearNumberObject(Long ifcMonthInYearNumberObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcMotorConnectionTypeEnumObject(IfcMotorConnectionTypeEnum ifcMotorConnectionTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNormalisedRatioMeasure(double ifcNormalisedRatioMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNormalisedRatioMeasureObject(Double ifcNormalisedRatioMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNullStyleObject(IfcNullStyle ifcNullStyleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNumericMeasure(double ifcNumericMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcNumericMeasureObject(Double ifcNumericMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjectiveEnumObject(IfcObjectiveEnum ifcObjectiveEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcObjectTypeEnumObject(IfcObjectTypeEnum ifcObjectTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOccupantTypeEnumObject(IfcOccupantTypeEnum ifcOccupantTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcOutletTypeEnumObject(IfcOutletTypeEnum ifcOutletTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcParameterValue(double ifcParameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcParameterValueObject(Double ifcParameterValueObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPermeableCoveringOperationEnumObject(IfcPermeableCoveringOperationEnum ifcPermeableCoveringOperationEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPHMeasure(double ifcPHMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPHMeasureObject(Double ifcPHMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPhysicalOrVirtualEnumObject(IfcPhysicalOrVirtualEnum ifcPhysicalOrVirtualEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPileConstructionEnumObject(IfcPileConstructionEnum ifcPileConstructionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPileTypeEnumObject(IfcPileTypeEnum ifcPileTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPipeFittingTypeEnumObject(IfcPipeFittingTypeEnum ifcPipeFittingTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPipeSegmentTypeEnumObject(IfcPipeSegmentTypeEnum ifcPipeSegmentTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlanarForceMeasure(double ifcPlanarForceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlanarForceMeasureObject(Double ifcPlanarForceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlaneAngleMeasure(double ifcPlaneAngleMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlaneAngleMeasureObject(Double ifcPlaneAngleMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPlateTypeEnumObject(IfcPlateTypeEnum ifcPlateTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPositiveLengthMeasure(double ifcPositiveLengthMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPositiveLengthMeasureObject(Double ifcPositiveLengthMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPositivePlaneAngleMeasure(double ifcPositivePlaneAngleMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPositivePlaneAngleMeasureObject(Double ifcPositivePlaneAngleMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPositiveRatioMeasure(double ifcPositiveRatioMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPositiveRatioMeasureObject(Double ifcPositiveRatioMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPowerMeasure(double ifcPowerMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPowerMeasureObject(Double ifcPowerMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPresentableText(String ifcPresentableText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPressureMeasure(double ifcPressureMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPressureMeasureObject(Double ifcPressureMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProcedureTypeEnumObject(IfcProcedureTypeEnum ifcProcedureTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProfileTypeEnumObject(IfcProfileTypeEnum ifcProfileTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectedOrTrueLengthEnumObject(IfcProjectedOrTrueLengthEnum ifcProjectedOrTrueLengthEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectOrderRecordTypeEnumObject(IfcProjectOrderRecordTypeEnum ifcProjectOrderRecordTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProjectOrderTypeEnumObject(IfcProjectOrderTypeEnum ifcProjectOrderTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPropertySourceEnumObject(IfcPropertySourceEnum ifcPropertySourceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcProtectiveDeviceTypeEnumObject(IfcProtectiveDeviceTypeEnum ifcProtectiveDeviceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcPumpTypeEnumObject(IfcPumpTypeEnum ifcPumpTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRadioActivityMeasure(double ifcRadioActivityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRadioActivityMeasureObject(Double ifcRadioActivityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRailingTypeEnumObject(IfcRailingTypeEnum ifcRailingTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRampFlightTypeEnumObject(IfcRampFlightTypeEnum ifcRampFlightTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRampTypeEnumObject(IfcRampTypeEnum ifcRampTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRatioMeasure(double ifcRatioMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRatioMeasureObject(Double ifcRatioMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReal(double ifcReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRealObject(Double ifcRealObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReflectanceMethodEnumObject(IfcReflectanceMethodEnum ifcReflectanceMethodEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcingBarRoleEnumObject(IfcReinforcingBarRoleEnum ifcReinforcingBarRoleEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcReinforcingBarSurfaceEnumObject(IfcReinforcingBarSurfaceEnum ifcReinforcingBarSurfaceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcResourceConsumptionEnumObject(IfcResourceConsumptionEnum ifcResourceConsumptionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRibPlateDirectionEnumObject(IfcRibPlateDirectionEnum ifcRibPlateDirectionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoleEnumObject(IfcRoleEnum ifcRoleEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRoofTypeEnumObject(IfcRoofTypeEnum ifcRoofTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRotationalFrequencyMeasure(double ifcRotationalFrequencyMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRotationalFrequencyMeasureObject(Double ifcRotationalFrequencyMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRotationalMassMeasure(double ifcRotationalMassMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRotationalMassMeasureObject(Double ifcRotationalMassMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRotationalStiffnessMeasure(double ifcRotationalStiffnessMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcRotationalStiffnessMeasureObject(Double ifcRotationalStiffnessMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSanitaryTerminalTypeEnumObject(IfcSanitaryTerminalTypeEnum ifcSanitaryTerminalTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSecondInMinute(double ifcSecondInMinute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSecondInMinuteObject(Double ifcSecondInMinuteObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionalAreaIntegralMeasure(double ifcSectionalAreaIntegralMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionalAreaIntegralMeasureObject(Double ifcSectionalAreaIntegralMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionModulusMeasure(double ifcSectionModulusMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionModulusMeasureObject(Double ifcSectionModulusMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSectionTypeEnumObject(IfcSectionTypeEnum ifcSectionTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSensorTypeEnumObject(IfcSensorTypeEnum ifcSensorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSequenceEnumObject(IfcSequenceEnum ifcSequenceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcServiceLifeFactorTypeEnumObject(IfcServiceLifeFactorTypeEnum ifcServiceLifeFactorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcServiceLifeTypeEnumObject(IfcServiceLifeTypeEnum ifcServiceLifeTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcShearModulusMeasure(double ifcShearModulusMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcShearModulusMeasureObject(Double ifcShearModulusMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSIPrefixObject(IfcSIPrefix ifcSIPrefixObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSIUnitNameObject(IfcSIUnitName ifcSIUnitNameObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSlabTypeEnumObject(IfcSlabTypeEnum ifcSlabTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSolidAngleMeasure(double ifcSolidAngleMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSolidAngleMeasureObject(Double ifcSolidAngleMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundPowerMeasure(double ifcSoundPowerMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundPowerMeasureObject(Double ifcSoundPowerMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundPressureMeasure(double ifcSoundPressureMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundPressureMeasureObject(Double ifcSoundPressureMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSoundScaleEnumObject(IfcSoundScaleEnum ifcSoundScaleEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceHeaterTypeEnumObject(IfcSpaceHeaterTypeEnum ifcSpaceHeaterTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpaceTypeEnumObject(IfcSpaceTypeEnum ifcSpaceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecificHeatCapacityMeasure(double ifcSpecificHeatCapacityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecificHeatCapacityMeasureObject(Double ifcSpecificHeatCapacityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecularExponent(double ifcSpecularExponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecularExponentObject(Double ifcSpecularExponentObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecularRoughness(double ifcSpecularRoughness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSpecularRoughnessObject(Double ifcSpecularRoughnessObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStackTerminalTypeEnumObject(IfcStackTerminalTypeEnum ifcStackTerminalTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStairFlightTypeEnumObject(IfcStairFlightTypeEnum ifcStairFlightTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStairTypeEnumObject(IfcStairTypeEnum ifcStairTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStateEnumObject(IfcStateEnum ifcStateEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralCurveTypeEnumObject(IfcStructuralCurveTypeEnum ifcStructuralCurveTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcStructuralSurfaceTypeEnumObject(IfcStructuralSurfaceTypeEnum ifcStructuralSurfaceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceSideObject(IfcSurfaceSide ifcSurfaceSideObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSurfaceTextureEnumObject(IfcSurfaceTextureEnum ifcSurfaceTextureEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcSwitchingDeviceTypeEnumObject(IfcSwitchingDeviceTypeEnum ifcSwitchingDeviceTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTankTypeEnumObject(IfcTankTypeEnum ifcTankTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTemperatureGradientMeasure(double ifcTemperatureGradientMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTemperatureGradientMeasureObject(Double ifcTemperatureGradientMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTendonTypeEnumObject(IfcTendonTypeEnum ifcTendonTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcText(String ifcText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextAlignment(String ifcTextAlignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextDecoration(String ifcTextDecoration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextFontName(String ifcTextFontName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextPathObject(IfcTextPath ifcTextPathObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTextTransformation(String ifcTextTransformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalAdmittanceMeasure(double ifcThermalAdmittanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalAdmittanceMeasureObject(Double ifcThermalAdmittanceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalConductivityMeasure(double ifcThermalConductivityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalConductivityMeasureObject(Double ifcThermalConductivityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalExpansionCoefficientMeasure(double ifcThermalExpansionCoefficientMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalExpansionCoefficientMeasureObject(Double ifcThermalExpansionCoefficientMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalLoadSourceEnumObject(IfcThermalLoadSourceEnum ifcThermalLoadSourceEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalLoadTypeEnumObject(IfcThermalLoadTypeEnum ifcThermalLoadTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalResistanceMeasure(double ifcThermalResistanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalResistanceMeasureObject(Double ifcThermalResistanceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalTransmittanceMeasure(double ifcThermalTransmittanceMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermalTransmittanceMeasureObject(Double ifcThermalTransmittanceMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermodynamicTemperatureMeasure(double ifcThermodynamicTemperatureMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcThermodynamicTemperatureMeasureObject(Double ifcThermodynamicTemperatureMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeMeasure(double ifcTimeMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeMeasureObject(Double ifcTimeMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeriesDataTypeEnumObject(IfcTimeSeriesDataTypeEnum ifcTimeSeriesDataTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeSeriesScheduleTypeEnumObject(IfcTimeSeriesScheduleTypeEnum ifcTimeSeriesScheduleTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeStamp(long ifcTimeStamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTimeStampObject(Long ifcTimeStampObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTorqueMeasure(double ifcTorqueMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTorqueMeasureObject(Double ifcTorqueMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransformerTypeEnumObject(IfcTransformerTypeEnum ifcTransformerTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransitionCodeObject(IfcTransitionCode ifcTransitionCodeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTransportElementTypeEnumObject(IfcTransportElementTypeEnum ifcTransportElementTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTrimmingPreferenceObject(IfcTrimmingPreference ifcTrimmingPreferenceObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcTubeBundleTypeEnumObject(IfcTubeBundleTypeEnum ifcTubeBundleTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUnitaryEquipmentTypeEnumObject(IfcUnitaryEquipmentTypeEnum ifcUnitaryEquipmentTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcUnitEnumObject(IfcUnitEnum ifcUnitEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcValveTypeEnumObject(IfcValveTypeEnum ifcValveTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVaporPermeabilityMeasure(double ifcVaporPermeabilityMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVaporPermeabilityMeasureObject(Double ifcVaporPermeabilityMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVibrationIsolatorTypeEnumObject(IfcVibrationIsolatorTypeEnum ifcVibrationIsolatorTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVolumeMeasure(double ifcVolumeMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVolumeMeasureObject(Double ifcVolumeMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVolumetricFlowRateMeasure(double ifcVolumetricFlowRateMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcVolumetricFlowRateMeasureObject(Double ifcVolumetricFlowRateMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWallTypeEnumObject(IfcWallTypeEnum ifcWallTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWarpingConstantMeasure(double ifcWarpingConstantMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWarpingConstantMeasureObject(Double ifcWarpingConstantMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWarpingMomentMeasure(double ifcWarpingMomentMeasure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWarpingMomentMeasureObject(Double ifcWarpingMomentMeasureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWasteTerminalTypeEnumObject(IfcWasteTerminalTypeEnum ifcWasteTerminalTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowPanelOperationEnumObject(IfcWindowPanelOperationEnum ifcWindowPanelOperationEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowPanelPositionEnumObject(IfcWindowPanelPositionEnum ifcWindowPanelPositionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowStyleConstructionEnumObject(IfcWindowStyleConstructionEnum ifcWindowStyleConstructionEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWindowStyleOperationEnumObject(IfcWindowStyleOperationEnum ifcWindowStyleOperationEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcWorkControlTypeEnumObject(IfcWorkControlTypeEnum ifcWorkControlTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcYearNumber(long ifcYearNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfcYearNumberObject(Long ifcYearNumberObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FinalValidator
