/**
 */
package store.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.StorePackage;
import store.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.VersionImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link store.impl.VersionImpl#getMinor <em>Minor</em>}</li>
 *   <li>{@link store.impl.VersionImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link store.impl.VersionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link store.impl.VersionImpl#getDownloadUrl <em>Download Url</em>}</li>
 *   <li>{@link store.impl.VersionImpl#getSupportUrl <em>Support Url</em>}</li>
 *   <li>{@link store.impl.VersionImpl#getSupportEmail <em>Support Email</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends EObjectImpl implements Version {
	/**
	 * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAJOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected Integer major = MAJOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected Integer minor = MINOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected Integer revision = REVISION_EDEFAULT;

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
	 * The default value of the '{@link #getDownloadUrl() <em>Download Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownloadUrl() <em>Download Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadUrl()
	 * @generated
	 * @ordered
	 */
	protected String downloadUrl = DOWNLOAD_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportUrl() <em>Support Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportUrl() <em>Support Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportUrl()
	 * @generated
	 * @ordered
	 */
	protected String supportUrl = SUPPORT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportEmail() <em>Support Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportEmail() <em>Support Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportEmail()
	 * @generated
	 * @ordered
	 */
	protected String supportEmail = SUPPORT_EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMajor() {
		return major;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajor(Integer newMajor) {
		Integer oldMajor = major;
		major = newMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.VERSION__MAJOR, oldMajor, major));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinor() {
		return minor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinor(Integer newMinor) {
		Integer oldMinor = minor;
		minor = newMinor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.VERSION__MINOR, oldMinor, minor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(Integer newRevision) {
		Integer oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.VERSION__REVISION, oldRevision, revision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.VERSION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownloadUrl(String newDownloadUrl) {
		String oldDownloadUrl = downloadUrl;
		downloadUrl = newDownloadUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.VERSION__DOWNLOAD_URL, oldDownloadUrl, downloadUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupportUrl() {
		return supportUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportUrl(String newSupportUrl) {
		String oldSupportUrl = supportUrl;
		supportUrl = newSupportUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.VERSION__SUPPORT_URL, oldSupportUrl, supportUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupportEmail() {
		return supportEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportEmail(String newSupportEmail) {
		String oldSupportEmail = supportEmail;
		supportEmail = newSupportEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.VERSION__SUPPORT_EMAIL, oldSupportEmail, supportEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.VERSION__MAJOR:
				return getMajor();
			case StorePackage.VERSION__MINOR:
				return getMinor();
			case StorePackage.VERSION__REVISION:
				return getRevision();
			case StorePackage.VERSION__DATE:
				return getDate();
			case StorePackage.VERSION__DOWNLOAD_URL:
				return getDownloadUrl();
			case StorePackage.VERSION__SUPPORT_URL:
				return getSupportUrl();
			case StorePackage.VERSION__SUPPORT_EMAIL:
				return getSupportEmail();
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
			case StorePackage.VERSION__MAJOR:
				setMajor((Integer)newValue);
				return;
			case StorePackage.VERSION__MINOR:
				setMinor((Integer)newValue);
				return;
			case StorePackage.VERSION__REVISION:
				setRevision((Integer)newValue);
				return;
			case StorePackage.VERSION__DATE:
				setDate((Date)newValue);
				return;
			case StorePackage.VERSION__DOWNLOAD_URL:
				setDownloadUrl((String)newValue);
				return;
			case StorePackage.VERSION__SUPPORT_URL:
				setSupportUrl((String)newValue);
				return;
			case StorePackage.VERSION__SUPPORT_EMAIL:
				setSupportEmail((String)newValue);
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
			case StorePackage.VERSION__MAJOR:
				setMajor(MAJOR_EDEFAULT);
				return;
			case StorePackage.VERSION__MINOR:
				setMinor(MINOR_EDEFAULT);
				return;
			case StorePackage.VERSION__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case StorePackage.VERSION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case StorePackage.VERSION__DOWNLOAD_URL:
				setDownloadUrl(DOWNLOAD_URL_EDEFAULT);
				return;
			case StorePackage.VERSION__SUPPORT_URL:
				setSupportUrl(SUPPORT_URL_EDEFAULT);
				return;
			case StorePackage.VERSION__SUPPORT_EMAIL:
				setSupportEmail(SUPPORT_EMAIL_EDEFAULT);
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
			case StorePackage.VERSION__MAJOR:
				return MAJOR_EDEFAULT == null ? major != null : !MAJOR_EDEFAULT.equals(major);
			case StorePackage.VERSION__MINOR:
				return MINOR_EDEFAULT == null ? minor != null : !MINOR_EDEFAULT.equals(minor);
			case StorePackage.VERSION__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case StorePackage.VERSION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case StorePackage.VERSION__DOWNLOAD_URL:
				return DOWNLOAD_URL_EDEFAULT == null ? downloadUrl != null : !DOWNLOAD_URL_EDEFAULT.equals(downloadUrl);
			case StorePackage.VERSION__SUPPORT_URL:
				return SUPPORT_URL_EDEFAULT == null ? supportUrl != null : !SUPPORT_URL_EDEFAULT.equals(supportUrl);
			case StorePackage.VERSION__SUPPORT_EMAIL:
				return SUPPORT_EMAIL_EDEFAULT == null ? supportEmail != null : !SUPPORT_EMAIL_EDEFAULT.equals(supportEmail);
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
		result.append(" (major: ");
		result.append(major);
		result.append(", minor: ");
		result.append(minor);
		result.append(", revision: ");
		result.append(revision);
		result.append(", date: ");
		result.append(date);
		result.append(", downloadUrl: ");
		result.append(downloadUrl);
		result.append(", supportUrl: ");
		result.append(supportUrl);
		result.append(", supportEmail: ");
		result.append(supportEmail);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
