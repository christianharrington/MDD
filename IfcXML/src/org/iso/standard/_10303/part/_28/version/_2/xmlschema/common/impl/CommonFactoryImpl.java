/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common.impl;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonFactoryImpl extends EFactoryImpl implements CommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonFactory init() {
		try {
			CommonFactory theCommonFactory = (CommonFactory)EPackage.Registry.INSTANCE.getEFactory("urn:iso.org:standard:10303:part(28):version(2):xmlschema:common"); 
			if (theCommonFactory != null) {
				return theCommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactoryImpl() {
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
			case CommonPackage.BASE64_BINARY: return createBase64Binary();
			case CommonPackage.BASE64_BINARY_WRAPPER_TYPE: return createBase64BinaryWrapperType();
			case CommonPackage.BOOLEAN_WRAPPER_TYPE: return createBooleanWrapperType();
			case CommonPackage.DECIMAL_WRAPPER_TYPE: return createDecimalWrapperType();
			case CommonPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CommonPackage.DOUBLE_WRAPPER_TYPE: return createDoubleWrapperType();
			case CommonPackage.HEX_BINARY: return createHexBinary();
			case CommonPackage.HEX_BINARY_WRAPPER_TYPE: return createHexBinaryWrapperType();
			case CommonPackage.INTEGER_WRAPPER_TYPE: return createIntegerWrapperType();
			case CommonPackage.ISO1030328_HEADER_TYPE: return createIso1030328HeaderType();
			case CommonPackage.ISO1030328_TYPE: return createIso1030328Type();
			case CommonPackage.LOGICAL_WRAPPER_TYPE: return createLogicalWrapperType();
			case CommonPackage.LONG_WRAPPER_TYPE: return createLongWrapperType();
			case CommonPackage.STRING_WRAPPER_TYPE: return createStringWrapperType();
			case CommonPackage.UOS: return createUos();
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
			case CommonPackage.AGGREGATE_TYPE:
				return createAggregateTypeFromString(eDataType, initialValue);
			case CommonPackage.ATTRIBUTE_TYPE_TYPE:
				return createAttributeTypeTypeFromString(eDataType, initialValue);
			case CommonPackage.LOGICAL:
				return createLogicalFromString(eDataType, initialValue);
			case CommonPackage.AGGREGATE_TYPE_OBJECT:
				return createAggregateTypeObjectFromString(eDataType, initialValue);
			case CommonPackage.ARRAY_SIZE_TYPE:
				return createArraySizeTypeFromString(eDataType, initialValue);
			case CommonPackage.ARRAY_SIZE_TYPE_BASE:
				return createArraySizeTypeBaseFromString(eDataType, initialValue);
			case CommonPackage.ATTRIBUTE_TYPE_TYPE_OBJECT:
				return createAttributeTypeTypeObjectFromString(eDataType, initialValue);
			case CommonPackage.CTYPE_TYPE:
				return createCTypeTypeFromString(eDataType, initialValue);
			case CommonPackage.LOGICAL_OBJECT:
				return createLogicalObjectFromString(eDataType, initialValue);
			case CommonPackage.POS_TYPE:
				return createPosTypeFromString(eDataType, initialValue);
			case CommonPackage.POS_TYPE_BASE:
				return createPosTypeBaseFromString(eDataType, initialValue);
			case CommonPackage.SEQ_ANY_URI:
				return createSeqAnyURIFromString(eDataType, initialValue);
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
			case CommonPackage.AGGREGATE_TYPE:
				return convertAggregateTypeToString(eDataType, instanceValue);
			case CommonPackage.ATTRIBUTE_TYPE_TYPE:
				return convertAttributeTypeTypeToString(eDataType, instanceValue);
			case CommonPackage.LOGICAL:
				return convertLogicalToString(eDataType, instanceValue);
			case CommonPackage.AGGREGATE_TYPE_OBJECT:
				return convertAggregateTypeObjectToString(eDataType, instanceValue);
			case CommonPackage.ARRAY_SIZE_TYPE:
				return convertArraySizeTypeToString(eDataType, instanceValue);
			case CommonPackage.ARRAY_SIZE_TYPE_BASE:
				return convertArraySizeTypeBaseToString(eDataType, instanceValue);
			case CommonPackage.ATTRIBUTE_TYPE_TYPE_OBJECT:
				return convertAttributeTypeTypeObjectToString(eDataType, instanceValue);
			case CommonPackage.CTYPE_TYPE:
				return convertCTypeTypeToString(eDataType, instanceValue);
			case CommonPackage.LOGICAL_OBJECT:
				return convertLogicalObjectToString(eDataType, instanceValue);
			case CommonPackage.POS_TYPE:
				return convertPosTypeToString(eDataType, instanceValue);
			case CommonPackage.POS_TYPE_BASE:
				return convertPosTypeBaseToString(eDataType, instanceValue);
			case CommonPackage.SEQ_ANY_URI:
				return convertSeqAnyURIToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary createBase64Binary() {
		Base64BinaryImpl base64Binary = new Base64BinaryImpl();
		return base64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64BinaryWrapperType createBase64BinaryWrapperType() {
		Base64BinaryWrapperTypeImpl base64BinaryWrapperType = new Base64BinaryWrapperTypeImpl();
		return base64BinaryWrapperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanWrapperType createBooleanWrapperType() {
		BooleanWrapperTypeImpl booleanWrapperType = new BooleanWrapperTypeImpl();
		return booleanWrapperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalWrapperType createDecimalWrapperType() {
		DecimalWrapperTypeImpl decimalWrapperType = new DecimalWrapperTypeImpl();
		return decimalWrapperType;
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
	public DoubleWrapperType createDoubleWrapperType() {
		DoubleWrapperTypeImpl doubleWrapperType = new DoubleWrapperTypeImpl();
		return doubleWrapperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexBinary createHexBinary() {
		HexBinaryImpl hexBinary = new HexBinaryImpl();
		return hexBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexBinaryWrapperType createHexBinaryWrapperType() {
		HexBinaryWrapperTypeImpl hexBinaryWrapperType = new HexBinaryWrapperTypeImpl();
		return hexBinaryWrapperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerWrapperType createIntegerWrapperType() {
		IntegerWrapperTypeImpl integerWrapperType = new IntegerWrapperTypeImpl();
		return integerWrapperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iso1030328HeaderType createIso1030328HeaderType() {
		Iso1030328HeaderTypeImpl iso1030328HeaderType = new Iso1030328HeaderTypeImpl();
		return iso1030328HeaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iso1030328Type createIso1030328Type() {
		Iso1030328TypeImpl iso1030328Type = new Iso1030328TypeImpl();
		return iso1030328Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalWrapperType createLogicalWrapperType() {
		LogicalWrapperTypeImpl logicalWrapperType = new LogicalWrapperTypeImpl();
		return logicalWrapperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongWrapperType createLongWrapperType() {
		LongWrapperTypeImpl longWrapperType = new LongWrapperTypeImpl();
		return longWrapperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringWrapperType createStringWrapperType() {
		StringWrapperTypeImpl stringWrapperType = new StringWrapperTypeImpl();
		return stringWrapperType;
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
	public AggregateType createAggregateTypeFromString(EDataType eDataType, String initialValue) {
		AggregateType result = AggregateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeType createAttributeTypeTypeFromString(EDataType eDataType, String initialValue) {
		AttributeTypeType result = AttributeTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical createLogicalFromString(EDataType eDataType, String initialValue) {
		Logical result = Logical.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateType createAggregateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregateTypeFromString(CommonPackage.Literals.AGGREGATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregateTypeToString(CommonPackage.Literals.AGGREGATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createArraySizeTypeFromString(EDataType eDataType, String initialValue) {
		return createArraySizeTypeBaseFromString(CommonPackage.Literals.ARRAY_SIZE_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArraySizeTypeToString(EDataType eDataType, Object instanceValue) {
		return convertArraySizeTypeBaseToString(CommonPackage.Literals.ARRAY_SIZE_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createArraySizeTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			result.add((BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArraySizeTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeType createAttributeTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAttributeTypeTypeFromString(CommonPackage.Literals.ATTRIBUTE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAttributeTypeTypeToString(CommonPackage.Literals.ATTRIBUTE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AggregateType> createCTypeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<AggregateType> result = new ArrayList<AggregateType>();
		for (String item : split(initialValue)) {
			result.add(createAggregateTypeFromString(CommonPackage.Literals.AGGREGATE_TYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCTypeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertAggregateTypeToString(CommonPackage.Literals.AGGREGATE_TYPE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logical createLogicalObjectFromString(EDataType eDataType, String initialValue) {
		return createLogicalFromString(CommonPackage.Literals.LOGICAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLogicalToString(CommonPackage.Literals.LOGICAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createPosTypeFromString(EDataType eDataType, String initialValue) {
		return createPosTypeBaseFromString(CommonPackage.Literals.POS_TYPE_BASE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPosTypeToString(EDataType eDataType, Object instanceValue) {
		return convertPosTypeBaseToString(CommonPackage.Literals.POS_TYPE_BASE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createPosTypeBaseFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			result.add((BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPosTypeBaseToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createSeqAnyURIFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeqAnyURIToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPackage getCommonPackage() {
		return (CommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonPackage getPackage() {
		return CommonPackage.eINSTANCE;
	}

} //CommonFactoryImpl
