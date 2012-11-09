/**
 */
package store.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.ExtendedData;
import store.ExtendedDataSchema;
import store.File;
import store.Project;
import store.Revision;
import store.StorePackage;
import store.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.ExtendedDataImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link store.impl.ExtendedDataImpl#getFile <em>File</em>}</li>
 *   <li>{@link store.impl.ExtendedDataImpl#getSize <em>Size</em>}</li>
 *   <li>{@link store.impl.ExtendedDataImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link store.impl.ExtendedDataImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link store.impl.ExtendedDataImpl#getUser <em>User</em>}</li>
 *   <li>{@link store.impl.ExtendedDataImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link store.impl.ExtendedDataImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link store.impl.ExtendedDataImpl#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedDataImpl extends EObjectImpl implements ExtendedData {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdded() <em>Added</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdded()
	 * @generated
	 * @ordered
	 */
	protected static final Date ADDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdded() <em>Added</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdded()
	 * @generated
	 * @ordered
	 */
	protected Date added = ADDED_EDEFAULT;

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
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected ExtendedDataSchema schema;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected Revision revision;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.EXTENDED_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__URL, oldUrl, url));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.EXTENDED_DATA__FILE, oldFile, file));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__FILE, oldFile, file));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAdded() {
		return added;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdded(Date newAdded) {
		Date oldAdded = added;
		added = newAdded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__ADDED, oldAdded, added));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.EXTENDED_DATA__USER, oldUser, user));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__USER, oldUser, newUser);
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
				msgs = ((InternalEObject)user).eInverseRemove(this, StorePackage.USER__EXTENDED_DATA, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, StorePackage.USER__EXTENDED_DATA, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchema getSchema() {
		if (schema != null && schema.eIsProxy()) {
			InternalEObject oldSchema = (InternalEObject)schema;
			schema = (ExtendedDataSchema)eResolveProxy(oldSchema);
			if (schema != oldSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.EXTENDED_DATA__SCHEMA, oldSchema, schema));
			}
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchema basicGetSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(ExtendedDataSchema newSchema, NotificationChain msgs) {
		ExtendedDataSchema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__SCHEMA, oldSchema, newSchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(ExtendedDataSchema newSchema) {
		if (newSchema != schema) {
			NotificationChain msgs = null;
			if (schema != null)
				msgs = ((InternalEObject)schema).eInverseRemove(this, StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA, ExtendedDataSchema.class, msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA, ExtendedDataSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__SCHEMA, newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getRevision() {
		if (revision != null && revision.eIsProxy()) {
			InternalEObject oldRevision = (InternalEObject)revision;
			revision = (Revision)eResolveProxy(oldRevision);
			if (revision != oldRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.EXTENDED_DATA__REVISION, oldRevision, revision));
			}
		}
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision basicGetRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevision(Revision newRevision, NotificationChain msgs) {
		Revision oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__REVISION, oldRevision, newRevision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(Revision newRevision) {
		if (newRevision != revision) {
			NotificationChain msgs = null;
			if (revision != null)
				msgs = ((InternalEObject)revision).eInverseRemove(this, StorePackage.REVISION__EXTENDED_DATA, Revision.class, msgs);
			if (newRevision != null)
				msgs = ((InternalEObject)newRevision).eInverseAdd(this, StorePackage.REVISION__EXTENDED_DATA, Revision.class, msgs);
			msgs = basicSetRevision(newRevision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__REVISION, newRevision, newRevision));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.EXTENDED_DATA__PROJECT, oldProject, project));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__PROJECT, oldProject, newProject);
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
				msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__EXTENDED_DATA, Project.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, StorePackage.PROJECT__EXTENDED_DATA, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.EXTENDED_DATA__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StorePackage.EXTENDED_DATA__USER:
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, StorePackage.USER__EXTENDED_DATA, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
			case StorePackage.EXTENDED_DATA__SCHEMA:
				if (schema != null)
					msgs = ((InternalEObject)schema).eInverseRemove(this, StorePackage.EXTENDED_DATA_SCHEMA__EXTENDED_DATA, ExtendedDataSchema.class, msgs);
				return basicSetSchema((ExtendedDataSchema)otherEnd, msgs);
			case StorePackage.EXTENDED_DATA__REVISION:
				if (revision != null)
					msgs = ((InternalEObject)revision).eInverseRemove(this, StorePackage.REVISION__EXTENDED_DATA, Revision.class, msgs);
				return basicSetRevision((Revision)otherEnd, msgs);
			case StorePackage.EXTENDED_DATA__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__EXTENDED_DATA, Project.class, msgs);
				return basicSetProject((Project)otherEnd, msgs);
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
			case StorePackage.EXTENDED_DATA__USER:
				return basicSetUser(null, msgs);
			case StorePackage.EXTENDED_DATA__SCHEMA:
				return basicSetSchema(null, msgs);
			case StorePackage.EXTENDED_DATA__REVISION:
				return basicSetRevision(null, msgs);
			case StorePackage.EXTENDED_DATA__PROJECT:
				return basicSetProject(null, msgs);
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
			case StorePackage.EXTENDED_DATA__URL:
				return getUrl();
			case StorePackage.EXTENDED_DATA__FILE:
				if (resolve) return getFile();
				return basicGetFile();
			case StorePackage.EXTENDED_DATA__SIZE:
				return getSize();
			case StorePackage.EXTENDED_DATA__TITLE:
				return getTitle();
			case StorePackage.EXTENDED_DATA__ADDED:
				return getAdded();
			case StorePackage.EXTENDED_DATA__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case StorePackage.EXTENDED_DATA__SCHEMA:
				if (resolve) return getSchema();
				return basicGetSchema();
			case StorePackage.EXTENDED_DATA__REVISION:
				if (resolve) return getRevision();
				return basicGetRevision();
			case StorePackage.EXTENDED_DATA__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
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
			case StorePackage.EXTENDED_DATA__URL:
				setUrl((String)newValue);
				return;
			case StorePackage.EXTENDED_DATA__FILE:
				setFile((File)newValue);
				return;
			case StorePackage.EXTENDED_DATA__SIZE:
				setSize((Long)newValue);
				return;
			case StorePackage.EXTENDED_DATA__TITLE:
				setTitle((String)newValue);
				return;
			case StorePackage.EXTENDED_DATA__ADDED:
				setAdded((Date)newValue);
				return;
			case StorePackage.EXTENDED_DATA__USER:
				setUser((User)newValue);
				return;
			case StorePackage.EXTENDED_DATA__SCHEMA:
				setSchema((ExtendedDataSchema)newValue);
				return;
			case StorePackage.EXTENDED_DATA__REVISION:
				setRevision((Revision)newValue);
				return;
			case StorePackage.EXTENDED_DATA__PROJECT:
				setProject((Project)newValue);
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
			case StorePackage.EXTENDED_DATA__URL:
				setUrl(URL_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA__FILE:
				setFile((File)null);
				return;
			case StorePackage.EXTENDED_DATA__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA__ADDED:
				setAdded(ADDED_EDEFAULT);
				return;
			case StorePackage.EXTENDED_DATA__USER:
				setUser((User)null);
				return;
			case StorePackage.EXTENDED_DATA__SCHEMA:
				setSchema((ExtendedDataSchema)null);
				return;
			case StorePackage.EXTENDED_DATA__REVISION:
				setRevision((Revision)null);
				return;
			case StorePackage.EXTENDED_DATA__PROJECT:
				setProject((Project)null);
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
			case StorePackage.EXTENDED_DATA__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case StorePackage.EXTENDED_DATA__FILE:
				return file != null;
			case StorePackage.EXTENDED_DATA__SIZE:
				return size != SIZE_EDEFAULT;
			case StorePackage.EXTENDED_DATA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case StorePackage.EXTENDED_DATA__ADDED:
				return ADDED_EDEFAULT == null ? added != null : !ADDED_EDEFAULT.equals(added);
			case StorePackage.EXTENDED_DATA__USER:
				return user != null;
			case StorePackage.EXTENDED_DATA__SCHEMA:
				return schema != null;
			case StorePackage.EXTENDED_DATA__REVISION:
				return revision != null;
			case StorePackage.EXTENDED_DATA__PROJECT:
				return project != null;
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
		result.append(" (url: ");
		result.append(url);
		result.append(", size: ");
		result.append(size);
		result.append(", title: ");
		result.append(title);
		result.append(", added: ");
		result.append(added);
		result.append(')');
		return result.toString();
	}

} //ExtendedDataImpl
