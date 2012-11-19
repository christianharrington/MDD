/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonFactory;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

import org.tech.iai.ifc.xml.ifc._2x3.final_.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinalFactoryImpl extends EFactoryImpl implements FinalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FinalFactory init() {
		try {
			FinalFactory theFinalFactory = (FinalFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.iai-tech.org/ifcXML/IFC2x3/FINAL"); 
			if (theFinalFactory != null) {
				return theFinalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FinalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FinalPackage.ACTING_ROLE_TYPE: return createActingRoleType();
			case FinalPackage.ACTOR_TYPE: return createActorType();
			case FinalPackage.ACTUAL_FINISH_TYPE: return createActualFinishType();
			case FinalPackage.ACTUAL_START_TYPE: return createActualStartType();
			case FinalPackage.ADDITIONAL_CONDITIONS_TYPE: return createAdditionalConditionsType();
			case FinalPackage.ADDRESSES_TYPE: return createAddressesType();
			case FinalPackage.ADDRESSES_TYPE1: return createAddressesType1();
			case FinalPackage.ADDRESS_LINES_TYPE: return createAddressLinesType();
			case FinalPackage.ANNOTATED_CURVE_TYPE: return createAnnotatedCurveType();
			case FinalPackage.APPLICABLE_DATES_TYPE: return createApplicableDatesType();
			case FinalPackage.APPLICABLE_DATE_TYPE: return createApplicableDateType();
			case FinalPackage.APPLICATION_DEVELOPER_TYPE: return createApplicationDeveloperType();
			case FinalPackage.APPLIED_CONDITION_TYPE: return createAppliedConditionType();
			case FinalPackage.APPLIED_CONDITION_TYPE1: return createAppliedConditionType1();
			case FinalPackage.APPLIED_LOAD_TYPE: return createAppliedLoadType();
			case FinalPackage.APPLIED_VALUE_TYPE: return createAppliedValueType();
			case FinalPackage.APPROVAL_DATE_TIME_TYPE: return createApprovalDateTimeType();
			case FinalPackage.APPROVAL_TYPE: return createApprovalType();
			case FinalPackage.APPROVAL_TYPE1: return createApprovalType1();
			case FinalPackage.APPROVED_PROPERTIES_TYPE: return createApprovedPropertiesType();
			case FinalPackage.ASSIGNED_ITEMS_TYPE: return createAssignedItemsType();
			case FinalPackage.AXIS1_TYPE: return createAxis1Type();
			case FinalPackage.AXIS2_TYPE: return createAxis2Type();
			case FinalPackage.AXIS3_TYPE: return createAxis3Type();
			case FinalPackage.AXIS_CURVE_TYPE: return createAxisCurveType();
			case FinalPackage.AXIS_POSITION_TYPE: return createAxisPositionType();
			case FinalPackage.AXIS_TYPE: return createAxisType();
			case FinalPackage.AXIS_TYPE1: return createAxisType1();
			case FinalPackage.AXIS_TYPE2: return createAxisType2();
			case FinalPackage.BACKGROUND_COLOUR_TYPE: return createBackgroundColourType();
			case FinalPackage.BASE_QUANTITY_TYPE: return createBaseQuantityType();
			case FinalPackage.BASE_SURFACE_TYPE: return createBaseSurfaceType();
			case FinalPackage.BASIS_CURVE_TYPE: return createBasisCurveType();
			case FinalPackage.BASIS_CURVE_TYPE1: return createBasisCurveType1();
			case FinalPackage.BASIS_CURVE_TYPE2: return createBasisCurveType2();
			case FinalPackage.BASIS_CURVE_TYPE3: return createBasisCurveType3();
			case FinalPackage.BASIS_SURFACE_TYPE: return createBasisSurfaceType();
			case FinalPackage.BASIS_SURFACE_TYPE1: return createBasisSurfaceType1();
			case FinalPackage.BASIS_SURFACE_TYPE2: return createBasisSurfaceType2();
			case FinalPackage.BENCHMARK_VALUES_TYPE: return createBenchmarkValuesType();
			case FinalPackage.BOUNDS_TYPE: return createBoundsType();
			case FinalPackage.BOUND_TYPE: return createBoundType();
			case FinalPackage.BUILDING_ADDRESS_TYPE: return createBuildingAddressType();
			case FinalPackage.CAUSED_BY_TYPE: return createCausedByType();
			case FinalPackage.CFS_FACES_TYPE: return createCfsFacesType();
			case FinalPackage.CHARACTER_SPACING_TYPE: return createCharacterSpacingType();
			case FinalPackage.CLASSIFIED_CONSTRAINT_TYPE: return createClassifiedConstraintType();
			case FinalPackage.CLASSIFIED_MATERIAL_TYPE: return createClassifiedMaterialType();
			case FinalPackage.COLOUR_APPEARANCE_TYPE: return createColourAppearanceType();
			case FinalPackage.COLOUR_TYPE: return createColourType();
			case FinalPackage.COMPONENT_OF_TOTAL_TYPE: return createComponentOfTotalType();
			case FinalPackage.COMPONENTS_TYPE: return createComponentsType();
			case FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE: return createConditionCoordinateSystemType();
			case FinalPackage.CONNECTION_CONSTRAINT_TYPE: return createConnectionConstraintType();
			case FinalPackage.CONNECTION_GEOMETRY_TYPE: return createConnectionGeometryType();
			case FinalPackage.CONNECTION_GEOMETRY_TYPE1: return createConnectionGeometryType1();
			case FinalPackage.CONTENTS_TYPE: return createContentsType();
			case FinalPackage.CONTEXT_OF_ITEMS_TYPE: return createContextOfItemsType();
			case FinalPackage.CONTROL_POINTS_LIST_TYPE: return createControlPointsListType();
			case FinalPackage.CONVERSION_FACTOR_TYPE: return createConversionFactorType();
			case FinalPackage.COORDINATES_TYPE: return createCoordinatesType();
			case FinalPackage.COORDINATES_TYPE1: return createCoordinatesType1();
			case FinalPackage.CORNER_TYPE: return createCornerType();
			case FinalPackage.CREATING_ACTOR_TYPE: return createCreatingActorType();
			case FinalPackage.CREATION_DATE_TYPE: return createCreationDateType();
			case FinalPackage.CREATION_TIME_TYPE: return createCreationTimeType();
			case FinalPackage.CREATION_TIME_TYPE1: return createCreationTimeType1();
			case FinalPackage.CREATORS_TYPE: return createCreatorsType();
			case FinalPackage.CRITERION_DATE_TIME_TYPE: return createCriterionDateTimeType();
			case FinalPackage.CRITERION_TYPE: return createCriterionType();
			case FinalPackage.CROSS_SECTION_POSITIONS_TYPE: return createCrossSectionPositionsType();
			case FinalPackage.CROSS_SECTION_REINFORCEMENT_DEFINITIONS_TYPE: return createCrossSectionReinforcementDefinitionsType();
			case FinalPackage.CROSS_SECTIONS_TYPE: return createCrossSectionsType();
			case FinalPackage.CURRENT_VALUE_TYPE: return createCurrentValueType();
			case FinalPackage.CURRENT_VALUE_TYPE1: return createCurrentValueType1();
			case FinalPackage.CURVE_COLOUR_TYPE: return createCurveColourType();
			case FinalPackage.CURVE_FONT_TYPE: return createCurveFontType();
			case FinalPackage.CURVE_FONT_TYPE1: return createCurveFontType1();
			case FinalPackage.CURVE_ON_RELATED_ELEMENT_TYPE: return createCurveOnRelatedElementType();
			case FinalPackage.CURVE_ON_RELATING_ELEMENT_TYPE: return createCurveOnRelatingElementType();
			case FinalPackage.CURVE_TYPE: return createCurveType();
			case FinalPackage.CURVE_WIDTH_TYPE: return createCurveWidthType();
			case FinalPackage.DATA_VALUE_TYPE: return createDataValueType();
			case FinalPackage.DATE_COMPONENT_TYPE: return createDateComponentType();
			case FinalPackage.DEFINED_UNIT_TYPE: return createDefinedUnitType();
			case FinalPackage.DEFINED_VALUES_TYPE: return createDefinedValuesType();
			case FinalPackage.DEFINING_UNIT_TYPE: return createDefiningUnitType();
			case FinalPackage.DEFINING_VALUES_TYPE: return createDefiningValuesType();
			case FinalPackage.DEFINITION_TYPE: return createDefinitionType();
			case FinalPackage.DEPENDANT_PROPERTY_TYPE: return createDependantPropertyType();
			case FinalPackage.DEPENDING_PROPERTY_TYPE: return createDependingPropertyType();
			case FinalPackage.DEPRECIATED_VALUE_TYPE: return createDepreciatedValueType();
			case FinalPackage.DIFFUSE_COLOUR_TYPE: return createDiffuseColourType();
			case FinalPackage.DIFFUSE_REFLECTION_COLOUR_TYPE: return createDiffuseReflectionColourType();
			case FinalPackage.DIFFUSE_TRANSMISSION_COLOUR_TYPE: return createDiffuseTransmissionColourType();
			case FinalPackage.DIFFUSE_TRANSMISSION_COLOUR_TYPE1: return createDiffuseTransmissionColourType1();
			case FinalPackage.DIMENSIONS_TYPE: return createDimensionsType();
			case FinalPackage.DIRECTION_RATIOS_TYPE: return createDirectionRatiosType();
			case FinalPackage.DIRECTRIX_TYPE: return createDirectrixType();
			case FinalPackage.DIRECTRIX_TYPE1: return createDirectrixType1();
			case FinalPackage.DIR_TYPE: return createDirType();
			case FinalPackage.DISTRIBUTION_DATA_TYPE: return createDistributionDataType();
			case FinalPackage.DOCUMENT_OWNER_TYPE: return createDocumentOwnerType();
			case FinalPackage.DOCUMENT_REFERENCES_TYPE: return createDocumentReferencesType();
			case FinalPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case FinalPackage.EARLY_FINISH_TYPE: return createEarlyFinishType();
			case FinalPackage.EARLY_START_TYPE: return createEarlyStartType();
			case FinalPackage.EDGE_ELEMENT_TYPE: return createEdgeElementType();
			case FinalPackage.EDGE_END_TYPE: return createEdgeEndType();
			case FinalPackage.EDGE_GEOMETRY_TYPE: return createEdgeGeometryType();
			case FinalPackage.EDGE_LIST_TYPE: return createEdgeListType();
			case FinalPackage.EDGE_LIST_TYPE1: return createEdgeListType1();
			case FinalPackage.EDGE_START_TYPE: return createEdgeStartType();
			case FinalPackage.EDITION_DATE_TYPE: return createEditionDateType();
			case FinalPackage.EDITORS_TYPE: return createEditorsType();
			case FinalPackage.ELECTRONIC_FORMAT_TYPE: return createElectronicFormatType();
			case FinalPackage.ELECTRONIC_MAIL_ADDRESSES_TYPE: return createElectronicMailAddressesType();
			case FinalPackage.ELEMENTS_TYPE: return createElementsType();
			case FinalPackage.ELEMENTS_TYPE1: return createElementsType1();
			case FinalPackage.ENCLOSURE_TYPE: return createEnclosureType();
			case FinalPackage.END_PROFILE_TYPE: return createEndProfileType();
			case FinalPackage.END_TIME_TYPE: return createEndTimeType();
			case FinalPackage.ENUMERATION_REFERENCE_TYPE: return createEnumerationReferenceType();
			case FinalPackage.ENUMERATION_VALUES_TYPE: return createEnumerationValuesType();
			case FinalPackage.ENUMERATION_VALUES_TYPE1: return createEnumerationValuesType1();
			case FinalPackage.EXTENDED_PROPERTIES_TYPE: return createExtendedPropertiesType();
			case FinalPackage.EXTENT_TYPE: return createExtentType();
			case FinalPackage.EXTRUDED_DIRECTION_TYPE: return createExtrudedDirectionType();
			case FinalPackage.EXTRUDED_DIRECTION_TYPE1: return createExtrudedDirectionType1();
			case FinalPackage.FACE_SURFACE_TYPE: return createFaceSurfaceType();
			case FinalPackage.FACSIMILE_NUMBERS_TYPE: return createFacsimileNumbersType();
			case FinalPackage.FBSM_FACES_TYPE: return createFbsmFacesType();
			case FinalPackage.FILL_STYLES_TYPE: return createFillStylesType();
			case FinalPackage.FILL_STYLE_TARGET_TYPE: return createFillStyleTargetType();
			case FinalPackage.FINISH_TIME_TYPE: return createFinishTimeType();
			case FinalPackage.FIRST_OPERAND_TYPE: return createFirstOperandType();
			case FinalPackage.FIXED_UNTIL_DATE_TYPE: return createFixedUntilDateType();
			case FinalPackage.FLOW_CONDITION_TIME_SERIES_TYPE: return createFlowConditionTimeSeriesType();
			case FinalPackage.FLOWRATE_SINGLE_VALUE_TYPE: return createFlowrateSingleValueType();
			case FinalPackage.FLOWRATE_TIME_SERIES_TYPE: return createFlowrateTimeSeriesType();
			case FinalPackage.FLUID_TYPE: return createFluidType();
			case FinalPackage.FONT_FAMILY_TYPE: return createFontFamilyType();
			case FinalPackage.FONT_SIZE_TYPE: return createFontSizeType();
			case FinalPackage.FOR_LAYER_SET_TYPE: return createForLayerSetType();
			case FinalPackage.HAS_PROPERTIES_TYPE: return createHasPropertiesType();
			case FinalPackage.HAS_PROPERTIES_TYPE1: return createHasPropertiesType1();
			case FinalPackage.HAS_PROPERTY_SETS_TYPE: return createHasPropertySetsType();
			case FinalPackage.HAS_QUANTITIES_TYPE: return createHasQuantitiesType();
			case FinalPackage.HAS_RESULTS_TYPE: return createHasResultsType();
			case FinalPackage.HATCH_LINE_APPEARANCE_TYPE: return createHatchLineAppearanceType();
			case FinalPackage.IFC2_DCOMPOSITE_CURVE: return createIfc2DCompositeCurve();
			case FinalPackage.IFC_ABSORBED_DOSE_MEASURE_TYPE: return createIfcAbsorbedDoseMeasureType();
			case FinalPackage.IFC_ACCELERATION_MEASURE_TYPE: return createIfcAccelerationMeasureType();
			case FinalPackage.IFC_ACTION_REQUEST: return createIfcActionRequest();
			case FinalPackage.IFC_ACTION_SOURCE_TYPE_ENUM_TYPE: return createIfcActionSourceTypeEnumType();
			case FinalPackage.IFC_ACTION_TYPE_ENUM_TYPE: return createIfcActionTypeEnumType();
			case FinalPackage.IFC_ACTOR: return createIfcActor();
			case FinalPackage.IFC_ACTOR_ROLE: return createIfcActorRole();
			case FinalPackage.IFC_ACTOR_SELECT: return createIfcActorSelect();
			case FinalPackage.IFC_ACTUATOR_TYPE: return createIfcActuatorType();
			case FinalPackage.IFC_ACTUATOR_TYPE_ENUM_TYPE: return createIfcActuatorTypeEnumType();
			case FinalPackage.IFC_ADDRESS_TYPE_ENUM_TYPE: return createIfcAddressTypeEnumType();
			case FinalPackage.IFC_AHEAD_OR_BEHIND_TYPE: return createIfcAheadOrBehindType();
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE: return createIfcAirTerminalBoxType();
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE_ENUM_TYPE: return createIfcAirTerminalBoxTypeEnumType();
			case FinalPackage.IFC_AIR_TERMINAL_TYPE: return createIfcAirTerminalType();
			case FinalPackage.IFC_AIR_TERMINAL_TYPE_ENUM_TYPE: return createIfcAirTerminalTypeEnumType();
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE: return createIfcAirToAirHeatRecoveryType();
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE_ENUM_TYPE: return createIfcAirToAirHeatRecoveryTypeEnumType();
			case FinalPackage.IFC_ALARM_TYPE: return createIfcAlarmType();
			case FinalPackage.IFC_ALARM_TYPE_ENUM_TYPE: return createIfcAlarmTypeEnumType();
			case FinalPackage.IFC_AMOUNT_OF_SUBSTANCE_MEASURE_TYPE: return createIfcAmountOfSubstanceMeasureType();
			case FinalPackage.IFC_ANALYSIS_MODEL_TYPE_ENUM_TYPE: return createIfcAnalysisModelTypeEnumType();
			case FinalPackage.IFC_ANALYSIS_THEORY_TYPE_ENUM_TYPE: return createIfcAnalysisTheoryTypeEnumType();
			case FinalPackage.IFC_ANGULAR_DIMENSION: return createIfcAngularDimension();
			case FinalPackage.IFC_ANGULAR_VELOCITY_MEASURE_TYPE: return createIfcAngularVelocityMeasureType();
			case FinalPackage.IFC_ANNOTATION: return createIfcAnnotation();
			case FinalPackage.IFC_ANNOTATION_CURVE_OCCURRENCE: return createIfcAnnotationCurveOccurrence();
			case FinalPackage.IFC_ANNOTATION_FILL_AREA: return createIfcAnnotationFillArea();
			case FinalPackage.IFC_ANNOTATION_FILL_AREA_OCCURRENCE: return createIfcAnnotationFillAreaOccurrence();
			case FinalPackage.IFC_ANNOTATION_SURFACE: return createIfcAnnotationSurface();
			case FinalPackage.IFC_ANNOTATION_SURFACE_OCCURRENCE: return createIfcAnnotationSurfaceOccurrence();
			case FinalPackage.IFC_ANNOTATION_SYMBOL_OCCURRENCE: return createIfcAnnotationSymbolOccurrence();
			case FinalPackage.IFC_ANNOTATION_TEXT_OCCURRENCE: return createIfcAnnotationTextOccurrence();
			case FinalPackage.IFC_APPLICATION: return createIfcApplication();
			case FinalPackage.IFC_APPLIED_VALUE_RELATIONSHIP: return createIfcAppliedValueRelationship();
			case FinalPackage.IFC_APPLIED_VALUE_SELECT: return createIfcAppliedValueSelect();
			case FinalPackage.IFC_APPROVAL: return createIfcApproval();
			case FinalPackage.IFC_APPROVAL_ACTOR_RELATIONSHIP: return createIfcApprovalActorRelationship();
			case FinalPackage.IFC_APPROVAL_PROPERTY_RELATIONSHIP: return createIfcApprovalPropertyRelationship();
			case FinalPackage.IFC_APPROVAL_RELATIONSHIP: return createIfcApprovalRelationship();
			case FinalPackage.IFC_ARBITRARY_CLOSED_PROFILE_DEF: return createIfcArbitraryClosedProfileDef();
			case FinalPackage.IFC_ARBITRARY_OPEN_PROFILE_DEF: return createIfcArbitraryOpenProfileDef();
			case FinalPackage.IFC_ARBITRARY_PROFILE_DEF_WITH_VOIDS: return createIfcArbitraryProfileDefWithVoids();
			case FinalPackage.IFC_AREA_MEASURE_TYPE: return createIfcAreaMeasureType();
			case FinalPackage.IFC_ARITHMETIC_OPERATOR_ENUM_TYPE: return createIfcArithmeticOperatorEnumType();
			case FinalPackage.IFC_ASSEMBLY_PLACE_ENUM_TYPE: return createIfcAssemblyPlaceEnumType();
			case FinalPackage.IFC_ASSET: return createIfcAsset();
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF: return createIfcAsymmetricIShapeProfileDef();
			case FinalPackage.IFC_AXIS1_PLACEMENT: return createIfcAxis1Placement();
			case FinalPackage.IFC_AXIS2_PLACEMENT: return createIfcAxis2Placement();
			case FinalPackage.IFC_AXIS2_PLACEMENT2_D: return createIfcAxis2Placement2D();
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D: return createIfcAxis2Placement3D();
			case FinalPackage.IFC_BEAM: return createIfcBeam();
			case FinalPackage.IFC_BEAM_TYPE: return createIfcBeamType();
			case FinalPackage.IFC_BEAM_TYPE_ENUM_TYPE: return createIfcBeamTypeEnumType();
			case FinalPackage.IFC_BENCHMARK_ENUM_TYPE: return createIfcBenchmarkEnumType();
			case FinalPackage.IFC_BEZIER_CURVE: return createIfcBezierCurve();
			case FinalPackage.IFC_BLOB_TEXTURE: return createIfcBlobTexture();
			case FinalPackage.IFC_BLOCK: return createIfcBlock();
			case FinalPackage.IFC_BOILER_TYPE: return createIfcBoilerType();
			case FinalPackage.IFC_BOILER_TYPE_ENUM_TYPE: return createIfcBoilerTypeEnumType();
			case FinalPackage.IFC_BOOLEAN_CLIPPING_RESULT: return createIfcBooleanClippingResult();
			case FinalPackage.IFC_BOOLEAN_OPERAND: return createIfcBooleanOperand();
			case FinalPackage.IFC_BOOLEAN_OPERATOR_TYPE: return createIfcBooleanOperatorType();
			case FinalPackage.IFC_BOOLEAN_RESULT: return createIfcBooleanResult();
			case FinalPackage.IFC_BOOLEAN_TYPE: return createIfcBooleanType();
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION: return createIfcBoundaryEdgeCondition();
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION: return createIfcBoundaryFaceCondition();
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION: return createIfcBoundaryNodeCondition();
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION_WARPING: return createIfcBoundaryNodeConditionWarping();
			case FinalPackage.IFC_BOUNDED_SURFACE: return createIfcBoundedSurface();
			case FinalPackage.IFC_BOUNDING_BOX: return createIfcBoundingBox();
			case FinalPackage.IFC_BOX_ALIGNMENT_TYPE: return createIfcBoxAlignmentType();
			case FinalPackage.IFC_BOXED_HALF_SPACE: return createIfcBoxedHalfSpace();
			case FinalPackage.IFC_BSPLINE_CURVE_FORM_TYPE: return createIfcBSplineCurveFormType();
			case FinalPackage.IFC_BUILDING: return createIfcBuilding();
			case FinalPackage.IFC_BUILDING_ELEMENT_PART: return createIfcBuildingElementPart();
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY: return createIfcBuildingElementProxy();
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE: return createIfcBuildingElementProxyType();
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE_ENUM_TYPE: return createIfcBuildingElementProxyTypeEnumType();
			case FinalPackage.IFC_BUILDING_STOREY: return createIfcBuildingStorey();
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE: return createIfcCableCarrierFittingType();
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE_ENUM_TYPE: return createIfcCableCarrierFittingTypeEnumType();
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE: return createIfcCableCarrierSegmentType();
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE_ENUM_TYPE: return createIfcCableCarrierSegmentTypeEnumType();
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE: return createIfcCableSegmentType();
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE_ENUM_TYPE: return createIfcCableSegmentTypeEnumType();
			case FinalPackage.IFC_CALENDAR_DATE: return createIfcCalendarDate();
			case FinalPackage.IFC_CARTESIAN_POINT: return createIfcCartesianPoint();
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_D: return createIfcCartesianTransformationOperator2D();
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR2_DNON_UNIFORM: return createIfcCartesianTransformationOperator2DnonUniform();
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_D: return createIfcCartesianTransformationOperator3D();
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR3_DNON_UNIFORM: return createIfcCartesianTransformationOperator3DnonUniform();
			case FinalPackage.IFC_CENTER_LINE_PROFILE_DEF: return createIfcCenterLineProfileDef();
			case FinalPackage.IFC_CHAMFER_EDGE_FEATURE: return createIfcChamferEdgeFeature();
			case FinalPackage.IFC_CHANGE_ACTION_ENUM_TYPE: return createIfcChangeActionEnumType();
			case FinalPackage.IFC_CHARACTER_STYLE_SELECT: return createIfcCharacterStyleSelect();
			case FinalPackage.IFC_CHILLER_TYPE: return createIfcChillerType();
			case FinalPackage.IFC_CHILLER_TYPE_ENUM_TYPE: return createIfcChillerTypeEnumType();
			case FinalPackage.IFC_CIRCLE: return createIfcCircle();
			case FinalPackage.IFC_CIRCLE_HOLLOW_PROFILE_DEF: return createIfcCircleHollowProfileDef();
			case FinalPackage.IFC_CIRCLE_PROFILE_DEF: return createIfcCircleProfileDef();
			case FinalPackage.IFC_CLASSIFICATION: return createIfcClassification();
			case FinalPackage.IFC_CLASSIFICATION_ITEM: return createIfcClassificationItem();
			case FinalPackage.IFC_CLASSIFICATION_ITEM_RELATIONSHIP: return createIfcClassificationItemRelationship();
			case FinalPackage.IFC_CLASSIFICATION_NOTATION: return createIfcClassificationNotation();
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_FACET: return createIfcClassificationNotationFacet();
			case FinalPackage.IFC_CLASSIFICATION_NOTATION_SELECT: return createIfcClassificationNotationSelect();
			case FinalPackage.IFC_CLASSIFICATION_REFERENCE: return createIfcClassificationReference();
			case FinalPackage.IFC_CLOSED_SHELL: return createIfcClosedShell();
			case FinalPackage.IFC_COIL_TYPE: return createIfcCoilType();
			case FinalPackage.IFC_COIL_TYPE_ENUM_TYPE: return createIfcCoilTypeEnumType();
			case FinalPackage.IFC_COLOUR: return createIfcColour();
			case FinalPackage.IFC_COLOUR_OR_FACTOR: return createIfcColourOrFactor();
			case FinalPackage.IFC_COLOUR_RGB: return createIfcColourRgb();
			case FinalPackage.IFC_COLUMN: return createIfcColumn();
			case FinalPackage.IFC_COLUMN_TYPE: return createIfcColumnType();
			case FinalPackage.IFC_COLUMN_TYPE_ENUM_TYPE: return createIfcColumnTypeEnumType();
			case FinalPackage.IFC_COMPLEX_NUMBER: return createIfcComplexNumber();
			case FinalPackage.IFC_COMPLEX_NUMBER_TYPE: return createIfcComplexNumberType();
			case FinalPackage.IFC_COMPLEX_PROPERTY: return createIfcComplexProperty();
			case FinalPackage.IFC_COMPOSITE_CURVE: return createIfcCompositeCurve();
			case FinalPackage.IFC_COMPOSITE_CURVE_SEGMENT: return createIfcCompositeCurveSegment();
			case FinalPackage.IFC_COMPOSITE_PROFILE_DEF: return createIfcCompositeProfileDef();
			case FinalPackage.IFC_COMPOUND_PLANE_ANGLE_MEASURE: return createIfcCompoundPlaneAngleMeasure();
			case FinalPackage.IFC_COMPOUND_PLANE_ANGLE_MEASURE_TYPE: return createIfcCompoundPlaneAngleMeasureType();
			case FinalPackage.IFC_COMPRESSOR_TYPE: return createIfcCompressorType();
			case FinalPackage.IFC_COMPRESSOR_TYPE_ENUM_TYPE: return createIfcCompressorTypeEnumType();
			case FinalPackage.IFC_CONDENSER_TYPE: return createIfcCondenserType();
			case FinalPackage.IFC_CONDENSER_TYPE_ENUM_TYPE: return createIfcCondenserTypeEnumType();
			case FinalPackage.IFC_CONDITION: return createIfcCondition();
			case FinalPackage.IFC_CONDITION_CRITERION: return createIfcConditionCriterion();
			case FinalPackage.IFC_CONDITION_CRITERION_SELECT: return createIfcConditionCriterionSelect();
			case FinalPackage.IFC_CONNECTED_FACE_SET: return createIfcConnectedFaceSet();
			case FinalPackage.IFC_CONNECTION_CURVE_GEOMETRY: return createIfcConnectionCurveGeometry();
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY: return createIfcConnectionPointEccentricity();
			case FinalPackage.IFC_CONNECTION_POINT_GEOMETRY: return createIfcConnectionPointGeometry();
			case FinalPackage.IFC_CONNECTION_PORT_GEOMETRY: return createIfcConnectionPortGeometry();
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY: return createIfcConnectionSurfaceGeometry();
			case FinalPackage.IFC_CONNECTION_TYPE_ENUM_TYPE: return createIfcConnectionTypeEnumType();
			case FinalPackage.IFC_CONSTRAINT_AGGREGATION_RELATIONSHIP: return createIfcConstraintAggregationRelationship();
			case FinalPackage.IFC_CONSTRAINT_CLASSIFICATION_RELATIONSHIP: return createIfcConstraintClassificationRelationship();
			case FinalPackage.IFC_CONSTRAINT_ENUM_TYPE: return createIfcConstraintEnumType();
			case FinalPackage.IFC_CONSTRAINT_RELATIONSHIP: return createIfcConstraintRelationship();
			case FinalPackage.IFC_CONSTRUCTION_EQUIPMENT_RESOURCE: return createIfcConstructionEquipmentResource();
			case FinalPackage.IFC_CONSTRUCTION_MATERIAL_RESOURCE: return createIfcConstructionMaterialResource();
			case FinalPackage.IFC_CONSTRUCTION_PRODUCT_RESOURCE: return createIfcConstructionProductResource();
			case FinalPackage.IFC_CONTEXT_DEPENDENT_MEASURE_TYPE: return createIfcContextDependentMeasureType();
			case FinalPackage.IFC_CONTEXT_DEPENDENT_UNIT: return createIfcContextDependentUnit();
			case FinalPackage.IFC_CONTROLLER_TYPE: return createIfcControllerType();
			case FinalPackage.IFC_CONTROLLER_TYPE_ENUM_TYPE: return createIfcControllerTypeEnumType();
			case FinalPackage.IFC_CONVERSION_BASED_UNIT: return createIfcConversionBasedUnit();
			case FinalPackage.IFC_COOLED_BEAM_TYPE: return createIfcCooledBeamType();
			case FinalPackage.IFC_COOLED_BEAM_TYPE_ENUM_TYPE: return createIfcCooledBeamTypeEnumType();
			case FinalPackage.IFC_COOLING_TOWER_TYPE: return createIfcCoolingTowerType();
			case FinalPackage.IFC_COOLING_TOWER_TYPE_ENUM_TYPE: return createIfcCoolingTowerTypeEnumType();
			case FinalPackage.IFC_COORDINATED_UNIVERSAL_TIME_OFFSET: return createIfcCoordinatedUniversalTimeOffset();
			case FinalPackage.IFC_COST_ITEM: return createIfcCostItem();
			case FinalPackage.IFC_COST_SCHEDULE: return createIfcCostSchedule();
			case FinalPackage.IFC_COST_SCHEDULE_TYPE_ENUM_TYPE: return createIfcCostScheduleTypeEnumType();
			case FinalPackage.IFC_COST_VALUE: return createIfcCostValue();
			case FinalPackage.IFC_COUNT_MEASURE_TYPE: return createIfcCountMeasureType();
			case FinalPackage.IFC_COVERING: return createIfcCovering();
			case FinalPackage.IFC_COVERING_TYPE: return createIfcCoveringType();
			case FinalPackage.IFC_COVERING_TYPE_ENUM_TYPE: return createIfcCoveringTypeEnumType();
			case FinalPackage.IFC_CRANE_RAIL_ASHAPE_PROFILE_DEF: return createIfcCraneRailAShapeProfileDef();
			case FinalPackage.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF: return createIfcCraneRailFShapeProfileDef();
			case FinalPackage.IFC_CREW_RESOURCE: return createIfcCrewResource();
			case FinalPackage.IFC_CSG_SELECT: return createIfcCsgSelect();
			case FinalPackage.IFC_CSG_SOLID: return createIfcCsgSolid();
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF: return createIfcCShapeProfileDef();
			case FinalPackage.IFC_CURRENCY_ENUM_TYPE: return createIfcCurrencyEnumType();
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP: return createIfcCurrencyRelationship();
			case FinalPackage.IFC_CURTAIN_WALL: return createIfcCurtainWall();
			case FinalPackage.IFC_CURTAIN_WALL_TYPE: return createIfcCurtainWallType();
			case FinalPackage.IFC_CURTAIN_WALL_TYPE_ENUM_TYPE: return createIfcCurtainWallTypeEnumType();
			case FinalPackage.IFC_CURVATURE_MEASURE_TYPE: return createIfcCurvatureMeasureType();
			case FinalPackage.IFC_CURVE_BOUNDED_PLANE: return createIfcCurveBoundedPlane();
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT: return createIfcCurveFontOrScaledCurveFontSelect();
			case FinalPackage.IFC_CURVE_OR_EDGE_CURVE: return createIfcCurveOrEdgeCurve();
			case FinalPackage.IFC_CURVE_STYLE: return createIfcCurveStyle();
			case FinalPackage.IFC_CURVE_STYLE_FONT: return createIfcCurveStyleFont();
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING: return createIfcCurveStyleFontAndScaling();
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN: return createIfcCurveStyleFontPattern();
			case FinalPackage.IFC_CURVE_STYLE_FONT_SELECT: return createIfcCurveStyleFontSelect();
			case FinalPackage.IFC_DAMPER_TYPE: return createIfcDamperType();
			case FinalPackage.IFC_DAMPER_TYPE_ENUM_TYPE: return createIfcDamperTypeEnumType();
			case FinalPackage.IFC_DATA_ORIGIN_ENUM_TYPE: return createIfcDataOriginEnumType();
			case FinalPackage.IFC_DATE_AND_TIME: return createIfcDateAndTime();
			case FinalPackage.IFC_DATE_TIME_SELECT: return createIfcDateTimeSelect();
			case FinalPackage.IFC_DAY_IN_MONTH_NUMBER_TYPE: return createIfcDayInMonthNumberType();
			case FinalPackage.IFC_DAYLIGHT_SAVING_HOUR_TYPE: return createIfcDaylightSavingHourType();
			case FinalPackage.IFC_DEFINED_SYMBOL: return createIfcDefinedSymbol();
			case FinalPackage.IFC_DEFINED_SYMBOL_SELECT: return createIfcDefinedSymbolSelect();
			case FinalPackage.IFC_DERIVED_MEASURE_VALUE: return createIfcDerivedMeasureValue();
			case FinalPackage.IFC_DERIVED_PROFILE_DEF: return createIfcDerivedProfileDef();
			case FinalPackage.IFC_DERIVED_UNIT: return createIfcDerivedUnit();
			case FinalPackage.IFC_DERIVED_UNIT_ELEMENT: return createIfcDerivedUnitElement();
			case FinalPackage.IFC_DERIVED_UNIT_ENUM_TYPE: return createIfcDerivedUnitEnumType();
			case FinalPackage.IFC_DESCRIPTIVE_MEASURE_TYPE: return createIfcDescriptiveMeasureType();
			case FinalPackage.IFC_DIAMETER_DIMENSION: return createIfcDiameterDimension();
			case FinalPackage.IFC_DIMENSIONAL_EXPONENTS: return createIfcDimensionalExponents();
			case FinalPackage.IFC_DIMENSION_CALLOUT_RELATIONSHIP: return createIfcDimensionCalloutRelationship();
			case FinalPackage.IFC_DIMENSION_COUNT_TYPE: return createIfcDimensionCountType();
			case FinalPackage.IFC_DIMENSION_CURVE: return createIfcDimensionCurve();
			case FinalPackage.IFC_DIMENSION_CURVE_DIRECTED_CALLOUT: return createIfcDimensionCurveDirectedCallout();
			case FinalPackage.IFC_DIMENSION_CURVE_TERMINATOR: return createIfcDimensionCurveTerminator();
			case FinalPackage.IFC_DIMENSION_EXTENT_USAGE_TYPE: return createIfcDimensionExtentUsageType();
			case FinalPackage.IFC_DIMENSION_PAIR: return createIfcDimensionPair();
			case FinalPackage.IFC_DIRECTION: return createIfcDirection();
			case FinalPackage.IFC_DIRECTION_SENSE_ENUM_TYPE: return createIfcDirectionSenseEnumType();
			case FinalPackage.IFC_DISCRETE_ACCESSORY: return createIfcDiscreteAccessory();
			case FinalPackage.IFC_DISCRETE_ACCESSORY_TYPE: return createIfcDiscreteAccessoryType();
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT: return createIfcDistributionChamberElement();
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE: return createIfcDistributionChamberElementType();
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE_ENUM_TYPE: return createIfcDistributionChamberElementTypeEnumType();
			case FinalPackage.IFC_DISTRIBUTION_CONTROL_ELEMENT: return createIfcDistributionControlElement();
			case FinalPackage.IFC_DISTRIBUTION_ELEMENT: return createIfcDistributionElement();
			case FinalPackage.IFC_DISTRIBUTION_ELEMENT_TYPE: return createIfcDistributionElementType();
			case FinalPackage.IFC_DISTRIBUTION_FLOW_ELEMENT: return createIfcDistributionFlowElement();
			case FinalPackage.IFC_DISTRIBUTION_PORT: return createIfcDistributionPort();
			case FinalPackage.IFC_DOCUMENT_CONFIDENTIALITY_ENUM_TYPE: return createIfcDocumentConfidentialityEnumType();
			case FinalPackage.IFC_DOCUMENT_ELECTRONIC_FORMAT: return createIfcDocumentElectronicFormat();
			case FinalPackage.IFC_DOCUMENT_INFORMATION: return createIfcDocumentInformation();
			case FinalPackage.IFC_DOCUMENT_INFORMATION_RELATIONSHIP: return createIfcDocumentInformationRelationship();
			case FinalPackage.IFC_DOCUMENT_REFERENCE: return createIfcDocumentReference();
			case FinalPackage.IFC_DOCUMENT_SELECT: return createIfcDocumentSelect();
			case FinalPackage.IFC_DOCUMENT_STATUS_ENUM_TYPE: return createIfcDocumentStatusEnumType();
			case FinalPackage.IFC_DOOR: return createIfcDoor();
			case FinalPackage.IFC_DOOR_LINING_PROPERTIES: return createIfcDoorLiningProperties();
			case FinalPackage.IFC_DOOR_PANEL_OPERATION_ENUM_TYPE: return createIfcDoorPanelOperationEnumType();
			case FinalPackage.IFC_DOOR_PANEL_POSITION_ENUM_TYPE: return createIfcDoorPanelPositionEnumType();
			case FinalPackage.IFC_DOOR_PANEL_PROPERTIES: return createIfcDoorPanelProperties();
			case FinalPackage.IFC_DOOR_STYLE: return createIfcDoorStyle();
			case FinalPackage.IFC_DOOR_STYLE_CONSTRUCTION_ENUM_TYPE: return createIfcDoorStyleConstructionEnumType();
			case FinalPackage.IFC_DOOR_STYLE_OPERATION_ENUM_TYPE: return createIfcDoorStyleOperationEnumType();
			case FinalPackage.IFC_DOSE_EQUIVALENT_MEASURE_TYPE: return createIfcDoseEquivalentMeasureType();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT: return createIfcDraughtingCallout();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_ELEMENT: return createIfcDraughtingCalloutElement();
			case FinalPackage.IFC_DRAUGHTING_CALLOUT_RELATIONSHIP: return createIfcDraughtingCalloutRelationship();
			case FinalPackage.IFC_DRAUGHTING_PRE_DEFINED_COLOUR: return createIfcDraughtingPreDefinedColour();
			case FinalPackage.IFC_DRAUGHTING_PRE_DEFINED_CURVE_FONT: return createIfcDraughtingPreDefinedCurveFont();
			case FinalPackage.IFC_DRAUGHTING_PRE_DEFINED_TEXT_FONT: return createIfcDraughtingPreDefinedTextFont();
			case FinalPackage.IFC_DUCT_FITTING_TYPE: return createIfcDuctFittingType();
			case FinalPackage.IFC_DUCT_FITTING_TYPE_ENUM_TYPE: return createIfcDuctFittingTypeEnumType();
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE: return createIfcDuctSegmentType();
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE_ENUM_TYPE: return createIfcDuctSegmentTypeEnumType();
			case FinalPackage.IFC_DUCT_SILENCER_TYPE: return createIfcDuctSilencerType();
			case FinalPackage.IFC_DUCT_SILENCER_TYPE_ENUM_TYPE: return createIfcDuctSilencerTypeEnumType();
			case FinalPackage.IFC_DYNAMIC_VISCOSITY_MEASURE_TYPE: return createIfcDynamicViscosityMeasureType();
			case FinalPackage.IFC_EDGE: return createIfcEdge();
			case FinalPackage.IFC_EDGE_CURVE: return createIfcEdgeCurve();
			case FinalPackage.IFC_EDGE_LOOP: return createIfcEdgeLoop();
			case FinalPackage.IFC_ELECTRICAL_BASE_PROPERTIES: return createIfcElectricalBaseProperties();
			case FinalPackage.IFC_ELECTRICAL_CIRCUIT: return createIfcElectricalCircuit();
			case FinalPackage.IFC_ELECTRICAL_ELEMENT: return createIfcElectricalElement();
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE: return createIfcElectricApplianceType();
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE_ENUM_TYPE: return createIfcElectricApplianceTypeEnumType();
			case FinalPackage.IFC_ELECTRIC_CAPACITANCE_MEASURE_TYPE: return createIfcElectricCapacitanceMeasureType();
			case FinalPackage.IFC_ELECTRIC_CHARGE_MEASURE_TYPE: return createIfcElectricChargeMeasureType();
			case FinalPackage.IFC_ELECTRIC_CONDUCTANCE_MEASURE_TYPE: return createIfcElectricConductanceMeasureType();
			case FinalPackage.IFC_ELECTRIC_CURRENT_ENUM_TYPE: return createIfcElectricCurrentEnumType();
			case FinalPackage.IFC_ELECTRIC_CURRENT_MEASURE_TYPE: return createIfcElectricCurrentMeasureType();
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT: return createIfcElectricDistributionPoint();
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT_FUNCTION_ENUM_TYPE: return createIfcElectricDistributionPointFunctionEnumType();
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE: return createIfcElectricFlowStorageDeviceType();
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE_ENUM_TYPE: return createIfcElectricFlowStorageDeviceTypeEnumType();
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE: return createIfcElectricGeneratorType();
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE_ENUM_TYPE: return createIfcElectricGeneratorTypeEnumType();
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE: return createIfcElectricHeaterType();
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE_ENUM_TYPE: return createIfcElectricHeaterTypeEnumType();
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE: return createIfcElectricMotorType();
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE_ENUM_TYPE: return createIfcElectricMotorTypeEnumType();
			case FinalPackage.IFC_ELECTRIC_RESISTANCE_MEASURE_TYPE: return createIfcElectricResistanceMeasureType();
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE: return createIfcElectricTimeControlType();
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE_ENUM_TYPE: return createIfcElectricTimeControlTypeEnumType();
			case FinalPackage.IFC_ELECTRIC_VOLTAGE_MEASURE_TYPE: return createIfcElectricVoltageMeasureType();
			case FinalPackage.IFC_ELEMENT_ASSEMBLY: return createIfcElementAssembly();
			case FinalPackage.IFC_ELEMENT_ASSEMBLY_TYPE_ENUM_TYPE: return createIfcElementAssemblyTypeEnumType();
			case FinalPackage.IFC_ELEMENT_COMPOSITION_ENUM_TYPE: return createIfcElementCompositionEnumType();
			case FinalPackage.IFC_ELEMENT_QUANTITY: return createIfcElementQuantity();
			case FinalPackage.IFC_ELLIPSE: return createIfcEllipse();
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF: return createIfcEllipseProfileDef();
			case FinalPackage.IFC_ENERGY_CONVERSION_DEVICE: return createIfcEnergyConversionDevice();
			case FinalPackage.IFC_ENERGY_MEASURE_TYPE: return createIfcEnergyMeasureType();
			case FinalPackage.IFC_ENERGY_PROPERTIES: return createIfcEnergyProperties();
			case FinalPackage.IFC_ENERGY_SEQUENCE_ENUM_TYPE: return createIfcEnergySequenceEnumType();
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_CATEGORY_ENUM_TYPE: return createIfcEnvironmentalImpactCategoryEnumType();
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_VALUE: return createIfcEnvironmentalImpactValue();
			case FinalPackage.IFC_EQUIPMENT_ELEMENT: return createIfcEquipmentElement();
			case FinalPackage.IFC_EQUIPMENT_STANDARD: return createIfcEquipmentStandard();
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE: return createIfcEvaporativeCoolerType();
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE_ENUM_TYPE: return createIfcEvaporativeCoolerTypeEnumType();
			case FinalPackage.IFC_EVAPORATOR_TYPE: return createIfcEvaporatorType();
			case FinalPackage.IFC_EVAPORATOR_TYPE_ENUM_TYPE: return createIfcEvaporatorTypeEnumType();
			case FinalPackage.IFC_EXTENDED_MATERIAL_PROPERTIES: return createIfcExtendedMaterialProperties();
			case FinalPackage.IFC_EXTERNALLY_DEFINED_HATCH_STYLE: return createIfcExternallyDefinedHatchStyle();
			case FinalPackage.IFC_EXTERNALLY_DEFINED_SURFACE_STYLE: return createIfcExternallyDefinedSurfaceStyle();
			case FinalPackage.IFC_EXTERNALLY_DEFINED_SYMBOL: return createIfcExternallyDefinedSymbol();
			case FinalPackage.IFC_EXTERNALLY_DEFINED_TEXT_FONT: return createIfcExternallyDefinedTextFont();
			case FinalPackage.IFC_EXTRUDED_AREA_SOLID: return createIfcExtrudedAreaSolid();
			case FinalPackage.IFC_FACE: return createIfcFace();
			case FinalPackage.IFC_FACE_BASED_SURFACE_MODEL: return createIfcFaceBasedSurfaceModel();
			case FinalPackage.IFC_FACE_BOUND: return createIfcFaceBound();
			case FinalPackage.IFC_FACE_OUTER_BOUND: return createIfcFaceOuterBound();
			case FinalPackage.IFC_FACE_SURFACE: return createIfcFaceSurface();
			case FinalPackage.IFC_FACETED_BREP: return createIfcFacetedBrep();
			case FinalPackage.IFC_FACETED_BREP_WITH_VOIDS: return createIfcFacetedBrepWithVoids();
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION: return createIfcFailureConnectionCondition();
			case FinalPackage.IFC_FAN_TYPE: return createIfcFanType();
			case FinalPackage.IFC_FAN_TYPE_ENUM_TYPE: return createIfcFanTypeEnumType();
			case FinalPackage.IFC_FASTENER: return createIfcFastener();
			case FinalPackage.IFC_FASTENER_TYPE: return createIfcFastenerType();
			case FinalPackage.IFC_FILL_AREA_STYLE: return createIfcFillAreaStyle();
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING: return createIfcFillAreaStyleHatching();
			case FinalPackage.IFC_FILL_AREA_STYLE_TILES: return createIfcFillAreaStyleTiles();
			case FinalPackage.IFC_FILL_AREA_STYLE_TILE_SHAPE_SELECT: return createIfcFillAreaStyleTileShapeSelect();
			case FinalPackage.IFC_FILL_AREA_STYLE_TILE_SYMBOL_WITH_STYLE: return createIfcFillAreaStyleTileSymbolWithStyle();
			case FinalPackage.IFC_FILL_STYLE_SELECT: return createIfcFillStyleSelect();
			case FinalPackage.IFC_FILTER_TYPE: return createIfcFilterType();
			case FinalPackage.IFC_FILTER_TYPE_ENUM_TYPE: return createIfcFilterTypeEnumType();
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE: return createIfcFireSuppressionTerminalType();
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE_ENUM_TYPE: return createIfcFireSuppressionTerminalTypeEnumType();
			case FinalPackage.IFC_FLOW_CONTROLLER: return createIfcFlowController();
			case FinalPackage.IFC_FLOW_DIRECTION_ENUM_TYPE: return createIfcFlowDirectionEnumType();
			case FinalPackage.IFC_FLOW_FITTING: return createIfcFlowFitting();
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE: return createIfcFlowInstrumentType();
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE_ENUM_TYPE: return createIfcFlowInstrumentTypeEnumType();
			case FinalPackage.IFC_FLOW_METER_TYPE: return createIfcFlowMeterType();
			case FinalPackage.IFC_FLOW_METER_TYPE_ENUM_TYPE: return createIfcFlowMeterTypeEnumType();
			case FinalPackage.IFC_FLOW_MOVING_DEVICE: return createIfcFlowMovingDevice();
			case FinalPackage.IFC_FLOW_SEGMENT: return createIfcFlowSegment();
			case FinalPackage.IFC_FLOW_STORAGE_DEVICE: return createIfcFlowStorageDevice();
			case FinalPackage.IFC_FLOW_TERMINAL: return createIfcFlowTerminal();
			case FinalPackage.IFC_FLOW_TREATMENT_DEVICE: return createIfcFlowTreatmentDevice();
			case FinalPackage.IFC_FLUID_FLOW_PROPERTIES: return createIfcFluidFlowProperties();
			case FinalPackage.IFC_FONT_STYLE_TYPE: return createIfcFontStyleType();
			case FinalPackage.IFC_FONT_VARIANT_TYPE: return createIfcFontVariantType();
			case FinalPackage.IFC_FONT_WEIGHT_TYPE: return createIfcFontWeightType();
			case FinalPackage.IFC_FOOTING: return createIfcFooting();
			case FinalPackage.IFC_FOOTING_TYPE_ENUM_TYPE: return createIfcFootingTypeEnumType();
			case FinalPackage.IFC_FORCE_MEASURE_TYPE: return createIfcForceMeasureType();
			case FinalPackage.IFC_FREQUENCY_MEASURE_TYPE: return createIfcFrequencyMeasureType();
			case FinalPackage.IFC_FUEL_PROPERTIES: return createIfcFuelProperties();
			case FinalPackage.IFC_FURNISHING_ELEMENT: return createIfcFurnishingElement();
			case FinalPackage.IFC_FURNISHING_ELEMENT_TYPE: return createIfcFurnishingElementType();
			case FinalPackage.IFC_FURNITURE_STANDARD: return createIfcFurnitureStandard();
			case FinalPackage.IFC_FURNITURE_TYPE: return createIfcFurnitureType();
			case FinalPackage.IFC_GAS_TERMINAL_TYPE: return createIfcGasTerminalType();
			case FinalPackage.IFC_GAS_TERMINAL_TYPE_ENUM_TYPE: return createIfcGasTerminalTypeEnumType();
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES: return createIfcGeneralMaterialProperties();
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES: return createIfcGeneralProfileProperties();
			case FinalPackage.IFC_GEOMETRIC_CURVE_SET: return createIfcGeometricCurveSet();
			case FinalPackage.IFC_GEOMETRIC_PROJECTION_ENUM_TYPE: return createIfcGeometricProjectionEnumType();
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_CONTEXT: return createIfcGeometricRepresentationContext();
			case FinalPackage.IFC_GEOMETRIC_REPRESENTATION_SUB_CONTEXT: return createIfcGeometricRepresentationSubContext();
			case FinalPackage.IFC_GEOMETRIC_SET: return createIfcGeometricSet();
			case FinalPackage.IFC_GEOMETRIC_SET_SELECT: return createIfcGeometricSetSelect();
			case FinalPackage.IFC_GLOBALLY_UNIQUE_ID_TYPE: return createIfcGloballyUniqueIdType();
			case FinalPackage.IFC_GLOBAL_OR_LOCAL_ENUM_TYPE: return createIfcGlobalOrLocalEnumType();
			case FinalPackage.IFC_GRID: return createIfcGrid();
			case FinalPackage.IFC_GRID_AXIS: return createIfcGridAxis();
			case FinalPackage.IFC_GRID_PLACEMENT: return createIfcGridPlacement();
			case FinalPackage.IFC_GROUP: return createIfcGroup();
			case FinalPackage.IFC_HALF_SPACE_SOLID: return createIfcHalfSpaceSolid();
			case FinalPackage.IFC_HATCH_LINE_DISTANCE_SELECT: return createIfcHatchLineDistanceSelect();
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE: return createIfcHeatExchangerType();
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE_ENUM_TYPE: return createIfcHeatExchangerTypeEnumType();
			case FinalPackage.IFC_HEAT_FLUX_DENSITY_MEASURE_TYPE: return createIfcHeatFluxDensityMeasureType();
			case FinalPackage.IFC_HEATING_VALUE_MEASURE_TYPE: return createIfcHeatingValueMeasureType();
			case FinalPackage.IFC_HOUR_IN_DAY_TYPE: return createIfcHourInDayType();
			case FinalPackage.IFC_HUMIDIFIER_TYPE: return createIfcHumidifierType();
			case FinalPackage.IFC_HUMIDIFIER_TYPE_ENUM_TYPE: return createIfcHumidifierTypeEnumType();
			case FinalPackage.IFC_HYGROSCOPIC_MATERIAL_PROPERTIES: return createIfcHygroscopicMaterialProperties();
			case FinalPackage.IFC_IDENTIFIER_TYPE: return createIfcIdentifierType();
			case FinalPackage.IFC_ILLUMINANCE_MEASURE_TYPE: return createIfcIlluminanceMeasureType();
			case FinalPackage.IFC_IMAGE_TEXTURE: return createIfcImageTexture();
			case FinalPackage.IFC_INDUCTANCE_MEASURE_TYPE: return createIfcInductanceMeasureType();
			case FinalPackage.IFC_INTEGER_COUNT_RATE_MEASURE_TYPE: return createIfcIntegerCountRateMeasureType();
			case FinalPackage.IFC_INTEGER_TYPE: return createIfcIntegerType();
			case FinalPackage.IFC_INTERNAL_OR_EXTERNAL_ENUM_TYPE: return createIfcInternalOrExternalEnumType();
			case FinalPackage.IFC_INVENTORY: return createIfcInventory();
			case FinalPackage.IFC_INVENTORY_TYPE_ENUM_TYPE: return createIfcInventoryTypeEnumType();
			case FinalPackage.IFC_ION_CONCENTRATION_MEASURE_TYPE: return createIfcIonConcentrationMeasureType();
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES: return createIfcIrregularTimeSeries();
			case FinalPackage.IFC_IRREGULAR_TIME_SERIES_VALUE: return createIfcIrregularTimeSeriesValue();
			case FinalPackage.IFC_ISHAPE_PROFILE_DEF: return createIfcIShapeProfileDef();
			case FinalPackage.IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE_TYPE: return createIfcIsothermalMoistureCapacityMeasureType();
			case FinalPackage.IFC_JUNCTION_BOX_TYPE: return createIfcJunctionBoxType();
			case FinalPackage.IFC_JUNCTION_BOX_TYPE_ENUM_TYPE: return createIfcJunctionBoxTypeEnumType();
			case FinalPackage.IFC_KINEMATIC_VISCOSITY_MEASURE_TYPE: return createIfcKinematicViscosityMeasureType();
			case FinalPackage.IFC_LABEL_TYPE: return createIfcLabelType();
			case FinalPackage.IFC_LABOR_RESOURCE: return createIfcLaborResource();
			case FinalPackage.IFC_LAMP_TYPE: return createIfcLampType();
			case FinalPackage.IFC_LAMP_TYPE_ENUM_TYPE: return createIfcLampTypeEnumType();
			case FinalPackage.IFC_LAYERED_ITEM: return createIfcLayeredItem();
			case FinalPackage.IFC_LAYER_SET_DIRECTION_ENUM_TYPE: return createIfcLayerSetDirectionEnumType();
			case FinalPackage.IFC_LENGTH_MEASURE_TYPE: return createIfcLengthMeasureType();
			case FinalPackage.IFC_LIBRARY_INFORMATION: return createIfcLibraryInformation();
			case FinalPackage.IFC_LIBRARY_REFERENCE: return createIfcLibraryReference();
			case FinalPackage.IFC_LIBRARY_SELECT: return createIfcLibrarySelect();
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_CURVE_ENUM_TYPE: return createIfcLightDistributionCurveEnumType();
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA: return createIfcLightDistributionData();
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA_SOURCE_SELECT: return createIfcLightDistributionDataSourceSelect();
			case FinalPackage.IFC_LIGHT_EMISSION_SOURCE_ENUM_TYPE: return createIfcLightEmissionSourceEnumType();
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE: return createIfcLightFixtureType();
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE_ENUM_TYPE: return createIfcLightFixtureTypeEnumType();
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION: return createIfcLightIntensityDistribution();
			case FinalPackage.IFC_LIGHT_SOURCE_AMBIENT: return createIfcLightSourceAmbient();
			case FinalPackage.IFC_LIGHT_SOURCE_DIRECTIONAL: return createIfcLightSourceDirectional();
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC: return createIfcLightSourceGoniometric();
			case FinalPackage.IFC_LIGHT_SOURCE_POSITIONAL: return createIfcLightSourcePositional();
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT: return createIfcLightSourceSpot();
			case FinalPackage.IFC_LINE: return createIfcLine();
			case FinalPackage.IFC_LINEAR_DIMENSION: return createIfcLinearDimension();
			case FinalPackage.IFC_LINEAR_FORCE_MEASURE_TYPE: return createIfcLinearForceMeasureType();
			case FinalPackage.IFC_LINEAR_MOMENT_MEASURE_TYPE: return createIfcLinearMomentMeasureType();
			case FinalPackage.IFC_LINEAR_STIFFNESS_MEASURE_TYPE: return createIfcLinearStiffnessMeasureType();
			case FinalPackage.IFC_LINEAR_VELOCITY_MEASURE_TYPE: return createIfcLinearVelocityMeasureType();
			case FinalPackage.IFC_LOAD_GROUP_TYPE_ENUM_TYPE: return createIfcLoadGroupTypeEnumType();
			case FinalPackage.IFC_LOCAL_PLACEMENT: return createIfcLocalPlacement();
			case FinalPackage.IFC_LOCAL_TIME: return createIfcLocalTime();
			case FinalPackage.IFC_LOGICAL_OPERATOR_ENUM_TYPE: return createIfcLogicalOperatorEnumType();
			case FinalPackage.IFC_LOGICAL_TYPE: return createIfcLogicalType();
			case FinalPackage.IFC_LOOP: return createIfcLoop();
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF: return createIfcLShapeProfileDef();
			case FinalPackage.IFC_LUMINOUS_FLUX_MEASURE_TYPE: return createIfcLuminousFluxMeasureType();
			case FinalPackage.IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE_TYPE: return createIfcLuminousIntensityDistributionMeasureType();
			case FinalPackage.IFC_LUMINOUS_INTENSITY_MEASURE_TYPE: return createIfcLuminousIntensityMeasureType();
			case FinalPackage.IFC_MAGNETIC_FLUX_DENSITY_MEASURE_TYPE: return createIfcMagneticFluxDensityMeasureType();
			case FinalPackage.IFC_MAGNETIC_FLUX_MEASURE_TYPE: return createIfcMagneticFluxMeasureType();
			case FinalPackage.IFC_MAPPED_ITEM: return createIfcMappedItem();
			case FinalPackage.IFC_MASS_DENSITY_MEASURE_TYPE: return createIfcMassDensityMeasureType();
			case FinalPackage.IFC_MASS_FLOW_RATE_MEASURE_TYPE: return createIfcMassFlowRateMeasureType();
			case FinalPackage.IFC_MASS_MEASURE_TYPE: return createIfcMassMeasureType();
			case FinalPackage.IFC_MASS_PER_LENGTH_MEASURE_TYPE: return createIfcMassPerLengthMeasureType();
			case FinalPackage.IFC_MATERIAL: return createIfcMaterial();
			case FinalPackage.IFC_MATERIAL_CLASSIFICATION_RELATIONSHIP: return createIfcMaterialClassificationRelationship();
			case FinalPackage.IFC_MATERIAL_DEFINITION_REPRESENTATION: return createIfcMaterialDefinitionRepresentation();
			case FinalPackage.IFC_MATERIAL_LAYER: return createIfcMaterialLayer();
			case FinalPackage.IFC_MATERIAL_LAYER_SET: return createIfcMaterialLayerSet();
			case FinalPackage.IFC_MATERIAL_LAYER_SET_USAGE: return createIfcMaterialLayerSetUsage();
			case FinalPackage.IFC_MATERIAL_LIST: return createIfcMaterialList();
			case FinalPackage.IFC_MATERIAL_SELECT: return createIfcMaterialSelect();
			case FinalPackage.IFC_MEASURE_VALUE: return createIfcMeasureValue();
			case FinalPackage.IFC_MEASURE_WITH_UNIT: return createIfcMeasureWithUnit();
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES: return createIfcMechanicalConcreteMaterialProperties();
			case FinalPackage.IFC_MECHANICAL_FASTENER: return createIfcMechanicalFastener();
			case FinalPackage.IFC_MECHANICAL_FASTENER_TYPE: return createIfcMechanicalFastenerType();
			case FinalPackage.IFC_MECHANICAL_MATERIAL_PROPERTIES: return createIfcMechanicalMaterialProperties();
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES: return createIfcMechanicalSteelMaterialProperties();
			case FinalPackage.IFC_MEMBER: return createIfcMember();
			case FinalPackage.IFC_MEMBER_TYPE: return createIfcMemberType();
			case FinalPackage.IFC_MEMBER_TYPE_ENUM_TYPE: return createIfcMemberTypeEnumType();
			case FinalPackage.IFC_METRIC: return createIfcMetric();
			case FinalPackage.IFC_METRIC_VALUE_SELECT: return createIfcMetricValueSelect();
			case FinalPackage.IFC_MINUTE_IN_HOUR_TYPE: return createIfcMinuteInHourType();
			case FinalPackage.IFC_MODULUS_OF_ELASTICITY_MEASURE_TYPE: return createIfcModulusOfElasticityMeasureType();
			case FinalPackage.IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE_TYPE: return createIfcModulusOfLinearSubgradeReactionMeasureType();
			case FinalPackage.IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE_TYPE: return createIfcModulusOfRotationalSubgradeReactionMeasureType();
			case FinalPackage.IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE_TYPE: return createIfcModulusOfSubgradeReactionMeasureType();
			case FinalPackage.IFC_MOISTURE_DIFFUSIVITY_MEASURE_TYPE: return createIfcMoistureDiffusivityMeasureType();
			case FinalPackage.IFC_MOLECULAR_WEIGHT_MEASURE_TYPE: return createIfcMolecularWeightMeasureType();
			case FinalPackage.IFC_MOMENT_OF_INERTIA_MEASURE_TYPE: return createIfcMomentOfInertiaMeasureType();
			case FinalPackage.IFC_MONETARY_MEASURE_TYPE: return createIfcMonetaryMeasureType();
			case FinalPackage.IFC_MONETARY_UNIT: return createIfcMonetaryUnit();
			case FinalPackage.IFC_MONTH_IN_YEAR_NUMBER_TYPE: return createIfcMonthInYearNumberType();
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE: return createIfcMotorConnectionType();
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE_ENUM_TYPE: return createIfcMotorConnectionTypeEnumType();
			case FinalPackage.IFC_MOVE: return createIfcMove();
			case FinalPackage.IFC_NORMALISED_RATIO_MEASURE_TYPE: return createIfcNormalisedRatioMeasureType();
			case FinalPackage.IFC_NULL_STYLE_TYPE: return createIfcNullStyleType();
			case FinalPackage.IFC_NUMERIC_MEASURE_TYPE: return createIfcNumericMeasureType();
			case FinalPackage.IFC_OBJECTIVE: return createIfcObjective();
			case FinalPackage.IFC_OBJECTIVE_ENUM_TYPE: return createIfcObjectiveEnumType();
			case FinalPackage.IFC_OBJECT_REFERENCE_SELECT: return createIfcObjectReferenceSelect();
			case FinalPackage.IFC_OBJECT_TYPE_ENUM_TYPE: return createIfcObjectTypeEnumType();
			case FinalPackage.IFC_OCCUPANT: return createIfcOccupant();
			case FinalPackage.IFC_OCCUPANT_TYPE_ENUM_TYPE: return createIfcOccupantTypeEnumType();
			case FinalPackage.IFC_OFFSET_CURVE2_D: return createIfcOffsetCurve2D();
			case FinalPackage.IFC_OFFSET_CURVE3_D: return createIfcOffsetCurve3D();
			case FinalPackage.IFC_ONE_DIRECTION_REPEAT_FACTOR: return createIfcOneDirectionRepeatFactor();
			case FinalPackage.IFC_OPENING_ELEMENT: return createIfcOpeningElement();
			case FinalPackage.IFC_OPEN_SHELL: return createIfcOpenShell();
			case FinalPackage.IFC_OPTICAL_MATERIAL_PROPERTIES: return createIfcOpticalMaterialProperties();
			case FinalPackage.IFC_ORDER_ACTION: return createIfcOrderAction();
			case FinalPackage.IFC_ORGANIZATION: return createIfcOrganization();
			case FinalPackage.IFC_ORGANIZATION_RELATIONSHIP: return createIfcOrganizationRelationship();
			case FinalPackage.IFC_ORIENTATION_SELECT: return createIfcOrientationSelect();
			case FinalPackage.IFC_ORIENTED_EDGE: return createIfcOrientedEdge();
			case FinalPackage.IFC_OUTLET_TYPE: return createIfcOutletType();
			case FinalPackage.IFC_OUTLET_TYPE_ENUM_TYPE: return createIfcOutletTypeEnumType();
			case FinalPackage.IFC_OWNER_HISTORY: return createIfcOwnerHistory();
			case FinalPackage.IFC_PARAMETER_VALUE_TYPE: return createIfcParameterValueType();
			case FinalPackage.IFC_PATH: return createIfcPath();
			case FinalPackage.IFC_PERFORMANCE_HISTORY: return createIfcPerformanceHistory();
			case FinalPackage.IFC_PERMEABLE_COVERING_OPERATION_ENUM_TYPE: return createIfcPermeableCoveringOperationEnumType();
			case FinalPackage.IFC_PERMEABLE_COVERING_PROPERTIES: return createIfcPermeableCoveringProperties();
			case FinalPackage.IFC_PERMIT: return createIfcPermit();
			case FinalPackage.IFC_PERSON: return createIfcPerson();
			case FinalPackage.IFC_PERSON_AND_ORGANIZATION: return createIfcPersonAndOrganization();
			case FinalPackage.IFC_PH_MEASURE_TYPE: return createIfcPHMeasureType();
			case FinalPackage.IFC_PHYSICAL_COMPLEX_QUANTITY: return createIfcPhysicalComplexQuantity();
			case FinalPackage.IFC_PHYSICAL_OR_VIRTUAL_ENUM_TYPE: return createIfcPhysicalOrVirtualEnumType();
			case FinalPackage.IFC_PILE: return createIfcPile();
			case FinalPackage.IFC_PILE_CONSTRUCTION_ENUM_TYPE: return createIfcPileConstructionEnumType();
			case FinalPackage.IFC_PILE_TYPE_ENUM_TYPE: return createIfcPileTypeEnumType();
			case FinalPackage.IFC_PIPE_FITTING_TYPE: return createIfcPipeFittingType();
			case FinalPackage.IFC_PIPE_FITTING_TYPE_ENUM_TYPE: return createIfcPipeFittingTypeEnumType();
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE: return createIfcPipeSegmentType();
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE_ENUM_TYPE: return createIfcPipeSegmentTypeEnumType();
			case FinalPackage.IFC_PIXEL_TEXTURE: return createIfcPixelTexture();
			case FinalPackage.IFC_PLANAR_BOX: return createIfcPlanarBox();
			case FinalPackage.IFC_PLANAR_EXTENT: return createIfcPlanarExtent();
			case FinalPackage.IFC_PLANAR_FORCE_MEASURE_TYPE: return createIfcPlanarForceMeasureType();
			case FinalPackage.IFC_PLANE: return createIfcPlane();
			case FinalPackage.IFC_PLANE_ANGLE_MEASURE_TYPE: return createIfcPlaneAngleMeasureType();
			case FinalPackage.IFC_PLATE: return createIfcPlate();
			case FinalPackage.IFC_PLATE_TYPE: return createIfcPlateType();
			case FinalPackage.IFC_PLATE_TYPE_ENUM_TYPE: return createIfcPlateTypeEnumType();
			case FinalPackage.IFC_POINT_ON_CURVE: return createIfcPointOnCurve();
			case FinalPackage.IFC_POINT_ON_SURFACE: return createIfcPointOnSurface();
			case FinalPackage.IFC_POINT_OR_VERTEX_POINT: return createIfcPointOrVertexPoint();
			case FinalPackage.IFC_POLYGONAL_BOUNDED_HALF_SPACE: return createIfcPolygonalBoundedHalfSpace();
			case FinalPackage.IFC_POLYLINE: return createIfcPolyline();
			case FinalPackage.IFC_POLY_LOOP: return createIfcPolyLoop();
			case FinalPackage.IFC_POSITIVE_LENGTH_MEASURE_TYPE: return createIfcPositiveLengthMeasureType();
			case FinalPackage.IFC_POSITIVE_PLANE_ANGLE_MEASURE_TYPE: return createIfcPositivePlaneAngleMeasureType();
			case FinalPackage.IFC_POSITIVE_RATIO_MEASURE_TYPE: return createIfcPositiveRatioMeasureType();
			case FinalPackage.IFC_POSTAL_ADDRESS: return createIfcPostalAddress();
			case FinalPackage.IFC_POWER_MEASURE_TYPE: return createIfcPowerMeasureType();
			case FinalPackage.IFC_PRE_DEFINED_DIMENSION_SYMBOL: return createIfcPreDefinedDimensionSymbol();
			case FinalPackage.IFC_PRE_DEFINED_POINT_MARKER_SYMBOL: return createIfcPreDefinedPointMarkerSymbol();
			case FinalPackage.IFC_PRE_DEFINED_TERMINATOR_SYMBOL: return createIfcPreDefinedTerminatorSymbol();
			case FinalPackage.IFC_PRESENTABLE_TEXT_TYPE: return createIfcPresentableTextType();
			case FinalPackage.IFC_PRESENTATION_LAYER_ASSIGNMENT: return createIfcPresentationLayerAssignment();
			case FinalPackage.IFC_PRESENTATION_LAYER_WITH_STYLE: return createIfcPresentationLayerWithStyle();
			case FinalPackage.IFC_PRESENTATION_STYLE_ASSIGNMENT: return createIfcPresentationStyleAssignment();
			case FinalPackage.IFC_PRESENTATION_STYLE_SELECT: return createIfcPresentationStyleSelect();
			case FinalPackage.IFC_PRESSURE_MEASURE_TYPE: return createIfcPressureMeasureType();
			case FinalPackage.IFC_PROCEDURE: return createIfcProcedure();
			case FinalPackage.IFC_PROCEDURE_TYPE_ENUM_TYPE: return createIfcProcedureTypeEnumType();
			case FinalPackage.IFC_PRODUCT_DEFINITION_SHAPE: return createIfcProductDefinitionShape();
			case FinalPackage.IFC_PRODUCT_REPRESENTATION: return createIfcProductRepresentation();
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES: return createIfcProductsOfCombustionProperties();
			case FinalPackage.IFC_PROFILE_TYPE_ENUM_TYPE: return createIfcProfileTypeEnumType();
			case FinalPackage.IFC_PROJECT: return createIfcProject();
			case FinalPackage.IFC_PROJECTED_OR_TRUE_LENGTH_ENUM_TYPE: return createIfcProjectedOrTrueLengthEnumType();
			case FinalPackage.IFC_PROJECTION_CURVE: return createIfcProjectionCurve();
			case FinalPackage.IFC_PROJECTION_ELEMENT: return createIfcProjectionElement();
			case FinalPackage.IFC_PROJECT_ORDER: return createIfcProjectOrder();
			case FinalPackage.IFC_PROJECT_ORDER_RECORD: return createIfcProjectOrderRecord();
			case FinalPackage.IFC_PROJECT_ORDER_RECORD_TYPE_ENUM_TYPE: return createIfcProjectOrderRecordTypeEnumType();
			case FinalPackage.IFC_PROJECT_ORDER_TYPE_ENUM_TYPE: return createIfcProjectOrderTypeEnumType();
			case FinalPackage.IFC_PROPERTY_BOUNDED_VALUE: return createIfcPropertyBoundedValue();
			case FinalPackage.IFC_PROPERTY_CONSTRAINT_RELATIONSHIP: return createIfcPropertyConstraintRelationship();
			case FinalPackage.IFC_PROPERTY_DEPENDENCY_RELATIONSHIP: return createIfcPropertyDependencyRelationship();
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE: return createIfcPropertyEnumeratedValue();
			case FinalPackage.IFC_PROPERTY_ENUMERATION: return createIfcPropertyEnumeration();
			case FinalPackage.IFC_PROPERTY_LIST_VALUE: return createIfcPropertyListValue();
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE: return createIfcPropertyReferenceValue();
			case FinalPackage.IFC_PROPERTY_SET: return createIfcPropertySet();
			case FinalPackage.IFC_PROPERTY_SINGLE_VALUE: return createIfcPropertySingleValue();
			case FinalPackage.IFC_PROPERTY_SOURCE_ENUM_TYPE: return createIfcPropertySourceEnumType();
			case FinalPackage.IFC_PROPERTY_TABLE_VALUE: return createIfcPropertyTableValue();
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE: return createIfcProtectiveDeviceType();
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE_ENUM_TYPE: return createIfcProtectiveDeviceTypeEnumType();
			case FinalPackage.IFC_PROXY: return createIfcProxy();
			case FinalPackage.IFC_PUMP_TYPE: return createIfcPumpType();
			case FinalPackage.IFC_PUMP_TYPE_ENUM_TYPE: return createIfcPumpTypeEnumType();
			case FinalPackage.IFC_QUANTITY_AREA: return createIfcQuantityArea();
			case FinalPackage.IFC_QUANTITY_COUNT: return createIfcQuantityCount();
			case FinalPackage.IFC_QUANTITY_LENGTH: return createIfcQuantityLength();
			case FinalPackage.IFC_QUANTITY_TIME: return createIfcQuantityTime();
			case FinalPackage.IFC_QUANTITY_VOLUME: return createIfcQuantityVolume();
			case FinalPackage.IFC_QUANTITY_WEIGHT: return createIfcQuantityWeight();
			case FinalPackage.IFC_RADIO_ACTIVITY_MEASURE_TYPE: return createIfcRadioActivityMeasureType();
			case FinalPackage.IFC_RADIUS_DIMENSION: return createIfcRadiusDimension();
			case FinalPackage.IFC_RAILING: return createIfcRailing();
			case FinalPackage.IFC_RAILING_TYPE: return createIfcRailingType();
			case FinalPackage.IFC_RAILING_TYPE_ENUM_TYPE: return createIfcRailingTypeEnumType();
			case FinalPackage.IFC_RAMP: return createIfcRamp();
			case FinalPackage.IFC_RAMP_FLIGHT: return createIfcRampFlight();
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE: return createIfcRampFlightType();
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE_ENUM_TYPE: return createIfcRampFlightTypeEnumType();
			case FinalPackage.IFC_RAMP_TYPE_ENUM_TYPE: return createIfcRampTypeEnumType();
			case FinalPackage.IFC_RATIO_MEASURE_TYPE: return createIfcRatioMeasureType();
			case FinalPackage.IFC_RATIONAL_BEZIER_CURVE: return createIfcRationalBezierCurve();
			case FinalPackage.IFC_REAL_TYPE: return createIfcRealType();
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF: return createIfcRectangleHollowProfileDef();
			case FinalPackage.IFC_RECTANGLE_PROFILE_DEF: return createIfcRectangleProfileDef();
			case FinalPackage.IFC_RECTANGULAR_PYRAMID: return createIfcRectangularPyramid();
			case FinalPackage.IFC_RECTANGULAR_TRIMMED_SURFACE: return createIfcRectangularTrimmedSurface();
			case FinalPackage.IFC_REFERENCES_VALUE_DOCUMENT: return createIfcReferencesValueDocument();
			case FinalPackage.IFC_REFLECTANCE_METHOD_ENUM_TYPE: return createIfcReflectanceMethodEnumType();
			case FinalPackage.IFC_REGULAR_TIME_SERIES: return createIfcRegularTimeSeries();
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES: return createIfcReinforcementBarProperties();
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES: return createIfcReinforcementDefinitionProperties();
			case FinalPackage.IFC_REINFORCING_BAR: return createIfcReinforcingBar();
			case FinalPackage.IFC_REINFORCING_BAR_ROLE_ENUM_TYPE: return createIfcReinforcingBarRoleEnumType();
			case FinalPackage.IFC_REINFORCING_BAR_SURFACE_ENUM_TYPE: return createIfcReinforcingBarSurfaceEnumType();
			case FinalPackage.IFC_REINFORCING_MESH: return createIfcReinforcingMesh();
			case FinalPackage.IFC_REL_AGGREGATES: return createIfcRelAggregates();
			case FinalPackage.IFC_REL_ASSIGNS_TASKS: return createIfcRelAssignsTasks();
			case FinalPackage.IFC_REL_ASSIGNS_TO_ACTOR: return createIfcRelAssignsToActor();
			case FinalPackage.IFC_REL_ASSIGNS_TO_CONTROL: return createIfcRelAssignsToControl();
			case FinalPackage.IFC_REL_ASSIGNS_TO_GROUP: return createIfcRelAssignsToGroup();
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS: return createIfcRelAssignsToProcess();
			case FinalPackage.IFC_REL_ASSIGNS_TO_PRODUCT: return createIfcRelAssignsToProduct();
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROJECT_ORDER: return createIfcRelAssignsToProjectOrder();
			case FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE: return createIfcRelAssignsToResource();
			case FinalPackage.IFC_REL_ASSOCIATES: return createIfcRelAssociates();
			case FinalPackage.IFC_REL_ASSOCIATES_APPLIED_VALUE: return createIfcRelAssociatesAppliedValue();
			case FinalPackage.IFC_REL_ASSOCIATES_APPROVAL: return createIfcRelAssociatesApproval();
			case FinalPackage.IFC_REL_ASSOCIATES_CLASSIFICATION: return createIfcRelAssociatesClassification();
			case FinalPackage.IFC_REL_ASSOCIATES_CONSTRAINT: return createIfcRelAssociatesConstraint();
			case FinalPackage.IFC_REL_ASSOCIATES_DOCUMENT: return createIfcRelAssociatesDocument();
			case FinalPackage.IFC_REL_ASSOCIATES_LIBRARY: return createIfcRelAssociatesLibrary();
			case FinalPackage.IFC_REL_ASSOCIATES_MATERIAL: return createIfcRelAssociatesMaterial();
			case FinalPackage.IFC_REL_ASSOCIATES_PROFILE_PROPERTIES: return createIfcRelAssociatesProfileProperties();
			case FinalPackage.IFC_RELAXATION: return createIfcRelaxation();
			case FinalPackage.IFC_REL_CONNECTS_ELEMENTS: return createIfcRelConnectsElements();
			case FinalPackage.IFC_REL_CONNECTS_PATH_ELEMENTS: return createIfcRelConnectsPathElements();
			case FinalPackage.IFC_REL_CONNECTS_PORTS: return createIfcRelConnectsPorts();
			case FinalPackage.IFC_REL_CONNECTS_PORT_TO_ELEMENT: return createIfcRelConnectsPortToElement();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ACTIVITY: return createIfcRelConnectsStructuralActivity();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_ELEMENT: return createIfcRelConnectsStructuralElement();
			case FinalPackage.IFC_REL_CONNECTS_STRUCTURAL_MEMBER: return createIfcRelConnectsStructuralMember();
			case FinalPackage.IFC_REL_CONNECTS_WITH_ECCENTRICITY: return createIfcRelConnectsWithEccentricity();
			case FinalPackage.IFC_REL_CONNECTS_WITH_REALIZING_ELEMENTS: return createIfcRelConnectsWithRealizingElements();
			case FinalPackage.IFC_REL_CONTAINED_IN_SPATIAL_STRUCTURE: return createIfcRelContainedInSpatialStructure();
			case FinalPackage.IFC_REL_COVERS_BLDG_ELEMENTS: return createIfcRelCoversBldgElements();
			case FinalPackage.IFC_REL_COVERS_SPACES: return createIfcRelCoversSpaces();
			case FinalPackage.IFC_REL_DEFINES_BY_PROPERTIES: return createIfcRelDefinesByProperties();
			case FinalPackage.IFC_REL_DEFINES_BY_TYPE: return createIfcRelDefinesByType();
			case FinalPackage.IFC_REL_FILLS_ELEMENT: return createIfcRelFillsElement();
			case FinalPackage.IFC_REL_FLOW_CONTROL_ELEMENTS: return createIfcRelFlowControlElements();
			case FinalPackage.IFC_REL_INTERACTION_REQUIREMENTS: return createIfcRelInteractionRequirements();
			case FinalPackage.IFC_REL_NESTS: return createIfcRelNests();
			case FinalPackage.IFC_REL_OCCUPIES_SPACES: return createIfcRelOccupiesSpaces();
			case FinalPackage.IFC_REL_OVERRIDES_PROPERTIES: return createIfcRelOverridesProperties();
			case FinalPackage.IFC_REL_PROJECTS_ELEMENT: return createIfcRelProjectsElement();
			case FinalPackage.IFC_REL_REFERENCED_IN_SPATIAL_STRUCTURE: return createIfcRelReferencedInSpatialStructure();
			case FinalPackage.IFC_REL_SCHEDULES_COST_ITEMS: return createIfcRelSchedulesCostItems();
			case FinalPackage.IFC_REL_SEQUENCE: return createIfcRelSequence();
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS: return createIfcRelServicesBuildings();
			case FinalPackage.IFC_REL_SPACE_BOUNDARY: return createIfcRelSpaceBoundary();
			case FinalPackage.IFC_REL_VOIDS_ELEMENT: return createIfcRelVoidsElement();
			case FinalPackage.IFC_REPRESENTATION: return createIfcRepresentation();
			case FinalPackage.IFC_REPRESENTATION_CONTEXT: return createIfcRepresentationContext();
			case FinalPackage.IFC_REPRESENTATION_MAP: return createIfcRepresentationMap();
			case FinalPackage.IFC_RESOURCE_CONSUMPTION_ENUM_TYPE: return createIfcResourceConsumptionEnumType();
			case FinalPackage.IFC_REVOLVED_AREA_SOLID: return createIfcRevolvedAreaSolid();
			case FinalPackage.IFC_RIB_PLATE_DIRECTION_ENUM_TYPE: return createIfcRibPlateDirectionEnumType();
			case FinalPackage.IFC_RIB_PLATE_PROFILE_PROPERTIES: return createIfcRibPlateProfileProperties();
			case FinalPackage.IFC_RIGHT_CIRCULAR_CONE: return createIfcRightCircularCone();
			case FinalPackage.IFC_RIGHT_CIRCULAR_CYLINDER: return createIfcRightCircularCylinder();
			case FinalPackage.IFC_ROLE_ENUM_TYPE: return createIfcRoleEnumType();
			case FinalPackage.IFC_ROOF: return createIfcRoof();
			case FinalPackage.IFC_ROOF_TYPE_ENUM_TYPE: return createIfcRoofTypeEnumType();
			case FinalPackage.IFC_ROTATIONAL_FREQUENCY_MEASURE_TYPE: return createIfcRotationalFrequencyMeasureType();
			case FinalPackage.IFC_ROTATIONAL_MASS_MEASURE_TYPE: return createIfcRotationalMassMeasureType();
			case FinalPackage.IFC_ROTATIONAL_STIFFNESS_MEASURE_TYPE: return createIfcRotationalStiffnessMeasureType();
			case FinalPackage.IFC_ROUNDED_EDGE_FEATURE: return createIfcRoundedEdgeFeature();
			case FinalPackage.IFC_ROUNDED_RECTANGLE_PROFILE_DEF: return createIfcRoundedRectangleProfileDef();
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE: return createIfcSanitaryTerminalType();
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE_ENUM_TYPE: return createIfcSanitaryTerminalTypeEnumType();
			case FinalPackage.IFC_SCHEDULE_TIME_CONTROL: return createIfcScheduleTimeControl();
			case FinalPackage.IFC_SECOND_IN_MINUTE_TYPE: return createIfcSecondInMinuteType();
			case FinalPackage.IFC_SECTIONAL_AREA_INTEGRAL_MEASURE_TYPE: return createIfcSectionalAreaIntegralMeasureType();
			case FinalPackage.IFC_SECTIONED_SPINE: return createIfcSectionedSpine();
			case FinalPackage.IFC_SECTION_MODULUS_MEASURE_TYPE: return createIfcSectionModulusMeasureType();
			case FinalPackage.IFC_SECTION_PROPERTIES: return createIfcSectionProperties();
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES: return createIfcSectionReinforcementProperties();
			case FinalPackage.IFC_SECTION_TYPE_ENUM_TYPE: return createIfcSectionTypeEnumType();
			case FinalPackage.IFC_SENSOR_TYPE: return createIfcSensorType();
			case FinalPackage.IFC_SENSOR_TYPE_ENUM_TYPE: return createIfcSensorTypeEnumType();
			case FinalPackage.IFC_SEQUENCE_ENUM_TYPE: return createIfcSequenceEnumType();
			case FinalPackage.IFC_SERVICE_LIFE: return createIfcServiceLife();
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR: return createIfcServiceLifeFactor();
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR_TYPE_ENUM_TYPE: return createIfcServiceLifeFactorTypeEnumType();
			case FinalPackage.IFC_SERVICE_LIFE_TYPE_ENUM_TYPE: return createIfcServiceLifeTypeEnumType();
			case FinalPackage.IFC_SHAPE_ASPECT: return createIfcShapeAspect();
			case FinalPackage.IFC_SHAPE_REPRESENTATION: return createIfcShapeRepresentation();
			case FinalPackage.IFC_SHEAR_MODULUS_MEASURE_TYPE: return createIfcShearModulusMeasureType();
			case FinalPackage.IFC_SHELL: return createIfcShell();
			case FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL: return createIfcShellBasedSurfaceModel();
			case FinalPackage.IFC_SIMPLE_VALUE: return createIfcSimpleValue();
			case FinalPackage.IFC_SI_PREFIX_TYPE: return createIfcSIPrefixType();
			case FinalPackage.IFC_SITE: return createIfcSite();
			case FinalPackage.IFC_SI_UNIT: return createIfcSIUnit();
			case FinalPackage.IFC_SI_UNIT_NAME_TYPE: return createIfcSIUnitNameType();
			case FinalPackage.IFC_SIZE_SELECT: return createIfcSizeSelect();
			case FinalPackage.IFC_SLAB: return createIfcSlab();
			case FinalPackage.IFC_SLAB_TYPE: return createIfcSlabType();
			case FinalPackage.IFC_SLAB_TYPE_ENUM_TYPE: return createIfcSlabTypeEnumType();
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION: return createIfcSlippageConnectionCondition();
			case FinalPackage.IFC_SOLID_ANGLE_MEASURE_TYPE: return createIfcSolidAngleMeasureType();
			case FinalPackage.IFC_SOUND_POWER_MEASURE_TYPE: return createIfcSoundPowerMeasureType();
			case FinalPackage.IFC_SOUND_PRESSURE_MEASURE_TYPE: return createIfcSoundPressureMeasureType();
			case FinalPackage.IFC_SOUND_PROPERTIES: return createIfcSoundProperties();
			case FinalPackage.IFC_SOUND_SCALE_ENUM_TYPE: return createIfcSoundScaleEnumType();
			case FinalPackage.IFC_SOUND_VALUE: return createIfcSoundValue();
			case FinalPackage.IFC_SPACE: return createIfcSpace();
			case FinalPackage.IFC_SPACE_HEATER_TYPE: return createIfcSpaceHeaterType();
			case FinalPackage.IFC_SPACE_HEATER_TYPE_ENUM_TYPE: return createIfcSpaceHeaterTypeEnumType();
			case FinalPackage.IFC_SPACE_PROGRAM: return createIfcSpaceProgram();
			case FinalPackage.IFC_SPACE_THERMAL_LOAD_PROPERTIES: return createIfcSpaceThermalLoadProperties();
			case FinalPackage.IFC_SPACE_TYPE: return createIfcSpaceType();
			case FinalPackage.IFC_SPACE_TYPE_ENUM_TYPE: return createIfcSpaceTypeEnumType();
			case FinalPackage.IFC_SPECIFIC_HEAT_CAPACITY_MEASURE_TYPE: return createIfcSpecificHeatCapacityMeasureType();
			case FinalPackage.IFC_SPECULAR_EXPONENT_TYPE: return createIfcSpecularExponentType();
			case FinalPackage.IFC_SPECULAR_HIGHLIGHT_SELECT: return createIfcSpecularHighlightSelect();
			case FinalPackage.IFC_SPECULAR_ROUGHNESS_TYPE: return createIfcSpecularRoughnessType();
			case FinalPackage.IFC_SPHERE: return createIfcSphere();
			case FinalPackage.IFC_STACK_TERMINAL_TYPE: return createIfcStackTerminalType();
			case FinalPackage.IFC_STACK_TERMINAL_TYPE_ENUM_TYPE: return createIfcStackTerminalTypeEnumType();
			case FinalPackage.IFC_STAIR: return createIfcStair();
			case FinalPackage.IFC_STAIR_FLIGHT: return createIfcStairFlight();
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE: return createIfcStairFlightType();
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE_ENUM_TYPE: return createIfcStairFlightTypeEnumType();
			case FinalPackage.IFC_STAIR_TYPE_ENUM_TYPE: return createIfcStairTypeEnumType();
			case FinalPackage.IFC_STATE_ENUM_TYPE: return createIfcStateEnumType();
			case FinalPackage.IFC_STRUCTURAL_ACTIVITY_ASSIGNMENT_SELECT: return createIfcStructuralActivityAssignmentSelect();
			case FinalPackage.IFC_STRUCTURAL_ANALYSIS_MODEL: return createIfcStructuralAnalysisModel();
			case FinalPackage.IFC_STRUCTURAL_CURVE_CONNECTION: return createIfcStructuralCurveConnection();
			case FinalPackage.IFC_STRUCTURAL_CURVE_MEMBER: return createIfcStructuralCurveMember();
			case FinalPackage.IFC_STRUCTURAL_CURVE_MEMBER_VARYING: return createIfcStructuralCurveMemberVarying();
			case FinalPackage.IFC_STRUCTURAL_CURVE_TYPE_ENUM_TYPE: return createIfcStructuralCurveTypeEnumType();
			case FinalPackage.IFC_STRUCTURAL_LINEAR_ACTION: return createIfcStructuralLinearAction();
			case FinalPackage.IFC_STRUCTURAL_LINEAR_ACTION_VARYING: return createIfcStructuralLinearActionVarying();
			case FinalPackage.IFC_STRUCTURAL_LOAD_GROUP: return createIfcStructuralLoadGroup();
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE: return createIfcStructuralLoadLinearForce();
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE: return createIfcStructuralLoadPlanarForce();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT: return createIfcStructuralLoadSingleDisplacement();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT_DISTORTION: return createIfcStructuralLoadSingleDisplacementDistortion();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE: return createIfcStructuralLoadSingleForce();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE_WARPING: return createIfcStructuralLoadSingleForceWarping();
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE: return createIfcStructuralLoadTemperature();
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION: return createIfcStructuralPlanarAction();
			case FinalPackage.IFC_STRUCTURAL_PLANAR_ACTION_VARYING: return createIfcStructuralPlanarActionVarying();
			case FinalPackage.IFC_STRUCTURAL_POINT_ACTION: return createIfcStructuralPointAction();
			case FinalPackage.IFC_STRUCTURAL_POINT_CONNECTION: return createIfcStructuralPointConnection();
			case FinalPackage.IFC_STRUCTURAL_POINT_REACTION: return createIfcStructuralPointReaction();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES: return createIfcStructuralProfileProperties();
			case FinalPackage.IFC_STRUCTURAL_RESULT_GROUP: return createIfcStructuralResultGroup();
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES: return createIfcStructuralSteelProfileProperties();
			case FinalPackage.IFC_STRUCTURAL_SURFACE_CONNECTION: return createIfcStructuralSurfaceConnection();
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER: return createIfcStructuralSurfaceMember();
			case FinalPackage.IFC_STRUCTURAL_SURFACE_MEMBER_VARYING: return createIfcStructuralSurfaceMemberVarying();
			case FinalPackage.IFC_STRUCTURAL_SURFACE_TYPE_ENUM_TYPE: return createIfcStructuralSurfaceTypeEnumType();
			case FinalPackage.IFC_STRUCTURED_DIMENSION_CALLOUT: return createIfcStructuredDimensionCallout();
			case FinalPackage.IFC_STYLED_ITEM: return createIfcStyledItem();
			case FinalPackage.IFC_STYLED_REPRESENTATION: return createIfcStyledRepresentation();
			case FinalPackage.IFC_SUB_CONTRACT_RESOURCE: return createIfcSubContractResource();
			case FinalPackage.IFC_SUBEDGE: return createIfcSubedge();
			case FinalPackage.IFC_SURFACE_CURVE_SWEPT_AREA_SOLID: return createIfcSurfaceCurveSweptAreaSolid();
			case FinalPackage.IFC_SURFACE_OF_LINEAR_EXTRUSION: return createIfcSurfaceOfLinearExtrusion();
			case FinalPackage.IFC_SURFACE_OF_REVOLUTION: return createIfcSurfaceOfRevolution();
			case FinalPackage.IFC_SURFACE_OR_FACE_SURFACE: return createIfcSurfaceOrFaceSurface();
			case FinalPackage.IFC_SURFACE_SIDE_TYPE: return createIfcSurfaceSideType();
			case FinalPackage.IFC_SURFACE_STYLE: return createIfcSurfaceStyle();
			case FinalPackage.IFC_SURFACE_STYLE_ELEMENT_SELECT: return createIfcSurfaceStyleElementSelect();
			case FinalPackage.IFC_SURFACE_STYLE_LIGHTING: return createIfcSurfaceStyleLighting();
			case FinalPackage.IFC_SURFACE_STYLE_REFRACTION: return createIfcSurfaceStyleRefraction();
			case FinalPackage.IFC_SURFACE_STYLE_RENDERING: return createIfcSurfaceStyleRendering();
			case FinalPackage.IFC_SURFACE_STYLE_SHADING: return createIfcSurfaceStyleShading();
			case FinalPackage.IFC_SURFACE_STYLE_WITH_TEXTURES: return createIfcSurfaceStyleWithTextures();
			case FinalPackage.IFC_SURFACE_TEXTURE_ENUM_TYPE: return createIfcSurfaceTextureEnumType();
			case FinalPackage.IFC_SWEPT_DISK_SOLID: return createIfcSweptDiskSolid();
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE: return createIfcSwitchingDeviceType();
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE_ENUM_TYPE: return createIfcSwitchingDeviceTypeEnumType();
			case FinalPackage.IFC_SYMBOL_STYLE: return createIfcSymbolStyle();
			case FinalPackage.IFC_SYMBOL_STYLE_SELECT: return createIfcSymbolStyleSelect();
			case FinalPackage.IFC_SYSTEM: return createIfcSystem();
			case FinalPackage.IFC_SYSTEM_FURNITURE_ELEMENT_TYPE: return createIfcSystemFurnitureElementType();
			case FinalPackage.IFC_TABLE: return createIfcTable();
			case FinalPackage.IFC_TABLE_ROW: return createIfcTableRow();
			case FinalPackage.IFC_TANK_TYPE: return createIfcTankType();
			case FinalPackage.IFC_TANK_TYPE_ENUM_TYPE: return createIfcTankTypeEnumType();
			case FinalPackage.IFC_TASK: return createIfcTask();
			case FinalPackage.IFC_TELECOM_ADDRESS: return createIfcTelecomAddress();
			case FinalPackage.IFC_TEMPERATURE_GRADIENT_MEASURE_TYPE: return createIfcTemperatureGradientMeasureType();
			case FinalPackage.IFC_TENDON: return createIfcTendon();
			case FinalPackage.IFC_TENDON_ANCHOR: return createIfcTendonAnchor();
			case FinalPackage.IFC_TENDON_TYPE_ENUM_TYPE: return createIfcTendonTypeEnumType();
			case FinalPackage.IFC_TERMINATOR_SYMBOL: return createIfcTerminatorSymbol();
			case FinalPackage.IFC_TEXT_ALIGNMENT_TYPE: return createIfcTextAlignmentType();
			case FinalPackage.IFC_TEXT_DECORATION_TYPE: return createIfcTextDecorationType();
			case FinalPackage.IFC_TEXT_FONT_NAME_TYPE: return createIfcTextFontNameType();
			case FinalPackage.IFC_TEXT_FONT_SELECT: return createIfcTextFontSelect();
			case FinalPackage.IFC_TEXT_LITERAL: return createIfcTextLiteral();
			case FinalPackage.IFC_TEXT_LITERAL_WITH_EXTENT: return createIfcTextLiteralWithExtent();
			case FinalPackage.IFC_TEXT_PATH_TYPE: return createIfcTextPathType();
			case FinalPackage.IFC_TEXT_STYLE: return createIfcTextStyle();
			case FinalPackage.IFC_TEXT_STYLE_FONT_MODEL: return createIfcTextStyleFontModel();
			case FinalPackage.IFC_TEXT_STYLE_FOR_DEFINED_FONT: return createIfcTextStyleForDefinedFont();
			case FinalPackage.IFC_TEXT_STYLE_SELECT: return createIfcTextStyleSelect();
			case FinalPackage.IFC_TEXT_STYLE_TEXT_MODEL: return createIfcTextStyleTextModel();
			case FinalPackage.IFC_TEXT_STYLE_WITH_BOX_CHARACTERISTICS: return createIfcTextStyleWithBoxCharacteristics();
			case FinalPackage.IFC_TEXT_TRANSFORMATION_TYPE: return createIfcTextTransformationType();
			case FinalPackage.IFC_TEXT_TYPE: return createIfcTextType();
			case FinalPackage.IFC_TEXTURE_COORDINATE_GENERATOR: return createIfcTextureCoordinateGenerator();
			case FinalPackage.IFC_TEXTURE_MAP: return createIfcTextureMap();
			case FinalPackage.IFC_TEXTURE_VERTEX: return createIfcTextureVertex();
			case FinalPackage.IFC_THERMAL_ADMITTANCE_MEASURE_TYPE: return createIfcThermalAdmittanceMeasureType();
			case FinalPackage.IFC_THERMAL_CONDUCTIVITY_MEASURE_TYPE: return createIfcThermalConductivityMeasureType();
			case FinalPackage.IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE_TYPE: return createIfcThermalExpansionCoefficientMeasureType();
			case FinalPackage.IFC_THERMAL_LOAD_SOURCE_ENUM_TYPE: return createIfcThermalLoadSourceEnumType();
			case FinalPackage.IFC_THERMAL_LOAD_TYPE_ENUM_TYPE: return createIfcThermalLoadTypeEnumType();
			case FinalPackage.IFC_THERMAL_MATERIAL_PROPERTIES: return createIfcThermalMaterialProperties();
			case FinalPackage.IFC_THERMAL_RESISTANCE_MEASURE_TYPE: return createIfcThermalResistanceMeasureType();
			case FinalPackage.IFC_THERMAL_TRANSMITTANCE_MEASURE_TYPE: return createIfcThermalTransmittanceMeasureType();
			case FinalPackage.IFC_THERMODYNAMIC_TEMPERATURE_MEASURE_TYPE: return createIfcThermodynamicTemperatureMeasureType();
			case FinalPackage.IFC_TIME_MEASURE_TYPE: return createIfcTimeMeasureType();
			case FinalPackage.IFC_TIME_SERIES_DATA_TYPE_ENUM_TYPE: return createIfcTimeSeriesDataTypeEnumType();
			case FinalPackage.IFC_TIME_SERIES_REFERENCE_RELATIONSHIP: return createIfcTimeSeriesReferenceRelationship();
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE: return createIfcTimeSeriesSchedule();
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE_TYPE_ENUM_TYPE: return createIfcTimeSeriesScheduleTypeEnumType();
			case FinalPackage.IFC_TIME_SERIES_VALUE: return createIfcTimeSeriesValue();
			case FinalPackage.IFC_TIME_STAMP_TYPE: return createIfcTimeStampType();
			case FinalPackage.IFC_TOPOLOGY_REPRESENTATION: return createIfcTopologyRepresentation();
			case FinalPackage.IFC_TORQUE_MEASURE_TYPE: return createIfcTorqueMeasureType();
			case FinalPackage.IFC_TRANSFORMER_TYPE: return createIfcTransformerType();
			case FinalPackage.IFC_TRANSFORMER_TYPE_ENUM_TYPE: return createIfcTransformerTypeEnumType();
			case FinalPackage.IFC_TRANSITION_CODE_TYPE: return createIfcTransitionCodeType();
			case FinalPackage.IFC_TRANSPORT_ELEMENT: return createIfcTransportElement();
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE: return createIfcTransportElementType();
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE_ENUM_TYPE: return createIfcTransportElementTypeEnumType();
			case FinalPackage.IFC_TRAPEZIUM_PROFILE_DEF: return createIfcTrapeziumProfileDef();
			case FinalPackage.IFC_TRIMMED_CURVE: return createIfcTrimmedCurve();
			case FinalPackage.IFC_TRIMMING_PREFERENCE_TYPE: return createIfcTrimmingPreferenceType();
			case FinalPackage.IFC_TRIMMING_SELECT: return createIfcTrimmingSelect();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF: return createIfcTShapeProfileDef();
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE: return createIfcTubeBundleType();
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE_ENUM_TYPE: return createIfcTubeBundleTypeEnumType();
			case FinalPackage.IFC_TWO_DIRECTION_REPEAT_FACTOR: return createIfcTwoDirectionRepeatFactor();
			case FinalPackage.IFC_TYPE_OBJECT: return createIfcTypeObject();
			case FinalPackage.IFC_TYPE_PRODUCT: return createIfcTypeProduct();
			case FinalPackage.IFC_UNIT: return createIfcUnit();
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE: return createIfcUnitaryEquipmentType();
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE_ENUM_TYPE: return createIfcUnitaryEquipmentTypeEnumType();
			case FinalPackage.IFC_UNIT_ASSIGNMENT: return createIfcUnitAssignment();
			case FinalPackage.IFC_UNIT_ENUM_TYPE: return createIfcUnitEnumType();
			case FinalPackage.IFC_USHAPE_PROFILE_DEF: return createIfcUShapeProfileDef();
			case FinalPackage.IFC_VALUE: return createIfcValue();
			case FinalPackage.IFC_VALVE_TYPE: return createIfcValveType();
			case FinalPackage.IFC_VALVE_TYPE_ENUM_TYPE: return createIfcValveTypeEnumType();
			case FinalPackage.IFC_VAPOR_PERMEABILITY_MEASURE_TYPE: return createIfcVaporPermeabilityMeasureType();
			case FinalPackage.IFC_VECTOR: return createIfcVector();
			case FinalPackage.IFC_VECTOR_OR_DIRECTION: return createIfcVectorOrDirection();
			case FinalPackage.IFC_VERTEX: return createIfcVertex();
			case FinalPackage.IFC_VERTEX_BASED_TEXTURE_MAP: return createIfcVertexBasedTextureMap();
			case FinalPackage.IFC_VERTEX_LOOP: return createIfcVertexLoop();
			case FinalPackage.IFC_VERTEX_POINT: return createIfcVertexPoint();
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE: return createIfcVibrationIsolatorType();
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE_ENUM_TYPE: return createIfcVibrationIsolatorTypeEnumType();
			case FinalPackage.IFC_VIRTUAL_ELEMENT: return createIfcVirtualElement();
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION: return createIfcVirtualGridIntersection();
			case FinalPackage.IFC_VOLUME_MEASURE_TYPE: return createIfcVolumeMeasureType();
			case FinalPackage.IFC_VOLUMETRIC_FLOW_RATE_MEASURE_TYPE: return createIfcVolumetricFlowRateMeasureType();
			case FinalPackage.IFC_WALL: return createIfcWall();
			case FinalPackage.IFC_WALL_STANDARD_CASE: return createIfcWallStandardCase();
			case FinalPackage.IFC_WALL_TYPE: return createIfcWallType();
			case FinalPackage.IFC_WALL_TYPE_ENUM_TYPE: return createIfcWallTypeEnumType();
			case FinalPackage.IFC_WARPING_CONSTANT_MEASURE_TYPE: return createIfcWarpingConstantMeasureType();
			case FinalPackage.IFC_WARPING_MOMENT_MEASURE_TYPE: return createIfcWarpingMomentMeasureType();
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE: return createIfcWasteTerminalType();
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE_ENUM_TYPE: return createIfcWasteTerminalTypeEnumType();
			case FinalPackage.IFC_WATER_PROPERTIES: return createIfcWaterProperties();
			case FinalPackage.IFC_WINDOW: return createIfcWindow();
			case FinalPackage.IFC_WINDOW_LINING_PROPERTIES: return createIfcWindowLiningProperties();
			case FinalPackage.IFC_WINDOW_PANEL_OPERATION_ENUM_TYPE: return createIfcWindowPanelOperationEnumType();
			case FinalPackage.IFC_WINDOW_PANEL_POSITION_ENUM_TYPE: return createIfcWindowPanelPositionEnumType();
			case FinalPackage.IFC_WINDOW_PANEL_PROPERTIES: return createIfcWindowPanelProperties();
			case FinalPackage.IFC_WINDOW_STYLE: return createIfcWindowStyle();
			case FinalPackage.IFC_WINDOW_STYLE_CONSTRUCTION_ENUM_TYPE: return createIfcWindowStyleConstructionEnumType();
			case FinalPackage.IFC_WINDOW_STYLE_OPERATION_ENUM_TYPE: return createIfcWindowStyleOperationEnumType();
			case FinalPackage.IFC_WORK_CONTROL_TYPE_ENUM_TYPE: return createIfcWorkControlTypeEnumType();
			case FinalPackage.IFC_WORK_PLAN: return createIfcWorkPlan();
			case FinalPackage.IFC_WORK_SCHEDULE: return createIfcWorkSchedule();
			case FinalPackage.IFC_YEAR_NUMBER_TYPE: return createIfcYearNumberType();
			case FinalPackage.IFC_ZONE: return createIfcZone();
			case FinalPackage.IFC_ZSHAPE_PROFILE_DEF: return createIfcZShapeProfileDef();
			case FinalPackage.INCORPORATION_DATE_TYPE: return createIncorporationDateType();
			case FinalPackage.INNER_BOUNDARIES_TYPE: return createInnerBoundariesType();
			case FinalPackage.INNER_BOUNDARIES_TYPE1: return createInnerBoundariesType1();
			case FinalPackage.INNER_CURVES_TYPE: return createInnerCurvesType();
			case FinalPackage.INTERSECTING_AXES_TYPE: return createIntersectingAxesType();
			case FinalPackage.ITEM_OF_TYPE: return createItemOfType();
			case FinalPackage.ITEMS_TYPE: return createItemsType();
			case FinalPackage.ITEM_TYPE: return createItemType();
			case FinalPackage.ITEM_TYPE1: return createItemType1();
			case FinalPackage.JURISDICTION_TYPE: return createJurisdictionType();
			case FinalPackage.LAST_MODIFYING_APPLICATION_TYPE: return createLastModifyingApplicationType();
			case FinalPackage.LAST_MODIFYING_USER_TYPE: return createLastModifyingUserType();
			case FinalPackage.LAST_REVISION_TIME_TYPE: return createLastRevisionTimeType();
			case FinalPackage.LAST_UPDATE_DATE_TYPE: return createLastUpdateDateType();
			case FinalPackage.LATE_FINISH_TYPE: return createLateFinishType();
			case FinalPackage.LATE_START_TYPE: return createLateStartType();
			case FinalPackage.LAYER_STYLES_TYPE: return createLayerStylesType();
			case FinalPackage.LETTER_SPACING_TYPE: return createLetterSpacingType();
			case FinalPackage.LIBRARY_REFERENCE_TYPE: return createLibraryReferenceType();
			case FinalPackage.LIGHT_COLOUR_TYPE: return createLightColourType();
			case FinalPackage.LIGHT_DISTRIBUTION_DATA_SOURCE_TYPE: return createLightDistributionDataSourceType();
			case FinalPackage.LINE_HEIGHT_TYPE: return createLineHeightType();
			case FinalPackage.LIST_VALUES_TYPE: return createListValuesType();
			case FinalPackage.LIST_VALUES_TYPE1: return createListValuesType1();
			case FinalPackage.LIST_VALUES_TYPE2: return createListValuesType2();
			case FinalPackage.LOADED_BY_TYPE: return createLoadedByType();
			case FinalPackage.LOCAL_ORIGIN_TYPE: return createLocalOriginType();
			case FinalPackage.LOCATION_AT_RELATED_ELEMENT_TYPE: return createLocationAtRelatedElementType();
			case FinalPackage.LOCATION_AT_RELATING_ELEMENT_TYPE: return createLocationAtRelatingElementType();
			case FinalPackage.LOCATION_OF_INTERACTION_TYPE: return createLocationOfInteractionType();
			case FinalPackage.LOCATION_TYPE: return createLocationType();
			case FinalPackage.LOOP_VERTEX_TYPE: return createLoopVertexType();
			case FinalPackage.LOWER_BOUND_VALUE_TYPE: return createLowerBoundValueType();
			case FinalPackage.LOWER_VALUE_TYPE: return createLowerValueType();
			case FinalPackage.LUMINOUS_INTENSITY_TYPE: return createLuminousIntensityType();
			case FinalPackage.MAPPED_REPRESENTATION_TYPE: return createMappedRepresentationType();
			case FinalPackage.MAPPING_ORIGIN_TYPE: return createMappingOriginType();
			case FinalPackage.MAPPING_SOURCE_TYPE: return createMappingSourceType();
			case FinalPackage.MAPPING_TARGET_TYPE: return createMappingTargetType();
			case FinalPackage.MATERIAL_CLASSIFICATIONS_TYPE: return createMaterialClassificationsType();
			case FinalPackage.MATERIAL_LAYERS_TYPE: return createMaterialLayersType();
			case FinalPackage.MATERIALS_TYPE: return createMaterialsType();
			case FinalPackage.MATERIAL_TYPE: return createMaterialType();
			case FinalPackage.MATERIAL_TYPE1: return createMaterialType1();
			case FinalPackage.MIDDLE_NAMES_TYPE: return createMiddleNamesType();
			case FinalPackage.MOST_USED_VALUE_TYPE: return createMostUsedValueType();
			case FinalPackage.MOVE_FROM_TYPE: return createMoveFromType();
			case FinalPackage.MOVE_TO_TYPE: return createMoveToType();
			case FinalPackage.NOMINAL_VALUE_TYPE: return createNominalValueType();
			case FinalPackage.NOTATION_FACETS_TYPE: return createNotationFacetsType();
			case FinalPackage.NOTATION_TYPE: return createNotationType();
			case FinalPackage.OBJECT_PLACEMENT_TYPE: return createObjectPlacementType();
			case FinalPackage.OFFSET_DISTANCES_TYPE: return createOffsetDistancesType();
			case FinalPackage.OPERATOR_TYPE: return createOperatorType();
			case FinalPackage.ORIENTATION_OF2_DPLANE_TYPE: return createOrientationOf2DPlaneType();
			case FinalPackage.ORIENTATION_TYPE: return createOrientationType();
			case FinalPackage.ORIENTATION_TYPE1: return createOrientationType1();
			case FinalPackage.ORIENTATION_TYPE2: return createOrientationType2();
			case FinalPackage.ORIGINAL_VALUE_TYPE: return createOriginalValueType();
			case FinalPackage.ORIGINAL_VALUE_TYPE1: return createOriginalValueType1();
			case FinalPackage.OUTER_BOUNDARY_TYPE: return createOuterBoundaryType();
			case FinalPackage.OUTER_BOUNDARY_TYPE1: return createOuterBoundaryType1();
			case FinalPackage.OUTER_CURVE_TYPE: return createOuterCurveType();
			case FinalPackage.OUTER_TYPE: return createOuterType();
			case FinalPackage.OVERRIDING_PROPERTIES_TYPE: return createOverridingPropertiesType();
			case FinalPackage.OWNER_HISTORY_TYPE: return createOwnerHistoryType();
			case FinalPackage.OWNER_TYPE: return createOwnerType();
			case FinalPackage.OWNING_APPLICATION_TYPE: return createOwningApplicationType();
			case FinalPackage.OWNING_USER_TYPE: return createOwningUserType();
			case FinalPackage.PARAMETER_TYPE: return createParameterType();
			case FinalPackage.PARENT_CONTEXT_TYPE: return createParentContextType();
			case FinalPackage.PARENT_CURVE_TYPE: return createParentCurveType();
			case FinalPackage.PARENT_EDGE_TYPE: return createParentEdgeType();
			case FinalPackage.PARENT_PROFILE_TYPE: return createParentProfileType();
			case FinalPackage.PART_OF_PRODUCT_DEFINITION_SHAPE_TYPE: return createPartOfProductDefinitionShapeType();
			case FinalPackage.PATTERN_LIST_TYPE: return createPatternListType();
			case FinalPackage.PATTERN_START_TYPE: return createPatternStartType();
			case FinalPackage.PIXEL_TYPE: return createPixelType();
			case FinalPackage.PLACEMENT_LOCATION_TYPE: return createPlacementLocationType();
			case FinalPackage.PLACEMENT_REF_DIRECTION_TYPE: return createPlacementRefDirectionType();
			case FinalPackage.PLACEMENT_REL_TO_TYPE: return createPlacementRelToType();
			case FinalPackage.PLACEMENT_TYPE: return createPlacementType();
			case FinalPackage.PLACEMENT_TYPE1: return createPlacementType1();
			case FinalPackage.PNT_TYPE: return createPntType();
			case FinalPackage.POINT_OF_REFERENCE_HATCH_LINE_TYPE: return createPointOfReferenceHatchLineType();
			case FinalPackage.POINT_ON_RELATED_ELEMENT_TYPE: return createPointOnRelatedElementType();
			case FinalPackage.POINT_ON_RELATING_ELEMENT_TYPE: return createPointOnRelatingElementType();
			case FinalPackage.POINTS_TYPE: return createPointsType();
			case FinalPackage.POLYGONAL_BOUNDARY_TYPE: return createPolygonalBoundaryType();
			case FinalPackage.POLYGON_TYPE: return createPolygonType();
			case FinalPackage.POSITION_TYPE: return createPositionType();
			case FinalPackage.POSITION_TYPE1: return createPositionType1();
			case FinalPackage.POSITION_TYPE2: return createPositionType2();
			case FinalPackage.POSITION_TYPE3: return createPositionType3();
			case FinalPackage.POSITION_TYPE4: return createPositionType4();
			case FinalPackage.POSITION_TYPE5: return createPositionType5();
			case FinalPackage.POSITION_TYPE6: return createPositionType6();
			case FinalPackage.POSITION_TYPE7: return createPositionType7();
			case FinalPackage.POSITION_TYPE8: return createPositionType8();
			case FinalPackage.PREFIX_TITLES_TYPE: return createPrefixTitlesType();
			case FinalPackage.PREPARED_BY_TYPE: return createPreparedByType();
			case FinalPackage.PRESSURE_TIME_SERIES_TYPE: return createPressureTimeSeriesType();
			case FinalPackage.PROFILE_DEFINITION_TYPE: return createProfileDefinitionType();
			case FinalPackage.PROFILE_OF_PORT_TYPE: return createProfileOfPortType();
			case FinalPackage.PROFILE_ORIENTATION_TYPE: return createProfileOrientationType();
			case FinalPackage.PROFILE_SECTION_LOCATION_TYPE: return createProfileSectionLocationType();
			case FinalPackage.PROFILES_TYPE: return createProfilesType();
			case FinalPackage.PROPERTY_REFERENCE_TYPE: return createPropertyReferenceType();
			case FinalPackage.PUBLISHER_TYPE: return createPublisherType();
			case FinalPackage.PUNCH_LIST_TYPE: return createPunchListType();
			case FinalPackage.QUANTITIES_TYPE: return createQuantitiesType();
			case FinalPackage.QUANTITY_IN_PROCESS_TYPE: return createQuantityInProcessType();
			case FinalPackage.RATE_DATE_TIME_TYPE: return createRateDateTimeType();
			case FinalPackage.RATE_SOURCE_TYPE: return createRateSourceType();
			case FinalPackage.REALIZING_ELEMENTS_TYPE: return createRealizingElementsType();
			case FinalPackage.REALIZING_ELEMENT_TYPE: return createRealizingElementType();
			case FinalPackage.RECORDS_TYPE: return createRecordsType();
			case FinalPackage.REF_DIRECTION_TYPE: return createRefDirectionType();
			case FinalPackage.REF_DIRECTION_TYPE1: return createRefDirectionType1();
			case FinalPackage.REF_DIRECTION_TYPE2: return createRefDirectionType2();
			case FinalPackage.REFERENCED_DOCUMENT_TYPE: return createReferencedDocumentType();
			case FinalPackage.REFERENCED_SOURCE_TYPE: return createReferencedSourceType();
			case FinalPackage.REFERENCED_TIME_SERIES_TYPE: return createReferencedTimeSeriesType();
			case FinalPackage.REFERENCE_SURFACE_TYPE: return createReferenceSurfaceType();
			case FinalPackage.REFERENCING_VALUES_TYPE: return createReferencingValuesType();
			case FinalPackage.REFLECTANCE_COLOUR_TYPE: return createReflectanceColourType();
			case FinalPackage.REFLECTION_COLOUR_TYPE: return createReflectionColourType();
			case FinalPackage.REINFORCEMENT_SECTION_DEFINITIONS_TYPE: return createReinforcementSectionDefinitionsType();
			case FinalPackage.RELATED_APPROVAL_TYPE: return createRelatedApprovalType();
			case FinalPackage.RELATED_BUILDING_ELEMENT_TYPE: return createRelatedBuildingElementType();
			case FinalPackage.RELATED_BUILDING_ELEMENT_TYPE1: return createRelatedBuildingElementType1();
			case FinalPackage.RELATED_BUILDINGS_TYPE: return createRelatedBuildingsType();
			case FinalPackage.RELATED_CLASSIFICATIONS_TYPE: return createRelatedClassificationsType();
			case FinalPackage.RELATED_CONSTRAINTS_TYPE: return createRelatedConstraintsType();
			case FinalPackage.RELATED_CONSTRAINTS_TYPE1: return createRelatedConstraintsType1();
			case FinalPackage.RELATED_CONTROL_ELEMENTS_TYPE: return createRelatedControlElementsType();
			case FinalPackage.RELATED_COVERINGS_TYPE: return createRelatedCoveringsType();
			case FinalPackage.RELATED_COVERINGS_TYPE1: return createRelatedCoveringsType1();
			case FinalPackage.RELATED_DOCUMENTS_TYPE: return createRelatedDocumentsType();
			case FinalPackage.RELATED_DRAUGHTING_CALLOUT_TYPE: return createRelatedDraughtingCalloutType();
			case FinalPackage.RELATED_ELEMENTS_TYPE: return createRelatedElementsType();
			case FinalPackage.RELATED_ELEMENTS_TYPE1: return createRelatedElementsType1();
			case FinalPackage.RELATED_ELEMENT_TYPE: return createRelatedElementType();
			case FinalPackage.RELATED_ELEMENT_TYPE1: return createRelatedElementType1();
			case FinalPackage.RELATED_FEATURE_ELEMENT_TYPE: return createRelatedFeatureElementType();
			case FinalPackage.RELATED_ITEMS_TYPE: return createRelatedItemsType();
			case FinalPackage.RELATED_MONETARY_UNIT_TYPE: return createRelatedMonetaryUnitType();
			case FinalPackage.RELATED_OBJECTS_TYPE: return createRelatedObjectsType();
			case FinalPackage.RELATED_OBJECTS_TYPE1: return createRelatedObjectsType1();
			case FinalPackage.RELATED_OBJECTS_TYPE2: return createRelatedObjectsType2();
			case FinalPackage.RELATED_OBJECTS_TYPE3: return createRelatedObjectsType3();
			case FinalPackage.RELATED_OPENING_ELEMENT_TYPE: return createRelatedOpeningElementType();
			case FinalPackage.RELATED_ORGANIZATIONS_TYPE: return createRelatedOrganizationsType();
			case FinalPackage.RELATED_PORT_TYPE: return createRelatedPortType();
			case FinalPackage.RELATED_PRIORITIES_TYPE: return createRelatedPrioritiesType();
			case FinalPackage.RELATED_PROCESS_TYPE: return createRelatedProcessType();
			case FinalPackage.RELATED_PROPERTIES_TYPE: return createRelatedPropertiesType();
			case FinalPackage.RELATED_SPACE_PROGRAM_TYPE: return createRelatedSpaceProgramType();
			case FinalPackage.RELATED_SPACE_TYPE: return createRelatedSpaceType();
			case FinalPackage.RELATED_STRUCTURAL_ACTIVITY_TYPE: return createRelatedStructuralActivityType();
			case FinalPackage.RELATED_STRUCTURAL_CONNECTION_TYPE: return createRelatedStructuralConnectionType();
			case FinalPackage.RELATED_STRUCTURAL_MEMBER_TYPE: return createRelatedStructuralMemberType();
			case FinalPackage.RELATING_ACTOR_TYPE: return createRelatingActorType();
			case FinalPackage.RELATING_APPLIED_VALUE_TYPE: return createRelatingAppliedValueType();
			case FinalPackage.RELATING_APPROVAL_TYPE: return createRelatingApprovalType();
			case FinalPackage.RELATING_APPROVAL_TYPE1: return createRelatingApprovalType1();
			case FinalPackage.RELATING_BUILDING_ELEMENT_TYPE: return createRelatingBuildingElementType();
			case FinalPackage.RELATING_BUILDING_ELEMENT_TYPE1: return createRelatingBuildingElementType1();
			case FinalPackage.RELATING_CLASSIFICATION_TYPE: return createRelatingClassificationType();
			case FinalPackage.RELATING_CONSTRAINT_TYPE: return createRelatingConstraintType();
			case FinalPackage.RELATING_CONSTRAINT_TYPE1: return createRelatingConstraintType1();
			case FinalPackage.RELATING_CONSTRAINT_TYPE2: return createRelatingConstraintType2();
			case FinalPackage.RELATING_CONSTRAINT_TYPE3: return createRelatingConstraintType3();
			case FinalPackage.RELATING_CONTROL_TYPE: return createRelatingControlType();
			case FinalPackage.RELATING_DOCUMENT_TYPE: return createRelatingDocumentType();
			case FinalPackage.RELATING_DOCUMENT_TYPE1: return createRelatingDocumentType1();
			case FinalPackage.RELATING_DRAUGHTING_CALLOUT_TYPE: return createRelatingDraughtingCalloutType();
			case FinalPackage.RELATING_ELEMENT_TYPE: return createRelatingElementType();
			case FinalPackage.RELATING_ELEMENT_TYPE1: return createRelatingElementType1();
			case FinalPackage.RELATING_ELEMENT_TYPE2: return createRelatingElementType2();
			case FinalPackage.RELATING_ELEMENT_TYPE3: return createRelatingElementType3();
			case FinalPackage.RELATING_FLOW_ELEMENT_TYPE: return createRelatingFlowElementType();
			case FinalPackage.RELATING_GROUP_TYPE: return createRelatingGroupType();
			case FinalPackage.RELATING_ITEM_TYPE: return createRelatingItemType();
			case FinalPackage.RELATING_LIBRARY_TYPE: return createRelatingLibraryType();
			case FinalPackage.RELATING_MATERIAL_TYPE: return createRelatingMaterialType();
			case FinalPackage.RELATING_MONETARY_UNIT_TYPE: return createRelatingMonetaryUnitType();
			case FinalPackage.RELATING_OBJECT_TYPE: return createRelatingObjectType();
			case FinalPackage.RELATING_OPENING_ELEMENT_TYPE: return createRelatingOpeningElementType();
			case FinalPackage.RELATING_ORGANIZATION_TYPE: return createRelatingOrganizationType();
			case FinalPackage.RELATING_PORT_TYPE: return createRelatingPortType();
			case FinalPackage.RELATING_PORT_TYPE1: return createRelatingPortType1();
			case FinalPackage.RELATING_PRIORITIES_TYPE: return createRelatingPrioritiesType();
			case FinalPackage.RELATING_PROCESS_TYPE: return createRelatingProcessType();
			case FinalPackage.RELATING_PROCESS_TYPE1: return createRelatingProcessType1();
			case FinalPackage.RELATING_PRODUCT_TYPE: return createRelatingProductType();
			case FinalPackage.RELATING_PROFILE_PROPERTIES_TYPE: return createRelatingProfilePropertiesType();
			case FinalPackage.RELATING_PROPERTY_DEFINITION_TYPE: return createRelatingPropertyDefinitionType();
			case FinalPackage.RELATING_RESOURCE_TYPE: return createRelatingResourceType();
			case FinalPackage.RELATING_SPACE_PROGRAM_TYPE: return createRelatingSpaceProgramType();
			case FinalPackage.RELATING_SPACE_TYPE: return createRelatingSpaceType();
			case FinalPackage.RELATING_STRUCTURAL_MEMBER_TYPE: return createRelatingStructuralMemberType();
			case FinalPackage.RELATING_STRUCTURE_TYPE: return createRelatingStructureType();
			case FinalPackage.RELATING_STRUCTURE_TYPE1: return createRelatingStructureType1();
			case FinalPackage.RELATING_SYSTEM_TYPE: return createRelatingSystemType();
			case FinalPackage.RELATING_TYPE_TYPE: return createRelatingTypeType();
			case FinalPackage.RELATIVE_PLACEMENT_TYPE: return createRelativePlacementType();
			case FinalPackage.RELAXATIONS_TYPE: return createRelaxationsType();
			case FinalPackage.REPEAT_FACTOR_TYPE: return createRepeatFactorType();
			case FinalPackage.REPRESENTATION_CONTEXTS_TYPE: return createRepresentationContextsType();
			case FinalPackage.REPRESENTATION_MAPS_TYPE: return createRepresentationMapsType();
			case FinalPackage.REPRESENTATIONS_TYPE: return createRepresentationsType();
			case FinalPackage.REPRESENTATION_TYPE: return createRepresentationType();
			case FinalPackage.REPRESENTED_MATERIAL_TYPE: return createRepresentedMaterialType();
			case FinalPackage.REQUESTED_LOCATION_TYPE: return createRequestedLocationType();
			case FinalPackage.RESPONSIBLE_PERSONS_TYPE: return createResponsiblePersonsType();
			case FinalPackage.RESPONSIBLE_PERSON_TYPE: return createResponsiblePersonType();
			case FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE: return createResultForLoadGroupType();
			case FinalPackage.RESULT_VALUES_TYPE: return createResultValuesType();
			case FinalPackage.ROLES_TYPE: return createRolesType();
			case FinalPackage.ROLES_TYPE1: return createRolesType1();
			case FinalPackage.ROLES_TYPE2: return createRolesType2();
			case FinalPackage.ROLE_TYPE: return createRoleType();
			case FinalPackage.ROW_CELLS_TYPE: return createRowCellsType();
			case FinalPackage.ROWS_TYPE: return createRowsType();
			case FinalPackage.SBSM_BOUNDARY_TYPE: return createSbsmBoundaryType();
			case FinalPackage.SCHEDULE_FINISH_TYPE: return createScheduleFinishType();
			case FinalPackage.SCHEDULE_START_TYPE: return createScheduleStartType();
			case FinalPackage.SECONDARY_PLANE_ANGLE_TYPE: return createSecondaryPlaneAngleType();
			case FinalPackage.SECOND_OPERAND_TYPE: return createSecondOperandType();
			case FinalPackage.SECOND_REPEAT_FACTOR_TYPE: return createSecondRepeatFactorType();
			case FinalPackage.SECTION_DEFINITION_TYPE: return createSectionDefinitionType();
			case FinalPackage.SEGMENTS_TYPE: return createSegmentsType();
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE: return createShapeAspectStyleType();
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE1: return createShapeAspectStyleType1();
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE2: return createShapeAspectStyleType2();
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE3: return createShapeAspectStyleType3();
			case FinalPackage.SHAPE_ASPECT_STYLE_TYPE4: return createShapeAspectStyleType4();
			case FinalPackage.SHAPE_REPRESENTATIONS_TYPE: return createShapeRepresentationsType();
			case FinalPackage.SITE_ADDRESS_TYPE: return createSiteAddressType();
			case FinalPackage.SOUND_LEVEL_SINGLE_VALUE_TYPE: return createSoundLevelSingleValueType();
			case FinalPackage.SOUND_LEVEL_TIME_SERIES_TYPE: return createSoundLevelTimeSeriesType();
			case FinalPackage.SOUND_VALUES_TYPE: return createSoundValuesType();
			case FinalPackage.SPECULAR_COLOUR_TYPE: return createSpecularColourType();
			case FinalPackage.SPECULAR_HIGHLIGHT_TYPE: return createSpecularHighlightType();
			case FinalPackage.SPINE_CURVE_TYPE: return createSpineCurveType();
			case FinalPackage.START_OF_NEXT_HATCH_LINE_TYPE: return createStartOfNextHatchLineType();
			case FinalPackage.START_PROFILE_TYPE: return createStartProfileType();
			case FinalPackage.START_TIME_TYPE: return createStartTimeType();
			case FinalPackage.START_TIME_TYPE1: return createStartTimeType1();
			case FinalPackage.STATUS_TIME_TYPE: return createStatusTimeType();
			case FinalPackage.STYLE_OF_SYMBOL_TYPE: return createStyleOfSymbolType();
			case FinalPackage.STYLES_TYPE: return createStylesType();
			case FinalPackage.STYLES_TYPE1: return createStylesType1();
			case FinalPackage.STYLES_TYPE2: return createStylesType2();
			case FinalPackage.SUB_CONTRACTOR_TYPE: return createSubContractorType();
			case FinalPackage.SUBMITTED_BY_TYPE: return createSubmittedByType();
			case FinalPackage.SUBMITTED_ON_TYPE: return createSubmittedOnType();
			case FinalPackage.SUBSEQUENT_APPLIED_LOADS_TYPE: return createSubsequentAppliedLoadsType();
			case FinalPackage.SUBSEQUENT_APPLIED_LOADS_TYPE1: return createSubsequentAppliedLoadsType1();
			case FinalPackage.SUBSEQUENT_THICKNESS_TYPE: return createSubsequentThicknessType();
			case FinalPackage.SUFFIX_TITLES_TYPE: return createSuffixTitlesType();
			case FinalPackage.SUPPLIERS_TYPE: return createSuppliersType();
			case FinalPackage.SURFACE_COLOUR_TYPE: return createSurfaceColourType();
			case FinalPackage.SURFACE_ON_RELATED_ELEMENT_TYPE: return createSurfaceOnRelatedElementType();
			case FinalPackage.SURFACE_ON_RELATING_ELEMENT_TYPE: return createSurfaceOnRelatingElementType();
			case FinalPackage.SWEPT_AREA_TYPE: return createSweptAreaType();
			case FinalPackage.SWEPT_CURVE_TYPE: return createSweptCurveType();
			case FinalPackage.SYMBOL_TYPE: return createSymbolType();
			case FinalPackage.TARGET_TYPE: return createTargetType();
			case FinalPackage.TARGET_USERS_TYPE: return createTargetUsersType();
			case FinalPackage.TELEPHONE_NUMBERS_TYPE: return createTelephoneNumbersType();
			case FinalPackage.TEMPERATURE_TIME_SERIES_TYPE: return createTemperatureTimeSeriesType();
			case FinalPackage.TEXT_CHARACTER_APPEARANCE_TYPE: return createTextCharacterAppearanceType();
			case FinalPackage.TEXT_FONT_STYLE_TYPE: return createTextFontStyleType();
			case FinalPackage.TEXT_INDENT_TYPE: return createTextIndentType();
			case FinalPackage.TEXT_STYLE_TYPE: return createTextStyleType();
			case FinalPackage.TEXTURE_COORDINATES_TYPE: return createTextureCoordinatesType();
			case FinalPackage.TEXTURE_MAPS_TYPE: return createTextureMapsType();
			case FinalPackage.TEXTURE_POINTS_TYPE: return createTexturePointsType();
			case FinalPackage.TEXTURES_TYPE: return createTexturesType();
			case FinalPackage.TEXTURE_TRANSFORM_TYPE: return createTextureTransformType();
			case FinalPackage.TEXTURE_VERTICES_TYPE: return createTextureVerticesType();
			case FinalPackage.THE_ACTOR_TYPE: return createTheActorType();
			case FinalPackage.THE_ORGANIZATION_TYPE: return createTheOrganizationType();
			case FinalPackage.THE_PERSON_TYPE: return createThePersonType();
			case FinalPackage.THERMAL_LOAD_TIME_SERIES_VALUES_TYPE: return createThermalLoadTimeSeriesValuesType();
			case FinalPackage.TILES_TYPE: return createTilesType();
			case FinalPackage.TILING_PATTERN_TYPE: return createTilingPatternType();
			case FinalPackage.TIME_COMPONENT_TYPE: return createTimeComponentType();
			case FinalPackage.TIME_FOR_TASK_TYPE: return createTimeForTaskType();
			case FinalPackage.TIME_SERIES_REFERENCES_TYPE: return createTimeSeriesReferencesType();
			case FinalPackage.TIME_SERIES_TYPE: return createTimeSeriesType();
			case FinalPackage.TIME_STAMP_TYPE: return createTimeStampType();
			case FinalPackage.TOTAL_REPLACEMENT_COST_TYPE: return createTotalReplacementCostType();
			case FinalPackage.TRANSMISSION_COLOUR_TYPE: return createTransmissionColourType();
			case FinalPackage.TRANSMISSION_COLOUR_TYPE1: return createTransmissionColourType1();
			case FinalPackage.TREE_ROOT_EXPRESSION_TYPE: return createTreeRootExpressionType();
			case FinalPackage.TRIM1_TYPE: return createTrim1Type();
			case FinalPackage.TRIM2_TYPE: return createTrim2Type();
			case FinalPackage.TRUE_NORTH_TYPE: return createTrueNorthType();
			case FinalPackage.UAXES_TYPE: return createUAxesType();
			case FinalPackage.UNIT_BASIS_TYPE: return createUnitBasisType();
			case FinalPackage.UNIT_COMPONENT_TYPE: return createUnitComponentType();
			case FinalPackage.UNITS_IN_CONTEXT_TYPE: return createUnitsInContextType();
			case FinalPackage.UNITS_TYPE: return createUnitsType();
			case FinalPackage.UNIT_TYPE: return createUnitType();
			case FinalPackage.UNIT_TYPE1: return createUnitType1();
			case FinalPackage.UNIT_TYPE2: return createUnitType2();
			case FinalPackage.UNIT_TYPE3: return createUnitType3();
			case FinalPackage.UNIT_TYPE4: return createUnitType4();
			case FinalPackage.UNIT_TYPE5: return createUnitType5();
			case FinalPackage.UNIT_TYPE6: return createUnitType6();
			case FinalPackage.UOS: return createUos();
			case FinalPackage.UPDATE_DATE_TYPE: return createUpdateDateType();
			case FinalPackage.UPPER_BOUND_VALUE_TYPE: return createUpperBoundValueType();
			case FinalPackage.UPPER_VALUE_TYPE: return createUpperValueType();
			case FinalPackage.USER_TYPE: return createUserType();
			case FinalPackage.VALID_FROM_TYPE: return createValidFromType();
			case FinalPackage.VALID_UNTIL_TYPE: return createValidUntilType();
			case FinalPackage.VALUE_COMPONENT_TYPE: return createValueComponentType();
			case FinalPackage.VALUES_TYPE: return createValuesType();
			case FinalPackage.VALUES_TYPE1: return createValuesType1();
			case FinalPackage.VARYING_APPLIED_LOAD_LOCATION_TYPE: return createVaryingAppliedLoadLocationType();
			case FinalPackage.VARYING_APPLIED_LOAD_LOCATION_TYPE1: return createVaryingAppliedLoadLocationType1();
			case FinalPackage.VARYING_THICKNESS_LOCATION_TYPE: return createVaryingThicknessLocationType();
			case FinalPackage.VAXES_TYPE: return createVAxesType();
			case FinalPackage.VELOCITY_TIME_SERIES_TYPE: return createVelocityTimeSeriesType();
			case FinalPackage.VERSION_DATE_TYPE: return createVersionDateType();
			case FinalPackage.VERTEX_GEOMETRY_TYPE: return createVertexGeometryType();
			case FinalPackage.VOIDS_TYPE: return createVoidsType();
			case FinalPackage.WAXES_TYPE: return createWAxesType();
			case FinalPackage.WEIGHTS_DATA_TYPE: return createWeightsDataType();
			case FinalPackage.WET_BULB_TEMPERATURE_TIME_SERIES_TYPE: return createWetBulbTemperatureTimeSeriesType();
			case FinalPackage.WORD_SPACING_TYPE: return createWordSpacingType();
			case FinalPackage.WORLD_COORDINATE_SYSTEM_TYPE: return createWorldCoordinateSystemType();
			case FinalPackage.ZONE_TYPE: return createZoneType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FinalPackage.IFC_ACTION_SOURCE_TYPE_ENUM:
				return createIfcActionSourceTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ACTION_TYPE_ENUM:
				return createIfcActionTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ACTUATOR_TYPE_ENUM:
				return createIfcActuatorTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ADDRESS_TYPE_ENUM:
				return createIfcAddressTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_AHEAD_OR_BEHIND:
				return createIfcAheadOrBehindFromString(eDataType, initialValue);
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE_ENUM:
				return createIfcAirTerminalBoxTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_AIR_TERMINAL_TYPE_ENUM:
				return createIfcAirTerminalTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE_ENUM:
				return createIfcAirToAirHeatRecoveryTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ALARM_TYPE_ENUM:
				return createIfcAlarmTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ANALYSIS_MODEL_TYPE_ENUM:
				return createIfcAnalysisModelTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ANALYSIS_THEORY_TYPE_ENUM:
				return createIfcAnalysisTheoryTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ARITHMETIC_OPERATOR_ENUM:
				return createIfcArithmeticOperatorEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ASSEMBLY_PLACE_ENUM:
				return createIfcAssemblyPlaceEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_BEAM_TYPE_ENUM:
				return createIfcBeamTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_BENCHMARK_ENUM:
				return createIfcBenchmarkEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_BOILER_TYPE_ENUM:
				return createIfcBoilerTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_BOOLEAN_OPERATOR:
				return createIfcBooleanOperatorFromString(eDataType, initialValue);
			case FinalPackage.IFC_BSPLINE_CURVE_FORM:
				return createIfcBSplineCurveFormFromString(eDataType, initialValue);
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE_ENUM:
				return createIfcBuildingElementProxyTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE_ENUM:
				return createIfcCableCarrierFittingTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE_ENUM:
				return createIfcCableCarrierSegmentTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE_ENUM:
				return createIfcCableSegmentTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CHANGE_ACTION_ENUM:
				return createIfcChangeActionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CHILLER_TYPE_ENUM:
				return createIfcChillerTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_COIL_TYPE_ENUM:
				return createIfcCoilTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_COLUMN_TYPE_ENUM:
				return createIfcColumnTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_COMPRESSOR_TYPE_ENUM:
				return createIfcCompressorTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONDENSER_TYPE_ENUM:
				return createIfcCondenserTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONNECTION_TYPE_ENUM:
				return createIfcConnectionTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONSTRAINT_ENUM:
				return createIfcConstraintEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONTROLLER_TYPE_ENUM:
				return createIfcControllerTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_COOLED_BEAM_TYPE_ENUM:
				return createIfcCooledBeamTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_COOLING_TOWER_TYPE_ENUM:
				return createIfcCoolingTowerTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_COST_SCHEDULE_TYPE_ENUM:
				return createIfcCostScheduleTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_COVERING_TYPE_ENUM:
				return createIfcCoveringTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CURRENCY_ENUM:
				return createIfcCurrencyEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_CURTAIN_WALL_TYPE_ENUM:
				return createIfcCurtainWallTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DAMPER_TYPE_ENUM:
				return createIfcDamperTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DATA_ORIGIN_ENUM:
				return createIfcDataOriginEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DERIVED_UNIT_ENUM:
				return createIfcDerivedUnitEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DIMENSION_EXTENT_USAGE:
				return createIfcDimensionExtentUsageFromString(eDataType, initialValue);
			case FinalPackage.IFC_DIRECTION_SENSE_ENUM:
				return createIfcDirectionSenseEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE_ENUM:
				return createIfcDistributionChamberElementTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOCUMENT_CONFIDENTIALITY_ENUM:
				return createIfcDocumentConfidentialityEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOCUMENT_STATUS_ENUM:
				return createIfcDocumentStatusEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOOR_PANEL_OPERATION_ENUM:
				return createIfcDoorPanelOperationEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOOR_PANEL_POSITION_ENUM:
				return createIfcDoorPanelPositionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOOR_STYLE_CONSTRUCTION_ENUM:
				return createIfcDoorStyleConstructionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOOR_STYLE_OPERATION_ENUM:
				return createIfcDoorStyleOperationEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DUCT_FITTING_TYPE_ENUM:
				return createIfcDuctFittingTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE_ENUM:
				return createIfcDuctSegmentTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_DUCT_SILENCER_TYPE_ENUM:
				return createIfcDuctSilencerTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE_ENUM:
				return createIfcElectricApplianceTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CURRENT_ENUM:
				return createIfcElectricCurrentEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT_FUNCTION_ENUM:
				return createIfcElectricDistributionPointFunctionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE_ENUM:
				return createIfcElectricFlowStorageDeviceTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE_ENUM:
				return createIfcElectricGeneratorTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE_ENUM:
				return createIfcElectricHeaterTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE_ENUM:
				return createIfcElectricMotorTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE_ENUM:
				return createIfcElectricTimeControlTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELEMENT_ASSEMBLY_TYPE_ENUM:
				return createIfcElementAssemblyTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELEMENT_COMPOSITION_ENUM:
				return createIfcElementCompositionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ENERGY_SEQUENCE_ENUM:
				return createIfcEnergySequenceEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_CATEGORY_ENUM:
				return createIfcEnvironmentalImpactCategoryEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE_ENUM:
				return createIfcEvaporativeCoolerTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_EVAPORATOR_TYPE_ENUM:
				return createIfcEvaporatorTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_FAN_TYPE_ENUM:
				return createIfcFanTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_FILTER_TYPE_ENUM:
				return createIfcFilterTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE_ENUM:
				return createIfcFireSuppressionTerminalTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_FLOW_DIRECTION_ENUM:
				return createIfcFlowDirectionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE_ENUM:
				return createIfcFlowInstrumentTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_FLOW_METER_TYPE_ENUM:
				return createIfcFlowMeterTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_FOOTING_TYPE_ENUM:
				return createIfcFootingTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_GAS_TERMINAL_TYPE_ENUM:
				return createIfcGasTerminalTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_GEOMETRIC_PROJECTION_ENUM:
				return createIfcGeometricProjectionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_GLOBAL_OR_LOCAL_ENUM:
				return createIfcGlobalOrLocalEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE_ENUM:
				return createIfcHeatExchangerTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_HUMIDIFIER_TYPE_ENUM:
				return createIfcHumidifierTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_INTERNAL_OR_EXTERNAL_ENUM:
				return createIfcInternalOrExternalEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_INVENTORY_TYPE_ENUM:
				return createIfcInventoryTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_JUNCTION_BOX_TYPE_ENUM:
				return createIfcJunctionBoxTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_LAMP_TYPE_ENUM:
				return createIfcLampTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_LAYER_SET_DIRECTION_ENUM:
				return createIfcLayerSetDirectionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_CURVE_ENUM:
				return createIfcLightDistributionCurveEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_LIGHT_EMISSION_SOURCE_ENUM:
				return createIfcLightEmissionSourceEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE_ENUM:
				return createIfcLightFixtureTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_LOAD_GROUP_TYPE_ENUM:
				return createIfcLoadGroupTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_LOGICAL_OPERATOR_ENUM:
				return createIfcLogicalOperatorEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_MEMBER_TYPE_ENUM:
				return createIfcMemberTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE_ENUM:
				return createIfcMotorConnectionTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_NULL_STYLE:
				return createIfcNullStyleFromString(eDataType, initialValue);
			case FinalPackage.IFC_OBJECTIVE_ENUM:
				return createIfcObjectiveEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_OBJECT_TYPE_ENUM:
				return createIfcObjectTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_OCCUPANT_TYPE_ENUM:
				return createIfcOccupantTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_OUTLET_TYPE_ENUM:
				return createIfcOutletTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PERMEABLE_COVERING_OPERATION_ENUM:
				return createIfcPermeableCoveringOperationEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PHYSICAL_OR_VIRTUAL_ENUM:
				return createIfcPhysicalOrVirtualEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PILE_CONSTRUCTION_ENUM:
				return createIfcPileConstructionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PILE_TYPE_ENUM:
				return createIfcPileTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PIPE_FITTING_TYPE_ENUM:
				return createIfcPipeFittingTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE_ENUM:
				return createIfcPipeSegmentTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PLATE_TYPE_ENUM:
				return createIfcPlateTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROCEDURE_TYPE_ENUM:
				return createIfcProcedureTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROFILE_TYPE_ENUM:
				return createIfcProfileTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROJECTED_OR_TRUE_LENGTH_ENUM:
				return createIfcProjectedOrTrueLengthEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROJECT_ORDER_RECORD_TYPE_ENUM:
				return createIfcProjectOrderRecordTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROJECT_ORDER_TYPE_ENUM:
				return createIfcProjectOrderTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROPERTY_SOURCE_ENUM:
				return createIfcPropertySourceEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE_ENUM:
				return createIfcProtectiveDeviceTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_PUMP_TYPE_ENUM:
				return createIfcPumpTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_RAILING_TYPE_ENUM:
				return createIfcRailingTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE_ENUM:
				return createIfcRampFlightTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_RAMP_TYPE_ENUM:
				return createIfcRampTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_REFLECTANCE_METHOD_ENUM:
				return createIfcReflectanceMethodEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_REINFORCING_BAR_ROLE_ENUM:
				return createIfcReinforcingBarRoleEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_REINFORCING_BAR_SURFACE_ENUM:
				return createIfcReinforcingBarSurfaceEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_RESOURCE_CONSUMPTION_ENUM:
				return createIfcResourceConsumptionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_RIB_PLATE_DIRECTION_ENUM:
				return createIfcRibPlateDirectionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROLE_ENUM:
				return createIfcRoleEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROOF_TYPE_ENUM:
				return createIfcRoofTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE_ENUM:
				return createIfcSanitaryTerminalTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SECTION_TYPE_ENUM:
				return createIfcSectionTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SENSOR_TYPE_ENUM:
				return createIfcSensorTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SEQUENCE_ENUM:
				return createIfcSequenceEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR_TYPE_ENUM:
				return createIfcServiceLifeFactorTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SERVICE_LIFE_TYPE_ENUM:
				return createIfcServiceLifeTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SI_PREFIX:
				return createIfcSIPrefixFromString(eDataType, initialValue);
			case FinalPackage.IFC_SI_UNIT_NAME:
				return createIfcSIUnitNameFromString(eDataType, initialValue);
			case FinalPackage.IFC_SLAB_TYPE_ENUM:
				return createIfcSlabTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SOUND_SCALE_ENUM:
				return createIfcSoundScaleEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPACE_HEATER_TYPE_ENUM:
				return createIfcSpaceHeaterTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPACE_TYPE_ENUM:
				return createIfcSpaceTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_STACK_TERMINAL_TYPE_ENUM:
				return createIfcStackTerminalTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE_ENUM:
				return createIfcStairFlightTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_STAIR_TYPE_ENUM:
				return createIfcStairTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_STATE_ENUM:
				return createIfcStateEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_STRUCTURAL_CURVE_TYPE_ENUM:
				return createIfcStructuralCurveTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_TYPE_ENUM:
				return createIfcStructuralSurfaceTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SURFACE_SIDE:
				return createIfcSurfaceSideFromString(eDataType, initialValue);
			case FinalPackage.IFC_SURFACE_TEXTURE_ENUM:
				return createIfcSurfaceTextureEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE_ENUM:
				return createIfcSwitchingDeviceTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_TANK_TYPE_ENUM:
				return createIfcTankTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_TENDON_TYPE_ENUM:
				return createIfcTendonTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_TEXT_PATH:
				return createIfcTextPathFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_LOAD_SOURCE_ENUM:
				return createIfcThermalLoadSourceEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_LOAD_TYPE_ENUM:
				return createIfcThermalLoadTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_TIME_SERIES_DATA_TYPE_ENUM:
				return createIfcTimeSeriesDataTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE_TYPE_ENUM:
				return createIfcTimeSeriesScheduleTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_TRANSFORMER_TYPE_ENUM:
				return createIfcTransformerTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_TRANSITION_CODE:
				return createIfcTransitionCodeFromString(eDataType, initialValue);
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE_ENUM:
				return createIfcTransportElementTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_TRIMMING_PREFERENCE:
				return createIfcTrimmingPreferenceFromString(eDataType, initialValue);
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE_ENUM:
				return createIfcTubeBundleTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE_ENUM:
				return createIfcUnitaryEquipmentTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_UNIT_ENUM:
				return createIfcUnitEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_VALVE_TYPE_ENUM:
				return createIfcValveTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE_ENUM:
				return createIfcVibrationIsolatorTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_WALL_TYPE_ENUM:
				return createIfcWallTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE_ENUM:
				return createIfcWasteTerminalTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_WINDOW_PANEL_OPERATION_ENUM:
				return createIfcWindowPanelOperationEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_WINDOW_PANEL_POSITION_ENUM:
				return createIfcWindowPanelPositionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_WINDOW_STYLE_CONSTRUCTION_ENUM:
				return createIfcWindowStyleConstructionEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_WINDOW_STYLE_OPERATION_ENUM:
				return createIfcWindowStyleOperationEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_WORK_CONTROL_TYPE_ENUM:
				return createIfcWorkControlTypeEnumFromString(eDataType, initialValue);
			case FinalPackage.IFC_ABSORBED_DOSE_MEASURE:
				return createIfcAbsorbedDoseMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ABSORBED_DOSE_MEASURE_OBJECT:
				return createIfcAbsorbedDoseMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ACCELERATION_MEASURE:
				return createIfcAccelerationMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ACCELERATION_MEASURE_OBJECT:
				return createIfcAccelerationMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ACTION_SOURCE_TYPE_ENUM_OBJECT:
				return createIfcActionSourceTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ACTION_TYPE_ENUM_OBJECT:
				return createIfcActionTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ACTUATOR_TYPE_ENUM_OBJECT:
				return createIfcActuatorTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ADDRESS_TYPE_ENUM_OBJECT:
				return createIfcAddressTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_AHEAD_OR_BEHIND_OBJECT:
				return createIfcAheadOrBehindObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE_ENUM_OBJECT:
				return createIfcAirTerminalBoxTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_AIR_TERMINAL_TYPE_ENUM_OBJECT:
				return createIfcAirTerminalTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE_ENUM_OBJECT:
				return createIfcAirToAirHeatRecoveryTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ALARM_TYPE_ENUM_OBJECT:
				return createIfcAlarmTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				return createIfcAmountOfSubstanceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_AMOUNT_OF_SUBSTANCE_MEASURE_OBJECT:
				return createIfcAmountOfSubstanceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ANALYSIS_MODEL_TYPE_ENUM_OBJECT:
				return createIfcAnalysisModelTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ANALYSIS_THEORY_TYPE_ENUM_OBJECT:
				return createIfcAnalysisTheoryTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ANGULAR_VELOCITY_MEASURE:
				return createIfcAngularVelocityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ANGULAR_VELOCITY_MEASURE_OBJECT:
				return createIfcAngularVelocityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_AREA_MEASURE:
				return createIfcAreaMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_AREA_MEASURE_OBJECT:
				return createIfcAreaMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ARITHMETIC_OPERATOR_ENUM_OBJECT:
				return createIfcArithmeticOperatorEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ASSEMBLY_PLACE_ENUM_OBJECT:
				return createIfcAssemblyPlaceEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_BEAM_TYPE_ENUM_OBJECT:
				return createIfcBeamTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_BENCHMARK_ENUM_OBJECT:
				return createIfcBenchmarkEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_BOILER_TYPE_ENUM_OBJECT:
				return createIfcBoilerTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_BOOLEAN:
				return createIfcBooleanFromString(eDataType, initialValue);
			case FinalPackage.IFC_BOOLEAN_OBJECT:
				return createIfcBooleanObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_BOOLEAN_OPERATOR_OBJECT:
				return createIfcBooleanOperatorObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_BOX_ALIGNMENT:
				return createIfcBoxAlignmentFromString(eDataType, initialValue);
			case FinalPackage.IFC_BSPLINE_CURVE_FORM_OBJECT:
				return createIfcBSplineCurveFormObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE_ENUM_OBJECT:
				return createIfcBuildingElementProxyTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE_ENUM_OBJECT:
				return createIfcCableCarrierFittingTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE_ENUM_OBJECT:
				return createIfcCableCarrierSegmentTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE_ENUM_OBJECT:
				return createIfcCableSegmentTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CHANGE_ACTION_ENUM_OBJECT:
				return createIfcChangeActionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CHILLER_TYPE_ENUM_OBJECT:
				return createIfcChillerTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_COIL_TYPE_ENUM_OBJECT:
				return createIfcCoilTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_COLUMN_TYPE_ENUM_OBJECT:
				return createIfcColumnTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_COMPRESSOR_TYPE_ENUM_OBJECT:
				return createIfcCompressorTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONDENSER_TYPE_ENUM_OBJECT:
				return createIfcCondenserTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONNECTION_TYPE_ENUM_OBJECT:
				return createIfcConnectionTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONSTRAINT_ENUM_OBJECT:
				return createIfcConstraintEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONTEXT_DEPENDENT_MEASURE:
				return createIfcContextDependentMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONTEXT_DEPENDENT_MEASURE_OBJECT:
				return createIfcContextDependentMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CONTROLLER_TYPE_ENUM_OBJECT:
				return createIfcControllerTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_COOLED_BEAM_TYPE_ENUM_OBJECT:
				return createIfcCooledBeamTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_COOLING_TOWER_TYPE_ENUM_OBJECT:
				return createIfcCoolingTowerTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_COST_SCHEDULE_TYPE_ENUM_OBJECT:
				return createIfcCostScheduleTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_COUNT_MEASURE:
				return createIfcCountMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_COUNT_MEASURE_OBJECT:
				return createIfcCountMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_COVERING_TYPE_ENUM_OBJECT:
				return createIfcCoveringTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CURRENCY_ENUM_OBJECT:
				return createIfcCurrencyEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CURTAIN_WALL_TYPE_ENUM_OBJECT:
				return createIfcCurtainWallTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_CURVATURE_MEASURE:
				return createIfcCurvatureMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_CURVATURE_MEASURE_OBJECT:
				return createIfcCurvatureMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DAMPER_TYPE_ENUM_OBJECT:
				return createIfcDamperTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DATA_ORIGIN_ENUM_OBJECT:
				return createIfcDataOriginEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DAY_IN_MONTH_NUMBER:
				return createIfcDayInMonthNumberFromString(eDataType, initialValue);
			case FinalPackage.IFC_DAY_IN_MONTH_NUMBER_OBJECT:
				return createIfcDayInMonthNumberObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DAYLIGHT_SAVING_HOUR:
				return createIfcDaylightSavingHourFromString(eDataType, initialValue);
			case FinalPackage.IFC_DAYLIGHT_SAVING_HOUR_OBJECT:
				return createIfcDaylightSavingHourObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DERIVED_UNIT_ENUM_OBJECT:
				return createIfcDerivedUnitEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DESCRIPTIVE_MEASURE:
				return createIfcDescriptiveMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_DIMENSION_COUNT:
				return createIfcDimensionCountFromString(eDataType, initialValue);
			case FinalPackage.IFC_DIMENSION_COUNT_OBJECT:
				return createIfcDimensionCountObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DIMENSION_EXTENT_USAGE_OBJECT:
				return createIfcDimensionExtentUsageObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DIRECTION_SENSE_ENUM_OBJECT:
				return createIfcDirectionSenseEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE_ENUM_OBJECT:
				return createIfcDistributionChamberElementTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOCUMENT_CONFIDENTIALITY_ENUM_OBJECT:
				return createIfcDocumentConfidentialityEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOCUMENT_STATUS_ENUM_OBJECT:
				return createIfcDocumentStatusEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOOR_PANEL_OPERATION_ENUM_OBJECT:
				return createIfcDoorPanelOperationEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOOR_PANEL_POSITION_ENUM_OBJECT:
				return createIfcDoorPanelPositionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOOR_STYLE_CONSTRUCTION_ENUM_OBJECT:
				return createIfcDoorStyleConstructionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOOR_STYLE_OPERATION_ENUM_OBJECT:
				return createIfcDoorStyleOperationEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOSE_EQUIVALENT_MEASURE:
				return createIfcDoseEquivalentMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_DOSE_EQUIVALENT_MEASURE_OBJECT:
				return createIfcDoseEquivalentMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DUCT_FITTING_TYPE_ENUM_OBJECT:
				return createIfcDuctFittingTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE_ENUM_OBJECT:
				return createIfcDuctSegmentTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DUCT_SILENCER_TYPE_ENUM_OBJECT:
				return createIfcDuctSilencerTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_DYNAMIC_VISCOSITY_MEASURE:
				return createIfcDynamicViscosityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_DYNAMIC_VISCOSITY_MEASURE_OBJECT:
				return createIfcDynamicViscosityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE_ENUM_OBJECT:
				return createIfcElectricApplianceTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CAPACITANCE_MEASURE:
				return createIfcElectricCapacitanceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CAPACITANCE_MEASURE_OBJECT:
				return createIfcElectricCapacitanceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CHARGE_MEASURE:
				return createIfcElectricChargeMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CHARGE_MEASURE_OBJECT:
				return createIfcElectricChargeMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				return createIfcElectricConductanceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CONDUCTANCE_MEASURE_OBJECT:
				return createIfcElectricConductanceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CURRENT_ENUM_OBJECT:
				return createIfcElectricCurrentEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CURRENT_MEASURE:
				return createIfcElectricCurrentMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_CURRENT_MEASURE_OBJECT:
				return createIfcElectricCurrentMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT_FUNCTION_ENUM_OBJECT:
				return createIfcElectricDistributionPointFunctionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE_ENUM_OBJECT:
				return createIfcElectricFlowStorageDeviceTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE_ENUM_OBJECT:
				return createIfcElectricGeneratorTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE_ENUM_OBJECT:
				return createIfcElectricHeaterTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE_ENUM_OBJECT:
				return createIfcElectricMotorTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_RESISTANCE_MEASURE:
				return createIfcElectricResistanceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_RESISTANCE_MEASURE_OBJECT:
				return createIfcElectricResistanceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE_ENUM_OBJECT:
				return createIfcElectricTimeControlTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_VOLTAGE_MEASURE:
				return createIfcElectricVoltageMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELECTRIC_VOLTAGE_MEASURE_OBJECT:
				return createIfcElectricVoltageMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELEMENT_ASSEMBLY_TYPE_ENUM_OBJECT:
				return createIfcElementAssemblyTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ELEMENT_COMPOSITION_ENUM_OBJECT:
				return createIfcElementCompositionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ENERGY_MEASURE:
				return createIfcEnergyMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ENERGY_MEASURE_OBJECT:
				return createIfcEnergyMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ENERGY_SEQUENCE_ENUM_OBJECT:
				return createIfcEnergySequenceEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_CATEGORY_ENUM_OBJECT:
				return createIfcEnvironmentalImpactCategoryEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE_ENUM_OBJECT:
				return createIfcEvaporativeCoolerTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_EVAPORATOR_TYPE_ENUM_OBJECT:
				return createIfcEvaporatorTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_FAN_TYPE_ENUM_OBJECT:
				return createIfcFanTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_FILTER_TYPE_ENUM_OBJECT:
				return createIfcFilterTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE_ENUM_OBJECT:
				return createIfcFireSuppressionTerminalTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_FLOW_DIRECTION_ENUM_OBJECT:
				return createIfcFlowDirectionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE_ENUM_OBJECT:
				return createIfcFlowInstrumentTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_FLOW_METER_TYPE_ENUM_OBJECT:
				return createIfcFlowMeterTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_FONT_STYLE:
				return createIfcFontStyleFromString(eDataType, initialValue);
			case FinalPackage.IFC_FONT_VARIANT:
				return createIfcFontVariantFromString(eDataType, initialValue);
			case FinalPackage.IFC_FONT_WEIGHT:
				return createIfcFontWeightFromString(eDataType, initialValue);
			case FinalPackage.IFC_FOOTING_TYPE_ENUM_OBJECT:
				return createIfcFootingTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_FORCE_MEASURE:
				return createIfcForceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_FORCE_MEASURE_OBJECT:
				return createIfcForceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_FREQUENCY_MEASURE:
				return createIfcFrequencyMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_FREQUENCY_MEASURE_OBJECT:
				return createIfcFrequencyMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_GAS_TERMINAL_TYPE_ENUM_OBJECT:
				return createIfcGasTerminalTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_GEOMETRIC_PROJECTION_ENUM_OBJECT:
				return createIfcGeometricProjectionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_GLOBALLY_UNIQUE_ID:
				return createIfcGloballyUniqueIdFromString(eDataType, initialValue);
			case FinalPackage.IFC_GLOBAL_OR_LOCAL_ENUM_OBJECT:
				return createIfcGlobalOrLocalEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE_ENUM_OBJECT:
				return createIfcHeatExchangerTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_HEAT_FLUX_DENSITY_MEASURE:
				return createIfcHeatFluxDensityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_HEAT_FLUX_DENSITY_MEASURE_OBJECT:
				return createIfcHeatFluxDensityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_HEATING_VALUE_MEASURE:
				return createIfcHeatingValueMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_HEATING_VALUE_MEASURE_OBJECT:
				return createIfcHeatingValueMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_HOUR_IN_DAY:
				return createIfcHourInDayFromString(eDataType, initialValue);
			case FinalPackage.IFC_HOUR_IN_DAY_OBJECT:
				return createIfcHourInDayObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_HUMIDIFIER_TYPE_ENUM_OBJECT:
				return createIfcHumidifierTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_IDENTIFIER:
				return createIfcIdentifierFromString(eDataType, initialValue);
			case FinalPackage.IFC_ILLUMINANCE_MEASURE:
				return createIfcIlluminanceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ILLUMINANCE_MEASURE_OBJECT:
				return createIfcIlluminanceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_INDUCTANCE_MEASURE:
				return createIfcInductanceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_INDUCTANCE_MEASURE_OBJECT:
				return createIfcInductanceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_INTEGER:
				return createIfcIntegerFromString(eDataType, initialValue);
			case FinalPackage.IFC_INTEGER_COUNT_RATE_MEASURE:
				return createIfcIntegerCountRateMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_INTEGER_COUNT_RATE_MEASURE_OBJECT:
				return createIfcIntegerCountRateMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_INTEGER_OBJECT:
				return createIfcIntegerObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_INTERNAL_OR_EXTERNAL_ENUM_OBJECT:
				return createIfcInternalOrExternalEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_INVENTORY_TYPE_ENUM_OBJECT:
				return createIfcInventoryTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ION_CONCENTRATION_MEASURE:
				return createIfcIonConcentrationMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ION_CONCENTRATION_MEASURE_OBJECT:
				return createIfcIonConcentrationMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				return createIfcIsothermalMoistureCapacityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE_OBJECT:
				return createIfcIsothermalMoistureCapacityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_JUNCTION_BOX_TYPE_ENUM_OBJECT:
				return createIfcJunctionBoxTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_KINEMATIC_VISCOSITY_MEASURE:
				return createIfcKinematicViscosityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_KINEMATIC_VISCOSITY_MEASURE_OBJECT:
				return createIfcKinematicViscosityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LABEL:
				return createIfcLabelFromString(eDataType, initialValue);
			case FinalPackage.IFC_LAMP_TYPE_ENUM_OBJECT:
				return createIfcLampTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LAYER_SET_DIRECTION_ENUM_OBJECT:
				return createIfcLayerSetDirectionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LENGTH_MEASURE:
				return createIfcLengthMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_LENGTH_MEASURE_OBJECT:
				return createIfcLengthMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_CURVE_ENUM_OBJECT:
				return createIfcLightDistributionCurveEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LIGHT_EMISSION_SOURCE_ENUM_OBJECT:
				return createIfcLightEmissionSourceEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE_ENUM_OBJECT:
				return createIfcLightFixtureTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LINEAR_FORCE_MEASURE:
				return createIfcLinearForceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_LINEAR_FORCE_MEASURE_OBJECT:
				return createIfcLinearForceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LINEAR_MOMENT_MEASURE:
				return createIfcLinearMomentMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_LINEAR_MOMENT_MEASURE_OBJECT:
				return createIfcLinearMomentMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LINEAR_STIFFNESS_MEASURE:
				return createIfcLinearStiffnessMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_LINEAR_STIFFNESS_MEASURE_OBJECT:
				return createIfcLinearStiffnessMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LINEAR_VELOCITY_MEASURE:
				return createIfcLinearVelocityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_LINEAR_VELOCITY_MEASURE_OBJECT:
				return createIfcLinearVelocityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LOAD_GROUP_TYPE_ENUM_OBJECT:
				return createIfcLoadGroupTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LOGICAL:
				return createIfcLogicalFromString(eDataType, initialValue);
			case FinalPackage.IFC_LOGICAL_OPERATOR_ENUM_OBJECT:
				return createIfcLogicalOperatorEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LUMINOUS_FLUX_MEASURE:
				return createIfcLuminousFluxMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_LUMINOUS_FLUX_MEASURE_OBJECT:
				return createIfcLuminousFluxMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				return createIfcLuminousIntensityDistributionMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE_OBJECT:
				return createIfcLuminousIntensityDistributionMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_MEASURE:
				return createIfcLuminousIntensityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_MEASURE_OBJECT:
				return createIfcLuminousIntensityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				return createIfcMagneticFluxDensityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MAGNETIC_FLUX_DENSITY_MEASURE_OBJECT:
				return createIfcMagneticFluxDensityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MAGNETIC_FLUX_MEASURE:
				return createIfcMagneticFluxMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MAGNETIC_FLUX_MEASURE_OBJECT:
				return createIfcMagneticFluxMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MASS_DENSITY_MEASURE:
				return createIfcMassDensityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MASS_DENSITY_MEASURE_OBJECT:
				return createIfcMassDensityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MASS_FLOW_RATE_MEASURE:
				return createIfcMassFlowRateMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MASS_FLOW_RATE_MEASURE_OBJECT:
				return createIfcMassFlowRateMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MASS_MEASURE:
				return createIfcMassMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MASS_MEASURE_OBJECT:
				return createIfcMassMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MASS_PER_LENGTH_MEASURE:
				return createIfcMassPerLengthMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MASS_PER_LENGTH_MEASURE_OBJECT:
				return createIfcMassPerLengthMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MEMBER_TYPE_ENUM_OBJECT:
				return createIfcMemberTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MINUTE_IN_HOUR:
				return createIfcMinuteInHourFromString(eDataType, initialValue);
			case FinalPackage.IFC_MINUTE_IN_HOUR_OBJECT:
				return createIfcMinuteInHourObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MODULUS_OF_ELASTICITY_MEASURE:
				return createIfcModulusOfElasticityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MODULUS_OF_ELASTICITY_MEASURE_OBJECT:
				return createIfcModulusOfElasticityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				return createIfcModulusOfLinearSubgradeReactionMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE_OBJECT:
				return createIfcModulusOfLinearSubgradeReactionMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				return createIfcModulusOfRotationalSubgradeReactionMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE_OBJECT:
				return createIfcModulusOfRotationalSubgradeReactionMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				return createIfcModulusOfSubgradeReactionMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE_OBJECT:
				return createIfcModulusOfSubgradeReactionMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				return createIfcMoistureDiffusivityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MOISTURE_DIFFUSIVITY_MEASURE_OBJECT:
				return createIfcMoistureDiffusivityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MOLECULAR_WEIGHT_MEASURE:
				return createIfcMolecularWeightMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MOLECULAR_WEIGHT_MEASURE_OBJECT:
				return createIfcMolecularWeightMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MOMENT_OF_INERTIA_MEASURE:
				return createIfcMomentOfInertiaMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MOMENT_OF_INERTIA_MEASURE_OBJECT:
				return createIfcMomentOfInertiaMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MONETARY_MEASURE:
				return createIfcMonetaryMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_MONETARY_MEASURE_OBJECT:
				return createIfcMonetaryMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MONTH_IN_YEAR_NUMBER:
				return createIfcMonthInYearNumberFromString(eDataType, initialValue);
			case FinalPackage.IFC_MONTH_IN_YEAR_NUMBER_OBJECT:
				return createIfcMonthInYearNumberObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE_ENUM_OBJECT:
				return createIfcMotorConnectionTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_NORMALISED_RATIO_MEASURE:
				return createIfcNormalisedRatioMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_NORMALISED_RATIO_MEASURE_OBJECT:
				return createIfcNormalisedRatioMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_NULL_STYLE_OBJECT:
				return createIfcNullStyleObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_NUMERIC_MEASURE:
				return createIfcNumericMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_NUMERIC_MEASURE_OBJECT:
				return createIfcNumericMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_OBJECTIVE_ENUM_OBJECT:
				return createIfcObjectiveEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_OBJECT_TYPE_ENUM_OBJECT:
				return createIfcObjectTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_OCCUPANT_TYPE_ENUM_OBJECT:
				return createIfcOccupantTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_OUTLET_TYPE_ENUM_OBJECT:
				return createIfcOutletTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PARAMETER_VALUE:
				return createIfcParameterValueFromString(eDataType, initialValue);
			case FinalPackage.IFC_PARAMETER_VALUE_OBJECT:
				return createIfcParameterValueObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PERMEABLE_COVERING_OPERATION_ENUM_OBJECT:
				return createIfcPermeableCoveringOperationEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PH_MEASURE:
				return createIfcPHMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_PH_MEASURE_OBJECT:
				return createIfcPHMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PHYSICAL_OR_VIRTUAL_ENUM_OBJECT:
				return createIfcPhysicalOrVirtualEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PILE_CONSTRUCTION_ENUM_OBJECT:
				return createIfcPileConstructionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PILE_TYPE_ENUM_OBJECT:
				return createIfcPileTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PIPE_FITTING_TYPE_ENUM_OBJECT:
				return createIfcPipeFittingTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE_ENUM_OBJECT:
				return createIfcPipeSegmentTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PLANAR_FORCE_MEASURE:
				return createIfcPlanarForceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_PLANAR_FORCE_MEASURE_OBJECT:
				return createIfcPlanarForceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PLANE_ANGLE_MEASURE:
				return createIfcPlaneAngleMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_PLANE_ANGLE_MEASURE_OBJECT:
				return createIfcPlaneAngleMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PLATE_TYPE_ENUM_OBJECT:
				return createIfcPlateTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_POSITIVE_LENGTH_MEASURE:
				return createIfcPositiveLengthMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_POSITIVE_LENGTH_MEASURE_OBJECT:
				return createIfcPositiveLengthMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				return createIfcPositivePlaneAngleMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_POSITIVE_PLANE_ANGLE_MEASURE_OBJECT:
				return createIfcPositivePlaneAngleMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_POSITIVE_RATIO_MEASURE:
				return createIfcPositiveRatioMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_POSITIVE_RATIO_MEASURE_OBJECT:
				return createIfcPositiveRatioMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_POWER_MEASURE:
				return createIfcPowerMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_POWER_MEASURE_OBJECT:
				return createIfcPowerMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PRESENTABLE_TEXT:
				return createIfcPresentableTextFromString(eDataType, initialValue);
			case FinalPackage.IFC_PRESSURE_MEASURE:
				return createIfcPressureMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_PRESSURE_MEASURE_OBJECT:
				return createIfcPressureMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROCEDURE_TYPE_ENUM_OBJECT:
				return createIfcProcedureTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROFILE_TYPE_ENUM_OBJECT:
				return createIfcProfileTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROJECTED_OR_TRUE_LENGTH_ENUM_OBJECT:
				return createIfcProjectedOrTrueLengthEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROJECT_ORDER_RECORD_TYPE_ENUM_OBJECT:
				return createIfcProjectOrderRecordTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROJECT_ORDER_TYPE_ENUM_OBJECT:
				return createIfcProjectOrderTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROPERTY_SOURCE_ENUM_OBJECT:
				return createIfcPropertySourceEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE_ENUM_OBJECT:
				return createIfcProtectiveDeviceTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_PUMP_TYPE_ENUM_OBJECT:
				return createIfcPumpTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_RADIO_ACTIVITY_MEASURE:
				return createIfcRadioActivityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_RADIO_ACTIVITY_MEASURE_OBJECT:
				return createIfcRadioActivityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_RAILING_TYPE_ENUM_OBJECT:
				return createIfcRailingTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE_ENUM_OBJECT:
				return createIfcRampFlightTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_RAMP_TYPE_ENUM_OBJECT:
				return createIfcRampTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_RATIO_MEASURE:
				return createIfcRatioMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_RATIO_MEASURE_OBJECT:
				return createIfcRatioMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_REAL:
				return createIfcRealFromString(eDataType, initialValue);
			case FinalPackage.IFC_REAL_OBJECT:
				return createIfcRealObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_REFLECTANCE_METHOD_ENUM_OBJECT:
				return createIfcReflectanceMethodEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_REINFORCING_BAR_ROLE_ENUM_OBJECT:
				return createIfcReinforcingBarRoleEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_REINFORCING_BAR_SURFACE_ENUM_OBJECT:
				return createIfcReinforcingBarSurfaceEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_RESOURCE_CONSUMPTION_ENUM_OBJECT:
				return createIfcResourceConsumptionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_RIB_PLATE_DIRECTION_ENUM_OBJECT:
				return createIfcRibPlateDirectionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROLE_ENUM_OBJECT:
				return createIfcRoleEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROOF_TYPE_ENUM_OBJECT:
				return createIfcRoofTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROTATIONAL_FREQUENCY_MEASURE:
				return createIfcRotationalFrequencyMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROTATIONAL_FREQUENCY_MEASURE_OBJECT:
				return createIfcRotationalFrequencyMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROTATIONAL_MASS_MEASURE:
				return createIfcRotationalMassMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROTATIONAL_MASS_MEASURE_OBJECT:
				return createIfcRotationalMassMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROTATIONAL_STIFFNESS_MEASURE:
				return createIfcRotationalStiffnessMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_ROTATIONAL_STIFFNESS_MEASURE_OBJECT:
				return createIfcRotationalStiffnessMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE_ENUM_OBJECT:
				return createIfcSanitaryTerminalTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SECOND_IN_MINUTE:
				return createIfcSecondInMinuteFromString(eDataType, initialValue);
			case FinalPackage.IFC_SECOND_IN_MINUTE_OBJECT:
				return createIfcSecondInMinuteObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				return createIfcSectionalAreaIntegralMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_SECTIONAL_AREA_INTEGRAL_MEASURE_OBJECT:
				return createIfcSectionalAreaIntegralMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SECTION_MODULUS_MEASURE:
				return createIfcSectionModulusMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_SECTION_MODULUS_MEASURE_OBJECT:
				return createIfcSectionModulusMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SECTION_TYPE_ENUM_OBJECT:
				return createIfcSectionTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SENSOR_TYPE_ENUM_OBJECT:
				return createIfcSensorTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SEQUENCE_ENUM_OBJECT:
				return createIfcSequenceEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR_TYPE_ENUM_OBJECT:
				return createIfcServiceLifeFactorTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SERVICE_LIFE_TYPE_ENUM_OBJECT:
				return createIfcServiceLifeTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SHEAR_MODULUS_MEASURE:
				return createIfcShearModulusMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_SHEAR_MODULUS_MEASURE_OBJECT:
				return createIfcShearModulusMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SI_PREFIX_OBJECT:
				return createIfcSIPrefixObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SI_UNIT_NAME_OBJECT:
				return createIfcSIUnitNameObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SLAB_TYPE_ENUM_OBJECT:
				return createIfcSlabTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SOLID_ANGLE_MEASURE:
				return createIfcSolidAngleMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_SOLID_ANGLE_MEASURE_OBJECT:
				return createIfcSolidAngleMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SOUND_POWER_MEASURE:
				return createIfcSoundPowerMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_SOUND_POWER_MEASURE_OBJECT:
				return createIfcSoundPowerMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SOUND_PRESSURE_MEASURE:
				return createIfcSoundPressureMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_SOUND_PRESSURE_MEASURE_OBJECT:
				return createIfcSoundPressureMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SOUND_SCALE_ENUM_OBJECT:
				return createIfcSoundScaleEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPACE_HEATER_TYPE_ENUM_OBJECT:
				return createIfcSpaceHeaterTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPACE_TYPE_ENUM_OBJECT:
				return createIfcSpaceTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				return createIfcSpecificHeatCapacityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPECIFIC_HEAT_CAPACITY_MEASURE_OBJECT:
				return createIfcSpecificHeatCapacityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPECULAR_EXPONENT:
				return createIfcSpecularExponentFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPECULAR_EXPONENT_OBJECT:
				return createIfcSpecularExponentObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPECULAR_ROUGHNESS:
				return createIfcSpecularRoughnessFromString(eDataType, initialValue);
			case FinalPackage.IFC_SPECULAR_ROUGHNESS_OBJECT:
				return createIfcSpecularRoughnessObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_STACK_TERMINAL_TYPE_ENUM_OBJECT:
				return createIfcStackTerminalTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE_ENUM_OBJECT:
				return createIfcStairFlightTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_STAIR_TYPE_ENUM_OBJECT:
				return createIfcStairTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_STATE_ENUM_OBJECT:
				return createIfcStateEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_STRUCTURAL_CURVE_TYPE_ENUM_OBJECT:
				return createIfcStructuralCurveTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_TYPE_ENUM_OBJECT:
				return createIfcStructuralSurfaceTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SURFACE_SIDE_OBJECT:
				return createIfcSurfaceSideObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SURFACE_TEXTURE_ENUM_OBJECT:
				return createIfcSurfaceTextureEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE_ENUM_OBJECT:
				return createIfcSwitchingDeviceTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TANK_TYPE_ENUM_OBJECT:
				return createIfcTankTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TEMPERATURE_GRADIENT_MEASURE:
				return createIfcTemperatureGradientMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_TEMPERATURE_GRADIENT_MEASURE_OBJECT:
				return createIfcTemperatureGradientMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TENDON_TYPE_ENUM_OBJECT:
				return createIfcTendonTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TEXT:
				return createIfcTextFromString(eDataType, initialValue);
			case FinalPackage.IFC_TEXT_ALIGNMENT:
				return createIfcTextAlignmentFromString(eDataType, initialValue);
			case FinalPackage.IFC_TEXT_DECORATION:
				return createIfcTextDecorationFromString(eDataType, initialValue);
			case FinalPackage.IFC_TEXT_FONT_NAME:
				return createIfcTextFontNameFromString(eDataType, initialValue);
			case FinalPackage.IFC_TEXT_PATH_OBJECT:
				return createIfcTextPathObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TEXT_TRANSFORMATION:
				return createIfcTextTransformationFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_ADMITTANCE_MEASURE:
				return createIfcThermalAdmittanceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_ADMITTANCE_MEASURE_OBJECT:
				return createIfcThermalAdmittanceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_CONDUCTIVITY_MEASURE:
				return createIfcThermalConductivityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_CONDUCTIVITY_MEASURE_OBJECT:
				return createIfcThermalConductivityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				return createIfcThermalExpansionCoefficientMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE_OBJECT:
				return createIfcThermalExpansionCoefficientMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_LOAD_SOURCE_ENUM_OBJECT:
				return createIfcThermalLoadSourceEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_LOAD_TYPE_ENUM_OBJECT:
				return createIfcThermalLoadTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_RESISTANCE_MEASURE:
				return createIfcThermalResistanceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_RESISTANCE_MEASURE_OBJECT:
				return createIfcThermalResistanceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_TRANSMITTANCE_MEASURE:
				return createIfcThermalTransmittanceMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMAL_TRANSMITTANCE_MEASURE_OBJECT:
				return createIfcThermalTransmittanceMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				return createIfcThermodynamicTemperatureMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_THERMODYNAMIC_TEMPERATURE_MEASURE_OBJECT:
				return createIfcThermodynamicTemperatureMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TIME_MEASURE:
				return createIfcTimeMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_TIME_MEASURE_OBJECT:
				return createIfcTimeMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TIME_SERIES_DATA_TYPE_ENUM_OBJECT:
				return createIfcTimeSeriesDataTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE_TYPE_ENUM_OBJECT:
				return createIfcTimeSeriesScheduleTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TIME_STAMP:
				return createIfcTimeStampFromString(eDataType, initialValue);
			case FinalPackage.IFC_TIME_STAMP_OBJECT:
				return createIfcTimeStampObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TORQUE_MEASURE:
				return createIfcTorqueMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_TORQUE_MEASURE_OBJECT:
				return createIfcTorqueMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TRANSFORMER_TYPE_ENUM_OBJECT:
				return createIfcTransformerTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TRANSITION_CODE_OBJECT:
				return createIfcTransitionCodeObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE_ENUM_OBJECT:
				return createIfcTransportElementTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TRIMMING_PREFERENCE_OBJECT:
				return createIfcTrimmingPreferenceObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE_ENUM_OBJECT:
				return createIfcTubeBundleTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE_ENUM_OBJECT:
				return createIfcUnitaryEquipmentTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_UNIT_ENUM_OBJECT:
				return createIfcUnitEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_VALVE_TYPE_ENUM_OBJECT:
				return createIfcValveTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_VAPOR_PERMEABILITY_MEASURE:
				return createIfcVaporPermeabilityMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_VAPOR_PERMEABILITY_MEASURE_OBJECT:
				return createIfcVaporPermeabilityMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE_ENUM_OBJECT:
				return createIfcVibrationIsolatorTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_VOLUME_MEASURE:
				return createIfcVolumeMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_VOLUME_MEASURE_OBJECT:
				return createIfcVolumeMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				return createIfcVolumetricFlowRateMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_VOLUMETRIC_FLOW_RATE_MEASURE_OBJECT:
				return createIfcVolumetricFlowRateMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_WALL_TYPE_ENUM_OBJECT:
				return createIfcWallTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_WARPING_CONSTANT_MEASURE:
				return createIfcWarpingConstantMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_WARPING_CONSTANT_MEASURE_OBJECT:
				return createIfcWarpingConstantMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_WARPING_MOMENT_MEASURE:
				return createIfcWarpingMomentMeasureFromString(eDataType, initialValue);
			case FinalPackage.IFC_WARPING_MOMENT_MEASURE_OBJECT:
				return createIfcWarpingMomentMeasureObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE_ENUM_OBJECT:
				return createIfcWasteTerminalTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_WINDOW_PANEL_OPERATION_ENUM_OBJECT:
				return createIfcWindowPanelOperationEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_WINDOW_PANEL_POSITION_ENUM_OBJECT:
				return createIfcWindowPanelPositionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_WINDOW_STYLE_CONSTRUCTION_ENUM_OBJECT:
				return createIfcWindowStyleConstructionEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_WINDOW_STYLE_OPERATION_ENUM_OBJECT:
				return createIfcWindowStyleOperationEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_WORK_CONTROL_TYPE_ENUM_OBJECT:
				return createIfcWorkControlTypeEnumObjectFromString(eDataType, initialValue);
			case FinalPackage.IFC_YEAR_NUMBER:
				return createIfcYearNumberFromString(eDataType, initialValue);
			case FinalPackage.IFC_YEAR_NUMBER_OBJECT:
				return createIfcYearNumberObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FinalPackage.IFC_ACTION_SOURCE_TYPE_ENUM:
				return convertIfcActionSourceTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ACTION_TYPE_ENUM:
				return convertIfcActionTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ACTUATOR_TYPE_ENUM:
				return convertIfcActuatorTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ADDRESS_TYPE_ENUM:
				return convertIfcAddressTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_AHEAD_OR_BEHIND:
				return convertIfcAheadOrBehindToString(eDataType, instanceValue);
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE_ENUM:
				return convertIfcAirTerminalBoxTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_AIR_TERMINAL_TYPE_ENUM:
				return convertIfcAirTerminalTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE_ENUM:
				return convertIfcAirToAirHeatRecoveryTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ALARM_TYPE_ENUM:
				return convertIfcAlarmTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ANALYSIS_MODEL_TYPE_ENUM:
				return convertIfcAnalysisModelTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ANALYSIS_THEORY_TYPE_ENUM:
				return convertIfcAnalysisTheoryTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ARITHMETIC_OPERATOR_ENUM:
				return convertIfcArithmeticOperatorEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ASSEMBLY_PLACE_ENUM:
				return convertIfcAssemblyPlaceEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_BEAM_TYPE_ENUM:
				return convertIfcBeamTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_BENCHMARK_ENUM:
				return convertIfcBenchmarkEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_BOILER_TYPE_ENUM:
				return convertIfcBoilerTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_BOOLEAN_OPERATOR:
				return convertIfcBooleanOperatorToString(eDataType, instanceValue);
			case FinalPackage.IFC_BSPLINE_CURVE_FORM:
				return convertIfcBSplineCurveFormToString(eDataType, instanceValue);
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE_ENUM:
				return convertIfcBuildingElementProxyTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE_ENUM:
				return convertIfcCableCarrierFittingTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE_ENUM:
				return convertIfcCableCarrierSegmentTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE_ENUM:
				return convertIfcCableSegmentTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CHANGE_ACTION_ENUM:
				return convertIfcChangeActionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CHILLER_TYPE_ENUM:
				return convertIfcChillerTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_COIL_TYPE_ENUM:
				return convertIfcCoilTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_COLUMN_TYPE_ENUM:
				return convertIfcColumnTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_COMPRESSOR_TYPE_ENUM:
				return convertIfcCompressorTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONDENSER_TYPE_ENUM:
				return convertIfcCondenserTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONNECTION_TYPE_ENUM:
				return convertIfcConnectionTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONSTRAINT_ENUM:
				return convertIfcConstraintEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONTROLLER_TYPE_ENUM:
				return convertIfcControllerTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_COOLED_BEAM_TYPE_ENUM:
				return convertIfcCooledBeamTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_COOLING_TOWER_TYPE_ENUM:
				return convertIfcCoolingTowerTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_COST_SCHEDULE_TYPE_ENUM:
				return convertIfcCostScheduleTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_COVERING_TYPE_ENUM:
				return convertIfcCoveringTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CURRENCY_ENUM:
				return convertIfcCurrencyEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_CURTAIN_WALL_TYPE_ENUM:
				return convertIfcCurtainWallTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DAMPER_TYPE_ENUM:
				return convertIfcDamperTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DATA_ORIGIN_ENUM:
				return convertIfcDataOriginEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DERIVED_UNIT_ENUM:
				return convertIfcDerivedUnitEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DIMENSION_EXTENT_USAGE:
				return convertIfcDimensionExtentUsageToString(eDataType, instanceValue);
			case FinalPackage.IFC_DIRECTION_SENSE_ENUM:
				return convertIfcDirectionSenseEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE_ENUM:
				return convertIfcDistributionChamberElementTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOCUMENT_CONFIDENTIALITY_ENUM:
				return convertIfcDocumentConfidentialityEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOCUMENT_STATUS_ENUM:
				return convertIfcDocumentStatusEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOOR_PANEL_OPERATION_ENUM:
				return convertIfcDoorPanelOperationEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOOR_PANEL_POSITION_ENUM:
				return convertIfcDoorPanelPositionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOOR_STYLE_CONSTRUCTION_ENUM:
				return convertIfcDoorStyleConstructionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOOR_STYLE_OPERATION_ENUM:
				return convertIfcDoorStyleOperationEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DUCT_FITTING_TYPE_ENUM:
				return convertIfcDuctFittingTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE_ENUM:
				return convertIfcDuctSegmentTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_DUCT_SILENCER_TYPE_ENUM:
				return convertIfcDuctSilencerTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE_ENUM:
				return convertIfcElectricApplianceTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CURRENT_ENUM:
				return convertIfcElectricCurrentEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT_FUNCTION_ENUM:
				return convertIfcElectricDistributionPointFunctionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE_ENUM:
				return convertIfcElectricFlowStorageDeviceTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE_ENUM:
				return convertIfcElectricGeneratorTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE_ENUM:
				return convertIfcElectricHeaterTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE_ENUM:
				return convertIfcElectricMotorTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE_ENUM:
				return convertIfcElectricTimeControlTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELEMENT_ASSEMBLY_TYPE_ENUM:
				return convertIfcElementAssemblyTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELEMENT_COMPOSITION_ENUM:
				return convertIfcElementCompositionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ENERGY_SEQUENCE_ENUM:
				return convertIfcEnergySequenceEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_CATEGORY_ENUM:
				return convertIfcEnvironmentalImpactCategoryEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE_ENUM:
				return convertIfcEvaporativeCoolerTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_EVAPORATOR_TYPE_ENUM:
				return convertIfcEvaporatorTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_FAN_TYPE_ENUM:
				return convertIfcFanTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_FILTER_TYPE_ENUM:
				return convertIfcFilterTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE_ENUM:
				return convertIfcFireSuppressionTerminalTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_FLOW_DIRECTION_ENUM:
				return convertIfcFlowDirectionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE_ENUM:
				return convertIfcFlowInstrumentTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_FLOW_METER_TYPE_ENUM:
				return convertIfcFlowMeterTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_FOOTING_TYPE_ENUM:
				return convertIfcFootingTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_GAS_TERMINAL_TYPE_ENUM:
				return convertIfcGasTerminalTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_GEOMETRIC_PROJECTION_ENUM:
				return convertIfcGeometricProjectionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_GLOBAL_OR_LOCAL_ENUM:
				return convertIfcGlobalOrLocalEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE_ENUM:
				return convertIfcHeatExchangerTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_HUMIDIFIER_TYPE_ENUM:
				return convertIfcHumidifierTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_INTERNAL_OR_EXTERNAL_ENUM:
				return convertIfcInternalOrExternalEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_INVENTORY_TYPE_ENUM:
				return convertIfcInventoryTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_JUNCTION_BOX_TYPE_ENUM:
				return convertIfcJunctionBoxTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_LAMP_TYPE_ENUM:
				return convertIfcLampTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_LAYER_SET_DIRECTION_ENUM:
				return convertIfcLayerSetDirectionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_CURVE_ENUM:
				return convertIfcLightDistributionCurveEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_LIGHT_EMISSION_SOURCE_ENUM:
				return convertIfcLightEmissionSourceEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE_ENUM:
				return convertIfcLightFixtureTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_LOAD_GROUP_TYPE_ENUM:
				return convertIfcLoadGroupTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_LOGICAL_OPERATOR_ENUM:
				return convertIfcLogicalOperatorEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_MEMBER_TYPE_ENUM:
				return convertIfcMemberTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE_ENUM:
				return convertIfcMotorConnectionTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_NULL_STYLE:
				return convertIfcNullStyleToString(eDataType, instanceValue);
			case FinalPackage.IFC_OBJECTIVE_ENUM:
				return convertIfcObjectiveEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_OBJECT_TYPE_ENUM:
				return convertIfcObjectTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_OCCUPANT_TYPE_ENUM:
				return convertIfcOccupantTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_OUTLET_TYPE_ENUM:
				return convertIfcOutletTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PERMEABLE_COVERING_OPERATION_ENUM:
				return convertIfcPermeableCoveringOperationEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PHYSICAL_OR_VIRTUAL_ENUM:
				return convertIfcPhysicalOrVirtualEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PILE_CONSTRUCTION_ENUM:
				return convertIfcPileConstructionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PILE_TYPE_ENUM:
				return convertIfcPileTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PIPE_FITTING_TYPE_ENUM:
				return convertIfcPipeFittingTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE_ENUM:
				return convertIfcPipeSegmentTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PLATE_TYPE_ENUM:
				return convertIfcPlateTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROCEDURE_TYPE_ENUM:
				return convertIfcProcedureTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROFILE_TYPE_ENUM:
				return convertIfcProfileTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROJECTED_OR_TRUE_LENGTH_ENUM:
				return convertIfcProjectedOrTrueLengthEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROJECT_ORDER_RECORD_TYPE_ENUM:
				return convertIfcProjectOrderRecordTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROJECT_ORDER_TYPE_ENUM:
				return convertIfcProjectOrderTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROPERTY_SOURCE_ENUM:
				return convertIfcPropertySourceEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE_ENUM:
				return convertIfcProtectiveDeviceTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_PUMP_TYPE_ENUM:
				return convertIfcPumpTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_RAILING_TYPE_ENUM:
				return convertIfcRailingTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE_ENUM:
				return convertIfcRampFlightTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_RAMP_TYPE_ENUM:
				return convertIfcRampTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_REFLECTANCE_METHOD_ENUM:
				return convertIfcReflectanceMethodEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_REINFORCING_BAR_ROLE_ENUM:
				return convertIfcReinforcingBarRoleEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_REINFORCING_BAR_SURFACE_ENUM:
				return convertIfcReinforcingBarSurfaceEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_RESOURCE_CONSUMPTION_ENUM:
				return convertIfcResourceConsumptionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_RIB_PLATE_DIRECTION_ENUM:
				return convertIfcRibPlateDirectionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROLE_ENUM:
				return convertIfcRoleEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROOF_TYPE_ENUM:
				return convertIfcRoofTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE_ENUM:
				return convertIfcSanitaryTerminalTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SECTION_TYPE_ENUM:
				return convertIfcSectionTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SENSOR_TYPE_ENUM:
				return convertIfcSensorTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SEQUENCE_ENUM:
				return convertIfcSequenceEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR_TYPE_ENUM:
				return convertIfcServiceLifeFactorTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SERVICE_LIFE_TYPE_ENUM:
				return convertIfcServiceLifeTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SI_PREFIX:
				return convertIfcSIPrefixToString(eDataType, instanceValue);
			case FinalPackage.IFC_SI_UNIT_NAME:
				return convertIfcSIUnitNameToString(eDataType, instanceValue);
			case FinalPackage.IFC_SLAB_TYPE_ENUM:
				return convertIfcSlabTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SOUND_SCALE_ENUM:
				return convertIfcSoundScaleEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPACE_HEATER_TYPE_ENUM:
				return convertIfcSpaceHeaterTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPACE_TYPE_ENUM:
				return convertIfcSpaceTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_STACK_TERMINAL_TYPE_ENUM:
				return convertIfcStackTerminalTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE_ENUM:
				return convertIfcStairFlightTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_STAIR_TYPE_ENUM:
				return convertIfcStairTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_STATE_ENUM:
				return convertIfcStateEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_STRUCTURAL_CURVE_TYPE_ENUM:
				return convertIfcStructuralCurveTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_TYPE_ENUM:
				return convertIfcStructuralSurfaceTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SURFACE_SIDE:
				return convertIfcSurfaceSideToString(eDataType, instanceValue);
			case FinalPackage.IFC_SURFACE_TEXTURE_ENUM:
				return convertIfcSurfaceTextureEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE_ENUM:
				return convertIfcSwitchingDeviceTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_TANK_TYPE_ENUM:
				return convertIfcTankTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_TENDON_TYPE_ENUM:
				return convertIfcTendonTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_TEXT_PATH:
				return convertIfcTextPathToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_LOAD_SOURCE_ENUM:
				return convertIfcThermalLoadSourceEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_LOAD_TYPE_ENUM:
				return convertIfcThermalLoadTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_TIME_SERIES_DATA_TYPE_ENUM:
				return convertIfcTimeSeriesDataTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE_TYPE_ENUM:
				return convertIfcTimeSeriesScheduleTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_TRANSFORMER_TYPE_ENUM:
				return convertIfcTransformerTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_TRANSITION_CODE:
				return convertIfcTransitionCodeToString(eDataType, instanceValue);
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE_ENUM:
				return convertIfcTransportElementTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_TRIMMING_PREFERENCE:
				return convertIfcTrimmingPreferenceToString(eDataType, instanceValue);
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE_ENUM:
				return convertIfcTubeBundleTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE_ENUM:
				return convertIfcUnitaryEquipmentTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_UNIT_ENUM:
				return convertIfcUnitEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_VALVE_TYPE_ENUM:
				return convertIfcValveTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE_ENUM:
				return convertIfcVibrationIsolatorTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_WALL_TYPE_ENUM:
				return convertIfcWallTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE_ENUM:
				return convertIfcWasteTerminalTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_WINDOW_PANEL_OPERATION_ENUM:
				return convertIfcWindowPanelOperationEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_WINDOW_PANEL_POSITION_ENUM:
				return convertIfcWindowPanelPositionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_WINDOW_STYLE_CONSTRUCTION_ENUM:
				return convertIfcWindowStyleConstructionEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_WINDOW_STYLE_OPERATION_ENUM:
				return convertIfcWindowStyleOperationEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_WORK_CONTROL_TYPE_ENUM:
				return convertIfcWorkControlTypeEnumToString(eDataType, instanceValue);
			case FinalPackage.IFC_ABSORBED_DOSE_MEASURE:
				return convertIfcAbsorbedDoseMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ABSORBED_DOSE_MEASURE_OBJECT:
				return convertIfcAbsorbedDoseMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ACCELERATION_MEASURE:
				return convertIfcAccelerationMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ACCELERATION_MEASURE_OBJECT:
				return convertIfcAccelerationMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ACTION_SOURCE_TYPE_ENUM_OBJECT:
				return convertIfcActionSourceTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ACTION_TYPE_ENUM_OBJECT:
				return convertIfcActionTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ACTUATOR_TYPE_ENUM_OBJECT:
				return convertIfcActuatorTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ADDRESS_TYPE_ENUM_OBJECT:
				return convertIfcAddressTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_AHEAD_OR_BEHIND_OBJECT:
				return convertIfcAheadOrBehindObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_AIR_TERMINAL_BOX_TYPE_ENUM_OBJECT:
				return convertIfcAirTerminalBoxTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_AIR_TERMINAL_TYPE_ENUM_OBJECT:
				return convertIfcAirTerminalTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_AIR_TO_AIR_HEAT_RECOVERY_TYPE_ENUM_OBJECT:
				return convertIfcAirToAirHeatRecoveryTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ALARM_TYPE_ENUM_OBJECT:
				return convertIfcAlarmTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_AMOUNT_OF_SUBSTANCE_MEASURE:
				return convertIfcAmountOfSubstanceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_AMOUNT_OF_SUBSTANCE_MEASURE_OBJECT:
				return convertIfcAmountOfSubstanceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ANALYSIS_MODEL_TYPE_ENUM_OBJECT:
				return convertIfcAnalysisModelTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ANALYSIS_THEORY_TYPE_ENUM_OBJECT:
				return convertIfcAnalysisTheoryTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ANGULAR_VELOCITY_MEASURE:
				return convertIfcAngularVelocityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ANGULAR_VELOCITY_MEASURE_OBJECT:
				return convertIfcAngularVelocityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_AREA_MEASURE:
				return convertIfcAreaMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_AREA_MEASURE_OBJECT:
				return convertIfcAreaMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ARITHMETIC_OPERATOR_ENUM_OBJECT:
				return convertIfcArithmeticOperatorEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ASSEMBLY_PLACE_ENUM_OBJECT:
				return convertIfcAssemblyPlaceEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_BEAM_TYPE_ENUM_OBJECT:
				return convertIfcBeamTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_BENCHMARK_ENUM_OBJECT:
				return convertIfcBenchmarkEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_BOILER_TYPE_ENUM_OBJECT:
				return convertIfcBoilerTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_BOOLEAN:
				return convertIfcBooleanToString(eDataType, instanceValue);
			case FinalPackage.IFC_BOOLEAN_OBJECT:
				return convertIfcBooleanObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_BOOLEAN_OPERATOR_OBJECT:
				return convertIfcBooleanOperatorObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_BOX_ALIGNMENT:
				return convertIfcBoxAlignmentToString(eDataType, instanceValue);
			case FinalPackage.IFC_BSPLINE_CURVE_FORM_OBJECT:
				return convertIfcBSplineCurveFormObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_BUILDING_ELEMENT_PROXY_TYPE_ENUM_OBJECT:
				return convertIfcBuildingElementProxyTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CABLE_CARRIER_FITTING_TYPE_ENUM_OBJECT:
				return convertIfcCableCarrierFittingTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CABLE_CARRIER_SEGMENT_TYPE_ENUM_OBJECT:
				return convertIfcCableCarrierSegmentTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CABLE_SEGMENT_TYPE_ENUM_OBJECT:
				return convertIfcCableSegmentTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CHANGE_ACTION_ENUM_OBJECT:
				return convertIfcChangeActionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CHILLER_TYPE_ENUM_OBJECT:
				return convertIfcChillerTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_COIL_TYPE_ENUM_OBJECT:
				return convertIfcCoilTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_COLUMN_TYPE_ENUM_OBJECT:
				return convertIfcColumnTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_COMPRESSOR_TYPE_ENUM_OBJECT:
				return convertIfcCompressorTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONDENSER_TYPE_ENUM_OBJECT:
				return convertIfcCondenserTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONNECTION_TYPE_ENUM_OBJECT:
				return convertIfcConnectionTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONSTRAINT_ENUM_OBJECT:
				return convertIfcConstraintEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONTEXT_DEPENDENT_MEASURE:
				return convertIfcContextDependentMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONTEXT_DEPENDENT_MEASURE_OBJECT:
				return convertIfcContextDependentMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CONTROLLER_TYPE_ENUM_OBJECT:
				return convertIfcControllerTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_COOLED_BEAM_TYPE_ENUM_OBJECT:
				return convertIfcCooledBeamTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_COOLING_TOWER_TYPE_ENUM_OBJECT:
				return convertIfcCoolingTowerTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_COST_SCHEDULE_TYPE_ENUM_OBJECT:
				return convertIfcCostScheduleTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_COUNT_MEASURE:
				return convertIfcCountMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_COUNT_MEASURE_OBJECT:
				return convertIfcCountMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_COVERING_TYPE_ENUM_OBJECT:
				return convertIfcCoveringTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CURRENCY_ENUM_OBJECT:
				return convertIfcCurrencyEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CURTAIN_WALL_TYPE_ENUM_OBJECT:
				return convertIfcCurtainWallTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_CURVATURE_MEASURE:
				return convertIfcCurvatureMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_CURVATURE_MEASURE_OBJECT:
				return convertIfcCurvatureMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DAMPER_TYPE_ENUM_OBJECT:
				return convertIfcDamperTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DATA_ORIGIN_ENUM_OBJECT:
				return convertIfcDataOriginEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DAY_IN_MONTH_NUMBER:
				return convertIfcDayInMonthNumberToString(eDataType, instanceValue);
			case FinalPackage.IFC_DAY_IN_MONTH_NUMBER_OBJECT:
				return convertIfcDayInMonthNumberObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DAYLIGHT_SAVING_HOUR:
				return convertIfcDaylightSavingHourToString(eDataType, instanceValue);
			case FinalPackage.IFC_DAYLIGHT_SAVING_HOUR_OBJECT:
				return convertIfcDaylightSavingHourObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DERIVED_UNIT_ENUM_OBJECT:
				return convertIfcDerivedUnitEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DESCRIPTIVE_MEASURE:
				return convertIfcDescriptiveMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_DIMENSION_COUNT:
				return convertIfcDimensionCountToString(eDataType, instanceValue);
			case FinalPackage.IFC_DIMENSION_COUNT_OBJECT:
				return convertIfcDimensionCountObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DIMENSION_EXTENT_USAGE_OBJECT:
				return convertIfcDimensionExtentUsageObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DIRECTION_SENSE_ENUM_OBJECT:
				return convertIfcDirectionSenseEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DISTRIBUTION_CHAMBER_ELEMENT_TYPE_ENUM_OBJECT:
				return convertIfcDistributionChamberElementTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOCUMENT_CONFIDENTIALITY_ENUM_OBJECT:
				return convertIfcDocumentConfidentialityEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOCUMENT_STATUS_ENUM_OBJECT:
				return convertIfcDocumentStatusEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOOR_PANEL_OPERATION_ENUM_OBJECT:
				return convertIfcDoorPanelOperationEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOOR_PANEL_POSITION_ENUM_OBJECT:
				return convertIfcDoorPanelPositionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOOR_STYLE_CONSTRUCTION_ENUM_OBJECT:
				return convertIfcDoorStyleConstructionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOOR_STYLE_OPERATION_ENUM_OBJECT:
				return convertIfcDoorStyleOperationEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOSE_EQUIVALENT_MEASURE:
				return convertIfcDoseEquivalentMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_DOSE_EQUIVALENT_MEASURE_OBJECT:
				return convertIfcDoseEquivalentMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DUCT_FITTING_TYPE_ENUM_OBJECT:
				return convertIfcDuctFittingTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DUCT_SEGMENT_TYPE_ENUM_OBJECT:
				return convertIfcDuctSegmentTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DUCT_SILENCER_TYPE_ENUM_OBJECT:
				return convertIfcDuctSilencerTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_DYNAMIC_VISCOSITY_MEASURE:
				return convertIfcDynamicViscosityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_DYNAMIC_VISCOSITY_MEASURE_OBJECT:
				return convertIfcDynamicViscosityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_APPLIANCE_TYPE_ENUM_OBJECT:
				return convertIfcElectricApplianceTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CAPACITANCE_MEASURE:
				return convertIfcElectricCapacitanceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CAPACITANCE_MEASURE_OBJECT:
				return convertIfcElectricCapacitanceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CHARGE_MEASURE:
				return convertIfcElectricChargeMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CHARGE_MEASURE_OBJECT:
				return convertIfcElectricChargeMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CONDUCTANCE_MEASURE:
				return convertIfcElectricConductanceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CONDUCTANCE_MEASURE_OBJECT:
				return convertIfcElectricConductanceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CURRENT_ENUM_OBJECT:
				return convertIfcElectricCurrentEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CURRENT_MEASURE:
				return convertIfcElectricCurrentMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_CURRENT_MEASURE_OBJECT:
				return convertIfcElectricCurrentMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT_FUNCTION_ENUM_OBJECT:
				return convertIfcElectricDistributionPointFunctionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_FLOW_STORAGE_DEVICE_TYPE_ENUM_OBJECT:
				return convertIfcElectricFlowStorageDeviceTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_GENERATOR_TYPE_ENUM_OBJECT:
				return convertIfcElectricGeneratorTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_HEATER_TYPE_ENUM_OBJECT:
				return convertIfcElectricHeaterTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_MOTOR_TYPE_ENUM_OBJECT:
				return convertIfcElectricMotorTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_RESISTANCE_MEASURE:
				return convertIfcElectricResistanceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_RESISTANCE_MEASURE_OBJECT:
				return convertIfcElectricResistanceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_TIME_CONTROL_TYPE_ENUM_OBJECT:
				return convertIfcElectricTimeControlTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_VOLTAGE_MEASURE:
				return convertIfcElectricVoltageMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELECTRIC_VOLTAGE_MEASURE_OBJECT:
				return convertIfcElectricVoltageMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELEMENT_ASSEMBLY_TYPE_ENUM_OBJECT:
				return convertIfcElementAssemblyTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ELEMENT_COMPOSITION_ENUM_OBJECT:
				return convertIfcElementCompositionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ENERGY_MEASURE:
				return convertIfcEnergyMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ENERGY_MEASURE_OBJECT:
				return convertIfcEnergyMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ENERGY_SEQUENCE_ENUM_OBJECT:
				return convertIfcEnergySequenceEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ENVIRONMENTAL_IMPACT_CATEGORY_ENUM_OBJECT:
				return convertIfcEnvironmentalImpactCategoryEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_EVAPORATIVE_COOLER_TYPE_ENUM_OBJECT:
				return convertIfcEvaporativeCoolerTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_EVAPORATOR_TYPE_ENUM_OBJECT:
				return convertIfcEvaporatorTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_FAN_TYPE_ENUM_OBJECT:
				return convertIfcFanTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_FILTER_TYPE_ENUM_OBJECT:
				return convertIfcFilterTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_FIRE_SUPPRESSION_TERMINAL_TYPE_ENUM_OBJECT:
				return convertIfcFireSuppressionTerminalTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_FLOW_DIRECTION_ENUM_OBJECT:
				return convertIfcFlowDirectionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_FLOW_INSTRUMENT_TYPE_ENUM_OBJECT:
				return convertIfcFlowInstrumentTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_FLOW_METER_TYPE_ENUM_OBJECT:
				return convertIfcFlowMeterTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_FONT_STYLE:
				return convertIfcFontStyleToString(eDataType, instanceValue);
			case FinalPackage.IFC_FONT_VARIANT:
				return convertIfcFontVariantToString(eDataType, instanceValue);
			case FinalPackage.IFC_FONT_WEIGHT:
				return convertIfcFontWeightToString(eDataType, instanceValue);
			case FinalPackage.IFC_FOOTING_TYPE_ENUM_OBJECT:
				return convertIfcFootingTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_FORCE_MEASURE:
				return convertIfcForceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_FORCE_MEASURE_OBJECT:
				return convertIfcForceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_FREQUENCY_MEASURE:
				return convertIfcFrequencyMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_FREQUENCY_MEASURE_OBJECT:
				return convertIfcFrequencyMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_GAS_TERMINAL_TYPE_ENUM_OBJECT:
				return convertIfcGasTerminalTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_GEOMETRIC_PROJECTION_ENUM_OBJECT:
				return convertIfcGeometricProjectionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_GLOBALLY_UNIQUE_ID:
				return convertIfcGloballyUniqueIdToString(eDataType, instanceValue);
			case FinalPackage.IFC_GLOBAL_OR_LOCAL_ENUM_OBJECT:
				return convertIfcGlobalOrLocalEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_HEAT_EXCHANGER_TYPE_ENUM_OBJECT:
				return convertIfcHeatExchangerTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_HEAT_FLUX_DENSITY_MEASURE:
				return convertIfcHeatFluxDensityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_HEAT_FLUX_DENSITY_MEASURE_OBJECT:
				return convertIfcHeatFluxDensityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_HEATING_VALUE_MEASURE:
				return convertIfcHeatingValueMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_HEATING_VALUE_MEASURE_OBJECT:
				return convertIfcHeatingValueMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_HOUR_IN_DAY:
				return convertIfcHourInDayToString(eDataType, instanceValue);
			case FinalPackage.IFC_HOUR_IN_DAY_OBJECT:
				return convertIfcHourInDayObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_HUMIDIFIER_TYPE_ENUM_OBJECT:
				return convertIfcHumidifierTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_IDENTIFIER:
				return convertIfcIdentifierToString(eDataType, instanceValue);
			case FinalPackage.IFC_ILLUMINANCE_MEASURE:
				return convertIfcIlluminanceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ILLUMINANCE_MEASURE_OBJECT:
				return convertIfcIlluminanceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_INDUCTANCE_MEASURE:
				return convertIfcInductanceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_INDUCTANCE_MEASURE_OBJECT:
				return convertIfcInductanceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_INTEGER:
				return convertIfcIntegerToString(eDataType, instanceValue);
			case FinalPackage.IFC_INTEGER_COUNT_RATE_MEASURE:
				return convertIfcIntegerCountRateMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_INTEGER_COUNT_RATE_MEASURE_OBJECT:
				return convertIfcIntegerCountRateMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_INTEGER_OBJECT:
				return convertIfcIntegerObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_INTERNAL_OR_EXTERNAL_ENUM_OBJECT:
				return convertIfcInternalOrExternalEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_INVENTORY_TYPE_ENUM_OBJECT:
				return convertIfcInventoryTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ION_CONCENTRATION_MEASURE:
				return convertIfcIonConcentrationMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ION_CONCENTRATION_MEASURE_OBJECT:
				return convertIfcIonConcentrationMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE:
				return convertIfcIsothermalMoistureCapacityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ISOTHERMAL_MOISTURE_CAPACITY_MEASURE_OBJECT:
				return convertIfcIsothermalMoistureCapacityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_JUNCTION_BOX_TYPE_ENUM_OBJECT:
				return convertIfcJunctionBoxTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_KINEMATIC_VISCOSITY_MEASURE:
				return convertIfcKinematicViscosityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_KINEMATIC_VISCOSITY_MEASURE_OBJECT:
				return convertIfcKinematicViscosityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LABEL:
				return convertIfcLabelToString(eDataType, instanceValue);
			case FinalPackage.IFC_LAMP_TYPE_ENUM_OBJECT:
				return convertIfcLampTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LAYER_SET_DIRECTION_ENUM_OBJECT:
				return convertIfcLayerSetDirectionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LENGTH_MEASURE:
				return convertIfcLengthMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_LENGTH_MEASURE_OBJECT:
				return convertIfcLengthMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_CURVE_ENUM_OBJECT:
				return convertIfcLightDistributionCurveEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LIGHT_EMISSION_SOURCE_ENUM_OBJECT:
				return convertIfcLightEmissionSourceEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LIGHT_FIXTURE_TYPE_ENUM_OBJECT:
				return convertIfcLightFixtureTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LINEAR_FORCE_MEASURE:
				return convertIfcLinearForceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_LINEAR_FORCE_MEASURE_OBJECT:
				return convertIfcLinearForceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LINEAR_MOMENT_MEASURE:
				return convertIfcLinearMomentMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_LINEAR_MOMENT_MEASURE_OBJECT:
				return convertIfcLinearMomentMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LINEAR_STIFFNESS_MEASURE:
				return convertIfcLinearStiffnessMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_LINEAR_STIFFNESS_MEASURE_OBJECT:
				return convertIfcLinearStiffnessMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LINEAR_VELOCITY_MEASURE:
				return convertIfcLinearVelocityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_LINEAR_VELOCITY_MEASURE_OBJECT:
				return convertIfcLinearVelocityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LOAD_GROUP_TYPE_ENUM_OBJECT:
				return convertIfcLoadGroupTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LOGICAL:
				return convertIfcLogicalToString(eDataType, instanceValue);
			case FinalPackage.IFC_LOGICAL_OPERATOR_ENUM_OBJECT:
				return convertIfcLogicalOperatorEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LUMINOUS_FLUX_MEASURE:
				return convertIfcLuminousFluxMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_LUMINOUS_FLUX_MEASURE_OBJECT:
				return convertIfcLuminousFluxMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE:
				return convertIfcLuminousIntensityDistributionMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_DISTRIBUTION_MEASURE_OBJECT:
				return convertIfcLuminousIntensityDistributionMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_MEASURE:
				return convertIfcLuminousIntensityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_LUMINOUS_INTENSITY_MEASURE_OBJECT:
				return convertIfcLuminousIntensityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MAGNETIC_FLUX_DENSITY_MEASURE:
				return convertIfcMagneticFluxDensityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MAGNETIC_FLUX_DENSITY_MEASURE_OBJECT:
				return convertIfcMagneticFluxDensityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MAGNETIC_FLUX_MEASURE:
				return convertIfcMagneticFluxMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MAGNETIC_FLUX_MEASURE_OBJECT:
				return convertIfcMagneticFluxMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MASS_DENSITY_MEASURE:
				return convertIfcMassDensityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MASS_DENSITY_MEASURE_OBJECT:
				return convertIfcMassDensityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MASS_FLOW_RATE_MEASURE:
				return convertIfcMassFlowRateMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MASS_FLOW_RATE_MEASURE_OBJECT:
				return convertIfcMassFlowRateMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MASS_MEASURE:
				return convertIfcMassMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MASS_MEASURE_OBJECT:
				return convertIfcMassMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MASS_PER_LENGTH_MEASURE:
				return convertIfcMassPerLengthMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MASS_PER_LENGTH_MEASURE_OBJECT:
				return convertIfcMassPerLengthMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MEMBER_TYPE_ENUM_OBJECT:
				return convertIfcMemberTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MINUTE_IN_HOUR:
				return convertIfcMinuteInHourToString(eDataType, instanceValue);
			case FinalPackage.IFC_MINUTE_IN_HOUR_OBJECT:
				return convertIfcMinuteInHourObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MODULUS_OF_ELASTICITY_MEASURE:
				return convertIfcModulusOfElasticityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MODULUS_OF_ELASTICITY_MEASURE_OBJECT:
				return convertIfcModulusOfElasticityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE:
				return convertIfcModulusOfLinearSubgradeReactionMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MODULUS_OF_LINEAR_SUBGRADE_REACTION_MEASURE_OBJECT:
				return convertIfcModulusOfLinearSubgradeReactionMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE:
				return convertIfcModulusOfRotationalSubgradeReactionMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MODULUS_OF_ROTATIONAL_SUBGRADE_REACTION_MEASURE_OBJECT:
				return convertIfcModulusOfRotationalSubgradeReactionMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE:
				return convertIfcModulusOfSubgradeReactionMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MODULUS_OF_SUBGRADE_REACTION_MEASURE_OBJECT:
				return convertIfcModulusOfSubgradeReactionMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MOISTURE_DIFFUSIVITY_MEASURE:
				return convertIfcMoistureDiffusivityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MOISTURE_DIFFUSIVITY_MEASURE_OBJECT:
				return convertIfcMoistureDiffusivityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MOLECULAR_WEIGHT_MEASURE:
				return convertIfcMolecularWeightMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MOLECULAR_WEIGHT_MEASURE_OBJECT:
				return convertIfcMolecularWeightMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MOMENT_OF_INERTIA_MEASURE:
				return convertIfcMomentOfInertiaMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MOMENT_OF_INERTIA_MEASURE_OBJECT:
				return convertIfcMomentOfInertiaMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MONETARY_MEASURE:
				return convertIfcMonetaryMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_MONETARY_MEASURE_OBJECT:
				return convertIfcMonetaryMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MONTH_IN_YEAR_NUMBER:
				return convertIfcMonthInYearNumberToString(eDataType, instanceValue);
			case FinalPackage.IFC_MONTH_IN_YEAR_NUMBER_OBJECT:
				return convertIfcMonthInYearNumberObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_MOTOR_CONNECTION_TYPE_ENUM_OBJECT:
				return convertIfcMotorConnectionTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_NORMALISED_RATIO_MEASURE:
				return convertIfcNormalisedRatioMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_NORMALISED_RATIO_MEASURE_OBJECT:
				return convertIfcNormalisedRatioMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_NULL_STYLE_OBJECT:
				return convertIfcNullStyleObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_NUMERIC_MEASURE:
				return convertIfcNumericMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_NUMERIC_MEASURE_OBJECT:
				return convertIfcNumericMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_OBJECTIVE_ENUM_OBJECT:
				return convertIfcObjectiveEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_OBJECT_TYPE_ENUM_OBJECT:
				return convertIfcObjectTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_OCCUPANT_TYPE_ENUM_OBJECT:
				return convertIfcOccupantTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_OUTLET_TYPE_ENUM_OBJECT:
				return convertIfcOutletTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PARAMETER_VALUE:
				return convertIfcParameterValueToString(eDataType, instanceValue);
			case FinalPackage.IFC_PARAMETER_VALUE_OBJECT:
				return convertIfcParameterValueObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PERMEABLE_COVERING_OPERATION_ENUM_OBJECT:
				return convertIfcPermeableCoveringOperationEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PH_MEASURE:
				return convertIfcPHMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_PH_MEASURE_OBJECT:
				return convertIfcPHMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PHYSICAL_OR_VIRTUAL_ENUM_OBJECT:
				return convertIfcPhysicalOrVirtualEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PILE_CONSTRUCTION_ENUM_OBJECT:
				return convertIfcPileConstructionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PILE_TYPE_ENUM_OBJECT:
				return convertIfcPileTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PIPE_FITTING_TYPE_ENUM_OBJECT:
				return convertIfcPipeFittingTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PIPE_SEGMENT_TYPE_ENUM_OBJECT:
				return convertIfcPipeSegmentTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PLANAR_FORCE_MEASURE:
				return convertIfcPlanarForceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_PLANAR_FORCE_MEASURE_OBJECT:
				return convertIfcPlanarForceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PLANE_ANGLE_MEASURE:
				return convertIfcPlaneAngleMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_PLANE_ANGLE_MEASURE_OBJECT:
				return convertIfcPlaneAngleMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PLATE_TYPE_ENUM_OBJECT:
				return convertIfcPlateTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_POSITIVE_LENGTH_MEASURE:
				return convertIfcPositiveLengthMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_POSITIVE_LENGTH_MEASURE_OBJECT:
				return convertIfcPositiveLengthMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_POSITIVE_PLANE_ANGLE_MEASURE:
				return convertIfcPositivePlaneAngleMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_POSITIVE_PLANE_ANGLE_MEASURE_OBJECT:
				return convertIfcPositivePlaneAngleMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_POSITIVE_RATIO_MEASURE:
				return convertIfcPositiveRatioMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_POSITIVE_RATIO_MEASURE_OBJECT:
				return convertIfcPositiveRatioMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_POWER_MEASURE:
				return convertIfcPowerMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_POWER_MEASURE_OBJECT:
				return convertIfcPowerMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PRESENTABLE_TEXT:
				return convertIfcPresentableTextToString(eDataType, instanceValue);
			case FinalPackage.IFC_PRESSURE_MEASURE:
				return convertIfcPressureMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_PRESSURE_MEASURE_OBJECT:
				return convertIfcPressureMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROCEDURE_TYPE_ENUM_OBJECT:
				return convertIfcProcedureTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROFILE_TYPE_ENUM_OBJECT:
				return convertIfcProfileTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROJECTED_OR_TRUE_LENGTH_ENUM_OBJECT:
				return convertIfcProjectedOrTrueLengthEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROJECT_ORDER_RECORD_TYPE_ENUM_OBJECT:
				return convertIfcProjectOrderRecordTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROJECT_ORDER_TYPE_ENUM_OBJECT:
				return convertIfcProjectOrderTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROPERTY_SOURCE_ENUM_OBJECT:
				return convertIfcPropertySourceEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PROTECTIVE_DEVICE_TYPE_ENUM_OBJECT:
				return convertIfcProtectiveDeviceTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_PUMP_TYPE_ENUM_OBJECT:
				return convertIfcPumpTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_RADIO_ACTIVITY_MEASURE:
				return convertIfcRadioActivityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_RADIO_ACTIVITY_MEASURE_OBJECT:
				return convertIfcRadioActivityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_RAILING_TYPE_ENUM_OBJECT:
				return convertIfcRailingTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_RAMP_FLIGHT_TYPE_ENUM_OBJECT:
				return convertIfcRampFlightTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_RAMP_TYPE_ENUM_OBJECT:
				return convertIfcRampTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_RATIO_MEASURE:
				return convertIfcRatioMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_RATIO_MEASURE_OBJECT:
				return convertIfcRatioMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_REAL:
				return convertIfcRealToString(eDataType, instanceValue);
			case FinalPackage.IFC_REAL_OBJECT:
				return convertIfcRealObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_REFLECTANCE_METHOD_ENUM_OBJECT:
				return convertIfcReflectanceMethodEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_REINFORCING_BAR_ROLE_ENUM_OBJECT:
				return convertIfcReinforcingBarRoleEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_REINFORCING_BAR_SURFACE_ENUM_OBJECT:
				return convertIfcReinforcingBarSurfaceEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_RESOURCE_CONSUMPTION_ENUM_OBJECT:
				return convertIfcResourceConsumptionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_RIB_PLATE_DIRECTION_ENUM_OBJECT:
				return convertIfcRibPlateDirectionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROLE_ENUM_OBJECT:
				return convertIfcRoleEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROOF_TYPE_ENUM_OBJECT:
				return convertIfcRoofTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROTATIONAL_FREQUENCY_MEASURE:
				return convertIfcRotationalFrequencyMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROTATIONAL_FREQUENCY_MEASURE_OBJECT:
				return convertIfcRotationalFrequencyMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROTATIONAL_MASS_MEASURE:
				return convertIfcRotationalMassMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROTATIONAL_MASS_MEASURE_OBJECT:
				return convertIfcRotationalMassMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROTATIONAL_STIFFNESS_MEASURE:
				return convertIfcRotationalStiffnessMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_ROTATIONAL_STIFFNESS_MEASURE_OBJECT:
				return convertIfcRotationalStiffnessMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SANITARY_TERMINAL_TYPE_ENUM_OBJECT:
				return convertIfcSanitaryTerminalTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SECOND_IN_MINUTE:
				return convertIfcSecondInMinuteToString(eDataType, instanceValue);
			case FinalPackage.IFC_SECOND_IN_MINUTE_OBJECT:
				return convertIfcSecondInMinuteObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SECTIONAL_AREA_INTEGRAL_MEASURE:
				return convertIfcSectionalAreaIntegralMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_SECTIONAL_AREA_INTEGRAL_MEASURE_OBJECT:
				return convertIfcSectionalAreaIntegralMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SECTION_MODULUS_MEASURE:
				return convertIfcSectionModulusMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_SECTION_MODULUS_MEASURE_OBJECT:
				return convertIfcSectionModulusMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SECTION_TYPE_ENUM_OBJECT:
				return convertIfcSectionTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SENSOR_TYPE_ENUM_OBJECT:
				return convertIfcSensorTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SEQUENCE_ENUM_OBJECT:
				return convertIfcSequenceEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR_TYPE_ENUM_OBJECT:
				return convertIfcServiceLifeFactorTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SERVICE_LIFE_TYPE_ENUM_OBJECT:
				return convertIfcServiceLifeTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SHEAR_MODULUS_MEASURE:
				return convertIfcShearModulusMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_SHEAR_MODULUS_MEASURE_OBJECT:
				return convertIfcShearModulusMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SI_PREFIX_OBJECT:
				return convertIfcSIPrefixObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SI_UNIT_NAME_OBJECT:
				return convertIfcSIUnitNameObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SLAB_TYPE_ENUM_OBJECT:
				return convertIfcSlabTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SOLID_ANGLE_MEASURE:
				return convertIfcSolidAngleMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_SOLID_ANGLE_MEASURE_OBJECT:
				return convertIfcSolidAngleMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SOUND_POWER_MEASURE:
				return convertIfcSoundPowerMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_SOUND_POWER_MEASURE_OBJECT:
				return convertIfcSoundPowerMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SOUND_PRESSURE_MEASURE:
				return convertIfcSoundPressureMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_SOUND_PRESSURE_MEASURE_OBJECT:
				return convertIfcSoundPressureMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SOUND_SCALE_ENUM_OBJECT:
				return convertIfcSoundScaleEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPACE_HEATER_TYPE_ENUM_OBJECT:
				return convertIfcSpaceHeaterTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPACE_TYPE_ENUM_OBJECT:
				return convertIfcSpaceTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPECIFIC_HEAT_CAPACITY_MEASURE:
				return convertIfcSpecificHeatCapacityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPECIFIC_HEAT_CAPACITY_MEASURE_OBJECT:
				return convertIfcSpecificHeatCapacityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPECULAR_EXPONENT:
				return convertIfcSpecularExponentToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPECULAR_EXPONENT_OBJECT:
				return convertIfcSpecularExponentObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPECULAR_ROUGHNESS:
				return convertIfcSpecularRoughnessToString(eDataType, instanceValue);
			case FinalPackage.IFC_SPECULAR_ROUGHNESS_OBJECT:
				return convertIfcSpecularRoughnessObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_STACK_TERMINAL_TYPE_ENUM_OBJECT:
				return convertIfcStackTerminalTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_STAIR_FLIGHT_TYPE_ENUM_OBJECT:
				return convertIfcStairFlightTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_STAIR_TYPE_ENUM_OBJECT:
				return convertIfcStairTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_STATE_ENUM_OBJECT:
				return convertIfcStateEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_STRUCTURAL_CURVE_TYPE_ENUM_OBJECT:
				return convertIfcStructuralCurveTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_STRUCTURAL_SURFACE_TYPE_ENUM_OBJECT:
				return convertIfcStructuralSurfaceTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SURFACE_SIDE_OBJECT:
				return convertIfcSurfaceSideObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SURFACE_TEXTURE_ENUM_OBJECT:
				return convertIfcSurfaceTextureEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_SWITCHING_DEVICE_TYPE_ENUM_OBJECT:
				return convertIfcSwitchingDeviceTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TANK_TYPE_ENUM_OBJECT:
				return convertIfcTankTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TEMPERATURE_GRADIENT_MEASURE:
				return convertIfcTemperatureGradientMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_TEMPERATURE_GRADIENT_MEASURE_OBJECT:
				return convertIfcTemperatureGradientMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TENDON_TYPE_ENUM_OBJECT:
				return convertIfcTendonTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TEXT:
				return convertIfcTextToString(eDataType, instanceValue);
			case FinalPackage.IFC_TEXT_ALIGNMENT:
				return convertIfcTextAlignmentToString(eDataType, instanceValue);
			case FinalPackage.IFC_TEXT_DECORATION:
				return convertIfcTextDecorationToString(eDataType, instanceValue);
			case FinalPackage.IFC_TEXT_FONT_NAME:
				return convertIfcTextFontNameToString(eDataType, instanceValue);
			case FinalPackage.IFC_TEXT_PATH_OBJECT:
				return convertIfcTextPathObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TEXT_TRANSFORMATION:
				return convertIfcTextTransformationToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_ADMITTANCE_MEASURE:
				return convertIfcThermalAdmittanceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_ADMITTANCE_MEASURE_OBJECT:
				return convertIfcThermalAdmittanceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_CONDUCTIVITY_MEASURE:
				return convertIfcThermalConductivityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_CONDUCTIVITY_MEASURE_OBJECT:
				return convertIfcThermalConductivityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE:
				return convertIfcThermalExpansionCoefficientMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_EXPANSION_COEFFICIENT_MEASURE_OBJECT:
				return convertIfcThermalExpansionCoefficientMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_LOAD_SOURCE_ENUM_OBJECT:
				return convertIfcThermalLoadSourceEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_LOAD_TYPE_ENUM_OBJECT:
				return convertIfcThermalLoadTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_RESISTANCE_MEASURE:
				return convertIfcThermalResistanceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_RESISTANCE_MEASURE_OBJECT:
				return convertIfcThermalResistanceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_TRANSMITTANCE_MEASURE:
				return convertIfcThermalTransmittanceMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMAL_TRANSMITTANCE_MEASURE_OBJECT:
				return convertIfcThermalTransmittanceMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMODYNAMIC_TEMPERATURE_MEASURE:
				return convertIfcThermodynamicTemperatureMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_THERMODYNAMIC_TEMPERATURE_MEASURE_OBJECT:
				return convertIfcThermodynamicTemperatureMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TIME_MEASURE:
				return convertIfcTimeMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_TIME_MEASURE_OBJECT:
				return convertIfcTimeMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TIME_SERIES_DATA_TYPE_ENUM_OBJECT:
				return convertIfcTimeSeriesDataTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TIME_SERIES_SCHEDULE_TYPE_ENUM_OBJECT:
				return convertIfcTimeSeriesScheduleTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TIME_STAMP:
				return convertIfcTimeStampToString(eDataType, instanceValue);
			case FinalPackage.IFC_TIME_STAMP_OBJECT:
				return convertIfcTimeStampObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TORQUE_MEASURE:
				return convertIfcTorqueMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_TORQUE_MEASURE_OBJECT:
				return convertIfcTorqueMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TRANSFORMER_TYPE_ENUM_OBJECT:
				return convertIfcTransformerTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TRANSITION_CODE_OBJECT:
				return convertIfcTransitionCodeObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TRANSPORT_ELEMENT_TYPE_ENUM_OBJECT:
				return convertIfcTransportElementTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TRIMMING_PREFERENCE_OBJECT:
				return convertIfcTrimmingPreferenceObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_TUBE_BUNDLE_TYPE_ENUM_OBJECT:
				return convertIfcTubeBundleTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_UNITARY_EQUIPMENT_TYPE_ENUM_OBJECT:
				return convertIfcUnitaryEquipmentTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_UNIT_ENUM_OBJECT:
				return convertIfcUnitEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_VALVE_TYPE_ENUM_OBJECT:
				return convertIfcValveTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_VAPOR_PERMEABILITY_MEASURE:
				return convertIfcVaporPermeabilityMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_VAPOR_PERMEABILITY_MEASURE_OBJECT:
				return convertIfcVaporPermeabilityMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_VIBRATION_ISOLATOR_TYPE_ENUM_OBJECT:
				return convertIfcVibrationIsolatorTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_VOLUME_MEASURE:
				return convertIfcVolumeMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_VOLUME_MEASURE_OBJECT:
				return convertIfcVolumeMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_VOLUMETRIC_FLOW_RATE_MEASURE:
				return convertIfcVolumetricFlowRateMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_VOLUMETRIC_FLOW_RATE_MEASURE_OBJECT:
				return convertIfcVolumetricFlowRateMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_WALL_TYPE_ENUM_OBJECT:
				return convertIfcWallTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_WARPING_CONSTANT_MEASURE:
				return convertIfcWarpingConstantMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_WARPING_CONSTANT_MEASURE_OBJECT:
				return convertIfcWarpingConstantMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_WARPING_MOMENT_MEASURE:
				return convertIfcWarpingMomentMeasureToString(eDataType, instanceValue);
			case FinalPackage.IFC_WARPING_MOMENT_MEASURE_OBJECT:
				return convertIfcWarpingMomentMeasureObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_WASTE_TERMINAL_TYPE_ENUM_OBJECT:
				return convertIfcWasteTerminalTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_WINDOW_PANEL_OPERATION_ENUM_OBJECT:
				return convertIfcWindowPanelOperationEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_WINDOW_PANEL_POSITION_ENUM_OBJECT:
				return convertIfcWindowPanelPositionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_WINDOW_STYLE_CONSTRUCTION_ENUM_OBJECT:
				return convertIfcWindowStyleConstructionEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_WINDOW_STYLE_OPERATION_ENUM_OBJECT:
				return convertIfcWindowStyleOperationEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_WORK_CONTROL_TYPE_ENUM_OBJECT:
				return convertIfcWorkControlTypeEnumObjectToString(eDataType, instanceValue);
			case FinalPackage.IFC_YEAR_NUMBER:
				return convertIfcYearNumberToString(eDataType, instanceValue);
			case FinalPackage.IFC_YEAR_NUMBER_OBJECT:
				return convertIfcYearNumberObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActingRoleType createActingRoleType() {
		ActingRoleTypeImpl actingRoleType = new ActingRoleTypeImpl();
		return actingRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorType createActorType() {
		ActorTypeImpl actorType = new ActorTypeImpl();
		return actorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualFinishType createActualFinishType() {
		ActualFinishTypeImpl actualFinishType = new ActualFinishTypeImpl();
		return actualFinishType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActualStartType createActualStartType() {
		ActualStartTypeImpl actualStartType = new ActualStartTypeImpl();
		return actualStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalConditionsType createAdditionalConditionsType() {
		AdditionalConditionsTypeImpl additionalConditionsType = new AdditionalConditionsTypeImpl();
		return additionalConditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressesType createAddressesType() {
		AddressesTypeImpl addressesType = new AddressesTypeImpl();
		return addressesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressesType1 createAddressesType1() {
		AddressesType1Impl addressesType1 = new AddressesType1Impl();
		return addressesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressLinesType createAddressLinesType() {
		AddressLinesTypeImpl addressLinesType = new AddressLinesTypeImpl();
		return addressLinesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedCurveType createAnnotatedCurveType() {
		AnnotatedCurveTypeImpl annotatedCurveType = new AnnotatedCurveTypeImpl();
		return annotatedCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableDatesType createApplicableDatesType() {
		ApplicableDatesTypeImpl applicableDatesType = new ApplicableDatesTypeImpl();
		return applicableDatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicableDateType createApplicableDateType() {
		ApplicableDateTypeImpl applicableDateType = new ApplicableDateTypeImpl();
		return applicableDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDeveloperType createApplicationDeveloperType() {
		ApplicationDeveloperTypeImpl applicationDeveloperType = new ApplicationDeveloperTypeImpl();
		return applicationDeveloperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedConditionType createAppliedConditionType() {
		AppliedConditionTypeImpl appliedConditionType = new AppliedConditionTypeImpl();
		return appliedConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedConditionType1 createAppliedConditionType1() {
		AppliedConditionType1Impl appliedConditionType1 = new AppliedConditionType1Impl();
		return appliedConditionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedLoadType createAppliedLoadType() {
		AppliedLoadTypeImpl appliedLoadType = new AppliedLoadTypeImpl();
		return appliedLoadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedValueType createAppliedValueType() {
		AppliedValueTypeImpl appliedValueType = new AppliedValueTypeImpl();
		return appliedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalDateTimeType createApprovalDateTimeType() {
		ApprovalDateTimeTypeImpl approvalDateTimeType = new ApprovalDateTimeTypeImpl();
		return approvalDateTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalType createApprovalType() {
		ApprovalTypeImpl approvalType = new ApprovalTypeImpl();
		return approvalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalType1 createApprovalType1() {
		ApprovalType1Impl approvalType1 = new ApprovalType1Impl();
		return approvalType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovedPropertiesType createApprovedPropertiesType() {
		ApprovedPropertiesTypeImpl approvedPropertiesType = new ApprovedPropertiesTypeImpl();
		return approvedPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedItemsType createAssignedItemsType() {
		AssignedItemsTypeImpl assignedItemsType = new AssignedItemsTypeImpl();
		return assignedItemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis1Type createAxis1Type() {
		Axis1TypeImpl axis1Type = new Axis1TypeImpl();
		return axis1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis2Type createAxis2Type() {
		Axis2TypeImpl axis2Type = new Axis2TypeImpl();
		return axis2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis3Type createAxis3Type() {
		Axis3TypeImpl axis3Type = new Axis3TypeImpl();
		return axis3Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisCurveType createAxisCurveType() {
		AxisCurveTypeImpl axisCurveType = new AxisCurveTypeImpl();
		return axisCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisPositionType createAxisPositionType() {
		AxisPositionTypeImpl axisPositionType = new AxisPositionTypeImpl();
		return axisPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType createAxisType() {
		AxisTypeImpl axisType = new AxisTypeImpl();
		return axisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType1 createAxisType1() {
		AxisType1Impl axisType1 = new AxisType1Impl();
		return axisType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType2 createAxisType2() {
		AxisType2Impl axisType2 = new AxisType2Impl();
		return axisType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundColourType createBackgroundColourType() {
		BackgroundColourTypeImpl backgroundColourType = new BackgroundColourTypeImpl();
		return backgroundColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseQuantityType createBaseQuantityType() {
		BaseQuantityTypeImpl baseQuantityType = new BaseQuantityTypeImpl();
		return baseQuantityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseSurfaceType createBaseSurfaceType() {
		BaseSurfaceTypeImpl baseSurfaceType = new BaseSurfaceTypeImpl();
		return baseSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisCurveType createBasisCurveType() {
		BasisCurveTypeImpl basisCurveType = new BasisCurveTypeImpl();
		return basisCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisCurveType1 createBasisCurveType1() {
		BasisCurveType1Impl basisCurveType1 = new BasisCurveType1Impl();
		return basisCurveType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisCurveType2 createBasisCurveType2() {
		BasisCurveType2Impl basisCurveType2 = new BasisCurveType2Impl();
		return basisCurveType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisCurveType3 createBasisCurveType3() {
		BasisCurveType3Impl basisCurveType3 = new BasisCurveType3Impl();
		return basisCurveType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisSurfaceType createBasisSurfaceType() {
		BasisSurfaceTypeImpl basisSurfaceType = new BasisSurfaceTypeImpl();
		return basisSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisSurfaceType1 createBasisSurfaceType1() {
		BasisSurfaceType1Impl basisSurfaceType1 = new BasisSurfaceType1Impl();
		return basisSurfaceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisSurfaceType2 createBasisSurfaceType2() {
		BasisSurfaceType2Impl basisSurfaceType2 = new BasisSurfaceType2Impl();
		return basisSurfaceType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenchmarkValuesType createBenchmarkValuesType() {
		BenchmarkValuesTypeImpl benchmarkValuesType = new BenchmarkValuesTypeImpl();
		return benchmarkValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundsType createBoundsType() {
		BoundsTypeImpl boundsType = new BoundsTypeImpl();
		return boundsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundType createBoundType() {
		BoundTypeImpl boundType = new BoundTypeImpl();
		return boundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingAddressType createBuildingAddressType() {
		BuildingAddressTypeImpl buildingAddressType = new BuildingAddressTypeImpl();
		return buildingAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausedByType createCausedByType() {
		CausedByTypeImpl causedByType = new CausedByTypeImpl();
		return causedByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CfsFacesType createCfsFacesType() {
		CfsFacesTypeImpl cfsFacesType = new CfsFacesTypeImpl();
		return cfsFacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterSpacingType createCharacterSpacingType() {
		CharacterSpacingTypeImpl characterSpacingType = new CharacterSpacingTypeImpl();
		return characterSpacingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiedConstraintType createClassifiedConstraintType() {
		ClassifiedConstraintTypeImpl classifiedConstraintType = new ClassifiedConstraintTypeImpl();
		return classifiedConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiedMaterialType createClassifiedMaterialType() {
		ClassifiedMaterialTypeImpl classifiedMaterialType = new ClassifiedMaterialTypeImpl();
		return classifiedMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColourAppearanceType createColourAppearanceType() {
		ColourAppearanceTypeImpl colourAppearanceType = new ColourAppearanceTypeImpl();
		return colourAppearanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColourType createColourType() {
		ColourTypeImpl colourType = new ColourTypeImpl();
		return colourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOfTotalType createComponentOfTotalType() {
		ComponentOfTotalTypeImpl componentOfTotalType = new ComponentOfTotalTypeImpl();
		return componentOfTotalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsType createComponentsType() {
		ComponentsTypeImpl componentsType = new ComponentsTypeImpl();
		return componentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionCoordinateSystemType createConditionCoordinateSystemType() {
		ConditionCoordinateSystemTypeImpl conditionCoordinateSystemType = new ConditionCoordinateSystemTypeImpl();
		return conditionCoordinateSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionConstraintType createConnectionConstraintType() {
		ConnectionConstraintTypeImpl connectionConstraintType = new ConnectionConstraintTypeImpl();
		return connectionConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionGeometryType createConnectionGeometryType() {
		ConnectionGeometryTypeImpl connectionGeometryType = new ConnectionGeometryTypeImpl();
		return connectionGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionGeometryType1 createConnectionGeometryType1() {
		ConnectionGeometryType1Impl connectionGeometryType1 = new ConnectionGeometryType1Impl();
		return connectionGeometryType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentsType createContentsType() {
		ContentsTypeImpl contentsType = new ContentsTypeImpl();
		return contentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextOfItemsType createContextOfItemsType() {
		ContextOfItemsTypeImpl contextOfItemsType = new ContextOfItemsTypeImpl();
		return contextOfItemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPointsListType createControlPointsListType() {
		ControlPointsListTypeImpl controlPointsListType = new ControlPointsListTypeImpl();
		return controlPointsListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionFactorType createConversionFactorType() {
		ConversionFactorTypeImpl conversionFactorType = new ConversionFactorTypeImpl();
		return conversionFactorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesType createCoordinatesType() {
		CoordinatesTypeImpl coordinatesType = new CoordinatesTypeImpl();
		return coordinatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinatesType1 createCoordinatesType1() {
		CoordinatesType1Impl coordinatesType1 = new CoordinatesType1Impl();
		return coordinatesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CornerType createCornerType() {
		CornerTypeImpl cornerType = new CornerTypeImpl();
		return cornerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatingActorType createCreatingActorType() {
		CreatingActorTypeImpl creatingActorType = new CreatingActorTypeImpl();
		return creatingActorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationDateType createCreationDateType() {
		CreationDateTypeImpl creationDateType = new CreationDateTypeImpl();
		return creationDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationTimeType createCreationTimeType() {
		CreationTimeTypeImpl creationTimeType = new CreationTimeTypeImpl();
		return creationTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationTimeType1 createCreationTimeType1() {
		CreationTimeType1Impl creationTimeType1 = new CreationTimeType1Impl();
		return creationTimeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatorsType createCreatorsType() {
		CreatorsTypeImpl creatorsType = new CreatorsTypeImpl();
		return creatorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionDateTimeType createCriterionDateTimeType() {
		CriterionDateTimeTypeImpl criterionDateTimeType = new CriterionDateTimeTypeImpl();
		return criterionDateTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriterionType createCriterionType() {
		CriterionTypeImpl criterionType = new CriterionTypeImpl();
		return criterionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossSectionPositionsType createCrossSectionPositionsType() {
		CrossSectionPositionsTypeImpl crossSectionPositionsType = new CrossSectionPositionsTypeImpl();
		return crossSectionPositionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossSectionReinforcementDefinitionsType createCrossSectionReinforcementDefinitionsType() {
		CrossSectionReinforcementDefinitionsTypeImpl crossSectionReinforcementDefinitionsType = new CrossSectionReinforcementDefinitionsTypeImpl();
		return crossSectionReinforcementDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossSectionsType createCrossSectionsType() {
		CrossSectionsTypeImpl crossSectionsType = new CrossSectionsTypeImpl();
		return crossSectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentValueType createCurrentValueType() {
		CurrentValueTypeImpl currentValueType = new CurrentValueTypeImpl();
		return currentValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentValueType1 createCurrentValueType1() {
		CurrentValueType1Impl currentValueType1 = new CurrentValueType1Impl();
		return currentValueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveColourType createCurveColourType() {
		CurveColourTypeImpl curveColourType = new CurveColourTypeImpl();
		return curveColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveFontType createCurveFontType() {
		CurveFontTypeImpl curveFontType = new CurveFontTypeImpl();
		return curveFontType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveFontType1 createCurveFontType1() {
		CurveFontType1Impl curveFontType1 = new CurveFontType1Impl();
		return curveFontType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveOnRelatedElementType createCurveOnRelatedElementType() {
		CurveOnRelatedElementTypeImpl curveOnRelatedElementType = new CurveOnRelatedElementTypeImpl();
		return curveOnRelatedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveOnRelatingElementType createCurveOnRelatingElementType() {
		CurveOnRelatingElementTypeImpl curveOnRelatingElementType = new CurveOnRelatingElementTypeImpl();
		return curveOnRelatingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveType createCurveType() {
		CurveTypeImpl curveType = new CurveTypeImpl();
		return curveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveWidthType createCurveWidthType() {
		CurveWidthTypeImpl curveWidthType = new CurveWidthTypeImpl();
		return curveWidthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValueType createDataValueType() {
		DataValueTypeImpl dataValueType = new DataValueTypeImpl();
		return dataValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateComponentType createDateComponentType() {
		DateComponentTypeImpl dateComponentType = new DateComponentTypeImpl();
		return dateComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedUnitType createDefinedUnitType() {
		DefinedUnitTypeImpl definedUnitType = new DefinedUnitTypeImpl();
		return definedUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedValuesType createDefinedValuesType() {
		DefinedValuesTypeImpl definedValuesType = new DefinedValuesTypeImpl();
		return definedValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefiningUnitType createDefiningUnitType() {
		DefiningUnitTypeImpl definingUnitType = new DefiningUnitTypeImpl();
		return definingUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefiningValuesType createDefiningValuesType() {
		DefiningValuesTypeImpl definingValuesType = new DefiningValuesTypeImpl();
		return definingValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionType createDefinitionType() {
		DefinitionTypeImpl definitionType = new DefinitionTypeImpl();
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependantPropertyType createDependantPropertyType() {
		DependantPropertyTypeImpl dependantPropertyType = new DependantPropertyTypeImpl();
		return dependantPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependingPropertyType createDependingPropertyType() {
		DependingPropertyTypeImpl dependingPropertyType = new DependingPropertyTypeImpl();
		return dependingPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepreciatedValueType createDepreciatedValueType() {
		DepreciatedValueTypeImpl depreciatedValueType = new DepreciatedValueTypeImpl();
		return depreciatedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffuseColourType createDiffuseColourType() {
		DiffuseColourTypeImpl diffuseColourType = new DiffuseColourTypeImpl();
		return diffuseColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffuseReflectionColourType createDiffuseReflectionColourType() {
		DiffuseReflectionColourTypeImpl diffuseReflectionColourType = new DiffuseReflectionColourTypeImpl();
		return diffuseReflectionColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffuseTransmissionColourType createDiffuseTransmissionColourType() {
		DiffuseTransmissionColourTypeImpl diffuseTransmissionColourType = new DiffuseTransmissionColourTypeImpl();
		return diffuseTransmissionColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffuseTransmissionColourType1 createDiffuseTransmissionColourType1() {
		DiffuseTransmissionColourType1Impl diffuseTransmissionColourType1 = new DiffuseTransmissionColourType1Impl();
		return diffuseTransmissionColourType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType createDimensionsType() {
		DimensionsTypeImpl dimensionsType = new DimensionsTypeImpl();
		return dimensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionRatiosType createDirectionRatiosType() {
		DirectionRatiosTypeImpl directionRatiosType = new DirectionRatiosTypeImpl();
		return directionRatiosType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectrixType createDirectrixType() {
		DirectrixTypeImpl directrixType = new DirectrixTypeImpl();
		return directrixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectrixType1 createDirectrixType1() {
		DirectrixType1Impl directrixType1 = new DirectrixType1Impl();
		return directrixType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirType() {
		DirTypeImpl dirType = new DirTypeImpl();
		return dirType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionDataType createDistributionDataType() {
		DistributionDataTypeImpl distributionDataType = new DistributionDataTypeImpl();
		return distributionDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentOwnerType createDocumentOwnerType() {
		DocumentOwnerTypeImpl documentOwnerType = new DocumentOwnerTypeImpl();
		return documentOwnerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReferencesType createDocumentReferencesType() {
		DocumentReferencesTypeImpl documentReferencesType = new DocumentReferencesTypeImpl();
		return documentReferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyFinishType createEarlyFinishType() {
		EarlyFinishTypeImpl earlyFinishType = new EarlyFinishTypeImpl();
		return earlyFinishType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyStartType createEarlyStartType() {
		EarlyStartTypeImpl earlyStartType = new EarlyStartTypeImpl();
		return earlyStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeElementType createEdgeElementType() {
		EdgeElementTypeImpl edgeElementType = new EdgeElementTypeImpl();
		return edgeElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeEndType createEdgeEndType() {
		EdgeEndTypeImpl edgeEndType = new EdgeEndTypeImpl();
		return edgeEndType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeGeometryType createEdgeGeometryType() {
		EdgeGeometryTypeImpl edgeGeometryType = new EdgeGeometryTypeImpl();
		return edgeGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeListType createEdgeListType() {
		EdgeListTypeImpl edgeListType = new EdgeListTypeImpl();
		return edgeListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeListType1 createEdgeListType1() {
		EdgeListType1Impl edgeListType1 = new EdgeListType1Impl();
		return edgeListType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeStartType createEdgeStartType() {
		EdgeStartTypeImpl edgeStartType = new EdgeStartTypeImpl();
		return edgeStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionDateType createEditionDateType() {
		EditionDateTypeImpl editionDateType = new EditionDateTypeImpl();
		return editionDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorsType createEditorsType() {
		EditorsTypeImpl editorsType = new EditorsTypeImpl();
		return editorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicFormatType createElectronicFormatType() {
		ElectronicFormatTypeImpl electronicFormatType = new ElectronicFormatTypeImpl();
		return electronicFormatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicMailAddressesType createElectronicMailAddressesType() {
		ElectronicMailAddressesTypeImpl electronicMailAddressesType = new ElectronicMailAddressesTypeImpl();
		return electronicMailAddressesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementsType createElementsType() {
		ElementsTypeImpl elementsType = new ElementsTypeImpl();
		return elementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementsType1 createElementsType1() {
		ElementsType1Impl elementsType1 = new ElementsType1Impl();
		return elementsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnclosureType createEnclosureType() {
		EnclosureTypeImpl enclosureType = new EnclosureTypeImpl();
		return enclosureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProfileType createEndProfileType() {
		EndProfileTypeImpl endProfileType = new EndProfileTypeImpl();
		return endProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndTimeType createEndTimeType() {
		EndTimeTypeImpl endTimeType = new EndTimeTypeImpl();
		return endTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationReferenceType createEnumerationReferenceType() {
		EnumerationReferenceTypeImpl enumerationReferenceType = new EnumerationReferenceTypeImpl();
		return enumerationReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValuesType createEnumerationValuesType() {
		EnumerationValuesTypeImpl enumerationValuesType = new EnumerationValuesTypeImpl();
		return enumerationValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValuesType1 createEnumerationValuesType1() {
		EnumerationValuesType1Impl enumerationValuesType1 = new EnumerationValuesType1Impl();
		return enumerationValuesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPropertiesType createExtendedPropertiesType() {
		ExtendedPropertiesTypeImpl extendedPropertiesType = new ExtendedPropertiesTypeImpl();
		return extendedPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtentType createExtentType() {
		ExtentTypeImpl extentType = new ExtentTypeImpl();
		return extentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrudedDirectionType createExtrudedDirectionType() {
		ExtrudedDirectionTypeImpl extrudedDirectionType = new ExtrudedDirectionTypeImpl();
		return extrudedDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrudedDirectionType1 createExtrudedDirectionType1() {
		ExtrudedDirectionType1Impl extrudedDirectionType1 = new ExtrudedDirectionType1Impl();
		return extrudedDirectionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaceSurfaceType createFaceSurfaceType() {
		FaceSurfaceTypeImpl faceSurfaceType = new FaceSurfaceTypeImpl();
		return faceSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacsimileNumbersType createFacsimileNumbersType() {
		FacsimileNumbersTypeImpl facsimileNumbersType = new FacsimileNumbersTypeImpl();
		return facsimileNumbersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FbsmFacesType createFbsmFacesType() {
		FbsmFacesTypeImpl fbsmFacesType = new FbsmFacesTypeImpl();
		return fbsmFacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillStylesType createFillStylesType() {
		FillStylesTypeImpl fillStylesType = new FillStylesTypeImpl();
		return fillStylesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillStyleTargetType createFillStyleTargetType() {
		FillStyleTargetTypeImpl fillStyleTargetType = new FillStyleTargetTypeImpl();
		return fillStyleTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishTimeType createFinishTimeType() {
		FinishTimeTypeImpl finishTimeType = new FinishTimeTypeImpl();
		return finishTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstOperandType createFirstOperandType() {
		FirstOperandTypeImpl firstOperandType = new FirstOperandTypeImpl();
		return firstOperandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedUntilDateType createFixedUntilDateType() {
		FixedUntilDateTypeImpl fixedUntilDateType = new FixedUntilDateTypeImpl();
		return fixedUntilDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowConditionTimeSeriesType createFlowConditionTimeSeriesType() {
		FlowConditionTimeSeriesTypeImpl flowConditionTimeSeriesType = new FlowConditionTimeSeriesTypeImpl();
		return flowConditionTimeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowrateSingleValueType createFlowrateSingleValueType() {
		FlowrateSingleValueTypeImpl flowrateSingleValueType = new FlowrateSingleValueTypeImpl();
		return flowrateSingleValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowrateTimeSeriesType createFlowrateTimeSeriesType() {
		FlowrateTimeSeriesTypeImpl flowrateTimeSeriesType = new FlowrateTimeSeriesTypeImpl();
		return flowrateTimeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FluidType createFluidType() {
		FluidTypeImpl fluidType = new FluidTypeImpl();
		return fluidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyType createFontFamilyType() {
		FontFamilyTypeImpl fontFamilyType = new FontFamilyTypeImpl();
		return fontFamilyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontSizeType createFontSizeType() {
		FontSizeTypeImpl fontSizeType = new FontSizeTypeImpl();
		return fontSizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLayerSetType createForLayerSetType() {
		ForLayerSetTypeImpl forLayerSetType = new ForLayerSetTypeImpl();
		return forLayerSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasPropertiesType createHasPropertiesType() {
		HasPropertiesTypeImpl hasPropertiesType = new HasPropertiesTypeImpl();
		return hasPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasPropertiesType1 createHasPropertiesType1() {
		HasPropertiesType1Impl hasPropertiesType1 = new HasPropertiesType1Impl();
		return hasPropertiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasPropertySetsType createHasPropertySetsType() {
		HasPropertySetsTypeImpl hasPropertySetsType = new HasPropertySetsTypeImpl();
		return hasPropertySetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasQuantitiesType createHasQuantitiesType() {
		HasQuantitiesTypeImpl hasQuantitiesType = new HasQuantitiesTypeImpl();
		return hasQuantitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasResultsType createHasResultsType() {
		HasResultsTypeImpl hasResultsType = new HasResultsTypeImpl();
		return hasResultsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HatchLineAppearanceType createHatchLineAppearanceType() {
		HatchLineAppearanceTypeImpl hatchLineAppearanceType = new HatchLineAppearanceTypeImpl();
		return hatchLineAppearanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ifc2DCompositeCurve createIfc2DCompositeCurve() {
		Ifc2DCompositeCurveImpl ifc2DCompositeCurve = new Ifc2DCompositeCurveImpl();
		return ifc2DCompositeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAbsorbedDoseMeasureType createIfcAbsorbedDoseMeasureType() {
		IfcAbsorbedDoseMeasureTypeImpl ifcAbsorbedDoseMeasureType = new IfcAbsorbedDoseMeasureTypeImpl();
		return ifcAbsorbedDoseMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAccelerationMeasureType createIfcAccelerationMeasureType() {
		IfcAccelerationMeasureTypeImpl ifcAccelerationMeasureType = new IfcAccelerationMeasureTypeImpl();
		return ifcAccelerationMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionRequest createIfcActionRequest() {
		IfcActionRequestImpl ifcActionRequest = new IfcActionRequestImpl();
		return ifcActionRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionSourceTypeEnumType createIfcActionSourceTypeEnumType() {
		IfcActionSourceTypeEnumTypeImpl ifcActionSourceTypeEnumType = new IfcActionSourceTypeEnumTypeImpl();
		return ifcActionSourceTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionTypeEnumType createIfcActionTypeEnumType() {
		IfcActionTypeEnumTypeImpl ifcActionTypeEnumType = new IfcActionTypeEnumTypeImpl();
		return ifcActionTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActor createIfcActor() {
		IfcActorImpl ifcActor = new IfcActorImpl();
		return ifcActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorRole createIfcActorRole() {
		IfcActorRoleImpl ifcActorRole = new IfcActorRoleImpl();
		return ifcActorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect createIfcActorSelect() {
		IfcActorSelectImpl ifcActorSelect = new IfcActorSelectImpl();
		return ifcActorSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActuatorType createIfcActuatorType() {
		IfcActuatorTypeImpl ifcActuatorType = new IfcActuatorTypeImpl();
		return ifcActuatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActuatorTypeEnumType createIfcActuatorTypeEnumType() {
		IfcActuatorTypeEnumTypeImpl ifcActuatorTypeEnumType = new IfcActuatorTypeEnumTypeImpl();
		return ifcActuatorTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAddressTypeEnumType createIfcAddressTypeEnumType() {
		IfcAddressTypeEnumTypeImpl ifcAddressTypeEnumType = new IfcAddressTypeEnumTypeImpl();
		return ifcAddressTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAheadOrBehindType createIfcAheadOrBehindType() {
		IfcAheadOrBehindTypeImpl ifcAheadOrBehindType = new IfcAheadOrBehindTypeImpl();
		return ifcAheadOrBehindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirTerminalBoxType createIfcAirTerminalBoxType() {
		IfcAirTerminalBoxTypeImpl ifcAirTerminalBoxType = new IfcAirTerminalBoxTypeImpl();
		return ifcAirTerminalBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirTerminalBoxTypeEnumType createIfcAirTerminalBoxTypeEnumType() {
		IfcAirTerminalBoxTypeEnumTypeImpl ifcAirTerminalBoxTypeEnumType = new IfcAirTerminalBoxTypeEnumTypeImpl();
		return ifcAirTerminalBoxTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirTerminalType createIfcAirTerminalType() {
		IfcAirTerminalTypeImpl ifcAirTerminalType = new IfcAirTerminalTypeImpl();
		return ifcAirTerminalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirTerminalTypeEnumType createIfcAirTerminalTypeEnumType() {
		IfcAirTerminalTypeEnumTypeImpl ifcAirTerminalTypeEnumType = new IfcAirTerminalTypeEnumTypeImpl();
		return ifcAirTerminalTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirToAirHeatRecoveryType createIfcAirToAirHeatRecoveryType() {
		IfcAirToAirHeatRecoveryTypeImpl ifcAirToAirHeatRecoveryType = new IfcAirToAirHeatRecoveryTypeImpl();
		return ifcAirToAirHeatRecoveryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirToAirHeatRecoveryTypeEnumType createIfcAirToAirHeatRecoveryTypeEnumType() {
		IfcAirToAirHeatRecoveryTypeEnumTypeImpl ifcAirToAirHeatRecoveryTypeEnumType = new IfcAirToAirHeatRecoveryTypeEnumTypeImpl();
		return ifcAirToAirHeatRecoveryTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAlarmType createIfcAlarmType() {
		IfcAlarmTypeImpl ifcAlarmType = new IfcAlarmTypeImpl();
		return ifcAlarmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAlarmTypeEnumType createIfcAlarmTypeEnumType() {
		IfcAlarmTypeEnumTypeImpl ifcAlarmTypeEnumType = new IfcAlarmTypeEnumTypeImpl();
		return ifcAlarmTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAmountOfSubstanceMeasureType createIfcAmountOfSubstanceMeasureType() {
		IfcAmountOfSubstanceMeasureTypeImpl ifcAmountOfSubstanceMeasureType = new IfcAmountOfSubstanceMeasureTypeImpl();
		return ifcAmountOfSubstanceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisModelTypeEnumType createIfcAnalysisModelTypeEnumType() {
		IfcAnalysisModelTypeEnumTypeImpl ifcAnalysisModelTypeEnumType = new IfcAnalysisModelTypeEnumTypeImpl();
		return ifcAnalysisModelTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisTheoryTypeEnumType createIfcAnalysisTheoryTypeEnumType() {
		IfcAnalysisTheoryTypeEnumTypeImpl ifcAnalysisTheoryTypeEnumType = new IfcAnalysisTheoryTypeEnumTypeImpl();
		return ifcAnalysisTheoryTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAngularDimension createIfcAngularDimension() {
		IfcAngularDimensionImpl ifcAngularDimension = new IfcAngularDimensionImpl();
		return ifcAngularDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAngularVelocityMeasureType createIfcAngularVelocityMeasureType() {
		IfcAngularVelocityMeasureTypeImpl ifcAngularVelocityMeasureType = new IfcAngularVelocityMeasureTypeImpl();
		return ifcAngularVelocityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotation createIfcAnnotation() {
		IfcAnnotationImpl ifcAnnotation = new IfcAnnotationImpl();
		return ifcAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationCurveOccurrence createIfcAnnotationCurveOccurrence() {
		IfcAnnotationCurveOccurrenceImpl ifcAnnotationCurveOccurrence = new IfcAnnotationCurveOccurrenceImpl();
		return ifcAnnotationCurveOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationFillArea createIfcAnnotationFillArea() {
		IfcAnnotationFillAreaImpl ifcAnnotationFillArea = new IfcAnnotationFillAreaImpl();
		return ifcAnnotationFillArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationFillAreaOccurrence createIfcAnnotationFillAreaOccurrence() {
		IfcAnnotationFillAreaOccurrenceImpl ifcAnnotationFillAreaOccurrence = new IfcAnnotationFillAreaOccurrenceImpl();
		return ifcAnnotationFillAreaOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationSurface createIfcAnnotationSurface() {
		IfcAnnotationSurfaceImpl ifcAnnotationSurface = new IfcAnnotationSurfaceImpl();
		return ifcAnnotationSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationSurfaceOccurrence createIfcAnnotationSurfaceOccurrence() {
		IfcAnnotationSurfaceOccurrenceImpl ifcAnnotationSurfaceOccurrence = new IfcAnnotationSurfaceOccurrenceImpl();
		return ifcAnnotationSurfaceOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationSymbolOccurrence createIfcAnnotationSymbolOccurrence() {
		IfcAnnotationSymbolOccurrenceImpl ifcAnnotationSymbolOccurrence = new IfcAnnotationSymbolOccurrenceImpl();
		return ifcAnnotationSymbolOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnnotationTextOccurrence createIfcAnnotationTextOccurrence() {
		IfcAnnotationTextOccurrenceImpl ifcAnnotationTextOccurrence = new IfcAnnotationTextOccurrenceImpl();
		return ifcAnnotationTextOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApplication createIfcApplication() {
		IfcApplicationImpl ifcApplication = new IfcApplicationImpl();
		return ifcApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValueRelationship createIfcAppliedValueRelationship() {
		IfcAppliedValueRelationshipImpl ifcAppliedValueRelationship = new IfcAppliedValueRelationshipImpl();
		return ifcAppliedValueRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAppliedValueSelect createIfcAppliedValueSelect() {
		IfcAppliedValueSelectImpl ifcAppliedValueSelect = new IfcAppliedValueSelectImpl();
		return ifcAppliedValueSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApproval createIfcApproval() {
		IfcApprovalImpl ifcApproval = new IfcApprovalImpl();
		return ifcApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApprovalActorRelationship createIfcApprovalActorRelationship() {
		IfcApprovalActorRelationshipImpl ifcApprovalActorRelationship = new IfcApprovalActorRelationshipImpl();
		return ifcApprovalActorRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApprovalPropertyRelationship createIfcApprovalPropertyRelationship() {
		IfcApprovalPropertyRelationshipImpl ifcApprovalPropertyRelationship = new IfcApprovalPropertyRelationshipImpl();
		return ifcApprovalPropertyRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcApprovalRelationship createIfcApprovalRelationship() {
		IfcApprovalRelationshipImpl ifcApprovalRelationship = new IfcApprovalRelationshipImpl();
		return ifcApprovalRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcArbitraryClosedProfileDef createIfcArbitraryClosedProfileDef() {
		IfcArbitraryClosedProfileDefImpl ifcArbitraryClosedProfileDef = new IfcArbitraryClosedProfileDefImpl();
		return ifcArbitraryClosedProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcArbitraryOpenProfileDef createIfcArbitraryOpenProfileDef() {
		IfcArbitraryOpenProfileDefImpl ifcArbitraryOpenProfileDef = new IfcArbitraryOpenProfileDefImpl();
		return ifcArbitraryOpenProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcArbitraryProfileDefWithVoids createIfcArbitraryProfileDefWithVoids() {
		IfcArbitraryProfileDefWithVoidsImpl ifcArbitraryProfileDefWithVoids = new IfcArbitraryProfileDefWithVoidsImpl();
		return ifcArbitraryProfileDefWithVoids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAreaMeasureType createIfcAreaMeasureType() {
		IfcAreaMeasureTypeImpl ifcAreaMeasureType = new IfcAreaMeasureTypeImpl();
		return ifcAreaMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcArithmeticOperatorEnumType createIfcArithmeticOperatorEnumType() {
		IfcArithmeticOperatorEnumTypeImpl ifcArithmeticOperatorEnumType = new IfcArithmeticOperatorEnumTypeImpl();
		return ifcArithmeticOperatorEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAssemblyPlaceEnumType createIfcAssemblyPlaceEnumType() {
		IfcAssemblyPlaceEnumTypeImpl ifcAssemblyPlaceEnumType = new IfcAssemblyPlaceEnumTypeImpl();
		return ifcAssemblyPlaceEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAsset createIfcAsset() {
		IfcAssetImpl ifcAsset = new IfcAssetImpl();
		return ifcAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAsymmetricIShapeProfileDef createIfcAsymmetricIShapeProfileDef() {
		IfcAsymmetricIShapeProfileDefImpl ifcAsymmetricIShapeProfileDef = new IfcAsymmetricIShapeProfileDefImpl();
		return ifcAsymmetricIShapeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis1Placement createIfcAxis1Placement() {
		IfcAxis1PlacementImpl ifcAxis1Placement = new IfcAxis1PlacementImpl();
		return ifcAxis1Placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement createIfcAxis2Placement() {
		IfcAxis2PlacementImpl ifcAxis2Placement = new IfcAxis2PlacementImpl();
		return ifcAxis2Placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement2D createIfcAxis2Placement2D() {
		IfcAxis2Placement2DImpl ifcAxis2Placement2D = new IfcAxis2Placement2DImpl();
		return ifcAxis2Placement2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D createIfcAxis2Placement3D() {
		IfcAxis2Placement3DImpl ifcAxis2Placement3D = new IfcAxis2Placement3DImpl();
		return ifcAxis2Placement3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBeam createIfcBeam() {
		IfcBeamImpl ifcBeam = new IfcBeamImpl();
		return ifcBeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBeamType createIfcBeamType() {
		IfcBeamTypeImpl ifcBeamType = new IfcBeamTypeImpl();
		return ifcBeamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBeamTypeEnumType createIfcBeamTypeEnumType() {
		IfcBeamTypeEnumTypeImpl ifcBeamTypeEnumType = new IfcBeamTypeEnumTypeImpl();
		return ifcBeamTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBenchmarkEnumType createIfcBenchmarkEnumType() {
		IfcBenchmarkEnumTypeImpl ifcBenchmarkEnumType = new IfcBenchmarkEnumTypeImpl();
		return ifcBenchmarkEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBezierCurve createIfcBezierCurve() {
		IfcBezierCurveImpl ifcBezierCurve = new IfcBezierCurveImpl();
		return ifcBezierCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBlobTexture createIfcBlobTexture() {
		IfcBlobTextureImpl ifcBlobTexture = new IfcBlobTextureImpl();
		return ifcBlobTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBlock createIfcBlock() {
		IfcBlockImpl ifcBlock = new IfcBlockImpl();
		return ifcBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoilerType createIfcBoilerType() {
		IfcBoilerTypeImpl ifcBoilerType = new IfcBoilerTypeImpl();
		return ifcBoilerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoilerTypeEnumType createIfcBoilerTypeEnumType() {
		IfcBoilerTypeEnumTypeImpl ifcBoilerTypeEnumType = new IfcBoilerTypeEnumTypeImpl();
		return ifcBoilerTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanClippingResult createIfcBooleanClippingResult() {
		IfcBooleanClippingResultImpl ifcBooleanClippingResult = new IfcBooleanClippingResultImpl();
		return ifcBooleanClippingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperand createIfcBooleanOperand() {
		IfcBooleanOperandImpl ifcBooleanOperand = new IfcBooleanOperandImpl();
		return ifcBooleanOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperatorType createIfcBooleanOperatorType() {
		IfcBooleanOperatorTypeImpl ifcBooleanOperatorType = new IfcBooleanOperatorTypeImpl();
		return ifcBooleanOperatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanResult createIfcBooleanResult() {
		IfcBooleanResultImpl ifcBooleanResult = new IfcBooleanResultImpl();
		return ifcBooleanResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanType createIfcBooleanType() {
		IfcBooleanTypeImpl ifcBooleanType = new IfcBooleanTypeImpl();
		return ifcBooleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryEdgeCondition createIfcBoundaryEdgeCondition() {
		IfcBoundaryEdgeConditionImpl ifcBoundaryEdgeCondition = new IfcBoundaryEdgeConditionImpl();
		return ifcBoundaryEdgeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryFaceCondition createIfcBoundaryFaceCondition() {
		IfcBoundaryFaceConditionImpl ifcBoundaryFaceCondition = new IfcBoundaryFaceConditionImpl();
		return ifcBoundaryFaceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryNodeCondition createIfcBoundaryNodeCondition() {
		IfcBoundaryNodeConditionImpl ifcBoundaryNodeCondition = new IfcBoundaryNodeConditionImpl();
		return ifcBoundaryNodeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryNodeConditionWarping createIfcBoundaryNodeConditionWarping() {
		IfcBoundaryNodeConditionWarpingImpl ifcBoundaryNodeConditionWarping = new IfcBoundaryNodeConditionWarpingImpl();
		return ifcBoundaryNodeConditionWarping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundedSurface createIfcBoundedSurface() {
		IfcBoundedSurfaceImpl ifcBoundedSurface = new IfcBoundedSurfaceImpl();
		return ifcBoundedSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundingBox createIfcBoundingBox() {
		IfcBoundingBoxImpl ifcBoundingBox = new IfcBoundingBoxImpl();
		return ifcBoundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoxAlignmentType createIfcBoxAlignmentType() {
		IfcBoxAlignmentTypeImpl ifcBoxAlignmentType = new IfcBoxAlignmentTypeImpl();
		return ifcBoxAlignmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoxedHalfSpace createIfcBoxedHalfSpace() {
		IfcBoxedHalfSpaceImpl ifcBoxedHalfSpace = new IfcBoxedHalfSpaceImpl();
		return ifcBoxedHalfSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBSplineCurveFormType createIfcBSplineCurveFormType() {
		IfcBSplineCurveFormTypeImpl ifcBSplineCurveFormType = new IfcBSplineCurveFormTypeImpl();
		return ifcBSplineCurveFormType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBuilding createIfcBuilding() {
		IfcBuildingImpl ifcBuilding = new IfcBuildingImpl();
		return ifcBuilding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBuildingElementPart createIfcBuildingElementPart() {
		IfcBuildingElementPartImpl ifcBuildingElementPart = new IfcBuildingElementPartImpl();
		return ifcBuildingElementPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBuildingElementProxy createIfcBuildingElementProxy() {
		IfcBuildingElementProxyImpl ifcBuildingElementProxy = new IfcBuildingElementProxyImpl();
		return ifcBuildingElementProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBuildingElementProxyType createIfcBuildingElementProxyType() {
		IfcBuildingElementProxyTypeImpl ifcBuildingElementProxyType = new IfcBuildingElementProxyTypeImpl();
		return ifcBuildingElementProxyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBuildingElementProxyTypeEnumType createIfcBuildingElementProxyTypeEnumType() {
		IfcBuildingElementProxyTypeEnumTypeImpl ifcBuildingElementProxyTypeEnumType = new IfcBuildingElementProxyTypeEnumTypeImpl();
		return ifcBuildingElementProxyTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBuildingStorey createIfcBuildingStorey() {
		IfcBuildingStoreyImpl ifcBuildingStorey = new IfcBuildingStoreyImpl();
		return ifcBuildingStorey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableCarrierFittingType createIfcCableCarrierFittingType() {
		IfcCableCarrierFittingTypeImpl ifcCableCarrierFittingType = new IfcCableCarrierFittingTypeImpl();
		return ifcCableCarrierFittingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableCarrierFittingTypeEnumType createIfcCableCarrierFittingTypeEnumType() {
		IfcCableCarrierFittingTypeEnumTypeImpl ifcCableCarrierFittingTypeEnumType = new IfcCableCarrierFittingTypeEnumTypeImpl();
		return ifcCableCarrierFittingTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableCarrierSegmentType createIfcCableCarrierSegmentType() {
		IfcCableCarrierSegmentTypeImpl ifcCableCarrierSegmentType = new IfcCableCarrierSegmentTypeImpl();
		return ifcCableCarrierSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableCarrierSegmentTypeEnumType createIfcCableCarrierSegmentTypeEnumType() {
		IfcCableCarrierSegmentTypeEnumTypeImpl ifcCableCarrierSegmentTypeEnumType = new IfcCableCarrierSegmentTypeEnumTypeImpl();
		return ifcCableCarrierSegmentTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableSegmentType createIfcCableSegmentType() {
		IfcCableSegmentTypeImpl ifcCableSegmentType = new IfcCableSegmentTypeImpl();
		return ifcCableSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableSegmentTypeEnumType createIfcCableSegmentTypeEnumType() {
		IfcCableSegmentTypeEnumTypeImpl ifcCableSegmentTypeEnumType = new IfcCableSegmentTypeEnumTypeImpl();
		return ifcCableSegmentTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate createIfcCalendarDate() {
		IfcCalendarDateImpl ifcCalendarDate = new IfcCalendarDateImpl();
		return ifcCalendarDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint createIfcCartesianPoint() {
		IfcCartesianPointImpl ifcCartesianPoint = new IfcCartesianPointImpl();
		return ifcCartesianPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D createIfcCartesianTransformationOperator2D() {
		IfcCartesianTransformationOperator2DImpl ifcCartesianTransformationOperator2D = new IfcCartesianTransformationOperator2DImpl();
		return ifcCartesianTransformationOperator2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2DnonUniform createIfcCartesianTransformationOperator2DnonUniform() {
		IfcCartesianTransformationOperator2DnonUniformImpl ifcCartesianTransformationOperator2DnonUniform = new IfcCartesianTransformationOperator2DnonUniformImpl();
		return ifcCartesianTransformationOperator2DnonUniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator3D createIfcCartesianTransformationOperator3D() {
		IfcCartesianTransformationOperator3DImpl ifcCartesianTransformationOperator3D = new IfcCartesianTransformationOperator3DImpl();
		return ifcCartesianTransformationOperator3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator3DnonUniform createIfcCartesianTransformationOperator3DnonUniform() {
		IfcCartesianTransformationOperator3DnonUniformImpl ifcCartesianTransformationOperator3DnonUniform = new IfcCartesianTransformationOperator3DnonUniformImpl();
		return ifcCartesianTransformationOperator3DnonUniform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCenterLineProfileDef createIfcCenterLineProfileDef() {
		IfcCenterLineProfileDefImpl ifcCenterLineProfileDef = new IfcCenterLineProfileDefImpl();
		return ifcCenterLineProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChamferEdgeFeature createIfcChamferEdgeFeature() {
		IfcChamferEdgeFeatureImpl ifcChamferEdgeFeature = new IfcChamferEdgeFeatureImpl();
		return ifcChamferEdgeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChangeActionEnumType createIfcChangeActionEnumType() {
		IfcChangeActionEnumTypeImpl ifcChangeActionEnumType = new IfcChangeActionEnumTypeImpl();
		return ifcChangeActionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCharacterStyleSelect createIfcCharacterStyleSelect() {
		IfcCharacterStyleSelectImpl ifcCharacterStyleSelect = new IfcCharacterStyleSelectImpl();
		return ifcCharacterStyleSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChillerType createIfcChillerType() {
		IfcChillerTypeImpl ifcChillerType = new IfcChillerTypeImpl();
		return ifcChillerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChillerTypeEnumType createIfcChillerTypeEnumType() {
		IfcChillerTypeEnumTypeImpl ifcChillerTypeEnumType = new IfcChillerTypeEnumTypeImpl();
		return ifcChillerTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCircle createIfcCircle() {
		IfcCircleImpl ifcCircle = new IfcCircleImpl();
		return ifcCircle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCircleHollowProfileDef createIfcCircleHollowProfileDef() {
		IfcCircleHollowProfileDefImpl ifcCircleHollowProfileDef = new IfcCircleHollowProfileDefImpl();
		return ifcCircleHollowProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCircleProfileDef createIfcCircleProfileDef() {
		IfcCircleProfileDefImpl ifcCircleProfileDef = new IfcCircleProfileDefImpl();
		return ifcCircleProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassification createIfcClassification() {
		IfcClassificationImpl ifcClassification = new IfcClassificationImpl();
		return ifcClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationItem createIfcClassificationItem() {
		IfcClassificationItemImpl ifcClassificationItem = new IfcClassificationItemImpl();
		return ifcClassificationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationItemRelationship createIfcClassificationItemRelationship() {
		IfcClassificationItemRelationshipImpl ifcClassificationItemRelationship = new IfcClassificationItemRelationshipImpl();
		return ifcClassificationItemRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotation createIfcClassificationNotation() {
		IfcClassificationNotationImpl ifcClassificationNotation = new IfcClassificationNotationImpl();
		return ifcClassificationNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationFacet createIfcClassificationNotationFacet() {
		IfcClassificationNotationFacetImpl ifcClassificationNotationFacet = new IfcClassificationNotationFacetImpl();
		return ifcClassificationNotationFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationNotationSelect createIfcClassificationNotationSelect() {
		IfcClassificationNotationSelectImpl ifcClassificationNotationSelect = new IfcClassificationNotationSelectImpl();
		return ifcClassificationNotationSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClassificationReference createIfcClassificationReference() {
		IfcClassificationReferenceImpl ifcClassificationReference = new IfcClassificationReferenceImpl();
		return ifcClassificationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClosedShell createIfcClosedShell() {
		IfcClosedShellImpl ifcClosedShell = new IfcClosedShellImpl();
		return ifcClosedShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoilType createIfcCoilType() {
		IfcCoilTypeImpl ifcCoilType = new IfcCoilTypeImpl();
		return ifcCoilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoilTypeEnumType createIfcCoilTypeEnumType() {
		IfcCoilTypeEnumTypeImpl ifcCoilTypeEnumType = new IfcCoilTypeEnumTypeImpl();
		return ifcCoilTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour createIfcColour() {
		IfcColourImpl ifcColour = new IfcColourImpl();
		return ifcColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourOrFactor createIfcColourOrFactor() {
		IfcColourOrFactorImpl ifcColourOrFactor = new IfcColourOrFactorImpl();
		return ifcColourOrFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb createIfcColourRgb() {
		IfcColourRgbImpl ifcColourRgb = new IfcColourRgbImpl();
		return ifcColourRgb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColumn createIfcColumn() {
		IfcColumnImpl ifcColumn = new IfcColumnImpl();
		return ifcColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColumnType createIfcColumnType() {
		IfcColumnTypeImpl ifcColumnType = new IfcColumnTypeImpl();
		return ifcColumnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColumnTypeEnumType createIfcColumnTypeEnumType() {
		IfcColumnTypeEnumTypeImpl ifcColumnTypeEnumType = new IfcColumnTypeEnumTypeImpl();
		return ifcColumnTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcComplexNumber createIfcComplexNumber() {
		IfcComplexNumberImpl ifcComplexNumber = new IfcComplexNumberImpl();
		return ifcComplexNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcComplexNumberType createIfcComplexNumberType() {
		IfcComplexNumberTypeImpl ifcComplexNumberType = new IfcComplexNumberTypeImpl();
		return ifcComplexNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcComplexProperty createIfcComplexProperty() {
		IfcComplexPropertyImpl ifcComplexProperty = new IfcComplexPropertyImpl();
		return ifcComplexProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompositeCurve createIfcCompositeCurve() {
		IfcCompositeCurveImpl ifcCompositeCurve = new IfcCompositeCurveImpl();
		return ifcCompositeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompositeCurveSegment createIfcCompositeCurveSegment() {
		IfcCompositeCurveSegmentImpl ifcCompositeCurveSegment = new IfcCompositeCurveSegmentImpl();
		return ifcCompositeCurveSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompositeProfileDef createIfcCompositeProfileDef() {
		IfcCompositeProfileDefImpl ifcCompositeProfileDef = new IfcCompositeProfileDefImpl();
		return ifcCompositeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompoundPlaneAngleMeasure createIfcCompoundPlaneAngleMeasure() {
		IfcCompoundPlaneAngleMeasureImpl ifcCompoundPlaneAngleMeasure = new IfcCompoundPlaneAngleMeasureImpl();
		return ifcCompoundPlaneAngleMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompoundPlaneAngleMeasureType createIfcCompoundPlaneAngleMeasureType() {
		IfcCompoundPlaneAngleMeasureTypeImpl ifcCompoundPlaneAngleMeasureType = new IfcCompoundPlaneAngleMeasureTypeImpl();
		return ifcCompoundPlaneAngleMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompressorType createIfcCompressorType() {
		IfcCompressorTypeImpl ifcCompressorType = new IfcCompressorTypeImpl();
		return ifcCompressorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompressorTypeEnumType createIfcCompressorTypeEnumType() {
		IfcCompressorTypeEnumTypeImpl ifcCompressorTypeEnumType = new IfcCompressorTypeEnumTypeImpl();
		return ifcCompressorTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCondenserType createIfcCondenserType() {
		IfcCondenserTypeImpl ifcCondenserType = new IfcCondenserTypeImpl();
		return ifcCondenserType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCondenserTypeEnumType createIfcCondenserTypeEnumType() {
		IfcCondenserTypeEnumTypeImpl ifcCondenserTypeEnumType = new IfcCondenserTypeEnumTypeImpl();
		return ifcCondenserTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCondition createIfcCondition() {
		IfcConditionImpl ifcCondition = new IfcConditionImpl();
		return ifcCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConditionCriterion createIfcConditionCriterion() {
		IfcConditionCriterionImpl ifcConditionCriterion = new IfcConditionCriterionImpl();
		return ifcConditionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConditionCriterionSelect createIfcConditionCriterionSelect() {
		IfcConditionCriterionSelectImpl ifcConditionCriterionSelect = new IfcConditionCriterionSelectImpl();
		return ifcConditionCriterionSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectedFaceSet createIfcConnectedFaceSet() {
		IfcConnectedFaceSetImpl ifcConnectedFaceSet = new IfcConnectedFaceSetImpl();
		return ifcConnectedFaceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionCurveGeometry createIfcConnectionCurveGeometry() {
		IfcConnectionCurveGeometryImpl ifcConnectionCurveGeometry = new IfcConnectionCurveGeometryImpl();
		return ifcConnectionCurveGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionPointEccentricity createIfcConnectionPointEccentricity() {
		IfcConnectionPointEccentricityImpl ifcConnectionPointEccentricity = new IfcConnectionPointEccentricityImpl();
		return ifcConnectionPointEccentricity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionPointGeometry createIfcConnectionPointGeometry() {
		IfcConnectionPointGeometryImpl ifcConnectionPointGeometry = new IfcConnectionPointGeometryImpl();
		return ifcConnectionPointGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionPortGeometry createIfcConnectionPortGeometry() {
		IfcConnectionPortGeometryImpl ifcConnectionPortGeometry = new IfcConnectionPortGeometryImpl();
		return ifcConnectionPortGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionSurfaceGeometry createIfcConnectionSurfaceGeometry() {
		IfcConnectionSurfaceGeometryImpl ifcConnectionSurfaceGeometry = new IfcConnectionSurfaceGeometryImpl();
		return ifcConnectionSurfaceGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnumType createIfcConnectionTypeEnumType() {
		IfcConnectionTypeEnumTypeImpl ifcConnectionTypeEnumType = new IfcConnectionTypeEnumTypeImpl();
		return ifcConnectionTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraintAggregationRelationship createIfcConstraintAggregationRelationship() {
		IfcConstraintAggregationRelationshipImpl ifcConstraintAggregationRelationship = new IfcConstraintAggregationRelationshipImpl();
		return ifcConstraintAggregationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraintClassificationRelationship createIfcConstraintClassificationRelationship() {
		IfcConstraintClassificationRelationshipImpl ifcConstraintClassificationRelationship = new IfcConstraintClassificationRelationshipImpl();
		return ifcConstraintClassificationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraintEnumType createIfcConstraintEnumType() {
		IfcConstraintEnumTypeImpl ifcConstraintEnumType = new IfcConstraintEnumTypeImpl();
		return ifcConstraintEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraintRelationship createIfcConstraintRelationship() {
		IfcConstraintRelationshipImpl ifcConstraintRelationship = new IfcConstraintRelationshipImpl();
		return ifcConstraintRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstructionEquipmentResource createIfcConstructionEquipmentResource() {
		IfcConstructionEquipmentResourceImpl ifcConstructionEquipmentResource = new IfcConstructionEquipmentResourceImpl();
		return ifcConstructionEquipmentResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstructionMaterialResource createIfcConstructionMaterialResource() {
		IfcConstructionMaterialResourceImpl ifcConstructionMaterialResource = new IfcConstructionMaterialResourceImpl();
		return ifcConstructionMaterialResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstructionProductResource createIfcConstructionProductResource() {
		IfcConstructionProductResourceImpl ifcConstructionProductResource = new IfcConstructionProductResourceImpl();
		return ifcConstructionProductResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcContextDependentMeasureType createIfcContextDependentMeasureType() {
		IfcContextDependentMeasureTypeImpl ifcContextDependentMeasureType = new IfcContextDependentMeasureTypeImpl();
		return ifcContextDependentMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcContextDependentUnit createIfcContextDependentUnit() {
		IfcContextDependentUnitImpl ifcContextDependentUnit = new IfcContextDependentUnitImpl();
		return ifcContextDependentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcControllerType createIfcControllerType() {
		IfcControllerTypeImpl ifcControllerType = new IfcControllerTypeImpl();
		return ifcControllerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcControllerTypeEnumType createIfcControllerTypeEnumType() {
		IfcControllerTypeEnumTypeImpl ifcControllerTypeEnumType = new IfcControllerTypeEnumTypeImpl();
		return ifcControllerTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConversionBasedUnit createIfcConversionBasedUnit() {
		IfcConversionBasedUnitImpl ifcConversionBasedUnit = new IfcConversionBasedUnitImpl();
		return ifcConversionBasedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCooledBeamType createIfcCooledBeamType() {
		IfcCooledBeamTypeImpl ifcCooledBeamType = new IfcCooledBeamTypeImpl();
		return ifcCooledBeamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCooledBeamTypeEnumType createIfcCooledBeamTypeEnumType() {
		IfcCooledBeamTypeEnumTypeImpl ifcCooledBeamTypeEnumType = new IfcCooledBeamTypeEnumTypeImpl();
		return ifcCooledBeamTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoolingTowerType createIfcCoolingTowerType() {
		IfcCoolingTowerTypeImpl ifcCoolingTowerType = new IfcCoolingTowerTypeImpl();
		return ifcCoolingTowerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoolingTowerTypeEnumType createIfcCoolingTowerTypeEnumType() {
		IfcCoolingTowerTypeEnumTypeImpl ifcCoolingTowerTypeEnumType = new IfcCoolingTowerTypeEnumTypeImpl();
		return ifcCoolingTowerTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoordinatedUniversalTimeOffset createIfcCoordinatedUniversalTimeOffset() {
		IfcCoordinatedUniversalTimeOffsetImpl ifcCoordinatedUniversalTimeOffset = new IfcCoordinatedUniversalTimeOffsetImpl();
		return ifcCoordinatedUniversalTimeOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostItem createIfcCostItem() {
		IfcCostItemImpl ifcCostItem = new IfcCostItemImpl();
		return ifcCostItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostSchedule createIfcCostSchedule() {
		IfcCostScheduleImpl ifcCostSchedule = new IfcCostScheduleImpl();
		return ifcCostSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostScheduleTypeEnumType createIfcCostScheduleTypeEnumType() {
		IfcCostScheduleTypeEnumTypeImpl ifcCostScheduleTypeEnumType = new IfcCostScheduleTypeEnumTypeImpl();
		return ifcCostScheduleTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue createIfcCostValue() {
		IfcCostValueImpl ifcCostValue = new IfcCostValueImpl();
		return ifcCostValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCountMeasureType createIfcCountMeasureType() {
		IfcCountMeasureTypeImpl ifcCountMeasureType = new IfcCountMeasureTypeImpl();
		return ifcCountMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCovering createIfcCovering() {
		IfcCoveringImpl ifcCovering = new IfcCoveringImpl();
		return ifcCovering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoveringType createIfcCoveringType() {
		IfcCoveringTypeImpl ifcCoveringType = new IfcCoveringTypeImpl();
		return ifcCoveringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoveringTypeEnumType createIfcCoveringTypeEnumType() {
		IfcCoveringTypeEnumTypeImpl ifcCoveringTypeEnumType = new IfcCoveringTypeEnumTypeImpl();
		return ifcCoveringTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCraneRailAShapeProfileDef createIfcCraneRailAShapeProfileDef() {
		IfcCraneRailAShapeProfileDefImpl ifcCraneRailAShapeProfileDef = new IfcCraneRailAShapeProfileDefImpl();
		return ifcCraneRailAShapeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCraneRailFShapeProfileDef createIfcCraneRailFShapeProfileDef() {
		IfcCraneRailFShapeProfileDefImpl ifcCraneRailFShapeProfileDef = new IfcCraneRailFShapeProfileDefImpl();
		return ifcCraneRailFShapeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCrewResource createIfcCrewResource() {
		IfcCrewResourceImpl ifcCrewResource = new IfcCrewResourceImpl();
		return ifcCrewResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCsgSelect createIfcCsgSelect() {
		IfcCsgSelectImpl ifcCsgSelect = new IfcCsgSelectImpl();
		return ifcCsgSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCsgSolid createIfcCsgSolid() {
		IfcCsgSolidImpl ifcCsgSolid = new IfcCsgSolidImpl();
		return ifcCsgSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCShapeProfileDef createIfcCShapeProfileDef() {
		IfcCShapeProfileDefImpl ifcCShapeProfileDef = new IfcCShapeProfileDefImpl();
		return ifcCShapeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurrencyEnumType createIfcCurrencyEnumType() {
		IfcCurrencyEnumTypeImpl ifcCurrencyEnumType = new IfcCurrencyEnumTypeImpl();
		return ifcCurrencyEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurrencyRelationship createIfcCurrencyRelationship() {
		IfcCurrencyRelationshipImpl ifcCurrencyRelationship = new IfcCurrencyRelationshipImpl();
		return ifcCurrencyRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurtainWall createIfcCurtainWall() {
		IfcCurtainWallImpl ifcCurtainWall = new IfcCurtainWallImpl();
		return ifcCurtainWall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurtainWallType createIfcCurtainWallType() {
		IfcCurtainWallTypeImpl ifcCurtainWallType = new IfcCurtainWallTypeImpl();
		return ifcCurtainWallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurtainWallTypeEnumType createIfcCurtainWallTypeEnumType() {
		IfcCurtainWallTypeEnumTypeImpl ifcCurtainWallTypeEnumType = new IfcCurtainWallTypeEnumTypeImpl();
		return ifcCurtainWallTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurvatureMeasureType createIfcCurvatureMeasureType() {
		IfcCurvatureMeasureTypeImpl ifcCurvatureMeasureType = new IfcCurvatureMeasureTypeImpl();
		return ifcCurvatureMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveBoundedPlane createIfcCurveBoundedPlane() {
		IfcCurveBoundedPlaneImpl ifcCurveBoundedPlane = new IfcCurveBoundedPlaneImpl();
		return ifcCurveBoundedPlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveFontOrScaledCurveFontSelect createIfcCurveFontOrScaledCurveFontSelect() {
		IfcCurveFontOrScaledCurveFontSelectImpl ifcCurveFontOrScaledCurveFontSelect = new IfcCurveFontOrScaledCurveFontSelectImpl();
		return ifcCurveFontOrScaledCurveFontSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveOrEdgeCurve createIfcCurveOrEdgeCurve() {
		IfcCurveOrEdgeCurveImpl ifcCurveOrEdgeCurve = new IfcCurveOrEdgeCurveImpl();
		return ifcCurveOrEdgeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyle createIfcCurveStyle() {
		IfcCurveStyleImpl ifcCurveStyle = new IfcCurveStyleImpl();
		return ifcCurveStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyleFont createIfcCurveStyleFont() {
		IfcCurveStyleFontImpl ifcCurveStyleFont = new IfcCurveStyleFontImpl();
		return ifcCurveStyleFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyleFontAndScaling createIfcCurveStyleFontAndScaling() {
		IfcCurveStyleFontAndScalingImpl ifcCurveStyleFontAndScaling = new IfcCurveStyleFontAndScalingImpl();
		return ifcCurveStyleFontAndScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyleFontPattern createIfcCurveStyleFontPattern() {
		IfcCurveStyleFontPatternImpl ifcCurveStyleFontPattern = new IfcCurveStyleFontPatternImpl();
		return ifcCurveStyleFontPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyleFontSelect createIfcCurveStyleFontSelect() {
		IfcCurveStyleFontSelectImpl ifcCurveStyleFontSelect = new IfcCurveStyleFontSelectImpl();
		return ifcCurveStyleFontSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDamperType createIfcDamperType() {
		IfcDamperTypeImpl ifcDamperType = new IfcDamperTypeImpl();
		return ifcDamperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDamperTypeEnumType createIfcDamperTypeEnumType() {
		IfcDamperTypeEnumTypeImpl ifcDamperTypeEnumType = new IfcDamperTypeEnumTypeImpl();
		return ifcDamperTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDataOriginEnumType createIfcDataOriginEnumType() {
		IfcDataOriginEnumTypeImpl ifcDataOriginEnumType = new IfcDataOriginEnumTypeImpl();
		return ifcDataOriginEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime createIfcDateAndTime() {
		IfcDateAndTimeImpl ifcDateAndTime = new IfcDateAndTimeImpl();
		return ifcDateAndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect createIfcDateTimeSelect() {
		IfcDateTimeSelectImpl ifcDateTimeSelect = new IfcDateTimeSelectImpl();
		return ifcDateTimeSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDayInMonthNumberType createIfcDayInMonthNumberType() {
		IfcDayInMonthNumberTypeImpl ifcDayInMonthNumberType = new IfcDayInMonthNumberTypeImpl();
		return ifcDayInMonthNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDaylightSavingHourType createIfcDaylightSavingHourType() {
		IfcDaylightSavingHourTypeImpl ifcDaylightSavingHourType = new IfcDaylightSavingHourTypeImpl();
		return ifcDaylightSavingHourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDefinedSymbol createIfcDefinedSymbol() {
		IfcDefinedSymbolImpl ifcDefinedSymbol = new IfcDefinedSymbolImpl();
		return ifcDefinedSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDefinedSymbolSelect createIfcDefinedSymbolSelect() {
		IfcDefinedSymbolSelectImpl ifcDefinedSymbolSelect = new IfcDefinedSymbolSelectImpl();
		return ifcDefinedSymbolSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedMeasureValue createIfcDerivedMeasureValue() {
		IfcDerivedMeasureValueImpl ifcDerivedMeasureValue = new IfcDerivedMeasureValueImpl();
		return ifcDerivedMeasureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedProfileDef createIfcDerivedProfileDef() {
		IfcDerivedProfileDefImpl ifcDerivedProfileDef = new IfcDerivedProfileDefImpl();
		return ifcDerivedProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedUnit createIfcDerivedUnit() {
		IfcDerivedUnitImpl ifcDerivedUnit = new IfcDerivedUnitImpl();
		return ifcDerivedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedUnitElement createIfcDerivedUnitElement() {
		IfcDerivedUnitElementImpl ifcDerivedUnitElement = new IfcDerivedUnitElementImpl();
		return ifcDerivedUnitElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedUnitEnumType createIfcDerivedUnitEnumType() {
		IfcDerivedUnitEnumTypeImpl ifcDerivedUnitEnumType = new IfcDerivedUnitEnumTypeImpl();
		return ifcDerivedUnitEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDescriptiveMeasureType createIfcDescriptiveMeasureType() {
		IfcDescriptiveMeasureTypeImpl ifcDescriptiveMeasureType = new IfcDescriptiveMeasureTypeImpl();
		return ifcDescriptiveMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDiameterDimension createIfcDiameterDimension() {
		IfcDiameterDimensionImpl ifcDiameterDimension = new IfcDiameterDimensionImpl();
		return ifcDiameterDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionalExponents createIfcDimensionalExponents() {
		IfcDimensionalExponentsImpl ifcDimensionalExponents = new IfcDimensionalExponentsImpl();
		return ifcDimensionalExponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionCalloutRelationship createIfcDimensionCalloutRelationship() {
		IfcDimensionCalloutRelationshipImpl ifcDimensionCalloutRelationship = new IfcDimensionCalloutRelationshipImpl();
		return ifcDimensionCalloutRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionCountType createIfcDimensionCountType() {
		IfcDimensionCountTypeImpl ifcDimensionCountType = new IfcDimensionCountTypeImpl();
		return ifcDimensionCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionCurve createIfcDimensionCurve() {
		IfcDimensionCurveImpl ifcDimensionCurve = new IfcDimensionCurveImpl();
		return ifcDimensionCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionCurveDirectedCallout createIfcDimensionCurveDirectedCallout() {
		IfcDimensionCurveDirectedCalloutImpl ifcDimensionCurveDirectedCallout = new IfcDimensionCurveDirectedCalloutImpl();
		return ifcDimensionCurveDirectedCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionCurveTerminator createIfcDimensionCurveTerminator() {
		IfcDimensionCurveTerminatorImpl ifcDimensionCurveTerminator = new IfcDimensionCurveTerminatorImpl();
		return ifcDimensionCurveTerminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionExtentUsageType createIfcDimensionExtentUsageType() {
		IfcDimensionExtentUsageTypeImpl ifcDimensionExtentUsageType = new IfcDimensionExtentUsageTypeImpl();
		return ifcDimensionExtentUsageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionPair createIfcDimensionPair() {
		IfcDimensionPairImpl ifcDimensionPair = new IfcDimensionPairImpl();
		return ifcDimensionPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection createIfcDirection() {
		IfcDirectionImpl ifcDirection = new IfcDirectionImpl();
		return ifcDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirectionSenseEnumType createIfcDirectionSenseEnumType() {
		IfcDirectionSenseEnumTypeImpl ifcDirectionSenseEnumType = new IfcDirectionSenseEnumTypeImpl();
		return ifcDirectionSenseEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDiscreteAccessory createIfcDiscreteAccessory() {
		IfcDiscreteAccessoryImpl ifcDiscreteAccessory = new IfcDiscreteAccessoryImpl();
		return ifcDiscreteAccessory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDiscreteAccessoryType createIfcDiscreteAccessoryType() {
		IfcDiscreteAccessoryTypeImpl ifcDiscreteAccessoryType = new IfcDiscreteAccessoryTypeImpl();
		return ifcDiscreteAccessoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionChamberElement createIfcDistributionChamberElement() {
		IfcDistributionChamberElementImpl ifcDistributionChamberElement = new IfcDistributionChamberElementImpl();
		return ifcDistributionChamberElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionChamberElementType createIfcDistributionChamberElementType() {
		IfcDistributionChamberElementTypeImpl ifcDistributionChamberElementType = new IfcDistributionChamberElementTypeImpl();
		return ifcDistributionChamberElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionChamberElementTypeEnumType createIfcDistributionChamberElementTypeEnumType() {
		IfcDistributionChamberElementTypeEnumTypeImpl ifcDistributionChamberElementTypeEnumType = new IfcDistributionChamberElementTypeEnumTypeImpl();
		return ifcDistributionChamberElementTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionControlElement createIfcDistributionControlElement() {
		IfcDistributionControlElementImpl ifcDistributionControlElement = new IfcDistributionControlElementImpl();
		return ifcDistributionControlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionElement createIfcDistributionElement() {
		IfcDistributionElementImpl ifcDistributionElement = new IfcDistributionElementImpl();
		return ifcDistributionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionElementType createIfcDistributionElementType() {
		IfcDistributionElementTypeImpl ifcDistributionElementType = new IfcDistributionElementTypeImpl();
		return ifcDistributionElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionFlowElement createIfcDistributionFlowElement() {
		IfcDistributionFlowElementImpl ifcDistributionFlowElement = new IfcDistributionFlowElementImpl();
		return ifcDistributionFlowElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionPort createIfcDistributionPort() {
		IfcDistributionPortImpl ifcDistributionPort = new IfcDistributionPortImpl();
		return ifcDistributionPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentConfidentialityEnumType createIfcDocumentConfidentialityEnumType() {
		IfcDocumentConfidentialityEnumTypeImpl ifcDocumentConfidentialityEnumType = new IfcDocumentConfidentialityEnumTypeImpl();
		return ifcDocumentConfidentialityEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentElectronicFormat createIfcDocumentElectronicFormat() {
		IfcDocumentElectronicFormatImpl ifcDocumentElectronicFormat = new IfcDocumentElectronicFormatImpl();
		return ifcDocumentElectronicFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentInformation createIfcDocumentInformation() {
		IfcDocumentInformationImpl ifcDocumentInformation = new IfcDocumentInformationImpl();
		return ifcDocumentInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentInformationRelationship createIfcDocumentInformationRelationship() {
		IfcDocumentInformationRelationshipImpl ifcDocumentInformationRelationship = new IfcDocumentInformationRelationshipImpl();
		return ifcDocumentInformationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentReference createIfcDocumentReference() {
		IfcDocumentReferenceImpl ifcDocumentReference = new IfcDocumentReferenceImpl();
		return ifcDocumentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentSelect createIfcDocumentSelect() {
		IfcDocumentSelectImpl ifcDocumentSelect = new IfcDocumentSelectImpl();
		return ifcDocumentSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentStatusEnumType createIfcDocumentStatusEnumType() {
		IfcDocumentStatusEnumTypeImpl ifcDocumentStatusEnumType = new IfcDocumentStatusEnumTypeImpl();
		return ifcDocumentStatusEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoor createIfcDoor() {
		IfcDoorImpl ifcDoor = new IfcDoorImpl();
		return ifcDoor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorLiningProperties createIfcDoorLiningProperties() {
		IfcDoorLiningPropertiesImpl ifcDoorLiningProperties = new IfcDoorLiningPropertiesImpl();
		return ifcDoorLiningProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelOperationEnumType createIfcDoorPanelOperationEnumType() {
		IfcDoorPanelOperationEnumTypeImpl ifcDoorPanelOperationEnumType = new IfcDoorPanelOperationEnumTypeImpl();
		return ifcDoorPanelOperationEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelPositionEnumType createIfcDoorPanelPositionEnumType() {
		IfcDoorPanelPositionEnumTypeImpl ifcDoorPanelPositionEnumType = new IfcDoorPanelPositionEnumTypeImpl();
		return ifcDoorPanelPositionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelProperties createIfcDoorPanelProperties() {
		IfcDoorPanelPropertiesImpl ifcDoorPanelProperties = new IfcDoorPanelPropertiesImpl();
		return ifcDoorPanelProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyle createIfcDoorStyle() {
		IfcDoorStyleImpl ifcDoorStyle = new IfcDoorStyleImpl();
		return ifcDoorStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleConstructionEnumType createIfcDoorStyleConstructionEnumType() {
		IfcDoorStyleConstructionEnumTypeImpl ifcDoorStyleConstructionEnumType = new IfcDoorStyleConstructionEnumTypeImpl();
		return ifcDoorStyleConstructionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleOperationEnumType createIfcDoorStyleOperationEnumType() {
		IfcDoorStyleOperationEnumTypeImpl ifcDoorStyleOperationEnumType = new IfcDoorStyleOperationEnumTypeImpl();
		return ifcDoorStyleOperationEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoseEquivalentMeasureType createIfcDoseEquivalentMeasureType() {
		IfcDoseEquivalentMeasureTypeImpl ifcDoseEquivalentMeasureType = new IfcDoseEquivalentMeasureTypeImpl();
		return ifcDoseEquivalentMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingCallout createIfcDraughtingCallout() {
		IfcDraughtingCalloutImpl ifcDraughtingCallout = new IfcDraughtingCalloutImpl();
		return ifcDraughtingCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingCalloutElement createIfcDraughtingCalloutElement() {
		IfcDraughtingCalloutElementImpl ifcDraughtingCalloutElement = new IfcDraughtingCalloutElementImpl();
		return ifcDraughtingCalloutElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingCalloutRelationship createIfcDraughtingCalloutRelationship() {
		IfcDraughtingCalloutRelationshipImpl ifcDraughtingCalloutRelationship = new IfcDraughtingCalloutRelationshipImpl();
		return ifcDraughtingCalloutRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingPreDefinedColour createIfcDraughtingPreDefinedColour() {
		IfcDraughtingPreDefinedColourImpl ifcDraughtingPreDefinedColour = new IfcDraughtingPreDefinedColourImpl();
		return ifcDraughtingPreDefinedColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingPreDefinedCurveFont createIfcDraughtingPreDefinedCurveFont() {
		IfcDraughtingPreDefinedCurveFontImpl ifcDraughtingPreDefinedCurveFont = new IfcDraughtingPreDefinedCurveFontImpl();
		return ifcDraughtingPreDefinedCurveFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDraughtingPreDefinedTextFont createIfcDraughtingPreDefinedTextFont() {
		IfcDraughtingPreDefinedTextFontImpl ifcDraughtingPreDefinedTextFont = new IfcDraughtingPreDefinedTextFontImpl();
		return ifcDraughtingPreDefinedTextFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctFittingType createIfcDuctFittingType() {
		IfcDuctFittingTypeImpl ifcDuctFittingType = new IfcDuctFittingTypeImpl();
		return ifcDuctFittingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctFittingTypeEnumType createIfcDuctFittingTypeEnumType() {
		IfcDuctFittingTypeEnumTypeImpl ifcDuctFittingTypeEnumType = new IfcDuctFittingTypeEnumTypeImpl();
		return ifcDuctFittingTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctSegmentType createIfcDuctSegmentType() {
		IfcDuctSegmentTypeImpl ifcDuctSegmentType = new IfcDuctSegmentTypeImpl();
		return ifcDuctSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctSegmentTypeEnumType createIfcDuctSegmentTypeEnumType() {
		IfcDuctSegmentTypeEnumTypeImpl ifcDuctSegmentTypeEnumType = new IfcDuctSegmentTypeEnumTypeImpl();
		return ifcDuctSegmentTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctSilencerType createIfcDuctSilencerType() {
		IfcDuctSilencerTypeImpl ifcDuctSilencerType = new IfcDuctSilencerTypeImpl();
		return ifcDuctSilencerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctSilencerTypeEnumType createIfcDuctSilencerTypeEnumType() {
		IfcDuctSilencerTypeEnumTypeImpl ifcDuctSilencerTypeEnumType = new IfcDuctSilencerTypeEnumTypeImpl();
		return ifcDuctSilencerTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDynamicViscosityMeasureType createIfcDynamicViscosityMeasureType() {
		IfcDynamicViscosityMeasureTypeImpl ifcDynamicViscosityMeasureType = new IfcDynamicViscosityMeasureTypeImpl();
		return ifcDynamicViscosityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdge createIfcEdge() {
		IfcEdgeImpl ifcEdge = new IfcEdgeImpl();
		return ifcEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdgeCurve createIfcEdgeCurve() {
		IfcEdgeCurveImpl ifcEdgeCurve = new IfcEdgeCurveImpl();
		return ifcEdgeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEdgeLoop createIfcEdgeLoop() {
		IfcEdgeLoopImpl ifcEdgeLoop = new IfcEdgeLoopImpl();
		return ifcEdgeLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricalBaseProperties createIfcElectricalBaseProperties() {
		IfcElectricalBasePropertiesImpl ifcElectricalBaseProperties = new IfcElectricalBasePropertiesImpl();
		return ifcElectricalBaseProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricalCircuit createIfcElectricalCircuit() {
		IfcElectricalCircuitImpl ifcElectricalCircuit = new IfcElectricalCircuitImpl();
		return ifcElectricalCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricalElement createIfcElectricalElement() {
		IfcElectricalElementImpl ifcElectricalElement = new IfcElectricalElementImpl();
		return ifcElectricalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricApplianceType createIfcElectricApplianceType() {
		IfcElectricApplianceTypeImpl ifcElectricApplianceType = new IfcElectricApplianceTypeImpl();
		return ifcElectricApplianceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricApplianceTypeEnumType createIfcElectricApplianceTypeEnumType() {
		IfcElectricApplianceTypeEnumTypeImpl ifcElectricApplianceTypeEnumType = new IfcElectricApplianceTypeEnumTypeImpl();
		return ifcElectricApplianceTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCapacitanceMeasureType createIfcElectricCapacitanceMeasureType() {
		IfcElectricCapacitanceMeasureTypeImpl ifcElectricCapacitanceMeasureType = new IfcElectricCapacitanceMeasureTypeImpl();
		return ifcElectricCapacitanceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricChargeMeasureType createIfcElectricChargeMeasureType() {
		IfcElectricChargeMeasureTypeImpl ifcElectricChargeMeasureType = new IfcElectricChargeMeasureTypeImpl();
		return ifcElectricChargeMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricConductanceMeasureType createIfcElectricConductanceMeasureType() {
		IfcElectricConductanceMeasureTypeImpl ifcElectricConductanceMeasureType = new IfcElectricConductanceMeasureTypeImpl();
		return ifcElectricConductanceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentEnumType createIfcElectricCurrentEnumType() {
		IfcElectricCurrentEnumTypeImpl ifcElectricCurrentEnumType = new IfcElectricCurrentEnumTypeImpl();
		return ifcElectricCurrentEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentMeasureType createIfcElectricCurrentMeasureType() {
		IfcElectricCurrentMeasureTypeImpl ifcElectricCurrentMeasureType = new IfcElectricCurrentMeasureTypeImpl();
		return ifcElectricCurrentMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricDistributionPoint createIfcElectricDistributionPoint() {
		IfcElectricDistributionPointImpl ifcElectricDistributionPoint = new IfcElectricDistributionPointImpl();
		return ifcElectricDistributionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricDistributionPointFunctionEnumType createIfcElectricDistributionPointFunctionEnumType() {
		IfcElectricDistributionPointFunctionEnumTypeImpl ifcElectricDistributionPointFunctionEnumType = new IfcElectricDistributionPointFunctionEnumTypeImpl();
		return ifcElectricDistributionPointFunctionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricFlowStorageDeviceType createIfcElectricFlowStorageDeviceType() {
		IfcElectricFlowStorageDeviceTypeImpl ifcElectricFlowStorageDeviceType = new IfcElectricFlowStorageDeviceTypeImpl();
		return ifcElectricFlowStorageDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricFlowStorageDeviceTypeEnumType createIfcElectricFlowStorageDeviceTypeEnumType() {
		IfcElectricFlowStorageDeviceTypeEnumTypeImpl ifcElectricFlowStorageDeviceTypeEnumType = new IfcElectricFlowStorageDeviceTypeEnumTypeImpl();
		return ifcElectricFlowStorageDeviceTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricGeneratorType createIfcElectricGeneratorType() {
		IfcElectricGeneratorTypeImpl ifcElectricGeneratorType = new IfcElectricGeneratorTypeImpl();
		return ifcElectricGeneratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricGeneratorTypeEnumType createIfcElectricGeneratorTypeEnumType() {
		IfcElectricGeneratorTypeEnumTypeImpl ifcElectricGeneratorTypeEnumType = new IfcElectricGeneratorTypeEnumTypeImpl();
		return ifcElectricGeneratorTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricHeaterType createIfcElectricHeaterType() {
		IfcElectricHeaterTypeImpl ifcElectricHeaterType = new IfcElectricHeaterTypeImpl();
		return ifcElectricHeaterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricHeaterTypeEnumType createIfcElectricHeaterTypeEnumType() {
		IfcElectricHeaterTypeEnumTypeImpl ifcElectricHeaterTypeEnumType = new IfcElectricHeaterTypeEnumTypeImpl();
		return ifcElectricHeaterTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricMotorType createIfcElectricMotorType() {
		IfcElectricMotorTypeImpl ifcElectricMotorType = new IfcElectricMotorTypeImpl();
		return ifcElectricMotorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricMotorTypeEnumType createIfcElectricMotorTypeEnumType() {
		IfcElectricMotorTypeEnumTypeImpl ifcElectricMotorTypeEnumType = new IfcElectricMotorTypeEnumTypeImpl();
		return ifcElectricMotorTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricResistanceMeasureType createIfcElectricResistanceMeasureType() {
		IfcElectricResistanceMeasureTypeImpl ifcElectricResistanceMeasureType = new IfcElectricResistanceMeasureTypeImpl();
		return ifcElectricResistanceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricTimeControlType createIfcElectricTimeControlType() {
		IfcElectricTimeControlTypeImpl ifcElectricTimeControlType = new IfcElectricTimeControlTypeImpl();
		return ifcElectricTimeControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricTimeControlTypeEnumType createIfcElectricTimeControlTypeEnumType() {
		IfcElectricTimeControlTypeEnumTypeImpl ifcElectricTimeControlTypeEnumType = new IfcElectricTimeControlTypeEnumTypeImpl();
		return ifcElectricTimeControlTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricVoltageMeasureType createIfcElectricVoltageMeasureType() {
		IfcElectricVoltageMeasureTypeImpl ifcElectricVoltageMeasureType = new IfcElectricVoltageMeasureTypeImpl();
		return ifcElectricVoltageMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementAssembly createIfcElementAssembly() {
		IfcElementAssemblyImpl ifcElementAssembly = new IfcElementAssemblyImpl();
		return ifcElementAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementAssemblyTypeEnumType createIfcElementAssemblyTypeEnumType() {
		IfcElementAssemblyTypeEnumTypeImpl ifcElementAssemblyTypeEnumType = new IfcElementAssemblyTypeEnumTypeImpl();
		return ifcElementAssemblyTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementCompositionEnumType createIfcElementCompositionEnumType() {
		IfcElementCompositionEnumTypeImpl ifcElementCompositionEnumType = new IfcElementCompositionEnumTypeImpl();
		return ifcElementCompositionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementQuantity createIfcElementQuantity() {
		IfcElementQuantityImpl ifcElementQuantity = new IfcElementQuantityImpl();
		return ifcElementQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEllipse createIfcEllipse() {
		IfcEllipseImpl ifcEllipse = new IfcEllipseImpl();
		return ifcEllipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEllipseProfileDef createIfcEllipseProfileDef() {
		IfcEllipseProfileDefImpl ifcEllipseProfileDef = new IfcEllipseProfileDefImpl();
		return ifcEllipseProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnergyConversionDevice createIfcEnergyConversionDevice() {
		IfcEnergyConversionDeviceImpl ifcEnergyConversionDevice = new IfcEnergyConversionDeviceImpl();
		return ifcEnergyConversionDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnergyMeasureType createIfcEnergyMeasureType() {
		IfcEnergyMeasureTypeImpl ifcEnergyMeasureType = new IfcEnergyMeasureTypeImpl();
		return ifcEnergyMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnergyProperties createIfcEnergyProperties() {
		IfcEnergyPropertiesImpl ifcEnergyProperties = new IfcEnergyPropertiesImpl();
		return ifcEnergyProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnergySequenceEnumType createIfcEnergySequenceEnumType() {
		IfcEnergySequenceEnumTypeImpl ifcEnergySequenceEnumType = new IfcEnergySequenceEnumTypeImpl();
		return ifcEnergySequenceEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnvironmentalImpactCategoryEnumType createIfcEnvironmentalImpactCategoryEnumType() {
		IfcEnvironmentalImpactCategoryEnumTypeImpl ifcEnvironmentalImpactCategoryEnumType = new IfcEnvironmentalImpactCategoryEnumTypeImpl();
		return ifcEnvironmentalImpactCategoryEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnvironmentalImpactValue createIfcEnvironmentalImpactValue() {
		IfcEnvironmentalImpactValueImpl ifcEnvironmentalImpactValue = new IfcEnvironmentalImpactValueImpl();
		return ifcEnvironmentalImpactValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEquipmentElement createIfcEquipmentElement() {
		IfcEquipmentElementImpl ifcEquipmentElement = new IfcEquipmentElementImpl();
		return ifcEquipmentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEquipmentStandard createIfcEquipmentStandard() {
		IfcEquipmentStandardImpl ifcEquipmentStandard = new IfcEquipmentStandardImpl();
		return ifcEquipmentStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEvaporativeCoolerType createIfcEvaporativeCoolerType() {
		IfcEvaporativeCoolerTypeImpl ifcEvaporativeCoolerType = new IfcEvaporativeCoolerTypeImpl();
		return ifcEvaporativeCoolerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEvaporativeCoolerTypeEnumType createIfcEvaporativeCoolerTypeEnumType() {
		IfcEvaporativeCoolerTypeEnumTypeImpl ifcEvaporativeCoolerTypeEnumType = new IfcEvaporativeCoolerTypeEnumTypeImpl();
		return ifcEvaporativeCoolerTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEvaporatorType createIfcEvaporatorType() {
		IfcEvaporatorTypeImpl ifcEvaporatorType = new IfcEvaporatorTypeImpl();
		return ifcEvaporatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEvaporatorTypeEnumType createIfcEvaporatorTypeEnumType() {
		IfcEvaporatorTypeEnumTypeImpl ifcEvaporatorTypeEnumType = new IfcEvaporatorTypeEnumTypeImpl();
		return ifcEvaporatorTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExtendedMaterialProperties createIfcExtendedMaterialProperties() {
		IfcExtendedMaterialPropertiesImpl ifcExtendedMaterialProperties = new IfcExtendedMaterialPropertiesImpl();
		return ifcExtendedMaterialProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternallyDefinedHatchStyle createIfcExternallyDefinedHatchStyle() {
		IfcExternallyDefinedHatchStyleImpl ifcExternallyDefinedHatchStyle = new IfcExternallyDefinedHatchStyleImpl();
		return ifcExternallyDefinedHatchStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternallyDefinedSurfaceStyle createIfcExternallyDefinedSurfaceStyle() {
		IfcExternallyDefinedSurfaceStyleImpl ifcExternallyDefinedSurfaceStyle = new IfcExternallyDefinedSurfaceStyleImpl();
		return ifcExternallyDefinedSurfaceStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternallyDefinedSymbol createIfcExternallyDefinedSymbol() {
		IfcExternallyDefinedSymbolImpl ifcExternallyDefinedSymbol = new IfcExternallyDefinedSymbolImpl();
		return ifcExternallyDefinedSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExternallyDefinedTextFont createIfcExternallyDefinedTextFont() {
		IfcExternallyDefinedTextFontImpl ifcExternallyDefinedTextFont = new IfcExternallyDefinedTextFontImpl();
		return ifcExternallyDefinedTextFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcExtrudedAreaSolid createIfcExtrudedAreaSolid() {
		IfcExtrudedAreaSolidImpl ifcExtrudedAreaSolid = new IfcExtrudedAreaSolidImpl();
		return ifcExtrudedAreaSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFace createIfcFace() {
		IfcFaceImpl ifcFace = new IfcFaceImpl();
		return ifcFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFaceBasedSurfaceModel createIfcFaceBasedSurfaceModel() {
		IfcFaceBasedSurfaceModelImpl ifcFaceBasedSurfaceModel = new IfcFaceBasedSurfaceModelImpl();
		return ifcFaceBasedSurfaceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFaceBound createIfcFaceBound() {
		IfcFaceBoundImpl ifcFaceBound = new IfcFaceBoundImpl();
		return ifcFaceBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFaceOuterBound createIfcFaceOuterBound() {
		IfcFaceOuterBoundImpl ifcFaceOuterBound = new IfcFaceOuterBoundImpl();
		return ifcFaceOuterBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFaceSurface createIfcFaceSurface() {
		IfcFaceSurfaceImpl ifcFaceSurface = new IfcFaceSurfaceImpl();
		return ifcFaceSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFacetedBrep createIfcFacetedBrep() {
		IfcFacetedBrepImpl ifcFacetedBrep = new IfcFacetedBrepImpl();
		return ifcFacetedBrep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFacetedBrepWithVoids createIfcFacetedBrepWithVoids() {
		IfcFacetedBrepWithVoidsImpl ifcFacetedBrepWithVoids = new IfcFacetedBrepWithVoidsImpl();
		return ifcFacetedBrepWithVoids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFailureConnectionCondition createIfcFailureConnectionCondition() {
		IfcFailureConnectionConditionImpl ifcFailureConnectionCondition = new IfcFailureConnectionConditionImpl();
		return ifcFailureConnectionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFanType createIfcFanType() {
		IfcFanTypeImpl ifcFanType = new IfcFanTypeImpl();
		return ifcFanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFanTypeEnumType createIfcFanTypeEnumType() {
		IfcFanTypeEnumTypeImpl ifcFanTypeEnumType = new IfcFanTypeEnumTypeImpl();
		return ifcFanTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFastener createIfcFastener() {
		IfcFastenerImpl ifcFastener = new IfcFastenerImpl();
		return ifcFastener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFastenerType createIfcFastenerType() {
		IfcFastenerTypeImpl ifcFastenerType = new IfcFastenerTypeImpl();
		return ifcFastenerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyle createIfcFillAreaStyle() {
		IfcFillAreaStyleImpl ifcFillAreaStyle = new IfcFillAreaStyleImpl();
		return ifcFillAreaStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyleHatching createIfcFillAreaStyleHatching() {
		IfcFillAreaStyleHatchingImpl ifcFillAreaStyleHatching = new IfcFillAreaStyleHatchingImpl();
		return ifcFillAreaStyleHatching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyleTiles createIfcFillAreaStyleTiles() {
		IfcFillAreaStyleTilesImpl ifcFillAreaStyleTiles = new IfcFillAreaStyleTilesImpl();
		return ifcFillAreaStyleTiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyleTileShapeSelect createIfcFillAreaStyleTileShapeSelect() {
		IfcFillAreaStyleTileShapeSelectImpl ifcFillAreaStyleTileShapeSelect = new IfcFillAreaStyleTileShapeSelectImpl();
		return ifcFillAreaStyleTileShapeSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillAreaStyleTileSymbolWithStyle createIfcFillAreaStyleTileSymbolWithStyle() {
		IfcFillAreaStyleTileSymbolWithStyleImpl ifcFillAreaStyleTileSymbolWithStyle = new IfcFillAreaStyleTileSymbolWithStyleImpl();
		return ifcFillAreaStyleTileSymbolWithStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFillStyleSelect createIfcFillStyleSelect() {
		IfcFillStyleSelectImpl ifcFillStyleSelect = new IfcFillStyleSelectImpl();
		return ifcFillStyleSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFilterType createIfcFilterType() {
		IfcFilterTypeImpl ifcFilterType = new IfcFilterTypeImpl();
		return ifcFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFilterTypeEnumType createIfcFilterTypeEnumType() {
		IfcFilterTypeEnumTypeImpl ifcFilterTypeEnumType = new IfcFilterTypeEnumTypeImpl();
		return ifcFilterTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFireSuppressionTerminalType createIfcFireSuppressionTerminalType() {
		IfcFireSuppressionTerminalTypeImpl ifcFireSuppressionTerminalType = new IfcFireSuppressionTerminalTypeImpl();
		return ifcFireSuppressionTerminalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFireSuppressionTerminalTypeEnumType createIfcFireSuppressionTerminalTypeEnumType() {
		IfcFireSuppressionTerminalTypeEnumTypeImpl ifcFireSuppressionTerminalTypeEnumType = new IfcFireSuppressionTerminalTypeEnumTypeImpl();
		return ifcFireSuppressionTerminalTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowController createIfcFlowController() {
		IfcFlowControllerImpl ifcFlowController = new IfcFlowControllerImpl();
		return ifcFlowController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowDirectionEnumType createIfcFlowDirectionEnumType() {
		IfcFlowDirectionEnumTypeImpl ifcFlowDirectionEnumType = new IfcFlowDirectionEnumTypeImpl();
		return ifcFlowDirectionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowFitting createIfcFlowFitting() {
		IfcFlowFittingImpl ifcFlowFitting = new IfcFlowFittingImpl();
		return ifcFlowFitting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowInstrumentType createIfcFlowInstrumentType() {
		IfcFlowInstrumentTypeImpl ifcFlowInstrumentType = new IfcFlowInstrumentTypeImpl();
		return ifcFlowInstrumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowInstrumentTypeEnumType createIfcFlowInstrumentTypeEnumType() {
		IfcFlowInstrumentTypeEnumTypeImpl ifcFlowInstrumentTypeEnumType = new IfcFlowInstrumentTypeEnumTypeImpl();
		return ifcFlowInstrumentTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowMeterType createIfcFlowMeterType() {
		IfcFlowMeterTypeImpl ifcFlowMeterType = new IfcFlowMeterTypeImpl();
		return ifcFlowMeterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowMeterTypeEnumType createIfcFlowMeterTypeEnumType() {
		IfcFlowMeterTypeEnumTypeImpl ifcFlowMeterTypeEnumType = new IfcFlowMeterTypeEnumTypeImpl();
		return ifcFlowMeterTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowMovingDevice createIfcFlowMovingDevice() {
		IfcFlowMovingDeviceImpl ifcFlowMovingDevice = new IfcFlowMovingDeviceImpl();
		return ifcFlowMovingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowSegment createIfcFlowSegment() {
		IfcFlowSegmentImpl ifcFlowSegment = new IfcFlowSegmentImpl();
		return ifcFlowSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowStorageDevice createIfcFlowStorageDevice() {
		IfcFlowStorageDeviceImpl ifcFlowStorageDevice = new IfcFlowStorageDeviceImpl();
		return ifcFlowStorageDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowTerminal createIfcFlowTerminal() {
		IfcFlowTerminalImpl ifcFlowTerminal = new IfcFlowTerminalImpl();
		return ifcFlowTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowTreatmentDevice createIfcFlowTreatmentDevice() {
		IfcFlowTreatmentDeviceImpl ifcFlowTreatmentDevice = new IfcFlowTreatmentDeviceImpl();
		return ifcFlowTreatmentDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFluidFlowProperties createIfcFluidFlowProperties() {
		IfcFluidFlowPropertiesImpl ifcFluidFlowProperties = new IfcFluidFlowPropertiesImpl();
		return ifcFluidFlowProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFontStyleType createIfcFontStyleType() {
		IfcFontStyleTypeImpl ifcFontStyleType = new IfcFontStyleTypeImpl();
		return ifcFontStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFontVariantType createIfcFontVariantType() {
		IfcFontVariantTypeImpl ifcFontVariantType = new IfcFontVariantTypeImpl();
		return ifcFontVariantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFontWeightType createIfcFontWeightType() {
		IfcFontWeightTypeImpl ifcFontWeightType = new IfcFontWeightTypeImpl();
		return ifcFontWeightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFooting createIfcFooting() {
		IfcFootingImpl ifcFooting = new IfcFootingImpl();
		return ifcFooting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFootingTypeEnumType createIfcFootingTypeEnumType() {
		IfcFootingTypeEnumTypeImpl ifcFootingTypeEnumType = new IfcFootingTypeEnumTypeImpl();
		return ifcFootingTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcForceMeasureType createIfcForceMeasureType() {
		IfcForceMeasureTypeImpl ifcForceMeasureType = new IfcForceMeasureTypeImpl();
		return ifcForceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFrequencyMeasureType createIfcFrequencyMeasureType() {
		IfcFrequencyMeasureTypeImpl ifcFrequencyMeasureType = new IfcFrequencyMeasureTypeImpl();
		return ifcFrequencyMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFuelProperties createIfcFuelProperties() {
		IfcFuelPropertiesImpl ifcFuelProperties = new IfcFuelPropertiesImpl();
		return ifcFuelProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFurnishingElement createIfcFurnishingElement() {
		IfcFurnishingElementImpl ifcFurnishingElement = new IfcFurnishingElementImpl();
		return ifcFurnishingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFurnishingElementType createIfcFurnishingElementType() {
		IfcFurnishingElementTypeImpl ifcFurnishingElementType = new IfcFurnishingElementTypeImpl();
		return ifcFurnishingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFurnitureStandard createIfcFurnitureStandard() {
		IfcFurnitureStandardImpl ifcFurnitureStandard = new IfcFurnitureStandardImpl();
		return ifcFurnitureStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFurnitureType createIfcFurnitureType() {
		IfcFurnitureTypeImpl ifcFurnitureType = new IfcFurnitureTypeImpl();
		return ifcFurnitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGasTerminalType createIfcGasTerminalType() {
		IfcGasTerminalTypeImpl ifcGasTerminalType = new IfcGasTerminalTypeImpl();
		return ifcGasTerminalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGasTerminalTypeEnumType createIfcGasTerminalTypeEnumType() {
		IfcGasTerminalTypeEnumTypeImpl ifcGasTerminalTypeEnumType = new IfcGasTerminalTypeEnumTypeImpl();
		return ifcGasTerminalTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeneralMaterialProperties createIfcGeneralMaterialProperties() {
		IfcGeneralMaterialPropertiesImpl ifcGeneralMaterialProperties = new IfcGeneralMaterialPropertiesImpl();
		return ifcGeneralMaterialProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeneralProfileProperties createIfcGeneralProfileProperties() {
		IfcGeneralProfilePropertiesImpl ifcGeneralProfileProperties = new IfcGeneralProfilePropertiesImpl();
		return ifcGeneralProfileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricCurveSet createIfcGeometricCurveSet() {
		IfcGeometricCurveSetImpl ifcGeometricCurveSet = new IfcGeometricCurveSetImpl();
		return ifcGeometricCurveSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricProjectionEnumType createIfcGeometricProjectionEnumType() {
		IfcGeometricProjectionEnumTypeImpl ifcGeometricProjectionEnumType = new IfcGeometricProjectionEnumTypeImpl();
		return ifcGeometricProjectionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationContext createIfcGeometricRepresentationContext() {
		IfcGeometricRepresentationContextImpl ifcGeometricRepresentationContext = new IfcGeometricRepresentationContextImpl();
		return ifcGeometricRepresentationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricRepresentationSubContext createIfcGeometricRepresentationSubContext() {
		IfcGeometricRepresentationSubContextImpl ifcGeometricRepresentationSubContext = new IfcGeometricRepresentationSubContextImpl();
		return ifcGeometricRepresentationSubContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricSet createIfcGeometricSet() {
		IfcGeometricSetImpl ifcGeometricSet = new IfcGeometricSetImpl();
		return ifcGeometricSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricSetSelect createIfcGeometricSetSelect() {
		IfcGeometricSetSelectImpl ifcGeometricSetSelect = new IfcGeometricSetSelectImpl();
		return ifcGeometricSetSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGloballyUniqueIdType createIfcGloballyUniqueIdType() {
		IfcGloballyUniqueIdTypeImpl ifcGloballyUniqueIdType = new IfcGloballyUniqueIdTypeImpl();
		return ifcGloballyUniqueIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGlobalOrLocalEnumType createIfcGlobalOrLocalEnumType() {
		IfcGlobalOrLocalEnumTypeImpl ifcGlobalOrLocalEnumType = new IfcGlobalOrLocalEnumTypeImpl();
		return ifcGlobalOrLocalEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGrid createIfcGrid() {
		IfcGridImpl ifcGrid = new IfcGridImpl();
		return ifcGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGridAxis createIfcGridAxis() {
		IfcGridAxisImpl ifcGridAxis = new IfcGridAxisImpl();
		return ifcGridAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGridPlacement createIfcGridPlacement() {
		IfcGridPlacementImpl ifcGridPlacement = new IfcGridPlacementImpl();
		return ifcGridPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGroup createIfcGroup() {
		IfcGroupImpl ifcGroup = new IfcGroupImpl();
		return ifcGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHalfSpaceSolid createIfcHalfSpaceSolid() {
		IfcHalfSpaceSolidImpl ifcHalfSpaceSolid = new IfcHalfSpaceSolidImpl();
		return ifcHalfSpaceSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHatchLineDistanceSelect createIfcHatchLineDistanceSelect() {
		IfcHatchLineDistanceSelectImpl ifcHatchLineDistanceSelect = new IfcHatchLineDistanceSelectImpl();
		return ifcHatchLineDistanceSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatExchangerType createIfcHeatExchangerType() {
		IfcHeatExchangerTypeImpl ifcHeatExchangerType = new IfcHeatExchangerTypeImpl();
		return ifcHeatExchangerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatExchangerTypeEnumType createIfcHeatExchangerTypeEnumType() {
		IfcHeatExchangerTypeEnumTypeImpl ifcHeatExchangerTypeEnumType = new IfcHeatExchangerTypeEnumTypeImpl();
		return ifcHeatExchangerTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatFluxDensityMeasureType createIfcHeatFluxDensityMeasureType() {
		IfcHeatFluxDensityMeasureTypeImpl ifcHeatFluxDensityMeasureType = new IfcHeatFluxDensityMeasureTypeImpl();
		return ifcHeatFluxDensityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatingValueMeasureType createIfcHeatingValueMeasureType() {
		IfcHeatingValueMeasureTypeImpl ifcHeatingValueMeasureType = new IfcHeatingValueMeasureTypeImpl();
		return ifcHeatingValueMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHourInDayType createIfcHourInDayType() {
		IfcHourInDayTypeImpl ifcHourInDayType = new IfcHourInDayTypeImpl();
		return ifcHourInDayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHumidifierType createIfcHumidifierType() {
		IfcHumidifierTypeImpl ifcHumidifierType = new IfcHumidifierTypeImpl();
		return ifcHumidifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHumidifierTypeEnumType createIfcHumidifierTypeEnumType() {
		IfcHumidifierTypeEnumTypeImpl ifcHumidifierTypeEnumType = new IfcHumidifierTypeEnumTypeImpl();
		return ifcHumidifierTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHygroscopicMaterialProperties createIfcHygroscopicMaterialProperties() {
		IfcHygroscopicMaterialPropertiesImpl ifcHygroscopicMaterialProperties = new IfcHygroscopicMaterialPropertiesImpl();
		return ifcHygroscopicMaterialProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIdentifierType createIfcIdentifierType() {
		IfcIdentifierTypeImpl ifcIdentifierType = new IfcIdentifierTypeImpl();
		return ifcIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIlluminanceMeasureType createIfcIlluminanceMeasureType() {
		IfcIlluminanceMeasureTypeImpl ifcIlluminanceMeasureType = new IfcIlluminanceMeasureTypeImpl();
		return ifcIlluminanceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcImageTexture createIfcImageTexture() {
		IfcImageTextureImpl ifcImageTexture = new IfcImageTextureImpl();
		return ifcImageTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInductanceMeasureType createIfcInductanceMeasureType() {
		IfcInductanceMeasureTypeImpl ifcInductanceMeasureType = new IfcInductanceMeasureTypeImpl();
		return ifcInductanceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIntegerCountRateMeasureType createIfcIntegerCountRateMeasureType() {
		IfcIntegerCountRateMeasureTypeImpl ifcIntegerCountRateMeasureType = new IfcIntegerCountRateMeasureTypeImpl();
		return ifcIntegerCountRateMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIntegerType createIfcIntegerType() {
		IfcIntegerTypeImpl ifcIntegerType = new IfcIntegerTypeImpl();
		return ifcIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInternalOrExternalEnumType createIfcInternalOrExternalEnumType() {
		IfcInternalOrExternalEnumTypeImpl ifcInternalOrExternalEnumType = new IfcInternalOrExternalEnumTypeImpl();
		return ifcInternalOrExternalEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInventory createIfcInventory() {
		IfcInventoryImpl ifcInventory = new IfcInventoryImpl();
		return ifcInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInventoryTypeEnumType createIfcInventoryTypeEnumType() {
		IfcInventoryTypeEnumTypeImpl ifcInventoryTypeEnumType = new IfcInventoryTypeEnumTypeImpl();
		return ifcInventoryTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIonConcentrationMeasureType createIfcIonConcentrationMeasureType() {
		IfcIonConcentrationMeasureTypeImpl ifcIonConcentrationMeasureType = new IfcIonConcentrationMeasureTypeImpl();
		return ifcIonConcentrationMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIrregularTimeSeries createIfcIrregularTimeSeries() {
		IfcIrregularTimeSeriesImpl ifcIrregularTimeSeries = new IfcIrregularTimeSeriesImpl();
		return ifcIrregularTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIrregularTimeSeriesValue createIfcIrregularTimeSeriesValue() {
		IfcIrregularTimeSeriesValueImpl ifcIrregularTimeSeriesValue = new IfcIrregularTimeSeriesValueImpl();
		return ifcIrregularTimeSeriesValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIShapeProfileDef createIfcIShapeProfileDef() {
		IfcIShapeProfileDefImpl ifcIShapeProfileDef = new IfcIShapeProfileDefImpl();
		return ifcIShapeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcIsothermalMoistureCapacityMeasureType createIfcIsothermalMoistureCapacityMeasureType() {
		IfcIsothermalMoistureCapacityMeasureTypeImpl ifcIsothermalMoistureCapacityMeasureType = new IfcIsothermalMoistureCapacityMeasureTypeImpl();
		return ifcIsothermalMoistureCapacityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcJunctionBoxType createIfcJunctionBoxType() {
		IfcJunctionBoxTypeImpl ifcJunctionBoxType = new IfcJunctionBoxTypeImpl();
		return ifcJunctionBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcJunctionBoxTypeEnumType createIfcJunctionBoxTypeEnumType() {
		IfcJunctionBoxTypeEnumTypeImpl ifcJunctionBoxTypeEnumType = new IfcJunctionBoxTypeEnumTypeImpl();
		return ifcJunctionBoxTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcKinematicViscosityMeasureType createIfcKinematicViscosityMeasureType() {
		IfcKinematicViscosityMeasureTypeImpl ifcKinematicViscosityMeasureType = new IfcKinematicViscosityMeasureTypeImpl();
		return ifcKinematicViscosityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLabelType createIfcLabelType() {
		IfcLabelTypeImpl ifcLabelType = new IfcLabelTypeImpl();
		return ifcLabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLaborResource createIfcLaborResource() {
		IfcLaborResourceImpl ifcLaborResource = new IfcLaborResourceImpl();
		return ifcLaborResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLampType createIfcLampType() {
		IfcLampTypeImpl ifcLampType = new IfcLampTypeImpl();
		return ifcLampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLampTypeEnumType createIfcLampTypeEnumType() {
		IfcLampTypeEnumTypeImpl ifcLampTypeEnumType = new IfcLampTypeEnumTypeImpl();
		return ifcLampTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLayeredItem createIfcLayeredItem() {
		IfcLayeredItemImpl ifcLayeredItem = new IfcLayeredItemImpl();
		return ifcLayeredItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLayerSetDirectionEnumType createIfcLayerSetDirectionEnumType() {
		IfcLayerSetDirectionEnumTypeImpl ifcLayerSetDirectionEnumType = new IfcLayerSetDirectionEnumTypeImpl();
		return ifcLayerSetDirectionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLengthMeasureType createIfcLengthMeasureType() {
		IfcLengthMeasureTypeImpl ifcLengthMeasureType = new IfcLengthMeasureTypeImpl();
		return ifcLengthMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibraryInformation createIfcLibraryInformation() {
		IfcLibraryInformationImpl ifcLibraryInformation = new IfcLibraryInformationImpl();
		return ifcLibraryInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibraryReference createIfcLibraryReference() {
		IfcLibraryReferenceImpl ifcLibraryReference = new IfcLibraryReferenceImpl();
		return ifcLibraryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibrarySelect createIfcLibrarySelect() {
		IfcLibrarySelectImpl ifcLibrarySelect = new IfcLibrarySelectImpl();
		return ifcLibrarySelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionCurveEnumType createIfcLightDistributionCurveEnumType() {
		IfcLightDistributionCurveEnumTypeImpl ifcLightDistributionCurveEnumType = new IfcLightDistributionCurveEnumTypeImpl();
		return ifcLightDistributionCurveEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionData createIfcLightDistributionData() {
		IfcLightDistributionDataImpl ifcLightDistributionData = new IfcLightDistributionDataImpl();
		return ifcLightDistributionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionDataSourceSelect createIfcLightDistributionDataSourceSelect() {
		IfcLightDistributionDataSourceSelectImpl ifcLightDistributionDataSourceSelect = new IfcLightDistributionDataSourceSelectImpl();
		return ifcLightDistributionDataSourceSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightEmissionSourceEnumType createIfcLightEmissionSourceEnumType() {
		IfcLightEmissionSourceEnumTypeImpl ifcLightEmissionSourceEnumType = new IfcLightEmissionSourceEnumTypeImpl();
		return ifcLightEmissionSourceEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightFixtureType createIfcLightFixtureType() {
		IfcLightFixtureTypeImpl ifcLightFixtureType = new IfcLightFixtureTypeImpl();
		return ifcLightFixtureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightFixtureTypeEnumType createIfcLightFixtureTypeEnumType() {
		IfcLightFixtureTypeEnumTypeImpl ifcLightFixtureTypeEnumType = new IfcLightFixtureTypeEnumTypeImpl();
		return ifcLightFixtureTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightIntensityDistribution createIfcLightIntensityDistribution() {
		IfcLightIntensityDistributionImpl ifcLightIntensityDistribution = new IfcLightIntensityDistributionImpl();
		return ifcLightIntensityDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightSourceAmbient createIfcLightSourceAmbient() {
		IfcLightSourceAmbientImpl ifcLightSourceAmbient = new IfcLightSourceAmbientImpl();
		return ifcLightSourceAmbient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightSourceDirectional createIfcLightSourceDirectional() {
		IfcLightSourceDirectionalImpl ifcLightSourceDirectional = new IfcLightSourceDirectionalImpl();
		return ifcLightSourceDirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightSourceGoniometric createIfcLightSourceGoniometric() {
		IfcLightSourceGoniometricImpl ifcLightSourceGoniometric = new IfcLightSourceGoniometricImpl();
		return ifcLightSourceGoniometric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightSourcePositional createIfcLightSourcePositional() {
		IfcLightSourcePositionalImpl ifcLightSourcePositional = new IfcLightSourcePositionalImpl();
		return ifcLightSourcePositional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightSourceSpot createIfcLightSourceSpot() {
		IfcLightSourceSpotImpl ifcLightSourceSpot = new IfcLightSourceSpotImpl();
		return ifcLightSourceSpot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLine createIfcLine() {
		IfcLineImpl ifcLine = new IfcLineImpl();
		return ifcLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearDimension createIfcLinearDimension() {
		IfcLinearDimensionImpl ifcLinearDimension = new IfcLinearDimensionImpl();
		return ifcLinearDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearForceMeasureType createIfcLinearForceMeasureType() {
		IfcLinearForceMeasureTypeImpl ifcLinearForceMeasureType = new IfcLinearForceMeasureTypeImpl();
		return ifcLinearForceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearMomentMeasureType createIfcLinearMomentMeasureType() {
		IfcLinearMomentMeasureTypeImpl ifcLinearMomentMeasureType = new IfcLinearMomentMeasureTypeImpl();
		return ifcLinearMomentMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearStiffnessMeasureType createIfcLinearStiffnessMeasureType() {
		IfcLinearStiffnessMeasureTypeImpl ifcLinearStiffnessMeasureType = new IfcLinearStiffnessMeasureTypeImpl();
		return ifcLinearStiffnessMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLinearVelocityMeasureType createIfcLinearVelocityMeasureType() {
		IfcLinearVelocityMeasureTypeImpl ifcLinearVelocityMeasureType = new IfcLinearVelocityMeasureTypeImpl();
		return ifcLinearVelocityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLoadGroupTypeEnumType createIfcLoadGroupTypeEnumType() {
		IfcLoadGroupTypeEnumTypeImpl ifcLoadGroupTypeEnumType = new IfcLoadGroupTypeEnumTypeImpl();
		return ifcLoadGroupTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLocalPlacement createIfcLocalPlacement() {
		IfcLocalPlacementImpl ifcLocalPlacement = new IfcLocalPlacementImpl();
		return ifcLocalPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLocalTime createIfcLocalTime() {
		IfcLocalTimeImpl ifcLocalTime = new IfcLocalTimeImpl();
		return ifcLocalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogicalOperatorEnumType createIfcLogicalOperatorEnumType() {
		IfcLogicalOperatorEnumTypeImpl ifcLogicalOperatorEnumType = new IfcLogicalOperatorEnumTypeImpl();
		return ifcLogicalOperatorEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogicalType createIfcLogicalType() {
		IfcLogicalTypeImpl ifcLogicalType = new IfcLogicalTypeImpl();
		return ifcLogicalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLoop createIfcLoop() {
		IfcLoopImpl ifcLoop = new IfcLoopImpl();
		return ifcLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLShapeProfileDef createIfcLShapeProfileDef() {
		IfcLShapeProfileDefImpl ifcLShapeProfileDef = new IfcLShapeProfileDefImpl();
		return ifcLShapeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLuminousFluxMeasureType createIfcLuminousFluxMeasureType() {
		IfcLuminousFluxMeasureTypeImpl ifcLuminousFluxMeasureType = new IfcLuminousFluxMeasureTypeImpl();
		return ifcLuminousFluxMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLuminousIntensityDistributionMeasureType createIfcLuminousIntensityDistributionMeasureType() {
		IfcLuminousIntensityDistributionMeasureTypeImpl ifcLuminousIntensityDistributionMeasureType = new IfcLuminousIntensityDistributionMeasureTypeImpl();
		return ifcLuminousIntensityDistributionMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLuminousIntensityMeasureType createIfcLuminousIntensityMeasureType() {
		IfcLuminousIntensityMeasureTypeImpl ifcLuminousIntensityMeasureType = new IfcLuminousIntensityMeasureTypeImpl();
		return ifcLuminousIntensityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMagneticFluxDensityMeasureType createIfcMagneticFluxDensityMeasureType() {
		IfcMagneticFluxDensityMeasureTypeImpl ifcMagneticFluxDensityMeasureType = new IfcMagneticFluxDensityMeasureTypeImpl();
		return ifcMagneticFluxDensityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMagneticFluxMeasureType createIfcMagneticFluxMeasureType() {
		IfcMagneticFluxMeasureTypeImpl ifcMagneticFluxMeasureType = new IfcMagneticFluxMeasureTypeImpl();
		return ifcMagneticFluxMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMappedItem createIfcMappedItem() {
		IfcMappedItemImpl ifcMappedItem = new IfcMappedItemImpl();
		return ifcMappedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMassDensityMeasureType createIfcMassDensityMeasureType() {
		IfcMassDensityMeasureTypeImpl ifcMassDensityMeasureType = new IfcMassDensityMeasureTypeImpl();
		return ifcMassDensityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMassFlowRateMeasureType createIfcMassFlowRateMeasureType() {
		IfcMassFlowRateMeasureTypeImpl ifcMassFlowRateMeasureType = new IfcMassFlowRateMeasureTypeImpl();
		return ifcMassFlowRateMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMassMeasureType createIfcMassMeasureType() {
		IfcMassMeasureTypeImpl ifcMassMeasureType = new IfcMassMeasureTypeImpl();
		return ifcMassMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMassPerLengthMeasureType createIfcMassPerLengthMeasureType() {
		IfcMassPerLengthMeasureTypeImpl ifcMassPerLengthMeasureType = new IfcMassPerLengthMeasureTypeImpl();
		return ifcMassPerLengthMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterial createIfcMaterial() {
		IfcMaterialImpl ifcMaterial = new IfcMaterialImpl();
		return ifcMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialClassificationRelationship createIfcMaterialClassificationRelationship() {
		IfcMaterialClassificationRelationshipImpl ifcMaterialClassificationRelationship = new IfcMaterialClassificationRelationshipImpl();
		return ifcMaterialClassificationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialDefinitionRepresentation createIfcMaterialDefinitionRepresentation() {
		IfcMaterialDefinitionRepresentationImpl ifcMaterialDefinitionRepresentation = new IfcMaterialDefinitionRepresentationImpl();
		return ifcMaterialDefinitionRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayer createIfcMaterialLayer() {
		IfcMaterialLayerImpl ifcMaterialLayer = new IfcMaterialLayerImpl();
		return ifcMaterialLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSet createIfcMaterialLayerSet() {
		IfcMaterialLayerSetImpl ifcMaterialLayerSet = new IfcMaterialLayerSetImpl();
		return ifcMaterialLayerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialLayerSetUsage createIfcMaterialLayerSetUsage() {
		IfcMaterialLayerSetUsageImpl ifcMaterialLayerSetUsage = new IfcMaterialLayerSetUsageImpl();
		return ifcMaterialLayerSetUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialList createIfcMaterialList() {
		IfcMaterialListImpl ifcMaterialList = new IfcMaterialListImpl();
		return ifcMaterialList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMaterialSelect createIfcMaterialSelect() {
		IfcMaterialSelectImpl ifcMaterialSelect = new IfcMaterialSelectImpl();
		return ifcMaterialSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue createIfcMeasureValue() {
		IfcMeasureValueImpl ifcMeasureValue = new IfcMeasureValueImpl();
		return ifcMeasureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit createIfcMeasureWithUnit() {
		IfcMeasureWithUnitImpl ifcMeasureWithUnit = new IfcMeasureWithUnitImpl();
		return ifcMeasureWithUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalConcreteMaterialProperties createIfcMechanicalConcreteMaterialProperties() {
		IfcMechanicalConcreteMaterialPropertiesImpl ifcMechanicalConcreteMaterialProperties = new IfcMechanicalConcreteMaterialPropertiesImpl();
		return ifcMechanicalConcreteMaterialProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalFastener createIfcMechanicalFastener() {
		IfcMechanicalFastenerImpl ifcMechanicalFastener = new IfcMechanicalFastenerImpl();
		return ifcMechanicalFastener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalFastenerType createIfcMechanicalFastenerType() {
		IfcMechanicalFastenerTypeImpl ifcMechanicalFastenerType = new IfcMechanicalFastenerTypeImpl();
		return ifcMechanicalFastenerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalMaterialProperties createIfcMechanicalMaterialProperties() {
		IfcMechanicalMaterialPropertiesImpl ifcMechanicalMaterialProperties = new IfcMechanicalMaterialPropertiesImpl();
		return ifcMechanicalMaterialProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMechanicalSteelMaterialProperties createIfcMechanicalSteelMaterialProperties() {
		IfcMechanicalSteelMaterialPropertiesImpl ifcMechanicalSteelMaterialProperties = new IfcMechanicalSteelMaterialPropertiesImpl();
		return ifcMechanicalSteelMaterialProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMember createIfcMember() {
		IfcMemberImpl ifcMember = new IfcMemberImpl();
		return ifcMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMemberType createIfcMemberType() {
		IfcMemberTypeImpl ifcMemberType = new IfcMemberTypeImpl();
		return ifcMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMemberTypeEnumType createIfcMemberTypeEnumType() {
		IfcMemberTypeEnumTypeImpl ifcMemberTypeEnumType = new IfcMemberTypeEnumTypeImpl();
		return ifcMemberTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetric createIfcMetric() {
		IfcMetricImpl ifcMetric = new IfcMetricImpl();
		return ifcMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMetricValueSelect createIfcMetricValueSelect() {
		IfcMetricValueSelectImpl ifcMetricValueSelect = new IfcMetricValueSelectImpl();
		return ifcMetricValueSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMinuteInHourType createIfcMinuteInHourType() {
		IfcMinuteInHourTypeImpl ifcMinuteInHourType = new IfcMinuteInHourTypeImpl();
		return ifcMinuteInHourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfElasticityMeasureType createIfcModulusOfElasticityMeasureType() {
		IfcModulusOfElasticityMeasureTypeImpl ifcModulusOfElasticityMeasureType = new IfcModulusOfElasticityMeasureTypeImpl();
		return ifcModulusOfElasticityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfLinearSubgradeReactionMeasureType createIfcModulusOfLinearSubgradeReactionMeasureType() {
		IfcModulusOfLinearSubgradeReactionMeasureTypeImpl ifcModulusOfLinearSubgradeReactionMeasureType = new IfcModulusOfLinearSubgradeReactionMeasureTypeImpl();
		return ifcModulusOfLinearSubgradeReactionMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfRotationalSubgradeReactionMeasureType createIfcModulusOfRotationalSubgradeReactionMeasureType() {
		IfcModulusOfRotationalSubgradeReactionMeasureTypeImpl ifcModulusOfRotationalSubgradeReactionMeasureType = new IfcModulusOfRotationalSubgradeReactionMeasureTypeImpl();
		return ifcModulusOfRotationalSubgradeReactionMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcModulusOfSubgradeReactionMeasureType createIfcModulusOfSubgradeReactionMeasureType() {
		IfcModulusOfSubgradeReactionMeasureTypeImpl ifcModulusOfSubgradeReactionMeasureType = new IfcModulusOfSubgradeReactionMeasureTypeImpl();
		return ifcModulusOfSubgradeReactionMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMoistureDiffusivityMeasureType createIfcMoistureDiffusivityMeasureType() {
		IfcMoistureDiffusivityMeasureTypeImpl ifcMoistureDiffusivityMeasureType = new IfcMoistureDiffusivityMeasureTypeImpl();
		return ifcMoistureDiffusivityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMolecularWeightMeasureType createIfcMolecularWeightMeasureType() {
		IfcMolecularWeightMeasureTypeImpl ifcMolecularWeightMeasureType = new IfcMolecularWeightMeasureTypeImpl();
		return ifcMolecularWeightMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMomentOfInertiaMeasureType createIfcMomentOfInertiaMeasureType() {
		IfcMomentOfInertiaMeasureTypeImpl ifcMomentOfInertiaMeasureType = new IfcMomentOfInertiaMeasureTypeImpl();
		return ifcMomentOfInertiaMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryMeasureType createIfcMonetaryMeasureType() {
		IfcMonetaryMeasureTypeImpl ifcMonetaryMeasureType = new IfcMonetaryMeasureTypeImpl();
		return ifcMonetaryMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit createIfcMonetaryUnit() {
		IfcMonetaryUnitImpl ifcMonetaryUnit = new IfcMonetaryUnitImpl();
		return ifcMonetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonthInYearNumberType createIfcMonthInYearNumberType() {
		IfcMonthInYearNumberTypeImpl ifcMonthInYearNumberType = new IfcMonthInYearNumberTypeImpl();
		return ifcMonthInYearNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMotorConnectionType createIfcMotorConnectionType() {
		IfcMotorConnectionTypeImpl ifcMotorConnectionType = new IfcMotorConnectionTypeImpl();
		return ifcMotorConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMotorConnectionTypeEnumType createIfcMotorConnectionTypeEnumType() {
		IfcMotorConnectionTypeEnumTypeImpl ifcMotorConnectionTypeEnumType = new IfcMotorConnectionTypeEnumTypeImpl();
		return ifcMotorConnectionTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMove createIfcMove() {
		IfcMoveImpl ifcMove = new IfcMoveImpl();
		return ifcMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNormalisedRatioMeasureType createIfcNormalisedRatioMeasureType() {
		IfcNormalisedRatioMeasureTypeImpl ifcNormalisedRatioMeasureType = new IfcNormalisedRatioMeasureTypeImpl();
		return ifcNormalisedRatioMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNullStyleType createIfcNullStyleType() {
		IfcNullStyleTypeImpl ifcNullStyleType = new IfcNullStyleTypeImpl();
		return ifcNullStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNumericMeasureType createIfcNumericMeasureType() {
		IfcNumericMeasureTypeImpl ifcNumericMeasureType = new IfcNumericMeasureTypeImpl();
		return ifcNumericMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjective createIfcObjective() {
		IfcObjectiveImpl ifcObjective = new IfcObjectiveImpl();
		return ifcObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectiveEnumType createIfcObjectiveEnumType() {
		IfcObjectiveEnumTypeImpl ifcObjectiveEnumType = new IfcObjectiveEnumTypeImpl();
		return ifcObjectiveEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectReferenceSelect createIfcObjectReferenceSelect() {
		IfcObjectReferenceSelectImpl ifcObjectReferenceSelect = new IfcObjectReferenceSelectImpl();
		return ifcObjectReferenceSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectTypeEnumType createIfcObjectTypeEnumType() {
		IfcObjectTypeEnumTypeImpl ifcObjectTypeEnumType = new IfcObjectTypeEnumTypeImpl();
		return ifcObjectTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOccupant createIfcOccupant() {
		IfcOccupantImpl ifcOccupant = new IfcOccupantImpl();
		return ifcOccupant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOccupantTypeEnumType createIfcOccupantTypeEnumType() {
		IfcOccupantTypeEnumTypeImpl ifcOccupantTypeEnumType = new IfcOccupantTypeEnumTypeImpl();
		return ifcOccupantTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOffsetCurve2D createIfcOffsetCurve2D() {
		IfcOffsetCurve2DImpl ifcOffsetCurve2D = new IfcOffsetCurve2DImpl();
		return ifcOffsetCurve2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOffsetCurve3D createIfcOffsetCurve3D() {
		IfcOffsetCurve3DImpl ifcOffsetCurve3D = new IfcOffsetCurve3DImpl();
		return ifcOffsetCurve3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOneDirectionRepeatFactor createIfcOneDirectionRepeatFactor() {
		IfcOneDirectionRepeatFactorImpl ifcOneDirectionRepeatFactor = new IfcOneDirectionRepeatFactorImpl();
		return ifcOneDirectionRepeatFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpeningElement createIfcOpeningElement() {
		IfcOpeningElementImpl ifcOpeningElement = new IfcOpeningElementImpl();
		return ifcOpeningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpenShell createIfcOpenShell() {
		IfcOpenShellImpl ifcOpenShell = new IfcOpenShellImpl();
		return ifcOpenShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpticalMaterialProperties createIfcOpticalMaterialProperties() {
		IfcOpticalMaterialPropertiesImpl ifcOpticalMaterialProperties = new IfcOpticalMaterialPropertiesImpl();
		return ifcOpticalMaterialProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrderAction createIfcOrderAction() {
		IfcOrderActionImpl ifcOrderAction = new IfcOrderActionImpl();
		return ifcOrderAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization createIfcOrganization() {
		IfcOrganizationImpl ifcOrganization = new IfcOrganizationImpl();
		return ifcOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganizationRelationship createIfcOrganizationRelationship() {
		IfcOrganizationRelationshipImpl ifcOrganizationRelationship = new IfcOrganizationRelationshipImpl();
		return ifcOrganizationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrientationSelect createIfcOrientationSelect() {
		IfcOrientationSelectImpl ifcOrientationSelect = new IfcOrientationSelectImpl();
		return ifcOrientationSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrientedEdge createIfcOrientedEdge() {
		IfcOrientedEdgeImpl ifcOrientedEdge = new IfcOrientedEdgeImpl();
		return ifcOrientedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOutletType createIfcOutletType() {
		IfcOutletTypeImpl ifcOutletType = new IfcOutletTypeImpl();
		return ifcOutletType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOutletTypeEnumType createIfcOutletTypeEnumType() {
		IfcOutletTypeEnumTypeImpl ifcOutletTypeEnumType = new IfcOutletTypeEnumTypeImpl();
		return ifcOutletTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOwnerHistory createIfcOwnerHistory() {
		IfcOwnerHistoryImpl ifcOwnerHistory = new IfcOwnerHistoryImpl();
		return ifcOwnerHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcParameterValueType createIfcParameterValueType() {
		IfcParameterValueTypeImpl ifcParameterValueType = new IfcParameterValueTypeImpl();
		return ifcParameterValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPath createIfcPath() {
		IfcPathImpl ifcPath = new IfcPathImpl();
		return ifcPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerformanceHistory createIfcPerformanceHistory() {
		IfcPerformanceHistoryImpl ifcPerformanceHistory = new IfcPerformanceHistoryImpl();
		return ifcPerformanceHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPermeableCoveringOperationEnumType createIfcPermeableCoveringOperationEnumType() {
		IfcPermeableCoveringOperationEnumTypeImpl ifcPermeableCoveringOperationEnumType = new IfcPermeableCoveringOperationEnumTypeImpl();
		return ifcPermeableCoveringOperationEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPermeableCoveringProperties createIfcPermeableCoveringProperties() {
		IfcPermeableCoveringPropertiesImpl ifcPermeableCoveringProperties = new IfcPermeableCoveringPropertiesImpl();
		return ifcPermeableCoveringProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPermit createIfcPermit() {
		IfcPermitImpl ifcPermit = new IfcPermitImpl();
		return ifcPermit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerson createIfcPerson() {
		IfcPersonImpl ifcPerson = new IfcPersonImpl();
		return ifcPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPersonAndOrganization createIfcPersonAndOrganization() {
		IfcPersonAndOrganizationImpl ifcPersonAndOrganization = new IfcPersonAndOrganizationImpl();
		return ifcPersonAndOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPHMeasureType createIfcPHMeasureType() {
		IfcPHMeasureTypeImpl ifcPHMeasureType = new IfcPHMeasureTypeImpl();
		return ifcPHMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPhysicalComplexQuantity createIfcPhysicalComplexQuantity() {
		IfcPhysicalComplexQuantityImpl ifcPhysicalComplexQuantity = new IfcPhysicalComplexQuantityImpl();
		return ifcPhysicalComplexQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPhysicalOrVirtualEnumType createIfcPhysicalOrVirtualEnumType() {
		IfcPhysicalOrVirtualEnumTypeImpl ifcPhysicalOrVirtualEnumType = new IfcPhysicalOrVirtualEnumTypeImpl();
		return ifcPhysicalOrVirtualEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPile createIfcPile() {
		IfcPileImpl ifcPile = new IfcPileImpl();
		return ifcPile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPileConstructionEnumType createIfcPileConstructionEnumType() {
		IfcPileConstructionEnumTypeImpl ifcPileConstructionEnumType = new IfcPileConstructionEnumTypeImpl();
		return ifcPileConstructionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPileTypeEnumType createIfcPileTypeEnumType() {
		IfcPileTypeEnumTypeImpl ifcPileTypeEnumType = new IfcPileTypeEnumTypeImpl();
		return ifcPileTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPipeFittingType createIfcPipeFittingType() {
		IfcPipeFittingTypeImpl ifcPipeFittingType = new IfcPipeFittingTypeImpl();
		return ifcPipeFittingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPipeFittingTypeEnumType createIfcPipeFittingTypeEnumType() {
		IfcPipeFittingTypeEnumTypeImpl ifcPipeFittingTypeEnumType = new IfcPipeFittingTypeEnumTypeImpl();
		return ifcPipeFittingTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPipeSegmentType createIfcPipeSegmentType() {
		IfcPipeSegmentTypeImpl ifcPipeSegmentType = new IfcPipeSegmentTypeImpl();
		return ifcPipeSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPipeSegmentTypeEnumType createIfcPipeSegmentTypeEnumType() {
		IfcPipeSegmentTypeEnumTypeImpl ifcPipeSegmentTypeEnumType = new IfcPipeSegmentTypeEnumTypeImpl();
		return ifcPipeSegmentTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPixelTexture createIfcPixelTexture() {
		IfcPixelTextureImpl ifcPixelTexture = new IfcPixelTextureImpl();
		return ifcPixelTexture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarBox createIfcPlanarBox() {
		IfcPlanarBoxImpl ifcPlanarBox = new IfcPlanarBoxImpl();
		return ifcPlanarBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarExtent createIfcPlanarExtent() {
		IfcPlanarExtentImpl ifcPlanarExtent = new IfcPlanarExtentImpl();
		return ifcPlanarExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlanarForceMeasureType createIfcPlanarForceMeasureType() {
		IfcPlanarForceMeasureTypeImpl ifcPlanarForceMeasureType = new IfcPlanarForceMeasureTypeImpl();
		return ifcPlanarForceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlane createIfcPlane() {
		IfcPlaneImpl ifcPlane = new IfcPlaneImpl();
		return ifcPlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlaneAngleMeasureType createIfcPlaneAngleMeasureType() {
		IfcPlaneAngleMeasureTypeImpl ifcPlaneAngleMeasureType = new IfcPlaneAngleMeasureTypeImpl();
		return ifcPlaneAngleMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlate createIfcPlate() {
		IfcPlateImpl ifcPlate = new IfcPlateImpl();
		return ifcPlate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlateType createIfcPlateType() {
		IfcPlateTypeImpl ifcPlateType = new IfcPlateTypeImpl();
		return ifcPlateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlateTypeEnumType createIfcPlateTypeEnumType() {
		IfcPlateTypeEnumTypeImpl ifcPlateTypeEnumType = new IfcPlateTypeEnumTypeImpl();
		return ifcPlateTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOnCurve createIfcPointOnCurve() {
		IfcPointOnCurveImpl ifcPointOnCurve = new IfcPointOnCurveImpl();
		return ifcPointOnCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOnSurface createIfcPointOnSurface() {
		IfcPointOnSurfaceImpl ifcPointOnSurface = new IfcPointOnSurfaceImpl();
		return ifcPointOnSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPointOrVertexPoint createIfcPointOrVertexPoint() {
		IfcPointOrVertexPointImpl ifcPointOrVertexPoint = new IfcPointOrVertexPointImpl();
		return ifcPointOrVertexPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPolygonalBoundedHalfSpace createIfcPolygonalBoundedHalfSpace() {
		IfcPolygonalBoundedHalfSpaceImpl ifcPolygonalBoundedHalfSpace = new IfcPolygonalBoundedHalfSpaceImpl();
		return ifcPolygonalBoundedHalfSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPolyline createIfcPolyline() {
		IfcPolylineImpl ifcPolyline = new IfcPolylineImpl();
		return ifcPolyline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPolyLoop createIfcPolyLoop() {
		IfcPolyLoopImpl ifcPolyLoop = new IfcPolyLoopImpl();
		return ifcPolyLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveLengthMeasureType createIfcPositiveLengthMeasureType() {
		IfcPositiveLengthMeasureTypeImpl ifcPositiveLengthMeasureType = new IfcPositiveLengthMeasureTypeImpl();
		return ifcPositiveLengthMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositivePlaneAngleMeasureType createIfcPositivePlaneAngleMeasureType() {
		IfcPositivePlaneAngleMeasureTypeImpl ifcPositivePlaneAngleMeasureType = new IfcPositivePlaneAngleMeasureTypeImpl();
		return ifcPositivePlaneAngleMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPositiveRatioMeasureType createIfcPositiveRatioMeasureType() {
		IfcPositiveRatioMeasureTypeImpl ifcPositiveRatioMeasureType = new IfcPositiveRatioMeasureTypeImpl();
		return ifcPositiveRatioMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPostalAddress createIfcPostalAddress() {
		IfcPostalAddressImpl ifcPostalAddress = new IfcPostalAddressImpl();
		return ifcPostalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPowerMeasureType createIfcPowerMeasureType() {
		IfcPowerMeasureTypeImpl ifcPowerMeasureType = new IfcPowerMeasureTypeImpl();
		return ifcPowerMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreDefinedDimensionSymbol createIfcPreDefinedDimensionSymbol() {
		IfcPreDefinedDimensionSymbolImpl ifcPreDefinedDimensionSymbol = new IfcPreDefinedDimensionSymbolImpl();
		return ifcPreDefinedDimensionSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreDefinedPointMarkerSymbol createIfcPreDefinedPointMarkerSymbol() {
		IfcPreDefinedPointMarkerSymbolImpl ifcPreDefinedPointMarkerSymbol = new IfcPreDefinedPointMarkerSymbolImpl();
		return ifcPreDefinedPointMarkerSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreDefinedTerminatorSymbol createIfcPreDefinedTerminatorSymbol() {
		IfcPreDefinedTerminatorSymbolImpl ifcPreDefinedTerminatorSymbol = new IfcPreDefinedTerminatorSymbolImpl();
		return ifcPreDefinedTerminatorSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPresentableTextType createIfcPresentableTextType() {
		IfcPresentableTextTypeImpl ifcPresentableTextType = new IfcPresentableTextTypeImpl();
		return ifcPresentableTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPresentationLayerAssignment createIfcPresentationLayerAssignment() {
		IfcPresentationLayerAssignmentImpl ifcPresentationLayerAssignment = new IfcPresentationLayerAssignmentImpl();
		return ifcPresentationLayerAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPresentationLayerWithStyle createIfcPresentationLayerWithStyle() {
		IfcPresentationLayerWithStyleImpl ifcPresentationLayerWithStyle = new IfcPresentationLayerWithStyleImpl();
		return ifcPresentationLayerWithStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPresentationStyleAssignment createIfcPresentationStyleAssignment() {
		IfcPresentationStyleAssignmentImpl ifcPresentationStyleAssignment = new IfcPresentationStyleAssignmentImpl();
		return ifcPresentationStyleAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPresentationStyleSelect createIfcPresentationStyleSelect() {
		IfcPresentationStyleSelectImpl ifcPresentationStyleSelect = new IfcPresentationStyleSelectImpl();
		return ifcPresentationStyleSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPressureMeasureType createIfcPressureMeasureType() {
		IfcPressureMeasureTypeImpl ifcPressureMeasureType = new IfcPressureMeasureTypeImpl();
		return ifcPressureMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcedure createIfcProcedure() {
		IfcProcedureImpl ifcProcedure = new IfcProcedureImpl();
		return ifcProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcedureTypeEnumType createIfcProcedureTypeEnumType() {
		IfcProcedureTypeEnumTypeImpl ifcProcedureTypeEnumType = new IfcProcedureTypeEnumTypeImpl();
		return ifcProcedureTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductDefinitionShape createIfcProductDefinitionShape() {
		IfcProductDefinitionShapeImpl ifcProductDefinitionShape = new IfcProductDefinitionShapeImpl();
		return ifcProductDefinitionShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductRepresentation createIfcProductRepresentation() {
		IfcProductRepresentationImpl ifcProductRepresentation = new IfcProductRepresentationImpl();
		return ifcProductRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProductsOfCombustionProperties createIfcProductsOfCombustionProperties() {
		IfcProductsOfCombustionPropertiesImpl ifcProductsOfCombustionProperties = new IfcProductsOfCombustionPropertiesImpl();
		return ifcProductsOfCombustionProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileTypeEnumType createIfcProfileTypeEnumType() {
		IfcProfileTypeEnumTypeImpl ifcProfileTypeEnumType = new IfcProfileTypeEnumTypeImpl();
		return ifcProfileTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProject createIfcProject() {
		IfcProjectImpl ifcProject = new IfcProjectImpl();
		return ifcProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectedOrTrueLengthEnumType createIfcProjectedOrTrueLengthEnumType() {
		IfcProjectedOrTrueLengthEnumTypeImpl ifcProjectedOrTrueLengthEnumType = new IfcProjectedOrTrueLengthEnumTypeImpl();
		return ifcProjectedOrTrueLengthEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectionCurve createIfcProjectionCurve() {
		IfcProjectionCurveImpl ifcProjectionCurve = new IfcProjectionCurveImpl();
		return ifcProjectionCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectionElement createIfcProjectionElement() {
		IfcProjectionElementImpl ifcProjectionElement = new IfcProjectionElementImpl();
		return ifcProjectionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectOrder createIfcProjectOrder() {
		IfcProjectOrderImpl ifcProjectOrder = new IfcProjectOrderImpl();
		return ifcProjectOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectOrderRecord createIfcProjectOrderRecord() {
		IfcProjectOrderRecordImpl ifcProjectOrderRecord = new IfcProjectOrderRecordImpl();
		return ifcProjectOrderRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectOrderRecordTypeEnumType createIfcProjectOrderRecordTypeEnumType() {
		IfcProjectOrderRecordTypeEnumTypeImpl ifcProjectOrderRecordTypeEnumType = new IfcProjectOrderRecordTypeEnumTypeImpl();
		return ifcProjectOrderRecordTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectOrderTypeEnumType createIfcProjectOrderTypeEnumType() {
		IfcProjectOrderTypeEnumTypeImpl ifcProjectOrderTypeEnumType = new IfcProjectOrderTypeEnumTypeImpl();
		return ifcProjectOrderTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyBoundedValue createIfcPropertyBoundedValue() {
		IfcPropertyBoundedValueImpl ifcPropertyBoundedValue = new IfcPropertyBoundedValueImpl();
		return ifcPropertyBoundedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyConstraintRelationship createIfcPropertyConstraintRelationship() {
		IfcPropertyConstraintRelationshipImpl ifcPropertyConstraintRelationship = new IfcPropertyConstraintRelationshipImpl();
		return ifcPropertyConstraintRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyDependencyRelationship createIfcPropertyDependencyRelationship() {
		IfcPropertyDependencyRelationshipImpl ifcPropertyDependencyRelationship = new IfcPropertyDependencyRelationshipImpl();
		return ifcPropertyDependencyRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyEnumeratedValue createIfcPropertyEnumeratedValue() {
		IfcPropertyEnumeratedValueImpl ifcPropertyEnumeratedValue = new IfcPropertyEnumeratedValueImpl();
		return ifcPropertyEnumeratedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyEnumeration createIfcPropertyEnumeration() {
		IfcPropertyEnumerationImpl ifcPropertyEnumeration = new IfcPropertyEnumerationImpl();
		return ifcPropertyEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyListValue createIfcPropertyListValue() {
		IfcPropertyListValueImpl ifcPropertyListValue = new IfcPropertyListValueImpl();
		return ifcPropertyListValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyReferenceValue createIfcPropertyReferenceValue() {
		IfcPropertyReferenceValueImpl ifcPropertyReferenceValue = new IfcPropertyReferenceValueImpl();
		return ifcPropertyReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySet createIfcPropertySet() {
		IfcPropertySetImpl ifcPropertySet = new IfcPropertySetImpl();
		return ifcPropertySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySingleValue createIfcPropertySingleValue() {
		IfcPropertySingleValueImpl ifcPropertySingleValue = new IfcPropertySingleValueImpl();
		return ifcPropertySingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySourceEnumType createIfcPropertySourceEnumType() {
		IfcPropertySourceEnumTypeImpl ifcPropertySourceEnumType = new IfcPropertySourceEnumTypeImpl();
		return ifcPropertySourceEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyTableValue createIfcPropertyTableValue() {
		IfcPropertyTableValueImpl ifcPropertyTableValue = new IfcPropertyTableValueImpl();
		return ifcPropertyTableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProtectiveDeviceType createIfcProtectiveDeviceType() {
		IfcProtectiveDeviceTypeImpl ifcProtectiveDeviceType = new IfcProtectiveDeviceTypeImpl();
		return ifcProtectiveDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProtectiveDeviceTypeEnumType createIfcProtectiveDeviceTypeEnumType() {
		IfcProtectiveDeviceTypeEnumTypeImpl ifcProtectiveDeviceTypeEnumType = new IfcProtectiveDeviceTypeEnumTypeImpl();
		return ifcProtectiveDeviceTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProxy createIfcProxy() {
		IfcProxyImpl ifcProxy = new IfcProxyImpl();
		return ifcProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPumpType createIfcPumpType() {
		IfcPumpTypeImpl ifcPumpType = new IfcPumpTypeImpl();
		return ifcPumpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPumpTypeEnumType createIfcPumpTypeEnumType() {
		IfcPumpTypeEnumTypeImpl ifcPumpTypeEnumType = new IfcPumpTypeEnumTypeImpl();
		return ifcPumpTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcQuantityArea createIfcQuantityArea() {
		IfcQuantityAreaImpl ifcQuantityArea = new IfcQuantityAreaImpl();
		return ifcQuantityArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcQuantityCount createIfcQuantityCount() {
		IfcQuantityCountImpl ifcQuantityCount = new IfcQuantityCountImpl();
		return ifcQuantityCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcQuantityLength createIfcQuantityLength() {
		IfcQuantityLengthImpl ifcQuantityLength = new IfcQuantityLengthImpl();
		return ifcQuantityLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcQuantityTime createIfcQuantityTime() {
		IfcQuantityTimeImpl ifcQuantityTime = new IfcQuantityTimeImpl();
		return ifcQuantityTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcQuantityVolume createIfcQuantityVolume() {
		IfcQuantityVolumeImpl ifcQuantityVolume = new IfcQuantityVolumeImpl();
		return ifcQuantityVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcQuantityWeight createIfcQuantityWeight() {
		IfcQuantityWeightImpl ifcQuantityWeight = new IfcQuantityWeightImpl();
		return ifcQuantityWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRadioActivityMeasureType createIfcRadioActivityMeasureType() {
		IfcRadioActivityMeasureTypeImpl ifcRadioActivityMeasureType = new IfcRadioActivityMeasureTypeImpl();
		return ifcRadioActivityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRadiusDimension createIfcRadiusDimension() {
		IfcRadiusDimensionImpl ifcRadiusDimension = new IfcRadiusDimensionImpl();
		return ifcRadiusDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRailing createIfcRailing() {
		IfcRailingImpl ifcRailing = new IfcRailingImpl();
		return ifcRailing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRailingType createIfcRailingType() {
		IfcRailingTypeImpl ifcRailingType = new IfcRailingTypeImpl();
		return ifcRailingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRailingTypeEnumType createIfcRailingTypeEnumType() {
		IfcRailingTypeEnumTypeImpl ifcRailingTypeEnumType = new IfcRailingTypeEnumTypeImpl();
		return ifcRailingTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRamp createIfcRamp() {
		IfcRampImpl ifcRamp = new IfcRampImpl();
		return ifcRamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRampFlight createIfcRampFlight() {
		IfcRampFlightImpl ifcRampFlight = new IfcRampFlightImpl();
		return ifcRampFlight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRampFlightType createIfcRampFlightType() {
		IfcRampFlightTypeImpl ifcRampFlightType = new IfcRampFlightTypeImpl();
		return ifcRampFlightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRampFlightTypeEnumType createIfcRampFlightTypeEnumType() {
		IfcRampFlightTypeEnumTypeImpl ifcRampFlightTypeEnumType = new IfcRampFlightTypeEnumTypeImpl();
		return ifcRampFlightTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRampTypeEnumType createIfcRampTypeEnumType() {
		IfcRampTypeEnumTypeImpl ifcRampTypeEnumType = new IfcRampTypeEnumTypeImpl();
		return ifcRampTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRatioMeasureType createIfcRatioMeasureType() {
		IfcRatioMeasureTypeImpl ifcRatioMeasureType = new IfcRatioMeasureTypeImpl();
		return ifcRatioMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRationalBezierCurve createIfcRationalBezierCurve() {
		IfcRationalBezierCurveImpl ifcRationalBezierCurve = new IfcRationalBezierCurveImpl();
		return ifcRationalBezierCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRealType createIfcRealType() {
		IfcRealTypeImpl ifcRealType = new IfcRealTypeImpl();
		return ifcRealType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRectangleHollowProfileDef createIfcRectangleHollowProfileDef() {
		IfcRectangleHollowProfileDefImpl ifcRectangleHollowProfileDef = new IfcRectangleHollowProfileDefImpl();
		return ifcRectangleHollowProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRectangleProfileDef createIfcRectangleProfileDef() {
		IfcRectangleProfileDefImpl ifcRectangleProfileDef = new IfcRectangleProfileDefImpl();
		return ifcRectangleProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRectangularPyramid createIfcRectangularPyramid() {
		IfcRectangularPyramidImpl ifcRectangularPyramid = new IfcRectangularPyramidImpl();
		return ifcRectangularPyramid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRectangularTrimmedSurface createIfcRectangularTrimmedSurface() {
		IfcRectangularTrimmedSurfaceImpl ifcRectangularTrimmedSurface = new IfcRectangularTrimmedSurfaceImpl();
		return ifcRectangularTrimmedSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReferencesValueDocument createIfcReferencesValueDocument() {
		IfcReferencesValueDocumentImpl ifcReferencesValueDocument = new IfcReferencesValueDocumentImpl();
		return ifcReferencesValueDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReflectanceMethodEnumType createIfcReflectanceMethodEnumType() {
		IfcReflectanceMethodEnumTypeImpl ifcReflectanceMethodEnumType = new IfcReflectanceMethodEnumTypeImpl();
		return ifcReflectanceMethodEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRegularTimeSeries createIfcRegularTimeSeries() {
		IfcRegularTimeSeriesImpl ifcRegularTimeSeries = new IfcRegularTimeSeriesImpl();
		return ifcRegularTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcementBarProperties createIfcReinforcementBarProperties() {
		IfcReinforcementBarPropertiesImpl ifcReinforcementBarProperties = new IfcReinforcementBarPropertiesImpl();
		return ifcReinforcementBarProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcementDefinitionProperties createIfcReinforcementDefinitionProperties() {
		IfcReinforcementDefinitionPropertiesImpl ifcReinforcementDefinitionProperties = new IfcReinforcementDefinitionPropertiesImpl();
		return ifcReinforcementDefinitionProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBar createIfcReinforcingBar() {
		IfcReinforcingBarImpl ifcReinforcingBar = new IfcReinforcingBarImpl();
		return ifcReinforcingBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnumType createIfcReinforcingBarRoleEnumType() {
		IfcReinforcingBarRoleEnumTypeImpl ifcReinforcingBarRoleEnumType = new IfcReinforcingBarRoleEnumTypeImpl();
		return ifcReinforcingBarRoleEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnumType createIfcReinforcingBarSurfaceEnumType() {
		IfcReinforcingBarSurfaceEnumTypeImpl ifcReinforcingBarSurfaceEnumType = new IfcReinforcingBarSurfaceEnumTypeImpl();
		return ifcReinforcingBarSurfaceEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingMesh createIfcReinforcingMesh() {
		IfcReinforcingMeshImpl ifcReinforcingMesh = new IfcReinforcingMeshImpl();
		return ifcReinforcingMesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAggregates createIfcRelAggregates() {
		IfcRelAggregatesImpl ifcRelAggregates = new IfcRelAggregatesImpl();
		return ifcRelAggregates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsTasks createIfcRelAssignsTasks() {
		IfcRelAssignsTasksImpl ifcRelAssignsTasks = new IfcRelAssignsTasksImpl();
		return ifcRelAssignsTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToActor createIfcRelAssignsToActor() {
		IfcRelAssignsToActorImpl ifcRelAssignsToActor = new IfcRelAssignsToActorImpl();
		return ifcRelAssignsToActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToControl createIfcRelAssignsToControl() {
		IfcRelAssignsToControlImpl ifcRelAssignsToControl = new IfcRelAssignsToControlImpl();
		return ifcRelAssignsToControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToGroup createIfcRelAssignsToGroup() {
		IfcRelAssignsToGroupImpl ifcRelAssignsToGroup = new IfcRelAssignsToGroupImpl();
		return ifcRelAssignsToGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToProcess createIfcRelAssignsToProcess() {
		IfcRelAssignsToProcessImpl ifcRelAssignsToProcess = new IfcRelAssignsToProcessImpl();
		return ifcRelAssignsToProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToProduct createIfcRelAssignsToProduct() {
		IfcRelAssignsToProductImpl ifcRelAssignsToProduct = new IfcRelAssignsToProductImpl();
		return ifcRelAssignsToProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToProjectOrder createIfcRelAssignsToProjectOrder() {
		IfcRelAssignsToProjectOrderImpl ifcRelAssignsToProjectOrder = new IfcRelAssignsToProjectOrderImpl();
		return ifcRelAssignsToProjectOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssignsToResource createIfcRelAssignsToResource() {
		IfcRelAssignsToResourceImpl ifcRelAssignsToResource = new IfcRelAssignsToResourceImpl();
		return ifcRelAssignsToResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssociates createIfcRelAssociates() {
		IfcRelAssociatesImpl ifcRelAssociates = new IfcRelAssociatesImpl();
		return ifcRelAssociates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssociatesAppliedValue createIfcRelAssociatesAppliedValue() {
		IfcRelAssociatesAppliedValueImpl ifcRelAssociatesAppliedValue = new IfcRelAssociatesAppliedValueImpl();
		return ifcRelAssociatesAppliedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssociatesApproval createIfcRelAssociatesApproval() {
		IfcRelAssociatesApprovalImpl ifcRelAssociatesApproval = new IfcRelAssociatesApprovalImpl();
		return ifcRelAssociatesApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssociatesClassification createIfcRelAssociatesClassification() {
		IfcRelAssociatesClassificationImpl ifcRelAssociatesClassification = new IfcRelAssociatesClassificationImpl();
		return ifcRelAssociatesClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssociatesConstraint createIfcRelAssociatesConstraint() {
		IfcRelAssociatesConstraintImpl ifcRelAssociatesConstraint = new IfcRelAssociatesConstraintImpl();
		return ifcRelAssociatesConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssociatesDocument createIfcRelAssociatesDocument() {
		IfcRelAssociatesDocumentImpl ifcRelAssociatesDocument = new IfcRelAssociatesDocumentImpl();
		return ifcRelAssociatesDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssociatesLibrary createIfcRelAssociatesLibrary() {
		IfcRelAssociatesLibraryImpl ifcRelAssociatesLibrary = new IfcRelAssociatesLibraryImpl();
		return ifcRelAssociatesLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssociatesMaterial createIfcRelAssociatesMaterial() {
		IfcRelAssociatesMaterialImpl ifcRelAssociatesMaterial = new IfcRelAssociatesMaterialImpl();
		return ifcRelAssociatesMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelAssociatesProfileProperties createIfcRelAssociatesProfileProperties() {
		IfcRelAssociatesProfilePropertiesImpl ifcRelAssociatesProfileProperties = new IfcRelAssociatesProfilePropertiesImpl();
		return ifcRelAssociatesProfileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelaxation createIfcRelaxation() {
		IfcRelaxationImpl ifcRelaxation = new IfcRelaxationImpl();
		return ifcRelaxation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsElements createIfcRelConnectsElements() {
		IfcRelConnectsElementsImpl ifcRelConnectsElements = new IfcRelConnectsElementsImpl();
		return ifcRelConnectsElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsPathElements createIfcRelConnectsPathElements() {
		IfcRelConnectsPathElementsImpl ifcRelConnectsPathElements = new IfcRelConnectsPathElementsImpl();
		return ifcRelConnectsPathElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsPorts createIfcRelConnectsPorts() {
		IfcRelConnectsPortsImpl ifcRelConnectsPorts = new IfcRelConnectsPortsImpl();
		return ifcRelConnectsPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsPortToElement createIfcRelConnectsPortToElement() {
		IfcRelConnectsPortToElementImpl ifcRelConnectsPortToElement = new IfcRelConnectsPortToElementImpl();
		return ifcRelConnectsPortToElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsStructuralActivity createIfcRelConnectsStructuralActivity() {
		IfcRelConnectsStructuralActivityImpl ifcRelConnectsStructuralActivity = new IfcRelConnectsStructuralActivityImpl();
		return ifcRelConnectsStructuralActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsStructuralElement createIfcRelConnectsStructuralElement() {
		IfcRelConnectsStructuralElementImpl ifcRelConnectsStructuralElement = new IfcRelConnectsStructuralElementImpl();
		return ifcRelConnectsStructuralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsStructuralMember createIfcRelConnectsStructuralMember() {
		IfcRelConnectsStructuralMemberImpl ifcRelConnectsStructuralMember = new IfcRelConnectsStructuralMemberImpl();
		return ifcRelConnectsStructuralMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsWithEccentricity createIfcRelConnectsWithEccentricity() {
		IfcRelConnectsWithEccentricityImpl ifcRelConnectsWithEccentricity = new IfcRelConnectsWithEccentricityImpl();
		return ifcRelConnectsWithEccentricity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelConnectsWithRealizingElements createIfcRelConnectsWithRealizingElements() {
		IfcRelConnectsWithRealizingElementsImpl ifcRelConnectsWithRealizingElements = new IfcRelConnectsWithRealizingElementsImpl();
		return ifcRelConnectsWithRealizingElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelContainedInSpatialStructure createIfcRelContainedInSpatialStructure() {
		IfcRelContainedInSpatialStructureImpl ifcRelContainedInSpatialStructure = new IfcRelContainedInSpatialStructureImpl();
		return ifcRelContainedInSpatialStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelCoversBldgElements createIfcRelCoversBldgElements() {
		IfcRelCoversBldgElementsImpl ifcRelCoversBldgElements = new IfcRelCoversBldgElementsImpl();
		return ifcRelCoversBldgElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelCoversSpaces createIfcRelCoversSpaces() {
		IfcRelCoversSpacesImpl ifcRelCoversSpaces = new IfcRelCoversSpacesImpl();
		return ifcRelCoversSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelDefinesByProperties createIfcRelDefinesByProperties() {
		IfcRelDefinesByPropertiesImpl ifcRelDefinesByProperties = new IfcRelDefinesByPropertiesImpl();
		return ifcRelDefinesByProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelDefinesByType createIfcRelDefinesByType() {
		IfcRelDefinesByTypeImpl ifcRelDefinesByType = new IfcRelDefinesByTypeImpl();
		return ifcRelDefinesByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelFillsElement createIfcRelFillsElement() {
		IfcRelFillsElementImpl ifcRelFillsElement = new IfcRelFillsElementImpl();
		return ifcRelFillsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelFlowControlElements createIfcRelFlowControlElements() {
		IfcRelFlowControlElementsImpl ifcRelFlowControlElements = new IfcRelFlowControlElementsImpl();
		return ifcRelFlowControlElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelInteractionRequirements createIfcRelInteractionRequirements() {
		IfcRelInteractionRequirementsImpl ifcRelInteractionRequirements = new IfcRelInteractionRequirementsImpl();
		return ifcRelInteractionRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelNests createIfcRelNests() {
		IfcRelNestsImpl ifcRelNests = new IfcRelNestsImpl();
		return ifcRelNests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelOccupiesSpaces createIfcRelOccupiesSpaces() {
		IfcRelOccupiesSpacesImpl ifcRelOccupiesSpaces = new IfcRelOccupiesSpacesImpl();
		return ifcRelOccupiesSpaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelOverridesProperties createIfcRelOverridesProperties() {
		IfcRelOverridesPropertiesImpl ifcRelOverridesProperties = new IfcRelOverridesPropertiesImpl();
		return ifcRelOverridesProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelProjectsElement createIfcRelProjectsElement() {
		IfcRelProjectsElementImpl ifcRelProjectsElement = new IfcRelProjectsElementImpl();
		return ifcRelProjectsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelReferencedInSpatialStructure createIfcRelReferencedInSpatialStructure() {
		IfcRelReferencedInSpatialStructureImpl ifcRelReferencedInSpatialStructure = new IfcRelReferencedInSpatialStructureImpl();
		return ifcRelReferencedInSpatialStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelSchedulesCostItems createIfcRelSchedulesCostItems() {
		IfcRelSchedulesCostItemsImpl ifcRelSchedulesCostItems = new IfcRelSchedulesCostItemsImpl();
		return ifcRelSchedulesCostItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelSequence createIfcRelSequence() {
		IfcRelSequenceImpl ifcRelSequence = new IfcRelSequenceImpl();
		return ifcRelSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelServicesBuildings createIfcRelServicesBuildings() {
		IfcRelServicesBuildingsImpl ifcRelServicesBuildings = new IfcRelServicesBuildingsImpl();
		return ifcRelServicesBuildings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelSpaceBoundary createIfcRelSpaceBoundary() {
		IfcRelSpaceBoundaryImpl ifcRelSpaceBoundary = new IfcRelSpaceBoundaryImpl();
		return ifcRelSpaceBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelVoidsElement createIfcRelVoidsElement() {
		IfcRelVoidsElementImpl ifcRelVoidsElement = new IfcRelVoidsElementImpl();
		return ifcRelVoidsElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentation createIfcRepresentation() {
		IfcRepresentationImpl ifcRepresentation = new IfcRepresentationImpl();
		return ifcRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationContext createIfcRepresentationContext() {
		IfcRepresentationContextImpl ifcRepresentationContext = new IfcRepresentationContextImpl();
		return ifcRepresentationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationMap createIfcRepresentationMap() {
		IfcRepresentationMapImpl ifcRepresentationMap = new IfcRepresentationMapImpl();
		return ifcRepresentationMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcResourceConsumptionEnumType createIfcResourceConsumptionEnumType() {
		IfcResourceConsumptionEnumTypeImpl ifcResourceConsumptionEnumType = new IfcResourceConsumptionEnumTypeImpl();
		return ifcResourceConsumptionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRevolvedAreaSolid createIfcRevolvedAreaSolid() {
		IfcRevolvedAreaSolidImpl ifcRevolvedAreaSolid = new IfcRevolvedAreaSolidImpl();
		return ifcRevolvedAreaSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRibPlateDirectionEnumType createIfcRibPlateDirectionEnumType() {
		IfcRibPlateDirectionEnumTypeImpl ifcRibPlateDirectionEnumType = new IfcRibPlateDirectionEnumTypeImpl();
		return ifcRibPlateDirectionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRibPlateProfileProperties createIfcRibPlateProfileProperties() {
		IfcRibPlateProfilePropertiesImpl ifcRibPlateProfileProperties = new IfcRibPlateProfilePropertiesImpl();
		return ifcRibPlateProfileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRightCircularCone createIfcRightCircularCone() {
		IfcRightCircularConeImpl ifcRightCircularCone = new IfcRightCircularConeImpl();
		return ifcRightCircularCone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRightCircularCylinder createIfcRightCircularCylinder() {
		IfcRightCircularCylinderImpl ifcRightCircularCylinder = new IfcRightCircularCylinderImpl();
		return ifcRightCircularCylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoleEnumType createIfcRoleEnumType() {
		IfcRoleEnumTypeImpl ifcRoleEnumType = new IfcRoleEnumTypeImpl();
		return ifcRoleEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoof createIfcRoof() {
		IfcRoofImpl ifcRoof = new IfcRoofImpl();
		return ifcRoof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoofTypeEnumType createIfcRoofTypeEnumType() {
		IfcRoofTypeEnumTypeImpl ifcRoofTypeEnumType = new IfcRoofTypeEnumTypeImpl();
		return ifcRoofTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRotationalFrequencyMeasureType createIfcRotationalFrequencyMeasureType() {
		IfcRotationalFrequencyMeasureTypeImpl ifcRotationalFrequencyMeasureType = new IfcRotationalFrequencyMeasureTypeImpl();
		return ifcRotationalFrequencyMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRotationalMassMeasureType createIfcRotationalMassMeasureType() {
		IfcRotationalMassMeasureTypeImpl ifcRotationalMassMeasureType = new IfcRotationalMassMeasureTypeImpl();
		return ifcRotationalMassMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRotationalStiffnessMeasureType createIfcRotationalStiffnessMeasureType() {
		IfcRotationalStiffnessMeasureTypeImpl ifcRotationalStiffnessMeasureType = new IfcRotationalStiffnessMeasureTypeImpl();
		return ifcRotationalStiffnessMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoundedEdgeFeature createIfcRoundedEdgeFeature() {
		IfcRoundedEdgeFeatureImpl ifcRoundedEdgeFeature = new IfcRoundedEdgeFeatureImpl();
		return ifcRoundedEdgeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoundedRectangleProfileDef createIfcRoundedRectangleProfileDef() {
		IfcRoundedRectangleProfileDefImpl ifcRoundedRectangleProfileDef = new IfcRoundedRectangleProfileDefImpl();
		return ifcRoundedRectangleProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSanitaryTerminalType createIfcSanitaryTerminalType() {
		IfcSanitaryTerminalTypeImpl ifcSanitaryTerminalType = new IfcSanitaryTerminalTypeImpl();
		return ifcSanitaryTerminalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSanitaryTerminalTypeEnumType createIfcSanitaryTerminalTypeEnumType() {
		IfcSanitaryTerminalTypeEnumTypeImpl ifcSanitaryTerminalTypeEnumType = new IfcSanitaryTerminalTypeEnumTypeImpl();
		return ifcSanitaryTerminalTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcScheduleTimeControl createIfcScheduleTimeControl() {
		IfcScheduleTimeControlImpl ifcScheduleTimeControl = new IfcScheduleTimeControlImpl();
		return ifcScheduleTimeControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSecondInMinuteType createIfcSecondInMinuteType() {
		IfcSecondInMinuteTypeImpl ifcSecondInMinuteType = new IfcSecondInMinuteTypeImpl();
		return ifcSecondInMinuteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionalAreaIntegralMeasureType createIfcSectionalAreaIntegralMeasureType() {
		IfcSectionalAreaIntegralMeasureTypeImpl ifcSectionalAreaIntegralMeasureType = new IfcSectionalAreaIntegralMeasureTypeImpl();
		return ifcSectionalAreaIntegralMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionedSpine createIfcSectionedSpine() {
		IfcSectionedSpineImpl ifcSectionedSpine = new IfcSectionedSpineImpl();
		return ifcSectionedSpine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionModulusMeasureType createIfcSectionModulusMeasureType() {
		IfcSectionModulusMeasureTypeImpl ifcSectionModulusMeasureType = new IfcSectionModulusMeasureTypeImpl();
		return ifcSectionModulusMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionProperties createIfcSectionProperties() {
		IfcSectionPropertiesImpl ifcSectionProperties = new IfcSectionPropertiesImpl();
		return ifcSectionProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionReinforcementProperties createIfcSectionReinforcementProperties() {
		IfcSectionReinforcementPropertiesImpl ifcSectionReinforcementProperties = new IfcSectionReinforcementPropertiesImpl();
		return ifcSectionReinforcementProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionTypeEnumType createIfcSectionTypeEnumType() {
		IfcSectionTypeEnumTypeImpl ifcSectionTypeEnumType = new IfcSectionTypeEnumTypeImpl();
		return ifcSectionTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSensorType createIfcSensorType() {
		IfcSensorTypeImpl ifcSensorType = new IfcSensorTypeImpl();
		return ifcSensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSensorTypeEnumType createIfcSensorTypeEnumType() {
		IfcSensorTypeEnumTypeImpl ifcSensorTypeEnumType = new IfcSensorTypeEnumTypeImpl();
		return ifcSensorTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSequenceEnumType createIfcSequenceEnumType() {
		IfcSequenceEnumTypeImpl ifcSequenceEnumType = new IfcSequenceEnumTypeImpl();
		return ifcSequenceEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLife createIfcServiceLife() {
		IfcServiceLifeImpl ifcServiceLife = new IfcServiceLifeImpl();
		return ifcServiceLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeFactor createIfcServiceLifeFactor() {
		IfcServiceLifeFactorImpl ifcServiceLifeFactor = new IfcServiceLifeFactorImpl();
		return ifcServiceLifeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeFactorTypeEnumType createIfcServiceLifeFactorTypeEnumType() {
		IfcServiceLifeFactorTypeEnumTypeImpl ifcServiceLifeFactorTypeEnumType = new IfcServiceLifeFactorTypeEnumTypeImpl();
		return ifcServiceLifeFactorTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeTypeEnumType createIfcServiceLifeTypeEnumType() {
		IfcServiceLifeTypeEnumTypeImpl ifcServiceLifeTypeEnumType = new IfcServiceLifeTypeEnumTypeImpl();
		return ifcServiceLifeTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeAspect createIfcShapeAspect() {
		IfcShapeAspectImpl ifcShapeAspect = new IfcShapeAspectImpl();
		return ifcShapeAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShapeRepresentation createIfcShapeRepresentation() {
		IfcShapeRepresentationImpl ifcShapeRepresentation = new IfcShapeRepresentationImpl();
		return ifcShapeRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShearModulusMeasureType createIfcShearModulusMeasureType() {
		IfcShearModulusMeasureTypeImpl ifcShearModulusMeasureType = new IfcShearModulusMeasureTypeImpl();
		return ifcShearModulusMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShell createIfcShell() {
		IfcShellImpl ifcShell = new IfcShellImpl();
		return ifcShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcShellBasedSurfaceModel createIfcShellBasedSurfaceModel() {
		IfcShellBasedSurfaceModelImpl ifcShellBasedSurfaceModel = new IfcShellBasedSurfaceModelImpl();
		return ifcShellBasedSurfaceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSimpleValue createIfcSimpleValue() {
		IfcSimpleValueImpl ifcSimpleValue = new IfcSimpleValueImpl();
		return ifcSimpleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSIPrefixType createIfcSIPrefixType() {
		IfcSIPrefixTypeImpl ifcSIPrefixType = new IfcSIPrefixTypeImpl();
		return ifcSIPrefixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSite createIfcSite() {
		IfcSiteImpl ifcSite = new IfcSiteImpl();
		return ifcSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSIUnit createIfcSIUnit() {
		IfcSIUnitImpl ifcSIUnit = new IfcSIUnitImpl();
		return ifcSIUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSIUnitNameType createIfcSIUnitNameType() {
		IfcSIUnitNameTypeImpl ifcSIUnitNameType = new IfcSIUnitNameTypeImpl();
		return ifcSIUnitNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect createIfcSizeSelect() {
		IfcSizeSelectImpl ifcSizeSelect = new IfcSizeSelectImpl();
		return ifcSizeSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSlab createIfcSlab() {
		IfcSlabImpl ifcSlab = new IfcSlabImpl();
		return ifcSlab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSlabType createIfcSlabType() {
		IfcSlabTypeImpl ifcSlabType = new IfcSlabTypeImpl();
		return ifcSlabType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSlabTypeEnumType createIfcSlabTypeEnumType() {
		IfcSlabTypeEnumTypeImpl ifcSlabTypeEnumType = new IfcSlabTypeEnumTypeImpl();
		return ifcSlabTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSlippageConnectionCondition createIfcSlippageConnectionCondition() {
		IfcSlippageConnectionConditionImpl ifcSlippageConnectionCondition = new IfcSlippageConnectionConditionImpl();
		return ifcSlippageConnectionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSolidAngleMeasureType createIfcSolidAngleMeasureType() {
		IfcSolidAngleMeasureTypeImpl ifcSolidAngleMeasureType = new IfcSolidAngleMeasureTypeImpl();
		return ifcSolidAngleMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundPowerMeasureType createIfcSoundPowerMeasureType() {
		IfcSoundPowerMeasureTypeImpl ifcSoundPowerMeasureType = new IfcSoundPowerMeasureTypeImpl();
		return ifcSoundPowerMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundPressureMeasureType createIfcSoundPressureMeasureType() {
		IfcSoundPressureMeasureTypeImpl ifcSoundPressureMeasureType = new IfcSoundPressureMeasureTypeImpl();
		return ifcSoundPressureMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundProperties createIfcSoundProperties() {
		IfcSoundPropertiesImpl ifcSoundProperties = new IfcSoundPropertiesImpl();
		return ifcSoundProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundScaleEnumType createIfcSoundScaleEnumType() {
		IfcSoundScaleEnumTypeImpl ifcSoundScaleEnumType = new IfcSoundScaleEnumTypeImpl();
		return ifcSoundScaleEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundValue createIfcSoundValue() {
		IfcSoundValueImpl ifcSoundValue = new IfcSoundValueImpl();
		return ifcSoundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpace createIfcSpace() {
		IfcSpaceImpl ifcSpace = new IfcSpaceImpl();
		return ifcSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceHeaterType createIfcSpaceHeaterType() {
		IfcSpaceHeaterTypeImpl ifcSpaceHeaterType = new IfcSpaceHeaterTypeImpl();
		return ifcSpaceHeaterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceHeaterTypeEnumType createIfcSpaceHeaterTypeEnumType() {
		IfcSpaceHeaterTypeEnumTypeImpl ifcSpaceHeaterTypeEnumType = new IfcSpaceHeaterTypeEnumTypeImpl();
		return ifcSpaceHeaterTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceProgram createIfcSpaceProgram() {
		IfcSpaceProgramImpl ifcSpaceProgram = new IfcSpaceProgramImpl();
		return ifcSpaceProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceThermalLoadProperties createIfcSpaceThermalLoadProperties() {
		IfcSpaceThermalLoadPropertiesImpl ifcSpaceThermalLoadProperties = new IfcSpaceThermalLoadPropertiesImpl();
		return ifcSpaceThermalLoadProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceType createIfcSpaceType() {
		IfcSpaceTypeImpl ifcSpaceType = new IfcSpaceTypeImpl();
		return ifcSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceTypeEnumType createIfcSpaceTypeEnumType() {
		IfcSpaceTypeEnumTypeImpl ifcSpaceTypeEnumType = new IfcSpaceTypeEnumTypeImpl();
		return ifcSpaceTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecificHeatCapacityMeasureType createIfcSpecificHeatCapacityMeasureType() {
		IfcSpecificHeatCapacityMeasureTypeImpl ifcSpecificHeatCapacityMeasureType = new IfcSpecificHeatCapacityMeasureTypeImpl();
		return ifcSpecificHeatCapacityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecularExponentType createIfcSpecularExponentType() {
		IfcSpecularExponentTypeImpl ifcSpecularExponentType = new IfcSpecularExponentTypeImpl();
		return ifcSpecularExponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecularHighlightSelect createIfcSpecularHighlightSelect() {
		IfcSpecularHighlightSelectImpl ifcSpecularHighlightSelect = new IfcSpecularHighlightSelectImpl();
		return ifcSpecularHighlightSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpecularRoughnessType createIfcSpecularRoughnessType() {
		IfcSpecularRoughnessTypeImpl ifcSpecularRoughnessType = new IfcSpecularRoughnessTypeImpl();
		return ifcSpecularRoughnessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSphere createIfcSphere() {
		IfcSphereImpl ifcSphere = new IfcSphereImpl();
		return ifcSphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStackTerminalType createIfcStackTerminalType() {
		IfcStackTerminalTypeImpl ifcStackTerminalType = new IfcStackTerminalTypeImpl();
		return ifcStackTerminalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStackTerminalTypeEnumType createIfcStackTerminalTypeEnumType() {
		IfcStackTerminalTypeEnumTypeImpl ifcStackTerminalTypeEnumType = new IfcStackTerminalTypeEnumTypeImpl();
		return ifcStackTerminalTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStair createIfcStair() {
		IfcStairImpl ifcStair = new IfcStairImpl();
		return ifcStair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairFlight createIfcStairFlight() {
		IfcStairFlightImpl ifcStairFlight = new IfcStairFlightImpl();
		return ifcStairFlight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairFlightType createIfcStairFlightType() {
		IfcStairFlightTypeImpl ifcStairFlightType = new IfcStairFlightTypeImpl();
		return ifcStairFlightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairFlightTypeEnumType createIfcStairFlightTypeEnumType() {
		IfcStairFlightTypeEnumTypeImpl ifcStairFlightTypeEnumType = new IfcStairFlightTypeEnumTypeImpl();
		return ifcStairFlightTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairTypeEnumType createIfcStairTypeEnumType() {
		IfcStairTypeEnumTypeImpl ifcStairTypeEnumType = new IfcStairTypeEnumTypeImpl();
		return ifcStairTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStateEnumType createIfcStateEnumType() {
		IfcStateEnumTypeImpl ifcStateEnumType = new IfcStateEnumTypeImpl();
		return ifcStateEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralActivityAssignmentSelect createIfcStructuralActivityAssignmentSelect() {
		IfcStructuralActivityAssignmentSelectImpl ifcStructuralActivityAssignmentSelect = new IfcStructuralActivityAssignmentSelectImpl();
		return ifcStructuralActivityAssignmentSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralAnalysisModel createIfcStructuralAnalysisModel() {
		IfcStructuralAnalysisModelImpl ifcStructuralAnalysisModel = new IfcStructuralAnalysisModelImpl();
		return ifcStructuralAnalysisModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralCurveConnection createIfcStructuralCurveConnection() {
		IfcStructuralCurveConnectionImpl ifcStructuralCurveConnection = new IfcStructuralCurveConnectionImpl();
		return ifcStructuralCurveConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralCurveMember createIfcStructuralCurveMember() {
		IfcStructuralCurveMemberImpl ifcStructuralCurveMember = new IfcStructuralCurveMemberImpl();
		return ifcStructuralCurveMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralCurveMemberVarying createIfcStructuralCurveMemberVarying() {
		IfcStructuralCurveMemberVaryingImpl ifcStructuralCurveMemberVarying = new IfcStructuralCurveMemberVaryingImpl();
		return ifcStructuralCurveMemberVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralCurveTypeEnumType createIfcStructuralCurveTypeEnumType() {
		IfcStructuralCurveTypeEnumTypeImpl ifcStructuralCurveTypeEnumType = new IfcStructuralCurveTypeEnumTypeImpl();
		return ifcStructuralCurveTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLinearAction createIfcStructuralLinearAction() {
		IfcStructuralLinearActionImpl ifcStructuralLinearAction = new IfcStructuralLinearActionImpl();
		return ifcStructuralLinearAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLinearActionVarying createIfcStructuralLinearActionVarying() {
		IfcStructuralLinearActionVaryingImpl ifcStructuralLinearActionVarying = new IfcStructuralLinearActionVaryingImpl();
		return ifcStructuralLinearActionVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadGroup createIfcStructuralLoadGroup() {
		IfcStructuralLoadGroupImpl ifcStructuralLoadGroup = new IfcStructuralLoadGroupImpl();
		return ifcStructuralLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadLinearForce createIfcStructuralLoadLinearForce() {
		IfcStructuralLoadLinearForceImpl ifcStructuralLoadLinearForce = new IfcStructuralLoadLinearForceImpl();
		return ifcStructuralLoadLinearForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadPlanarForce createIfcStructuralLoadPlanarForce() {
		IfcStructuralLoadPlanarForceImpl ifcStructuralLoadPlanarForce = new IfcStructuralLoadPlanarForceImpl();
		return ifcStructuralLoadPlanarForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadSingleDisplacement createIfcStructuralLoadSingleDisplacement() {
		IfcStructuralLoadSingleDisplacementImpl ifcStructuralLoadSingleDisplacement = new IfcStructuralLoadSingleDisplacementImpl();
		return ifcStructuralLoadSingleDisplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadSingleDisplacementDistortion createIfcStructuralLoadSingleDisplacementDistortion() {
		IfcStructuralLoadSingleDisplacementDistortionImpl ifcStructuralLoadSingleDisplacementDistortion = new IfcStructuralLoadSingleDisplacementDistortionImpl();
		return ifcStructuralLoadSingleDisplacementDistortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadSingleForce createIfcStructuralLoadSingleForce() {
		IfcStructuralLoadSingleForceImpl ifcStructuralLoadSingleForce = new IfcStructuralLoadSingleForceImpl();
		return ifcStructuralLoadSingleForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadSingleForceWarping createIfcStructuralLoadSingleForceWarping() {
		IfcStructuralLoadSingleForceWarpingImpl ifcStructuralLoadSingleForceWarping = new IfcStructuralLoadSingleForceWarpingImpl();
		return ifcStructuralLoadSingleForceWarping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadTemperature createIfcStructuralLoadTemperature() {
		IfcStructuralLoadTemperatureImpl ifcStructuralLoadTemperature = new IfcStructuralLoadTemperatureImpl();
		return ifcStructuralLoadTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralPlanarAction createIfcStructuralPlanarAction() {
		IfcStructuralPlanarActionImpl ifcStructuralPlanarAction = new IfcStructuralPlanarActionImpl();
		return ifcStructuralPlanarAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralPlanarActionVarying createIfcStructuralPlanarActionVarying() {
		IfcStructuralPlanarActionVaryingImpl ifcStructuralPlanarActionVarying = new IfcStructuralPlanarActionVaryingImpl();
		return ifcStructuralPlanarActionVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralPointAction createIfcStructuralPointAction() {
		IfcStructuralPointActionImpl ifcStructuralPointAction = new IfcStructuralPointActionImpl();
		return ifcStructuralPointAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralPointConnection createIfcStructuralPointConnection() {
		IfcStructuralPointConnectionImpl ifcStructuralPointConnection = new IfcStructuralPointConnectionImpl();
		return ifcStructuralPointConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralPointReaction createIfcStructuralPointReaction() {
		IfcStructuralPointReactionImpl ifcStructuralPointReaction = new IfcStructuralPointReactionImpl();
		return ifcStructuralPointReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralProfileProperties createIfcStructuralProfileProperties() {
		IfcStructuralProfilePropertiesImpl ifcStructuralProfileProperties = new IfcStructuralProfilePropertiesImpl();
		return ifcStructuralProfileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralResultGroup createIfcStructuralResultGroup() {
		IfcStructuralResultGroupImpl ifcStructuralResultGroup = new IfcStructuralResultGroupImpl();
		return ifcStructuralResultGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSteelProfileProperties createIfcStructuralSteelProfileProperties() {
		IfcStructuralSteelProfilePropertiesImpl ifcStructuralSteelProfileProperties = new IfcStructuralSteelProfilePropertiesImpl();
		return ifcStructuralSteelProfileProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSurfaceConnection createIfcStructuralSurfaceConnection() {
		IfcStructuralSurfaceConnectionImpl ifcStructuralSurfaceConnection = new IfcStructuralSurfaceConnectionImpl();
		return ifcStructuralSurfaceConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSurfaceMember createIfcStructuralSurfaceMember() {
		IfcStructuralSurfaceMemberImpl ifcStructuralSurfaceMember = new IfcStructuralSurfaceMemberImpl();
		return ifcStructuralSurfaceMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSurfaceMemberVarying createIfcStructuralSurfaceMemberVarying() {
		IfcStructuralSurfaceMemberVaryingImpl ifcStructuralSurfaceMemberVarying = new IfcStructuralSurfaceMemberVaryingImpl();
		return ifcStructuralSurfaceMemberVarying;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSurfaceTypeEnumType createIfcStructuralSurfaceTypeEnumType() {
		IfcStructuralSurfaceTypeEnumTypeImpl ifcStructuralSurfaceTypeEnumType = new IfcStructuralSurfaceTypeEnumTypeImpl();
		return ifcStructuralSurfaceTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuredDimensionCallout createIfcStructuredDimensionCallout() {
		IfcStructuredDimensionCalloutImpl ifcStructuredDimensionCallout = new IfcStructuredDimensionCalloutImpl();
		return ifcStructuredDimensionCallout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStyledItem createIfcStyledItem() {
		IfcStyledItemImpl ifcStyledItem = new IfcStyledItemImpl();
		return ifcStyledItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStyledRepresentation createIfcStyledRepresentation() {
		IfcStyledRepresentationImpl ifcStyledRepresentation = new IfcStyledRepresentationImpl();
		return ifcStyledRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSubContractResource createIfcSubContractResource() {
		IfcSubContractResourceImpl ifcSubContractResource = new IfcSubContractResourceImpl();
		return ifcSubContractResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSubedge createIfcSubedge() {
		IfcSubedgeImpl ifcSubedge = new IfcSubedgeImpl();
		return ifcSubedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceCurveSweptAreaSolid createIfcSurfaceCurveSweptAreaSolid() {
		IfcSurfaceCurveSweptAreaSolidImpl ifcSurfaceCurveSweptAreaSolid = new IfcSurfaceCurveSweptAreaSolidImpl();
		return ifcSurfaceCurveSweptAreaSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceOfLinearExtrusion createIfcSurfaceOfLinearExtrusion() {
		IfcSurfaceOfLinearExtrusionImpl ifcSurfaceOfLinearExtrusion = new IfcSurfaceOfLinearExtrusionImpl();
		return ifcSurfaceOfLinearExtrusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceOfRevolution createIfcSurfaceOfRevolution() {
		IfcSurfaceOfRevolutionImpl ifcSurfaceOfRevolution = new IfcSurfaceOfRevolutionImpl();
		return ifcSurfaceOfRevolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceOrFaceSurface createIfcSurfaceOrFaceSurface() {
		IfcSurfaceOrFaceSurfaceImpl ifcSurfaceOrFaceSurface = new IfcSurfaceOrFaceSurfaceImpl();
		return ifcSurfaceOrFaceSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceSideType createIfcSurfaceSideType() {
		IfcSurfaceSideTypeImpl ifcSurfaceSideType = new IfcSurfaceSideTypeImpl();
		return ifcSurfaceSideType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyle createIfcSurfaceStyle() {
		IfcSurfaceStyleImpl ifcSurfaceStyle = new IfcSurfaceStyleImpl();
		return ifcSurfaceStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleElementSelect createIfcSurfaceStyleElementSelect() {
		IfcSurfaceStyleElementSelectImpl ifcSurfaceStyleElementSelect = new IfcSurfaceStyleElementSelectImpl();
		return ifcSurfaceStyleElementSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleLighting createIfcSurfaceStyleLighting() {
		IfcSurfaceStyleLightingImpl ifcSurfaceStyleLighting = new IfcSurfaceStyleLightingImpl();
		return ifcSurfaceStyleLighting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleRefraction createIfcSurfaceStyleRefraction() {
		IfcSurfaceStyleRefractionImpl ifcSurfaceStyleRefraction = new IfcSurfaceStyleRefractionImpl();
		return ifcSurfaceStyleRefraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleRendering createIfcSurfaceStyleRendering() {
		IfcSurfaceStyleRenderingImpl ifcSurfaceStyleRendering = new IfcSurfaceStyleRenderingImpl();
		return ifcSurfaceStyleRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleShading createIfcSurfaceStyleShading() {
		IfcSurfaceStyleShadingImpl ifcSurfaceStyleShading = new IfcSurfaceStyleShadingImpl();
		return ifcSurfaceStyleShading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceStyleWithTextures createIfcSurfaceStyleWithTextures() {
		IfcSurfaceStyleWithTexturesImpl ifcSurfaceStyleWithTextures = new IfcSurfaceStyleWithTexturesImpl();
		return ifcSurfaceStyleWithTextures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceTextureEnumType createIfcSurfaceTextureEnumType() {
		IfcSurfaceTextureEnumTypeImpl ifcSurfaceTextureEnumType = new IfcSurfaceTextureEnumTypeImpl();
		return ifcSurfaceTextureEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSweptDiskSolid createIfcSweptDiskSolid() {
		IfcSweptDiskSolidImpl ifcSweptDiskSolid = new IfcSweptDiskSolidImpl();
		return ifcSweptDiskSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSwitchingDeviceType createIfcSwitchingDeviceType() {
		IfcSwitchingDeviceTypeImpl ifcSwitchingDeviceType = new IfcSwitchingDeviceTypeImpl();
		return ifcSwitchingDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSwitchingDeviceTypeEnumType createIfcSwitchingDeviceTypeEnumType() {
		IfcSwitchingDeviceTypeEnumTypeImpl ifcSwitchingDeviceTypeEnumType = new IfcSwitchingDeviceTypeEnumTypeImpl();
		return ifcSwitchingDeviceTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSymbolStyle createIfcSymbolStyle() {
		IfcSymbolStyleImpl ifcSymbolStyle = new IfcSymbolStyleImpl();
		return ifcSymbolStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSymbolStyleSelect createIfcSymbolStyleSelect() {
		IfcSymbolStyleSelectImpl ifcSymbolStyleSelect = new IfcSymbolStyleSelectImpl();
		return ifcSymbolStyleSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSystem createIfcSystem() {
		IfcSystemImpl ifcSystem = new IfcSystemImpl();
		return ifcSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSystemFurnitureElementType createIfcSystemFurnitureElementType() {
		IfcSystemFurnitureElementTypeImpl ifcSystemFurnitureElementType = new IfcSystemFurnitureElementTypeImpl();
		return ifcSystemFurnitureElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTable createIfcTable() {
		IfcTableImpl ifcTable = new IfcTableImpl();
		return ifcTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTableRow createIfcTableRow() {
		IfcTableRowImpl ifcTableRow = new IfcTableRowImpl();
		return ifcTableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTankType createIfcTankType() {
		IfcTankTypeImpl ifcTankType = new IfcTankTypeImpl();
		return ifcTankType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTankTypeEnumType createIfcTankTypeEnumType() {
		IfcTankTypeEnumTypeImpl ifcTankTypeEnumType = new IfcTankTypeEnumTypeImpl();
		return ifcTankTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTask createIfcTask() {
		IfcTaskImpl ifcTask = new IfcTaskImpl();
		return ifcTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTelecomAddress createIfcTelecomAddress() {
		IfcTelecomAddressImpl ifcTelecomAddress = new IfcTelecomAddressImpl();
		return ifcTelecomAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTemperatureGradientMeasureType createIfcTemperatureGradientMeasureType() {
		IfcTemperatureGradientMeasureTypeImpl ifcTemperatureGradientMeasureType = new IfcTemperatureGradientMeasureTypeImpl();
		return ifcTemperatureGradientMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendon createIfcTendon() {
		IfcTendonImpl ifcTendon = new IfcTendonImpl();
		return ifcTendon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendonAnchor createIfcTendonAnchor() {
		IfcTendonAnchorImpl ifcTendonAnchor = new IfcTendonAnchorImpl();
		return ifcTendonAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendonTypeEnumType createIfcTendonTypeEnumType() {
		IfcTendonTypeEnumTypeImpl ifcTendonTypeEnumType = new IfcTendonTypeEnumTypeImpl();
		return ifcTendonTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTerminatorSymbol createIfcTerminatorSymbol() {
		IfcTerminatorSymbolImpl ifcTerminatorSymbol = new IfcTerminatorSymbolImpl();
		return ifcTerminatorSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextAlignmentType createIfcTextAlignmentType() {
		IfcTextAlignmentTypeImpl ifcTextAlignmentType = new IfcTextAlignmentTypeImpl();
		return ifcTextAlignmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextDecorationType createIfcTextDecorationType() {
		IfcTextDecorationTypeImpl ifcTextDecorationType = new IfcTextDecorationTypeImpl();
		return ifcTextDecorationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextFontNameType createIfcTextFontNameType() {
		IfcTextFontNameTypeImpl ifcTextFontNameType = new IfcTextFontNameTypeImpl();
		return ifcTextFontNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextFontSelect createIfcTextFontSelect() {
		IfcTextFontSelectImpl ifcTextFontSelect = new IfcTextFontSelectImpl();
		return ifcTextFontSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextLiteral createIfcTextLiteral() {
		IfcTextLiteralImpl ifcTextLiteral = new IfcTextLiteralImpl();
		return ifcTextLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextLiteralWithExtent createIfcTextLiteralWithExtent() {
		IfcTextLiteralWithExtentImpl ifcTextLiteralWithExtent = new IfcTextLiteralWithExtentImpl();
		return ifcTextLiteralWithExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextPathType createIfcTextPathType() {
		IfcTextPathTypeImpl ifcTextPathType = new IfcTextPathTypeImpl();
		return ifcTextPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyle createIfcTextStyle() {
		IfcTextStyleImpl ifcTextStyle = new IfcTextStyleImpl();
		return ifcTextStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleFontModel createIfcTextStyleFontModel() {
		IfcTextStyleFontModelImpl ifcTextStyleFontModel = new IfcTextStyleFontModelImpl();
		return ifcTextStyleFontModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleForDefinedFont createIfcTextStyleForDefinedFont() {
		IfcTextStyleForDefinedFontImpl ifcTextStyleForDefinedFont = new IfcTextStyleForDefinedFontImpl();
		return ifcTextStyleForDefinedFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleSelect createIfcTextStyleSelect() {
		IfcTextStyleSelectImpl ifcTextStyleSelect = new IfcTextStyleSelectImpl();
		return ifcTextStyleSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleTextModel createIfcTextStyleTextModel() {
		IfcTextStyleTextModelImpl ifcTextStyleTextModel = new IfcTextStyleTextModelImpl();
		return ifcTextStyleTextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextStyleWithBoxCharacteristics createIfcTextStyleWithBoxCharacteristics() {
		IfcTextStyleWithBoxCharacteristicsImpl ifcTextStyleWithBoxCharacteristics = new IfcTextStyleWithBoxCharacteristicsImpl();
		return ifcTextStyleWithBoxCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextTransformationType createIfcTextTransformationType() {
		IfcTextTransformationTypeImpl ifcTextTransformationType = new IfcTextTransformationTypeImpl();
		return ifcTextTransformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextType createIfcTextType() {
		IfcTextTypeImpl ifcTextType = new IfcTextTypeImpl();
		return ifcTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextureCoordinateGenerator createIfcTextureCoordinateGenerator() {
		IfcTextureCoordinateGeneratorImpl ifcTextureCoordinateGenerator = new IfcTextureCoordinateGeneratorImpl();
		return ifcTextureCoordinateGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextureMap createIfcTextureMap() {
		IfcTextureMapImpl ifcTextureMap = new IfcTextureMapImpl();
		return ifcTextureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextureVertex createIfcTextureVertex() {
		IfcTextureVertexImpl ifcTextureVertex = new IfcTextureVertexImpl();
		return ifcTextureVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalAdmittanceMeasureType createIfcThermalAdmittanceMeasureType() {
		IfcThermalAdmittanceMeasureTypeImpl ifcThermalAdmittanceMeasureType = new IfcThermalAdmittanceMeasureTypeImpl();
		return ifcThermalAdmittanceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalConductivityMeasureType createIfcThermalConductivityMeasureType() {
		IfcThermalConductivityMeasureTypeImpl ifcThermalConductivityMeasureType = new IfcThermalConductivityMeasureTypeImpl();
		return ifcThermalConductivityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalExpansionCoefficientMeasureType createIfcThermalExpansionCoefficientMeasureType() {
		IfcThermalExpansionCoefficientMeasureTypeImpl ifcThermalExpansionCoefficientMeasureType = new IfcThermalExpansionCoefficientMeasureTypeImpl();
		return ifcThermalExpansionCoefficientMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadSourceEnumType createIfcThermalLoadSourceEnumType() {
		IfcThermalLoadSourceEnumTypeImpl ifcThermalLoadSourceEnumType = new IfcThermalLoadSourceEnumTypeImpl();
		return ifcThermalLoadSourceEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadTypeEnumType createIfcThermalLoadTypeEnumType() {
		IfcThermalLoadTypeEnumTypeImpl ifcThermalLoadTypeEnumType = new IfcThermalLoadTypeEnumTypeImpl();
		return ifcThermalLoadTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalMaterialProperties createIfcThermalMaterialProperties() {
		IfcThermalMaterialPropertiesImpl ifcThermalMaterialProperties = new IfcThermalMaterialPropertiesImpl();
		return ifcThermalMaterialProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalResistanceMeasureType createIfcThermalResistanceMeasureType() {
		IfcThermalResistanceMeasureTypeImpl ifcThermalResistanceMeasureType = new IfcThermalResistanceMeasureTypeImpl();
		return ifcThermalResistanceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalTransmittanceMeasureType createIfcThermalTransmittanceMeasureType() {
		IfcThermalTransmittanceMeasureTypeImpl ifcThermalTransmittanceMeasureType = new IfcThermalTransmittanceMeasureTypeImpl();
		return ifcThermalTransmittanceMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermodynamicTemperatureMeasureType createIfcThermodynamicTemperatureMeasureType() {
		IfcThermodynamicTemperatureMeasureTypeImpl ifcThermodynamicTemperatureMeasureType = new IfcThermodynamicTemperatureMeasureTypeImpl();
		return ifcThermodynamicTemperatureMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeMeasureType createIfcTimeMeasureType() {
		IfcTimeMeasureTypeImpl ifcTimeMeasureType = new IfcTimeMeasureTypeImpl();
		return ifcTimeMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesDataTypeEnumType createIfcTimeSeriesDataTypeEnumType() {
		IfcTimeSeriesDataTypeEnumTypeImpl ifcTimeSeriesDataTypeEnumType = new IfcTimeSeriesDataTypeEnumTypeImpl();
		return ifcTimeSeriesDataTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesReferenceRelationship createIfcTimeSeriesReferenceRelationship() {
		IfcTimeSeriesReferenceRelationshipImpl ifcTimeSeriesReferenceRelationship = new IfcTimeSeriesReferenceRelationshipImpl();
		return ifcTimeSeriesReferenceRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesSchedule createIfcTimeSeriesSchedule() {
		IfcTimeSeriesScheduleImpl ifcTimeSeriesSchedule = new IfcTimeSeriesScheduleImpl();
		return ifcTimeSeriesSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesScheduleTypeEnumType createIfcTimeSeriesScheduleTypeEnumType() {
		IfcTimeSeriesScheduleTypeEnumTypeImpl ifcTimeSeriesScheduleTypeEnumType = new IfcTimeSeriesScheduleTypeEnumTypeImpl();
		return ifcTimeSeriesScheduleTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesValue createIfcTimeSeriesValue() {
		IfcTimeSeriesValueImpl ifcTimeSeriesValue = new IfcTimeSeriesValueImpl();
		return ifcTimeSeriesValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeStampType createIfcTimeStampType() {
		IfcTimeStampTypeImpl ifcTimeStampType = new IfcTimeStampTypeImpl();
		return ifcTimeStampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTopologyRepresentation createIfcTopologyRepresentation() {
		IfcTopologyRepresentationImpl ifcTopologyRepresentation = new IfcTopologyRepresentationImpl();
		return ifcTopologyRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTorqueMeasureType createIfcTorqueMeasureType() {
		IfcTorqueMeasureTypeImpl ifcTorqueMeasureType = new IfcTorqueMeasureTypeImpl();
		return ifcTorqueMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransformerType createIfcTransformerType() {
		IfcTransformerTypeImpl ifcTransformerType = new IfcTransformerTypeImpl();
		return ifcTransformerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransformerTypeEnumType createIfcTransformerTypeEnumType() {
		IfcTransformerTypeEnumTypeImpl ifcTransformerTypeEnumType = new IfcTransformerTypeEnumTypeImpl();
		return ifcTransformerTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransitionCodeType createIfcTransitionCodeType() {
		IfcTransitionCodeTypeImpl ifcTransitionCodeType = new IfcTransitionCodeTypeImpl();
		return ifcTransitionCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransportElement createIfcTransportElement() {
		IfcTransportElementImpl ifcTransportElement = new IfcTransportElementImpl();
		return ifcTransportElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransportElementType createIfcTransportElementType() {
		IfcTransportElementTypeImpl ifcTransportElementType = new IfcTransportElementTypeImpl();
		return ifcTransportElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransportElementTypeEnumType createIfcTransportElementTypeEnumType() {
		IfcTransportElementTypeEnumTypeImpl ifcTransportElementTypeEnumType = new IfcTransportElementTypeEnumTypeImpl();
		return ifcTransportElementTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTrapeziumProfileDef createIfcTrapeziumProfileDef() {
		IfcTrapeziumProfileDefImpl ifcTrapeziumProfileDef = new IfcTrapeziumProfileDefImpl();
		return ifcTrapeziumProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTrimmedCurve createIfcTrimmedCurve() {
		IfcTrimmedCurveImpl ifcTrimmedCurve = new IfcTrimmedCurveImpl();
		return ifcTrimmedCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTrimmingPreferenceType createIfcTrimmingPreferenceType() {
		IfcTrimmingPreferenceTypeImpl ifcTrimmingPreferenceType = new IfcTrimmingPreferenceTypeImpl();
		return ifcTrimmingPreferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTrimmingSelect createIfcTrimmingSelect() {
		IfcTrimmingSelectImpl ifcTrimmingSelect = new IfcTrimmingSelectImpl();
		return ifcTrimmingSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTShapeProfileDef createIfcTShapeProfileDef() {
		IfcTShapeProfileDefImpl ifcTShapeProfileDef = new IfcTShapeProfileDefImpl();
		return ifcTShapeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTubeBundleType createIfcTubeBundleType() {
		IfcTubeBundleTypeImpl ifcTubeBundleType = new IfcTubeBundleTypeImpl();
		return ifcTubeBundleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTubeBundleTypeEnumType createIfcTubeBundleTypeEnumType() {
		IfcTubeBundleTypeEnumTypeImpl ifcTubeBundleTypeEnumType = new IfcTubeBundleTypeEnumTypeImpl();
		return ifcTubeBundleTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTwoDirectionRepeatFactor createIfcTwoDirectionRepeatFactor() {
		IfcTwoDirectionRepeatFactorImpl ifcTwoDirectionRepeatFactor = new IfcTwoDirectionRepeatFactorImpl();
		return ifcTwoDirectionRepeatFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTypeObject createIfcTypeObject() {
		IfcTypeObjectImpl ifcTypeObject = new IfcTypeObjectImpl();
		return ifcTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTypeProduct createIfcTypeProduct() {
		IfcTypeProductImpl ifcTypeProduct = new IfcTypeProductImpl();
		return ifcTypeProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit createIfcUnit() {
		IfcUnitImpl ifcUnit = new IfcUnitImpl();
		return ifcUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitaryEquipmentType createIfcUnitaryEquipmentType() {
		IfcUnitaryEquipmentTypeImpl ifcUnitaryEquipmentType = new IfcUnitaryEquipmentTypeImpl();
		return ifcUnitaryEquipmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitaryEquipmentTypeEnumType createIfcUnitaryEquipmentTypeEnumType() {
		IfcUnitaryEquipmentTypeEnumTypeImpl ifcUnitaryEquipmentTypeEnumType = new IfcUnitaryEquipmentTypeEnumTypeImpl();
		return ifcUnitaryEquipmentTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitAssignment createIfcUnitAssignment() {
		IfcUnitAssignmentImpl ifcUnitAssignment = new IfcUnitAssignmentImpl();
		return ifcUnitAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitEnumType createIfcUnitEnumType() {
		IfcUnitEnumTypeImpl ifcUnitEnumType = new IfcUnitEnumTypeImpl();
		return ifcUnitEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUShapeProfileDef createIfcUShapeProfileDef() {
		IfcUShapeProfileDefImpl ifcUShapeProfileDef = new IfcUShapeProfileDefImpl();
		return ifcUShapeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue createIfcValue() {
		IfcValueImpl ifcValue = new IfcValueImpl();
		return ifcValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValveType createIfcValveType() {
		IfcValveTypeImpl ifcValveType = new IfcValveTypeImpl();
		return ifcValveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValveTypeEnumType createIfcValveTypeEnumType() {
		IfcValveTypeEnumTypeImpl ifcValveTypeEnumType = new IfcValveTypeEnumTypeImpl();
		return ifcValveTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVaporPermeabilityMeasureType createIfcVaporPermeabilityMeasureType() {
		IfcVaporPermeabilityMeasureTypeImpl ifcVaporPermeabilityMeasureType = new IfcVaporPermeabilityMeasureTypeImpl();
		return ifcVaporPermeabilityMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVector createIfcVector() {
		IfcVectorImpl ifcVector = new IfcVectorImpl();
		return ifcVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVectorOrDirection createIfcVectorOrDirection() {
		IfcVectorOrDirectionImpl ifcVectorOrDirection = new IfcVectorOrDirectionImpl();
		return ifcVectorOrDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertex createIfcVertex() {
		IfcVertexImpl ifcVertex = new IfcVertexImpl();
		return ifcVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertexBasedTextureMap createIfcVertexBasedTextureMap() {
		IfcVertexBasedTextureMapImpl ifcVertexBasedTextureMap = new IfcVertexBasedTextureMapImpl();
		return ifcVertexBasedTextureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertexLoop createIfcVertexLoop() {
		IfcVertexLoopImpl ifcVertexLoop = new IfcVertexLoopImpl();
		return ifcVertexLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVertexPoint createIfcVertexPoint() {
		IfcVertexPointImpl ifcVertexPoint = new IfcVertexPointImpl();
		return ifcVertexPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVibrationIsolatorType createIfcVibrationIsolatorType() {
		IfcVibrationIsolatorTypeImpl ifcVibrationIsolatorType = new IfcVibrationIsolatorTypeImpl();
		return ifcVibrationIsolatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVibrationIsolatorTypeEnumType createIfcVibrationIsolatorTypeEnumType() {
		IfcVibrationIsolatorTypeEnumTypeImpl ifcVibrationIsolatorTypeEnumType = new IfcVibrationIsolatorTypeEnumTypeImpl();
		return ifcVibrationIsolatorTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVirtualElement createIfcVirtualElement() {
		IfcVirtualElementImpl ifcVirtualElement = new IfcVirtualElementImpl();
		return ifcVirtualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVirtualGridIntersection createIfcVirtualGridIntersection() {
		IfcVirtualGridIntersectionImpl ifcVirtualGridIntersection = new IfcVirtualGridIntersectionImpl();
		return ifcVirtualGridIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVolumeMeasureType createIfcVolumeMeasureType() {
		IfcVolumeMeasureTypeImpl ifcVolumeMeasureType = new IfcVolumeMeasureTypeImpl();
		return ifcVolumeMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVolumetricFlowRateMeasureType createIfcVolumetricFlowRateMeasureType() {
		IfcVolumetricFlowRateMeasureTypeImpl ifcVolumetricFlowRateMeasureType = new IfcVolumetricFlowRateMeasureTypeImpl();
		return ifcVolumetricFlowRateMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWall createIfcWall() {
		IfcWallImpl ifcWall = new IfcWallImpl();
		return ifcWall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWallStandardCase createIfcWallStandardCase() {
		IfcWallStandardCaseImpl ifcWallStandardCase = new IfcWallStandardCaseImpl();
		return ifcWallStandardCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWallType createIfcWallType() {
		IfcWallTypeImpl ifcWallType = new IfcWallTypeImpl();
		return ifcWallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWallTypeEnumType createIfcWallTypeEnumType() {
		IfcWallTypeEnumTypeImpl ifcWallTypeEnumType = new IfcWallTypeEnumTypeImpl();
		return ifcWallTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWarpingConstantMeasureType createIfcWarpingConstantMeasureType() {
		IfcWarpingConstantMeasureTypeImpl ifcWarpingConstantMeasureType = new IfcWarpingConstantMeasureTypeImpl();
		return ifcWarpingConstantMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWarpingMomentMeasureType createIfcWarpingMomentMeasureType() {
		IfcWarpingMomentMeasureTypeImpl ifcWarpingMomentMeasureType = new IfcWarpingMomentMeasureTypeImpl();
		return ifcWarpingMomentMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWasteTerminalType createIfcWasteTerminalType() {
		IfcWasteTerminalTypeImpl ifcWasteTerminalType = new IfcWasteTerminalTypeImpl();
		return ifcWasteTerminalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWasteTerminalTypeEnumType createIfcWasteTerminalTypeEnumType() {
		IfcWasteTerminalTypeEnumTypeImpl ifcWasteTerminalTypeEnumType = new IfcWasteTerminalTypeEnumTypeImpl();
		return ifcWasteTerminalTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWaterProperties createIfcWaterProperties() {
		IfcWaterPropertiesImpl ifcWaterProperties = new IfcWaterPropertiesImpl();
		return ifcWaterProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindow createIfcWindow() {
		IfcWindowImpl ifcWindow = new IfcWindowImpl();
		return ifcWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowLiningProperties createIfcWindowLiningProperties() {
		IfcWindowLiningPropertiesImpl ifcWindowLiningProperties = new IfcWindowLiningPropertiesImpl();
		return ifcWindowLiningProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelOperationEnumType createIfcWindowPanelOperationEnumType() {
		IfcWindowPanelOperationEnumTypeImpl ifcWindowPanelOperationEnumType = new IfcWindowPanelOperationEnumTypeImpl();
		return ifcWindowPanelOperationEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelPositionEnumType createIfcWindowPanelPositionEnumType() {
		IfcWindowPanelPositionEnumTypeImpl ifcWindowPanelPositionEnumType = new IfcWindowPanelPositionEnumTypeImpl();
		return ifcWindowPanelPositionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelProperties createIfcWindowPanelProperties() {
		IfcWindowPanelPropertiesImpl ifcWindowPanelProperties = new IfcWindowPanelPropertiesImpl();
		return ifcWindowPanelProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyle createIfcWindowStyle() {
		IfcWindowStyleImpl ifcWindowStyle = new IfcWindowStyleImpl();
		return ifcWindowStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleConstructionEnumType createIfcWindowStyleConstructionEnumType() {
		IfcWindowStyleConstructionEnumTypeImpl ifcWindowStyleConstructionEnumType = new IfcWindowStyleConstructionEnumTypeImpl();
		return ifcWindowStyleConstructionEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleOperationEnumType createIfcWindowStyleOperationEnumType() {
		IfcWindowStyleOperationEnumTypeImpl ifcWindowStyleOperationEnumType = new IfcWindowStyleOperationEnumTypeImpl();
		return ifcWindowStyleOperationEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWorkControlTypeEnumType createIfcWorkControlTypeEnumType() {
		IfcWorkControlTypeEnumTypeImpl ifcWorkControlTypeEnumType = new IfcWorkControlTypeEnumTypeImpl();
		return ifcWorkControlTypeEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWorkPlan createIfcWorkPlan() {
		IfcWorkPlanImpl ifcWorkPlan = new IfcWorkPlanImpl();
		return ifcWorkPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWorkSchedule createIfcWorkSchedule() {
		IfcWorkScheduleImpl ifcWorkSchedule = new IfcWorkScheduleImpl();
		return ifcWorkSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcYearNumberType createIfcYearNumberType() {
		IfcYearNumberTypeImpl ifcYearNumberType = new IfcYearNumberTypeImpl();
		return ifcYearNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcZone createIfcZone() {
		IfcZoneImpl ifcZone = new IfcZoneImpl();
		return ifcZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcZShapeProfileDef createIfcZShapeProfileDef() {
		IfcZShapeProfileDefImpl ifcZShapeProfileDef = new IfcZShapeProfileDefImpl();
		return ifcZShapeProfileDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncorporationDateType createIncorporationDateType() {
		IncorporationDateTypeImpl incorporationDateType = new IncorporationDateTypeImpl();
		return incorporationDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerBoundariesType createInnerBoundariesType() {
		InnerBoundariesTypeImpl innerBoundariesType = new InnerBoundariesTypeImpl();
		return innerBoundariesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerBoundariesType1 createInnerBoundariesType1() {
		InnerBoundariesType1Impl innerBoundariesType1 = new InnerBoundariesType1Impl();
		return innerBoundariesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerCurvesType createInnerCurvesType() {
		InnerCurvesTypeImpl innerCurvesType = new InnerCurvesTypeImpl();
		return innerCurvesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntersectingAxesType createIntersectingAxesType() {
		IntersectingAxesTypeImpl intersectingAxesType = new IntersectingAxesTypeImpl();
		return intersectingAxesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemOfType createItemOfType() {
		ItemOfTypeImpl itemOfType = new ItemOfTypeImpl();
		return itemOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemsType createItemsType() {
		ItemsTypeImpl itemsType = new ItemsTypeImpl();
		return itemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType1 createItemType1() {
		ItemType1Impl itemType1 = new ItemType1Impl();
		return itemType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JurisdictionType createJurisdictionType() {
		JurisdictionTypeImpl jurisdictionType = new JurisdictionTypeImpl();
		return jurisdictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastModifyingApplicationType createLastModifyingApplicationType() {
		LastModifyingApplicationTypeImpl lastModifyingApplicationType = new LastModifyingApplicationTypeImpl();
		return lastModifyingApplicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastModifyingUserType createLastModifyingUserType() {
		LastModifyingUserTypeImpl lastModifyingUserType = new LastModifyingUserTypeImpl();
		return lastModifyingUserType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastRevisionTimeType createLastRevisionTimeType() {
		LastRevisionTimeTypeImpl lastRevisionTimeType = new LastRevisionTimeTypeImpl();
		return lastRevisionTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastUpdateDateType createLastUpdateDateType() {
		LastUpdateDateTypeImpl lastUpdateDateType = new LastUpdateDateTypeImpl();
		return lastUpdateDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LateFinishType createLateFinishType() {
		LateFinishTypeImpl lateFinishType = new LateFinishTypeImpl();
		return lateFinishType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LateStartType createLateStartType() {
		LateStartTypeImpl lateStartType = new LateStartTypeImpl();
		return lateStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerStylesType createLayerStylesType() {
		LayerStylesTypeImpl layerStylesType = new LayerStylesTypeImpl();
		return layerStylesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetterSpacingType createLetterSpacingType() {
		LetterSpacingTypeImpl letterSpacingType = new LetterSpacingTypeImpl();
		return letterSpacingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryReferenceType createLibraryReferenceType() {
		LibraryReferenceTypeImpl libraryReferenceType = new LibraryReferenceTypeImpl();
		return libraryReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightColourType createLightColourType() {
		LightColourTypeImpl lightColourType = new LightColourTypeImpl();
		return lightColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightDistributionDataSourceType createLightDistributionDataSourceType() {
		LightDistributionDataSourceTypeImpl lightDistributionDataSourceType = new LightDistributionDataSourceTypeImpl();
		return lightDistributionDataSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineHeightType createLineHeightType() {
		LineHeightTypeImpl lineHeightType = new LineHeightTypeImpl();
		return lineHeightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValuesType createListValuesType() {
		ListValuesTypeImpl listValuesType = new ListValuesTypeImpl();
		return listValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValuesType1 createListValuesType1() {
		ListValuesType1Impl listValuesType1 = new ListValuesType1Impl();
		return listValuesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListValuesType2 createListValuesType2() {
		ListValuesType2Impl listValuesType2 = new ListValuesType2Impl();
		return listValuesType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadedByType createLoadedByType() {
		LoadedByTypeImpl loadedByType = new LoadedByTypeImpl();
		return loadedByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalOriginType createLocalOriginType() {
		LocalOriginTypeImpl localOriginType = new LocalOriginTypeImpl();
		return localOriginType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationAtRelatedElementType createLocationAtRelatedElementType() {
		LocationAtRelatedElementTypeImpl locationAtRelatedElementType = new LocationAtRelatedElementTypeImpl();
		return locationAtRelatedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationAtRelatingElementType createLocationAtRelatingElementType() {
		LocationAtRelatingElementTypeImpl locationAtRelatingElementType = new LocationAtRelatingElementTypeImpl();
		return locationAtRelatingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationOfInteractionType createLocationOfInteractionType() {
		LocationOfInteractionTypeImpl locationOfInteractionType = new LocationOfInteractionTypeImpl();
		return locationOfInteractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopVertexType createLoopVertexType() {
		LoopVertexTypeImpl loopVertexType = new LoopVertexTypeImpl();
		return loopVertexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerBoundValueType createLowerBoundValueType() {
		LowerBoundValueTypeImpl lowerBoundValueType = new LowerBoundValueTypeImpl();
		return lowerBoundValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerValueType createLowerValueType() {
		LowerValueTypeImpl lowerValueType = new LowerValueTypeImpl();
		return lowerValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuminousIntensityType createLuminousIntensityType() {
		LuminousIntensityTypeImpl luminousIntensityType = new LuminousIntensityTypeImpl();
		return luminousIntensityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedRepresentationType createMappedRepresentationType() {
		MappedRepresentationTypeImpl mappedRepresentationType = new MappedRepresentationTypeImpl();
		return mappedRepresentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingOriginType createMappingOriginType() {
		MappingOriginTypeImpl mappingOriginType = new MappingOriginTypeImpl();
		return mappingOriginType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSourceType createMappingSourceType() {
		MappingSourceTypeImpl mappingSourceType = new MappingSourceTypeImpl();
		return mappingSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTargetType createMappingTargetType() {
		MappingTargetTypeImpl mappingTargetType = new MappingTargetTypeImpl();
		return mappingTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialClassificationsType createMaterialClassificationsType() {
		MaterialClassificationsTypeImpl materialClassificationsType = new MaterialClassificationsTypeImpl();
		return materialClassificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialLayersType createMaterialLayersType() {
		MaterialLayersTypeImpl materialLayersType = new MaterialLayersTypeImpl();
		return materialLayersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialsType createMaterialsType() {
		MaterialsTypeImpl materialsType = new MaterialsTypeImpl();
		return materialsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialType createMaterialType() {
		MaterialTypeImpl materialType = new MaterialTypeImpl();
		return materialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialType1 createMaterialType1() {
		MaterialType1Impl materialType1 = new MaterialType1Impl();
		return materialType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddleNamesType createMiddleNamesType() {
		MiddleNamesTypeImpl middleNamesType = new MiddleNamesTypeImpl();
		return middleNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MostUsedValueType createMostUsedValueType() {
		MostUsedValueTypeImpl mostUsedValueType = new MostUsedValueTypeImpl();
		return mostUsedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveFromType createMoveFromType() {
		MoveFromTypeImpl moveFromType = new MoveFromTypeImpl();
		return moveFromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveToType createMoveToType() {
		MoveToTypeImpl moveToType = new MoveToTypeImpl();
		return moveToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NominalValueType createNominalValueType() {
		NominalValueTypeImpl nominalValueType = new NominalValueTypeImpl();
		return nominalValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationFacetsType createNotationFacetsType() {
		NotationFacetsTypeImpl notationFacetsType = new NotationFacetsTypeImpl();
		return notationFacetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotationType createNotationType() {
		NotationTypeImpl notationType = new NotationTypeImpl();
		return notationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPlacementType createObjectPlacementType() {
		ObjectPlacementTypeImpl objectPlacementType = new ObjectPlacementTypeImpl();
		return objectPlacementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDistancesType createOffsetDistancesType() {
		OffsetDistancesTypeImpl offsetDistancesType = new OffsetDistancesTypeImpl();
		return offsetDistancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType createOperatorType() {
		OperatorTypeImpl operatorType = new OperatorTypeImpl();
		return operatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationOf2DPlaneType createOrientationOf2DPlaneType() {
		OrientationOf2DPlaneTypeImpl orientationOf2DPlaneType = new OrientationOf2DPlaneTypeImpl();
		return orientationOf2DPlaneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationType() {
		OrientationTypeImpl orientationType = new OrientationTypeImpl();
		return orientationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType1 createOrientationType1() {
		OrientationType1Impl orientationType1 = new OrientationType1Impl();
		return orientationType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType2 createOrientationType2() {
		OrientationType2Impl orientationType2 = new OrientationType2Impl();
		return orientationType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginalValueType createOriginalValueType() {
		OriginalValueTypeImpl originalValueType = new OriginalValueTypeImpl();
		return originalValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginalValueType1 createOriginalValueType1() {
		OriginalValueType1Impl originalValueType1 = new OriginalValueType1Impl();
		return originalValueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuterBoundaryType createOuterBoundaryType() {
		OuterBoundaryTypeImpl outerBoundaryType = new OuterBoundaryTypeImpl();
		return outerBoundaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuterBoundaryType1 createOuterBoundaryType1() {
		OuterBoundaryType1Impl outerBoundaryType1 = new OuterBoundaryType1Impl();
		return outerBoundaryType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuterCurveType createOuterCurveType() {
		OuterCurveTypeImpl outerCurveType = new OuterCurveTypeImpl();
		return outerCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuterType createOuterType() {
		OuterTypeImpl outerType = new OuterTypeImpl();
		return outerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverridingPropertiesType createOverridingPropertiesType() {
		OverridingPropertiesTypeImpl overridingPropertiesType = new OverridingPropertiesTypeImpl();
		return overridingPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerHistoryType createOwnerHistoryType() {
		OwnerHistoryTypeImpl ownerHistoryType = new OwnerHistoryTypeImpl();
		return ownerHistoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnerType createOwnerType() {
		OwnerTypeImpl ownerType = new OwnerTypeImpl();
		return ownerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwningApplicationType createOwningApplicationType() {
		OwningApplicationTypeImpl owningApplicationType = new OwningApplicationTypeImpl();
		return owningApplicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwningUserType createOwningUserType() {
		OwningUserTypeImpl owningUserType = new OwningUserTypeImpl();
		return owningUserType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentContextType createParentContextType() {
		ParentContextTypeImpl parentContextType = new ParentContextTypeImpl();
		return parentContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentCurveType createParentCurveType() {
		ParentCurveTypeImpl parentCurveType = new ParentCurveTypeImpl();
		return parentCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentEdgeType createParentEdgeType() {
		ParentEdgeTypeImpl parentEdgeType = new ParentEdgeTypeImpl();
		return parentEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentProfileType createParentProfileType() {
		ParentProfileTypeImpl parentProfileType = new ParentProfileTypeImpl();
		return parentProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartOfProductDefinitionShapeType createPartOfProductDefinitionShapeType() {
		PartOfProductDefinitionShapeTypeImpl partOfProductDefinitionShapeType = new PartOfProductDefinitionShapeTypeImpl();
		return partOfProductDefinitionShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternListType createPatternListType() {
		PatternListTypeImpl patternListType = new PatternListTypeImpl();
		return patternListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternStartType createPatternStartType() {
		PatternStartTypeImpl patternStartType = new PatternStartTypeImpl();
		return patternStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PixelType createPixelType() {
		PixelTypeImpl pixelType = new PixelTypeImpl();
		return pixelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementLocationType createPlacementLocationType() {
		PlacementLocationTypeImpl placementLocationType = new PlacementLocationTypeImpl();
		return placementLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementRefDirectionType createPlacementRefDirectionType() {
		PlacementRefDirectionTypeImpl placementRefDirectionType = new PlacementRefDirectionTypeImpl();
		return placementRefDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementRelToType createPlacementRelToType() {
		PlacementRelToTypeImpl placementRelToType = new PlacementRelToTypeImpl();
		return placementRelToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementType createPlacementType() {
		PlacementTypeImpl placementType = new PlacementTypeImpl();
		return placementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementType1 createPlacementType1() {
		PlacementType1Impl placementType1 = new PlacementType1Impl();
		return placementType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PntType createPntType() {
		PntTypeImpl pntType = new PntTypeImpl();
		return pntType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfReferenceHatchLineType createPointOfReferenceHatchLineType() {
		PointOfReferenceHatchLineTypeImpl pointOfReferenceHatchLineType = new PointOfReferenceHatchLineTypeImpl();
		return pointOfReferenceHatchLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOnRelatedElementType createPointOnRelatedElementType() {
		PointOnRelatedElementTypeImpl pointOnRelatedElementType = new PointOnRelatedElementTypeImpl();
		return pointOnRelatedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOnRelatingElementType createPointOnRelatingElementType() {
		PointOnRelatingElementTypeImpl pointOnRelatingElementType = new PointOnRelatingElementTypeImpl();
		return pointOnRelatingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointsType createPointsType() {
		PointsTypeImpl pointsType = new PointsTypeImpl();
		return pointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonalBoundaryType createPolygonalBoundaryType() {
		PolygonalBoundaryTypeImpl polygonalBoundaryType = new PolygonalBoundaryTypeImpl();
		return polygonalBoundaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonType createPolygonType() {
		PolygonTypeImpl polygonType = new PolygonTypeImpl();
		return polygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType createPositionType() {
		PositionTypeImpl positionType = new PositionTypeImpl();
		return positionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType1 createPositionType1() {
		PositionType1Impl positionType1 = new PositionType1Impl();
		return positionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType2 createPositionType2() {
		PositionType2Impl positionType2 = new PositionType2Impl();
		return positionType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType3 createPositionType3() {
		PositionType3Impl positionType3 = new PositionType3Impl();
		return positionType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType4 createPositionType4() {
		PositionType4Impl positionType4 = new PositionType4Impl();
		return positionType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType5 createPositionType5() {
		PositionType5Impl positionType5 = new PositionType5Impl();
		return positionType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType6 createPositionType6() {
		PositionType6Impl positionType6 = new PositionType6Impl();
		return positionType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType7 createPositionType7() {
		PositionType7Impl positionType7 = new PositionType7Impl();
		return positionType7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType8 createPositionType8() {
		PositionType8Impl positionType8 = new PositionType8Impl();
		return positionType8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixTitlesType createPrefixTitlesType() {
		PrefixTitlesTypeImpl prefixTitlesType = new PrefixTitlesTypeImpl();
		return prefixTitlesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreparedByType createPreparedByType() {
		PreparedByTypeImpl preparedByType = new PreparedByTypeImpl();
		return preparedByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressureTimeSeriesType createPressureTimeSeriesType() {
		PressureTimeSeriesTypeImpl pressureTimeSeriesType = new PressureTimeSeriesTypeImpl();
		return pressureTimeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileDefinitionType createProfileDefinitionType() {
		ProfileDefinitionTypeImpl profileDefinitionType = new ProfileDefinitionTypeImpl();
		return profileDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileOfPortType createProfileOfPortType() {
		ProfileOfPortTypeImpl profileOfPortType = new ProfileOfPortTypeImpl();
		return profileOfPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileOrientationType createProfileOrientationType() {
		ProfileOrientationTypeImpl profileOrientationType = new ProfileOrientationTypeImpl();
		return profileOrientationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileSectionLocationType createProfileSectionLocationType() {
		ProfileSectionLocationTypeImpl profileSectionLocationType = new ProfileSectionLocationTypeImpl();
		return profileSectionLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilesType createProfilesType() {
		ProfilesTypeImpl profilesType = new ProfilesTypeImpl();
		return profilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyReferenceType createPropertyReferenceType() {
		PropertyReferenceTypeImpl propertyReferenceType = new PropertyReferenceTypeImpl();
		return propertyReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherType createPublisherType() {
		PublisherTypeImpl publisherType = new PublisherTypeImpl();
		return publisherType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PunchListType createPunchListType() {
		PunchListTypeImpl punchListType = new PunchListTypeImpl();
		return punchListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitiesType createQuantitiesType() {
		QuantitiesTypeImpl quantitiesType = new QuantitiesTypeImpl();
		return quantitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityInProcessType createQuantityInProcessType() {
		QuantityInProcessTypeImpl quantityInProcessType = new QuantityInProcessTypeImpl();
		return quantityInProcessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateDateTimeType createRateDateTimeType() {
		RateDateTimeTypeImpl rateDateTimeType = new RateDateTimeTypeImpl();
		return rateDateTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateSourceType createRateSourceType() {
		RateSourceTypeImpl rateSourceType = new RateSourceTypeImpl();
		return rateSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizingElementsType createRealizingElementsType() {
		RealizingElementsTypeImpl realizingElementsType = new RealizingElementsTypeImpl();
		return realizingElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizingElementType createRealizingElementType() {
		RealizingElementTypeImpl realizingElementType = new RealizingElementTypeImpl();
		return realizingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordsType createRecordsType() {
		RecordsTypeImpl recordsType = new RecordsTypeImpl();
		return recordsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefDirectionType createRefDirectionType() {
		RefDirectionTypeImpl refDirectionType = new RefDirectionTypeImpl();
		return refDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefDirectionType1 createRefDirectionType1() {
		RefDirectionType1Impl refDirectionType1 = new RefDirectionType1Impl();
		return refDirectionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefDirectionType2 createRefDirectionType2() {
		RefDirectionType2Impl refDirectionType2 = new RefDirectionType2Impl();
		return refDirectionType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedDocumentType createReferencedDocumentType() {
		ReferencedDocumentTypeImpl referencedDocumentType = new ReferencedDocumentTypeImpl();
		return referencedDocumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedSourceType createReferencedSourceType() {
		ReferencedSourceTypeImpl referencedSourceType = new ReferencedSourceTypeImpl();
		return referencedSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedTimeSeriesType createReferencedTimeSeriesType() {
		ReferencedTimeSeriesTypeImpl referencedTimeSeriesType = new ReferencedTimeSeriesTypeImpl();
		return referencedTimeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSurfaceType createReferenceSurfaceType() {
		ReferenceSurfaceTypeImpl referenceSurfaceType = new ReferenceSurfaceTypeImpl();
		return referenceSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencingValuesType createReferencingValuesType() {
		ReferencingValuesTypeImpl referencingValuesType = new ReferencingValuesTypeImpl();
		return referencingValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectanceColourType createReflectanceColourType() {
		ReflectanceColourTypeImpl reflectanceColourType = new ReflectanceColourTypeImpl();
		return reflectanceColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectionColourType createReflectionColourType() {
		ReflectionColourTypeImpl reflectionColourType = new ReflectionColourTypeImpl();
		return reflectionColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReinforcementSectionDefinitionsType createReinforcementSectionDefinitionsType() {
		ReinforcementSectionDefinitionsTypeImpl reinforcementSectionDefinitionsType = new ReinforcementSectionDefinitionsTypeImpl();
		return reinforcementSectionDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedApprovalType createRelatedApprovalType() {
		RelatedApprovalTypeImpl relatedApprovalType = new RelatedApprovalTypeImpl();
		return relatedApprovalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedBuildingElementType createRelatedBuildingElementType() {
		RelatedBuildingElementTypeImpl relatedBuildingElementType = new RelatedBuildingElementTypeImpl();
		return relatedBuildingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedBuildingElementType1 createRelatedBuildingElementType1() {
		RelatedBuildingElementType1Impl relatedBuildingElementType1 = new RelatedBuildingElementType1Impl();
		return relatedBuildingElementType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedBuildingsType createRelatedBuildingsType() {
		RelatedBuildingsTypeImpl relatedBuildingsType = new RelatedBuildingsTypeImpl();
		return relatedBuildingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedClassificationsType createRelatedClassificationsType() {
		RelatedClassificationsTypeImpl relatedClassificationsType = new RelatedClassificationsTypeImpl();
		return relatedClassificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedConstraintsType createRelatedConstraintsType() {
		RelatedConstraintsTypeImpl relatedConstraintsType = new RelatedConstraintsTypeImpl();
		return relatedConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedConstraintsType1 createRelatedConstraintsType1() {
		RelatedConstraintsType1Impl relatedConstraintsType1 = new RelatedConstraintsType1Impl();
		return relatedConstraintsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedControlElementsType createRelatedControlElementsType() {
		RelatedControlElementsTypeImpl relatedControlElementsType = new RelatedControlElementsTypeImpl();
		return relatedControlElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedCoveringsType createRelatedCoveringsType() {
		RelatedCoveringsTypeImpl relatedCoveringsType = new RelatedCoveringsTypeImpl();
		return relatedCoveringsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedCoveringsType1 createRelatedCoveringsType1() {
		RelatedCoveringsType1Impl relatedCoveringsType1 = new RelatedCoveringsType1Impl();
		return relatedCoveringsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedDocumentsType createRelatedDocumentsType() {
		RelatedDocumentsTypeImpl relatedDocumentsType = new RelatedDocumentsTypeImpl();
		return relatedDocumentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedDraughtingCalloutType createRelatedDraughtingCalloutType() {
		RelatedDraughtingCalloutTypeImpl relatedDraughtingCalloutType = new RelatedDraughtingCalloutTypeImpl();
		return relatedDraughtingCalloutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedElementsType createRelatedElementsType() {
		RelatedElementsTypeImpl relatedElementsType = new RelatedElementsTypeImpl();
		return relatedElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedElementsType1 createRelatedElementsType1() {
		RelatedElementsType1Impl relatedElementsType1 = new RelatedElementsType1Impl();
		return relatedElementsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedElementType createRelatedElementType() {
		RelatedElementTypeImpl relatedElementType = new RelatedElementTypeImpl();
		return relatedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedElementType1 createRelatedElementType1() {
		RelatedElementType1Impl relatedElementType1 = new RelatedElementType1Impl();
		return relatedElementType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedFeatureElementType createRelatedFeatureElementType() {
		RelatedFeatureElementTypeImpl relatedFeatureElementType = new RelatedFeatureElementTypeImpl();
		return relatedFeatureElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedItemsType createRelatedItemsType() {
		RelatedItemsTypeImpl relatedItemsType = new RelatedItemsTypeImpl();
		return relatedItemsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedMonetaryUnitType createRelatedMonetaryUnitType() {
		RelatedMonetaryUnitTypeImpl relatedMonetaryUnitType = new RelatedMonetaryUnitTypeImpl();
		return relatedMonetaryUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedObjectsType createRelatedObjectsType() {
		RelatedObjectsTypeImpl relatedObjectsType = new RelatedObjectsTypeImpl();
		return relatedObjectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedObjectsType1 createRelatedObjectsType1() {
		RelatedObjectsType1Impl relatedObjectsType1 = new RelatedObjectsType1Impl();
		return relatedObjectsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedObjectsType2 createRelatedObjectsType2() {
		RelatedObjectsType2Impl relatedObjectsType2 = new RelatedObjectsType2Impl();
		return relatedObjectsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedObjectsType3 createRelatedObjectsType3() {
		RelatedObjectsType3Impl relatedObjectsType3 = new RelatedObjectsType3Impl();
		return relatedObjectsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedOpeningElementType createRelatedOpeningElementType() {
		RelatedOpeningElementTypeImpl relatedOpeningElementType = new RelatedOpeningElementTypeImpl();
		return relatedOpeningElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedOrganizationsType createRelatedOrganizationsType() {
		RelatedOrganizationsTypeImpl relatedOrganizationsType = new RelatedOrganizationsTypeImpl();
		return relatedOrganizationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPortType createRelatedPortType() {
		RelatedPortTypeImpl relatedPortType = new RelatedPortTypeImpl();
		return relatedPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPrioritiesType createRelatedPrioritiesType() {
		RelatedPrioritiesTypeImpl relatedPrioritiesType = new RelatedPrioritiesTypeImpl();
		return relatedPrioritiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedProcessType createRelatedProcessType() {
		RelatedProcessTypeImpl relatedProcessType = new RelatedProcessTypeImpl();
		return relatedProcessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPropertiesType createRelatedPropertiesType() {
		RelatedPropertiesTypeImpl relatedPropertiesType = new RelatedPropertiesTypeImpl();
		return relatedPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSpaceProgramType createRelatedSpaceProgramType() {
		RelatedSpaceProgramTypeImpl relatedSpaceProgramType = new RelatedSpaceProgramTypeImpl();
		return relatedSpaceProgramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSpaceType createRelatedSpaceType() {
		RelatedSpaceTypeImpl relatedSpaceType = new RelatedSpaceTypeImpl();
		return relatedSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedStructuralActivityType createRelatedStructuralActivityType() {
		RelatedStructuralActivityTypeImpl relatedStructuralActivityType = new RelatedStructuralActivityTypeImpl();
		return relatedStructuralActivityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedStructuralConnectionType createRelatedStructuralConnectionType() {
		RelatedStructuralConnectionTypeImpl relatedStructuralConnectionType = new RelatedStructuralConnectionTypeImpl();
		return relatedStructuralConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedStructuralMemberType createRelatedStructuralMemberType() {
		RelatedStructuralMemberTypeImpl relatedStructuralMemberType = new RelatedStructuralMemberTypeImpl();
		return relatedStructuralMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingActorType createRelatingActorType() {
		RelatingActorTypeImpl relatingActorType = new RelatingActorTypeImpl();
		return relatingActorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingAppliedValueType createRelatingAppliedValueType() {
		RelatingAppliedValueTypeImpl relatingAppliedValueType = new RelatingAppliedValueTypeImpl();
		return relatingAppliedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingApprovalType createRelatingApprovalType() {
		RelatingApprovalTypeImpl relatingApprovalType = new RelatingApprovalTypeImpl();
		return relatingApprovalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingApprovalType1 createRelatingApprovalType1() {
		RelatingApprovalType1Impl relatingApprovalType1 = new RelatingApprovalType1Impl();
		return relatingApprovalType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingBuildingElementType createRelatingBuildingElementType() {
		RelatingBuildingElementTypeImpl relatingBuildingElementType = new RelatingBuildingElementTypeImpl();
		return relatingBuildingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingBuildingElementType1 createRelatingBuildingElementType1() {
		RelatingBuildingElementType1Impl relatingBuildingElementType1 = new RelatingBuildingElementType1Impl();
		return relatingBuildingElementType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingClassificationType createRelatingClassificationType() {
		RelatingClassificationTypeImpl relatingClassificationType = new RelatingClassificationTypeImpl();
		return relatingClassificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingConstraintType createRelatingConstraintType() {
		RelatingConstraintTypeImpl relatingConstraintType = new RelatingConstraintTypeImpl();
		return relatingConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingConstraintType1 createRelatingConstraintType1() {
		RelatingConstraintType1Impl relatingConstraintType1 = new RelatingConstraintType1Impl();
		return relatingConstraintType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingConstraintType2 createRelatingConstraintType2() {
		RelatingConstraintType2Impl relatingConstraintType2 = new RelatingConstraintType2Impl();
		return relatingConstraintType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingConstraintType3 createRelatingConstraintType3() {
		RelatingConstraintType3Impl relatingConstraintType3 = new RelatingConstraintType3Impl();
		return relatingConstraintType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingControlType createRelatingControlType() {
		RelatingControlTypeImpl relatingControlType = new RelatingControlTypeImpl();
		return relatingControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingDocumentType createRelatingDocumentType() {
		RelatingDocumentTypeImpl relatingDocumentType = new RelatingDocumentTypeImpl();
		return relatingDocumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingDocumentType1 createRelatingDocumentType1() {
		RelatingDocumentType1Impl relatingDocumentType1 = new RelatingDocumentType1Impl();
		return relatingDocumentType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingDraughtingCalloutType createRelatingDraughtingCalloutType() {
		RelatingDraughtingCalloutTypeImpl relatingDraughtingCalloutType = new RelatingDraughtingCalloutTypeImpl();
		return relatingDraughtingCalloutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingElementType createRelatingElementType() {
		RelatingElementTypeImpl relatingElementType = new RelatingElementTypeImpl();
		return relatingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingElementType1 createRelatingElementType1() {
		RelatingElementType1Impl relatingElementType1 = new RelatingElementType1Impl();
		return relatingElementType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingElementType2 createRelatingElementType2() {
		RelatingElementType2Impl relatingElementType2 = new RelatingElementType2Impl();
		return relatingElementType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingElementType3 createRelatingElementType3() {
		RelatingElementType3Impl relatingElementType3 = new RelatingElementType3Impl();
		return relatingElementType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingFlowElementType createRelatingFlowElementType() {
		RelatingFlowElementTypeImpl relatingFlowElementType = new RelatingFlowElementTypeImpl();
		return relatingFlowElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingGroupType createRelatingGroupType() {
		RelatingGroupTypeImpl relatingGroupType = new RelatingGroupTypeImpl();
		return relatingGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingItemType createRelatingItemType() {
		RelatingItemTypeImpl relatingItemType = new RelatingItemTypeImpl();
		return relatingItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingLibraryType createRelatingLibraryType() {
		RelatingLibraryTypeImpl relatingLibraryType = new RelatingLibraryTypeImpl();
		return relatingLibraryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingMaterialType createRelatingMaterialType() {
		RelatingMaterialTypeImpl relatingMaterialType = new RelatingMaterialTypeImpl();
		return relatingMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingMonetaryUnitType createRelatingMonetaryUnitType() {
		RelatingMonetaryUnitTypeImpl relatingMonetaryUnitType = new RelatingMonetaryUnitTypeImpl();
		return relatingMonetaryUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingObjectType createRelatingObjectType() {
		RelatingObjectTypeImpl relatingObjectType = new RelatingObjectTypeImpl();
		return relatingObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingOpeningElementType createRelatingOpeningElementType() {
		RelatingOpeningElementTypeImpl relatingOpeningElementType = new RelatingOpeningElementTypeImpl();
		return relatingOpeningElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingOrganizationType createRelatingOrganizationType() {
		RelatingOrganizationTypeImpl relatingOrganizationType = new RelatingOrganizationTypeImpl();
		return relatingOrganizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingPortType createRelatingPortType() {
		RelatingPortTypeImpl relatingPortType = new RelatingPortTypeImpl();
		return relatingPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingPortType1 createRelatingPortType1() {
		RelatingPortType1Impl relatingPortType1 = new RelatingPortType1Impl();
		return relatingPortType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingPrioritiesType createRelatingPrioritiesType() {
		RelatingPrioritiesTypeImpl relatingPrioritiesType = new RelatingPrioritiesTypeImpl();
		return relatingPrioritiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingProcessType createRelatingProcessType() {
		RelatingProcessTypeImpl relatingProcessType = new RelatingProcessTypeImpl();
		return relatingProcessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingProcessType1 createRelatingProcessType1() {
		RelatingProcessType1Impl relatingProcessType1 = new RelatingProcessType1Impl();
		return relatingProcessType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingProductType createRelatingProductType() {
		RelatingProductTypeImpl relatingProductType = new RelatingProductTypeImpl();
		return relatingProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingProfilePropertiesType createRelatingProfilePropertiesType() {
		RelatingProfilePropertiesTypeImpl relatingProfilePropertiesType = new RelatingProfilePropertiesTypeImpl();
		return relatingProfilePropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingPropertyDefinitionType createRelatingPropertyDefinitionType() {
		RelatingPropertyDefinitionTypeImpl relatingPropertyDefinitionType = new RelatingPropertyDefinitionTypeImpl();
		return relatingPropertyDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingResourceType createRelatingResourceType() {
		RelatingResourceTypeImpl relatingResourceType = new RelatingResourceTypeImpl();
		return relatingResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingSpaceProgramType createRelatingSpaceProgramType() {
		RelatingSpaceProgramTypeImpl relatingSpaceProgramType = new RelatingSpaceProgramTypeImpl();
		return relatingSpaceProgramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingSpaceType createRelatingSpaceType() {
		RelatingSpaceTypeImpl relatingSpaceType = new RelatingSpaceTypeImpl();
		return relatingSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingStructuralMemberType createRelatingStructuralMemberType() {
		RelatingStructuralMemberTypeImpl relatingStructuralMemberType = new RelatingStructuralMemberTypeImpl();
		return relatingStructuralMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingStructureType createRelatingStructureType() {
		RelatingStructureTypeImpl relatingStructureType = new RelatingStructureTypeImpl();
		return relatingStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingStructureType1 createRelatingStructureType1() {
		RelatingStructureType1Impl relatingStructureType1 = new RelatingStructureType1Impl();
		return relatingStructureType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingSystemType createRelatingSystemType() {
		RelatingSystemTypeImpl relatingSystemType = new RelatingSystemTypeImpl();
		return relatingSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingTypeType createRelatingTypeType() {
		RelatingTypeTypeImpl relatingTypeType = new RelatingTypeTypeImpl();
		return relatingTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePlacementType createRelativePlacementType() {
		RelativePlacementTypeImpl relativePlacementType = new RelativePlacementTypeImpl();
		return relativePlacementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelaxationsType createRelaxationsType() {
		RelaxationsTypeImpl relaxationsType = new RelaxationsTypeImpl();
		return relaxationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatFactorType createRepeatFactorType() {
		RepeatFactorTypeImpl repeatFactorType = new RepeatFactorTypeImpl();
		return repeatFactorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationContextsType createRepresentationContextsType() {
		RepresentationContextsTypeImpl representationContextsType = new RepresentationContextsTypeImpl();
		return representationContextsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationMapsType createRepresentationMapsType() {
		RepresentationMapsTypeImpl representationMapsType = new RepresentationMapsTypeImpl();
		return representationMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationsType createRepresentationsType() {
		RepresentationsTypeImpl representationsType = new RepresentationsTypeImpl();
		return representationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationType createRepresentationType() {
		RepresentationTypeImpl representationType = new RepresentationTypeImpl();
		return representationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentedMaterialType createRepresentedMaterialType() {
		RepresentedMaterialTypeImpl representedMaterialType = new RepresentedMaterialTypeImpl();
		return representedMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestedLocationType createRequestedLocationType() {
		RequestedLocationTypeImpl requestedLocationType = new RequestedLocationTypeImpl();
		return requestedLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsiblePersonsType createResponsiblePersonsType() {
		ResponsiblePersonsTypeImpl responsiblePersonsType = new ResponsiblePersonsTypeImpl();
		return responsiblePersonsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsiblePersonType createResponsiblePersonType() {
		ResponsiblePersonTypeImpl responsiblePersonType = new ResponsiblePersonTypeImpl();
		return responsiblePersonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultForLoadGroupType createResultForLoadGroupType() {
		ResultForLoadGroupTypeImpl resultForLoadGroupType = new ResultForLoadGroupTypeImpl();
		return resultForLoadGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultValuesType createResultValuesType() {
		ResultValuesTypeImpl resultValuesType = new ResultValuesTypeImpl();
		return resultValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType createRolesType() {
		RolesTypeImpl rolesType = new RolesTypeImpl();
		return rolesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType1 createRolesType1() {
		RolesType1Impl rolesType1 = new RolesType1Impl();
		return rolesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType2 createRolesType2() {
		RolesType2Impl rolesType2 = new RolesType2Impl();
		return rolesType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowCellsType createRowCellsType() {
		RowCellsTypeImpl rowCellsType = new RowCellsTypeImpl();
		return rowCellsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowsType createRowsType() {
		RowsTypeImpl rowsType = new RowsTypeImpl();
		return rowsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbsmBoundaryType createSbsmBoundaryType() {
		SbsmBoundaryTypeImpl sbsmBoundaryType = new SbsmBoundaryTypeImpl();
		return sbsmBoundaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleFinishType createScheduleFinishType() {
		ScheduleFinishTypeImpl scheduleFinishType = new ScheduleFinishTypeImpl();
		return scheduleFinishType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleStartType createScheduleStartType() {
		ScheduleStartTypeImpl scheduleStartType = new ScheduleStartTypeImpl();
		return scheduleStartType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryPlaneAngleType createSecondaryPlaneAngleType() {
		SecondaryPlaneAngleTypeImpl secondaryPlaneAngleType = new SecondaryPlaneAngleTypeImpl();
		return secondaryPlaneAngleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondOperandType createSecondOperandType() {
		SecondOperandTypeImpl secondOperandType = new SecondOperandTypeImpl();
		return secondOperandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondRepeatFactorType createSecondRepeatFactorType() {
		SecondRepeatFactorTypeImpl secondRepeatFactorType = new SecondRepeatFactorTypeImpl();
		return secondRepeatFactorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionDefinitionType createSectionDefinitionType() {
		SectionDefinitionTypeImpl sectionDefinitionType = new SectionDefinitionTypeImpl();
		return sectionDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentsType createSegmentsType() {
		SegmentsTypeImpl segmentsType = new SegmentsTypeImpl();
		return segmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAspectStyleType createShapeAspectStyleType() {
		ShapeAspectStyleTypeImpl shapeAspectStyleType = new ShapeAspectStyleTypeImpl();
		return shapeAspectStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAspectStyleType1 createShapeAspectStyleType1() {
		ShapeAspectStyleType1Impl shapeAspectStyleType1 = new ShapeAspectStyleType1Impl();
		return shapeAspectStyleType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAspectStyleType2 createShapeAspectStyleType2() {
		ShapeAspectStyleType2Impl shapeAspectStyleType2 = new ShapeAspectStyleType2Impl();
		return shapeAspectStyleType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAspectStyleType3 createShapeAspectStyleType3() {
		ShapeAspectStyleType3Impl shapeAspectStyleType3 = new ShapeAspectStyleType3Impl();
		return shapeAspectStyleType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeAspectStyleType4 createShapeAspectStyleType4() {
		ShapeAspectStyleType4Impl shapeAspectStyleType4 = new ShapeAspectStyleType4Impl();
		return shapeAspectStyleType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeRepresentationsType createShapeRepresentationsType() {
		ShapeRepresentationsTypeImpl shapeRepresentationsType = new ShapeRepresentationsTypeImpl();
		return shapeRepresentationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteAddressType createSiteAddressType() {
		SiteAddressTypeImpl siteAddressType = new SiteAddressTypeImpl();
		return siteAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundLevelSingleValueType createSoundLevelSingleValueType() {
		SoundLevelSingleValueTypeImpl soundLevelSingleValueType = new SoundLevelSingleValueTypeImpl();
		return soundLevelSingleValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundLevelTimeSeriesType createSoundLevelTimeSeriesType() {
		SoundLevelTimeSeriesTypeImpl soundLevelTimeSeriesType = new SoundLevelTimeSeriesTypeImpl();
		return soundLevelTimeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundValuesType createSoundValuesType() {
		SoundValuesTypeImpl soundValuesType = new SoundValuesTypeImpl();
		return soundValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecularColourType createSpecularColourType() {
		SpecularColourTypeImpl specularColourType = new SpecularColourTypeImpl();
		return specularColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecularHighlightType createSpecularHighlightType() {
		SpecularHighlightTypeImpl specularHighlightType = new SpecularHighlightTypeImpl();
		return specularHighlightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpineCurveType createSpineCurveType() {
		SpineCurveTypeImpl spineCurveType = new SpineCurveTypeImpl();
		return spineCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOfNextHatchLineType createStartOfNextHatchLineType() {
		StartOfNextHatchLineTypeImpl startOfNextHatchLineType = new StartOfNextHatchLineTypeImpl();
		return startOfNextHatchLineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartProfileType createStartProfileType() {
		StartProfileTypeImpl startProfileType = new StartProfileTypeImpl();
		return startProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimeType createStartTimeType() {
		StartTimeTypeImpl startTimeType = new StartTimeTypeImpl();
		return startTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimeType1 createStartTimeType1() {
		StartTimeType1Impl startTimeType1 = new StartTimeType1Impl();
		return startTimeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusTimeType createStatusTimeType() {
		StatusTimeTypeImpl statusTimeType = new StatusTimeTypeImpl();
		return statusTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleOfSymbolType createStyleOfSymbolType() {
		StyleOfSymbolTypeImpl styleOfSymbolType = new StyleOfSymbolTypeImpl();
		return styleOfSymbolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesType createStylesType() {
		StylesTypeImpl stylesType = new StylesTypeImpl();
		return stylesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesType1 createStylesType1() {
		StylesType1Impl stylesType1 = new StylesType1Impl();
		return stylesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesType2 createStylesType2() {
		StylesType2Impl stylesType2 = new StylesType2Impl();
		return stylesType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubContractorType createSubContractorType() {
		SubContractorTypeImpl subContractorType = new SubContractorTypeImpl();
		return subContractorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmittedByType createSubmittedByType() {
		SubmittedByTypeImpl submittedByType = new SubmittedByTypeImpl();
		return submittedByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmittedOnType createSubmittedOnType() {
		SubmittedOnTypeImpl submittedOnType = new SubmittedOnTypeImpl();
		return submittedOnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsequentAppliedLoadsType createSubsequentAppliedLoadsType() {
		SubsequentAppliedLoadsTypeImpl subsequentAppliedLoadsType = new SubsequentAppliedLoadsTypeImpl();
		return subsequentAppliedLoadsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsequentAppliedLoadsType1 createSubsequentAppliedLoadsType1() {
		SubsequentAppliedLoadsType1Impl subsequentAppliedLoadsType1 = new SubsequentAppliedLoadsType1Impl();
		return subsequentAppliedLoadsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsequentThicknessType createSubsequentThicknessType() {
		SubsequentThicknessTypeImpl subsequentThicknessType = new SubsequentThicknessTypeImpl();
		return subsequentThicknessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuffixTitlesType createSuffixTitlesType() {
		SuffixTitlesTypeImpl suffixTitlesType = new SuffixTitlesTypeImpl();
		return suffixTitlesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppliersType createSuppliersType() {
		SuppliersTypeImpl suppliersType = new SuppliersTypeImpl();
		return suppliersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceColourType createSurfaceColourType() {
		SurfaceColourTypeImpl surfaceColourType = new SurfaceColourTypeImpl();
		return surfaceColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceOnRelatedElementType createSurfaceOnRelatedElementType() {
		SurfaceOnRelatedElementTypeImpl surfaceOnRelatedElementType = new SurfaceOnRelatedElementTypeImpl();
		return surfaceOnRelatedElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceOnRelatingElementType createSurfaceOnRelatingElementType() {
		SurfaceOnRelatingElementTypeImpl surfaceOnRelatingElementType = new SurfaceOnRelatingElementTypeImpl();
		return surfaceOnRelatingElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SweptAreaType createSweptAreaType() {
		SweptAreaTypeImpl sweptAreaType = new SweptAreaTypeImpl();
		return sweptAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SweptCurveType createSweptCurveType() {
		SweptCurveTypeImpl sweptCurveType = new SweptCurveTypeImpl();
		return sweptCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolType createSymbolType() {
		SymbolTypeImpl symbolType = new SymbolTypeImpl();
		return symbolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType createTargetType() {
		TargetTypeImpl targetType = new TargetTypeImpl();
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetUsersType createTargetUsersType() {
		TargetUsersTypeImpl targetUsersType = new TargetUsersTypeImpl();
		return targetUsersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumbersType createTelephoneNumbersType() {
		TelephoneNumbersTypeImpl telephoneNumbersType = new TelephoneNumbersTypeImpl();
		return telephoneNumbersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureTimeSeriesType createTemperatureTimeSeriesType() {
		TemperatureTimeSeriesTypeImpl temperatureTimeSeriesType = new TemperatureTimeSeriesTypeImpl();
		return temperatureTimeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextCharacterAppearanceType createTextCharacterAppearanceType() {
		TextCharacterAppearanceTypeImpl textCharacterAppearanceType = new TextCharacterAppearanceTypeImpl();
		return textCharacterAppearanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFontStyleType createTextFontStyleType() {
		TextFontStyleTypeImpl textFontStyleType = new TextFontStyleTypeImpl();
		return textFontStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextIndentType createTextIndentType() {
		TextIndentTypeImpl textIndentType = new TextIndentTypeImpl();
		return textIndentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextStyleType createTextStyleType() {
		TextStyleTypeImpl textStyleType = new TextStyleTypeImpl();
		return textStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureCoordinatesType createTextureCoordinatesType() {
		TextureCoordinatesTypeImpl textureCoordinatesType = new TextureCoordinatesTypeImpl();
		return textureCoordinatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureMapsType createTextureMapsType() {
		TextureMapsTypeImpl textureMapsType = new TextureMapsTypeImpl();
		return textureMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturePointsType createTexturePointsType() {
		TexturePointsTypeImpl texturePointsType = new TexturePointsTypeImpl();
		return texturePointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TexturesType createTexturesType() {
		TexturesTypeImpl texturesType = new TexturesTypeImpl();
		return texturesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureTransformType createTextureTransformType() {
		TextureTransformTypeImpl textureTransformType = new TextureTransformTypeImpl();
		return textureTransformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextureVerticesType createTextureVerticesType() {
		TextureVerticesTypeImpl textureVerticesType = new TextureVerticesTypeImpl();
		return textureVerticesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheActorType createTheActorType() {
		TheActorTypeImpl theActorType = new TheActorTypeImpl();
		return theActorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheOrganizationType createTheOrganizationType() {
		TheOrganizationTypeImpl theOrganizationType = new TheOrganizationTypeImpl();
		return theOrganizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThePersonType createThePersonType() {
		ThePersonTypeImpl thePersonType = new ThePersonTypeImpl();
		return thePersonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThermalLoadTimeSeriesValuesType createThermalLoadTimeSeriesValuesType() {
		ThermalLoadTimeSeriesValuesTypeImpl thermalLoadTimeSeriesValuesType = new ThermalLoadTimeSeriesValuesTypeImpl();
		return thermalLoadTimeSeriesValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilesType createTilesType() {
		TilesTypeImpl tilesType = new TilesTypeImpl();
		return tilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilingPatternType createTilingPatternType() {
		TilingPatternTypeImpl tilingPatternType = new TilingPatternTypeImpl();
		return tilingPatternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeComponentType createTimeComponentType() {
		TimeComponentTypeImpl timeComponentType = new TimeComponentTypeImpl();
		return timeComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeForTaskType createTimeForTaskType() {
		TimeForTaskTypeImpl timeForTaskType = new TimeForTaskTypeImpl();
		return timeForTaskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeriesReferencesType createTimeSeriesReferencesType() {
		TimeSeriesReferencesTypeImpl timeSeriesReferencesType = new TimeSeriesReferencesTypeImpl();
		return timeSeriesReferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeriesType createTimeSeriesType() {
		TimeSeriesTypeImpl timeSeriesType = new TimeSeriesTypeImpl();
		return timeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStampType createTimeStampType() {
		TimeStampTypeImpl timeStampType = new TimeStampTypeImpl();
		return timeStampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalReplacementCostType createTotalReplacementCostType() {
		TotalReplacementCostTypeImpl totalReplacementCostType = new TotalReplacementCostTypeImpl();
		return totalReplacementCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionColourType createTransmissionColourType() {
		TransmissionColourTypeImpl transmissionColourType = new TransmissionColourTypeImpl();
		return transmissionColourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionColourType1 createTransmissionColourType1() {
		TransmissionColourType1Impl transmissionColourType1 = new TransmissionColourType1Impl();
		return transmissionColourType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeRootExpressionType createTreeRootExpressionType() {
		TreeRootExpressionTypeImpl treeRootExpressionType = new TreeRootExpressionTypeImpl();
		return treeRootExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trim1Type createTrim1Type() {
		Trim1TypeImpl trim1Type = new Trim1TypeImpl();
		return trim1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trim2Type createTrim2Type() {
		Trim2TypeImpl trim2Type = new Trim2TypeImpl();
		return trim2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueNorthType createTrueNorthType() {
		TrueNorthTypeImpl trueNorthType = new TrueNorthTypeImpl();
		return trueNorthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAxesType createUAxesType() {
		UAxesTypeImpl uAxesType = new UAxesTypeImpl();
		return uAxesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitBasisType createUnitBasisType() {
		UnitBasisTypeImpl unitBasisType = new UnitBasisTypeImpl();
		return unitBasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitComponentType createUnitComponentType() {
		UnitComponentTypeImpl unitComponentType = new UnitComponentTypeImpl();
		return unitComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsInContextType createUnitsInContextType() {
		UnitsInContextTypeImpl unitsInContextType = new UnitsInContextTypeImpl();
		return unitsInContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsType createUnitsType() {
		UnitsTypeImpl unitsType = new UnitsTypeImpl();
		return unitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitType() {
		UnitTypeImpl unitType = new UnitTypeImpl();
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType1 createUnitType1() {
		UnitType1Impl unitType1 = new UnitType1Impl();
		return unitType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType2 createUnitType2() {
		UnitType2Impl unitType2 = new UnitType2Impl();
		return unitType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType3 createUnitType3() {
		UnitType3Impl unitType3 = new UnitType3Impl();
		return unitType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType4 createUnitType4() {
		UnitType4Impl unitType4 = new UnitType4Impl();
		return unitType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType5 createUnitType5() {
		UnitType5Impl unitType5 = new UnitType5Impl();
		return unitType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType6 createUnitType6() {
		UnitType6Impl unitType6 = new UnitType6Impl();
		return unitType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uos createUos() {
		UosImpl uos = new UosImpl();
		return uos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateDateType createUpdateDateType() {
		UpdateDateTypeImpl updateDateType = new UpdateDateTypeImpl();
		return updateDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundValueType createUpperBoundValueType() {
		UpperBoundValueTypeImpl upperBoundValueType = new UpperBoundValueTypeImpl();
		return upperBoundValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperValueType createUpperValueType() {
		UpperValueTypeImpl upperValueType = new UpperValueTypeImpl();
		return upperValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType createUserType() {
		UserTypeImpl userType = new UserTypeImpl();
		return userType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidFromType createValidFromType() {
		ValidFromTypeImpl validFromType = new ValidFromTypeImpl();
		return validFromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidUntilType createValidUntilType() {
		ValidUntilTypeImpl validUntilType = new ValidUntilTypeImpl();
		return validUntilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComponentType createValueComponentType() {
		ValueComponentTypeImpl valueComponentType = new ValueComponentTypeImpl();
		return valueComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesType createValuesType() {
		ValuesTypeImpl valuesType = new ValuesTypeImpl();
		return valuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesType1 createValuesType1() {
		ValuesType1Impl valuesType1 = new ValuesType1Impl();
		return valuesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaryingAppliedLoadLocationType createVaryingAppliedLoadLocationType() {
		VaryingAppliedLoadLocationTypeImpl varyingAppliedLoadLocationType = new VaryingAppliedLoadLocationTypeImpl();
		return varyingAppliedLoadLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaryingAppliedLoadLocationType1 createVaryingAppliedLoadLocationType1() {
		VaryingAppliedLoadLocationType1Impl varyingAppliedLoadLocationType1 = new VaryingAppliedLoadLocationType1Impl();
		return varyingAppliedLoadLocationType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaryingThicknessLocationType createVaryingThicknessLocationType() {
		VaryingThicknessLocationTypeImpl varyingThicknessLocationType = new VaryingThicknessLocationTypeImpl();
		return varyingThicknessLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAxesType createVAxesType() {
		VAxesTypeImpl vAxesType = new VAxesTypeImpl();
		return vAxesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VelocityTimeSeriesType createVelocityTimeSeriesType() {
		VelocityTimeSeriesTypeImpl velocityTimeSeriesType = new VelocityTimeSeriesTypeImpl();
		return velocityTimeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionDateType createVersionDateType() {
		VersionDateTypeImpl versionDateType = new VersionDateTypeImpl();
		return versionDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertexGeometryType createVertexGeometryType() {
		VertexGeometryTypeImpl vertexGeometryType = new VertexGeometryTypeImpl();
		return vertexGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidsType createVoidsType() {
		VoidsTypeImpl voidsType = new VoidsTypeImpl();
		return voidsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WAxesType createWAxesType() {
		WAxesTypeImpl wAxesType = new WAxesTypeImpl();
		return wAxesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightsDataType createWeightsDataType() {
		WeightsDataTypeImpl weightsDataType = new WeightsDataTypeImpl();
		return weightsDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WetBulbTemperatureTimeSeriesType createWetBulbTemperatureTimeSeriesType() {
		WetBulbTemperatureTimeSeriesTypeImpl wetBulbTemperatureTimeSeriesType = new WetBulbTemperatureTimeSeriesTypeImpl();
		return wetBulbTemperatureTimeSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordSpacingType createWordSpacingType() {
		WordSpacingTypeImpl wordSpacingType = new WordSpacingTypeImpl();
		return wordSpacingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldCoordinateSystemType createWorldCoordinateSystemType() {
		WorldCoordinateSystemTypeImpl worldCoordinateSystemType = new WorldCoordinateSystemTypeImpl();
		return worldCoordinateSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneType createZoneType() {
		ZoneTypeImpl zoneType = new ZoneTypeImpl();
		return zoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionSourceTypeEnum createIfcActionSourceTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcActionSourceTypeEnum result = IfcActionSourceTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcActionSourceTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionTypeEnum createIfcActionTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcActionTypeEnum result = IfcActionTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcActionTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActuatorTypeEnum createIfcActuatorTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcActuatorTypeEnum result = IfcActuatorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcActuatorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAddressTypeEnum createIfcAddressTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcAddressTypeEnum result = IfcAddressTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAddressTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAheadOrBehind createIfcAheadOrBehindFromString(EDataType eDataType, String initialValue) {
		IfcAheadOrBehind result = IfcAheadOrBehind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAheadOrBehindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirTerminalBoxTypeEnum createIfcAirTerminalBoxTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcAirTerminalBoxTypeEnum result = IfcAirTerminalBoxTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAirTerminalBoxTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirTerminalTypeEnum createIfcAirTerminalTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcAirTerminalTypeEnum result = IfcAirTerminalTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAirTerminalTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirToAirHeatRecoveryTypeEnum createIfcAirToAirHeatRecoveryTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcAirToAirHeatRecoveryTypeEnum result = IfcAirToAirHeatRecoveryTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAirToAirHeatRecoveryTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAlarmTypeEnum createIfcAlarmTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcAlarmTypeEnum result = IfcAlarmTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAlarmTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisModelTypeEnum createIfcAnalysisModelTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcAnalysisModelTypeEnum result = IfcAnalysisModelTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAnalysisModelTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisTheoryTypeEnum createIfcAnalysisTheoryTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcAnalysisTheoryTypeEnum result = IfcAnalysisTheoryTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAnalysisTheoryTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcArithmeticOperatorEnum createIfcArithmeticOperatorEnumFromString(EDataType eDataType, String initialValue) {
		IfcArithmeticOperatorEnum result = IfcArithmeticOperatorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcArithmeticOperatorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAssemblyPlaceEnum createIfcAssemblyPlaceEnumFromString(EDataType eDataType, String initialValue) {
		IfcAssemblyPlaceEnum result = IfcAssemblyPlaceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAssemblyPlaceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBeamTypeEnum createIfcBeamTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcBeamTypeEnum result = IfcBeamTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBeamTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBenchmarkEnum createIfcBenchmarkEnumFromString(EDataType eDataType, String initialValue) {
		IfcBenchmarkEnum result = IfcBenchmarkEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBenchmarkEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoilerTypeEnum createIfcBoilerTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcBoilerTypeEnum result = IfcBoilerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBoilerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperator createIfcBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		IfcBooleanOperator result = IfcBooleanOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBSplineCurveForm createIfcBSplineCurveFormFromString(EDataType eDataType, String initialValue) {
		IfcBSplineCurveForm result = IfcBSplineCurveForm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBSplineCurveFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBuildingElementProxyTypeEnum createIfcBuildingElementProxyTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcBuildingElementProxyTypeEnum result = IfcBuildingElementProxyTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBuildingElementProxyTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableCarrierFittingTypeEnum createIfcCableCarrierFittingTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCableCarrierFittingTypeEnum result = IfcCableCarrierFittingTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCableCarrierFittingTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableCarrierSegmentTypeEnum createIfcCableCarrierSegmentTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCableCarrierSegmentTypeEnum result = IfcCableCarrierSegmentTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCableCarrierSegmentTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableSegmentTypeEnum createIfcCableSegmentTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCableSegmentTypeEnum result = IfcCableSegmentTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCableSegmentTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChangeActionEnum createIfcChangeActionEnumFromString(EDataType eDataType, String initialValue) {
		IfcChangeActionEnum result = IfcChangeActionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcChangeActionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChillerTypeEnum createIfcChillerTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcChillerTypeEnum result = IfcChillerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcChillerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoilTypeEnum createIfcCoilTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCoilTypeEnum result = IfcCoilTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCoilTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColumnTypeEnum createIfcColumnTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcColumnTypeEnum result = IfcColumnTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcColumnTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompressorTypeEnum createIfcCompressorTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCompressorTypeEnum result = IfcCompressorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCompressorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCondenserTypeEnum createIfcCondenserTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCondenserTypeEnum result = IfcCondenserTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCondenserTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum createIfcConnectionTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcConnectionTypeEnum result = IfcConnectionTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcConnectionTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraintEnum createIfcConstraintEnumFromString(EDataType eDataType, String initialValue) {
		IfcConstraintEnum result = IfcConstraintEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcConstraintEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcControllerTypeEnum createIfcControllerTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcControllerTypeEnum result = IfcControllerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcControllerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCooledBeamTypeEnum createIfcCooledBeamTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCooledBeamTypeEnum result = IfcCooledBeamTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCooledBeamTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoolingTowerTypeEnum createIfcCoolingTowerTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCoolingTowerTypeEnum result = IfcCoolingTowerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCoolingTowerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostScheduleTypeEnum createIfcCostScheduleTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCostScheduleTypeEnum result = IfcCostScheduleTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCostScheduleTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoveringTypeEnum createIfcCoveringTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCoveringTypeEnum result = IfcCoveringTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCoveringTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurrencyEnum createIfcCurrencyEnumFromString(EDataType eDataType, String initialValue) {
		IfcCurrencyEnum result = IfcCurrencyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCurrencyEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurtainWallTypeEnum createIfcCurtainWallTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcCurtainWallTypeEnum result = IfcCurtainWallTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCurtainWallTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDamperTypeEnum createIfcDamperTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcDamperTypeEnum result = IfcDamperTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDamperTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDataOriginEnum createIfcDataOriginEnumFromString(EDataType eDataType, String initialValue) {
		IfcDataOriginEnum result = IfcDataOriginEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDataOriginEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedUnitEnum createIfcDerivedUnitEnumFromString(EDataType eDataType, String initialValue) {
		IfcDerivedUnitEnum result = IfcDerivedUnitEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDerivedUnitEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionExtentUsage createIfcDimensionExtentUsageFromString(EDataType eDataType, String initialValue) {
		IfcDimensionExtentUsage result = IfcDimensionExtentUsage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDimensionExtentUsageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirectionSenseEnum createIfcDirectionSenseEnumFromString(EDataType eDataType, String initialValue) {
		IfcDirectionSenseEnum result = IfcDirectionSenseEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDirectionSenseEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionChamberElementTypeEnum createIfcDistributionChamberElementTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcDistributionChamberElementTypeEnum result = IfcDistributionChamberElementTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDistributionChamberElementTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentConfidentialityEnum createIfcDocumentConfidentialityEnumFromString(EDataType eDataType, String initialValue) {
		IfcDocumentConfidentialityEnum result = IfcDocumentConfidentialityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDocumentConfidentialityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentStatusEnum createIfcDocumentStatusEnumFromString(EDataType eDataType, String initialValue) {
		IfcDocumentStatusEnum result = IfcDocumentStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDocumentStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelOperationEnum createIfcDoorPanelOperationEnumFromString(EDataType eDataType, String initialValue) {
		IfcDoorPanelOperationEnum result = IfcDoorPanelOperationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoorPanelOperationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelPositionEnum createIfcDoorPanelPositionEnumFromString(EDataType eDataType, String initialValue) {
		IfcDoorPanelPositionEnum result = IfcDoorPanelPositionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoorPanelPositionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleConstructionEnum createIfcDoorStyleConstructionEnumFromString(EDataType eDataType, String initialValue) {
		IfcDoorStyleConstructionEnum result = IfcDoorStyleConstructionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoorStyleConstructionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleOperationEnum createIfcDoorStyleOperationEnumFromString(EDataType eDataType, String initialValue) {
		IfcDoorStyleOperationEnum result = IfcDoorStyleOperationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoorStyleOperationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctFittingTypeEnum createIfcDuctFittingTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcDuctFittingTypeEnum result = IfcDuctFittingTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDuctFittingTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctSegmentTypeEnum createIfcDuctSegmentTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcDuctSegmentTypeEnum result = IfcDuctSegmentTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDuctSegmentTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctSilencerTypeEnum createIfcDuctSilencerTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcDuctSilencerTypeEnum result = IfcDuctSilencerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDuctSilencerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricApplianceTypeEnum createIfcElectricApplianceTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcElectricApplianceTypeEnum result = IfcElectricApplianceTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricApplianceTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentEnum createIfcElectricCurrentEnumFromString(EDataType eDataType, String initialValue) {
		IfcElectricCurrentEnum result = IfcElectricCurrentEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricCurrentEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricDistributionPointFunctionEnum createIfcElectricDistributionPointFunctionEnumFromString(EDataType eDataType, String initialValue) {
		IfcElectricDistributionPointFunctionEnum result = IfcElectricDistributionPointFunctionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricDistributionPointFunctionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricFlowStorageDeviceTypeEnum createIfcElectricFlowStorageDeviceTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcElectricFlowStorageDeviceTypeEnum result = IfcElectricFlowStorageDeviceTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricFlowStorageDeviceTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricGeneratorTypeEnum createIfcElectricGeneratorTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcElectricGeneratorTypeEnum result = IfcElectricGeneratorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricGeneratorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricHeaterTypeEnum createIfcElectricHeaterTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcElectricHeaterTypeEnum result = IfcElectricHeaterTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricHeaterTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricMotorTypeEnum createIfcElectricMotorTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcElectricMotorTypeEnum result = IfcElectricMotorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricMotorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricTimeControlTypeEnum createIfcElectricTimeControlTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcElectricTimeControlTypeEnum result = IfcElectricTimeControlTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricTimeControlTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementAssemblyTypeEnum createIfcElementAssemblyTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcElementAssemblyTypeEnum result = IfcElementAssemblyTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElementAssemblyTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementCompositionEnum createIfcElementCompositionEnumFromString(EDataType eDataType, String initialValue) {
		IfcElementCompositionEnum result = IfcElementCompositionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElementCompositionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnergySequenceEnum createIfcEnergySequenceEnumFromString(EDataType eDataType, String initialValue) {
		IfcEnergySequenceEnum result = IfcEnergySequenceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEnergySequenceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnvironmentalImpactCategoryEnum createIfcEnvironmentalImpactCategoryEnumFromString(EDataType eDataType, String initialValue) {
		IfcEnvironmentalImpactCategoryEnum result = IfcEnvironmentalImpactCategoryEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEnvironmentalImpactCategoryEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEvaporativeCoolerTypeEnum createIfcEvaporativeCoolerTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcEvaporativeCoolerTypeEnum result = IfcEvaporativeCoolerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEvaporativeCoolerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEvaporatorTypeEnum createIfcEvaporatorTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcEvaporatorTypeEnum result = IfcEvaporatorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEvaporatorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFanTypeEnum createIfcFanTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcFanTypeEnum result = IfcFanTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFanTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFilterTypeEnum createIfcFilterTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcFilterTypeEnum result = IfcFilterTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFilterTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFireSuppressionTerminalTypeEnum createIfcFireSuppressionTerminalTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcFireSuppressionTerminalTypeEnum result = IfcFireSuppressionTerminalTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFireSuppressionTerminalTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowDirectionEnum createIfcFlowDirectionEnumFromString(EDataType eDataType, String initialValue) {
		IfcFlowDirectionEnum result = IfcFlowDirectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFlowDirectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowInstrumentTypeEnum createIfcFlowInstrumentTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcFlowInstrumentTypeEnum result = IfcFlowInstrumentTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFlowInstrumentTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowMeterTypeEnum createIfcFlowMeterTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcFlowMeterTypeEnum result = IfcFlowMeterTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFlowMeterTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFootingTypeEnum createIfcFootingTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcFootingTypeEnum result = IfcFootingTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFootingTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGasTerminalTypeEnum createIfcGasTerminalTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcGasTerminalTypeEnum result = IfcGasTerminalTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcGasTerminalTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricProjectionEnum createIfcGeometricProjectionEnumFromString(EDataType eDataType, String initialValue) {
		IfcGeometricProjectionEnum result = IfcGeometricProjectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcGeometricProjectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGlobalOrLocalEnum createIfcGlobalOrLocalEnumFromString(EDataType eDataType, String initialValue) {
		IfcGlobalOrLocalEnum result = IfcGlobalOrLocalEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcGlobalOrLocalEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatExchangerTypeEnum createIfcHeatExchangerTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcHeatExchangerTypeEnum result = IfcHeatExchangerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHeatExchangerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHumidifierTypeEnum createIfcHumidifierTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcHumidifierTypeEnum result = IfcHumidifierTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHumidifierTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInternalOrExternalEnum createIfcInternalOrExternalEnumFromString(EDataType eDataType, String initialValue) {
		IfcInternalOrExternalEnum result = IfcInternalOrExternalEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcInternalOrExternalEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInventoryTypeEnum createIfcInventoryTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcInventoryTypeEnum result = IfcInventoryTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcInventoryTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcJunctionBoxTypeEnum createIfcJunctionBoxTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcJunctionBoxTypeEnum result = IfcJunctionBoxTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcJunctionBoxTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLampTypeEnum createIfcLampTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcLampTypeEnum result = IfcLampTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLampTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLayerSetDirectionEnum createIfcLayerSetDirectionEnumFromString(EDataType eDataType, String initialValue) {
		IfcLayerSetDirectionEnum result = IfcLayerSetDirectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLayerSetDirectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionCurveEnum createIfcLightDistributionCurveEnumFromString(EDataType eDataType, String initialValue) {
		IfcLightDistributionCurveEnum result = IfcLightDistributionCurveEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLightDistributionCurveEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightEmissionSourceEnum createIfcLightEmissionSourceEnumFromString(EDataType eDataType, String initialValue) {
		IfcLightEmissionSourceEnum result = IfcLightEmissionSourceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLightEmissionSourceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightFixtureTypeEnum createIfcLightFixtureTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcLightFixtureTypeEnum result = IfcLightFixtureTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLightFixtureTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLoadGroupTypeEnum createIfcLoadGroupTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcLoadGroupTypeEnum result = IfcLoadGroupTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLoadGroupTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogicalOperatorEnum createIfcLogicalOperatorEnumFromString(EDataType eDataType, String initialValue) {
		IfcLogicalOperatorEnum result = IfcLogicalOperatorEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLogicalOperatorEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMemberTypeEnum createIfcMemberTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcMemberTypeEnum result = IfcMemberTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMemberTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMotorConnectionTypeEnum createIfcMotorConnectionTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcMotorConnectionTypeEnum result = IfcMotorConnectionTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMotorConnectionTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNullStyle createIfcNullStyleFromString(EDataType eDataType, String initialValue) {
		IfcNullStyle result = IfcNullStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcNullStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectiveEnum createIfcObjectiveEnumFromString(EDataType eDataType, String initialValue) {
		IfcObjectiveEnum result = IfcObjectiveEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcObjectiveEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectTypeEnum createIfcObjectTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcObjectTypeEnum result = IfcObjectTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcObjectTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOccupantTypeEnum createIfcOccupantTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcOccupantTypeEnum result = IfcOccupantTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcOccupantTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOutletTypeEnum createIfcOutletTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcOutletTypeEnum result = IfcOutletTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcOutletTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPermeableCoveringOperationEnum createIfcPermeableCoveringOperationEnumFromString(EDataType eDataType, String initialValue) {
		IfcPermeableCoveringOperationEnum result = IfcPermeableCoveringOperationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPermeableCoveringOperationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPhysicalOrVirtualEnum createIfcPhysicalOrVirtualEnumFromString(EDataType eDataType, String initialValue) {
		IfcPhysicalOrVirtualEnum result = IfcPhysicalOrVirtualEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPhysicalOrVirtualEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPileConstructionEnum createIfcPileConstructionEnumFromString(EDataType eDataType, String initialValue) {
		IfcPileConstructionEnum result = IfcPileConstructionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPileConstructionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPileTypeEnum createIfcPileTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcPileTypeEnum result = IfcPileTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPileTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPipeFittingTypeEnum createIfcPipeFittingTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcPipeFittingTypeEnum result = IfcPipeFittingTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPipeFittingTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPipeSegmentTypeEnum createIfcPipeSegmentTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcPipeSegmentTypeEnum result = IfcPipeSegmentTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPipeSegmentTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlateTypeEnum createIfcPlateTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcPlateTypeEnum result = IfcPlateTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPlateTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcedureTypeEnum createIfcProcedureTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcProcedureTypeEnum result = IfcProcedureTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProcedureTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileTypeEnum createIfcProfileTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcProfileTypeEnum result = IfcProfileTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProfileTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectedOrTrueLengthEnum createIfcProjectedOrTrueLengthEnumFromString(EDataType eDataType, String initialValue) {
		IfcProjectedOrTrueLengthEnum result = IfcProjectedOrTrueLengthEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProjectedOrTrueLengthEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectOrderRecordTypeEnum createIfcProjectOrderRecordTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcProjectOrderRecordTypeEnum result = IfcProjectOrderRecordTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProjectOrderRecordTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectOrderTypeEnum createIfcProjectOrderTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcProjectOrderTypeEnum result = IfcProjectOrderTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProjectOrderTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySourceEnum createIfcPropertySourceEnumFromString(EDataType eDataType, String initialValue) {
		IfcPropertySourceEnum result = IfcPropertySourceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPropertySourceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProtectiveDeviceTypeEnum createIfcProtectiveDeviceTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcProtectiveDeviceTypeEnum result = IfcProtectiveDeviceTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProtectiveDeviceTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPumpTypeEnum createIfcPumpTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcPumpTypeEnum result = IfcPumpTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPumpTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRailingTypeEnum createIfcRailingTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcRailingTypeEnum result = IfcRailingTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRailingTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRampFlightTypeEnum createIfcRampFlightTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcRampFlightTypeEnum result = IfcRampFlightTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRampFlightTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRampTypeEnum createIfcRampTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcRampTypeEnum result = IfcRampTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRampTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReflectanceMethodEnum createIfcReflectanceMethodEnumFromString(EDataType eDataType, String initialValue) {
		IfcReflectanceMethodEnum result = IfcReflectanceMethodEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcReflectanceMethodEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnum createIfcReinforcingBarRoleEnumFromString(EDataType eDataType, String initialValue) {
		IfcReinforcingBarRoleEnum result = IfcReinforcingBarRoleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcReinforcingBarRoleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnum createIfcReinforcingBarSurfaceEnumFromString(EDataType eDataType, String initialValue) {
		IfcReinforcingBarSurfaceEnum result = IfcReinforcingBarSurfaceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcReinforcingBarSurfaceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcResourceConsumptionEnum createIfcResourceConsumptionEnumFromString(EDataType eDataType, String initialValue) {
		IfcResourceConsumptionEnum result = IfcResourceConsumptionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcResourceConsumptionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRibPlateDirectionEnum createIfcRibPlateDirectionEnumFromString(EDataType eDataType, String initialValue) {
		IfcRibPlateDirectionEnum result = IfcRibPlateDirectionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRibPlateDirectionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoleEnum createIfcRoleEnumFromString(EDataType eDataType, String initialValue) {
		IfcRoleEnum result = IfcRoleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRoleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoofTypeEnum createIfcRoofTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcRoofTypeEnum result = IfcRoofTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRoofTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSanitaryTerminalTypeEnum createIfcSanitaryTerminalTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcSanitaryTerminalTypeEnum result = IfcSanitaryTerminalTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSanitaryTerminalTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionTypeEnum createIfcSectionTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcSectionTypeEnum result = IfcSectionTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSectionTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSensorTypeEnum createIfcSensorTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcSensorTypeEnum result = IfcSensorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSensorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSequenceEnum createIfcSequenceEnumFromString(EDataType eDataType, String initialValue) {
		IfcSequenceEnum result = IfcSequenceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSequenceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeFactorTypeEnum createIfcServiceLifeFactorTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcServiceLifeFactorTypeEnum result = IfcServiceLifeFactorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcServiceLifeFactorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeTypeEnum createIfcServiceLifeTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcServiceLifeTypeEnum result = IfcServiceLifeTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcServiceLifeTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSIPrefix createIfcSIPrefixFromString(EDataType eDataType, String initialValue) {
		IfcSIPrefix result = IfcSIPrefix.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSIPrefixToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSIUnitName createIfcSIUnitNameFromString(EDataType eDataType, String initialValue) {
		IfcSIUnitName result = IfcSIUnitName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSIUnitNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSlabTypeEnum createIfcSlabTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcSlabTypeEnum result = IfcSlabTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSlabTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundScaleEnum createIfcSoundScaleEnumFromString(EDataType eDataType, String initialValue) {
		IfcSoundScaleEnum result = IfcSoundScaleEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSoundScaleEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceHeaterTypeEnum createIfcSpaceHeaterTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcSpaceHeaterTypeEnum result = IfcSpaceHeaterTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpaceHeaterTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceTypeEnum createIfcSpaceTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcSpaceTypeEnum result = IfcSpaceTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpaceTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStackTerminalTypeEnum createIfcStackTerminalTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcStackTerminalTypeEnum result = IfcStackTerminalTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStackTerminalTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairFlightTypeEnum createIfcStairFlightTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcStairFlightTypeEnum result = IfcStairFlightTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStairFlightTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairTypeEnum createIfcStairTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcStairTypeEnum result = IfcStairTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStairTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStateEnum createIfcStateEnumFromString(EDataType eDataType, String initialValue) {
		IfcStateEnum result = IfcStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralCurveTypeEnum createIfcStructuralCurveTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcStructuralCurveTypeEnum result = IfcStructuralCurveTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStructuralCurveTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSurfaceTypeEnum createIfcStructuralSurfaceTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcStructuralSurfaceTypeEnum result = IfcStructuralSurfaceTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStructuralSurfaceTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceSide createIfcSurfaceSideFromString(EDataType eDataType, String initialValue) {
		IfcSurfaceSide result = IfcSurfaceSide.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSurfaceSideToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceTextureEnum createIfcSurfaceTextureEnumFromString(EDataType eDataType, String initialValue) {
		IfcSurfaceTextureEnum result = IfcSurfaceTextureEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSurfaceTextureEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSwitchingDeviceTypeEnum createIfcSwitchingDeviceTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcSwitchingDeviceTypeEnum result = IfcSwitchingDeviceTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSwitchingDeviceTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTankTypeEnum createIfcTankTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcTankTypeEnum result = IfcTankTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTankTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendonTypeEnum createIfcTendonTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcTendonTypeEnum result = IfcTendonTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTendonTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextPath createIfcTextPathFromString(EDataType eDataType, String initialValue) {
		IfcTextPath result = IfcTextPath.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTextPathToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadSourceEnum createIfcThermalLoadSourceEnumFromString(EDataType eDataType, String initialValue) {
		IfcThermalLoadSourceEnum result = IfcThermalLoadSourceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalLoadSourceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadTypeEnum createIfcThermalLoadTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcThermalLoadTypeEnum result = IfcThermalLoadTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalLoadTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesDataTypeEnum createIfcTimeSeriesDataTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcTimeSeriesDataTypeEnum result = IfcTimeSeriesDataTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTimeSeriesDataTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesScheduleTypeEnum createIfcTimeSeriesScheduleTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcTimeSeriesScheduleTypeEnum result = IfcTimeSeriesScheduleTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTimeSeriesScheduleTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransformerTypeEnum createIfcTransformerTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcTransformerTypeEnum result = IfcTransformerTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTransformerTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransitionCode createIfcTransitionCodeFromString(EDataType eDataType, String initialValue) {
		IfcTransitionCode result = IfcTransitionCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTransitionCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransportElementTypeEnum createIfcTransportElementTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcTransportElementTypeEnum result = IfcTransportElementTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTransportElementTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTrimmingPreference createIfcTrimmingPreferenceFromString(EDataType eDataType, String initialValue) {
		IfcTrimmingPreference result = IfcTrimmingPreference.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTrimmingPreferenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTubeBundleTypeEnum createIfcTubeBundleTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcTubeBundleTypeEnum result = IfcTubeBundleTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTubeBundleTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitaryEquipmentTypeEnum createIfcUnitaryEquipmentTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcUnitaryEquipmentTypeEnum result = IfcUnitaryEquipmentTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcUnitaryEquipmentTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitEnum createIfcUnitEnumFromString(EDataType eDataType, String initialValue) {
		IfcUnitEnum result = IfcUnitEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcUnitEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValveTypeEnum createIfcValveTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcValveTypeEnum result = IfcValveTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcValveTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVibrationIsolatorTypeEnum createIfcVibrationIsolatorTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcVibrationIsolatorTypeEnum result = IfcVibrationIsolatorTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcVibrationIsolatorTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWallTypeEnum createIfcWallTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcWallTypeEnum result = IfcWallTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWallTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWasteTerminalTypeEnum createIfcWasteTerminalTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcWasteTerminalTypeEnum result = IfcWasteTerminalTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWasteTerminalTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelOperationEnum createIfcWindowPanelOperationEnumFromString(EDataType eDataType, String initialValue) {
		IfcWindowPanelOperationEnum result = IfcWindowPanelOperationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWindowPanelOperationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelPositionEnum createIfcWindowPanelPositionEnumFromString(EDataType eDataType, String initialValue) {
		IfcWindowPanelPositionEnum result = IfcWindowPanelPositionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWindowPanelPositionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleConstructionEnum createIfcWindowStyleConstructionEnumFromString(EDataType eDataType, String initialValue) {
		IfcWindowStyleConstructionEnum result = IfcWindowStyleConstructionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWindowStyleConstructionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleOperationEnum createIfcWindowStyleOperationEnumFromString(EDataType eDataType, String initialValue) {
		IfcWindowStyleOperationEnum result = IfcWindowStyleOperationEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWindowStyleOperationEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWorkControlTypeEnum createIfcWorkControlTypeEnumFromString(EDataType eDataType, String initialValue) {
		IfcWorkControlTypeEnum result = IfcWorkControlTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWorkControlTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAbsorbedDoseMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAbsorbedDoseMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAbsorbedDoseMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAbsorbedDoseMeasureFromString(FinalPackage.eINSTANCE.getIfcAbsorbedDoseMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAbsorbedDoseMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAbsorbedDoseMeasureToString(FinalPackage.eINSTANCE.getIfcAbsorbedDoseMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAccelerationMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAccelerationMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAccelerationMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAccelerationMeasureFromString(FinalPackage.eINSTANCE.getIfcAccelerationMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAccelerationMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAccelerationMeasureToString(FinalPackage.eINSTANCE.getIfcAccelerationMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionSourceTypeEnum createIfcActionSourceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcActionSourceTypeEnumFromString(FinalPackage.eINSTANCE.getIfcActionSourceTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcActionSourceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcActionSourceTypeEnumToString(FinalPackage.eINSTANCE.getIfcActionSourceTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActionTypeEnum createIfcActionTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcActionTypeEnumFromString(FinalPackage.eINSTANCE.getIfcActionTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcActionTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcActionTypeEnumToString(FinalPackage.eINSTANCE.getIfcActionTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActuatorTypeEnum createIfcActuatorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcActuatorTypeEnumFromString(FinalPackage.eINSTANCE.getIfcActuatorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcActuatorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcActuatorTypeEnumToString(FinalPackage.eINSTANCE.getIfcActuatorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAddressTypeEnum createIfcAddressTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAddressTypeEnumFromString(FinalPackage.eINSTANCE.getIfcAddressTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAddressTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAddressTypeEnumToString(FinalPackage.eINSTANCE.getIfcAddressTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAheadOrBehind createIfcAheadOrBehindObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAheadOrBehindFromString(FinalPackage.eINSTANCE.getIfcAheadOrBehind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAheadOrBehindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAheadOrBehindToString(FinalPackage.eINSTANCE.getIfcAheadOrBehind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirTerminalBoxTypeEnum createIfcAirTerminalBoxTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAirTerminalBoxTypeEnumFromString(FinalPackage.eINSTANCE.getIfcAirTerminalBoxTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAirTerminalBoxTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAirTerminalBoxTypeEnumToString(FinalPackage.eINSTANCE.getIfcAirTerminalBoxTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirTerminalTypeEnum createIfcAirTerminalTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAirTerminalTypeEnumFromString(FinalPackage.eINSTANCE.getIfcAirTerminalTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAirTerminalTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAirTerminalTypeEnumToString(FinalPackage.eINSTANCE.getIfcAirTerminalTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAirToAirHeatRecoveryTypeEnum createIfcAirToAirHeatRecoveryTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAirToAirHeatRecoveryTypeEnumFromString(FinalPackage.eINSTANCE.getIfcAirToAirHeatRecoveryTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAirToAirHeatRecoveryTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAirToAirHeatRecoveryTypeEnumToString(FinalPackage.eINSTANCE.getIfcAirToAirHeatRecoveryTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAlarmTypeEnum createIfcAlarmTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAlarmTypeEnumFromString(FinalPackage.eINSTANCE.getIfcAlarmTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAlarmTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAlarmTypeEnumToString(FinalPackage.eINSTANCE.getIfcAlarmTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAmountOfSubstanceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAmountOfSubstanceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAmountOfSubstanceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAmountOfSubstanceMeasureFromString(FinalPackage.eINSTANCE.getIfcAmountOfSubstanceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAmountOfSubstanceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAmountOfSubstanceMeasureToString(FinalPackage.eINSTANCE.getIfcAmountOfSubstanceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisModelTypeEnum createIfcAnalysisModelTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAnalysisModelTypeEnumFromString(FinalPackage.eINSTANCE.getIfcAnalysisModelTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAnalysisModelTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAnalysisModelTypeEnumToString(FinalPackage.eINSTANCE.getIfcAnalysisModelTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAnalysisTheoryTypeEnum createIfcAnalysisTheoryTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAnalysisTheoryTypeEnumFromString(FinalPackage.eINSTANCE.getIfcAnalysisTheoryTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAnalysisTheoryTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAnalysisTheoryTypeEnumToString(FinalPackage.eINSTANCE.getIfcAnalysisTheoryTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAngularVelocityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAngularVelocityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAngularVelocityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAngularVelocityMeasureFromString(FinalPackage.eINSTANCE.getIfcAngularVelocityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAngularVelocityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAngularVelocityMeasureToString(FinalPackage.eINSTANCE.getIfcAngularVelocityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAreaMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAreaMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcAreaMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAreaMeasureFromString(FinalPackage.eINSTANCE.getIfcAreaMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAreaMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAreaMeasureToString(FinalPackage.eINSTANCE.getIfcAreaMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcArithmeticOperatorEnum createIfcArithmeticOperatorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcArithmeticOperatorEnumFromString(FinalPackage.eINSTANCE.getIfcArithmeticOperatorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcArithmeticOperatorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcArithmeticOperatorEnumToString(FinalPackage.eINSTANCE.getIfcArithmeticOperatorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAssemblyPlaceEnum createIfcAssemblyPlaceEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcAssemblyPlaceEnumFromString(FinalPackage.eINSTANCE.getIfcAssemblyPlaceEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcAssemblyPlaceEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcAssemblyPlaceEnumToString(FinalPackage.eINSTANCE.getIfcAssemblyPlaceEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBeamTypeEnum createIfcBeamTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcBeamTypeEnumFromString(FinalPackage.eINSTANCE.getIfcBeamTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBeamTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcBeamTypeEnumToString(FinalPackage.eINSTANCE.getIfcBeamTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBenchmarkEnum createIfcBenchmarkEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcBenchmarkEnumFromString(FinalPackage.eINSTANCE.getIfcBenchmarkEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBenchmarkEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcBenchmarkEnumToString(FinalPackage.eINSTANCE.getIfcBenchmarkEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoilerTypeEnum createIfcBoilerTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcBoilerTypeEnumFromString(FinalPackage.eINSTANCE.getIfcBoilerTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBoilerTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcBoilerTypeEnumToString(FinalPackage.eINSTANCE.getIfcBoilerTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createIfcBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBooleanToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createIfcBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcBooleanFromString(FinalPackage.eINSTANCE.getIfcBoolean(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcBooleanToString(FinalPackage.eINSTANCE.getIfcBoolean(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBooleanOperator createIfcBooleanOperatorObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcBooleanOperatorFromString(FinalPackage.eINSTANCE.getIfcBooleanOperator(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBooleanOperatorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcBooleanOperatorToString(FinalPackage.eINSTANCE.getIfcBooleanOperator(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcBoxAlignmentFromString(EDataType eDataType, String initialValue) {
		return createIfcLabelFromString(FinalPackage.eINSTANCE.getIfcLabel(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBoxAlignmentToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLabelToString(FinalPackage.eINSTANCE.getIfcLabel(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBSplineCurveForm createIfcBSplineCurveFormObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcBSplineCurveFormFromString(FinalPackage.eINSTANCE.getIfcBSplineCurveForm(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBSplineCurveFormObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcBSplineCurveFormToString(FinalPackage.eINSTANCE.getIfcBSplineCurveForm(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBuildingElementProxyTypeEnum createIfcBuildingElementProxyTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcBuildingElementProxyTypeEnumFromString(FinalPackage.eINSTANCE.getIfcBuildingElementProxyTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcBuildingElementProxyTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcBuildingElementProxyTypeEnumToString(FinalPackage.eINSTANCE.getIfcBuildingElementProxyTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableCarrierFittingTypeEnum createIfcCableCarrierFittingTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCableCarrierFittingTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCableCarrierFittingTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCableCarrierFittingTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCableCarrierFittingTypeEnumToString(FinalPackage.eINSTANCE.getIfcCableCarrierFittingTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableCarrierSegmentTypeEnum createIfcCableCarrierSegmentTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCableCarrierSegmentTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCableCarrierSegmentTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCableCarrierSegmentTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCableCarrierSegmentTypeEnumToString(FinalPackage.eINSTANCE.getIfcCableCarrierSegmentTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCableSegmentTypeEnum createIfcCableSegmentTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCableSegmentTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCableSegmentTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCableSegmentTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCableSegmentTypeEnumToString(FinalPackage.eINSTANCE.getIfcCableSegmentTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChangeActionEnum createIfcChangeActionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcChangeActionEnumFromString(FinalPackage.eINSTANCE.getIfcChangeActionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcChangeActionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcChangeActionEnumToString(FinalPackage.eINSTANCE.getIfcChangeActionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcChillerTypeEnum createIfcChillerTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcChillerTypeEnumFromString(FinalPackage.eINSTANCE.getIfcChillerTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcChillerTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcChillerTypeEnumToString(FinalPackage.eINSTANCE.getIfcChillerTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoilTypeEnum createIfcCoilTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCoilTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCoilTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCoilTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCoilTypeEnumToString(FinalPackage.eINSTANCE.getIfcCoilTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColumnTypeEnum createIfcColumnTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcColumnTypeEnumFromString(FinalPackage.eINSTANCE.getIfcColumnTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcColumnTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcColumnTypeEnumToString(FinalPackage.eINSTANCE.getIfcColumnTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCompressorTypeEnum createIfcCompressorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCompressorTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCompressorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCompressorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCompressorTypeEnumToString(FinalPackage.eINSTANCE.getIfcCompressorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCondenserTypeEnum createIfcCondenserTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCondenserTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCondenserTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCondenserTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCondenserTypeEnumToString(FinalPackage.eINSTANCE.getIfcCondenserTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConnectionTypeEnum createIfcConnectionTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcConnectionTypeEnumFromString(FinalPackage.eINSTANCE.getIfcConnectionTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcConnectionTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcConnectionTypeEnumToString(FinalPackage.eINSTANCE.getIfcConnectionTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcConstraintEnum createIfcConstraintEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcConstraintEnumFromString(FinalPackage.eINSTANCE.getIfcConstraintEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcConstraintEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcConstraintEnumToString(FinalPackage.eINSTANCE.getIfcConstraintEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcContextDependentMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcContextDependentMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcContextDependentMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcContextDependentMeasureFromString(FinalPackage.eINSTANCE.getIfcContextDependentMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcContextDependentMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcContextDependentMeasureToString(FinalPackage.eINSTANCE.getIfcContextDependentMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcControllerTypeEnum createIfcControllerTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcControllerTypeEnumFromString(FinalPackage.eINSTANCE.getIfcControllerTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcControllerTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcControllerTypeEnumToString(FinalPackage.eINSTANCE.getIfcControllerTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCooledBeamTypeEnum createIfcCooledBeamTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCooledBeamTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCooledBeamTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCooledBeamTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCooledBeamTypeEnumToString(FinalPackage.eINSTANCE.getIfcCooledBeamTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoolingTowerTypeEnum createIfcCoolingTowerTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCoolingTowerTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCoolingTowerTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCoolingTowerTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCoolingTowerTypeEnumToString(FinalPackage.eINSTANCE.getIfcCoolingTowerTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostScheduleTypeEnum createIfcCostScheduleTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCostScheduleTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCostScheduleTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCostScheduleTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCostScheduleTypeEnumToString(FinalPackage.eINSTANCE.getIfcCostScheduleTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcCountMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCountMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcCountMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCountMeasureFromString(FinalPackage.eINSTANCE.getIfcCountMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCountMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCountMeasureToString(FinalPackage.eINSTANCE.getIfcCountMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoveringTypeEnum createIfcCoveringTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCoveringTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCoveringTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCoveringTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCoveringTypeEnumToString(FinalPackage.eINSTANCE.getIfcCoveringTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurrencyEnum createIfcCurrencyEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCurrencyEnumFromString(FinalPackage.eINSTANCE.getIfcCurrencyEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCurrencyEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCurrencyEnumToString(FinalPackage.eINSTANCE.getIfcCurrencyEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurtainWallTypeEnum createIfcCurtainWallTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCurtainWallTypeEnumFromString(FinalPackage.eINSTANCE.getIfcCurtainWallTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCurtainWallTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCurtainWallTypeEnumToString(FinalPackage.eINSTANCE.getIfcCurtainWallTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcCurvatureMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCurvatureMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcCurvatureMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcCurvatureMeasureFromString(FinalPackage.eINSTANCE.getIfcCurvatureMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcCurvatureMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcCurvatureMeasureToString(FinalPackage.eINSTANCE.getIfcCurvatureMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDamperTypeEnum createIfcDamperTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDamperTypeEnumFromString(FinalPackage.eINSTANCE.getIfcDamperTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDamperTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDamperTypeEnumToString(FinalPackage.eINSTANCE.getIfcDamperTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDataOriginEnum createIfcDataOriginEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDataOriginEnumFromString(FinalPackage.eINSTANCE.getIfcDataOriginEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDataOriginEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDataOriginEnumToString(FinalPackage.eINSTANCE.getIfcDataOriginEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcDayInMonthNumberFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDayInMonthNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcDayInMonthNumberObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDayInMonthNumberFromString(FinalPackage.eINSTANCE.getIfcDayInMonthNumber(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDayInMonthNumberObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDayInMonthNumberToString(FinalPackage.eINSTANCE.getIfcDayInMonthNumber(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcDaylightSavingHourFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDaylightSavingHourToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcDaylightSavingHourObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDaylightSavingHourFromString(FinalPackage.eINSTANCE.getIfcDaylightSavingHour(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDaylightSavingHourObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDaylightSavingHourToString(FinalPackage.eINSTANCE.getIfcDaylightSavingHour(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedUnitEnum createIfcDerivedUnitEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDerivedUnitEnumFromString(FinalPackage.eINSTANCE.getIfcDerivedUnitEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDerivedUnitEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDerivedUnitEnumToString(FinalPackage.eINSTANCE.getIfcDerivedUnitEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcDescriptiveMeasureFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDescriptiveMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcDimensionCountFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDimensionCountToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcDimensionCountObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDimensionCountFromString(FinalPackage.eINSTANCE.getIfcDimensionCount(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDimensionCountObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDimensionCountToString(FinalPackage.eINSTANCE.getIfcDimensionCount(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionExtentUsage createIfcDimensionExtentUsageObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDimensionExtentUsageFromString(FinalPackage.eINSTANCE.getIfcDimensionExtentUsage(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDimensionExtentUsageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDimensionExtentUsageToString(FinalPackage.eINSTANCE.getIfcDimensionExtentUsage(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirectionSenseEnum createIfcDirectionSenseEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDirectionSenseEnumFromString(FinalPackage.eINSTANCE.getIfcDirectionSenseEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDirectionSenseEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDirectionSenseEnumToString(FinalPackage.eINSTANCE.getIfcDirectionSenseEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDistributionChamberElementTypeEnum createIfcDistributionChamberElementTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDistributionChamberElementTypeEnumFromString(FinalPackage.eINSTANCE.getIfcDistributionChamberElementTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDistributionChamberElementTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDistributionChamberElementTypeEnumToString(FinalPackage.eINSTANCE.getIfcDistributionChamberElementTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentConfidentialityEnum createIfcDocumentConfidentialityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDocumentConfidentialityEnumFromString(FinalPackage.eINSTANCE.getIfcDocumentConfidentialityEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDocumentConfidentialityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDocumentConfidentialityEnumToString(FinalPackage.eINSTANCE.getIfcDocumentConfidentialityEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDocumentStatusEnum createIfcDocumentStatusEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDocumentStatusEnumFromString(FinalPackage.eINSTANCE.getIfcDocumentStatusEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDocumentStatusEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDocumentStatusEnumToString(FinalPackage.eINSTANCE.getIfcDocumentStatusEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelOperationEnum createIfcDoorPanelOperationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDoorPanelOperationEnumFromString(FinalPackage.eINSTANCE.getIfcDoorPanelOperationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoorPanelOperationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDoorPanelOperationEnumToString(FinalPackage.eINSTANCE.getIfcDoorPanelOperationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorPanelPositionEnum createIfcDoorPanelPositionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDoorPanelPositionEnumFromString(FinalPackage.eINSTANCE.getIfcDoorPanelPositionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoorPanelPositionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDoorPanelPositionEnumToString(FinalPackage.eINSTANCE.getIfcDoorPanelPositionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleConstructionEnum createIfcDoorStyleConstructionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDoorStyleConstructionEnumFromString(FinalPackage.eINSTANCE.getIfcDoorStyleConstructionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoorStyleConstructionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDoorStyleConstructionEnumToString(FinalPackage.eINSTANCE.getIfcDoorStyleConstructionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleOperationEnum createIfcDoorStyleOperationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDoorStyleOperationEnumFromString(FinalPackage.eINSTANCE.getIfcDoorStyleOperationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoorStyleOperationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDoorStyleOperationEnumToString(FinalPackage.eINSTANCE.getIfcDoorStyleOperationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcDoseEquivalentMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoseEquivalentMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcDoseEquivalentMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDoseEquivalentMeasureFromString(FinalPackage.eINSTANCE.getIfcDoseEquivalentMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDoseEquivalentMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDoseEquivalentMeasureToString(FinalPackage.eINSTANCE.getIfcDoseEquivalentMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctFittingTypeEnum createIfcDuctFittingTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDuctFittingTypeEnumFromString(FinalPackage.eINSTANCE.getIfcDuctFittingTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDuctFittingTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDuctFittingTypeEnumToString(FinalPackage.eINSTANCE.getIfcDuctFittingTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctSegmentTypeEnum createIfcDuctSegmentTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDuctSegmentTypeEnumFromString(FinalPackage.eINSTANCE.getIfcDuctSegmentTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDuctSegmentTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDuctSegmentTypeEnumToString(FinalPackage.eINSTANCE.getIfcDuctSegmentTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDuctSilencerTypeEnum createIfcDuctSilencerTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDuctSilencerTypeEnumFromString(FinalPackage.eINSTANCE.getIfcDuctSilencerTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDuctSilencerTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDuctSilencerTypeEnumToString(FinalPackage.eINSTANCE.getIfcDuctSilencerTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcDynamicViscosityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDynamicViscosityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcDynamicViscosityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcDynamicViscosityMeasureFromString(FinalPackage.eINSTANCE.getIfcDynamicViscosityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcDynamicViscosityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcDynamicViscosityMeasureToString(FinalPackage.eINSTANCE.getIfcDynamicViscosityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricApplianceTypeEnum createIfcElectricApplianceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricApplianceTypeEnumFromString(FinalPackage.eINSTANCE.getIfcElectricApplianceTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricApplianceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricApplianceTypeEnumToString(FinalPackage.eINSTANCE.getIfcElectricApplianceTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricCapacitanceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricCapacitanceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricCapacitanceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricCapacitanceMeasureFromString(FinalPackage.eINSTANCE.getIfcElectricCapacitanceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricCapacitanceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricCapacitanceMeasureToString(FinalPackage.eINSTANCE.getIfcElectricCapacitanceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricChargeMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricChargeMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricChargeMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricChargeMeasureFromString(FinalPackage.eINSTANCE.getIfcElectricChargeMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricChargeMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricChargeMeasureToString(FinalPackage.eINSTANCE.getIfcElectricChargeMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricConductanceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricConductanceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricConductanceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricConductanceMeasureFromString(FinalPackage.eINSTANCE.getIfcElectricConductanceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricConductanceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricConductanceMeasureToString(FinalPackage.eINSTANCE.getIfcElectricConductanceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricCurrentEnum createIfcElectricCurrentEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricCurrentEnumFromString(FinalPackage.eINSTANCE.getIfcElectricCurrentEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricCurrentEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricCurrentEnumToString(FinalPackage.eINSTANCE.getIfcElectricCurrentEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricCurrentMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricCurrentMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricCurrentMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricCurrentMeasureFromString(FinalPackage.eINSTANCE.getIfcElectricCurrentMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricCurrentMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricCurrentMeasureToString(FinalPackage.eINSTANCE.getIfcElectricCurrentMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricDistributionPointFunctionEnum createIfcElectricDistributionPointFunctionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricDistributionPointFunctionEnumFromString(FinalPackage.eINSTANCE.getIfcElectricDistributionPointFunctionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricDistributionPointFunctionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricDistributionPointFunctionEnumToString(FinalPackage.eINSTANCE.getIfcElectricDistributionPointFunctionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricFlowStorageDeviceTypeEnum createIfcElectricFlowStorageDeviceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricFlowStorageDeviceTypeEnumFromString(FinalPackage.eINSTANCE.getIfcElectricFlowStorageDeviceTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricFlowStorageDeviceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricFlowStorageDeviceTypeEnumToString(FinalPackage.eINSTANCE.getIfcElectricFlowStorageDeviceTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricGeneratorTypeEnum createIfcElectricGeneratorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricGeneratorTypeEnumFromString(FinalPackage.eINSTANCE.getIfcElectricGeneratorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricGeneratorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricGeneratorTypeEnumToString(FinalPackage.eINSTANCE.getIfcElectricGeneratorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricHeaterTypeEnum createIfcElectricHeaterTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricHeaterTypeEnumFromString(FinalPackage.eINSTANCE.getIfcElectricHeaterTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricHeaterTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricHeaterTypeEnumToString(FinalPackage.eINSTANCE.getIfcElectricHeaterTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricMotorTypeEnum createIfcElectricMotorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricMotorTypeEnumFromString(FinalPackage.eINSTANCE.getIfcElectricMotorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricMotorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricMotorTypeEnumToString(FinalPackage.eINSTANCE.getIfcElectricMotorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricResistanceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricResistanceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricResistanceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricResistanceMeasureFromString(FinalPackage.eINSTANCE.getIfcElectricResistanceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricResistanceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricResistanceMeasureToString(FinalPackage.eINSTANCE.getIfcElectricResistanceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricTimeControlTypeEnum createIfcElectricTimeControlTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricTimeControlTypeEnumFromString(FinalPackage.eINSTANCE.getIfcElectricTimeControlTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricTimeControlTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricTimeControlTypeEnumToString(FinalPackage.eINSTANCE.getIfcElectricTimeControlTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricVoltageMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricVoltageMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcElectricVoltageMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElectricVoltageMeasureFromString(FinalPackage.eINSTANCE.getIfcElectricVoltageMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElectricVoltageMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElectricVoltageMeasureToString(FinalPackage.eINSTANCE.getIfcElectricVoltageMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementAssemblyTypeEnum createIfcElementAssemblyTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElementAssemblyTypeEnumFromString(FinalPackage.eINSTANCE.getIfcElementAssemblyTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElementAssemblyTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElementAssemblyTypeEnumToString(FinalPackage.eINSTANCE.getIfcElementAssemblyTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementCompositionEnum createIfcElementCompositionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcElementCompositionEnumFromString(FinalPackage.eINSTANCE.getIfcElementCompositionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcElementCompositionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcElementCompositionEnumToString(FinalPackage.eINSTANCE.getIfcElementCompositionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcEnergyMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEnergyMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcEnergyMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcEnergyMeasureFromString(FinalPackage.eINSTANCE.getIfcEnergyMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEnergyMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcEnergyMeasureToString(FinalPackage.eINSTANCE.getIfcEnergyMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnergySequenceEnum createIfcEnergySequenceEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcEnergySequenceEnumFromString(FinalPackage.eINSTANCE.getIfcEnergySequenceEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEnergySequenceEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcEnergySequenceEnumToString(FinalPackage.eINSTANCE.getIfcEnergySequenceEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnvironmentalImpactCategoryEnum createIfcEnvironmentalImpactCategoryEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcEnvironmentalImpactCategoryEnumFromString(FinalPackage.eINSTANCE.getIfcEnvironmentalImpactCategoryEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEnvironmentalImpactCategoryEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcEnvironmentalImpactCategoryEnumToString(FinalPackage.eINSTANCE.getIfcEnvironmentalImpactCategoryEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEvaporativeCoolerTypeEnum createIfcEvaporativeCoolerTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcEvaporativeCoolerTypeEnumFromString(FinalPackage.eINSTANCE.getIfcEvaporativeCoolerTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEvaporativeCoolerTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcEvaporativeCoolerTypeEnumToString(FinalPackage.eINSTANCE.getIfcEvaporativeCoolerTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEvaporatorTypeEnum createIfcEvaporatorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcEvaporatorTypeEnumFromString(FinalPackage.eINSTANCE.getIfcEvaporatorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcEvaporatorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcEvaporatorTypeEnumToString(FinalPackage.eINSTANCE.getIfcEvaporatorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFanTypeEnum createIfcFanTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcFanTypeEnumFromString(FinalPackage.eINSTANCE.getIfcFanTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFanTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcFanTypeEnumToString(FinalPackage.eINSTANCE.getIfcFanTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFilterTypeEnum createIfcFilterTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcFilterTypeEnumFromString(FinalPackage.eINSTANCE.getIfcFilterTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFilterTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcFilterTypeEnumToString(FinalPackage.eINSTANCE.getIfcFilterTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFireSuppressionTerminalTypeEnum createIfcFireSuppressionTerminalTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcFireSuppressionTerminalTypeEnumFromString(FinalPackage.eINSTANCE.getIfcFireSuppressionTerminalTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFireSuppressionTerminalTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcFireSuppressionTerminalTypeEnumToString(FinalPackage.eINSTANCE.getIfcFireSuppressionTerminalTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowDirectionEnum createIfcFlowDirectionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcFlowDirectionEnumFromString(FinalPackage.eINSTANCE.getIfcFlowDirectionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFlowDirectionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcFlowDirectionEnumToString(FinalPackage.eINSTANCE.getIfcFlowDirectionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowInstrumentTypeEnum createIfcFlowInstrumentTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcFlowInstrumentTypeEnumFromString(FinalPackage.eINSTANCE.getIfcFlowInstrumentTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFlowInstrumentTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcFlowInstrumentTypeEnumToString(FinalPackage.eINSTANCE.getIfcFlowInstrumentTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowMeterTypeEnum createIfcFlowMeterTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcFlowMeterTypeEnumFromString(FinalPackage.eINSTANCE.getIfcFlowMeterTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFlowMeterTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcFlowMeterTypeEnumToString(FinalPackage.eINSTANCE.getIfcFlowMeterTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcFontStyleFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFontStyleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcFontVariantFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFontVariantToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcFontWeightFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFontWeightToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFootingTypeEnum createIfcFootingTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcFootingTypeEnumFromString(FinalPackage.eINSTANCE.getIfcFootingTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFootingTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcFootingTypeEnumToString(FinalPackage.eINSTANCE.getIfcFootingTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcForceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcForceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcForceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcForceMeasureFromString(FinalPackage.eINSTANCE.getIfcForceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcForceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcForceMeasureToString(FinalPackage.eINSTANCE.getIfcForceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcFrequencyMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFrequencyMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcFrequencyMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcFrequencyMeasureFromString(FinalPackage.eINSTANCE.getIfcFrequencyMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcFrequencyMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcFrequencyMeasureToString(FinalPackage.eINSTANCE.getIfcFrequencyMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGasTerminalTypeEnum createIfcGasTerminalTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcGasTerminalTypeEnumFromString(FinalPackage.eINSTANCE.getIfcGasTerminalTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcGasTerminalTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcGasTerminalTypeEnumToString(FinalPackage.eINSTANCE.getIfcGasTerminalTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGeometricProjectionEnum createIfcGeometricProjectionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcGeometricProjectionEnumFromString(FinalPackage.eINSTANCE.getIfcGeometricProjectionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcGeometricProjectionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcGeometricProjectionEnumToString(FinalPackage.eINSTANCE.getIfcGeometricProjectionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcGloballyUniqueIdFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcGloballyUniqueIdToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcGlobalOrLocalEnum createIfcGlobalOrLocalEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcGlobalOrLocalEnumFromString(FinalPackage.eINSTANCE.getIfcGlobalOrLocalEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcGlobalOrLocalEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcGlobalOrLocalEnumToString(FinalPackage.eINSTANCE.getIfcGlobalOrLocalEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHeatExchangerTypeEnum createIfcHeatExchangerTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcHeatExchangerTypeEnumFromString(FinalPackage.eINSTANCE.getIfcHeatExchangerTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHeatExchangerTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcHeatExchangerTypeEnumToString(FinalPackage.eINSTANCE.getIfcHeatExchangerTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcHeatFluxDensityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHeatFluxDensityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcHeatFluxDensityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcHeatFluxDensityMeasureFromString(FinalPackage.eINSTANCE.getIfcHeatFluxDensityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHeatFluxDensityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcHeatFluxDensityMeasureToString(FinalPackage.eINSTANCE.getIfcHeatFluxDensityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcHeatingValueMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHeatingValueMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcHeatingValueMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcHeatingValueMeasureFromString(FinalPackage.eINSTANCE.getIfcHeatingValueMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHeatingValueMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcHeatingValueMeasureToString(FinalPackage.eINSTANCE.getIfcHeatingValueMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcHourInDayFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHourInDayToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcHourInDayObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcHourInDayFromString(FinalPackage.eINSTANCE.getIfcHourInDay(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHourInDayObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcHourInDayToString(FinalPackage.eINSTANCE.getIfcHourInDay(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHumidifierTypeEnum createIfcHumidifierTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcHumidifierTypeEnumFromString(FinalPackage.eINSTANCE.getIfcHumidifierTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcHumidifierTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcHumidifierTypeEnumToString(FinalPackage.eINSTANCE.getIfcHumidifierTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIdentifierToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcIlluminanceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIlluminanceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcIlluminanceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcIlluminanceMeasureFromString(FinalPackage.eINSTANCE.getIfcIlluminanceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIlluminanceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcIlluminanceMeasureToString(FinalPackage.eINSTANCE.getIfcIlluminanceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcInductanceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcInductanceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcInductanceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcInductanceMeasureFromString(FinalPackage.eINSTANCE.getIfcInductanceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcInductanceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcInductanceMeasureToString(FinalPackage.eINSTANCE.getIfcInductanceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcIntegerFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcIntegerCountRateMeasureFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIntegerCountRateMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcIntegerCountRateMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcIntegerCountRateMeasureFromString(FinalPackage.eINSTANCE.getIfcIntegerCountRateMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIntegerCountRateMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcIntegerCountRateMeasureToString(FinalPackage.eINSTANCE.getIfcIntegerCountRateMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcIntegerFromString(FinalPackage.eINSTANCE.getIfcInteger(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcIntegerToString(FinalPackage.eINSTANCE.getIfcInteger(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInternalOrExternalEnum createIfcInternalOrExternalEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcInternalOrExternalEnumFromString(FinalPackage.eINSTANCE.getIfcInternalOrExternalEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcInternalOrExternalEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcInternalOrExternalEnumToString(FinalPackage.eINSTANCE.getIfcInternalOrExternalEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInventoryTypeEnum createIfcInventoryTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcInventoryTypeEnumFromString(FinalPackage.eINSTANCE.getIfcInventoryTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcInventoryTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcInventoryTypeEnumToString(FinalPackage.eINSTANCE.getIfcInventoryTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcIonConcentrationMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIonConcentrationMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcIonConcentrationMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcIonConcentrationMeasureFromString(FinalPackage.eINSTANCE.getIfcIonConcentrationMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIonConcentrationMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcIonConcentrationMeasureToString(FinalPackage.eINSTANCE.getIfcIonConcentrationMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcIsothermalMoistureCapacityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIsothermalMoistureCapacityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcIsothermalMoistureCapacityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcIsothermalMoistureCapacityMeasureFromString(FinalPackage.eINSTANCE.getIfcIsothermalMoistureCapacityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcIsothermalMoistureCapacityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcIsothermalMoistureCapacityMeasureToString(FinalPackage.eINSTANCE.getIfcIsothermalMoistureCapacityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcJunctionBoxTypeEnum createIfcJunctionBoxTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcJunctionBoxTypeEnumFromString(FinalPackage.eINSTANCE.getIfcJunctionBoxTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcJunctionBoxTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcJunctionBoxTypeEnumToString(FinalPackage.eINSTANCE.getIfcJunctionBoxTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcKinematicViscosityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcKinematicViscosityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcKinematicViscosityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcKinematicViscosityMeasureFromString(FinalPackage.eINSTANCE.getIfcKinematicViscosityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcKinematicViscosityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcKinematicViscosityMeasureToString(FinalPackage.eINSTANCE.getIfcKinematicViscosityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcLabelFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLabelToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLampTypeEnum createIfcLampTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLampTypeEnumFromString(FinalPackage.eINSTANCE.getIfcLampTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLampTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLampTypeEnumToString(FinalPackage.eINSTANCE.getIfcLampTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLayerSetDirectionEnum createIfcLayerSetDirectionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLayerSetDirectionEnumFromString(FinalPackage.eINSTANCE.getIfcLayerSetDirectionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLayerSetDirectionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLayerSetDirectionEnumToString(FinalPackage.eINSTANCE.getIfcLayerSetDirectionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLengthMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLengthMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLengthMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLengthMeasureFromString(FinalPackage.eINSTANCE.getIfcLengthMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLengthMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLengthMeasureToString(FinalPackage.eINSTANCE.getIfcLengthMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionCurveEnum createIfcLightDistributionCurveEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLightDistributionCurveEnumFromString(FinalPackage.eINSTANCE.getIfcLightDistributionCurveEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLightDistributionCurveEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLightDistributionCurveEnumToString(FinalPackage.eINSTANCE.getIfcLightDistributionCurveEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightEmissionSourceEnum createIfcLightEmissionSourceEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLightEmissionSourceEnumFromString(FinalPackage.eINSTANCE.getIfcLightEmissionSourceEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLightEmissionSourceEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLightEmissionSourceEnumToString(FinalPackage.eINSTANCE.getIfcLightEmissionSourceEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightFixtureTypeEnum createIfcLightFixtureTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLightFixtureTypeEnumFromString(FinalPackage.eINSTANCE.getIfcLightFixtureTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLightFixtureTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLightFixtureTypeEnumToString(FinalPackage.eINSTANCE.getIfcLightFixtureTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLinearForceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLinearForceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLinearForceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLinearForceMeasureFromString(FinalPackage.eINSTANCE.getIfcLinearForceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLinearForceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLinearForceMeasureToString(FinalPackage.eINSTANCE.getIfcLinearForceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLinearMomentMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLinearMomentMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLinearMomentMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLinearMomentMeasureFromString(FinalPackage.eINSTANCE.getIfcLinearMomentMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLinearMomentMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLinearMomentMeasureToString(FinalPackage.eINSTANCE.getIfcLinearMomentMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLinearStiffnessMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLinearStiffnessMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLinearStiffnessMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLinearStiffnessMeasureFromString(FinalPackage.eINSTANCE.getIfcLinearStiffnessMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLinearStiffnessMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLinearStiffnessMeasureToString(FinalPackage.eINSTANCE.getIfcLinearStiffnessMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLinearVelocityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLinearVelocityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLinearVelocityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLinearVelocityMeasureFromString(FinalPackage.eINSTANCE.getIfcLinearVelocityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLinearVelocityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLinearVelocityMeasureToString(FinalPackage.eINSTANCE.getIfcLinearVelocityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLoadGroupTypeEnum createIfcLoadGroupTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLoadGroupTypeEnumFromString(FinalPackage.eINSTANCE.getIfcLoadGroupTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLoadGroupTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLoadGroupTypeEnumToString(FinalPackage.eINSTANCE.getIfcLoadGroupTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical createIfcLogicalFromString(EDataType eDataType, String initialValue) {
		return (Logical)CommonFactory.eINSTANCE.createFromString(CommonPackage.Literals.LOGICAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLogicalToString(EDataType eDataType, Object instanceValue) {
		return CommonFactory.eINSTANCE.convertToString(CommonPackage.Literals.LOGICAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLogicalOperatorEnum createIfcLogicalOperatorEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLogicalOperatorEnumFromString(FinalPackage.eINSTANCE.getIfcLogicalOperatorEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLogicalOperatorEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLogicalOperatorEnumToString(FinalPackage.eINSTANCE.getIfcLogicalOperatorEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLuminousFluxMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLuminousFluxMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLuminousFluxMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLuminousFluxMeasureFromString(FinalPackage.eINSTANCE.getIfcLuminousFluxMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLuminousFluxMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLuminousFluxMeasureToString(FinalPackage.eINSTANCE.getIfcLuminousFluxMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLuminousIntensityDistributionMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLuminousIntensityDistributionMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLuminousIntensityDistributionMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLuminousIntensityDistributionMeasureFromString(FinalPackage.eINSTANCE.getIfcLuminousIntensityDistributionMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLuminousIntensityDistributionMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLuminousIntensityDistributionMeasureToString(FinalPackage.eINSTANCE.getIfcLuminousIntensityDistributionMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLuminousIntensityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLuminousIntensityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcLuminousIntensityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcLuminousIntensityMeasureFromString(FinalPackage.eINSTANCE.getIfcLuminousIntensityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcLuminousIntensityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLuminousIntensityMeasureToString(FinalPackage.eINSTANCE.getIfcLuminousIntensityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMagneticFluxDensityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMagneticFluxDensityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMagneticFluxDensityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMagneticFluxDensityMeasureFromString(FinalPackage.eINSTANCE.getIfcMagneticFluxDensityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMagneticFluxDensityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMagneticFluxDensityMeasureToString(FinalPackage.eINSTANCE.getIfcMagneticFluxDensityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMagneticFluxMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMagneticFluxMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMagneticFluxMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMagneticFluxMeasureFromString(FinalPackage.eINSTANCE.getIfcMagneticFluxMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMagneticFluxMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMagneticFluxMeasureToString(FinalPackage.eINSTANCE.getIfcMagneticFluxMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMassDensityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMassDensityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMassDensityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMassDensityMeasureFromString(FinalPackage.eINSTANCE.getIfcMassDensityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMassDensityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMassDensityMeasureToString(FinalPackage.eINSTANCE.getIfcMassDensityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMassFlowRateMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMassFlowRateMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMassFlowRateMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMassFlowRateMeasureFromString(FinalPackage.eINSTANCE.getIfcMassFlowRateMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMassFlowRateMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMassFlowRateMeasureToString(FinalPackage.eINSTANCE.getIfcMassFlowRateMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMassMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMassMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMassMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMassMeasureFromString(FinalPackage.eINSTANCE.getIfcMassMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMassMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMassMeasureToString(FinalPackage.eINSTANCE.getIfcMassMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMassPerLengthMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMassPerLengthMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMassPerLengthMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMassPerLengthMeasureFromString(FinalPackage.eINSTANCE.getIfcMassPerLengthMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMassPerLengthMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMassPerLengthMeasureToString(FinalPackage.eINSTANCE.getIfcMassPerLengthMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMemberTypeEnum createIfcMemberTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMemberTypeEnumFromString(FinalPackage.eINSTANCE.getIfcMemberTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMemberTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMemberTypeEnumToString(FinalPackage.eINSTANCE.getIfcMemberTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcMinuteInHourFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMinuteInHourToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcMinuteInHourObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMinuteInHourFromString(FinalPackage.eINSTANCE.getIfcMinuteInHour(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMinuteInHourObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMinuteInHourToString(FinalPackage.eINSTANCE.getIfcMinuteInHour(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcModulusOfElasticityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcModulusOfElasticityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcModulusOfElasticityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcModulusOfElasticityMeasureFromString(FinalPackage.eINSTANCE.getIfcModulusOfElasticityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcModulusOfElasticityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcModulusOfElasticityMeasureToString(FinalPackage.eINSTANCE.getIfcModulusOfElasticityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcModulusOfLinearSubgradeReactionMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcModulusOfLinearSubgradeReactionMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcModulusOfLinearSubgradeReactionMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcModulusOfLinearSubgradeReactionMeasureFromString(FinalPackage.eINSTANCE.getIfcModulusOfLinearSubgradeReactionMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcModulusOfLinearSubgradeReactionMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcModulusOfLinearSubgradeReactionMeasureToString(FinalPackage.eINSTANCE.getIfcModulusOfLinearSubgradeReactionMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcModulusOfRotationalSubgradeReactionMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcModulusOfRotationalSubgradeReactionMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcModulusOfRotationalSubgradeReactionMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcModulusOfRotationalSubgradeReactionMeasureFromString(FinalPackage.eINSTANCE.getIfcModulusOfRotationalSubgradeReactionMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcModulusOfRotationalSubgradeReactionMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcModulusOfRotationalSubgradeReactionMeasureToString(FinalPackage.eINSTANCE.getIfcModulusOfRotationalSubgradeReactionMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcModulusOfSubgradeReactionMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcModulusOfSubgradeReactionMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcModulusOfSubgradeReactionMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcModulusOfSubgradeReactionMeasureFromString(FinalPackage.eINSTANCE.getIfcModulusOfSubgradeReactionMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcModulusOfSubgradeReactionMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcModulusOfSubgradeReactionMeasureToString(FinalPackage.eINSTANCE.getIfcModulusOfSubgradeReactionMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMoistureDiffusivityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMoistureDiffusivityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMoistureDiffusivityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMoistureDiffusivityMeasureFromString(FinalPackage.eINSTANCE.getIfcMoistureDiffusivityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMoistureDiffusivityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMoistureDiffusivityMeasureToString(FinalPackage.eINSTANCE.getIfcMoistureDiffusivityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMolecularWeightMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMolecularWeightMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMolecularWeightMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMolecularWeightMeasureFromString(FinalPackage.eINSTANCE.getIfcMolecularWeightMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMolecularWeightMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMolecularWeightMeasureToString(FinalPackage.eINSTANCE.getIfcMolecularWeightMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMomentOfInertiaMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMomentOfInertiaMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMomentOfInertiaMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMomentOfInertiaMeasureFromString(FinalPackage.eINSTANCE.getIfcMomentOfInertiaMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMomentOfInertiaMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMomentOfInertiaMeasureToString(FinalPackage.eINSTANCE.getIfcMomentOfInertiaMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMonetaryMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMonetaryMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcMonetaryMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMonetaryMeasureFromString(FinalPackage.eINSTANCE.getIfcMonetaryMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMonetaryMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMonetaryMeasureToString(FinalPackage.eINSTANCE.getIfcMonetaryMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcMonthInYearNumberFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMonthInYearNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcMonthInYearNumberObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMonthInYearNumberFromString(FinalPackage.eINSTANCE.getIfcMonthInYearNumber(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMonthInYearNumberObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMonthInYearNumberToString(FinalPackage.eINSTANCE.getIfcMonthInYearNumber(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMotorConnectionTypeEnum createIfcMotorConnectionTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcMotorConnectionTypeEnumFromString(FinalPackage.eINSTANCE.getIfcMotorConnectionTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcMotorConnectionTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcMotorConnectionTypeEnumToString(FinalPackage.eINSTANCE.getIfcMotorConnectionTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcNormalisedRatioMeasureFromString(EDataType eDataType, String initialValue) {
		return createIfcRatioMeasureFromString(FinalPackage.eINSTANCE.getIfcRatioMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcNormalisedRatioMeasureToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRatioMeasureToString(FinalPackage.eINSTANCE.getIfcRatioMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcNormalisedRatioMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcNormalisedRatioMeasureFromString(FinalPackage.eINSTANCE.getIfcNormalisedRatioMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcNormalisedRatioMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcNormalisedRatioMeasureToString(FinalPackage.eINSTANCE.getIfcNormalisedRatioMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcNullStyle createIfcNullStyleObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcNullStyleFromString(FinalPackage.eINSTANCE.getIfcNullStyle(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcNullStyleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcNullStyleToString(FinalPackage.eINSTANCE.getIfcNullStyle(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcNumericMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcNumericMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcNumericMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcNumericMeasureFromString(FinalPackage.eINSTANCE.getIfcNumericMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcNumericMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcNumericMeasureToString(FinalPackage.eINSTANCE.getIfcNumericMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectiveEnum createIfcObjectiveEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcObjectiveEnumFromString(FinalPackage.eINSTANCE.getIfcObjectiveEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcObjectiveEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcObjectiveEnumToString(FinalPackage.eINSTANCE.getIfcObjectiveEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectTypeEnum createIfcObjectTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcObjectTypeEnumFromString(FinalPackage.eINSTANCE.getIfcObjectTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcObjectTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcObjectTypeEnumToString(FinalPackage.eINSTANCE.getIfcObjectTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOccupantTypeEnum createIfcOccupantTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcOccupantTypeEnumFromString(FinalPackage.eINSTANCE.getIfcOccupantTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcOccupantTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcOccupantTypeEnumToString(FinalPackage.eINSTANCE.getIfcOccupantTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOutletTypeEnum createIfcOutletTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcOutletTypeEnumFromString(FinalPackage.eINSTANCE.getIfcOutletTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcOutletTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcOutletTypeEnumToString(FinalPackage.eINSTANCE.getIfcOutletTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcParameterValueFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcParameterValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcParameterValueObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcParameterValueFromString(FinalPackage.eINSTANCE.getIfcParameterValue(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcParameterValueObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcParameterValueToString(FinalPackage.eINSTANCE.getIfcParameterValue(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPermeableCoveringOperationEnum createIfcPermeableCoveringOperationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPermeableCoveringOperationEnumFromString(FinalPackage.eINSTANCE.getIfcPermeableCoveringOperationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPermeableCoveringOperationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPermeableCoveringOperationEnumToString(FinalPackage.eINSTANCE.getIfcPermeableCoveringOperationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPHMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPHMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPHMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPHMeasureFromString(FinalPackage.eINSTANCE.getIfcPHMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPHMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPHMeasureToString(FinalPackage.eINSTANCE.getIfcPHMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPhysicalOrVirtualEnum createIfcPhysicalOrVirtualEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPhysicalOrVirtualEnumFromString(FinalPackage.eINSTANCE.getIfcPhysicalOrVirtualEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPhysicalOrVirtualEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPhysicalOrVirtualEnumToString(FinalPackage.eINSTANCE.getIfcPhysicalOrVirtualEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPileConstructionEnum createIfcPileConstructionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPileConstructionEnumFromString(FinalPackage.eINSTANCE.getIfcPileConstructionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPileConstructionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPileConstructionEnumToString(FinalPackage.eINSTANCE.getIfcPileConstructionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPileTypeEnum createIfcPileTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPileTypeEnumFromString(FinalPackage.eINSTANCE.getIfcPileTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPileTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPileTypeEnumToString(FinalPackage.eINSTANCE.getIfcPileTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPipeFittingTypeEnum createIfcPipeFittingTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPipeFittingTypeEnumFromString(FinalPackage.eINSTANCE.getIfcPipeFittingTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPipeFittingTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPipeFittingTypeEnumToString(FinalPackage.eINSTANCE.getIfcPipeFittingTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPipeSegmentTypeEnum createIfcPipeSegmentTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPipeSegmentTypeEnumFromString(FinalPackage.eINSTANCE.getIfcPipeSegmentTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPipeSegmentTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPipeSegmentTypeEnumToString(FinalPackage.eINSTANCE.getIfcPipeSegmentTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPlanarForceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPlanarForceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPlanarForceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPlanarForceMeasureFromString(FinalPackage.eINSTANCE.getIfcPlanarForceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPlanarForceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPlanarForceMeasureToString(FinalPackage.eINSTANCE.getIfcPlanarForceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPlaneAngleMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPlaneAngleMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPlaneAngleMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPlaneAngleMeasureFromString(FinalPackage.eINSTANCE.getIfcPlaneAngleMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPlaneAngleMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPlaneAngleMeasureToString(FinalPackage.eINSTANCE.getIfcPlaneAngleMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlateTypeEnum createIfcPlateTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPlateTypeEnumFromString(FinalPackage.eINSTANCE.getIfcPlateTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPlateTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPlateTypeEnumToString(FinalPackage.eINSTANCE.getIfcPlateTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPositiveLengthMeasureFromString(EDataType eDataType, String initialValue) {
		return createIfcLengthMeasureFromString(FinalPackage.eINSTANCE.getIfcLengthMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPositiveLengthMeasureToString(EDataType eDataType, Object instanceValue) {
		return convertIfcLengthMeasureToString(FinalPackage.eINSTANCE.getIfcLengthMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPositiveLengthMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPositiveLengthMeasureFromString(FinalPackage.eINSTANCE.getIfcPositiveLengthMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPositiveLengthMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPositiveLengthMeasureToString(FinalPackage.eINSTANCE.getIfcPositiveLengthMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPositivePlaneAngleMeasureFromString(EDataType eDataType, String initialValue) {
		return createIfcPlaneAngleMeasureFromString(FinalPackage.eINSTANCE.getIfcPlaneAngleMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPositivePlaneAngleMeasureToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPlaneAngleMeasureToString(FinalPackage.eINSTANCE.getIfcPlaneAngleMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPositivePlaneAngleMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPositivePlaneAngleMeasureFromString(FinalPackage.eINSTANCE.getIfcPositivePlaneAngleMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPositivePlaneAngleMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPositivePlaneAngleMeasureToString(FinalPackage.eINSTANCE.getIfcPositivePlaneAngleMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPositiveRatioMeasureFromString(EDataType eDataType, String initialValue) {
		return createIfcRatioMeasureFromString(FinalPackage.eINSTANCE.getIfcRatioMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPositiveRatioMeasureToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRatioMeasureToString(FinalPackage.eINSTANCE.getIfcRatioMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPositiveRatioMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPositiveRatioMeasureFromString(FinalPackage.eINSTANCE.getIfcPositiveRatioMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPositiveRatioMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPositiveRatioMeasureToString(FinalPackage.eINSTANCE.getIfcPositiveRatioMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPowerMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPowerMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPowerMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPowerMeasureFromString(FinalPackage.eINSTANCE.getIfcPowerMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPowerMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPowerMeasureToString(FinalPackage.eINSTANCE.getIfcPowerMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcPresentableTextFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPresentableTextToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPressureMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPressureMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcPressureMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPressureMeasureFromString(FinalPackage.eINSTANCE.getIfcPressureMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPressureMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPressureMeasureToString(FinalPackage.eINSTANCE.getIfcPressureMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcedureTypeEnum createIfcProcedureTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcProcedureTypeEnumFromString(FinalPackage.eINSTANCE.getIfcProcedureTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProcedureTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcProcedureTypeEnumToString(FinalPackage.eINSTANCE.getIfcProcedureTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProfileTypeEnum createIfcProfileTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcProfileTypeEnumFromString(FinalPackage.eINSTANCE.getIfcProfileTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProfileTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcProfileTypeEnumToString(FinalPackage.eINSTANCE.getIfcProfileTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectedOrTrueLengthEnum createIfcProjectedOrTrueLengthEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcProjectedOrTrueLengthEnumFromString(FinalPackage.eINSTANCE.getIfcProjectedOrTrueLengthEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProjectedOrTrueLengthEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcProjectedOrTrueLengthEnumToString(FinalPackage.eINSTANCE.getIfcProjectedOrTrueLengthEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectOrderRecordTypeEnum createIfcProjectOrderRecordTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcProjectOrderRecordTypeEnumFromString(FinalPackage.eINSTANCE.getIfcProjectOrderRecordTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProjectOrderRecordTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcProjectOrderRecordTypeEnumToString(FinalPackage.eINSTANCE.getIfcProjectOrderRecordTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectOrderTypeEnum createIfcProjectOrderTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcProjectOrderTypeEnumFromString(FinalPackage.eINSTANCE.getIfcProjectOrderTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProjectOrderTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcProjectOrderTypeEnumToString(FinalPackage.eINSTANCE.getIfcProjectOrderTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertySourceEnum createIfcPropertySourceEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPropertySourceEnumFromString(FinalPackage.eINSTANCE.getIfcPropertySourceEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPropertySourceEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPropertySourceEnumToString(FinalPackage.eINSTANCE.getIfcPropertySourceEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProtectiveDeviceTypeEnum createIfcProtectiveDeviceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcProtectiveDeviceTypeEnumFromString(FinalPackage.eINSTANCE.getIfcProtectiveDeviceTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcProtectiveDeviceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcProtectiveDeviceTypeEnumToString(FinalPackage.eINSTANCE.getIfcProtectiveDeviceTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPumpTypeEnum createIfcPumpTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcPumpTypeEnumFromString(FinalPackage.eINSTANCE.getIfcPumpTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcPumpTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcPumpTypeEnumToString(FinalPackage.eINSTANCE.getIfcPumpTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRadioActivityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRadioActivityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRadioActivityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRadioActivityMeasureFromString(FinalPackage.eINSTANCE.getIfcRadioActivityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRadioActivityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRadioActivityMeasureToString(FinalPackage.eINSTANCE.getIfcRadioActivityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRailingTypeEnum createIfcRailingTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRailingTypeEnumFromString(FinalPackage.eINSTANCE.getIfcRailingTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRailingTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRailingTypeEnumToString(FinalPackage.eINSTANCE.getIfcRailingTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRampFlightTypeEnum createIfcRampFlightTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRampFlightTypeEnumFromString(FinalPackage.eINSTANCE.getIfcRampFlightTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRampFlightTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRampFlightTypeEnumToString(FinalPackage.eINSTANCE.getIfcRampFlightTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRampTypeEnum createIfcRampTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRampTypeEnumFromString(FinalPackage.eINSTANCE.getIfcRampTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRampTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRampTypeEnumToString(FinalPackage.eINSTANCE.getIfcRampTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRatioMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRatioMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRatioMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRatioMeasureFromString(FinalPackage.eINSTANCE.getIfcRatioMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRatioMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRatioMeasureToString(FinalPackage.eINSTANCE.getIfcRatioMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRealFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRealToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRealObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRealFromString(FinalPackage.eINSTANCE.getIfcReal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRealObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRealToString(FinalPackage.eINSTANCE.getIfcReal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReflectanceMethodEnum createIfcReflectanceMethodEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcReflectanceMethodEnumFromString(FinalPackage.eINSTANCE.getIfcReflectanceMethodEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcReflectanceMethodEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcReflectanceMethodEnumToString(FinalPackage.eINSTANCE.getIfcReflectanceMethodEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnum createIfcReinforcingBarRoleEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcReinforcingBarRoleEnumFromString(FinalPackage.eINSTANCE.getIfcReinforcingBarRoleEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcReinforcingBarRoleEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcReinforcingBarRoleEnumToString(FinalPackage.eINSTANCE.getIfcReinforcingBarRoleEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnum createIfcReinforcingBarSurfaceEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcReinforcingBarSurfaceEnumFromString(FinalPackage.eINSTANCE.getIfcReinforcingBarSurfaceEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcReinforcingBarSurfaceEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcReinforcingBarSurfaceEnumToString(FinalPackage.eINSTANCE.getIfcReinforcingBarSurfaceEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcResourceConsumptionEnum createIfcResourceConsumptionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcResourceConsumptionEnumFromString(FinalPackage.eINSTANCE.getIfcResourceConsumptionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcResourceConsumptionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcResourceConsumptionEnumToString(FinalPackage.eINSTANCE.getIfcResourceConsumptionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRibPlateDirectionEnum createIfcRibPlateDirectionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRibPlateDirectionEnumFromString(FinalPackage.eINSTANCE.getIfcRibPlateDirectionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRibPlateDirectionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRibPlateDirectionEnumToString(FinalPackage.eINSTANCE.getIfcRibPlateDirectionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoleEnum createIfcRoleEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRoleEnumFromString(FinalPackage.eINSTANCE.getIfcRoleEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRoleEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRoleEnumToString(FinalPackage.eINSTANCE.getIfcRoleEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoofTypeEnum createIfcRoofTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRoofTypeEnumFromString(FinalPackage.eINSTANCE.getIfcRoofTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRoofTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRoofTypeEnumToString(FinalPackage.eINSTANCE.getIfcRoofTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRotationalFrequencyMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRotationalFrequencyMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRotationalFrequencyMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRotationalFrequencyMeasureFromString(FinalPackage.eINSTANCE.getIfcRotationalFrequencyMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRotationalFrequencyMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRotationalFrequencyMeasureToString(FinalPackage.eINSTANCE.getIfcRotationalFrequencyMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRotationalMassMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRotationalMassMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRotationalMassMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRotationalMassMeasureFromString(FinalPackage.eINSTANCE.getIfcRotationalMassMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRotationalMassMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRotationalMassMeasureToString(FinalPackage.eINSTANCE.getIfcRotationalMassMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRotationalStiffnessMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRotationalStiffnessMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcRotationalStiffnessMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcRotationalStiffnessMeasureFromString(FinalPackage.eINSTANCE.getIfcRotationalStiffnessMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcRotationalStiffnessMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcRotationalStiffnessMeasureToString(FinalPackage.eINSTANCE.getIfcRotationalStiffnessMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSanitaryTerminalTypeEnum createIfcSanitaryTerminalTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSanitaryTerminalTypeEnumFromString(FinalPackage.eINSTANCE.getIfcSanitaryTerminalTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSanitaryTerminalTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSanitaryTerminalTypeEnumToString(FinalPackage.eINSTANCE.getIfcSanitaryTerminalTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSecondInMinuteFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSecondInMinuteToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSecondInMinuteObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSecondInMinuteFromString(FinalPackage.eINSTANCE.getIfcSecondInMinute(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSecondInMinuteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSecondInMinuteToString(FinalPackage.eINSTANCE.getIfcSecondInMinute(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSectionalAreaIntegralMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSectionalAreaIntegralMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSectionalAreaIntegralMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSectionalAreaIntegralMeasureFromString(FinalPackage.eINSTANCE.getIfcSectionalAreaIntegralMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSectionalAreaIntegralMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSectionalAreaIntegralMeasureToString(FinalPackage.eINSTANCE.getIfcSectionalAreaIntegralMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSectionModulusMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSectionModulusMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSectionModulusMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSectionModulusMeasureFromString(FinalPackage.eINSTANCE.getIfcSectionModulusMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSectionModulusMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSectionModulusMeasureToString(FinalPackage.eINSTANCE.getIfcSectionModulusMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSectionTypeEnum createIfcSectionTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSectionTypeEnumFromString(FinalPackage.eINSTANCE.getIfcSectionTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSectionTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSectionTypeEnumToString(FinalPackage.eINSTANCE.getIfcSectionTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSensorTypeEnum createIfcSensorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSensorTypeEnumFromString(FinalPackage.eINSTANCE.getIfcSensorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSensorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSensorTypeEnumToString(FinalPackage.eINSTANCE.getIfcSensorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSequenceEnum createIfcSequenceEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSequenceEnumFromString(FinalPackage.eINSTANCE.getIfcSequenceEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSequenceEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSequenceEnumToString(FinalPackage.eINSTANCE.getIfcSequenceEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeFactorTypeEnum createIfcServiceLifeFactorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcServiceLifeFactorTypeEnumFromString(FinalPackage.eINSTANCE.getIfcServiceLifeFactorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcServiceLifeFactorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcServiceLifeFactorTypeEnumToString(FinalPackage.eINSTANCE.getIfcServiceLifeFactorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeTypeEnum createIfcServiceLifeTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcServiceLifeTypeEnumFromString(FinalPackage.eINSTANCE.getIfcServiceLifeTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcServiceLifeTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcServiceLifeTypeEnumToString(FinalPackage.eINSTANCE.getIfcServiceLifeTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcShearModulusMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcShearModulusMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcShearModulusMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcShearModulusMeasureFromString(FinalPackage.eINSTANCE.getIfcShearModulusMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcShearModulusMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcShearModulusMeasureToString(FinalPackage.eINSTANCE.getIfcShearModulusMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSIPrefix createIfcSIPrefixObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSIPrefixFromString(FinalPackage.eINSTANCE.getIfcSIPrefix(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSIPrefixObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSIPrefixToString(FinalPackage.eINSTANCE.getIfcSIPrefix(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSIUnitName createIfcSIUnitNameObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSIUnitNameFromString(FinalPackage.eINSTANCE.getIfcSIUnitName(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSIUnitNameObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSIUnitNameToString(FinalPackage.eINSTANCE.getIfcSIUnitName(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSlabTypeEnum createIfcSlabTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSlabTypeEnumFromString(FinalPackage.eINSTANCE.getIfcSlabTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSlabTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSlabTypeEnumToString(FinalPackage.eINSTANCE.getIfcSlabTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSolidAngleMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSolidAngleMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSolidAngleMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSolidAngleMeasureFromString(FinalPackage.eINSTANCE.getIfcSolidAngleMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSolidAngleMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSolidAngleMeasureToString(FinalPackage.eINSTANCE.getIfcSolidAngleMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSoundPowerMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSoundPowerMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSoundPowerMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSoundPowerMeasureFromString(FinalPackage.eINSTANCE.getIfcSoundPowerMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSoundPowerMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSoundPowerMeasureToString(FinalPackage.eINSTANCE.getIfcSoundPowerMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSoundPressureMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSoundPressureMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSoundPressureMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSoundPressureMeasureFromString(FinalPackage.eINSTANCE.getIfcSoundPressureMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSoundPressureMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSoundPressureMeasureToString(FinalPackage.eINSTANCE.getIfcSoundPressureMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundScaleEnum createIfcSoundScaleEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSoundScaleEnumFromString(FinalPackage.eINSTANCE.getIfcSoundScaleEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSoundScaleEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSoundScaleEnumToString(FinalPackage.eINSTANCE.getIfcSoundScaleEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceHeaterTypeEnum createIfcSpaceHeaterTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSpaceHeaterTypeEnumFromString(FinalPackage.eINSTANCE.getIfcSpaceHeaterTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpaceHeaterTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSpaceHeaterTypeEnumToString(FinalPackage.eINSTANCE.getIfcSpaceHeaterTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSpaceTypeEnum createIfcSpaceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSpaceTypeEnumFromString(FinalPackage.eINSTANCE.getIfcSpaceTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpaceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSpaceTypeEnumToString(FinalPackage.eINSTANCE.getIfcSpaceTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSpecificHeatCapacityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpecificHeatCapacityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSpecificHeatCapacityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSpecificHeatCapacityMeasureFromString(FinalPackage.eINSTANCE.getIfcSpecificHeatCapacityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpecificHeatCapacityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSpecificHeatCapacityMeasureToString(FinalPackage.eINSTANCE.getIfcSpecificHeatCapacityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSpecularExponentFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpecularExponentToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSpecularExponentObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSpecularExponentFromString(FinalPackage.eINSTANCE.getIfcSpecularExponent(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpecularExponentObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSpecularExponentToString(FinalPackage.eINSTANCE.getIfcSpecularExponent(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSpecularRoughnessFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpecularRoughnessToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcSpecularRoughnessObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSpecularRoughnessFromString(FinalPackage.eINSTANCE.getIfcSpecularRoughness(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSpecularRoughnessObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSpecularRoughnessToString(FinalPackage.eINSTANCE.getIfcSpecularRoughness(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStackTerminalTypeEnum createIfcStackTerminalTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcStackTerminalTypeEnumFromString(FinalPackage.eINSTANCE.getIfcStackTerminalTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStackTerminalTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcStackTerminalTypeEnumToString(FinalPackage.eINSTANCE.getIfcStackTerminalTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairFlightTypeEnum createIfcStairFlightTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcStairFlightTypeEnumFromString(FinalPackage.eINSTANCE.getIfcStairFlightTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStairFlightTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcStairFlightTypeEnumToString(FinalPackage.eINSTANCE.getIfcStairFlightTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStairTypeEnum createIfcStairTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcStairTypeEnumFromString(FinalPackage.eINSTANCE.getIfcStairTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStairTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcStairTypeEnumToString(FinalPackage.eINSTANCE.getIfcStairTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStateEnum createIfcStateEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcStateEnumFromString(FinalPackage.eINSTANCE.getIfcStateEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStateEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcStateEnumToString(FinalPackage.eINSTANCE.getIfcStateEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralCurveTypeEnum createIfcStructuralCurveTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcStructuralCurveTypeEnumFromString(FinalPackage.eINSTANCE.getIfcStructuralCurveTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStructuralCurveTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcStructuralCurveTypeEnumToString(FinalPackage.eINSTANCE.getIfcStructuralCurveTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralSurfaceTypeEnum createIfcStructuralSurfaceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcStructuralSurfaceTypeEnumFromString(FinalPackage.eINSTANCE.getIfcStructuralSurfaceTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcStructuralSurfaceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcStructuralSurfaceTypeEnumToString(FinalPackage.eINSTANCE.getIfcStructuralSurfaceTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceSide createIfcSurfaceSideObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSurfaceSideFromString(FinalPackage.eINSTANCE.getIfcSurfaceSide(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSurfaceSideObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSurfaceSideToString(FinalPackage.eINSTANCE.getIfcSurfaceSide(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceTextureEnum createIfcSurfaceTextureEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSurfaceTextureEnumFromString(FinalPackage.eINSTANCE.getIfcSurfaceTextureEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSurfaceTextureEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSurfaceTextureEnumToString(FinalPackage.eINSTANCE.getIfcSurfaceTextureEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSwitchingDeviceTypeEnum createIfcSwitchingDeviceTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcSwitchingDeviceTypeEnumFromString(FinalPackage.eINSTANCE.getIfcSwitchingDeviceTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcSwitchingDeviceTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcSwitchingDeviceTypeEnumToString(FinalPackage.eINSTANCE.getIfcSwitchingDeviceTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTankTypeEnum createIfcTankTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTankTypeEnumFromString(FinalPackage.eINSTANCE.getIfcTankTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTankTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTankTypeEnumToString(FinalPackage.eINSTANCE.getIfcTankTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcTemperatureGradientMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTemperatureGradientMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcTemperatureGradientMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTemperatureGradientMeasureFromString(FinalPackage.eINSTANCE.getIfcTemperatureGradientMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTemperatureGradientMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTemperatureGradientMeasureToString(FinalPackage.eINSTANCE.getIfcTemperatureGradientMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendonTypeEnum createIfcTendonTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTendonTypeEnumFromString(FinalPackage.eINSTANCE.getIfcTendonTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTendonTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTendonTypeEnumToString(FinalPackage.eINSTANCE.getIfcTendonTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcTextFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTextToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcTextAlignmentFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTextAlignmentToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcTextDecorationFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTextDecorationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcTextFontNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTextFontNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTextPath createIfcTextPathObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTextPathFromString(FinalPackage.eINSTANCE.getIfcTextPath(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTextPathObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTextPathToString(FinalPackage.eINSTANCE.getIfcTextPath(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIfcTextTransformationFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTextTransformationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalAdmittanceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalAdmittanceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalAdmittanceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcThermalAdmittanceMeasureFromString(FinalPackage.eINSTANCE.getIfcThermalAdmittanceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalAdmittanceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcThermalAdmittanceMeasureToString(FinalPackage.eINSTANCE.getIfcThermalAdmittanceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalConductivityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalConductivityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalConductivityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcThermalConductivityMeasureFromString(FinalPackage.eINSTANCE.getIfcThermalConductivityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalConductivityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcThermalConductivityMeasureToString(FinalPackage.eINSTANCE.getIfcThermalConductivityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalExpansionCoefficientMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalExpansionCoefficientMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalExpansionCoefficientMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcThermalExpansionCoefficientMeasureFromString(FinalPackage.eINSTANCE.getIfcThermalExpansionCoefficientMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalExpansionCoefficientMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcThermalExpansionCoefficientMeasureToString(FinalPackage.eINSTANCE.getIfcThermalExpansionCoefficientMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadSourceEnum createIfcThermalLoadSourceEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcThermalLoadSourceEnumFromString(FinalPackage.eINSTANCE.getIfcThermalLoadSourceEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalLoadSourceEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcThermalLoadSourceEnumToString(FinalPackage.eINSTANCE.getIfcThermalLoadSourceEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcThermalLoadTypeEnum createIfcThermalLoadTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcThermalLoadTypeEnumFromString(FinalPackage.eINSTANCE.getIfcThermalLoadTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalLoadTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcThermalLoadTypeEnumToString(FinalPackage.eINSTANCE.getIfcThermalLoadTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalResistanceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalResistanceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalResistanceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcThermalResistanceMeasureFromString(FinalPackage.eINSTANCE.getIfcThermalResistanceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalResistanceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcThermalResistanceMeasureToString(FinalPackage.eINSTANCE.getIfcThermalResistanceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalTransmittanceMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalTransmittanceMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermalTransmittanceMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcThermalTransmittanceMeasureFromString(FinalPackage.eINSTANCE.getIfcThermalTransmittanceMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermalTransmittanceMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcThermalTransmittanceMeasureToString(FinalPackage.eINSTANCE.getIfcThermalTransmittanceMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermodynamicTemperatureMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermodynamicTemperatureMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcThermodynamicTemperatureMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcThermodynamicTemperatureMeasureFromString(FinalPackage.eINSTANCE.getIfcThermodynamicTemperatureMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcThermodynamicTemperatureMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcThermodynamicTemperatureMeasureToString(FinalPackage.eINSTANCE.getIfcThermodynamicTemperatureMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcTimeMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTimeMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcTimeMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTimeMeasureFromString(FinalPackage.eINSTANCE.getIfcTimeMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTimeMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTimeMeasureToString(FinalPackage.eINSTANCE.getIfcTimeMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesDataTypeEnum createIfcTimeSeriesDataTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTimeSeriesDataTypeEnumFromString(FinalPackage.eINSTANCE.getIfcTimeSeriesDataTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTimeSeriesDataTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTimeSeriesDataTypeEnumToString(FinalPackage.eINSTANCE.getIfcTimeSeriesDataTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeriesScheduleTypeEnum createIfcTimeSeriesScheduleTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTimeSeriesScheduleTypeEnumFromString(FinalPackage.eINSTANCE.getIfcTimeSeriesScheduleTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTimeSeriesScheduleTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTimeSeriesScheduleTypeEnumToString(FinalPackage.eINSTANCE.getIfcTimeSeriesScheduleTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcTimeStampFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTimeStampToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcTimeStampObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTimeStampFromString(FinalPackage.eINSTANCE.getIfcTimeStamp(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTimeStampObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTimeStampToString(FinalPackage.eINSTANCE.getIfcTimeStamp(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcTorqueMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTorqueMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcTorqueMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTorqueMeasureFromString(FinalPackage.eINSTANCE.getIfcTorqueMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTorqueMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTorqueMeasureToString(FinalPackage.eINSTANCE.getIfcTorqueMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransformerTypeEnum createIfcTransformerTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTransformerTypeEnumFromString(FinalPackage.eINSTANCE.getIfcTransformerTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTransformerTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTransformerTypeEnumToString(FinalPackage.eINSTANCE.getIfcTransformerTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransitionCode createIfcTransitionCodeObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTransitionCodeFromString(FinalPackage.eINSTANCE.getIfcTransitionCode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTransitionCodeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTransitionCodeToString(FinalPackage.eINSTANCE.getIfcTransitionCode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransportElementTypeEnum createIfcTransportElementTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTransportElementTypeEnumFromString(FinalPackage.eINSTANCE.getIfcTransportElementTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTransportElementTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTransportElementTypeEnumToString(FinalPackage.eINSTANCE.getIfcTransportElementTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTrimmingPreference createIfcTrimmingPreferenceObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTrimmingPreferenceFromString(FinalPackage.eINSTANCE.getIfcTrimmingPreference(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTrimmingPreferenceObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTrimmingPreferenceToString(FinalPackage.eINSTANCE.getIfcTrimmingPreference(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTubeBundleTypeEnum createIfcTubeBundleTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcTubeBundleTypeEnumFromString(FinalPackage.eINSTANCE.getIfcTubeBundleTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcTubeBundleTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcTubeBundleTypeEnumToString(FinalPackage.eINSTANCE.getIfcTubeBundleTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitaryEquipmentTypeEnum createIfcUnitaryEquipmentTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcUnitaryEquipmentTypeEnumFromString(FinalPackage.eINSTANCE.getIfcUnitaryEquipmentTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcUnitaryEquipmentTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcUnitaryEquipmentTypeEnumToString(FinalPackage.eINSTANCE.getIfcUnitaryEquipmentTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitEnum createIfcUnitEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcUnitEnumFromString(FinalPackage.eINSTANCE.getIfcUnitEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcUnitEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcUnitEnumToString(FinalPackage.eINSTANCE.getIfcUnitEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValveTypeEnum createIfcValveTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcValveTypeEnumFromString(FinalPackage.eINSTANCE.getIfcValveTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcValveTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcValveTypeEnumToString(FinalPackage.eINSTANCE.getIfcValveTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcVaporPermeabilityMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcVaporPermeabilityMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcVaporPermeabilityMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcVaporPermeabilityMeasureFromString(FinalPackage.eINSTANCE.getIfcVaporPermeabilityMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcVaporPermeabilityMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcVaporPermeabilityMeasureToString(FinalPackage.eINSTANCE.getIfcVaporPermeabilityMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVibrationIsolatorTypeEnum createIfcVibrationIsolatorTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcVibrationIsolatorTypeEnumFromString(FinalPackage.eINSTANCE.getIfcVibrationIsolatorTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcVibrationIsolatorTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcVibrationIsolatorTypeEnumToString(FinalPackage.eINSTANCE.getIfcVibrationIsolatorTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcVolumeMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcVolumeMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcVolumeMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcVolumeMeasureFromString(FinalPackage.eINSTANCE.getIfcVolumeMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcVolumeMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcVolumeMeasureToString(FinalPackage.eINSTANCE.getIfcVolumeMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcVolumetricFlowRateMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcVolumetricFlowRateMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcVolumetricFlowRateMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcVolumetricFlowRateMeasureFromString(FinalPackage.eINSTANCE.getIfcVolumetricFlowRateMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcVolumetricFlowRateMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcVolumetricFlowRateMeasureToString(FinalPackage.eINSTANCE.getIfcVolumetricFlowRateMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWallTypeEnum createIfcWallTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcWallTypeEnumFromString(FinalPackage.eINSTANCE.getIfcWallTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWallTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcWallTypeEnumToString(FinalPackage.eINSTANCE.getIfcWallTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcWarpingConstantMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWarpingConstantMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcWarpingConstantMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcWarpingConstantMeasureFromString(FinalPackage.eINSTANCE.getIfcWarpingConstantMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWarpingConstantMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcWarpingConstantMeasureToString(FinalPackage.eINSTANCE.getIfcWarpingConstantMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcWarpingMomentMeasureFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWarpingMomentMeasureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createIfcWarpingMomentMeasureObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcWarpingMomentMeasureFromString(FinalPackage.eINSTANCE.getIfcWarpingMomentMeasure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWarpingMomentMeasureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcWarpingMomentMeasureToString(FinalPackage.eINSTANCE.getIfcWarpingMomentMeasure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWasteTerminalTypeEnum createIfcWasteTerminalTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcWasteTerminalTypeEnumFromString(FinalPackage.eINSTANCE.getIfcWasteTerminalTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWasteTerminalTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcWasteTerminalTypeEnumToString(FinalPackage.eINSTANCE.getIfcWasteTerminalTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelOperationEnum createIfcWindowPanelOperationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcWindowPanelOperationEnumFromString(FinalPackage.eINSTANCE.getIfcWindowPanelOperationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWindowPanelOperationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcWindowPanelOperationEnumToString(FinalPackage.eINSTANCE.getIfcWindowPanelOperationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowPanelPositionEnum createIfcWindowPanelPositionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcWindowPanelPositionEnumFromString(FinalPackage.eINSTANCE.getIfcWindowPanelPositionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWindowPanelPositionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcWindowPanelPositionEnumToString(FinalPackage.eINSTANCE.getIfcWindowPanelPositionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleConstructionEnum createIfcWindowStyleConstructionEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcWindowStyleConstructionEnumFromString(FinalPackage.eINSTANCE.getIfcWindowStyleConstructionEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWindowStyleConstructionEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcWindowStyleConstructionEnumToString(FinalPackage.eINSTANCE.getIfcWindowStyleConstructionEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWindowStyleOperationEnum createIfcWindowStyleOperationEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcWindowStyleOperationEnumFromString(FinalPackage.eINSTANCE.getIfcWindowStyleOperationEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWindowStyleOperationEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcWindowStyleOperationEnumToString(FinalPackage.eINSTANCE.getIfcWindowStyleOperationEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcWorkControlTypeEnum createIfcWorkControlTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcWorkControlTypeEnumFromString(FinalPackage.eINSTANCE.getIfcWorkControlTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcWorkControlTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcWorkControlTypeEnumToString(FinalPackage.eINSTANCE.getIfcWorkControlTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcYearNumberFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcYearNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createIfcYearNumberObjectFromString(EDataType eDataType, String initialValue) {
		return createIfcYearNumberFromString(FinalPackage.eINSTANCE.getIfcYearNumber(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIfcYearNumberObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIfcYearNumberToString(FinalPackage.eINSTANCE.getIfcYearNumber(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalPackage getFinalPackage() {
		return (FinalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FinalPackage getPackage() {
		return FinalPackage.eINSTANCE;
	}

} //FinalFactoryImpl
