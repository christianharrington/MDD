/**
 */
package store.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import store.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see store.StorePackage
 * @generated
 */
public class StoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreSwitch<Adapter> modelSwitch =
		new StoreSwitch<Adapter>() {
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseConcreteRevision(ConcreteRevision object) {
				return createConcreteRevisionAdapter();
			}
			@Override
			public Adapter caseGeoTag(GeoTag object) {
				return createGeoTagAdapter();
			}
			@Override
			public Adapter caseCheckout(Checkout object) {
				return createCheckoutAdapter();
			}
			@Override
			public Adapter caseServerSettings(ServerSettings object) {
				return createServerSettingsAdapter();
			}
			@Override
			public Adapter caseUserSettings(UserSettings object) {
				return createUserSettingsAdapter();
			}
			@Override
			public Adapter casePluginConfiguration(PluginConfiguration object) {
				return createPluginConfigurationAdapter();
			}
			@Override
			public Adapter caseSerializerPluginConfiguration(SerializerPluginConfiguration object) {
				return createSerializerPluginConfigurationAdapter();
			}
			@Override
			public Adapter caseObjectIDMPluginConfiguration(ObjectIDMPluginConfiguration object) {
				return createObjectIDMPluginConfigurationAdapter();
			}
			@Override
			public Adapter caseIfcEnginePluginConfiguration(IfcEnginePluginConfiguration object) {
				return createIfcEnginePluginConfigurationAdapter();
			}
			@Override
			public Adapter caseDeserializerPluginConfiguration(DeserializerPluginConfiguration object) {
				return createDeserializerPluginConfigurationAdapter();
			}
			@Override
			public Adapter caseCheckinResult(CheckinResult object) {
				return createCheckinResultAdapter();
			}
			@Override
			public Adapter caseDownloadResult(DownloadResult object) {
				return createDownloadResultAdapter();
			}
			@Override
			public Adapter caseCheckoutResult(CheckoutResult object) {
				return createCheckoutResultAdapter();
			}
			@Override
			public Adapter caseDataValue(DataValue object) {
				return createDataValueAdapter();
			}
			@Override
			public Adapter caseDataObject(DataObject object) {
				return createDataObjectAdapter();
			}
			@Override
			public Adapter caseUserSession(UserSession object) {
				return createUserSessionAdapter();
			}
			@Override
			public Adapter caseMigration(Migration object) {
				return createMigrationAdapter();
			}
			@Override
			public Adapter caseReferenceDataValue(ReferenceDataValue object) {
				return createReferenceDataValueAdapter();
			}
			@Override
			public Adapter caseListDataValue(ListDataValue object) {
				return createListDataValueAdapter();
			}
			@Override
			public Adapter caseSimpleDataValue(SimpleDataValue object) {
				return createSimpleDataValueAdapter();
			}
			@Override
			public Adapter caseDatabaseInformationItem(DatabaseInformationItem object) {
				return createDatabaseInformationItemAdapter();
			}
			@Override
			public Adapter caseDatabaseInformationCategory(DatabaseInformationCategory object) {
				return createDatabaseInformationCategoryAdapter();
			}
			@Override
			public Adapter caseDatabaseInformation(DatabaseInformation object) {
				return createDatabaseInformationAdapter();
			}
			@Override
			public Adapter casePluginDescriptor(PluginDescriptor object) {
				return createPluginDescriptorAdapter();
			}
			@Override
			public Adapter caseSerializerPluginDescriptor(SerializerPluginDescriptor object) {
				return createSerializerPluginDescriptorAdapter();
			}
			@Override
			public Adapter caseDeserializerPluginDescriptor(DeserializerPluginDescriptor object) {
				return createDeserializerPluginDescriptorAdapter();
			}
			@Override
			public Adapter caseRevisionSummaryType(RevisionSummaryType object) {
				return createRevisionSummaryTypeAdapter();
			}
			@Override
			public Adapter caseRevisionSummaryContainer(RevisionSummaryContainer object) {
				return createRevisionSummaryContainerAdapter();
			}
			@Override
			public Adapter caseRevisionSummary(RevisionSummary object) {
				return createRevisionSummaryAdapter();
			}
			@Override
			public Adapter caseLongAction(LongAction object) {
				return createLongActionAdapter();
			}
			@Override
			public Adapter caseLongCheckinAction(LongCheckinAction object) {
				return createLongCheckinActionAdapter();
			}
			@Override
			public Adapter caseObjectIDMPluginDescriptor(ObjectIDMPluginDescriptor object) {
				return createObjectIDMPluginDescriptorAdapter();
			}
			@Override
			public Adapter caseCompareItem(CompareItem object) {
				return createCompareItemAdapter();
			}
			@Override
			public Adapter caseObjectAdded(ObjectAdded object) {
				return createObjectAddedAdapter();
			}
			@Override
			public Adapter caseObjectRemoved(ObjectRemoved object) {
				return createObjectRemovedAdapter();
			}
			@Override
			public Adapter caseObjectModified(ObjectModified object) {
				return createObjectModifiedAdapter();
			}
			@Override
			public Adapter caseCompareContainer(CompareContainer object) {
				return createCompareContainerAdapter();
			}
			@Override
			public Adapter caseCompareResult(CompareResult object) {
				return createCompareResultAdapter();
			}
			@Override
			public Adapter caseLongActionState(LongActionState object) {
				return createLongActionStateAdapter();
			}
			@Override
			public Adapter caseServerInfo(ServerInfo object) {
				return createServerInfoAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseIfcEnginePluginDescriptor(IfcEnginePluginDescriptor object) {
				return createIfcEnginePluginDescriptorAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseExtendedDataSchema(ExtendedDataSchema object) {
				return createExtendedDataSchemaAdapter();
			}
			@Override
			public Adapter caseExtendedData(ExtendedData object) {
				return createExtendedDataAdapter();
			}
			@Override
			public Adapter caseQueryEnginePluginDescriptor(QueryEnginePluginDescriptor object) {
				return createQueryEnginePluginDescriptorAdapter();
			}
			@Override
			public Adapter caseQueryEnginePluginConfiguration(QueryEnginePluginConfiguration object) {
				return createQueryEnginePluginConfigurationAdapter();
			}
			@Override
			public Adapter caseModelMergerPluginDescriptor(ModelMergerPluginDescriptor object) {
				return createModelMergerPluginDescriptorAdapter();
			}
			@Override
			public Adapter caseModelMergerPluginConfiguration(ModelMergerPluginConfiguration object) {
				return createModelMergerPluginConfigurationAdapter();
			}
			@Override
			public Adapter caseModelComparePluginDescriptor(ModelComparePluginDescriptor object) {
				return createModelComparePluginDescriptorAdapter();
			}
			@Override
			public Adapter caseModelComparePluginConfiguration(ModelComparePluginConfiguration object) {
				return createModelComparePluginConfigurationAdapter();
			}
			@Override
			public Adapter caseProfileDescriptor(ProfileDescriptor object) {
				return createProfileDescriptorAdapter();
			}
			@Override
			public Adapter caseServiceDescriptor(ServiceDescriptor object) {
				return createServiceDescriptorAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseServicePluginDescriptor(ServicePluginDescriptor object) {
				return createServicePluginDescriptorAdapter();
			}
			@Override
			public Adapter caseInternalServicePluginConfiguration(InternalServicePluginConfiguration object) {
				return createInternalServicePluginConfigurationAdapter();
			}
			@Override
			public Adapter caseServiceInterface(ServiceInterface object) {
				return createServiceInterfaceAdapter();
			}
			@Override
			public Adapter caseServiceMethod(ServiceMethod object) {
				return createServiceMethodAdapter();
			}
			@Override
			public Adapter caseServiceField(ServiceField object) {
				return createServiceFieldAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseServiceParameter(ServiceParameter object) {
				return createServiceParameterAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseObjectDefinition(ObjectDefinition object) {
				return createObjectDefinitionAdapter();
			}
			@Override
			public Adapter casePrimitiveDefinition(PrimitiveDefinition object) {
				return createPrimitiveDefinitionAdapter();
			}
			@Override
			public Adapter caseArrayDefinition(ArrayDefinition object) {
				return createArrayDefinitionAdapter();
			}
			@Override
			public Adapter caseParameterDefinition(ParameterDefinition object) {
				return createParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseLongType(LongType object) {
				return createLongTypeAdapter();
			}
			@Override
			public Adapter caseDoubleType(DoubleType object) {
				return createDoubleTypeAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseImmediateNotificationResult(ImmediateNotificationResult object) {
				return createImmediateNotificationResultAdapter();
			}
			@Override
			public Adapter caseExternalServiceUpdate(ExternalServiceUpdate object) {
				return createExternalServiceUpdateAdapter();
			}
			@Override
			public Adapter casePercentageChange(PercentageChange object) {
				return createPercentageChangeAdapter();
			}
			@Override
			public Adapter caseBounds(Bounds object) {
				return createBoundsAdapter();
			}
			@Override
			public Adapter caseVector3f(Vector3f object) {
				return createVector3fAdapter();
			}
			@Override
			public Adapter caseGeometry(Geometry object) {
				return createGeometryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link store.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ConcreteRevision <em>Concrete Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ConcreteRevision
	 * @generated
	 */
	public Adapter createConcreteRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.GeoTag <em>Geo Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.GeoTag
	 * @generated
	 */
	public Adapter createGeoTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Checkout <em>Checkout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Checkout
	 * @generated
	 */
	public Adapter createCheckoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ServerSettings <em>Server Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ServerSettings
	 * @generated
	 */
	public Adapter createServerSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.UserSettings <em>User Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.UserSettings
	 * @generated
	 */
	public Adapter createUserSettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.PluginConfiguration <em>Plugin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.PluginConfiguration
	 * @generated
	 */
	public Adapter createPluginConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.SerializerPluginConfiguration <em>Serializer Plugin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.SerializerPluginConfiguration
	 * @generated
	 */
	public Adapter createSerializerPluginConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ObjectIDMPluginConfiguration <em>Object IDM Plugin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ObjectIDMPluginConfiguration
	 * @generated
	 */
	public Adapter createObjectIDMPluginConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.IfcEnginePluginConfiguration <em>Ifc Engine Plugin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.IfcEnginePluginConfiguration
	 * @generated
	 */
	public Adapter createIfcEnginePluginConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.DeserializerPluginConfiguration <em>Deserializer Plugin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.DeserializerPluginConfiguration
	 * @generated
	 */
	public Adapter createDeserializerPluginConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.CheckinResult <em>Checkin Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.CheckinResult
	 * @generated
	 */
	public Adapter createCheckinResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.DownloadResult <em>Download Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.DownloadResult
	 * @generated
	 */
	public Adapter createDownloadResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.CheckoutResult <em>Checkout Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.CheckoutResult
	 * @generated
	 */
	public Adapter createCheckoutResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.DataValue
	 * @generated
	 */
	public Adapter createDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.UserSession <em>User Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.UserSession
	 * @generated
	 */
	public Adapter createUserSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Migration <em>Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Migration
	 * @generated
	 */
	public Adapter createMigrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ReferenceDataValue <em>Reference Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ReferenceDataValue
	 * @generated
	 */
	public Adapter createReferenceDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ListDataValue <em>List Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ListDataValue
	 * @generated
	 */
	public Adapter createListDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.SimpleDataValue <em>Simple Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.SimpleDataValue
	 * @generated
	 */
	public Adapter createSimpleDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.DatabaseInformationItem <em>Database Information Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.DatabaseInformationItem
	 * @generated
	 */
	public Adapter createDatabaseInformationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.DatabaseInformationCategory <em>Database Information Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.DatabaseInformationCategory
	 * @generated
	 */
	public Adapter createDatabaseInformationCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.DatabaseInformation <em>Database Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.DatabaseInformation
	 * @generated
	 */
	public Adapter createDatabaseInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.PluginDescriptor <em>Plugin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.PluginDescriptor
	 * @generated
	 */
	public Adapter createPluginDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.SerializerPluginDescriptor <em>Serializer Plugin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.SerializerPluginDescriptor
	 * @generated
	 */
	public Adapter createSerializerPluginDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.DeserializerPluginDescriptor <em>Deserializer Plugin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.DeserializerPluginDescriptor
	 * @generated
	 */
	public Adapter createDeserializerPluginDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.RevisionSummaryType <em>Revision Summary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.RevisionSummaryType
	 * @generated
	 */
	public Adapter createRevisionSummaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.RevisionSummaryContainer <em>Revision Summary Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.RevisionSummaryContainer
	 * @generated
	 */
	public Adapter createRevisionSummaryContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.RevisionSummary <em>Revision Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.RevisionSummary
	 * @generated
	 */
	public Adapter createRevisionSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.LongAction <em>Long Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.LongAction
	 * @generated
	 */
	public Adapter createLongActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.LongCheckinAction <em>Long Checkin Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.LongCheckinAction
	 * @generated
	 */
	public Adapter createLongCheckinActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ObjectIDMPluginDescriptor <em>Object IDM Plugin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ObjectIDMPluginDescriptor
	 * @generated
	 */
	public Adapter createObjectIDMPluginDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.CompareItem <em>Compare Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.CompareItem
	 * @generated
	 */
	public Adapter createCompareItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ObjectAdded <em>Object Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ObjectAdded
	 * @generated
	 */
	public Adapter createObjectAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ObjectRemoved <em>Object Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ObjectRemoved
	 * @generated
	 */
	public Adapter createObjectRemovedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ObjectModified <em>Object Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ObjectModified
	 * @generated
	 */
	public Adapter createObjectModifiedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.CompareContainer <em>Compare Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.CompareContainer
	 * @generated
	 */
	public Adapter createCompareContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.CompareResult <em>Compare Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.CompareResult
	 * @generated
	 */
	public Adapter createCompareResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.LongActionState <em>Long Action State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.LongActionState
	 * @generated
	 */
	public Adapter createLongActionStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ServerInfo <em>Server Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ServerInfo
	 * @generated
	 */
	public Adapter createServerInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.IfcEnginePluginDescriptor <em>Ifc Engine Plugin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.IfcEnginePluginDescriptor
	 * @generated
	 */
	public Adapter createIfcEnginePluginDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ExtendedDataSchema <em>Extended Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ExtendedDataSchema
	 * @generated
	 */
	public Adapter createExtendedDataSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ExtendedData
	 * @generated
	 */
	public Adapter createExtendedDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.QueryEnginePluginDescriptor <em>Query Engine Plugin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.QueryEnginePluginDescriptor
	 * @generated
	 */
	public Adapter createQueryEnginePluginDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.QueryEnginePluginConfiguration <em>Query Engine Plugin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.QueryEnginePluginConfiguration
	 * @generated
	 */
	public Adapter createQueryEnginePluginConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ModelMergerPluginDescriptor <em>Model Merger Plugin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ModelMergerPluginDescriptor
	 * @generated
	 */
	public Adapter createModelMergerPluginDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ModelMergerPluginConfiguration <em>Model Merger Plugin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ModelMergerPluginConfiguration
	 * @generated
	 */
	public Adapter createModelMergerPluginConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ModelComparePluginDescriptor <em>Model Compare Plugin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ModelComparePluginDescriptor
	 * @generated
	 */
	public Adapter createModelComparePluginDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ModelComparePluginConfiguration <em>Model Compare Plugin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ModelComparePluginConfiguration
	 * @generated
	 */
	public Adapter createModelComparePluginConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ProfileDescriptor <em>Profile Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ProfileDescriptor
	 * @generated
	 */
	public Adapter createProfileDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ServiceDescriptor <em>Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ServiceDescriptor
	 * @generated
	 */
	public Adapter createServiceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ServicePluginDescriptor <em>Service Plugin Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ServicePluginDescriptor
	 * @generated
	 */
	public Adapter createServicePluginDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.InternalServicePluginConfiguration <em>Internal Service Plugin Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.InternalServicePluginConfiguration
	 * @generated
	 */
	public Adapter createInternalServicePluginConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ServiceInterface
	 * @generated
	 */
	public Adapter createServiceInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ServiceMethod <em>Service Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ServiceMethod
	 * @generated
	 */
	public Adapter createServiceMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ServiceField <em>Service Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ServiceField
	 * @generated
	 */
	public Adapter createServiceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ServiceParameter <em>Service Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ServiceParameter
	 * @generated
	 */
	public Adapter createServiceParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ObjectDefinition <em>Object Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ObjectDefinition
	 * @generated
	 */
	public Adapter createObjectDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.PrimitiveDefinition <em>Primitive Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.PrimitiveDefinition
	 * @generated
	 */
	public Adapter createPrimitiveDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ArrayDefinition <em>Array Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ArrayDefinition
	 * @generated
	 */
	public Adapter createArrayDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ParameterDefinition
	 * @generated
	 */
	public Adapter createParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.LongType <em>Long Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.LongType
	 * @generated
	 */
	public Adapter createLongTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.DoubleType <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.DoubleType
	 * @generated
	 */
	public Adapter createDoubleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ImmediateNotificationResult <em>Immediate Notification Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ImmediateNotificationResult
	 * @generated
	 */
	public Adapter createImmediateNotificationResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.ExternalServiceUpdate <em>External Service Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.ExternalServiceUpdate
	 * @generated
	 */
	public Adapter createExternalServiceUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.PercentageChange <em>Percentage Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.PercentageChange
	 * @generated
	 */
	public Adapter createPercentageChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Bounds
	 * @generated
	 */
	public Adapter createBoundsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Vector3f <em>Vector3f</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Vector3f
	 * @generated
	 */
	public Adapter createVector3fAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link store.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see store.Geometry
	 * @generated
	 */
	public Adapter createGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StoreAdapterFactory
