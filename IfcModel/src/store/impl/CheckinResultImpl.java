/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.CheckinResult;
import store.CheckinStatus;
import store.Project;
import store.Revision;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checkin Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.CheckinResultImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link store.impl.CheckinResultImpl#getProject <em>Project</em>}</li>
 *   <li>{@link store.impl.CheckinResultImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link store.impl.CheckinResultImpl#getLastError <em>Last Error</em>}</li>
 *   <li>{@link store.impl.CheckinResultImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckinResultImpl extends EObjectImpl implements CheckinResult {
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
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected Integer progress = PROGRESS_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CheckinStatus STATUS_EDEFAULT = CheckinStatus.CH_NONE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CheckinStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckinResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.CHECKIN_RESULT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.CHECKIN_RESULT__REVISION, oldRevision, revision));
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
	public void setRevision(Revision newRevision) {
		Revision oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CHECKIN_RESULT__REVISION, oldRevision, revision));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.CHECKIN_RESULT__PROJECT, oldProject, project));
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
	public void setProject(Project newProject) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CHECKIN_RESULT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(Integer newProgress) {
		Integer oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CHECKIN_RESULT__PROGRESS, oldProgress, progress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CHECKIN_RESULT__LAST_ERROR, oldLastError, lastError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckinStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CheckinStatus newStatus) {
		CheckinStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.CHECKIN_RESULT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.CHECKIN_RESULT__REVISION:
				if (resolve) return getRevision();
				return basicGetRevision();
			case StorePackage.CHECKIN_RESULT__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case StorePackage.CHECKIN_RESULT__PROGRESS:
				return getProgress();
			case StorePackage.CHECKIN_RESULT__LAST_ERROR:
				return getLastError();
			case StorePackage.CHECKIN_RESULT__STATUS:
				return getStatus();
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
			case StorePackage.CHECKIN_RESULT__REVISION:
				setRevision((Revision)newValue);
				return;
			case StorePackage.CHECKIN_RESULT__PROJECT:
				setProject((Project)newValue);
				return;
			case StorePackage.CHECKIN_RESULT__PROGRESS:
				setProgress((Integer)newValue);
				return;
			case StorePackage.CHECKIN_RESULT__LAST_ERROR:
				setLastError((String)newValue);
				return;
			case StorePackage.CHECKIN_RESULT__STATUS:
				setStatus((CheckinStatus)newValue);
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
			case StorePackage.CHECKIN_RESULT__REVISION:
				setRevision((Revision)null);
				return;
			case StorePackage.CHECKIN_RESULT__PROJECT:
				setProject((Project)null);
				return;
			case StorePackage.CHECKIN_RESULT__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case StorePackage.CHECKIN_RESULT__LAST_ERROR:
				setLastError(LAST_ERROR_EDEFAULT);
				return;
			case StorePackage.CHECKIN_RESULT__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case StorePackage.CHECKIN_RESULT__REVISION:
				return revision != null;
			case StorePackage.CHECKIN_RESULT__PROJECT:
				return project != null;
			case StorePackage.CHECKIN_RESULT__PROGRESS:
				return PROGRESS_EDEFAULT == null ? progress != null : !PROGRESS_EDEFAULT.equals(progress);
			case StorePackage.CHECKIN_RESULT__LAST_ERROR:
				return LAST_ERROR_EDEFAULT == null ? lastError != null : !LAST_ERROR_EDEFAULT.equals(lastError);
			case StorePackage.CHECKIN_RESULT__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(" (progress: ");
		result.append(progress);
		result.append(", lastError: ");
		result.append(lastError);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //CheckinResultImpl
