/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common.util;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage
 * @generated
 */
public class CommonValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommonValidator INSTANCE = new CommonValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.iso.standard._10303.part._28.version._2.xmlschema.common";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CommonPackage.eINSTANCE;
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
			case CommonPackage.BASE64_BINARY:
				return validateBase64Binary((Base64Binary)value, diagnostics, context);
			case CommonPackage.BASE64_BINARY_WRAPPER_TYPE:
				return validateBase64BinaryWrapperType((Base64BinaryWrapperType)value, diagnostics, context);
			case CommonPackage.BOOLEAN_WRAPPER_TYPE:
				return validateBooleanWrapperType((BooleanWrapperType)value, diagnostics, context);
			case CommonPackage.DECIMAL_WRAPPER_TYPE:
				return validateDecimalWrapperType((DecimalWrapperType)value, diagnostics, context);
			case CommonPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case CommonPackage.DOUBLE_WRAPPER_TYPE:
				return validateDoubleWrapperType((DoubleWrapperType)value, diagnostics, context);
			case CommonPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case CommonPackage.HEX_BINARY:
				return validateHexBinary((HexBinary)value, diagnostics, context);
			case CommonPackage.HEX_BINARY_WRAPPER_TYPE:
				return validateHexBinaryWrapperType((HexBinaryWrapperType)value, diagnostics, context);
			case CommonPackage.INTEGER_WRAPPER_TYPE:
				return validateIntegerWrapperType((IntegerWrapperType)value, diagnostics, context);
			case CommonPackage.ISO1030328_HEADER_TYPE:
				return validateIso1030328HeaderType((Iso1030328HeaderType)value, diagnostics, context);
			case CommonPackage.ISO1030328_TYPE:
				return validateIso1030328Type((Iso1030328Type)value, diagnostics, context);
			case CommonPackage.LOGICAL_WRAPPER_TYPE:
				return validateLogicalWrapperType((LogicalWrapperType)value, diagnostics, context);
			case CommonPackage.LONG_WRAPPER_TYPE:
				return validateLongWrapperType((LongWrapperType)value, diagnostics, context);
			case CommonPackage.STRING_WRAPPER_TYPE:
				return validateStringWrapperType((StringWrapperType)value, diagnostics, context);
			case CommonPackage.UOS:
				return validateUos((Uos)value, diagnostics, context);
			case CommonPackage.AGGREGATE_TYPE:
				return validateAggregateType((AggregateType)value, diagnostics, context);
			case CommonPackage.ATTRIBUTE_TYPE_TYPE:
				return validateAttributeTypeType((AttributeTypeType)value, diagnostics, context);
			case CommonPackage.LOGICAL:
				return validateLogical((Logical)value, diagnostics, context);
			case CommonPackage.AGGREGATE_TYPE_OBJECT:
				return validateAggregateTypeObject((AggregateType)value, diagnostics, context);
			case CommonPackage.ARRAY_SIZE_TYPE:
				return validateArraySizeType((List<?>)value, diagnostics, context);
			case CommonPackage.ARRAY_SIZE_TYPE_BASE:
				return validateArraySizeTypeBase((List<?>)value, diagnostics, context);
			case CommonPackage.ATTRIBUTE_TYPE_TYPE_OBJECT:
				return validateAttributeTypeTypeObject((AttributeTypeType)value, diagnostics, context);
			case CommonPackage.CTYPE_TYPE:
				return validateCTypeType((List<?>)value, diagnostics, context);
			case CommonPackage.LOGICAL_OBJECT:
				return validateLogicalObject((Logical)value, diagnostics, context);
			case CommonPackage.POS_TYPE:
				return validatePosType((List<?>)value, diagnostics, context);
			case CommonPackage.POS_TYPE_BASE:
				return validatePosTypeBase((List<?>)value, diagnostics, context);
			case CommonPackage.SEQ_ANY_URI:
				return validateSeqAnyURI((List<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Binary(Base64Binary base64Binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base64Binary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64BinaryWrapperType(Base64BinaryWrapperType base64BinaryWrapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(base64BinaryWrapperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanWrapperType(BooleanWrapperType booleanWrapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanWrapperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalWrapperType(DecimalWrapperType decimalWrapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimalWrapperType, diagnostics, context);
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
	public boolean validateDoubleWrapperType(DoubleWrapperType doubleWrapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleWrapperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexBinary(HexBinary hexBinary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hexBinary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexBinaryWrapperType(HexBinaryWrapperType hexBinaryWrapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hexBinaryWrapperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerWrapperType(IntegerWrapperType integerWrapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerWrapperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIso1030328HeaderType(Iso1030328HeaderType iso1030328HeaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iso1030328HeaderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIso1030328Type(Iso1030328Type iso1030328Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iso1030328Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalWrapperType(LogicalWrapperType logicalWrapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalWrapperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongWrapperType(LongWrapperType longWrapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longWrapperType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringWrapperType(StringWrapperType stringWrapperType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringWrapperType, diagnostics, context);
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
	public boolean validateAggregateType(AggregateType aggregateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeTypeType(AttributeTypeType attributeTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogical(Logical logical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregateTypeObject(AggregateType aggregateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArraySizeType(List<?> arraySizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateArraySizeTypeBase_ItemType(arraySizeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateArraySizeType_MinLength(arraySizeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Array Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArraySizeType_MinLength(List<?> arraySizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = arraySizeType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(CommonPackage.Literals.ARRAY_SIZE_TYPE, arraySizeType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArraySizeTypeBase(List<?> arraySizeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateArraySizeTypeBase_ItemType(arraySizeTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Array Size Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArraySizeTypeBase_ItemType(List<?> arraySizeTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = arraySizeTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.INTEGER.isInstance(item)) {
				result &= xmlTypeValidator.validateInteger((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.INTEGER, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeTypeTypeObject(AttributeTypeType attributeTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCTypeType(List<?> cTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCTypeType_ItemType(cTypeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>CType Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCTypeType_ItemType(List<?> cTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = cTypeType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (CommonPackage.Literals.AGGREGATE_TYPE.isInstance(item)) {
				result &= validateAggregateType((AggregateType)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(CommonPackage.Literals.AGGREGATE_TYPE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalObject(Logical logicalObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosType(List<?> posType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePosTypeBase_ItemType(posType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePosType_MinLength(posType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Pos Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosType_MinLength(List<?> posType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = posType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(CommonPackage.Literals.POS_TYPE, posType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosTypeBase(List<?> posTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePosTypeBase_ItemType(posTypeBase, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Pos Type Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosTypeBase_ItemType(List<?> posTypeBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = posTypeBase.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.INTEGER.isInstance(item)) {
				result &= xmlTypeValidator.validateInteger((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.INTEGER, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeqAnyURI(List<?> seqAnyURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSeqAnyURI_ItemType(seqAnyURI, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Seq Any URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeqAnyURI_ItemType(List<?> seqAnyURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = seqAnyURI.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
				result &= xmlTypeValidator.validateAnyURI((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI, item, diagnostics, context);
			}
		}
		return result;
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

} //CommonValidator
