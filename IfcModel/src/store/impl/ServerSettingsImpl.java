/**
 */
package store.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import store.ServerSettings;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.ServerSettingsImpl#getShowVersionUpgradeAvailable <em>Show Version Upgrade Available</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#isSendConfirmationEmailAfterRegistration <em>Send Confirmation Email After Registration</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getUseCaching <em>Use Caching</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#isAllowUsersToCreateTopLevelProjects <em>Allow Users To Create Top Level Projects</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getCheckinMergingEnabled <em>Checkin Merging Enabled</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getRegistrationAddition <em>Registration Addition</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getSmtpServer <em>Smtp Server</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getEmailSenderAddress <em>Email Sender Address</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getCustomLogoAddress <em>Custom Logo Address</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getSiteAddress <em>Site Address</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getWhitelistedDomains <em>Whitelisted Domains</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getHideUserListForNonAdmin <em>Hide User List For Non Admin</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getProtocolBuffersPort <em>Protocol Buffers Port</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getHeaderAddition <em>Header Addition</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getFooterAddition <em>Footer Addition</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getCacheOutputFiles <em>Cache Output Files</em>}</li>
 *   <li>{@link store.impl.ServerSettingsImpl#getServiceRepositoryUrl <em>Service Repository Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerSettingsImpl extends EObjectImpl implements ServerSettings {
	/**
	 * The default value of the '{@link #getShowVersionUpgradeAvailable() <em>Show Version Upgrade Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowVersionUpgradeAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOW_VERSION_UPGRADE_AVAILABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowVersionUpgradeAvailable() <em>Show Version Upgrade Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowVersionUpgradeAvailable()
	 * @generated
	 * @ordered
	 */
	protected Boolean showVersionUpgradeAvailable = SHOW_VERSION_UPGRADE_AVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSendConfirmationEmailAfterRegistration() <em>Send Confirmation Email After Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendConfirmationEmailAfterRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSendConfirmationEmailAfterRegistration() <em>Send Confirmation Email After Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendConfirmationEmailAfterRegistration()
	 * @generated
	 * @ordered
	 */
	protected boolean sendConfirmationEmailAfterRegistration = SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCaching() <em>Use Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaching()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_CACHING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseCaching() <em>Use Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaching()
	 * @generated
	 * @ordered
	 */
	protected Boolean useCaching = USE_CACHING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_SELF_REGISTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowSelfRegistration = ALLOW_SELF_REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowUsersToCreateTopLevelProjects() <em>Allow Users To Create Top Level Projects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowUsersToCreateTopLevelProjects()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowUsersToCreateTopLevelProjects() <em>Allow Users To Create Top Level Projects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowUsersToCreateTopLevelProjects()
	 * @generated
	 * @ordered
	 */
	protected boolean allowUsersToCreateTopLevelProjects = ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckinMergingEnabled() <em>Checkin Merging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckinMergingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CHECKIN_MERGING_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckinMergingEnabled() <em>Checkin Merging Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckinMergingEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean checkinMergingEnabled = CHECKIN_MERGING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistrationAddition() <em>Registration Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationAddition()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_ADDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistrationAddition() <em>Registration Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationAddition()
	 * @generated
	 * @ordered
	 */
	protected String registrationAddition = REGISTRATION_ADDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmtpServer() <em>Smtp Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpServer()
	 * @generated
	 * @ordered
	 */
	protected static final String SMTP_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmtpServer() <em>Smtp Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmtpServer()
	 * @generated
	 * @ordered
	 */
	protected String smtpServer = SMTP_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailSenderAddress() <em>Email Sender Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSenderAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_SENDER_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailSenderAddress() <em>Email Sender Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSenderAddress()
	 * @generated
	 * @ordered
	 */
	protected String emailSenderAddress = EMAIL_SENDER_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomLogoAddress() <em>Custom Logo Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomLogoAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_LOGO_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomLogoAddress() <em>Custom Logo Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomLogoAddress()
	 * @generated
	 * @ordered
	 */
	protected String customLogoAddress = CUSTOM_LOGO_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiteAddress() <em>Site Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteAddress() <em>Site Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAddress()
	 * @generated
	 * @ordered
	 */
	protected String siteAddress = SITE_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWhitelistedDomains() <em>Whitelisted Domains</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhitelistedDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<String> whitelistedDomains;

	/**
	 * The default value of the '{@link #getHideUserListForNonAdmin() <em>Hide User List For Non Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHideUserListForNonAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HIDE_USER_LIST_FOR_NON_ADMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHideUserListForNonAdmin() <em>Hide User List For Non Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHideUserListForNonAdmin()
	 * @generated
	 * @ordered
	 */
	protected Boolean hideUserListForNonAdmin = HIDE_USER_LIST_FOR_NON_ADMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolBuffersPort() <em>Protocol Buffers Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolBuffersPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_BUFFERS_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolBuffersPort() <em>Protocol Buffers Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolBuffersPort()
	 * @generated
	 * @ordered
	 */
	protected Integer protocolBuffersPort = PROTOCOL_BUFFERS_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderAddition() <em>Header Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderAddition()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_ADDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderAddition() <em>Header Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderAddition()
	 * @generated
	 * @ordered
	 */
	protected String headerAddition = HEADER_ADDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFooterAddition() <em>Footer Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterAddition()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_ADDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFooterAddition() <em>Footer Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterAddition()
	 * @generated
	 * @ordered
	 */
	protected String footerAddition = FOOTER_ADDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheOutputFiles() <em>Cache Output Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheOutputFiles()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CACHE_OUTPUT_FILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheOutputFiles() <em>Cache Output Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheOutputFiles()
	 * @generated
	 * @ordered
	 */
	protected Boolean cacheOutputFiles = CACHE_OUTPUT_FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceRepositoryUrl() <em>Service Repository Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRepositoryUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_REPOSITORY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceRepositoryUrl() <em>Service Repository Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRepositoryUrl()
	 * @generated
	 * @ordered
	 */
	protected String serviceRepositoryUrl = SERVICE_REPOSITORY_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.SERVER_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getShowVersionUpgradeAvailable() {
		return showVersionUpgradeAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowVersionUpgradeAvailable(Boolean newShowVersionUpgradeAvailable) {
		Boolean oldShowVersionUpgradeAvailable = showVersionUpgradeAvailable;
		showVersionUpgradeAvailable = newShowVersionUpgradeAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__SHOW_VERSION_UPGRADE_AVAILABLE, oldShowVersionUpgradeAvailable, showVersionUpgradeAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSendConfirmationEmailAfterRegistration() {
		return sendConfirmationEmailAfterRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendConfirmationEmailAfterRegistration(boolean newSendConfirmationEmailAfterRegistration) {
		boolean oldSendConfirmationEmailAfterRegistration = sendConfirmationEmailAfterRegistration;
		sendConfirmationEmailAfterRegistration = newSendConfirmationEmailAfterRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION, oldSendConfirmationEmailAfterRegistration, sendConfirmationEmailAfterRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUseCaching() {
		return useCaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCaching(Boolean newUseCaching) {
		Boolean oldUseCaching = useCaching;
		useCaching = newUseCaching;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__USE_CACHING, oldUseCaching, useCaching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowSelfRegistration() {
		return allowSelfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowSelfRegistration(Boolean newAllowSelfRegistration) {
		Boolean oldAllowSelfRegistration = allowSelfRegistration;
		allowSelfRegistration = newAllowSelfRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__ALLOW_SELF_REGISTRATION, oldAllowSelfRegistration, allowSelfRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowUsersToCreateTopLevelProjects() {
		return allowUsersToCreateTopLevelProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowUsersToCreateTopLevelProjects(boolean newAllowUsersToCreateTopLevelProjects) {
		boolean oldAllowUsersToCreateTopLevelProjects = allowUsersToCreateTopLevelProjects;
		allowUsersToCreateTopLevelProjects = newAllowUsersToCreateTopLevelProjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS, oldAllowUsersToCreateTopLevelProjects, allowUsersToCreateTopLevelProjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCheckinMergingEnabled() {
		return checkinMergingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckinMergingEnabled(Boolean newCheckinMergingEnabled) {
		Boolean oldCheckinMergingEnabled = checkinMergingEnabled;
		checkinMergingEnabled = newCheckinMergingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__CHECKIN_MERGING_ENABLED, oldCheckinMergingEnabled, checkinMergingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistrationAddition() {
		return registrationAddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationAddition(String newRegistrationAddition) {
		String oldRegistrationAddition = registrationAddition;
		registrationAddition = newRegistrationAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__REGISTRATION_ADDITION, oldRegistrationAddition, registrationAddition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSmtpServer() {
		return smtpServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmtpServer(String newSmtpServer) {
		String oldSmtpServer = smtpServer;
		smtpServer = newSmtpServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__SMTP_SERVER, oldSmtpServer, smtpServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailSenderAddress() {
		return emailSenderAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailSenderAddress(String newEmailSenderAddress) {
		String oldEmailSenderAddress = emailSenderAddress;
		emailSenderAddress = newEmailSenderAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__EMAIL_SENDER_ADDRESS, oldEmailSenderAddress, emailSenderAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomLogoAddress() {
		return customLogoAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomLogoAddress(String newCustomLogoAddress) {
		String oldCustomLogoAddress = customLogoAddress;
		customLogoAddress = newCustomLogoAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__CUSTOM_LOGO_ADDRESS, oldCustomLogoAddress, customLogoAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSiteAddress() {
		return siteAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiteAddress(String newSiteAddress) {
		String oldSiteAddress = siteAddress;
		siteAddress = newSiteAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__SITE_ADDRESS, oldSiteAddress, siteAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWhitelistedDomains() {
		if (whitelistedDomains == null) {
			whitelistedDomains = new EDataTypeUniqueEList<String>(String.class, this, StorePackage.SERVER_SETTINGS__WHITELISTED_DOMAINS);
		}
		return whitelistedDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHideUserListForNonAdmin() {
		return hideUserListForNonAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideUserListForNonAdmin(Boolean newHideUserListForNonAdmin) {
		Boolean oldHideUserListForNonAdmin = hideUserListForNonAdmin;
		hideUserListForNonAdmin = newHideUserListForNonAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__HIDE_USER_LIST_FOR_NON_ADMIN, oldHideUserListForNonAdmin, hideUserListForNonAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getProtocolBuffersPort() {
		return protocolBuffersPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolBuffersPort(Integer newProtocolBuffersPort) {
		Integer oldProtocolBuffersPort = protocolBuffersPort;
		protocolBuffersPort = newProtocolBuffersPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__PROTOCOL_BUFFERS_PORT, oldProtocolBuffersPort, protocolBuffersPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderAddition() {
		return headerAddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderAddition(String newHeaderAddition) {
		String oldHeaderAddition = headerAddition;
		headerAddition = newHeaderAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__HEADER_ADDITION, oldHeaderAddition, headerAddition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooterAddition() {
		return footerAddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterAddition(String newFooterAddition) {
		String oldFooterAddition = footerAddition;
		footerAddition = newFooterAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__FOOTER_ADDITION, oldFooterAddition, footerAddition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCacheOutputFiles() {
		return cacheOutputFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheOutputFiles(Boolean newCacheOutputFiles) {
		Boolean oldCacheOutputFiles = cacheOutputFiles;
		cacheOutputFiles = newCacheOutputFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__CACHE_OUTPUT_FILES, oldCacheOutputFiles, cacheOutputFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceRepositoryUrl() {
		return serviceRepositoryUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRepositoryUrl(String newServiceRepositoryUrl) {
		String oldServiceRepositoryUrl = serviceRepositoryUrl;
		serviceRepositoryUrl = newServiceRepositoryUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVER_SETTINGS__SERVICE_REPOSITORY_URL, oldServiceRepositoryUrl, serviceRepositoryUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.SERVER_SETTINGS__SHOW_VERSION_UPGRADE_AVAILABLE:
				return getShowVersionUpgradeAvailable();
			case StorePackage.SERVER_SETTINGS__SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION:
				return isSendConfirmationEmailAfterRegistration();
			case StorePackage.SERVER_SETTINGS__USE_CACHING:
				return getUseCaching();
			case StorePackage.SERVER_SETTINGS__ALLOW_SELF_REGISTRATION:
				return getAllowSelfRegistration();
			case StorePackage.SERVER_SETTINGS__ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS:
				return isAllowUsersToCreateTopLevelProjects();
			case StorePackage.SERVER_SETTINGS__CHECKIN_MERGING_ENABLED:
				return getCheckinMergingEnabled();
			case StorePackage.SERVER_SETTINGS__REGISTRATION_ADDITION:
				return getRegistrationAddition();
			case StorePackage.SERVER_SETTINGS__SMTP_SERVER:
				return getSmtpServer();
			case StorePackage.SERVER_SETTINGS__EMAIL_SENDER_ADDRESS:
				return getEmailSenderAddress();
			case StorePackage.SERVER_SETTINGS__CUSTOM_LOGO_ADDRESS:
				return getCustomLogoAddress();
			case StorePackage.SERVER_SETTINGS__SITE_ADDRESS:
				return getSiteAddress();
			case StorePackage.SERVER_SETTINGS__WHITELISTED_DOMAINS:
				return getWhitelistedDomains();
			case StorePackage.SERVER_SETTINGS__HIDE_USER_LIST_FOR_NON_ADMIN:
				return getHideUserListForNonAdmin();
			case StorePackage.SERVER_SETTINGS__PROTOCOL_BUFFERS_PORT:
				return getProtocolBuffersPort();
			case StorePackage.SERVER_SETTINGS__HEADER_ADDITION:
				return getHeaderAddition();
			case StorePackage.SERVER_SETTINGS__FOOTER_ADDITION:
				return getFooterAddition();
			case StorePackage.SERVER_SETTINGS__CACHE_OUTPUT_FILES:
				return getCacheOutputFiles();
			case StorePackage.SERVER_SETTINGS__SERVICE_REPOSITORY_URL:
				return getServiceRepositoryUrl();
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
			case StorePackage.SERVER_SETTINGS__SHOW_VERSION_UPGRADE_AVAILABLE:
				setShowVersionUpgradeAvailable((Boolean)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION:
				setSendConfirmationEmailAfterRegistration((Boolean)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__USE_CACHING:
				setUseCaching((Boolean)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration((Boolean)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS:
				setAllowUsersToCreateTopLevelProjects((Boolean)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__CHECKIN_MERGING_ENABLED:
				setCheckinMergingEnabled((Boolean)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__REGISTRATION_ADDITION:
				setRegistrationAddition((String)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__SMTP_SERVER:
				setSmtpServer((String)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__EMAIL_SENDER_ADDRESS:
				setEmailSenderAddress((String)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__CUSTOM_LOGO_ADDRESS:
				setCustomLogoAddress((String)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__SITE_ADDRESS:
				setSiteAddress((String)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__WHITELISTED_DOMAINS:
				getWhitelistedDomains().clear();
				getWhitelistedDomains().addAll((Collection<? extends String>)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__HIDE_USER_LIST_FOR_NON_ADMIN:
				setHideUserListForNonAdmin((Boolean)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__PROTOCOL_BUFFERS_PORT:
				setProtocolBuffersPort((Integer)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__HEADER_ADDITION:
				setHeaderAddition((String)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__FOOTER_ADDITION:
				setFooterAddition((String)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__CACHE_OUTPUT_FILES:
				setCacheOutputFiles((Boolean)newValue);
				return;
			case StorePackage.SERVER_SETTINGS__SERVICE_REPOSITORY_URL:
				setServiceRepositoryUrl((String)newValue);
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
			case StorePackage.SERVER_SETTINGS__SHOW_VERSION_UPGRADE_AVAILABLE:
				setShowVersionUpgradeAvailable(SHOW_VERSION_UPGRADE_AVAILABLE_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION:
				setSendConfirmationEmailAfterRegistration(SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__USE_CACHING:
				setUseCaching(USE_CACHING_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration(ALLOW_SELF_REGISTRATION_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS:
				setAllowUsersToCreateTopLevelProjects(ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__CHECKIN_MERGING_ENABLED:
				setCheckinMergingEnabled(CHECKIN_MERGING_ENABLED_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__REGISTRATION_ADDITION:
				setRegistrationAddition(REGISTRATION_ADDITION_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__SMTP_SERVER:
				setSmtpServer(SMTP_SERVER_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__EMAIL_SENDER_ADDRESS:
				setEmailSenderAddress(EMAIL_SENDER_ADDRESS_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__CUSTOM_LOGO_ADDRESS:
				setCustomLogoAddress(CUSTOM_LOGO_ADDRESS_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__SITE_ADDRESS:
				setSiteAddress(SITE_ADDRESS_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__WHITELISTED_DOMAINS:
				getWhitelistedDomains().clear();
				return;
			case StorePackage.SERVER_SETTINGS__HIDE_USER_LIST_FOR_NON_ADMIN:
				setHideUserListForNonAdmin(HIDE_USER_LIST_FOR_NON_ADMIN_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__PROTOCOL_BUFFERS_PORT:
				setProtocolBuffersPort(PROTOCOL_BUFFERS_PORT_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__HEADER_ADDITION:
				setHeaderAddition(HEADER_ADDITION_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__FOOTER_ADDITION:
				setFooterAddition(FOOTER_ADDITION_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__CACHE_OUTPUT_FILES:
				setCacheOutputFiles(CACHE_OUTPUT_FILES_EDEFAULT);
				return;
			case StorePackage.SERVER_SETTINGS__SERVICE_REPOSITORY_URL:
				setServiceRepositoryUrl(SERVICE_REPOSITORY_URL_EDEFAULT);
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
			case StorePackage.SERVER_SETTINGS__SHOW_VERSION_UPGRADE_AVAILABLE:
				return SHOW_VERSION_UPGRADE_AVAILABLE_EDEFAULT == null ? showVersionUpgradeAvailable != null : !SHOW_VERSION_UPGRADE_AVAILABLE_EDEFAULT.equals(showVersionUpgradeAvailable);
			case StorePackage.SERVER_SETTINGS__SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION:
				return sendConfirmationEmailAfterRegistration != SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION_EDEFAULT;
			case StorePackage.SERVER_SETTINGS__USE_CACHING:
				return USE_CACHING_EDEFAULT == null ? useCaching != null : !USE_CACHING_EDEFAULT.equals(useCaching);
			case StorePackage.SERVER_SETTINGS__ALLOW_SELF_REGISTRATION:
				return ALLOW_SELF_REGISTRATION_EDEFAULT == null ? allowSelfRegistration != null : !ALLOW_SELF_REGISTRATION_EDEFAULT.equals(allowSelfRegistration);
			case StorePackage.SERVER_SETTINGS__ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS:
				return allowUsersToCreateTopLevelProjects != ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS_EDEFAULT;
			case StorePackage.SERVER_SETTINGS__CHECKIN_MERGING_ENABLED:
				return CHECKIN_MERGING_ENABLED_EDEFAULT == null ? checkinMergingEnabled != null : !CHECKIN_MERGING_ENABLED_EDEFAULT.equals(checkinMergingEnabled);
			case StorePackage.SERVER_SETTINGS__REGISTRATION_ADDITION:
				return REGISTRATION_ADDITION_EDEFAULT == null ? registrationAddition != null : !REGISTRATION_ADDITION_EDEFAULT.equals(registrationAddition);
			case StorePackage.SERVER_SETTINGS__SMTP_SERVER:
				return SMTP_SERVER_EDEFAULT == null ? smtpServer != null : !SMTP_SERVER_EDEFAULT.equals(smtpServer);
			case StorePackage.SERVER_SETTINGS__EMAIL_SENDER_ADDRESS:
				return EMAIL_SENDER_ADDRESS_EDEFAULT == null ? emailSenderAddress != null : !EMAIL_SENDER_ADDRESS_EDEFAULT.equals(emailSenderAddress);
			case StorePackage.SERVER_SETTINGS__CUSTOM_LOGO_ADDRESS:
				return CUSTOM_LOGO_ADDRESS_EDEFAULT == null ? customLogoAddress != null : !CUSTOM_LOGO_ADDRESS_EDEFAULT.equals(customLogoAddress);
			case StorePackage.SERVER_SETTINGS__SITE_ADDRESS:
				return SITE_ADDRESS_EDEFAULT == null ? siteAddress != null : !SITE_ADDRESS_EDEFAULT.equals(siteAddress);
			case StorePackage.SERVER_SETTINGS__WHITELISTED_DOMAINS:
				return whitelistedDomains != null && !whitelistedDomains.isEmpty();
			case StorePackage.SERVER_SETTINGS__HIDE_USER_LIST_FOR_NON_ADMIN:
				return HIDE_USER_LIST_FOR_NON_ADMIN_EDEFAULT == null ? hideUserListForNonAdmin != null : !HIDE_USER_LIST_FOR_NON_ADMIN_EDEFAULT.equals(hideUserListForNonAdmin);
			case StorePackage.SERVER_SETTINGS__PROTOCOL_BUFFERS_PORT:
				return PROTOCOL_BUFFERS_PORT_EDEFAULT == null ? protocolBuffersPort != null : !PROTOCOL_BUFFERS_PORT_EDEFAULT.equals(protocolBuffersPort);
			case StorePackage.SERVER_SETTINGS__HEADER_ADDITION:
				return HEADER_ADDITION_EDEFAULT == null ? headerAddition != null : !HEADER_ADDITION_EDEFAULT.equals(headerAddition);
			case StorePackage.SERVER_SETTINGS__FOOTER_ADDITION:
				return FOOTER_ADDITION_EDEFAULT == null ? footerAddition != null : !FOOTER_ADDITION_EDEFAULT.equals(footerAddition);
			case StorePackage.SERVER_SETTINGS__CACHE_OUTPUT_FILES:
				return CACHE_OUTPUT_FILES_EDEFAULT == null ? cacheOutputFiles != null : !CACHE_OUTPUT_FILES_EDEFAULT.equals(cacheOutputFiles);
			case StorePackage.SERVER_SETTINGS__SERVICE_REPOSITORY_URL:
				return SERVICE_REPOSITORY_URL_EDEFAULT == null ? serviceRepositoryUrl != null : !SERVICE_REPOSITORY_URL_EDEFAULT.equals(serviceRepositoryUrl);
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
		result.append(" (showVersionUpgradeAvailable: ");
		result.append(showVersionUpgradeAvailable);
		result.append(", sendConfirmationEmailAfterRegistration: ");
		result.append(sendConfirmationEmailAfterRegistration);
		result.append(", useCaching: ");
		result.append(useCaching);
		result.append(", allowSelfRegistration: ");
		result.append(allowSelfRegistration);
		result.append(", allowUsersToCreateTopLevelProjects: ");
		result.append(allowUsersToCreateTopLevelProjects);
		result.append(", checkinMergingEnabled: ");
		result.append(checkinMergingEnabled);
		result.append(", registrationAddition: ");
		result.append(registrationAddition);
		result.append(", smtpServer: ");
		result.append(smtpServer);
		result.append(", emailSenderAddress: ");
		result.append(emailSenderAddress);
		result.append(", customLogoAddress: ");
		result.append(customLogoAddress);
		result.append(", siteAddress: ");
		result.append(siteAddress);
		result.append(", whitelistedDomains: ");
		result.append(whitelistedDomains);
		result.append(", hideUserListForNonAdmin: ");
		result.append(hideUserListForNonAdmin);
		result.append(", protocolBuffersPort: ");
		result.append(protocolBuffersPort);
		result.append(", headerAddition: ");
		result.append(headerAddition);
		result.append(", footerAddition: ");
		result.append(footerAddition);
		result.append(", cacheOutputFiles: ");
		result.append(cacheOutputFiles);
		result.append(", serviceRepositoryUrl: ");
		result.append(serviceRepositoryUrl);
		result.append(')');
		return result.toString();
	}

} //ServerSettingsImpl
