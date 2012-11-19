/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common.impl;

import java.math.BigInteger;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getBase64BinaryWrapper <em>Base64 Binary Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getBooleanWrapper <em>Boolean Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getDecimalWrapper <em>Decimal Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getDoubleWrapper <em>Double Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getHexBinaryWrapper <em>Hex Binary Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getIntegerWrapper <em>Integer Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getIso1030328 <em>Iso1030328</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getIso1030328Header <em>Iso1030328 Header</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getLogicalWrapper <em>Logical Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getLongWrapper <em>Long Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getStringWrapper <em>String Wrapper</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getUos <em>Uos</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getCType <em>CType</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.DocumentRootImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

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
	 * The default value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeTypeType ATTRIBUTE_TYPE_EDEFAULT = AttributeTypeType.EXPLICIT;

	/**
	 * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected AttributeTypeType attributeType = ATTRIBUTE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCType() <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCType()
	 * @generated
	 * @ordered
	 */
	protected static final List<AggregateType> CTYPE_EDEFAULT = null;

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
	protected static final QName ITEM_TYPE_EDEFAULT = null;

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
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CommonPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64BinaryWrapperType getBase64BinaryWrapper() {
		return (Base64BinaryWrapperType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__BASE64_BINARY_WRAPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64BinaryWrapper(Base64BinaryWrapperType newBase64BinaryWrapper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__BASE64_BINARY_WRAPPER, newBase64BinaryWrapper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase64BinaryWrapper(Base64BinaryWrapperType newBase64BinaryWrapper) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__BASE64_BINARY_WRAPPER, newBase64BinaryWrapper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanWrapperType getBooleanWrapper() {
		return (BooleanWrapperType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__BOOLEAN_WRAPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanWrapper(BooleanWrapperType newBooleanWrapper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__BOOLEAN_WRAPPER, newBooleanWrapper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanWrapper(BooleanWrapperType newBooleanWrapper) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__BOOLEAN_WRAPPER, newBooleanWrapper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalWrapperType getDecimalWrapper() {
		return (DecimalWrapperType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__DECIMAL_WRAPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecimalWrapper(DecimalWrapperType newDecimalWrapper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__DECIMAL_WRAPPER, newDecimalWrapper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalWrapper(DecimalWrapperType newDecimalWrapper) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__DECIMAL_WRAPPER, newDecimalWrapper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleWrapperType getDoubleWrapper() {
		return (DoubleWrapperType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__DOUBLE_WRAPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoubleWrapper(DoubleWrapperType newDoubleWrapper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__DOUBLE_WRAPPER, newDoubleWrapper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleWrapper(DoubleWrapperType newDoubleWrapper) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__DOUBLE_WRAPPER, newDoubleWrapper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		return (Entity)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__ENTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__ENTITY, newEntity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexBinaryWrapperType getHexBinaryWrapper() {
		return (HexBinaryWrapperType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__HEX_BINARY_WRAPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHexBinaryWrapper(HexBinaryWrapperType newHexBinaryWrapper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__HEX_BINARY_WRAPPER, newHexBinaryWrapper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHexBinaryWrapper(HexBinaryWrapperType newHexBinaryWrapper) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__HEX_BINARY_WRAPPER, newHexBinaryWrapper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerWrapperType getIntegerWrapper() {
		return (IntegerWrapperType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__INTEGER_WRAPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegerWrapper(IntegerWrapperType newIntegerWrapper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__INTEGER_WRAPPER, newIntegerWrapper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerWrapper(IntegerWrapperType newIntegerWrapper) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__INTEGER_WRAPPER, newIntegerWrapper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iso1030328Type getIso1030328() {
		return (Iso1030328Type)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__ISO1030328, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIso1030328(Iso1030328Type newIso1030328, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__ISO1030328, newIso1030328, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIso1030328(Iso1030328Type newIso1030328) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__ISO1030328, newIso1030328);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iso1030328HeaderType getIso1030328Header() {
		return (Iso1030328HeaderType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__ISO1030328_HEADER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIso1030328Header(Iso1030328HeaderType newIso1030328Header, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__ISO1030328_HEADER, newIso1030328Header, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIso1030328Header(Iso1030328HeaderType newIso1030328Header) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__ISO1030328_HEADER, newIso1030328Header);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalWrapperType getLogicalWrapper() {
		return (LogicalWrapperType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__LOGICAL_WRAPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalWrapper(LogicalWrapperType newLogicalWrapper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__LOGICAL_WRAPPER, newLogicalWrapper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalWrapper(LogicalWrapperType newLogicalWrapper) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__LOGICAL_WRAPPER, newLogicalWrapper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongWrapperType getLongWrapper() {
		return (LongWrapperType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__LONG_WRAPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongWrapper(LongWrapperType newLongWrapper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__LONG_WRAPPER, newLongWrapper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongWrapper(LongWrapperType newLongWrapper) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__LONG_WRAPPER, newLongWrapper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringWrapperType getStringWrapper() {
		return (StringWrapperType)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__STRING_WRAPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringWrapper(StringWrapperType newStringWrapper, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__STRING_WRAPPER, newStringWrapper, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringWrapper(StringWrapperType newStringWrapper) {
		((FeatureMap.Internal)getMixed()).set(CommonPackage.Literals.DOCUMENT_ROOT__STRING_WRAPPER, newStringWrapper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uos getUos() {
		return (Uos)getMixed().get(CommonPackage.Literals.DOCUMENT_ROOT__UOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUos(Uos newUos, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CommonPackage.Literals.DOCUMENT_ROOT__UOS, newUos, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT_ROOT__ARRAY_SIZE, oldArraySize, arraySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeType getAttributeType() {
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeType(AttributeTypeType newAttributeType) {
		AttributeTypeType oldAttributeType = attributeType;
		attributeType = newAttributeType == null ? ATTRIBUTE_TYPE_EDEFAULT : newAttributeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT_ROOT__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT_ROOT__CTYPE, oldCType, cType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DOCUMENT_ROOT__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CommonPackage.DOCUMENT_ROOT__BASE64_BINARY_WRAPPER:
				return basicSetBase64BinaryWrapper(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__BOOLEAN_WRAPPER:
				return basicSetBooleanWrapper(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__DECIMAL_WRAPPER:
				return basicSetDecimalWrapper(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__DOUBLE_WRAPPER:
				return basicSetDoubleWrapper(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__ENTITY:
				return basicSetEntity(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__HEX_BINARY_WRAPPER:
				return basicSetHexBinaryWrapper(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__INTEGER_WRAPPER:
				return basicSetIntegerWrapper(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__ISO1030328:
				return basicSetIso1030328(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__ISO1030328_HEADER:
				return basicSetIso1030328Header(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__LOGICAL_WRAPPER:
				return basicSetLogicalWrapper(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__LONG_WRAPPER:
				return basicSetLongWrapper(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__STRING_WRAPPER:
				return basicSetStringWrapper(null, msgs);
			case CommonPackage.DOCUMENT_ROOT__UOS:
				return basicSetUos(null, msgs);
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
			case CommonPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CommonPackage.DOCUMENT_ROOT__BASE64_BINARY_WRAPPER:
				return getBase64BinaryWrapper();
			case CommonPackage.DOCUMENT_ROOT__BOOLEAN_WRAPPER:
				return getBooleanWrapper();
			case CommonPackage.DOCUMENT_ROOT__DECIMAL_WRAPPER:
				return getDecimalWrapper();
			case CommonPackage.DOCUMENT_ROOT__DOUBLE_WRAPPER:
				return getDoubleWrapper();
			case CommonPackage.DOCUMENT_ROOT__ENTITY:
				return getEntity();
			case CommonPackage.DOCUMENT_ROOT__HEX_BINARY_WRAPPER:
				return getHexBinaryWrapper();
			case CommonPackage.DOCUMENT_ROOT__INTEGER_WRAPPER:
				return getIntegerWrapper();
			case CommonPackage.DOCUMENT_ROOT__ISO1030328:
				return getIso1030328();
			case CommonPackage.DOCUMENT_ROOT__ISO1030328_HEADER:
				return getIso1030328Header();
			case CommonPackage.DOCUMENT_ROOT__LOGICAL_WRAPPER:
				return getLogicalWrapper();
			case CommonPackage.DOCUMENT_ROOT__LONG_WRAPPER:
				return getLongWrapper();
			case CommonPackage.DOCUMENT_ROOT__STRING_WRAPPER:
				return getStringWrapper();
			case CommonPackage.DOCUMENT_ROOT__UOS:
				return getUos();
			case CommonPackage.DOCUMENT_ROOT__ARRAY_SIZE:
				return getArraySize();
			case CommonPackage.DOCUMENT_ROOT__ATTRIBUTE_TYPE:
				return getAttributeType();
			case CommonPackage.DOCUMENT_ROOT__CTYPE:
				return getCType();
			case CommonPackage.DOCUMENT_ROOT__ITEM_TYPE:
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
			case CommonPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__BASE64_BINARY_WRAPPER:
				setBase64BinaryWrapper((Base64BinaryWrapperType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__BOOLEAN_WRAPPER:
				setBooleanWrapper((BooleanWrapperType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__DECIMAL_WRAPPER:
				setDecimalWrapper((DecimalWrapperType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__DOUBLE_WRAPPER:
				setDoubleWrapper((DoubleWrapperType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__HEX_BINARY_WRAPPER:
				setHexBinaryWrapper((HexBinaryWrapperType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__INTEGER_WRAPPER:
				setIntegerWrapper((IntegerWrapperType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__ISO1030328:
				setIso1030328((Iso1030328Type)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__ISO1030328_HEADER:
				setIso1030328Header((Iso1030328HeaderType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__LOGICAL_WRAPPER:
				setLogicalWrapper((LogicalWrapperType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__LONG_WRAPPER:
				setLongWrapper((LongWrapperType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__STRING_WRAPPER:
				setStringWrapper((StringWrapperType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__ARRAY_SIZE:
				setArraySize((List<BigInteger>)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__ATTRIBUTE_TYPE:
				setAttributeType((AttributeTypeType)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__CTYPE:
				setCType((List<AggregateType>)newValue);
				return;
			case CommonPackage.DOCUMENT_ROOT__ITEM_TYPE:
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
			case CommonPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CommonPackage.DOCUMENT_ROOT__BASE64_BINARY_WRAPPER:
				setBase64BinaryWrapper((Base64BinaryWrapperType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__BOOLEAN_WRAPPER:
				setBooleanWrapper((BooleanWrapperType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__DECIMAL_WRAPPER:
				setDecimalWrapper((DecimalWrapperType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__DOUBLE_WRAPPER:
				setDoubleWrapper((DoubleWrapperType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__HEX_BINARY_WRAPPER:
				setHexBinaryWrapper((HexBinaryWrapperType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__INTEGER_WRAPPER:
				setIntegerWrapper((IntegerWrapperType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__ISO1030328:
				setIso1030328((Iso1030328Type)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__ISO1030328_HEADER:
				setIso1030328Header((Iso1030328HeaderType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__LOGICAL_WRAPPER:
				setLogicalWrapper((LogicalWrapperType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__LONG_WRAPPER:
				setLongWrapper((LongWrapperType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__STRING_WRAPPER:
				setStringWrapper((StringWrapperType)null);
				return;
			case CommonPackage.DOCUMENT_ROOT__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
				return;
			case CommonPackage.DOCUMENT_ROOT__ATTRIBUTE_TYPE:
				setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
				return;
			case CommonPackage.DOCUMENT_ROOT__CTYPE:
				setCType(CTYPE_EDEFAULT);
				return;
			case CommonPackage.DOCUMENT_ROOT__ITEM_TYPE:
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
			case CommonPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CommonPackage.DOCUMENT_ROOT__BASE64_BINARY_WRAPPER:
				return getBase64BinaryWrapper() != null;
			case CommonPackage.DOCUMENT_ROOT__BOOLEAN_WRAPPER:
				return getBooleanWrapper() != null;
			case CommonPackage.DOCUMENT_ROOT__DECIMAL_WRAPPER:
				return getDecimalWrapper() != null;
			case CommonPackage.DOCUMENT_ROOT__DOUBLE_WRAPPER:
				return getDoubleWrapper() != null;
			case CommonPackage.DOCUMENT_ROOT__ENTITY:
				return getEntity() != null;
			case CommonPackage.DOCUMENT_ROOT__HEX_BINARY_WRAPPER:
				return getHexBinaryWrapper() != null;
			case CommonPackage.DOCUMENT_ROOT__INTEGER_WRAPPER:
				return getIntegerWrapper() != null;
			case CommonPackage.DOCUMENT_ROOT__ISO1030328:
				return getIso1030328() != null;
			case CommonPackage.DOCUMENT_ROOT__ISO1030328_HEADER:
				return getIso1030328Header() != null;
			case CommonPackage.DOCUMENT_ROOT__LOGICAL_WRAPPER:
				return getLogicalWrapper() != null;
			case CommonPackage.DOCUMENT_ROOT__LONG_WRAPPER:
				return getLongWrapper() != null;
			case CommonPackage.DOCUMENT_ROOT__STRING_WRAPPER:
				return getStringWrapper() != null;
			case CommonPackage.DOCUMENT_ROOT__UOS:
				return getUos() != null;
			case CommonPackage.DOCUMENT_ROOT__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
			case CommonPackage.DOCUMENT_ROOT__ATTRIBUTE_TYPE:
				return attributeType != ATTRIBUTE_TYPE_EDEFAULT;
			case CommonPackage.DOCUMENT_ROOT__CTYPE:
				return CTYPE_EDEFAULT == null ? cType != null : !CTYPE_EDEFAULT.equals(cType);
			case CommonPackage.DOCUMENT_ROOT__ITEM_TYPE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", attributeType: ");
		result.append(attributeType);
		result.append(", cType: ");
		result.append(cType);
		result.append(", itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
