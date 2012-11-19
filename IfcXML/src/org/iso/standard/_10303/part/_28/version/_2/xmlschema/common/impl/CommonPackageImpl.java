/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.AttributeTypeType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64Binary;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Base64BinaryWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonFactory;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.DecimalWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.DocumentRoot;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.DoubleWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinary;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.IntegerWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.LogicalWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.StringWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.util.CommonValidator;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;

import org.tech.iai.ifc.xml.ifc._2x3.final_.impl.FinalPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64BinaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64BinaryWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexBinaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexBinaryWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iso1030328HeaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iso1030328TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aggregateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arraySizeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arraySizeTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attributeTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cTypeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType logicalObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType posTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType posTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType seqAnyURIEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FinalPackageImpl theFinalPackage = (FinalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FinalPackage.eNS_URI) instanceof FinalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FinalPackage.eNS_URI) : FinalPackage.eINSTANCE);

		// Load packages
		theFinalPackage.loadPackage();

		// Create package meta-data objects
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();

		// Fix loaded packages
		theFinalPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCommonPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CommonValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase64Binary() {
		return base64BinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_Value() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_ExtraBits() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase64BinaryWrapperType() {
		return base64BinaryWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64BinaryWrapperType_Id() {
		return (EAttribute)base64BinaryWrapperTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64BinaryWrapperType_Path() {
		return (EAttribute)base64BinaryWrapperTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64BinaryWrapperType_Pos() {
		return (EAttribute)base64BinaryWrapperTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanWrapperType() {
		return booleanWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanWrapperType_Value() {
		return (EAttribute)booleanWrapperTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanWrapperType_Id() {
		return (EAttribute)booleanWrapperTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanWrapperType_Path() {
		return (EAttribute)booleanWrapperTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanWrapperType_Pos() {
		return (EAttribute)booleanWrapperTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalWrapperType() {
		return decimalWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalWrapperType_Value() {
		return (EAttribute)decimalWrapperTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalWrapperType_Id() {
		return (EAttribute)decimalWrapperTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalWrapperType_Path() {
		return (EAttribute)decimalWrapperTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalWrapperType_Pos() {
		return (EAttribute)decimalWrapperTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Base64BinaryWrapper() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BooleanWrapper() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecimalWrapper() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DoubleWrapper() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Entity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HexBinaryWrapper() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IntegerWrapper() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Iso1030328() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Iso1030328Header() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LogicalWrapper() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LongWrapper() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StringWrapper() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Uos() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ArraySize() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_AttributeType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_CType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ItemType() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleWrapperType() {
		return doubleWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleWrapperType_Value() {
		return (EAttribute)doubleWrapperTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleWrapperType_Id() {
		return (EAttribute)doubleWrapperTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleWrapperType_Path() {
		return (EAttribute)doubleWrapperTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleWrapperType_Pos() {
		return (EAttribute)doubleWrapperTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Edo() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Href() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Id() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Path() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Pos() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Proxy() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Ref() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexBinary() {
		return hexBinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinary_Value() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinary_ExtraBits() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexBinaryWrapperType() {
		return hexBinaryWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinaryWrapperType_Id() {
		return (EAttribute)hexBinaryWrapperTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinaryWrapperType_Path() {
		return (EAttribute)hexBinaryWrapperTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinaryWrapperType_Pos() {
		return (EAttribute)hexBinaryWrapperTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerWrapperType() {
		return integerWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerWrapperType_Value() {
		return (EAttribute)integerWrapperTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerWrapperType_Id() {
		return (EAttribute)integerWrapperTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerWrapperType_Path() {
		return (EAttribute)integerWrapperTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerWrapperType_Pos() {
		return (EAttribute)integerWrapperTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIso1030328HeaderType() {
		return iso1030328HeaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328HeaderType_Name() {
		return (EAttribute)iso1030328HeaderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328HeaderType_TimeStamp() {
		return (EAttribute)iso1030328HeaderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328HeaderType_Author() {
		return (EAttribute)iso1030328HeaderTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328HeaderType_Organization() {
		return (EAttribute)iso1030328HeaderTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328HeaderType_PreprocessorVersion() {
		return (EAttribute)iso1030328HeaderTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328HeaderType_OriginatingSystem() {
		return (EAttribute)iso1030328HeaderTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328HeaderType_Authorization() {
		return (EAttribute)iso1030328HeaderTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328HeaderType_Documentation() {
		return (EAttribute)iso1030328HeaderTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIso1030328Type() {
		return iso1030328TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIso1030328Type_Iso1030328Header() {
		return (EReference)iso1030328TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328Type_UosGroup() {
		return (EAttribute)iso1030328TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIso1030328Type_Uos() {
		return (EReference)iso1030328TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIso1030328Type_Version() {
		return (EAttribute)iso1030328TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalWrapperType() {
		return logicalWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalWrapperType_Value() {
		return (EAttribute)logicalWrapperTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalWrapperType_Id() {
		return (EAttribute)logicalWrapperTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalWrapperType_Path() {
		return (EAttribute)logicalWrapperTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalWrapperType_Pos() {
		return (EAttribute)logicalWrapperTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongWrapperType() {
		return longWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongWrapperType_Value() {
		return (EAttribute)longWrapperTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongWrapperType_Id() {
		return (EAttribute)longWrapperTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongWrapperType_Path() {
		return (EAttribute)longWrapperTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongWrapperType_Pos() {
		return (EAttribute)longWrapperTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringWrapperType() {
		return stringWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringWrapperType_Value() {
		return (EAttribute)stringWrapperTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringWrapperType_Id() {
		return (EAttribute)stringWrapperTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringWrapperType_Path() {
		return (EAttribute)stringWrapperTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringWrapperType_Pos() {
		return (EAttribute)stringWrapperTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUos() {
		return uosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUos_Configuration() {
		return (EAttribute)uosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUos_Description() {
		return (EAttribute)uosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUos_Edo() {
		return (EAttribute)uosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUos_Express() {
		return (EAttribute)uosEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUos_Id() {
		return (EAttribute)uosEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUos_SchemaLocation() {
		return (EAttribute)uosEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregateType() {
		return aggregateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeTypeType() {
		return attributeTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogical() {
		return logicalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAggregateTypeObject() {
		return aggregateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArraySizeType() {
		return arraySizeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArraySizeTypeBase() {
		return arraySizeTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAttributeTypeTypeObject() {
		return attributeTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCTypeType() {
		return cTypeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLogicalObject() {
		return logicalObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPosType() {
		return posTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPosTypeBase() {
		return posTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSeqAnyURI() {
		return seqAnyURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		base64BinaryEClass = createEClass(BASE64_BINARY);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__VALUE);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__EXTRA_BITS);

		base64BinaryWrapperTypeEClass = createEClass(BASE64_BINARY_WRAPPER_TYPE);
		createEAttribute(base64BinaryWrapperTypeEClass, BASE64_BINARY_WRAPPER_TYPE__ID);
		createEAttribute(base64BinaryWrapperTypeEClass, BASE64_BINARY_WRAPPER_TYPE__PATH);
		createEAttribute(base64BinaryWrapperTypeEClass, BASE64_BINARY_WRAPPER_TYPE__POS);

		booleanWrapperTypeEClass = createEClass(BOOLEAN_WRAPPER_TYPE);
		createEAttribute(booleanWrapperTypeEClass, BOOLEAN_WRAPPER_TYPE__VALUE);
		createEAttribute(booleanWrapperTypeEClass, BOOLEAN_WRAPPER_TYPE__ID);
		createEAttribute(booleanWrapperTypeEClass, BOOLEAN_WRAPPER_TYPE__PATH);
		createEAttribute(booleanWrapperTypeEClass, BOOLEAN_WRAPPER_TYPE__POS);

		decimalWrapperTypeEClass = createEClass(DECIMAL_WRAPPER_TYPE);
		createEAttribute(decimalWrapperTypeEClass, DECIMAL_WRAPPER_TYPE__VALUE);
		createEAttribute(decimalWrapperTypeEClass, DECIMAL_WRAPPER_TYPE__ID);
		createEAttribute(decimalWrapperTypeEClass, DECIMAL_WRAPPER_TYPE__PATH);
		createEAttribute(decimalWrapperTypeEClass, DECIMAL_WRAPPER_TYPE__POS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BASE64_BINARY_WRAPPER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOLEAN_WRAPPER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DECIMAL_WRAPPER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOUBLE_WRAPPER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HEX_BINARY_WRAPPER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTEGER_WRAPPER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ISO1030328);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ISO1030328_HEADER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOGICAL_WRAPPER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LONG_WRAPPER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRING_WRAPPER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UOS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ARRAY_SIZE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTE_TYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CTYPE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ITEM_TYPE);

		doubleWrapperTypeEClass = createEClass(DOUBLE_WRAPPER_TYPE);
		createEAttribute(doubleWrapperTypeEClass, DOUBLE_WRAPPER_TYPE__VALUE);
		createEAttribute(doubleWrapperTypeEClass, DOUBLE_WRAPPER_TYPE__ID);
		createEAttribute(doubleWrapperTypeEClass, DOUBLE_WRAPPER_TYPE__PATH);
		createEAttribute(doubleWrapperTypeEClass, DOUBLE_WRAPPER_TYPE__POS);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__EDO);
		createEAttribute(entityEClass, ENTITY__HREF);
		createEAttribute(entityEClass, ENTITY__ID);
		createEAttribute(entityEClass, ENTITY__PATH);
		createEAttribute(entityEClass, ENTITY__POS);
		createEAttribute(entityEClass, ENTITY__PROXY);
		createEAttribute(entityEClass, ENTITY__REF);

		hexBinaryEClass = createEClass(HEX_BINARY);
		createEAttribute(hexBinaryEClass, HEX_BINARY__VALUE);
		createEAttribute(hexBinaryEClass, HEX_BINARY__EXTRA_BITS);

		hexBinaryWrapperTypeEClass = createEClass(HEX_BINARY_WRAPPER_TYPE);
		createEAttribute(hexBinaryWrapperTypeEClass, HEX_BINARY_WRAPPER_TYPE__ID);
		createEAttribute(hexBinaryWrapperTypeEClass, HEX_BINARY_WRAPPER_TYPE__PATH);
		createEAttribute(hexBinaryWrapperTypeEClass, HEX_BINARY_WRAPPER_TYPE__POS);

		integerWrapperTypeEClass = createEClass(INTEGER_WRAPPER_TYPE);
		createEAttribute(integerWrapperTypeEClass, INTEGER_WRAPPER_TYPE__VALUE);
		createEAttribute(integerWrapperTypeEClass, INTEGER_WRAPPER_TYPE__ID);
		createEAttribute(integerWrapperTypeEClass, INTEGER_WRAPPER_TYPE__PATH);
		createEAttribute(integerWrapperTypeEClass, INTEGER_WRAPPER_TYPE__POS);

		iso1030328HeaderTypeEClass = createEClass(ISO1030328_HEADER_TYPE);
		createEAttribute(iso1030328HeaderTypeEClass, ISO1030328_HEADER_TYPE__NAME);
		createEAttribute(iso1030328HeaderTypeEClass, ISO1030328_HEADER_TYPE__TIME_STAMP);
		createEAttribute(iso1030328HeaderTypeEClass, ISO1030328_HEADER_TYPE__AUTHOR);
		createEAttribute(iso1030328HeaderTypeEClass, ISO1030328_HEADER_TYPE__ORGANIZATION);
		createEAttribute(iso1030328HeaderTypeEClass, ISO1030328_HEADER_TYPE__PREPROCESSOR_VERSION);
		createEAttribute(iso1030328HeaderTypeEClass, ISO1030328_HEADER_TYPE__ORIGINATING_SYSTEM);
		createEAttribute(iso1030328HeaderTypeEClass, ISO1030328_HEADER_TYPE__AUTHORIZATION);
		createEAttribute(iso1030328HeaderTypeEClass, ISO1030328_HEADER_TYPE__DOCUMENTATION);

		iso1030328TypeEClass = createEClass(ISO1030328_TYPE);
		createEReference(iso1030328TypeEClass, ISO1030328_TYPE__ISO1030328_HEADER);
		createEAttribute(iso1030328TypeEClass, ISO1030328_TYPE__UOS_GROUP);
		createEReference(iso1030328TypeEClass, ISO1030328_TYPE__UOS);
		createEAttribute(iso1030328TypeEClass, ISO1030328_TYPE__VERSION);

		logicalWrapperTypeEClass = createEClass(LOGICAL_WRAPPER_TYPE);
		createEAttribute(logicalWrapperTypeEClass, LOGICAL_WRAPPER_TYPE__VALUE);
		createEAttribute(logicalWrapperTypeEClass, LOGICAL_WRAPPER_TYPE__ID);
		createEAttribute(logicalWrapperTypeEClass, LOGICAL_WRAPPER_TYPE__PATH);
		createEAttribute(logicalWrapperTypeEClass, LOGICAL_WRAPPER_TYPE__POS);

		longWrapperTypeEClass = createEClass(LONG_WRAPPER_TYPE);
		createEAttribute(longWrapperTypeEClass, LONG_WRAPPER_TYPE__VALUE);
		createEAttribute(longWrapperTypeEClass, LONG_WRAPPER_TYPE__ID);
		createEAttribute(longWrapperTypeEClass, LONG_WRAPPER_TYPE__PATH);
		createEAttribute(longWrapperTypeEClass, LONG_WRAPPER_TYPE__POS);

		stringWrapperTypeEClass = createEClass(STRING_WRAPPER_TYPE);
		createEAttribute(stringWrapperTypeEClass, STRING_WRAPPER_TYPE__VALUE);
		createEAttribute(stringWrapperTypeEClass, STRING_WRAPPER_TYPE__ID);
		createEAttribute(stringWrapperTypeEClass, STRING_WRAPPER_TYPE__PATH);
		createEAttribute(stringWrapperTypeEClass, STRING_WRAPPER_TYPE__POS);

		uosEClass = createEClass(UOS);
		createEAttribute(uosEClass, UOS__CONFIGURATION);
		createEAttribute(uosEClass, UOS__DESCRIPTION);
		createEAttribute(uosEClass, UOS__EDO);
		createEAttribute(uosEClass, UOS__EXPRESS);
		createEAttribute(uosEClass, UOS__ID);
		createEAttribute(uosEClass, UOS__SCHEMA_LOCATION);

		// Create enums
		aggregateTypeEEnum = createEEnum(AGGREGATE_TYPE);
		attributeTypeTypeEEnum = createEEnum(ATTRIBUTE_TYPE_TYPE);
		logicalEEnum = createEEnum(LOGICAL);

		// Create data types
		aggregateTypeObjectEDataType = createEDataType(AGGREGATE_TYPE_OBJECT);
		arraySizeTypeEDataType = createEDataType(ARRAY_SIZE_TYPE);
		arraySizeTypeBaseEDataType = createEDataType(ARRAY_SIZE_TYPE_BASE);
		attributeTypeTypeObjectEDataType = createEDataType(ATTRIBUTE_TYPE_TYPE_OBJECT);
		cTypeTypeEDataType = createEDataType(CTYPE_TYPE);
		logicalObjectEDataType = createEDataType(LOGICAL_OBJECT);
		posTypeEDataType = createEDataType(POS_TYPE);
		posTypeBaseEDataType = createEDataType(POS_TYPE_BASE);
		seqAnyURIEDataType = createEDataType(SEQ_ANY_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		base64BinaryWrapperTypeEClass.getESuperTypes().add(this.getBase64Binary());
		hexBinaryWrapperTypeEClass.getESuperTypes().add(this.getHexBinary());

		// Initialize classes and features; add operations and parameters
		initEClass(base64BinaryEClass, Base64Binary.class, "Base64Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64Binary_Value(), theXMLTypePackage.getBase64Binary(), "value", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64Binary_ExtraBits(), theXMLTypePackage.getInteger(), "extraBits", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base64BinaryWrapperTypeEClass, Base64BinaryWrapperType.class, "Base64BinaryWrapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64BinaryWrapperType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Base64BinaryWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64BinaryWrapperType_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, Base64BinaryWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64BinaryWrapperType_Pos(), this.getPosType(), "pos", null, 0, 1, Base64BinaryWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanWrapperTypeEClass, BooleanWrapperType.class, "BooleanWrapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanWrapperType_Value(), theXMLTypePackage.getBoolean(), "value", null, 0, 1, BooleanWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanWrapperType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BooleanWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanWrapperType_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, BooleanWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanWrapperType_Pos(), this.getPosType(), "pos", null, 0, 1, BooleanWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalWrapperTypeEClass, DecimalWrapperType.class, "DecimalWrapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalWrapperType_Value(), theXMLTypePackage.getDecimal(), "value", null, 0, 1, DecimalWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalWrapperType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DecimalWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalWrapperType_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, DecimalWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalWrapperType_Pos(), this.getPosType(), "pos", null, 0, 1, DecimalWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Base64BinaryWrapper(), this.getBase64BinaryWrapperType(), null, "base64BinaryWrapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BooleanWrapper(), this.getBooleanWrapperType(), null, "booleanWrapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DecimalWrapper(), this.getDecimalWrapperType(), null, "decimalWrapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DoubleWrapper(), this.getDoubleWrapperType(), null, "doubleWrapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Entity(), this.getEntity(), null, "entity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HexBinaryWrapper(), this.getHexBinaryWrapperType(), null, "hexBinaryWrapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IntegerWrapper(), this.getIntegerWrapperType(), null, "integerWrapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Iso1030328(), this.getIso1030328Type(), null, "iso1030328", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Iso1030328Header(), this.getIso1030328HeaderType(), null, "iso1030328Header", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LogicalWrapper(), this.getLogicalWrapperType(), null, "logicalWrapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LongWrapper(), this.getLongWrapperType(), null, "longWrapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StringWrapper(), this.getStringWrapperType(), null, "stringWrapper", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Uos(), this.getUos(), null, "uos", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ArraySize(), this.getArraySizeType(), "arraySize", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_AttributeType(), this.getAttributeTypeType(), "attributeType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_CType(), this.getCTypeType(), "cType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ItemType(), theXMLTypePackage.getQName(), "itemType", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleWrapperTypeEClass, DoubleWrapperType.class, "DoubleWrapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleWrapperType_Value(), theXMLTypePackage.getDouble(), "value", null, 0, 1, DoubleWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleWrapperType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DoubleWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleWrapperType_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, DoubleWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleWrapperType_Pos(), this.getPosType(), "pos", null, 0, 1, DoubleWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Edo(), theXMLTypePackage.getAnyURI(), "edo", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Pos(), this.getPosType(), "pos", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Proxy(), theXMLTypePackage.getIDREF(), "proxy", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hexBinaryEClass, HexBinary.class, "HexBinary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexBinary_Value(), theXMLTypePackage.getHexBinary(), "value", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinary_ExtraBits(), theXMLTypePackage.getInteger(), "extraBits", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hexBinaryWrapperTypeEClass, HexBinaryWrapperType.class, "HexBinaryWrapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexBinaryWrapperType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, HexBinaryWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinaryWrapperType_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, HexBinaryWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinaryWrapperType_Pos(), this.getPosType(), "pos", null, 0, 1, HexBinaryWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerWrapperTypeEClass, IntegerWrapperType.class, "IntegerWrapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerWrapperType_Value(), theXMLTypePackage.getInteger(), "value", null, 0, 1, IntegerWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerWrapperType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, IntegerWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerWrapperType_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, IntegerWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerWrapperType_Pos(), this.getPosType(), "pos", null, 0, 1, IntegerWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iso1030328HeaderTypeEClass, Iso1030328HeaderType.class, "Iso1030328HeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIso1030328HeaderType_Name(), theXMLTypePackage.getAnyURI(), "name", null, 1, 1, Iso1030328HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIso1030328HeaderType_TimeStamp(), theXMLTypePackage.getDateTime(), "timeStamp", null, 1, 1, Iso1030328HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIso1030328HeaderType_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, Iso1030328HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIso1030328HeaderType_Organization(), theXMLTypePackage.getString(), "organization", null, 1, 1, Iso1030328HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIso1030328HeaderType_PreprocessorVersion(), theXMLTypePackage.getString(), "preprocessorVersion", null, 1, 1, Iso1030328HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIso1030328HeaderType_OriginatingSystem(), theXMLTypePackage.getString(), "originatingSystem", null, 1, 1, Iso1030328HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIso1030328HeaderType_Authorization(), theXMLTypePackage.getString(), "authorization", null, 1, 1, Iso1030328HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIso1030328HeaderType_Documentation(), theXMLTypePackage.getString(), "documentation", null, 1, 1, Iso1030328HeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iso1030328TypeEClass, Iso1030328Type.class, "Iso1030328Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIso1030328Type_Iso1030328Header(), this.getIso1030328HeaderType(), null, "iso1030328Header", null, 0, 1, Iso1030328Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIso1030328Type_UosGroup(), ecorePackage.getEFeatureMapEntry(), "uosGroup", null, 1, 1, Iso1030328Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIso1030328Type_Uos(), this.getUos(), null, "uos", null, 1, 1, Iso1030328Type.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIso1030328Type_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, Iso1030328Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalWrapperTypeEClass, LogicalWrapperType.class, "LogicalWrapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalWrapperType_Value(), this.getLogical(), "value", null, 0, 1, LogicalWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalWrapperType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, LogicalWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalWrapperType_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, LogicalWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicalWrapperType_Pos(), this.getPosType(), "pos", null, 0, 1, LogicalWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longWrapperTypeEClass, LongWrapperType.class, "LongWrapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongWrapperType_Value(), theXMLTypePackage.getLong(), "value", null, 0, 1, LongWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongWrapperType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, LongWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongWrapperType_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, LongWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongWrapperType_Pos(), this.getPosType(), "pos", null, 0, 1, LongWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringWrapperTypeEClass, StringWrapperType.class, "StringWrapperType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringWrapperType_Value(), theXMLTypePackage.getNormalizedString(), "value", null, 0, 1, StringWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringWrapperType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, StringWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringWrapperType_Path(), theXMLTypePackage.getNMTOKENS(), "path", null, 0, 1, StringWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringWrapperType_Pos(), this.getPosType(), "pos", null, 0, 1, StringWrapperType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uosEClass, Uos.class, "Uos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUos_Configuration(), this.getSeqAnyURI(), "configuration", null, 0, 1, Uos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUos_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Uos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUos_Edo(), theXMLTypePackage.getAnyURI(), "edo", null, 0, 1, Uos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUos_Express(), this.getSeqAnyURI(), "express", null, 0, 1, Uos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUos_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, Uos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUos_SchemaLocation(), this.getSeqAnyURI(), "schemaLocation", null, 0, 1, Uos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aggregateTypeEEnum, AggregateType.class, "AggregateType");
		addEEnumLiteral(aggregateTypeEEnum, AggregateType.ARRAY);
		addEEnumLiteral(aggregateTypeEEnum, AggregateType.LIST);
		addEEnumLiteral(aggregateTypeEEnum, AggregateType.SET);
		addEEnumLiteral(aggregateTypeEEnum, AggregateType.BAG);
		addEEnumLiteral(aggregateTypeEEnum, AggregateType.ARRAY_UNIQUE);
		addEEnumLiteral(aggregateTypeEEnum, AggregateType.ARRAY_OPTIONAL);
		addEEnumLiteral(aggregateTypeEEnum, AggregateType.ARRAY_OPTIONAL_UNIQUE);
		addEEnumLiteral(aggregateTypeEEnum, AggregateType.LIST_UNIQUE);

		initEEnum(attributeTypeTypeEEnum, AttributeTypeType.class, "AttributeTypeType");
		addEEnumLiteral(attributeTypeTypeEEnum, AttributeTypeType.EXPLICIT);
		addEEnumLiteral(attributeTypeTypeEEnum, AttributeTypeType.INVERSE);
		addEEnumLiteral(attributeTypeTypeEEnum, AttributeTypeType.DERIVED);
		addEEnumLiteral(attributeTypeTypeEEnum, AttributeTypeType.RENAMED);

		initEEnum(logicalEEnum, Logical.class, "Logical");
		addEEnumLiteral(logicalEEnum, Logical.FALSE);
		addEEnumLiteral(logicalEEnum, Logical.TRUE);
		addEEnumLiteral(logicalEEnum, Logical.UNKNOWN);

		// Initialize data types
		initEDataType(aggregateTypeObjectEDataType, AggregateType.class, "AggregateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(arraySizeTypeEDataType, List.class, "ArraySizeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(arraySizeTypeBaseEDataType, List.class, "ArraySizeTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(attributeTypeTypeObjectEDataType, AttributeTypeType.class, "AttributeTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cTypeTypeEDataType, List.class, "CTypeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(logicalObjectEDataType, Logical.class, "LogicalObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(posTypeEDataType, List.class, "PosType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(posTypeBaseEDataType, List.class, "PosTypeBase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(seqAnyURIEDataType, List.class, "SeqAnyURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (aggregateTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "aggregateType"
		   });		
		addAnnotation
		  (aggregateTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "aggregateType:Object",
			 "baseType", "aggregateType"
		   });		
		addAnnotation
		  (arraySizeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "arraySize_._type",
			 "baseType", "arraySize_._type_._base",
			 "minLength", "1"
		   });		
		addAnnotation
		  (arraySizeTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "arraySize_._type_._base",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });		
		addAnnotation
		  (attributeTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "attributeType_._type"
		   });		
		addAnnotation
		  (attributeTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "attributeType_._type:Object",
			 "baseType", "attributeType_._type"
		   });		
		addAnnotation
		  (base64BinaryEClass, 
		   source, 
		   new String[] {
			 "name", "base64Binary",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBase64Binary_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBase64Binary_ExtraBits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extraBits"
		   });		
		addAnnotation
		  (base64BinaryWrapperTypeEClass, 
		   source, 
		   new String[] {
			 "name", "base64Binary-wrapper_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBase64BinaryWrapperType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getBase64BinaryWrapperType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getBase64BinaryWrapperType_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (booleanWrapperTypeEClass, 
		   source, 
		   new String[] {
			 "name", "boolean-wrapper_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBooleanWrapperType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBooleanWrapperType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getBooleanWrapperType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getBooleanWrapperType_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (cTypeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "cType_._type",
			 "itemType", "aggregateType"
		   });		
		addAnnotation
		  (decimalWrapperTypeEClass, 
		   source, 
		   new String[] {
			 "name", "decimal-wrapper_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDecimalWrapperType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDecimalWrapperType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDecimalWrapperType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getDecimalWrapperType_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Base64BinaryWrapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "base64Binary-wrapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_BooleanWrapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean-wrapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DecimalWrapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "decimal-wrapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DoubleWrapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "double-wrapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Entity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Entity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HexBinaryWrapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hexBinary-wrapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_IntegerWrapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer-wrapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Iso1030328(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "iso_10303_28",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Iso1030328Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "iso_10303_28_header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LogicalWrapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "logical-wrapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LongWrapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "long-wrapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StringWrapper(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string-wrapper",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Uos(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "uos",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ArraySize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arraySize",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AttributeType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attributeType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_CType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ItemType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "itemType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (doubleWrapperTypeEClass, 
		   source, 
		   new String[] {
			 "name", "double-wrapper_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDoubleWrapperType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDoubleWrapperType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDoubleWrapperType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getDoubleWrapperType_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "name", "Entity",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEntity_Edo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "edo"
		   });		
		addAnnotation
		  (getEntity_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href"
		   });		
		addAnnotation
		  (getEntity_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getEntity_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getEntity_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (getEntity_Proxy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "proxy"
		   });		
		addAnnotation
		  (getEntity_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (hexBinaryEClass, 
		   source, 
		   new String[] {
			 "name", "hexBinary",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getHexBinary_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getHexBinary_ExtraBits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extraBits"
		   });		
		addAnnotation
		  (hexBinaryWrapperTypeEClass, 
		   source, 
		   new String[] {
			 "name", "hexBinary-wrapper_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getHexBinaryWrapperType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getHexBinaryWrapperType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getHexBinaryWrapperType_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (integerWrapperTypeEClass, 
		   source, 
		   new String[] {
			 "name", "integer-wrapper_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getIntegerWrapperType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getIntegerWrapperType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getIntegerWrapperType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getIntegerWrapperType_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (iso1030328HeaderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "iso_10303_28_header_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIso1030328HeaderType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIso1030328HeaderType_TimeStamp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "time_stamp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIso1030328HeaderType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIso1030328HeaderType_Organization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "organization",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIso1030328HeaderType_PreprocessorVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preprocessor_version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIso1030328HeaderType_OriginatingSystem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "originating_system",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIso1030328HeaderType_Authorization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authorization",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIso1030328HeaderType_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (iso1030328TypeEClass, 
		   source, 
		   new String[] {
			 "name", "iso_10303_28_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIso1030328Type_Iso1030328Header(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "iso_10303_28_header",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIso1030328Type_UosGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "uos:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIso1030328Type_Uos(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "uos",
			 "namespace", "##targetNamespace",
			 "group", "uos:group"
		   });		
		addAnnotation
		  (getIso1030328Type_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (logicalEEnum, 
		   source, 
		   new String[] {
			 "name", "logical"
		   });		
		addAnnotation
		  (logicalObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "logical:Object",
			 "baseType", "logical"
		   });		
		addAnnotation
		  (logicalWrapperTypeEClass, 
		   source, 
		   new String[] {
			 "name", "logical-wrapper_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLogicalWrapperType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLogicalWrapperType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getLogicalWrapperType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getLogicalWrapperType_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (longWrapperTypeEClass, 
		   source, 
		   new String[] {
			 "name", "long-wrapper_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLongWrapperType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLongWrapperType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getLongWrapperType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getLongWrapperType_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (posTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "pos_._type",
			 "baseType", "pos_._type_._base",
			 "minLength", "1"
		   });		
		addAnnotation
		  (posTypeBaseEDataType, 
		   source, 
		   new String[] {
			 "name", "pos_._type_._base",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });		
		addAnnotation
		  (seqAnyURIEDataType, 
		   source, 
		   new String[] {
			 "name", "Seq-anyURI",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (stringWrapperTypeEClass, 
		   source, 
		   new String[] {
			 "name", "string-wrapper_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getStringWrapperType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getStringWrapperType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getStringWrapperType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getStringWrapperType_Pos(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pos"
		   });		
		addAnnotation
		  (uosEClass, 
		   source, 
		   new String[] {
			 "name", "uos",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getUos_Configuration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "configuration"
		   });		
		addAnnotation
		  (getUos_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });		
		addAnnotation
		  (getUos_Edo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "edo"
		   });		
		addAnnotation
		  (getUos_Express(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "express"
		   });		
		addAnnotation
		  (getUos_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getUos_SchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schemaLocation"
		   });
	}

} //CommonPackageImpl
