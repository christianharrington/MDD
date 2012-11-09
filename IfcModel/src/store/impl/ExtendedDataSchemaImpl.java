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

import store.ExtendedData;
import store.ExtendedDataSchema;
import store.ExtendedDataSchemaType;
import store.File;
import store.StorePackage;
import store.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Data Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#getFile <em>File</em>}</li>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#getSize <em>Size</em>}</li>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#isValidate <em>Validate</em>}</li>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link store.impl.ExtendedDataSchemaImpl#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedDataSchemaImpl extends EObjectImpl implements ExtendedDataSchema {
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
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

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
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected File file;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidate() <em>Validate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidate()
	 * @generated
	 * @ordered
	 */
	protected boolean validate = VALIDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ExtendedDataSchemaType TYPE_EDEFAULT = ExtendedDataSchemaType.XSD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ExtendedDataSchemaType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getExtendedData() <em>Extended Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedData()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedData> extendedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedDataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.EXTENDED_DATA_SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA_SCHEMA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA_SCHEMA__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA_SCHEMA__NAMESPACE, oldNamespace, namespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA_SCHEMA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile() {
		if (file != null && file.eIsProxy()) {
			InternalEObject oldFile = (InternalEObject)file;
			file = (File)eResolveProxy(oldFile);
			if (file != oldFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.EXTENDED_DATA_SCHEMA__FILE, oldFile, file));
			}
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(File newFile) {
		File oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA_SCHEMA__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA_SCHEMA__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidate() {
		return validate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidate(boolean newValidate) {
		boolean oldValidate = validate;
		validate = newValidate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA_SCHEMA__VALIDATE, oldValidate, validate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchemaType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ExtendedDataSchemaType newType) {
		ExtendedDataSchemaType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA_SCHEMA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, StorePackage.EXTENDED_DATA_SCHEMA__USERS, StorePackage.USER__SCHEMAS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedData> getExtendedData() {
		if (extendedData == null) {
			extendedData = new EObjectWithInverseResolvingEList<ExtendedData>(ExtendedData.class, this, StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA, StorePackage.EXTENDED_DATA__SCHEMA);
		}
		return extendedData;
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
			case StorePackage.EXTENDED_DATA_SCHEMA__USERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsers()).basicAdd(otherEnd, msgs);
			case StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtendedData()).basicAdd(otherEnd, msgs);
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
			case StorePackage.EXTENDED_DATA_SCHEMA__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA:
				return ((InternalEList<?>)getExtendedData()).basicRemove(otherEnd, msgs);
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
			case StorePackage.EXTENDED_DATA_SCHEMA__NAME:
				return getName();
			case StorePackage.EXTENDED_DATA_SCHEMA__URL:
				return getUrl();
			case StorePackage.EXTENDED_DATA_SCHEMA__NAMESPACE:
				return getNamespace();
			case StorePackage.EXTENDED_DATA_SCHEMA__DESCRIPTION:
				return getDescription();
			case StorePackage.EXTENDED_DATA_SCHEMA__FILE:
				if (resolve) return getFile();
				return basicGetFile();
			case StorePackage.EXTENDED_DATA_SCHEMA__SIZE:
				return getSize();
			case StorePackage.EXTENDED_DATA_SCHEMA__VALIDATE:
				return isValidate();
			case StorePackage.EXTENDED_DATA_SCHEMA__TYPE:
				return getType();
			case StorePackage.EXTENDED_DATA_SCHEMA__USERS:
				return getUsers();
			case StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA:
				return getExtendedData();
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
			case StorePackage.EXTENDED_DATA_SCHEMA__NAME:
				setName((String)newValue);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__URL:
				setUrl((String)newValue);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__FILE:
				setFile((File)newValue);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__SIZE:
				setSize((Long)newValue);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__VALIDATE:
				setValidate((Boolean)newValue);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__TYPE:
				setType((ExtendedDataSchemaType)newValue);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA:
				getExtendedData().clear();
				getExtendedData().addAll((Collection<? extends ExtendedData>)newValue);
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
			case StorePackage.EXTENDED_DATA_SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__URL:
				setUrl(URL_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__FILE:
				setFile((File)null);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__VALIDATE:
				setValidate(VALIDATE_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__USERS:
				getUsers().clear();
				return;
			case StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA:
				getExtendedData().clear();
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
			case StorePackage.EXTENDED_DATA_SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StorePackage.EXTENDED_DATA_SCHEMA__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case StorePackage.EXTENDED_DATA_SCHEMA__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case StorePackage.EXTENDED_DATA_SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StorePackage.EXTENDED_DATA_SCHEMA__FILE:
				return file != null;
			case StorePackage.EXTENDED_DATA_SCHEMA__SIZE:
				return size != SIZE_EDEFAULT;
			case StorePackage.EXTENDED_DATA_SCHEMA__VALIDATE:
				return validate != VALIDATE_EDEFAULT;
			case StorePackage.EXTENDED_DATA_SCHEMA__TYPE:
				return type != TYPE_EDEFAULT;
			case StorePackage.EXTENDED_DATA_SCHEMA__USERS:
				return users != null && !users.isEmpty();
			case StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA:
				return extendedData != null && !extendedData.isEmpty();
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
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", description: ");
		result.append(description);
		result.append(", size: ");
		result.append(size);
		result.append(", validate: ");
		result.append(validate);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ExtendedDataSchemaImpl
