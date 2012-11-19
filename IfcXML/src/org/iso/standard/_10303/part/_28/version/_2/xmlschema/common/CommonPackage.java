/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:iso.org:standard:10303:part(28):version(2):xmlschema:common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Base64BinaryImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getBase64Binary()
	 * @generated
	 */
	int BASE64_BINARY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Extra Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY__EXTRA_BITS = 1;

	/**
	 * The number of structural features of the '<em>Base64 Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Base64BinaryWrapperTypeImpl <em>Base64 Binary Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Base64BinaryWrapperTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getBase64BinaryWrapperType()
	 * @generated
	 */
	int BASE64_BINARY_WRAPPER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_WRAPPER_TYPE__VALUE = BASE64_BINARY__VALUE;

	/**
	 * The feature id for the '<em><b>Extra Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_WRAPPER_TYPE__EXTRA_BITS = BASE64_BINARY__EXTRA_BITS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_WRAPPER_TYPE__ID = BASE64_BINARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_WRAPPER_TYPE__PATH = BASE64_BINARY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_WRAPPER_TYPE__POS = BASE64_BINARY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Base64 Binary Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE64_BINARY_WRAPPER_TYPE_FEATURE_COUNT = BASE64_BINARY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.BooleanWrapperTypeImpl <em>Boolean Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.BooleanWrapperTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getBooleanWrapperType()
	 * @generated
	 */
	int BOOLEAN_WRAPPER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_WRAPPER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_WRAPPER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_WRAPPER_TYPE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_WRAPPER_TYPE__POS = 3;

	/**
	 * The number of structural features of the '<em>Boolean Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_WRAPPER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DecimalWrapperTypeImpl <em>Decimal Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DecimalWrapperTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getDecimalWrapperType()
	 * @generated
	 */
	int DECIMAL_WRAPPER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_WRAPPER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_WRAPPER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_WRAPPER_TYPE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_WRAPPER_TYPE__POS = 3;

	/**
	 * The number of structural features of the '<em>Decimal Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_WRAPPER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Base64 Binary Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASE64_BINARY_WRAPPER = 3;

	/**
	 * The feature id for the '<em><b>Boolean Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN_WRAPPER = 4;

	/**
	 * The feature id for the '<em><b>Decimal Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECIMAL_WRAPPER = 5;

	/**
	 * The feature id for the '<em><b>Double Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOUBLE_WRAPPER = 6;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Hex Binary Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEX_BINARY_WRAPPER = 8;

	/**
	 * The feature id for the '<em><b>Integer Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTEGER_WRAPPER = 9;

	/**
	 * The feature id for the '<em><b>Iso1030328</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISO1030328 = 10;

	/**
	 * The feature id for the '<em><b>Iso1030328 Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISO1030328_HEADER = 11;

	/**
	 * The feature id for the '<em><b>Logical Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGICAL_WRAPPER = 12;

	/**
	 * The feature id for the '<em><b>Long Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LONG_WRAPPER = 13;

	/**
	 * The feature id for the '<em><b>String Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRING_WRAPPER = 14;

	/**
	 * The feature id for the '<em><b>Uos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UOS = 15;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARRAY_SIZE = 16;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>CType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CTYPE = 18;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM_TYPE = 19;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DoubleWrapperTypeImpl <em>Double Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DoubleWrapperTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getDoubleWrapperType()
	 * @generated
	 */
	int DOUBLE_WRAPPER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_WRAPPER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_WRAPPER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_WRAPPER_TYPE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_WRAPPER_TYPE__POS = 3;

	/**
	 * The number of structural features of the '<em>Double Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_WRAPPER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Edo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EDO = 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__HREF = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PATH = 3;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__POS = 4;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PROXY = 5;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REF = 6;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.HexBinaryImpl <em>Hex Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.HexBinaryImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getHexBinary()
	 * @generated
	 */
	int HEX_BINARY = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_BINARY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Extra Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_BINARY__EXTRA_BITS = 1;

	/**
	 * The number of structural features of the '<em>Hex Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_BINARY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.HexBinaryWrapperTypeImpl <em>Hex Binary Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.HexBinaryWrapperTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getHexBinaryWrapperType()
	 * @generated
	 */
	int HEX_BINARY_WRAPPER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_BINARY_WRAPPER_TYPE__VALUE = HEX_BINARY__VALUE;

	/**
	 * The feature id for the '<em><b>Extra Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_BINARY_WRAPPER_TYPE__EXTRA_BITS = HEX_BINARY__EXTRA_BITS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_BINARY_WRAPPER_TYPE__ID = HEX_BINARY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_BINARY_WRAPPER_TYPE__PATH = HEX_BINARY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_BINARY_WRAPPER_TYPE__POS = HEX_BINARY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hex Binary Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEX_BINARY_WRAPPER_TYPE_FEATURE_COUNT = HEX_BINARY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.IntegerWrapperTypeImpl <em>Integer Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.IntegerWrapperTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getIntegerWrapperType()
	 * @generated
	 */
	int INTEGER_WRAPPER_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_WRAPPER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_WRAPPER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_WRAPPER_TYPE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_WRAPPER_TYPE__POS = 3;

	/**
	 * The number of structural features of the '<em>Integer Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_WRAPPER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl <em>Iso1030328 Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getIso1030328HeaderType()
	 * @generated
	 */
	int ISO1030328_HEADER_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_HEADER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_HEADER_TYPE__TIME_STAMP = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_HEADER_TYPE__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_HEADER_TYPE__ORGANIZATION = 3;

	/**
	 * The feature id for the '<em><b>Preprocessor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_HEADER_TYPE__PREPROCESSOR_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Originating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_HEADER_TYPE__ORIGINATING_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_HEADER_TYPE__AUTHORIZATION = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_HEADER_TYPE__DOCUMENTATION = 7;

	/**
	 * The number of structural features of the '<em>Iso1030328 Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_HEADER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328TypeImpl <em>Iso1030328 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328TypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getIso1030328Type()
	 * @generated
	 */
	int ISO1030328_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Iso1030328 Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_TYPE__ISO1030328_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Uos Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_TYPE__UOS_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Uos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_TYPE__UOS = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_TYPE__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Iso1030328 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISO1030328_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.LogicalWrapperTypeImpl <em>Logical Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.LogicalWrapperTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getLogicalWrapperType()
	 * @generated
	 */
	int LOGICAL_WRAPPER_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WRAPPER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WRAPPER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WRAPPER_TYPE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WRAPPER_TYPE__POS = 3;

	/**
	 * The number of structural features of the '<em>Logical Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_WRAPPER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.LongWrapperTypeImpl <em>Long Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.LongWrapperTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getLongWrapperType()
	 * @generated
	 */
	int LONG_WRAPPER_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_WRAPPER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_WRAPPER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_WRAPPER_TYPE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_WRAPPER_TYPE__POS = 3;

	/**
	 * The number of structural features of the '<em>Long Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_WRAPPER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.StringWrapperTypeImpl <em>String Wrapper Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.StringWrapperTypeImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getStringWrapperType()
	 * @generated
	 */
	int STRING_WRAPPER_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_WRAPPER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_WRAPPER_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_WRAPPER_TYPE__PATH = 2;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_WRAPPER_TYPE__POS = 3;

	/**
	 * The number of structural features of the '<em>String Wrapper Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_WRAPPER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.UosImpl <em>Uos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.UosImpl
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getUos()
	 * @generated
	 */
	int UOS = 15;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOS__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Edo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOS__EDO = 2;

	/**
	 * The feature id for the '<em><b>Express</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOS__EXPRESS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOS__ID = 4;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOS__SCHEMA_LOCATION = 5;

	/**
	 * The number of structural features of the '<em>Uos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType <em>Aggregate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getAggregateType()
	 * @generated
	 */
	int AGGREGATE_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType <em>Attribute Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getAttributeTypeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical <em>Logical</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getLogical()
	 * @generated
	 */
	int LOGICAL = 18;

	/**
	 * The meta object id for the '<em>Aggregate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getAggregateTypeObject()
	 * @generated
	 */
	int AGGREGATE_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Array Size Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getArraySizeType()
	 * @generated
	 */
	int ARRAY_SIZE_TYPE = 20;

	/**
	 * The meta object id for the '<em>Array Size Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getArraySizeTypeBase()
	 * @generated
	 */
	int ARRAY_SIZE_TYPE_BASE = 21;

	/**
	 * The meta object id for the '<em>Attribute Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getAttributeTypeTypeObject()
	 * @generated
	 */
	int ATTRIBUTE_TYPE_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>CType Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getCTypeType()
	 * @generated
	 */
	int CTYPE_TYPE = 23;

	/**
	 * The meta object id for the '<em>Logical Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getLogicalObject()
	 * @generated
	 */
	int LOGICAL_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Pos Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getPosType()
	 * @generated
	 */
	int POS_TYPE = 25;

	/**
	 * The meta object id for the '<em>Pos Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getPosTypeBase()
	 * @generated
	 */
	int POS_TYPE_BASE = 26;

	/**
	 * The meta object id for the '<em>Seq Any URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getSeqAnyURI()
	 * @generated
	 */
	int SEQ_ANY_URI = 27;


	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Binary</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64Binary
	 * @generated
	 */
	EClass getBase64Binary();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64Binary#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64Binary#getValue()
	 * @see #getBase64Binary()
	 * @generated
	 */
	EAttribute getBase64Binary_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64Binary#getExtraBits <em>Extra Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Bits</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64Binary#getExtraBits()
	 * @see #getBase64Binary()
	 * @generated
	 */
	EAttribute getBase64Binary_ExtraBits();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType <em>Base64 Binary Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base64 Binary Wrapper Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType
	 * @generated
	 */
	EClass getBase64BinaryWrapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType#getId()
	 * @see #getBase64BinaryWrapperType()
	 * @generated
	 */
	EAttribute getBase64BinaryWrapperType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType#getPath()
	 * @see #getBase64BinaryWrapperType()
	 * @generated
	 */
	EAttribute getBase64BinaryWrapperType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType#getPos()
	 * @see #getBase64BinaryWrapperType()
	 * @generated
	 */
	EAttribute getBase64BinaryWrapperType_Pos();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType <em>Boolean Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Wrapper Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType
	 * @generated
	 */
	EClass getBooleanWrapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType#isValue()
	 * @see #getBooleanWrapperType()
	 * @generated
	 */
	EAttribute getBooleanWrapperType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType#getId()
	 * @see #getBooleanWrapperType()
	 * @generated
	 */
	EAttribute getBooleanWrapperType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType#getPath()
	 * @see #getBooleanWrapperType()
	 * @generated
	 */
	EAttribute getBooleanWrapperType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType#getPos()
	 * @see #getBooleanWrapperType()
	 * @generated
	 */
	EAttribute getBooleanWrapperType_Pos();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType <em>Decimal Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Wrapper Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType
	 * @generated
	 */
	EClass getDecimalWrapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType#getValue()
	 * @see #getDecimalWrapperType()
	 * @generated
	 */
	EAttribute getDecimalWrapperType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType#getId()
	 * @see #getDecimalWrapperType()
	 * @generated
	 */
	EAttribute getDecimalWrapperType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType#getPath()
	 * @see #getDecimalWrapperType()
	 * @generated
	 */
	EAttribute getDecimalWrapperType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType#getPos()
	 * @see #getDecimalWrapperType()
	 * @generated
	 */
	EAttribute getDecimalWrapperType_Pos();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getBase64BinaryWrapper <em>Base64 Binary Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base64 Binary Wrapper</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getBase64BinaryWrapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Base64BinaryWrapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getBooleanWrapper <em>Boolean Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean Wrapper</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getBooleanWrapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BooleanWrapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getDecimalWrapper <em>Decimal Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decimal Wrapper</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getDecimalWrapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DecimalWrapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getDoubleWrapper <em>Double Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double Wrapper</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getDoubleWrapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DoubleWrapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getEntity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getHexBinaryWrapper <em>Hex Binary Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hex Binary Wrapper</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getHexBinaryWrapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HexBinaryWrapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIntegerWrapper <em>Integer Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer Wrapper</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIntegerWrapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IntegerWrapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIso1030328 <em>Iso1030328</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iso1030328</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIso1030328()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Iso1030328();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIso1030328Header <em>Iso1030328 Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iso1030328 Header</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIso1030328Header()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Iso1030328Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getLogicalWrapper <em>Logical Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical Wrapper</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getLogicalWrapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LogicalWrapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getLongWrapper <em>Long Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long Wrapper</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getLongWrapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LongWrapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getStringWrapper <em>String Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Wrapper</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getStringWrapper()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StringWrapper();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getUos <em>Uos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getUos()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Uos();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array Size</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getArraySize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ArraySize();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getAttributeType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AttributeType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getCType <em>CType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CType</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getCType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getItemType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ItemType();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType <em>Double Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Wrapper Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType
	 * @generated
	 */
	EClass getDoubleWrapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType#getValue()
	 * @see #getDoubleWrapperType()
	 * @generated
	 */
	EAttribute getDoubleWrapperType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType#getId()
	 * @see #getDoubleWrapperType()
	 * @generated
	 */
	EAttribute getDoubleWrapperType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType#getPath()
	 * @see #getDoubleWrapperType()
	 * @generated
	 */
	EAttribute getDoubleWrapperType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType#getPos()
	 * @see #getDoubleWrapperType()
	 * @generated
	 */
	EAttribute getDoubleWrapperType_Pos();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getEdo <em>Edo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edo</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getEdo()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Edo();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getHref()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getPath()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getPos()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Pos();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getProxy()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Proxy();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity#getRef()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Ref();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinary <em>Hex Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hex Binary</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinary
	 * @generated
	 */
	EClass getHexBinary();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinary#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinary#getValue()
	 * @see #getHexBinary()
	 * @generated
	 */
	EAttribute getHexBinary_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinary#getExtraBits <em>Extra Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Bits</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinary#getExtraBits()
	 * @see #getHexBinary()
	 * @generated
	 */
	EAttribute getHexBinary_ExtraBits();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType <em>Hex Binary Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hex Binary Wrapper Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType
	 * @generated
	 */
	EClass getHexBinaryWrapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getId()
	 * @see #getHexBinaryWrapperType()
	 * @generated
	 */
	EAttribute getHexBinaryWrapperType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getPath()
	 * @see #getHexBinaryWrapperType()
	 * @generated
	 */
	EAttribute getHexBinaryWrapperType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getPos()
	 * @see #getHexBinaryWrapperType()
	 * @generated
	 */
	EAttribute getHexBinaryWrapperType_Pos();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType <em>Integer Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Wrapper Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType
	 * @generated
	 */
	EClass getIntegerWrapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType#getValue()
	 * @see #getIntegerWrapperType()
	 * @generated
	 */
	EAttribute getIntegerWrapperType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType#getId()
	 * @see #getIntegerWrapperType()
	 * @generated
	 */
	EAttribute getIntegerWrapperType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType#getPath()
	 * @see #getIntegerWrapperType()
	 * @generated
	 */
	EAttribute getIntegerWrapperType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType#getPos()
	 * @see #getIntegerWrapperType()
	 * @generated
	 */
	EAttribute getIntegerWrapperType_Pos();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType <em>Iso1030328 Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iso1030328 Header Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType
	 * @generated
	 */
	EClass getIso1030328HeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getName()
	 * @see #getIso1030328HeaderType()
	 * @generated
	 */
	EAttribute getIso1030328HeaderType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getTimeStamp()
	 * @see #getIso1030328HeaderType()
	 * @generated
	 */
	EAttribute getIso1030328HeaderType_TimeStamp();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getAuthor()
	 * @see #getIso1030328HeaderType()
	 * @generated
	 */
	EAttribute getIso1030328HeaderType_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getOrganization()
	 * @see #getIso1030328HeaderType()
	 * @generated
	 */
	EAttribute getIso1030328HeaderType_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getPreprocessorVersion <em>Preprocessor Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preprocessor Version</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getPreprocessorVersion()
	 * @see #getIso1030328HeaderType()
	 * @generated
	 */
	EAttribute getIso1030328HeaderType_PreprocessorVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getOriginatingSystem <em>Originating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originating System</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getOriginatingSystem()
	 * @see #getIso1030328HeaderType()
	 * @generated
	 */
	EAttribute getIso1030328HeaderType_OriginatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getAuthorization()
	 * @see #getIso1030328HeaderType()
	 * @generated
	 */
	EAttribute getIso1030328HeaderType_Authorization();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getDocumentation()
	 * @see #getIso1030328HeaderType()
	 * @generated
	 */
	EAttribute getIso1030328HeaderType_Documentation();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type <em>Iso1030328 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iso1030328 Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type
	 * @generated
	 */
	EClass getIso1030328Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getIso1030328Header <em>Iso1030328 Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iso1030328 Header</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getIso1030328Header()
	 * @see #getIso1030328Type()
	 * @generated
	 */
	EReference getIso1030328Type_Iso1030328Header();

	/**
	 * Returns the meta object for the attribute list '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getUosGroup <em>Uos Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uos Group</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getUosGroup()
	 * @see #getIso1030328Type()
	 * @generated
	 */
	EAttribute getIso1030328Type_UosGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getUos <em>Uos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getUos()
	 * @see #getIso1030328Type()
	 * @generated
	 */
	EReference getIso1030328Type_Uos();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getVersion()
	 * @see #getIso1030328Type()
	 * @generated
	 */
	EAttribute getIso1030328Type_Version();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType <em>Logical Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Wrapper Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType
	 * @generated
	 */
	EClass getLogicalWrapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType#getValue()
	 * @see #getLogicalWrapperType()
	 * @generated
	 */
	EAttribute getLogicalWrapperType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType#getId()
	 * @see #getLogicalWrapperType()
	 * @generated
	 */
	EAttribute getLogicalWrapperType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType#getPath()
	 * @see #getLogicalWrapperType()
	 * @generated
	 */
	EAttribute getLogicalWrapperType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType#getPos()
	 * @see #getLogicalWrapperType()
	 * @generated
	 */
	EAttribute getLogicalWrapperType_Pos();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType <em>Long Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Wrapper Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType
	 * @generated
	 */
	EClass getLongWrapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getValue()
	 * @see #getLongWrapperType()
	 * @generated
	 */
	EAttribute getLongWrapperType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getId()
	 * @see #getLongWrapperType()
	 * @generated
	 */
	EAttribute getLongWrapperType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getPath()
	 * @see #getLongWrapperType()
	 * @generated
	 */
	EAttribute getLongWrapperType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getPos()
	 * @see #getLongWrapperType()
	 * @generated
	 */
	EAttribute getLongWrapperType_Pos();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType <em>String Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Wrapper Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType
	 * @generated
	 */
	EClass getStringWrapperType();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType#getValue()
	 * @see #getStringWrapperType()
	 * @generated
	 */
	EAttribute getStringWrapperType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType#getId()
	 * @see #getStringWrapperType()
	 * @generated
	 */
	EAttribute getStringWrapperType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType#getPath()
	 * @see #getStringWrapperType()
	 * @generated
	 */
	EAttribute getStringWrapperType_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType#getPos()
	 * @see #getStringWrapperType()
	 * @generated
	 */
	EAttribute getStringWrapperType_Pos();

	/**
	 * Returns the meta object for class '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos <em>Uos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uos</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos
	 * @generated
	 */
	EClass getUos();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getConfiguration()
	 * @see #getUos()
	 * @generated
	 */
	EAttribute getUos_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getDescription()
	 * @see #getUos()
	 * @generated
	 */
	EAttribute getUos_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getEdo <em>Edo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edo</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getEdo()
	 * @see #getUos()
	 * @generated
	 */
	EAttribute getUos_Edo();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getExpress <em>Express</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Express</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getExpress()
	 * @see #getUos()
	 * @generated
	 */
	EAttribute getUos_Express();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getId()
	 * @see #getUos()
	 * @generated
	 */
	EAttribute getUos_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getSchemaLocation()
	 * @see #getUos()
	 * @generated
	 */
	EAttribute getUos_SchemaLocation();

	/**
	 * Returns the meta object for enum '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType <em>Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregate Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType
	 * @generated
	 */
	EEnum getAggregateType();

	/**
	 * Returns the meta object for enum '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType <em>Attribute Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type Type</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType
	 * @generated
	 */
	EEnum getAttributeTypeType();

	/**
	 * Returns the meta object for enum '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical <em>Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @generated
	 */
	EEnum getLogical();

	/**
	 * Returns the meta object for data type '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType <em>Aggregate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aggregate Type Object</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType
	 * @model instanceClass="org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType"
	 *        extendedMetaData="name='aggregateType:Object' baseType='aggregateType'"
	 * @generated
	 */
	EDataType getAggregateTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Array Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array Size Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='arraySize_._type' baseType='arraySize_._type_._base' minLength='1'"
	 * @generated
	 */
	EDataType getArraySizeType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Array Size Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array Size Type Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='arraySize_._type_._base' itemType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getArraySizeTypeBase();

	/**
	 * Returns the meta object for data type '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType <em>Attribute Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Attribute Type Type Object</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType
	 * @model instanceClass="org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType"
	 *        extendedMetaData="name='attributeType_._type:Object' baseType='attributeType_._type'"
	 * @generated
	 */
	EDataType getAttributeTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>CType Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CType Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='cType_._type' itemType='aggregateType'"
	 * @generated
	 */
	EDataType getCTypeType();

	/**
	 * Returns the meta object for data type '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical <em>Logical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Logical Object</em>'.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @model instanceClass="org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical"
	 *        extendedMetaData="name='logical:Object' baseType='logical'"
	 * @generated
	 */
	EDataType getLogicalObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Pos Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pos Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='pos_._type' baseType='pos_._type_._base' minLength='1'"
	 * @generated
	 */
	EDataType getPosType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Pos Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pos Type Base</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='pos_._type_._base' itemType='http://www.eclipse.org/emf/2003/XMLType#integer'"
	 * @generated
	 */
	EDataType getPosTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Seq Any URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Seq Any URI</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='Seq-anyURI' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getSeqAnyURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Base64BinaryImpl <em>Base64 Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Base64BinaryImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getBase64Binary()
		 * @generated
		 */
		EClass BASE64_BINARY = eINSTANCE.getBase64Binary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_BINARY__VALUE = eINSTANCE.getBase64Binary_Value();

		/**
		 * The meta object literal for the '<em><b>Extra Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_BINARY__EXTRA_BITS = eINSTANCE.getBase64Binary_ExtraBits();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Base64BinaryWrapperTypeImpl <em>Base64 Binary Wrapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Base64BinaryWrapperTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getBase64BinaryWrapperType()
		 * @generated
		 */
		EClass BASE64_BINARY_WRAPPER_TYPE = eINSTANCE.getBase64BinaryWrapperType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_BINARY_WRAPPER_TYPE__ID = eINSTANCE.getBase64BinaryWrapperType_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_BINARY_WRAPPER_TYPE__PATH = eINSTANCE.getBase64BinaryWrapperType_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE64_BINARY_WRAPPER_TYPE__POS = eINSTANCE.getBase64BinaryWrapperType_Pos();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.BooleanWrapperTypeImpl <em>Boolean Wrapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.BooleanWrapperTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getBooleanWrapperType()
		 * @generated
		 */
		EClass BOOLEAN_WRAPPER_TYPE = eINSTANCE.getBooleanWrapperType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_WRAPPER_TYPE__VALUE = eINSTANCE.getBooleanWrapperType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_WRAPPER_TYPE__ID = eINSTANCE.getBooleanWrapperType_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_WRAPPER_TYPE__PATH = eINSTANCE.getBooleanWrapperType_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_WRAPPER_TYPE__POS = eINSTANCE.getBooleanWrapperType_Pos();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DecimalWrapperTypeImpl <em>Decimal Wrapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DecimalWrapperTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getDecimalWrapperType()
		 * @generated
		 */
		EClass DECIMAL_WRAPPER_TYPE = eINSTANCE.getDecimalWrapperType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_WRAPPER_TYPE__VALUE = eINSTANCE.getDecimalWrapperType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_WRAPPER_TYPE__ID = eINSTANCE.getDecimalWrapperType_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_WRAPPER_TYPE__PATH = eINSTANCE.getDecimalWrapperType_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_WRAPPER_TYPE__POS = eINSTANCE.getDecimalWrapperType_Pos();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Base64 Binary Wrapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BASE64_BINARY_WRAPPER = eINSTANCE.getDocumentRoot_Base64BinaryWrapper();

		/**
		 * The meta object literal for the '<em><b>Boolean Wrapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOLEAN_WRAPPER = eINSTANCE.getDocumentRoot_BooleanWrapper();

		/**
		 * The meta object literal for the '<em><b>Decimal Wrapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DECIMAL_WRAPPER = eINSTANCE.getDocumentRoot_DecimalWrapper();

		/**
		 * The meta object literal for the '<em><b>Double Wrapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOUBLE_WRAPPER = eINSTANCE.getDocumentRoot_DoubleWrapper();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTITY = eINSTANCE.getDocumentRoot_Entity();

		/**
		 * The meta object literal for the '<em><b>Hex Binary Wrapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HEX_BINARY_WRAPPER = eINSTANCE.getDocumentRoot_HexBinaryWrapper();

		/**
		 * The meta object literal for the '<em><b>Integer Wrapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTEGER_WRAPPER = eINSTANCE.getDocumentRoot_IntegerWrapper();

		/**
		 * The meta object literal for the '<em><b>Iso1030328</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ISO1030328 = eINSTANCE.getDocumentRoot_Iso1030328();

		/**
		 * The meta object literal for the '<em><b>Iso1030328 Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ISO1030328_HEADER = eINSTANCE.getDocumentRoot_Iso1030328Header();

		/**
		 * The meta object literal for the '<em><b>Logical Wrapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOGICAL_WRAPPER = eINSTANCE.getDocumentRoot_LogicalWrapper();

		/**
		 * The meta object literal for the '<em><b>Long Wrapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LONG_WRAPPER = eINSTANCE.getDocumentRoot_LongWrapper();

		/**
		 * The meta object literal for the '<em><b>String Wrapper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRING_WRAPPER = eINSTANCE.getDocumentRoot_StringWrapper();

		/**
		 * The meta object literal for the '<em><b>Uos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UOS = eINSTANCE.getDocumentRoot_Uos();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ARRAY_SIZE = eINSTANCE.getDocumentRoot_ArraySize();

		/**
		 * The meta object literal for the '<em><b>Attribute Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ATTRIBUTE_TYPE = eINSTANCE.getDocumentRoot_AttributeType();

		/**
		 * The meta object literal for the '<em><b>CType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CTYPE = eINSTANCE.getDocumentRoot_CType();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ITEM_TYPE = eINSTANCE.getDocumentRoot_ItemType();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DoubleWrapperTypeImpl <em>Double Wrapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DoubleWrapperTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getDoubleWrapperType()
		 * @generated
		 */
		EClass DOUBLE_WRAPPER_TYPE = eINSTANCE.getDoubleWrapperType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_WRAPPER_TYPE__VALUE = eINSTANCE.getDoubleWrapperType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_WRAPPER_TYPE__ID = eINSTANCE.getDoubleWrapperType_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_WRAPPER_TYPE__PATH = eINSTANCE.getDoubleWrapperType_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_WRAPPER_TYPE__POS = eINSTANCE.getDoubleWrapperType_Pos();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Edo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__EDO = eINSTANCE.getEntity_Edo();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__HREF = eINSTANCE.getEntity_Href();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PATH = eINSTANCE.getEntity_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__POS = eINSTANCE.getEntity_Pos();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PROXY = eINSTANCE.getEntity_Proxy();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__REF = eINSTANCE.getEntity_Ref();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.HexBinaryImpl <em>Hex Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.HexBinaryImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getHexBinary()
		 * @generated
		 */
		EClass HEX_BINARY = eINSTANCE.getHexBinary();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEX_BINARY__VALUE = eINSTANCE.getHexBinary_Value();

		/**
		 * The meta object literal for the '<em><b>Extra Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEX_BINARY__EXTRA_BITS = eINSTANCE.getHexBinary_ExtraBits();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.HexBinaryWrapperTypeImpl <em>Hex Binary Wrapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.HexBinaryWrapperTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getHexBinaryWrapperType()
		 * @generated
		 */
		EClass HEX_BINARY_WRAPPER_TYPE = eINSTANCE.getHexBinaryWrapperType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEX_BINARY_WRAPPER_TYPE__ID = eINSTANCE.getHexBinaryWrapperType_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEX_BINARY_WRAPPER_TYPE__PATH = eINSTANCE.getHexBinaryWrapperType_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEX_BINARY_WRAPPER_TYPE__POS = eINSTANCE.getHexBinaryWrapperType_Pos();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.IntegerWrapperTypeImpl <em>Integer Wrapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.IntegerWrapperTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getIntegerWrapperType()
		 * @generated
		 */
		EClass INTEGER_WRAPPER_TYPE = eINSTANCE.getIntegerWrapperType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_WRAPPER_TYPE__VALUE = eINSTANCE.getIntegerWrapperType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_WRAPPER_TYPE__ID = eINSTANCE.getIntegerWrapperType_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_WRAPPER_TYPE__PATH = eINSTANCE.getIntegerWrapperType_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_WRAPPER_TYPE__POS = eINSTANCE.getIntegerWrapperType_Pos();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl <em>Iso1030328 Header Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getIso1030328HeaderType()
		 * @generated
		 */
		EClass ISO1030328_HEADER_TYPE = eINSTANCE.getIso1030328HeaderType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_HEADER_TYPE__NAME = eINSTANCE.getIso1030328HeaderType_Name();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_HEADER_TYPE__TIME_STAMP = eINSTANCE.getIso1030328HeaderType_TimeStamp();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_HEADER_TYPE__AUTHOR = eINSTANCE.getIso1030328HeaderType_Author();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_HEADER_TYPE__ORGANIZATION = eINSTANCE.getIso1030328HeaderType_Organization();

		/**
		 * The meta object literal for the '<em><b>Preprocessor Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_HEADER_TYPE__PREPROCESSOR_VERSION = eINSTANCE.getIso1030328HeaderType_PreprocessorVersion();

		/**
		 * The meta object literal for the '<em><b>Originating System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_HEADER_TYPE__ORIGINATING_SYSTEM = eINSTANCE.getIso1030328HeaderType_OriginatingSystem();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_HEADER_TYPE__AUTHORIZATION = eINSTANCE.getIso1030328HeaderType_Authorization();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_HEADER_TYPE__DOCUMENTATION = eINSTANCE.getIso1030328HeaderType_Documentation();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328TypeImpl <em>Iso1030328 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328TypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getIso1030328Type()
		 * @generated
		 */
		EClass ISO1030328_TYPE = eINSTANCE.getIso1030328Type();

		/**
		 * The meta object literal for the '<em><b>Iso1030328 Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO1030328_TYPE__ISO1030328_HEADER = eINSTANCE.getIso1030328Type_Iso1030328Header();

		/**
		 * The meta object literal for the '<em><b>Uos Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_TYPE__UOS_GROUP = eINSTANCE.getIso1030328Type_UosGroup();

		/**
		 * The meta object literal for the '<em><b>Uos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISO1030328_TYPE__UOS = eINSTANCE.getIso1030328Type_Uos();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISO1030328_TYPE__VERSION = eINSTANCE.getIso1030328Type_Version();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.LogicalWrapperTypeImpl <em>Logical Wrapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.LogicalWrapperTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getLogicalWrapperType()
		 * @generated
		 */
		EClass LOGICAL_WRAPPER_TYPE = eINSTANCE.getLogicalWrapperType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_WRAPPER_TYPE__VALUE = eINSTANCE.getLogicalWrapperType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_WRAPPER_TYPE__ID = eINSTANCE.getLogicalWrapperType_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_WRAPPER_TYPE__PATH = eINSTANCE.getLogicalWrapperType_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_WRAPPER_TYPE__POS = eINSTANCE.getLogicalWrapperType_Pos();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.LongWrapperTypeImpl <em>Long Wrapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.LongWrapperTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getLongWrapperType()
		 * @generated
		 */
		EClass LONG_WRAPPER_TYPE = eINSTANCE.getLongWrapperType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_WRAPPER_TYPE__VALUE = eINSTANCE.getLongWrapperType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_WRAPPER_TYPE__ID = eINSTANCE.getLongWrapperType_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_WRAPPER_TYPE__PATH = eINSTANCE.getLongWrapperType_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_WRAPPER_TYPE__POS = eINSTANCE.getLongWrapperType_Pos();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.StringWrapperTypeImpl <em>String Wrapper Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.StringWrapperTypeImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getStringWrapperType()
		 * @generated
		 */
		EClass STRING_WRAPPER_TYPE = eINSTANCE.getStringWrapperType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_WRAPPER_TYPE__VALUE = eINSTANCE.getStringWrapperType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_WRAPPER_TYPE__ID = eINSTANCE.getStringWrapperType_Id();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_WRAPPER_TYPE__PATH = eINSTANCE.getStringWrapperType_Path();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_WRAPPER_TYPE__POS = eINSTANCE.getStringWrapperType_Pos();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.UosImpl <em>Uos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.UosImpl
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getUos()
		 * @generated
		 */
		EClass UOS = eINSTANCE.getUos();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOS__CONFIGURATION = eINSTANCE.getUos_Configuration();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOS__DESCRIPTION = eINSTANCE.getUos_Description();

		/**
		 * The meta object literal for the '<em><b>Edo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOS__EDO = eINSTANCE.getUos_Edo();

		/**
		 * The meta object literal for the '<em><b>Express</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOS__EXPRESS = eINSTANCE.getUos_Express();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOS__ID = eINSTANCE.getUos_Id();

		/**
		 * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOS__SCHEMA_LOCATION = eINSTANCE.getUos_SchemaLocation();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType <em>Aggregate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getAggregateType()
		 * @generated
		 */
		EEnum AGGREGATE_TYPE = eINSTANCE.getAggregateType();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType <em>Attribute Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getAttributeTypeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE_TYPE = eINSTANCE.getAttributeTypeType();

		/**
		 * The meta object literal for the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical <em>Logical</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getLogical()
		 * @generated
		 */
		EEnum LOGICAL = eINSTANCE.getLogical();

		/**
		 * The meta object literal for the '<em>Aggregate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getAggregateTypeObject()
		 * @generated
		 */
		EDataType AGGREGATE_TYPE_OBJECT = eINSTANCE.getAggregateTypeObject();

		/**
		 * The meta object literal for the '<em>Array Size Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getArraySizeType()
		 * @generated
		 */
		EDataType ARRAY_SIZE_TYPE = eINSTANCE.getArraySizeType();

		/**
		 * The meta object literal for the '<em>Array Size Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getArraySizeTypeBase()
		 * @generated
		 */
		EDataType ARRAY_SIZE_TYPE_BASE = eINSTANCE.getArraySizeTypeBase();

		/**
		 * The meta object literal for the '<em>Attribute Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getAttributeTypeTypeObject()
		 * @generated
		 */
		EDataType ATTRIBUTE_TYPE_TYPE_OBJECT = eINSTANCE.getAttributeTypeTypeObject();

		/**
		 * The meta object literal for the '<em>CType Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getCTypeType()
		 * @generated
		 */
		EDataType CTYPE_TYPE = eINSTANCE.getCTypeType();

		/**
		 * The meta object literal for the '<em>Logical Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getLogicalObject()
		 * @generated
		 */
		EDataType LOGICAL_OBJECT = eINSTANCE.getLogicalObject();

		/**
		 * The meta object literal for the '<em>Pos Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getPosType()
		 * @generated
		 */
		EDataType POS_TYPE = eINSTANCE.getPosType();

		/**
		 * The meta object literal for the '<em>Pos Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getPosTypeBase()
		 * @generated
		 */
		EDataType POS_TYPE_BASE = eINSTANCE.getPosTypeBase();

		/**
		 * The meta object literal for the '<em>Seq Any URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.CommonPackageImpl#getSeqAnyURI()
		 * @generated
		 */
		EDataType SEQ_ANY_URI = eINSTANCE.getSeqAnyURI();

	}

} //CommonPackage
