/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLibraryInformation;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LibraryReferenceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PublisherType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.VersionDateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Library Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLibraryInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLibraryInformationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLibraryInformationImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLibraryInformationImpl#getVersionDate <em>Version Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLibraryInformationImpl#getLibraryReference <em>Library Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLibraryInformationImpl extends EntityImpl implements IfcLibraryInformation {
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
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected PublisherType publisher;

	/**
	 * The cached value of the '{@link #getVersionDate() <em>Version Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionDate()
	 * @generated
	 * @ordered
	 */
	protected VersionDateType versionDate;

	/**
	 * The cached value of the '{@link #getLibraryReference() <em>Library Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryReference()
	 * @generated
	 * @ordered
	 */
	protected LibraryReferenceType libraryReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLibraryInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcLibraryInformation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIBRARY_INFORMATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIBRARY_INFORMATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherType getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(PublisherType newPublisher, NotificationChain msgs) {
		PublisherType oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIBRARY_INFORMATION__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(PublisherType newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIBRARY_INFORMATION__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIBRARY_INFORMATION__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIBRARY_INFORMATION__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionDateType getVersionDate() {
		return versionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionDate(VersionDateType newVersionDate, NotificationChain msgs) {
		VersionDateType oldVersionDate = versionDate;
		versionDate = newVersionDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIBRARY_INFORMATION__VERSION_DATE, oldVersionDate, newVersionDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionDate(VersionDateType newVersionDate) {
		if (newVersionDate != versionDate) {
			NotificationChain msgs = null;
			if (versionDate != null)
				msgs = ((InternalEObject)versionDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIBRARY_INFORMATION__VERSION_DATE, null, msgs);
			if (newVersionDate != null)
				msgs = ((InternalEObject)newVersionDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIBRARY_INFORMATION__VERSION_DATE, null, msgs);
			msgs = basicSetVersionDate(newVersionDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIBRARY_INFORMATION__VERSION_DATE, newVersionDate, newVersionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryReferenceType getLibraryReference() {
		return libraryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibraryReference(LibraryReferenceType newLibraryReference, NotificationChain msgs) {
		LibraryReferenceType oldLibraryReference = libraryReference;
		libraryReference = newLibraryReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE, oldLibraryReference, newLibraryReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryReference(LibraryReferenceType newLibraryReference) {
		if (newLibraryReference != libraryReference) {
			NotificationChain msgs = null;
			if (libraryReference != null)
				msgs = ((InternalEObject)libraryReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE, null, msgs);
			if (newLibraryReference != null)
				msgs = ((InternalEObject)newLibraryReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE, null, msgs);
			msgs = basicSetLibraryReference(newLibraryReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE, newLibraryReference, newLibraryReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LIBRARY_INFORMATION__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case FinalPackage.IFC_LIBRARY_INFORMATION__VERSION_DATE:
				return basicSetVersionDate(null, msgs);
			case FinalPackage.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				return basicSetLibraryReference(null, msgs);
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
			case FinalPackage.IFC_LIBRARY_INFORMATION__NAME:
				return getName();
			case FinalPackage.IFC_LIBRARY_INFORMATION__VERSION:
				return getVersion();
			case FinalPackage.IFC_LIBRARY_INFORMATION__PUBLISHER:
				return getPublisher();
			case FinalPackage.IFC_LIBRARY_INFORMATION__VERSION_DATE:
				return getVersionDate();
			case FinalPackage.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				return getLibraryReference();
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
			case FinalPackage.IFC_LIBRARY_INFORMATION__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_LIBRARY_INFORMATION__VERSION:
				setVersion((String)newValue);
				return;
			case FinalPackage.IFC_LIBRARY_INFORMATION__PUBLISHER:
				setPublisher((PublisherType)newValue);
				return;
			case FinalPackage.IFC_LIBRARY_INFORMATION__VERSION_DATE:
				setVersionDate((VersionDateType)newValue);
				return;
			case FinalPackage.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				setLibraryReference((LibraryReferenceType)newValue);
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
			case FinalPackage.IFC_LIBRARY_INFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_LIBRARY_INFORMATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case FinalPackage.IFC_LIBRARY_INFORMATION__PUBLISHER:
				setPublisher((PublisherType)null);
				return;
			case FinalPackage.IFC_LIBRARY_INFORMATION__VERSION_DATE:
				setVersionDate((VersionDateType)null);
				return;
			case FinalPackage.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				setLibraryReference((LibraryReferenceType)null);
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
			case FinalPackage.IFC_LIBRARY_INFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_LIBRARY_INFORMATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case FinalPackage.IFC_LIBRARY_INFORMATION__PUBLISHER:
				return publisher != null;
			case FinalPackage.IFC_LIBRARY_INFORMATION__VERSION_DATE:
				return versionDate != null;
			case FinalPackage.IFC_LIBRARY_INFORMATION__LIBRARY_REFERENCE:
				return libraryReference != null;
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
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //IfcLibraryInformationImpl
