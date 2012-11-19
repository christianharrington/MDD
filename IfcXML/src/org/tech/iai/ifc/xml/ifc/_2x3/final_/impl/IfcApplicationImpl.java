/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicationDeveloperType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcApplication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApplicationImpl#getApplicationDeveloper <em>Application Developer</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApplicationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApplicationImpl#getApplicationFullName <em>Application Full Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcApplicationImpl#getApplicationIdentifier <em>Application Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApplicationImpl extends EntityImpl implements IfcApplication {
	/**
	 * The cached value of the '{@link #getApplicationDeveloper() <em>Application Developer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDeveloper()
	 * @generated
	 * @ordered
	 */
	protected ApplicationDeveloperType applicationDeveloper;

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
		return FinalPackage.eINSTANCE.getIfcApplication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDeveloperType getApplicationDeveloper() {
		return applicationDeveloper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationDeveloper(ApplicationDeveloperType newApplicationDeveloper, NotificationChain msgs) {
		ApplicationDeveloperType oldApplicationDeveloper = applicationDeveloper;
		applicationDeveloper = newApplicationDeveloper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLICATION__APPLICATION_DEVELOPER, oldApplicationDeveloper, newApplicationDeveloper);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationDeveloper(ApplicationDeveloperType newApplicationDeveloper) {
		if (newApplicationDeveloper != applicationDeveloper) {
			NotificationChain msgs = null;
			if (applicationDeveloper != null)
				msgs = ((InternalEObject)applicationDeveloper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLICATION__APPLICATION_DEVELOPER, null, msgs);
			if (newApplicationDeveloper != null)
				msgs = ((InternalEObject)newApplicationDeveloper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_APPLICATION__APPLICATION_DEVELOPER, null, msgs);
			msgs = basicSetApplicationDeveloper(newApplicationDeveloper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLICATION__APPLICATION_DEVELOPER, newApplicationDeveloper, newApplicationDeveloper));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLICATION__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLICATION__APPLICATION_FULL_NAME, oldApplicationFullName, applicationFullName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_APPLICATION__APPLICATION_IDENTIFIER, oldApplicationIdentifier, applicationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_APPLICATION__APPLICATION_DEVELOPER:
				return basicSetApplicationDeveloper(null, msgs);
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
			case FinalPackage.IFC_APPLICATION__APPLICATION_DEVELOPER:
				return getApplicationDeveloper();
			case FinalPackage.IFC_APPLICATION__VERSION:
				return getVersion();
			case FinalPackage.IFC_APPLICATION__APPLICATION_FULL_NAME:
				return getApplicationFullName();
			case FinalPackage.IFC_APPLICATION__APPLICATION_IDENTIFIER:
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
			case FinalPackage.IFC_APPLICATION__APPLICATION_DEVELOPER:
				setApplicationDeveloper((ApplicationDeveloperType)newValue);
				return;
			case FinalPackage.IFC_APPLICATION__VERSION:
				setVersion((String)newValue);
				return;
			case FinalPackage.IFC_APPLICATION__APPLICATION_FULL_NAME:
				setApplicationFullName((String)newValue);
				return;
			case FinalPackage.IFC_APPLICATION__APPLICATION_IDENTIFIER:
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
			case FinalPackage.IFC_APPLICATION__APPLICATION_DEVELOPER:
				setApplicationDeveloper((ApplicationDeveloperType)null);
				return;
			case FinalPackage.IFC_APPLICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case FinalPackage.IFC_APPLICATION__APPLICATION_FULL_NAME:
				setApplicationFullName(APPLICATION_FULL_NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_APPLICATION__APPLICATION_IDENTIFIER:
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
			case FinalPackage.IFC_APPLICATION__APPLICATION_DEVELOPER:
				return applicationDeveloper != null;
			case FinalPackage.IFC_APPLICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case FinalPackage.IFC_APPLICATION__APPLICATION_FULL_NAME:
				return APPLICATION_FULL_NAME_EDEFAULT == null ? applicationFullName != null : !APPLICATION_FULL_NAME_EDEFAULT.equals(applicationFullName);
			case FinalPackage.IFC_APPLICATION__APPLICATION_IDENTIFIER:
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
		result.append(" (version: ");
		result.append(version);
		result.append(", applicationFullName: ");
		result.append(applicationFullName);
		result.append(", applicationIdentifier: ");
		result.append(applicationIdentifier);
		result.append(')');
		return result.toString();
	}

} //IfcApplicationImpl
