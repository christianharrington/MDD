/**
 */
package store.impl;

import java.util.Collection;
import java.util.Date;

import log.LogAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import store.Checkout;
import store.ConcreteRevision;
import store.ExtendedData;
import store.Geometry;
import store.Project;
import store.Revision;
import store.StorePackage;
import store.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.RevisionImpl#getId <em>Id</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getUser <em>User</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getConcreteRevisions <em>Concrete Revisions</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getLastConcreteRevision <em>Last Concrete Revision</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getCheckouts <em>Checkouts</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getProject <em>Project</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getLastError <em>Last Error</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getBmi <em>Bmi</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getLaid <em>Laid</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getExtendedData <em>Extended Data</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getLogs <em>Logs</em>}</li>
 *   <li>{@link store.impl.RevisionImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RevisionImpl extends EObjectImpl implements Revision {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Long size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcreteRevisions() <em>Concrete Revisions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteRevision> concreteRevisions;

	/**
	 * The cached value of the '{@link #getLastConcreteRevision() <em>Last Concrete Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastConcreteRevision()
	 * @generated
	 * @ordered
	 */
	protected ConcreteRevision lastConcreteRevision;

	/**
	 * The cached value of the '{@link #getCheckouts() <em>Checkouts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckouts()
	 * @generated
	 * @ordered
	 */
	protected EList<Checkout> checkouts;

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
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastError() <em>Last Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastError()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastError() <em>Last Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastError()
	 * @generated
	 * @ordered
	 */
	protected String lastError = LAST_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBmi() <em>Bmi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmi()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BMI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBmi() <em>Bmi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmi()
	 * @generated
	 * @ordered
	 */
	protected Integer bmi = BMI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaid() <em>Laid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaid()
	 * @generated
	 * @ordered
	 */
	protected static final Long LAID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLaid() <em>Laid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaid()
	 * @generated
	 * @ordered
	 */
	protected Long laid = LAID_EDEFAULT;

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
	 * The cached value of the '{@link #getLogs() <em>Logs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogs()
	 * @generated
	 * @ordered
	 */
	protected EList<LogAction> logs;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected Geometry geometry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__ID, oldId, id));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.REVISION__USER, oldUser, user));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__USER, oldUser, newUser);
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
				msgs = ((InternalEObject)user).eInverseRemove(this, StorePackage.USER__REVISIONS, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, StorePackage.USER__REVISIONS, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Long newSize) {
		Long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteRevision> getConcreteRevisions() {
		if (concreteRevisions == null) {
			concreteRevisions = new EObjectWithInverseResolvingEList.ManyInverse<ConcreteRevision>(ConcreteRevision.class, this, StorePackage.REVISION__CONCRETE_REVISIONS, StorePackage.CONCRETE_REVISION__REVISIONS);
		}
		return concreteRevisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteRevision getLastConcreteRevision() {
		if (lastConcreteRevision != null && lastConcreteRevision.eIsProxy()) {
			InternalEObject oldLastConcreteRevision = (InternalEObject)lastConcreteRevision;
			lastConcreteRevision = (ConcreteRevision)eResolveProxy(oldLastConcreteRevision);
			if (lastConcreteRevision != oldLastConcreteRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.REVISION__LAST_CONCRETE_REVISION, oldLastConcreteRevision, lastConcreteRevision));
			}
		}
		return lastConcreteRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteRevision basicGetLastConcreteRevision() {
		return lastConcreteRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastConcreteRevision(ConcreteRevision newLastConcreteRevision) {
		ConcreteRevision oldLastConcreteRevision = lastConcreteRevision;
		lastConcreteRevision = newLastConcreteRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__LAST_CONCRETE_REVISION, oldLastConcreteRevision, lastConcreteRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Checkout> getCheckouts() {
		if (checkouts == null) {
			checkouts = new EObjectWithInverseResolvingEList<Checkout>(Checkout.class, this, StorePackage.REVISION__CHECKOUTS, StorePackage.CHECKOUT__REVISION);
		}
		return checkouts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.REVISION__PROJECT, oldProject, project));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__PROJECT, oldProject, newProject);
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
				msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__REVISIONS, Project.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, StorePackage.PROJECT__REVISIONS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastError() {
		return lastError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastError(String newLastError) {
		String oldLastError = lastError;
		lastError = newLastError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__LAST_ERROR, oldLastError, lastError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBmi() {
		return bmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBmi(Integer newBmi) {
		Integer oldBmi = bmi;
		bmi = newBmi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__BMI, oldBmi, bmi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getLaid() {
		return laid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaid(Long newLaid) {
		Long oldLaid = laid;
		laid = newLaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__LAID, oldLaid, laid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedData> getExtendedData() {
		if (extendedData == null) {
			extendedData = new EObjectWithInverseResolvingEList<ExtendedData>(ExtendedData.class, this, StorePackage.REVISION__EXTENDED_DATA, StorePackage.EXTENDED_DATA__REVISION);
		}
		return extendedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogAction> getLogs() {
		if (logs == null) {
			logs = new EObjectResolvingEList<LogAction>(LogAction.class, this, StorePackage.REVISION__LOGS);
		}
		return logs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry getGeometry() {
		if (geometry != null && geometry.eIsProxy()) {
			InternalEObject oldGeometry = (InternalEObject)geometry;
			geometry = (Geometry)eResolveProxy(oldGeometry);
			if (geometry != oldGeometry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.REVISION__GEOMETRY, oldGeometry, geometry));
			}
		}
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry basicGetGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(Geometry newGeometry) {
		Geometry oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.REVISION__GEOMETRY, oldGeometry, geometry));
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
			case StorePackage.REVISION__USER:
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, StorePackage.USER__REVISIONS, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
			case StorePackage.REVISION__CONCRETE_REVISIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcreteRevisions()).basicAdd(otherEnd, msgs);
			case StorePackage.REVISION__CHECKOUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCheckouts()).basicAdd(otherEnd, msgs);
			case StorePackage.REVISION__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__REVISIONS, Project.class, msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case StorePackage.REVISION__EXTENDED_DATA:
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
			case StorePackage.REVISION__USER:
				return basicSetUser(null, msgs);
			case StorePackage.REVISION__CONCRETE_REVISIONS:
				return ((InternalEList<?>)getConcreteRevisions()).basicRemove(otherEnd, msgs);
			case StorePackage.REVISION__CHECKOUTS:
				return ((InternalEList<?>)getCheckouts()).basicRemove(otherEnd, msgs);
			case StorePackage.REVISION__PROJECT:
				return basicSetProject(null, msgs);
			case StorePackage.REVISION__EXTENDED_DATA:
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
			case StorePackage.REVISION__ID:
				return getId();
			case StorePackage.REVISION__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case StorePackage.REVISION__DATE:
				return getDate();
			case StorePackage.REVISION__COMMENT:
				return getComment();
			case StorePackage.REVISION__SIZE:
				return getSize();
			case StorePackage.REVISION__CONCRETE_REVISIONS:
				return getConcreteRevisions();
			case StorePackage.REVISION__LAST_CONCRETE_REVISION:
				if (resolve) return getLastConcreteRevision();
				return basicGetLastConcreteRevision();
			case StorePackage.REVISION__CHECKOUTS:
				return getCheckouts();
			case StorePackage.REVISION__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case StorePackage.REVISION__TAG:
				return getTag();
			case StorePackage.REVISION__LAST_ERROR:
				return getLastError();
			case StorePackage.REVISION__BMI:
				return getBmi();
			case StorePackage.REVISION__LAID:
				return getLaid();
			case StorePackage.REVISION__EXTENDED_DATA:
				return getExtendedData();
			case StorePackage.REVISION__LOGS:
				return getLogs();
			case StorePackage.REVISION__GEOMETRY:
				if (resolve) return getGeometry();
				return basicGetGeometry();
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
			case StorePackage.REVISION__ID:
				setId((Integer)newValue);
				return;
			case StorePackage.REVISION__USER:
				setUser((User)newValue);
				return;
			case StorePackage.REVISION__DATE:
				setDate((Date)newValue);
				return;
			case StorePackage.REVISION__COMMENT:
				setComment((String)newValue);
				return;
			case StorePackage.REVISION__SIZE:
				setSize((Long)newValue);
				return;
			case StorePackage.REVISION__CONCRETE_REVISIONS:
				getConcreteRevisions().clear();
				getConcreteRevisions().addAll((Collection<? extends ConcreteRevision>)newValue);
				return;
			case StorePackage.REVISION__LAST_CONCRETE_REVISION:
				setLastConcreteRevision((ConcreteRevision)newValue);
				return;
			case StorePackage.REVISION__CHECKOUTS:
				getCheckouts().clear();
				getCheckouts().addAll((Collection<? extends Checkout>)newValue);
				return;
			case StorePackage.REVISION__PROJECT:
				setProject((Project)newValue);
				return;
			case StorePackage.REVISION__TAG:
				setTag((String)newValue);
				return;
			case StorePackage.REVISION__LAST_ERROR:
				setLastError((String)newValue);
				return;
			case StorePackage.REVISION__BMI:
				setBmi((Integer)newValue);
				return;
			case StorePackage.REVISION__LAID:
				setLaid((Long)newValue);
				return;
			case StorePackage.REVISION__EXTENDED_DATA:
				getExtendedData().clear();
				getExtendedData().addAll((Collection<? extends ExtendedData>)newValue);
				return;
			case StorePackage.REVISION__LOGS:
				getLogs().clear();
				getLogs().addAll((Collection<? extends LogAction>)newValue);
				return;
			case StorePackage.REVISION__GEOMETRY:
				setGeometry((Geometry)newValue);
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
			case StorePackage.REVISION__ID:
				setId(ID_EDEFAULT);
				return;
			case StorePackage.REVISION__USER:
				setUser((User)null);
				return;
			case StorePackage.REVISION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case StorePackage.REVISION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case StorePackage.REVISION__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case StorePackage.REVISION__CONCRETE_REVISIONS:
				getConcreteRevisions().clear();
				return;
			case StorePackage.REVISION__LAST_CONCRETE_REVISION:
				setLastConcreteRevision((ConcreteRevision)null);
				return;
			case StorePackage.REVISION__CHECKOUTS:
				getCheckouts().clear();
				return;
			case StorePackage.REVISION__PROJECT:
				setProject((Project)null);
				return;
			case StorePackage.REVISION__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case StorePackage.REVISION__LAST_ERROR:
				setLastError(LAST_ERROR_EDEFAULT);
				return;
			case StorePackage.REVISION__BMI:
				setBmi(BMI_EDEFAULT);
				return;
			case StorePackage.REVISION__LAID:
				setLaid(LAID_EDEFAULT);
				return;
			case StorePackage.REVISION__EXTENDED_DATA:
				getExtendedData().clear();
				return;
			case StorePackage.REVISION__LOGS:
				getLogs().clear();
				return;
			case StorePackage.REVISION__GEOMETRY:
				setGeometry((Geometry)null);
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
			case StorePackage.REVISION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case StorePackage.REVISION__USER:
				return user != null;
			case StorePackage.REVISION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case StorePackage.REVISION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case StorePackage.REVISION__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case StorePackage.REVISION__CONCRETE_REVISIONS:
				return concreteRevisions != null && !concreteRevisions.isEmpty();
			case StorePackage.REVISION__LAST_CONCRETE_REVISION:
				return lastConcreteRevision != null;
			case StorePackage.REVISION__CHECKOUTS:
				return checkouts != null && !checkouts.isEmpty();
			case StorePackage.REVISION__PROJECT:
				return project != null;
			case StorePackage.REVISION__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case StorePackage.REVISION__LAST_ERROR:
				return LAST_ERROR_EDEFAULT == null ? lastError != null : !LAST_ERROR_EDEFAULT.equals(lastError);
			case StorePackage.REVISION__BMI:
				return BMI_EDEFAULT == null ? bmi != null : !BMI_EDEFAULT.equals(bmi);
			case StorePackage.REVISION__LAID:
				return LAID_EDEFAULT == null ? laid != null : !LAID_EDEFAULT.equals(laid);
			case StorePackage.REVISION__EXTENDED_DATA:
				return extendedData != null && !extendedData.isEmpty();
			case StorePackage.REVISION__LOGS:
				return logs != null && !logs.isEmpty();
			case StorePackage.REVISION__GEOMETRY:
				return geometry != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", date: ");
		result.append(date);
		result.append(", comment: ");
		result.append(comment);
		result.append(", size: ");
		result.append(size);
		result.append(", tag: ");
		result.append(tag);
		result.append(", lastError: ");
		result.append(lastError);
		result.append(", bmi: ");
		result.append(bmi);
		result.append(", laid: ");
		result.append(laid);
		result.append(')');
		return result.toString();
	}

} //RevisionImpl
