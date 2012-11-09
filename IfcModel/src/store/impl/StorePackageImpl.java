/**
 */
package store.impl;

import ifc2x3tc1.Ifc2x3tc1Package;

import ifc2x3tc1.impl.Ifc2x3tc1PackageImpl;

import javax.activation.DataHandler;

import log.LogPackage;

import log.impl.LogPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import store.ActionState;
import store.ArrayDefinition;
import store.ArrayType;
import store.BooleanType;
import store.Bounds;
import store.CheckinResult;
import store.CheckinStatus;
import store.Checkout;
import store.CheckoutResult;
import store.CompareContainer;
import store.CompareItem;
import store.CompareResult;
import store.CompareType;
import store.ConcreteRevision;
import store.DataObject;
import store.DataValue;
import store.DatabaseInformation;
import store.DatabaseInformationCategory;
import store.DatabaseInformationItem;
import store.DeserializerPluginConfiguration;
import store.DeserializerPluginDescriptor;
import store.DoubleType;
import store.DownloadResult;
import store.ExtendedData;
import store.ExtendedDataSchema;
import store.ExtendedDataSchemaType;
import store.ExternalServiceUpdate;
import store.File;
import store.GeoTag;
import store.Geometry;
import store.IfcEnginePluginConfiguration;
import store.IfcEnginePluginDescriptor;
import store.ImmediateNotificationResult;
import store.InternalServicePluginConfiguration;
import store.ListDataValue;
import store.LongAction;
import store.LongActionState;
import store.LongCheckinAction;
import store.LongType;
import store.Migration;
import store.ModelComparePluginConfiguration;
import store.ModelComparePluginDescriptor;
import store.ModelMergerPluginConfiguration;
import store.ModelMergerPluginDescriptor;
import store.NotifictionResultEnum;
import store.ObjectAdded;
import store.ObjectDefinition;
import store.ObjectIDMPluginConfiguration;
import store.ObjectIDMPluginDescriptor;
import store.ObjectModified;
import store.ObjectRemoved;
import store.ObjectState;
import store.ObjectType;
import store.Parameter;
import store.ParameterDefinition;
import store.PercentageChange;
import store.PluginConfiguration;
import store.PluginDescriptor;
import store.PrimitiveDefinition;
import store.PrimitiveEnum;
import store.PrimitiveType;
import store.ProfileDescriptor;
import store.Project;
import store.QueryEnginePluginConfiguration;
import store.QueryEnginePluginDescriptor;
import store.ReferenceDataValue;
import store.Revision;
import store.RevisionSummary;
import store.RevisionSummaryContainer;
import store.RevisionSummaryType;
import store.SIPrefix;
import store.SerializerPluginConfiguration;
import store.SerializerPluginDescriptor;
import store.ServerInfo;
import store.ServerSettings;
import store.ServerState;
import store.Service;
import store.ServiceDescriptor;
import store.ServiceField;
import store.ServiceInterface;
import store.ServiceMethod;
import store.ServiceParameter;
import store.ServicePluginDescriptor;
import store.ServiceType;
import store.SimpleDataValue;
import store.StoreFactory;
import store.StorePackage;
import store.StringType;
import store.Token;
import store.Trigger;
import store.Type;
import store.TypeDefinition;
import store.User;
import store.UserSession;
import store.UserSettings;
import store.UserType;
import store.Vector3f;
import store.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StorePackageImpl extends EPackageImpl implements StorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializerPluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIDMPluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifcEnginePluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deserializerPluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkinResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downloadResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkoutResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceDataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listDataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInformationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInformationCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializerPluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deserializerPluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionSummaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionSummaryContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longCheckinActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIDMPluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRemovedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectModifiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longActionStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifcEnginePluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedDataSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEnginePluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEnginePluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelMergerPluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelMergerPluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelComparePluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelComparePluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalServicePluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateNotificationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalServiceUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vector3fEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum siPrefixEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compareTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serverStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum checkinStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum extendedDataSchemaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notifictionResultEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataHandlerEDataType = null;

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
	 * @see store.StorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StorePackageImpl() {
		super(eNS_URI, StoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StorePackage init() {
		if (isInited) return (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);

		// Obtain or create and register package
		StorePackageImpl theStorePackage = (StorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Ifc2x3tc1PackageImpl theIfc2x3tc1Package = (Ifc2x3tc1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Ifc2x3tc1Package.eNS_URI) instanceof Ifc2x3tc1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Ifc2x3tc1Package.eNS_URI) : Ifc2x3tc1Package.eINSTANCE);
		LogPackageImpl theLogPackage = (LogPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI) instanceof LogPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI) : LogPackage.eINSTANCE);

		// Load packages
		theIfc2x3tc1Package.loadPackage();

		// Create package meta-data objects
		theStorePackage.createPackageContents();
		theLogPackage.createPackageContents();

		// Initialize created meta-data
		theStorePackage.initializePackageContents();
		theLogPackage.initializePackageContents();

		// Fix loaded packages
		theIfc2x3tc1Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theStorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StorePackage.eNS_URI, theStorePackage);
		return theStorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Id() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_HasAuthorizedUsers() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_ConcreteRevisions() {
		return (EReference)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Revisions() {
		return (EReference)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_LastConcreteRevision() {
		return (EReference)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_LastRevision() {
		return (EReference)projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Checkouts() {
		return (EReference)projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_State() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_CreatedDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_CreatedBy() {
		return (EReference)projectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_GeoTag() {
		return (EReference)projectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_SubProjects() {
		return (EReference)projectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Parent() {
		return (EReference)projectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Description() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ExportLengthMeasurePrefix() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_ExtendedData() {
		return (EReference)projectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Services() {
		return (EReference)projectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Logs() {
		return (EReference)projectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Password() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_HasRightsOn() {
		return (EReference)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Revisions() {
		return (EReference)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_State() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_CreatedOn() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_CreatedBy() {
		return (EReference)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserType() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Username() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_LastSeen() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Token() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_ValidationToken() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_ValidationTokenCreated() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_UserSettings() {
		return (EReference)userEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Schemas() {
		return (EReference)userEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_ExtendedData() {
		return (EReference)userEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Services() {
		return (EReference)userEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Logs() {
		return (EReference)userEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision() {
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Id() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_User() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Date() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Comment() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Size() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_ConcreteRevisions() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_LastConcreteRevision() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Checkouts() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Project() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Tag() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_LastError() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Bmi() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Laid() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_ExtendedData() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Logs() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Geometry() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteRevision() {
		return concreteRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteRevision_Id() {
		return (EAttribute)concreteRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteRevision_Project() {
		return (EReference)concreteRevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteRevision_Checksum() {
		return (EAttribute)concreteRevisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteRevision_Revisions() {
		return (EReference)concreteRevisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteRevision_Size() {
		return (EAttribute)concreteRevisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteRevision_Date() {
		return (EAttribute)concreteRevisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcreteRevision_LastError() {
		return (EAttribute)concreteRevisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteRevision_Summary() {
		return (EReference)concreteRevisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcreteRevision_User() {
		return (EReference)concreteRevisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoTag() {
		return geoTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoTag_Enabled() {
		return (EAttribute)geoTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeoTag_Projects() {
		return (EReference)geoTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoTag_X() {
		return (EAttribute)geoTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoTag_Y() {
		return (EAttribute)geoTagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoTag_Z() {
		return (EAttribute)geoTagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoTag_Epsg() {
		return (EAttribute)geoTagEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeoTag_DirectionAngle() {
		return (EAttribute)geoTagEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckout() {
		return checkoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckout_User() {
		return (EReference)checkoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckout_Revision() {
		return (EReference)checkoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckout_Project() {
		return (EReference)checkoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckout_Date() {
		return (EAttribute)checkoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckout_Checkin() {
		return (EReference)checkoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckout_Active() {
		return (EAttribute)checkoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckout_Logs() {
		return (EReference)checkoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerSettings() {
		return serverSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_ShowVersionUpgradeAvailable() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_SendConfirmationEmailAfterRegistration() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_UseCaching() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_AllowSelfRegistration() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_AllowUsersToCreateTopLevelProjects() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_CheckinMergingEnabled() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_RegistrationAddition() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_SmtpServer() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_EmailSenderAddress() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_CustomLogoAddress() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_SiteAddress() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_WhitelistedDomains() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_HideUserListForNonAdmin() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_ProtocolBuffersPort() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_HeaderAddition() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_FooterAddition() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_CacheOutputFiles() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSettings_ServiceRepositoryUrl() {
		return (EAttribute)serverSettingsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserSettings() {
		return userSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_Serializers() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_ObjectIDMs() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_IfcEngines() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_Deserializers() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_Queryengines() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_Modelmergers() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_Modelcompares() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_DefaultModelMerger() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_DefaultModelCompare() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_DefaultQueryEngine() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_DefaultIfcEngine() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_DefaultSerializer() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_DefaultObjectIDM() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSettings_Services() {
		return (EReference)userSettingsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginConfiguration() {
		return pluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginConfiguration_Name() {
		return (EAttribute)pluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginConfiguration_Enabled() {
		return (EAttribute)pluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginConfiguration_Description() {
		return (EAttribute)pluginConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginConfiguration_ClassName() {
		return (EAttribute)pluginConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPluginConfiguration_Settings() {
		return (EReference)pluginConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializerPluginConfiguration() {
		return serializerPluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializerPluginConfiguration_Extension() {
		return (EAttribute)serializerPluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializerPluginConfiguration_ContentType() {
		return (EAttribute)serializerPluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializerPluginConfiguration_ObjectIDM() {
		return (EReference)serializerPluginConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializerPluginConfiguration_UserSettings() {
		return (EReference)serializerPluginConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSerializerPluginConfiguration_IfcEngine() {
		return (EReference)serializerPluginConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIDMPluginConfiguration() {
		return objectIDMPluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIDMPluginConfiguration_Serializers() {
		return (EReference)objectIDMPluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectIDMPluginConfiguration_UserSettings() {
		return (EReference)objectIDMPluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfcEnginePluginConfiguration() {
		return ifcEnginePluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfcEnginePluginConfiguration_Serializers() {
		return (EReference)ifcEnginePluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfcEnginePluginConfiguration_UserSettings() {
		return (EReference)ifcEnginePluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeserializerPluginConfiguration() {
		return deserializerPluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeserializerPluginConfiguration_UserSettings() {
		return (EReference)deserializerPluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckinResult() {
		return checkinResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckinResult_Revision() {
		return (EReference)checkinResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckinResult_Project() {
		return (EReference)checkinResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckinResult_Progress() {
		return (EAttribute)checkinResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckinResult_LastError() {
		return (EAttribute)checkinResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckinResult_Status() {
		return (EAttribute)checkinResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDownloadResult() {
		return downloadResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDownloadResult_ProjectName() {
		return (EAttribute)downloadResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDownloadResult_RevisionNr() {
		return (EAttribute)downloadResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDownloadResult_File() {
		return (EAttribute)downloadResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckoutResult() {
		return checkoutResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_FieldName() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObject_Type() {
		return (EAttribute)dataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObject_Guid() {
		return (EAttribute)dataObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObject_Name() {
		return (EAttribute)dataObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_Values() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserSession() {
		return userSessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSession_User() {
		return (EReference)userSessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserSession_Username() {
		return (EAttribute)userSessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserSession_Name() {
		return (EAttribute)userSessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserSession_Type() {
		return (EAttribute)userSessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserSession_RemoteAddress() {
		return (EAttribute)userSessionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserSession_ActiveSince() {
		return (EAttribute)userSessionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserSession_LastActive() {
		return (EAttribute)userSessionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserSession_AccessMethod() {
		return (EAttribute)userSessionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigration() {
		return migrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigration_Number() {
		return (EAttribute)migrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigration_Description() {
		return (EAttribute)migrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigration_Executed() {
		return (EAttribute)migrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceDataValue() {
		return referenceDataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDataValue_TypeName() {
		return (EAttribute)referenceDataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDataValue_Guid() {
		return (EAttribute)referenceDataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListDataValue() {
		return listDataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListDataValue_Values() {
		return (EReference)listDataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDataValue() {
		return simpleDataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDataValue_StringValue() {
		return (EAttribute)simpleDataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseInformationItem() {
		return databaseInformationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformationItem_Key() {
		return (EAttribute)databaseInformationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformationItem_Value() {
		return (EAttribute)databaseInformationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseInformationCategory() {
		return databaseInformationCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformationCategory_Title() {
		return (EAttribute)databaseInformationCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseInformationCategory_Items() {
		return (EReference)databaseInformationCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseInformation() {
		return databaseInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformation_NumberOfProjects() {
		return (EAttribute)databaseInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformation_NumberOfUsers() {
		return (EAttribute)databaseInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformation_NumberOfRevisions() {
		return (EAttribute)databaseInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformation_NumberOfCheckouts() {
		return (EAttribute)databaseInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformation_DatabaseSizeInBytes() {
		return (EAttribute)databaseInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformation_Type() {
		return (EAttribute)databaseInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformation_Created() {
		return (EAttribute)databaseInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformation_Location() {
		return (EAttribute)databaseInformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseInformation_SchemaVersion() {
		return (EAttribute)databaseInformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseInformation_Categories() {
		return (EReference)databaseInformationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPluginDescriptor() {
		return pluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDescriptor_DefaultName() {
		return (EAttribute)pluginDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDescriptor_PluginClassName() {
		return (EAttribute)pluginDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDescriptor_Description() {
		return (EAttribute)pluginDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDescriptor_Location() {
		return (EAttribute)pluginDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPluginDescriptor_Enabled() {
		return (EAttribute)pluginDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializerPluginDescriptor() {
		return serializerPluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializerPluginDescriptor_DefaultExtension() {
		return (EAttribute)serializerPluginDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerializerPluginDescriptor_DefaultContentType() {
		return (EAttribute)serializerPluginDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeserializerPluginDescriptor() {
		return deserializerPluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevisionSummaryType() {
		return revisionSummaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevisionSummaryType_Name() {
		return (EAttribute)revisionSummaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevisionSummaryType_Count() {
		return (EAttribute)revisionSummaryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevisionSummaryContainer() {
		return revisionSummaryContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevisionSummaryContainer_Name() {
		return (EAttribute)revisionSummaryContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionSummaryContainer_Types() {
		return (EReference)revisionSummaryContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevisionSummary() {
		return revisionSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionSummary_List() {
		return (EReference)revisionSummaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongAction() {
		return longActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongAction_Identification() {
		return (EAttribute)longActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLongAction_User() {
		return (EReference)longActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongAction_Start() {
		return (EAttribute)longActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongAction_Username() {
		return (EAttribute)longActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongAction_Name() {
		return (EAttribute)longActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongCheckinAction() {
		return longCheckinActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLongCheckinAction_Revisions() {
		return (EReference)longCheckinActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIDMPluginDescriptor() {
		return objectIDMPluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectIDMPluginDescriptor_ClassName() {
		return (EAttribute)objectIDMPluginDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompareItem() {
		return compareItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompareItem_DataObject() {
		return (EReference)compareItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectAdded() {
		return objectAddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectRemoved() {
		return objectRemovedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectModified() {
		return objectModifiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectModified_FieldName() {
		return (EAttribute)objectModifiedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectModified_OldValue() {
		return (EAttribute)objectModifiedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectModified_NewValue() {
		return (EAttribute)objectModifiedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompareContainer() {
		return compareContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompareContainer_Type() {
		return (EAttribute)compareContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompareContainer_Items() {
		return (EReference)compareContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompareResult() {
		return compareResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompareResult_Items() {
		return (EReference)compareResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongActionState() {
		return longActionStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongActionState_Progress() {
		return (EAttribute)longActionStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongActionState_State() {
		return (EAttribute)longActionStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongActionState_Errors() {
		return (EAttribute)longActionStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongActionState_Warnings() {
		return (EAttribute)longActionStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongActionState_Infos() {
		return (EAttribute)longActionStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerInfo() {
		return serverInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerInfo_ServerState() {
		return (EAttribute)serverInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerInfo_ErrorMessage() {
		return (EAttribute)serverInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Major() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Minor() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Revision() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Date() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_DownloadUrl() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_SupportUrl() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_SupportEmail() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfcEnginePluginDescriptor() {
		return ifcEnginePluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Data() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Filename() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Mime() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedDataSchema() {
		return extendedDataSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedDataSchema_Name() {
		return (EAttribute)extendedDataSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedDataSchema_Url() {
		return (EAttribute)extendedDataSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedDataSchema_Namespace() {
		return (EAttribute)extendedDataSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedDataSchema_Description() {
		return (EAttribute)extendedDataSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedDataSchema_File() {
		return (EReference)extendedDataSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedDataSchema_Size() {
		return (EAttribute)extendedDataSchemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedDataSchema_Validate() {
		return (EAttribute)extendedDataSchemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedDataSchema_Type() {
		return (EAttribute)extendedDataSchemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedDataSchema_Users() {
		return (EReference)extendedDataSchemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedDataSchema_ExtendedData() {
		return (EReference)extendedDataSchemaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedData() {
		return extendedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedData_Url() {
		return (EAttribute)extendedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedData_File() {
		return (EReference)extendedDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedData_Size() {
		return (EAttribute)extendedDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedData_Title() {
		return (EAttribute)extendedDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedData_Added() {
		return (EAttribute)extendedDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedData_User() {
		return (EReference)extendedDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedData_Schema() {
		return (EReference)extendedDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedData_Revision() {
		return (EReference)extendedDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendedData_Project() {
		return (EReference)extendedDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryEnginePluginDescriptor() {
		return queryEnginePluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryEnginePluginConfiguration() {
		return queryEnginePluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryEnginePluginConfiguration_UserSettings() {
		return (EReference)queryEnginePluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelMergerPluginDescriptor() {
		return modelMergerPluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelMergerPluginConfiguration() {
		return modelMergerPluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelMergerPluginConfiguration_UserSettings() {
		return (EReference)modelMergerPluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelComparePluginDescriptor() {
		return modelComparePluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelComparePluginConfiguration() {
		return modelComparePluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelComparePluginConfiguration_UserSettings() {
		return (EReference)modelComparePluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileDescriptor() {
		return profileDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileDescriptor_Name() {
		return (EAttribute)profileDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileDescriptor_Description() {
		return (EAttribute)profileDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileDescriptor_PublicProfile() {
		return (EAttribute)profileDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileDescriptor_Identifier() {
		return (EAttribute)profileDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescriptor() {
		return serviceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_Name() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_Url() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_Token() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_Identifier() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_NotificationProtocol() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_Description() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_Trigger() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_ReadRevision() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_ReadExtendedData() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_WriteRevision() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_WriteExtendedData() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_ProviderName() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ServiceName() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ServiceIdentifier() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ProviderName() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Url() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Token() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_NotificationProtocol() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Description() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Trigger() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ReadRevision() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ReadExtendedData() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_WriteRevision() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_WriteExtendedData() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ProfileIdentifier() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ProfileName() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ProfileDescription() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ProfilePublic() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Project() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_User() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_InternalService() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_TokenString() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Expires() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicePluginDescriptor() {
		return servicePluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalServicePluginConfiguration() {
		return internalServicePluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalServicePluginConfiguration_RemoteAccessible() {
		return (EAttribute)internalServicePluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalServicePluginConfiguration_UserSettings() {
		return (EReference)internalServicePluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInterface() {
		return serviceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterface_Name() {
		return (EAttribute)serviceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceMethod() {
		return serviceMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMethod_Name() {
		return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMethod_Doc() {
		return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMethod_ReturnDoc() {
		return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceField() {
		return serviceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceField_Name() {
		return (EAttribute)serviceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceField_Type() {
		return (EReference)serviceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceField_GenericType() {
		return (EReference)serviceFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceField_Doc() {
		return (EAttribute)serviceFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceType_Name() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceType_SimpleName() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceType_Fields() {
		return (EReference)serviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceParameter() {
		return serviceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceParameter_Name() {
		return (EAttribute)serviceParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceParameter_Doc() {
		return (EAttribute)serviceParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceParameter_Type() {
		return (EReference)serviceParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceParameter_GenericType() {
		return (EReference)serviceParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectDefinition() {
		return objectDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectDefinition_Parameters() {
		return (EReference)objectDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDefinition() {
		return primitiveDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveDefinition_Type() {
		return (EAttribute)primitiveDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDefinition() {
		return arrayDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDefinition_Type() {
		return (EReference)arrayDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDefinition() {
		return parameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDefinition_Name() {
		return (EAttribute)parameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDefinition_Required() {
		return (EAttribute)parameterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDefinition_Type() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDefinition_DefaultValue() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Name() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Parameters() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongType() {
		return longTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongType_Value() {
		return (EAttribute)longTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleType() {
		return doubleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleType_Value() {
		return (EAttribute)doubleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringType_Value() {
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanType_Value() {
		return (EAttribute)booleanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_Values() {
		return (EReference)arrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Value() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmediateNotificationResult() {
		return immediateNotificationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImmediateNotificationResult_Result() {
		return (EAttribute)immediateNotificationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImmediateNotificationResult_Description() {
		return (EAttribute)immediateNotificationResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalServiceUpdate() {
		return externalServiceUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPercentageChange() {
		return percentageChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPercentageChange_Percentage() {
		return (EAttribute)percentageChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBounds() {
		return boundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBounds_Min() {
		return (EReference)boundsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBounds_Max() {
		return (EReference)boundsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector3f() {
		return vector3fEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector3f_X() {
		return (EAttribute)vector3fEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector3f_Y() {
		return (EAttribute)vector3fEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector3f_Z() {
		return (EAttribute)vector3fEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometry() {
		return geometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometry_Bounds() {
		return (EReference)geometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometry_Indices() {
		return (EAttribute)geometryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometry_Vertices() {
		return (EAttribute)geometryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometry_Normals() {
		return (EAttribute)geometryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserType() {
		return userTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSIPrefix() {
		return siPrefixEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectState() {
		return objectStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompareType() {
		return compareTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionState() {
		return actionStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServerState() {
		return serverStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCheckinStatus() {
		return checkinStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExtendedDataSchemaType() {
		return extendedDataSchemaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTrigger() {
		return triggerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveEnum() {
		return primitiveEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNotifictionResultEnum() {
		return notifictionResultEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataHandler() {
		return dataHandlerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreFactory getStoreFactory() {
		return (StoreFactory)getEFactoryInstance();
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
		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__ID);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEReference(projectEClass, PROJECT__HAS_AUTHORIZED_USERS);
		createEReference(projectEClass, PROJECT__CONCRETE_REVISIONS);
		createEReference(projectEClass, PROJECT__REVISIONS);
		createEReference(projectEClass, PROJECT__LAST_CONCRETE_REVISION);
		createEReference(projectEClass, PROJECT__LAST_REVISION);
		createEReference(projectEClass, PROJECT__CHECKOUTS);
		createEAttribute(projectEClass, PROJECT__STATE);
		createEAttribute(projectEClass, PROJECT__CREATED_DATE);
		createEReference(projectEClass, PROJECT__CREATED_BY);
		createEReference(projectEClass, PROJECT__GEO_TAG);
		createEReference(projectEClass, PROJECT__SUB_PROJECTS);
		createEReference(projectEClass, PROJECT__PARENT);
		createEAttribute(projectEClass, PROJECT__DESCRIPTION);
		createEAttribute(projectEClass, PROJECT__EXPORT_LENGTH_MEASURE_PREFIX);
		createEReference(projectEClass, PROJECT__EXTENDED_DATA);
		createEReference(projectEClass, PROJECT__SERVICES);
		createEReference(projectEClass, PROJECT__LOGS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__PASSWORD);
		createEReference(userEClass, USER__HAS_RIGHTS_ON);
		createEReference(userEClass, USER__REVISIONS);
		createEAttribute(userEClass, USER__STATE);
		createEAttribute(userEClass, USER__CREATED_ON);
		createEReference(userEClass, USER__CREATED_BY);
		createEAttribute(userEClass, USER__USER_TYPE);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__LAST_SEEN);
		createEAttribute(userEClass, USER__TOKEN);
		createEAttribute(userEClass, USER__VALIDATION_TOKEN);
		createEAttribute(userEClass, USER__VALIDATION_TOKEN_CREATED);
		createEReference(userEClass, USER__USER_SETTINGS);
		createEReference(userEClass, USER__SCHEMAS);
		createEReference(userEClass, USER__EXTENDED_DATA);
		createEReference(userEClass, USER__SERVICES);
		createEReference(userEClass, USER__LOGS);

		revisionEClass = createEClass(REVISION);
		createEAttribute(revisionEClass, REVISION__ID);
		createEReference(revisionEClass, REVISION__USER);
		createEAttribute(revisionEClass, REVISION__DATE);
		createEAttribute(revisionEClass, REVISION__COMMENT);
		createEAttribute(revisionEClass, REVISION__SIZE);
		createEReference(revisionEClass, REVISION__CONCRETE_REVISIONS);
		createEReference(revisionEClass, REVISION__LAST_CONCRETE_REVISION);
		createEReference(revisionEClass, REVISION__CHECKOUTS);
		createEReference(revisionEClass, REVISION__PROJECT);
		createEAttribute(revisionEClass, REVISION__TAG);
		createEAttribute(revisionEClass, REVISION__LAST_ERROR);
		createEAttribute(revisionEClass, REVISION__BMI);
		createEAttribute(revisionEClass, REVISION__LAID);
		createEReference(revisionEClass, REVISION__EXTENDED_DATA);
		createEReference(revisionEClass, REVISION__LOGS);
		createEReference(revisionEClass, REVISION__GEOMETRY);

		concreteRevisionEClass = createEClass(CONCRETE_REVISION);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__ID);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__PROJECT);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__CHECKSUM);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__REVISIONS);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__SIZE);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__DATE);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__LAST_ERROR);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__SUMMARY);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__USER);

		geoTagEClass = createEClass(GEO_TAG);
		createEAttribute(geoTagEClass, GEO_TAG__ENABLED);
		createEReference(geoTagEClass, GEO_TAG__PROJECTS);
		createEAttribute(geoTagEClass, GEO_TAG__X);
		createEAttribute(geoTagEClass, GEO_TAG__Y);
		createEAttribute(geoTagEClass, GEO_TAG__Z);
		createEAttribute(geoTagEClass, GEO_TAG__EPSG);
		createEAttribute(geoTagEClass, GEO_TAG__DIRECTION_ANGLE);

		checkoutEClass = createEClass(CHECKOUT);
		createEReference(checkoutEClass, CHECKOUT__USER);
		createEReference(checkoutEClass, CHECKOUT__REVISION);
		createEReference(checkoutEClass, CHECKOUT__PROJECT);
		createEAttribute(checkoutEClass, CHECKOUT__DATE);
		createEReference(checkoutEClass, CHECKOUT__CHECKIN);
		createEAttribute(checkoutEClass, CHECKOUT__ACTIVE);
		createEReference(checkoutEClass, CHECKOUT__LOGS);

		serverSettingsEClass = createEClass(SERVER_SETTINGS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SHOW_VERSION_UPGRADE_AVAILABLE);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__USE_CACHING);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__ALLOW_SELF_REGISTRATION);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__CHECKIN_MERGING_ENABLED);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__REGISTRATION_ADDITION);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SMTP_SERVER);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__EMAIL_SENDER_ADDRESS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__CUSTOM_LOGO_ADDRESS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SITE_ADDRESS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__WHITELISTED_DOMAINS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__HIDE_USER_LIST_FOR_NON_ADMIN);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__PROTOCOL_BUFFERS_PORT);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__HEADER_ADDITION);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__FOOTER_ADDITION);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__CACHE_OUTPUT_FILES);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SERVICE_REPOSITORY_URL);

		userSettingsEClass = createEClass(USER_SETTINGS);
		createEReference(userSettingsEClass, USER_SETTINGS__SERIALIZERS);
		createEReference(userSettingsEClass, USER_SETTINGS__OBJECT_ID_MS);
		createEReference(userSettingsEClass, USER_SETTINGS__IFC_ENGINES);
		createEReference(userSettingsEClass, USER_SETTINGS__DESERIALIZERS);
		createEReference(userSettingsEClass, USER_SETTINGS__QUERYENGINES);
		createEReference(userSettingsEClass, USER_SETTINGS__MODELMERGERS);
		createEReference(userSettingsEClass, USER_SETTINGS__MODELCOMPARES);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_MODEL_MERGER);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_MODEL_COMPARE);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_QUERY_ENGINE);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_IFC_ENGINE);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_SERIALIZER);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_OBJECT_IDM);
		createEReference(userSettingsEClass, USER_SETTINGS__SERVICES);

		pluginConfigurationEClass = createEClass(PLUGIN_CONFIGURATION);
		createEAttribute(pluginConfigurationEClass, PLUGIN_CONFIGURATION__NAME);
		createEAttribute(pluginConfigurationEClass, PLUGIN_CONFIGURATION__ENABLED);
		createEAttribute(pluginConfigurationEClass, PLUGIN_CONFIGURATION__DESCRIPTION);
		createEAttribute(pluginConfigurationEClass, PLUGIN_CONFIGURATION__CLASS_NAME);
		createEReference(pluginConfigurationEClass, PLUGIN_CONFIGURATION__SETTINGS);

		serializerPluginConfigurationEClass = createEClass(SERIALIZER_PLUGIN_CONFIGURATION);
		createEAttribute(serializerPluginConfigurationEClass, SERIALIZER_PLUGIN_CONFIGURATION__EXTENSION);
		createEAttribute(serializerPluginConfigurationEClass, SERIALIZER_PLUGIN_CONFIGURATION__CONTENT_TYPE);
		createEReference(serializerPluginConfigurationEClass, SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM);
		createEReference(serializerPluginConfigurationEClass, SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS);
		createEReference(serializerPluginConfigurationEClass, SERIALIZER_PLUGIN_CONFIGURATION__IFC_ENGINE);

		objectIDMPluginConfigurationEClass = createEClass(OBJECT_IDM_PLUGIN_CONFIGURATION);
		createEReference(objectIDMPluginConfigurationEClass, OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS);
		createEReference(objectIDMPluginConfigurationEClass, OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS);

		ifcEnginePluginConfigurationEClass = createEClass(IFC_ENGINE_PLUGIN_CONFIGURATION);
		createEReference(ifcEnginePluginConfigurationEClass, IFC_ENGINE_PLUGIN_CONFIGURATION__SERIALIZERS);
		createEReference(ifcEnginePluginConfigurationEClass, IFC_ENGINE_PLUGIN_CONFIGURATION__USER_SETTINGS);

		deserializerPluginConfigurationEClass = createEClass(DESERIALIZER_PLUGIN_CONFIGURATION);
		createEReference(deserializerPluginConfigurationEClass, DESERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS);

		checkinResultEClass = createEClass(CHECKIN_RESULT);
		createEReference(checkinResultEClass, CHECKIN_RESULT__REVISION);
		createEReference(checkinResultEClass, CHECKIN_RESULT__PROJECT);
		createEAttribute(checkinResultEClass, CHECKIN_RESULT__PROGRESS);
		createEAttribute(checkinResultEClass, CHECKIN_RESULT__LAST_ERROR);
		createEAttribute(checkinResultEClass, CHECKIN_RESULT__STATUS);

		downloadResultEClass = createEClass(DOWNLOAD_RESULT);
		createEAttribute(downloadResultEClass, DOWNLOAD_RESULT__PROJECT_NAME);
		createEAttribute(downloadResultEClass, DOWNLOAD_RESULT__REVISION_NR);
		createEAttribute(downloadResultEClass, DOWNLOAD_RESULT__FILE);

		checkoutResultEClass = createEClass(CHECKOUT_RESULT);

		dataValueEClass = createEClass(DATA_VALUE);
		createEAttribute(dataValueEClass, DATA_VALUE__FIELD_NAME);

		dataObjectEClass = createEClass(DATA_OBJECT);
		createEAttribute(dataObjectEClass, DATA_OBJECT__TYPE);
		createEAttribute(dataObjectEClass, DATA_OBJECT__GUID);
		createEAttribute(dataObjectEClass, DATA_OBJECT__NAME);
		createEReference(dataObjectEClass, DATA_OBJECT__VALUES);

		userSessionEClass = createEClass(USER_SESSION);
		createEReference(userSessionEClass, USER_SESSION__USER);
		createEAttribute(userSessionEClass, USER_SESSION__USERNAME);
		createEAttribute(userSessionEClass, USER_SESSION__NAME);
		createEAttribute(userSessionEClass, USER_SESSION__TYPE);
		createEAttribute(userSessionEClass, USER_SESSION__REMOTE_ADDRESS);
		createEAttribute(userSessionEClass, USER_SESSION__ACTIVE_SINCE);
		createEAttribute(userSessionEClass, USER_SESSION__LAST_ACTIVE);
		createEAttribute(userSessionEClass, USER_SESSION__ACCESS_METHOD);

		migrationEClass = createEClass(MIGRATION);
		createEAttribute(migrationEClass, MIGRATION__NUMBER);
		createEAttribute(migrationEClass, MIGRATION__DESCRIPTION);
		createEAttribute(migrationEClass, MIGRATION__EXECUTED);

		referenceDataValueEClass = createEClass(REFERENCE_DATA_VALUE);
		createEAttribute(referenceDataValueEClass, REFERENCE_DATA_VALUE__TYPE_NAME);
		createEAttribute(referenceDataValueEClass, REFERENCE_DATA_VALUE__GUID);

		listDataValueEClass = createEClass(LIST_DATA_VALUE);
		createEReference(listDataValueEClass, LIST_DATA_VALUE__VALUES);

		simpleDataValueEClass = createEClass(SIMPLE_DATA_VALUE);
		createEAttribute(simpleDataValueEClass, SIMPLE_DATA_VALUE__STRING_VALUE);

		databaseInformationItemEClass = createEClass(DATABASE_INFORMATION_ITEM);
		createEAttribute(databaseInformationItemEClass, DATABASE_INFORMATION_ITEM__KEY);
		createEAttribute(databaseInformationItemEClass, DATABASE_INFORMATION_ITEM__VALUE);

		databaseInformationCategoryEClass = createEClass(DATABASE_INFORMATION_CATEGORY);
		createEAttribute(databaseInformationCategoryEClass, DATABASE_INFORMATION_CATEGORY__TITLE);
		createEReference(databaseInformationCategoryEClass, DATABASE_INFORMATION_CATEGORY__ITEMS);

		databaseInformationEClass = createEClass(DATABASE_INFORMATION);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__NUMBER_OF_PROJECTS);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__NUMBER_OF_USERS);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__NUMBER_OF_REVISIONS);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__NUMBER_OF_CHECKOUTS);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__DATABASE_SIZE_IN_BYTES);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__TYPE);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__CREATED);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__LOCATION);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__SCHEMA_VERSION);
		createEReference(databaseInformationEClass, DATABASE_INFORMATION__CATEGORIES);

		pluginDescriptorEClass = createEClass(PLUGIN_DESCRIPTOR);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__DEFAULT_NAME);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__PLUGIN_CLASS_NAME);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__DESCRIPTION);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__LOCATION);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__ENABLED);

		serializerPluginDescriptorEClass = createEClass(SERIALIZER_PLUGIN_DESCRIPTOR);
		createEAttribute(serializerPluginDescriptorEClass, SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_EXTENSION);
		createEAttribute(serializerPluginDescriptorEClass, SERIALIZER_PLUGIN_DESCRIPTOR__DEFAULT_CONTENT_TYPE);

		deserializerPluginDescriptorEClass = createEClass(DESERIALIZER_PLUGIN_DESCRIPTOR);

		revisionSummaryTypeEClass = createEClass(REVISION_SUMMARY_TYPE);
		createEAttribute(revisionSummaryTypeEClass, REVISION_SUMMARY_TYPE__NAME);
		createEAttribute(revisionSummaryTypeEClass, REVISION_SUMMARY_TYPE__COUNT);

		revisionSummaryContainerEClass = createEClass(REVISION_SUMMARY_CONTAINER);
		createEAttribute(revisionSummaryContainerEClass, REVISION_SUMMARY_CONTAINER__NAME);
		createEReference(revisionSummaryContainerEClass, REVISION_SUMMARY_CONTAINER__TYPES);

		revisionSummaryEClass = createEClass(REVISION_SUMMARY);
		createEReference(revisionSummaryEClass, REVISION_SUMMARY__LIST);

		longActionEClass = createEClass(LONG_ACTION);
		createEAttribute(longActionEClass, LONG_ACTION__IDENTIFICATION);
		createEReference(longActionEClass, LONG_ACTION__USER);
		createEAttribute(longActionEClass, LONG_ACTION__START);
		createEAttribute(longActionEClass, LONG_ACTION__USERNAME);
		createEAttribute(longActionEClass, LONG_ACTION__NAME);

		longCheckinActionEClass = createEClass(LONG_CHECKIN_ACTION);
		createEReference(longCheckinActionEClass, LONG_CHECKIN_ACTION__REVISIONS);

		objectIDMPluginDescriptorEClass = createEClass(OBJECT_IDM_PLUGIN_DESCRIPTOR);
		createEAttribute(objectIDMPluginDescriptorEClass, OBJECT_IDM_PLUGIN_DESCRIPTOR__CLASS_NAME);

		compareItemEClass = createEClass(COMPARE_ITEM);
		createEReference(compareItemEClass, COMPARE_ITEM__DATA_OBJECT);

		objectAddedEClass = createEClass(OBJECT_ADDED);

		objectRemovedEClass = createEClass(OBJECT_REMOVED);

		objectModifiedEClass = createEClass(OBJECT_MODIFIED);
		createEAttribute(objectModifiedEClass, OBJECT_MODIFIED__FIELD_NAME);
		createEAttribute(objectModifiedEClass, OBJECT_MODIFIED__OLD_VALUE);
		createEAttribute(objectModifiedEClass, OBJECT_MODIFIED__NEW_VALUE);

		compareContainerEClass = createEClass(COMPARE_CONTAINER);
		createEAttribute(compareContainerEClass, COMPARE_CONTAINER__TYPE);
		createEReference(compareContainerEClass, COMPARE_CONTAINER__ITEMS);

		compareResultEClass = createEClass(COMPARE_RESULT);
		createEReference(compareResultEClass, COMPARE_RESULT__ITEMS);

		longActionStateEClass = createEClass(LONG_ACTION_STATE);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__PROGRESS);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__STATE);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__ERRORS);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__WARNINGS);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__INFOS);

		serverInfoEClass = createEClass(SERVER_INFO);
		createEAttribute(serverInfoEClass, SERVER_INFO__SERVER_STATE);
		createEAttribute(serverInfoEClass, SERVER_INFO__ERROR_MESSAGE);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__MAJOR);
		createEAttribute(versionEClass, VERSION__MINOR);
		createEAttribute(versionEClass, VERSION__REVISION);
		createEAttribute(versionEClass, VERSION__DATE);
		createEAttribute(versionEClass, VERSION__DOWNLOAD_URL);
		createEAttribute(versionEClass, VERSION__SUPPORT_URL);
		createEAttribute(versionEClass, VERSION__SUPPORT_EMAIL);

		ifcEnginePluginDescriptorEClass = createEClass(IFC_ENGINE_PLUGIN_DESCRIPTOR);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__DATA);
		createEAttribute(fileEClass, FILE__FILENAME);
		createEAttribute(fileEClass, FILE__MIME);

		extendedDataSchemaEClass = createEClass(EXTENDED_DATA_SCHEMA);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__NAME);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__URL);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__NAMESPACE);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__DESCRIPTION);
		createEReference(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__FILE);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__SIZE);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__VALIDATE);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__TYPE);
		createEReference(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__USERS);
		createEReference(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__EXTENDED_DATA);

		extendedDataEClass = createEClass(EXTENDED_DATA);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__URL);
		createEReference(extendedDataEClass, EXTENDED_DATA__FILE);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__SIZE);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__TITLE);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__ADDED);
		createEReference(extendedDataEClass, EXTENDED_DATA__USER);
		createEReference(extendedDataEClass, EXTENDED_DATA__SCHEMA);
		createEReference(extendedDataEClass, EXTENDED_DATA__REVISION);
		createEReference(extendedDataEClass, EXTENDED_DATA__PROJECT);

		queryEnginePluginDescriptorEClass = createEClass(QUERY_ENGINE_PLUGIN_DESCRIPTOR);

		queryEnginePluginConfigurationEClass = createEClass(QUERY_ENGINE_PLUGIN_CONFIGURATION);
		createEReference(queryEnginePluginConfigurationEClass, QUERY_ENGINE_PLUGIN_CONFIGURATION__USER_SETTINGS);

		modelMergerPluginDescriptorEClass = createEClass(MODEL_MERGER_PLUGIN_DESCRIPTOR);

		modelMergerPluginConfigurationEClass = createEClass(MODEL_MERGER_PLUGIN_CONFIGURATION);
		createEReference(modelMergerPluginConfigurationEClass, MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS);

		modelComparePluginDescriptorEClass = createEClass(MODEL_COMPARE_PLUGIN_DESCRIPTOR);

		modelComparePluginConfigurationEClass = createEClass(MODEL_COMPARE_PLUGIN_CONFIGURATION);
		createEReference(modelComparePluginConfigurationEClass, MODEL_COMPARE_PLUGIN_CONFIGURATION__USER_SETTINGS);

		profileDescriptorEClass = createEClass(PROFILE_DESCRIPTOR);
		createEAttribute(profileDescriptorEClass, PROFILE_DESCRIPTOR__NAME);
		createEAttribute(profileDescriptorEClass, PROFILE_DESCRIPTOR__DESCRIPTION);
		createEAttribute(profileDescriptorEClass, PROFILE_DESCRIPTOR__PUBLIC_PROFILE);
		createEAttribute(profileDescriptorEClass, PROFILE_DESCRIPTOR__IDENTIFIER);

		serviceDescriptorEClass = createEClass(SERVICE_DESCRIPTOR);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__NAME);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__URL);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__TOKEN);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__IDENTIFIER);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__NOTIFICATION_PROTOCOL);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__DESCRIPTION);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__TRIGGER);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__READ_REVISION);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__READ_EXTENDED_DATA);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__WRITE_REVISION);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__WRITE_EXTENDED_DATA);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__PROVIDER_NAME);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEAttribute(serviceEClass, SERVICE__SERVICE_NAME);
		createEAttribute(serviceEClass, SERVICE__SERVICE_IDENTIFIER);
		createEAttribute(serviceEClass, SERVICE__PROVIDER_NAME);
		createEAttribute(serviceEClass, SERVICE__URL);
		createEAttribute(serviceEClass, SERVICE__TOKEN);
		createEAttribute(serviceEClass, SERVICE__NOTIFICATION_PROTOCOL);
		createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
		createEAttribute(serviceEClass, SERVICE__TRIGGER);
		createEAttribute(serviceEClass, SERVICE__READ_REVISION);
		createEReference(serviceEClass, SERVICE__READ_EXTENDED_DATA);
		createEReference(serviceEClass, SERVICE__WRITE_REVISION);
		createEReference(serviceEClass, SERVICE__WRITE_EXTENDED_DATA);
		createEAttribute(serviceEClass, SERVICE__PROFILE_IDENTIFIER);
		createEAttribute(serviceEClass, SERVICE__PROFILE_NAME);
		createEAttribute(serviceEClass, SERVICE__PROFILE_DESCRIPTION);
		createEAttribute(serviceEClass, SERVICE__PROFILE_PUBLIC);
		createEReference(serviceEClass, SERVICE__PROJECT);
		createEReference(serviceEClass, SERVICE__USER);
		createEReference(serviceEClass, SERVICE__INTERNAL_SERVICE);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__TOKEN_STRING);
		createEAttribute(tokenEClass, TOKEN__EXPIRES);

		servicePluginDescriptorEClass = createEClass(SERVICE_PLUGIN_DESCRIPTOR);

		internalServicePluginConfigurationEClass = createEClass(INTERNAL_SERVICE_PLUGIN_CONFIGURATION);
		createEAttribute(internalServicePluginConfigurationEClass, INTERNAL_SERVICE_PLUGIN_CONFIGURATION__REMOTE_ACCESSIBLE);
		createEReference(internalServicePluginConfigurationEClass, INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS);

		serviceInterfaceEClass = createEClass(SERVICE_INTERFACE);
		createEAttribute(serviceInterfaceEClass, SERVICE_INTERFACE__NAME);

		serviceMethodEClass = createEClass(SERVICE_METHOD);
		createEAttribute(serviceMethodEClass, SERVICE_METHOD__NAME);
		createEAttribute(serviceMethodEClass, SERVICE_METHOD__DOC);
		createEAttribute(serviceMethodEClass, SERVICE_METHOD__RETURN_DOC);

		serviceFieldEClass = createEClass(SERVICE_FIELD);
		createEAttribute(serviceFieldEClass, SERVICE_FIELD__NAME);
		createEReference(serviceFieldEClass, SERVICE_FIELD__TYPE);
		createEReference(serviceFieldEClass, SERVICE_FIELD__GENERIC_TYPE);
		createEAttribute(serviceFieldEClass, SERVICE_FIELD__DOC);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__NAME);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__SIMPLE_NAME);
		createEReference(serviceTypeEClass, SERVICE_TYPE__FIELDS);

		serviceParameterEClass = createEClass(SERVICE_PARAMETER);
		createEAttribute(serviceParameterEClass, SERVICE_PARAMETER__NAME);
		createEAttribute(serviceParameterEClass, SERVICE_PARAMETER__DOC);
		createEReference(serviceParameterEClass, SERVICE_PARAMETER__TYPE);
		createEReference(serviceParameterEClass, SERVICE_PARAMETER__GENERIC_TYPE);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);

		objectDefinitionEClass = createEClass(OBJECT_DEFINITION);
		createEReference(objectDefinitionEClass, OBJECT_DEFINITION__PARAMETERS);

		primitiveDefinitionEClass = createEClass(PRIMITIVE_DEFINITION);
		createEAttribute(primitiveDefinitionEClass, PRIMITIVE_DEFINITION__TYPE);

		arrayDefinitionEClass = createEClass(ARRAY_DEFINITION);
		createEReference(arrayDefinitionEClass, ARRAY_DEFINITION__TYPE);

		parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__NAME);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__REQUIRED);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__TYPE);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__DEFAULT_VALUE);

		typeEClass = createEClass(TYPE);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__NAME);
		createEReference(objectTypeEClass, OBJECT_TYPE__PARAMETERS);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		longTypeEClass = createEClass(LONG_TYPE);
		createEAttribute(longTypeEClass, LONG_TYPE__VALUE);

		doubleTypeEClass = createEClass(DOUBLE_TYPE);
		createEAttribute(doubleTypeEClass, DOUBLE_TYPE__VALUE);

		stringTypeEClass = createEClass(STRING_TYPE);
		createEAttribute(stringTypeEClass, STRING_TYPE__VALUE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);
		createEAttribute(booleanTypeEClass, BOOLEAN_TYPE__VALUE);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEReference(arrayTypeEClass, ARRAY_TYPE__VALUES);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__VALUE);

		immediateNotificationResultEClass = createEClass(IMMEDIATE_NOTIFICATION_RESULT);
		createEAttribute(immediateNotificationResultEClass, IMMEDIATE_NOTIFICATION_RESULT__RESULT);
		createEAttribute(immediateNotificationResultEClass, IMMEDIATE_NOTIFICATION_RESULT__DESCRIPTION);

		externalServiceUpdateEClass = createEClass(EXTERNAL_SERVICE_UPDATE);

		percentageChangeEClass = createEClass(PERCENTAGE_CHANGE);
		createEAttribute(percentageChangeEClass, PERCENTAGE_CHANGE__PERCENTAGE);

		boundsEClass = createEClass(BOUNDS);
		createEReference(boundsEClass, BOUNDS__MIN);
		createEReference(boundsEClass, BOUNDS__MAX);

		vector3fEClass = createEClass(VECTOR3F);
		createEAttribute(vector3fEClass, VECTOR3F__X);
		createEAttribute(vector3fEClass, VECTOR3F__Y);
		createEAttribute(vector3fEClass, VECTOR3F__Z);

		geometryEClass = createEClass(GEOMETRY);
		createEReference(geometryEClass, GEOMETRY__BOUNDS);
		createEAttribute(geometryEClass, GEOMETRY__INDICES);
		createEAttribute(geometryEClass, GEOMETRY__VERTICES);
		createEAttribute(geometryEClass, GEOMETRY__NORMALS);

		// Create enums
		userTypeEEnum = createEEnum(USER_TYPE);
		siPrefixEEnum = createEEnum(SI_PREFIX);
		objectStateEEnum = createEEnum(OBJECT_STATE);
		compareTypeEEnum = createEEnum(COMPARE_TYPE);
		actionStateEEnum = createEEnum(ACTION_STATE);
		serverStateEEnum = createEEnum(SERVER_STATE);
		checkinStatusEEnum = createEEnum(CHECKIN_STATUS);
		extendedDataSchemaTypeEEnum = createEEnum(EXTENDED_DATA_SCHEMA_TYPE);
		triggerEEnum = createEEnum(TRIGGER);
		primitiveEnumEEnum = createEEnum(PRIMITIVE_ENUM);
		notifictionResultEnumEEnum = createEEnum(NOTIFICTION_RESULT_ENUM);

		// Create data types
		dataHandlerEDataType = createEDataType(DATA_HANDLER);
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
		LogPackage theLogPackage = (LogPackage)EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serializerPluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		objectIDMPluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		ifcEnginePluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		deserializerPluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		checkoutResultEClass.getESuperTypes().add(this.getDownloadResult());
		referenceDataValueEClass.getESuperTypes().add(this.getDataValue());
		listDataValueEClass.getESuperTypes().add(this.getDataValue());
		simpleDataValueEClass.getESuperTypes().add(this.getDataValue());
		serializerPluginDescriptorEClass.getESuperTypes().add(this.getPluginDescriptor());
		deserializerPluginDescriptorEClass.getESuperTypes().add(this.getPluginDescriptor());
		longCheckinActionEClass.getESuperTypes().add(this.getLongAction());
		objectAddedEClass.getESuperTypes().add(this.getCompareItem());
		objectRemovedEClass.getESuperTypes().add(this.getCompareItem());
		objectModifiedEClass.getESuperTypes().add(this.getCompareItem());
		ifcEnginePluginDescriptorEClass.getESuperTypes().add(this.getPluginDescriptor());
		queryEnginePluginDescriptorEClass.getESuperTypes().add(this.getPluginDescriptor());
		queryEnginePluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		modelMergerPluginDescriptorEClass.getESuperTypes().add(this.getPluginDescriptor());
		modelMergerPluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		modelComparePluginDescriptorEClass.getESuperTypes().add(this.getPluginDescriptor());
		modelComparePluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		servicePluginDescriptorEClass.getESuperTypes().add(this.getPluginDescriptor());
		internalServicePluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		objectDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		primitiveDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		arrayDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		objectTypeEClass.getESuperTypes().add(this.getType());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		longTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		doubleTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		stringTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		booleanTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		arrayTypeEClass.getESuperTypes().add(this.getType());
		percentageChangeEClass.getESuperTypes().add(this.getExternalServiceUpdate());

		// Initialize classes and features; add operations and parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_HasAuthorizedUsers(), this.getUser(), this.getUser_HasRightsOn(), "hasAuthorizedUsers", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ConcreteRevisions(), this.getConcreteRevision(), this.getConcreteRevision_Project(), "concreteRevisions", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Revisions(), this.getRevision(), this.getRevision_Project(), "revisions", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_LastConcreteRevision(), this.getConcreteRevision(), null, "lastConcreteRevision", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_LastRevision(), this.getRevision(), null, "lastRevision", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Checkouts(), this.getCheckout(), this.getCheckout_Project(), "checkouts", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_State(), this.getObjectState(), "state", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_GeoTag(), this.getGeoTag(), this.getGeoTag_Projects(), "geoTag", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_SubProjects(), this.getProject(), this.getProject_Parent(), "subProjects", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Parent(), this.getProject(), this.getProject_SubProjects(), "parent", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Description(), ecorePackage.getEString(), "description", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ExportLengthMeasurePrefix(), this.getSIPrefix(), "exportLengthMeasurePrefix", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ExtendedData(), this.getExtendedData(), this.getExtendedData_Project(), "extendedData", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Services(), this.getService(), this.getService_Project(), "services", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Logs(), theLogPackage.getLogAction(), null, "logs", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Password(), ecorePackage.getEString(), "password", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_HasRightsOn(), this.getProject(), this.getProject_HasAuthorizedUsers(), "hasRightsOn", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Revisions(), this.getRevision(), this.getRevision_User(), "revisions", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_State(), this.getObjectState(), "state", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_CreatedOn(), ecorePackage.getEDate(), "createdOn", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_UserType(), this.getUserType(), "userType", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Username(), ecorePackage.getEString(), "username", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_LastSeen(), ecorePackage.getEDate(), "lastSeen", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Token(), ecorePackage.getEString(), "token", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_ValidationToken(), ecorePackage.getEString(), "validationToken", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_ValidationTokenCreated(), ecorePackage.getEDate(), "validationTokenCreated", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_UserSettings(), this.getUserSettings(), null, "userSettings", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Schemas(), this.getExtendedDataSchema(), this.getExtendedDataSchema_Users(), "schemas", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_ExtendedData(), this.getExtendedData(), this.getExtendedData_User(), "extendedData", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Services(), this.getService(), this.getService_User(), "services", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Logs(), theLogPackage.getLogAction(), null, "logs", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevision_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_User(), this.getUser(), this.getUser_Revisions(), "user", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Size(), ecorePackage.getELongObject(), "size", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_ConcreteRevisions(), this.getConcreteRevision(), this.getConcreteRevision_Revisions(), "concreteRevisions", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_LastConcreteRevision(), this.getConcreteRevision(), null, "lastConcreteRevision", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Checkouts(), this.getCheckout(), this.getCheckout_Revision(), "checkouts", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Project(), this.getProject(), this.getProject_Revisions(), "project", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_LastError(), ecorePackage.getEString(), "lastError", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Bmi(), ecorePackage.getEIntegerObject(), "bmi", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Laid(), ecorePackage.getELongObject(), "laid", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_ExtendedData(), this.getExtendedData(), this.getExtendedData_Revision(), "extendedData", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Logs(), theLogPackage.getLogAction(), null, "logs", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Geometry(), this.getGeometry(), null, "geometry", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteRevisionEClass, ConcreteRevision.class, "ConcreteRevision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteRevision_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_Project(), this.getProject(), this.getProject_ConcreteRevisions(), "project", null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_Checksum(), ecorePackage.getEByteArray(), "checksum", null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_Revisions(), this.getRevision(), this.getRevision_ConcreteRevisions(), "revisions", null, 0, -1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_Size(), ecorePackage.getELongObject(), "size", null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_Date(), ecorePackage.getEDate(), "date", null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_LastError(), ecorePackage.getEString(), "lastError", null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_Summary(), this.getRevisionSummary(), null, "summary", null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_User(), this.getUser(), null, "user", null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoTagEClass, GeoTag.class, "GeoTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoTag_Enabled(), ecorePackage.getEBooleanObject(), "enabled", null, 0, 1, GeoTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeoTag_Projects(), this.getProject(), this.getProject_GeoTag(), "projects", null, 0, -1, GeoTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, GeoTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, GeoTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_Z(), ecorePackage.getEDoubleObject(), "z", null, 0, 1, GeoTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_Epsg(), ecorePackage.getEIntegerObject(), "epsg", null, 0, 1, GeoTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_DirectionAngle(), ecorePackage.getEDoubleObject(), "directionAngle", null, 0, 1, GeoTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkoutEClass, Checkout.class, "Checkout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckout_User(), this.getUser(), null, "user", null, 0, 1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckout_Revision(), this.getRevision(), this.getRevision_Checkouts(), "revision", null, 0, 1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckout_Project(), this.getProject(), this.getProject_Checkouts(), "project", null, 0, 1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckout_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckout_Checkin(), this.getRevision(), null, "checkin", null, 0, 1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckout_Active(), ecorePackage.getEBooleanObject(), "active", null, 0, 1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckout_Logs(), theLogPackage.getLogAction(), null, "logs", null, 0, -1, Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverSettingsEClass, ServerSettings.class, "ServerSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerSettings_ShowVersionUpgradeAvailable(), ecorePackage.getEBooleanObject(), "showVersionUpgradeAvailable", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SendConfirmationEmailAfterRegistration(), ecorePackage.getEBoolean(), "sendConfirmationEmailAfterRegistration", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_UseCaching(), ecorePackage.getEBooleanObject(), "useCaching", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_AllowSelfRegistration(), ecorePackage.getEBooleanObject(), "allowSelfRegistration", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_AllowUsersToCreateTopLevelProjects(), ecorePackage.getEBoolean(), "allowUsersToCreateTopLevelProjects", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_CheckinMergingEnabled(), ecorePackage.getEBooleanObject(), "checkinMergingEnabled", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_RegistrationAddition(), ecorePackage.getEString(), "registrationAddition", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SmtpServer(), ecorePackage.getEString(), "smtpServer", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_EmailSenderAddress(), ecorePackage.getEString(), "emailSenderAddress", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_CustomLogoAddress(), ecorePackage.getEString(), "customLogoAddress", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SiteAddress(), ecorePackage.getEString(), "siteAddress", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_WhitelistedDomains(), ecorePackage.getEString(), "whitelistedDomains", null, 0, -1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_HideUserListForNonAdmin(), ecorePackage.getEBooleanObject(), "hideUserListForNonAdmin", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_ProtocolBuffersPort(), ecorePackage.getEIntegerObject(), "protocolBuffersPort", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_HeaderAddition(), ecorePackage.getEString(), "headerAddition", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_FooterAddition(), ecorePackage.getEString(), "footerAddition", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_CacheOutputFiles(), ecorePackage.getEBooleanObject(), "cacheOutputFiles", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_ServiceRepositoryUrl(), ecorePackage.getEString(), "serviceRepositoryUrl", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userSettingsEClass, UserSettings.class, "UserSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserSettings_Serializers(), this.getSerializerPluginConfiguration(), this.getSerializerPluginConfiguration_UserSettings(), "serializers", null, 0, -1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_ObjectIDMs(), this.getObjectIDMPluginConfiguration(), this.getObjectIDMPluginConfiguration_UserSettings(), "objectIDMs", null, 0, -1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_IfcEngines(), this.getIfcEnginePluginConfiguration(), this.getIfcEnginePluginConfiguration_UserSettings(), "ifcEngines", null, 0, -1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_Deserializers(), this.getDeserializerPluginConfiguration(), this.getDeserializerPluginConfiguration_UserSettings(), "deserializers", null, 0, -1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_Queryengines(), this.getQueryEnginePluginConfiguration(), this.getQueryEnginePluginConfiguration_UserSettings(), "queryengines", null, 0, -1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_Modelmergers(), this.getModelMergerPluginConfiguration(), this.getModelMergerPluginConfiguration_UserSettings(), "modelmergers", null, 0, -1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_Modelcompares(), this.getModelComparePluginConfiguration(), this.getModelComparePluginConfiguration_UserSettings(), "modelcompares", null, 0, -1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultModelMerger(), this.getModelMergerPluginConfiguration(), null, "defaultModelMerger", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultModelCompare(), this.getModelComparePluginConfiguration(), null, "defaultModelCompare", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultQueryEngine(), this.getQueryEnginePluginConfiguration(), null, "defaultQueryEngine", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultIfcEngine(), this.getIfcEnginePluginConfiguration(), null, "defaultIfcEngine", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultSerializer(), this.getSerializerPluginConfiguration(), null, "defaultSerializer", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultObjectIDM(), this.getObjectIDMPluginConfiguration(), null, "defaultObjectIDM", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_Services(), this.getInternalServicePluginConfiguration(), this.getInternalServicePluginConfiguration_UserSettings(), "services", null, 0, -1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginConfigurationEClass, PluginConfiguration.class, "PluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginConfiguration_Enabled(), ecorePackage.getEBooleanObject(), "enabled", null, 0, 1, PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1, PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginConfiguration_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginConfiguration_Settings(), this.getObjectType(), null, "settings", null, 0, 1, PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializerPluginConfigurationEClass, SerializerPluginConfiguration.class, "SerializerPluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSerializerPluginConfiguration_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, SerializerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerializerPluginConfiguration_ContentType(), ecorePackage.getEString(), "contentType", null, 0, 1, SerializerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSerializerPluginConfiguration_ObjectIDM(), this.getObjectIDMPluginConfiguration(), this.getObjectIDMPluginConfiguration_Serializers(), "objectIDM", null, 0, 1, SerializerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSerializerPluginConfiguration_UserSettings(), this.getUserSettings(), this.getUserSettings_Serializers(), "userSettings", null, 0, 1, SerializerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSerializerPluginConfiguration_IfcEngine(), this.getIfcEnginePluginConfiguration(), this.getIfcEnginePluginConfiguration_Serializers(), "ifcEngine", null, 0, 1, SerializerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectIDMPluginConfigurationEClass, ObjectIDMPluginConfiguration.class, "ObjectIDMPluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectIDMPluginConfiguration_Serializers(), this.getSerializerPluginConfiguration(), this.getSerializerPluginConfiguration_ObjectIDM(), "serializers", null, 0, -1, ObjectIDMPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectIDMPluginConfiguration_UserSettings(), this.getUserSettings(), this.getUserSettings_ObjectIDMs(), "userSettings", null, 0, 1, ObjectIDMPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifcEnginePluginConfigurationEClass, IfcEnginePluginConfiguration.class, "IfcEnginePluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfcEnginePluginConfiguration_Serializers(), this.getSerializerPluginConfiguration(), this.getSerializerPluginConfiguration_IfcEngine(), "serializers", null, 0, -1, IfcEnginePluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfcEnginePluginConfiguration_UserSettings(), this.getUserSettings(), this.getUserSettings_IfcEngines(), "userSettings", null, 0, 1, IfcEnginePluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deserializerPluginConfigurationEClass, DeserializerPluginConfiguration.class, "DeserializerPluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeserializerPluginConfiguration_UserSettings(), this.getUserSettings(), this.getUserSettings_Deserializers(), "userSettings", null, 0, 1, DeserializerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkinResultEClass, CheckinResult.class, "CheckinResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckinResult_Revision(), this.getRevision(), null, "revision", null, 0, 1, CheckinResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckinResult_Project(), this.getProject(), null, "project", null, 0, 1, CheckinResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckinResult_Progress(), ecorePackage.getEIntegerObject(), "progress", null, 0, 1, CheckinResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckinResult_LastError(), ecorePackage.getEString(), "lastError", null, 0, 1, CheckinResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckinResult_Status(), this.getCheckinStatus(), "status", null, 0, 1, CheckinResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(downloadResultEClass, DownloadResult.class, "DownloadResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDownloadResult_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, DownloadResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDownloadResult_RevisionNr(), ecorePackage.getEIntegerObject(), "revisionNr", null, 0, 1, DownloadResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDownloadResult_File(), this.getDataHandler(), "file", null, 0, 1, DownloadResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkoutResultEClass, CheckoutResult.class, "CheckoutResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataValueEClass, DataValue.class, "DataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataValue_FieldName(), ecorePackage.getEString(), "fieldName", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataObject_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataObject_Guid(), ecorePackage.getEString(), "guid", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataObject_Values(), this.getDataValue(), null, "values", null, 0, -1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userSessionEClass, UserSession.class, "UserSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserSession_User(), this.getUser(), null, "user", null, 0, 1, UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_Username(), ecorePackage.getEString(), "username", null, 0, 1, UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_Type(), this.getUserType(), "type", null, 0, 1, UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_RemoteAddress(), ecorePackage.getEString(), "remoteAddress", null, 0, 1, UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_ActiveSince(), ecorePackage.getEDate(), "activeSince", null, 0, 1, UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_LastActive(), ecorePackage.getEDate(), "lastActive", null, 0, 1, UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_AccessMethod(), theLogPackage.getAccessMethod(), "accessMethod", null, 0, 1, UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(migrationEClass, Migration.class, "Migration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMigration_Number(), ecorePackage.getEIntegerObject(), "number", null, 0, 1, Migration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigration_Description(), ecorePackage.getEString(), "description", null, 0, 1, Migration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigration_Executed(), ecorePackage.getEBooleanObject(), "executed", null, 0, 1, Migration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceDataValueEClass, ReferenceDataValue.class, "ReferenceDataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceDataValue_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ReferenceDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDataValue_Guid(), ecorePackage.getEString(), "guid", null, 0, 1, ReferenceDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listDataValueEClass, ListDataValue.class, "ListDataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListDataValue_Values(), this.getDataValue(), null, "values", null, 0, -1, ListDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleDataValueEClass, SimpleDataValue.class, "SimpleDataValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleDataValue_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, SimpleDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseInformationItemEClass, DatabaseInformationItem.class, "DatabaseInformationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseInformationItem_Key(), ecorePackage.getEString(), "key", null, 0, 1, DatabaseInformationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformationItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, DatabaseInformationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseInformationCategoryEClass, DatabaseInformationCategory.class, "DatabaseInformationCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseInformationCategory_Title(), ecorePackage.getEString(), "title", null, 0, 1, DatabaseInformationCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseInformationCategory_Items(), this.getDatabaseInformationItem(), null, "items", null, 0, -1, DatabaseInformationCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseInformationEClass, DatabaseInformation.class, "DatabaseInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseInformation_NumberOfProjects(), ecorePackage.getEIntegerObject(), "numberOfProjects", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_NumberOfUsers(), ecorePackage.getEIntegerObject(), "numberOfUsers", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_NumberOfRevisions(), ecorePackage.getEIntegerObject(), "numberOfRevisions", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_NumberOfCheckouts(), ecorePackage.getEIntegerObject(), "numberOfCheckouts", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_DatabaseSizeInBytes(), ecorePackage.getELongObject(), "databaseSizeInBytes", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_Type(), ecorePackage.getEString(), "type", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_Created(), ecorePackage.getEDate(), "created", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_Location(), ecorePackage.getEString(), "location", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_SchemaVersion(), ecorePackage.getEIntegerObject(), "schemaVersion", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseInformation_Categories(), this.getDatabaseInformationCategory(), null, "categories", null, 0, -1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginDescriptorEClass, PluginDescriptor.class, "PluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginDescriptor_DefaultName(), ecorePackage.getEString(), "defaultName", null, 0, 1, PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_PluginClassName(), ecorePackage.getEString(), "pluginClassName", null, 0, 1, PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1, PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_Location(), ecorePackage.getEString(), "location", null, 0, 1, PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_Enabled(), ecorePackage.getEBooleanObject(), "enabled", null, 0, 1, PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializerPluginDescriptorEClass, SerializerPluginDescriptor.class, "SerializerPluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSerializerPluginDescriptor_DefaultExtension(), ecorePackage.getEString(), "defaultExtension", null, 0, 1, SerializerPluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerializerPluginDescriptor_DefaultContentType(), ecorePackage.getEString(), "defaultContentType", null, 0, 1, SerializerPluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deserializerPluginDescriptorEClass, DeserializerPluginDescriptor.class, "DeserializerPluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(revisionSummaryTypeEClass, RevisionSummaryType.class, "RevisionSummaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevisionSummaryType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RevisionSummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevisionSummaryType_Count(), ecorePackage.getEIntegerObject(), "count", null, 0, 1, RevisionSummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionSummaryContainerEClass, RevisionSummaryContainer.class, "RevisionSummaryContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevisionSummaryContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, RevisionSummaryContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevisionSummaryContainer_Types(), this.getRevisionSummaryType(), null, "types", null, 0, -1, RevisionSummaryContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionSummaryEClass, RevisionSummary.class, "RevisionSummary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevisionSummary_List(), this.getRevisionSummaryContainer(), null, "list", null, 0, -1, RevisionSummary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longActionEClass, LongAction.class, "LongAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongAction_Identification(), ecorePackage.getEString(), "identification", null, 0, 1, LongAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLongAction_User(), this.getUser(), null, "user", null, 0, 1, LongAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongAction_Start(), ecorePackage.getEDate(), "start", null, 0, 1, LongAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongAction_Username(), ecorePackage.getEString(), "username", null, 0, 1, LongAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, LongAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longCheckinActionEClass, LongCheckinAction.class, "LongCheckinAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLongCheckinAction_Revisions(), this.getRevision(), null, "revisions", null, 0, -1, LongCheckinAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectIDMPluginDescriptorEClass, ObjectIDMPluginDescriptor.class, "ObjectIDMPluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectIDMPluginDescriptor_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, ObjectIDMPluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compareItemEClass, CompareItem.class, "CompareItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompareItem_DataObject(), this.getDataObject(), null, "dataObject", null, 0, 1, CompareItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectAddedEClass, ObjectAdded.class, "ObjectAdded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectRemovedEClass, ObjectRemoved.class, "ObjectRemoved", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectModifiedEClass, ObjectModified.class, "ObjectModified", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectModified_FieldName(), ecorePackage.getEString(), "fieldName", null, 0, 1, ObjectModified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectModified_OldValue(), ecorePackage.getEString(), "oldValue", null, 0, 1, ObjectModified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectModified_NewValue(), ecorePackage.getEString(), "newValue", null, 0, 1, ObjectModified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compareContainerEClass, CompareContainer.class, "CompareContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompareContainer_Type(), ecorePackage.getEString(), "type", null, 0, 1, CompareContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompareContainer_Items(), this.getCompareItem(), null, "items", null, 0, -1, CompareContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compareResultEClass, CompareResult.class, "CompareResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompareResult_Items(), this.getCompareContainer(), null, "items", null, 0, -1, CompareResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longActionStateEClass, LongActionState.class, "LongActionState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongActionState_Progress(), ecorePackage.getEIntegerObject(), "progress", null, 0, 1, LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_State(), this.getActionState(), "state", null, 0, 1, LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_Errors(), ecorePackage.getEString(), "errors", null, 0, -1, LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_Warnings(), ecorePackage.getEString(), "warnings", null, 0, -1, LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_Infos(), ecorePackage.getEString(), "infos", null, 0, -1, LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverInfoEClass, ServerInfo.class, "ServerInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerInfo_ServerState(), this.getServerState(), "serverState", null, 0, 1, ServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerInfo_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, ServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Major(), ecorePackage.getEIntegerObject(), "major", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Minor(), ecorePackage.getEIntegerObject(), "minor", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Revision(), ecorePackage.getEIntegerObject(), "revision", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_DownloadUrl(), ecorePackage.getEString(), "downloadUrl", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_SupportUrl(), ecorePackage.getEString(), "supportUrl", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_SupportEmail(), ecorePackage.getEString(), "supportEmail", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifcEnginePluginDescriptorEClass, IfcEnginePluginDescriptor.class, "IfcEnginePluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Mime(), ecorePackage.getEString(), "mime", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedDataSchemaEClass, ExtendedDataSchema.class, "ExtendedDataSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedDataSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_Url(), ecorePackage.getEString(), "url", null, 0, 1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedDataSchema_File(), this.getFile(), null, "file", null, 0, 1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_Size(), ecorePackage.getELong(), "size", null, 0, 1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_Validate(), ecorePackage.getEBoolean(), "validate", null, 0, 1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_Type(), this.getExtendedDataSchemaType(), "type", null, 0, 1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedDataSchema_Users(), this.getUser(), this.getUser_Schemas(), "users", null, 0, -1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedDataSchema_ExtendedData(), this.getExtendedData(), this.getExtendedData_Schema(), "extendedData", null, 0, -1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedDataEClass, ExtendedData.class, "ExtendedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedData_Url(), ecorePackage.getEString(), "url", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_File(), this.getFile(), null, "file", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedData_Size(), ecorePackage.getELong(), "size", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedData_Title(), ecorePackage.getEString(), "title", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedData_Added(), ecorePackage.getEDate(), "added", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_User(), this.getUser(), this.getUser_ExtendedData(), "user", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_Schema(), this.getExtendedDataSchema(), this.getExtendedDataSchema_ExtendedData(), "schema", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_Revision(), this.getRevision(), this.getRevision_ExtendedData(), "revision", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_Project(), this.getProject(), this.getProject_ExtendedData(), "project", null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEnginePluginDescriptorEClass, QueryEnginePluginDescriptor.class, "QueryEnginePluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryEnginePluginConfigurationEClass, QueryEnginePluginConfiguration.class, "QueryEnginePluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryEnginePluginConfiguration_UserSettings(), this.getUserSettings(), this.getUserSettings_Queryengines(), "userSettings", null, 0, 1, QueryEnginePluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelMergerPluginDescriptorEClass, ModelMergerPluginDescriptor.class, "ModelMergerPluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelMergerPluginConfigurationEClass, ModelMergerPluginConfiguration.class, "ModelMergerPluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelMergerPluginConfiguration_UserSettings(), this.getUserSettings(), this.getUserSettings_Modelmergers(), "userSettings", null, 0, 1, ModelMergerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelComparePluginDescriptorEClass, ModelComparePluginDescriptor.class, "ModelComparePluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelComparePluginConfigurationEClass, ModelComparePluginConfiguration.class, "ModelComparePluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelComparePluginConfiguration_UserSettings(), this.getUserSettings(), this.getUserSettings_Modelcompares(), "userSettings", null, 0, 1, ModelComparePluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileDescriptorEClass, ProfileDescriptor.class, "ProfileDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfileDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProfileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfileDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProfileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfileDescriptor_PublicProfile(), ecorePackage.getEBoolean(), "publicProfile", null, 0, 1, ProfileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfileDescriptor_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ProfileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDescriptorEClass, ServiceDescriptor.class, "ServiceDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Url(), ecorePackage.getEString(), "url", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Token(), ecorePackage.getEString(), "token", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_NotificationProtocol(), theLogPackage.getAccessMethod(), "notificationProtocol", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Trigger(), this.getTrigger(), "trigger", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_ReadRevision(), ecorePackage.getEBoolean(), "readRevision", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_ReadExtendedData(), ecorePackage.getEString(), "readExtendedData", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_WriteRevision(), ecorePackage.getEBoolean(), "writeRevision", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_WriteExtendedData(), ecorePackage.getEString(), "writeExtendedData", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_ProviderName(), ecorePackage.getEString(), "providerName", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ServiceIdentifier(), ecorePackage.getEString(), "serviceIdentifier", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProviderName(), ecorePackage.getEString(), "providerName", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Url(), ecorePackage.getEString(), "url", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Token(), ecorePackage.getEString(), "token", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_NotificationProtocol(), theLogPackage.getAccessMethod(), "notificationProtocol", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Trigger(), this.getTrigger(), "trigger", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ReadRevision(), ecorePackage.getEBoolean(), "readRevision", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ReadExtendedData(), this.getExtendedDataSchema(), null, "readExtendedData", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_WriteRevision(), this.getProject(), null, "writeRevision", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_WriteExtendedData(), this.getExtendedDataSchema(), null, "writeExtendedData", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProfileIdentifier(), ecorePackage.getEString(), "profileIdentifier", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProfileName(), ecorePackage.getEString(), "profileName", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProfileDescription(), ecorePackage.getEString(), "profileDescription", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProfilePublic(), ecorePackage.getEBoolean(), "profilePublic", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Project(), this.getProject(), this.getProject_Services(), "project", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_User(), this.getUser(), this.getUser_Services(), "user", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_InternalService(), this.getInternalServicePluginConfiguration(), null, "internalService", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_TokenString(), ecorePackage.getEString(), "tokenString", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Expires(), ecorePackage.getELong(), "expires", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicePluginDescriptorEClass, ServicePluginDescriptor.class, "ServicePluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalServicePluginConfigurationEClass, InternalServicePluginConfiguration.class, "InternalServicePluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalServicePluginConfiguration_RemoteAccessible(), ecorePackage.getEBoolean(), "remoteAccessible", null, 0, 1, InternalServicePluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalServicePluginConfiguration_UserSettings(), this.getUserSettings(), this.getUserSettings_Services(), "userSettings", null, 0, 1, InternalServicePluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceEClass, ServiceInterface.class, "ServiceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMethodEClass, ServiceMethod.class, "ServiceMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceMethod_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceMethod_ReturnDoc(), ecorePackage.getEString(), "returnDoc", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceFieldEClass, ServiceField.class, "ServiceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceField_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceField_Type(), this.getServiceType(), null, "type", null, 0, 1, ServiceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceField_GenericType(), this.getServiceType(), null, "genericType", null, 0, 1, ServiceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceField_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, ServiceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_SimpleName(), ecorePackage.getEString(), "simpleName", null, 0, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_Fields(), this.getServiceField(), null, "fields", null, 0, -1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceParameterEClass, ServiceParameter.class, "ServiceParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceParameter_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceParameter_Type(), this.getServiceType(), null, "type", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceParameter_GenericType(), this.getServiceType(), null, "genericType", null, 0, 1, ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectDefinitionEClass, ObjectDefinition.class, "ObjectDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectDefinition_Parameters(), this.getParameterDefinition(), null, "parameters", null, 0, -1, ObjectDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDefinitionEClass, PrimitiveDefinition.class, "PrimitiveDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDefinition_Type(), this.getPrimitiveEnum(), "type", null, 0, 1, PrimitiveDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayDefinitionEClass, ArrayDefinition.class, "ArrayDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayDefinition_Type(), this.getTypeDefinition(), null, "type", null, 0, 1, ArrayDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinition_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Type(), this.getTypeDefinition(), null, "type", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_DefaultValue(), this.getType(), null, "defaultValue", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longTypeEClass, LongType.class, "LongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongType_Value(), ecorePackage.getELong(), "value", null, 0, 1, LongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleTypeEClass, DoubleType.class, "DoubleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleType_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DoubleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringType_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanType_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayType_Values(), this.getType(), null, "values", null, 0, -1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Value(), this.getType(), null, "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(immediateNotificationResultEClass, ImmediateNotificationResult.class, "ImmediateNotificationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImmediateNotificationResult_Result(), this.getNotifictionResultEnum(), "result", null, 0, 1, ImmediateNotificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImmediateNotificationResult_Description(), ecorePackage.getEString(), "description", null, 0, 1, ImmediateNotificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalServiceUpdateEClass, ExternalServiceUpdate.class, "ExternalServiceUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(percentageChangeEClass, PercentageChange.class, "PercentageChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentageChange_Percentage(), ecorePackage.getEInt(), "percentage", null, 0, 1, PercentageChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundsEClass, Bounds.class, "Bounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBounds_Min(), this.getVector3f(), null, "min", null, 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBounds_Max(), this.getVector3f(), null, "max", null, 0, 1, Bounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vector3fEClass, Vector3f.class, "Vector3f", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVector3f_X(), ecorePackage.getEFloat(), "x", null, 0, 1, Vector3f.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector3f_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, Vector3f.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector3f_Z(), ecorePackage.getEFloat(), "z", null, 0, 1, Vector3f.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryEClass, Geometry.class, "Geometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeometry_Bounds(), this.getBounds(), null, "bounds", null, 0, 1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeometry_Indices(), ecorePackage.getEIntegerObject(), "indices", null, 0, -1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeometry_Vertices(), ecorePackage.getEFloatObject(), "vertices", null, 0, -1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeometry_Normals(), ecorePackage.getEFloatObject(), "normals", null, 0, -1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(userTypeEEnum, UserType.class, "UserType");
		addEEnumLiteral(userTypeEEnum, UserType.SYSTEM);
		addEEnumLiteral(userTypeEEnum, UserType.ADMIN);
		addEEnumLiteral(userTypeEEnum, UserType.USER);
		addEEnumLiteral(userTypeEEnum, UserType.READ_ONLY);

		initEEnum(siPrefixEEnum, SIPrefix.class, "SIPrefix");
		addEEnumLiteral(siPrefixEEnum, SIPrefix.METER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.ATTOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.FEMTOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.PICOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.NANOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.MICROMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.MILLIMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.CENTIMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.DECIMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.DECAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.HECTOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.KILOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.MEGAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.GIGAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.TERAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.PETAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.EXAMETER);

		initEEnum(objectStateEEnum, ObjectState.class, "ObjectState");
		addEEnumLiteral(objectStateEEnum, ObjectState.ACTIVE);
		addEEnumLiteral(objectStateEEnum, ObjectState.DELETED);

		initEEnum(compareTypeEEnum, CompareType.class, "CompareType");
		addEEnumLiteral(compareTypeEEnum, CompareType.ALL);
		addEEnumLiteral(compareTypeEEnum, CompareType.ADD);
		addEEnumLiteral(compareTypeEEnum, CompareType.MODIFY);
		addEEnumLiteral(compareTypeEEnum, CompareType.DELETE);

		initEEnum(actionStateEEnum, ActionState.class, "ActionState");
		addEEnumLiteral(actionStateEEnum, ActionState.UNKNOWN);
		addEEnumLiteral(actionStateEEnum, ActionState.STARTED);
		addEEnumLiteral(actionStateEEnum, ActionState.FINISHED);

		initEEnum(serverStateEEnum, ServerState.class, "ServerState");
		addEEnumLiteral(serverStateEEnum, ServerState.UNDEFINED);
		addEEnumLiteral(serverStateEEnum, ServerState.NOT_SETUP);
		addEEnumLiteral(serverStateEEnum, ServerState.MIGRATION_REQUIRED);
		addEEnumLiteral(serverStateEEnum, ServerState.MIGRATION_IMPOSSIBLE);
		addEEnumLiteral(serverStateEEnum, ServerState.FATAL_ERROR);
		addEEnumLiteral(serverStateEEnum, ServerState.RUNNING);

		initEEnum(checkinStatusEEnum, CheckinStatus.class, "CheckinStatus");
		addEEnumLiteral(checkinStatusEEnum, CheckinStatus.CH_NONE);
		addEEnumLiteral(checkinStatusEEnum, CheckinStatus.CH_STARTED);
		addEEnumLiteral(checkinStatusEEnum, CheckinStatus.CH_FINISHED);
		addEEnumLiteral(checkinStatusEEnum, CheckinStatus.CH_ERROR);

		initEEnum(extendedDataSchemaTypeEEnum, ExtendedDataSchemaType.class, "ExtendedDataSchemaType");
		addEEnumLiteral(extendedDataSchemaTypeEEnum, ExtendedDataSchemaType.XSD);
		addEEnumLiteral(extendedDataSchemaTypeEEnum, ExtendedDataSchemaType.PDF);
		addEEnumLiteral(extendedDataSchemaTypeEEnum, ExtendedDataSchemaType.TXT);

		initEEnum(triggerEEnum, Trigger.class, "Trigger");
		addEEnumLiteral(triggerEEnum, Trigger.NEW_REVISION);
		addEEnumLiteral(triggerEEnum, Trigger.NEW_PROJECT);

		initEEnum(primitiveEnumEEnum, PrimitiveEnum.class, "PrimitiveEnum");
		addEEnumLiteral(primitiveEnumEEnum, PrimitiveEnum.LONG);
		addEEnumLiteral(primitiveEnumEEnum, PrimitiveEnum.DOUBLE);
		addEEnumLiteral(primitiveEnumEEnum, PrimitiveEnum.BOOLEAN);
		addEEnumLiteral(primitiveEnumEEnum, PrimitiveEnum.STRING);

		initEEnum(notifictionResultEnumEEnum, NotifictionResultEnum.class, "NotifictionResultEnum");
		addEEnumLiteral(notifictionResultEnumEEnum, NotifictionResultEnum.ERROR);
		addEEnumLiteral(notifictionResultEnumEEnum, NotifictionResultEnum.SUCCESS);
		addEEnumLiteral(notifictionResultEnumEEnum, NotifictionResultEnum.PROGRESS_UNKNOWN);
		addEEnumLiteral(notifictionResultEnumEEnum, NotifictionResultEnum.PROGRESS_PERCENTAGE);

		// Initialize data types
		initEDataType(dataHandlerEDataType, DataHandler.class, "DataHandler", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// embedsreference
		createEmbedsreferenceAnnotations();
		// nodatabase
		createNodatabaseAnnotations();
		// hidden
		createHiddenAnnotations();
	}

	/**
	 * Initializes the annotations for <b>embedsreference</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmbedsreferenceAnnotations() {
		String source = "embedsreference";		
		addAnnotation
		  (getDataObject_Values(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getListDataValue_Values(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getDatabaseInformationCategory_Items(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getDatabaseInformation_Categories(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getRevisionSummaryContainer_Types(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getRevisionSummary_List(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getCompareItem_DataObject(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getCompareContainer_Items(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getCompareResult_Items(), 
		   source, 
		   new String[] {
		   });							
		addAnnotation
		  (getServiceField_Type(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getServiceField_GenericType(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getServiceType_Fields(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getServiceParameter_Type(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getServiceParameter_GenericType(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getObjectDefinition_Parameters(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getArrayDefinition_Type(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getParameterDefinition_Type(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getObjectType_Parameters(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getArrayType_Values(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getParameter_Value(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getBounds_Min(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getBounds_Max(), 
		   source, 
		   new String[] {
		   });	
	}

	/**
	 * Initializes the annotations for <b>nodatabase</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNodatabaseAnnotations() {
		String source = "nodatabase";											
		addAnnotation
		  (profileDescriptorEClass, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (serviceDescriptorEClass, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (serviceInterfaceEClass, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (serviceMethodEClass, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (serviceFieldEClass, 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (serviceParameterEClass, 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (typeDefinitionEClass, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (objectDefinitionEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (primitiveDefinitionEClass, 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (arrayDefinitionEClass, 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (parameterDefinitionEClass, 
		   source, 
		   new String[] {
		   });							
	}

	/**
	 * Initializes the annotations for <b>hidden</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHiddenAnnotations() {
		String source = "hidden";																																			
		addAnnotation
		  (getGeometry_Bounds(), 
		   source, 
		   new String[] {
		   });
	}

} //StorePackageImpl
