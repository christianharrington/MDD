/**
 */
package lightast.impl;

import lightast.BIMServerCredentials;
import lightast.Lamp;
import lightast.LampType;
import lightast.LightFixture;
import lightast.LightFixtureType;
import lightast.LightastFactory;
import lightast.LightastPackage;
import lightast.Main;

import lightast.Material;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LightastPackageImpl extends EPackageImpl implements LightastPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bimServerCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightFixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lampTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lightFixtureTypeEEnum = null;

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
	 * @see lightast.LightastPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LightastPackageImpl() {
		super(eNS_URI, LightastFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LightastPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LightastPackage init() {
		if (isInited) return (LightastPackage)EPackage.Registry.INSTANCE.getEPackage(LightastPackage.eNS_URI);

		// Obtain or create and register package
		LightastPackageImpl theLightastPackage = (LightastPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LightastPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LightastPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLightastPackage.createPackageContents();

		// Initialize created meta-data
		theLightastPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLightastPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LightastPackage.eNS_URI, theLightastPackage);
		return theLightastPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBIMServerCredentials() {
		return bimServerCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBIMServerCredentials_Address() {
		return (EAttribute)bimServerCredentialsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBIMServerCredentials_Port() {
		return (EAttribute)bimServerCredentialsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBIMServerCredentials_ProjectName() {
		return (EAttribute)bimServerCredentialsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBIMServerCredentials_UserName() {
		return (EAttribute)bimServerCredentialsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBIMServerCredentials_Password() {
		return (EAttribute)bimServerCredentialsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_BIMServer() {
		return (EReference)mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Fixtures() {
		return (EReference)mainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLamp() {
		return lampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLamp_GlobalID() {
		return (EAttribute)lampEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLamp_PredefinedType() {
		return (EAttribute)lampEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLamp_ConsistsOf() {
		return (EReference)lampEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterial() {
		return materialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterial_Name() {
		return (EAttribute)materialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterial_Description() {
		return (EAttribute)materialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightFixture() {
		return lightFixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLightFixture_ConsistsOf() {
		return (EReference)lightFixtureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightFixture_PredefinedType() {
		return (EAttribute)lightFixtureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLightFixture_Lamps() {
		return (EReference)lightFixtureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLampType() {
		return lampTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLightFixtureType() {
		return lightFixtureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightastFactory getLightastFactory() {
		return (LightastFactory)getEFactoryInstance();
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
		bimServerCredentialsEClass = createEClass(BIM_SERVER_CREDENTIALS);
		createEAttribute(bimServerCredentialsEClass, BIM_SERVER_CREDENTIALS__ADDRESS);
		createEAttribute(bimServerCredentialsEClass, BIM_SERVER_CREDENTIALS__PORT);
		createEAttribute(bimServerCredentialsEClass, BIM_SERVER_CREDENTIALS__PROJECT_NAME);
		createEAttribute(bimServerCredentialsEClass, BIM_SERVER_CREDENTIALS__USER_NAME);
		createEAttribute(bimServerCredentialsEClass, BIM_SERVER_CREDENTIALS__PASSWORD);

		mainEClass = createEClass(MAIN);
		createEReference(mainEClass, MAIN__BIM_SERVER);
		createEReference(mainEClass, MAIN__FIXTURES);

		lampEClass = createEClass(LAMP);
		createEAttribute(lampEClass, LAMP__GLOBAL_ID);
		createEAttribute(lampEClass, LAMP__PREDEFINED_TYPE);
		createEReference(lampEClass, LAMP__CONSISTS_OF);

		materialEClass = createEClass(MATERIAL);
		createEAttribute(materialEClass, MATERIAL__NAME);
		createEAttribute(materialEClass, MATERIAL__DESCRIPTION);

		lightFixtureEClass = createEClass(LIGHT_FIXTURE);
		createEReference(lightFixtureEClass, LIGHT_FIXTURE__CONSISTS_OF);
		createEAttribute(lightFixtureEClass, LIGHT_FIXTURE__PREDEFINED_TYPE);
		createEReference(lightFixtureEClass, LIGHT_FIXTURE__LAMPS);

		// Create enums
		lampTypeEEnum = createEEnum(LAMP_TYPE);
		lightFixtureTypeEEnum = createEEnum(LIGHT_FIXTURE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(bimServerCredentialsEClass, BIMServerCredentials.class, "BIMServerCredentials", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBIMServerCredentials_Address(), ecorePackage.getEString(), "address", null, 0, 1, BIMServerCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBIMServerCredentials_Port(), ecorePackage.getEString(), "port", null, 0, 1, BIMServerCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBIMServerCredentials_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, BIMServerCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBIMServerCredentials_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, BIMServerCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBIMServerCredentials_Password(), ecorePackage.getEString(), "password", null, 0, 1, BIMServerCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMain_BIMServer(), this.getBIMServerCredentials(), null, "BIMServer", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Fixtures(), this.getLightFixture(), null, "fixtures", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lampEClass, Lamp.class, "Lamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLamp_GlobalID(), ecorePackage.getEString(), "GlobalID", null, 0, 1, Lamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLamp_PredefinedType(), this.getLampType(), "PredefinedType", null, 1, 1, Lamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLamp_ConsistsOf(), this.getMaterial(), null, "consistsOf", null, 0, 1, Lamp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaterial_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Material.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterial_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Material.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightFixtureEClass, LightFixture.class, "LightFixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLightFixture_ConsistsOf(), this.getMaterial(), null, "consistsOf", null, 0, 1, LightFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLightFixture_PredefinedType(), this.getLightFixtureType(), "PredefinedType", null, 1, 1, LightFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLightFixture_Lamps(), this.getLamp(), null, "lamps", null, 0, -1, LightFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lampTypeEEnum, LampType.class, "LampType");
		addEEnumLiteral(lampTypeEEnum, LampType.COMPACTFLUORESCENT);
		addEEnumLiteral(lampTypeEEnum, LampType.FLUORESCENT);
		addEEnumLiteral(lampTypeEEnum, LampType.HALOGEN);
		addEEnumLiteral(lampTypeEEnum, LampType.HIGHPRESSUREMERCURY);
		addEEnumLiteral(lampTypeEEnum, LampType.HIGHPRESSURESODIUM);
		addEEnumLiteral(lampTypeEEnum, LampType.LED);
		addEEnumLiteral(lampTypeEEnum, LampType.METALHALIDE);
		addEEnumLiteral(lampTypeEEnum, LampType.OLED);
		addEEnumLiteral(lampTypeEEnum, LampType.TUNGSTENFILAMENT);
		addEEnumLiteral(lampTypeEEnum, LampType.USERDEFINED);
		addEEnumLiteral(lampTypeEEnum, LampType.NOTDEFINED);

		initEEnum(lightFixtureTypeEEnum, LightFixtureType.class, "LightFixtureType");
		addEEnumLiteral(lightFixtureTypeEEnum, LightFixtureType.POINTSOURCE);
		addEEnumLiteral(lightFixtureTypeEEnum, LightFixtureType.DIRECTIONSOURCE);
		addEEnumLiteral(lightFixtureTypeEEnum, LightFixtureType.SECURITYLIGHTING);
		addEEnumLiteral(lightFixtureTypeEEnum, LightFixtureType.USERDEFINED);
		addEEnumLiteral(lightFixtureTypeEEnum, LightFixtureType.NOTDEFINED);

		// Create resource
		createResource(eNS_URI);
	}

} //LightastPackageImpl
