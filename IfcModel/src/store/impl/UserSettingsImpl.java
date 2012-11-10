/**
 */
package store.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import store.DeserializerPluginConfiguration;
import store.IfcEnginePluginConfiguration;
import store.InternalServicePluginConfiguration;
import store.ModelComparePluginConfiguration;
import store.ModelMergerPluginConfiguration;
import store.ObjectIDMPluginConfiguration;
import store.QueryEnginePluginConfiguration;
import store.SerializerPluginConfiguration;
import store.StorePackage;
import store.UserSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.UserSettingsImpl#getSerializers <em>Serializers</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getObjectIDMs <em>Object ID Ms</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getIfcEngines <em>Ifc Engines</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getDeserializers <em>Deserializers</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getQueryengines <em>Queryengines</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getModelmergers <em>Modelmergers</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getModelcompares <em>Modelcompares</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getDefaultModelMerger <em>Default Model Merger</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getDefaultModelCompare <em>Default Model Compare</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getDefaultQueryEngine <em>Default Query Engine</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getDefaultIfcEngine <em>Default Ifc Engine</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getDefaultSerializer <em>Default Serializer</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getDefaultObjectIDM <em>Default Object IDM</em>}</li>
 *   <li>{@link store.impl.UserSettingsImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserSettingsImpl extends EObjectImpl implements UserSettings {
	/**
	 * The cached value of the '{@link #getSerializers() <em>Serializers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializers()
	 * @generated
	 * @ordered
	 */
	protected EList<SerializerPluginConfiguration> serializers;

	/**
	 * The cached value of the '{@link #getObjectIDMs() <em>Object ID Ms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectIDMs()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectIDMPluginConfiguration> objectIDMs;

	/**
	 * The cached value of the '{@link #getIfcEngines() <em>Ifc Engines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcEngines()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcEnginePluginConfiguration> ifcEngines;

	/**
	 * The cached value of the '{@link #getDeserializers() <em>Deserializers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeserializers()
	 * @generated
	 * @ordered
	 */
	protected EList<DeserializerPluginConfiguration> deserializers;

	/**
	 * The cached value of the '{@link #getQueryengines() <em>Queryengines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryengines()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryEnginePluginConfiguration> queryengines;

	/**
	 * The cached value of the '{@link #getModelmergers() <em>Modelmergers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelmergers()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelMergerPluginConfiguration> modelmergers;

	/**
	 * The cached value of the '{@link #getModelcompares() <em>Modelcompares</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelcompares()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelComparePluginConfiguration> modelcompares;

	/**
	 * The cached value of the '{@link #getDefaultModelMerger() <em>Default Model Merger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultModelMerger()
	 * @generated
	 * @ordered
	 */
	protected ModelMergerPluginConfiguration defaultModelMerger;

	/**
	 * The cached value of the '{@link #getDefaultModelCompare() <em>Default Model Compare</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultModelCompare()
	 * @generated
	 * @ordered
	 */
	protected ModelComparePluginConfiguration defaultModelCompare;

	/**
	 * The cached value of the '{@link #getDefaultQueryEngine() <em>Default Query Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultQueryEngine()
	 * @generated
	 * @ordered
	 */
	protected QueryEnginePluginConfiguration defaultQueryEngine;

	/**
	 * The cached value of the '{@link #getDefaultIfcEngine() <em>Default Ifc Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultIfcEngine()
	 * @generated
	 * @ordered
	 */
	protected IfcEnginePluginConfiguration defaultIfcEngine;

	/**
	 * The cached value of the '{@link #getDefaultSerializer() <em>Default Serializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSerializer()
	 * @generated
	 * @ordered
	 */
	protected SerializerPluginConfiguration defaultSerializer;

	/**
	 * The cached value of the '{@link #getDefaultObjectIDM() <em>Default Object IDM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultObjectIDM()
	 * @generated
	 * @ordered
	 */
	protected ObjectIDMPluginConfiguration defaultObjectIDM;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalServicePluginConfiguration> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.USER_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SerializerPluginConfiguration> getSerializers() {
		if (serializers == null) {
			serializers = new EObjectWithInverseResolvingEList<SerializerPluginConfiguration>(SerializerPluginConfiguration.class, this, StorePackage.USER_SETTINGS__SERIALIZERS, StorePackage.SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS);
		}
		return serializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIDMPluginConfiguration> getObjectIDMs() {
		if (objectIDMs == null) {
			objectIDMs = new EObjectWithInverseResolvingEList<ObjectIDMPluginConfiguration>(ObjectIDMPluginConfiguration.class, this, StorePackage.USER_SETTINGS__OBJECT_ID_MS, StorePackage.OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS);
		}
		return objectIDMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcEnginePluginConfiguration> getIfcEngines() {
		if (ifcEngines == null) {
			ifcEngines = new EObjectWithInverseResolvingEList<IfcEnginePluginConfiguration>(IfcEnginePluginConfiguration.class, this, StorePackage.USER_SETTINGS__IFC_ENGINES, StorePackage.IFC_ENGINE_PLUGIN_CONFIGURATION__USER_SETTINGS);
		}
		return ifcEngines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeserializerPluginConfiguration> getDeserializers() {
		if (deserializers == null) {
			deserializers = new EObjectWithInverseResolvingEList<DeserializerPluginConfiguration>(DeserializerPluginConfiguration.class, this, StorePackage.USER_SETTINGS__DESERIALIZERS, StorePackage.DESERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS);
		}
		return deserializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryEnginePluginConfiguration> getQueryengines() {
		if (queryengines == null) {
			queryengines = new EObjectWithInverseResolvingEList<QueryEnginePluginConfiguration>(QueryEnginePluginConfiguration.class, this, StorePackage.USER_SETTINGS__QUERYENGINES, StorePackage.QUERY_ENGINE_PLUGIN_CONFIGURATION__USER_SETTINGS);
		}
		return queryengines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelMergerPluginConfiguration> getModelmergers() {
		if (modelmergers == null) {
			modelmergers = new EObjectWithInverseResolvingEList<ModelMergerPluginConfiguration>(ModelMergerPluginConfiguration.class, this, StorePackage.USER_SETTINGS__MODELMERGERS, StorePackage.MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS);
		}
		return modelmergers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelComparePluginConfiguration> getModelcompares() {
		if (modelcompares == null) {
			modelcompares = new EObjectWithInverseResolvingEList<ModelComparePluginConfiguration>(ModelComparePluginConfiguration.class, this, StorePackage.USER_SETTINGS__MODELCOMPARES, StorePackage.MODEL_COMPARE_PLUGIN_CONFIGURATION__USER_SETTINGS);
		}
		return modelcompares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelMergerPluginConfiguration getDefaultModelMerger() {
		if (defaultModelMerger != null && defaultModelMerger.eIsProxy()) {
			InternalEObject oldDefaultModelMerger = (InternalEObject)defaultModelMerger;
			defaultModelMerger = (ModelMergerPluginConfiguration)eResolveProxy(oldDefaultModelMerger);
			if (defaultModelMerger != oldDefaultModelMerger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.USER_SETTINGS__DEFAULT_MODEL_MERGER, oldDefaultModelMerger, defaultModelMerger));
			}
		}
		return defaultModelMerger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelMergerPluginConfiguration basicGetDefaultModelMerger() {
		return defaultModelMerger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultModelMerger(ModelMergerPluginConfiguration newDefaultModelMerger) {
		ModelMergerPluginConfiguration oldDefaultModelMerger = defaultModelMerger;
		defaultModelMerger = newDefaultModelMerger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SETTINGS__DEFAULT_MODEL_MERGER, oldDefaultModelMerger, defaultModelMerger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelComparePluginConfiguration getDefaultModelCompare() {
		if (defaultModelCompare != null && defaultModelCompare.eIsProxy()) {
			InternalEObject oldDefaultModelCompare = (InternalEObject)defaultModelCompare;
			defaultModelCompare = (ModelComparePluginConfiguration)eResolveProxy(oldDefaultModelCompare);
			if (defaultModelCompare != oldDefaultModelCompare) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.USER_SETTINGS__DEFAULT_MODEL_COMPARE, oldDefaultModelCompare, defaultModelCompare));
			}
		}
		return defaultModelCompare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelComparePluginConfiguration basicGetDefaultModelCompare() {
		return defaultModelCompare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultModelCompare(ModelComparePluginConfiguration newDefaultModelCompare) {
		ModelComparePluginConfiguration oldDefaultModelCompare = defaultModelCompare;
		defaultModelCompare = newDefaultModelCompare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SETTINGS__DEFAULT_MODEL_COMPARE, oldDefaultModelCompare, defaultModelCompare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryEnginePluginConfiguration getDefaultQueryEngine() {
		if (defaultQueryEngine != null && defaultQueryEngine.eIsProxy()) {
			InternalEObject oldDefaultQueryEngine = (InternalEObject)defaultQueryEngine;
			defaultQueryEngine = (QueryEnginePluginConfiguration)eResolveProxy(oldDefaultQueryEngine);
			if (defaultQueryEngine != oldDefaultQueryEngine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.USER_SETTINGS__DEFAULT_QUERY_ENGINE, oldDefaultQueryEngine, defaultQueryEngine));
			}
		}
		return defaultQueryEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryEnginePluginConfiguration basicGetDefaultQueryEngine() {
		return defaultQueryEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultQueryEngine(QueryEnginePluginConfiguration newDefaultQueryEngine) {
		QueryEnginePluginConfiguration oldDefaultQueryEngine = defaultQueryEngine;
		defaultQueryEngine = newDefaultQueryEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SETTINGS__DEFAULT_QUERY_ENGINE, oldDefaultQueryEngine, defaultQueryEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnginePluginConfiguration getDefaultIfcEngine() {
		if (defaultIfcEngine != null && defaultIfcEngine.eIsProxy()) {
			InternalEObject oldDefaultIfcEngine = (InternalEObject)defaultIfcEngine;
			defaultIfcEngine = (IfcEnginePluginConfiguration)eResolveProxy(oldDefaultIfcEngine);
			if (defaultIfcEngine != oldDefaultIfcEngine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.USER_SETTINGS__DEFAULT_IFC_ENGINE, oldDefaultIfcEngine, defaultIfcEngine));
			}
		}
		return defaultIfcEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnginePluginConfiguration basicGetDefaultIfcEngine() {
		return defaultIfcEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultIfcEngine(IfcEnginePluginConfiguration newDefaultIfcEngine) {
		IfcEnginePluginConfiguration oldDefaultIfcEngine = defaultIfcEngine;
		defaultIfcEngine = newDefaultIfcEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SETTINGS__DEFAULT_IFC_ENGINE, oldDefaultIfcEngine, defaultIfcEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializerPluginConfiguration getDefaultSerializer() {
		if (defaultSerializer != null && defaultSerializer.eIsProxy()) {
			InternalEObject oldDefaultSerializer = (InternalEObject)defaultSerializer;
			defaultSerializer = (SerializerPluginConfiguration)eResolveProxy(oldDefaultSerializer);
			if (defaultSerializer != oldDefaultSerializer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.USER_SETTINGS__DEFAULT_SERIALIZER, oldDefaultSerializer, defaultSerializer));
			}
		}
		return defaultSerializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializerPluginConfiguration basicGetDefaultSerializer() {
		return defaultSerializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultSerializer(SerializerPluginConfiguration newDefaultSerializer) {
		SerializerPluginConfiguration oldDefaultSerializer = defaultSerializer;
		defaultSerializer = newDefaultSerializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SETTINGS__DEFAULT_SERIALIZER, oldDefaultSerializer, defaultSerializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIDMPluginConfiguration getDefaultObjectIDM() {
		if (defaultObjectIDM != null && defaultObjectIDM.eIsProxy()) {
			InternalEObject oldDefaultObjectIDM = (InternalEObject)defaultObjectIDM;
			defaultObjectIDM = (ObjectIDMPluginConfiguration)eResolveProxy(oldDefaultObjectIDM);
			if (defaultObjectIDM != oldDefaultObjectIDM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.USER_SETTINGS__DEFAULT_OBJECT_IDM, oldDefaultObjectIDM, defaultObjectIDM));
			}
		}
		return defaultObjectIDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIDMPluginConfiguration basicGetDefaultObjectIDM() {
		return defaultObjectIDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultObjectIDM(ObjectIDMPluginConfiguration newDefaultObjectIDM) {
		ObjectIDMPluginConfiguration oldDefaultObjectIDM = defaultObjectIDM;
		defaultObjectIDM = newDefaultObjectIDM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SETTINGS__DEFAULT_OBJECT_IDM, oldDefaultObjectIDM, defaultObjectIDM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalServicePluginConfiguration> getServices() {
		if (services == null) {
			services = new EObjectWithInverseResolvingEList<InternalServicePluginConfiguration>(InternalServicePluginConfiguration.class, this, StorePackage.USER_SETTINGS__SERVICES, StorePackage.INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.USER_SETTINGS__SERIALIZERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSerializers()).basicAdd(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__OBJECT_ID_MS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectIDMs()).basicAdd(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__IFC_ENGINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIfcEngines()).basicAdd(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__DESERIALIZERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeserializers()).basicAdd(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__QUERYENGINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQueryengines()).basicAdd(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__MODELMERGERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelmergers()).basicAdd(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__MODELCOMPARES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelcompares()).basicAdd(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.USER_SETTINGS__SERIALIZERS:
				return ((InternalEList<?>)getSerializers()).basicRemove(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__OBJECT_ID_MS:
				return ((InternalEList<?>)getObjectIDMs()).basicRemove(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__IFC_ENGINES:
				return ((InternalEList<?>)getIfcEngines()).basicRemove(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__DESERIALIZERS:
				return ((InternalEList<?>)getDeserializers()).basicRemove(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__QUERYENGINES:
				return ((InternalEList<?>)getQueryengines()).basicRemove(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__MODELMERGERS:
				return ((InternalEList<?>)getModelmergers()).basicRemove(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__MODELCOMPARES:
				return ((InternalEList<?>)getModelcompares()).basicRemove(otherEnd, msgs);
			case StorePackage.USER_SETTINGS__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case StorePackage.USER_SETTINGS__SERIALIZERS:
				return getSerializers();
			case StorePackage.USER_SETTINGS__OBJECT_ID_MS:
				return getObjectIDMs();
			case StorePackage.USER_SETTINGS__IFC_ENGINES:
				return getIfcEngines();
			case StorePackage.USER_SETTINGS__DESERIALIZERS:
				return getDeserializers();
			case StorePackage.USER_SETTINGS__QUERYENGINES:
				return getQueryengines();
			case StorePackage.USER_SETTINGS__MODELMERGERS:
				return getModelmergers();
			case StorePackage.USER_SETTINGS__MODELCOMPARES:
				return getModelcompares();
			case StorePackage.USER_SETTINGS__DEFAULT_MODEL_MERGER:
				if (resolve) return getDefaultModelMerger();
				return basicGetDefaultModelMerger();
			case StorePackage.USER_SETTINGS__DEFAULT_MODEL_COMPARE:
				if (resolve) return getDefaultModelCompare();
				return basicGetDefaultModelCompare();
			case StorePackage.USER_SETTINGS__DEFAULT_QUERY_ENGINE:
				if (resolve) return getDefaultQueryEngine();
				return basicGetDefaultQueryEngine();
			case StorePackage.USER_SETTINGS__DEFAULT_IFC_ENGINE:
				if (resolve) return getDefaultIfcEngine();
				return basicGetDefaultIfcEngine();
			case StorePackage.USER_SETTINGS__DEFAULT_SERIALIZER:
				if (resolve) return getDefaultSerializer();
				return basicGetDefaultSerializer();
			case StorePackage.USER_SETTINGS__DEFAULT_OBJECT_IDM:
				if (resolve) return getDefaultObjectIDM();
				return basicGetDefaultObjectIDM();
			case StorePackage.USER_SETTINGS__SERVICES:
				return getServices();
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
			case StorePackage.USER_SETTINGS__SERIALIZERS:
				getSerializers().clear();
				getSerializers().addAll((Collection<? extends SerializerPluginConfiguration>)newValue);
				return;
			case StorePackage.USER_SETTINGS__OBJECT_ID_MS:
				getObjectIDMs().clear();
				getObjectIDMs().addAll((Collection<? extends ObjectIDMPluginConfiguration>)newValue);
				return;
			case StorePackage.USER_SETTINGS__IFC_ENGINES:
				getIfcEngines().clear();
				getIfcEngines().addAll((Collection<? extends IfcEnginePluginConfiguration>)newValue);
				return;
			case StorePackage.USER_SETTINGS__DESERIALIZERS:
				getDeserializers().clear();
				getDeserializers().addAll((Collection<? extends DeserializerPluginConfiguration>)newValue);
				return;
			case StorePackage.USER_SETTINGS__QUERYENGINES:
				getQueryengines().clear();
				getQueryengines().addAll((Collection<? extends QueryEnginePluginConfiguration>)newValue);
				return;
			case StorePackage.USER_SETTINGS__MODELMERGERS:
				getModelmergers().clear();
				getModelmergers().addAll((Collection<? extends ModelMergerPluginConfiguration>)newValue);
				return;
			case StorePackage.USER_SETTINGS__MODELCOMPARES:
				getModelcompares().clear();
				getModelcompares().addAll((Collection<? extends ModelComparePluginConfiguration>)newValue);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_MODEL_MERGER:
				setDefaultModelMerger((ModelMergerPluginConfiguration)newValue);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_MODEL_COMPARE:
				setDefaultModelCompare((ModelComparePluginConfiguration)newValue);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_QUERY_ENGINE:
				setDefaultQueryEngine((QueryEnginePluginConfiguration)newValue);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_IFC_ENGINE:
				setDefaultIfcEngine((IfcEnginePluginConfiguration)newValue);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_SERIALIZER:
				setDefaultSerializer((SerializerPluginConfiguration)newValue);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_OBJECT_IDM:
				setDefaultObjectIDM((ObjectIDMPluginConfiguration)newValue);
				return;
			case StorePackage.USER_SETTINGS__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends InternalServicePluginConfiguration>)newValue);
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
			case StorePackage.USER_SETTINGS__SERIALIZERS:
				getSerializers().clear();
				return;
			case StorePackage.USER_SETTINGS__OBJECT_ID_MS:
				getObjectIDMs().clear();
				return;
			case StorePackage.USER_SETTINGS__IFC_ENGINES:
				getIfcEngines().clear();
				return;
			case StorePackage.USER_SETTINGS__DESERIALIZERS:
				getDeserializers().clear();
				return;
			case StorePackage.USER_SETTINGS__QUERYENGINES:
				getQueryengines().clear();
				return;
			case StorePackage.USER_SETTINGS__MODELMERGERS:
				getModelmergers().clear();
				return;
			case StorePackage.USER_SETTINGS__MODELCOMPARES:
				getModelcompares().clear();
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_MODEL_MERGER:
				setDefaultModelMerger((ModelMergerPluginConfiguration)null);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_MODEL_COMPARE:
				setDefaultModelCompare((ModelComparePluginConfiguration)null);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_QUERY_ENGINE:
				setDefaultQueryEngine((QueryEnginePluginConfiguration)null);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_IFC_ENGINE:
				setDefaultIfcEngine((IfcEnginePluginConfiguration)null);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_SERIALIZER:
				setDefaultSerializer((SerializerPluginConfiguration)null);
				return;
			case StorePackage.USER_SETTINGS__DEFAULT_OBJECT_IDM:
				setDefaultObjectIDM((ObjectIDMPluginConfiguration)null);
				return;
			case StorePackage.USER_SETTINGS__SERVICES:
				getServices().clear();
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
			case StorePackage.USER_SETTINGS__SERIALIZERS:
				return serializers != null && !serializers.isEmpty();
			case StorePackage.USER_SETTINGS__OBJECT_ID_MS:
				return objectIDMs != null && !objectIDMs.isEmpty();
			case StorePackage.USER_SETTINGS__IFC_ENGINES:
				return ifcEngines != null && !ifcEngines.isEmpty();
			case StorePackage.USER_SETTINGS__DESERIALIZERS:
				return deserializers != null && !deserializers.isEmpty();
			case StorePackage.USER_SETTINGS__QUERYENGINES:
				return queryengines != null && !queryengines.isEmpty();
			case StorePackage.USER_SETTINGS__MODELMERGERS:
				return modelmergers != null && !modelmergers.isEmpty();
			case StorePackage.USER_SETTINGS__MODELCOMPARES:
				return modelcompares != null && !modelcompares.isEmpty();
			case StorePackage.USER_SETTINGS__DEFAULT_MODEL_MERGER:
				return defaultModelMerger != null;
			case StorePackage.USER_SETTINGS__DEFAULT_MODEL_COMPARE:
				return defaultModelCompare != null;
			case StorePackage.USER_SETTINGS__DEFAULT_QUERY_ENGINE:
				return defaultQueryEngine != null;
			case StorePackage.USER_SETTINGS__DEFAULT_IFC_ENGINE:
				return defaultIfcEngine != null;
			case StorePackage.USER_SETTINGS__DEFAULT_SERIALIZER:
				return defaultSerializer != null;
			case StorePackage.USER_SETTINGS__DEFAULT_OBJECT_IDM:
				return defaultObjectIDM != null;
			case StorePackage.USER_SETTINGS__SERVICES:
				return services != null && !services.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserSettingsImpl
