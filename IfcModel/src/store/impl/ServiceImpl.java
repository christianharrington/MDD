/**
 */
package store.impl;

import log.AccessMethod;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.ExtendedDataSchema;
import store.InternalServicePluginConfiguration;
import store.Project;
import store.Service;
import store.StorePackage;
import store.Trigger;
import store.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getServiceIdentifier <em>Service Identifier</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getToken <em>Token</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getNotificationProtocol <em>Notification Protocol</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#isReadRevision <em>Read Revision</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getReadExtendedData <em>Read Extended Data</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getWriteRevision <em>Write Revision</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getWriteExtendedData <em>Write Extended Data</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getProfileIdentifier <em>Profile Identifier</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getProfileDescription <em>Profile Description</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#isProfilePublic <em>Profile Public</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getProject <em>Project</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getUser <em>User</em>}</li>
 *   <li>{@link store.impl.ServiceImpl#getInternalService <em>Internal Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceIdentifier() <em>Service Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceIdentifier() <em>Service Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String serviceIdentifier = SERVICE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderName() <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderName()
	 * @generated
	 * @ordered
	 */
	protected String providerName = PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationProtocol() <em>Notification Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMethod NOTIFICATION_PROTOCOL_EDEFAULT = AccessMethod.SOAP;

	/**
	 * The cached value of the '{@link #getNotificationProtocol() <em>Notification Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationProtocol()
	 * @generated
	 * @ordered
	 */
	protected AccessMethod notificationProtocol = NOTIFICATION_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final Trigger TRIGGER_EDEFAULT = Trigger.NEW_REVISION;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Trigger trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadRevision() <em>Read Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadRevision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_REVISION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadRevision() <em>Read Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadRevision()
	 * @generated
	 * @ordered
	 */
	protected boolean readRevision = READ_REVISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReadExtendedData() <em>Read Extended Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadExtendedData()
	 * @generated
	 * @ordered
	 */
	protected ExtendedDataSchema readExtendedData;

	/**
	 * The cached value of the '{@link #getWriteRevision() <em>Write Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteRevision()
	 * @generated
	 * @ordered
	 */
	protected Project writeRevision;

	/**
	 * The cached value of the '{@link #getWriteExtendedData() <em>Write Extended Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteExtendedData()
	 * @generated
	 * @ordered
	 */
	protected ExtendedDataSchema writeExtendedData;

	/**
	 * The default value of the '{@link #getProfileIdentifier() <em>Profile Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileIdentifier() <em>Profile Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String profileIdentifier = PROFILE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileName()
	 * @generated
	 * @ordered
	 */
	protected String profileName = PROFILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileDescription() <em>Profile Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileDescription() <em>Profile Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileDescription()
	 * @generated
	 * @ordered
	 */
	protected String profileDescription = PROFILE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isProfilePublic() <em>Profile Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProfilePublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROFILE_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProfilePublic() <em>Profile Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProfilePublic()
	 * @generated
	 * @ordered
	 */
	protected boolean profilePublic = PROFILE_PUBLIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getInternalService() <em>Internal Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalService()
	 * @generated
	 * @ordered
	 */
	protected InternalServicePluginConfiguration internalService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceIdentifier() {
		return serviceIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceIdentifier(String newServiceIdentifier) {
		String oldServiceIdentifier = serviceIdentifier;
		serviceIdentifier = newServiceIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__SERVICE_IDENTIFIER, oldServiceIdentifier, serviceIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProviderName(String newProviderName) {
		String oldProviderName = providerName;
		providerName = newProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMethod getNotificationProtocol() {
		return notificationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationProtocol(AccessMethod newNotificationProtocol) {
		AccessMethod oldNotificationProtocol = notificationProtocol;
		notificationProtocol = newNotificationProtocol == null ? NOTIFICATION_PROTOCOL_EDEFAULT : newNotificationProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__NOTIFICATION_PROTOCOL, oldNotificationProtocol, notificationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Trigger newTrigger) {
		Trigger oldTrigger = trigger;
		trigger = newTrigger == null ? TRIGGER_EDEFAULT : newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadRevision() {
		return readRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadRevision(boolean newReadRevision) {
		boolean oldReadRevision = readRevision;
		readRevision = newReadRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__READ_REVISION, oldReadRevision, readRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchema getReadExtendedData() {
		if (readExtendedData != null && readExtendedData.eIsProxy()) {
			InternalEObject oldReadExtendedData = (InternalEObject)readExtendedData;
			readExtendedData = (ExtendedDataSchema)eResolveProxy(oldReadExtendedData);
			if (readExtendedData != oldReadExtendedData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SERVICE__READ_EXTENDED_DATA, oldReadExtendedData, readExtendedData));
			}
		}
		return readExtendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchema basicGetReadExtendedData() {
		return readExtendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadExtendedData(ExtendedDataSchema newReadExtendedData) {
		ExtendedDataSchema oldReadExtendedData = readExtendedData;
		readExtendedData = newReadExtendedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__READ_EXTENDED_DATA, oldReadExtendedData, readExtendedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getWriteRevision() {
		if (writeRevision != null && writeRevision.eIsProxy()) {
			InternalEObject oldWriteRevision = (InternalEObject)writeRevision;
			writeRevision = (Project)eResolveProxy(oldWriteRevision);
			if (writeRevision != oldWriteRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SERVICE__WRITE_REVISION, oldWriteRevision, writeRevision));
			}
		}
		return writeRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetWriteRevision() {
		return writeRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteRevision(Project newWriteRevision) {
		Project oldWriteRevision = writeRevision;
		writeRevision = newWriteRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__WRITE_REVISION, oldWriteRevision, writeRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchema getWriteExtendedData() {
		if (writeExtendedData != null && writeExtendedData.eIsProxy()) {
			InternalEObject oldWriteExtendedData = (InternalEObject)writeExtendedData;
			writeExtendedData = (ExtendedDataSchema)eResolveProxy(oldWriteExtendedData);
			if (writeExtendedData != oldWriteExtendedData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SERVICE__WRITE_EXTENDED_DATA, oldWriteExtendedData, writeExtendedData));
			}
		}
		return writeExtendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchema basicGetWriteExtendedData() {
		return writeExtendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteExtendedData(ExtendedDataSchema newWriteExtendedData) {
		ExtendedDataSchema oldWriteExtendedData = writeExtendedData;
		writeExtendedData = newWriteExtendedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__WRITE_EXTENDED_DATA, oldWriteExtendedData, writeExtendedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileIdentifier() {
		return profileIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileIdentifier(String newProfileIdentifier) {
		String oldProfileIdentifier = profileIdentifier;
		profileIdentifier = newProfileIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__PROFILE_IDENTIFIER, oldProfileIdentifier, profileIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileName() {
		return profileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileName(String newProfileName) {
		String oldProfileName = profileName;
		profileName = newProfileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__PROFILE_NAME, oldProfileName, profileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileDescription() {
		return profileDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileDescription(String newProfileDescription) {
		String oldProfileDescription = profileDescription;
		profileDescription = newProfileDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__PROFILE_DESCRIPTION, oldProfileDescription, profileDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProfilePublic() {
		return profilePublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfilePublic(boolean newProfilePublic) {
		boolean oldProfilePublic = profilePublic;
		profilePublic = newProfilePublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__PROFILE_PUBLIC, oldProfilePublic, profilePublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SERVICE__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__SERVICES, Project.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, StorePackage.PROJECT__SERVICES, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SERVICE__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, StorePackage.USER__SERVICES, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, StorePackage.USER__SERVICES, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalServicePluginConfiguration getInternalService() {
		if (internalService != null && internalService.eIsProxy()) {
			InternalEObject oldInternalService = (InternalEObject)internalService;
			internalService = (InternalServicePluginConfiguration)eResolveProxy(oldInternalService);
			if (internalService != oldInternalService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.SERVICE__INTERNAL_SERVICE, oldInternalService, internalService));
			}
		}
		return internalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalServicePluginConfiguration basicGetInternalService() {
		return internalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalService(InternalServicePluginConfiguration newInternalService) {
		InternalServicePluginConfiguration oldInternalService = internalService;
		internalService = newInternalService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE__INTERNAL_SERVICE, oldInternalService, internalService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.SERVICE__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__SERVICES, Project.class, msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case StorePackage.SERVICE__USER:
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, StorePackage.USER__SERVICES, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
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
			case StorePackage.SERVICE__PROJECT:
				return basicSetProject(null, msgs);
			case StorePackage.SERVICE__USER:
				return basicSetUser(null, msgs);
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
			case StorePackage.SERVICE__NAME:
				return getName();
			case StorePackage.SERVICE__SERVICE_NAME:
				return getServiceName();
			case StorePackage.SERVICE__SERVICE_IDENTIFIER:
				return getServiceIdentifier();
			case StorePackage.SERVICE__PROVIDER_NAME:
				return getProviderName();
			case StorePackage.SERVICE__URL:
				return getUrl();
			case StorePackage.SERVICE__TOKEN:
				return getToken();
			case StorePackage.SERVICE__NOTIFICATION_PROTOCOL:
				return getNotificationProtocol();
			case StorePackage.SERVICE__DESCRIPTION:
				return getDescription();
			case StorePackage.SERVICE__TRIGGER:
				return getTrigger();
			case StorePackage.SERVICE__READ_REVISION:
				return isReadRevision();
			case StorePackage.SERVICE__READ_EXTENDED_DATA:
				if (resolve) return getReadExtendedData();
				return basicGetReadExtendedData();
			case StorePackage.SERVICE__WRITE_REVISION:
				if (resolve) return getWriteRevision();
				return basicGetWriteRevision();
			case StorePackage.SERVICE__WRITE_EXTENDED_DATA:
				if (resolve) return getWriteExtendedData();
				return basicGetWriteExtendedData();
			case StorePackage.SERVICE__PROFILE_IDENTIFIER:
				return getProfileIdentifier();
			case StorePackage.SERVICE__PROFILE_NAME:
				return getProfileName();
			case StorePackage.SERVICE__PROFILE_DESCRIPTION:
				return getProfileDescription();
			case StorePackage.SERVICE__PROFILE_PUBLIC:
				return isProfilePublic();
			case StorePackage.SERVICE__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case StorePackage.SERVICE__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case StorePackage.SERVICE__INTERNAL_SERVICE:
				if (resolve) return getInternalService();
				return basicGetInternalService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StorePackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case StorePackage.SERVICE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case StorePackage.SERVICE__SERVICE_IDENTIFIER:
				setServiceIdentifier((String)newValue);
				return;
			case StorePackage.SERVICE__PROVIDER_NAME:
				setProviderName((String)newValue);
				return;
			case StorePackage.SERVICE__URL:
				setUrl((String)newValue);
				return;
			case StorePackage.SERVICE__TOKEN:
				setToken((String)newValue);
				return;
			case StorePackage.SERVICE__NOTIFICATION_PROTOCOL:
				setNotificationProtocol((AccessMethod)newValue);
				return;
			case StorePackage.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StorePackage.SERVICE__TRIGGER:
				setTrigger((Trigger)newValue);
				return;
			case StorePackage.SERVICE__READ_REVISION:
				setReadRevision((Boolean)newValue);
				return;
			case StorePackage.SERVICE__READ_EXTENDED_DATA:
				setReadExtendedData((ExtendedDataSchema)newValue);
				return;
			case StorePackage.SERVICE__WRITE_REVISION:
				setWriteRevision((Project)newValue);
				return;
			case StorePackage.SERVICE__WRITE_EXTENDED_DATA:
				setWriteExtendedData((ExtendedDataSchema)newValue);
				return;
			case StorePackage.SERVICE__PROFILE_IDENTIFIER:
				setProfileIdentifier((String)newValue);
				return;
			case StorePackage.SERVICE__PROFILE_NAME:
				setProfileName((String)newValue);
				return;
			case StorePackage.SERVICE__PROFILE_DESCRIPTION:
				setProfileDescription((String)newValue);
				return;
			case StorePackage.SERVICE__PROFILE_PUBLIC:
				setProfilePublic((Boolean)newValue);
				return;
			case StorePackage.SERVICE__PROJECT:
				setProject((Project)newValue);
				return;
			case StorePackage.SERVICE__USER:
				setUser((User)newValue);
				return;
			case StorePackage.SERVICE__INTERNAL_SERVICE:
				setInternalService((InternalServicePluginConfiguration)newValue);
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
			case StorePackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StorePackage.SERVICE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case StorePackage.SERVICE__SERVICE_IDENTIFIER:
				setServiceIdentifier(SERVICE_IDENTIFIER_EDEFAULT);
				return;
			case StorePackage.SERVICE__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
				return;
			case StorePackage.SERVICE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case StorePackage.SERVICE__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case StorePackage.SERVICE__NOTIFICATION_PROTOCOL:
				setNotificationProtocol(NOTIFICATION_PROTOCOL_EDEFAULT);
				return;
			case StorePackage.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StorePackage.SERVICE__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case StorePackage.SERVICE__READ_REVISION:
				setReadRevision(READ_REVISION_EDEFAULT);
				return;
			case StorePackage.SERVICE__READ_EXTENDED_DATA:
				setReadExtendedData((ExtendedDataSchema)null);
				return;
			case StorePackage.SERVICE__WRITE_REVISION:
				setWriteRevision((Project)null);
				return;
			case StorePackage.SERVICE__WRITE_EXTENDED_DATA:
				setWriteExtendedData((ExtendedDataSchema)null);
				return;
			case StorePackage.SERVICE__PROFILE_IDENTIFIER:
				setProfileIdentifier(PROFILE_IDENTIFIER_EDEFAULT);
				return;
			case StorePackage.SERVICE__PROFILE_NAME:
				setProfileName(PROFILE_NAME_EDEFAULT);
				return;
			case StorePackage.SERVICE__PROFILE_DESCRIPTION:
				setProfileDescription(PROFILE_DESCRIPTION_EDEFAULT);
				return;
			case StorePackage.SERVICE__PROFILE_PUBLIC:
				setProfilePublic(PROFILE_PUBLIC_EDEFAULT);
				return;
			case StorePackage.SERVICE__PROJECT:
				setProject((Project)null);
				return;
			case StorePackage.SERVICE__USER:
				setUser((User)null);
				return;
			case StorePackage.SERVICE__INTERNAL_SERVICE:
				setInternalService((InternalServicePluginConfiguration)null);
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
			case StorePackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StorePackage.SERVICE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case StorePackage.SERVICE__SERVICE_IDENTIFIER:
				return SERVICE_IDENTIFIER_EDEFAULT == null ? serviceIdentifier != null : !SERVICE_IDENTIFIER_EDEFAULT.equals(serviceIdentifier);
			case StorePackage.SERVICE__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
			case StorePackage.SERVICE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case StorePackage.SERVICE__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case StorePackage.SERVICE__NOTIFICATION_PROTOCOL:
				return notificationProtocol != NOTIFICATION_PROTOCOL_EDEFAULT;
			case StorePackage.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StorePackage.SERVICE__TRIGGER:
				return trigger != TRIGGER_EDEFAULT;
			case StorePackage.SERVICE__READ_REVISION:
				return readRevision != READ_REVISION_EDEFAULT;
			case StorePackage.SERVICE__READ_EXTENDED_DATA:
				return readExtendedData != null;
			case StorePackage.SERVICE__WRITE_REVISION:
				return writeRevision != null;
			case StorePackage.SERVICE__WRITE_EXTENDED_DATA:
				return writeExtendedData != null;
			case StorePackage.SERVICE__PROFILE_IDENTIFIER:
				return PROFILE_IDENTIFIER_EDEFAULT == null ? profileIdentifier != null : !PROFILE_IDENTIFIER_EDEFAULT.equals(profileIdentifier);
			case StorePackage.SERVICE__PROFILE_NAME:
				return PROFILE_NAME_EDEFAULT == null ? profileName != null : !PROFILE_NAME_EDEFAULT.equals(profileName);
			case StorePackage.SERVICE__PROFILE_DESCRIPTION:
				return PROFILE_DESCRIPTION_EDEFAULT == null ? profileDescription != null : !PROFILE_DESCRIPTION_EDEFAULT.equals(profileDescription);
			case StorePackage.SERVICE__PROFILE_PUBLIC:
				return profilePublic != PROFILE_PUBLIC_EDEFAULT;
			case StorePackage.SERVICE__PROJECT:
				return project != null;
			case StorePackage.SERVICE__USER:
				return user != null;
			case StorePackage.SERVICE__INTERNAL_SERVICE:
				return internalService != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", serviceIdentifier: ");
		result.append(serviceIdentifier);
		result.append(", providerName: ");
		result.append(providerName);
		result.append(", url: ");
		result.append(url);
		result.append(", token: ");
		result.append(token);
		result.append(", notificationProtocol: ");
		result.append(notificationProtocol);
		result.append(", description: ");
		result.append(description);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", readRevision: ");
		result.append(readRevision);
		result.append(", profileIdentifier: ");
		result.append(profileIdentifier);
		result.append(", profileName: ");
		result.append(profileName);
		result.append(", profileDescription: ");
		result.append(profileDescription);
		result.append(", profilePublic: ");
		result.append(profilePublic);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
