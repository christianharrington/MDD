/**
 */
package store.impl;

import java.util.Date;

import log.AccessMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.StorePackage;
import store.User;
import store.UserSession;
import store.UserType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.UserSessionImpl#getUser <em>User</em>}</li>
 *   <li>{@link store.impl.UserSessionImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link store.impl.UserSessionImpl#getName <em>Name</em>}</li>
 *   <li>{@link store.impl.UserSessionImpl#getType <em>Type</em>}</li>
 *   <li>{@link store.impl.UserSessionImpl#getRemoteAddress <em>Remote Address</em>}</li>
 *   <li>{@link store.impl.UserSessionImpl#getActiveSince <em>Active Since</em>}</li>
 *   <li>{@link store.impl.UserSessionImpl#getLastActive <em>Last Active</em>}</li>
 *   <li>{@link store.impl.UserSessionImpl#getAccessMethod <em>Access Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserSessionImpl extends EObjectImpl implements UserSession {
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
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final UserType TYPE_EDEFAULT = UserType.SYSTEM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected UserType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteAddress() <em>Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteAddress() <em>Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAddress()
	 * @generated
	 * @ordered
	 */
	protected String remoteAddress = REMOTE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveSince() <em>Active Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveSince()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTIVE_SINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveSince() <em>Active Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveSince()
	 * @generated
	 * @ordered
	 */
	protected Date activeSince = ACTIVE_SINCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastActive() <em>Last Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastActive()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastActive() <em>Last Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastActive()
	 * @generated
	 * @ordered
	 */
	protected Date lastActive = LAST_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMethod ACCESS_METHOD_EDEFAULT = AccessMethod.SOAP;

	/**
	 * The cached value of the '{@link #getAccessMethod() <em>Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethod()
	 * @generated
	 * @ordered
	 */
	protected AccessMethod accessMethod = ACCESS_METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.USER_SESSION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.USER_SESSION__USER, oldUser, user));
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
	public void setUser(User newUser) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SESSION__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SESSION__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(UserType newType) {
		UserType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SESSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteAddress() {
		return remoteAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteAddress(String newRemoteAddress) {
		String oldRemoteAddress = remoteAddress;
		remoteAddress = newRemoteAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SESSION__REMOTE_ADDRESS, oldRemoteAddress, remoteAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getActiveSince() {
		return activeSince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveSince(Date newActiveSince) {
		Date oldActiveSince = activeSince;
		activeSince = newActiveSince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SESSION__ACTIVE_SINCE, oldActiveSince, activeSince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastActive() {
		return lastActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastActive(Date newLastActive) {
		Date oldLastActive = lastActive;
		lastActive = newLastActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SESSION__LAST_ACTIVE, oldLastActive, lastActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMethod getAccessMethod() {
		return accessMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessMethod(AccessMethod newAccessMethod) {
		AccessMethod oldAccessMethod = accessMethod;
		accessMethod = newAccessMethod == null ? ACCESS_METHOD_EDEFAULT : newAccessMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.USER_SESSION__ACCESS_METHOD, oldAccessMethod, accessMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.USER_SESSION__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case StorePackage.USER_SESSION__USERNAME:
				return getUsername();
			case StorePackage.USER_SESSION__NAME:
				return getName();
			case StorePackage.USER_SESSION__TYPE:
				return getType();
			case StorePackage.USER_SESSION__REMOTE_ADDRESS:
				return getRemoteAddress();
			case StorePackage.USER_SESSION__ACTIVE_SINCE:
				return getActiveSince();
			case StorePackage.USER_SESSION__LAST_ACTIVE:
				return getLastActive();
			case StorePackage.USER_SESSION__ACCESS_METHOD:
				return getAccessMethod();
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
			case StorePackage.USER_SESSION__USER:
				setUser((User)newValue);
				return;
			case StorePackage.USER_SESSION__USERNAME:
				setUsername((String)newValue);
				return;
			case StorePackage.USER_SESSION__NAME:
				setName((String)newValue);
				return;
			case StorePackage.USER_SESSION__TYPE:
				setType((UserType)newValue);
				return;
			case StorePackage.USER_SESSION__REMOTE_ADDRESS:
				setRemoteAddress((String)newValue);
				return;
			case StorePackage.USER_SESSION__ACTIVE_SINCE:
				setActiveSince((Date)newValue);
				return;
			case StorePackage.USER_SESSION__LAST_ACTIVE:
				setLastActive((Date)newValue);
				return;
			case StorePackage.USER_SESSION__ACCESS_METHOD:
				setAccessMethod((AccessMethod)newValue);
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
			case StorePackage.USER_SESSION__USER:
				setUser((User)null);
				return;
			case StorePackage.USER_SESSION__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case StorePackage.USER_SESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StorePackage.USER_SESSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StorePackage.USER_SESSION__REMOTE_ADDRESS:
				setRemoteAddress(REMOTE_ADDRESS_EDEFAULT);
				return;
			case StorePackage.USER_SESSION__ACTIVE_SINCE:
				setActiveSince(ACTIVE_SINCE_EDEFAULT);
				return;
			case StorePackage.USER_SESSION__LAST_ACTIVE:
				setLastActive(LAST_ACTIVE_EDEFAULT);
				return;
			case StorePackage.USER_SESSION__ACCESS_METHOD:
				setAccessMethod(ACCESS_METHOD_EDEFAULT);
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
			case StorePackage.USER_SESSION__USER:
				return user != null;
			case StorePackage.USER_SESSION__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case StorePackage.USER_SESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StorePackage.USER_SESSION__TYPE:
				return type != TYPE_EDEFAULT;
			case StorePackage.USER_SESSION__REMOTE_ADDRESS:
				return REMOTE_ADDRESS_EDEFAULT == null ? remoteAddress != null : !REMOTE_ADDRESS_EDEFAULT.equals(remoteAddress);
			case StorePackage.USER_SESSION__ACTIVE_SINCE:
				return ACTIVE_SINCE_EDEFAULT == null ? activeSince != null : !ACTIVE_SINCE_EDEFAULT.equals(activeSince);
			case StorePackage.USER_SESSION__LAST_ACTIVE:
				return LAST_ACTIVE_EDEFAULT == null ? lastActive != null : !LAST_ACTIVE_EDEFAULT.equals(lastActive);
			case StorePackage.USER_SESSION__ACCESS_METHOD:
				return accessMethod != ACCESS_METHOD_EDEFAULT;
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
		result.append(" (username: ");
		result.append(username);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", remoteAddress: ");
		result.append(remoteAddress);
		result.append(", activeSince: ");
		result.append(activeSince);
		result.append(", lastActive: ");
		result.append(lastActive);
		result.append(", accessMethod: ");
		result.append(accessMethod);
		result.append(')');
		return result.toString();
	}

} //UserSessionImpl
