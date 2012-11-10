/**
 */
package store.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import store.DatabaseInformation;
import store.DatabaseInformationCategory;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.DatabaseInformationImpl#getNumberOfProjects <em>Number Of Projects</em>}</li>
 *   <li>{@link store.impl.DatabaseInformationImpl#getNumberOfUsers <em>Number Of Users</em>}</li>
 *   <li>{@link store.impl.DatabaseInformationImpl#getNumberOfRevisions <em>Number Of Revisions</em>}</li>
 *   <li>{@link store.impl.DatabaseInformationImpl#getNumberOfCheckouts <em>Number Of Checkouts</em>}</li>
 *   <li>{@link store.impl.DatabaseInformationImpl#getDatabaseSizeInBytes <em>Database Size In Bytes</em>}</li>
 *   <li>{@link store.impl.DatabaseInformationImpl#getType <em>Type</em>}</li>
 *   <li>{@link store.impl.DatabaseInformationImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link store.impl.DatabaseInformationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link store.impl.DatabaseInformationImpl#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link store.impl.DatabaseInformationImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseInformationImpl extends EObjectImpl implements DatabaseInformation {
	/**
	 * The default value of the '{@link #getNumberOfProjects() <em>Number Of Projects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProjects()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_PROJECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfProjects() <em>Number Of Projects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProjects()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfProjects = NUMBER_OF_PROJECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfUsers() <em>Number Of Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfUsers()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_USERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfUsers() <em>Number Of Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfUsers()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfUsers = NUMBER_OF_USERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRevisions() <em>Number Of Revisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRevisions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_REVISIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfRevisions() <em>Number Of Revisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRevisions()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfRevisions = NUMBER_OF_REVISIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfCheckouts() <em>Number Of Checkouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCheckouts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_CHECKOUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfCheckouts() <em>Number Of Checkouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfCheckouts()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfCheckouts = NUMBER_OF_CHECKOUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseSizeInBytes() <em>Database Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final Long DATABASE_SIZE_IN_BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseSizeInBytes() <em>Database Size In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseSizeInBytes()
	 * @generated
	 * @ordered
	 */
	protected Long databaseSizeInBytes = DATABASE_SIZE_IN_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCHEMA_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer schemaVersion = SCHEMA_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseInformationCategory> categories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.DATABASE_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfProjects() {
		return numberOfProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfProjects(Integer newNumberOfProjects) {
		Integer oldNumberOfProjects = numberOfProjects;
		numberOfProjects = newNumberOfProjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DATABASE_INFORMATION__NUMBER_OF_PROJECTS, oldNumberOfProjects, numberOfProjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfUsers() {
		return numberOfUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfUsers(Integer newNumberOfUsers) {
		Integer oldNumberOfUsers = numberOfUsers;
		numberOfUsers = newNumberOfUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DATABASE_INFORMATION__NUMBER_OF_USERS, oldNumberOfUsers, numberOfUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfRevisions() {
		return numberOfRevisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRevisions(Integer newNumberOfRevisions) {
		Integer oldNumberOfRevisions = numberOfRevisions;
		numberOfRevisions = newNumberOfRevisions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DATABASE_INFORMATION__NUMBER_OF_REVISIONS, oldNumberOfRevisions, numberOfRevisions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfCheckouts() {
		return numberOfCheckouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfCheckouts(Integer newNumberOfCheckouts) {
		Integer oldNumberOfCheckouts = numberOfCheckouts;
		numberOfCheckouts = newNumberOfCheckouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DATABASE_INFORMATION__NUMBER_OF_CHECKOUTS, oldNumberOfCheckouts, numberOfCheckouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDatabaseSizeInBytes() {
		return databaseSizeInBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseSizeInBytes(Long newDatabaseSizeInBytes) {
		Long oldDatabaseSizeInBytes = databaseSizeInBytes;
		databaseSizeInBytes = newDatabaseSizeInBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DATABASE_INFORMATION__DATABASE_SIZE_IN_BYTES, oldDatabaseSizeInBytes, databaseSizeInBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DATABASE_INFORMATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DATABASE_INFORMATION__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DATABASE_INFORMATION__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaVersion(Integer newSchemaVersion) {
		Integer oldSchemaVersion = schemaVersion;
		schemaVersion = newSchemaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.DATABASE_INFORMATION__SCHEMA_VERSION, oldSchemaVersion, schemaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseInformationCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectResolvingEList<DatabaseInformationCategory>(DatabaseInformationCategory.class, this, StorePackage.DATABASE_INFORMATION__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_PROJECTS:
				return getNumberOfProjects();
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_USERS:
				return getNumberOfUsers();
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_REVISIONS:
				return getNumberOfRevisions();
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_CHECKOUTS:
				return getNumberOfCheckouts();
			case StorePackage.DATABASE_INFORMATION__DATABASE_SIZE_IN_BYTES:
				return getDatabaseSizeInBytes();
			case StorePackage.DATABASE_INFORMATION__TYPE:
				return getType();
			case StorePackage.DATABASE_INFORMATION__CREATED:
				return getCreated();
			case StorePackage.DATABASE_INFORMATION__LOCATION:
				return getLocation();
			case StorePackage.DATABASE_INFORMATION__SCHEMA_VERSION:
				return getSchemaVersion();
			case StorePackage.DATABASE_INFORMATION__CATEGORIES:
				return getCategories();
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
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_PROJECTS:
				setNumberOfProjects((Integer)newValue);
				return;
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_USERS:
				setNumberOfUsers((Integer)newValue);
				return;
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_REVISIONS:
				setNumberOfRevisions((Integer)newValue);
				return;
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_CHECKOUTS:
				setNumberOfCheckouts((Integer)newValue);
				return;
			case StorePackage.DATABASE_INFORMATION__DATABASE_SIZE_IN_BYTES:
				setDatabaseSizeInBytes((Long)newValue);
				return;
			case StorePackage.DATABASE_INFORMATION__TYPE:
				setType((String)newValue);
				return;
			case StorePackage.DATABASE_INFORMATION__CREATED:
				setCreated((Date)newValue);
				return;
			case StorePackage.DATABASE_INFORMATION__LOCATION:
				setLocation((String)newValue);
				return;
			case StorePackage.DATABASE_INFORMATION__SCHEMA_VERSION:
				setSchemaVersion((Integer)newValue);
				return;
			case StorePackage.DATABASE_INFORMATION__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends DatabaseInformationCategory>)newValue);
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
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_PROJECTS:
				setNumberOfProjects(NUMBER_OF_PROJECTS_EDEFAULT);
				return;
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_USERS:
				setNumberOfUsers(NUMBER_OF_USERS_EDEFAULT);
				return;
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_REVISIONS:
				setNumberOfRevisions(NUMBER_OF_REVISIONS_EDEFAULT);
				return;
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_CHECKOUTS:
				setNumberOfCheckouts(NUMBER_OF_CHECKOUTS_EDEFAULT);
				return;
			case StorePackage.DATABASE_INFORMATION__DATABASE_SIZE_IN_BYTES:
				setDatabaseSizeInBytes(DATABASE_SIZE_IN_BYTES_EDEFAULT);
				return;
			case StorePackage.DATABASE_INFORMATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StorePackage.DATABASE_INFORMATION__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case StorePackage.DATABASE_INFORMATION__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case StorePackage.DATABASE_INFORMATION__SCHEMA_VERSION:
				setSchemaVersion(SCHEMA_VERSION_EDEFAULT);
				return;
			case StorePackage.DATABASE_INFORMATION__CATEGORIES:
				getCategories().clear();
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
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_PROJECTS:
				return NUMBER_OF_PROJECTS_EDEFAULT == null ? numberOfProjects != null : !NUMBER_OF_PROJECTS_EDEFAULT.equals(numberOfProjects);
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_USERS:
				return NUMBER_OF_USERS_EDEFAULT == null ? numberOfUsers != null : !NUMBER_OF_USERS_EDEFAULT.equals(numberOfUsers);
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_REVISIONS:
				return NUMBER_OF_REVISIONS_EDEFAULT == null ? numberOfRevisions != null : !NUMBER_OF_REVISIONS_EDEFAULT.equals(numberOfRevisions);
			case StorePackage.DATABASE_INFORMATION__NUMBER_OF_CHECKOUTS:
				return NUMBER_OF_CHECKOUTS_EDEFAULT == null ? numberOfCheckouts != null : !NUMBER_OF_CHECKOUTS_EDEFAULT.equals(numberOfCheckouts);
			case StorePackage.DATABASE_INFORMATION__DATABASE_SIZE_IN_BYTES:
				return DATABASE_SIZE_IN_BYTES_EDEFAULT == null ? databaseSizeInBytes != null : !DATABASE_SIZE_IN_BYTES_EDEFAULT.equals(databaseSizeInBytes);
			case StorePackage.DATABASE_INFORMATION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case StorePackage.DATABASE_INFORMATION__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case StorePackage.DATABASE_INFORMATION__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case StorePackage.DATABASE_INFORMATION__SCHEMA_VERSION:
				return SCHEMA_VERSION_EDEFAULT == null ? schemaVersion != null : !SCHEMA_VERSION_EDEFAULT.equals(schemaVersion);
			case StorePackage.DATABASE_INFORMATION__CATEGORIES:
				return categories != null && !categories.isEmpty();
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
		result.append(" (numberOfProjects: ");
		result.append(numberOfProjects);
		result.append(", numberOfUsers: ");
		result.append(numberOfUsers);
		result.append(", numberOfRevisions: ");
		result.append(numberOfRevisions);
		result.append(", numberOfCheckouts: ");
		result.append(numberOfCheckouts);
		result.append(", databaseSizeInBytes: ");
		result.append(databaseSizeInBytes);
		result.append(", type: ");
		result.append(type);
		result.append(", created: ");
		result.append(created);
		result.append(", location: ");
		result.append(location);
		result.append(", schemaVersion: ");
		result.append(schemaVersion);
		result.append(')');
		return result.toString();
	}

} //DatabaseInformationImpl
