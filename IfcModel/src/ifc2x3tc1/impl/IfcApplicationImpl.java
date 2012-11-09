/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcApplication;
import ifc2x3tc1.IfcOrganization;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcApplicationImpl#getApplicationDeveloper <em>Application Developer</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApplicationImpl#getApplicationFullName <em>Application Full Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcApplicationImpl#getApplicationIdentifier <em>Application Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApplicationImpl extends EObjectImpl implements IfcApplication {
	/**
	 * The cached value of the '{@link #getApplicationDeveloper() <em>Application Developer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDeveloper()
	 * @generated
	 * @ordered
	 */
	protected IfcOrganization applicationDeveloper;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationFullName() <em>Application Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationFullName() <em>Application Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationFullName()
	 * @generated
	 * @ordered
	 */
	protected String applicationFullName = APPLICATION_FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationIdentifier() <em>Application Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationIdentifier() <em>Application Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String applicationIdentifier = APPLICATION_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcApplication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization getApplicationDeveloper() {
		if (applicationDeveloper != null && applicationDeveloper.eIsProxy()) {
			InternalEObject oldApplicationDeveloper = (InternalEObject)applicationDeveloper;
			applicationDeveloper = (IfcOrganization)eResolveProxy(oldApplicationDeveloper);
			if (applicationDeveloper != oldApplicationDeveloper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_DEVELOPER, oldApplicationDeveloper, applicationDeveloper));
			}
		}
		return applicationDeveloper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOrganization basicGetApplicationDeveloper() {
		return applicationDeveloper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationDeveloper(IfcOrganization newApplicationDeveloper) {
		IfcOrganization oldApplicationDeveloper = applicationDeveloper;
		applicationDeveloper = newApplicationDeveloper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_DEVELOPER, oldApplicationDeveloper, applicationDeveloper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLICATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationFullName() {
		return applicationFullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationFullName(String newApplicationFullName) {
		String oldApplicationFullName = applicationFullName;
		applicationFullName = newApplicationFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_FULL_NAME, oldApplicationFullName, applicationFullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationIdentifier() {
		return applicationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationIdentifier(String newApplicationIdentifier) {
		String oldApplicationIdentifier = applicationIdentifier;
		applicationIdentifier = newApplicationIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_IDENTIFIER, oldApplicationIdentifier, applicationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_DEVELOPER:
				if (resolve) return getApplicationDeveloper();
				return basicGetApplicationDeveloper();
			case Ifc2x3tc1Package.IFC_APPLICATION__VERSION:
				return getVersion();
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_FULL_NAME:
				return getApplicationFullName();
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_IDENTIFIER:
				return getApplicationIdentifier();
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
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_DEVELOPER:
				setApplicationDeveloper((IfcOrganization)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLICATION__VERSION:
				setVersion((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_FULL_NAME:
				setApplicationFullName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_IDENTIFIER:
				setApplicationIdentifier((String)newValue);
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
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_DEVELOPER:
				setApplicationDeveloper((IfcOrganization)null);
				return;
			case Ifc2x3tc1Package.IFC_APPLICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_FULL_NAME:
				setApplicationFullName(APPLICATION_FULL_NAME_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_IDENTIFIER:
				setApplicationIdentifier(APPLICATION_IDENTIFIER_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_DEVELOPER:
				return applicationDeveloper != null;
			case Ifc2x3tc1Package.IFC_APPLICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_FULL_NAME:
				return APPLICATION_FULL_NAME_EDEFAULT == null ? applicationFullName != null : !APPLICATION_FULL_NAME_EDEFAULT.equals(applicationFullName);
			case Ifc2x3tc1Package.IFC_APPLICATION__APPLICATION_IDENTIFIER:
				return APPLICATION_IDENTIFIER_EDEFAULT == null ? applicationIdentifier != null : !APPLICATION_IDENTIFIER_EDEFAULT.equals(applicationIdentifier);
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
		result.append(" (Version: ");
		result.append(version);
		result.append(", ApplicationFullName: ");
		result.append(applicationFullName);
		result.append(", ApplicationIdentifier: ");
		result.append(applicationIdentifier);
		result.append(')');
		return result.toString();
	}

} //IfcApplicationImpl
