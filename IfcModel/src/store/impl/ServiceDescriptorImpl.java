/**
 */
package store.impl;

import log.AccessMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.ServiceDescriptor;
import store.StorePackage;
import store.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getToken <em>Token</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getNotificationProtocol <em>Notification Protocol</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#isReadRevision <em>Read Revision</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getReadExtendedData <em>Read Extended Data</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#isWriteRevision <em>Write Revision</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getWriteExtendedData <em>Write Extended Data</em>}</li>
 *   <li>{@link store.impl.ServiceDescriptorImpl#getProviderName <em>Provider Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDescriptorImpl extends EObjectImpl implements ServiceDescriptor {
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
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

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
	 * The default value of the '{@link #getReadExtendedData() <em>Read Extended Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadExtendedData()
	 * @generated
	 * @ordered
	 */
	protected static final String READ_EXTENDED_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadExtendedData() <em>Read Extended Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadExtendedData()
	 * @generated
	 * @ordered
	 */
	protected String readExtendedData = READ_EXTENDED_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isWriteRevision() <em>Write Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteRevision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_REVISION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteRevision() <em>Write Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteRevision()
	 * @generated
	 * @ordered
	 */
	protected boolean writeRevision = WRITE_REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteExtendedData() <em>Write Extended Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteExtendedData()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITE_EXTENDED_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteExtendedData() <em>Write Extended Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteExtendedData()
	 * @generated
	 * @ordered
	 */
	protected String writeExtendedData = WRITE_EXTENDED_DATA_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.SERVICE_DESCRIPTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__NOTIFICATION_PROTOCOL, oldNotificationProtocol, notificationProtocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__TRIGGER, oldTrigger, trigger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__READ_REVISION, oldReadRevision, readRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReadExtendedData() {
		return readExtendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadExtendedData(String newReadExtendedData) {
		String oldReadExtendedData = readExtendedData;
		readExtendedData = newReadExtendedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__READ_EXTENDED_DATA, oldReadExtendedData, readExtendedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteRevision() {
		return writeRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteRevision(boolean newWriteRevision) {
		boolean oldWriteRevision = writeRevision;
		writeRevision = newWriteRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__WRITE_REVISION, oldWriteRevision, writeRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWriteExtendedData() {
		return writeExtendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteExtendedData(String newWriteExtendedData) {
		String oldWriteExtendedData = writeExtendedData;
		writeExtendedData = newWriteExtendedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__WRITE_EXTENDED_DATA, oldWriteExtendedData, writeExtendedData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.SERVICE_DESCRIPTOR__PROVIDER_NAME, oldProviderName, providerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.SERVICE_DESCRIPTOR__NAME:
				return getName();
			case StorePackage.SERVICE_DESCRIPTOR__URL:
				return getUrl();
			case StorePackage.SERVICE_DESCRIPTOR__TOKEN:
				return getToken();
			case StorePackage.SERVICE_DESCRIPTOR__IDENTIFIER:
				return getIdentifier();
			case StorePackage.SERVICE_DESCRIPTOR__NOTIFICATION_PROTOCOL:
				return getNotificationProtocol();
			case StorePackage.SERVICE_DESCRIPTOR__DESCRIPTION:
				return getDescription();
			case StorePackage.SERVICE_DESCRIPTOR__TRIGGER:
				return getTrigger();
			case StorePackage.SERVICE_DESCRIPTOR__READ_REVISION:
				return isReadRevision();
			case StorePackage.SERVICE_DESCRIPTOR__READ_EXTENDED_DATA:
				return getReadExtendedData();
			case StorePackage.SERVICE_DESCRIPTOR__WRITE_REVISION:
				return isWriteRevision();
			case StorePackage.SERVICE_DESCRIPTOR__WRITE_EXTENDED_DATA:
				return getWriteExtendedData();
			case StorePackage.SERVICE_DESCRIPTOR__PROVIDER_NAME:
				return getProviderName();
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
			case StorePackage.SERVICE_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__URL:
				setUrl((String)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__TOKEN:
				setToken((String)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__NOTIFICATION_PROTOCOL:
				setNotificationProtocol((AccessMethod)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__TRIGGER:
				setTrigger((Trigger)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__READ_REVISION:
				setReadRevision((Boolean)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__READ_EXTENDED_DATA:
				setReadExtendedData((String)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__WRITE_REVISION:
				setWriteRevision((Boolean)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__WRITE_EXTENDED_DATA:
				setWriteExtendedData((String)newValue);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__PROVIDER_NAME:
				setProviderName((String)newValue);
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
			case StorePackage.SERVICE_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__URL:
				setUrl(URL_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__NOTIFICATION_PROTOCOL:
				setNotificationProtocol(NOTIFICATION_PROTOCOL_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__READ_REVISION:
				setReadRevision(READ_REVISION_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__READ_EXTENDED_DATA:
				setReadExtendedData(READ_EXTENDED_DATA_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__WRITE_REVISION:
				setWriteRevision(WRITE_REVISION_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__WRITE_EXTENDED_DATA:
				setWriteExtendedData(WRITE_EXTENDED_DATA_EDEFAULT);
				return;
			case StorePackage.SERVICE_DESCRIPTOR__PROVIDER_NAME:
				setProviderName(PROVIDER_NAME_EDEFAULT);
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
			case StorePackage.SERVICE_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StorePackage.SERVICE_DESCRIPTOR__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case StorePackage.SERVICE_DESCRIPTOR__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case StorePackage.SERVICE_DESCRIPTOR__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case StorePackage.SERVICE_DESCRIPTOR__NOTIFICATION_PROTOCOL:
				return notificationProtocol != NOTIFICATION_PROTOCOL_EDEFAULT;
			case StorePackage.SERVICE_DESCRIPTOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StorePackage.SERVICE_DESCRIPTOR__TRIGGER:
				return trigger != TRIGGER_EDEFAULT;
			case StorePackage.SERVICE_DESCRIPTOR__READ_REVISION:
				return readRevision != READ_REVISION_EDEFAULT;
			case StorePackage.SERVICE_DESCRIPTOR__READ_EXTENDED_DATA:
				return READ_EXTENDED_DATA_EDEFAULT == null ? readExtendedData != null : !READ_EXTENDED_DATA_EDEFAULT.equals(readExtendedData);
			case StorePackage.SERVICE_DESCRIPTOR__WRITE_REVISION:
				return writeRevision != WRITE_REVISION_EDEFAULT;
			case StorePackage.SERVICE_DESCRIPTOR__WRITE_EXTENDED_DATA:
				return WRITE_EXTENDED_DATA_EDEFAULT == null ? writeExtendedData != null : !WRITE_EXTENDED_DATA_EDEFAULT.equals(writeExtendedData);
			case StorePackage.SERVICE_DESCRIPTOR__PROVIDER_NAME:
				return PROVIDER_NAME_EDEFAULT == null ? providerName != null : !PROVIDER_NAME_EDEFAULT.equals(providerName);
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
		result.append(", url: ");
		result.append(url);
		result.append(", token: ");
		result.append(token);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", notificationProtocol: ");
		result.append(notificationProtocol);
		result.append(", description: ");
		result.append(description);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", readRevision: ");
		result.append(readRevision);
		result.append(", readExtendedData: ");
		result.append(readExtendedData);
		result.append(", writeRevision: ");
		result.append(writeRevision);
		result.append(", writeExtendedData: ");
		result.append(writeExtendedData);
		result.append(", providerName: ");
		result.append(providerName);
		result.append(')');
		return result.toString();
	}

} //ServiceDescriptorImpl
