/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common;

import java.math.BigInteger;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getBase64BinaryWrapper <em>Base64 Binary Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getBooleanWrapper <em>Boolean Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getDecimalWrapper <em>Decimal Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getDoubleWrapper <em>Double Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getHexBinaryWrapper <em>Hex Binary Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIntegerWrapper <em>Integer Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIso1030328 <em>Iso1030328</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIso1030328Header <em>Iso1030328 Header</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getLogicalWrapper <em>Logical Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getLongWrapper <em>Long Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getStringWrapper <em>String Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getUos <em>Uos</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getCType <em>CType</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Base64 Binary Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base64 Binary Wrapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64 Binary Wrapper</em>' containment reference.
	 * @see #setBase64BinaryWrapper(Base64BinaryWrapperType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_Base64BinaryWrapper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='base64Binary-wrapper' namespace='##targetNamespace'"
	 * @generated
	 */
	Base64BinaryWrapperType getBase64BinaryWrapper();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getBase64BinaryWrapper <em>Base64 Binary Wrapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64 Binary Wrapper</em>' containment reference.
	 * @see #getBase64BinaryWrapper()
	 * @generated
	 */
	void setBase64BinaryWrapper(Base64BinaryWrapperType value);

	/**
	 * Returns the value of the '<em><b>Boolean Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Wrapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Wrapper</em>' containment reference.
	 * @see #setBooleanWrapper(BooleanWrapperType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_BooleanWrapper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='boolean-wrapper' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanWrapperType getBooleanWrapper();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getBooleanWrapper <em>Boolean Wrapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Wrapper</em>' containment reference.
	 * @see #getBooleanWrapper()
	 * @generated
	 */
	void setBooleanWrapper(BooleanWrapperType value);

	/**
	 * Returns the value of the '<em><b>Decimal Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Wrapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Wrapper</em>' containment reference.
	 * @see #setDecimalWrapper(DecimalWrapperType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_DecimalWrapper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decimal-wrapper' namespace='##targetNamespace'"
	 * @generated
	 */
	DecimalWrapperType getDecimalWrapper();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getDecimalWrapper <em>Decimal Wrapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Wrapper</em>' containment reference.
	 * @see #getDecimalWrapper()
	 * @generated
	 */
	void setDecimalWrapper(DecimalWrapperType value);

	/**
	 * Returns the value of the '<em><b>Double Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Wrapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Wrapper</em>' containment reference.
	 * @see #setDoubleWrapper(DoubleWrapperType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_DoubleWrapper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='double-wrapper' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleWrapperType getDoubleWrapper();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getDoubleWrapper <em>Double Wrapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Wrapper</em>' containment reference.
	 * @see #getDoubleWrapper()
	 * @generated
	 */
	void setDoubleWrapper(DoubleWrapperType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_Entity()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Entity' namespace='##targetNamespace'"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Returns the value of the '<em><b>Hex Binary Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hex Binary Wrapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex Binary Wrapper</em>' containment reference.
	 * @see #setHexBinaryWrapper(HexBinaryWrapperType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_HexBinaryWrapper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hexBinary-wrapper' namespace='##targetNamespace'"
	 * @generated
	 */
	HexBinaryWrapperType getHexBinaryWrapper();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getHexBinaryWrapper <em>Hex Binary Wrapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex Binary Wrapper</em>' containment reference.
	 * @see #getHexBinaryWrapper()
	 * @generated
	 */
	void setHexBinaryWrapper(HexBinaryWrapperType value);

	/**
	 * Returns the value of the '<em><b>Integer Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Wrapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Wrapper</em>' containment reference.
	 * @see #setIntegerWrapper(IntegerWrapperType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_IntegerWrapper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='integer-wrapper' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerWrapperType getIntegerWrapper();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIntegerWrapper <em>Integer Wrapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Wrapper</em>' containment reference.
	 * @see #getIntegerWrapper()
	 * @generated
	 */
	void setIntegerWrapper(IntegerWrapperType value);

	/**
	 * Returns the value of the '<em><b>Iso1030328</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iso1030328</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso1030328</em>' containment reference.
	 * @see #setIso1030328(Iso1030328Type)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_Iso1030328()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='iso_10303_28' namespace='##targetNamespace'"
	 * @generated
	 */
	Iso1030328Type getIso1030328();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIso1030328 <em>Iso1030328</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso1030328</em>' containment reference.
	 * @see #getIso1030328()
	 * @generated
	 */
	void setIso1030328(Iso1030328Type value);

	/**
	 * Returns the value of the '<em><b>Iso1030328 Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iso1030328 Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso1030328 Header</em>' containment reference.
	 * @see #setIso1030328Header(Iso1030328HeaderType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_Iso1030328Header()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='iso_10303_28_header' namespace='##targetNamespace'"
	 * @generated
	 */
	Iso1030328HeaderType getIso1030328Header();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getIso1030328Header <em>Iso1030328 Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso1030328 Header</em>' containment reference.
	 * @see #getIso1030328Header()
	 * @generated
	 */
	void setIso1030328Header(Iso1030328HeaderType value);

	/**
	 * Returns the value of the '<em><b>Logical Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Wrapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Wrapper</em>' containment reference.
	 * @see #setLogicalWrapper(LogicalWrapperType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_LogicalWrapper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='logical-wrapper' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicalWrapperType getLogicalWrapper();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getLogicalWrapper <em>Logical Wrapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Wrapper</em>' containment reference.
	 * @see #getLogicalWrapper()
	 * @generated
	 */
	void setLogicalWrapper(LogicalWrapperType value);

	/**
	 * Returns the value of the '<em><b>Long Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Wrapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Wrapper</em>' containment reference.
	 * @see #setLongWrapper(LongWrapperType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_LongWrapper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='long-wrapper' namespace='##targetNamespace'"
	 * @generated
	 */
	LongWrapperType getLongWrapper();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getLongWrapper <em>Long Wrapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Wrapper</em>' containment reference.
	 * @see #getLongWrapper()
	 * @generated
	 */
	void setLongWrapper(LongWrapperType value);

	/**
	 * Returns the value of the '<em><b>String Wrapper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Wrapper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Wrapper</em>' containment reference.
	 * @see #setStringWrapper(StringWrapperType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_StringWrapper()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-wrapper' namespace='##targetNamespace'"
	 * @generated
	 */
	StringWrapperType getStringWrapper();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getStringWrapper <em>String Wrapper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Wrapper</em>' containment reference.
	 * @see #getStringWrapper()
	 * @generated
	 */
	void setStringWrapper(StringWrapperType value);

	/**
	 * Returns the value of the '<em><b>Uos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uos</em>' containment reference.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_Uos()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uos' namespace='##targetNamespace'"
	 * @generated
	 */
	Uos getUos();

	/**
	 * Returns the value of the '<em><b>Array Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Size</em>' attribute.
	 * @see #setArraySize(List)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_ArraySize()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.ArraySizeType" many="false"
	 *        extendedMetaData="kind='attribute' name='arraySize' namespace='##targetNamespace'"
	 * @generated
	 */
	List<BigInteger> getArraySize();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getArraySize <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Size</em>' attribute.
	 * @see #getArraySize()
	 * @generated
	 */
	void setArraySize(List<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType
	 * @see #setAttributeType(AttributeTypeType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_AttributeType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='attributeType' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeTypeType getAttributeType();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getAttributeType <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Type</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType
	 * @see #getAttributeType()
	 * @generated
	 */
	void setAttributeType(AttributeTypeType value);

	/**
	 * Returns the value of the '<em><b>CType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CType</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CType</em>' attribute.
	 * @see #setCType(List)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_CType()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.CTypeType" many="false"
	 *        extendedMetaData="kind='attribute' name='cType' namespace='##targetNamespace'"
	 * @generated
	 */
	List<AggregateType> getCType();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getCType <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CType</em>' attribute.
	 * @see #getCType()
	 * @generated
	 */
	void setCType(List<AggregateType> value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(QName)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getDocumentRoot_ItemType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='itemType' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getItemType();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(QName value);

} // DocumentRoot
