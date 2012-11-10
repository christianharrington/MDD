/**
 */
package store.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import store.ConcreteRevision;
import store.Project;
import store.Revision;
import store.RevisionSummary;
import store.StorePackage;
import store.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.ConcreteRevisionImpl#getId <em>Id</em>}</li>
 *   <li>{@link store.impl.ConcreteRevisionImpl#getProject <em>Project</em>}</li>
 *   <li>{@link store.impl.ConcreteRevisionImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link store.impl.ConcreteRevisionImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link store.impl.ConcreteRevisionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link store.impl.ConcreteRevisionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link store.impl.ConcreteRevisionImpl#getLastError <em>Last Error</em>}</li>
 *   <li>{@link store.impl.ConcreteRevisionImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link store.impl.ConcreteRevisionImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteRevisionImpl extends EObjectImpl implements ConcreteRevision {
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
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The default value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CHECKSUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecksum() <em>Checksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksum()
	 * @generated
	 * @ordered
	 */
	protected byte[] checksum = CHECKSUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> revisions;

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
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected RevisionSummary summary;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteRevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.CONCRETE_REVISION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CONCRETE_REVISION__ID, oldId, id));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.CONCRETE_REVISION__PROJECT, oldProject, project));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.CONCRETE_REVISION__PROJECT, oldProject, newProject);
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
				msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__CONCRETE_REVISIONS, Project.class, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, StorePackage.PROJECT__CONCRETE_REVISIONS, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CONCRETE_REVISION__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getChecksum() {
		return checksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksum(byte[] newChecksum) {
		byte[] oldChecksum = checksum;
		checksum = newChecksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CONCRETE_REVISION__CHECKSUM, oldChecksum, checksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectWithInverseResolvingEList.ManyInverse<Revision>(Revision.class, this, StorePackage.CONCRETE_REVISION__REVISIONS, StorePackage.REVISION__CONCRETE_REVISIONS);
		}
		return revisions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CONCRETE_REVISION__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CONCRETE_REVISION__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CONCRETE_REVISION__LAST_ERROR, oldLastError, lastError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionSummary getSummary() {
		if (summary != null && summary.eIsProxy()) {
			InternalEObject oldSummary = (InternalEObject)summary;
			summary = (RevisionSummary)eResolveProxy(oldSummary);
			if (summary != oldSummary) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.CONCRETE_REVISION__SUMMARY, oldSummary, summary));
			}
		}
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionSummary basicGetSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(RevisionSummary newSummary) {
		RevisionSummary oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CONCRETE_REVISION__SUMMARY, oldSummary, summary));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.CONCRETE_REVISION__USER, oldUser, user));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CONCRETE_REVISION__USER, oldUser, user));
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
			case StorePackage.CONCRETE_REVISION__PROJECT:
				if (project != null)
					msgs = ((InternalEObject)project).eInverseRemove(this, StorePackage.PROJECT__CONCRETE_REVISIONS, Project.class, msgs);
				return basicSetProject((Project)otherEnd, msgs);
			case StorePackage.CONCRETE_REVISION__REVISIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRevisions()).basicAdd(otherEnd, msgs);
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
			case StorePackage.CONCRETE_REVISION__PROJECT:
				return basicSetProject(null, msgs);
			case StorePackage.CONCRETE_REVISION__REVISIONS:
				return ((InternalEList<?>)getRevisions()).basicRemove(otherEnd, msgs);
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
			case StorePackage.CONCRETE_REVISION__ID:
				return getId();
			case StorePackage.CONCRETE_REVISION__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case StorePackage.CONCRETE_REVISION__CHECKSUM:
				return getChecksum();
			case StorePackage.CONCRETE_REVISION__REVISIONS:
				return getRevisions();
			case StorePackage.CONCRETE_REVISION__SIZE:
				return getSize();
			case StorePackage.CONCRETE_REVISION__DATE:
				return getDate();
			case StorePackage.CONCRETE_REVISION__LAST_ERROR:
				return getLastError();
			case StorePackage.CONCRETE_REVISION__SUMMARY:
				if (resolve) return getSummary();
				return basicGetSummary();
			case StorePackage.CONCRETE_REVISION__USER:
				if (resolve) return getUser();
				return basicGetUser();
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
			case StorePackage.CONCRETE_REVISION__ID:
				setId((Integer)newValue);
				return;
			case StorePackage.CONCRETE_REVISION__PROJECT:
				setProject((Project)newValue);
				return;
			case StorePackage.CONCRETE_REVISION__CHECKSUM:
				setChecksum((byte[])newValue);
				return;
			case StorePackage.CONCRETE_REVISION__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends Revision>)newValue);
				return;
			case StorePackage.CONCRETE_REVISION__SIZE:
				setSize((Long)newValue);
				return;
			case StorePackage.CONCRETE_REVISION__DATE:
				setDate((Date)newValue);
				return;
			case StorePackage.CONCRETE_REVISION__LAST_ERROR:
				setLastError((String)newValue);
				return;
			case StorePackage.CONCRETE_REVISION__SUMMARY:
				setSummary((RevisionSummary)newValue);
				return;
			case StorePackage.CONCRETE_REVISION__USER:
				setUser((User)newValue);
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
			case StorePackage.CONCRETE_REVISION__ID:
				setId(ID_EDEFAULT);
				return;
			case StorePackage.CONCRETE_REVISION__PROJECT:
				setProject((Project)null);
				return;
			case StorePackage.CONCRETE_REVISION__CHECKSUM:
				setChecksum(CHECKSUM_EDEFAULT);
				return;
			case StorePackage.CONCRETE_REVISION__REVISIONS:
				getRevisions().clear();
				return;
			case StorePackage.CONCRETE_REVISION__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case StorePackage.CONCRETE_REVISION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case StorePackage.CONCRETE_REVISION__LAST_ERROR:
				setLastError(LAST_ERROR_EDEFAULT);
				return;
			case StorePackage.CONCRETE_REVISION__SUMMARY:
				setSummary((RevisionSummary)null);
				return;
			case StorePackage.CONCRETE_REVISION__USER:
				setUser((User)null);
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
			case StorePackage.CONCRETE_REVISION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case StorePackage.CONCRETE_REVISION__PROJECT:
				return project != null;
			case StorePackage.CONCRETE_REVISION__CHECKSUM:
				return CHECKSUM_EDEFAULT == null ? checksum != null : !CHECKSUM_EDEFAULT.equals(checksum);
			case StorePackage.CONCRETE_REVISION__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case StorePackage.CONCRETE_REVISION__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case StorePackage.CONCRETE_REVISION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case StorePackage.CONCRETE_REVISION__LAST_ERROR:
				return LAST_ERROR_EDEFAULT == null ? lastError != null : !LAST_ERROR_EDEFAULT.equals(lastError);
			case StorePackage.CONCRETE_REVISION__SUMMARY:
				return summary != null;
			case StorePackage.CONCRETE_REVISION__USER:
				return user != null;
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
		result.append(", checksum: ");
		result.append(checksum);
		result.append(", size: ");
		result.append(size);
		result.append(", date: ");
		result.append(date);
		result.append(", lastError: ");
		result.append(lastError);
		result.append(')');
		return result.toString();
	}

} //ConcreteRevisionImpl
