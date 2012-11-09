/**
 */
package store;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link store.UserSettings#getSerializers <em>Serializers</em>}</li>
 *   <li>{@link store.UserSettings#getObjectIDMs <em>Object ID Ms</em>}</li>
 *   <li>{@link store.UserSettings#getIfcEngines <em>Ifc Engines</em>}</li>
 *   <li>{@link store.UserSettings#getDeserializers <em>Deserializers</em>}</li>
 *   <li>{@link store.UserSettings#getQueryengines <em>Queryengines</em>}</li>
 *   <li>{@link store.UserSettings#getModelmergers <em>Modelmergers</em>}</li>
 *   <li>{@link store.UserSettings#getModelcompares <em>Modelcompares</em>}</li>
 *   <li>{@link store.UserSettings#getDefaultModelMerger <em>Default Model Merger</em>}</li>
 *   <li>{@link store.UserSettings#getDefaultModelCompare <em>Default Model Compare</em>}</li>
 *   <li>{@link store.UserSettings#getDefaultQueryEngine <em>Default Query Engine</em>}</li>
 *   <li>{@link store.UserSettings#getDefaultIfcEngine <em>Default Ifc Engine</em>}</li>
 *   <li>{@link store.UserSettings#getDefaultSerializer <em>Default Serializer</em>}</li>
 *   <li>{@link store.UserSettings#getDefaultObjectIDM <em>Default Object IDM</em>}</li>
 *   <li>{@link store.UserSettings#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see store.StorePackage#getUserSettings()
 * @model
 * @generated
 */
public interface UserSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Serializers</b></em>' reference list.
	 * The list contents are of type {@link store.SerializerPluginConfiguration}.
	 * It is bidirectional and its opposite is '{@link store.SerializerPluginConfiguration#getUserSettings <em>User Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serializers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializers</em>' reference list.
	 * @see store.StorePackage#getUserSettings_Serializers()
	 * @see store.SerializerPluginConfiguration#getUserSettings
	 * @model opposite="userSettings"
	 * @generated
	 */
	EList<SerializerPluginConfiguration> getSerializers();

	/**
	 * Returns the value of the '<em><b>Object ID Ms</b></em>' reference list.
	 * The list contents are of type {@link store.ObjectIDMPluginConfiguration}.
	 * It is bidirectional and its opposite is '{@link store.ObjectIDMPluginConfiguration#getUserSettings <em>User Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object ID Ms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object ID Ms</em>' reference list.
	 * @see store.StorePackage#getUserSettings_ObjectIDMs()
	 * @see store.ObjectIDMPluginConfiguration#getUserSettings
	 * @model opposite="userSettings"
	 * @generated
	 */
	EList<ObjectIDMPluginConfiguration> getObjectIDMs();

	/**
	 * Returns the value of the '<em><b>Ifc Engines</b></em>' reference list.
	 * The list contents are of type {@link store.IfcEnginePluginConfiguration}.
	 * It is bidirectional and its opposite is '{@link store.IfcEnginePluginConfiguration#getUserSettings <em>User Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Engines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Engines</em>' reference list.
	 * @see store.StorePackage#getUserSettings_IfcEngines()
	 * @see store.IfcEnginePluginConfiguration#getUserSettings
	 * @model opposite="userSettings"
	 * @generated
	 */
	EList<IfcEnginePluginConfiguration> getIfcEngines();

	/**
	 * Returns the value of the '<em><b>Deserializers</b></em>' reference list.
	 * The list contents are of type {@link store.DeserializerPluginConfiguration}.
	 * It is bidirectional and its opposite is '{@link store.DeserializerPluginConfiguration#getUserSettings <em>User Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deserializers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deserializers</em>' reference list.
	 * @see store.StorePackage#getUserSettings_Deserializers()
	 * @see store.DeserializerPluginConfiguration#getUserSettings
	 * @model opposite="userSettings"
	 * @generated
	 */
	EList<DeserializerPluginConfiguration> getDeserializers();

	/**
	 * Returns the value of the '<em><b>Queryengines</b></em>' reference list.
	 * The list contents are of type {@link store.QueryEnginePluginConfiguration}.
	 * It is bidirectional and its opposite is '{@link store.QueryEnginePluginConfiguration#getUserSettings <em>User Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queryengines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queryengines</em>' reference list.
	 * @see store.StorePackage#getUserSettings_Queryengines()
	 * @see store.QueryEnginePluginConfiguration#getUserSettings
	 * @model opposite="userSettings"
	 * @generated
	 */
	EList<QueryEnginePluginConfiguration> getQueryengines();

	/**
	 * Returns the value of the '<em><b>Modelmergers</b></em>' reference list.
	 * The list contents are of type {@link store.ModelMergerPluginConfiguration}.
	 * It is bidirectional and its opposite is '{@link store.ModelMergerPluginConfiguration#getUserSettings <em>User Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelmergers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelmergers</em>' reference list.
	 * @see store.StorePackage#getUserSettings_Modelmergers()
	 * @see store.ModelMergerPluginConfiguration#getUserSettings
	 * @model opposite="userSettings"
	 * @generated
	 */
	EList<ModelMergerPluginConfiguration> getModelmergers();

	/**
	 * Returns the value of the '<em><b>Modelcompares</b></em>' reference list.
	 * The list contents are of type {@link store.ModelComparePluginConfiguration}.
	 * It is bidirectional and its opposite is '{@link store.ModelComparePluginConfiguration#getUserSettings <em>User Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelcompares</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelcompares</em>' reference list.
	 * @see store.StorePackage#getUserSettings_Modelcompares()
	 * @see store.ModelComparePluginConfiguration#getUserSettings
	 * @model opposite="userSettings"
	 * @generated
	 */
	EList<ModelComparePluginConfiguration> getModelcompares();

	/**
	 * Returns the value of the '<em><b>Default Model Merger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Model Merger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Model Merger</em>' reference.
	 * @see #setDefaultModelMerger(ModelMergerPluginConfiguration)
	 * @see store.StorePackage#getUserSettings_DefaultModelMerger()
	 * @model
	 * @generated
	 */
	ModelMergerPluginConfiguration getDefaultModelMerger();

	/**
	 * Sets the value of the '{@link store.UserSettings#getDefaultModelMerger <em>Default Model Merger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Model Merger</em>' reference.
	 * @see #getDefaultModelMerger()
	 * @generated
	 */
	void setDefaultModelMerger(ModelMergerPluginConfiguration value);

	/**
	 * Returns the value of the '<em><b>Default Model Compare</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Model Compare</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Model Compare</em>' reference.
	 * @see #setDefaultModelCompare(ModelComparePluginConfiguration)
	 * @see store.StorePackage#getUserSettings_DefaultModelCompare()
	 * @model
	 * @generated
	 */
	ModelComparePluginConfiguration getDefaultModelCompare();

	/**
	 * Sets the value of the '{@link store.UserSettings#getDefaultModelCompare <em>Default Model Compare</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Model Compare</em>' reference.
	 * @see #getDefaultModelCompare()
	 * @generated
	 */
	void setDefaultModelCompare(ModelComparePluginConfiguration value);

	/**
	 * Returns the value of the '<em><b>Default Query Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Query Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Query Engine</em>' reference.
	 * @see #setDefaultQueryEngine(QueryEnginePluginConfiguration)
	 * @see store.StorePackage#getUserSettings_DefaultQueryEngine()
	 * @model
	 * @generated
	 */
	QueryEnginePluginConfiguration getDefaultQueryEngine();

	/**
	 * Sets the value of the '{@link store.UserSettings#getDefaultQueryEngine <em>Default Query Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Query Engine</em>' reference.
	 * @see #getDefaultQueryEngine()
	 * @generated
	 */
	void setDefaultQueryEngine(QueryEnginePluginConfiguration value);

	/**
	 * Returns the value of the '<em><b>Default Ifc Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Ifc Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Ifc Engine</em>' reference.
	 * @see #setDefaultIfcEngine(IfcEnginePluginConfiguration)
	 * @see store.StorePackage#getUserSettings_DefaultIfcEngine()
	 * @model
	 * @generated
	 */
	IfcEnginePluginConfiguration getDefaultIfcEngine();

	/**
	 * Sets the value of the '{@link store.UserSettings#getDefaultIfcEngine <em>Default Ifc Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Ifc Engine</em>' reference.
	 * @see #getDefaultIfcEngine()
	 * @generated
	 */
	void setDefaultIfcEngine(IfcEnginePluginConfiguration value);

	/**
	 * Returns the value of the '<em><b>Default Serializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Serializer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Serializer</em>' reference.
	 * @see #setDefaultSerializer(SerializerPluginConfiguration)
	 * @see store.StorePackage#getUserSettings_DefaultSerializer()
	 * @model
	 * @generated
	 */
	SerializerPluginConfiguration getDefaultSerializer();

	/**
	 * Sets the value of the '{@link store.UserSettings#getDefaultSerializer <em>Default Serializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Serializer</em>' reference.
	 * @see #getDefaultSerializer()
	 * @generated
	 */
	void setDefaultSerializer(SerializerPluginConfiguration value);

	/**
	 * Returns the value of the '<em><b>Default Object IDM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Object IDM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Object IDM</em>' reference.
	 * @see #setDefaultObjectIDM(ObjectIDMPluginConfiguration)
	 * @see store.StorePackage#getUserSettings_DefaultObjectIDM()
	 * @model
	 * @generated
	 */
	ObjectIDMPluginConfiguration getDefaultObjectIDM();

	/**
	 * Sets the value of the '{@link store.UserSettings#getDefaultObjectIDM <em>Default Object IDM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Object IDM</em>' reference.
	 * @see #getDefaultObjectIDM()
	 * @generated
	 */
	void setDefaultObjectIDM(ObjectIDMPluginConfiguration value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link store.InternalServicePluginConfiguration}.
	 * It is bidirectional and its opposite is '{@link store.InternalServicePluginConfiguration#getUserSettings <em>User Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see store.StorePackage#getUserSettings_Services()
	 * @see store.InternalServicePluginConfiguration#getUserSettings
	 * @model opposite="userSettings"
	 * @generated
	 */
	EList<InternalServicePluginConfiguration> getServices();

} // UserSettings
