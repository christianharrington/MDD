/**
 */
package store;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see store.StorePackage
 * @generated
 */
public interface StoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoreFactory eINSTANCE = store.impl.StoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision</em>'.
	 * @generated
	 */
	Revision createRevision();

	/**
	 * Returns a new object of class '<em>Concrete Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Revision</em>'.
	 * @generated
	 */
	ConcreteRevision createConcreteRevision();

	/**
	 * Returns a new object of class '<em>Geo Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Tag</em>'.
	 * @generated
	 */
	GeoTag createGeoTag();

	/**
	 * Returns a new object of class '<em>Checkout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkout</em>'.
	 * @generated
	 */
	Checkout createCheckout();

	/**
	 * Returns a new object of class '<em>Server Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Settings</em>'.
	 * @generated
	 */
	ServerSettings createServerSettings();

	/**
	 * Returns a new object of class '<em>User Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Settings</em>'.
	 * @generated
	 */
	UserSettings createUserSettings();

	/**
	 * Returns a new object of class '<em>Plugin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin Configuration</em>'.
	 * @generated
	 */
	PluginConfiguration createPluginConfiguration();

	/**
	 * Returns a new object of class '<em>Serializer Plugin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serializer Plugin Configuration</em>'.
	 * @generated
	 */
	SerializerPluginConfiguration createSerializerPluginConfiguration();

	/**
	 * Returns a new object of class '<em>Object IDM Plugin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object IDM Plugin Configuration</em>'.
	 * @generated
	 */
	ObjectIDMPluginConfiguration createObjectIDMPluginConfiguration();

	/**
	 * Returns a new object of class '<em>Ifc Engine Plugin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ifc Engine Plugin Configuration</em>'.
	 * @generated
	 */
	IfcEnginePluginConfiguration createIfcEnginePluginConfiguration();

	/**
	 * Returns a new object of class '<em>Deserializer Plugin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deserializer Plugin Configuration</em>'.
	 * @generated
	 */
	DeserializerPluginConfiguration createDeserializerPluginConfiguration();

	/**
	 * Returns a new object of class '<em>Checkin Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkin Result</em>'.
	 * @generated
	 */
	CheckinResult createCheckinResult();

	/**
	 * Returns a new object of class '<em>Download Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Download Result</em>'.
	 * @generated
	 */
	DownloadResult createDownloadResult();

	/**
	 * Returns a new object of class '<em>Checkout Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkout Result</em>'.
	 * @generated
	 */
	CheckoutResult createCheckoutResult();

	/**
	 * Returns a new object of class '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Value</em>'.
	 * @generated
	 */
	DataValue createDataValue();

	/**
	 * Returns a new object of class '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Object</em>'.
	 * @generated
	 */
	DataObject createDataObject();

	/**
	 * Returns a new object of class '<em>User Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Session</em>'.
	 * @generated
	 */
	UserSession createUserSession();

	/**
	 * Returns a new object of class '<em>Migration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migration</em>'.
	 * @generated
	 */
	Migration createMigration();

	/**
	 * Returns a new object of class '<em>Reference Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Data Value</em>'.
	 * @generated
	 */
	ReferenceDataValue createReferenceDataValue();

	/**
	 * Returns a new object of class '<em>List Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Data Value</em>'.
	 * @generated
	 */
	ListDataValue createListDataValue();

	/**
	 * Returns a new object of class '<em>Simple Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Data Value</em>'.
	 * @generated
	 */
	SimpleDataValue createSimpleDataValue();

	/**
	 * Returns a new object of class '<em>Database Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Information Item</em>'.
	 * @generated
	 */
	DatabaseInformationItem createDatabaseInformationItem();

	/**
	 * Returns a new object of class '<em>Database Information Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Information Category</em>'.
	 * @generated
	 */
	DatabaseInformationCategory createDatabaseInformationCategory();

	/**
	 * Returns a new object of class '<em>Database Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Information</em>'.
	 * @generated
	 */
	DatabaseInformation createDatabaseInformation();

	/**
	 * Returns a new object of class '<em>Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin Descriptor</em>'.
	 * @generated
	 */
	PluginDescriptor createPluginDescriptor();

	/**
	 * Returns a new object of class '<em>Serializer Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serializer Plugin Descriptor</em>'.
	 * @generated
	 */
	SerializerPluginDescriptor createSerializerPluginDescriptor();

	/**
	 * Returns a new object of class '<em>Deserializer Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deserializer Plugin Descriptor</em>'.
	 * @generated
	 */
	DeserializerPluginDescriptor createDeserializerPluginDescriptor();

	/**
	 * Returns a new object of class '<em>Revision Summary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Summary Type</em>'.
	 * @generated
	 */
	RevisionSummaryType createRevisionSummaryType();

	/**
	 * Returns a new object of class '<em>Revision Summary Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Summary Container</em>'.
	 * @generated
	 */
	RevisionSummaryContainer createRevisionSummaryContainer();

	/**
	 * Returns a new object of class '<em>Revision Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Summary</em>'.
	 * @generated
	 */
	RevisionSummary createRevisionSummary();

	/**
	 * Returns a new object of class '<em>Long Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Action</em>'.
	 * @generated
	 */
	LongAction createLongAction();

	/**
	 * Returns a new object of class '<em>Long Checkin Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Checkin Action</em>'.
	 * @generated
	 */
	LongCheckinAction createLongCheckinAction();

	/**
	 * Returns a new object of class '<em>Object IDM Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object IDM Plugin Descriptor</em>'.
	 * @generated
	 */
	ObjectIDMPluginDescriptor createObjectIDMPluginDescriptor();

	/**
	 * Returns a new object of class '<em>Compare Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Item</em>'.
	 * @generated
	 */
	CompareItem createCompareItem();

	/**
	 * Returns a new object of class '<em>Object Added</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Added</em>'.
	 * @generated
	 */
	ObjectAdded createObjectAdded();

	/**
	 * Returns a new object of class '<em>Object Removed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Removed</em>'.
	 * @generated
	 */
	ObjectRemoved createObjectRemoved();

	/**
	 * Returns a new object of class '<em>Object Modified</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Modified</em>'.
	 * @generated
	 */
	ObjectModified createObjectModified();

	/**
	 * Returns a new object of class '<em>Compare Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Container</em>'.
	 * @generated
	 */
	CompareContainer createCompareContainer();

	/**
	 * Returns a new object of class '<em>Compare Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Result</em>'.
	 * @generated
	 */
	CompareResult createCompareResult();

	/**
	 * Returns a new object of class '<em>Long Action State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Action State</em>'.
	 * @generated
	 */
	LongActionState createLongActionState();

	/**
	 * Returns a new object of class '<em>Server Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Info</em>'.
	 * @generated
	 */
	ServerInfo createServerInfo();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Ifc Engine Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ifc Engine Plugin Descriptor</em>'.
	 * @generated
	 */
	IfcEnginePluginDescriptor createIfcEnginePluginDescriptor();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Extended Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Data Schema</em>'.
	 * @generated
	 */
	ExtendedDataSchema createExtendedDataSchema();

	/**
	 * Returns a new object of class '<em>Extended Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Data</em>'.
	 * @generated
	 */
	ExtendedData createExtendedData();

	/**
	 * Returns a new object of class '<em>Query Engine Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Engine Plugin Descriptor</em>'.
	 * @generated
	 */
	QueryEnginePluginDescriptor createQueryEnginePluginDescriptor();

	/**
	 * Returns a new object of class '<em>Query Engine Plugin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Engine Plugin Configuration</em>'.
	 * @generated
	 */
	QueryEnginePluginConfiguration createQueryEnginePluginConfiguration();

	/**
	 * Returns a new object of class '<em>Model Merger Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Merger Plugin Descriptor</em>'.
	 * @generated
	 */
	ModelMergerPluginDescriptor createModelMergerPluginDescriptor();

	/**
	 * Returns a new object of class '<em>Model Merger Plugin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Merger Plugin Configuration</em>'.
	 * @generated
	 */
	ModelMergerPluginConfiguration createModelMergerPluginConfiguration();

	/**
	 * Returns a new object of class '<em>Model Compare Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Compare Plugin Descriptor</em>'.
	 * @generated
	 */
	ModelComparePluginDescriptor createModelComparePluginDescriptor();

	/**
	 * Returns a new object of class '<em>Model Compare Plugin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Compare Plugin Configuration</em>'.
	 * @generated
	 */
	ModelComparePluginConfiguration createModelComparePluginConfiguration();

	/**
	 * Returns a new object of class '<em>Profile Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile Descriptor</em>'.
	 * @generated
	 */
	ProfileDescriptor createProfileDescriptor();

	/**
	 * Returns a new object of class '<em>Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Descriptor</em>'.
	 * @generated
	 */
	ServiceDescriptor createServiceDescriptor();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Token</em>'.
	 * @generated
	 */
	Token createToken();

	/**
	 * Returns a new object of class '<em>Service Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Plugin Descriptor</em>'.
	 * @generated
	 */
	ServicePluginDescriptor createServicePluginDescriptor();

	/**
	 * Returns a new object of class '<em>Internal Service Plugin Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Service Plugin Configuration</em>'.
	 * @generated
	 */
	InternalServicePluginConfiguration createInternalServicePluginConfiguration();

	/**
	 * Returns a new object of class '<em>Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Interface</em>'.
	 * @generated
	 */
	ServiceInterface createServiceInterface();

	/**
	 * Returns a new object of class '<em>Service Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Method</em>'.
	 * @generated
	 */
	ServiceMethod createServiceMethod();

	/**
	 * Returns a new object of class '<em>Service Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Field</em>'.
	 * @generated
	 */
	ServiceField createServiceField();

	/**
	 * Returns a new object of class '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Type</em>'.
	 * @generated
	 */
	ServiceType createServiceType();

	/**
	 * Returns a new object of class '<em>Service Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Parameter</em>'.
	 * @generated
	 */
	ServiceParameter createServiceParameter();

	/**
	 * Returns a new object of class '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Definition</em>'.
	 * @generated
	 */
	TypeDefinition createTypeDefinition();

	/**
	 * Returns a new object of class '<em>Object Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Definition</em>'.
	 * @generated
	 */
	ObjectDefinition createObjectDefinition();

	/**
	 * Returns a new object of class '<em>Primitive Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Definition</em>'.
	 * @generated
	 */
	PrimitiveDefinition createPrimitiveDefinition();

	/**
	 * Returns a new object of class '<em>Array Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Definition</em>'.
	 * @generated
	 */
	ArrayDefinition createArrayDefinition();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	ParameterDefinition createParameterDefinition();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Type</em>'.
	 * @generated
	 */
	ObjectType createObjectType();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Long Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Type</em>'.
	 * @generated
	 */
	LongType createLongType();

	/**
	 * Returns a new object of class '<em>Double Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Type</em>'.
	 * @generated
	 */
	DoubleType createDoubleType();

	/**
	 * Returns a new object of class '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type</em>'.
	 * @generated
	 */
	StringType createStringType();

	/**
	 * Returns a new object of class '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type</em>'.
	 * @generated
	 */
	BooleanType createBooleanType();

	/**
	 * Returns a new object of class '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type</em>'.
	 * @generated
	 */
	ArrayType createArrayType();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Immediate Notification Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Immediate Notification Result</em>'.
	 * @generated
	 */
	ImmediateNotificationResult createImmediateNotificationResult();

	/**
	 * Returns a new object of class '<em>External Service Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Service Update</em>'.
	 * @generated
	 */
	ExternalServiceUpdate createExternalServiceUpdate();

	/**
	 * Returns a new object of class '<em>Percentage Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percentage Change</em>'.
	 * @generated
	 */
	PercentageChange createPercentageChange();

	/**
	 * Returns a new object of class '<em>Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounds</em>'.
	 * @generated
	 */
	Bounds createBounds();

	/**
	 * Returns a new object of class '<em>Vector3f</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector3f</em>'.
	 * @generated
	 */
	Vector3f createVector3f();

	/**
	 * Returns a new object of class '<em>Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry</em>'.
	 * @generated
	 */
	Geometry createGeometry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StorePackage getStorePackage();

} //StoreFactory
