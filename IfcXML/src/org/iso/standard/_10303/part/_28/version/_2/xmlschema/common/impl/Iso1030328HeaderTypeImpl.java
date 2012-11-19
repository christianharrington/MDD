/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iso1030328 Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl#getPreprocessorVersion <em>Preprocessor Version</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl#getOriginatingSystem <em>Originating System</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328HeaderTypeImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Iso1030328HeaderTypeImpl extends EObjectImpl implements Iso1030328HeaderType {
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
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected String organization = ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreprocessorVersion() <em>Preprocessor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PREPROCESSOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreprocessorVersion() <em>Preprocessor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessorVersion()
	 * @generated
	 * @ordered
	 */
	protected String preprocessorVersion = PREPROCESSOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginatingSystem() <em>Originating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATING_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatingSystem() <em>Originating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingSystem()
	 * @generated
	 * @ordered
	 */
	protected String originatingSystem = ORIGINATING_SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorization() <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected String authorization = AUTHORIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Iso1030328HeaderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ISO1030328_HEADER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_HEADER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(XMLGregorianCalendar newTimeStamp) {
		XMLGregorianCalendar oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_HEADER_TYPE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_HEADER_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(String newOrganization) {
		String oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_HEADER_TYPE__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreprocessorVersion() {
		return preprocessorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreprocessorVersion(String newPreprocessorVersion) {
		String oldPreprocessorVersion = preprocessorVersion;
		preprocessorVersion = newPreprocessorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_HEADER_TYPE__PREPROCESSOR_VERSION, oldPreprocessorVersion, preprocessorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginatingSystem() {
		return originatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginatingSystem(String newOriginatingSystem) {
		String oldOriginatingSystem = originatingSystem;
		originatingSystem = newOriginatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_HEADER_TYPE__ORIGINATING_SYSTEM, oldOriginatingSystem, originatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorization() {
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(String newAuthorization) {
		String oldAuthorization = authorization;
		authorization = newAuthorization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_HEADER_TYPE__AUTHORIZATION, oldAuthorization, authorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_HEADER_TYPE__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.ISO1030328_HEADER_TYPE__NAME:
				return getName();
			case CommonPackage.ISO1030328_HEADER_TYPE__TIME_STAMP:
				return getTimeStamp();
			case CommonPackage.ISO1030328_HEADER_TYPE__AUTHOR:
				return getAuthor();
			case CommonPackage.ISO1030328_HEADER_TYPE__ORGANIZATION:
				return getOrganization();
			case CommonPackage.ISO1030328_HEADER_TYPE__PREPROCESSOR_VERSION:
				return getPreprocessorVersion();
			case CommonPackage.ISO1030328_HEADER_TYPE__ORIGINATING_SYSTEM:
				return getOriginatingSystem();
			case CommonPackage.ISO1030328_HEADER_TYPE__AUTHORIZATION:
				return getAuthorization();
			case CommonPackage.ISO1030328_HEADER_TYPE__DOCUMENTATION:
				return getDocumentation();
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
			case CommonPackage.ISO1030328_HEADER_TYPE__NAME:
				setName((String)newValue);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__TIME_STAMP:
				setTimeStamp((XMLGregorianCalendar)newValue);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__PREPROCESSOR_VERSION:
				setPreprocessorVersion((String)newValue);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__ORIGINATING_SYSTEM:
				setOriginatingSystem((String)newValue);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__AUTHORIZATION:
				setAuthorization((String)newValue);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__DOCUMENTATION:
				setDocumentation((String)newValue);
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
			case CommonPackage.ISO1030328_HEADER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__PREPROCESSOR_VERSION:
				setPreprocessorVersion(PREPROCESSOR_VERSION_EDEFAULT);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__ORIGINATING_SYSTEM:
				setOriginatingSystem(ORIGINATING_SYSTEM_EDEFAULT);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__AUTHORIZATION:
				setAuthorization(AUTHORIZATION_EDEFAULT);
				return;
			case CommonPackage.ISO1030328_HEADER_TYPE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
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
			case CommonPackage.ISO1030328_HEADER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonPackage.ISO1030328_HEADER_TYPE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case CommonPackage.ISO1030328_HEADER_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CommonPackage.ISO1030328_HEADER_TYPE__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
			case CommonPackage.ISO1030328_HEADER_TYPE__PREPROCESSOR_VERSION:
				return PREPROCESSOR_VERSION_EDEFAULT == null ? preprocessorVersion != null : !PREPROCESSOR_VERSION_EDEFAULT.equals(preprocessorVersion);
			case CommonPackage.ISO1030328_HEADER_TYPE__ORIGINATING_SYSTEM:
				return ORIGINATING_SYSTEM_EDEFAULT == null ? originatingSystem != null : !ORIGINATING_SYSTEM_EDEFAULT.equals(originatingSystem);
			case CommonPackage.ISO1030328_HEADER_TYPE__AUTHORIZATION:
				return AUTHORIZATION_EDEFAULT == null ? authorization != null : !AUTHORIZATION_EDEFAULT.equals(authorization);
			case CommonPackage.ISO1030328_HEADER_TYPE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
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
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(", author: ");
		result.append(author);
		result.append(", organization: ");
		result.append(organization);
		result.append(", preprocessorVersion: ");
		result.append(preprocessorVersion);
		result.append(", originatingSystem: ");
		result.append(originatingSystem);
		result.append(", authorization: ");
		result.append(authorization);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //Iso1030328HeaderTypeImpl
